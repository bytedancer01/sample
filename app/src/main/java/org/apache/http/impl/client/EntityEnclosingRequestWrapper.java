package org.apache.http.impl.client;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.protocol.HTTP;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/client/EntityEnclosingRequestWrapper.class */
public class EntityEnclosingRequestWrapper extends RequestWrapper implements HttpEntityEnclosingRequest {
    private boolean consumed;
    private HttpEntity entity;

    /* loaded from: combined.jar:classes3.jar:org/apache/http/impl/client/EntityEnclosingRequestWrapper$EntityWrapper.class */
    public class EntityWrapper extends HttpEntityWrapper {
        public final EntityEnclosingRequestWrapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EntityWrapper(EntityEnclosingRequestWrapper entityEnclosingRequestWrapper, HttpEntity httpEntity) {
            super(httpEntity);
            this.this$0 = entityEnclosingRequestWrapper;
        }

        @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
        public void consumeContent() {
            this.this$0.consumed = true;
            super.consumeContent();
        }

        @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
        public InputStream getContent() {
            this.this$0.consumed = true;
            return super.getContent();
        }

        @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
        public void writeTo(OutputStream outputStream) {
            this.this$0.consumed = true;
            super.writeTo(outputStream);
        }
    }

    public EntityEnclosingRequestWrapper(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        super(httpEntityEnclosingRequest);
        setEntity(httpEntityEnclosingRequest.getEntity());
    }

    @Override // org.apache.http.HttpEntityEnclosingRequest
    public boolean expectContinue() {
        Header firstHeader = getFirstHeader("Expect");
        return firstHeader != null && HTTP.EXPECT_CONTINUE.equalsIgnoreCase(firstHeader.getValue());
    }

    @Override // org.apache.http.HttpEntityEnclosingRequest
    public HttpEntity getEntity() {
        return this.entity;
    }

    @Override // org.apache.http.impl.client.RequestWrapper
    public boolean isRepeatable() {
        HttpEntity httpEntity = this.entity;
        return httpEntity == null || httpEntity.isRepeatable() || !this.consumed;
    }

    @Override // org.apache.http.HttpEntityEnclosingRequest
    public void setEntity(HttpEntity httpEntity) {
        this.entity = httpEntity != null ? new EntityWrapper(this, httpEntity) : null;
        this.consumed = false;
    }
}
