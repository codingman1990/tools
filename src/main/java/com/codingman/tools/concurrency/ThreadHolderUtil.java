package com.codingman.tools.concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * 线程变量工具类
 *
 * @author ty
 */
public final class ThreadHolderUtil {
    /**
     * 服务追踪信息名称
     */
    public static final String TRACE_KEY = "trace";
    /**
     * 任意类型数据集合
     */
    private static final ThreadLocal<Map<Object, Object>> VALUE_MAP = ThreadLocal.withInitial(HashMap::new);

    /**
     * 根据key获取值
     *
     * @param key   key
     * @param clazz 值类型
     * @return 值
     */
    public static <T> T getValue(Object key, Class<T> clazz) {
        Object value = Optional.ofNullable(VALUE_MAP.get()).map(map -> map.get(key)).orElse(null);
        try {
            return (T) value;
        } catch (Throwable ex) {
            return null;
        }
    }

    /**
     * 获取map
     */
    public static Map<Object, Object> getValueMap() {
        return VALUE_MAP.get();
    }

    /**
     * 设置key值
     *
     * @param key   key
     * @param value 值
     */
    public static void setValue(Object key, Object value) {
        Optional.ofNullable(VALUE_MAP.get()).ifPresent(valueMap -> valueMap.put(key, value));
    }

    /**
     * 覆盖map
     *
     * @param values map值
     */
    public static void setValueMap(Map<Object, Object> values) {
        VALUE_MAP.set(values);
    }

    /**
     * 清除指定Key
     *
     * @param key 指定key
     */
    public static void clearValue(Object key) {
        Optional.ofNullable(VALUE_MAP.get()).ifPresent(valueMap -> valueMap.remove(key));
    }

    /**
     * 清除整个map
     */
    public static void clearValueMap() {
        VALUE_MAP.remove();
    }
}
