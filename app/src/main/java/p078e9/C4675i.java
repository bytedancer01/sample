package p078e9;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.net.nntp.NNTPReply;
import org.joda.time.DateTimeConstants;
import p059d9.C4349a;
import p059d9.C4391u0;
import p059d9.C4392v;
import p059d9.C4398y;
import p059d9.C4400z;
import p059d9.C4401z0;
import p078e9.InterfaceC4668c0;
import p267p6.C7607p;
import p267p6.C7629w0;
import p267p6.C7630w1;
import p267p6.C7632x0;
import p268p7.AbstractC7654o;
import p268p7.C7652m;
import p268p7.C7653n;
import p268p7.C7661v;
import p268p7.InterfaceC7651l;
import p268p7.InterfaceC7656q;
import p332t6.C8636d;
import p332t6.C8638f;
import p332t6.C8639g;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:e9/i.class
 */
/* renamed from: e9.i */
/* loaded from: combined.jar:classes2.jar:e9/i.class */
public class C4675i extends AbstractC7654o {

    /* renamed from: x1 */
    public static final int[] f27592x1 = {1920, 1600, DateTimeConstants.MINUTES_PER_DAY, 1280, 960, 854, 640, 540, NNTPReply.AUTHENTICATION_REQUIRED};

    /* renamed from: y1 */
    public static boolean f27593y1;

    /* renamed from: z1 */
    public static boolean f27594z1;

    /* renamed from: O0 */
    public final Context f27595O0;

    /* renamed from: P0 */
    public final C4681o f27596P0;

    /* renamed from: Q0 */
    public final InterfaceC4668c0.a f27597Q0;

    /* renamed from: R0 */
    public final long f27598R0;

    /* renamed from: S0 */
    public final int f27599S0;

    /* renamed from: T0 */
    public final boolean f27600T0;

    /* renamed from: U0 */
    public a f27601U0;

    /* renamed from: V0 */
    public boolean f27602V0;

    /* renamed from: W0 */
    public boolean f27603W0;

    /* renamed from: X0 */
    public Surface f27604X0;

    /* renamed from: Y0 */
    public C4671e f27605Y0;

    /* renamed from: Z0 */
    public boolean f27606Z0;

    /* renamed from: a1 */
    public int f27607a1;

    /* renamed from: b1 */
    public boolean f27608b1;

    /* renamed from: c1 */
    public boolean f27609c1;

    /* renamed from: d1 */
    public boolean f27610d1;

    /* renamed from: e1 */
    public long f27611e1;

    /* renamed from: f1 */
    public long f27612f1;

    /* renamed from: g1 */
    public long f27613g1;

    /* renamed from: h1 */
    public int f27614h1;

    /* renamed from: i1 */
    public int f27615i1;

    /* renamed from: j1 */
    public int f27616j1;

    /* renamed from: k1 */
    public long f27617k1;

    /* renamed from: l1 */
    public long f27618l1;

    /* renamed from: m1 */
    public long f27619m1;

    /* renamed from: n1 */
    public int f27620n1;

    /* renamed from: o1 */
    public int f27621o1;

    /* renamed from: p1 */
    public int f27622p1;

    /* renamed from: q1 */
    public int f27623q1;

    /* renamed from: r1 */
    public float f27624r1;

    /* renamed from: s1 */
    public C4670d0 f27625s1;

    /* renamed from: t1 */
    public boolean f27626t1;

    /* renamed from: u1 */
    public int f27627u1;

    /* renamed from: v1 */
    public b f27628v1;

    /* renamed from: w1 */
    public InterfaceC4679m f27629w1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:e9/i$a.class
     */
    /* renamed from: e9.i$a */
    /* loaded from: combined.jar:classes2.jar:e9/i$a.class */
    public static final class a {

        /* renamed from: a */
        public final int f27630a;

        /* renamed from: b */
        public final int f27631b;

        /* renamed from: c */
        public final int f27632c;

