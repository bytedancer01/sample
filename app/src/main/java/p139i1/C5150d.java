package p139i1;

import android.media.session.MediaSessionManager$RemoteUserInfo;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i1/d.class
 */
/* renamed from: i1.d */
/* loaded from: combined.jar:classes1.jar:i1/d.class */
public final class C5150d extends C5151e {

    /* renamed from: d */
    public final MediaSessionManager$RemoteUserInfo f29514d;

    public C5150d(MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
        super(mediaSessionManager$RemoteUserInfo.getPackageName(), mediaSessionManager$RemoteUserInfo.getPid(), mediaSessionManager$RemoteUserInfo.getUid());
        this.f29514d = mediaSessionManager$RemoteUserInfo;
    }

    public C5150d(String str, int i10, int i11) {
        super(str, i10, i11);
        this.f29514d = new MediaSessionManager$RemoteUserInfo(str, i10, i11);
    }

    /* renamed from: a */
    public static String m25781a(MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
        return mediaSessionManager$RemoteUserInfo.getPackageName();
    }
}
