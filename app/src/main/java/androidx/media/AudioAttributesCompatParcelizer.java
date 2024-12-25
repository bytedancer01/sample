package androidx.media;

import p032c2.AbstractC0978b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/media/AudioAttributesCompatParcelizer.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/media/AudioAttributesCompatParcelizer.class */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC0978b abstractC0978b) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f3809a = (AudioAttributesImpl) abstractC0978b.m5873v(audioAttributesCompat.f3809a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC0978b abstractC0978b) {
        abstractC0978b.m5875x(false, false);
        abstractC0978b.m5850M(audioAttributesCompat.f3809a, 1);
    }
}
