package org.apache.http.impl.entity;

import org.apache.http.HttpEntity;
import org.apache.http.HttpMessage;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.p257io.SessionInputBuffer;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/entity/EntityDeserializer.class */
public class EntityDeserializer {
    private final ContentLengthStrategy lenStrategy;

    public EntityDeserializer(ContentLengthStrategy contentLengthStrategy) {
        this.lenStrategy = (ContentLengthStrategy) Args.notNull(contentLengthStrategy, "Content length strategy");
    }

    public HttpEntity deserialize(SessionInputBuffer sessionInputBuffer, HttpMessage httpMessage) {
        Args.notNull(sessionInputBuffer, "Session input buffer");
        Args.notNull(httpMessage, "HTTP message");
        return doDeserialize(sessionInputBuffer, httpMessage);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.http.entity.BasicHttpEntity doDeserialize(org.apache.http.p257io.SessionInputBuffer r8, org.apache.http.HttpMessage r9) {
        /*
            r7 = this;
            org.apache.http.entity.BasicHttpEntity r0 = new org.apache.http.entity.BasicHttpEntity
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r7
            org.apache.http.entity.ContentLengthStrategy r0 = r0.lenStrategy
            r1 = r9
            long r0 = r0.determineLength(r1)
            r10 = r0
            r0 = r10
            r1 = -2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3c
            r0 = r12
            r1 = 1
            r0.setChunked(r1)
            r0 = r12
            r1 = -1
            r0.setContentLength(r1)
            org.apache.http.impl.io.ChunkedInputStream r0 = new org.apache.http.impl.io.ChunkedInputStream
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            r8 = r0
        L33:
            r0 = r12
            r1 = r8
            r0.setContent(r1)
            goto L72
        L3c:
            r0 = r12
            r1 = 0
            r0.setChunked(r1)
            r0 = r10
            r1 = -1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L5e
            r0 = r12
            r1 = -1
            r0.setContentLength(r1)
            org.apache.http.impl.io.IdentityInputStream r0 = new org.apache.http.impl.io.IdentityInputStream
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            r8 = r0
            goto L33
        L5e:
            r0 = r12
            r1 = r10
            r0.setContentLength(r1)
            r0 = r12
            org.apache.http.impl.io.ContentLengthInputStream r1 = new org.apache.http.impl.io.ContentLengthInputStream
            r2 = r1
            r3 = r8
            r4 = r10
            r2.<init>(r3, r4)
            r0.setContent(r1)
        L72:
            r0 = r9
            java.lang.String r1 = "Content-Type"
            org.apache.http.Header r0 = r0.getFirstHeader(r1)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L85
            r0 = r12
            r1 = r8
            r0.setContentType(r1)
        L85:
            r0 = r9
            java.lang.String r1 = "Content-Encoding"
            org.apache.http.Header r0 = r0.getFirstHeader(r1)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L98
            r0 = r12
            r1 = r8
            r0.setContentEncoding(r1)
        L98:
            r0 = r12
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.entity.EntityDeserializer.doDeserialize(org.apache.http.io.SessionInputBuffer, org.apache.http.HttpMessage):org.apache.http.entity.BasicHttpEntity");
    }
}
