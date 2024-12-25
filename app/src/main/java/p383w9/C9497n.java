package p383w9;

import com.google.android.gms.common.api.C2414a;
import com.google.android.gms.common.api.C2414a.b;
import p350u9.C8808d;
import p383w9.C9472i;
import p422y9.C9935o;
import za.C10146j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/n.class
 */
/* renamed from: w9.n */
/* loaded from: combined.jar:classes2.jar:w9/n.class */
public class C9497n<A extends C2414a.b, L> {

    /* renamed from: a */
    public final AbstractC9492m<A, L> f43346a;

    /* renamed from: b */
    public final AbstractC9519s<A, L> f43347b;

    /* renamed from: c */
    public final Runnable f43348c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:w9/n$a.class
     */
    /* renamed from: w9.n$a */
    /* loaded from: combined.jar:classes2.jar:w9/n$a.class */
    public static class a<A extends C2414a.b, L> {

        /* renamed from: a */
        public InterfaceC9502o<A, C10146j<Void>> f43349a;

        /* renamed from: b */
        public InterfaceC9502o<A, C10146j<Boolean>> f43350b;

        /* renamed from: d */
        public C9472i<L> f43352d;

        /* renamed from: e */
        public C8808d[] f43353e;

        /* renamed from: g */
        public int f43355g;

        /* renamed from: c */
        public Runnable f43351c = new Runnable() { // from class: w9.x1
            @Override // java.lang.Runnable
            public final void run() {
            }
        };

        /* renamed from: f */
        public boolean f43354f = true;

        public /* synthetic */ a(C9435a2 c9435a2) {
        }

        /* renamed from: a */
        public C9497n<A, L> m39967a() {
            C9935o.m41842b(this.f43349a != null, "Must set register function");
            C9935o.m41842b(this.f43350b != null, "Must set unregister function");
            C9935o.m41842b(this.f43352d != null, "Must set holder");
            return new C9497n<>(new C9545y1(this, this.f43352d, this.f43353e, this.f43354f, this.f43355g), new C9549z1(this, (C9472i.a) C9935o.m41851k(this.f43352d.m39923b(), "Key must not be null")), this.f43351c, null);
        }

        /* renamed from: b */
        public a<A, L> m39968b(InterfaceC9502o<A, C10146j<Void>> interfaceC9502o) {
            this.f43349a = interfaceC9502o;
            return this;
        }

        /* renamed from: c */
        public a<A, L> m39969c(C8808d... c8808dArr) {
            this.f43353e = c8808dArr;
            return this;
        }

        /* renamed from: d */
        public a<A, L> m39970d(int i10) {
            this.f43355g = i10;
            return this;
        }

        /* renamed from: e */
        public a<A, L> m39971e(InterfaceC9502o<A, C10146j<Boolean>> interfaceC9502o) {
            this.f43350b = interfaceC9502o;
            return this;
        }

        /* renamed from: f */
        public a<A, L> m39972f(C9472i<L> c9472i) {
            this.f43352d = c9472i;
            return this;
        }
    }

    public /* synthetic */ C9497n(AbstractC9492m abstractC9492m, AbstractC9519s abstractC9519s, Runnable runnable, C9440b2 c9440b2) {
        this.f43346a = abstractC9492m;
        this.f43347b = abstractC9519s;
        this.f43348c = runnable;
    }

    /* renamed from: a */
    public static <A extends C2414a.b, L> a<A, L> m39964a() {
        return new a<>(null);
    }
}
