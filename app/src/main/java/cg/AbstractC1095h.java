package cg;

import java.io.Serializable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cg/h.class
 */
/* renamed from: cg.h */
/* loaded from: combined.jar:classes2.jar:cg/h.class */
public abstract class AbstractC1095h<T> {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/h$a.class
     */
    /* renamed from: cg.h$a */
    /* loaded from: combined.jar:classes2.jar:cg/h$a.class */
    public static final class a extends AbstractC1095h<Object> implements Serializable {

        /* renamed from: b */
        public static final a f7307b = new a();

        @Override // cg.AbstractC1095h
        /* renamed from: a */
        public boolean mo6536a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // cg.AbstractC1095h
        /* renamed from: b */
        public int mo6537b(Object obj) {
            return obj.hashCode();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/h$b.class
     */
    /* renamed from: cg.h$b */
    /* loaded from: combined.jar:classes2.jar:cg/h$b.class */
    public static final class b extends AbstractC1095h<Object> implements Serializable {

        /* renamed from: b */
        public static final b f7308b = new b();

        @Override // cg.AbstractC1095h
        /* renamed from: a */
        public boolean mo6536a(Object obj, Object obj2) {
            return false;
        }

        @Override // cg.AbstractC1095h
        /* renamed from: b */
        public int mo6537b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    /* renamed from: c */
    public static AbstractC1095h<Object> m6534c() {
        return a.f7307b;
    }

    /* renamed from: f */
    public static AbstractC1095h<Object> m6535f() {
        return b.f7308b;
    }

    /* renamed from: a */
    public abstract boolean mo6536a(T t10, T t11);

    /* renamed from: b */
    public abstract int mo6537b(T t10);

    /* renamed from: d */
    public final boolean m6538d(T t10, T t11) {
        if (t10 == t11) {
            return true;
        }
        if (t10 == null || t11 == null) {
            return false;
        }
        return mo6536a(t10, t11);
    }

    /* renamed from: e */
    public final int m6539e(T t10) {
        if (t10 == null) {
            return 0;
        }
        return mo6537b(t10);
    }
}
