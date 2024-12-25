package org.apache.http.client.entity;

import java.nio.charset.Charset;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.protocol.HTTP;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/entity/UrlEncodedFormEntity.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/entity/UrlEncodedFormEntity.class */
public class UrlEncodedFormEntity extends StringEntity {
    public UrlEncodedFormEntity(Iterable<? extends NameValuePair> iterable) {
        this(iterable, (Charset) null);
    }

    public UrlEncodedFormEntity(Iterable<? extends NameValuePair> iterable, Charset charset) {
        super(URLEncodedUtils.format(iterable, charset != null ? charset : HTTP.DEF_CONTENT_CHARSET), ContentType.create("application/x-www-form-urlencoded", charset));
    }

    public UrlEncodedFormEntity(List<? extends NameValuePair> list) {
        this(list, (Charset) null);
    }

    public UrlEncodedFormEntity(List<? extends NameValuePair> list, String str) {
        super(URLEncodedUtils.format(list, str != null ? str : HTTP.DEF_CONTENT_CHARSET.name()), ContentType.create("application/x-www-form-urlencoded", str));
    }
}
