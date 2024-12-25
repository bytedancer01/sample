package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImplApi21;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/media/AudioAttributesImplApi26.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/media/AudioAttributesImplApi26.class */
public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/media/AudioAttributesImplApi26$a.class
     */
    /* renamed from: androidx.media.AudioAttributesImplApi26$a */
    /* loaded from: combined.jar:classes1.jar:androidx/media/AudioAttributesImplApi26$a.class */
    public static class C0596a extends AudioAttributesImplApi21.C0595a {
        @Override // androidx.media.AudioAttributesImplApi21.C0595a, androidx.media.AudioAttributesImpl.InterfaceC0594a
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi26(this.f3813a.build());
        }
    }

    public AudioAttributesImplApi26() {
    }

    public AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }
}
