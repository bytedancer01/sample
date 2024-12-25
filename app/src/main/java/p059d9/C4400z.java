package p059d9;

import android.text.TextUtils;
import ec.C4699b;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p301r6.C7966a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/z.class
 */
/* renamed from: d9.z */
/* loaded from: combined.jar:classes2.jar:d9/z.class */
public final class C4400z {

    /* renamed from: a */
    public static final ArrayList<a> f26672a = new ArrayList<>();

    /* renamed from: b */
    public static final Pattern f26673b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:d9/z$a.class
     */
    /* renamed from: d9.z$a */
    /* loaded from: combined.jar:classes2.jar:d9/z$a.class */
    public static final class a {

        /* renamed from: a */
        public final String f26674a;

        /* renamed from: b */
        public final String f26675b;

        /* renamed from: c */
        public final int f26676c;
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:d9/z$b.class
     */
    /* renamed from: d9.z$b */
    /* loaded from: combined.jar:classes2.jar:d9/z$b.class */
    public static final class b {

        /* renamed from: a */
        public final int f26677a;

        /* renamed from: b */
        public final int f26678b;

        public b(int i10, int i11) {
            this.f26677a = i10;
            this.f26678b = i11;
        }
    }

    /* renamed from: a */
    public static boolean m22293a(String str, String str2) {
        b m22301i;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                if (str2 == null || (m22301i = m22301i(str2)) == null) {
                    return false;
                }
                int m34526d = C7966a.m34526d(m22301i.f26678b);
                boolean z10 = false;
                if (m34526d != 0) {
                    z10 = false;
                    if (m34526d != 16) {
                        z10 = true;
                    }
                }
                return z10;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public static boolean m22294b(String str, String str2) {
        return m22296d(str, str2) != null;
    }

    /* renamed from: c */
    public static String m22295c(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : C4401z0.m22360X0(str)) {
            String m22299g = m22299g(str2);
            if (m22299g != null && m22308p(m22299g)) {
                return m22299g;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static String m22296d(String str, String str2) {
        String str3 = null;
        if (str != null) {
            if (str2 == null) {
                str3 = null;
            } else {
                String[] m22360X0 = C4401z0.m22360X0(str);
                StringBuilder sb2 = new StringBuilder();
                for (String str4 : m22360X0) {
                    if (str2.equals(m22299g(str4))) {
                        if (sb2.length() > 0) {
                            sb2.append(",");
                        }
                        sb2.append(str4);
                    }
                }
                str3 = null;
                if (sb2.length() > 0) {
                    str3 = sb2.toString();
                }
            }
        }
        return str3;
    }

    /* renamed from: e */
    public static String m22297e(String str) {
        int size = f26672a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f26672a.get(i10);
            if (str.startsWith(aVar.f26675b)) {
                return aVar.f26674a;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static int m22298f(String str, String str2) {
        b m22301i;
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (m22301i = m22301i(str2)) == null) {
                    return 0;
                }
                return C7966a.m34526d(m22301i.f26678b);
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    /* renamed from: g */
    public static String m22299g(String str) {
        if (str == null) {
            return null;
        }
        String m23638e = C4699b.m23638e(str.trim());
        if (m23638e.startsWith("avc1") || m23638e.startsWith("avc3")) {
            return "video/avc";
        }
        if (m23638e.startsWith("hev1") || m23638e.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (m23638e.startsWith("dvav") || m23638e.startsWith("dva1") || m23638e.startsWith("dvhe") || m23638e.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (m23638e.startsWith("av01")) {
            return "video/av01";
        }
        if (m23638e.startsWith("vp9") || m23638e.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (m23638e.startsWith("vp8") || m23638e.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!m23638e.startsWith("mp4a")) {
            return m23638e.startsWith("mha1") ? "audio/mha1" : m23638e.startsWith("mhm1") ? "audio/mhm1" : (m23638e.startsWith("ac-3") || m23638e.startsWith("dac3")) ? "audio/ac3" : (m23638e.startsWith("ec-3") || m23638e.startsWith("dec3")) ? "audio/eac3" : m23638e.startsWith("ec+3") ? "audio/eac3-joc" : (m23638e.startsWith("ac-4") || m23638e.startsWith("dac4")) ? "audio/ac4" : m23638e.startsWith("dtsc") ? "audio/vnd.dts" : m23638e.startsWith("dtse") ? "audio/vnd.dts.hd;profile=lbr" : (m23638e.startsWith("dtsh") || m23638e.startsWith("dtsl")) ? "audio/vnd.dts.hd" : m23638e.startsWith("dtsx") ? "audio/vnd.dts.uhd" : m23638e.startsWith("opus") ? "audio/opus" : m23638e.startsWith("vorbis") ? "audio/vorbis" : m23638e.startsWith("flac") ? "audio/flac" : m23638e.startsWith("stpp") ? "application/ttml+xml" : m23638e.startsWith("wvtt") ? "text/vtt" : m23638e.contains("cea708") ? "application/cea-708" : (m23638e.contains("eia608") || m23638e.contains("cea608")) ? "application/cea-608" : m22297e(m23638e);
        }
        String str2 = null;
        if (m23638e.startsWith("mp4a.")) {
            b m22301i = m22301i(m23638e);
            str2 = null;
            if (m22301i != null) {
                str2 = m22300h(m22301i.f26677a);
            }
        }
        String str3 = str2;
        if (str2 == null) {
            str3 = "audio/mp4a-latm";
        }
        return str3;
    }

    /* renamed from: h */
    public static String m22300h(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* renamed from: i */
    public static b m22301i(String str) {
        Matcher matcher = f26673b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) C4349a.m21882e(matcher.group(1));
        String group = matcher.group(2);
        int i10 = 0;
        try {
            int parseInt = Integer.parseInt(str2, 16);
            if (group != null) {
                i10 = Integer.parseInt(group);
            }
            return new b(parseInt, i10);
        } catch (NumberFormatException e10) {
            return null;
        }
    }

    /* renamed from: j */
    public static String m22302j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : C4401z0.m22360X0(str)) {
            String m22299g = m22299g(str2);
            if (m22299g != null && m22310r(m22299g)) {
                return m22299g;
            }
        }
        return null;
    }

    /* renamed from: k */
    public static String m22303k(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: l */
    public static int m22304l(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m22308p(str)) {
            return 1;
        }
        if (m22311s(str)) {
            return 2;
        }
        if (m22310r(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return m22305m(str);
    }

    /* renamed from: m */
    public static int m22305m(String str) {
        int size = f26672a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f26672a.get(i10);
            if (str.equals(aVar.f26674a)) {
                return aVar.f26676c;
            }
        }
        return -1;
    }

    /* renamed from: n */
    public static int m22306n(String str) {
        return m22304l(m22299g(str));
    }

    /* renamed from: o */
    public static String m22307o(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : C4401z0.m22360X0(str)) {
            String m22299g = m22299g(str2);
            if (m22299g != null && m22311s(m22299g)) {
                return m22299g;
            }
        }
        return null;
    }

    /* renamed from: p */
    public static boolean m22308p(String str) {
        return "audio".equals(m22303k(str));
    }

    /* renamed from: q */
    public static boolean m22309q(String str) {
        boolean z10 = false;
        if (str == null) {
            return false;
        }
        if (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska")) {
            z10 = true;
        }
        return z10;
    }

    /* renamed from: r */
    public static boolean m22310r(String str) {
        return "text".equals(m22303k(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* renamed from: s */
    public static boolean m22311s(String str) {
        return "video".equals(m22303k(str));
    }

    /* renamed from: t */
    public static String m22312t(String str) {
        str.hashCode();
        switch (str) {
            case "audio/x-flac":
                return "audio/flac";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return str;
        }
    }
}
