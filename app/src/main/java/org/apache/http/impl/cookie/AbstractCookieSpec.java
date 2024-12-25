package org.apache.http.impl.cookie;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/AbstractCookieSpec.class */
public abstract class AbstractCookieSpec implements CookieSpec {
    private final Map<String, CookieAttributeHandler> attribHandlerMap;

    public AbstractCookieSpec() {
        this.attribHandlerMap = new ConcurrentHashMap(10);
    }

    public AbstractCookieSpec(HashMap<String, CookieAttributeHandler> hashMap) {
        Asserts.notNull(hashMap, "Attribute handler map");
        this.attribHandlerMap = new ConcurrentHashMap(hashMap);
    }

    public AbstractCookieSpec(CommonCookieAttributeHandler... commonCookieAttributeHandlerArr) {
        this.attribHandlerMap = new ConcurrentHashMap(commonCookieAttributeHandlerArr.length);
        for (CommonCookieAttributeHandler commonCookieAttributeHandler : commonCookieAttributeHandlerArr) {
            this.attribHandlerMap.put(commonCookieAttributeHandler.getAttributeName(), commonCookieAttributeHandler);
        }
    }

    public CookieAttributeHandler findAttribHandler(String str) {
        return this.attribHandlerMap.get(str);
    }

    public CookieAttributeHandler getAttribHandler(String str) {
        CookieAttributeHandler findAttribHandler = findAttribHandler(str);
        Asserts.check(findAttribHandler != null, "Handler not registered for " + str + " attribute");
        return findAttribHandler;
    }

    public Collection<CookieAttributeHandler> getAttribHandlers() {
        return this.attribHandlerMap.values();
    }

    @Deprecated
    public void registerAttribHandler(String str, CookieAttributeHandler cookieAttributeHandler) {
        Args.notNull(str, "Attribute name");
        Args.notNull(cookieAttributeHandler, "Attribute handler");
        this.attribHandlerMap.put(str, cookieAttributeHandler);
    }
}
