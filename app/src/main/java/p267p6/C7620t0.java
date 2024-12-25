package p267p6;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import ec.InterfaceC4712o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p009a8.C0083a1;
import p009a8.C0084b;
import p009a8.InterfaceC0120s0;
import p009a8.InterfaceC0121t;
import p009a8.InterfaceC0124u0;
import p009a8.InterfaceC0127w;
import p027b9.C0856n;
import p027b9.InterfaceC0840f;
import p059d9.C4349a;
import p059d9.C4392v;
import p059d9.C4401z0;
import p059d9.InterfaceC4354c;
import p059d9.InterfaceC4380p;
import p099fc.AbstractC4834t;
import p243o8.C6930l;
import p267p6.AbstractC7574e2;
import p267p6.C7561b1;
import p267p6.C7591j1;
import p267p6.C7598m;
import p267p6.C7615r1;
import p267p6.InterfaceC7627v1;
import p282q6.C7800h1;
import p283q7.C7839a;
import p365v6.InterfaceC9277p;
import p421y8.AbstractC9891o;
import p421y8.C9892p;
import p421y8.InterfaceC9884h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/t0.class
 */
/* renamed from: p6.t0 */
/* loaded from: combined.jar:classes2.jar:p6/t0.class */
public final class C7620t0 implements Handler.Callback, InterfaceC0121t.a, AbstractC9891o.a, C7591j1.d, C7598m.a, C7615r1.a {

    /* renamed from: A */
    public boolean f36990A;

    /* renamed from: B */
    public boolean f36991B;

    /* renamed from: C */
    public boolean f36992C;

    /* renamed from: D */
    public boolean f36993D;

    /* renamed from: E */
    public int f36994E;

    /* renamed from: F */
    public boolean f36995F;

    /* renamed from: G */
    public boolean f36996G;

    /* renamed from: H */
    public boolean f36997H;

    /* renamed from: I */
    public boolean f36998I;

    /* renamed from: J */
    public int f36999J;

    /* renamed from: K */
    public h f37000K;

    /* renamed from: L */
    public long f37001L;

    /* renamed from: M */
    public int f37002M;

    /* renamed from: N */
    public boolean f37003N;

    /* renamed from: O */
    public C7607p f37004O;

    /* renamed from: P */
    public long f37005P;

    /* renamed from: b */
    public final InterfaceC7627v1[] f37006b;

    /* renamed from: c */
    public final InterfaceC7633x1[] f37007c;

    /* renamed from: d */
    public final AbstractC9891o f37008d;

    /* renamed from: e */
    public final C9892p f37009e;

    /* renamed from: f */
    public final InterfaceC7557a1 f37010f;

    /* renamed from: g */
    public final InterfaceC0840f f37011g;

    /* renamed from: h */
    public final InterfaceC4380p f37012h;

    /* renamed from: i */
    public final HandlerThread f37013i;

    /* renamed from: j */
    public final Looper f37014j;

    /* renamed from: k */
    public final AbstractC7574e2.c f37015k;

    /* renamed from: l */
    public final AbstractC7574e2.b f37016l;

    /* renamed from: m */
    public final long f37017m;

    /* renamed from: n */
    public final boolean f37018n;

    /* renamed from: o */
    public final C7598m f37019o;

    /* renamed from: p */
    public final ArrayList<d> f37020p;

    /* renamed from: q */
    public final InterfaceC4354c f37021q;

    /* renamed from: r */
    public final f f37022r;

    /* renamed from: s */
    public final C7581g1 f37023s;

    /* renamed from: t */
    public final C7591j1 f37024t;

    /* renamed from: u */
    public final InterfaceC7638z0 f37025u;

    /* renamed from: v */
    public final long f37026v;

    /* renamed from: w */
    public C7558a2 f37027w;

    /* renamed from: x */
    public C7600m1 f37028x;

    /* renamed from: y */
    public e f37029y;

    /* renamed from: z */
    public boolean f37030z;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/t0$a.class
     */
    /* renamed from: p6.t0$a */
    /* loaded from: combined.jar:classes2.jar:p6/t0$a.class */
    public class a implements InterfaceC7627v1.a {

        /* renamed from: a */
        public final C7620t0 f37031a;

        public a(C7620t0 c7620t0) {
            this.f37031a = c7620t0;
        }

        @Override // p267p6.InterfaceC7627v1.a
        /* renamed from: a */
        public void mo33139a() {
            this.f37031a.f37012h.mo22203i(2);
        }

