package p411xi;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/a0.class
 */
/* renamed from: xi.a0 */
/* loaded from: combined.jar:classes2.jar:xi/a0.class */
public final class C9754a0 extends C9759d {

    /* renamed from: m */
    public final Socket f44502m;

    public C9754a0(@NotNull Socket socket) {
        C9367f.m39526e(socket, "socket");
        this.f44502m = socket;
    }

    @Override // p411xi.C9759d
    @NotNull
    /* renamed from: t */
    public IOException mo36579t(@Nullable IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p411xi.C9759d
    /* renamed from: x */
    public void mo32073x() {
        Logger logger;
        Logger logger2;
        Level level;
        StringBuilder sb2;
        Exception exc;
        Logger logger3;
        try {
            this.f44502m.close();
        } catch (AssertionError e10) {
            if (!C9772p.m41230d(e10)) {
                throw e10;
            }
            logger3 = C9773q.f44552a;
            logger2 = logger3;
            level = Level.WARNING;
            sb2 = new StringBuilder();
            exc = e10;
            sb2.append("Failed to close timed out socket ");
            sb2.append(this.f44502m);
            logger2.log(level, sb2.toString(), (Throwable) exc);
        } catch (Exception e11) {
            logger = C9773q.f44552a;
            logger2 = logger;
            level = Level.WARNING;
            sb2 = new StringBuilder();
            exc = e11;
            sb2.append("Failed to close timed out socket ");
            sb2.append(this.f44502m);
            logger2.log(level, sb2.toString(), (Throwable) exc);
        }
    }
}
