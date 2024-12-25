package p267p6;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import ec.C4705h;
import java.util.List;
import p009a8.C0083a1;
import p059d9.C4376n;
import p078e9.C4670d0;
import p078e9.InterfaceC4683q;
import p243o8.C6919a;
import p243o8.InterfaceC6929k;
import p283q7.C7839a;
import p283q7.InterfaceC7844f;
import p301r6.InterfaceC7978g;
import p347u6.InterfaceC8796b;
import p421y8.C9888l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/o1.class
 */
/* renamed from: p6.o1 */
/* loaded from: combined.jar:classes2.jar:p6/o1.class */
public interface InterfaceC7606o1 {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/o1$b.class
     */
    /* renamed from: p6.o1$b */
    /* loaded from: combined.jar:classes2.jar:p6/o1$b.class */
    public static final class b {

        /* renamed from: b */
        public static final b f36902b = new a().m32871e();

        /* renamed from: c */
        public static final InterfaceC7579g<b> f36903c = new C7604o();

        /* renamed from: a */
        public final C4376n f36904a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:p6/o1$b$a.class
         */
        /* renamed from: p6.o1$b$a */
        /* loaded from: combined.jar:classes2.jar:p6/o1$b$a.class */
        public static final class a {

            /* renamed from: b */
            public static final int[] f36905b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};

            /* renamed from: a */
            public final C4376n.b f36906a = new C4376n.b();

            /* renamed from: a */
            public a m32867a(int i10) {
                this.f36906a.m22156a(i10);
                return this;
            }

            /* renamed from: b */
            public a m32868b(b bVar) {
                this.f36906a.m22157b(bVar.f36904a);
                return this;
            }

            /* renamed from: c */
            public a m32869c(int... iArr) {
                this.f36906a.m22158c(iArr);
                return this;
            }

            /* renamed from: d */
            public a m32870d(int i10, boolean z10) {
                this.f36906a.m22159d(i10, z10);
                return this;
            }

            /* renamed from: e */
            public b m32871e() {
                return new b(this.f36906a.m22160e());
            }
        }

        public b(C4376n c4376n) {
            this.f36904a = c4376n;
        }

        /* renamed from: b */
        public boolean m32866b(int i10) {
            return this.f36904a.m22152a(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f36904a.equals(((b) obj).f36904a);
            }
            return false;
        }

