package p267p6;

import android.content.Context;
import android.media.AudioManager;
import com.facebook.ads.AdError;
import java.util.UUID;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/h.class
 */
/* renamed from: p6.h */
/* loaded from: combined.jar:classes2.jar:p6/h.class */
public final class C7583h {

    /* renamed from: a */
    public static final UUID f36776a = new UUID(0, 0);

    /* renamed from: b */
    public static final UUID f36777b = new UUID(1186680826959645954L, -5988876978535335093L);

    /* renamed from: c */
    public static final UUID f36778c = new UUID(-2129748144642739255L, 8654423357094679310L);

    /* renamed from: d */
    public static final UUID f36779d = new UUID(-1301668207276963122L, -6645017420763422227L);

    /* renamed from: e */
    public static final UUID f36780e = new UUID(-7348484286925749626L, -6083546864340672619L);

    /* renamed from: a */
    public static int m32757a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        return audioManager == null ? -1 : audioManager.generateAudioSessionId();
    }

    /* renamed from: b */
    public static int m32758b(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        switch (i10) {
            case 15:
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i10) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return AdError.ICONVIEW_MISSING_ERROR_CODE;
                    default:
                        return 6006;
                }
        }
    }

    /* renamed from: c */
    public static String m32759c(int i10) {
        if (i10 == 0) {
            return "NO";
        }
        if (i10 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i10 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i10 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i10 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public static long m32760d(long j10) {
        long j11 = j10;
        if (j10 != -9223372036854775807L) {
            j11 = j10 == Long.MIN_VALUE ? j10 : j10 * 1000;
        }
        return j11;
    }

    /* renamed from: e */
    public static long m32761e(long j10) {
        long j11 = j10;
        if (j10 != -9223372036854775807L) {
            j11 = j10 == Long.MIN_VALUE ? j10 : j10 / 1000;
        }
        return j11;
    }
}
