package org.apache.http.entity;

import com.amazonaws.services.p045s3.util.Mimetypes;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.message.BasicHeaderValueParser;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.ParserCursor;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.TextUtils;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/entity/ContentType.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/entity/ContentType.class */
public final class ContentType implements Serializable {
    public static final ContentType APPLICATION_ATOM_XML;
    public static final ContentType APPLICATION_FORM_URLENCODED;
    public static final ContentType APPLICATION_JSON;
    public static final ContentType APPLICATION_OCTET_STREAM;
    public static final ContentType APPLICATION_SVG_XML;
    public static final ContentType APPLICATION_XHTML_XML;
    public static final ContentType APPLICATION_XML;
    private static final Map<String, ContentType> CONTENT_TYPE_MAP;
    public static final ContentType DEFAULT_BINARY;
    public static final ContentType DEFAULT_TEXT;
    public static final ContentType IMAGE_BMP;
    public static final ContentType IMAGE_GIF;
    public static final ContentType IMAGE_JPEG;
    public static final ContentType IMAGE_PNG;
    public static final ContentType IMAGE_SVG;
    public static final ContentType IMAGE_TIFF;
    public static final ContentType IMAGE_WEBP;
    public static final ContentType MULTIPART_FORM_DATA;
    public static final ContentType TEXT_HTML;
    public static final ContentType TEXT_PLAIN;
    public static final ContentType TEXT_XML;
    public static final ContentType WILDCARD;
    private static final long serialVersionUID = -7768694718232371896L;
    private final Charset charset;
    private final String mimeType;
    private final NameValuePair[] params;

