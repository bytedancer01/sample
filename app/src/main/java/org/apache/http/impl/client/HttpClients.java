package org.apache.http.impl.client;

import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/client/HttpClients.class */
public class HttpClients {
    private HttpClients() {
    }

    public static CloseableHttpClient createDefault() {
        return HttpClientBuilder.create().build();
    }

    public static CloseableHttpClient createMinimal() {
        return new MinimalHttpClient(new PoolingHttpClientConnectionManager());
    }

    public static CloseableHttpClient createMinimal(HttpClientConnectionManager httpClientConnectionManager) {
        return new MinimalHttpClient(httpClientConnectionManager);
    }

    public static CloseableHttpClient createSystem() {
        return HttpClientBuilder.create().useSystemProperties().build();
    }

    public static HttpClientBuilder custom() {
        return HttpClientBuilder.create();
    }
}
