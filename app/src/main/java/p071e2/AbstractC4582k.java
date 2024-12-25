package p071e2;

import android.util.Log;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e2/k.class
 */
/* renamed from: e2.k */
/* loaded from: combined.jar:classes1.jar:e2/k.class */
public abstract class AbstractC4582k {

    /* renamed from: a */
    public static AbstractC4582k f27222a;

    /* renamed from: b */
    public static final int f27223b = 20;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e2/k$a.class
     */
    /* renamed from: e2.k$a */
    /* loaded from: combined.jar:classes1.jar:e2/k$a.class */
    public static class a extends AbstractC4582k {

        /* renamed from: c */
        public int f27224c;

        public a(int i10) {
            super(i10);
            this.f27224c = i10;
        }

        @Override // p071e2.AbstractC4582k
        /* renamed from: a */
        public void mo23129a(String str, String str2, Throwable... thArr) {
            if (this.f27224c <= 3) {
                if (thArr == null || thArr.length < 1) {
                    Log.d(str, str2);
                } else {
                    Log.d(str, str2, thArr[0]);
                }
            }
        }

        @Override // p071e2.AbstractC4582k
        /* renamed from: b */
        public void mo23130b(String str, String str2, Throwable... thArr) {
            if (this.f27224c <= 6) {
                if (thArr == null || thArr.length < 1) {
                    Log.e(str, str2);
                } else {
                    Log.e(str, str2, thArr[0]);
                }
            }
        }

        @Override // p071e2.AbstractC4582k
        /* renamed from: d */
        public void mo23131d(String str, String str2, Throwable... thArr) {
            if (this.f27224c <= 4) {
                if (thArr == null || thArr.length < 1) {
                    Log.i(str, str2);
                } else {
                    Log.i(str, str2, thArr[0]);
                }
            }
        }

        @Override // p071e2.AbstractC4582k
        /* renamed from: g */
        public void mo23132g(String str, String str2, Throwable... thArr) {
            if (this.f27224c <= 2) {
                if (thArr == null || thArr.length < 1) {
                    Log.v(str, str2);
                } else {
                    Log.v(str, str2, thArr[0]);
                }
            }
        }

        @Override // p071e2.AbstractC4582k
        /* renamed from: h */
        public void mo23133h(String str, String str2, Throwable... thArr) {
            if (this.f27224c <= 5) {
                if (thArr == null || thArr.length < 1) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, thArr[0]);
                }
            }
        }
    }

    public AbstractC4582k(int i10) {
    }

    /* renamed from: c */
    public static AbstractC4582k m23126c() {
        AbstractC4582k abstractC4582k;
        synchronized (AbstractC4582k.class) {
            try {
                if (f27222a == null) {
                    f27222a = new a(3);
                }
                abstractC4582k = f27222a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC4582k;
    }

    /* renamed from: e */
    public static void m23127e(AbstractC4582k abstractC4582k) {
        synchronized (AbstractC4582k.class) {
            try {
                f27222a = abstractC4582k;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public static String m23128f(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i10 = f27223b;
        String str2 = str;
        if (length >= i10) {
            str2 = str.substring(0, i10);
        }
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: a */
    public abstract void mo23129a(String str, String str2, Throwable... thArr);

    /* renamed from: b */
    public abstract void mo23130b(String str, String str2, Throwable... thArr);

    /* renamed from: d */
    public abstract void mo23131d(String str, String str2, Throwable... thArr);

    /* renamed from: g */
    public abstract void mo23132g(String str, String str2, Throwable... thArr);

    /* renamed from: h */
    public abstract void mo23133h(String str, String str2, Throwable... thArr);
}
