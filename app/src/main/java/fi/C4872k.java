package fi;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p313s.C8490b;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fi/k.class
 */
/* renamed from: fi.k */
/* loaded from: combined.jar:classes2.jar:fi/k.class */
public class C4872k {

    /* renamed from: b */
    public static final AtomicReferenceFieldUpdater f28562b = AtomicReferenceFieldUpdater.newUpdater(C4872k.class, Object.class, "_next");

    /* renamed from: c */
    public static final AtomicReferenceFieldUpdater f28563c = AtomicReferenceFieldUpdater.newUpdater(C4872k.class, Object.class, "_prev");

    /* renamed from: d */
    public static final AtomicReferenceFieldUpdater f28564d = AtomicReferenceFieldUpdater.newUpdater(C4872k.class, Object.class, "_removedRef");

    @NotNull
    public volatile Object _next = this;

    @NotNull
    public volatile Object _prev = this;

    @NotNull
    private volatile Object _removedRef = null;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fi/k$a.class
     */
    /* renamed from: fi.k$a */
    /* loaded from: combined.jar:classes2.jar:fi/k$a.class */
    public static abstract class a extends AbstractC4864c<C4872k> {

        /* renamed from: b */
        @NotNull
        public final C4872k f28565b;

        /* renamed from: c */
        @Nullable
        public C4872k f28566c;

        public a(@NotNull C4872k c4872k) {
            this.f28565b = c4872k;
        }

