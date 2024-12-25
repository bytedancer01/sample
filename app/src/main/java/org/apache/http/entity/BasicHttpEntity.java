package org.apache.http.entity;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.impl.p256io.EmptyInputStream;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/entity/BasicHttpEntity.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/entity/BasicHttpEntity.class */
public class BasicHttpEntity extends AbstractHttpEntity {
    private InputStream content;
    private long length = -1;

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() {
        Asserts.check(this.content != null, "Content has not been provided");
        return this.content;
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return this.length;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        InputStream inputStream = this.content;
        return (inputStream == null || inputStream == EmptyInputStream.INSTANCE) ? false : true;
    }

    public void setContent(InputStream inputStream) {
        this.content = inputStream;
    }

    public void setContentLength(long j10) {
        this.length = j10;
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) {
        Args.notNull(outputStream, "Output stream");
        InputStream content = getContent();
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = content.read(bArr);
                if (read == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, read);
                }
            }
        } finally {
            content.close();
        }
    }
}
