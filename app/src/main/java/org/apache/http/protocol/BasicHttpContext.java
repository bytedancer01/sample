package org.apache.http.protocol;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: combined.jar:classes3.jar:org/apache/http/protocol/BasicHttpContext.class */
public class BasicHttpContext implements HttpContext {
    private final Map<String, Object> map;
    private final HttpContext parentContext;

    public BasicHttpContext() {
        this(null);
    }

    public BasicHttpContext(HttpContext httpContext) {
        this.map = new ConcurrentHashMap();
        this.parentContext = httpContext;
    }

    public void clear() {
        this.map.clear();
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object getAttribute(String str) {
        Args.notNull(str, JsonDocumentFields.POLICY_ID);
        Object obj = this.map.get(str);
        Object obj2 = obj;
        if (obj == null) {
            HttpContext httpContext = this.parentContext;
            obj2 = obj;
            if (httpContext != null) {
                obj2 = httpContext.getAttribute(str);
            }
        }
        return obj2;
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object removeAttribute(String str) {
        Args.notNull(str, JsonDocumentFields.POLICY_ID);
        return this.map.remove(str);
    }

    @Override // org.apache.http.protocol.HttpContext
    public void setAttribute(String str, Object obj) {
        Args.notNull(str, JsonDocumentFields.POLICY_ID);
        if (obj != null) {
            this.map.put(str, obj);
        } else {
            this.map.remove(str);
        }
    }

    public String toString() {
        return this.map.toString();
    }
}
