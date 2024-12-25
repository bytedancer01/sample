package cg;

import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cg/l.class
 */
/* renamed from: cg.l */
/* loaded from: combined.jar:classes2.jar:cg/l.class */
public final class C1099l {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/l$b.class
     */
    /* renamed from: cg.l$b */
    /* loaded from: combined.jar:classes2.jar:cg/l$b.class */
    public static final class b {

        /* renamed from: a */
        public final String f7423a;

        /* renamed from: b */
        public a f7424b;

        /* renamed from: c */
        public a f7425c;

        /* renamed from: d */
        public boolean f7426d;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cg/l$b$a.class
         */
        /* renamed from: cg.l$b$a */
        /* loaded from: combined.jar:classes2.jar:cg/l$b$a.class */
        public static final class a {

            /* renamed from: a */
            public String f7427a;

            /* renamed from: b */
            public Object f7428b;

            /* renamed from: c */
            public a f7429c;

            public a() {
            }
        }

        public b(String str) {
            a aVar = new a();
            this.f7424b = aVar;
            this.f7425c = aVar;
            this.f7426d = false;
            this.f7423a = (String) C1102o.m6665a(str);
        }

        /* renamed from: a */
        public b m6656a(String str, int i10) {
            return m6661f(str, String.valueOf(i10));
        }

        /* renamed from: b */
        public b m6657b(String str, long j10) {
            return m6661f(str, String.valueOf(j10));
        }

        /* renamed from: c */
        public b m6658c(String str, Object obj) {
            return m6661f(str, obj);
        }

        /* renamed from: d */
        public final a m6659d() {
            a aVar = new a();
            this.f7425c.f7429c = aVar;
            this.f7425c = aVar;
            return aVar;
        }

        /* renamed from: e */
        public final b m6660e(Object obj) {
            m6659d().f7428b = obj;
            return this;
        }

        /* renamed from: f */
        public final b m6661f(String str, Object obj) {
            a m6659d = m6659d();
            m6659d.f7428b = obj;
            m6659d.f7427a = (String) C1102o.m6665a(str);
            return this;
        }

        /* renamed from: g */
        public b m6662g(Object obj) {
            return m6660e(obj);
        }

        public String toString() {
            String str;
            boolean z10 = this.f7426d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f7423a);
            sb2.append('{');
            a aVar = this.f7424b.f7429c;
            String str2 = "";
            while (true) {
                String str3 = str2;
                if (aVar == null) {
                    sb2.append('}');
                    return sb2.toString();
                }
                Object obj = aVar.f7428b;
                if (z10) {
                    str = str3;
                    if (obj == null) {
                        aVar = aVar.f7429c;
                        str2 = str;
                    }
                }
                sb2.append(str3);
                String str4 = aVar.f7427a;
                if (str4 != null) {
                    sb2.append(str4);
                    sb2.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb2.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb2.append(deepToString.substring(1, deepToString.length() - 1));
                }
                str = ", ";
                aVar = aVar.f7429c;
                str2 = str;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <T> T m6654a(T t10, T t11) {
        if (t10 == null) {
            t10 = C1102o.m6665a(t11);
        }
        return t10;
    }

    /* renamed from: b */
    public static b m6655b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