        @Override // p267p6.InterfaceC7627v1.a
        /* renamed from: b */
        public void mo33140b(long j10) {
            if (j10 >= 2000) {
                this.f37031a.f36997H = true;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/t0$b.class
     */
    /* renamed from: p6.t0$b */
    /* loaded from: combined.jar:classes2.jar:p6/t0$b.class */
    public static final class b {

        /* renamed from: a */
        public final List<C7591j1.c> f37032a;

        /* renamed from: b */
        public final InterfaceC0124u0 f37033b;

        /* renamed from: c */
        public final int f37034c;

        /* renamed from: d */
        public final long f37035d;

        public b(List<C7591j1.c> list, InterfaceC0124u0 interfaceC0124u0, int i10, long j10) {
            this.f37032a = list;
            this.f37033b = interfaceC0124u0;
            this.f37034c = i10;
            this.f37035d = j10;
        }

        public /* synthetic */ b(List list, InterfaceC0124u0 interfaceC0124u0, int i10, long j10, a aVar) {
            this(list, interfaceC0124u0, i10, j10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/t0$c.class
     */
    /* renamed from: p6.t0$c */
    /* loaded from: combined.jar:classes2.jar:p6/t0$c.class */
    public static class c {

        /* renamed from: a */
        public final int f37036a;

        /* renamed from: b */
        public final int f37037b;

        /* renamed from: c */
        public final int f37038c;

        /* renamed from: d */
        public final InterfaceC0124u0 f37039d;
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/t0$d.class
     */
    /* renamed from: p6.t0$d */
    /* loaded from: combined.jar:classes2.jar:p6/t0$d.class */
    public static final class d implements Comparable<d> {

        /* renamed from: b */
        public final C7615r1 f37040b;

        /* renamed from: c */
        public int f37041c;

        /* renamed from: d */
        public long f37042d;

        /* renamed from: e */
        public Object f37043e;

        public d(C7615r1 c7615r1) {
            this.f37040b = c7615r1;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f37043e;
            if ((obj == null) != (dVar.f37043e == null)) {
                int i10 = 1;
                if (obj != null) {
                    i10 = -1;
                }
                return i10;
            }
            if (obj == null) {
                return 0;
            }
            int i11 = this.f37041c - dVar.f37041c;
            return i11 != 0 ? i11 : C4401z0.m22405q(this.f37042d, dVar.f37042d);
        }

        /* renamed from: b */
        public void m33146b(int i10, long j10, Object obj) {
            this.f37041c = i10;
            this.f37042d = j10;
            this.f37043e = obj;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/t0$e.class
     */
    /* renamed from: p6.t0$e */
    /* loaded from: combined.jar:classes2.jar:p6/t0$e.class */
    public static final class e {

        /* renamed from: a */
        public boolean f37044a;

        /* renamed from: b */
        public C7600m1 f37045b;

        /* renamed from: c */
        public int f37046c;

        /* renamed from: d */
        public boolean f37047d;

        /* renamed from: e */
        public int f37048e;

        /* renamed from: f */
        public boolean f37049f;

        /* renamed from: g */
        public int f37050g;

        public e(C7600m1 c7600m1) {
            this.f37045b = c7600m1;
        }

        /* renamed from: b */
        public void m33148b(int i10) {
            this.f37044a |= i10 > 0;
            this.f37046c += i10;
        }

        /* renamed from: c */
        public void m33149c(int i10) {
            this.f37044a = true;
            this.f37049f = true;
            this.f37050g = i10;
        }

        /* renamed from: d */
        public void m33150d(C7600m1 c7600m1) {
            this.f37044a |= this.f37045b != c7600m1;
            this.f37045b = c7600m1;
        }

        /* renamed from: e */
        public void m33151e(int i10) {
            boolean z10 = true;
            if (!this.f37047d || this.f37048e == 5) {
                this.f37044a = true;
                this.f37047d = true;
                this.f37048e = i10;
            } else {
                if (i10 != 5) {
                    z10 = false;
                }
                C4349a.m21878a(z10);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/t0$f.class
     */
    /* renamed from: p6.t0$f */
    /* loaded from: combined.jar:classes2.jar:p6/t0$f.class */
    public interface f {
        /* renamed from: a */
        void mo32716a(e eVar);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/t0$g.class
     */
    /* renamed from: p6.t0$g */
    /* loaded from: combined.jar:classes2.jar:p6/t0$g.class */
    public static final class g {

        /* renamed from: a */
        public final InterfaceC0127w.a f37051a;

        /* renamed from: b */
        public final long f37052b;

        /* renamed from: c */
        public final long f37053c;

        /* renamed from: d */
        public final boolean f37054d;

        /* renamed from: e */
        public final boolean f37055e;

        /* renamed from: f */
        public final boolean f37056f;

        public g(InterfaceC0127w.a aVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f37051a = aVar;
            this.f37052b = j10;
            this.f37053c = j11;
            this.f37054d = z10;
            this.f37055e = z11;
            this.f37056f = z12;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/t0$h.class
     */
    /* renamed from: p6.t0$h */
    /* loaded from: combined.jar:classes2.jar:p6/t0$h.class */
    public static final class h {

        /* renamed from: a */
        public final AbstractC7574e2 f37057a;

        /* renamed from: b */
        public final int f37058b;

        /* renamed from: c */
        public final long f37059c;

        public h(AbstractC7574e2 abstractC7574e2, int i10, long j10) {
            this.f37057a = abstractC7574e2;
            this.f37058b = i10;
            this.f37059c = j10;
        }
    }

    public C7620t0(InterfaceC7627v1[] interfaceC7627v1Arr, AbstractC9891o abstractC9891o, C9892p c9892p, InterfaceC7557a1 interfaceC7557a1, InterfaceC0840f interfaceC0840f, int i10, boolean z10, C7800h1 c7800h1, C7558a2 c7558a2, InterfaceC7638z0 interfaceC7638z0, long j10, boolean z11, Looper looper, InterfaceC4354c interfaceC4354c, f fVar) {
        this.f37022r = fVar;
        this.f37006b = interfaceC7627v1Arr;
        this.f37008d = abstractC9891o;
        this.f37009e = c9892p;
        this.f37010f = interfaceC7557a1;
        this.f37011g = interfaceC0840f;
        this.f36994E = i10;
        this.f36995F = z10;
        this.f37027w = c7558a2;
        this.f37025u = interfaceC7638z0;
        this.f37026v = j10;
        this.f37005P = j10;
        this.f36990A = z11;
        this.f37021q = interfaceC4354c;
        this.f37017m = interfaceC7557a1.mo32333b();
        this.f37018n = interfaceC7557a1.mo32332a();
        C7600m1 m32842k = C7600m1.m32842k(c9892p);
        this.f37028x = m32842k;
        this.f37029y = new e(m32842k);
        this.f37007c = new InterfaceC7633x1[interfaceC7627v1Arr.length];
        for (int i11 = 0; i11 < interfaceC7627v1Arr.length; i11++) {
            interfaceC7627v1Arr[i11].setIndex(i11);
            this.f37007c[i11] = interfaceC7627v1Arr[i11].mo32706m();
        }
        this.f37019o = new C7598m(this, interfaceC4354c);
        this.f37020p = new ArrayList<>();
        this.f37015k = new AbstractC7574e2.c();
        this.f37016l = new AbstractC7574e2.b();
        abstractC9891o.m41746b(this, interfaceC0840f);
        this.f37003N = true;
        Handler handler = new Handler(looper);
        this.f37023s = new C7581g1(c7800h1, handler);
        this.f37024t = new C7591j1(this, c7800h1, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f37013i = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f37014j = looper2;
        this.f37012h = interfaceC4354c.mo21915d(looper2, this);
    }

    /* renamed from: Q */
    public static boolean m33024Q(InterfaceC7627v1 interfaceC7627v1) {
        return interfaceC7627v1.getState() != 0;
    }

    /* renamed from: S */
    public static boolean m33025S(C7600m1 c7600m1, AbstractC7574e2.b bVar) {
        InterfaceC0127w.a aVar = c7600m1.f36865b;
        AbstractC7574e2 abstractC7574e2 = c7600m1.f36864a;
        return abstractC7574e2.m32667q() || abstractC7574e2.mo32326h(aVar.f544a, bVar).f36714f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ Boolean m33026T() {
        return Boolean.valueOf(this.f37030z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ void m33027U(C7615r1 c7615r1) {
        try {
            m33116n(c7615r1);
        } catch (C7607p e10) {
            C4392v.m22271e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: u0 */
    public static void m33032u0(AbstractC7574e2 abstractC7574e2, d dVar, AbstractC7574e2.c cVar, AbstractC7574e2.b bVar) {
        int i10 = abstractC7574e2.m32666n(abstractC7574e2.mo32326h(dVar.f37043e, bVar).f36711c, cVar).f36735p;
        Object obj = abstractC7574e2.mo404g(i10, bVar, true).f36710b;
        long j10 = bVar.f36712d;
        dVar.m33146b(i10, j10 != -9223372036854775807L ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    /* renamed from: v0 */
    public static boolean m33033v0(d dVar, AbstractC7574e2 abstractC7574e2, AbstractC7574e2 abstractC7574e22, int i10, boolean z10, AbstractC7574e2.c cVar, AbstractC7574e2.b bVar) {
        Object obj = dVar.f37043e;
        if (obj == null) {
            Pair<Object, Long> m33036y0 = m33036y0(abstractC7574e2, new h(dVar.f37040b.m33014g(), dVar.f37040b.m33016i(), dVar.f37040b.m33012e() == Long.MIN_VALUE ? -9223372036854775807L : C7583h.m32760d(dVar.f37040b.m33012e())), false, i10, z10, cVar, bVar);
            if (m33036y0 == null) {
                return false;
            }
            dVar.m33146b(abstractC7574e2.mo506b(m33036y0.first), ((Long) m33036y0.second).longValue(), m33036y0.first);
            if (dVar.f37040b.m33012e() != Long.MIN_VALUE) {
                return true;
            }
            m33032u0(abstractC7574e2, dVar, cVar, bVar);
            return true;
        }
        int mo506b = abstractC7574e2.mo506b(obj);
        if (mo506b == -1) {
            return false;
        }
        if (dVar.f37040b.m33012e() == Long.MIN_VALUE) {
            m33032u0(abstractC7574e2, dVar, cVar, bVar);
            return true;
        }
        dVar.f37041c = mo506b;
        abstractC7574e22.mo32326h(dVar.f37043e, bVar);
        if (!bVar.f36714f || abstractC7574e22.m32666n(bVar.f36711c, cVar).f36734o != abstractC7574e22.mo506b(dVar.f37043e)) {
            return true;
        }
        Pair<Object, Long> m32664j = abstractC7574e2.m32664j(cVar, bVar, abstractC7574e2.mo32326h(dVar.f37043e, bVar).f36711c, dVar.f37042d + bVar.m32683o());
        dVar.m33146b(abstractC7574e2.mo506b(m32664j.first), ((Long) m32664j.second).longValue(), m32664j.first);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x02d5, code lost:
    
        if (r18.m32686r(r0.f545b) != false) goto L88;
     */
    /* renamed from: x0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p267p6.C7620t0.g m33034x0(p267p6.AbstractC7574e2 r11, p267p6.C7600m1 r12, p267p6.C7620t0.h r13, p267p6.C7581g1 r14, int r15, boolean r16, p267p6.AbstractC7574e2.c r17, p267p6.AbstractC7574e2.b r18) {
        /*
            Method dump skipped, instructions count: 832
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p267p6.C7620t0.m33034x0(p6.e2, p6.m1, p6.t0$h, p6.g1, int, boolean, p6.e2$c, p6.e2$b):p6.t0$g");
    }

    /* renamed from: y */
    public static C7629w0[] m33035y(InterfaceC9884h interfaceC9884h) {
        int length = interfaceC9884h != null ? interfaceC9884h.length() : 0;
        C7629w0[] c7629w0Arr = new C7629w0[length];
        for (int i10 = 0; i10 < length; i10++) {
            c7629w0Arr[i10] = interfaceC9884h.mo41607e(i10);
        }
        return c7629w0Arr;
    }

    /* renamed from: y0 */
    public static Pair<Object, Long> m33036y0(AbstractC7574e2 abstractC7574e2, h hVar, boolean z10, int i10, boolean z11, AbstractC7574e2.c cVar, AbstractC7574e2.b bVar) {
        Object m33037z0;
        AbstractC7574e2 abstractC7574e22 = hVar.f37057a;
        if (abstractC7574e2.m32667q()) {
            return null;
        }
        if (abstractC7574e22.m32667q()) {
            abstractC7574e22 = abstractC7574e2;
        }
        try {
            Pair<Object, Long> m32664j = abstractC7574e22.m32664j(cVar, bVar, hVar.f37058b, hVar.f37059c);
            if (abstractC7574e2.equals(abstractC7574e22)) {
                return m32664j;
            }
            if (abstractC7574e2.mo506b(m32664j.first) == -1) {
                if (!z10 || (m33037z0 = m33037z0(cVar, bVar, i10, z11, m32664j.first, abstractC7574e22, abstractC7574e2)) == null) {
                    return null;
                }
                return abstractC7574e2.m32664j(cVar, bVar, abstractC7574e2.mo32326h(m33037z0, bVar).f36711c, -9223372036854775807L);
            }
            Pair<Object, Long> pair = m32664j;
            if (abstractC7574e22.mo32326h(m32664j.first, bVar).f36714f) {
                pair = m32664j;
                if (abstractC7574e22.m32666n(bVar.f36711c, cVar).f36734o == abstractC7574e22.mo506b(m32664j.first)) {
                    pair = abstractC7574e2.m32664j(cVar, bVar, abstractC7574e2.mo32326h(m32664j.first, bVar).f36711c, hVar.f37059c);
                }
            }
            return pair;
        } catch (IndexOutOfBoundsException e10) {
            return null;
        }
    }

    /* renamed from: z0 */
    public static Object m33037z0(AbstractC7574e2.c cVar, AbstractC7574e2.b bVar, int i10, boolean z10, Object obj, AbstractC7574e2 abstractC7574e2, AbstractC7574e2 abstractC7574e22) {
        int mo506b = abstractC7574e2.mo506b(obj);
        int mo509i = abstractC7574e2.mo509i();
        int i11 = -1;
        for (int i12 = 0; i12 < mo509i && i11 == -1; i12++) {
            mo506b = abstractC7574e2.m32662d(mo506b, bVar, cVar, i10, z10);
            if (mo506b == -1) {
                break;
            }
            i11 = abstractC7574e22.mo506b(abstractC7574e2.mo511m(mo506b));
        }
        return i11 == -1 ? null : abstractC7574e22.mo511m(i11);
    }

    /* renamed from: A */
    public final long m33038A() {
        C7569d1 m32745q = this.f37023s.m32745q();
        if (m32745q == null) {
            return 0L;
        }
        long m32623l = m32745q.m32623l();
        if (!m32745q.f36682d) {
            return m32623l;
        }
        int i10 = 0;
        while (true) {
            InterfaceC7627v1[] interfaceC7627v1Arr = this.f37006b;
            if (i10 >= interfaceC7627v1Arr.length) {
                return m32623l;
            }
            long j10 = m32623l;
            if (m33024Q(interfaceC7627v1Arr[i10])) {
                if (this.f37006b[i10].mo32707r() != m32745q.f36681c[i10]) {
                    j10 = m32623l;
                } else {
                    long mo32708s = this.f37006b[i10].mo32708s();
                    if (mo32708s == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j10 = Math.max(mo32708s, m32623l);
                }
            }
            i10++;
            m32623l = j10;
        }
    }

    /* renamed from: A0 */
    public final void m33039A0(long j10, long j11) {
        this.f37012h.mo22205k(2);
        this.f37012h.mo22204j(2, j10 + j11);
    }

    /* renamed from: B */
    public final Pair<InterfaceC0127w.a, Long> m33040B(AbstractC7574e2 abstractC7574e2) {
        if (abstractC7574e2.m32667q()) {
            return Pair.create(C7600m1.m32843l(), 0L);
        }
        Pair<Object, Long> m32664j = abstractC7574e2.m32664j(this.f37015k, this.f37016l, abstractC7574e2.mo505a(this.f36995F), -9223372036854775807L);
        InterfaceC0127w.a m32723A = this.f37023s.m32723A(abstractC7574e2, m32664j.first, 0L);
        long longValue = ((Long) m32664j.second).longValue();
        if (m32723A.m630b()) {
            abstractC7574e2.mo32326h(m32723A.f544a, this.f37016l);
            longValue = 0;
            if (m32723A.f546c == this.f37016l.m32680l(m32723A.f545b)) {
                longValue = this.f37016l.m32675g();
            }
        }
        return Pair.create(m32723A, Long.valueOf(longValue));
    }

    /* renamed from: B0 */
    public void m33041B0(AbstractC7574e2 abstractC7574e2, int i10, long j10) {
        this.f37012h.mo22199e(3, new h(abstractC7574e2, i10, j10)).mo22206a();
    }

    /* renamed from: C */
    public Looper m33042C() {
        return this.f37014j;
    }

    /* renamed from: C0 */
    public final void m33043C0(boolean z10) {
        InterfaceC0127w.a aVar = this.f37023s.m32744p().f36684f.f36697a;
        long m33049F0 = m33049F0(aVar, this.f37028x.f36882s, true, false);
        if (m33049F0 != this.f37028x.f36882s) {
            C7600m1 c7600m1 = this.f37028x;
            this.f37028x = m33062M(aVar, m33049F0, c7600m1.f36866c, c7600m1.f36867d, z10, 5);
        }
    }

    /* renamed from: D */
    public final long m33044D() {
        return m33046E(this.f37028x.f36880q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01b8, code lost:
    
        if (r0 == 3) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0123 A[Catch: all -> 0x0247, TRY_LEAVE, TryCatch #0 {all -> 0x0247, blocks: (B:6:0x0116, B:8:0x0123, B:15:0x0130, B:17:0x013b, B:19:0x0141, B:20:0x014b, B:22:0x015a, B:24:0x0166, B:29:0x0174, B:31:0x0190, B:33:0x01a3, B:38:0x01bb, B:41:0x01d9, B:45:0x01ed), top: B:5:0x0116 }] */
    /* renamed from: D0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m33045D0(p267p6.C7620t0.h r13) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p267p6.C7620t0.m33045D0(p6.t0$h):void");
    }

    /* renamed from: E */
    public final long m33046E(long j10) {
        C7569d1 m32738j = this.f37023s.m32738j();
        if (m32738j == null) {
            return 0L;
        }
        return Math.max(0L, j10 - m32738j.m32635y(this.f37001L));
    }

    /* renamed from: E0 */
    public final long m33047E0(InterfaceC0127w.a aVar, long j10, boolean z10) {
        return m33049F0(aVar, j10, this.f37023s.m32744p() != this.f37023s.m32745q(), z10);
    }

    /* renamed from: F */
    public final void m33048F(InterfaceC0121t interfaceC0121t) {
        if (this.f37023s.m32750v(interfaceC0121t)) {
            this.f37023s.m32752y(this.f37001L);
            m33076V();
        }
    }

    /* renamed from: F0 */
    public final long m33049F0(InterfaceC0127w.a aVar, long j10, boolean z10, boolean z11) {
        C7569d1 c7569d1;
        m33107j1();
        this.f36992C = false;
        if (z11 || this.f37028x.f36868e == 3) {
            m33087a1(2);
        }
        C7569d1 m32744p = this.f37023s.m32744p();
        C7569d1 c7569d12 = m32744p;
        while (true) {
            c7569d1 = c7569d12;
            if (c7569d1 == null || aVar.equals(c7569d1.f36684f.f36697a)) {
                break;
            }
            c7569d12 = c7569d1.m32621j();
        }
        if (z10 || m32744p != c7569d1 || (c7569d1 != null && c7569d1.m32636z(j10) < 0)) {
            for (InterfaceC7627v1 interfaceC7627v1 : this.f37006b) {
                m33119o(interfaceC7627v1);
            }
            if (c7569d1 != null) {
                while (this.f37023s.m32744p() != c7569d1) {
                    this.f37023s.m32730b();
                }
                this.f37023s.m32753z(c7569d1);
                c7569d1.m32634x(0L);
                m33129s();
            }
        }
        C7581g1 c7581g1 = this.f37023s;
        if (c7569d1 != null) {
            c7581g1.m32753z(c7569d1);
            if (c7569d1.f36682d) {
                long j11 = c7569d1.f36684f.f36701e;
                long j12 = j10;
                if (j11 != -9223372036854775807L) {
                    j12 = j10;
                    if (j10 >= j11) {
                        j12 = Math.max(0L, j11 - 1);
                    }
                }
                j10 = j12;
                if (c7569d1.f36683e) {
                    j10 = c7569d1.f36679a.mo343j(j12);
                    c7569d1.f36679a.mo353w(j10 - this.f37017m, this.f37018n);
                }
            } else {
                c7569d1.f36684f = c7569d1.f36684f.m32661b(j10);
            }
            m33132t0(j10);
            m33076V();
        } else {
            c7581g1.m32734f();
            m33132t0(j10);
        }
        m33052H(false);
        this.f37012h.mo22203i(2);
        return j10;
    }

    /* renamed from: G */
    public final void m33050G(IOException iOException, int i10) {
        C7607p m32875e = C7607p.m32875e(iOException, i10);
        C7569d1 m32744p = this.f37023s.m32744p();
        C7607p c7607p = m32875e;
        if (m32744p != null) {
            c7607p = m32875e.m32879c(m32744p.f36684f.f36697a);
        }
        C4392v.m22271e("ExoPlayerImplInternal", "Playback error", c7607p);
        m33104i1(false, false);
        this.f37028x = this.f37028x.m32849f(c7607p);
    }

    /* renamed from: G0 */
    public final void m33051G0(C7615r1 c7615r1) {
        if (c7615r1.m33012e() == -9223372036854775807L) {
            m33053H0(c7615r1);
            return;
        }
        if (this.f37028x.f36864a.m32667q()) {
            this.f37020p.add(new d(c7615r1));
            return;
        }
        d dVar = new d(c7615r1);
        AbstractC7574e2 abstractC7574e2 = this.f37028x.f36864a;
        if (!m33033v0(dVar, abstractC7574e2, abstractC7574e2, this.f36994E, this.f36995F, this.f37015k, this.f37016l)) {
            c7615r1.m33018k(false);
        } else {
            this.f37020p.add(dVar);
            Collections.sort(this.f37020p);
        }
    }

    /* renamed from: H */
    public final void m33052H(boolean z10) {
        C7569d1 m32738j = this.f37023s.m32738j();
        InterfaceC0127w.a aVar = m32738j == null ? this.f37028x.f36865b : m32738j.f36684f.f36697a;
        boolean z11 = !this.f37028x.f36874k.equals(aVar);
        if (z11) {
            this.f37028x = this.f37028x.m32845b(aVar);
        }
        C7600m1 c7600m1 = this.f37028x;
        c7600m1.f36880q = m32738j == null ? c7600m1.f36882s : m32738j.m32620i();
        this.f37028x.f36881r = m33044D();
        if ((z11 || z10) && m32738j != null && m32738j.f36682d) {
            m33115m1(m32738j.m32625n(), m32738j.m32626o());
        }
    }

    /* renamed from: H0 */
    public final void m33053H0(C7615r1 c7615r1) {
        if (c7615r1.m33010c() != this.f37014j) {
            this.f37012h.mo22199e(15, c7615r1).mo22206a();
            return;
        }
        m33116n(c7615r1);
        int i10 = this.f37028x.f36868e;
        if (i10 == 3 || i10 == 2) {
            this.f37012h.mo22203i(2);
        }
    }

    /* renamed from: I */
    public final void m33054I(AbstractC7574e2 abstractC7574e2, boolean z10) {
        long j10;
        g m33034x0 = m33034x0(abstractC7574e2, this.f37028x, this.f37000K, this.f37023s, this.f36994E, this.f36995F, this.f37015k, this.f37016l);
        InterfaceC0127w.a aVar = m33034x0.f37051a;
        long j11 = m33034x0.f37053c;
        boolean z11 = m33034x0.f37054d;
        long j12 = m33034x0.f37052b;
        boolean z12 = (this.f37028x.f36865b.equals(aVar) && j12 == this.f37028x.f36882s) ? false : true;
        try {
            if (m33034x0.f37055e) {
                if (this.f37028x.f36868e != 1) {
                    m33087a1(4);
                }
                m33128r0(false, false, false, true);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (z12) {
                j10 = j12;
                if (!abstractC7574e2.m32667q()) {
                    for (C7569d1 m32744p = this.f37023s.m32744p(); m32744p != null; m32744p = m32744p.m32621j()) {
                        if (m32744p.f36684f.f36697a.equals(aVar)) {
                            m32744p.f36684f = this.f37023s.m32746r(abstractC7574e2, m32744p.f36684f);
                            m32744p.m32612A();
                        }
                    }
                    j10 = m33047E0(aVar, j12, z11);
                }
            } else {
                j10 = j12;
                if (!this.f37023s.m32727F(abstractC7574e2, this.f37001L, m33038A())) {
                    m33043C0(false);
                    j10 = j12;
                }
            }
            C7600m1 c7600m1 = this.f37028x;
            m33112l1(abstractC7574e2, aVar, c7600m1.f36864a, c7600m1.f36865b, m33034x0.f37056f ? j10 : -9223372036854775807L);
            if (z12 || j11 != this.f37028x.f36866c) {
                C7600m1 c7600m12 = this.f37028x;
                Object obj = c7600m12.f36865b.f544a;
                AbstractC7574e2 abstractC7574e22 = c7600m12.f36864a;
                this.f37028x = m33062M(aVar, j10, j11, this.f37028x.f36867d, z12 && z10 && !abstractC7574e22.m32667q() && !abstractC7574e22.mo32326h(obj, this.f37016l).f36714f, abstractC7574e2.mo506b(obj) == -1 ? 4 : 3);
            }
            m33130s0();
            m33136w0(abstractC7574e2, this.f37028x.f36864a);
            this.f37028x = this.f37028x.m32853j(abstractC7574e2);
            if (!abstractC7574e2.m32667q()) {
                this.f37000K = null;
            }
            m33052H(false);
        } catch (Throwable th3) {
            th = th3;
            C7600m1 c7600m13 = this.f37028x;
            m33112l1(abstractC7574e2, aVar, c7600m13.f36864a, c7600m13.f36865b, m33034x0.f37056f ? j12 : -9223372036854775807L);
            if (z12 || j11 != this.f37028x.f36866c) {
                C7600m1 c7600m14 = this.f37028x;
                Object obj2 = c7600m14.f36865b.f544a;
                AbstractC7574e2 abstractC7574e23 = c7600m14.f36864a;
                boolean z13 = z12 && z10 && !abstractC7574e23.m32667q() && !abstractC7574e23.mo32326h(obj2, this.f37016l).f36714f;
                this.f37028x = m33062M(aVar, j12, j11, this.f37028x.f36867d, z13, abstractC7574e2.mo506b(obj2) == -1 ? 4 : 3);
            }
            m33130s0();
            m33136w0(abstractC7574e2, this.f37028x.f36864a);
            this.f37028x = this.f37028x.m32853j(abstractC7574e2);
            if (!abstractC7574e2.m32667q()) {
                this.f37000K = null;
            }
            m33052H(false);
            throw th;
        }
    }

    /* renamed from: I0 */
    public final void m33055I0(final C7615r1 c7615r1) {
        Looper m33010c = c7615r1.m33010c();
        if (m33010c.getThread().isAlive()) {
            this.f37021q.mo21915d(m33010c, null).mo22202h(new Runnable(this, c7615r1) { // from class: p6.s0

                /* renamed from: b */
                public final C7620t0 f36980b;

                /* renamed from: c */
                public final C7615r1 f36981c;

                {
                    this.f36980b = this;
                    this.f36981c = c7615r1;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f36980b.m33027U(this.f36981c);
                }
            });
        } else {
            C4392v.m22275i("TAG", "Trying to send message on a dead thread.");
            c7615r1.m33018k(false);
        }
    }

    /* renamed from: J */
    public final void m33056J(InterfaceC0121t interfaceC0121t) {
        if (this.f37023s.m32750v(interfaceC0121t)) {
            C7569d1 m32738j = this.f37023s.m32738j();
            m32738j.m32627p(this.f37019o.mo22208b().f36896a, this.f37028x.f36864a);
            m33115m1(m32738j.m32625n(), m32738j.m32626o());
            if (m32738j == this.f37023s.m32744p()) {
                m33132t0(m32738j.f36684f.f36698b);
                m33129s();
                C7600m1 c7600m1 = this.f37028x;
                InterfaceC0127w.a aVar = c7600m1.f36865b;
                long j10 = m32738j.f36684f.f36698b;
                this.f37028x = m33062M(aVar, j10, c7600m1.f36866c, j10, false, 5);
            }
            m33076V();
        }
    }

    /* renamed from: J0 */
    public final void m33057J0(long j10) {
        for (InterfaceC7627v1 interfaceC7627v1 : this.f37006b) {
            if (interfaceC7627v1.mo32707r() != null) {
                m33059K0(interfaceC7627v1, j10);
            }
        }
    }

    /* renamed from: K */
    public final void m33058K(C7603n1 c7603n1, float f10, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                this.f37029y.m33148b(1);
            }
            this.f37028x = this.f37028x.m32850g(c7603n1);
        }
        m33123p1(c7603n1.f36896a);
        for (InterfaceC7627v1 interfaceC7627v1 : this.f37006b) {
            if (interfaceC7627v1 != null) {
                interfaceC7627v1.mo23561o(f10, c7603n1.f36896a);
            }
        }
    }

    /* renamed from: K0 */
    public final void m33059K0(InterfaceC7627v1 interfaceC7627v1, long j10) {
        interfaceC7627v1.mo32701g();
        if (interfaceC7627v1 instanceof C6930l) {
            ((C6930l) interfaceC7627v1).m31898T(j10);
        }
    }

    /* renamed from: L */
    public final void m33060L(C7603n1 c7603n1, boolean z10) {
        m33058K(c7603n1, c7603n1.f36896a, true, z10);
    }

    /* renamed from: L0 */
    public final void m33061L0(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.f36996G != z10) {
            this.f36996G = z10;
            if (!z10) {
                for (InterfaceC7627v1 interfaceC7627v1 : this.f37006b) {
                    if (!m33024Q(interfaceC7627v1)) {
                        interfaceC7627v1.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: M */
    public final C7600m1 m33062M(InterfaceC0127w.a aVar, long j10, long j11, long j12, boolean z10, int i10) {
        this.f37003N = (!this.f37003N && j10 == this.f37028x.f36882s && aVar.equals(this.f37028x.f36865b)) ? false : true;
        m33130s0();
        C7600m1 c7600m1 = this.f37028x;
        C0083a1 c0083a1 = c7600m1.f36871h;
        C9892p c9892p = c7600m1.f36872i;
        List list = c7600m1.f36873j;
        if (this.f37024t.m32802s()) {
            C7569d1 m32744p = this.f37023s.m32744p();
            c0083a1 = m32744p == null ? C0083a1.f260e : m32744p.m32625n();
            c9892p = m32744p == null ? this.f37009e : m32744p.m32626o();
            list = m33135w(c9892p.f45511c);
            if (m32744p != null) {
                C7573e1 c7573e1 = m32744p.f36684f;
                if (c7573e1.f36699c != j11) {
                    m32744p.f36684f = c7573e1.m32660a(j11);
                }
            }
        } else if (!aVar.equals(this.f37028x.f36865b)) {
            c0083a1 = C0083a1.f260e;
            c9892p = this.f37009e;
            list = AbstractC4834t.m24539E();
        }
        if (z10) {
            this.f37029y.m33151e(i10);
        }
        return this.f37028x.m32846c(aVar, j10, j11, j12, m33044D(), c0083a1, c9892p, list);
    }

    /* renamed from: M0 */
    public final void m33063M0(b bVar) {
        this.f37029y.m33148b(1);
        if (bVar.f37034c != -1) {
            this.f37000K = new h(new C7618s1(bVar.f37032a, bVar.f37033b), bVar.f37034c, bVar.f37035d);
        }
        m33054I(this.f37024t.m32792C(bVar.f37032a, bVar.f37033b), false);
    }

    /* renamed from: N */
    public final boolean m33064N(InterfaceC7627v1 interfaceC7627v1, C7569d1 c7569d1) {
        C7569d1 m32621j = c7569d1.m32621j();
        return c7569d1.f36684f.f36702f && m32621j.f36682d && ((interfaceC7627v1 instanceof C6930l) || interfaceC7627v1.mo32708s() >= m32621j.m32624m());
    }

    /* renamed from: N0 */
    public void m33065N0(List<C7591j1.c> list, int i10, long j10, InterfaceC0124u0 interfaceC0124u0) {
        this.f37012h.mo22199e(17, new b(list, interfaceC0124u0, i10, j10, null)).mo22206a();
    }

    /* renamed from: O */
    public final boolean m33066O() {
        C7569d1 m32745q = this.f37023s.m32745q();
        if (!m32745q.f36682d) {
            return false;
        }
        int i10 = 0;
        while (true) {
            InterfaceC7627v1[] interfaceC7627v1Arr = this.f37006b;
            if (i10 >= interfaceC7627v1Arr.length) {
                return true;
            }
            InterfaceC7627v1 interfaceC7627v1 = interfaceC7627v1Arr[i10];
            InterfaceC0120s0 interfaceC0120s0 = m32745q.f36681c[i10];
            if (interfaceC7627v1.mo32707r() != interfaceC0120s0) {
                return false;
            }
            if (interfaceC0120s0 != null && !interfaceC7627v1.mo32700f() && !m33064N(interfaceC7627v1, m32745q)) {
                return false;
            }
            i10++;
        }
    }

    /* renamed from: O0 */
    public final void m33067O0(boolean z10) {
        if (z10 == this.f36998I) {
            return;
        }
        this.f36998I = z10;
        C7600m1 c7600m1 = this.f37028x;
        int i10 = c7600m1.f36868e;
        if (z10 || i10 == 4 || i10 == 1) {
            this.f37028x = c7600m1.m32847d(z10);
        } else {
            this.f37012h.mo22203i(2);
        }
    }

    /* renamed from: P */
    public final boolean m33068P() {
        C7569d1 m32738j = this.f37023s.m32738j();
        return (m32738j == null || m32738j.m32622k() == Long.MIN_VALUE) ? false : true;
    }

    /* renamed from: P0 */
    public final void m33069P0(boolean z10) {
        this.f36990A = z10;
        m33130s0();
        if (!this.f36991B || this.f37023s.m32745q() == this.f37023s.m32744p()) {
            return;
        }
        m33043C0(true);
        m33052H(false);
    }

    /* renamed from: Q0 */
    public void m33070Q0(boolean z10, int i10) {
        this.f37012h.mo22201g(1, z10 ? 1 : 0, i10).mo22206a();
    }

    /* renamed from: R */
    public final boolean m33071R() {
        C7569d1 m32744p = this.f37023s.m32744p();
        long j10 = m32744p.f36684f.f36701e;
        return m32744p.f36682d && (j10 == -9223372036854775807L || this.f37028x.f36882s < j10 || !m33094d1());
    }

    /* renamed from: R0 */
    public final void m33072R0(boolean z10, int i10, boolean z11, int i11) {
        this.f37029y.m33148b(z11 ? 1 : 0);
        this.f37029y.m33149c(i11);
        this.f37028x = this.f37028x.m32848e(z10, i10);
        this.f36992C = false;
        m33099g0(z10);
        if (!m33094d1()) {
            m33107j1();
            m33121o1();
            return;
        }
        int i12 = this.f37028x.f36868e;
        if (i12 == 3) {
            m33100g1();
        } else if (i12 != 2) {
            return;
        }
        this.f37012h.mo22203i(2);
    }

    /* renamed from: S0 */
    public void m33073S0(C7603n1 c7603n1) {
        this.f37012h.mo22199e(4, c7603n1).mo22206a();
    }

    /* renamed from: T0 */
    public final void m33074T0(C7603n1 c7603n1) {
        this.f37019o.mo22209c(c7603n1);
        m33060L(this.f37019o.mo22208b(), true);
    }

    /* renamed from: U0 */
    public void m33075U0(int i10) {
        this.f37012h.mo22201g(11, i10, 0).mo22206a();
    }

    /* renamed from: V */
    public final void m33076V() {
        boolean m33092c1 = m33092c1();
        this.f36993D = m33092c1;
        if (m33092c1) {
            this.f37023s.m32738j().m32616d(this.f37001L);
        }
        m33109k1();
    }

    /* renamed from: V0 */
    public final void m33077V0(int i10) {
        this.f36994E = i10;
        if (!this.f37023s.m32728G(this.f37028x.f36864a, i10)) {
            m33043C0(true);
        }
        m33052H(false);
    }

    /* renamed from: W */
    public final void m33078W() {
        this.f37029y.m33150d(this.f37028x);
        if (this.f37029y.f37044a) {
            this.f37022r.mo32716a(this.f37029y);
            this.f37029y = new e(this.f37028x);
        }
    }

    /* renamed from: W0 */
    public final void m33079W0(C7558a2 c7558a2) {
        this.f37027w = c7558a2;
    }

    /* renamed from: X */
    public final boolean m33080X(long j10, long j11) {
        if (this.f36998I && this.f36997H) {
            return false;
        }
        m33039A0(j10, j11);
        return true;
    }

    /* renamed from: X0 */
    public void m33081X0(boolean z10) {
        this.f37012h.mo22201g(12, z10 ? 1 : 0, 0).mo22206a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d0, code lost:
    
        if (r10 < r5.f37020p.size()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d3, code lost:
    
        r19 = r5.f37020p.get(r10);
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ee, code lost:
    
        r10 = r11;
        r18 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f8, code lost:
    
        if (r19 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fb, code lost:
    
        r10 = r11;
        r18 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0108, code lost:
    
        if (r19.f37043e == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010b, code lost:
    
        r0 = r19.f37041c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0116, code lost:
    
        if (r0 < r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0119, code lost:
    
        r10 = r11;
        r18 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0125, code lost:
    
        if (r0 != r0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0128, code lost:
    
        r10 = r11;
        r18 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0137, code lost:
    
        if (r19.f37042d > r6) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0158, code lost:
    
        if (r18 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0160, code lost:
    
        if (r18.f37043e == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016a, code lost:
    
        if (r18.f37041c != r0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x016d, code lost:
    
        r0 = r18.f37042d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0178, code lost:
    
        if (r0 <= r6) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x017f, code lost:
    
        if (r0 > r8) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0182, code lost:
    
        m33053H0(r18.f37040b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0193, code lost:
    
        if (r18.f37040b.m33009b() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x019e, code lost:
    
        if (r18.f37040b.m33017j() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01a4, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01bd, code lost:
    
        if (r10 >= r5.f37020p.size()) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01d1, code lost:
    
        r18 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01c0, code lost:
    
        r18 = r5.f37020p.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01aa, code lost:
    
        r5.f37020p.remove(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d7, code lost:
    
        r19 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e1, code lost:
    
        if (r18.f37040b.m33009b() != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01fb, code lost:
    
        throw r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ef, code lost:
    
        r5.f37020p.remove(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01fc, code lost:
    
        r5.f37002M = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0202, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013a, code lost:
    
        r10 = r11 + 1;
        r11 = r10;
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0150, code lost:
    
        if (r10 >= r5.f37020p.size()) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00e8, code lost:
    
        r19 = null;
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00ee, code lost:
    
        r19 = null;
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0083, code lost:
    
        r18 = null;
        r6 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b9 -> B:11:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0150 -> B:25:0x00d3). Please report as a decompilation issue!!! */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m33082Y(long r6, long r8) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p267p6.C7620t0.m33082Y(long, long):void");
    }

    /* renamed from: Y0 */
    public final void m33083Y0(boolean z10) {
        this.f36995F = z10;
        if (!this.f37023s.m32729H(this.f37028x.f36864a, z10)) {
            m33043C0(true);
        }
        m33052H(false);
    }

    /* renamed from: Z */
    public final void m33084Z() {
        C7573e1 m32743o;
        this.f37023s.m32752y(this.f37001L);
        if (this.f37023s.m32725D() && (m32743o = this.f37023s.m32743o(this.f37001L, this.f37028x)) != null) {
            C7569d1 m32735g = this.f37023s.m32735g(this.f37007c, this.f37008d, this.f37010f.mo32335d(), this.f37024t, m32743o, this.f37009e);
            m32735g.f36679a.mo345l(this, m32743o.f36698b);
            if (this.f37023s.m32744p() == m32735g) {
                m33132t0(m32735g.m32624m());
            }
            m33052H(false);
        }
        if (!this.f36993D) {
            m33076V();
        } else {
            this.f36993D = m33068P();
            m33109k1();
        }
    }

    /* renamed from: Z0 */
    public final void m33085Z0(InterfaceC0124u0 interfaceC0124u0) {
        this.f37029y.m33148b(1);
        m33054I(this.f37024t.m32793D(interfaceC0124u0), false);
    }

    /* renamed from: a0 */
    public final void m33086a0() {
        boolean z10 = false;
        while (true) {
            boolean z11 = z10;
            if (!m33090b1()) {
                return;
            }
            if (z11) {
                m33078W();
            }
            C7569d1 m32744p = this.f37023s.m32744p();
            C7569d1 m32730b = this.f37023s.m32730b();
            C7573e1 c7573e1 = m32730b.f36684f;
            InterfaceC0127w.a aVar = c7573e1.f36697a;
            long j10 = c7573e1.f36698b;
            C7600m1 m33062M = m33062M(aVar, j10, c7573e1.f36699c, j10, true, 0);
            this.f37028x = m33062M;
            AbstractC7574e2 abstractC7574e2 = m33062M.f36864a;
            m33112l1(abstractC7574e2, m32730b.f36684f.f36697a, abstractC7574e2, m32744p.f36684f.f36697a, -9223372036854775807L);
            m33130s0();
            m33121o1();
            z10 = true;
        }
    }

    /* renamed from: a1 */
    public final void m33087a1(int i10) {
        C7600m1 c7600m1 = this.f37028x;
        if (c7600m1.f36868e != i10) {
            this.f37028x = c7600m1.m32851h(i10);
        }
    }

    @Override // p421y8.AbstractC9891o.a
    /* renamed from: b */
    public void mo33088b() {
        this.f37012h.mo22203i(10);
    }

    /* renamed from: b0 */
    public final void m33089b0() {
        C7569d1 m32745q = this.f37023s.m32745q();
        if (m32745q == null) {
            return;
        }
        if (m32745q.m32621j() != null && !this.f36991B) {
            if (m33066O()) {
                if (m32745q.m32621j().f36682d || this.f37001L >= m32745q.m32621j().m32624m()) {
                    C9892p m32626o = m32745q.m32626o();
                    C7569d1 m32731c = this.f37023s.m32731c();
                    C9892p m32626o2 = m32731c.m32626o();
                    if (m32731c.f36682d && m32731c.f36679a.mo347n() != -9223372036854775807L) {
                        m33057J0(m32731c.m32624m());
                        return;
                    }
                    for (int i10 = 0; i10 < this.f37006b.length; i10++) {
                        boolean m41750c = m32626o.m41750c(i10);
                        boolean m41750c2 = m32626o2.m41750c(i10);
                        if (m41750c && !this.f37006b[i10].mo32704k()) {
                            boolean z10 = this.f37007c[i10].getTrackType() == 7;
                            C7636y1 c7636y1 = m32626o.f45510b[i10];
                            C7636y1 c7636y12 = m32626o2.f45510b[i10];
                            if (!m41750c2 || !c7636y12.equals(c7636y1) || z10) {
                                m33059K0(this.f37006b[i10], m32731c.m32624m());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        int i11 = 0;
        if (!m32745q.f36684f.f36705i) {
            if (!this.f36991B) {
                return;
            } else {
                i11 = 0;
            }
        }
        while (true) {
            InterfaceC7627v1[] interfaceC7627v1Arr = this.f37006b;
            if (i11 >= interfaceC7627v1Arr.length) {
                return;
            }
            InterfaceC7627v1 interfaceC7627v1 = interfaceC7627v1Arr[i11];
            InterfaceC0120s0 interfaceC0120s0 = m32745q.f36681c[i11];
            if (interfaceC0120s0 != null && interfaceC7627v1.mo32707r() == interfaceC0120s0 && interfaceC7627v1.mo32700f()) {
                long j10 = m32745q.f36684f.f36701e;
                m33059K0(interfaceC7627v1, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : m32745q.m32623l() + m32745q.f36684f.f36701e);
            }
            i11++;
        }
    }

    /* renamed from: b1 */
    public final boolean m33090b1() {
        C7569d1 m32744p;
        if (!m33094d1() || this.f36991B || (m32744p = this.f37023s.m32744p()) == null) {
            return false;
        }
        C7569d1 m32621j = m32744p.m32621j();
        boolean z10 = false;
        if (m32621j != null) {
            z10 = false;
            if (this.f37001L >= m32621j.m32624m()) {
                z10 = false;
                if (m32621j.f36685g) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    @Override // p267p6.C7591j1.d
    /* renamed from: c */
    public void mo32811c() {
        this.f37012h.mo22203i(22);
    }

    /* renamed from: c0 */
    public final void m33091c0() {
        C7569d1 m32745q = this.f37023s.m32745q();
        if (m32745q == null || this.f37023s.m32744p() == m32745q || m32745q.f36685g || !m33122p0()) {
            return;
        }
        m33129s();
    }

    /* renamed from: c1 */
    public final boolean m33092c1() {
        if (!m33068P()) {
            return false;
        }
        C7569d1 m32738j = this.f37023s.m32738j();
        return this.f37010f.mo32339h(m32738j == this.f37023s.m32744p() ? m32738j.m32635y(this.f37001L) : m32738j.m32635y(this.f37001L) - m32738j.f36684f.f36698b, m33046E(m32738j.m32622k()), this.f37019o.mo22208b().f36896a);
    }

    @Override // p267p6.C7615r1.a
    /* renamed from: d */
    public void mo33022d(C7615r1 c7615r1) {
        synchronized (this) {
            if (!this.f37030z && this.f37013i.isAlive()) {
                this.f37012h.mo22199e(14, c7615r1).mo22206a();
                return;
            }
            C4392v.m22275i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            c7615r1.m33018k(false);
        }
    }

    /* renamed from: d0 */
    public final void m33093d0() {
        m33054I(this.f37024t.m32797i(), true);
    }

    /* renamed from: d1 */
    public final boolean m33094d1() {
        C7600m1 c7600m1 = this.f37028x;
        return c7600m1.f36875l && c7600m1.f36876m == 0;
    }

    @Override // p267p6.C7598m.a
    /* renamed from: e */
    public void mo32841e(C7603n1 c7603n1) {
        this.f37012h.mo22199e(16, c7603n1).mo22206a();
    }

    /* renamed from: e0 */
    public final void m33095e0(c cVar) {
        this.f37029y.m33148b(1);
        m33054I(this.f37024t.m32804v(cVar.f37036a, cVar.f37037b, cVar.f37038c, cVar.f37039d), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b9, code lost:
    
        if (r8.f37010f.mo32334c(m33044D(), r8.f37019o.mo22208b().f36896a, r8.f36992C, r12) != false) goto L36;
     */
    /* renamed from: e1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m33096e1(boolean r9) {
        /*
            r8 = this;
            r0 = r8
            int r0 = r0.f36999J
            if (r0 != 0) goto Lc
            r0 = r8
            boolean r0 = r0.m33071R()
            return r0
        Lc:
            r0 = 0
            r14 = r0
            r0 = r9
            if (r0 != 0) goto L15
            r0 = 0
            return r0
        L15:
            r0 = r8
            p6.m1 r0 = r0.f37028x
            r15 = r0
            r0 = r15
            boolean r0 = r0.f36870g
            if (r0 != 0) goto L25
            r0 = 1
            return r0
        L25:
            r0 = r8
            r1 = r15
            p6.e2 r1 = r1.f36864a
            r2 = r8
            p6.g1 r2 = r2.f37023s
            p6.d1 r2 = r2.m32744p()
            p6.e1 r2 = r2.f36684f
            a8.w$a r2 = r2.f36697a
            boolean r0 = r0.m33098f1(r1, r2)
            if (r0 == 0) goto L4c
            r0 = r8
            p6.z0 r0 = r0.f37025u
            long r0 = r0.mo32815c()
            r12 = r0
            goto L51
        L4c:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = r0
        L51:
            r0 = r8
            p6.g1 r0 = r0.f37023s
            p6.d1 r0 = r0.m32738j()
            r15 = r0
            r0 = r15
            boolean r0 = r0.m32628q()
            if (r0 == 0) goto L72
            r0 = r15
            p6.e1 r0 = r0.f36684f
            boolean r0 = r0.f36705i
            if (r0 == 0) goto L72
            r0 = 1
            r10 = r0
            goto L74
        L72:
            r0 = 0
            r10 = r0
        L74:
            r0 = r15
            p6.e1 r0 = r0.f36684f
            a8.w$a r0 = r0.f36697a
            boolean r0 = r0.m630b()
            if (r0 == 0) goto L8f
            r0 = r15
            boolean r0 = r0.f36682d
            if (r0 != 0) goto L8f
            r0 = 1
            r11 = r0
            goto L91
        L8f:
            r0 = 0
            r11 = r0
        L91:
            r0 = r10
            if (r0 != 0) goto Lbc
            r0 = r11
            if (r0 != 0) goto Lbc
            r0 = r14
            r9 = r0
            r0 = r8
            p6.a1 r0 = r0.f37010f
            r1 = r8
            long r1 = r1.m33044D()
            r2 = r8
            p6.m r2 = r2.f37019o
            p6.n1 r2 = r2.mo22208b()
            float r2 = r2.f36896a
            r3 = r8
            boolean r3 = r3.f36992C
            r4 = r12
            boolean r0 = r0.mo32334c(r1, r2, r3, r4)
            if (r0 == 0) goto Lbe
        Lbc:
            r0 = 1
            r9 = r0
        Lbe:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p267p6.C7620t0.m33096e1(boolean):boolean");
    }

    /* renamed from: f0 */
    public final void m33097f0() {
        C7569d1 m32744p = this.f37023s.m32744p();
        while (true) {
            C7569d1 c7569d1 = m32744p;
            if (c7569d1 == null) {
                return;
            }
            for (InterfaceC9884h interfaceC9884h : c7569d1.m32626o().f45511c) {
                if (interfaceC9884h != null) {
                    interfaceC9884h.mo41609i();
                }
            }
            m32744p = c7569d1.m32621j();
        }
    }

    /* renamed from: f1 */
    public final boolean m33098f1(AbstractC7574e2 abstractC7574e2, InterfaceC0127w.a aVar) {
        boolean z10 = false;
        if (!aVar.m630b()) {
            if (abstractC7574e2.m32667q()) {
                z10 = false;
            } else {
                abstractC7574e2.m32666n(abstractC7574e2.mo32326h(aVar.f544a, this.f37016l).f36711c, this.f37015k);
                z10 = false;
                if (this.f37015k.m32694f()) {
                    AbstractC7574e2.c cVar = this.f37015k;
                    z10 = false;
                    if (cVar.f36728i) {
                        z10 = false;
                        if (cVar.f36725f != -9223372036854775807L) {
                            z10 = true;
                        }
                    }
                }
            }
        }
        return z10;
    }

    /* renamed from: g0 */
    public final void m33099g0(boolean z10) {
        C7569d1 m32744p = this.f37023s.m32744p();
        while (true) {
            C7569d1 c7569d1 = m32744p;
            if (c7569d1 == null) {
                return;
            }
            for (InterfaceC9884h interfaceC9884h : c7569d1.m32626o().f45511c) {
                if (interfaceC9884h != null) {
                    interfaceC9884h.mo41613m(z10);
                }
            }
            m32744p = c7569d1.m32621j();
        }
    }

    /* renamed from: g1 */
    public final void m33100g1() {
        this.f36992C = false;
        this.f37019o.m32837g();
        for (InterfaceC7627v1 interfaceC7627v1 : this.f37006b) {
            if (m33024Q(interfaceC7627v1)) {
                interfaceC7627v1.start();
            }
        }
    }

    /* renamed from: h0 */
    public final void m33101h0() {
        C7569d1 m32744p = this.f37023s.m32744p();
        while (true) {
            C7569d1 c7569d1 = m32744p;
            if (c7569d1 == null) {
                return;
            }
            for (InterfaceC9884h interfaceC9884h : c7569d1.m32626o().f45511c) {
                if (interfaceC9884h != null) {
                    interfaceC9884h.mo41616s();
                }
            }
            m32744p = c7569d1.m32621j();
        }
    }

    /* renamed from: h1 */
    public void m33102h1() {
        this.f37012h.mo22196b(6).mo22206a();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10;
        C7607p c7607p;
        IOException iOException;
        int i11 = 1000;
        try {
            switch (message.what) {
                case 0:
                    m33108k0();
                    break;
                case 1:
                    m33072R0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    m33124q();
                    break;
                case 3:
                    m33045D0((h) message.obj);
                    break;
                case 4:
                    m33074T0((C7603n1) message.obj);
                    break;
                case 5:
                    m33079W0((C7558a2) message.obj);
                    break;
                case 6:
                    m33104i1(false, true);
                    break;
                case 7:
                    m33114m0();
                    return true;
                case 8:
                    m33056J((InterfaceC0121t) message.obj);
                    break;
                case 9:
                    m33048F((InterfaceC0121t) message.obj);
                    break;
                case 10:
                    m33125q0();
                    break;
                case 11:
                    m33077V0(message.arg1);
                    break;
                case 12:
                    m33083Y0(message.arg1 != 0);
                    break;
                case 13:
                    m33061L0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    m33051G0((C7615r1) message.obj);
                    break;
                case 15:
                    m33055I0((C7615r1) message.obj);
                    break;
                case 16:
                    m33060L((C7603n1) message.obj, false);
                    break;
                case 17:
                    m33063M0((b) message.obj);
                    break;
                case 18:
                    m33105j((b) message.obj, message.arg1);
                    break;
                case 19:
                    m33095e0((c) message.obj);
                    break;
                case 20:
                    m33117n0(message.arg1, message.arg2, (InterfaceC0124u0) message.obj);
                    break;
                case 21:
                    m33085Z0((InterfaceC0124u0) message.obj);
                    break;
                case 22:
                    m33093d0();
                    break;
                case 23:
                    m33069P0(message.arg1 != 0);
                    break;
                case 24:
                    m33067O0(message.arg1 == 1);
                    break;
                case 25:
                    m33113m();
                    break;
                default:
                    return false;
            }
        } catch (C0084b e10) {
            i10 = 1002;
            iOException = e10;
            m33050G(iOException, i10);
        } catch (C0856n e11) {
            i10 = e11.f5840b;
            iOException = e11;
            m33050G(iOException, i10);
        } catch (RuntimeException e12) {
            if ((e12 instanceof IllegalStateException) || (e12 instanceof IllegalArgumentException)) {
                i11 = 1004;
            }
            c7607p = C7607p.m32877g(e12, i11);
            C4392v.m22271e("ExoPlayerImplInternal", "Playback error", c7607p);
            m33104i1(true, false);
            this.f37028x = this.f37028x.m32849f(c7607p);
        } catch (C7594k1 e13) {
            int i12 = e13.f36840c;
            if (i12 == 1) {
                i11 = e13.f36839b ? 3001 : 3003;
            } else if (i12 == 4) {
                i11 = e13.f36839b ? 3002 : 3004;
            }
            m33050G(e13, i11);
        } catch (C7607p e14) {
            C7607p c7607p2 = e14;
            if (e14.f36918e == 1) {
                C7569d1 m32745q = this.f37023s.m32745q();
                c7607p2 = e14;
                if (m32745q != null) {
                    c7607p2 = e14.m32879c(m32745q.f36684f.f36697a);
                }
            }
            if (c7607p2.f36924k && this.f37004O == null) {
                C4392v.m22276j("ExoPlayerImplInternal", "Recoverable renderer error", c7607p2);
                this.f37004O = c7607p2;
                InterfaceC4380p interfaceC4380p = this.f37012h;
                interfaceC4380p.mo22195a(interfaceC4380p.mo22199e(25, c7607p2));
            } else {
                C7607p c7607p3 = this.f37004O;
                c7607p = c7607p2;
                if (c7607p3 != null) {
                    c7607p3.addSuppressed(c7607p2);
                    c7607p = this.f37004O;
                }
                C4392v.m22271e("ExoPlayerImplInternal", "Playback error", c7607p);
                m33104i1(true, false);
                this.f37028x = this.f37028x.m32849f(c7607p);
            }
        } catch (InterfaceC9277p.a e15) {
            i10 = e15.f42365b;
            iOException = e15;
            m33050G(iOException, i10);
        } catch (IOException e16) {
            i10 = 2000;
            iOException = e16;
            m33050G(iOException, i10);
        }
        m33078W();
        return true;
    }

    @Override // p009a8.InterfaceC0122t0.a
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void mo334a(InterfaceC0121t interfaceC0121t) {
        this.f37012h.mo22199e(9, interfaceC0121t).mo22206a();
    }

    /* renamed from: i1 */
    public final void m33104i1(boolean z10, boolean z11) {
        m33128r0(z10 || !this.f36996G, false, true, false);
        this.f37029y.m33148b(z11 ? 1 : 0);
        this.f37010f.mo32336e();
        m33087a1(1);
    }

    /* renamed from: j */
    public final void m33105j(b bVar, int i10) {
        this.f37029y.m33148b(1);
        C7591j1 c7591j1 = this.f37024t;
        int i11 = i10;
        if (i10 == -1) {
            i11 = c7591j1.m32801q();
        }
        m33054I(c7591j1.m32794f(i11, bVar.f37032a, bVar.f37033b), false);
    }

    /* renamed from: j0 */
    public void m33106j0() {
        this.f37012h.mo22196b(0).mo22206a();
    }

    /* renamed from: j1 */
    public final void m33107j1() {
        this.f37019o.m32838h();
        for (InterfaceC7627v1 interfaceC7627v1 : this.f37006b) {
            if (m33024Q(interfaceC7627v1)) {
                m33133u(interfaceC7627v1);
            }
        }
    }

    @Override // p009a8.InterfaceC0121t.a
    /* renamed from: k */
    public void mo344k(InterfaceC0121t interfaceC0121t) {
        this.f37012h.mo22199e(8, interfaceC0121t).mo22206a();
    }

    /* renamed from: k0 */
    public final void m33108k0() {
        this.f37029y.m33148b(1);
        m33128r0(false, false, false, true);
        this.f37010f.onPrepared();
        m33087a1(this.f37028x.f36864a.m32667q() ? 4 : 2);
        this.f37024t.m32805w(this.f37011g.mo5341d());
        this.f37012h.mo22203i(2);
    }

    /* renamed from: k1 */
    public final void m33109k1() {
        C7569d1 m32738j = this.f37023s.m32738j();
        boolean z10 = this.f36993D || (m32738j != null && m32738j.f36679a.mo335b());
        C7600m1 c7600m1 = this.f37028x;
        if (z10 != c7600m1.f36870g) {
            this.f37028x = c7600m1.m32844a(z10);
        }
    }

    /* renamed from: l */
    public void m33110l(int i10, List<C7591j1.c> list, InterfaceC0124u0 interfaceC0124u0) {
        this.f37012h.mo22198d(18, i10, 0, new b(list, interfaceC0124u0, -1, -9223372036854775807L, null)).mo22206a();
    }

    /* renamed from: l0 */
    public boolean m33111l0() {
        synchronized (this) {
            if (!this.f37030z && this.f37013i.isAlive()) {
                this.f37012h.mo22203i(7);
                m33126q1(new InterfaceC4712o(this) { // from class: p6.r0

                    /* renamed from: b */
                    public final C7620t0 f36964b;

                    {
                        this.f36964b = this;
                    }

                    @Override // ec.InterfaceC4712o
                    public final Object get() {
                        Boolean m33026T;
                        m33026T = this.f36964b.m33026T();
                        return m33026T;
                    }
                }, this.f37026v);
                return this.f37030z;
            }
            return true;
        }
    }

    /* renamed from: l1 */
    public final void m33112l1(AbstractC7574e2 abstractC7574e2, InterfaceC0127w.a aVar, AbstractC7574e2 abstractC7574e22, InterfaceC0127w.a aVar2, long j10) {
        if (abstractC7574e2.m32667q() || !m33098f1(abstractC7574e2, aVar)) {
            float f10 = this.f37019o.mo22208b().f36896a;
            C7603n1 c7603n1 = this.f37028x.f36877n;
            if (f10 != c7603n1.f36896a) {
                this.f37019o.mo22209c(c7603n1);
                return;
            }
            return;
        }
        abstractC7574e2.m32666n(abstractC7574e2.mo32326h(aVar.f544a, this.f37016l).f36711c, this.f37015k);
        this.f37025u.mo32813a((C7561b1.f) C4401z0.m22391j(this.f37015k.f36730k));
        if (j10 != -9223372036854775807L) {
            this.f37025u.mo32817e(m33138z(abstractC7574e2, aVar.f544a, j10));
            return;
        }
        Object obj = this.f37015k.f36720a;
        Object obj2 = null;
        if (!abstractC7574e22.m32667q()) {
            obj2 = abstractC7574e22.m32666n(abstractC7574e22.mo32326h(aVar2.f544a, this.f37016l).f36711c, this.f37015k).f36720a;
        }
        if (C4401z0.m22371c(obj2, obj)) {
            return;
        }
        this.f37025u.mo32817e(-9223372036854775807L);
    }

    /* renamed from: m */
    public final void m33113m() {
        m33043C0(true);
    }

    /* renamed from: m0 */
    public final void m33114m0() {
        m33128r0(true, false, true, false);
        this.f37010f.mo32338g();
        m33087a1(1);
        this.f37013i.quit();
        synchronized (this) {
            this.f37030z = true;
            notifyAll();
        }
    }

    /* renamed from: m1 */
    public final void m33115m1(C0083a1 c0083a1, C9892p c9892p) {
        this.f37010f.mo32337f(this.f37006b, c0083a1, c9892p.f45511c);
    }

    /* renamed from: n */
    public final void m33116n(C7615r1 c7615r1) {
        if (c7615r1.m33017j()) {
            return;
        }
        try {
            c7615r1.m33013f().mo23432i(c7615r1.m33015h(), c7615r1.m33011d());
        } finally {
            c7615r1.m33018k(true);
        }
    }

    /* renamed from: n0 */
    public final void m33117n0(int i10, int i11, InterfaceC0124u0 interfaceC0124u0) {
        this.f37029y.m33148b(1);
        m33054I(this.f37024t.m32790A(i10, i11, interfaceC0124u0), false);
    }

    /* renamed from: n1 */
    public final void m33118n1() {
        if (this.f37028x.f36864a.m32667q() || !this.f37024t.m32802s()) {
            return;
        }
        m33084Z();
        m33089b0();
        m33091c0();
        m33086a0();
    }

    /* renamed from: o */
    public final void m33119o(InterfaceC7627v1 interfaceC7627v1) {
        if (m33024Q(interfaceC7627v1)) {
            this.f37019o.m32833a(interfaceC7627v1);
            m33133u(interfaceC7627v1);
            interfaceC7627v1.disable();
            this.f36999J--;
        }
    }

    /* renamed from: o0 */
    public void m33120o0(int i10, int i11, InterfaceC0124u0 interfaceC0124u0) {
        this.f37012h.mo22198d(20, i10, i11, interfaceC0124u0).mo22206a();
    }

    /* renamed from: o1 */
    public final void m33121o1() {
        C7569d1 m32744p = this.f37023s.m32744p();
        if (m32744p == null) {
            return;
        }
        long mo347n = m32744p.f36682d ? m32744p.f36679a.mo347n() : -9223372036854775807L;
        if (mo347n != -9223372036854775807L) {
            m33132t0(mo347n);
            if (mo347n != this.f37028x.f36882s) {
                C7600m1 c7600m1 = this.f37028x;
                this.f37028x = m33062M(c7600m1.f36865b, mo347n, c7600m1.f36866c, mo347n, true, 5);
            }
        } else {
            long m32839i = this.f37019o.m32839i(m32744p != this.f37023s.m32745q());
            this.f37001L = m32839i;
            long m32635y = m32744p.m32635y(m32839i);
            m33082Y(this.f37028x.f36882s, m32635y);
            this.f37028x.f36882s = m32635y;
        }
        this.f37028x.f36880q = this.f37023s.m32738j().m32620i();
        this.f37028x.f36881r = m33044D();
        C7600m1 c7600m12 = this.f37028x;
        if (c7600m12.f36875l && c7600m12.f36868e == 3 && m33098f1(c7600m12.f36864a, c7600m12.f36865b) && this.f37028x.f36877n.f36896a == 1.0f) {
            float mo32814b = this.f37025u.mo32814b(m33137x(), m33044D());
            if (this.f37019o.mo22208b().f36896a != mo32814b) {
                this.f37019o.mo22209c(this.f37028x.f36877n.m32864b(mo32814b));
                m33058K(this.f37028x.f36877n, this.f37019o.mo22208b().f36896a, false, false);
            }
        }
    }

    /* renamed from: p0 */
    public final boolean m33122p0() {
        C7569d1 m32745q = this.f37023s.m32745q();
        C9892p m32626o = m32745q.m32626o();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            InterfaceC7627v1[] interfaceC7627v1Arr = this.f37006b;
            if (i10 >= interfaceC7627v1Arr.length) {
                return !z10;
            }
            InterfaceC7627v1 interfaceC7627v1 = interfaceC7627v1Arr[i10];
            if (m33024Q(interfaceC7627v1)) {
                boolean z11 = interfaceC7627v1.mo32707r() != m32745q.f36681c[i10];
                if (!m32626o.m41750c(i10) || z11) {
                    if (!interfaceC7627v1.mo32704k()) {
                        interfaceC7627v1.mo32702h(m33035y(m32626o.f45511c[i10]), m32745q.f36681c[i10], m32745q.m32624m(), m32745q.m32623l());
                    } else if (interfaceC7627v1.mo23425d()) {
                        m33119o(interfaceC7627v1);
                    } else {
                        z10 = true;
                    }
                }
            }
            i10++;
        }
    }

    /* renamed from: p1 */
    public final void m33123p1(float f10) {
        C7569d1 m32744p = this.f37023s.m32744p();
        while (true) {
            C7569d1 c7569d1 = m32744p;
            if (c7569d1 == null) {
                return;
            }
            for (InterfaceC9884h interfaceC9884h : c7569d1.m32626o().f45511c) {
                if (interfaceC9884h != null) {
                    interfaceC9884h.mo41597g(f10);
                }
            }
            m32744p = c7569d1.m32621j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024a  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m33124q() {
        /*
            Method dump skipped, instructions count: 860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p267p6.C7620t0.m33124q():void");
    }

    /* renamed from: q0 */
    public final void m33125q0() {
        float f10 = this.f37019o.mo22208b().f36896a;
        C7569d1 m32745q = this.f37023s.m32745q();
        boolean z10 = true;
        for (C7569d1 m32744p = this.f37023s.m32744p(); m32744p != null && m32744p.f36682d; m32744p = m32744p.m32621j()) {
            C9892p m32632v = m32744p.m32632v(f10, this.f37028x.f36864a);
            if (!m32632v.m41748a(m32744p.m32626o())) {
                C7581g1 c7581g1 = this.f37023s;
                if (z10) {
                    C7569d1 m32744p2 = c7581g1.m32744p();
                    boolean m32753z = this.f37023s.m32753z(m32744p2);
                    boolean[] zArr = new boolean[this.f37006b.length];
                    long m32614b = m32744p2.m32614b(m32632v, this.f37028x.f36882s, m32753z, zArr);
                    C7600m1 c7600m1 = this.f37028x;
                    boolean z11 = (c7600m1.f36868e == 4 || m32614b == c7600m1.f36882s) ? false : true;
                    C7600m1 c7600m12 = this.f37028x;
                    this.f37028x = m33062M(c7600m12.f36865b, m32614b, c7600m12.f36866c, c7600m12.f36867d, z11, 5);
                    if (z11) {
                        m33132t0(m32614b);
                    }
                    boolean[] zArr2 = new boolean[this.f37006b.length];
                    int i10 = 0;
                    while (true) {
                        InterfaceC7627v1[] interfaceC7627v1Arr = this.f37006b;
                        if (i10 >= interfaceC7627v1Arr.length) {
                            break;
                        }
                        InterfaceC7627v1 interfaceC7627v1 = interfaceC7627v1Arr[i10];
                        boolean m33024Q = m33024Q(interfaceC7627v1);
                        zArr2[i10] = m33024Q;
                        InterfaceC0120s0 interfaceC0120s0 = m32744p2.f36681c[i10];
                        if (m33024Q) {
                            if (interfaceC0120s0 != interfaceC7627v1.mo32707r()) {
                                m33119o(interfaceC7627v1);
                            } else if (zArr[i10]) {
                                interfaceC7627v1.mo32709t(this.f37001L);
                            }
                        }
                        i10++;
                    }
                    m33131t(zArr2);
                } else {
                    c7581g1.m32753z(m32744p);
                    if (m32744p.f36682d) {
                        m32744p.m32613a(m32632v, Math.max(m32744p.f36684f.f36698b, m32744p.m32635y(this.f37001L)), false);
                    }
                }
                m33052H(true);
                if (this.f37028x.f36868e != 4) {
                    m33076V();
                    m33121o1();
                    this.f37012h.mo22203i(2);
                    return;
                }
                return;
            }
            if (m32744p == m32745q) {
                z10 = false;
            }
        }
    }

    /* renamed from: q1 */
    public final void m33126q1(InterfaceC4712o<Boolean> interfaceC4712o, long j10) {
        synchronized (this) {
            long mo21913b = this.f37021q.mo21913b();
            boolean z10 = false;
            long j11 = j10;
            while (!interfaceC4712o.get().booleanValue() && j11 > 0) {
                try {
                    this.f37021q.mo21916e();
                    wait(j11);
                } catch (InterruptedException e10) {
                    z10 = true;
                }
                j11 = (mo21913b + j10) - this.f37021q.mo21913b();
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: r */
    public final void m33127r(int i10, boolean z10) {
        InterfaceC7627v1 interfaceC7627v1 = this.f37006b[i10];
        if (m33024Q(interfaceC7627v1)) {
            return;
        }
        C7569d1 m32745q = this.f37023s.m32745q();
        boolean z11 = m32745q == this.f37023s.m32744p();
        C9892p m32626o = m32745q.m32626o();
        C7636y1 c7636y1 = m32626o.f45510b[i10];
        C7629w0[] m33035y = m33035y(m32626o.f45511c[i10]);
        boolean z12 = m33094d1() && this.f37028x.f36868e == 3;
        boolean z13 = !z10 && z12;
        this.f36999J++;
        interfaceC7627v1.mo32705l(c7636y1, m33035y, m32745q.f36681c[i10], this.f37001L, z13, z11, m32745q.m32624m(), m32745q.m32623l());
        interfaceC7627v1.mo23432i(103, new a(this));
        this.f37019o.m32834d(interfaceC7627v1);
        if (z12) {
            interfaceC7627v1.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0177  */
    /* renamed from: r0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m33128r0(boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p267p6.C7620t0.m33128r0(boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: s */
    public final void m33129s() {
        m33131t(new boolean[this.f37006b.length]);
    }

    /* renamed from: s0 */
    public final void m33130s0() {
        C7569d1 m32744p = this.f37023s.m32744p();
        this.f36991B = m32744p != null && m32744p.f36684f.f36704h && this.f36990A;
    }

    /* renamed from: t */
    public final void m33131t(boolean[] zArr) {
        int i10;
        C7569d1 m32745q = this.f37023s.m32745q();
        C9892p m32626o = m32745q.m32626o();
        int i11 = 0;
        while (true) {
            if (i11 >= this.f37006b.length) {
                break;
            }
            if (!m32626o.m41750c(i11)) {
                this.f37006b[i11].reset();
            }
            i11++;
        }
        for (i10 = 0; i10 < this.f37006b.length; i10++) {
            if (m32626o.m41750c(i10)) {
                m33127r(i10, zArr[i10]);
            }
        }
        m32745q.f36685g = true;
    }

    /* renamed from: t0 */
    public final void m33132t0(long j10) {
        C7569d1 m32744p = this.f37023s.m32744p();
        if (m32744p != null) {
            j10 = m32744p.m32636z(j10);
        }
        this.f37001L = j10;
        this.f37019o.m32835e(j10);
        for (InterfaceC7627v1 interfaceC7627v1 : this.f37006b) {
            if (m33024Q(interfaceC7627v1)) {
                interfaceC7627v1.mo32709t(this.f37001L);
            }
        }
        m33097f0();
    }

    /* renamed from: u */
    public final void m33133u(InterfaceC7627v1 interfaceC7627v1) {
        if (interfaceC7627v1.getState() == 2) {
            interfaceC7627v1.stop();
        }
    }

    /* renamed from: v */
    public void m33134v(long j10) {
        this.f37005P = j10;
    }

    /* renamed from: w */
    public final AbstractC4834t<C7839a> m33135w(InterfaceC9884h[] interfaceC9884hArr) {
        boolean z10;
        AbstractC4834t.a aVar = new AbstractC4834t.a();
        int length = interfaceC9884hArr.length;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            z10 = z11;
            if (i10 >= length) {
                break;
            }
            InterfaceC9884h interfaceC9884h = interfaceC9884hArr[i10];
            boolean z12 = z10;
            if (interfaceC9884h != null) {
                C7839a c7839a = interfaceC9884h.mo41607e(0).f37084k;
                if (c7839a == null) {
                    aVar.m24554d(new C7839a(new C7839a.b[0]));
                    z12 = z10;
                } else {
                    aVar.m24554d(c7839a);
                    z12 = true;
                }
            }
            i10++;
            z11 = z12;
        }
        return z10 ? aVar.m24555e() : AbstractC4834t.m24539E();
    }

    /* renamed from: w0 */
    public final void m33136w0(AbstractC7574e2 abstractC7574e2, AbstractC7574e2 abstractC7574e22) {
        if (abstractC7574e2.m32667q() && abstractC7574e22.m32667q()) {
            return;
        }
        for (int size = this.f37020p.size() - 1; size >= 0; size--) {
            if (!m33033v0(this.f37020p.get(size), abstractC7574e2, abstractC7574e22, this.f36994E, this.f36995F, this.f37015k, this.f37016l)) {
                this.f37020p.get(size).f37040b.m33018k(false);
                this.f37020p.remove(size);
            }
        }
        Collections.sort(this.f37020p);
    }

    /* renamed from: x */
    public final long m33137x() {
        C7600m1 c7600m1 = this.f37028x;
        return m33138z(c7600m1.f36864a, c7600m1.f36865b.f544a, c7600m1.f36882s);
    }

    /* renamed from: z */
    public final long m33138z(AbstractC7574e2 abstractC7574e2, Object obj, long j10) {
        abstractC7574e2.m32666n(abstractC7574e2.mo32326h(obj, this.f37016l).f36711c, this.f37015k);
        AbstractC7574e2.c cVar = this.f37015k;
        if (cVar.f36725f == -9223372036854775807L || !cVar.m32694f()) {
            return -9223372036854775807L;
        }
        AbstractC7574e2.c cVar2 = this.f37015k;
        if (cVar2.f36728i) {
            return C7583h.m32760d(cVar2.m32689a() - this.f37015k.f36725f) - (j10 + this.f37016l.m32683o());
        }
        return -9223372036854775807L;
    }
}
