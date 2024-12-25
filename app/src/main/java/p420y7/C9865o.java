package p420y7;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p009a8.C0083a1;
import p009a8.C0103k;
import p009a8.C0134z0;
import p009a8.InterfaceC0121t;
import p009a8.InterfaceC0127w;
import p027b9.C0836d;
import p027b9.C0859q;
import p027b9.InterfaceC0832b;
import p027b9.InterfaceC0840f;
import p027b9.InterfaceC0853l0;
import p027b9.InterfaceC0854m;
import p038c8.AbstractC1028n;
import p038c8.InterfaceC1029o;
import p057d7.InterfaceC4329l;
import p059d9.C4349a;
import p059d9.C4401z0;
import p078e9.C4670d0;
import p078e9.C4684r;
import p078e9.InterfaceC4668c0;
import p243o8.InterfaceC6929k;
import p267p6.AbstractC7574e2;
import p267p6.C7561b1;
import p267p6.C7607p;
import p267p6.C7629w0;
import p267p6.InterfaceC7627v1;
import p267p6.InterfaceC7633x1;
import p267p6.InterfaceC7639z1;
import p283q7.C7839a;
import p283q7.InterfaceC7844f;
import p301r6.C7982i;
import p301r6.InterfaceC8002t;
import p332t6.C8636d;
import p332t6.C8639g;
import p365v6.InterfaceC9292z;
import p420y7.C9865o;
import p420y7.C9874x;
import p421y8.AbstractC9879c;
import p421y8.AbstractC9886j;
import p421y8.AbstractC9891o;
import p421y8.C9882f;
import p421y8.C9892p;
import p421y8.InterfaceC9884h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y7/o.class
 */
/* renamed from: y7.o */
/* loaded from: combined.jar:classes2.jar:y7/o.class */
public final class C9865o {

    /* renamed from: o */
    public static final C9882f.d f45235o;

    /* renamed from: p */
    @Deprecated
    public static final C9882f.d f45236p;

    /* renamed from: q */
    @Deprecated
    public static final C9882f.d f45237q;

    /* renamed from: a */
    public final C7561b1.g f45238a;

    /* renamed from: b */
    public final InterfaceC0127w f45239b;

    /* renamed from: c */
    public final C9882f f45240c;

    /* renamed from: d */
    public final InterfaceC7633x1[] f45241d;

    /* renamed from: e */
    public final SparseIntArray f45242e;

    /* renamed from: f */
    public final Handler f45243f;

    /* renamed from: g */
    public final AbstractC7574e2.c f45244g;

    /* renamed from: h */
    public boolean f45245h;

    /* renamed from: i */
    public c f45246i;

    /* renamed from: j */
    public g f45247j;

    /* renamed from: k */
    public C0083a1[] f45248k;

    /* renamed from: l */
    public AbstractC9886j.a[] f45249l;

    /* renamed from: m */
    public List<InterfaceC9884h>[][] f45250m;

    /* renamed from: n */
    public List<InterfaceC9884h>[][] f45251n;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y7/o$a.class
     */
    /* renamed from: y7.o$a */
    /* loaded from: combined.jar:classes2.jar:y7/o$a.class */
    public class a implements InterfaceC4668c0 {
        @Override // p078e9.InterfaceC4668c0
        /* renamed from: G */
        public /* synthetic */ void mo23447G(Exception exc) {
            C4684r.m23612c(this, exc);
        }

        @Override // p078e9.InterfaceC4668c0
        /* renamed from: H */
        public /* synthetic */ void mo23448H(C8636d c8636d) {
            C4684r.m23616g(this, c8636d);
        }

        @Override // p078e9.InterfaceC4668c0
        /* renamed from: V */
        public /* synthetic */ void mo23449V(int i10, long j10) {
            C4684r.m23610a(this, i10, j10);
        }

        @Override // p078e9.InterfaceC4668c0
        /* renamed from: b0 */
        public /* synthetic */ void mo23450b0(C8636d c8636d) {
            C4684r.m23615f(this, c8636d);
        }

