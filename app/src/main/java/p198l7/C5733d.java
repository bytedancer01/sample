package p198l7;

import android.net.Uri;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p057d7.C4328k;
import p057d7.C4334q;
import p057d7.InterfaceC4323f;
import p057d7.InterfaceC4324g;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4329l;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4361f0;
import p267p6.C7594k1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l7/d.class
 */
/* renamed from: l7.d */
/* loaded from: combined.jar:classes2.jar:l7/d.class */
public class C5733d implements InterfaceC4323f {

    /* renamed from: d */
    public static final InterfaceC4329l f32116d = new InterfaceC4329l() { // from class: l7.c
        @Override // p057d7.InterfaceC4329l
        /* renamed from: a */
        public /* synthetic */ InterfaceC4323f[] mo12020a(Uri uri, Map map) {
            return C4328k.m21824a(this, uri, map);
        }

        @Override // p057d7.InterfaceC4329l
        /* renamed from: b */
        public final InterfaceC4323f[] mo12021b() {
            InterfaceC4323f[] m28102e;
            m28102e = C5733d.m28102e();
            return m28102e;
        }
    };

    /* renamed from: a */
    public InterfaceC4325h f32117a;

    /* renamed from: b */
    public AbstractC5738i f32118b;

    /* renamed from: c */
    public boolean f32119c;

    /* renamed from: e */
    public static /* synthetic */ InterfaceC4323f[] m28102e() {
        return new InterfaceC4323f[]{new C5733d()};
    }

    /* renamed from: f */
    public static C4361f0 m28103f(C4361f0 c4361f0) {
        c4361f0.m21983P(0);
        return c4361f0;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: a */
    public void mo12027a(long j10, long j11) {
        AbstractC5738i abstractC5738i = this.f32118b;
        if (abstractC5738i != null) {
            abstractC5738i.m28126m(j10, j11);
        }
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: c */
    public void mo12028c(InterfaceC4325h interfaceC4325h) {
        this.f32117a = interfaceC4325h;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: d */
    public boolean mo12029d(InterfaceC4324g interfaceC4324g) {
        try {
            return m28104g(interfaceC4324g);
        } catch (C7594k1 e10) {
            return false;
        }
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    /* renamed from: g */
    public final boolean m28104g(InterfaceC4324g interfaceC4324g) {
        AbstractC5738i c5737h;
        C5735f c5735f = new C5735f();
        if (!c5735f.m28111a(interfaceC4324g, true) || (c5735f.f32126b & 2) != 2) {
            return false;
        }
        int min = Math.min(c5735f.f32133i, 8);
        C4361f0 c4361f0 = new C4361f0(min);
        interfaceC4324g.mo21811q(c4361f0.m21988d(), 0, min);
        if (C5731b.m28095p(m28103f(c4361f0))) {
            c5737h = new C5731b();
        } else if (C5739j.m28130r(m28103f(c4361f0))) {
            c5737h = new C5739j();
        } else {
            if (!C5737h.m28115o(m28103f(c4361f0))) {
                return false;
            }
            c5737h = new C5737h();
        }
        this.f32118b = c5737h;
        return true;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: h */
    public int mo12033h(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        C4349a.m21886i(this.f32117a);
        if (this.f32118b == null) {
            if (!m28104g(interfaceC4324g)) {
                throw C7594k1.m32822a("Failed to determine bitstream type", null);
            }
            interfaceC4324g.mo21801f();
        }
        if (!this.f32119c) {
            InterfaceC4337t mo479e = this.f32117a.mo479e(0, 1);
            this.f32117a.mo491u();
            this.f32118b.m28120d(this.f32117a, mo479e);
            this.f32119c = true;
        }
        return this.f32118b.m28122g(interfaceC4324g, c4334q);
    }

    @Override // p057d7.InterfaceC4323f
    public void release() {
    }
}
