package org.apache.http.entity;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/entity/AbstractHttpEntity.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/entity/AbstractHttpEntity.class */
public abstract class AbstractHttpEntity implements HttpEntity {
    public static final int OUTPUT_BUFFER_SIZE = 4096;
    public boolean chunked;
    public Header contentEncoding;
    public Header contentType;

    @Override // org.apache.http.HttpEntity
    @Deprecated
    public void consumeContent() {
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentEncoding() {
        return this.contentEncoding;
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentType() {
        return this.contentType;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isChunked() {
        return this.chunked;
    }

    public void setChunked(boolean z10) {
        this.chunked = z10;
    }

    public void setContentEncoding(String str) {
        setContentEncoding(str != null ? new BasicHeader("Content-Encoding", str) : null);
    }

    public void setContentEncoding(Header header) {
        this.contentEncoding = header;
    }

    public void setContentType(String str) {
        setContentType(str != null ? new BasicHeader("Content-Type", str) : null);
    }

    public void setContentType(Header header) {
        this.contentType = header;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        if (this.contentType != null) {
            sb2.append("Content-Type: ");
            sb2.append(this.contentType.getValue());
            sb2.append(',');
        }
        if (this.contentEncoding != null) {
            sb2.append("Content-Encoding: ");
            sb2.append(this.contentEncoding.getValue());
            sb2.append(',');
        }
        long contentLength = getContentLength();
        if (contentLength >= 0) {
            sb2.append("Content-Length: ");
            sb2.append(contentLength);
            sb2.append(',');
        }
        sb2.append("Chunked: ");
        sb2.append(this.chunked);
        sb2.append(']');
        return sb2.toString();
    }
}