        @Override // p078e9.InterfaceC4668c0
        /* renamed from: c */
        public /* synthetic */ void mo23451c(C4670d0 c4670d0) {
            C4684r.m23620k(this, c4670d0);
        }

        @Override // p078e9.InterfaceC4668c0
        /* renamed from: c0 */
        public /* synthetic */ void mo23452c0(Object obj, long j10) {
            C4684r.m23611b(this, obj, j10);
        }

        @Override // p078e9.InterfaceC4668c0
        /* renamed from: i */
        public /* synthetic */ void mo23453i(String str) {
            C4684r.m23614e(this, str);
        }

        @Override // p078e9.InterfaceC4668c0
        /* renamed from: k */
        public /* synthetic */ void mo23454k(String str, long j10, long j11) {
            C4684r.m23613d(this, str, j10, j11);
        }

        @Override // p078e9.InterfaceC4668c0
        /* renamed from: l0 */
        public /* synthetic */ void mo23455l0(long j10, int i10) {
            C4684r.m23617h(this, j10, i10);
        }

        @Override // p078e9.InterfaceC4668c0
        /* renamed from: t */
        public /* synthetic */ void mo23456t(C7629w0 c7629w0, C8639g c8639g) {
            C4684r.m23619j(this, c7629w0, c8639g);
        }

