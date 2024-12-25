package tc;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:tc/d.class
 */
/* renamed from: tc.d */
/* loaded from: combined.jar:classes2.jar:tc/d.class */
public final class C8681d {

    /* renamed from: a */
    public final String f40455a;

    /* renamed from: b */
    public final Map<Class<?>, Object> f40456b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:tc/d$b.class
     */
    /* renamed from: tc.d$b */
    /* loaded from: combined.jar:classes2.jar:tc/d$b.class */
    public static final class b {

        /* renamed from: a */
        public final String f40457a;

        /* renamed from: b */
        public Map<Class<?>, Object> f40458b = null;

        public b(String str) {
            this.f40457a = str;
        }

        /* renamed from: a */
        public C8681d m37176a() {
            return new C8681d(this.f40457a, this.f40458b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f40458b)));
        }

        /* renamed from: b */
        public <T extends Annotation> b m37177b(T t10) {
            if (this.f40458b == null) {
                this.f40458b = new HashMap();
            }
            this.f40458b.put(t10.annotationType(), t10);
            return this;
        }
    }

    public C8681d(String str, Map<Class<?>, Object> map) {
        this.f40455a = str;
        this.f40456b = map;
    }

    /* renamed from: a */
    public static b m37172a(String str) {
        return new b(str);
    }

    /* renamed from: d */
    public static C8681d m37173d(String str) {
        return new C8681d(str, Collections.emptyMap());
    }

    /* renamed from: b */
    public String m37174b() {
        return this.f40455a;
    }

    /* renamed from: c */
    public <T extends Annotation> T m37175c(Class<T> cls) {
        return (T) this.f40456b.get(cls);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8681d)) {
            return false;
        }
        C8681d c8681d = (C8681d) obj;
        if (!this.f40455a.equals(c8681d.f40455a) || !this.f40456b.equals(c8681d.f40456b)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return (this.f40455a.hashCode() * 31) + this.f40456b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f40455a + ", properties=" + this.f40456b.values() + "}";
    }
}
