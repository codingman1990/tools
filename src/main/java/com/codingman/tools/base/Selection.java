package com.codingman.tools.base;

/**
 * 适用于key-value选择类型字典数据对象
 *
 * @author ty
 */
public class Selection<T> {
    /**
     * 值
     */
    private T value;
    /**
     * 文本
     */
    private String text;

    public Selection() {

    }

    public Selection(T value, String text) {
        this.value = value;
        this.text = text;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Selection{" +
                "value=" + value +
                ", text='" + text + '\'' +
                '}';
    }
}
