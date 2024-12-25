package p267p6;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.amazonaws.services.p045s3.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import p009a8.C0083a1;
import p009a8.C0103k;
import p009a8.InterfaceC0092e0;
import p027b9.C0861s;
import p027b9.InterfaceC0840f;
import p057d7.C4321d;
import p057d7.InterfaceC4329l;
import p059d9.C4349a;
import p059d9.C4360f;
import p059d9.C4365h0;
import p059d9.C4392v;
import p059d9.C4401z0;
import p059d9.InterfaceC4354c;
import p078e9.C4670d0;
import p078e9.C4684r;
import p078e9.InterfaceC4668c0;
import p078e9.InterfaceC4678l;
import p078e9.InterfaceC4679m;
import p078e9.InterfaceC4683q;
import p096f9.C4788l;
import p096f9.InterfaceC4777a;
import p243o8.C6919a;
import p243o8.InterfaceC6929k;
import p267p6.C7559b;
import p267p6.C7566c2;
import p267p6.C7567d;
import p267p6.C7592k;
import p267p6.C7615r1;
import p267p6.InterfaceC7606o1;
import p267p6.InterfaceC7613r;
import p282q6.C7800h1;
import p282q6.InterfaceC7806j1;
import p283q7.C7839a;
import p283q7.InterfaceC7844f;
import p301r6.C7972d;
import p301r6.C7982i;
import p301r6.InterfaceC7978g;
import p301r6.InterfaceC8002t;
import p332t6.C8636d;
import p332t6.C8639g;
import p347u6.C8795a;
import p347u6.InterfaceC8796b;
import p421y8.AbstractC9891o;
import p421y8.C9882f;
import p421y8.C9888l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/b2.class
 */
/* renamed from: p6.b2 */
/* loaded from: combined.jar:classes2.jar:p6/b2.class */
public class C7562b2 extends AbstractC7571e implements InterfaceC7613r {

    /* renamed from: A */
    public boolean f36518A;

    /* renamed from: B */
    public TextureView f36519B;

    /* renamed from: C */
    public int f36520C;

    /* renamed from: D */
    public int f36521D;

    /* renamed from: E */
    public int f36522E;

    /* renamed from: F */
    public C8636d f36523F;

    /* renamed from: G */
    public C8636d f36524G;

    /* renamed from: H */
    public int f36525H;

    /* renamed from: I */
    public C7972d f36526I;

    /* renamed from: J */
    public float f36527J;

    /* renamed from: K */
    public boolean f36528K;

    /* renamed from: L */
    public List<C6919a> f36529L;

    /* renamed from: M */
    public boolean f36530M;

    /* renamed from: N */
    public boolean f36531N;

    /* renamed from: O */
    public C4365h0 f36532O;

    /* renamed from: P */
    public boolean f36533P;

    /* renamed from: Q */
    public boolean f36534Q;

    /* renamed from: R */
    public C8795a f36535R;

    /* renamed from: S */
    public C4670d0 f36536S;

    /* renamed from: b */
    public final InterfaceC7627v1[] f36537b;

    /* renamed from: c */
    public final C4360f f36538c;

    /* renamed from: d */
    public final Context f36539d;

    /* renamed from: e */
    public final C7611q0 f36540e;

    /* renamed from: f */
    public final c f36541f;

    /* renamed from: g */
    public final d f36542g;

    /* renamed from: h */
    public final CopyOnWriteArraySet<InterfaceC4683q> f36543h;

    /* renamed from: i */
    public final CopyOnWriteArraySet<InterfaceC7978g> f36544i;

    /* renamed from: j */
    public final CopyOnWriteArraySet<InterfaceC6929k> f36545j;

    /* renamed from: k */
    public final CopyOnWriteArraySet<InterfaceC7844f> f36546k;

    /* renamed from: l */
    public final CopyOnWriteArraySet<InterfaceC8796b> f36547l;

    /* renamed from: m */
    public final C7800h1 f36548m;

    /* renamed from: n */
    public final C7559b f36549n;

    /* renamed from: o */
    public final C7567d f36550o;

    /* renamed from: p */
    public final C7566c2 f36551p;

    /* renamed from: q */
    public final C7578f2 f36552q;

    /* renamed from: r */
    public final C7582g2 f36553r;

    /* renamed from: s */
    public final long f36554s;

    /* renamed from: t */
    public C7629w0 f36555t;

    /* renamed from: u */
    public C7629w0 f36556u;

    /* renamed from: v */
    public AudioTrack f36557v;

    /* renamed from: w */
    public Object f36558w;

    /* renamed from: x */
    public Surface f36559x;

    /* renamed from: y */
    public SurfaceHolder f36560y;

    /* renamed from: z */
    public C4788l f36561z;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/b2$b.class
     */
    /* renamed from: p6.b2$b */
    /* loaded from: combined.jar:classes2.jar:p6/b2$b.class */
    public static final class b {

        /* renamed from: a */
        public final Context f36562a;

        /* renamed from: b */
        public final InterfaceC7639z1 f36563b;

        /* renamed from: c */
        public InterfaceC4354c f36564c;

        /* renamed from: d */
        public long f36565d;

        /* renamed from: e */
        public AbstractC9891o f36566e;

        /* renamed from: f */
        public InterfaceC0092e0 f36567f;

        /* renamed from: g */
        public InterfaceC7557a1 f36568g;

        /* renamed from: h */
        public InterfaceC0840f f36569h;

        /* renamed from: i */
        public C7800h1 f36570i;

        /* renamed from: j */
        public Looper f36571j;

        /* renamed from: k */
        public C4365h0 f36572k;

        /* renamed from: l */
        public C7972d f36573l;

        /* renamed from: m */
        public boolean f36574m;

        /* renamed from: n */
        public int f36575n;

        /* renamed from: o */
        public boolean f36576o;

        /* renamed from: p */
        public boolean f36577p;

