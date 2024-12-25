package androidx.media;

import android.media.AudioAttributes;
import p032c2.AbstractC0978b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/media/AudioAttributesImplApi21Parcelizer.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/media/AudioAttributesImplApi21Parcelizer.class */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC0978b abstractC0978b) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f3811a = (AudioAttributes) abstractC0978b.m5869r(audioAttributesImplApi21.f3811a, 1);
        audioAttributesImplApi21.f3812b = abstractC0978b.m5867p(audioAttributesImplApi21.f3812b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC0978b abstractC0978b) {
        abstractC0978b.m5875x(false, false);
        abstractC0978b.m5845H(audioAttributesImplApi21.f3811a, 1);
        abstractC0978b.m5843F(audioAttributesImplApi21.f3812b, 2);
    }
}
