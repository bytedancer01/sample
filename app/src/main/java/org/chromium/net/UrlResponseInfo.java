package org.chromium.net;

import java.util.List;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/chromium/net/UrlResponseInfo.class */
public abstract class UrlResponseInfo {

    /* loaded from: combined.jar:classes3.jar:org/chromium/net/UrlResponseInfo$HeaderBlock.class */
    public static abstract class HeaderBlock {
        public abstract List<Map.Entry<String, String>> getAsList();

        public abstract Map<String, List<String>> getAsMap();
    }

    public abstract Map<String, List<String>> getAllHeaders();

    public abstract List<Map.Entry<String, String>> getAllHeadersAsList();

    public abstract int getHttpStatusCode();

    public abstract String getHttpStatusText();

    public abstract String getNegotiatedProtocol();

    public abstract String getProxyServer();

    public abstract long getReceivedByteCount();

    public abstract String getUrl();

    public abstract List<String> getUrlChain();

    public abstract boolean wasCached();
}
