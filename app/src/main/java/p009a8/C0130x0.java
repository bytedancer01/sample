package p009a8;

import android.net.Uri;
import java.util.Collections;
import p009a8.InterfaceC0127w;
import p027b9.C0858p;
import p027b9.C0865w;
import p027b9.InterfaceC0832b;
import p027b9.InterfaceC0837d0;
import p027b9.InterfaceC0853l0;
import p027b9.InterfaceC0854m;
import p059d9.C4349a;
import p267p6.AbstractC7574e2;
import p267p6.C7561b1;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/x0.class
 */
/* renamed from: a8.x0 */
/* loaded from: combined.jar:classes2.jar:a8/x0.class */
public final class C0130x0 extends AbstractC0081a {

    /* renamed from: h */
    public final C0858p f592h;

    /* renamed from: i */
    public final InterfaceC0854m.a f593i;

    /* renamed from: j */
    public final C7629w0 f594j;

    /* renamed from: k */
    public final long f595k;

    /* renamed from: l */
    public final InterfaceC0837d0 f596l;

    /* renamed from: m */
    public final boolean f597m;

    /* renamed from: n */
    public final AbstractC7574e2 f598n;

    /* renamed from: o */
    public final C7561b1 f599o;

    /* renamed from: p */
    public InterfaceC0853l0 f600p;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/x0$b.class
     */
    /* renamed from: a8.x0$b */
    /* loaded from: combined.jar:classes2.jar:a8/x0$b.class */
    public static final class b {

        /* renamed from: a */
        public final InterfaceC0854m.a f601a;

        /* renamed from: b */
        public InterfaceC0837d0 f602b = new C0865w();

        /* renamed from: c */
        public boolean f603c = true;

        /* renamed from: d */
        public Object f604d;

        /* renamed from: e */
        public String f605e;

        public b(InterfaceC0854m.a aVar) {
            this.f601a = (InterfaceC0854m.a) C4349a.m21882e(aVar);
        }

        /* renamed from: a */
        public C0130x0 m651a(C7561b1.h hVar, long j10) {
            return new C0130x0(this.f605e, hVar, this.f601a, j10, this.f602b, this.f603c, this.f604d);
        }

        /* renamed from: b */
        public b m652b(InterfaceC0837d0 interfaceC0837d0) {
            if (interfaceC0837d0 == null) {
                interfaceC0837d0 = new C0865w();
            }
            this.f602b = interfaceC0837d0;
            return this;
        }
    }

    public C0130x0(String str, C7561b1.h hVar, InterfaceC0854m.a aVar, long j10, InterfaceC0837d0 interfaceC0837d0, boolean z10, Object obj) {
        this.f593i = aVar;
        this.f595k = j10;
        this.f596l = interfaceC0837d0;
        this.f597m = z10;
        C7561b1 m32350a = new C7561b1.c().m32348B(Uri.EMPTY).m32371v(hVar.f36512a.toString()).m32375z(Collections.singletonList(hVar)).m32347A(obj).m32350a();
        this.f599o = m32350a;
        this.f594j = new C7629w0.b().m33208S(str).m33220e0(hVar.f36513b).m33211V(hVar.f36514c).m33222g0(hVar.f36515d).m33218c0(hVar.f36516e).m33210U(hVar.f36517f).m33194E();
        this.f592h = new C0858p.b().m5391i(hVar.f36512a).m5384b(1).m5383a();
        this.f598n = new C0126v0(j10, true, false, false, null, m32350a);
    }

    @Override // p009a8.AbstractC0081a
    /* renamed from: B */
    public void mo303B(InterfaceC0853l0 interfaceC0853l0) {
        this.f600p = interfaceC0853l0;
        m304C(this.f598n);
    }

    @Override // p009a8.AbstractC0081a
    /* renamed from: D */
    public void mo305D() {
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: d */
    public C7561b1 mo400d() {
        return this.f599o;
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: h */
    public InterfaceC0121t mo401h(InterfaceC0127w.a aVar, InterfaceC0832b interfaceC0832b, long j10) {
        return new C0128w0(this.f592h, this.f593i, this.f600p, this.f594j, this.f595k, this.f596l, m319w(aVar), this.f597m);
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: m */
    public void mo402m() {
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: q */
    public void mo403q(InterfaceC0121t interfaceC0121t) {
        ((C0128w0) interfaceC0121t).m646t();
    }
}