        @Override // fi.AbstractC4864c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo24740d(@NotNull C4872k c4872k, @Nullable Object obj) {
            boolean z10 = obj == null;
            C4872k c4872k2 = z10 ? this.f28565b : this.f28566c;
            if (c4872k2 != null && C8490b.m36639a(C4872k.f28562b, c4872k, this, c4872k2) && z10) {
                C4872k c4872k3 = this.f28565b;
                C4872k c4872k4 = this.f28566c;
                C9367f.m39524c(c4872k4);
                c4872k3.m24766i(c4872k4);
            }
        }
    }

    /* renamed from: e */
    public final boolean m24763e(@NotNull C4872k c4872k) {
        f28563c.lazySet(c4872k, this);
        f28562b.lazySet(c4872k, this);
        while (m24767j() == this) {
            if (C8490b.m36639a(f28562b, this, this, c4872k)) {
                c4872k.m24766i(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (p313s.C8490b.m36639a(fi.C4872k.f28562b, r8, r7, ((fi.C4879r) r0).f28583a) != false) goto L39;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final fi.C4872k m24764f(fi.AbstractC4878q r6) {
        /*
            r5 = this;
        L0:
            r0 = r5
            java.lang.Object r0 = r0._prev
            fi.k r0 = (fi.C4872k) r0
            r9 = r0
            r0 = r9
            r7 = r0
        Lc:
            r0 = 0
            r8 = r0
        Le:
            r0 = r7
            java.lang.Object r0 = r0._next
            r10 = r0
            r0 = r10
            r1 = r5
            if (r0 != r1) goto L34
            r0 = r9
            r1 = r7
            if (r0 != r1) goto L22
            r0 = r7
            return r0
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = fi.C4872k.f28563c
            r1 = r5
            r2 = r9
            r3 = r7
            boolean r0 = p313s.C8490b.m36639a(r0, r1, r2, r3)
            if (r0 != 0) goto L32
            goto L0
        L32:
            r0 = r7
            return r0
        L34:
            r0 = r5
            boolean r0 = r0.mo24759o()
            if (r0 == 0) goto L3d
            r0 = 0
            return r0
        L3d:
            r0 = r10
            r1 = r6
            if (r0 != r1) goto L45
            r0 = r7
            return r0
        L45:
            r0 = r10
            boolean r0 = r0 instanceof fi.AbstractC4878q
            if (r0 == 0) goto L6c
            r0 = r6
            if (r0 == 0) goto L5f
            r0 = r6
            r1 = r10
            fi.q r1 = (fi.AbstractC4878q) r1
            boolean r0 = r0.m24801b(r1)
            if (r0 == 0) goto L5f
            r0 = 0
            return r0
        L5f:
            r0 = r10
            fi.q r0 = (fi.AbstractC4878q) r0
            r1 = r7
            java.lang.Object r0 = r0.mo24739c(r1)
            goto L0
        L6c:
            r0 = r10
            boolean r0 = r0 instanceof fi.C4879r
            if (r0 == 0) goto L9e
            r0 = r8
            if (r0 == 0) goto L93
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = fi.C4872k.f28562b
            r1 = r8
            r2 = r7
            r3 = r10
            fi.r r3 = (fi.C4879r) r3
            fi.k r3 = r3.f28583a
            boolean r0 = p313s.C8490b.m36639a(r0, r1, r2, r3)
            if (r0 != 0) goto L8e
            goto L0
        L8e:
            r0 = r8
            r7 = r0
            goto Lc
        L93:
            r0 = r7
            java.lang.Object r0 = r0._prev
            fi.k r0 = (fi.C4872k) r0
            r7 = r0
            goto Le
        L9e:
            r0 = r10
            fi.k r0 = (fi.C4872k) r0
            r10 = r0
            r0 = r7
            r8 = r0
            r0 = r10
            r7 = r0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: fi.C4872k.m24764f(fi.q):fi.k");
    }

    /* renamed from: g */
    public final C4872k m24765g(C4872k c4872k) {
        while (c4872k.mo24759o()) {
            c4872k = (C4872k) c4872k._prev;
        }
        return c4872k;
    }

    /* renamed from: i */
    public final void m24766i(C4872k c4872k) {
        C4872k c4872k2;
        do {
            c4872k2 = (C4872k) c4872k._prev;
            if (m24767j() != c4872k) {
                return;
            }
        } while (!C8490b.m36639a(f28563c, c4872k, c4872k2, this));
        if (mo24759o()) {
            c4872k.m24764f(null);
        }
    }

    @NotNull
    /* renamed from: j */
    public final Object m24767j() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof AbstractC4878q)) {
                return obj;
            }
            ((AbstractC4878q) obj).mo24739c(this);
        }
    }

    @NotNull
    /* renamed from: k */
    public final C4872k m24768k() {
        return C4871j.m24761b(m24767j());
    }

    @NotNull
    /* renamed from: n */
    public final C4872k m24769n() {
        C4872k m24764f = m24764f(null);
        C4872k c4872k = m24764f;
        if (m24764f == null) {
            c4872k = m24765g((C4872k) this._prev);
        }
        return c4872k;
    }

    /* renamed from: o */
    public boolean mo24759o() {
        return m24767j() instanceof C4879r;
    }

    /* renamed from: p */
    public boolean m24770p() {
        return m24771q() == null;
    }

    @Nullable
    /* renamed from: q */
    public final C4872k m24771q() {
        Object m24767j;
        C4872k c4872k;
        do {
            m24767j = m24767j();
            if (m24767j instanceof C4879r) {
                return ((C4879r) m24767j).f28583a;
            }
            if (m24767j == this) {
                return (C4872k) m24767j;
            }
            c4872k = (C4872k) m24767j;
        } while (!C8490b.m36639a(f28562b, this, m24767j, c4872k.m24772r()));
        c4872k.m24764f(null);
        return null;
    }

    /* renamed from: r */
    public final C4879r m24772r() {
        C4879r c4879r = (C4879r) this._removedRef;
        C4879r c4879r2 = c4879r;
        if (c4879r == null) {
            c4879r2 = new C4879r(this);
            f28564d.lazySet(this, c4879r2);
        }
        return c4879r2;
    }

    /* renamed from: s */
    public final int m24773s(@NotNull C4872k c4872k, @NotNull C4872k c4872k2, @NotNull a aVar) {
        f28563c.lazySet(c4872k, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28562b;
        atomicReferenceFieldUpdater.lazySet(c4872k, c4872k2);
        aVar.f28566c = c4872k2;
        if (C8490b.m36639a(atomicReferenceFieldUpdater, this, c4872k2, aVar)) {
            return aVar.mo24739c(this) == null ? 1 : 2;
        }
        return 0;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) getClass().getSimpleName());
        sb2.append('@');
        sb2.append((Object) Integer.toHexString(System.identityHashCode(this)));
        return sb2.toString();
    }
}
