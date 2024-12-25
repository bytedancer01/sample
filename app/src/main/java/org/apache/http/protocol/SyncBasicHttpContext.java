package org.apache.http.protocol;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/protocol/SyncBasicHttpContext.class */
public class SyncBasicHttpContext extends BasicHttpContext {
    public SyncBasicHttpContext() {
    }

    public SyncBasicHttpContext(HttpContext httpContext) {
        super(httpContext);
    }

    @Override // org.apache.http.protocol.BasicHttpContext
    public void clear() {
        synchronized (this) {
            super.clear();
        }
    }

    @Override // org.apache.http.protocol.BasicHttpContext, org.apache.http.protocol.HttpContext
    public Object getAttribute(String str) {
        Object attribute;
        synchronized (this) {
            attribute = super.getAttribute(str);
        }
        return attribute;
    }

    @Override // org.apache.http.protocol.BasicHttpContext, org.apache.http.protocol.HttpContext
    public Object removeAttribute(String str) {
        Object removeAttribute;
        synchronized (this) {
            removeAttribute = super.removeAttribute(str);
        }
        return removeAttribute;
    }

    @Override // org.apache.http.protocol.BasicHttpContext, org.apache.http.protocol.HttpContext
    public void setAttribute(String str, Object obj) {
        synchronized (this) {
            super.setAttribute(str, obj);
        }
    }
}
