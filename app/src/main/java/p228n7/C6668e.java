package p228n7;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import java.util.Map;
import p057d7.C4328k;
import p057d7.C4334q;
import p057d7.InterfaceC4323f;
import p057d7.InterfaceC4324g;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4329l;
import p059d9.C4361f0;
import p228n7.InterfaceC6677i0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/e.class
 */
/* renamed from: n7.e */
/* loaded from: combined.jar:classes2.jar:n7/e.class */
public final class C6668e implements InterfaceC4323f {

    /* renamed from: d */
    public static final InterfaceC4329l f34734d = new InterfaceC4329l() { // from class: n7.d
        @Override // p057d7.InterfaceC4329l
        /* renamed from: a */
        public /* synthetic */ InterfaceC4323f[] mo12020a(Uri uri, Map map) {
            return C4328k.m21824a(this, uri, map);
        }

        @Override // p057d7.InterfaceC4329l
        /* renamed from: b */
        public final InterfaceC4323f[] mo12021b() {
            InterfaceC4323f[] m30691e;
            m30691e = C6668e.m30691e();
            return m30691e;
        }
    };

    /* renamed from: a */
    public final C6670f f34735a = new C6670f();

    /* renamed from: b */
    public final C4361f0 f34736b = new C4361f0(16384);

    /* renamed from: c */
    public boolean f34737c;

    /* renamed from: e */
    public static /* synthetic */ InterfaceC4323f[] m30691e() {
        return new InterfaceC4323f[]{new C6668e()};
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: a */
    public void mo12027a(long j10, long j11) {
        this.f34737c = false;
        this.f34735a.mo30679c();
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: c */
    public void mo12028c(InterfaceC4325h interfaceC4325h) {
        this.f34735a.mo30680d(interfaceC4325h, new InterfaceC6677i0.d(0, 1));
        interfaceC4325h.mo491u();
        interfaceC4325h.mo487p(new InterfaceC2348g.b(-9223372036854775807L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
    
        r6.mo21801f();
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
    
        if ((r8 - r7) < 8192) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        return false;
     */
    @Override // p057d7.InterfaceC4323f
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo12029d(p057d7.InterfaceC4324g r6) {
        /*
            r5 = this;
            d9.f0 r0 = new d9.f0
            r1 = r0
            r2 = 10
            r1.<init>(r2)
            r11 = r0
            r0 = 0
            r7 = r0
        Ld:
            r0 = r6
            r1 = r11
            byte[] r1 = r1.m21988d()
            r2 = 0
            r3 = 10
            r0.mo21811q(r1, r2, r3)
            r0 = r11
            r1 = 0
            r0.m21983P(r1)
            r0 = r11
            int r0 = r0.m21974G()
            r1 = 4801587(0x494433, float:6.728456E-39)
            if (r0 == r1) goto Lb1
            r0 = r6
            r0.mo21801f()
            r0 = r6
            r1 = r7
            r0.mo21805k(r1)
            r0 = r7
            r8 = r0
        L3a:
            r0 = 0
            r9 = r0
        L3d:
            r0 = r6
            r1 = r11
            byte[] r1 = r1.m21988d()
            r2 = 0
            r3 = 7
            r0.mo21811q(r1, r2, r3)
            r0 = r11
            r1 = 0
            r0.m21983P(r1)
            r0 = r11
            int r0 = r0.m21977J()
            r10 = r0
            r0 = r10
            r1 = 44096(0xac40, float:6.1792E-41)
            if (r0 == r1) goto L84
            r0 = r10
            r1 = 44097(0xac41, float:6.1793E-41)
            if (r0 == r1) goto L84
            r0 = r6
            r0.mo21801f()
            int r8 = r8 + 1
            r0 = r8
            r1 = r7
            int r0 = r0 - r1
            r1 = 8192(0x2000, float:1.148E-41)
            if (r0 < r1) goto L7a
            r0 = 0
            return r0
        L7a:
            r0 = r6
            r1 = r8
            r0.mo21805k(r1)
            goto L3a
        L84:
            int r9 = r9 + 1
            r0 = r9
            r1 = 4
            if (r0 < r1) goto L8f
            r0 = 1
            return r0
        L8f:
            r0 = r11
            byte[] r0 = r0.m21988d()
            r1 = r10
            int r0 = p301r6.C7970c.m34572e(r0, r1)
            r10 = r0
            r0 = r10
            r1 = -1
            if (r0 != r1) goto La3
            r0 = 0
            return r0
        La3:
            r0 = r6
            r1 = r10
            r2 = 7
            int r1 = r1 - r2
            r0.mo21805k(r1)
            goto L3d
        Lb1:
            r0 = r11
            r1 = 3
            r0.m21984Q(r1)
            r0 = r11
            int r0 = r0.m21970C()
            r8 = r0
            r0 = r7
            r1 = r8
            r2 = 10
            int r1 = r1 + r2
            int r0 = r0 + r1
            r7 = r0
            r0 = r6
            r1 = r8
            r0.mo21805k(r1)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: p228n7.C6668e.mo12029d(d7.g):boolean");
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: h */
    public int mo12033h(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        int read = interfaceC4324g.read(this.f34736b.m21988d(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.f34736b.m21983P(0);
        this.f34736b.m21982O(read);
        if (!this.f34737c) {
            this.f34735a.mo30682f(0L, 4);
            this.f34737c = true;
        }
        this.f34735a.mo30677a(this.f34736b);
        return 0;
    }

    @Override // p057d7.InterfaceC4323f
    public void release() {
    }
}