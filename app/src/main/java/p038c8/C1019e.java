package p038c8;

import android.util.SparseArray;
import com.google.android.exoplayer2.extractor.C2343b;
import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import java.util.List;
import p027b9.InterfaceC0846i;
import p038c8.InterfaceC1021g;
import p057d7.C4322e;
import p057d7.C4334q;
import p057d7.C4336s;
import p057d7.InterfaceC4323f;
import p057d7.InterfaceC4324g;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4361f0;
import p059d9.C4400z;
import p059d9.C4401z0;
import p145i7.C5197e;
import p182k7.C5516g;
import p214m7.C5932a;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:c8/e.class
 */
/* renamed from: c8.e */
/* loaded from: combined.jar:classes2.jar:c8/e.class */
public final class C1019e implements InterfaceC4325h, InterfaceC1021g {

    /* renamed from: k */
    public static final InterfaceC1021g.a f6850k = new InterfaceC1021g.a() { // from class: c8.d
        @Override // p038c8.InterfaceC1021g.a
        /* renamed from: a */
        public final InterfaceC1021g mo5995a(int i10, C7629w0 c7629w0, boolean z10, List list, InterfaceC4337t interfaceC4337t) {
            InterfaceC1021g m5997g;
            m5997g = C1019e.m5997g(i10, c7629w0, z10, list, interfaceC4337t);
            return m5997g;
        }
    };

    /* renamed from: l */
    public static final C4334q f6851l = new C4334q();

    /* renamed from: b */
    public final InterfaceC4323f f6852b;

    /* renamed from: c */
    public final int f6853c;

    /* renamed from: d */
    public final C7629w0 f6854d;

    /* renamed from: e */
    public final SparseArray<a> f6855e = new SparseArray<>();

    /* renamed from: f */
    public boolean f6856f;

    /* renamed from: g */
    public InterfaceC1021g.b f6857g;

    /* renamed from: h */
    public long f6858h;

    /* renamed from: i */
    public InterfaceC2348g f6859i;

    /* renamed from: j */
    public C7629w0[] f6860j;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:c8/e$a.class
     */
    /* renamed from: c8.e$a */
    /* loaded from: combined.jar:classes2.jar:c8/e$a.class */
    public static final class a implements InterfaceC4337t {

        /* renamed from: a */
        public final int f6861a;

        /* renamed from: b */
        public final int f6862b;

        /* renamed from: c */
        public final C7629w0 f6863c;

        /* renamed from: d */
        public final C4322e f6864d = new C4322e();

        /* renamed from: e */
        public C7629w0 f6865e;

        /* renamed from: f */
        public InterfaceC4337t f6866f;

        /* renamed from: g */
        public long f6867g;

        public a(int i10, int i11, C7629w0 c7629w0) {
            this.f6861a = i10;
            this.f6862b = i11;
            this.f6863c = c7629w0;
        }

        @Override // p057d7.InterfaceC4337t
        /* renamed from: a */
        public void mo598a(C4361f0 c4361f0, int i10, int i11) {
            ((InterfaceC4337t) C4401z0.m22391j(this.f6866f)).mo606e(c4361f0, i10);
        }

        @Override // p057d7.InterfaceC4337t
        /* renamed from: b */
        public void mo600b(long j10, int i10, int i11, int i12, InterfaceC4337t.a aVar) {
            long j11 = this.f6867g;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.f6866f = this.f6864d;
            }
            ((InterfaceC4337t) C4401z0.m22391j(this.f6866f)).mo600b(j10, i10, i11, i12, aVar);
        }

        @Override // p057d7.InterfaceC4337t
        /* renamed from: c */
        public int mo602c(InterfaceC0846i interfaceC0846i, int i10, boolean z10, int i11) {
            return ((InterfaceC4337t) C4401z0.m22391j(this.f6866f)).mo604d(interfaceC0846i, i10, z10);
        }

        @Override // p057d7.InterfaceC4337t
        /* renamed from: d */
        public /* synthetic */ int mo604d(InterfaceC0846i interfaceC0846i, int i10, boolean z10) {
            return C4336s.m21841a(this, interfaceC0846i, i10, z10);
        }

        @Override // p057d7.InterfaceC4337t
        /* renamed from: e */
        public /* synthetic */ void mo606e(C4361f0 c4361f0, int i10) {
            C4336s.m21842b(this, c4361f0, i10);
        }

        @Override // p057d7.InterfaceC4337t
        /* renamed from: f */
        public void mo608f(C7629w0 c7629w0) {
            C7629w0 c7629w02 = this.f6863c;
            C7629w0 c7629w03 = c7629w0;
            if (c7629w02 != null) {
                c7629w03 = c7629w0.m33161m(c7629w02);
            }
            this.f6865e = c7629w03;
            ((InterfaceC4337t) C4401z0.m22391j(this.f6866f)).mo608f(this.f6865e);
        }

