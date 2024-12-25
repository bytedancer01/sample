package androidx.media;

import android.media.AudioAttributes;
import p032c2.AbstractC0978b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/media/AudioAttributesImplApi26Parcelizer.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/media/AudioAttributesImplApi26Parcelizer.class */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC0978b abstractC0978b) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f3811a = (AudioAttributes) abstractC0978b.m5869r(audioAttributesImplApi26.f3811a, 1);
        audioAttributesImplApi26.f3812b = abstractC0978b.m5867p(audioAttributesImplApi26.f3812b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AbstractC0978b abstractC0978b) {
        abstractC0978b.m5875x(false, false);
        abstractC0978b.m5845H(audioAttributesImplApi26.f3811a, 1);
        abstractC0978b.m5843F(audioAttributesImplApi26.f3812b, 2);
    }
}
