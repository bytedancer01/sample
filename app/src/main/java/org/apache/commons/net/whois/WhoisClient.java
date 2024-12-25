package org.apache.commons.net.whois;

import java.io.InputStream;
import org.apache.commons.net.finger.FingerClient;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/whois/WhoisClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/whois/WhoisClient.class */
public final class WhoisClient extends FingerClient {
    public static final String DEFAULT_HOST = "whois.internic.net";
    public static final int DEFAULT_PORT = 43;

    public WhoisClient() {
        setDefaultPort(43);
    }

    public InputStream getInputStream(String str) {
        return getInputStream(false, str);
    }

    public String query(String str) {
        return query(false, str);
    }
}