        public int hashCode() {
            return this.f36904a.hashCode();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/o1$c.class
     */
    @Deprecated
    /* renamed from: p6.o1$c */
    /* loaded from: combined.jar:classes2.jar:p6/o1$c.class */
    public interface c {
        /* renamed from: A */
        void mo12514A(C7597l1 c7597l1);

        /* renamed from: C */
        void mo12515C(InterfaceC7606o1 interfaceC7606o1, d dVar);

        @Deprecated
        /* renamed from: M */
        void mo12520M(int i10);

        /* renamed from: N */
        void mo12521N(boolean z10);

        @Deprecated
        /* renamed from: O */
        void mo12522O();

        /* renamed from: Q */
        void mo12523Q(b bVar);

        /* renamed from: R */
        void mo12524R(C7597l1 c7597l1);

        @Deprecated
        /* renamed from: Y */
        void mo12526Y(boolean z10, int i10);

        /* renamed from: e */
        void mo12532e(C7603n1 c7603n1);

        /* renamed from: e0 */
        void mo12533e0(C0083a1 c0083a1, C9888l c9888l);

        /* renamed from: f */
        void mo12534f(int i10);

        /* renamed from: g0 */
        void mo12535g0(boolean z10, int i10);

        @Deprecated
        /* renamed from: h */
        void mo12536h(boolean z10);

        /* renamed from: i0 */
        void mo12537i0(f fVar, f fVar2, int i10);

        @Deprecated
        /* renamed from: j */
        void mo12538j(List<C7839a> list);

        /* renamed from: m */
        void mo12539m(int i10);

        /* renamed from: m0 */
        void mo12540m0(boolean z10);

        void onRepeatModeChanged(int i10);

        /* renamed from: p */
        void mo12541p(AbstractC7574e2 abstractC7574e2, int i10);

        /* renamed from: s */
        void mo12542s(boolean z10);

        /* renamed from: x */
        void mo12544x(C7561b1 c7561b1, int i10);

        /* renamed from: y */
        void mo12545y(C7565c1 c7565c1);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/o1$d.class
     */
    /* renamed from: p6.o1$d */
    /* loaded from: combined.jar:classes2.jar:p6/o1$d.class */
    public static final class d {

        /* renamed from: a */
        public final C4376n f36907a;

        public d(C4376n c4376n) {
            this.f36907a = c4376n;
        }

        /* renamed from: a */
        public boolean m32872a(int i10) {
            return this.f36907a.m22152a(i10);
        }

        /* renamed from: b */
        public boolean m32873b(int... iArr) {
            return this.f36907a.m22153b(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                return this.f36907a.equals(((d) obj).f36907a);
            }
            return false;
        }

        public int hashCode() {
            return this.f36907a.hashCode();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/o1$e.class
     */
    /* renamed from: p6.o1$e */
    /* loaded from: combined.jar:classes2.jar:p6/o1$e.class */
    public interface e extends InterfaceC4683q, InterfaceC7978g, InterfaceC6929k, InterfaceC7844f, InterfaceC8796b, c {
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/o1$f.class
     */
    /* renamed from: p6.o1$f */
    /* loaded from: combined.jar:classes2.jar:p6/o1$f.class */
    public static final class f {

        /* renamed from: i */
        public static final InterfaceC7579g<f> f36908i = new C7604o();

        /* renamed from: a */
        public final Object f36909a;

        /* renamed from: b */
        public final int f36910b;

        /* renamed from: c */
        public final Object f36911c;

        /* renamed from: d */
        public final int f36912d;

        /* renamed from: e */
        public final long f36913e;

        /* renamed from: f */
        public final long f36914f;

        /* renamed from: g */
        public final int f36915g;

        /* renamed from: h */
        public final int f36916h;

        public f(Object obj, int i10, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f36909a = obj;
            this.f36910b = i10;
            this.f36911c = obj2;
            this.f36912d = i11;
            this.f36913e = j10;
            this.f36914f = j11;
            this.f36915g = i12;
            this.f36916h = i13;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            if (this.f36910b != fVar.f36910b || this.f36912d != fVar.f36912d || this.f36913e != fVar.f36913e || this.f36914f != fVar.f36914f || this.f36915g != fVar.f36915g || this.f36916h != fVar.f36916h || !C4705h.m23655a(this.f36909a, fVar.f36909a) || !C4705h.m23655a(this.f36911c, fVar.f36911c)) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            return C4705h.m23656b(this.f36909a, Integer.valueOf(this.f36910b), this.f36911c, Integer.valueOf(this.f36912d), Integer.valueOf(this.f36910b), Long.valueOf(this.f36913e), Long.valueOf(this.f36914f), Integer.valueOf(this.f36915g), Integer.valueOf(this.f36916h));
        }
    }

    /* renamed from: A */
    void mo32410A(e eVar);

    /* renamed from: B */
    int mo32411B();

    /* renamed from: C */
    int mo32412C();

    /* renamed from: D */
    void mo32413D(TextureView textureView);

    /* renamed from: E */
    C4670d0 mo32414E();

    /* renamed from: F */
    int mo32415F();

    /* renamed from: G */
    long mo32416G();

    /* renamed from: H */
    long mo32417H();

    /* renamed from: I */
    void mo32418I(int i10, List<C7561b1> list);

    /* renamed from: J */
    void mo32419J(SurfaceView surfaceView);

    /* renamed from: K */
    boolean mo32420K();

    /* renamed from: L */
    long mo32421L();

    /* renamed from: M */
    void mo32637M();

    /* renamed from: N */
    void mo32638N();

    /* renamed from: O */
    C7565c1 mo32424O();

    /* renamed from: P */
    long mo32426P();

    /* renamed from: a */
    boolean mo32436a();

    /* renamed from: b */
    C7603n1 mo32438b();

    /* renamed from: c */
    void mo32440c(C7603n1 c7603n1);

    /* renamed from: d */
    long mo32442d();

    /* renamed from: f */
    boolean mo32654f();

    /* renamed from: g */
    void mo32447g(e eVar);

    long getCurrentPosition();

    long getDuration();

    int getPlaybackState();

    int getRepeatMode();

    float getVolume();

    /* renamed from: h */
    void mo32449h(SurfaceView surfaceView);

    /* renamed from: i */
    int mo32451i();

    boolean isPlaying();

    /* renamed from: j */
    void mo32657j();

    /* renamed from: k */
    C7597l1 mo32454k();

    /* renamed from: l */
    void mo32456l(boolean z10);

    /* renamed from: m */
    List<C6919a> mo32458m();

    /* renamed from: n */
    int mo32460n();

    /* renamed from: o */
    boolean mo32658o(int i10);

    /* renamed from: p */
    int mo32463p();

    void prepare();

    /* renamed from: q */
    C0083a1 mo32465q();

    /* renamed from: r */
    AbstractC7574e2 mo32467r();

    /* renamed from: s */
    Looper mo32469s();

    void seekTo(long j10);

    void setRepeatMode(int i10);

    /* renamed from: t */
    void mo32659t();

    /* renamed from: u */
    void mo32472u(TextureView textureView);

    /* renamed from: v */
    C9888l mo32474v();

    /* renamed from: w */
    void mo32476w(int i10, long j10);

    /* renamed from: x */
    b mo32478x();

    /* renamed from: y */
    boolean mo32480y();

    /* renamed from: z */
    void mo32482z(boolean z10);
}