        /* renamed from: g */
        public void m6002g(InterfaceC1021g.b bVar, long j10) {
            if (bVar == null) {
                this.f6866f = this.f6864d;
                return;
            }
            this.f6867g = j10;
            InterfaceC4337t mo5994e = bVar.mo5994e(this.f6861a, this.f6862b);
            this.f6866f = mo5994e;
            C7629w0 c7629w0 = this.f6865e;
            if (c7629w0 != null) {
                mo5994e.mo608f(c7629w0);
            }
        }
    }

    public C1019e(InterfaceC4323f interfaceC4323f, int i10, C7629w0 c7629w0) {
        this.f6852b = interfaceC4323f;
        this.f6853c = i10;
        this.f6854d = c7629w0;
    }

    /* renamed from: g */
    public static /* synthetic */ InterfaceC1021g m5997g(int i10, C7629w0 c7629w0, boolean z10, List list, InterfaceC4337t interfaceC4337t) {
        InterfaceC4323f c5516g;
        String str = c7629w0.f37085l;
        if (C4400z.m22310r(str)) {
            if (!"application/x-rawcc".equals(str)) {
                return null;
            }
            c5516g = new C5932a(c7629w0);
        } else if (C4400z.m22309q(str)) {
            c5516g = new C5197e(1);
        } else {
            c5516g = new C5516g(z10 ? 4 : 0, null, null, list, interfaceC4337t);
        }
        return new C1019e(c5516g, i10, c7629w0);
    }

    @Override // p038c8.InterfaceC1021g
    /* renamed from: a */
    public boolean mo5998a(InterfaceC4324g interfaceC4324g) {
        int mo12033h = this.f6852b.mo12033h(interfaceC4324g, f6851l);
        C4349a.m21884g(mo12033h != 1);
        boolean z10 = false;
        if (mo12033h == 0) {
            z10 = true;
        }
        return z10;
    }

    @Override // p038c8.InterfaceC1021g
    /* renamed from: b */
    public void mo5999b(InterfaceC1021g.b bVar, long j10, long j11) {
        this.f6857g = bVar;
        this.f6858h = j11;
        if (!this.f6856f) {
            this.f6852b.mo12028c(this);
            if (j10 != -9223372036854775807L) {
                this.f6852b.mo12027a(0L, j10);
            }
            this.f6856f = true;
            return;
        }
        InterfaceC4323f interfaceC4323f = this.f6852b;
        long j12 = j10;
        if (j10 == -9223372036854775807L) {
            j12 = 0;
        }
        interfaceC4323f.mo12027a(0L, j12);
        for (int i10 = 0; i10 < this.f6855e.size(); i10++) {
            this.f6855e.valueAt(i10).m6002g(bVar, j11);
        }
    }

    @Override // p038c8.InterfaceC1021g
    /* renamed from: c */
    public C2343b mo6000c() {
        InterfaceC2348g interfaceC2348g = this.f6859i;
        return interfaceC2348g instanceof C2343b ? (C2343b) interfaceC2348g : null;
    }

    @Override // p038c8.InterfaceC1021g
    /* renamed from: d */
    public C7629w0[] mo6001d() {
        return this.f6860j;
    }

    @Override // p057d7.InterfaceC4325h
    /* renamed from: e */
    public InterfaceC4337t mo479e(int i10, int i11) {
        a aVar = this.f6855e.get(i10);
        a aVar2 = aVar;
        if (aVar == null) {
            C4349a.m21884g(this.f6860j == null);
            aVar2 = new a(i10, i11, i11 == this.f6853c ? this.f6854d : null);
            aVar2.m6002g(this.f6857g, this.f6858h);
            this.f6855e.put(i10, aVar2);
        }
        return aVar2;
    }

    @Override // p057d7.InterfaceC4325h
    /* renamed from: p */
    public void mo487p(InterfaceC2348g interfaceC2348g) {
        this.f6859i = interfaceC2348g;
    }

    @Override // p038c8.InterfaceC1021g
    public void release() {
        this.f6852b.release();
    }

    @Override // p057d7.InterfaceC4325h
    /* renamed from: u */
    public void mo491u() {
        C7629w0[] c7629w0Arr = new C7629w0[this.f6855e.size()];
        for (int i10 = 0; i10 < this.f6855e.size(); i10++) {
            c7629w0Arr[i10] = (C7629w0) C4349a.m21886i(this.f6855e.valueAt(i10).f6865e);
        }
        this.f6860j = c7629w0Arr;
    }
}
