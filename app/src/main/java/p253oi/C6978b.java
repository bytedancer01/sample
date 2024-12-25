package p253oi;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import org.jetbrains.annotations.NotNull;
import p173ji.C5421l;
import p372vh.C9367f;
import p406xd.C9728e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:oi/b.class
 */
/* renamed from: oi.b */
/* loaded from: combined.jar:classes2.jar:oi/b.class */
public final class C6978b {

    /* renamed from: a */
    public int f35999a;

    /* renamed from: b */
    public boolean f36000b;

    /* renamed from: c */
    public boolean f36001c;

    /* renamed from: d */
    public final List<C5421l> f36002d;

    public C6978b(@NotNull List<C5421l> list) {
        C9367f.m39526e(list, "connectionSpecs");
        this.f36002d = list;
    }

    @NotNull
    /* renamed from: a */
    public final C5421l m32005a(@NotNull SSLSocket sSLSocket) {
        C5421l c5421l;
        C9367f.m39526e(sSLSocket, "sslSocket");
        int i10 = this.f35999a;
        int size = this.f36002d.size();
        while (true) {
            if (i10 >= size) {
                c5421l = null;
                break;
            }
            c5421l = this.f36002d.get(i10);
            int i11 = i10 + 1;
            i10 = i11;
            if (c5421l.m26998e(sSLSocket)) {
                this.f35999a = i11;
                break;
            }
        }
        if (c5421l != null) {
            this.f36000b = m32007c(sSLSocket);
            c5421l.m26996c(sSLSocket, this.f36001c);
            return c5421l;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f36001c);
        sb2.append(',');
        sb2.append(" modes=");
        sb2.append(this.f36002d);
        sb2.append(',');
        sb2.append(" supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        C9367f.m39524c(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        C9367f.m39525d(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }

    /* renamed from: b */
    public final boolean m32006b(@NotNull IOException iOException) {
        C9367f.m39526e(iOException, C9728e.f44384d);
        boolean z10 = true;
        this.f36001c = true;
        if (!this.f36000b || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException) || (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) || !(iOException instanceof SSLException))) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: c */
    public final boolean m32007c(SSLSocket sSLSocket) {
        int size = this.f36002d.size();
        for (int i10 = this.f35999a; i10 < size; i10++) {
            if (this.f36002d.get(i10).m26998e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
