package p059d9;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/m.class
 */
/* renamed from: d9.m */
/* loaded from: combined.jar:classes2.jar:d9/m.class */
public final class C4374m {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static int m22149a(String str) {
        boolean z10;
        if (str == null) {
            return -1;
        }
        String m22312t = C4400z.m22312t(str);
        m22312t.hashCode();
        switch (m22312t.hashCode()) {
            case -2123537834:
                if (m22312t.equals("audio/eac3-joc")) {
                    z10 = false;
                    break;
                }
                z10 = -1;
                break;
            case -1662384011:
                if (m22312t.equals("video/mp2p")) {
                    z10 = true;
                    break;
                }
                z10 = -1;
                break;
            case -1662384007:
                if (m22312t.equals("video/mp2t")) {
                    z10 = 2;
                    break;
                }
                z10 = -1;
                break;
            case -1662095187:
                if (m22312t.equals("video/webm")) {
                    z10 = 3;
                    break;
                }
                z10 = -1;
                break;
            case -1606874997:
                if (m22312t.equals("audio/amr-wb")) {
                    z10 = 4;
                    break;
                }
                z10 = -1;
                break;
            case -1487394660:
                if (m22312t.equals("image/jpeg")) {
                    z10 = 5;
                    break;
                }
                z10 = -1;
                break;
            case -1248337486:
                if (m22312t.equals("application/mp4")) {
                    z10 = 6;
                    break;
                }
                z10 = -1;
                break;
            case -1004728940:
                if (m22312t.equals("text/vtt")) {
                    z10 = 7;
                    break;
                }
                z10 = -1;
                break;
            case -387023398:
                if (m22312t.equals("audio/x-matroska")) {
                    z10 = 8;
                    break;
                }
                z10 = -1;
                break;
            case -43467528:
                if (m22312t.equals("application/webm")) {
                    z10 = 9;
                    break;
                }
                z10 = -1;
                break;
            case 13915911:
                if (m22312t.equals("video/x-flv")) {
                    z10 = 10;
                    break;
                }
                z10 = -1;
                break;
            case 187078296:
                if (m22312t.equals("audio/ac3")) {
                    z10 = 11;
                    break;
                }
                z10 = -1;
                break;
            case 187078297:
                if (m22312t.equals("audio/ac4")) {
                    z10 = 12;
                    break;
                }
                z10 = -1;
                break;
            case 187078669:
                if (m22312t.equals("audio/amr")) {
                    z10 = 13;
                    break;
                }
                z10 = -1;
                break;
            case 187090232:
                if (m22312t.equals("audio/mp4")) {
                    z10 = 14;
                    break;
                }
                z10 = -1;
                break;
            case 187091926:
                if (m22312t.equals("audio/ogg")) {
                    z10 = 15;
                    break;
                }
                z10 = -1;
                break;
            case 187099443:
                if (m22312t.equals("audio/wav")) {
                    z10 = 16;
                    break;
                }
                z10 = -1;
                break;
            case 1331848029:
                if (m22312t.equals("video/mp4")) {
                    z10 = 17;
                    break;
                }
                z10 = -1;
                break;
            case 1503095341:
                if (m22312t.equals("audio/3gpp")) {
                    z10 = 18;
                    break;
                }
                z10 = -1;
                break;
            case 1504578661:
                if (m22312t.equals("audio/eac3")) {
                    z10 = 19;
                    break;
                }
                z10 = -1;
                break;
            case 1504619009:
                if (m22312t.equals("audio/flac")) {
                    z10 = 20;
                    break;
                }
                z10 = -1;
                break;
            case 1504831518:
                if (m22312t.equals("audio/mpeg")) {
                    z10 = 21;
                    break;
                }
                z10 = -1;
                break;
            case 1505118770:
                if (m22312t.equals("audio/webm")) {
                    z10 = 22;
                    break;
                }
                z10 = -1;
                break;
            case 2039520277:
                if (m22312t.equals("video/x-matroska")) {
                    z10 = 23;
                    break;
                }
                z10 = -1;
                break;
            default:
                z10 = -1;
                break;
        }
        switch (z10) {
        }
        return -1;
    }

    /* renamed from: b */
    public static int m22150b(Map<String, List<String>> map) {
        List<String> list = map.get("Content-Type");
        return m22149a((list == null || list.isEmpty()) ? null : list.get(0));
    }

    /* renamed from: c */
    public static int m22151c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        return (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) ? 14 : -1;
    }
}
