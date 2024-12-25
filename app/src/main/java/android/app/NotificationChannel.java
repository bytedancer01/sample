package android.app;

import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:android/app/NotificationChannel.class
 */
/* loaded from: combined.jar:classes1.jar:android/app/NotificationChannel.class */
public final /* synthetic */ class NotificationChannel implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ NotificationChannel(String str, CharSequence charSequence, int i10) {
    }

    public native /* synthetic */ void enableLights(boolean z10);

    public native /* synthetic */ void enableVibration(boolean z10);

    public native /* synthetic */ String getId();

    public native /* synthetic */ int getImportance();

    public native /* synthetic */ CharSequence getName();

    public native /* synthetic */ void setBypassDnd(boolean z10);

    public native /* synthetic */ void setDescription(String str);

    public native /* synthetic */ void setGroup(String str);

    public native /* synthetic */ void setLightColor(int i10);

    public native /* synthetic */ void setLockscreenVisibility(int i10);

    public native /* synthetic */ void setName(CharSequence charSequence);

    public native /* synthetic */ void setShowBadge(boolean z10);

    public native /* synthetic */ void setSound(Uri uri, AudioAttributes audioAttributes);

    public native /* synthetic */ void setVibrationPattern(long[] jArr);

    public native /* synthetic */ String toString();
}
