package org.apache.http.conn.scheme;

import java.util.Locale;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/scheme/Scheme.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/scheme/Scheme.class */
public final class Scheme {
    private final int defaultPort;
    private final boolean layered;
    private final String name;
    private final SchemeSocketFactory socketFactory;
    private String stringRep;

    public Scheme(String str, int i10, SchemeSocketFactory schemeSocketFactory) {
        Args.notNull(str, "Scheme name");
        Args.check(i10 > 0 && i10 <= 65535, "Port is invalid");
        Args.notNull(schemeSocketFactory, "Socket factory");
        this.name = str.toLowerCase(Locale.ENGLISH);
        this.defaultPort = i10;
        if (schemeSocketFactory instanceof SchemeLayeredSocketFactory) {
            this.layered = true;
        } else {
            if (schemeSocketFactory instanceof LayeredSchemeSocketFactory) {
                this.layered = true;
                this.socketFactory = new SchemeLayeredSocketFactoryAdaptor2((LayeredSchemeSocketFactory) schemeSocketFactory);
                return;
            }
            this.layered = false;
        }
        this.socketFactory = schemeSocketFactory;
    }

    @Deprecated
    public Scheme(String str, SocketFactory socketFactory, int i10) {
        Args.notNull(str, "Scheme name");
        Args.notNull(socketFactory, "Socket factory");
        Args.check(i10 > 0 && i10 <= 65535, "Port is invalid");
        this.name = str.toLowerCase(Locale.ENGLISH);
        if (socketFactory instanceof LayeredSocketFactory) {
            this.socketFactory = new SchemeLayeredSocketFactoryAdaptor((LayeredSocketFactory) socketFactory);
            this.layered = true;
        } else {
            this.socketFactory = new SchemeSocketFactoryAdaptor(socketFactory);
            this.layered = false;
        }
        this.defaultPort = i10;
    }

    public final boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scheme)) {
            return false;
        }
        Scheme scheme = (Scheme) obj;
        if (!this.name.equals(scheme.name) || this.defaultPort != scheme.defaultPort || this.layered != scheme.layered) {
            z10 = false;
        }
        return z10;
    }

    public final int getDefaultPort() {
        return this.defaultPort;
    }

    public final String getName() {
        return this.name;
    }

    public final SchemeSocketFactory getSchemeSocketFactory() {
        return this.socketFactory;
    }

    @Deprecated
    public final SocketFactory getSocketFactory() {
        SchemeSocketFactory schemeSocketFactory = this.socketFactory;
        return schemeSocketFactory instanceof SchemeSocketFactoryAdaptor ? ((SchemeSocketFactoryAdaptor) schemeSocketFactory).getFactory() : this.layered ? new LayeredSocketFactoryAdaptor((LayeredSchemeSocketFactory) schemeSocketFactory) : new SocketFactoryAdaptor(schemeSocketFactory);
    }

    public int hashCode() {
        return LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(17, this.defaultPort), this.name), this.layered);
    }

    public final boolean isLayered() {
        return this.layered;
    }

    public final int resolvePort(int i10) {
        int i11 = i10;
        if (i10 <= 0) {
            i11 = this.defaultPort;
        }
        return i11;
    }

    public final String toString() {
        if (this.stringRep == null) {
            this.stringRep = this.name + ':' + Integer.toString(this.defaultPort);
        }
        return this.stringRep;
    }
}
