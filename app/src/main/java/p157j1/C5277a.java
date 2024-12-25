package p157j1;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j1/a.class
 */
/* renamed from: j1.a */
/* loaded from: combined.jar:classes1.jar:j1/a.class */
public class C5277a {
    /* renamed from: a */
    public static Notification.MediaStyle m26354a() {
        return new Notification.MediaStyle();
    }

    /* renamed from: b */
    public static Notification.MediaStyle m26355b(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat.Token token) {
        if (iArr != null) {
            m26358e(mediaStyle, iArr);
        }
        if (token != null) {
            m26356c(mediaStyle, (MediaSession.Token) token.getToken());
        }
        return mediaStyle;
    }

    /* renamed from: c */
    public static void m26356c(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }

    /* renamed from: d */
    public static void m26357d(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    /* renamed from: e */
    public static void m26358e(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }
}
