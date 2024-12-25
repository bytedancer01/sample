package p268p7;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p059d9.C4349a;
import p059d9.C4350a0;
import p059d9.C4387s0;
import p059d9.C4391u0;
import p059d9.C4392v;
import p059d9.C4401z0;
import p267p6.AbstractC7575f;
import p267p6.C7583h;
import p267p6.C7607p;
import p267p6.C7629w0;
import p267p6.C7632x0;
import p268p7.C7642c;
import p268p7.C7661v;
import p268p7.InterfaceC7651l;
import p332t6.C8636d;
import p332t6.C8638f;
import p332t6.C8639g;
import p365v6.C9262h0;
import p365v6.C9275o;
import p365v6.InterfaceC9277p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p7/o.class
 */
/* renamed from: p7.o */
/* loaded from: combined.jar:classes2.jar:p7/o.class */
public abstract class AbstractC7654o extends AbstractC7575f {

    /* renamed from: N0 */
    public static final byte[] f37212N0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A */
    public final long[] f37213A;

    /* renamed from: A0 */
    public long f37214A0;

    /* renamed from: B */
    public C7629w0 f37215B;

    /* renamed from: B0 */
    public boolean f37216B0;

    /* renamed from: C */
    public C7629w0 f37217C;

    /* renamed from: C0 */
    public boolean f37218C0;

    /* renamed from: D */
    public InterfaceC9277p f37219D;

    /* renamed from: D0 */
    public boolean f37220D0;

    /* renamed from: E */
    public InterfaceC9277p f37221E;

    /* renamed from: E0 */
    public boolean f37222E0;

    /* renamed from: F */
    public MediaCrypto f37223F;

    /* renamed from: F0 */
    public boolean f37224F0;

    /* renamed from: G */
    public boolean f37225G;

    /* renamed from: G0 */
    public boolean f37226G0;

    /* renamed from: H */
    public long f37227H;

    /* renamed from: H0 */
    public boolean f37228H0;

    /* renamed from: I */
    public float f37229I;

    /* renamed from: I0 */
    public C7607p f37230I0;

    /* renamed from: J */
    public float f37231J;

    /* renamed from: J0 */
    public C8636d f37232J0;

    /* renamed from: K */
    public InterfaceC7651l f37233K;

    /* renamed from: K0 */
    public long f37234K0;

    /* renamed from: L */
    public C7629w0 f37235L;

    /* renamed from: L0 */
    public long f37236L0;

    /* renamed from: M */
    public MediaFormat f37237M;

    /* renamed from: M0 */
    public int f37238M0;

    /* renamed from: N */
    public boolean f37239N;

    /* renamed from: O */
    public float f37240O;

    /* renamed from: P */
    public ArrayDeque<C7653n> f37241P;

    /* renamed from: Q */
    public a f37242Q;

    /* renamed from: R */
    public C7653n f37243R;

    /* renamed from: S */
    public int f37244S;

    /* renamed from: T */
    public boolean f37245T;

    /* renamed from: U */
    public boolean f37246U;

    /* renamed from: V */
    public boolean f37247V;

    /* renamed from: W */
    public boolean f37248W;

    /* renamed from: X */
    public boolean f37249X;

    /* renamed from: Y */
    public boolean f37250Y;

    /* renamed from: Z */
    public boolean f37251Z;

    /* renamed from: f0 */
    public boolean f37252f0;

    /* renamed from: g0 */
    public boolean f37253g0;

    /* renamed from: h0 */
    public boolean f37254h0;

    /* renamed from: i0 */
    public C7650k f37255i0;

    /* renamed from: j0 */
    public long f37256j0;

    /* renamed from: k0 */
    public int f37257k0;

    /* renamed from: l0 */
    public int f37258l0;

    /* renamed from: m0 */
    public ByteBuffer f37259m0;

    /* renamed from: n */
    public final InterfaceC7651l.b f37260n;

    /* renamed from: n0 */
    public boolean f37261n0;

    /* renamed from: o */
    public final InterfaceC7656q f37262o;

    /* renamed from: o0 */
    public boolean f37263o0;

    /* renamed from: p */
    public final boolean f37264p;

    /* renamed from: p0 */
    public boolean f37265p0;

    /* renamed from: q */
    public final float f37266q;

    /* renamed from: q0 */
    public boolean f37267q0;

    /* renamed from: r */
    public final C8638f f37268r;

    /* renamed from: r0 */
    public boolean f37269r0;

    /* renamed from: s */
    public final C8638f f37270s;

    /* renamed from: s0 */
    public boolean f37271s0;

    /* renamed from: t */
    public final C8638f f37272t;

    /* renamed from: t0 */
    public int f37273t0;

    /* renamed from: u */
    public final C7649j f37274u;

    /* renamed from: u0 */
    public int f37275u0;

    /* renamed from: v */
    public final C4387s0<C7629w0> f37276v;

    /* renamed from: v0 */
    public int f37277v0;

    /* renamed from: w */
    public final ArrayList<Long> f37278w;

    /* renamed from: w0 */
    public boolean f37279w0;

    /* renamed from: x */
    public final MediaCodec.BufferInfo f37280x;

    /* renamed from: x0 */
    public boolean f37281x0;

    /* renamed from: y */
    public final long[] f37282y;

    /* renamed from: y0 */
    public boolean f37283y0;

    /* renamed from: z */
    public final long[] f37284z;

    /* renamed from: z0 */
    public long f37285z0;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p7/o$a.class
     */
    /* renamed from: p7.o$a */
    /* loaded from: combined.jar:classes2.jar:p7/o$a.class */
    public static class a extends Exception {

        /* renamed from: b */
        public final String f37286b;

        /* renamed from: c */
        public final boolean f37287c;

        /* renamed from: d */
        public final C7653n f37288d;

        /* renamed from: e */
        public final String f37289e;

        /* renamed from: f */
        public final a f37290f;

