package org.apache.http.entity;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/entity/InputStreamEntity.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/entity/InputStreamEntity.class */
public class InputStreamEntity extends AbstractHttpEntity {
    private final InputStream content;
    private final long length;

    public InputStreamEntity(InputStream inputStream) {
        this(inputStream, -1L);
    }

    public InputStreamEntity(InputStream inputStream, long j10) {
        this(inputStream, j10, null);
    }

    public InputStreamEntity(InputStream inputStream, long j10, ContentType contentType) {
        this.content = (InputStream) Args.notNull(inputStream, "Source input stream");
        this.length = j10;
        if (contentType != null) {
            setContentType(contentType.toString());
        }
    }

    public InputStreamEntity(InputStream inputStream, ContentType contentType) {
        this(inputStream, -1L, contentType);
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() {
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
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) {
        Args.notNull(outputStream, "Output stream");
        InputStream inputStream = this.content;
        try {
            byte[] bArr = new byte[4096];
            long j10 = this.length;
            long j11 = j10;
            if (j10 < 0) {
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    } else {
                        outputStream.write(bArr, 0, read);
                    }
                }
            } else {
                while (j11 > 0) {
                    int read2 = inputStream.read(bArr, 0, (int) Math.min(4096L, j11));
                    if (read2 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read2);
                    j11 -= read2;
                }
            }
        } finally {
            inputStream.close();
        }
    }
}
