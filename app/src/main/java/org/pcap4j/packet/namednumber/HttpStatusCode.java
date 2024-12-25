package org.pcap4j.packet.namednumber;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/HttpStatusCode.class */
public final class HttpStatusCode extends NamedNumber<Short, HttpStatusCode> {
    private static final long serialVersionUID = -7511956295870434744L;
    private final HttpStatusClass statusClass;
    public static final HttpStatusCode CONTINUE = new HttpStatusCode(100, "Continue");
    public static final HttpStatusCode SWITCHING_PROTOCOLS = new HttpStatusCode(101, "Switching Protocols");

    /* renamed from: OK */
    public static final HttpStatusCode f36281OK = new HttpStatusCode(200, "OK");
    public static final HttpStatusCode CREATED = new HttpStatusCode(201, "Created");
    public static final HttpStatusCode ACCEPTED = new HttpStatusCode(202, "Accepted");
    public static final HttpStatusCode NON_AUTHORITATIVE_INFORMATION = new HttpStatusCode(203, "Non-Authoritative Information");
    public static final HttpStatusCode NO_CONTENT = new HttpStatusCode(204, "No Content");
    public static final HttpStatusCode RESET_CONTENT = new HttpStatusCode(205, "Reset Content");
    public static final HttpStatusCode PARTIAL_CONTENT = new HttpStatusCode(206, "Partial Content");
    public static final HttpStatusCode MULTIPLE_CHOICES = new HttpStatusCode(300, "Multiple Choices");
    public static final HttpStatusCode MOVED_PERMANENTLY = new HttpStatusCode(301, "Moved Permanently");
    public static final HttpStatusCode FOUND = new HttpStatusCode(302, "Found");
    public static final HttpStatusCode SEE_OTHER = new HttpStatusCode(303, "See Other");
    public static final HttpStatusCode NOT_MODIFIED = new HttpStatusCode(304, "Not Modified");
    public static final HttpStatusCode USE_PROXY = new HttpStatusCode(305, "Use Proxy");
    public static final HttpStatusCode TEMPORARY_REDIRECT = new HttpStatusCode(307, "Temporary Redirect");
    public static final HttpStatusCode BAD_REQUEST = new HttpStatusCode(400, "Bad Request");
    public static final HttpStatusCode UNAUTHORIZED = new HttpStatusCode(401, "Unauthorized");
    public static final HttpStatusCode PAYMENT_REQUIRED = new HttpStatusCode(402, "Payment Required");
    public static final HttpStatusCode FORBIDDEN = new HttpStatusCode(403, "Forbidden");
    public static final HttpStatusCode NOT_FOUND = new HttpStatusCode(404, "Not Found");
    public static final HttpStatusCode METHOD_NOT_ALLOWED = new HttpStatusCode(405, "Method Not Allowed");
    public static final HttpStatusCode NOT_ACCEPTABLE = new HttpStatusCode(406, "Not Acceptable");
    public static final HttpStatusCode PROXY_AUTHENTICATION_REQUIRED = new HttpStatusCode(407, "Proxy Authentication Required");
    public static final HttpStatusCode REQUEST_TIMEOUT = new HttpStatusCode(408, "Request Time-out");
    public static final HttpStatusCode CONFLICT = new HttpStatusCode(409, "Conflict");
    public static final HttpStatusCode Gone = new HttpStatusCode(410, "Gone");
    public static final HttpStatusCode LENGTH_REQUIRED = new HttpStatusCode(411, "Length Required");
    public static final HttpStatusCode PRECONDITION_FAILED = new HttpStatusCode(412, "Precondition Failed");
    public static final HttpStatusCode REQUEST_ENTITY_TOO_LARGE = new HttpStatusCode(413, "Request Entity Too Large");
    public static final HttpStatusCode REQUEST_URI_TOO_LARGE = new HttpStatusCode(414, "Request-URI Too Large");
    public static final HttpStatusCode UNSUPPORTED_MEDIA_TYPE = new HttpStatusCode(415, "Unsupported Media Type");
    public static final HttpStatusCode REQUESTED_RANGE_NOT_SATISFIABLE = new HttpStatusCode(416, "Requested range not satisfiable");
    public static final HttpStatusCode EXPECTATION_FAILED = new HttpStatusCode(417, "Expectation Failed");
    public static final HttpStatusCode INTERNAL_SERVER_ERROR = new HttpStatusCode(500, "Internal Server Error");
    public static final HttpStatusCode NOT_IMPLEMENTED = new HttpStatusCode(501, "Not Implemented");
    public static final HttpStatusCode BAD_GATEWAY = new HttpStatusCode(502, "Bad Gateway");
    public static final HttpStatusCode SERVICE_UNAVAILABLE = new HttpStatusCode(503, "Service Unavailable");
    public static final HttpStatusCode GATEWAY_TIMEOUT = new HttpStatusCode(504, "Gateway Time-out");
    public static final HttpStatusCode HTTP_VERSION_NOT_SUPPORTED = new HttpStatusCode(505, "HTTP Version not supported");
    private static final Map<Short, HttpStatusCode> registry = new HashMap();

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/HttpStatusCode$HttpStatusClass.class */
    public enum HttpStatusClass {
        INFORMATIONAL,
        SUCCESS,
        REDIRECTION,
        CLIENT_ERROR,
        SERVER_ERROR,
        EXTENSION
    }

    static {
        for (Field field : HttpStatusCode.class.getFields()) {
            if (HttpStatusCode.class.isAssignableFrom(field.getType())) {
                try {
                    HttpStatusCode httpStatusCode = (HttpStatusCode) field.get(null);
                    registry.put(httpStatusCode.value(), httpStatusCode);
                } catch (IllegalAccessException e10) {
                    throw new AssertionError(e10);
                } catch (IllegalArgumentException e11) {
                    throw new AssertionError(e11);
                } catch (NullPointerException e12) {
                }
            }
        }
    }

    public HttpStatusCode(Short sh2, String str) {
        super(sh2, str);
        if (sh2.shortValue() >= 100 && sh2.shortValue() <= 999) {
            this.statusClass = sh2.shortValue() < 200 ? HttpStatusClass.INFORMATIONAL : sh2.shortValue() < 300 ? HttpStatusClass.SUCCESS : sh2.shortValue() < 400 ? HttpStatusClass.REDIRECTION : sh2.shortValue() < 500 ? HttpStatusClass.CLIENT_ERROR : sh2.shortValue() < 600 ? HttpStatusClass.SERVER_ERROR : HttpStatusClass.EXTENSION;
            return;
        }
        throw new IllegalArgumentException("The value must be between 100 and 999 inclusive but: " + sh2);
    }

    public static HttpStatusCode getInstance(Short sh2) {
        Map<Short, HttpStatusCode> map = registry;
        return map.containsKey(sh2) ? map.get(sh2) : new HttpStatusCode(sh2, "unknown");
    }

    public static HttpStatusCode register(HttpStatusCode httpStatusCode) {
        return registry.put(httpStatusCode.value(), httpStatusCode);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(HttpStatusCode httpStatusCode) {
        return value().compareTo(httpStatusCode.value());
    }

    public HttpStatusClass getStatusClass() {
        return this.statusClass;
    }
}
