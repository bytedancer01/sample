package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import p032c2.AbstractC0978b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/core/app/RemoteActionCompatParcelizer.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/core/app/RemoteActionCompatParcelizer.class */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0978b abstractC0978b) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2646a = (IconCompat) abstractC0978b.m5873v(remoteActionCompat.f2646a, 1);
        remoteActionCompat.f2647b = abstractC0978b.m5863l(remoteActionCompat.f2647b, 2);
        remoteActionCompat.f2648c = abstractC0978b.m5863l(remoteActionCompat.f2648c, 3);
        remoteActionCompat.f2649d = (PendingIntent) abstractC0978b.m5869r(remoteActionCompat.f2649d, 4);
        remoteActionCompat.f2650e = abstractC0978b.m5859h(remoteActionCompat.f2650e, 5);
        remoteActionCompat.f2651f = abstractC0978b.m5859h(remoteActionCompat.f2651f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0978b abstractC0978b) {
        abstractC0978b.m5875x(false, false);
        abstractC0978b.m5850M(remoteActionCompat.f2646a, 1);
        abstractC0978b.m5841D(remoteActionCompat.f2647b, 2);
        abstractC0978b.m5841D(remoteActionCompat.f2648c, 3);
        abstractC0978b.m5845H(remoteActionCompat.f2649d, 4);
        abstractC0978b.m5877z(remoteActionCompat.f2650e, 5);
        abstractC0978b.m5877z(remoteActionCompat.f2651f, 6);
    }
}
