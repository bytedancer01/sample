package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/entity/StringEntity.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/entity/StringEntity.class */
public class StringEntity extends AbstractHttpEntity implements Cloneable {
    public final byte[] content;

    public StringEntity(String str) {
        this(str, ContentType.DEFAULT_TEXT);
    }

    public StringEntity(String str, String str2) {
        this(str, ContentType.create(ContentType.TEXT_PLAIN.getMimeType(), str2));
    }

    @Deprecated
    public StringEntity(String str, String str2, String str3) {
        Args.notNull(str, "Source string");
        str2 = str2 == null ? HTTP.PLAIN_TEXT_TYPE : str2;
        str3 = str3 == null ? "ISO-8859-1" : str3;
        this.content = str.getBytes(str3);
        setContentType(str2 + HTTP.CHARSET_PARAM + str3);
    }

    public StringEntity(String str, Charset charset) {
        this(str, ContentType.create(ContentType.TEXT_PLAIN.getMimeType(), charset));
    }

    public StringEntity(String str, ContentType contentType) {
        Args.notNull(str, "Source string");
        Charset charset = contentType != null ? contentType.getCharset() : null;
        this.content = str.getBytes(charset == null ? HTTP.DEF_CONTENT_CHARSET : charset);
        if (contentType != null) {
            setContentType(contentType.toString());
        }
    }

    public Object clone() {
        return super.clone();
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() {
        return new ByteArrayInputStream(this.content);
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return this.content.length;
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
        outputStream.write(this.content);
        outputStream.flush();
    }
}
