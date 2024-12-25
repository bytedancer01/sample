package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/entity/ByteArrayEntity.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/entity/ByteArrayEntity.class */
public class ByteArrayEntity extends AbstractHttpEntity implements Cloneable {

    /* renamed from: b */
    private final byte[] f36154b;

    @Deprecated
    public final byte[] content;
    private final int len;
    private final int off;

    public ByteArrayEntity(byte[] bArr) {
        this(bArr, null);
    }

    public ByteArrayEntity(byte[] bArr, int i10, int i11) {
        this(bArr, i10, i11, null);
    }

    public ByteArrayEntity(byte[] bArr, int i10, int i11, ContentType contentType) {
        int i12;
        Args.notNull(bArr, "Source byte array");
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) < 0 || i12 > bArr.length) {
            throw new IndexOutOfBoundsException("off: " + i10 + " len: " + i11 + " b.length: " + bArr.length);
        }
        this.content = bArr;
        this.f36154b = bArr;
        this.off = i10;
        this.len = i11;
        if (contentType != null) {
            setContentType(contentType.toString());
        }
    }

    public ByteArrayEntity(byte[] bArr, ContentType contentType) {
        Args.notNull(bArr, "Source byte array");
        this.content = bArr;
        this.f36154b = bArr;
        this.off = 0;
        this.len = bArr.length;
        if (contentType != null) {
            setContentType(contentType.toString());
        }
    }

    public Object clone() {
        return super.clone();
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() {
        return new ByteArrayInputStream(this.f36154b, this.off, this.len);
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return this.len;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) {
        Args.notNull(outputStream, "Output stream");
        outputStream.write(this.f36154b, this.off, this.len);
        outputStream.flush();
    }
}
