package androidx.media;

import android.util.Log;
import androidx.media.AudioAttributesImpl;
import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/media/AudioAttributesImplBase.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/media/AudioAttributesImplBase.class */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f3814a;

    /* renamed from: b */
    public int f3815b;

    /* renamed from: c */
    public int f3816c;

    /* renamed from: d */
    public int f3817d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/media/AudioAttributesImplBase$a.class
     */
    /* renamed from: androidx.media.AudioAttributesImplBase$a */
    /* loaded from: combined.jar:classes1.jar:androidx/media/AudioAttributesImplBase$a.class */
    public static class C0597a implements AudioAttributesImpl.InterfaceC0594a {

        /* renamed from: a */
        public int f3818a = 0;

        /* renamed from: b */
        public int f3819b = 0;

        /* renamed from: c */
        public int f3820c = 0;

        /* renamed from: d */
        public int f3821d = -1;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: b */
        public final C0597a m3220b(int i10) {
            int i11 = 1;
            switch (i10) {
                case 0:
                case 10:
                    this.f3819b = i11;
                    break;
                case 1:
                case 2:
                case 4:
                case 5:
                case 8:
                case 9:
                    this.f3819b = 4;
                    break;
                case 3:
                    i11 = 2;
                    this.f3819b = i11;
                    break;
                case 6:
                    this.f3819b = 1;
                    this.f3820c |= 4;
                    break;
                case 7:
                    this.f3820c = 1 | this.f3820c;
                    this.f3819b = 4;
                    break;
                default:
                    Log.e("AudioAttributesCompat", "Invalid stream type " + i10 + " for AudioAttributesCompat");
                    break;
            }
            this.f3818a = AudioAttributesImplBase.m3216e(i10);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.InterfaceC0594a
        public AudioAttributesImpl build() {
            return new AudioAttributesImplBase(this.f3819b, this.f3820c, this.f3818a, this.f3821d);
        }

        @Override // androidx.media.AudioAttributesImpl.InterfaceC0594a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C0597a mo3212a(int i10) {
            if (i10 == 10) {
                throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
            }
            this.f3821d = i10;
            return m3220b(i10);
        }
    }

    public AudioAttributesImplBase() {
        this.f3814a = 0;
        this.f3815b = 0;
        this.f3816c = 0;
        this.f3817d = -1;
    }

    public AudioAttributesImplBase(int i10, int i11, int i12, int i13) {
        this.f3815b = i10;
        this.f3816c = i11;
        this.f3814a = i12;
        this.f3817d = i13;
    }

    /* renamed from: e */
    public static int m3216e(int i10) {
        switch (i10) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 9:
            default:
                return 0;
            case 10:
                return 11;
        }
    }

    @Override // androidx.media.AudioAttributesImpl
    /* renamed from: a */
    public int mo3211a() {
        int i10 = this.f3817d;
        return i10 != -1 ? i10 : AudioAttributesCompat.m3205b(false, this.f3816c, this.f3814a);
    }

    /* renamed from: b */
    public int m3217b() {
        return this.f3815b;
    }

    /* renamed from: c */
    public int m3218c() {
        int i10;
        int i11 = this.f3816c;
        int mo3211a = mo3211a();
        if (mo3211a == 6) {
            i10 = i11 | 4;
        } else {
            i10 = i11;
            if (mo3211a == 7) {
                i10 = i11 | 1;
            }
        }
        return i10 & 273;
    }

    /* renamed from: d */
    public int m3219d() {
        return this.f3814a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        boolean z10 = false;
        if (this.f3815b == audioAttributesImplBase.m3217b()) {
            z10 = false;
            if (this.f3816c == audioAttributesImplBase.m3218c()) {
                z10 = false;
                if (this.f3814a == audioAttributesImplBase.m3219d()) {
                    z10 = false;
                    if (this.f3817d == audioAttributesImplBase.f3817d) {
                        z10 = true;
                    }
                }
            }
        }
        return z10;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3815b), Integer.valueOf(this.f3816c), Integer.valueOf(this.f3814a), Integer.valueOf(this.f3817d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f3817d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f3817d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.m3206c(this.f3814a));
        sb2.append(" content=");
        sb2.append(this.f3815b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f3816c).toUpperCase());
        return sb2.toString();
    }
}
