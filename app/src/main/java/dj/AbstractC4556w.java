package dj;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* renamed from: dj.w */
/* loaded from: combined.jar:classes3.jar:dj/w.class */
public abstract class AbstractC4556w<T> {
    /* renamed from: b */
    public static <T> AbstractC4556w<T> m22973b(C4555v c4555v, Method method) {
        C4553t m22938b = C4553t.m22938b(c4555v, method);
        Type genericReturnType = method.getGenericReturnType();
        if (C4559z.m22984j(genericReturnType)) {
            throw C4559z.m22987m(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return AbstractC4544k.m22881f(c4555v, method, m22938b);
        }
        throw C4559z.m22987m(method, "Service methods cannot return void.", new Object[0]);
    }

    /* renamed from: a */
    public abstract T mo22882a(Object[] objArr);
}
