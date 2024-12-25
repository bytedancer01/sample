package dj;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: dj.c */
/* loaded from: combined.jar:classes3.jar:dj/c.class */
public interface InterfaceC4536c<R, T> {

    /* renamed from: dj.c$a */
    /* loaded from: combined.jar:classes3.jar:dj/c$a.class */
    public static abstract class a {
        /* renamed from: b */
        public static Type m22865b(int i10, ParameterizedType parameterizedType) {
            return C4559z.m22981g(i10, parameterizedType);
        }

        /* renamed from: c */
        public static Class<?> m22866c(Type type) {
            return C4559z.m22982h(type);
        }

        /* renamed from: a */
        public abstract InterfaceC4536c<?, ?> mo22867a(Type type, Annotation[] annotationArr, C4555v c4555v);
    }

    /* renamed from: a */
    Type mo22863a();

    /* renamed from: b */
    T mo22864b(InterfaceC4535b<R> interfaceC4535b);
}
