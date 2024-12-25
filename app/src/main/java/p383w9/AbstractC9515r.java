package p383w9;

import com.google.android.gms.common.api.C2414a;
import com.google.android.gms.common.api.C2414a.b;
import p350u9.C8808d;
import p422y9.C9935o;
import za.C10146j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/r.class
 */
/* renamed from: w9.r */
/* loaded from: combined.jar:classes2.jar:w9/r.class */
public abstract class AbstractC9515r<A extends C2414a.b, ResultT> {

    /* renamed from: a */
    public final C8808d[] f43394a;

    /* renamed from: b */
    public final boolean f43395b;

    /* renamed from: c */
    public final int f43396c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:w9/r$a.class
     */
    /* renamed from: w9.r$a */
    /* loaded from: combined.jar:classes2.jar:w9/r$a.class */
    public static class a<A extends C2414a.b, ResultT> {

        /* renamed from: a */
        public InterfaceC9502o<A, C10146j<ResultT>> f43397a;

        /* renamed from: c */
        public C8808d[] f43399c;

        /* renamed from: b */
        public boolean f43398b = true;

        /* renamed from: d */
        public int f43400d = 0;

        public /* synthetic */ a(C9475i2 c9475i2) {
        }

        /* renamed from: a */
        public AbstractC9515r<A, ResultT> m40023a() {
            C9935o.m41842b(this.f43397a != null, "execute parameter required");
            return new C9470h2(this, this.f43399c, this.f43398b, this.f43400d);
        }

        /* renamed from: b */
        public a<A, ResultT> m40024b(InterfaceC9502o<A, C10146j<ResultT>> interfaceC9502o) {
            this.f43397a = interfaceC9502o;
            return this;
        }

        /* renamed from: c */
        public a<A, ResultT> m40025c(boolean z10) {
            this.f43398b = z10;
            return this;
        }

        /* renamed from: d */
        public a<A, ResultT> m40026d(C8808d... c8808dArr) {
            this.f43399c = c8808dArr;
            return this;
        }

        /* renamed from: e */
        public a<A, ResultT> m40027e(int i10) {
            this.f43400d = i10;
            return this;
        }
    }

    public AbstractC9515r(C8808d[] c8808dArr, boolean z10, int i10) {
        this.f43394a = c8808dArr;
        boolean z11 = false;
        if (c8808dArr != null) {
            z11 = false;
            if (z10) {
                z11 = true;
            }
        }
        this.f43395b = z11;
        this.f43396c = i10;
    }

    /* renamed from: a */
    public static <A extends C2414a.b, ResultT> a<A, ResultT> m40018a() {
        return new a<>(null);
    }

    /* renamed from: b */
    public abstract void mo39921b(A a10, C10146j<ResultT> c10146j);

    /* renamed from: c */
    public boolean m40019c() {
        return this.f43395b;
    }

    /* renamed from: d */
    public final int m40020d() {
        return this.f43396c;
    }

    /* renamed from: e */
    public final C8808d[] m40021e() {
        return this.f43394a;
    }
}
