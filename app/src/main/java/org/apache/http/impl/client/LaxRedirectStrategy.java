package org.apache.http.impl.client;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/client/LaxRedirectStrategy.class */
public class LaxRedirectStrategy extends DefaultRedirectStrategy {
    public static final LaxRedirectStrategy INSTANCE = new LaxRedirectStrategy();
    private static final String[] REDIRECT_METHODS = {HttpGet.METHOD_NAME, "POST", HttpHead.METHOD_NAME, HttpDelete.METHOD_NAME};

    @Override // org.apache.http.impl.client.DefaultRedirectStrategy
    public boolean isRedirectable(String str) {
        for (String str2 : REDIRECT_METHODS) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
