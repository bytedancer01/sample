package org.apache.http.impl.cookie;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.InterfaceC7038SM;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/BasicCommentHandler.class */
public class BasicCommentHandler extends AbstractCookieAttributeHandler implements CommonCookieAttributeHandler {
    @Override // org.apache.http.cookie.CommonCookieAttributeHandler
    public String getAttributeName() {
        return ClientCookie.COMMENT_ATTR;
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) {
        Args.notNull(setCookie, InterfaceC7038SM.COOKIE);
        setCookie.setComment(str);
    }
}
