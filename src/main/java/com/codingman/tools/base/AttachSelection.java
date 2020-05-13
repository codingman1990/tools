package com.codingman.tools.base;

/**
 * 附属有额外信息的Selection对象
 *
 * @author ty
 */
public class AttachSelection<T, A> extends Selection<T> {
    private A attach;

    public AttachSelection() {
        super();
    }

    public AttachSelection(T value, String text) {
        super(value, text);
    }

    public AttachSelection(T value, String text, A attach) {
        this(value, text);
        this.attach = attach;
    }

    public A getAttach() {
        return attach;
    }

    public void setAttach(A attach) {
        this.attach = attach;
    }

    @Override
    public String toString() {
        return "AttachSelection{" +
                "attach=" + attach +
                '}';
    }
}
