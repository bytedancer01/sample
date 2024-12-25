package org.apache.commons.net.bsd;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/bsd/RLoginClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/bsd/RLoginClient.class */
public class RLoginClient extends RCommandClient {
    public static final int DEFAULT_PORT = 513;

    public RLoginClient() {
        setDefaultPort(DEFAULT_PORT);
    }

    public void rlogin(String str, String str2, String str3) {
        rexec(str, str2, str3, false);
    }

    public void rlogin(String str, String str2, String str3, int i10) {
        rexec(str, str2, str3 + "/" + i10, false);
    }
}
