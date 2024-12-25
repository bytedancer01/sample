package org.jsoup.helper;

import com.amazonaws.services.p045s3.internal.Constants;
import com.amplifyframework.core.model.ModelIdentifier;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.commons.net.SocketClient;
import org.apache.http.HttpHeaders;
import org.apache.http.cookie.InterfaceC7038SM;
import org.apache.http.protocol.HttpRequestExecutor;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.TokenQueue;

/* loaded from: combined.jar:classes3.jar:org/jsoup/helper/HttpConnection.class */
public class HttpConnection implements Connection {
    public static final String CONTENT_ENCODING = "Content-Encoding";
    private static final String CONTENT_TYPE = "Content-Type";
    private static final String FORM_URL_ENCODED = "application/x-www-form-urlencoded";
    private static final String MULTIPART_FORM_DATA = "multipart/form-data";
    private Connection.Request req = new Request();
    private Connection.Response res = new Response();

    /* loaded from: combined.jar:classes3.jar:org/jsoup/helper/HttpConnection$Base.class */
    public static abstract class Base<T extends Connection.Base> implements Connection.Base<T> {
        public Map<String, String> cookies;
        public Map<String, String> headers;
        public Connection.Method method;
        public URL url;

        private Base() {
            this.headers = new LinkedHashMap();
            this.cookies = new LinkedHashMap();
        }

        private String getHeaderCaseInsensitive(String str) {
            Validate.notNull(str, "Header name must not be null");
            String str2 = this.headers.get(str);
            String str3 = str2;
            if (str2 == null) {
                str3 = this.headers.get(str.toLowerCase());
            }
            String str4 = str3;
            if (str3 == null) {
                Map.Entry<String, String> scanHeaders = scanHeaders(str);
                str4 = str3;
                if (scanHeaders != null) {
                    str4 = scanHeaders.getValue();
                }
            }
            return str4;
        }

        private Map.Entry<String, String> scanHeaders(String str) {
            String lowerCase = str.toLowerCase();
            for (Map.Entry<String, String> entry : this.headers.entrySet()) {
                if (entry.getKey().toLowerCase().equals(lowerCase)) {
                    return entry;
                }
            }
            return null;
        }

        @Override // org.jsoup.Connection.Base
        public String cookie(String str) {
            Validate.notEmpty(str, "Cookie name must not be empty");
            return this.cookies.get(str);
        }

        @Override // org.jsoup.Connection.Base
        public T cookie(String str, String str2) {
            Validate.notEmpty(str, "Cookie name must not be empty");
            Validate.notNull(str2, "Cookie value must not be null");
            this.cookies.put(str, str2);
            return this;
        }

        @Override // org.jsoup.Connection.Base
        public Map<String, String> cookies() {
            return this.cookies;
        }

        @Override // org.jsoup.Connection.Base
        public boolean hasCookie(String str) {
            Validate.notEmpty(str, "Cookie name must not be empty");
            return this.cookies.containsKey(str);
        }

        @Override // org.jsoup.Connection.Base
        public boolean hasHeader(String str) {
            Validate.notEmpty(str, "Header name must not be empty");
            return getHeaderCaseInsensitive(str) != null;
        }

        @Override // org.jsoup.Connection.Base
        public boolean hasHeaderWithValue(String str, String str2) {
            return hasHeader(str) && header(str).equalsIgnoreCase(str2);
        }

        @Override // org.jsoup.Connection.Base
        public String header(String str) {
            Validate.notNull(str, "Header name must not be null");
            return getHeaderCaseInsensitive(str);
        }

        @Override // org.jsoup.Connection.Base
        public T header(String str, String str2) {
            Validate.notEmpty(str, "Header name must not be empty");
            Validate.notNull(str2, "Header value must not be null");
            removeHeader(str);
            this.headers.put(str, str2);
            return this;
        }

        @Override // org.jsoup.Connection.Base
        public Map<String, String> headers() {
            return this.headers;
        }

        @Override // org.jsoup.Connection.Base
        public T method(Connection.Method method) {
            Validate.notNull(method, "Method must not be null");
            this.method = method;
            return this;
        }

        @Override // org.jsoup.Connection.Base
        public Connection.Method method() {
            return this.method;
        }

        @Override // org.jsoup.Connection.Base
        public T removeCookie(String str) {
            Validate.notEmpty(str, "Cookie name must not be empty");
            this.cookies.remove(str);
            return this;
        }

