package p208m1;

import android.os.Build;
import android.os.Bundle;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m1/t.class
 */
/* renamed from: m1.t */
/* loaded from: combined.jar:classes1.jar:m1/t.class */
public class C5911t {

    /* renamed from: a */
    public final int f33196a;

    /* renamed from: b */
    public final boolean f33197b;

    /* renamed from: c */
    public final boolean f33198c;

    /* renamed from: d */
    public final boolean f33199d;

    /* renamed from: e */
    public final Bundle f33200e;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/t$a.class
     */
    /* renamed from: m1.t$a */
    /* loaded from: combined.jar:classes1.jar:m1/t$a.class */
    public static final class a {

        /* renamed from: a */
        public int f33201a = 1;

        /* renamed from: b */
        public boolean f33202b;

        /* renamed from: c */
        public boolean f33203c;

        /* renamed from: d */
        public boolean f33204d;

        /* renamed from: e */
        public Bundle f33205e;

        public a() {
            boolean z10 = true;
            this.f33202b = Build.VERSION.SDK_INT < 30 ? false : z10;
        }

        /* renamed from: a */
        public C5911t m29077a() {
            return new C5911t(this);
        }

        /* renamed from: b */
        public a m29078b(boolean z10) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f33202b = z10;
            }
            return this;
        }

        /* renamed from: c */
        public a m29079c(boolean z10) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f33203c = z10;
            }
            return this;
        }

        /* renamed from: d */
        public a m29080d(boolean z10) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f33204d = z10;
            }
            return this;
        }
    }

    public C5911t(a aVar) {
        this.f33196a = aVar.f33201a;
        this.f33197b = aVar.f33202b;
        this.f33198c = aVar.f33203c;
        this.f33199d = aVar.f33204d;
        Bundle bundle = aVar.f33205e;
        this.f33200e = bundle == null ? Bundle.EMPTY : new Bundle(bundle);
    }

    /* renamed from: a */
    public int m29072a() {
        return this.f33196a;
    }

    /* renamed from: b */
    public Bundle m29073b() {
        return this.f33200e;
    }

    /* renamed from: c */
    public boolean m29074c() {
        return this.f33197b;
    }

    /* renamed from: d */
    public boolean m29075d() {
        return this.f33198c;
    }

    /* renamed from: e */
    public boolean m29076e() {
        return this.f33199d;
    }
}
