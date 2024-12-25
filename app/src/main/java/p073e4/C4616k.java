package p073e4;

import java.util.Queue;
import p363v4.C9239e;
import p363v4.C9242h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e4/k.class
 */
/* renamed from: e4.k */
/* loaded from: combined.jar:classes1.jar:e4/k.class */
public class C4616k<A, B> {

    /* renamed from: a */
    public final C9239e<b<A>, B> f27311a;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e4/k$a.class
     */
    /* renamed from: e4.k$a */
    /* loaded from: combined.jar:classes1.jar:e4/k$a.class */
    public class a extends C9239e<b<A>, B> {

        /* renamed from: e */
        public final C4616k f27312e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4616k c4616k, int i10) {
            super(i10);
            this.f27312e = c4616k;
        }

        @Override // p363v4.C9239e
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void mo5105j(b<A> bVar, B b10) {
            bVar.m23255c();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e4/k$b.class
     */
    /* renamed from: e4.k$b */
    /* loaded from: combined.jar:classes1.jar:e4/k$b.class */
    public static final class b<A> {

        /* renamed from: d */
        public static final Queue<b<?>> f27313d = C9242h.m38965c(0);

        /* renamed from: a */
        public int f27314a;

        /* renamed from: b */
        public int f27315b;

        /* renamed from: c */
        public A f27316c;

        /* renamed from: a */
        public static <A> b<A> m23253a(A a10, int i10, int i11) {
            b<?> poll = f27313d.poll();
            b<?> bVar = poll;
            if (poll == null) {
                bVar = new b<>();
            }
            bVar.m23254b(a10, i10, i11);
            return (b<A>) bVar;
        }

        /* renamed from: b */
        public final void m23254b(A a10, int i10, int i11) {
            this.f27316c = a10;
            this.f27315b = i10;
            this.f27314a = i11;
        }

        /* renamed from: c */
        public void m23255c() {
            f27313d.offer(this);
        }

        public boolean equals(Object obj) {
            boolean z10 = false;
            if (obj instanceof b) {
                b bVar = (b) obj;
                z10 = false;
                if (this.f27315b == bVar.f27315b) {
                    z10 = false;
                    if (this.f27314a == bVar.f27314a) {
                        z10 = false;
                        if (this.f27316c.equals(bVar.f27316c)) {
                            z10 = true;
                        }
                    }
                }
            }
            return z10;
        }

        public int hashCode() {
            return (((this.f27314a * 31) + this.f27315b) * 31) + this.f27316c.hashCode();
        }
    }

    public C4616k(int i10) {
        this.f27311a = new a(this, i10);
    }

    /* renamed from: a */
    public B m23250a(A a10, int i10, int i11) {
        b<A> m23253a = b.m23253a(a10, i10, i11);
        B m38955g = this.f27311a.m38955g(m23253a);
        m23253a.m23255c();
        return m38955g;
    }

    /* renamed from: b */
    public void m23251b(A a10, int i10, int i11, B b10) {
        this.f27311a.m38957k(b.m23253a(a10, i10, i11), b10);
    }
}