        @Override // org.jsoup.Connection.Base
        public T removeHeader(String str) {
            Validate.notEmpty(str, "Header name must not be empty");
            Map.Entry<String, String> scanHeaders = scanHeaders(str);
            if (scanHeaders != null) {
                this.headers.remove(scanHeaders.getKey());
            }
            return this;
        }

        @Override // org.jsoup.Connection.Base
        public URL url() {
            return this.url;
        }

        @Override // org.jsoup.Connection.Base
        public T url(URL url) {
            Validate.notNull(url, "URL must not be null");
            this.url = url;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/helper/HttpConnection$KeyVal.class */
    public static class KeyVal implements Connection.KeyVal {
        private String key;
        private InputStream stream;
        private String value;

        private KeyVal() {
        }

        public static KeyVal create(String str, String str2) {
            return new KeyVal().key(str).value(str2);
        }

        public static KeyVal create(String str, String str2, InputStream inputStream) {
            return new KeyVal().key(str).value(str2).inputStream(inputStream);
        }

        @Override // org.jsoup.Connection.KeyVal
        public boolean hasInputStream() {
            return this.stream != null;
        }

        @Override // org.jsoup.Connection.KeyVal
        public InputStream inputStream() {
            return this.stream;
        }

        @Override // org.jsoup.Connection.KeyVal
        public KeyVal inputStream(InputStream inputStream) {
            Validate.notNull(this.value, "Data input stream must not be null");
            this.stream = inputStream;
            return this;
        }

        @Override // org.jsoup.Connection.KeyVal
        public String key() {
            return this.key;
        }

        @Override // org.jsoup.Connection.KeyVal
        public KeyVal key(String str) {
            Validate.notEmpty(str, "Data key must not be empty");
            this.key = str;
            return this;
        }

        public String toString() {
            return this.key + "=" + this.value;
        }

        @Override // org.jsoup.Connection.KeyVal
        public String value() {
            return this.value;
        }

        @Override // org.jsoup.Connection.KeyVal
        public KeyVal value(String str) {
            Validate.notNull(str, "Data value must not be null");
            this.value = str;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/helper/HttpConnection$Request.class */
    public static class Request extends Base<Connection.Request> implements Connection.Request {
        private Collection<Connection.KeyVal> data;
        private boolean followRedirects;
        private boolean ignoreContentType;
        private boolean ignoreHttpErrors;
        private int maxBodySizeBytes;
        private Parser parser;
        private boolean parserDefined;
        private String postDataCharset;
        private int timeoutMilliseconds;
        private boolean validateTSLCertificates;

        private Request() {
            super();
            this.ignoreHttpErrors = false;
            this.ignoreContentType = false;
            this.parserDefined = false;
            this.validateTSLCertificates = true;
            this.postDataCharset = "UTF-8";
            this.timeoutMilliseconds = HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE;
            this.maxBodySizeBytes = Constants.f7590MB;
            this.followRedirects = true;
            this.data = new ArrayList();
            this.method = Connection.Method.GET;
            this.headers.put(HttpHeaders.ACCEPT_ENCODING, "gzip");
            this.parser = Parser.htmlParser();
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ String cookie(String str) {
            return super.cookie(str);
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Map cookies() {
            return super.cookies();
        }

        @Override // org.jsoup.Connection.Request
        public Collection<Connection.KeyVal> data() {
            return this.data;
        }

        @Override // org.jsoup.Connection.Request
        public Request data(Connection.KeyVal keyVal) {
            Validate.notNull(keyVal, "Key val must not be null");
            this.data.add(keyVal);
            return this;
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request followRedirects(boolean z10) {
            this.followRedirects = z10;
            return this;
        }

        @Override // org.jsoup.Connection.Request
        public boolean followRedirects() {
            return this.followRedirects;
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ boolean hasCookie(String str) {
            return super.hasCookie(str);
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ boolean hasHeader(String str) {
            return super.hasHeader(str);
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ boolean hasHeaderWithValue(String str, String str2) {
            return super.hasHeaderWithValue(str, str2);
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ String header(String str) {
            return super.header(str);
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Map headers() {
            return super.headers();
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request ignoreContentType(boolean z10) {
            this.ignoreContentType = z10;
            return this;
        }

        @Override // org.jsoup.Connection.Request
        public boolean ignoreContentType() {
            return this.ignoreContentType;
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request ignoreHttpErrors(boolean z10) {
            this.ignoreHttpErrors = z10;
            return this;
        }

        @Override // org.jsoup.Connection.Request
        public boolean ignoreHttpErrors() {
            return this.ignoreHttpErrors;
        }

        @Override // org.jsoup.Connection.Request
        public int maxBodySize() {
            return this.maxBodySizeBytes;
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request maxBodySize(int i10) {
            Validate.isTrue(i10 >= 0, "maxSize must be 0 (unlimited) or larger");
            this.maxBodySizeBytes = i10;
            return this;
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Method method() {
            return super.method();
        }

        @Override // org.jsoup.Connection.Request
        public Request parser(Parser parser) {
            this.parser = parser;
            this.parserDefined = true;
            return this;
        }

        @Override // org.jsoup.Connection.Request
        public Parser parser() {
            return this.parser;
        }

        @Override // org.jsoup.Connection.Request
        public String postDataCharset() {
            return this.postDataCharset;
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request postDataCharset(String str) {
            Validate.notNull(str, "Charset must not be null");
            if (!Charset.isSupported(str)) {
                throw new IllegalCharsetNameException(str);
            }
            this.postDataCharset = str;
            return this;
        }

        @Override // org.jsoup.Connection.Request
        public int timeout() {
            return this.timeoutMilliseconds;
        }

        @Override // org.jsoup.Connection.Request
        public Request timeout(int i10) {
            Validate.isTrue(i10 >= 0, "Timeout milliseconds must be 0 (infinite) or greater");
            this.timeoutMilliseconds = i10;
            return this;
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ URL url() {
            return super.url();
        }

        @Override // org.jsoup.Connection.Request
        public void validateTLSCertificates(boolean z10) {
            this.validateTSLCertificates = z10;
        }

        @Override // org.jsoup.Connection.Request
        public boolean validateTLSCertificates() {
            return this.validateTSLCertificates;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/helper/HttpConnection$Response.class */
    public static class Response extends Base<Connection.Response> implements Connection.Response {
        private static final String LOCATION = "Location";
        private static final int MAX_REDIRECTS = 20;
        private static SSLSocketFactory sslSocketFactory;
        private static final Pattern xmlContentTypeRxp = Pattern.compile("(application|text)/\\w*\\+?xml.*");
        private ByteBuffer byteData;
        private String charset;
        private String contentType;
        private boolean executed;
        private int numRedirects;
        private Connection.Request req;
        private int statusCode;
        private String statusMessage;

        public Response() {
            super();
            this.executed = false;
            this.numRedirects = 0;
        }

        private Response(Response response) {
            super();
            this.executed = false;
            this.numRedirects = 0;
            if (response != null) {
                int i10 = response.numRedirects + 1;
                this.numRedirects = i10;
                if (i10 >= 20) {
                    throw new IOException(String.format("Too many redirects occurred trying to load URL %s", response.url()));
                }
            }
        }

        private static HttpURLConnection createConnection(Connection.Request request) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) request.url().openConnection();
            httpURLConnection.setRequestMethod(request.method().name());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setConnectTimeout(request.timeout());
            httpURLConnection.setReadTimeout(request.timeout());
            if ((httpURLConnection instanceof HttpsURLConnection) && !request.validateTLSCertificates()) {
                initUnSecureTSL();
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
                httpsURLConnection.setSSLSocketFactory(sslSocketFactory);
                httpsURLConnection.setHostnameVerifier(getInsecureVerifier());
            }
            if (request.method().hasBody()) {
                httpURLConnection.setDoOutput(true);
            }
            if (request.cookies().size() > 0) {
                httpURLConnection.addRequestProperty(InterfaceC7038SM.COOKIE, getRequestCookieString(request));
            }
            for (Map.Entry<String, String> entry : request.headers().entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            return httpURLConnection;
        }

        public static Response execute(Connection.Request request) {
            return execute(request, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0086 A[Catch: all -> 0x02f0, TryCatch #0 {all -> 0x02f0, blocks: (B:16:0x0079, B:18:0x0086, B:20:0x0093, B:22:0x00ba, B:24:0x00c3, B:28:0x00ec, B:32:0x00fa, B:34:0x0106, B:36:0x010f, B:38:0x0135, B:40:0x013d, B:42:0x0164, B:50:0x018b, B:52:0x0193, B:54:0x019c, B:56:0x01a6, B:59:0x01b6, B:60:0x01cf, B:63:0x01d4, B:65:0x01e1, B:67:0x01e8, B:69:0x01f2, B:71:0x01fe, B:100:0x0296, B:102:0x029d, B:110:0x02b4, B:113:0x02bd, B:115:0x02c2, B:74:0x02c5, B:119:0x0180, B:121:0x02d9, B:122:0x02ef), top: B:15:0x0079 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static org.jsoup.helper.HttpConnection.Response execute(org.jsoup.Connection.Request r5, org.jsoup.helper.HttpConnection.Response r6) {
            /*
                Method dump skipped, instructions count: 760
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.helper.HttpConnection.Response.execute(org.jsoup.Connection$Request, org.jsoup.helper.HttpConnection$Response):org.jsoup.helper.HttpConnection$Response");
        }

        private static HostnameVerifier getInsecureVerifier() {
            return new HostnameVerifier() { // from class: org.jsoup.helper.HttpConnection.Response.1
                @Override // javax.net.ssl.HostnameVerifier
                public boolean verify(String str, SSLSession sSLSession) {
                    return true;
                }
            };
        }

        private static String getRequestCookieString(Connection.Request request) {
            StringBuilder sb2 = new StringBuilder();
            boolean z10 = true;
            for (Map.Entry<String, String> entry : request.cookies().entrySet()) {
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append("; ");
                }
                sb2.append(entry.getKey());
                sb2.append('=');
                sb2.append(entry.getValue());
            }
            return sb2.toString();
        }

        private static void initUnSecureTSL() {
            synchronized (Response.class) {
                try {
                    if (sslSocketFactory == null) {
                        X509TrustManager x509TrustManager = new X509TrustManager() { // from class: org.jsoup.helper.HttpConnection.Response.2
                            @Override // javax.net.ssl.X509TrustManager
                            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
                            }

                            @Override // javax.net.ssl.X509TrustManager
                            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
                            }

                            @Override // javax.net.ssl.X509TrustManager
                            public X509Certificate[] getAcceptedIssuers() {
                                return null;
                            }
                        };
                        try {
                            SSLContext sSLContext = SSLContext.getInstance("SSL");
                            sSLContext.init(null, new TrustManager[]{x509TrustManager}, new SecureRandom());
                            sslSocketFactory = sSLContext.getSocketFactory();
                        } catch (KeyManagementException e10) {
                            throw new IOException("Can't create unsecure trust manager");
                        } catch (NoSuchAlgorithmException e11) {
                            throw new IOException("Can't create unsecure trust manager");
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private static void serialiseRequestUrl(Connection.Request request) {
            boolean z10;
            URL url = request.url();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(url.getProtocol());
            sb2.append("://");
            sb2.append(url.getAuthority());
            sb2.append(url.getPath());
            sb2.append("?");
            if (url.getQuery() != null) {
                sb2.append(url.getQuery());
                z10 = false;
            } else {
                z10 = true;
            }
            for (Connection.KeyVal keyVal : request.data()) {
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append('&');
                }
                sb2.append(URLEncoder.encode(keyVal.key(), "UTF-8"));
                sb2.append('=');
                sb2.append(URLEncoder.encode(keyVal.value(), "UTF-8"));
            }
            request.url(new URL(sb2.toString()));
            request.data().clear();
        }

        private static String setOutputContentType(Connection.Request request) {
            boolean z10;
            StringBuilder sb2;
            Iterator<Connection.KeyVal> it = request.data().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                if (it.next().hasInputStream()) {
                    z10 = true;
                    break;
                }
            }
            String str = null;
            if (z10) {
                str = DataUtil.mimeBoundary();
                sb2 = new StringBuilder();
                sb2.append("multipart/form-data; boundary=");
                sb2.append(str);
            } else {
                sb2 = new StringBuilder();
                sb2.append("application/x-www-form-urlencoded; charset=");
                sb2.append(request.postDataCharset());
            }
            request.header("Content-Type", sb2.toString());
            return str;
        }

        private void setupFromConnection(HttpURLConnection httpURLConnection, Connection.Response response) {
            this.method = Connection.Method.valueOf(httpURLConnection.getRequestMethod());
            this.url = httpURLConnection.getURL();
            this.statusCode = httpURLConnection.getResponseCode();
            this.statusMessage = httpURLConnection.getResponseMessage();
            this.contentType = httpURLConnection.getContentType();
            processResponseHeaders(httpURLConnection.getHeaderFields());
            if (response != null) {
                for (Map.Entry<String, String> entry : response.cookies().entrySet()) {
                    if (!hasCookie(entry.getKey())) {
                        cookie(entry.getKey(), entry.getValue());
                    }
                }
            }
        }

        private static void writePost(Connection.Request request, OutputStream outputStream, String str) {
            Collection<Connection.KeyVal> data = request.data();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            if (str != null) {
                for (Connection.KeyVal keyVal : data) {
                    bufferedWriter.write("--");
                    bufferedWriter.write(str);
                    bufferedWriter.write(SocketClient.NETASCII_EOL);
                    bufferedWriter.write("Content-Disposition: form-data; name=\"");
                    bufferedWriter.write(HttpConnection.encodeMimeName(keyVal.key()));
                    bufferedWriter.write(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
                    if (keyVal.hasInputStream()) {
                        bufferedWriter.write("; filename=\"");
                        bufferedWriter.write(HttpConnection.encodeMimeName(keyVal.value()));
                        bufferedWriter.write("\"\r\nContent-Type: application/octet-stream\r\n\r\n");
                        bufferedWriter.flush();
                        DataUtil.crossStreams(keyVal.inputStream(), outputStream);
                        outputStream.flush();
                    } else {
                        bufferedWriter.write("\r\n\r\n");
                        bufferedWriter.write(keyVal.value());
                    }
                    bufferedWriter.write(SocketClient.NETASCII_EOL);
                }
                bufferedWriter.write("--");
                bufferedWriter.write(str);
                bufferedWriter.write("--");
            } else {
                boolean z10 = true;
                for (Connection.KeyVal keyVal2 : data) {
                    if (z10) {
                        z10 = false;
                    } else {
                        bufferedWriter.append('&');
                    }
                    bufferedWriter.write(URLEncoder.encode(keyVal2.key(), request.postDataCharset()));
                    bufferedWriter.write(61);
                    bufferedWriter.write(URLEncoder.encode(keyVal2.value(), request.postDataCharset()));
                }
            }
            bufferedWriter.close();
        }

        @Override // org.jsoup.Connection.Response
        public String body() {
            Validate.isTrue(this.executed, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            String str = this.charset;
            String str2 = str;
            if (str == null) {
                str2 = "UTF-8";
            }
            String charBuffer = Charset.forName(str2).decode(this.byteData).toString();
            this.byteData.rewind();
            return charBuffer;
        }

        @Override // org.jsoup.Connection.Response
        public byte[] bodyAsBytes() {
            Validate.isTrue(this.executed, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            return this.byteData.array();
        }

        @Override // org.jsoup.Connection.Response
        public String charset() {
            return this.charset;
        }

        @Override // org.jsoup.Connection.Response
        public String contentType() {
            return this.contentType;
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ String cookie(String str) {
            return super.cookie(str);
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Map cookies() {
            return super.cookies();
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ boolean hasCookie(String str) {
            return super.hasCookie(str);
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ boolean hasHeader(String str) {
            return super.hasHeader(str);
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ boolean hasHeaderWithValue(String str, String str2) {
            return super.hasHeaderWithValue(str, str2);
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ String header(String str) {
            return super.header(str);
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Map headers() {
            return super.headers();
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Method method() {
            return super.method();
        }

        @Override // org.jsoup.Connection.Response
        public Document parse() {
            Validate.isTrue(this.executed, "Request must be executed (with .execute(), .get(), or .post() before parsing response");
            Document parseByteData = DataUtil.parseByteData(this.byteData, this.charset, this.url.toExternalForm(), this.req.parser());
            this.byteData.rewind();
            this.charset = parseByteData.outputSettings().charset().name();
            return parseByteData;
        }

        public void processResponseHeaders(Map<String, List<String>> map) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    List<String> value = entry.getValue();
                    if (key.equalsIgnoreCase(InterfaceC7038SM.SET_COOKIE)) {
                        for (String str : value) {
                            if (str != null) {
                                TokenQueue tokenQueue = new TokenQueue(str);
                                String trim = tokenQueue.chompTo("=").trim();
                                String trim2 = tokenQueue.consumeTo(";").trim();
                                if (trim.length() > 0) {
                                    cookie(trim, trim2);
                                }
                            }
                        }
                    } else if (!value.isEmpty()) {
                        header(key, value.get(0));
                    }
                }
            }
        }

        @Override // org.jsoup.Connection.Response
        public int statusCode() {
            return this.statusCode;
        }

        @Override // org.jsoup.Connection.Response
        public String statusMessage() {
            return this.statusMessage;
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ URL url() {
            return super.url();
        }
    }

    private HttpConnection() {
    }

    public static Connection connect(String str) {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url(str);
        return httpConnection;
    }

    public static Connection connect(URL url) {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url(url);
        return httpConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String encodeMimeName(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, "%22");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String encodeUrl(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll(" ", "%20");
    }

    @Override // org.jsoup.Connection
    public Connection cookie(String str, String str2) {
        this.req.cookie(str, str2);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection cookies(Map<String, String> map) {
        Validate.notNull(map, "Cookie map must not be null");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.req.cookie(entry.getKey(), entry.getValue());
        }
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection data(String str, String str2) {
        this.req.data(KeyVal.create(str, str2));
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection data(String str, String str2, InputStream inputStream) {
        this.req.data(KeyVal.create(str, str2, inputStream));
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection data(Collection<Connection.KeyVal> collection) {
        Validate.notNull(collection, "Data collection must not be null");
        Iterator<Connection.KeyVal> it = collection.iterator();
        while (it.hasNext()) {
            this.req.data(it.next());
        }
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection data(Map<String, String> map) {
        Validate.notNull(map, "Data map must not be null");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.req.data(KeyVal.create(entry.getKey(), entry.getValue()));
        }
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection data(String... strArr) {
        Validate.notNull(strArr, "Data key value pairs must not be null");
        Validate.isTrue(strArr.length % 2 == 0, "Must supply an even number of key value pairs");
        for (int i10 = 0; i10 < strArr.length; i10 += 2) {
            String str = strArr[i10];
            String str2 = strArr[i10 + 1];
            Validate.notEmpty(str, "Data key must not be empty");
            Validate.notNull(str2, "Data value must not be null");
            this.req.data(KeyVal.create(str, str2));
        }
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection.Response execute() {
        Response execute = Response.execute(this.req);
        this.res = execute;
        return execute;
    }

    @Override // org.jsoup.Connection
    public Connection followRedirects(boolean z10) {
        this.req.followRedirects(z10);
        return this;
    }

    @Override // org.jsoup.Connection
    public Document get() {
        this.req.method(Connection.Method.GET);
        execute();
        return this.res.parse();
    }

    @Override // org.jsoup.Connection
    public Connection header(String str, String str2) {
        this.req.header(str, str2);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection ignoreContentType(boolean z10) {
        this.req.ignoreContentType(z10);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection ignoreHttpErrors(boolean z10) {
        this.req.ignoreHttpErrors(z10);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection maxBodySize(int i10) {
        this.req.maxBodySize(i10);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection method(Connection.Method method) {
        this.req.method(method);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection parser(Parser parser) {
        this.req.parser(parser);
        return this;
    }

    @Override // org.jsoup.Connection
    public Document post() {
        this.req.method(Connection.Method.POST);
        execute();
        return this.res.parse();
    }

    @Override // org.jsoup.Connection
    public Connection postDataCharset(String str) {
        this.req.postDataCharset(str);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection referrer(String str) {
        Validate.notNull(str, "Referrer must not be null");
        this.req.header(HttpHeaders.REFERER, str);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection.Request request() {
        return this.req;
    }

    @Override // org.jsoup.Connection
    public Connection request(Connection.Request request) {
        this.req = request;
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection.Response response() {
        return this.res;
    }

    @Override // org.jsoup.Connection
    public Connection response(Connection.Response response) {
        this.res = response;
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection timeout(int i10) {
        this.req.timeout(i10);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection url(String str) {
        Validate.notEmpty(str, "Must supply a valid URL");
        try {
            this.req.url(new URL(encodeUrl(str)));
            return this;
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Malformed URL: " + str, e10);
        }
    }

    @Override // org.jsoup.Connection
    public Connection url(URL url) {
        this.req.url(url);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection userAgent(String str) {
        Validate.notNull(str, "User agent must not be null");
        this.req.header("User-Agent", str);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection validateTLSCertificates(boolean z10) {
        this.req.validateTLSCertificates(z10);
        return this;
    }
}
