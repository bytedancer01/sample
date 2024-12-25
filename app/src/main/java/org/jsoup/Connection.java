package org.jsoup;

import java.io.InputStream;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

/* loaded from: combined.jar:classes3.jar:org/jsoup/Connection.class */
public interface Connection {

    /* loaded from: combined.jar:classes3.jar:org/jsoup/Connection$Base.class */
    public interface Base<T extends Base> {
        String cookie(String str);

        T cookie(String str, String str2);

        Map<String, String> cookies();

        boolean hasCookie(String str);

        boolean hasHeader(String str);

        boolean hasHeaderWithValue(String str, String str2);

        String header(String str);

        T header(String str, String str2);

        Map<String, String> headers();

        T method(Method method);

        Method method();

        T removeCookie(String str);

        T removeHeader(String str);

        URL url();

        T url(URL url);
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/Connection$KeyVal.class */
    public interface KeyVal {
        boolean hasInputStream();

        InputStream inputStream();

        KeyVal inputStream(InputStream inputStream);

        String key();

        KeyVal key(String str);

        String value();

        KeyVal value(String str);
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/Connection$Method.class */
    public enum Method {
        GET(false),
        POST(true),
        PUT(true),
        DELETE(false),
        PATCH(true);

        private final boolean hasBody;

        Method(boolean z10) {
            this.hasBody = z10;
        }

        public final boolean hasBody() {
            return this.hasBody;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/Connection$Request.class */
    public interface Request extends Base<Request> {
        Collection<KeyVal> data();

        Request data(KeyVal keyVal);

        Request followRedirects(boolean z10);

        boolean followRedirects();

        Request ignoreContentType(boolean z10);

        boolean ignoreContentType();

        Request ignoreHttpErrors(boolean z10);

        boolean ignoreHttpErrors();

        int maxBodySize();

        Request maxBodySize(int i10);

        Request parser(Parser parser);

        Parser parser();

        String postDataCharset();

        Request postDataCharset(String str);

        int timeout();

        Request timeout(int i10);

        void validateTLSCertificates(boolean z10);

        boolean validateTLSCertificates();
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/Connection$Response.class */
    public interface Response extends Base<Response> {
        String body();

        byte[] bodyAsBytes();

        String charset();

        String contentType();

        Document parse();

        int statusCode();

        String statusMessage();
    }

    Connection cookie(String str, String str2);

    Connection cookies(Map<String, String> map);

    Connection data(String str, String str2);

    Connection data(String str, String str2, InputStream inputStream);

    Connection data(Collection<KeyVal> collection);

    Connection data(Map<String, String> map);

    Connection data(String... strArr);

    Response execute();

    Connection followRedirects(boolean z10);

    Document get();

    Connection header(String str, String str2);

    Connection ignoreContentType(boolean z10);

    Connection ignoreHttpErrors(boolean z10);

    Connection maxBodySize(int i10);

    Connection method(Method method);

    Connection parser(Parser parser);

    Document post();

    Connection postDataCharset(String str);

    Connection referrer(String str);

    Request request();

    Connection request(Request request);

    Response response();

    Connection response(Response response);

    Connection timeout(int i10);

    Connection url(String str);

    Connection url(URL url);

    Connection userAgent(String str);

    Connection validateTLSCertificates(boolean z10);
}
