package cg;

import cg.C1099l;
import cg.ConcurrentMapC1098k;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cg/e.class
 */
/* renamed from: cg.e */
/* loaded from: combined.jar:classes2.jar:cg/e.class */
public final class C1092e<K, V> {

    /* renamed from: p */
    public static final AbstractC1108u f7290p = new a();

    /* renamed from: q */
    public static final Logger f7291q = Logger.getLogger(C1092e.class.getName());

    /* renamed from: f */
    public InterfaceC1111x<? super K, ? super V> f7297f;

    /* renamed from: g */
    public ConcurrentMapC1098k.r f7298g;

    /* renamed from: h */
    public ConcurrentMapC1098k.r f7299h;

    /* renamed from: l */
    public AbstractC1095h<Object> f7303l;

    /* renamed from: m */
    public AbstractC1095h<Object> f7304m;

    /* renamed from: n */
    public InterfaceC1104q<? super K, ? super V> f7305n;

    /* renamed from: o */
    public AbstractC1108u f7306o;

    /* renamed from: a */
    public boolean f7292a = true;

    /* renamed from: b */
    public int f7293b = -1;

    /* renamed from: c */
    public int f7294c = -1;

    /* renamed from: d */
    public long f7295d = -1;

    /* renamed from: e */
    public long f7296e = -1;

    /* renamed from: i */
    public long f7300i = -1;

    /* renamed from: j */
    public long f7301j = -1;

