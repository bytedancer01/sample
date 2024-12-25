package p301r6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.logging.LogFactory;
import p059d9.C4349a;
import p059d9.C4392v;
import p059d9.C4398y;
import p059d9.C4400z;
import p059d9.C4401z0;
import p059d9.InterfaceC4396x;
import p267p6.C7603n1;
import p267p6.C7629w0;
import p267p6.C7630w1;
import p267p6.C7632x0;
import p267p6.InterfaceC7627v1;
import p268p7.AbstractC7654o;
import p268p7.C7653n;
import p268p7.C7661v;
import p268p7.InterfaceC7651l;
import p268p7.InterfaceC7656q;
import p301r6.InterfaceC8002t;
import p301r6.InterfaceC8003u;
import p332t6.C8638f;
import p332t6.C8639g;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r6/i0.class
 */
/* renamed from: r6.i0 */
/* loaded from: combined.jar:classes2.jar:r6/i0.class */
public class C7983i0 extends AbstractC7654o implements InterfaceC4396x {

    /* renamed from: O0 */
    public final Context f38607O0;

    /* renamed from: P0 */
    public final InterfaceC8002t.a f38608P0;

    /* renamed from: Q0 */
    public final InterfaceC8003u f38609Q0;

    /* renamed from: R0 */
    public int f38610R0;

    /* renamed from: S0 */
    public boolean f38611S0;

    /* renamed from: T0 */
    public C7629w0 f38612T0;

    /* renamed from: U0 */
    public long f38613U0;

    /* renamed from: V0 */
    public boolean f38614V0;

    /* renamed from: W0 */
    public boolean f38615W0;

    /* renamed from: X0 */
    public boolean f38616X0;

    /* renamed from: Y0 */
    public boolean f38617Y0;

    /* renamed from: Z0 */
    public InterfaceC7627v1.a f38618Z0;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/i0$b.class
     */
    /* renamed from: r6.i0$b */
    /* loaded from: combined.jar:classes2.jar:r6/i0$b.class */
    public final class b implements InterfaceC8003u.c {

        /* renamed from: a */
        public final C7983i0 f38619a;

        public b(C7983i0 c7983i0) {
            this.f38619a = c7983i0;
        }

        @Override // p301r6.InterfaceC8003u.c
        /* renamed from: a */
        public void mo34561a(boolean z10) {
            this.f38619a.f38608P0.m34801C(z10);
        }

        @Override // p301r6.InterfaceC8003u.c
        /* renamed from: b */
        public void mo34562b(Exception exc) {
            C4392v.m22271e("MediaCodecAudioRenderer", "Audio sink error", exc);
            this.f38619a.f38608P0.m34804l(exc);
        }

        @Override // p301r6.InterfaceC8003u.c
        /* renamed from: c */
        public void mo34563c(long j10) {
            this.f38619a.f38608P0.m34800B(j10);
        }

        @Override // p301r6.InterfaceC8003u.c
        /* renamed from: d */
        public void mo34564d(long j10) {
            if (this.f38619a.f38618Z0 != null) {
                this.f38619a.f38618Z0.mo33140b(j10);
            }
        }

        @Override // p301r6.InterfaceC8003u.c
        /* renamed from: e */
        public void mo34565e(int i10, long j10, long j11) {
            this.f38619a.f38608P0.m34802D(i10, j10, j11);
        }

        @Override // p301r6.InterfaceC8003u.c
        /* renamed from: f */
        public void mo34566f() {
            this.f38619a.m34714t1();
        }

        @Override // p301r6.InterfaceC8003u.c
        /* renamed from: g */
        public void mo34567g() {
            if (this.f38619a.f38618Z0 != null) {
                this.f38619a.f38618Z0.mo33139a();
            }
        }
    }

    public C7983i0(Context context, InterfaceC7651l.b bVar, InterfaceC7656q interfaceC7656q, boolean z10, Handler handler, InterfaceC8002t interfaceC8002t, InterfaceC8003u interfaceC8003u) {
        super(1, bVar, interfaceC7656q, z10, 44100.0f);
        this.f38607O0 = context.getApplicationContext();
        this.f38609Q0 = interfaceC8003u;
        this.f38608P0 = new InterfaceC8002t.a(handler, interfaceC8002t);
        interfaceC8003u.mo34633f(new b());
    }

    public C7983i0(Context context, InterfaceC7656q interfaceC7656q, boolean z10, Handler handler, InterfaceC8002t interfaceC8002t, InterfaceC8003u interfaceC8003u) {
        this(context, InterfaceC7651l.b.f37198a, interfaceC7656q, z10, handler, interfaceC8002t, interfaceC8003u);
    }