    static {
        Charset charset = Consts.ISO_8859_1;
        ContentType create = create("application/atom+xml", charset);
        APPLICATION_ATOM_XML = create;
        ContentType create2 = create("application/x-www-form-urlencoded", charset);
        APPLICATION_FORM_URLENCODED = create2;
        ContentType create3 = create("application/json", Consts.UTF_8);
        APPLICATION_JSON = create3;
        APPLICATION_OCTET_STREAM = create("application/octet-stream", (Charset) null);
        ContentType create4 = create("application/svg+xml", charset);
        APPLICATION_SVG_XML = create4;
        ContentType create5 = create("application/xhtml+xml", charset);
        APPLICATION_XHTML_XML = create5;
        ContentType create6 = create(Mimetypes.MIMETYPE_XML, charset);
        APPLICATION_XML = create6;
        ContentType create7 = create("image/bmp");
        IMAGE_BMP = create7;
        ContentType create8 = create("image/gif");
        IMAGE_GIF = create8;
        ContentType create9 = create("image/jpeg");
        IMAGE_JPEG = create9;
        ContentType create10 = create("image/png");
        IMAGE_PNG = create10;
        ContentType create11 = create("image/svg+xml");
        IMAGE_SVG = create11;
        ContentType create12 = create("image/tiff");
        IMAGE_TIFF = create12;
        ContentType create13 = create("image/webp");
        IMAGE_WEBP = create13;
        ContentType create14 = create("multipart/form-data", charset);
        MULTIPART_FORM_DATA = create14;
        ContentType create15 = create(Mimetypes.MIMETYPE_HTML, charset);
        TEXT_HTML = create15;
        ContentType create16 = create(HTTP.PLAIN_TEXT_TYPE, charset);
        TEXT_PLAIN = create16;
        ContentType create17 = create("text/xml", charset);
        TEXT_XML = create17;
        WILDCARD = create("*/*", (Charset) null);
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < 17; i10++) {
            ContentType contentType = new ContentType[]{create, create2, create3, create4, create5, create6, create7, create8, create9, create10, create11, create12, create13, create14, create15, create16, create17}[i10];
            hashMap.put(contentType.getMimeType(), contentType);
        }
        CONTENT_TYPE_MAP = Collections.unmodifiableMap(hashMap);
        DEFAULT_TEXT = TEXT_PLAIN;
        DEFAULT_BINARY = APPLICATION_OCTET_STREAM;
    }

    public ContentType(String str, Charset charset) {
        this.mimeType = str;
        this.charset = charset;
        this.params = null;
    }

    public ContentType(String str, Charset charset, NameValuePair[] nameValuePairArr) {
        this.mimeType = str;
        this.charset = charset;
        this.params = nameValuePairArr;
    }

    public static ContentType create(String str) {
        return create(str, (Charset) null);
    }

    public static ContentType create(String str, String str2) {
        return create(str, !TextUtils.isBlank(str2) ? Charset.forName(str2) : null);
    }

    public static ContentType create(String str, Charset charset) {
        String lowerCase = ((String) Args.notBlank(str, "MIME type")).toLowerCase(Locale.ROOT);
        Args.check(valid(lowerCase), "MIME type may not contain reserved characters");
        return new ContentType(lowerCase, charset);
    }

    public static ContentType create(String str, NameValuePair... nameValuePairArr) {
        Args.check(valid(((String) Args.notBlank(str, "MIME type")).toLowerCase(Locale.ROOT)), "MIME type may not contain reserved characters");
        return create(str, nameValuePairArr, true);
    }

    private static ContentType create(String str, NameValuePair[] nameValuePairArr, boolean z10) {
        Charset charset;
        int length = nameValuePairArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            NameValuePair nameValuePair = nameValuePairArr[i10];
            if (nameValuePair.getName().equalsIgnoreCase("charset")) {
                String value = nameValuePair.getValue();
                if (!TextUtils.isBlank(value)) {
                    try {
                        charset = Charset.forName(value);
                    } catch (UnsupportedCharsetException e10) {
                        if (z10) {
                            throw e10;
                        }
                        charset = null;
                        if (nameValuePairArr.length <= 0) {
                            nameValuePairArr = null;
                        }
                        return new ContentType(str, charset, nameValuePairArr);
                    }
                }
            } else {
                i10++;
            }
        }
    }

    private static ContentType create(HeaderElement headerElement, boolean z10) {
        return create(headerElement.getName(), headerElement.getParameters(), z10);
    }

    public static ContentType get(HttpEntity httpEntity) {
        Header contentType;
        if (httpEntity == null || (contentType = httpEntity.getContentType()) == null) {
            return null;
        }
        HeaderElement[] elements = contentType.getElements();
        if (elements.length > 0) {
            return create(elements[0], true);
        }
        return null;
    }

    public static ContentType getByMimeType(String str) {
        if (str == null) {
            return null;
        }
        return CONTENT_TYPE_MAP.get(str);
    }

    public static ContentType getLenient(HttpEntity httpEntity) {
        Header contentType;
        if (httpEntity == null || (contentType = httpEntity.getContentType()) == null) {
            return null;
        }
        try {
            HeaderElement[] elements = contentType.getElements();
            if (elements.length > 0) {
                return create(elements[0], false);
            }
            return null;
        } catch (ParseException e10) {
            return null;
        }
    }

    public static ContentType getLenientOrDefault(HttpEntity httpEntity) {
        ContentType contentType = get(httpEntity);
        if (contentType == null) {
            contentType = DEFAULT_TEXT;
        }
        return contentType;
    }

    public static ContentType getOrDefault(HttpEntity httpEntity) {
        ContentType contentType = get(httpEntity);
        if (contentType == null) {
            contentType = DEFAULT_TEXT;
        }
        return contentType;
    }

    public static ContentType parse(String str) {
        Args.notNull(str, "Content type");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        HeaderElement[] parseElements = BasicHeaderValueParser.INSTANCE.parseElements(charArrayBuffer, new ParserCursor(0, str.length()));
        if (parseElements.length > 0) {
            return create(parseElements[0], true);
        }
        throw new ParseException("Invalid content type: " + str);
    }

    private static boolean valid(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '\"' || charAt == ',' || charAt == ';') {
                return false;
            }
        }
        return true;
    }

    public Charset getCharset() {
        return this.charset;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getParameter(String str) {
        Args.notEmpty(str, "Parameter name");
        NameValuePair[] nameValuePairArr = this.params;
        if (nameValuePairArr == null) {
            return null;
        }
        for (NameValuePair nameValuePair : nameValuePairArr) {
            if (nameValuePair.getName().equalsIgnoreCase(str)) {
                return nameValuePair.getValue();
            }
        }
        return null;
    }

    public String toString() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(64);
        charArrayBuffer.append(this.mimeType);
        if (this.params != null) {
            charArrayBuffer.append("; ");
            BasicHeaderValueFormatter.INSTANCE.formatParameters(charArrayBuffer, this.params, false);
        } else if (this.charset != null) {
            charArrayBuffer.append(HTTP.CHARSET_PARAM);
            charArrayBuffer.append(this.charset.name());
        }
        return charArrayBuffer.toString();
    }

    public ContentType withCharset(String str) {
        return create(getMimeType(), str);
    }

    public ContentType withCharset(Charset charset) {
        return create(getMimeType(), charset);
    }

    public ContentType withParameters(NameValuePair... nameValuePairArr) {
        if (nameValuePairArr.length == 0) {
            return this;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        NameValuePair[] nameValuePairArr2 = this.params;
        if (nameValuePairArr2 != null) {
            for (NameValuePair nameValuePair : nameValuePairArr2) {
                linkedHashMap.put(nameValuePair.getName(), nameValuePair.getValue());
            }
        }
        for (NameValuePair nameValuePair2 : nameValuePairArr) {
            linkedHashMap.put(nameValuePair2.getName(), nameValuePair2.getValue());
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size() + 1);
        if (this.charset != null && !linkedHashMap.containsKey("charset")) {
            arrayList.add(new BasicNameValuePair("charset", this.charset.name()));
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new BasicNameValuePair((String) entry.getKey(), (String) entry.getValue()));
        }
        return create(getMimeType(), (NameValuePair[]) arrayList.toArray(new NameValuePair[arrayList.size()]), true);
    }
}
