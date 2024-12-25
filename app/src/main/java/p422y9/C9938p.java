package p422y9;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/p.class
 */
/* renamed from: y9.p */
/* loaded from: combined.jar:classes2.jar:y9/p.class */
public final class C9938p {

    /* renamed from: b */
    public static C9938p f45627b;

    /* renamed from: c */
    public static final C9941q f45628c = new C9941q(0, false, false, 0, 0);

    /* renamed from: a */
    public C9941q f45629a;

    /* renamed from: b */
    public static C9938p m41858b() {
        C9938p c9938p;
        synchronized (C9938p.class) {
            try {
                if (f45627b == null) {
                    f45627b = new C9938p();
                }
                c9938p = f45627b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c9938p;
    }

    /* renamed from: a */
    public C9941q m41859a() {
        return this.f45629a;
    }

    /* renamed from: c */
    public final void m41860c(C9941q c9941q) {
        synchronized (this) {
            if (c9941q == null) {
                this.f45629a = f45628c;
                return;
            }
            C9941q c9941q2 = this.f45629a;
            if (c9941q2 == null || c9941q2.m41868T() < c9941q.m41868T()) {
                this.f45629a = c9941q;
            }
        }
    }
}