        public a(int i10, int i11, int i12) {
            this.f27630a = i10;
            this.f27631b = i11;
            this.f27632c = i12;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:e9/i$b.class
     */
    /* renamed from: e9.i$b */
    /* loaded from: combined.jar:classes2.jar:e9/i$b.class */
    public final class b implements InterfaceC7651l.c, Handler.Callback {

        /* renamed from: b */
        public final Handler f27633b;

        /* renamed from: c */
        public final C4675i f27634c;

        public b(C4675i c4675i, InterfaceC7651l interfaceC7651l) {
            this.f27634c = c4675i;
            Handler m22423z = C4401z0.m22423z(this);
            this.f27633b = m22423z;
            interfaceC7651l.mo33241b(this, m22423z);
        }

        @Override // p268p7.InterfaceC7651l.c
        /* renamed from: a */
        public void mo23572a(InterfaceC7651l interfaceC7651l, long j10, long j11) {
            if (C4401z0.f26679a >= 30) {
                m23573b(j10);
            } else {
                this.f27633b.sendMessageAtFrontOfQueue(Message.obtain(this.f27633b, 0, (int) (j10 >> 32), (int) j10));
            }
        }

        /* renamed from: b */
        public final void m23573b(long j10) {
            C4675i c4675i = this.f27634c;
            if (this != c4675i.f27628v1) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                c4675i.m23540M1();
                return;
            }
            try {
                c4675i.m23538L1(j10);
            } catch (C7607p e10) {
                this.f27634c.m33376c1(e10);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            m23573b(C4401z0.m22376d1(message.arg1, message.arg2));
            return true;
        }
    }

    public C4675i(Context context, InterfaceC7651l.b bVar, InterfaceC7656q interfaceC7656q, long j10, boolean z10, Handler handler, InterfaceC4668c0 interfaceC4668c0, int i10) {
        super(2, bVar, interfaceC7656q, z10, 30.0f);
        this.f27598R0 = j10;
        this.f27599S0 = i10;
        Context applicationContext = context.getApplicationContext();
        this.f27595O0 = applicationContext;
        this.f27596P0 = new C4681o(applicationContext);
        this.f27597Q0 = new InterfaceC4668c0.a(handler, interfaceC4668c0);
        this.f27600T0 = m23517s1();
        this.f27612f1 = -9223372036854775807L;
        this.f27621o1 = -1;
        this.f27622p1 = -1;
        this.f27624r1 = -1.0f;
        this.f27607a1 = 1;
        this.f27627u1 = 0;
        m23565p1();
    }

    public C4675i(Context context, InterfaceC7656q interfaceC7656q, long j10, boolean z10, Handler handler, InterfaceC4668c0 interfaceC4668c0, int i10) {
        this(context, InterfaceC7651l.b.f37198a, interfaceC7656q, j10, z10, handler, interfaceC4668c0, i10);
    }

    /* renamed from: B1 */
    public static boolean m23511B1(long j10) {
        return j10 < -30000;
    }

    /* renamed from: C1 */
    public static boolean m23512C1(long j10) {
        return j10 < -500000;
    }

    /* renamed from: P1 */
    public static void m23513P1(InterfaceC7651l interfaceC7651l, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        interfaceC7651l.mo33248i(bundle);
    }

    /* renamed from: r1 */
    public static void m23516r1(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    /* renamed from: s1 */
    public static boolean m23517s1() {
        return "NVIDIA".equals(C4401z0.f26681c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x100f, code lost:
    
        if (r0.equals("NX573J") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x1307, code lost:
    
        if (r0.equals("AFTN") == false) goto L614;
     */
    /* renamed from: u1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m23518u1() {
        /*
            Method dump skipped, instructions count: 4947
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p078e9.C4675i.m23518u1():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: v1 */
    public static int m23519v1(C7653n c7653n, String str, int i10, int i11) {
        boolean z10;
        int m22395l;
        int i12;
        if (i10 == -1 || i11 == -1) {
            return -1;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals("video/dolby-vision")) {
                    z10 = false;
                    break;
                }
                z10 = -1;
                break;
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    z10 = true;
                    break;
                }
                z10 = -1;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    z10 = 2;
                    break;
                }
                z10 = -1;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    z10 = 3;
                    break;
                }
                z10 = -1;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    z10 = 4;
                    break;
                }
                z10 = -1;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    z10 = 5;
                    break;
                }
                z10 = -1;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    z10 = 6;
                    break;
                }
                z10 = -1;
                break;
            default:
                z10 = -1;
                break;
        }
        switch (z10) {
            case false:
            case true:
                String str2 = C4401z0.f26682d;
                if ("BRAVIA 4K 2015".equals(str2)) {
                    return -1;
                }
                if ("Amazon".equals(C4401z0.f26681c)) {
                    if ("KFSOWI".equals(str2)) {
                        return -1;
                    }
                    if ("AFTS".equals(str2) && c7653n.f37207g) {
                        return -1;
                    }
                }
                m22395l = C4401z0.m22395l(i10, 16) * C4401z0.m22395l(i11, 16) * 16 * 16;
                i12 = 2;
                return (m22395l * 3) / (i12 * 2);
            case true:
            case true:
            case true:
                m22395l = i10 * i11;
                i12 = 2;
                return (m22395l * 3) / (i12 * 2);
            case true:
            case true:
                m22395l = i10 * i11;
                i12 = 4;
                return (m22395l * 3) / (i12 * 2);
            default:
                return -1;
        }
    }

    /* renamed from: w1 */
    public static Point m23520w1(C7653n c7653n, C7629w0 c7629w0) {
        int i10 = c7629w0.f37092s;
        int i11 = c7629w0.f37091r;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : f27592x1) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                return null;
            }
            if (C4401z0.f26679a >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point m33327b = c7653n.m33327b(i15, i13);
                if (c7653n.m33336t(m33327b.x, m33327b.y, c7629w0.f37093t)) {
                    return m33327b;
                }
            } else {
                try {
                    int m22395l = C4401z0.m22395l(i13, 16) * 16;
                    int m22395l2 = C4401z0.m22395l(i14, 16) * 16;
                    if (m22395l * m22395l2 <= C7661v.m33417M()) {
                        int i16 = z10 ? m22395l2 : m22395l;
                        if (!z10) {
                            m22395l = m22395l2;
                        }
                        return new Point(i16, m22395l);
                    }
                } catch (C7661v.c e10) {
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: y1 */
    public static List<C7653n> m23521y1(InterfaceC7656q interfaceC7656q, C7629w0 c7629w0, boolean z10, boolean z11) {
        Pair<Integer, Integer> m33437p;
        String str;
        String str2 = c7629w0.f37086m;
        if (str2 == null) {
            return Collections.emptyList();
        }
        List<C7653n> m33441t = C7661v.m33441t(interfaceC7656q.mo33403a(str2, z10, z11), c7629w0);
        if ("video/dolby-vision".equals(str2) && (m33437p = C7661v.m33437p(c7629w0)) != null) {
            int intValue = ((Integer) m33437p.first).intValue();
            if (intValue != 16 && intValue != 256) {
                str = intValue == 512 ? "video/avc" : "video/hevc";
            }
            m33441t.addAll(interfaceC7656q.mo33403a(str, z10, z11));
        }
        return Collections.unmodifiableList(m33441t);
    }

    /* renamed from: z1 */
    public static int m23522z1(C7653n c7653n, C7629w0 c7629w0) {
        if (c7629w0.f37087n == -1) {
            return m23519v1(c7653n, c7629w0.f37086m, c7629w0.f37091r, c7629w0.f37092s);
        }
        int size = c7629w0.f37088o.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += c7629w0.f37088o.get(i11).length;
        }
        return c7629w0.f37087n + i10;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    /* renamed from: A1 */
    public MediaFormat m23523A1(C7629w0 c7629w0, String str, a aVar, float f10, boolean z10, int i10) {
        Pair<Integer, Integer> m33437p;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(IMediaFormat.KEY_MIME, str);
        mediaFormat.setInteger("width", c7629w0.f37091r);
        mediaFormat.setInteger("height", c7629w0.f37092s);
        C4398y.m22292e(mediaFormat, c7629w0.f37088o);
        C4398y.m22290c(mediaFormat, "frame-rate", c7629w0.f37093t);
        C4398y.m22291d(mediaFormat, "rotation-degrees", c7629w0.f37094u);
        C4398y.m22289b(mediaFormat, c7629w0.f37098y);
        if ("video/dolby-vision".equals(c7629w0.f37086m) && (m33437p = C7661v.m33437p(c7629w0)) != null) {
            C4398y.m22291d(mediaFormat, "profile", ((Integer) m33437p.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f27630a);
        mediaFormat.setInteger("max-height", aVar.f27631b);
        C4398y.m22291d(mediaFormat, "max-input-size", aVar.f27632c);
        if (C4401z0.f26679a >= 23) {
            mediaFormat.setInteger(LogFactory.PRIORITY_KEY, 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            m23516r1(mediaFormat, i10);
        }
        return mediaFormat;
    }

    @Override // p268p7.AbstractC7654o, p267p6.AbstractC7575f
    /* renamed from: C */
    public void mo23405C() {
        m23565p1();
        m23563o1();
        this.f27606Z0 = false;
        this.f27596P0.m23585g();
        this.f27628v1 = null;
        try {
            super.mo23405C();
        } finally {
            this.f27597Q0.m23484m(this.f37232J0);
        }
    }

    @Override // p268p7.AbstractC7654o, p267p6.AbstractC7575f
    /* renamed from: D */
    public void mo23406D(boolean z10, boolean z11) {
        super.mo23406D(z10, z11);
        boolean z12 = m32713x().f37138a;
        C4349a.m21884g((z12 && this.f27627u1 == 0) ? false : true);
        if (this.f27626t1 != z12) {
            this.f27626t1 = z12;
            m33364U0();
        }
        this.f27597Q0.m23486o(this.f37232J0);
        this.f27596P0.m23586h();
        this.f27609c1 = z11;
        this.f27610d1 = false;
    }

    /* renamed from: D1 */
    public boolean m23524D1(long j10, boolean z10) {
        int m32699K = m32699K(j10);
        if (m32699K == 0) {
            return false;
        }
        C8636d c8636d = this.f37232J0;
        c8636d.f40323i++;
        int i10 = this.f27616j1 + m32699K;
        if (z10) {
            c8636d.f40320f += i10;
        } else {
            m23557Y1(i10);
        }
        m33384j0();
        return true;
    }

    @Override // p268p7.AbstractC7654o, p267p6.AbstractC7575f
    /* renamed from: E */
    public void mo23407E(long j10, boolean z10) {
        super.mo23407E(j10, z10);
        m23563o1();
        this.f27596P0.m23590l();
        this.f27617k1 = -9223372036854775807L;
        this.f27611e1 = -9223372036854775807L;
        this.f27615i1 = 0;
        if (z10) {
            m23547Q1();
        } else {
            this.f27612f1 = -9223372036854775807L;
        }
    }

    /* renamed from: E1 */
    public final void m23525E1() {
        if (this.f27614h1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f27597Q0.m23485n(this.f27614h1, elapsedRealtime - this.f27613g1);
            this.f27614h1 = 0;
            this.f27613g1 = elapsedRealtime;
        }
    }

    @Override // p268p7.AbstractC7654o, p267p6.AbstractC7575f
    @TargetApi(17)
    /* renamed from: F */
    public void mo23526F() {
        try {
            super.mo23526F();
            C4671e c4671e = this.f27605Y0;
            if (c4671e != null) {
                if (this.f27604X0 == c4671e) {
                    this.f27604X0 = null;
                }
                c4671e.release();
                this.f27605Y0 = null;
            }
        } catch (Throwable th2) {
            if (this.f27605Y0 != null) {
                Surface surface = this.f27604X0;
                C4671e c4671e2 = this.f27605Y0;
                if (surface == c4671e2) {
                    this.f27604X0 = null;
                }
                c4671e2.release();
                this.f27605Y0 = null;
            }
            throw th2;
        }
    }

    /* renamed from: F1 */
    public void m23527F1() {
        this.f27610d1 = true;
        if (this.f27608b1) {
            return;
        }
        this.f27608b1 = true;
        this.f27597Q0.m23478A(this.f27604X0);
        this.f27606Z0 = true;
    }

    @Override // p268p7.AbstractC7654o, p267p6.AbstractC7575f
    /* renamed from: G */
    public void mo23408G() {
        super.mo23408G();
        this.f27614h1 = 0;
        this.f27613g1 = SystemClock.elapsedRealtime();
        this.f27618l1 = SystemClock.elapsedRealtime() * 1000;
        this.f27619m1 = 0L;
        this.f27620n1 = 0;
        this.f27596P0.m23591m();
    }

    /* renamed from: G1 */
    public final void m23528G1() {
        int i10 = this.f27620n1;
        if (i10 != 0) {
            this.f27597Q0.m23479B(this.f27619m1, i10);
            this.f27619m1 = 0L;
            this.f27620n1 = 0;
        }
    }

    @Override // p268p7.AbstractC7654o, p267p6.AbstractC7575f
    /* renamed from: H */
    public void mo23409H() {
        this.f27612f1 = -9223372036854775807L;
        m23525E1();
        m23528G1();
        this.f27596P0.m23592n();
        super.mo23409H();
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: H0 */
    public void mo23529H0(Exception exc) {
        C4392v.m22271e("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f27597Q0.m23480C(exc);
    }

    /* renamed from: H1 */
    public final void m23530H1() {
        int i10 = this.f27621o1;
        if (i10 == -1 && this.f27622p1 == -1) {
            return;
        }
        C4670d0 c4670d0 = this.f27625s1;
        if (c4670d0 != null && c4670d0.f27559a == i10 && c4670d0.f27560b == this.f27622p1 && c4670d0.f27561c == this.f27623q1 && c4670d0.f27562d == this.f27624r1) {
            return;
        }
        C4670d0 c4670d02 = new C4670d0(this.f27621o1, this.f27622p1, this.f27623q1, this.f27624r1);
        this.f27625s1 = c4670d02;
        this.f27597Q0.m23481D(c4670d02);
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: I0 */
    public void mo23531I0(String str, long j10, long j11) {
        this.f27597Q0.m23482k(str, j10, j11);
        this.f27602V0 = m23566q1(str);
        this.f27603W0 = ((C7653n) C4349a.m21882e(m33391n0())).m33334n();
        if (C4401z0.f26679a < 23 || !this.f27626t1) {
            return;
        }
        this.f27628v1 = new b(this, (InterfaceC7651l) C4349a.m21882e(m33390m0()));
    }

    /* renamed from: I1 */
    public final void m23532I1() {
        if (this.f27606Z0) {
            this.f27597Q0.m23478A(this.f27604X0);
        }
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: J0 */
    public void mo23533J0(String str) {
        this.f27597Q0.m23483l(str);
    }

    /* renamed from: J1 */
    public final void m23534J1() {
        C4670d0 c4670d0 = this.f27625s1;
        if (c4670d0 != null) {
            this.f27597Q0.m23481D(c4670d0);
        }
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: K0 */
    public C8639g mo23535K0(C7632x0 c7632x0) {
        C8639g mo23535K0 = super.mo23535K0(c7632x0);
        this.f27597Q0.m23487p(c7632x0.f37132b, mo23535K0);
        return mo23535K0;
    }

    /* renamed from: K1 */
    public final void m23536K1(long j10, long j11, C7629w0 c7629w0) {
        InterfaceC4679m interfaceC4679m = this.f27629w1;
        if (interfaceC4679m != null) {
            interfaceC4679m.mo23576a(j10, j11, c7629w0, m33392q0());
        }
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: L0 */
    public void mo23537L0(C7629w0 c7629w0, MediaFormat mediaFormat) {
        InterfaceC7651l m33390m0 = m33390m0();
        if (m33390m0 != null) {
            m33390m0.mo33243d(this.f27607a1);
        }
        if (this.f27626t1) {
            this.f27621o1 = c7629w0.f37091r;
            this.f27622p1 = c7629w0.f37092s;
        } else {
            C4349a.m21882e(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f27621o1 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.f27622p1 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f10 = c7629w0.f37095v;
        this.f27624r1 = f10;
        if (C4401z0.f26679a >= 21) {
            int i10 = c7629w0.f37094u;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f27621o1;
                this.f27621o1 = this.f27622p1;
                this.f27622p1 = i11;
                this.f27624r1 = 1.0f / f10;
            }
        } else {
            this.f27623q1 = c7629w0.f37094u;
        }
        this.f27596P0.m23587i(c7629w0.f37093t);
    }

    /* renamed from: L1 */
    public void m23538L1(long j10) {
        m33389l1(j10);
        m23530H1();
        this.f37232J0.f40319e++;
        m23527F1();
        mo23539M0(j10);
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: M0 */
    public void mo23539M0(long j10) {
        super.mo23539M0(j10);
        if (this.f27626t1) {
            return;
        }
        this.f27616j1--;
    }

    /* renamed from: M1 */
    public final void m23540M1() {
        m33374b1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if (r11.f37092s > r0.f27631b) goto L6;
     */
    @Override // p268p7.AbstractC7654o
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p332t6.C8639g mo23541N(p268p7.C7653n r9, p267p6.C7629w0 r10, p267p6.C7629w0 r11) {
        /*
            r8 = this;
            r0 = r9
            r1 = r10
            r2 = r11
            t6.g r0 = r0.m33328e(r1, r2)
            r14 = r0
            r0 = r14
            int r0 = r0.f40339e
            r13 = r0
            r0 = r11
            int r0 = r0.f37091r
            r12 = r0
            r0 = r8
            e9.i$a r0 = r0.f27601U0
            r15 = r0
            r0 = r12
            r1 = r15
            int r1 = r1.f27630a
            if (r0 > r1) goto L35
            r0 = r13
            r12 = r0
            r0 = r11
            int r0 = r0.f37092s
            r1 = r15
            int r1 = r1.f27631b
            if (r0 <= r1) goto L3d
        L35:
            r0 = r13
            r1 = 256(0x100, float:3.59E-43)
            r0 = r0 | r1
            r12 = r0
        L3d:
            r0 = r12
            r13 = r0
            r0 = r9
            r1 = r11
            int r0 = m23522z1(r0, r1)
            r1 = r8
            e9.i$a r1 = r1.f27601U0
            int r1 = r1.f27632c
            if (r0 <= r1) goto L57
            r0 = r12
            r1 = 64
            r0 = r0 | r1
            r13 = r0
        L57:
            r0 = r9
            java.lang.String r0 = r0.f37201a
            r9 = r0
            r0 = r13
            if (r0 == 0) goto L67
            r0 = 0
            r12 = r0
            goto L6e
        L67:
            r0 = r14
            int r0 = r0.f40338d
            r12 = r0
        L6e:
            t6.g r0 = new t6.g
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p078e9.C4675i.mo23541N(p7.n, p6.w0, p6.w0):t6.g");
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: N0 */
    public void mo23542N0() {
        super.mo23542N0();
        m23563o1();
    }

    /* renamed from: N1 */
    public void m23543N1(InterfaceC7651l interfaceC7651l, int i10, long j10) {
        m23530H1();
        C4391u0.m22263a("releaseOutputBuffer");
        interfaceC7651l.mo33252m(i10, true);
        C4391u0.m22265c();
        this.f27618l1 = SystemClock.elapsedRealtime() * 1000;
        this.f37232J0.f40319e++;
        this.f27615i1 = 0;
        m23527F1();
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: O0 */
    public void mo23544O0(C8638f c8638f) {
        boolean z10 = this.f27626t1;
        if (!z10) {
            this.f27616j1++;
        }
        if (C4401z0.f26679a >= 23 || !z10) {
            return;
        }
        m23538L1(c8638f.f40329e);
    }

    /* renamed from: O1 */
    public void m23545O1(InterfaceC7651l interfaceC7651l, int i10, long j10, long j11) {
        m23530H1();
        C4391u0.m22263a("releaseOutputBuffer");
        interfaceC7651l.mo33249j(i10, j11);
        C4391u0.m22265c();
        this.f27618l1 = SystemClock.elapsedRealtime() * 1000;
        this.f37232J0.f40319e++;
        this.f27615i1 = 0;
        m23527F1();
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: Q0 */
    public boolean mo23546Q0(long j10, long j11, InterfaceC7651l interfaceC7651l, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, C7629w0 c7629w0) {
        long j13;
        long j14;
        C4349a.m21882e(interfaceC7651l);
        if (this.f27611e1 == -9223372036854775807L) {
            this.f27611e1 = j10;
        }
        if (j12 != this.f27617k1) {
            this.f27596P0.m23588j(j12);
            this.f27617k1 = j12;
        }
        long m33394u0 = m33394u0();
        long j15 = j12 - m33394u0;
        if (z10 && !z11) {
            m23556X1(interfaceC7651l, i10, j15);
            return true;
        }
        double m33395v0 = m33395v0();
        boolean z12 = getState() == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j16 = (long) ((j12 - j10) / m33395v0);
        long j17 = j16;
        if (z12) {
            j17 = j16 - (elapsedRealtime - j11);
        }
        if (this.f27604X0 == this.f27605Y0) {
            if (!m23511B1(j17)) {
                return false;
            }
            m23556X1(interfaceC7651l, i10, j15);
            m23558Z1(j17);
            return true;
        }
        if (this.f27612f1 == -9223372036854775807L && j10 >= m33394u0 && ((this.f27610d1 ? !this.f27608b1 : !(!z12 && !this.f27609c1)) || (z12 && m23552V1(j17, elapsedRealtime - this.f27618l1)))) {
            j14 = System.nanoTime();
            m23536K1(j15, j14, c7629w0);
            j13 = j17;
            if (C4401z0.f26679a >= 21) {
                j13 = j17;
                m23545O1(interfaceC7651l, i10, j15, j14);
            }
            m23543N1(interfaceC7651l, i10, j15);
        } else {
            if (!z12 || j10 == this.f27611e1) {
                return false;
            }
            long nanoTime = System.nanoTime();
            long m23583b = this.f27596P0.m23583b((j17 * 1000) + nanoTime);
            long j18 = (m23583b - nanoTime) / 1000;
            boolean z13 = this.f27612f1 != -9223372036854775807L;
            if (m23550T1(j18, j11, z11) && m23524D1(j10, z13)) {
                return false;
            }
            if (m23551U1(j18, j11, z11)) {
                if (z13) {
                    m23556X1(interfaceC7651l, i10, j15);
                } else {
                    m23569t1(interfaceC7651l, i10, j15);
                }
                j13 = j18;
            } else {
                j13 = j18;
                if (C4401z0.f26679a >= 21) {
                    if (j13 >= 50000) {
                        return false;
                    }
                    m23536K1(j15, m23583b, c7629w0);
                    j14 = m23583b;
                    m23545O1(interfaceC7651l, i10, j15, j14);
                } else {
                    if (j13 >= 30000) {
                        return false;
                    }
                    if (j13 > 11000) {
                        try {
                            Thread.sleep((j13 - 10000) / 1000);
                        } catch (InterruptedException e10) {
                            Thread.currentThread().interrupt();
                            return false;
                        }
                    }
                    m23536K1(j15, m23583b, c7629w0);
                    m23543N1(interfaceC7651l, i10, j15);
                }
            }
        }
        m23558Z1(j13);
        return true;
    }

    /* renamed from: Q1 */
    public final void m23547Q1() {
        this.f27612f1 = this.f27598R0 > 0 ? SystemClock.elapsedRealtime() + this.f27598R0 : -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [android.view.Surface] */
    /* renamed from: R1 */
    public final void m23548R1(Object obj) {
        C4671e c4671e = obj instanceof Surface ? (Surface) obj : null;
        C4671e c4671e2 = c4671e;
        if (c4671e == null) {
            c4671e2 = this.f27605Y0;
            if (c4671e2 == null) {
                C7653n m33391n0 = m33391n0();
                c4671e2 = c4671e;
                if (m33391n0 != null) {
                    c4671e2 = c4671e;
                    if (m23554W1(m33391n0)) {
                        c4671e2 = C4671e.m23491j(this.f27595O0, m33391n0.f37207g);
                        this.f27605Y0 = c4671e2;
                    }
                }
            }
        }
        if (this.f27604X0 == c4671e2) {
            if (c4671e2 == null || c4671e2 == this.f27605Y0) {
                return;
            }
            m23534J1();
            m23532I1();
            return;
        }
        this.f27604X0 = c4671e2;
        this.f27596P0.m23593o(c4671e2);
        this.f27606Z0 = false;
        int state = getState();
        InterfaceC7651l m33390m0 = m33390m0();
        if (m33390m0 != null) {
            if (C4401z0.f26679a < 23 || c4671e2 == null || this.f27602V0) {
                m33364U0();
                m33355E0();
            } else {
                m23549S1(m33390m0, c4671e2);
            }
        }
        if (c4671e2 == null || c4671e2 == this.f27605Y0) {
            m23565p1();
            m23563o1();
            return;
        }
        m23534J1();
        m23563o1();
        if (state == 2) {
            m23547Q1();
        }
    }

    /* renamed from: S1 */
    public void m23549S1(InterfaceC7651l interfaceC7651l, Surface surface) {
        interfaceC7651l.mo33245f(surface);
    }

    /* renamed from: T1 */
    public boolean m23550T1(long j10, long j11, boolean z10) {
        return m23512C1(j10) && !z10;
    }

    /* renamed from: U1 */
    public boolean m23551U1(long j10, long j11, boolean z10) {
        return m23511B1(j10) && !z10;
    }

    /* renamed from: V1 */
    public boolean m23552V1(long j10, long j11) {
        return m23511B1(j10) && j11 > 100000;
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: W0 */
    public void mo23553W0() {
        super.mo23553W0();
        this.f27616j1 = 0;
    }

    /* renamed from: W1 */
    public final boolean m23554W1(C7653n c7653n) {
        return C4401z0.f26679a >= 23 && !this.f27626t1 && !m23566q1(c7653n.f37201a) && (!c7653n.f37207g || C4671e.m23490c(this.f27595O0));
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: X */
    public C7652m mo23555X(Throwable th2, C7653n c7653n) {
        return new C4674h(th2, c7653n, this.f27604X0);
    }

    /* renamed from: X1 */
    public void m23556X1(InterfaceC7651l interfaceC7651l, int i10, long j10) {
        C4391u0.m22263a("skipVideoBuffer");
        interfaceC7651l.mo33252m(i10, false);
        C4391u0.m22265c();
        this.f37232J0.f40320f++;
    }

    /* renamed from: Y1 */
    public void m23557Y1(int i10) {
        C8636d c8636d = this.f37232J0;
        c8636d.f40321g += i10;
        this.f27614h1 += i10;
        int i11 = this.f27615i1 + i10;
        this.f27615i1 = i11;
        c8636d.f40322h = Math.max(i11, c8636d.f40322h);
        int i12 = this.f27599S0;
        if (i12 <= 0 || this.f27614h1 < i12) {
            return;
        }
        m23525E1();
    }

    /* renamed from: Z1 */
    public void m23558Z1(long j10) {
        this.f37232J0.m37076a(j10);
        this.f27619m1 += j10;
        this.f27620n1++;
    }

    @Override // p268p7.AbstractC7654o, p267p6.InterfaceC7627v1
    /* renamed from: e */
    public boolean mo23427e() {
        C4671e c4671e;
        if (super.mo23427e() && (this.f27608b1 || (((c4671e = this.f27605Y0) != null && this.f27604X0 == c4671e) || m33390m0() == null || this.f27626t1))) {
            this.f27612f1 = -9223372036854775807L;
            return true;
        }
        if (this.f27612f1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f27612f1) {
            return true;
        }
        this.f27612f1 = -9223372036854775807L;
        return false;
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: f1 */
    public boolean mo23559f1(C7653n c7653n) {
        return this.f27604X0 != null || m23554W1(c7653n);
    }

    @Override // p267p6.InterfaceC7627v1, p267p6.InterfaceC7633x1
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: h1 */
    public int mo23560h1(InterfaceC7656q interfaceC7656q, C7629w0 c7629w0) {
        if (!C4400z.m22311s(c7629w0.f37086m)) {
            return C7630w1.m33226a(0);
        }
        boolean z10 = c7629w0.f37089p != null;
        List<C7653n> m23521y1 = m23521y1(interfaceC7656q, c7629w0, z10, false);
        List<C7653n> list = m23521y1;
        if (z10) {
            list = m23521y1;
            if (m23521y1.isEmpty()) {
                list = m23521y1(interfaceC7656q, c7629w0, false, false);
            }
        }
        if (list.isEmpty()) {
            return C7630w1.m33226a(1);
        }
        if (!AbstractC7654o.m33353i1(c7629w0)) {
            return C7630w1.m33226a(2);
        }
        C7653n c7653n = list.get(0);
        boolean m33333m = c7653n.m33333m(c7629w0);
        int i10 = c7653n.m33335o(c7629w0) ? 16 : 8;
        int i11 = 0;
        if (m33333m) {
            List<C7653n> m23521y12 = m23521y1(interfaceC7656q, c7629w0, z10, true);
            i11 = 0;
            if (!m23521y12.isEmpty()) {
                C7653n c7653n2 = m23521y12.get(0);
                i11 = 0;
                if (c7653n2.m33333m(c7629w0)) {
                    i11 = 0;
                    if (c7653n2.m33335o(c7629w0)) {
                        i11 = 32;
                    }
                }
            }
        }
        return C7630w1.m33227b(m33333m ? 4 : 3, i10, i11);
    }

    @Override // p267p6.AbstractC7575f, p267p6.C7615r1.b
    /* renamed from: i */
    public void mo23432i(int i10, Object obj) {
        if (i10 == 1) {
            m23548R1(obj);
            return;
        }
        if (i10 == 4) {
            this.f27607a1 = ((Integer) obj).intValue();
            InterfaceC7651l m33390m0 = m33390m0();
            if (m33390m0 != null) {
                m33390m0.mo33243d(this.f27607a1);
                return;
            }
            return;
        }
        if (i10 == 6) {
            this.f27629w1 = (InterfaceC4679m) obj;
            return;
        }
        if (i10 != 102) {
            super.mo23432i(i10, obj);
            return;
        }
        int intValue = ((Integer) obj).intValue();
        if (this.f27627u1 != intValue) {
            this.f27627u1 = intValue;
            if (this.f27626t1) {
                m33364U0();
            }
        }
    }

    @Override // p268p7.AbstractC7654o, p267p6.AbstractC7575f, p267p6.InterfaceC7627v1
    /* renamed from: o */
    public void mo23561o(float f10, float f11) {
        super.mo23561o(f10, f11);
        this.f27596P0.m23589k(f10);
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: o0 */
    public boolean mo23562o0() {
        return this.f27626t1 && C4401z0.f26679a < 23;
    }

    /* renamed from: o1 */
    public final void m23563o1() {
        InterfaceC7651l m33390m0;
        this.f27608b1 = false;
        if (C4401z0.f26679a < 23 || !this.f27626t1 || (m33390m0 = m33390m0()) == null) {
            return;
        }
        this.f27628v1 = new b(this, m33390m0);
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: p0 */
    public float mo23564p0(float f10, C7629w0 c7629w0, C7629w0[] c7629w0Arr) {
        float f11;
        int length = c7629w0Arr.length;
        int i10 = 0;
        float f12 = -1.0f;
        while (true) {
            f11 = f12;
            if (i10 >= length) {
                break;
            }
            float f13 = c7629w0Arr[i10].f37093t;
            float f14 = f11;
            if (f13 != -1.0f) {
                f14 = Math.max(f11, f13);
            }
            i10++;
            f12 = f14;
        }
        return f11 == -1.0f ? -1.0f : f11 * f10;
    }

    /* renamed from: p1 */
    public final void m23565p1() {
        this.f27625s1 = null;
    }

    /* renamed from: q1 */
    public boolean m23566q1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C4675i.class) {
            try {
                if (!f27593y1) {
                    f27594z1 = m23518u1();
                    f27593y1 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f27594z1;
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: r0 */
    public List<C7653n> mo23567r0(InterfaceC7656q interfaceC7656q, C7629w0 c7629w0, boolean z10) {
        return m23521y1(interfaceC7656q, c7629w0, z10, this.f27626t1);
    }

    @Override // p268p7.AbstractC7654o
    @TargetApi(17)
    /* renamed from: t0 */
    public InterfaceC7651l.a mo23568t0(C7653n c7653n, C7629w0 c7629w0, MediaCrypto mediaCrypto, float f10) {
        C4671e c4671e = this.f27605Y0;
        if (c4671e != null && c4671e.f27565b != c7653n.f37207g) {
            c4671e.release();
            this.f27605Y0 = null;
        }
        String str = c7653n.f37203c;
        a m23571x1 = m23571x1(c7653n, c7629w0, m32696A());
        this.f27601U0 = m23571x1;
        MediaFormat m23523A1 = m23523A1(c7629w0, str, m23571x1, f10, this.f27600T0, this.f27626t1 ? this.f27627u1 : 0);
        if (this.f27604X0 == null) {
            if (!m23554W1(c7653n)) {
                throw new IllegalStateException();
            }
            if (this.f27605Y0 == null) {
                this.f27605Y0 = C4671e.m23491j(this.f27595O0, c7653n.f37207g);
            }
            this.f27604X0 = this.f27605Y0;
        }
        return new InterfaceC7651l.a(c7653n, m23523A1, c7629w0, this.f27604X0, mediaCrypto, 0);
    }

    /* renamed from: t1 */
    public void m23569t1(InterfaceC7651l interfaceC7651l, int i10, long j10) {
        C4391u0.m22263a("dropVideoBuffer");
        interfaceC7651l.mo33252m(i10, false);
        C4391u0.m22265c();
        m23557Y1(1);
    }

    @Override // p268p7.AbstractC7654o
    @TargetApi(29)
    /* renamed from: w0 */
    public void mo23570w0(C8638f c8638f) {
        if (this.f27603W0) {
            ByteBuffer byteBuffer = (ByteBuffer) C4349a.m21882e(c8638f.f40330f);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4 && b12 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    m23513P1(m33390m0(), bArr);
                }
            }
        }
    }

    /* renamed from: x1 */
    public a m23571x1(C7653n c7653n, C7629w0 c7629w0, C7629w0[] c7629w0Arr) {
        int i10 = c7629w0.f37091r;
        int i11 = c7629w0.f37092s;
        int m23522z1 = m23522z1(c7653n, c7629w0);
        if (c7629w0Arr.length == 1) {
            int i12 = m23522z1;
            if (m23522z1 != -1) {
                int m23519v1 = m23519v1(c7653n, c7629w0.f37086m, c7629w0.f37091r, c7629w0.f37092s);
                i12 = m23522z1;
                if (m23519v1 != -1) {
                    i12 = Math.min((int) (m23522z1 * 1.5f), m23519v1);
                }
            }
            return new a(i10, i11, i12);
        }
        int length = c7629w0Arr.length;
        int i13 = 0;
        boolean z10 = false;
        int i14 = i11;
        while (i13 < length) {
            C7629w0 c7629w02 = c7629w0Arr[i13];
            C7629w0 c7629w03 = c7629w02;
            if (c7629w0.f37098y != null) {
                c7629w03 = c7629w02;
                if (c7629w02.f37098y == null) {
                    c7629w03 = c7629w02.m33157b().m33199J(c7629w0.f37098y).m33194E();
                }
            }
            int i15 = i10;
            int i16 = i14;
            int i17 = m23522z1;
            boolean z11 = z10;
            if (c7653n.m33328e(c7629w0, c7629w03).f40338d != 0) {
                int i18 = c7629w03.f37091r;
                z11 = z10 | (i18 == -1 || c7629w03.f37092s == -1);
                i15 = Math.max(i10, i18);
                i16 = Math.max(i14, c7629w03.f37092s);
                i17 = Math.max(m23522z1, m23522z1(c7653n, c7629w03));
            }
            i13++;
            i10 = i15;
            i14 = i16;
            m23522z1 = i17;
            z10 = z11;
        }
        int i19 = i10;
        int i20 = i14;
        int i21 = m23522z1;
        if (z10) {
            C4392v.m22275i("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i10 + "x" + i14);
            Point m23520w1 = m23520w1(c7653n, c7629w0);
            i19 = i10;
            i20 = i14;
            i21 = m23522z1;
            if (m23520w1 != null) {
                i19 = Math.max(i10, m23520w1.x);
                i20 = Math.max(i14, m23520w1.y);
                i21 = Math.max(m23522z1, m23519v1(c7653n, c7629w0.f37086m, i19, i20));
                C4392v.m22275i("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i19 + "x" + i20);
            }
        }
        return new a(i19, i20, i21);
    }
}