        @Override // p078e9.InterfaceC4668c0
        /* renamed from: v */
        public /* synthetic */ void mo23457v(C7629w0 c7629w0) {
            C4684r.m23618i(this, c7629w0);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y7/o$b.class
     */
    /* renamed from: y7.o$b */
    /* loaded from: combined.jar:classes2.jar:y7/o$b.class */
    public class b implements InterfaceC8002t {
        @Override // p301r6.InterfaceC8002t
        /* renamed from: B */
        public /* synthetic */ void mo32511B(C8636d c8636d) {
            C7982i.m34700e(this, c8636d);
        }

        @Override // p301r6.InterfaceC8002t
        /* renamed from: F */
        public /* synthetic */ void mo32513F(long j10) {
            C7982i.m34703h(this, j10);
        }

        @Override // p301r6.InterfaceC8002t
        /* renamed from: a */
        public /* synthetic */ void mo32517a(boolean z10) {
            C7982i.m34706k(this, z10);
        }

        @Override // p301r6.InterfaceC8002t
        /* renamed from: b */
        public /* synthetic */ void mo32518b(Exception exc) {
            C7982i.m34704i(this, exc);
        }

        @Override // p301r6.InterfaceC8002t
        /* renamed from: d */
        public /* synthetic */ void mo32519d(C7629w0 c7629w0, C8639g c8639g) {
            C7982i.m34702g(this, c7629w0, c8639g);
        }

        @Override // p301r6.InterfaceC8002t
        /* renamed from: f0 */
        public /* synthetic */ void mo32520f0(Exception exc) {
            C7982i.m34696a(this, exc);
        }

        @Override // p301r6.InterfaceC8002t
        /* renamed from: j0 */
        public /* synthetic */ void mo32522j0(int i10, long j10, long j11) {
            C7982i.m34705j(this, i10, j10, j11);
        }

        @Override // p301r6.InterfaceC8002t
        /* renamed from: q */
        public /* synthetic */ void mo32523q(String str) {
            C7982i.m34698c(this, str);
        }

        @Override // p301r6.InterfaceC8002t
        /* renamed from: r */
        public /* synthetic */ void mo32524r(String str, long j10, long j11) {
            C7982i.m34697b(this, str, j10, j11);
        }

        @Override // p301r6.InterfaceC8002t
        /* renamed from: u */
        public /* synthetic */ void mo32525u(C7629w0 c7629w0) {
            C7982i.m34701f(this, c7629w0);
        }

        @Override // p301r6.InterfaceC8002t
        /* renamed from: z */
        public /* synthetic */ void mo32527z(C8636d c8636d) {
            C7982i.m34699d(this, c8636d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y7/o$c.class
     */
    /* renamed from: y7.o$c */
    /* loaded from: combined.jar:classes2.jar:y7/o$c.class */
    public interface c {
        /* renamed from: a */
        void mo18039a(C9865o c9865o, IOException iOException);

        /* renamed from: b */
        void mo18040b(C9865o c9865o);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y7/o$d.class
     */
    /* renamed from: y7.o$d */
    /* loaded from: combined.jar:classes2.jar:y7/o$d.class */
    public static final class d extends AbstractC9879c {

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:y7/o$d$a.class
         */
        /* renamed from: y7.o$d$a */
        /* loaded from: combined.jar:classes2.jar:y7/o$d$a.class */
        public static final class a implements InterfaceC9884h.b {
            public a() {
            }

            public /* synthetic */ a(a aVar) {
                this();
            }

            @Override // p421y8.InterfaceC9884h.b
            /* renamed from: a */
            public InterfaceC9884h[] mo41461a(InterfaceC9884h.a[] aVarArr, InterfaceC0840f interfaceC0840f, InterfaceC0127w.a aVar, AbstractC7574e2 abstractC7574e2) {
                InterfaceC9884h[] interfaceC9884hArr = new InterfaceC9884h[aVarArr.length];
                for (int i10 = 0; i10 < aVarArr.length; i10++) {
                    InterfaceC9884h.a aVar2 = aVarArr[i10];
                    interfaceC9884hArr[i10] = aVar2 == null ? null : new d(aVar2.f45445a, aVar2.f45446b);
                }
                return interfaceC9884hArr;
            }
        }

        public d(C0134z0 c0134z0, int[] iArr) {
            super(c0134z0, iArr);
        }

        @Override // p421y8.InterfaceC9884h
        /* renamed from: a */
        public int mo25051a() {
            return 0;
        }

        @Override // p421y8.InterfaceC9884h
        /* renamed from: h */
        public Object mo25052h() {
            return null;
        }

        @Override // p421y8.InterfaceC9884h
        /* renamed from: n */
        public void mo25053n(long j10, long j11, long j12, List<? extends AbstractC1028n> list, InterfaceC1029o[] interfaceC1029oArr) {
        }

        @Override // p421y8.InterfaceC9884h
        /* renamed from: r */
        public int mo25054r() {
            return 0;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y7/o$e.class
     */
    /* renamed from: y7.o$e */
    /* loaded from: combined.jar:classes2.jar:y7/o$e.class */
    public static final class e implements InterfaceC0840f {
        public e() {
        }

        public /* synthetic */ e(a aVar) {
            this();
        }

        @Override // p027b9.InterfaceC0840f
        /* renamed from: a */
        public void mo5338a(InterfaceC0840f.a aVar) {
        }

        @Override // p027b9.InterfaceC0840f
        /* renamed from: b */
        public /* synthetic */ long mo5339b() {
            return C0836d.m5309a(this);
        }

        @Override // p027b9.InterfaceC0840f
        /* renamed from: c */
        public void mo5340c(Handler handler, InterfaceC0840f.a aVar) {
        }

        @Override // p027b9.InterfaceC0840f
        /* renamed from: d */
        public InterfaceC0853l0 mo5341d() {
            return null;
        }

        @Override // p027b9.InterfaceC0840f
        /* renamed from: e */
        public long mo5342e() {
            return 0L;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y7/o$f.class
     */
    /* renamed from: y7.o$f */
    /* loaded from: combined.jar:classes2.jar:y7/o$f.class */
    public static class f extends IOException {
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y7/o$g.class
     */
    /* renamed from: y7.o$g */
    /* loaded from: combined.jar:classes2.jar:y7/o$g.class */
    public static final class g implements InterfaceC0127w.b, InterfaceC0121t.a, Handler.Callback {

        /* renamed from: b */
        public final InterfaceC0127w f45252b;

        /* renamed from: c */
        public final C9865o f45253c;

        /* renamed from: d */
        public final InterfaceC0832b f45254d = new C0859q(true, 65536);

        /* renamed from: e */
        public final ArrayList<InterfaceC0121t> f45255e = new ArrayList<>();

        /* renamed from: f */
        public final Handler f45256f = C4401z0.m22315B(new Handler.Callback(this) { // from class: y7.p

            /* renamed from: b */
            public final C9865o.g f45262b;

            {
                this.f45262b = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m41463d;
                m41463d = this.f45262b.m41463d(message);
                return m41463d;
            }
        });

        /* renamed from: g */
        public final HandlerThread f45257g;

        /* renamed from: h */
        public final Handler f45258h;

        /* renamed from: i */
        public AbstractC7574e2 f45259i;

        /* renamed from: j */
        public InterfaceC0121t[] f45260j;

        /* renamed from: k */
        public boolean f45261k;

        public g(InterfaceC0127w interfaceC0127w, C9865o c9865o) {
            this.f45252b = interfaceC0127w;
            this.f45253c = c9865o;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadHelper");
            this.f45257g = handlerThread;
            handlerThread.start();
            Handler m22419x = C4401z0.m22419x(handlerThread.getLooper(), this);
            this.f45258h = m22419x;
            m22419x.sendEmptyMessage(0);
        }

        @Override // p009a8.InterfaceC0127w.b
        /* renamed from: b */
        public void mo410b(InterfaceC0127w interfaceC0127w, AbstractC7574e2 abstractC7574e2) {
            InterfaceC0121t[] interfaceC0121tArr;
            if (this.f45259i != null) {
                return;
            }
            if (abstractC7574e2.m32666n(0, new AbstractC7574e2.c()).m32694f()) {
                this.f45256f.obtainMessage(1, new f()).sendToTarget();
                return;
            }
            this.f45259i = abstractC7574e2;
            this.f45260j = new InterfaceC0121t[abstractC7574e2.mo509i()];
            int i10 = 0;
            while (true) {
                interfaceC0121tArr = this.f45260j;
                if (i10 >= interfaceC0121tArr.length) {
                    break;
                }
                InterfaceC0121t mo401h = this.f45252b.mo401h(new InterfaceC0127w.a(abstractC7574e2.mo511m(i10)), this.f45254d, 0L);
                this.f45260j[i10] = mo401h;
                this.f45255e.add(mo401h);
                i10++;
            }
            for (InterfaceC0121t interfaceC0121t : interfaceC0121tArr) {
                interfaceC0121t.mo345l(this, 0L);
            }
        }

        /* renamed from: d */
        public final boolean m41463d(Message message) {
            if (this.f45261k) {
                return false;
            }
            int i10 = message.what;
            if (i10 == 0) {
                this.f45253c.m41448D();
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            m41465f();
            this.f45253c.m41447C((IOException) C4401z0.m22391j(message.obj));
            return true;
        }

        @Override // p009a8.InterfaceC0122t0.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo334a(InterfaceC0121t interfaceC0121t) {
            if (this.f45255e.contains(interfaceC0121t)) {
                this.f45258h.obtainMessage(2, interfaceC0121t).sendToTarget();
            }
        }

        /* renamed from: f */
        public void m41465f() {
            if (this.f45261k) {
                return;
            }
            this.f45261k = true;
            this.f45258h.sendEmptyMessage(3);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                this.f45252b.mo306a(this, null);
                this.f45258h.sendEmptyMessage(1);
                return true;
            }
            if (i10 == 1) {
                try {
                    if (this.f45260j == null) {
                        this.f45252b.mo402m();
                    } else {
                        for (int i11 = 0; i11 < this.f45255e.size(); i11++) {
                            this.f45255e.get(i11).mo350s();
                        }
                    }
                    this.f45258h.sendEmptyMessageDelayed(1, 100L);
                    return true;
                } catch (IOException e10) {
                    this.f45256f.obtainMessage(1, e10).sendToTarget();
                    return true;
                }
            }
            if (i10 == 2) {
                InterfaceC0121t interfaceC0121t = (InterfaceC0121t) message.obj;
                if (!this.f45255e.contains(interfaceC0121t)) {
                    return true;
                }
                interfaceC0121t.mo337d(0L);
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            InterfaceC0121t[] interfaceC0121tArr = this.f45260j;
            if (interfaceC0121tArr != null) {
                for (InterfaceC0121t interfaceC0121t2 : interfaceC0121tArr) {
                    this.f45252b.mo403q(interfaceC0121t2);
                }
            }
            this.f45252b.mo311i(this);
            this.f45258h.removeCallbacksAndMessages(null);
            this.f45257g.quit();
            return true;
        }

        @Override // p009a8.InterfaceC0121t.a
        /* renamed from: k */
        public void mo344k(InterfaceC0121t interfaceC0121t) {
            this.f45255e.remove(interfaceC0121t);
            if (this.f45255e.isEmpty()) {
                this.f45258h.removeMessages(1);
                this.f45256f.sendEmptyMessage(0);
            }
        }
    }

    static {
        C9882f.d mo41689w = C9882f.d.f45397M.m41657m().m41683U(true).mo41689w();
        f45235o = mo41689w;
        f45236p = mo41689w;
        f45237q = mo41689w;
    }

    public C9865o(C7561b1 c7561b1, InterfaceC0127w interfaceC0127w, C9882f.d dVar, InterfaceC7633x1[] interfaceC7633x1Arr) {
        this.f45238a = (C7561b1.g) C4349a.m21882e(c7561b1.f36449b);
        this.f45239b = interfaceC0127w;
        C9882f c9882f = new C9882f(dVar, new d.a(null));
        this.f45240c = c9882f;
        this.f45241d = interfaceC7633x1Arr;
        this.f45242e = new SparseIntArray();
        c9882f.m41746b(new AbstractC9891o.a() { // from class: y7.i
            @Override // p421y8.AbstractC9891o.a
            /* renamed from: b */
            public final void mo33088b() {
                C9865o.m41445y();
            }
        }, new e(null));
        this.f45243f = C4401z0.m22313A();
        this.f45244g = new AbstractC7574e2.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m41427A() {
        ((c) C4349a.m21882e(this.f45246i)).mo18040b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m41428B(c cVar) {
        cVar.mo18040b(this);
    }

    /* renamed from: m */
    public static InterfaceC0127w m41437m(C7561b1 c7561b1, InterfaceC0854m.a aVar, InterfaceC9292z interfaceC9292z) {
        return new C0103k(aVar, InterfaceC4329l.f26484a).mo408b(interfaceC9292z).mo409c(c7561b1);
    }

    /* renamed from: n */
    public static C9865o m41438n(Context context, C7561b1 c7561b1, InterfaceC7639z1 interfaceC7639z1, InterfaceC0854m.a aVar) {
        return m41439o(c7561b1, m41440p(context), interfaceC7639z1, aVar, null);
    }

    /* renamed from: o */
    public static C9865o m41439o(C7561b1 c7561b1, C9882f.d dVar, InterfaceC7639z1 interfaceC7639z1, InterfaceC0854m.a aVar, InterfaceC9292z interfaceC9292z) {
        boolean m41442v = m41442v((C7561b1.g) C4349a.m21882e(c7561b1.f36449b));
        C4349a.m21878a(m41442v || aVar != null);
        return new C9865o(c7561b1, m41442v ? null : m41437m(c7561b1, (InterfaceC0854m.a) C4401z0.m22391j(aVar), interfaceC9292z), dVar, interfaceC7639z1 != null ? m41441u(interfaceC7639z1) : new InterfaceC7633x1[0]);
    }

    /* renamed from: p */
    public static C9882f.d m41440p(Context context) {
        return C9882f.d.m41654n(context).m41657m().m41683U(true).mo41689w();
    }

    /* renamed from: u */
    public static InterfaceC7633x1[] m41441u(InterfaceC7639z1 interfaceC7639z1) {
        InterfaceC7627v1[] mo32854a = interfaceC7639z1.mo32854a(C4401z0.m22313A(), new a(), new b(), new InterfaceC6929k() { // from class: y7.j
            @Override // p243o8.InterfaceC6929k
            /* renamed from: E */
            public final void mo12517E(List list) {
                C9865o.m41443w(list);
            }
        }, new InterfaceC7844f() { // from class: y7.k
            @Override // p283q7.InterfaceC7844f
            /* renamed from: L */
            public final void mo12519L(C7839a c7839a) {
                C9865o.m41444x(c7839a);
            }
        });
        InterfaceC7633x1[] interfaceC7633x1Arr = new InterfaceC7633x1[mo32854a.length];
        for (int i10 = 0; i10 < mo32854a.length; i10++) {
            interfaceC7633x1Arr[i10] = mo32854a[i10].mo32706m();
        }
        return interfaceC7633x1Arr;
    }

    /* renamed from: v */
    public static boolean m41442v(C7561b1.g gVar) {
        return C4401z0.m22404p0(gVar.f36504a, gVar.f36505b) == 4;
    }

    /* renamed from: w */
    public static /* synthetic */ void m41443w(List list) {
    }

    /* renamed from: x */
    public static /* synthetic */ void m41444x(C7839a c7839a) {
    }

    /* renamed from: y */
    public static /* synthetic */ void m41445y() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m41446z(IOException iOException) {
        ((c) C4349a.m21882e(this.f45246i)).mo18039a(this, iOException);
    }

    /* renamed from: C */
    public final void m41447C(final IOException iOException) {
        ((Handler) C4349a.m21882e(this.f45243f)).post(new Runnable(this, iOException) { // from class: y7.m

            /* renamed from: b */
            public final C9865o f45232b;

            /* renamed from: c */
            public final IOException f45233c;

            {
                this.f45232b = this;
                this.f45233c = iOException;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f45232b.m41446z(this.f45233c);
            }
        });
    }

    /* renamed from: D */
    public final void m41448D() {
        C4349a.m21882e(this.f45247j);
        C4349a.m21882e(this.f45247j.f45260j);
        C4349a.m21882e(this.f45247j.f45259i);
        int length = this.f45247j.f45260j.length;
        int length2 = this.f45241d.length;
        this.f45250m = new List[length][length2];
        this.f45251n = new List[length][length2];
        for (int i10 = 0; i10 < length; i10++) {
            for (int i11 = 0; i11 < length2; i11++) {
                this.f45250m[i10][i11] = new ArrayList();
                this.f45251n[i10][i11] = Collections.unmodifiableList(this.f45250m[i10][i11]);
            }
        }
        this.f45248k = new C0083a1[length];
        this.f45249l = new AbstractC9886j.a[length];
        for (int i12 = 0; i12 < length; i12++) {
            this.f45248k[i12] = this.f45247j.f45260j[i12].mo352v();
            this.f45240c.mo41703d(m41451G(i12).f45512d);
            this.f45249l[i12] = (AbstractC9886j.a) C4349a.m21882e(this.f45240c.m41705g());
        }
        m41452H();
        ((Handler) C4349a.m21882e(this.f45243f)).post(new Runnable(this) { // from class: y7.n

            /* renamed from: b */
            public final C9865o f45234b;

            {
                this.f45234b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f45234b.m41427A();
            }
        });
    }

    /* renamed from: E */
    public void m41449E(final c cVar) {
        C4349a.m21884g(this.f45246i == null);
        this.f45246i = cVar;
        InterfaceC0127w interfaceC0127w = this.f45239b;
        if (interfaceC0127w != null) {
            this.f45247j = new g(interfaceC0127w, this);
        } else {
            this.f45243f.post(new Runnable(this, cVar) { // from class: y7.l

                /* renamed from: b */
                public final C9865o f45230b;

                /* renamed from: c */
                public final C9865o.c f45231c;

                {
                    this.f45230b = this;
                    this.f45231c = cVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f45230b.m41428B(this.f45231c);
                }
            });
        }
    }

    /* renamed from: F */
    public void m41450F() {
        g gVar = this.f45247j;
        if (gVar != null) {
            gVar.m41465f();
        }
    }

    @RequiresNonNull({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    /* renamed from: G */
    public final C9892p m41451G(int i10) {
        boolean z10;
        try {
            C9892p mo41704e = this.f45240c.mo41704e(this.f45241d, this.f45248k[i10], new InterfaceC0127w.a(this.f45247j.f45259i.mo511m(i10)), this.f45247j.f45259i);
            for (int i11 = 0; i11 < mo41704e.f45509a; i11++) {
                InterfaceC9884h interfaceC9884h = mo41704e.f45511c[i11];
                if (interfaceC9884h != null) {
                    List<InterfaceC9884h> list = this.f45250m[i10][i11];
                    int i12 = 0;
                    while (true) {
                        if (i12 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        InterfaceC9884h interfaceC9884h2 = list.get(i12);
                        if (interfaceC9884h2.mo41612l() == interfaceC9884h.mo41612l()) {
                            this.f45242e.clear();
                            for (int i13 = 0; i13 < interfaceC9884h2.length(); i13++) {
                                this.f45242e.put(interfaceC9884h2.mo41608f(i13), 0);
                            }
                            for (int i14 = 0; i14 < interfaceC9884h.length(); i14++) {
                                this.f45242e.put(interfaceC9884h.mo41608f(i14), 0);
                            }
                            int[] iArr = new int[this.f45242e.size()];
                            for (int i15 = 0; i15 < this.f45242e.size(); i15++) {
                                iArr[i15] = this.f45242e.keyAt(i15);
                            }
                            list.set(i12, new d(interfaceC9884h2.mo41612l(), iArr));
                            z10 = true;
                        } else {
                            i12++;
                        }
                    }
                    if (!z10) {
                        list.add(interfaceC9884h);
                    }
                }
            }
            return mo41704e;
        } catch (C7607p e10) {
            throw new UnsupportedOperationException(e10);
        }
    }

    @RequiresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    /* renamed from: H */
    public final void m41452H() {
        this.f45245h = true;
    }

    /* renamed from: i */
    public void m41453i(int i10, C9882f.d dVar) {
        m41455k();
        this.f45240c.m41643L(dVar);
        m41451G(i10);
    }

    /* renamed from: j */
    public void m41454j(int i10, int i11, C9882f.d dVar, List<C9882f.f> list) {
        m41455k();
        C9882f.e m41657m = dVar.m41657m();
        int i12 = 0;
        while (i12 < this.f45249l[i10].m41708c()) {
            m41657m.m41685W(i12, i12 != i11);
            i12++;
        }
        if (list.isEmpty()) {
            m41453i(i10, m41657m.mo41689w());
            return;
        }
        C0083a1 m41712g = this.f45249l[i10].m41712g(i11);
        for (int i13 = 0; i13 < list.size(); i13++) {
            m41657m.m41686X(i11, m41712g, list.get(i13));
            m41453i(i10, m41657m.mo41689w());
        }
    }

    @EnsuresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    /* renamed from: k */
    public final void m41455k() {
        C4349a.m21884g(this.f45245h);
    }

    /* renamed from: l */
    public void m41456l(int i10) {
        m41455k();
        for (int i11 = 0; i11 < this.f45241d.length; i11++) {
            this.f45250m[i10][i11].clear();
        }
    }

    /* renamed from: q */
    public C9874x m41457q(String str, byte[] bArr) {
        C9874x.b m41543e = new C9874x.b(str, this.f45238a.f36504a).m41543e(this.f45238a.f36505b);
        C7561b1.e eVar = this.f45238a.f36506c;
        C9874x.b m41541c = m41543e.m41542d(eVar != null ? eVar.m32376a() : null).m41540b(this.f45238a.f36509f).m41541c(bArr);
        if (this.f45239b == null) {
            return m41541c.m41539a();
        }
        m41455k();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = this.f45250m.length;
        for (int i10 = 0; i10 < length; i10++) {
            arrayList2.clear();
            int length2 = this.f45250m[i10].length;
            for (int i11 = 0; i11 < length2; i11++) {
                arrayList2.addAll(this.f45250m[i10][i11]);
            }
            arrayList.addAll(this.f45247j.f45260j[i10].mo342i(arrayList2));
        }
        return m41541c.m41544f(arrayList).m41539a();
    }

    /* renamed from: r */
    public C9874x m41458r(byte[] bArr) {
        return m41457q(this.f45238a.f36504a.toString(), bArr);
    }

    /* renamed from: s */
    public AbstractC9886j.a m41459s(int i10) {
        m41455k();
        return this.f45249l[i10];
    }

    /* renamed from: t */
    public int m41460t() {
        if (this.f45239b == null) {
            return 0;
        }
        m41455k();
        return this.f45248k.length;
    }
}
