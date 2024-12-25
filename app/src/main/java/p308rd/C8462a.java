package p308rd;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import md.C6560a;
import md.C6561b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:rd/a.class
 */
/* renamed from: rd.a */
/* loaded from: combined.jar:classes2.jar:rd/a.class */
public class C8462a<T> {

    /* renamed from: a */
    public final Class<? super T> f39552a;

    /* renamed from: b */
    public final Type f39553b;

    /* renamed from: c */
    public final int f39554c;

    public C8462a() {
        Type m36350d = m36350d(getClass());
        this.f39553b = m36350d;
        this.f39552a = (Class<? super T>) C6561b.m30279k(m36350d);
        this.f39554c = m36350d.hashCode();
    }

    public C8462a(Type type) {
        Type m30270b = C6561b.m30270b((Type) C6560a.m30268b(type));
        this.f39553b = m30270b;
        this.f39552a = (Class<? super T>) C6561b.m30279k(m30270b);
        this.f39554c = m30270b.hashCode();
    }

    /* renamed from: a */
    public static <T> C8462a<T> m36348a(Class<T> cls) {
        return new C8462a<>(cls);
    }

    /* renamed from: b */
    public static C8462a<?> m36349b(Type type) {
        return new C8462a<>(type);
    }

    /* renamed from: d */
    public static Type m36350d(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        return C6561b.m30270b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
    }

    /* renamed from: c */
    public final Class<? super T> m36351c() {
        return this.f39552a;
    }

    /* renamed from: e */
    public final Type m36352e() {
        return this.f39553b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C8462a) && C6561b.m30274f(this.f39553b, ((C8462a) obj).f39553b);
    }

    public final int hashCode() {
        return this.f39554c;
    }

    public final String toString() {
        return C6561b.m30289u(this.f39553b);
    }
}