        public a(String str, Throwable th2, String str2, boolean z10, C7653n c7653n, String str3, a aVar) {
            super(str, th2);
            this.f37286b = str2;
            this.f37287c = z10;
            this.f37288d = c7653n;
            this.f37289e = str3;
            this.f37290f = aVar;
        }

        public a(C7629w0 c7629w0, Throwable th2, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + c7629w0, th2, c7629w0.f37086m, z10, null, m33400b(i10), null);
        }

        public a(C7629w0 c7629w0, Throwable th2, boolean z10, C7653n c7653n) {
            this("Decoder init failed: " + c7653n.f37201a + ", " + c7629w0, th2, c7629w0.f37086m, z10, c7653n, C4401z0.f26679a >= 21 ? m33401d(th2) : null, null);
        }

        /* renamed from: b */
        public static String m33400b(int i10) {
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
        }

        /* renamed from: d */
        public static String m33401d(Throwable th2) {
            if (th2 instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
            }
            return null;
        }

        /* renamed from: c */
        public final a m33402c(a aVar) {
            return new a(getMessage(), getCause(), this.f37286b, this.f37287c, this.f37288d, this.f37289e, aVar);
        }
    }

    public AbstractC7654o(int i10, InterfaceC7651l.b bVar, InterfaceC7656q interfaceC7656q, boolean z10, float f10) {
        super(i10);
        this.f37260n = bVar;
        this.f37262o = (InterfaceC7656q) C4349a.m21882e(interfaceC7656q);
        this.f37264p = z10;
        this.f37266q = f10;
        this.f37268r = C8638f.m37079i();
        this.f37270s = new C8638f(0);
        this.f37272t = new C8638f(2);
        C7649j c7649j = new C7649j();
        this.f37274u = c7649j;
        this.f37276v = new C4387s0<>();
        this.f37278w = new ArrayList<>();
        this.f37280x = new MediaCodec.BufferInfo();
        this.f37229I = 1.0f;
        this.f37231J = 1.0f;
        this.f37227H = -9223372036854775807L;
        this.f37282y = new long[10];
        this.f37284z = new long[10];
        this.f37213A = new long[10];
        this.f37234K0 = -9223372036854775807L;
        this.f37236L0 = -9223372036854775807L;
        c7649j.m37081f(0);
        c7649j.f40327c.order(ByteOrder.nativeOrder());
        this.f37240O = -1.0f;
        this.f37244S = 0;
        this.f37273t0 = 0;
        this.f37257k0 = -1;
        this.f37258l0 = -1;
        this.f37256j0 = -9223372036854775807L;
        this.f37285z0 = -9223372036854775807L;
        this.f37214A0 = -9223372036854775807L;
        this.f37275u0 = 0;
        this.f37277v0 = 0;
    }

    /* renamed from: B0 */
    public static boolean m33339B0(IllegalStateException illegalStateException) {
        boolean z10 = true;
        if (C4401z0.f26679a >= 21 && m33340C0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: C0 */
    public static boolean m33340C0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    /* renamed from: D0 */
    public static boolean m33341D0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    /* renamed from: P */
    public static boolean m33342P(String str, C7629w0 c7629w0) {
        return C4401z0.f26679a < 21 && c7629w0.f37088o.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    @TargetApi(23)
    /* renamed from: P0 */
    private void m33343P0() {
        int i10 = this.f37277v0;
        if (i10 == 1) {
            m33383i0();
            return;
        }
        if (i10 == 2) {
            m33383i0();
            m33387k1();
        } else if (i10 == 3) {
            m33363T0();
        } else {
            this.f37218C0 = true;
            mo33365V0();
        }
    }

    /* renamed from: Q */
    public static boolean m33344Q(String str) {
        boolean z10;
        if (C4401z0.f26679a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(C4401z0.f26681c)) {
            String str2 = C4401z0.f26680b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                z10 = true;
                return z10;
            }
        }
        z10 = false;
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if ("stvm8".equals(r0) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r3) == false) goto L17;
     */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m33345R(java.lang.String r3) {
        /*
            int r0 = p059d9.C4401z0.f26679a
            r4 = r0
            r0 = r4
            r1 = 23
            if (r0 > r1) goto L14
            java.lang.String r0 = "OMX.google.vorbis.decoder"
            r1 = r3
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
        L14:
            r0 = r4
            r1 = 19
            if (r0 > r1) goto L4b
            java.lang.String r0 = p059d9.C4401z0.f26680b
            r6 = r0
            java.lang.String r0 = "hb2000"
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            java.lang.String r0 = "stvm8"
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4b
        L32:
            java.lang.String r0 = "OMX.amlogic.avc.decoder.awesome"
            r1 = r3
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            java.lang.String r0 = "OMX.amlogic.avc.decoder.awesome.secure"
            r1 = r3
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4b
        L46:
            r0 = 1
            r5 = r0
            goto L4d
        L4b:
            r0 = 0
            r5 = r0
        L4d:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p268p7.AbstractC7654o.m33345R(java.lang.String):boolean");
    }

    /* renamed from: S */
    public static boolean m33346S(String str) {
        return C4401z0.f26679a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    /* renamed from: T */
    public static boolean m33347T(C7653n c7653n) {
        String str = c7653n.f37201a;
        int i10 = C4401z0.f26679a;
        return (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i10 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i10 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(C4401z0.f26681c) && "AFTS".equals(C4401z0.f26682d) && c7653n.f37207g));
    }

    /* renamed from: U */
    public static boolean m33348U(String str) {
        int i10 = C4401z0.f26679a;
        return i10 < 18 || (i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i10 == 19 && C4401z0.f26682d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    /* renamed from: V */
    public static boolean m33349V(String str, C7629w0 c7629w0) {
        boolean z10 = true;
        if (C4401z0.f26679a > 18 || c7629w0.f37099z != 1 || !"OMX.MTK.AUDIO.DECODER.MP3".equals(str)) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: W */
    public static boolean m33350W(String str) {
        return C4401z0.f26679a == 29 && "c2.android.aac.decoder".equals(str);
    }

    /* renamed from: d1 */
    private void m33351d1(InterfaceC9277p interfaceC9277p) {
        C9275o.m39149a(this.f37221E, interfaceC9277p);
        this.f37221E = interfaceC9277p;
    }

    /* renamed from: h0 */
    private boolean m33352h0() {
        InterfaceC7651l interfaceC7651l = this.f37233K;
        if (interfaceC7651l == null || this.f37275u0 == 2 || this.f37216B0) {
            return false;
        }
        if (this.f37257k0 < 0) {
            int mo33250k = interfaceC7651l.mo33250k();
            this.f37257k0 = mo33250k;
            if (mo33250k < 0) {
                return false;
            }
            this.f37270s.f40327c = this.f37233K.mo33244e(mo33250k);
            this.f37270s.clear();
        }
        if (this.f37275u0 == 1) {
            if (!this.f37254h0) {
                this.f37281x0 = true;
                this.f37233K.mo33246g(this.f37257k0, 0, 0, 0L, 4);
                m33368Y0();
            }
            this.f37275u0 = 2;
            return false;
        }
        if (this.f37252f0) {
            this.f37252f0 = false;
            ByteBuffer byteBuffer = this.f37270s.f40327c;
            byte[] bArr = f37212N0;
            byteBuffer.put(bArr);
            this.f37233K.mo33246g(this.f37257k0, 0, bArr.length, 0L, 0);
            m33368Y0();
            this.f37279w0 = true;
            return true;
        }
        if (this.f37273t0 == 1) {
            for (int i10 = 0; i10 < this.f37235L.f37088o.size(); i10++) {
                this.f37270s.f40327c.put(this.f37235L.f37088o.get(i10));
            }
            this.f37273t0 = 2;
        }
        int position = this.f37270s.f40327c.position();
        C7632x0 m32714y = m32714y();
        try {
            int m32698J = m32698J(m32714y, this.f37270s, 0);
            if (mo32700f()) {
                this.f37214A0 = this.f37285z0;
            }
            if (m32698J == -3) {
                return false;
            }
            if (m32698J == -5) {
                if (this.f37273t0 == 2) {
                    this.f37270s.clear();
                    this.f37273t0 = 1;
                }
                mo23535K0(m32714y);
                return true;
            }
            if (this.f37270s.isEndOfStream()) {
                if (this.f37273t0 == 2) {
                    this.f37270s.clear();
                    this.f37273t0 = 1;
                }
                this.f37216B0 = true;
                if (!this.f37279w0) {
                    m33343P0();
                    return false;
                }
                try {
                    if (this.f37254h0) {
                        return false;
                    }
                    this.f37281x0 = true;
                    this.f37233K.mo33246g(this.f37257k0, 0, 0, 0L, 4);
                    m33368Y0();
                    return false;
                } catch (MediaCodec.CryptoException e10) {
                    throw m32711v(e10, this.f37215B, C7583h.m32758b(e10.getErrorCode()));
                }
            }
            if (!this.f37279w0 && !this.f37270s.isKeyFrame()) {
                this.f37270s.clear();
                if (this.f37273t0 != 2) {
                    return true;
                }
                this.f37273t0 = 1;
                return true;
            }
            boolean m37083h = this.f37270s.m37083h();
            if (m37083h) {
                this.f37270s.f40326b.m37072b(position);
            }
            if (this.f37245T && !m37083h) {
                C4350a0.m21889b(this.f37270s.f40327c);
                if (this.f37270s.f40327c.position() == 0) {
                    return true;
                }
                this.f37245T = false;
            }
            C8638f c8638f = this.f37270s;
            long j10 = c8638f.f40329e;
            C7650k c7650k = this.f37255i0;
            if (c7650k != null) {
                j10 = c7650k.m33310c(this.f37215B, c8638f);
            }
            if (this.f37270s.isDecodeOnly()) {
                this.f37278w.add(Long.valueOf(j10));
            }
            if (this.f37220D0) {
                this.f37276v.m22226a(j10, this.f37215B);
                this.f37220D0 = false;
            }
            C7650k c7650k2 = this.f37255i0;
            long j11 = this.f37285z0;
            this.f37285z0 = c7650k2 != null ? Math.max(j11, this.f37270s.f40329e) : Math.max(j11, j10);
            this.f37270s.m37082g();
            if (this.f37270s.hasSupplementalData()) {
                mo23570w0(this.f37270s);
            }
            mo23544O0(this.f37270s);
            try {
                if (m37083h) {
                    this.f37233K.mo33242c(this.f37257k0, 0, this.f37270s.f40326b, j10, 0);
                } else {
                    this.f37233K.mo33246g(this.f37257k0, 0, this.f37270s.f40327c.limit(), j10, 0);
                }
                m33368Y0();
                this.f37279w0 = true;
                this.f37273t0 = 0;
                this.f37232J0.f40317c++;
                return true;
            } catch (MediaCodec.CryptoException e11) {
                throw m32711v(e11, this.f37215B, C7583h.m32758b(e11.getErrorCode()));
            }
        } catch (C8638f.a e12) {
            mo23529H0(e12);
            m33362S0(0);
            m33383i0();
            return true;
        }
    }

    /* renamed from: i1 */
    public static boolean m33353i1(C7629w0 c7629w0) {
        Class<? extends ExoMediaCrypto> cls = c7629w0.f37073F;
        return cls == null || C9262h0.class.equals(cls);
    }

    /* renamed from: A0 */
    public final boolean m33354A0(long j10) {
        int size = this.f37278w.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f37278w.get(i10).longValue() == j10) {
                this.f37278w.remove(i10);
                return true;
            }
        }
        return false;
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: C */
    public void mo23405C() {
        this.f37215B = null;
        this.f37234K0 = -9223372036854775807L;
        this.f37236L0 = -9223372036854775807L;
        this.f37238M0 = 0;
        m33386k0();
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: D */
    public void mo23406D(boolean z10, boolean z11) {
        this.f37232J0 = new C8636d();
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: E */
    public void mo23407E(long j10, boolean z10) {
        this.f37216B0 = false;
        this.f37218C0 = false;
        this.f37222E0 = false;
        if (this.f37265p0) {
            this.f37274u.clear();
            this.f37272t.clear();
            this.f37267q0 = false;
        } else {
            m33384j0();
        }
        if (this.f37276v.m22236l() > 0) {
            this.f37220D0 = true;
        }
        this.f37276v.m22228c();
        int i10 = this.f37238M0;
        if (i10 != 0) {
            this.f37236L0 = this.f37284z[i10 - 1];
            this.f37234K0 = this.f37282y[i10 - 1];
            this.f37238M0 = 0;
        }
    }

    /* renamed from: E0 */
    public final void m33355E0() {
        C7629w0 c7629w0;
        if (this.f37233K != null || this.f37265p0 || (c7629w0 = this.f37215B) == null) {
            return;
        }
        if (this.f37221E == null && mo33382g1(c7629w0)) {
            m33397y0(this.f37215B);
            return;
        }
        m33372a1(this.f37221E);
        String str = this.f37215B.f37086m;
        InterfaceC9277p interfaceC9277p = this.f37219D;
        if (interfaceC9277p != null) {
            if (this.f37223F == null) {
                C9262h0 m33393s0 = m33393s0(interfaceC9277p);
                if (m33393s0 != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(m33393s0.f42293a, m33393s0.f42294b);
                        this.f37223F = mediaCrypto;
                        this.f37225G = !m33393s0.f42295c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e10) {
                        throw m32711v(e10, this.f37215B, 6006);
                    }
                } else if (this.f37219D.getError() == null) {
                    return;
                }
            }
            if (C9262h0.f42292d) {
                int state = this.f37219D.getState();
                if (state == 1) {
                    InterfaceC9277p.a aVar = (InterfaceC9277p.a) C4349a.m21882e(this.f37219D.getError());
                    throw m32711v(aVar, this.f37215B, aVar.f42365b);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            m33356F0(this.f37223F, this.f37225G);
        } catch (a e11) {
            throw m32711v(e11, this.f37215B, 4001);
        }
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: F */
    public void mo23526F() {
        try {
            m33367Y();
            m33364U0();
        } finally {
            m33351d1(null);
        }
    }

    /* renamed from: F0 */
    public final void m33356F0(MediaCrypto mediaCrypto, boolean z10) {
        if (this.f37241P == null) {
            try {
                List<C7653n> m33388l0 = m33388l0(z10);
                ArrayDeque<C7653n> arrayDeque = new ArrayDeque<>();
                this.f37241P = arrayDeque;
                if (this.f37264p) {
                    arrayDeque.addAll(m33388l0);
                } else if (!m33388l0.isEmpty()) {
                    this.f37241P.add(m33388l0.get(0));
                }
                this.f37242Q = null;
            } catch (C7661v.c e10) {
                throw new a(this.f37215B, e10, z10, -49998);
            }
        }
        if (this.f37241P.isEmpty()) {
            throw new a(this.f37215B, (Throwable) null, z10, -49999);
        }
        while (this.f37233K == null) {
            C7653n peekFirst = this.f37241P.peekFirst();
            if (!mo23559f1(peekFirst)) {
                return;
            }
            try {
                m33398z0(peekFirst, mediaCrypto);
            } catch (Exception e11) {
                C4392v.m22276j("MediaCodecRenderer", "Failed to initialize decoder: " + peekFirst, e11);
                this.f37241P.removeFirst();
                a aVar = new a(this.f37215B, e11, z10, peekFirst);
                mo23529H0(aVar);
                if (this.f37242Q == null) {
                    this.f37242Q = aVar;
                } else {
                    this.f37242Q = this.f37242Q.m33402c(aVar);
                }
                if (this.f37241P.isEmpty()) {
                    throw this.f37242Q;
                }
            }
        }
        this.f37241P = null;
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: G */
    public void mo23408G() {
    }

    /* renamed from: G0 */
    public final boolean m33357G0(C9262h0 c9262h0, C7629w0 c7629w0) {
        if (c9262h0.f42295c) {
            return false;
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(c9262h0.f42293a, c9262h0.f42294b);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(c7629w0.f37086m);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException e10) {
            return true;
        }
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: H */
    public void mo23409H() {
    }

    /* renamed from: H0 */
    public abstract void mo23529H0(Exception exc);

    @Override // p267p6.AbstractC7575f
    /* renamed from: I */
    public void mo23410I(C7629w0[] c7629w0Arr, long j10, long j11) {
        boolean z10 = true;
        if (this.f37236L0 == -9223372036854775807L) {
            if (this.f37234K0 != -9223372036854775807L) {
                z10 = false;
            }
            C4349a.m21884g(z10);
            this.f37234K0 = j10;
            this.f37236L0 = j11;
            return;
        }
        int i10 = this.f37238M0;
        if (i10 == this.f37284z.length) {
            C4392v.m22275i("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.f37284z[this.f37238M0 - 1]);
        } else {
            this.f37238M0 = i10 + 1;
        }
        long[] jArr = this.f37282y;
        int i11 = this.f37238M0;
        jArr[i11 - 1] = j10;
        this.f37284z[i11 - 1] = j11;
        this.f37213A[i11 - 1] = this.f37285z0;
    }

    /* renamed from: I0 */
    public abstract void mo23531I0(String str, long j10, long j11);

    /* renamed from: J0 */
    public abstract void mo23533J0(String str);

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f1, code lost:
    
        if (m33373b0() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x018e, code lost:
    
        r10 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015e, code lost:
    
        if (m33373b0() == false) goto L73;
     */
    /* renamed from: K0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p332t6.C8639g mo23535K0(p267p6.C7632x0 r9) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p268p7.AbstractC7654o.mo23535K0(p6.x0):t6.g");
    }

    /* renamed from: L */
    public final void m33358L() {
        C4349a.m21884g(!this.f37216B0);
        C7632x0 m32714y = m32714y();
        this.f37272t.clear();
        do {
            this.f37272t.clear();
            int m32698J = m32698J(m32714y, this.f37272t, 0);
            if (m32698J == -5) {
                mo23535K0(m32714y);
                return;
            }
            if (m32698J != -4) {
                if (m32698J != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (this.f37272t.isEndOfStream()) {
                    this.f37216B0 = true;
                    return;
                }
                if (this.f37220D0) {
                    C7629w0 c7629w0 = (C7629w0) C4349a.m21882e(this.f37215B);
                    this.f37217C = c7629w0;
                    mo23537L0(c7629w0, null);
                    this.f37220D0 = false;
                }
                this.f37272t.m37082g();
            }
        } while (this.f37274u.m33301m(this.f37272t));
        this.f37267q0 = true;
    }

    /* renamed from: L0 */
    public abstract void mo23537L0(C7629w0 c7629w0, MediaFormat mediaFormat);

    /* renamed from: M */
    public final boolean m33359M(long j10, long j11) {
        C4349a.m21884g(!this.f37218C0);
        if (this.f37274u.m33306r()) {
            C7649j c7649j = this.f37274u;
            if (!mo23546Q0(j10, j11, null, c7649j.f40327c, this.f37258l0, 0, c7649j.m33305q(), this.f37274u.m33303o(), this.f37274u.isDecodeOnly(), this.f37274u.isEndOfStream(), this.f37217C)) {
                return false;
            }
            mo23539M0(this.f37274u.m33304p());
            this.f37274u.clear();
        }
        if (this.f37216B0) {
            this.f37218C0 = true;
            return false;
        }
        if (this.f37267q0) {
            C4349a.m21884g(this.f37274u.m33301m(this.f37272t));
            this.f37267q0 = false;
        }
        if (this.f37269r0) {
            if (this.f37274u.m33306r()) {
                return true;
            }
            m33367Y();
            this.f37269r0 = false;
            m33355E0();
            if (!this.f37265p0) {
                return false;
            }
        }
        m33358L();
        if (this.f37274u.m33306r()) {
            this.f37274u.m37082g();
        }
        return this.f37274u.m33306r() || this.f37216B0 || this.f37269r0;
    }

    /* renamed from: M0 */
    public void mo23539M0(long j10) {
        while (true) {
            int i10 = this.f37238M0;
            if (i10 == 0 || j10 < this.f37213A[0]) {
                return;
            }
            long[] jArr = this.f37282y;
            this.f37234K0 = jArr[0];
            this.f37236L0 = this.f37284z[0];
            int i11 = i10 - 1;
            this.f37238M0 = i11;
            System.arraycopy(jArr, 1, jArr, 0, i11);
            long[] jArr2 = this.f37284z;
            System.arraycopy(jArr2, 1, jArr2, 0, this.f37238M0);
            long[] jArr3 = this.f37213A;
            System.arraycopy(jArr3, 1, jArr3, 0, this.f37238M0);
            mo23542N0();
        }
    }

    /* renamed from: N */
    public abstract C8639g mo23541N(C7653n c7653n, C7629w0 c7629w0, C7629w0 c7629w02);

    /* renamed from: N0 */
    public void mo23542N0() {
    }

    /* renamed from: O */
    public final int m33360O(String str) {
        int i10 = C4401z0.f26679a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = C4401z0.f26682d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = C4401z0.f26680b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    /* renamed from: O0 */
    public abstract void mo23544O0(C8638f c8638f);

    /* renamed from: Q0 */
    public abstract boolean mo23546Q0(long j10, long j11, InterfaceC7651l interfaceC7651l, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, C7629w0 c7629w0);

    /* renamed from: R0 */
    public final void m33361R0() {
        this.f37283y0 = true;
        MediaFormat mo33240a = this.f37233K.mo33240a();
        if (this.f37244S != 0 && mo33240a.getInteger("width") == 32 && mo33240a.getInteger("height") == 32) {
            this.f37253g0 = true;
            return;
        }
        if (this.f37251Z) {
            mo33240a.setInteger("channel-count", 1);
        }
        this.f37237M = mo33240a;
        this.f37239N = true;
    }

    /* renamed from: S0 */
    public final boolean m33362S0(int i10) {
        C7632x0 m32714y = m32714y();
        this.f37268r.clear();
        int m32698J = m32698J(m32714y, this.f37268r, i10 | 4);
        if (m32698J == -5) {
            mo23535K0(m32714y);
            return true;
        }
        if (m32698J != -4 || !this.f37268r.isEndOfStream()) {
            return false;
        }
        this.f37216B0 = true;
        m33343P0();
        return false;
    }

    /* renamed from: T0 */
    public final void m33363T0() {
        m33364U0();
        m33355E0();
    }

    /* renamed from: U0 */
    public void m33364U0() {
        try {
            InterfaceC7651l interfaceC7651l = this.f37233K;
            if (interfaceC7651l != null) {
                interfaceC7651l.release();
                this.f37232J0.f40316b++;
                mo23533J0(this.f37243R.f37201a);
            }
            this.f37233K = null;
            try {
                MediaCrypto mediaCrypto = this.f37223F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f37233K = null;
            try {
                MediaCrypto mediaCrypto2 = this.f37223F;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    /* renamed from: V0 */
    public void mo33365V0() {
    }

    /* renamed from: W0 */
    public void mo23553W0() {
        m33368Y0();
        m33370Z0();
        this.f37256j0 = -9223372036854775807L;
        this.f37281x0 = false;
        this.f37279w0 = false;
        this.f37252f0 = false;
        this.f37253g0 = false;
        this.f37261n0 = false;
        this.f37263o0 = false;
        this.f37278w.clear();
        this.f37285z0 = -9223372036854775807L;
        this.f37214A0 = -9223372036854775807L;
        C7650k c7650k = this.f37255i0;
        if (c7650k != null) {
            c7650k.m33309b();
        }
        this.f37275u0 = 0;
        this.f37277v0 = 0;
        this.f37273t0 = this.f37271s0 ? 1 : 0;
    }

    /* renamed from: X */
    public C7652m mo23555X(Throwable th2, C7653n c7653n) {
        return new C7652m(th2, c7653n);
    }

    /* renamed from: X0 */
    public void m33366X0() {
        mo23553W0();
        this.f37230I0 = null;
        this.f37255i0 = null;
        this.f37241P = null;
        this.f37243R = null;
        this.f37235L = null;
        this.f37237M = null;
        this.f37239N = false;
        this.f37283y0 = false;
        this.f37240O = -1.0f;
        this.f37244S = 0;
        this.f37245T = false;
        this.f37246U = false;
        this.f37247V = false;
        this.f37248W = false;
        this.f37249X = false;
        this.f37250Y = false;
        this.f37251Z = false;
        this.f37254h0 = false;
        this.f37271s0 = false;
        this.f37273t0 = 0;
        this.f37225G = false;
    }

    /* renamed from: Y */
    public final void m33367Y() {
        this.f37269r0 = false;
        this.f37274u.clear();
        this.f37272t.clear();
        this.f37267q0 = false;
        this.f37265p0 = false;
    }

    /* renamed from: Y0 */
    public final void m33368Y0() {
        this.f37257k0 = -1;
        this.f37270s.f40327c = null;
    }

    /* renamed from: Z */
    public final boolean m33369Z() {
        if (!this.f37279w0) {
            return true;
        }
        this.f37275u0 = 1;
        if (this.f37246U || this.f37248W) {
            this.f37277v0 = 3;
            return false;
        }
        this.f37277v0 = 1;
        return true;
    }

    /* renamed from: Z0 */
    public final void m33370Z0() {
        this.f37258l0 = -1;
        this.f37259m0 = null;
    }

    @Override // p267p6.InterfaceC7633x1
    /* renamed from: a */
    public final int mo5981a(C7629w0 c7629w0) {
        try {
            return mo23560h1(this.f37262o, c7629w0);
        } catch (C7661v.c e10) {
            throw m32711v(e10, c7629w0, 4002);
        }
    }

    /* renamed from: a0 */
    public final void m33371a0() {
        if (!this.f37279w0) {
            m33363T0();
        } else {
            this.f37275u0 = 1;
            this.f37277v0 = 3;
        }
    }

    /* renamed from: a1 */
    public final void m33372a1(InterfaceC9277p interfaceC9277p) {
        C9275o.m39149a(this.f37219D, interfaceC9277p);
        this.f37219D = interfaceC9277p;
    }

    @TargetApi(23)
    /* renamed from: b0 */
    public final boolean m33373b0() {
        if (!this.f37279w0) {
            m33387k1();
            return true;
        }
        this.f37275u0 = 1;
        if (this.f37246U || this.f37248W) {
            this.f37277v0 = 3;
            return false;
        }
        this.f37277v0 = 2;
        return true;
    }

    /* renamed from: b1 */
    public final void m33374b1() {
        this.f37222E0 = true;
    }

    /* renamed from: c0 */
    public final boolean m33375c0(long j10, long j11) {
        boolean mo23546Q0;
        InterfaceC7651l interfaceC7651l;
        ByteBuffer byteBuffer;
        int i10;
        MediaCodec.BufferInfo bufferInfo;
        int mo33251l;
        if (!m33396x0()) {
            if (this.f37249X && this.f37281x0) {
                try {
                    mo33251l = this.f37233K.mo33251l(this.f37280x);
                } catch (IllegalStateException e10) {
                    m33343P0();
                    if (!this.f37218C0) {
                        return false;
                    }
                    m33364U0();
                    return false;
                }
            } else {
                mo33251l = this.f37233K.mo33251l(this.f37280x);
            }
            if (mo33251l < 0) {
                if (mo33251l == -2) {
                    m33361R0();
                    return true;
                }
                if (!this.f37254h0) {
                    return false;
                }
                if (!this.f37216B0 && this.f37275u0 != 2) {
                    return false;
                }
                m33343P0();
                return false;
            }
            if (this.f37253g0) {
                this.f37253g0 = false;
                this.f37233K.mo33252m(mo33251l, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo2 = this.f37280x;
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                m33343P0();
                return false;
            }
            this.f37258l0 = mo33251l;
            ByteBuffer mo33253n = this.f37233K.mo33253n(mo33251l);
            this.f37259m0 = mo33253n;
            if (mo33253n != null) {
                mo33253n.position(this.f37280x.offset);
                ByteBuffer byteBuffer2 = this.f37259m0;
                MediaCodec.BufferInfo bufferInfo3 = this.f37280x;
                byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
            }
            if (this.f37250Y) {
                MediaCodec.BufferInfo bufferInfo4 = this.f37280x;
                if (bufferInfo4.presentationTimeUs == 0 && (bufferInfo4.flags & 4) != 0) {
                    long j12 = this.f37285z0;
                    if (j12 != -9223372036854775807L) {
                        bufferInfo4.presentationTimeUs = j12;
                    }
                }
            }
            this.f37261n0 = m33354A0(this.f37280x.presentationTimeUs);
            long j13 = this.f37214A0;
            long j14 = this.f37280x.presentationTimeUs;
            this.f37263o0 = j13 == j14;
            m33389l1(j14);
        }
        if (this.f37249X && this.f37281x0) {
            try {
                interfaceC7651l = this.f37233K;
                byteBuffer = this.f37259m0;
                i10 = this.f37258l0;
                bufferInfo = this.f37280x;
            } catch (IllegalStateException e11) {
            }
            try {
                mo23546Q0 = mo23546Q0(j10, j11, interfaceC7651l, byteBuffer, i10, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.f37261n0, this.f37263o0, this.f37217C);
            } catch (IllegalStateException e12) {
                m33343P0();
                if (!this.f37218C0) {
                    return false;
                }
                m33364U0();
                return false;
            }
        } else {
            InterfaceC7651l interfaceC7651l2 = this.f37233K;
            ByteBuffer byteBuffer3 = this.f37259m0;
            int i11 = this.f37258l0;
            MediaCodec.BufferInfo bufferInfo5 = this.f37280x;
            mo23546Q0 = mo23546Q0(j10, j11, interfaceC7651l2, byteBuffer3, i11, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f37261n0, this.f37263o0, this.f37217C);
        }
        if (!mo23546Q0) {
            return false;
        }
        mo23539M0(this.f37280x.presentationTimeUs);
        boolean z10 = (this.f37280x.flags & 4) != 0;
        m33370Z0();
        if (!z10) {
            return true;
        }
        m33343P0();
        return false;
    }

    /* renamed from: c1 */
    public final void m33376c1(C7607p c7607p) {
        this.f37230I0 = c7607p;
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: d */
    public boolean mo23425d() {
        return this.f37218C0;
    }

    /* renamed from: d0 */
    public final boolean m33377d0(C7653n c7653n, C7629w0 c7629w0, InterfaceC9277p interfaceC9277p, InterfaceC9277p interfaceC9277p2) {
        C9262h0 m33393s0;
        if (interfaceC9277p == interfaceC9277p2) {
            return false;
        }
        if (interfaceC9277p2 == null || interfaceC9277p == null || C4401z0.f26679a < 23) {
            return true;
        }
        UUID uuid = C7583h.f36780e;
        if (uuid.equals(interfaceC9277p.mo39024b()) || uuid.equals(interfaceC9277p2.mo39024b()) || (m33393s0 = m33393s0(interfaceC9277p2)) == null) {
            return true;
        }
        return !c7653n.f37207g && m33357G0(m33393s0, c7629w0);
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: e */
    public boolean mo23427e() {
        return this.f37215B != null && (m32697B() || m33396x0() || (this.f37256j0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f37256j0));
    }

    /* renamed from: e0 */
    public void m33378e0(boolean z10) {
        this.f37224F0 = z10;
    }

    /* renamed from: e1 */
    public final boolean m33379e1(long j10) {
        return this.f37227H == -9223372036854775807L || SystemClock.elapsedRealtime() - j10 < this.f37227H;
    }

    /* renamed from: f0 */
    public void m33380f0(boolean z10) {
        this.f37226G0 = z10;
    }

    /* renamed from: f1 */
    public boolean mo23559f1(C7653n c7653n) {
        return true;
    }

    /* renamed from: g0 */
    public void m33381g0(boolean z10) {
        this.f37228H0 = z10;
    }

    /* renamed from: g1 */
    public boolean mo33382g1(C7629w0 c7629w0) {
        return false;
    }

    /* renamed from: h1 */
    public abstract int mo23560h1(InterfaceC7656q interfaceC7656q, C7629w0 c7629w0);

    /* renamed from: i0 */
    public final void m33383i0() {
        try {
            this.f37233K.flush();
        } finally {
            mo23553W0();
        }
    }

    /* renamed from: j0 */
    public final boolean m33384j0() {
        boolean m33386k0 = m33386k0();
        if (m33386k0) {
            m33355E0();
        }
        return m33386k0;
    }

    /* renamed from: j1 */
    public final boolean m33385j1(C7629w0 c7629w0) {
        if (C4401z0.f26679a < 23 || this.f37233K == null || this.f37277v0 == 3 || getState() == 0) {
            return true;
        }
        float mo23564p0 = mo23564p0(this.f37231J, c7629w0, m32696A());
        float f10 = this.f37240O;
        if (f10 == mo23564p0) {
            return true;
        }
        if (mo23564p0 == -1.0f) {
            m33371a0();
            return false;
        }
        if (f10 == -1.0f && mo23564p0 <= this.f37266q) {
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putFloat("operating-rate", mo23564p0);
        this.f37233K.mo33248i(bundle);
        this.f37240O = mo23564p0;
        return true;
    }

    /* renamed from: k0 */
    public boolean m33386k0() {
        if (this.f37233K == null) {
            return false;
        }
        if (this.f37277v0 == 3 || this.f37246U || ((this.f37247V && !this.f37283y0) || (this.f37248W && this.f37281x0))) {
            m33364U0();
            return true;
        }
        m33383i0();
        return false;
    }

    /* renamed from: k1 */
    public final void m33387k1() {
        try {
            this.f37223F.setMediaDrmSession(m33393s0(this.f37221E).f42294b);
            m33372a1(this.f37221E);
            this.f37275u0 = 0;
            this.f37277v0 = 0;
        } catch (MediaCryptoException e10) {
            throw m32711v(e10, this.f37215B, 6006);
        }
    }

    /* renamed from: l0 */
    public final List<C7653n> m33388l0(boolean z10) {
        List<C7653n> mo23567r0 = mo23567r0(this.f37262o, this.f37215B, z10);
        List<C7653n> list = mo23567r0;
        if (mo23567r0.isEmpty()) {
            list = mo23567r0;
            if (z10) {
                List<C7653n> mo23567r02 = mo23567r0(this.f37262o, this.f37215B, false);
                list = mo23567r02;
                if (!mo23567r02.isEmpty()) {
                    C4392v.m22275i("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f37215B.f37086m + ", but no secure decoder available. Trying to proceed with " + mo23567r02 + InstructionFileId.DOT);
                    list = mo23567r02;
                }
            }
        }
        return list;
    }

    /* renamed from: l1 */
    public final void m33389l1(long j10) {
        boolean z10;
        C7629w0 m22234j = this.f37276v.m22234j(j10);
        C7629w0 c7629w0 = m22234j;
        if (m22234j == null) {
            c7629w0 = m22234j;
            if (this.f37239N) {
                c7629w0 = this.f37276v.m22233i();
            }
        }
        if (c7629w0 != null) {
            this.f37217C = c7629w0;
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (this.f37239N && this.f37217C != null)) {
            mo23537L0(this.f37217C, this.f37237M);
            this.f37239N = false;
        }
    }

    /* renamed from: m0 */
    public final InterfaceC7651l m33390m0() {
        return this.f37233K;
    }

    /* renamed from: n0 */
    public final C7653n m33391n0() {
        return this.f37243R;
    }

    @Override // p267p6.AbstractC7575f, p267p6.InterfaceC7627v1
    /* renamed from: o */
    public void mo23561o(float f10, float f11) {
        this.f37229I = f10;
        this.f37231J = f11;
        m33385j1(this.f37235L);
    }

    /* renamed from: o0 */
    public boolean mo23562o0() {
        return false;
    }

    @Override // p267p6.AbstractC7575f, p267p6.InterfaceC7633x1
    /* renamed from: p */
    public final int mo12010p() {
        return 8;
    }

    /* renamed from: p0 */
    public abstract float mo23564p0(float f10, C7629w0 c7629w0, C7629w0[] c7629w0Arr);

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: q */
    public void mo23439q(long j10, long j11) {
        if (this.f37222E0) {
            this.f37222E0 = false;
            m33343P0();
        }
        C7607p c7607p = this.f37230I0;
        if (c7607p != null) {
            this.f37230I0 = null;
            throw c7607p;
        }
        try {
            if (this.f37218C0) {
                mo33365V0();
                return;
            }
            if (this.f37215B != null || m33362S0(2)) {
                m33355E0();
                if (this.f37265p0) {
                    C4391u0.m22263a("bypassRender");
                    do {
                    } while (m33359M(j10, j11));
                } else {
                    if (this.f37233K == null) {
                        this.f37232J0.f40318d += m32699K(j10);
                        m33362S0(1);
                        this.f37232J0.m37078c();
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C4391u0.m22263a("drainAndFeed");
                    do {
                        if (!m33375c0(j10, j11)) {
                            break;
                        }
                    } while (m33379e1(elapsedRealtime));
                    while (m33352h0() && m33379e1(elapsedRealtime)) {
                    }
                }
                C4391u0.m22265c();
                this.f37232J0.m37078c();
            }
        } catch (IllegalStateException e10) {
            if (!m33339B0(e10)) {
                throw e10;
            }
            mo23529H0(e10);
            boolean z10 = false;
            if (C4401z0.f26679a >= 21) {
                z10 = false;
                if (m33341D0(e10)) {
                    z10 = true;
                }
            }
            if (z10) {
                m33364U0();
            }
            throw m32712w(mo23555X(e10, m33391n0()), this.f37215B, z10, 4003);
        }
    }

    /* renamed from: q0 */
    public final MediaFormat m33392q0() {
        return this.f37237M;
    }

    /* renamed from: r0 */
    public abstract List<C7653n> mo23567r0(InterfaceC7656q interfaceC7656q, C7629w0 c7629w0, boolean z10);

    /* renamed from: s0 */
    public final C9262h0 m33393s0(InterfaceC9277p interfaceC9277p) {
        ExoMediaCrypto mo39026d = interfaceC9277p.mo39026d();
        if (mo39026d == null || (mo39026d instanceof C9262h0)) {
            return (C9262h0) mo39026d;
        }
        throw m32711v(new IllegalArgumentException("Expecting FrameworkMediaCrypto but found: " + mo39026d), this.f37215B, AdError.MEDIAVIEW_MISSING_ERROR_CODE);
    }

    /* renamed from: t0 */
    public abstract InterfaceC7651l.a mo23568t0(C7653n c7653n, C7629w0 c7629w0, MediaCrypto mediaCrypto, float f10);

    /* renamed from: u0 */
    public final long m33394u0() {
        return this.f37236L0;
    }

    /* renamed from: v0 */
    public float m33395v0() {
        return this.f37229I;
    }

    /* renamed from: w0 */
    public void mo23570w0(C8638f c8638f) {
    }

    /* renamed from: x0 */
    public final boolean m33396x0() {
        return this.f37258l0 >= 0;
    }

    /* renamed from: y0 */
    public final void m33397y0(C7629w0 c7629w0) {
        m33367Y();
        String str = c7629w0.f37086m;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f37274u.m33307s(32);
        } else {
            this.f37274u.m33307s(1);
        }
        this.f37265p0 = true;
    }

    /* renamed from: z0 */
    public final void m33398z0(C7653n c7653n, MediaCrypto mediaCrypto) {
        String str = c7653n.f37201a;
        int i10 = C4401z0.f26679a;
        float mo23564p0 = i10 < 23 ? -1.0f : mo23564p0(this.f37231J, this.f37215B, m32696A());
        if (mo23564p0 <= this.f37266q) {
            mo23564p0 = -1.0f;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C4391u0.m22263a("createCodec:" + str);
        InterfaceC7651l.a mo23568t0 = mo23568t0(c7653n, this.f37215B, mediaCrypto, mo23564p0);
        InterfaceC7651l mo33260a = (!this.f37224F0 || i10 < 23) ? this.f37260n.mo33260a(mo23568t0) : new C7642c.b(getTrackType(), this.f37226G0, this.f37228H0).mo33260a(mo23568t0);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        this.f37233K = mo33260a;
        this.f37243R = c7653n;
        this.f37240O = mo23564p0;
        this.f37235L = this.f37215B;
        this.f37244S = m33360O(str);
        this.f37245T = m33342P(str, this.f37235L);
        this.f37246U = m33348U(str);
        this.f37247V = m33350W(str);
        this.f37248W = m33345R(str);
        this.f37249X = m33346S(str);
        this.f37250Y = m33344Q(str);
        this.f37251Z = m33349V(str, this.f37235L);
        this.f37254h0 = m33347T(c7653n) || mo23562o0();
        if (mo33260a.mo33247h()) {
            this.f37271s0 = true;
            this.f37273t0 = 1;
            boolean z10 = false;
            if (this.f37244S != 0) {
                z10 = true;
            }
            this.f37252f0 = z10;
        }
        if ("c2.android.mp3.decoder".equals(c7653n.f37201a)) {
            this.f37255i0 = new C7650k();
        }
        if (getState() == 2) {
            this.f37256j0 = SystemClock.elapsedRealtime() + 1000;
        }
        this.f37232J0.f40315a++;
        mo23531I0(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
    }
}
