package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/media/AudioAttributesImplApi21.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/media/AudioAttributesImplApi21.class */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f3811a;

    /* renamed from: b */
    public int f3812b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/media/AudioAttributesImplApi21$a.class
     */
    /* renamed from: androidx.media.AudioAttributesImplApi21$a */
    /* loaded from: combined.jar:classes1.jar:androidx/media/AudioAttributesImplApi21$a.class */
    public static class C0595a implements AudioAttributesImpl.InterfaceC0594a {

        /* renamed from: a */
        public final AudioAttributes.Builder f3813a = new AudioAttributes.Builder();

        @Override // androidx.media.AudioAttributesImpl.InterfaceC0594a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0595a mo3212a(int i10) {
            this.f3813a.setLegacyStreamType(i10);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.InterfaceC0594a
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi21(this.f3813a.build());
        }
    }

    public AudioAttributesImplApi21() {
        this.f3812b = -1;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i10) {
        this.f3811a = audioAttributes;
        this.f3812b = i10;
    }

    @Override // androidx.media.AudioAttributesImpl
    /* renamed from: a */
    public int mo3211a() {
        int i10 = this.f3812b;
        return i10 != -1 ? i10 : AudioAttributesCompat.m3205b(false, m3213b(), m3214c());
    }

    /* renamed from: b */
    public int m3213b() {
        return this.f3811a.getFlags();
    }

    /* renamed from: c */
    public int m3214c() {
        return this.f3811a.getUsage();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f3811a.equals(((AudioAttributesImplApi21) obj).f3811a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3811a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f3811a;
    }
}
