package android.media;

import android.annotation.NonNull;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:android/media/AudioTrack$Builder.class
 */
/* loaded from: combined.jar:classes1.jar:android/media/AudioTrack$Builder.class */
public /* synthetic */ class AudioTrack$Builder {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public native /* synthetic */ AudioTrack build() throws UnsupportedOperationException;

    @NonNull
    public native /* synthetic */ AudioTrack$Builder setAudioAttributes(@NonNull AudioAttributes audioAttributes) throws IllegalArgumentException;

    @NonNull
    public native /* synthetic */ AudioTrack$Builder setAudioFormat(@NonNull AudioFormat audioFormat) throws IllegalArgumentException;

    @NonNull
    public native /* synthetic */ AudioTrack$Builder setBufferSizeInBytes(int i10) throws IllegalArgumentException;

    @NonNull
    public native /* synthetic */ AudioTrack$Builder setSessionId(int i10) throws IllegalArgumentException;

    @NonNull
    public native /* synthetic */ AudioTrack$Builder setTransferMode(int i10) throws IllegalArgumentException;
}
