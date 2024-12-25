package p268p7;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.amazonaws.services.p045s3.internal.Constants;
import ec.C4699b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p059d9.C4392v;
import p059d9.C4400z;
import p059d9.C4401z0;
import p078e9.C4665b;
import p267p6.C7629w0;
import p268p7.C7661v;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p7/v.class
 */
@SuppressLint({"InlinedApi"})
/* renamed from: p7.v */
/* loaded from: combined.jar:classes2.jar:p7/v.class */
public final class C7661v {

    /* renamed from: a */
    public static final Pattern f37294a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    public static final HashMap<b, List<C7653n>> f37295b = new HashMap<>();

    /* renamed from: c */
    public static int f37296c = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p7/v$b.class
     */
    /* renamed from: p7.v$b */
    /* loaded from: combined.jar:classes2.jar:p7/v$b.class */
    public static final class b {

        /* renamed from: a */
        public final String f37297a;

        /* renamed from: b */
        public final boolean f37298b;

        /* renamed from: c */
        public final boolean f37299c;

        public b(String str, boolean z10, boolean z11) {
            this.f37297a = str;
            this.f37298b = z10;
            this.f37299c = z11;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            if (!TextUtils.equals(this.f37297a, bVar.f37297a) || this.f37298b != bVar.f37298b || this.f37299c != bVar.f37299c) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            int hashCode = this.f37297a.hashCode();
            int i10 = 1231;
            int i11 = this.f37298b ? 1231 : 1237;
            if (!this.f37299c) {
                i10 = 1237;
            }
            return ((((hashCode + 31) * 31) + i11) * 31) + i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p7/v$c.class
     */
    /* renamed from: p7.v$c */
    /* loaded from: combined.jar:classes2.jar:p7/v$c.class */
    public static class c extends Exception {
        public c(Throwable th2) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p7/v$d.class
     */
    /* renamed from: p7.v$d */
    /* loaded from: combined.jar:classes2.jar:p7/v$d.class */
    public interface d {
        /* renamed from: a */
        MediaCodecInfo mo33448a(int i10);

        /* renamed from: b */
        boolean mo33449b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: c */
        boolean mo33450c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: d */
        int mo33451d();

        /* renamed from: e */
        boolean mo33452e();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p7/v$e.class
     */
    /* renamed from: p7.v$e */
    /* loaded from: combined.jar:classes2.jar:p7/v$e.class */
    public static final class e implements d {
        public e() {
        }

        @Override // p268p7.C7661v.d
        /* renamed from: a */
        public MediaCodecInfo mo33448a(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // p268p7.C7661v.d
        /* renamed from: b */
        public boolean mo33449b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // p268p7.C7661v.d
        /* renamed from: c */
        public boolean mo33450c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // p268p7.C7661v.d
        /* renamed from: d */
        public int mo33451d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // p268p7.C7661v.d
        /* renamed from: e */
        public boolean mo33452e() {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p7/v$f.class
     */
    /* renamed from: p7.v$f */
    /* loaded from: combined.jar:classes2.jar:p7/v$f.class */
    public static final class f implements d {

        /* renamed from: a */
        public final int f37300a;

        /* renamed from: b */
        public MediaCodecInfo[] f37301b;

        public f(boolean z10, boolean z11) {
            this.f37300a = (z10 || z11) ? 1 : 0;
        }

        @Override // p268p7.C7661v.d
        /* renamed from: a */
        public MediaCodecInfo mo33448a(int i10) {
            m33453f();
            return this.f37301b[i10];
        }

        @Override // p268p7.C7661v.d
        /* renamed from: b */
        public boolean mo33449b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // p268p7.C7661v.d
        /* renamed from: c */
        public boolean mo33450c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // p268p7.C7661v.d
        /* renamed from: d */
        public int mo33451d() {
            m33453f();
            return this.f37301b.length;
        }

        @Override // p268p7.C7661v.d
        /* renamed from: e */
        public boolean mo33452e() {
            return true;
        }

        @EnsuresNonNull({"mediaCodecInfos"})
        /* renamed from: f */
        public final void m33453f() {
            if (this.f37301b == null) {
                this.f37301b = new MediaCodecList(this.f37300a).getCodecInfos();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p7/v$g.class
     */
    /* renamed from: p7.v$g */
    /* loaded from: combined.jar:classes2.jar:p7/v$g.class */
    public interface g<T> {
        /* renamed from: a */
        int mo33404a(T t10);
    }

    /* renamed from: A */
    public static boolean m33405A(MediaCodecInfo mediaCodecInfo) {
        boolean isAlias;
        isAlias = mediaCodecInfo.isAlias();
        return isAlias;
    }

    /* renamed from: B */
    public static boolean m33406B(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z10 && str.endsWith(".secure")) {
            return false;
        }
        int i10 = C4401z0.f26679a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = C4401z0.f26680b;
            if ("a70".equals(str3)) {
                return false;
            }
            if ("Xiaomi".equals(C4401z0.f26681c) && str3.startsWith("HM")) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = C4401z0.f26680b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = C4401z0.f26680b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(C4401z0.f26681c))) {
            String str6 = C4401z0.f26680b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(C4401z0.f26681c)) {
            String str7 = C4401z0.f26680b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && C4401z0.f26680b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    /* renamed from: C */
    public static boolean m33407C(MediaCodecInfo mediaCodecInfo) {
        return C4401z0.f26679a >= 29 ? m33408D(mediaCodecInfo) : !m33409E(mediaCodecInfo);
    }

    /* renamed from: D */
    public static boolean m33408D(MediaCodecInfo mediaCodecInfo) {
        boolean isHardwareAccelerated;
        isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
        return isHardwareAccelerated;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (r0.startsWith("c2.") == false) goto L28;
     */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m33409E(android.media.MediaCodecInfo r3) {
        /*
            int r0 = p059d9.C4401z0.f26679a
            r1 = 29
            if (r0 < r1) goto Ld
            r0 = r3
            boolean r0 = m33410F(r0)
            return r0
        Ld:
            r0 = r3
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = ec.C4699b.m23638e(r0)
            r3 = r0
            r0 = r3
            java.lang.String r1 = "arc."
            boolean r0 = r0.startsWith(r1)
            r4 = r0
            r0 = 0
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L24
            r0 = 0
            return r0
        L24:
            r0 = r3
            java.lang.String r1 = "omx.google."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L79
            r0 = r3
            java.lang.String r1 = "omx.ffmpeg."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L79
            r0 = r3
            java.lang.String r1 = "omx.sec."
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L48
            r0 = r3
            java.lang.String r1 = ".sw."
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L79
        L48:
            r0 = r3
            java.lang.String r1 = "omx.qcom.video.decoder.hevcswvdec"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L79
            r0 = r3
            java.lang.String r1 = "c2.android."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L79
            r0 = r3
            java.lang.String r1 = "c2.google."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L79
            r0 = r5
            r4 = r0
            r0 = r3
            java.lang.String r1 = "omx."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L7b
            r0 = r5
            r4 = r0
            r0 = r3
            java.lang.String r1 = "c2."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L7b
        L79:
            r0 = 1
            r4 = r0
        L7b:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p268p7.C7661v.m33409E(android.media.MediaCodecInfo):boolean");
    }

    /* renamed from: F */
    public static boolean m33410F(MediaCodecInfo mediaCodecInfo) {
        boolean isSoftwareOnly;
        isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
        return isSoftwareOnly;
    }

    /* renamed from: G */
    public static boolean m33411G(MediaCodecInfo mediaCodecInfo) {
        if (C4401z0.f26679a >= 29) {
            return m33412H(mediaCodecInfo);
        }
        String m23638e = C4699b.m23638e(mediaCodecInfo.getName());
        return (m23638e.startsWith("omx.google.") || m23638e.startsWith("c2.android.") || m23638e.startsWith("c2.google.")) ? false : true;
    }

    /* renamed from: H */
    public static boolean m33412H(MediaCodecInfo mediaCodecInfo) {
        boolean isVendor;
        isVendor = mediaCodecInfo.isVendor();
        return isVendor;
    }

    /* renamed from: I */
    public static /* synthetic */ int m33413I(C7653n c7653n) {
        String str = c7653n.f37201a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (C4401z0.f26679a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* renamed from: J */
    public static /* synthetic */ int m33414J(C7653n c7653n) {
        return c7653n.f37201a.startsWith("OMX.google") ? 1 : 0;
    }

    /* renamed from: K */
    public static /* synthetic */ int m33415K(C7629w0 c7629w0, C7653n c7653n) {
        try {
            return c7653n.m33333m(c7629w0) ? 1 : 0;
        } catch (c e10) {
            return -1;
        }
    }

    /* renamed from: L */
    public static /* synthetic */ int m33416L(g gVar, Object obj, Object obj2) {
        return gVar.mo33404a(obj2) - gVar.mo33404a(obj);
    }

    /* renamed from: M */
    public static int m33417M() {
        if (f37296c == -1) {
            int i10 = 0;
            C7653n m33438q = m33438q("video/avc", false, false);
            if (m33438q != null) {
                int i11 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m33438q.m33329g()) {
                    i11 = Math.max(m33429h(codecProfileLevel.level), i11);
                }
                i10 = Math.max(i11, C4401z0.f26679a >= 21 ? 345600 : 172800);
            }
            f37296c = i10;
        }
        return f37296c;
    }

    /* renamed from: N */
    public static int m33418N(int i10) {
        int i11 = 17;
        if (i10 != 17) {
            i11 = 20;
            if (i10 != 20) {
                i11 = 23;
                if (i10 != 23) {
                    i11 = 29;
                    if (i10 != 29) {
                        i11 = 39;
                        if (i10 != 39) {
                            i11 = 42;
                            if (i10 != 42) {
                                switch (i10) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i11;
    }

    /* renamed from: O */
    public static <T> void m33419O(List<T> list, final g<T> gVar) {
        Collections.sort(list, new Comparator(gVar) { // from class: p7.u

            /* renamed from: b */
            public final C7661v.g f37293b;

            {
                this.f37293b = gVar;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m33416L;
                m33416L = C7661v.m33416L(this.f37293b, obj, obj2);
                return m33416L;
            }
        });
    }

    /* renamed from: P */
    public static int m33420P(int i10) {
        if (i10 == 10) {
            return 1;
        }
        if (i10 == 11) {
            return 2;
        }
        if (i10 == 20) {
            return 4;
        }
        if (i10 == 21) {
            return 8;
        }
        if (i10 == 30) {
            return 16;
        }
        if (i10 == 31) {
            return 32;
        }
        if (i10 == 40) {
            return 64;
        }
        if (i10 == 41) {
            return 128;
        }
        if (i10 == 50) {
            return 256;
        }
        if (i10 == 51) {
            return 512;
        }
        switch (i10) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return NTLMEngineImpl.FLAG_WORKSTATION_PRESENT;
            default:
                return -1;
        }
    }

    /* renamed from: Q */
    public static int m33421Q(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? -1 : 8;
        }
        return 4;
    }

    /* renamed from: e */
    public static void m33426e(String str, List<C7653n> list) {
        if ("audio/raw".equals(str)) {
            if (C4401z0.f26679a < 26 && C4401z0.f26680b.equals("R9") && list.size() == 1 && list.get(0).f37201a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(C7653n.m33312A("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            m33419O(list, new g() { // from class: p7.r
                @Override // p268p7.C7661v.g
                /* renamed from: a */
                public final int mo33404a(Object obj) {
                    int m33413I;
                    m33413I = C7661v.m33413I((C7653n) obj);
                    return m33413I;
                }
            });
        }
        int i10 = C4401z0.f26679a;
        if (i10 < 21 && list.size() > 1) {
            String str2 = list.get(0).f37201a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                m33419O(list, new g() { // from class: p7.s
                    @Override // p268p7.C7661v.g
                    /* renamed from: a */
                    public final int mo33404a(Object obj) {
                        int m33414J;
                        m33414J = C7661v.m33414J((C7653n) obj);
                        return m33414J;
                    }
                });
            }
        }
        if (i10 >= 30 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f37201a)) {
            return;
        }
        list.add(list.remove(0));
    }

    /* renamed from: f */
    public static int m33427f(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return NTLMEngineImpl.FLAG_WORKSTATION_PRESENT;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return NTLMEngineImpl.FLAG_REQUEST_NTLM2_SESSION;
            case 20:
                return Constants.f7590MB;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return NTLMEngineImpl.FLAG_TARGETINFO_PRESENT;
            default:
                return -1;
        }
    }

    /* renamed from: g */
    public static int m33428g(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i10) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i10) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i10) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return NTLMEngineImpl.FLAG_WORKSTATION_PRESENT;
                                    default:
                                        switch (i10) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: h */
    public static int m33429h(int i10) {
        if (i10 == 1 || i10 == 2) {
            return 25344;
        }
        switch (i10) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case NTLMEngineImpl.FLAG_WORKSTATION_PRESENT /* 8192 */:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case NTLMEngineImpl.FLAG_REQUEST_NTLM2_SESSION /* 524288 */:
                return 35651584;
            default:
                return -1;
        }
    }

    /* renamed from: i */
    public static int m33430i(int i10) {
        if (i10 == 66) {
            return 1;
        }
        if (i10 == 77) {
            return 2;
        }
        if (i10 == 88) {
            return 4;
        }
        if (i10 == 100) {
            return 8;
        }
        if (i10 == 110) {
            return 16;
        }
        if (i10 != 122) {
            return i10 != 244 ? -1 : 64;
        }
        return 32;
    }

    /* renamed from: j */
    public static Integer m33431j(String str) {
        int i10;
        if (str == null) {
            return null;
        }
        switch (str) {
            case "01":
                return 1;
            case "02":
                return 2;
            case "03":
                return 4;
            case "04":
                return 8;
            case "05":
                i10 = 16;
                break;
            case "06":
                i10 = 32;
                break;
            case "07":
                i10 = 64;
                break;
            case "08":
                i10 = 128;
                break;
            case "09":
                i10 = 256;
                break;
            case "10":
                i10 = 512;
                break;
            case "11":
                i10 = 1024;
                break;
            case "12":
                i10 = 2048;
                break;
            case "13":
                i10 = 4096;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i10);
    }

    /* renamed from: k */
    public static Integer m33432k(String str) {
        int i10;
        if (str == null) {
            return null;
        }
        switch (str) {
            case "00":
                return 1;
            case "01":
                return 2;
            case "02":
                return 4;
            case "03":
                return 8;
            case "04":
                i10 = 16;
                break;
            case "05":
                i10 = 32;
                break;
            case "06":
                i10 = 64;
                break;
            case "07":
                i10 = 128;
                break;
            case "08":
                i10 = 256;
                break;
            case "09":
                i10 = 512;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i10);
    }

    /* renamed from: l */
    public static Pair<Integer, Integer> m33433l(String str, String[] strArr) {
        if (strArr.length != 3) {
            C4392v.m22275i("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if (!"audio/mp4a-latm".equals(C4400z.m22300h(Integer.parseInt(strArr[1], 16)))) {
                return null;
            }
            int m33418N = m33418N(Integer.parseInt(strArr[2]));
            if (m33418N != -1) {
                return new Pair<>(Integer.valueOf(m33418N), 0);
            }
            return null;
        } catch (NumberFormatException e10) {
            C4392v.m22275i("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
    }

    /* renamed from: m */
    public static Pair<Integer, Integer> m33434m(String str, String[] strArr, C4665b c4665b) {
        StringBuilder sb2;
        int parseInt;
        int parseInt2;
        int parseInt3;
        StringBuilder sb3;
        int i10;
        String sb4;
        if (strArr.length >= 4) {
            int i11 = 1;
            try {
                parseInt = Integer.parseInt(strArr[1]);
                parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
                parseInt3 = Integer.parseInt(strArr[3]);
            } catch (NumberFormatException e10) {
                sb2 = new StringBuilder();
            }
            if (parseInt != 0) {
                sb3 = new StringBuilder();
                sb3.append("Unknown AV1 profile: ");
                sb3.append(parseInt);
            } else {
                if (parseInt3 != 8 && parseInt3 != 10) {
                    sb2 = new StringBuilder();
                    sb2.append("Unknown AV1 bit depth: ");
                    sb2.append(parseInt3);
                    sb4 = sb2.toString();
                    C4392v.m22275i("MediaCodecUtil", sb4);
                    return null;
                }
                if (parseInt3 != 8) {
                    i11 = (c4665b == null || !(c4665b.f27511e != null || (i10 = c4665b.f27510d) == 7 || i10 == 6)) ? 2 : 4096;
                }
                int m33427f = m33427f(parseInt2);
                if (m33427f != -1) {
                    return new Pair<>(Integer.valueOf(i11), Integer.valueOf(m33427f));
                }
                sb3 = new StringBuilder();
                sb3.append("Unknown AV1 level: ");
                sb3.append(parseInt2);
            }
            sb4 = sb3.toString();
            C4392v.m22275i("MediaCodecUtil", sb4);
            return null;
        }
        sb2 = new StringBuilder();
        sb2.append("Ignoring malformed AV1 codec string: ");
        sb2.append(str);
        sb4 = sb2.toString();
        C4392v.m22275i("MediaCodecUtil", sb4);
        return null;
    }

    /* renamed from: n */
    public static Pair<Integer, Integer> m33435n(String str, String[] strArr) {
        StringBuilder sb2;
        int parseInt;
        int parseInt2;
        int m33430i;
        String str2;
        if (strArr.length >= 2) {
            try {
                if (strArr[1].length() == 6) {
                    parseInt = Integer.parseInt(strArr[1].substring(0, 2), 16);
                    parseInt2 = Integer.parseInt(strArr[1].substring(4), 16);
                } else {
                    if (strArr.length < 3) {
                        C4392v.m22275i("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                        return null;
                    }
                    parseInt = Integer.parseInt(strArr[1]);
                    parseInt2 = Integer.parseInt(strArr[2]);
                }
                m33430i = m33430i(parseInt);
            } catch (NumberFormatException e10) {
                sb2 = new StringBuilder();
            }
            if (m33430i == -1) {
                str2 = "Unknown AVC profile: " + parseInt;
                C4392v.m22275i("MediaCodecUtil", str2);
                return null;
            }
            int m33428g = m33428g(parseInt2);
            if (m33428g != -1) {
                return new Pair<>(Integer.valueOf(m33430i), Integer.valueOf(m33428g));
            }
            sb2 = new StringBuilder();
            sb2.append("Unknown AVC level: ");
            sb2.append(parseInt2);
            str2 = sb2.toString();
            C4392v.m22275i("MediaCodecUtil", str2);
            return null;
        }
        sb2 = new StringBuilder();
        sb2.append("Ignoring malformed AVC codec string: ");
        sb2.append(str);
        str2 = sb2.toString();
        C4392v.m22275i("MediaCodecUtil", str2);
        return null;
    }

    /* renamed from: o */
    public static String m33436o(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f5, code lost:
    
        if (r0.equals("av01") == false) goto L12;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m33437p(p267p6.C7629w0 r4) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p268p7.C7661v.m33437p(p6.w0):android.util.Pair");
    }

    /* renamed from: q */
    public static C7653n m33438q(String str, boolean z10, boolean z11) {
        List<C7653n> m33439r = m33439r(str, z10, z11);
        return m33439r.isEmpty() ? null : m33439r.get(0);
    }

    /* renamed from: r */
    public static List<C7653n> m33439r(String str, boolean z10, boolean z11) {
        synchronized (C7661v.class) {
            try {
                b bVar = new b(str, z10, z11);
                HashMap<b, List<C7653n>> hashMap = f37295b;
                List<C7653n> list = hashMap.get(bVar);
                if (list != null) {
                    return list;
                }
                int i10 = C4401z0.f26679a;
                ArrayList<C7653n> m33440s = m33440s(bVar, i10 >= 21 ? new f(z10, z11) : new e());
                ArrayList<C7653n> arrayList = m33440s;
                if (z10) {
                    arrayList = m33440s;
                    if (m33440s.isEmpty()) {
                        arrayList = m33440s;
                        if (21 <= i10) {
                            arrayList = m33440s;
                            if (i10 <= 23) {
                                ArrayList<C7653n> m33440s2 = m33440s(bVar, new e());
                                arrayList = m33440s2;
                                if (!m33440s2.isEmpty()) {
                                    C4392v.m22275i("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + m33440s2.get(0).f37201a);
                                    arrayList = m33440s2;
                                }
                            }
                        }
                    }
                }
                m33426e(str, arrayList);
                List<C7653n> unmodifiableList = Collections.unmodifiableList(arrayList);
                hashMap.put(bVar, unmodifiableList);
                return unmodifiableList;
            } finally {
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:33|(5:57|(2:79|80)|59|(9:63|64|65|66|67|68|69|71|72)|10)|38|39|41|10) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0137, code lost:
    
        r23 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0118, code lost:
    
        if (r11.f37298b == false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b3 A[Catch: Exception -> 0x022e, TRY_ENTER, TryCatch #1 {Exception -> 0x022e, blocks: (B:2:0x0000, B:6:0x0026, B:10:0x01ea, B:11:0x003a, B:14:0x0052, B:44:0x01a7, B:47:0x01b3, B:49:0x01bb, B:52:0x01f0, B:53:0x022a), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f0 A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<p268p7.C7653n> m33440s(p268p7.C7661v.b r11, p268p7.C7661v.d r12) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p268p7.C7661v.m33440s(p7.v$b, p7.v$d):java.util.ArrayList");
    }

    /* renamed from: t */
    public static List<C7653n> m33441t(List<C7653n> list, final C7629w0 c7629w0) {
        ArrayList arrayList = new ArrayList(list);
        m33419O(arrayList, new g(c7629w0) { // from class: p7.t

            /* renamed from: a */
            public final C7629w0 f37292a;

            {
                this.f37292a = c7629w0;
            }

            @Override // p268p7.C7661v.g
            /* renamed from: a */
            public final int mo33404a(Object obj) {
                int m33415K;
                m33415K = C7661v.m33415K(this.f37292a, (C7653n) obj);
                return m33415K;
            }
        });
        return arrayList;
    }

    /* renamed from: u */
    public static C7653n m33442u() {
        return m33438q("audio/raw", false, false);
    }

    /* renamed from: v */
    public static Pair<Integer, Integer> m33443v(String str, String[] strArr) {
        String str2;
        StringBuilder sb2;
        String str3;
        StringBuilder sb3;
        StringBuilder sb4;
        if (strArr.length < 3) {
            sb4 = new StringBuilder();
        } else {
            Matcher matcher = f37294a.matcher(strArr[1]);
            if (matcher.matches()) {
                String group = matcher.group(1);
                Integer m33432k = m33432k(group);
                if (m33432k == null) {
                    sb2 = new StringBuilder();
                    str2 = group;
                    str3 = "Unknown Dolby Vision profile string: ";
                } else {
                    str2 = strArr[2];
                    Integer m33431j = m33431j(str2);
                    if (m33431j != null) {
                        return new Pair<>(m33432k, m33431j);
                    }
                    sb2 = new StringBuilder();
                    str3 = "Unknown Dolby Vision level string: ";
                }
                sb2.append(str3);
                sb3 = sb2;
                sb3.append(str2);
                C4392v.m22275i("MediaCodecUtil", sb3.toString());
                return null;
            }
            sb4 = new StringBuilder();
        }
        sb4.append("Ignoring malformed Dolby Vision codec string: ");
        sb3 = sb4;
        str2 = str;
        sb3.append(str2);
        C4392v.m22275i("MediaCodecUtil", sb3.toString());
        return null;
    }

    /* renamed from: w */
    public static Pair<Integer, Integer> m33444w(String str, String[] strArr) {
        String str2;
        StringBuilder sb2;
        String str3;
        StringBuilder sb3;
        StringBuilder sb4;
        if (strArr.length < 4) {
            sb4 = new StringBuilder();
        } else {
            int i10 = 1;
            Matcher matcher = f37294a.matcher(strArr[1]);
            if (matcher.matches()) {
                String group = matcher.group(1);
                if (!"1".equals(group)) {
                    if (!"2".equals(group)) {
                        sb2 = new StringBuilder();
                        str3 = "Unknown HEVC profile string: ";
                        str2 = group;
                        sb2.append(str3);
                        sb3 = sb2;
                        sb3.append(str2);
                        C4392v.m22275i("MediaCodecUtil", sb3.toString());
                        return null;
                    }
                    i10 = 2;
                }
                str2 = strArr[3];
                Integer m33446y = m33446y(str2);
                if (m33446y != null) {
                    return new Pair<>(Integer.valueOf(i10), m33446y);
                }
                sb2 = new StringBuilder();
                str3 = "Unknown HEVC level string: ";
                sb2.append(str3);
                sb3 = sb2;
                sb3.append(str2);
                C4392v.m22275i("MediaCodecUtil", sb3.toString());
                return null;
            }
            sb4 = new StringBuilder();
        }
        sb4.append("Ignoring malformed HEVC codec string: ");
        sb3 = sb4;
        str2 = str;
        sb3.append(str2);
        C4392v.m22275i("MediaCodecUtil", sb3.toString());
        return null;
    }

    /* renamed from: x */
    public static Pair<Integer, Integer> m33445x(String str, String[] strArr) {
        StringBuilder sb2;
        int parseInt;
        int parseInt2;
        int m33421Q;
        String str2;
        if (strArr.length >= 3) {
            try {
                parseInt = Integer.parseInt(strArr[1]);
                parseInt2 = Integer.parseInt(strArr[2]);
                m33421Q = m33421Q(parseInt);
            } catch (NumberFormatException e10) {
                sb2 = new StringBuilder();
            }
            if (m33421Q == -1) {
                str2 = "Unknown VP9 profile: " + parseInt;
                C4392v.m22275i("MediaCodecUtil", str2);
                return null;
            }
            int m33420P = m33420P(parseInt2);
            if (m33420P != -1) {
                return new Pair<>(Integer.valueOf(m33421Q), Integer.valueOf(m33420P));
            }
            sb2 = new StringBuilder();
            sb2.append("Unknown VP9 level: ");
            sb2.append(parseInt2);
            str2 = sb2.toString();
            C4392v.m22275i("MediaCodecUtil", str2);
            return null;
        }
        sb2 = new StringBuilder();
        sb2.append("Ignoring malformed VP9 codec string: ");
        sb2.append(str);
        str2 = sb2.toString();
        C4392v.m22275i("MediaCodecUtil", str2);
        return null;
    }

    /* renamed from: y */
    public static Integer m33446y(String str) {
        int i10;
        if (str == null) {
            return null;
        }
        switch (str) {
            case "H30":
                return 2;
            case "H60":
                return 8;
            case "H63":
                i10 = 32;
                break;
            case "H90":
                i10 = 128;
                break;
            case "H93":
                i10 = 512;
                break;
            case "L30":
                return 1;
            case "L60":
                return 4;
            case "L63":
                return 16;
            case "L90":
                i10 = 64;
                break;
            case "L93":
                i10 = 256;
                break;
            case "H120":
                i10 = 2048;
                break;
            case "H123":
                i10 = 8192;
                break;
            case "H150":
                i10 = 32768;
                break;
            case "H153":
                i10 = 131072;
                break;
            case "H156":
                i10 = 524288;
                break;
            case "H180":
                i10 = 2097152;
                break;
            case "H183":
                i10 = 8388608;
                break;
            case "H186":
                i10 = 33554432;
                break;
            case "L120":
                i10 = 1024;
                break;
            case "L123":
                i10 = 4096;
                break;
            case "L150":
                i10 = 16384;
                break;
            case "L153":
                i10 = 65536;
                break;
            case "L156":
                i10 = 262144;
                break;
            case "L180":
                i10 = 1048576;
                break;
            case "L183":
                i10 = 4194304;
                break;
            case "L186":
                i10 = 16777216;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i10);
    }

    /* renamed from: z */
    public static boolean m33447z(MediaCodecInfo mediaCodecInfo) {
        return C4401z0.f26679a >= 29 && m33405A(mediaCodecInfo);
    }
}
