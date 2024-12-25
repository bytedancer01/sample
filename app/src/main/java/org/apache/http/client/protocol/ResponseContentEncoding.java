package org.apache.http.client.protocol;

import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.entity.DecompressingEntity;
import org.apache.http.client.entity.DeflateInputStreamFactory;
import org.apache.http.client.entity.GZIPInputStreamFactory;
import org.apache.http.client.entity.InputStreamFactory;
import org.apache.http.config.Lookup;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/protocol/ResponseContentEncoding.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/protocol/ResponseContentEncoding.class */
public class ResponseContentEncoding implements HttpResponseInterceptor {
    public static final String UNCOMPRESSED = "http.client.response.uncompressed";
    private final Lookup<InputStreamFactory> decoderRegistry;
    private final boolean ignoreUnknown;

    public ResponseContentEncoding() {
        this((Lookup<InputStreamFactory>) null);
    }

    public ResponseContentEncoding(Lookup<InputStreamFactory> lookup) {
        this(lookup, true);
    }

    public ResponseContentEncoding(Lookup<InputStreamFactory> lookup, boolean z10) {
        this.decoderRegistry = lookup == null ? RegistryBuilder.create().register("gzip", GZIPInputStreamFactory.getInstance()).register("x-gzip", GZIPInputStreamFactory.getInstance()).register("deflate", DeflateInputStreamFactory.getInstance()).build() : lookup;
        this.ignoreUnknown = z10;
    }

    public ResponseContentEncoding(boolean z10) {
        this(null, z10);
    }

    @Override // org.apache.http.HttpResponseInterceptor
    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        Header contentEncoding;
        HttpEntity entity = httpResponse.getEntity();
        if (!HttpClientContext.adapt(httpContext).getRequestConfig().isContentCompressionEnabled() || entity == null || entity.getContentLength() == 0 || (contentEncoding = entity.getContentEncoding()) == null) {
            return;
        }
        for (HeaderElement headerElement : contentEncoding.getElements()) {
            String lowerCase = headerElement.getName().toLowerCase(Locale.ROOT);
            InputStreamFactory lookup = this.decoderRegistry.lookup(lowerCase);
            if (lookup != null) {
                httpResponse.setEntity(new DecompressingEntity(httpResponse.getEntity(), lookup));
                httpResponse.removeHeaders("Content-Length");
                httpResponse.removeHeaders("Content-Encoding");
                httpResponse.removeHeaders("Content-MD5");
            } else if (!HTTP.IDENTITY_CODING.equals(lowerCase) && !this.ignoreUnknown) {
                throw new HttpException("Unsupported Content-Encoding: " + headerElement.getName());
            }
        }
    }
}