    /* renamed from: o1 */
    public static boolean m34709o1(String str) {
        boolean z10;
        if (C4401z0.f26679a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(C4401z0.f26681c)) {
            String str2 = C4401z0.f26680b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z10 = true;
                return z10;
            }
        }
        z10 = false;
        return z10;
    }

    /* renamed from: p1 */
    public static boolean m34710p1() {
        boolean z10;
        if (C4401z0.f26679a == 23) {
            String str = C4401z0.f26682d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                z10 = true;
                return z10;
            }
        }
        z10 = false;
        return z10;
    }

    @Override // p268p7.AbstractC7654o, p267p6.AbstractC7575f
    /* renamed from: C */
    public void mo23405C() {
        this.f38616X0 = true;
        try {
            this.f38609Q0.flush();
            try {
                super.mo23405C();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.mo23405C();
                throw th2;
            } finally {
            }
        }
    }

    @Override // p268p7.AbstractC7654o, p267p6.AbstractC7575f
    /* renamed from: D */
    public void mo23406D(boolean z10, boolean z11) {
        super.mo23406D(z10, z11);
        this.f38608P0.m34808p(this.f37232J0);
        if (m32713x().f37138a) {
            this.f38609Q0.mo34652q();
        } else {
            this.f38609Q0.mo34637h();
        }
    }

    @Override // p268p7.AbstractC7654o, p267p6.AbstractC7575f
    /* renamed from: E */
    public void mo23407E(long j10, boolean z10) {
        super.mo23407E(j10, z10);
        if (this.f38617Y0) {
            this.f38609Q0.mo34643l();
        } else {
            this.f38609Q0.flush();
        }
        this.f38613U0 = j10;
        this.f38614V0 = true;
        this.f38615W0 = true;
    }

    @Override // p268p7.AbstractC7654o, p267p6.AbstractC7575f
    /* renamed from: F */
    public void mo23526F() {
        try {
            super.mo23526F();
        } finally {
            if (this.f38616X0) {
                this.f38616X0 = false;
                this.f38609Q0.reset();
            }
        }
    }

    @Override // p268p7.AbstractC7654o, p267p6.AbstractC7575f
    /* renamed from: G */
    public void mo23408G() {
        super.mo23408G();
        this.f38609Q0.play();
    }

    @Override // p268p7.AbstractC7654o, p267p6.AbstractC7575f
    /* renamed from: H */
    public void mo23409H() {
        m34715u1();
        this.f38609Q0.pause();
        super.mo23409H();
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: H0 */
    public void mo23529H0(Exception exc) {
        C4392v.m22271e("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f38608P0.m34803k(exc);
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: I0 */
    public void mo23531I0(String str, long j10, long j11) {
        this.f38608P0.m34805m(str, j10, j11);
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: J0 */
    public void mo23533J0(String str) {
        this.f38608P0.m34806n(str);
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: K0 */
    public C8639g mo23535K0(C7632x0 c7632x0) {
        C8639g mo23535K0 = super.mo23535K0(c7632x0);
        this.f38608P0.m34809q(c7632x0.f37132b, mo23535K0);
        return mo23535K0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c0  */
    @Override // p268p7.AbstractC7654o
    /* renamed from: L0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo23537L0(p267p6.C7629w0 r6, android.media.MediaFormat r7) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p301r6.C7983i0.mo23537L0(p6.w0, android.media.MediaFormat):void");
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: N */
    public C8639g mo23541N(C7653n c7653n, C7629w0 c7629w0, C7629w0 c7629w02) {
        C8639g m33328e = c7653n.m33328e(c7629w0, c7629w02);
        int i10 = m33328e.f40339e;
        int i11 = i10;
        if (m34711q1(c7653n, c7629w02) > this.f38610R0) {
            i11 = i10 | 64;
        }
        return new C8639g(c7653n.f37201a, c7629w0, c7629w02, i11 != 0 ? 0 : m33328e.f40338d, i11);
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: N0 */
    public void mo23542N0() {
        super.mo23542N0();
        this.f38609Q0.mo34649o();
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: O0 */
    public void mo23544O0(C8638f c8638f) {
        if (!this.f38614V0 || c8638f.isDecodeOnly()) {
            return;
        }
        if (Math.abs(c8638f.f40329e - this.f38613U0) > 500000) {
            this.f38613U0 = c8638f.f40329e;
        }
        this.f38614V0 = false;
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: Q0 */
    public boolean mo23546Q0(long j10, long j11, InterfaceC7651l interfaceC7651l, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, C7629w0 c7629w0) {
        C4349a.m21882e(byteBuffer);
        if (this.f38612T0 != null && (i11 & 2) != 0) {
            ((InterfaceC7651l) C4349a.m21882e(interfaceC7651l)).mo33252m(i10, false);
            return true;
        }
        if (z10) {
            if (interfaceC7651l != null) {
                interfaceC7651l.mo33252m(i10, false);
            }
            this.f37232J0.f40320f += i12;
            this.f38609Q0.mo34649o();
            return true;
        }
        try {
            if (!this.f38609Q0.mo34641k(byteBuffer, j12, i12)) {
                return false;
            }
            if (interfaceC7651l != null) {
                interfaceC7651l.mo33252m(i10, false);
            }
            this.f37232J0.f40319e += i12;
            return true;
        } catch (InterfaceC8003u.b e10) {
            throw m32712w(e10, e10.f38720d, e10.f38719c, 5001);
        } catch (InterfaceC8003u.e e11) {
            throw m32712w(e11, c7629w0, e11.f38724c, 5002);
        }
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: V0 */
    public void mo33365V0() {
        try {
            this.f38609Q0.mo34645m();
        } catch (InterfaceC8003u.e e10) {
            throw m32712w(e10, e10.f38725d, e10.f38724c, 5002);
        }
    }

    @Override // p059d9.InterfaceC4396x
    /* renamed from: b */
    public C7603n1 mo22208b() {
        return this.f38609Q0.mo34625b();
    }

    @Override // p059d9.InterfaceC4396x
    /* renamed from: c */
    public void mo22209c(C7603n1 c7603n1) {
        this.f38609Q0.mo34627c(c7603n1);
    }

    @Override // p268p7.AbstractC7654o, p267p6.InterfaceC7627v1
    /* renamed from: d */
    public boolean mo23425d() {
        return super.mo23425d() && this.f38609Q0.mo34629d();
    }

    @Override // p268p7.AbstractC7654o, p267p6.InterfaceC7627v1
    /* renamed from: e */
    public boolean mo23427e() {
        return this.f38609Q0.mo34631e() || super.mo23427e();
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: g1 */
    public boolean mo33382g1(C7629w0 c7629w0) {
        return this.f38609Q0.mo34623a(c7629w0);
    }

    @Override // p267p6.InterfaceC7627v1, p267p6.InterfaceC7633x1
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: h1 */
    public int mo23560h1(InterfaceC7656q interfaceC7656q, C7629w0 c7629w0) {
        if (!C4400z.m22308p(c7629w0.f37086m)) {
            return C7630w1.m33226a(0);
        }
        int i10 = C4401z0.f26679a >= 21 ? 32 : 0;
        boolean z10 = c7629w0.f37073F != null;
        boolean m33353i1 = AbstractC7654o.m33353i1(c7629w0);
        int i11 = 4;
        if (m33353i1 && this.f38609Q0.mo34623a(c7629w0) && (!z10 || C7661v.m33442u() != null)) {
            return C7630w1.m33227b(4, 8, i10);
        }
        if ((!"audio/raw".equals(c7629w0.f37086m) || this.f38609Q0.mo34623a(c7629w0)) && this.f38609Q0.mo34623a(C4401z0.m22372c0(2, c7629w0.f37099z, c7629w0.f37068A))) {
            List<C7653n> mo23567r0 = mo23567r0(interfaceC7656q, c7629w0, false);
            if (mo23567r0.isEmpty()) {
                return C7630w1.m33226a(1);
            }
            if (!m33353i1) {
                return C7630w1.m33226a(2);
            }
            C7653n c7653n = mo23567r0.get(0);
            boolean m33333m = c7653n.m33333m(c7629w0);
            int i12 = 8;
            if (m33333m) {
                i12 = 8;
                if (c7653n.m33335o(c7629w0)) {
                    i12 = 16;
                }
            }
            if (!m33333m) {
                i11 = 3;
            }
            return C7630w1.m33227b(i11, i12, i10);
        }
        return C7630w1.m33226a(1);
    }

    @Override // p267p6.AbstractC7575f, p267p6.C7615r1.b
    /* renamed from: i */
    public void mo23432i(int i10, Object obj) {
        if (i10 == 2) {
            this.f38609Q0.setVolume(((Float) obj).floatValue());
        }
        if (i10 == 3) {
            this.f38609Q0.mo34653r((C7972d) obj);
            return;
        }
        if (i10 == 5) {
            this.f38609Q0.mo34639j((C8007y) obj);
            return;
        }
        switch (i10) {
            case 101:
                this.f38609Q0.mo34654s(((Boolean) obj).booleanValue());
                break;
            case 102:
                this.f38609Q0.mo34635g(((Integer) obj).intValue());
                break;
            case 103:
                this.f38618Z0 = (InterfaceC7627v1.a) obj;
                break;
            default:
                super.mo23432i(i10, obj);
                break;
        }
    }

    @Override // p059d9.InterfaceC4396x
    /* renamed from: n */
    public long mo22212n() {
        if (getState() == 2) {
            m34715u1();
        }
        return this.f38613U0;
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: p0 */
    public float mo23564p0(float f10, C7629w0 c7629w0, C7629w0[] c7629w0Arr) {
        int i10;
        int length = c7629w0Arr.length;
        int i11 = 0;
        int i12 = -1;
        while (true) {
            i10 = i12;
            if (i11 >= length) {
                break;
            }
            int i13 = c7629w0Arr[i11].f37068A;
            int i14 = i10;
            if (i13 != -1) {
                i14 = Math.max(i10, i13);
            }
            i11++;
            i12 = i14;
        }
        return i10 == -1 ? -1.0f : f10 * i10;
    }

    /* renamed from: q1 */
    public final int m34711q1(C7653n c7653n, C7629w0 c7629w0) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(c7653n.f37201a) || (i10 = C4401z0.f26679a) >= 24 || (i10 == 23 && C4401z0.m22418w0(this.f38607O0))) {
            return c7629w0.f37087n;
        }
        return -1;
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: r0 */
    public List<C7653n> mo23567r0(InterfaceC7656q interfaceC7656q, C7629w0 c7629w0, boolean z10) {
        C7653n m33442u;
        String str = c7629w0.f37086m;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.f38609Q0.mo34623a(c7629w0) && (m33442u = C7661v.m33442u()) != null) {
            return Collections.singletonList(m33442u);
        }
        List<C7653n> m33441t = C7661v.m33441t(interfaceC7656q.mo33403a(str, z10, false), c7629w0);
        List<C7653n> list = m33441t;
        if ("audio/eac3-joc".equals(str)) {
            list = new ArrayList(m33441t);
            list.addAll(interfaceC7656q.mo33403a("audio/eac3", z10, false));
        }
        return Collections.unmodifiableList(list);
    }

    /* renamed from: r1 */
    public int m34712r1(C7653n c7653n, C7629w0 c7629w0, C7629w0[] c7629w0Arr) {
        int m34711q1 = m34711q1(c7653n, c7629w0);
        if (c7629w0Arr.length == 1) {
            return m34711q1;
        }
        int length = c7629w0Arr.length;
        int i10 = 0;
        while (i10 < length) {
            C7629w0 c7629w02 = c7629w0Arr[i10];
            int i11 = m34711q1;
            if (c7653n.m33328e(c7629w0, c7629w02).f40338d != 0) {
                i11 = Math.max(m34711q1, m34711q1(c7653n, c7629w02));
            }
            i10++;
            m34711q1 = i11;
        }
        return m34711q1;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: s1 */
    public MediaFormat m34713s1(C7629w0 c7629w0, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(IMediaFormat.KEY_MIME, str);
        mediaFormat.setInteger("channel-count", c7629w0.f37099z);
        mediaFormat.setInteger("sample-rate", c7629w0.f37068A);
        C4398y.m22292e(mediaFormat, c7629w0.f37088o);
        C4398y.m22291d(mediaFormat, "max-input-size", i10);
        int i11 = C4401z0.f26679a;
        if (i11 >= 23) {
            mediaFormat.setInteger(LogFactory.PRIORITY_KEY, 0);
            if (f10 != -1.0f && !m34710p1()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(c7629w0.f37086m)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.f38609Q0.mo34650p(C4401z0.m22372c0(4, c7629w0.f37099z, c7629w0.f37068A)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        return mediaFormat;
    }

    @Override // p268p7.AbstractC7654o
    /* renamed from: t0 */
    public InterfaceC7651l.a mo23568t0(C7653n c7653n, C7629w0 c7629w0, MediaCrypto mediaCrypto, float f10) {
        this.f38610R0 = m34712r1(c7653n, c7629w0, m32696A());
        this.f38611S0 = m34709o1(c7653n.f37201a);
        MediaFormat m34713s1 = m34713s1(c7629w0, c7653n.f37203c, this.f38610R0, f10);
        this.f38612T0 = "audio/raw".equals(c7653n.f37202b) && !"audio/raw".equals(c7629w0.f37086m) ? c7629w0 : null;
        return new InterfaceC7651l.a(c7653n, m34713s1, c7629w0, null, mediaCrypto, 0);
    }

    /* renamed from: t1 */
    public void m34714t1() {
        this.f38615W0 = true;
    }

    @Override // p267p6.AbstractC7575f, p267p6.InterfaceC7627v1
    /* renamed from: u */
    public InterfaceC4396x mo32710u() {
        return this;
    }

    /* renamed from: u1 */
    public final void m34715u1() {
        long mo34647n = this.f38609Q0.mo34647n(mo23425d());
        if (mo34647n != Long.MIN_VALUE) {
            if (!this.f38615W0) {
                mo34647n = Math.max(this.f38613U0, mo34647n);
            }
            this.f38613U0 = mo34647n;
            this.f38615W0 = false;
        }
    }
}
