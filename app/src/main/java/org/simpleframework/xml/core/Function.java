package org.simpleframework.xml.core;

import java.lang.reflect.Method;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/Function.class */
class Function {
    private final boolean contextual;
    private final Method method;

    public Function(Method method) {
        this(method, false);
    }

    public Function(Method method, boolean z10) {
        this.contextual = z10;
        this.method = method;
    }

    public Object call(Context context, Object obj) {
        if (obj != null) {
            return this.contextual ? this.method.invoke(obj, context.getSession().getMap()) : this.method.invoke(obj, new Object[0]);
        }
        return null;
    }
}
