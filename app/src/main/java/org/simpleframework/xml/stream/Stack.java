package org.simpleframework.xml.stream;

import java.util.ArrayList;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/Stack.class */
class Stack<T> extends ArrayList<T> {
    public Stack(int i10) {
        super(i10);
    }

    public T bottom() {
        if (size() <= 0) {
            return null;
        }
        return get(0);
    }

    public T pop() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return remove(size - 1);
    }

    public T push(T t10) {
        add(t10);
        return t10;
    }

    public T top() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return get(size - 1);
    }
}
