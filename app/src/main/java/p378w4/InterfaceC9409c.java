package p378w4;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.TimeZone;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:w4/c.class
 */
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: w4.c */
/* loaded from: combined.jar:classes1.jar:w4/c.class */
public @interface InterfaceC9409c {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:w4/c$a.class
     */
    /* renamed from: w4.c$a */
    /* loaded from: combined.jar:classes1.jar:w4/c$a.class */
    public static class a {

        /* renamed from: c */
        public static final a f43157c = new a(0, 0);

        /* renamed from: a */
        public final int f43158a;

        /* renamed from: b */
        public final int f43159b;

        public a(int i10, int i11) {
            this.f43158a = i10;
            this.f43159b = i11;
        }

        /* renamed from: a */
        public static a m39765a() {
            return f43157c;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.f43158a != this.f43158a || aVar.f43159b != this.f43159b) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            return this.f43159b + this.f43158a;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:w4/c$b.class
     */
    /* renamed from: w4.c$b */
    /* loaded from: combined.jar:classes1.jar:w4/c$b.class */
    public enum b {
        ANY,
        NATURAL,
        SCALAR,
        ARRAY,
        OBJECT,
        NUMBER,
        NUMBER_FLOAT,
        NUMBER_INT,
        STRING,
        BOOLEAN;

        public boolean isNumeric() {
            return this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT;
        }

        public boolean isStructured() {
            return this == OBJECT || this == ARRAY;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:w4/c$c.class
     */
    /* renamed from: w4.c$c */
    /* loaded from: combined.jar:classes1.jar:w4/c$c.class */
    public static class c implements Serializable {

        /* renamed from: h */
        public static final c f43160h = new c();

        /* renamed from: b */
        public final String f43161b;

        /* renamed from: c */
        public final b f43162c;

        /* renamed from: d */
        public final Locale f43163d;

        /* renamed from: e */
        public final String f43164e;

        /* renamed from: f */
        public final a f43165f;

        /* renamed from: g */
        public transient TimeZone f43166g;

        public c() {
            this("", b.ANY, "", "", a.m39765a());
        }

        public c(String str, b bVar, String str2, String str3, a aVar) {
            this(str, bVar, (str2 == null || str2.length() == 0 || "##default".equals(str2)) ? null : new Locale(str2), (str3 == null || str3.length() == 0 || "##default".equals(str3)) ? null : str3, null, aVar);
        }

        public c(String str, b bVar, Locale locale, String str2, TimeZone timeZone, a aVar) {
            this.f43161b = str;
            this.f43162c = bVar == null ? b.ANY : bVar;
            this.f43163d = locale;
            this.f43166g = timeZone;
            this.f43164e = str2;
            this.f43165f = aVar == null ? a.m39765a() : aVar;
        }

        /* renamed from: a */
        public static <T> boolean m39766a(T t10, T t11) {
            boolean z10 = false;
            if (t10 == null) {
                if (t11 == null) {
                    z10 = true;
                }
                return z10;
            }
            if (t11 == null) {
                return false;
            }
            return t10.equals(t11);
        }

        /* renamed from: b */
        public static final c m39767b() {
            return f43160h;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f43162c != cVar.f43162c || !this.f43165f.equals(cVar.f43165f)) {
                return false;
            }
            if (!m39766a(this.f43164e, cVar.f43164e) || !m39766a(this.f43161b, cVar.f43161b) || !m39766a(this.f43166g, cVar.f43166g) || !m39766a(this.f43163d, cVar.f43163d)) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            String str = this.f43164e;
            int hashCode = str == null ? 1 : str.hashCode();
            String str2 = this.f43161b;
            int i10 = hashCode;
            if (str2 != null) {
                i10 = hashCode ^ str2.hashCode();
            }
            int hashCode2 = i10 + this.f43162c.hashCode();
            Locale locale = this.f43163d;
            int i11 = hashCode2;
            if (locale != null) {
                i11 = hashCode2 ^ locale.hashCode();
            }
            return i11 + this.f43165f.hashCode();
        }

        public String toString() {
            return String.format("[pattern=%s,shape=%s,locale=%s,timezone=%s]", this.f43161b, this.f43162c, this.f43163d, this.f43164e);
        }
    }
}
