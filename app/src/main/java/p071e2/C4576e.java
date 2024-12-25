package p071e2;

import android.app.Notification;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e2/e.class
 */
/* renamed from: e2.e */
/* loaded from: combined.jar:classes1.jar:e2/e.class */
public final class C4576e {

    /* renamed from: a */
    public final int f27215a;

    /* renamed from: b */
    public final int f27216b;

    /* renamed from: c */
    public final Notification f27217c;

    public C4576e(int i10, Notification notification, int i11) {
        this.f27215a = i10;
        this.f27217c = notification;
        this.f27216b = i11;
    }

    /* renamed from: a */
    public int m23113a() {
        return this.f27216b;
    }

    /* renamed from: b */
    public Notification m23114b() {
        return this.f27217c;
    }

    /* renamed from: c */
    public int m23115c() {
        return this.f27215a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4576e.class != obj.getClass()) {
            return false;
        }
        C4576e c4576e = (C4576e) obj;
        if (this.f27215a == c4576e.f27215a && this.f27216b == c4576e.f27216b) {
            return this.f27217c.equals(c4576e.f27217c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f27215a * 31) + this.f27216b) * 31) + this.f27217c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f27215a + ", mForegroundServiceType=" + this.f27216b + ", mNotification=" + this.f27217c + '}';
    }
}
