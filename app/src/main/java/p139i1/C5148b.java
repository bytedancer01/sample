package p139i1;

import android.media.session.MediaSessionManager$RemoteUserInfo;
import android.os.Build;
import android.text.TextUtils;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i1/b.class
 */
/* renamed from: i1.b */
/* loaded from: combined.jar:classes1.jar:i1/b.class */
public final class C5148b {

    /* renamed from: a */
    public InterfaceC5149c f29513a;

    public C5148b(MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
        String m25781a = C5150d.m25781a(mediaSessionManager$RemoteUserInfo);
        if (m25781a == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(m25781a)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.f29513a = new C5150d(mediaSessionManager$RemoteUserInfo);
    }

    public C5148b(String str, int i10, int i11) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.f29513a = Build.VERSION.SDK_INT >= 28 ? new C5150d(str, i10, i11) : new C5151e(str, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5148b) {
            return this.f29513a.equals(((C5148b) obj).f29513a);
        }
        return false;
    }

    public int hashCode() {
        return this.f29513a.hashCode();
    }
}
