package android.net.ssl;

import android.annotation.NonNull;
import javax.net.ssl.SSLSocket;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:android/net/ssl/SSLSockets.class
 */
/* loaded from: combined.jar:classes1.jar:android/net/ssl/SSLSockets.class */
public /* synthetic */ class SSLSockets {
    static {
        throw new NoClassDefFoundError();
    }

    public static native /* synthetic */ boolean isSupportedSocket(@NonNull SSLSocket sSLSocket);

    public static native /* synthetic */ void setUseSessionTickets(@NonNull SSLSocket sSLSocket, boolean z10);
}