        /* renamed from: q */
        public int f36578q;

        /* renamed from: r */
        public boolean f36579r;

        /* renamed from: s */
        public C7558a2 f36580s;

        /* renamed from: t */
        public long f36581t;

        /* renamed from: u */
        public long f36582u;

        /* renamed from: v */
        public InterfaceC7638z0 f36583v;

        /* renamed from: w */
        public long f36584w;

        /* renamed from: x */
        public long f36585x;

        /* renamed from: y */
        public boolean f36586y;

        /* renamed from: z */
        public boolean f36587z;

        public b(Context context, InterfaceC7639z1 interfaceC7639z1) {
            this(context, interfaceC7639z1, new C4321d());
        }

        public b(Context context, InterfaceC7639z1 interfaceC7639z1, InterfaceC4329l interfaceC4329l) {
            this(context, interfaceC7639z1, new C9882f(context), new C0103k(context, interfaceC4329l), new C7595l(), C0861s.m5400m(context), new C7800h1(InterfaceC4354c.f26546a));
        }

        public b(Context context, InterfaceC7639z1 interfaceC7639z1, AbstractC9891o abstractC9891o, InterfaceC0092e0 interfaceC0092e0, InterfaceC7557a1 interfaceC7557a1, InterfaceC0840f interfaceC0840f, C7800h1 c7800h1) {
            this.f36562a = context;
            this.f36563b = interfaceC7639z1;
            this.f36566e = abstractC9891o;
            this.f36567f = interfaceC0092e0;
            this.f36568g = interfaceC7557a1;
            this.f36569h = interfaceC0840f;
            this.f36570i = c7800h1;
            this.f36571j = C4401z0.m22347R();
            this.f36573l = C7972d.f38501f;
            this.f36575n = 0;
            this.f36578q = 1;
            this.f36579r = true;
            this.f36580s = C7558a2.f36436g;
            this.f36581t = 5000L;
            this.f36582u = 15000L;
            this.f36583v = new C7592k.b().m32821a();
            this.f36564c = InterfaceC4354c.f26546a;
            this.f36584w = 500L;
            this.f36585x = 2000L;
        }

        /* renamed from: A */
        public b m32508A(InterfaceC0092e0 interfaceC0092e0) {
            C4349a.m21884g(!this.f36587z);
            this.f36567f = interfaceC0092e0;
            return this;
        }

        /* renamed from: B */
        public b m32509B(AbstractC9891o abstractC9891o) {
            C4349a.m21884g(!this.f36587z);
            this.f36566e = abstractC9891o;
            return this;
        }

