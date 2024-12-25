package p268p7;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import p059d9.C4349a;
import p059d9.C4392v;
import p059d9.C4400z;
import p059d9.C4401z0;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p7/n.class
 */
/* renamed from: p7.n */
/* loaded from: combined.jar:classes2.jar:p7/n.class */
public final class C7653n {

    /* renamed from: a */
    public final String f37201a;

    /* renamed from: b */
    public final String f37202b;

    /* renamed from: c */
    public final String f37203c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f37204d;

    /* renamed from: e */
    public final boolean f37205e;

    /* renamed from: f */
    public final boolean f37206f;

    /* renamed from: g */
    public final boolean f37207g;

    /* renamed from: h */
    public final boolean f37208h;

    /* renamed from: i */
    public final boolean f37209i;

    /* renamed from: j */
    public final boolean f37210j;

    /* renamed from: k */
    public final boolean f37211k;

    public C7653n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f37201a = (String) C4349a.m21882e(str);
        this.f37202b = str2;
        this.f37203c = str3;
        this.f37204d = codecCapabilities;
        this.f37208h = z10;
        this.f37209i = z11;
        this.f37210j = z12;
        this.f37205e = z13;
        this.f37206f = z14;
        this.f37207g = z15;
        this.f37211k = C4400z.m22311s(str2);
    }

    /* renamed from: A */
    public static C7653n m33312A(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new C7653n(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !m33317h(codecCapabilities) || m33325y(str)) ? false : true, codecCapabilities != null && m33321r(codecCapabilities), z14 || (codecCapabilities != null && m33319p(codecCapabilities)));
    }

    /* renamed from: a */
    public static int m33313a(String str, String str2, int i10) {
        if (i10 > 1 || ((C4401z0.f26679a >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        int i11 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        C4392v.m22275i("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
        return i11;
    }

    /* renamed from: c */
    public static Point m33314c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(C4401z0.m22395l(i10, widthAlignment) * widthAlignment, C4401z0.m22395l(i11, heightAlignment) * heightAlignment);
    }

    /* renamed from: d */
    public static boolean m33315d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point m33314c = m33314c(videoCapabilities, i10, i11);
        int i12 = m33314c.x;
        int i13 = m33314c.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    /* renamed from: f */
    public static MediaCodecInfo.CodecProfileLevel[] m33316f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        int i10 = intValue >= 180000000 ? 1024 : intValue >= 120000000 ? 512 : intValue >= 60000000 ? 256 : intValue >= 30000000 ? 128 : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i10;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    /* renamed from: h */
    public static boolean m33317h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C4401z0.f26679a >= 19 && m33318i(codecCapabilities);
    }

    /* renamed from: i */
    public static boolean m33318i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* renamed from: p */
    public static boolean m33319p(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C4401z0.f26679a >= 21 && m33320q(codecCapabilities);
    }

    /* renamed from: q */
    public static boolean m33320q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: r */
    public static boolean m33321r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C4401z0.f26679a >= 21 && m33322s(codecCapabilities);
    }

    /* renamed from: s */
    public static boolean m33322s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* renamed from: w */
    public static boolean m33323w(String str) {
        return "audio/opus".equals(str);
    }

    /* renamed from: x */
    public static boolean m33324x(String str) {
        return C4401z0.f26682d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    /* renamed from: y */
    public static boolean m33325y(String str) {
        boolean z10;
        if (C4401z0.f26679a <= 22) {
            String str2 = C4401z0.f26682d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                z10 = true;
                return z10;
            }
        }
        z10 = false;
        return z10;
    }

    /* renamed from: z */
    public static final boolean m33326z(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(C4401z0.f26680b)) ? false : true;
    }

    /* renamed from: b */
    public Point m33327b(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f37204d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m33314c(videoCapabilities, i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (r9.f37092s != r10.f37092s) goto L17;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p332t6.C8639g m33328e(p267p6.C7629w0 r9, p267p6.C7629w0 r10) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p268p7.C7653n.m33328e(p6.w0, p6.w0):t6.g");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0 == null) goto L6;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.media.MediaCodecInfo.CodecProfileLevel[] m33329g() {
        /*
            r2 = this;
            r0 = r2
            android.media.MediaCodecInfo$CodecCapabilities r0 = r0.f37204d
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L14
            r0 = r3
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L19
        L14:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
            r3 = r0
        L19:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p268p7.C7653n.m33329g():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    /* renamed from: j */
    public boolean m33330j(int i10) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f37204d;
        if (codecCapabilities == null) {
            str = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "channelCount.aCaps";
            } else {
                if (m33313a(this.f37201a, this.f37202b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
                    return true;
                }
                str = "channelCount.support, " + i10;
            }
        }
        m33338v(str);
        return false;
    }

    /* renamed from: k */
    public boolean m33331k(int i10) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f37204d;
        if (codecCapabilities == null) {
            str = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "sampleRate.aCaps";
            } else {
                if (audioCapabilities.isSampleRateSupported(i10)) {
                    return true;
                }
                str = "sampleRate.support, " + i10;
            }
        }
        m33338v(str);
        return false;
    }

    /* renamed from: l */
    public boolean m33332l(C7629w0 c7629w0) {
        String m22299g;
        StringBuilder sb2;
        String str;
        String str2 = c7629w0.f37083j;
        if (str2 == null || this.f37202b == null || (m22299g = C4400z.m22299g(str2)) == null) {
            return true;
        }
        if (this.f37202b.equals(m22299g)) {
            Pair<Integer, Integer> m33437p = C7661v.m33437p(c7629w0);
            if (m33437p == null) {
                return true;
            }
            int intValue = ((Integer) m33437p.first).intValue();
            int intValue2 = ((Integer) m33437p.second).intValue();
            if (!this.f37211k && intValue != 42) {
                return true;
            }
            MediaCodecInfo.CodecProfileLevel[] m33329g = m33329g();
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = m33329g;
            if (C4401z0.f26679a <= 23) {
                codecProfileLevelArr = m33329g;
                if ("video/x-vnd.on2.vp9".equals(this.f37202b)) {
                    codecProfileLevelArr = m33329g;
                    if (m33329g.length == 0) {
                        codecProfileLevelArr = m33316f(this.f37204d);
                    }
                }
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2) {
                    return true;
                }
            }
            sb2 = new StringBuilder();
            str = "codec.profileLevel, ";
        } else {
            sb2 = new StringBuilder();
            str = "codec.mime ";
        }
        sb2.append(str);
        sb2.append(c7629w0.f37083j);
        sb2.append(", ");
        sb2.append(m22299g);
        m33338v(sb2.toString());
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
    
        if (m33331k(r0) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        if (m33330j(r0) != false) goto L37;
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m33333m(p267p6.C7629w0 r7) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p268p7.C7653n.m33333m(p6.w0):boolean");
    }

    /* renamed from: n */
    public boolean m33334n() {
        if (C4401z0.f26679a < 29 || !"video/x-vnd.on2.vp9".equals(this.f37202b)) {
            return false;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m33329g()) {
            if (codecProfileLevel.profile == 16384) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public boolean m33335o(C7629w0 c7629w0) {
        if (this.f37211k) {
            return this.f37205e;
        }
        Pair<Integer, Integer> m33437p = C7661v.m33437p(c7629w0);
        return m33437p != null && ((Integer) m33437p.first).intValue() == 42;
    }

    /* renamed from: t */
    public boolean m33336t(int i10, int i11, double d10) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f37204d;
        if (codecCapabilities == null) {
            str = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                str = "sizeAndRate.vCaps";
            } else {
                if (m33315d(videoCapabilities, i10, i11, d10)) {
                    return true;
                }
                if (i10 < i11 && m33326z(this.f37201a) && m33315d(videoCapabilities, i11, i10, d10)) {
                    m33337u("sizeAndRate.rotated, " + i10 + "x" + i11 + "x" + d10);
                    return true;
                }
                str = "sizeAndRate.support, " + i10 + "x" + i11 + "x" + d10;
            }
        }
        m33338v(str);
        return false;
    }

    public String toString() {
        return this.f37201a;
    }

    /* renamed from: u */
    public final void m33337u(String str) {
        C4392v.m22268b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f37201a + ", " + this.f37202b + "] [" + C4401z0.f26683e + "]");
    }

    /* renamed from: v */
    public final void m33338v(String str) {
        C4392v.m22268b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f37201a + ", " + this.f37202b + "] [" + C4401z0.f26683e + "]");
    }
}
