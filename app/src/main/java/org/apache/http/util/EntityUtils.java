package org.apache.http.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.entity.ContentType;
import org.apache.http.protocol.HTTP;

/* loaded from: combined.jar:classes3.jar:org/apache/http/util/EntityUtils.class */
public final class EntityUtils {
    private static final int DEFAULT_BUFFER_SIZE = 4096;

    private EntityUtils() {
    }

    public static void consume(HttpEntity httpEntity) {
        InputStream content;
        if (httpEntity == null || !httpEntity.isStreaming() || (content = httpEntity.getContent()) == null) {
            return;
        }
        content.close();
    }

    public static void consumeQuietly(HttpEntity httpEntity) {
        try {
            consume(httpEntity);
        } catch (IOException e10) {
        }
    }

    @Deprecated
    public static String getContentCharSet(HttpEntity httpEntity) {
        String str;
        NameValuePair parameterByName;
        Args.notNull(httpEntity, "Entity");
        if (httpEntity.getContentType() != null) {
            HeaderElement[] elements = httpEntity.getContentType().getElements();
            if (elements.length > 0 && (parameterByName = elements[0].getParameterByName("charset")) != null) {
                str = parameterByName.getValue();
                return str;
            }
        }
        str = null;
        return str;
    }

    @Deprecated
    public static String getContentMimeType(HttpEntity httpEntity) {
        String str;
        Args.notNull(httpEntity, "Entity");
        if (httpEntity.getContentType() != null) {
            HeaderElement[] elements = httpEntity.getContentType().getElements();
            if (elements.length > 0) {
                str = elements[0].getName();
                return str;
            }
        }
        str = null;
        return str;
    }

    public static byte[] toByteArray(HttpEntity httpEntity) {
        Args.notNull(httpEntity, "Entity");
        InputStream content = httpEntity.getContent();
        if (content == null) {
            return null;
        }
        try {
            Args.check(httpEntity.getContentLength() <= 2147483647L, "HTTP entity too large to be buffered in memory");
            int contentLength = (int) httpEntity.getContentLength();
            int i10 = contentLength;
            if (contentLength < 0) {
                i10 = 4096;
            }
            ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(i10);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = content.read(bArr);
                if (read == -1) {
                    return byteArrayBuffer.toByteArray();
                }
                byteArrayBuffer.append(bArr, 0, read);
            }
        } finally {
            content.close();
        }
    }

    public static String toString(HttpEntity httpEntity) {
        Args.notNull(httpEntity, "Entity");
        return toString(httpEntity, ContentType.get(httpEntity));
    }

    public static String toString(HttpEntity httpEntity, String str) {
        return toString(httpEntity, str != null ? Charset.forName(str) : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r6.getCharset() == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String toString(org.apache.http.HttpEntity r4, java.nio.charset.Charset r5) {
        /*
            r0 = r4
            java.lang.String r1 = "Entity"
            java.lang.Object r0 = org.apache.http.util.Args.notNull(r0, r1)
            r0 = r4
            org.apache.http.entity.ContentType r0 = org.apache.http.entity.ContentType.get(r0)     // Catch: java.nio.charset.UnsupportedCharsetException -> Lf
            r6 = r0
            goto L16
        Lf:
            r6 = move-exception
            r0 = r5
            if (r0 == 0) goto L36
            r0 = 0
            r6 = r0
        L16:
            r0 = r6
            if (r0 == 0) goto L26
            r0 = r6
            r7 = r0
            r0 = r6
            java.nio.charset.Charset r0 = r0.getCharset()
            if (r0 != 0) goto L30
            goto L2a
        L26:
            org.apache.http.entity.ContentType r0 = org.apache.http.entity.ContentType.DEFAULT_TEXT
            r6 = r0
        L2a:
            r0 = r6
            r1 = r5
            org.apache.http.entity.ContentType r0 = r0.withCharset(r1)
            r7 = r0
        L30:
            r0 = r4
            r1 = r7
            java.lang.String r0 = toString(r0, r1)
            return r0
        L36:
            java.io.UnsupportedEncodingException r0 = new java.io.UnsupportedEncodingException
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.getMessage()
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.util.EntityUtils.toString(org.apache.http.HttpEntity, java.nio.charset.Charset):java.lang.String");
    }

    private static String toString(HttpEntity httpEntity, ContentType contentType) {
        InputStream content = httpEntity.getContent();
        if (content == null) {
            return null;
        }
        try {
            Args.check(httpEntity.getContentLength() <= 2147483647L, "HTTP entity too large to be buffered in memory");
            int contentLength = (int) httpEntity.getContentLength();
            int i10 = contentLength;
            if (contentLength < 0) {
                i10 = 4096;
            }
            Charset charset = null;
            if (contentType != null) {
                charset = contentType.getCharset();
                if (charset == null) {
                    ContentType byMimeType = ContentType.getByMimeType(contentType.getMimeType());
                    charset = null;
                    if (byMimeType != null) {
                        charset = byMimeType.getCharset();
                    }
                }
            }
            Charset charset2 = charset;
            if (charset == null) {
                charset2 = HTTP.DEF_CONTENT_CHARSET;
            }
            InputStreamReader inputStreamReader = new InputStreamReader(content, charset2);
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(i10);
            char[] cArr = new char[1024];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    return charArrayBuffer.toString();
                }
                charArrayBuffer.append(cArr, 0, read);
            }
        } finally {
            content.close();
        }
    }

    public static void updateEntity(HttpResponse httpResponse, HttpEntity httpEntity) {
        Args.notNull(httpResponse, "Response");
        consume(httpResponse.getEntity());
        httpResponse.setEntity(httpEntity);
    }
}
