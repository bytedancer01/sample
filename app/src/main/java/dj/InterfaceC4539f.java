package dj;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p173ji.AbstractC5408e0;
import p173ji.AbstractC5412g0;

/* renamed from: dj.f */
/* loaded from: combined.jar:classes3.jar:dj/f.class */
public interface InterfaceC4539f<F, T> {

    /* renamed from: dj.f$a */
    /* loaded from: combined.jar:classes3.jar:dj/f$a.class */
    public static abstract class a {
        /* renamed from: a */
        public static Type m22870a(int i10, ParameterizedType parameterizedType) {
            return C4559z.m22981g(i10, parameterizedType);
        }

        /* renamed from: b */
        public static Class<?> m22871b(Type type) {
            return C4559z.m22982h(type);
        }

        /* renamed from: c */
        public InterfaceC4539f<?, AbstractC5408e0> mo22853c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C4555v c4555v) {
            return null;
        }

        /* renamed from: d */
        public InterfaceC4539f<AbstractC5412g0, ?> mo22854d(Type type, Annotation[] annotationArr, C4555v c4555v) {
            return null;
        }

        /* renamed from: e */
        public InterfaceC4539f<?, String> m22872e(Type type, Annotation[] annotationArr, C4555v c4555v) {
            return null;
        }
    }

    /* renamed from: a */
    T mo22855a(F f10);
}
