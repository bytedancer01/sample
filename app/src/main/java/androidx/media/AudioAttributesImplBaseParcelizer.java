package androidx.media;

import p032c2.AbstractC0978b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/media/AudioAttributesImplBaseParcelizer.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/media/AudioAttributesImplBaseParcelizer.class */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC0978b abstractC0978b) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f3814a = abstractC0978b.m5867p(audioAttributesImplBase.f3814a, 1);
        audioAttributesImplBase.f3815b = abstractC0978b.m5867p(audioAttributesImplBase.f3815b, 2);
        audioAttributesImplBase.f3816c = abstractC0978b.m5867p(audioAttributesImplBase.f3816c, 3);
        audioAttributesImplBase.f3817d = abstractC0978b.m5867p(audioAttributesImplBase.f3817d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC0978b abstractC0978b) {
        abstractC0978b.m5875x(false, false);
        abstractC0978b.m5843F(audioAttributesImplBase.f3814a, 1);
        abstractC0978b.m5843F(audioAttributesImplBase.f3815b, 2);
        abstractC0978b.m5843F(audioAttributesImplBase.f3816c, 3);
        abstractC0978b.m5843F(audioAttributesImplBase.f3817d, 4);
    }
}
