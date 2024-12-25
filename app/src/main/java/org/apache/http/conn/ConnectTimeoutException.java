package org.apache.http.conn;

import java.io.InterruptedIOException;
import org.apache.http.HttpHost;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/ConnectTimeoutException.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/ConnectTimeoutException.class */
public class ConnectTimeoutException extends InterruptedIOException {
    private static final long serialVersionUID = -4816682903149535989L;
    private final HttpHost host;

    public ConnectTimeoutException() {
        this.host = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ConnectTimeoutException(java.io.IOException r4, org.apache.http.HttpHost r5, java.net.InetAddress... r6) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            java.lang.String r1 = "Connect to "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            if (r0 == 0) goto L1e
            r0 = r5
            java.lang.String r0 = r0.toHostString()
            r7 = r0
            goto L22
        L1e:
            java.lang.String r0 = "remote host"
            r7 = r0
        L22:
            r0 = r8
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            if (r0 == 0) goto L57
            r0 = r6
            int r0 = r0.length
            if (r0 <= 0) goto L57
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r7
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            r1 = r6
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r0 = r0.toString()
            r6 = r0
            goto L5a
        L57:
            java.lang.String r0 = ""
            r6 = r0
        L5a:
            r0 = r8
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            if (r0 == 0) goto L8c
            r0 = r4
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L8c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            java.lang.String r1 = " failed: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = r4
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            java.lang.String r0 = r0.toString()
            r6 = r0
            goto L8f
        L8c:
            java.lang.String r0 = " timed out"
            r6 = r0
        L8f:
            r0 = r8
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            r1 = r8
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r0 = r3
            r1 = r5
            r0.host = r1
            r0 = r3
            r1 = r4
            java.lang.Throwable r0 = r0.initCause(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.ConnectTimeoutException.<init>(java.io.IOException, org.apache.http.HttpHost, java.net.InetAddress[]):void");
    }

    public ConnectTimeoutException(String str) {
        super(str);
        this.host = null;
    }

    public HttpHost getHost() {
        return this.host;
    }
}