        /* renamed from: z */
        public C7562b2 m32510z() {
            C4349a.m21884g(!this.f36587z);
            this.f36587z = true;
            return new C7562b2(this);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/b2$c.class
     */
    /* renamed from: p6.b2$c */
    /* loaded from: combined.jar:classes2.jar:p6/b2$c.class */
    public final class c implements InterfaceC4668c0, InterfaceC8002t, InterfaceC6929k, InterfaceC7844f, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, C4788l.b, C7567d.b, C7559b.b, C7566c2.b, InterfaceC7606o1.c, InterfaceC7613r.a {

        /* renamed from: b */
        public final C7562b2 f36588b;

        public c(C7562b2 c7562b2) {
            this.f36588b = c7562b2;
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: A */
        public /* synthetic */ void mo12514A(C7597l1 c7597l1) {
            C7609p1.m32888i(this, c7597l1);
        }

        @Override // p301r6.InterfaceC8002t
        /* renamed from: B */
        public void mo32511B(C8636d c8636d) {
            this.f36588b.f36524G = c8636d;
            this.f36588b.f36548m.mo32511B(c8636d);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: C */
        public /* synthetic */ void mo12515C(InterfaceC7606o1 interfaceC7606o1, InterfaceC7606o1.d dVar) {
            C7609p1.m32881b(this, interfaceC7606o1, dVar);
        }

        @Override // p267p6.InterfaceC7613r.a
        /* renamed from: D */
        public void mo32512D(boolean z10) {
            this.f36588b.m32479x1();
        }

        @Override // p243o8.InterfaceC6929k
        /* renamed from: E */
        public void mo12517E(List<C6919a> list) {
            this.f36588b.f36529L = list;
            Iterator it = this.f36588b.f36545j.iterator();
            while (it.hasNext()) {
                ((InterfaceC6929k) it.next()).mo12517E(list);
            }
        }

        @Override // p301r6.InterfaceC8002t
        /* renamed from: F */
        public void mo32513F(long j10) {
            this.f36588b.f36548m.mo32513F(j10);
        }

        @Override // p078e9.InterfaceC4668c0
        /* renamed from: G */
        public void mo23447G(Exception exc) {
            this.f36588b.f36548m.mo23447G(exc);
        }

        @Override // p078e9.InterfaceC4668c0
        /* renamed from: H */
        public void mo23448H(C8636d c8636d) {
            this.f36588b.f36523F = c8636d;
            this.f36588b.f36548m.mo23448H(c8636d);
        }

        @Override // p267p6.C7567d.b
        /* renamed from: I */
        public void mo32514I(float f10) {
            this.f36588b.m32464p1();
        }

        @Override // p267p6.C7567d.b
        /* renamed from: J */
        public void mo32515J(int i10) {
            boolean mo32480y = this.f36588b.mo32480y();
            this.f36588b.m32477w1(mo32480y, i10, C7562b2.m32390Z0(mo32480y, i10));
        }

        @Override // p267p6.InterfaceC7613r.a
        /* renamed from: K */
        public /* synthetic */ void mo32516K(boolean z10) {
            C7610q.m32899a(this, z10);
        }

        @Override // p283q7.InterfaceC7844f
        /* renamed from: L */
        public void mo12519L(C7839a c7839a) {
            this.f36588b.f36548m.mo12519L(c7839a);
            this.f36588b.f36540e.m32978x1(c7839a);
            Iterator it = this.f36588b.f36546k.iterator();
            while (it.hasNext()) {
                ((InterfaceC7844f) it.next()).mo12519L(c7839a);
            }
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: M */
        public /* synthetic */ void mo12520M(int i10) {
            C7609p1.m32891l(this, i10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: N */
        public void mo12521N(boolean z10) {
            C7562b2 c7562b2;
            boolean z11;
            if (this.f36588b.f36532O != null) {
                if (z10 && !this.f36588b.f36533P) {
                    this.f36588b.f36532O.m22027a(0);
                    c7562b2 = this.f36588b;
                    z11 = true;
                } else {
                    if (z10 || !this.f36588b.f36533P) {
                        return;
                    }
                    this.f36588b.f36532O.m22030d(0);
                    c7562b2 = this.f36588b;
                    z11 = false;
                }
                c7562b2.f36533P = z11;
            }
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: O */
        public /* synthetic */ void mo12522O() {
            C7609p1.m32894o(this);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: Q */
        public /* synthetic */ void mo12523Q(InterfaceC7606o1.b bVar) {
            C7609p1.m32880a(this, bVar);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: R */
        public /* synthetic */ void mo12524R(C7597l1 c7597l1) {
            C7609p1.m32889j(this, c7597l1);
        }

        @Override // p078e9.InterfaceC4668c0
        /* renamed from: V */
        public void mo23449V(int i10, long j10) {
            this.f36588b.f36548m.mo23449V(i10, j10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: Y */
        public /* synthetic */ void mo12526Y(boolean z10, int i10) {
            C7609p1.m32890k(this, z10, i10);
        }

        @Override // p301r6.InterfaceC8002t
        /* renamed from: a */
        public void mo32517a(boolean z10) {
            if (this.f36588b.f36528K == z10) {
                return;
            }
            this.f36588b.f36528K = z10;
            this.f36588b.m32446f1();
        }

        @Override // p301r6.InterfaceC8002t
        /* renamed from: b */
        public void mo32518b(Exception exc) {
            this.f36588b.f36548m.mo32518b(exc);
        }

        @Override // p078e9.InterfaceC4668c0
        /* renamed from: b0 */
        public void mo23450b0(C8636d c8636d) {
            this.f36588b.f36548m.mo23450b0(c8636d);
            this.f36588b.f36555t = null;
            this.f36588b.f36523F = null;
        }

        @Override // p078e9.InterfaceC4668c0
        /* renamed from: c */
        public void mo23451c(C4670d0 c4670d0) {
            this.f36588b.f36536S = c4670d0;
            this.f36588b.f36548m.mo12529c(c4670d0);
            Iterator it = this.f36588b.f36543h.iterator();
            while (it.hasNext()) {
                InterfaceC4683q interfaceC4683q = (InterfaceC4683q) it.next();
                interfaceC4683q.mo12529c(c4670d0);
                interfaceC4683q.mo12528a0(c4670d0.f27559a, c4670d0.f27560b, c4670d0.f27561c, c4670d0.f27562d);
            }
        }

        @Override // p078e9.InterfaceC4668c0
        /* renamed from: c0 */
        public void mo23452c0(Object obj, long j10) {
            this.f36588b.f36548m.mo23452c0(obj, j10);
            if (this.f36588b.f36558w == obj) {
                Iterator it = this.f36588b.f36543h.iterator();
                while (it.hasNext()) {
                    ((InterfaceC4683q) it.next()).mo12516D();
                }
            }
        }

        @Override // p301r6.InterfaceC8002t
        /* renamed from: d */
        public void mo32519d(C7629w0 c7629w0, C8639g c8639g) {
            this.f36588b.f36556u = c7629w0;
            this.f36588b.f36548m.mo32519d(c7629w0, c8639g);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: e */
        public /* synthetic */ void mo12532e(C7603n1 c7603n1) {
            C7609p1.m32886g(this, c7603n1);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: e0 */
        public /* synthetic */ void mo12533e0(C0083a1 c0083a1, C9888l c9888l) {
            C7609p1.m32898s(this, c0083a1, c9888l);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: f */
        public /* synthetic */ void mo12534f(int i10) {
            C7609p1.m32887h(this, i10);
        }

        @Override // p301r6.InterfaceC8002t
        /* renamed from: f0 */
        public void mo32520f0(Exception exc) {
            this.f36588b.f36548m.mo32520f0(exc);
        }

        @Override // p267p6.C7566c2.b
        /* renamed from: g */
        public void mo32521g(int i10) {
            C8795a m32389V0 = C7562b2.m32389V0(this.f36588b.f36551p);
            if (m32389V0.equals(this.f36588b.f36535R)) {
                return;
            }
            this.f36588b.f36535R = m32389V0;
            Iterator it = this.f36588b.f36547l.iterator();
            while (it.hasNext()) {
                ((InterfaceC8796b) it.next()).mo12531d0(m32389V0);
            }
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: g0 */
        public void mo12535g0(boolean z10, int i10) {
            this.f36588b.m32479x1();
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: h */
        public /* synthetic */ void mo12536h(boolean z10) {
            C7609p1.m32883d(this, z10);
        }

        @Override // p078e9.InterfaceC4668c0
        /* renamed from: i */
        public void mo23453i(String str) {
            this.f36588b.f36548m.mo23453i(str);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: i0 */
        public /* synthetic */ void mo12537i0(InterfaceC7606o1.f fVar, InterfaceC7606o1.f fVar2, int i10) {
            C7609p1.m32892m(this, fVar, fVar2, i10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: j */
        public /* synthetic */ void mo12538j(List list) {
            C7609p1.m32896q(this, list);
        }

        @Override // p301r6.InterfaceC8002t
        /* renamed from: j0 */
        public void mo32522j0(int i10, long j10, long j11) {
            this.f36588b.f36548m.mo32522j0(i10, j10, j11);
        }

        @Override // p078e9.InterfaceC4668c0
        /* renamed from: k */
        public void mo23454k(String str, long j10, long j11) {
            this.f36588b.f36548m.mo23454k(str, j10, j11);
        }

        @Override // p267p6.C7559b.b
        /* renamed from: l */
        public void mo32343l() {
            this.f36588b.m32477w1(false, -1, 3);
        }

        @Override // p078e9.InterfaceC4668c0
        /* renamed from: l0 */
        public void mo23455l0(long j10, int i10) {
            this.f36588b.f36548m.mo23455l0(j10, i10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: m */
        public void mo12539m(int i10) {
            this.f36588b.m32479x1();
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: m0 */
        public /* synthetic */ void mo12540m0(boolean z10) {
            C7609p1.m32882c(this, z10);
        }

        @Override // p096f9.C4788l.b
        /* renamed from: n */
        public void mo24238n(Surface surface) {
            this.f36588b.m32473u1(null);
        }

        @Override // p096f9.C4788l.b
        /* renamed from: o */
        public void mo24239o(Surface surface) {
            this.f36588b.m32473u1(surface);
        }

        @Override // p267p6.InterfaceC7606o1.c
        public /* synthetic */ void onRepeatModeChanged(int i10) {
            C7609p1.m32893n(this, i10);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            this.f36588b.m32471t1(surfaceTexture);
            this.f36588b.m32445e1(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.f36588b.m32473u1(null);
            this.f36588b.m32445e1(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            this.f36588b.m32445e1(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: p */
        public /* synthetic */ void mo12541p(AbstractC7574e2 abstractC7574e2, int i10) {
            C7609p1.m32897r(this, abstractC7574e2, i10);
        }

        @Override // p301r6.InterfaceC8002t
        /* renamed from: q */
        public void mo32523q(String str) {
            this.f36588b.f36548m.mo32523q(str);
        }

        @Override // p301r6.InterfaceC8002t
        /* renamed from: r */
        public void mo32524r(String str, long j10, long j11) {
            this.f36588b.f36548m.mo32524r(str, j10, j11);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: s */
        public /* synthetic */ void mo12542s(boolean z10) {
            C7609p1.m32895p(this, z10);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            this.f36588b.m32445e1(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (this.f36588b.f36518A) {
                this.f36588b.m32473u1(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (this.f36588b.f36518A) {
                this.f36588b.m32473u1(null);
            }
            this.f36588b.m32445e1(0, 0);
        }

        @Override // p078e9.InterfaceC4668c0
        /* renamed from: t */
        public void mo23456t(C7629w0 c7629w0, C8639g c8639g) {
            this.f36588b.f36555t = c7629w0;
            this.f36588b.f36548m.mo23456t(c7629w0, c8639g);
        }

        @Override // p301r6.InterfaceC8002t
        /* renamed from: u */
        public /* synthetic */ void mo32525u(C7629w0 c7629w0) {
            C7982i.m34701f(this, c7629w0);
        }

        @Override // p078e9.InterfaceC4668c0
        /* renamed from: v */
        public /* synthetic */ void mo23457v(C7629w0 c7629w0) {
            C4684r.m23618i(this, c7629w0);
        }

        @Override // p267p6.C7566c2.b
        /* renamed from: w */
        public void mo32526w(int i10, boolean z10) {
            Iterator it = this.f36588b.f36547l.iterator();
            while (it.hasNext()) {
                ((InterfaceC8796b) it.next()).mo12543w(i10, z10);
            }
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: x */
        public /* synthetic */ void mo12544x(C7561b1 c7561b1, int i10) {
            C7609p1.m32884e(this, c7561b1, i10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: y */
        public /* synthetic */ void mo12545y(C7565c1 c7565c1) {
            C7609p1.m32885f(this, c7565c1);
        }

        @Override // p301r6.InterfaceC8002t
        /* renamed from: z */
        public void mo32527z(C8636d c8636d) {
            this.f36588b.f36548m.mo32527z(c8636d);
            this.f36588b.f36556u = null;
            this.f36588b.f36524G = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/b2$d.class
     */
    /* renamed from: p6.b2$d */
    /* loaded from: combined.jar:classes2.jar:p6/b2$d.class */
    public static final class d implements InterfaceC4679m, InterfaceC4777a, C7615r1.b {

        /* renamed from: b */
        public InterfaceC4679m f36589b;

        /* renamed from: c */
        public InterfaceC4777a f36590c;

        /* renamed from: d */
        public InterfaceC4679m f36591d;

        /* renamed from: e */
        public InterfaceC4777a f36592e;

        public d() {
        }

        @Override // p078e9.InterfaceC4679m
        /* renamed from: a */
        public void mo23576a(long j10, long j11, C7629w0 c7629w0, MediaFormat mediaFormat) {
            InterfaceC4679m interfaceC4679m = this.f36591d;
            if (interfaceC4679m != null) {
                interfaceC4679m.mo23576a(j10, j11, c7629w0, mediaFormat);
            }
            InterfaceC4679m interfaceC4679m2 = this.f36589b;
            if (interfaceC4679m2 != null) {
                interfaceC4679m2.mo23576a(j10, j11, c7629w0, mediaFormat);
            }
        }

        @Override // p096f9.InterfaceC4777a
        /* renamed from: b */
        public void mo24184b(long j10, float[] fArr) {
            InterfaceC4777a interfaceC4777a = this.f36592e;
            if (interfaceC4777a != null) {
                interfaceC4777a.mo24184b(j10, fArr);
            }
            InterfaceC4777a interfaceC4777a2 = this.f36590c;
            if (interfaceC4777a2 != null) {
                interfaceC4777a2.mo24184b(j10, fArr);
            }
        }

        @Override // p096f9.InterfaceC4777a
        /* renamed from: c */
        public void mo24185c() {
            InterfaceC4777a interfaceC4777a = this.f36592e;
            if (interfaceC4777a != null) {
                interfaceC4777a.mo24185c();
            }
            InterfaceC4777a interfaceC4777a2 = this.f36590c;
            if (interfaceC4777a2 != null) {
                interfaceC4777a2.mo24185c();
            }
        }

        @Override // p267p6.C7615r1.b
        /* renamed from: i */
        public void mo23432i(int i10, Object obj) {
            InterfaceC4777a cameraMotionListener;
            if (i10 == 6) {
                this.f36589b = (InterfaceC4679m) obj;
                return;
            }
            if (i10 == 7) {
                this.f36590c = (InterfaceC4777a) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            C4788l c4788l = (C4788l) obj;
            if (c4788l == null) {
                cameraMotionListener = null;
                this.f36591d = null;
            } else {
                this.f36591d = c4788l.getVideoFrameMetadataListener();
                cameraMotionListener = c4788l.getCameraMotionListener();
            }
            this.f36592e = cameraMotionListener;
        }
    }

    public C7562b2(b bVar) {
        c cVar;
        d dVar;
        Handler handler;
        C7611q0 c7611q0;
        C4360f c4360f = new C4360f();
        this.f36538c = c4360f;
        try {
            Context applicationContext = bVar.f36562a.getApplicationContext();
            this.f36539d = applicationContext;
            C7800h1 c7800h1 = bVar.f36570i;
            this.f36548m = c7800h1;
            this.f36532O = bVar.f36572k;
            this.f36526I = bVar.f36573l;
            this.f36520C = bVar.f36578q;
            this.f36528K = bVar.f36577p;
            this.f36554s = bVar.f36585x;
            cVar = new c();
            this.f36541f = cVar;
            dVar = new d();
            this.f36542g = dVar;
            this.f36543h = new CopyOnWriteArraySet<>();
            this.f36544i = new CopyOnWriteArraySet<>();
            this.f36545j = new CopyOnWriteArraySet<>();
            this.f36546k = new CopyOnWriteArraySet<>();
            this.f36547l = new CopyOnWriteArraySet<>();
            handler = new Handler(bVar.f36571j);
            InterfaceC7627v1[] mo32854a = bVar.f36563b.mo32854a(handler, cVar, cVar, cVar, cVar);
            this.f36537b = mo32854a;
            this.f36527J = 1.0f;
            this.f36525H = C4401z0.f26679a < 21 ? m32443d1(0) : C7583h.m32757a(applicationContext);
            this.f36529L = Collections.emptyList();
            this.f36530M = true;
            try {
                c7611q0 = new C7611q0(mo32854a, bVar.f36566e, bVar.f36567f, bVar.f36568g, bVar.f36569h, c7800h1, bVar.f36579r, bVar.f36580s, bVar.f36581t, bVar.f36582u, bVar.f36583v, bVar.f36584w, bVar.f36586y, bVar.f36564c, bVar.f36571j, this, new InterfaceC7606o1.b.a().m32869c(20, 21, 22, 23, 24, 25, 26, 27).m32871e());
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            this.f36540e = c7611q0;
            c7611q0.m32954F0(cVar);
            c7611q0.m32952E0(cVar);
            if (bVar.f36565d > 0) {
                c7611q0.m32967N0(bVar.f36565d);
            }
            C7559b c7559b = new C7559b(bVar.f36562a, handler, cVar);
            this.f36549n = c7559b;
            c7559b.m32342b(bVar.f36576o);
            C7567d c7567d = new C7567d(bVar.f36562a, handler, cVar);
            this.f36550o = c7567d;
            c7567d.m32603m(bVar.f36574m ? this.f36526I : null);
            C7566c2 c7566c2 = new C7566c2(bVar.f36562a, handler, cVar);
            this.f36551p = c7566c2;
            c7566c2.m32587h(C4401z0.m22381f0(this.f36526I.f38505c));
            C7578f2 c7578f2 = new C7578f2(bVar.f36562a);
            this.f36552q = c7578f2;
            c7578f2.m32717a(bVar.f36575n != 0);
            C7582g2 c7582g2 = new C7582g2(bVar.f36562a);
            this.f36553r = c7582g2;
            c7582g2.m32754a(bVar.f36575n == 2);
            this.f36535R = m32389V0(c7566c2);
            this.f36536S = C4670d0.f27557e;
            m32462o1(1, 102, Integer.valueOf(this.f36525H));
            m32462o1(2, 102, Integer.valueOf(this.f36525H));
            m32462o1(1, 3, this.f36526I);
            m32462o1(2, 4, Integer.valueOf(this.f36520C));
            m32462o1(1, 101, Boolean.valueOf(this.f36528K));
            m32462o1(2, 6, dVar);
            m32462o1(6, 7, dVar);
            c4360f.m21967f();
        } catch (Throwable th4) {
            th = th4;
            this.f36538c.m21967f();
            throw th;
        }
    }

    /* renamed from: V0 */
    public static C8795a m32389V0(C7566c2 c7566c2) {
        return new C8795a(0, c7566c2.m32585d(), c7566c2.m32584c());
    }

    /* renamed from: Z0 */
    public static int m32390Z0(boolean z10, int i10) {
        int i11 = 1;
        if (z10) {
            i11 = 1;
            if (i10 != 1) {
                i11 = 2;
            }
        }
        return i11;
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: A */
    public void mo32410A(InterfaceC7606o1.e eVar) {
        C4349a.m21882e(eVar);
        m32450h1(eVar);
        m32461n1(eVar);
        m32459m1(eVar);
        m32455k1(eVar);
        m32452i1(eVar);
        m32453j1(eVar);
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: B */
    public int mo32411B() {
        m32481y1();
        return this.f36540e.mo32411B();
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: C */
    public int mo32412C() {
        m32481y1();
        return this.f36540e.mo32412C();
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: D */
    public void mo32413D(TextureView textureView) {
        m32481y1();
        if (textureView == null || textureView != this.f36519B) {
            return;
        }
        m32431T0();
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: E */
    public C4670d0 mo32414E() {
        return this.f36536S;
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: F */
    public int mo32415F() {
        m32481y1();
        return this.f36540e.mo32415F();
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: G */
    public long mo32416G() {
        m32481y1();
        return this.f36540e.mo32416G();
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: H */
    public long mo32417H() {
        m32481y1();
        return this.f36540e.mo32417H();
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: I */
    public void mo32418I(int i10, List<C7561b1> list) {
        m32481y1();
        this.f36540e.mo32418I(i10, list);
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: J */
    public void mo32419J(SurfaceView surfaceView) {
        m32481y1();
        m32432U0(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: K */
    public boolean mo32420K() {
        m32481y1();
        return this.f36540e.mo32420K();
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: L */
    public long mo32421L() {
        m32481y1();
        return this.f36540e.mo32421L();
    }

    /* renamed from: M0 */
    public void m32422M0(InterfaceC7806j1 interfaceC7806j1) {
        C4349a.m21882e(interfaceC7806j1);
        this.f36548m.m34040u1(interfaceC7806j1);
    }

    @Deprecated
    /* renamed from: N0 */
    public void m32423N0(InterfaceC7978g interfaceC7978g) {
        C4349a.m21882e(interfaceC7978g);
        this.f36544i.add(interfaceC7978g);
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: O */
    public C7565c1 mo32424O() {
        return this.f36540e.mo32424O();
    }

    @Deprecated
    /* renamed from: O0 */
    public void m32425O0(InterfaceC8796b interfaceC8796b) {
        C4349a.m21882e(interfaceC8796b);
        this.f36547l.add(interfaceC8796b);
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: P */
    public long mo32426P() {
        m32481y1();
        return this.f36540e.mo32426P();
    }

    @Deprecated
    /* renamed from: P0 */
    public void m32427P0(InterfaceC7606o1.c cVar) {
        C4349a.m21882e(cVar);
        this.f36540e.m32954F0(cVar);
    }

    @Deprecated
    /* renamed from: Q0 */
    public void m32428Q0(InterfaceC7844f interfaceC7844f) {
        C4349a.m21882e(interfaceC7844f);
        this.f36546k.add(interfaceC7844f);
    }

    @Deprecated
    /* renamed from: R0 */
    public void m32429R0(InterfaceC6929k interfaceC6929k) {
        C4349a.m21882e(interfaceC6929k);
        this.f36545j.add(interfaceC6929k);
    }

    @Deprecated
    /* renamed from: S0 */
    public void m32430S0(InterfaceC4683q interfaceC4683q) {
        C4349a.m21882e(interfaceC4683q);
        this.f36543h.add(interfaceC4683q);
    }

    /* renamed from: T0 */
    public void m32431T0() {
        m32481y1();
        m32457l1();
        m32473u1(null);
        m32445e1(0, 0);
    }

    /* renamed from: U0 */
    public void m32432U0(SurfaceHolder surfaceHolder) {
        m32481y1();
        if (surfaceHolder == null || surfaceHolder != this.f36560y) {
            return;
        }
        m32431T0();
    }

    /* renamed from: W0 */
    public boolean m32433W0() {
        m32481y1();
        return this.f36540e.m32966M0();
    }

    /* renamed from: X0 */
    public C8636d m32434X0() {
        return this.f36524G;
    }

    /* renamed from: Y0 */
    public C7629w0 m32435Y0() {
        return this.f36556u;
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: a */
    public boolean mo32436a() {
        m32481y1();
        return this.f36540e.mo32436a();
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C7607p mo32454k() {
        m32481y1();
        return this.f36540e.mo32454k();
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: b */
    public C7603n1 mo32438b() {
        m32481y1();
        return this.f36540e.mo32438b();
    }

    /* renamed from: b1 */
    public C8636d m32439b1() {
        return this.f36523F;
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: c */
    public void mo32440c(C7603n1 c7603n1) {
        m32481y1();
        this.f36540e.mo32440c(c7603n1);
    }

    /* renamed from: c1 */
    public C7629w0 m32441c1() {
        return this.f36555t;
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: d */
    public long mo32442d() {
        m32481y1();
        return this.f36540e.mo32442d();
    }

    /* renamed from: d1 */
    public final int m32443d1(int i10) {
        AudioTrack audioTrack = this.f36557v;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i10) {
            this.f36557v.release();
            this.f36557v = null;
        }
        if (this.f36557v == null) {
            this.f36557v = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.f36557v.getAudioSessionId();
    }

    @Override // p267p6.InterfaceC7613r
    /* renamed from: e */
    public AbstractC9891o mo32444e() {
        m32481y1();
        return this.f36540e.mo32444e();
    }

    /* renamed from: e1 */
    public final void m32445e1(int i10, int i11) {
        if (i10 == this.f36521D && i11 == this.f36522E) {
            return;
        }
        this.f36521D = i10;
        this.f36522E = i11;
        this.f36548m.mo12518I(i10, i11);
        Iterator<InterfaceC4683q> it = this.f36543h.iterator();
        while (it.hasNext()) {
            it.next().mo12518I(i10, i11);
        }
    }

    /* renamed from: f1 */
    public final void m32446f1() {
        this.f36548m.mo12527a(this.f36528K);
        Iterator<InterfaceC7978g> it = this.f36544i.iterator();
        while (it.hasNext()) {
            it.next().mo12527a(this.f36528K);
        }
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: g */
    public void mo32447g(InterfaceC7606o1.e eVar) {
        C4349a.m21882e(eVar);
        m32423N0(eVar);
        m32430S0(eVar);
        m32429R0(eVar);
        m32428Q0(eVar);
        m32425O0(eVar);
        m32427P0(eVar);
    }

    /* renamed from: g1 */
    public void m32448g1() {
        AudioTrack audioTrack;
        m32481y1();
        if (C4401z0.f26679a < 21 && (audioTrack = this.f36557v) != null) {
            audioTrack.release();
            this.f36557v = null;
        }
        this.f36549n.m32342b(false);
        this.f36551p.m32586g();
        this.f36552q.m32718b(false);
        this.f36553r.m32755b(false);
        this.f36550o.m32599i();
        this.f36540e.m32980z1();
        this.f36548m.m34036K2();
        m32457l1();
        Surface surface = this.f36559x;
        if (surface != null) {
            surface.release();
            this.f36559x = null;
        }
        if (this.f36533P) {
            ((C4365h0) C4349a.m21882e(this.f36532O)).m22030d(0);
            this.f36533P = false;
        }
        this.f36529L = Collections.emptyList();
        this.f36534Q = true;
    }

    @Override // p267p6.InterfaceC7606o1
    public long getCurrentPosition() {
        m32481y1();
        return this.f36540e.getCurrentPosition();
    }

    @Override // p267p6.InterfaceC7606o1
    public long getDuration() {
        m32481y1();
        return this.f36540e.getDuration();
    }

    @Override // p267p6.InterfaceC7606o1
    public int getPlaybackState() {
        m32481y1();
        return this.f36540e.getPlaybackState();
    }

    @Override // p267p6.InterfaceC7606o1
    public int getRepeatMode() {
        m32481y1();
        return this.f36540e.getRepeatMode();
    }

    @Override // p267p6.InterfaceC7606o1
    public float getVolume() {
        return this.f36527J;
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: h */
    public void mo32449h(SurfaceView surfaceView) {
        m32481y1();
        if (surfaceView instanceof InterfaceC4678l) {
            m32457l1();
            m32473u1(surfaceView);
        } else {
            if (!(surfaceView instanceof C4788l)) {
                m32475v1(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            m32457l1();
            this.f36561z = (C4788l) surfaceView;
            this.f36540e.m32964K0(this.f36542g).m33021n(Constants.MAXIMUM_UPLOAD_PARTS).m33020m(this.f36561z).m33019l();
            this.f36561z.m24231d(this.f36541f);
            m32473u1(this.f36561z.getVideoSurface());
        }
        m32470s1(surfaceView.getHolder());
    }

    @Deprecated
    /* renamed from: h1 */
    public void m32450h1(InterfaceC7978g interfaceC7978g) {
        this.f36544i.remove(interfaceC7978g);
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: i */
    public int mo32451i() {
        m32481y1();
        return this.f36540e.mo32451i();
    }

    @Deprecated
    /* renamed from: i1 */
    public void m32452i1(InterfaceC8796b interfaceC8796b) {
        this.f36547l.remove(interfaceC8796b);
    }

    @Deprecated
    /* renamed from: j1 */
    public void m32453j1(InterfaceC7606o1.c cVar) {
        this.f36540e.m32948A1(cVar);
    }

    @Deprecated
    /* renamed from: k1 */
    public void m32455k1(InterfaceC7844f interfaceC7844f) {
        this.f36546k.remove(interfaceC7844f);
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: l */
    public void mo32456l(boolean z10) {
        m32481y1();
        int m32606p = this.f36550o.m32606p(z10, getPlaybackState());
        m32477w1(z10, m32606p, m32390Z0(z10, m32606p));
    }

    /* renamed from: l1 */
    public final void m32457l1() {
        if (this.f36561z != null) {
            this.f36540e.m32964K0(this.f36542g).m33021n(Constants.MAXIMUM_UPLOAD_PARTS).m33020m(null).m33019l();
            this.f36561z.m24233i(this.f36541f);
            this.f36561z = null;
        }
        TextureView textureView = this.f36519B;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f36541f) {
                C4392v.m22275i("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f36519B.setSurfaceTextureListener(null);
            }
            this.f36519B = null;
        }
        SurfaceHolder surfaceHolder = this.f36560y;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f36541f);
            this.f36560y = null;
        }
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: m */
    public List<C6919a> mo32458m() {
        m32481y1();
        return this.f36529L;
    }

    @Deprecated
    /* renamed from: m1 */
    public void m32459m1(InterfaceC6929k interfaceC6929k) {
        this.f36545j.remove(interfaceC6929k);
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: n */
    public int mo32460n() {
        m32481y1();
        return this.f36540e.mo32460n();
    }

    @Deprecated
    /* renamed from: n1 */
    public void m32461n1(InterfaceC4683q interfaceC4683q) {
        this.f36543h.remove(interfaceC4683q);
    }

    /* renamed from: o1 */
    public final void m32462o1(int i10, int i11, Object obj) {
        for (InterfaceC7627v1 interfaceC7627v1 : this.f36537b) {
            if (interfaceC7627v1.getTrackType() == i10) {
                this.f36540e.m32964K0(interfaceC7627v1).m33021n(i11).m33020m(obj).m33019l();
            }
        }
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: p */
    public int mo32463p() {
        m32481y1();
        return this.f36540e.mo32463p();
    }

    /* renamed from: p1 */
    public final void m32464p1() {
        m32462o1(1, 2, Float.valueOf(this.f36527J * this.f36550o.m32597g()));
    }

    @Override // p267p6.InterfaceC7606o1
    public void prepare() {
        m32481y1();
        boolean mo32480y = mo32480y();
        int m32606p = this.f36550o.m32606p(mo32480y, 2);
        m32477w1(mo32480y, m32606p, m32390Z0(mo32480y, m32606p));
        this.f36540e.prepare();
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: q */
    public C0083a1 mo32465q() {
        m32481y1();
        return this.f36540e.mo32465q();
    }

    /* renamed from: q1 */
    public void m32466q1(C7972d c7972d, boolean z10) {
        m32481y1();
        if (this.f36534Q) {
            return;
        }
        if (!C4401z0.m22371c(this.f36526I, c7972d)) {
            this.f36526I = c7972d;
            m32462o1(1, 3, c7972d);
            this.f36551p.m32587h(C4401z0.m22381f0(c7972d.f38505c));
            this.f36548m.mo12525S(c7972d);
            Iterator<InterfaceC7978g> it = this.f36544i.iterator();
            while (it.hasNext()) {
                it.next().mo12525S(c7972d);
            }
        }
        C7567d c7567d = this.f36550o;
        if (!z10) {
            c7972d = null;
        }
        c7567d.m32603m(c7972d);
        boolean mo32480y = mo32480y();
        int m32606p = this.f36550o.m32606p(mo32480y, getPlaybackState());
        m32477w1(mo32480y, m32606p, m32390Z0(mo32480y, m32606p));
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: r */
    public AbstractC7574e2 mo32467r() {
        m32481y1();
        return this.f36540e.mo32467r();
    }

    /* renamed from: r1 */
    public void m32468r1(List<C7561b1> list, boolean z10) {
        m32481y1();
        this.f36540e.m32951D1(list, z10);
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: s */
    public Looper mo32469s() {
        return this.f36540e.mo32469s();
    }

    /* renamed from: s1 */
    public final void m32470s1(SurfaceHolder surfaceHolder) {
        this.f36518A = false;
        this.f36560y = surfaceHolder;
        surfaceHolder.addCallback(this.f36541f);
        Surface surface = this.f36560y.getSurface();
        if (surface == null || !surface.isValid()) {
            m32445e1(0, 0);
        } else {
            Rect surfaceFrame = this.f36560y.getSurfaceFrame();
            m32445e1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // p267p6.InterfaceC7606o1
    public void setRepeatMode(int i10) {
        m32481y1();
        this.f36540e.setRepeatMode(i10);
    }

    /* renamed from: t1 */
    public final void m32471t1(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        m32473u1(surface);
        this.f36559x = surface;
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: u */
    public void mo32472u(TextureView textureView) {
        m32481y1();
        if (textureView == null) {
            m32431T0();
            return;
        }
        m32457l1();
        this.f36519B = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            C4392v.m22275i("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f36541f);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            m32473u1(null);
            m32445e1(0, 0);
        } else {
            m32471t1(surfaceTexture);
            m32445e1(textureView.getWidth(), textureView.getHeight());
        }
    }

    /* renamed from: u1 */
    public final void m32473u1(Object obj) {
        boolean z10;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC7627v1 interfaceC7627v1 : this.f36537b) {
            if (interfaceC7627v1.getTrackType() == 2) {
                arrayList.add(this.f36540e.m32964K0(interfaceC7627v1).m33021n(1).m33020m(obj).m33019l());
            }
        }
        Object obj2 = this.f36558w;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C7615r1) it.next()).m33008a(this.f36554s);
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException e11) {
                z11 = true;
            }
            z11 = false;
            Object obj3 = this.f36558w;
            Surface surface = this.f36559x;
            z10 = z11;
            if (obj3 == surface) {
                surface.release();
                this.f36559x = null;
                z10 = z11;
            }
        }
        this.f36558w = obj;
        if (z10) {
            this.f36540e.m32959H1(false, C7607p.m32877g(new C7626v0(3), 1003));
        }
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: v */
    public C9888l mo32474v() {
        m32481y1();
        return this.f36540e.mo32474v();
    }

    /* renamed from: v1 */
    public void m32475v1(SurfaceHolder surfaceHolder) {
        m32481y1();
        if (surfaceHolder == null) {
            m32431T0();
            return;
        }
        m32457l1();
        this.f36518A = true;
        this.f36560y = surfaceHolder;
        surfaceHolder.addCallback(this.f36541f);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            m32473u1(null);
            m32445e1(0, 0);
        } else {
            m32473u1(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            m32445e1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: w */
    public void mo32476w(int i10, long j10) {
        m32481y1();
        this.f36548m.m34035J2();
        this.f36540e.mo32476w(i10, j10);
    }

    /* renamed from: w1 */
    public final void m32477w1(boolean z10, int i10, int i11) {
        boolean z11 = z10 && i10 != -1;
        int i12 = 0;
        if (z11) {
            i12 = 0;
            if (i10 != 1) {
                i12 = 1;
            }
        }
        this.f36540e.m32957G1(z11, i12, i11);
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: x */
    public InterfaceC7606o1.b mo32478x() {
        m32481y1();
        return this.f36540e.mo32478x();
    }

    /* renamed from: x1 */
    public final void m32479x1() {
        int playbackState = getPlaybackState();
        boolean z10 = true;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                boolean m32433W0 = m32433W0();
                C7578f2 c7578f2 = this.f36552q;
                if (!mo32480y() || m32433W0) {
                    z10 = false;
                }
                c7578f2.m32718b(z10);
                this.f36553r.m32755b(mo32480y());
                return;
            }
            if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        this.f36552q.m32718b(false);
        this.f36553r.m32755b(false);
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: y */
    public boolean mo32480y() {
        m32481y1();
        return this.f36540e.mo32480y();
    }

    /* renamed from: y1 */
    public final void m32481y1() {
        this.f36538c.m21964c();
        if (Thread.currentThread() != mo32469s().getThread()) {
            String m22321E = C4401z0.m22321E("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), mo32469s().getThread().getName());
            if (this.f36530M) {
                throw new IllegalStateException(m22321E);
            }
            C4392v.m22276j("SimpleExoPlayer", m22321E, this.f36531N ? null : new IllegalStateException());
            this.f36531N = true;
        }
    }

    @Override // p267p6.InterfaceC7606o1
    /* renamed from: z */
    public void mo32482z(boolean z10) {
        m32481y1();
        this.f36540e.mo32482z(z10);
    }
}
