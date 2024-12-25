package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
import androidx.media.AudioAttributesImplApi26;
import androidx.media.AudioAttributesImplBase;
import p032c2.InterfaceC0980d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/media/AudioAttributesCompat.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/media/AudioAttributesCompat.class */
public class AudioAttributesCompat implements InterfaceC0980d {

    /* renamed from: b */
    public static final SparseIntArray f3806b;

    /* renamed from: c */
    public static boolean f3807c;

    /* renamed from: d */
    public static final int[] f3808d;

    /* renamed from: a */
    public AudioAttributesImpl f3809a;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/media/AudioAttributesCompat$a.class
     */
    /* renamed from: androidx.media.AudioAttributesCompat$a */
    /* loaded from: combined.jar:classes1.jar:androidx/media/AudioAttributesCompat$a.class */
    public static class C0593a {

        /* renamed from: a */
        public final AudioAttributesImpl.InterfaceC0594a f3810a;

        public C0593a() {
            this.f3810a = AudioAttributesCompat.f3807c ? new AudioAttributesImplBase.C0597a() : Build.VERSION.SDK_INT >= 26 ? new AudioAttributesImplApi26.C0596a() : new AudioAttributesImplApi21.C0595a();
        }

        /* renamed from: a */
        public AudioAttributesCompat m3209a() {
            return new AudioAttributesCompat(this.f3810a.build());
        }

        /* renamed from: b */
        public C0593a m3210b(int i10) {
            this.f3810a.mo3212a(i10);
            return this;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3806b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        f3808d = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    public AudioAttributesCompat() {
    }

    public AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f3809a = audioAttributesImpl;
    }

    /* renamed from: b */
    public static int m3205b(boolean z10, int i10, int i11) {
        if ((i10 & 1) == 1) {
            return z10 ? 1 : 7;
        }
        if ((i10 & 4) == 4) {
            return z10 ? 0 : 6;
        }
        int i12 = 0;
        switch (i11) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                break;
            case 3:
                if (!z10) {
                    i12 = 8;
                    break;
                } else {
                    i12 = 0;
                    break;
                }
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                if (!z10) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i11 + " in audio attributes");
        }
        return i12;
    }

    /* renamed from: c */
    public static String m3206c(int i10) {
        switch (i10) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i10;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    /* renamed from: d */
    public static AudioAttributesCompat m3207d(Object obj) {
        if (f3807c) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 26 ? new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes) obj)) : new AudioAttributesCompat(new AudioAttributesImplApi21((AudioAttributes) obj));
    }

    /* renamed from: a */
    public int m3208a() {
        return this.f3809a.mo3211a();
    }

    public boolean equals(Object obj) {
        boolean z10 = false;
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesImpl audioAttributesImpl = this.f3809a;
        AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).f3809a;
        if (audioAttributesImpl != null) {
            return audioAttributesImpl.equals(audioAttributesImpl2);
        }
        if (audioAttributesImpl2 == null) {
            z10 = true;
        }
        return z10;
    }

    public int hashCode() {
        return this.f3809a.hashCode();
    }

    public String toString() {
        return this.f3809a.toString();
    }
}
