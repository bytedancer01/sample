package org.apache.http.impl;

import java.util.Locale;
import org.apache.http.HttpStatus;
import org.apache.http.ReasonPhraseCatalog;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/EnglishReasonPhraseCatalog.class */
public class EnglishReasonPhraseCatalog implements ReasonPhraseCatalog {
    public static final EnglishReasonPhraseCatalog INSTANCE = new EnglishReasonPhraseCatalog();
    private static final String[][] REASON_PHRASES = {0, new String[3], new String[8], new String[8], new String[25], new String[8]};

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String[], java.lang.String[][]] */
    static {
        setReason(200, "OK");
        setReason(201, "Created");
        setReason(202, "Accepted");
        setReason(HttpStatus.SC_NO_CONTENT, "No Content");
        setReason(301, "Moved Permanently");
        setReason(HttpStatus.SC_MOVED_TEMPORARILY, "Moved Temporarily");
        setReason(HttpStatus.SC_NOT_MODIFIED, "Not Modified");
        setReason(400, "Bad Request");
        setReason(HttpStatus.SC_UNAUTHORIZED, "Unauthorized");
        setReason(403, "Forbidden");
        setReason(404, "Not Found");
        setReason(500, "Internal Server Error");
        setReason(501, "Not Implemented");
        setReason(502, "Bad Gateway");
        setReason(503, "Service Unavailable");
        setReason(100, "Continue");
        setReason(HttpStatus.SC_TEMPORARY_REDIRECT, "Temporary Redirect");
        setReason(HttpStatus.SC_METHOD_NOT_ALLOWED, "Method Not Allowed");
        setReason(HttpStatus.SC_CONFLICT, "Conflict");
        setReason(412, "Precondition Failed");
        setReason(HttpStatus.SC_REQUEST_TOO_LONG, "Request Too Long");
        setReason(HttpStatus.SC_REQUEST_URI_TOO_LONG, "Request-URI Too Long");
        setReason(HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE, "Unsupported Media Type");
        setReason(300, "Multiple Choices");
        setReason(HttpStatus.SC_SEE_OTHER, "See Other");
        setReason(HttpStatus.SC_USE_PROXY, "Use Proxy");
        setReason(HttpStatus.SC_PAYMENT_REQUIRED, "Payment Required");
        setReason(HttpStatus.SC_NOT_ACCEPTABLE, "Not Acceptable");
        setReason(HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, "Proxy Authentication Required");
        setReason(HttpStatus.SC_REQUEST_TIMEOUT, "Request Timeout");
        setReason(101, "Switching Protocols");
        setReason(HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, "Non Authoritative Information");
        setReason(205, "Reset Content");
        setReason(HttpStatus.SC_PARTIAL_CONTENT, "Partial Content");
        setReason(504, "Gateway Timeout");
        setReason(HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED, "Http Version Not Supported");
        setReason(HttpStatus.SC_GONE, "Gone");
        setReason(411, "Length Required");
        setReason(HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE, "Requested Range Not Satisfiable");
        setReason(HttpStatus.SC_EXPECTATION_FAILED, "Expectation Failed");
        setReason(102, "Processing");
        setReason(HttpStatus.SC_MULTI_STATUS, "Multi-Status");
        setReason(422, "Unprocessable Entity");
        setReason(HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE, "Insufficient Space On Resource");
        setReason(420, "Method Failure");
        setReason(423, "Locked");
        setReason(HttpStatus.SC_INSUFFICIENT_STORAGE, "Insufficient Storage");
        setReason(HttpStatus.SC_FAILED_DEPENDENCY, "Failed Dependency");
    }

    private static void setReason(int i10, String str) {
        int i11 = i10 / 100;
        REASON_PHRASES[i11][i10 - (i11 * 100)] = str;
    }

    @Override // org.apache.http.ReasonPhraseCatalog
    public String getReason(int i10, Locale locale) {
        Args.check(i10 >= 100 && i10 < 600, "Unknown category for status code " + i10);
        int i11 = i10 / 100;
        int i12 = i10 - (i11 * 100);
        String str = null;
        String[] strArr = REASON_PHRASES[i11];
        if (strArr.length > i12) {
            str = strArr[i12];
        }
        return str;
    }
}