    /* renamed from: k */
    public long f7302k = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/e$a.class
     */
    /* renamed from: cg.e$a */
    /* loaded from: combined.jar:classes2.jar:cg/e$a.class */
    public final class a extends AbstractC1108u {
        @Override // cg.AbstractC1108u
        /* renamed from: a */
        public long mo6533a() {
            return 0L;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/e$b.class
     */
    /* renamed from: cg.e$b */
    /* loaded from: combined.jar:classes2.jar:cg/e$b.class */
    public enum b implements InterfaceC1104q<Object, Object> {
        INSTANCE;

        @Override // cg.InterfaceC1104q
        public void onRemoval(C1105r<Object, Object> c1105r) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/e$c.class
     */
    /* renamed from: cg.e$c */
    /* loaded from: combined.jar:classes2.jar:cg/e$c.class */
    public enum c implements InterfaceC1111x<Object, Object> {
        INSTANCE;

        @Override // cg.InterfaceC1111x
        public int weigh(Object obj, Object obj2) {
            return 1;
        }
    }

    /* renamed from: q */
    public static C1092e<Object, Object> m6516q() {
        return new C1092e<>();
    }

    /* renamed from: a */
    public <K1 extends K, V1 extends V> InterfaceC1091d<K1, V1> m6517a() {
        m6519c();
        m6518b();
        return new ConcurrentMapC1098k.m(this);
    }

    /* renamed from: b */
    public final void m6518b() {
        C1102o.m6668d(this.f7302k == -1, "refreshAfterWrite requires a LoadingCache");
    }

    /* renamed from: c */
    public final void m6519c() {
        Object obj;
        boolean z10 = true;
        if (this.f7297f == null) {
            z10 = this.f7296e == -1;
            obj = "maximumWeight requires weigher";
        } else if (!this.f7292a) {
            if (this.f7296e == -1) {
                f7291q.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
                return;
            }
            return;
        } else {
            if (this.f7296e == -1) {
                z10 = false;
            }
            obj = "weigher requires maximumWeight";
        }
        C1102o.m6668d(z10, obj);
    }

    /* renamed from: d */
    public int m6520d() {
        int i10 = this.f7294c;
        int i11 = i10;
        if (i10 == -1) {
            i11 = 4;
        }
        return i11;
    }

    /* renamed from: e */
    public long m6521e() {
        long j10 = this.f7301j;
        long j11 = j10;
        if (j10 == -1) {
            j11 = 0;
        }
        return j11;
    }

    /* renamed from: f */
    public long m6522f() {
        long j10 = this.f7300i;
        long j11 = j10;
        if (j10 == -1) {
            j11 = 0;
        }
        return j11;
    }

    /* renamed from: g */
    public int m6523g() {
        int i10 = this.f7293b;
        int i11 = i10;
        if (i10 == -1) {
            i11 = 16;
        }
        return i11;
    }

    /* renamed from: h */
    public AbstractC1095h<Object> m6524h() {
        return (AbstractC1095h) C1099l.m6654a(this.f7303l, m6525i().defaultEquivalence());
    }

    /* renamed from: i */
    public ConcurrentMapC1098k.r m6525i() {
        return (ConcurrentMapC1098k.r) C1099l.m6654a(this.f7298g, ConcurrentMapC1098k.r.STRONG);
    }

    /* renamed from: j */
    public long m6526j() {
        if (this.f7300i == 0 || this.f7301j == 0) {
            return 0L;
        }
        return this.f7297f == null ? this.f7295d : this.f7296e;
    }

    /* renamed from: k */
    public long m6527k() {
        long j10 = this.f7302k;
        long j11 = j10;
        if (j10 == -1) {
            j11 = 0;
        }
        return j11;
    }

    /* renamed from: l */
    public <K1 extends K, V1 extends V> InterfaceC1104q<K1, V1> m6528l() {
        return (InterfaceC1104q) C1099l.m6654a(this.f7305n, b.INSTANCE);
    }

    /* renamed from: m */
    public AbstractC1108u m6529m(boolean z10) {
        AbstractC1108u abstractC1108u = this.f7306o;
        if (abstractC1108u != null) {
            return abstractC1108u;
        }
        return z10 ? AbstractC1108u.m6676b() : f7290p;
    }

    /* renamed from: n */
    public AbstractC1095h<Object> m6530n() {
        return (AbstractC1095h) C1099l.m6654a(this.f7304m, m6531o().defaultEquivalence());
    }

    /* renamed from: o */
    public ConcurrentMapC1098k.r m6531o() {
        return (ConcurrentMapC1098k.r) C1099l.m6654a(this.f7299h, ConcurrentMapC1098k.r.STRONG);
    }

    /* renamed from: p */
    public <K1 extends K, V1 extends V> InterfaceC1111x<K1, V1> m6532p() {
        return (InterfaceC1111x) C1099l.m6654a(this.f7297f, c.INSTANCE);
    }

    public String toString() {
        C1099l.b m6655b = C1099l.m6655b(this);
        int i10 = this.f7293b;
        if (i10 != -1) {
            m6655b.m6656a("initialCapacity", i10);
        }
        int i11 = this.f7294c;
        if (i11 != -1) {
            m6655b.m6656a("concurrencyLevel", i11);
        }
        long j10 = this.f7295d;
        if (j10 != -1) {
            m6655b.m6657b("maximumSize", j10);
        }
        long j11 = this.f7296e;
        if (j11 != -1) {
            m6655b.m6657b("maximumWeight", j11);
        }
        if (this.f7300i != -1) {
            m6655b.m6658c("expireAfterWrite", this.f7300i + "ns");
        }
        if (this.f7301j != -1) {
            m6655b.m6658c("expireAfterAccess", this.f7301j + "ns");
        }
        ConcurrentMapC1098k.r rVar = this.f7298g;
        if (rVar != null) {
            m6655b.m6658c("keyStrength", C1090c.m6512b(rVar.toString()));
        }
        ConcurrentMapC1098k.r rVar2 = this.f7299h;
        if (rVar2 != null) {
            m6655b.m6658c("valueStrength", C1090c.m6512b(rVar2.toString()));
        }
        if (this.f7303l != null) {
            m6655b.m6662g("keyEquivalence");
        }
        if (this.f7304m != null) {
            m6655b.m6662g("valueEquivalence");
        }
        if (this.f7305n != null) {
            m6655b.m6662g("removalListener");
        }
        return m6655b.toString();
    }
}
