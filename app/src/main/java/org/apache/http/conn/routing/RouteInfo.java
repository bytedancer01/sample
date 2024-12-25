package org.apache.http.conn.routing;

import java.net.InetAddress;
import org.apache.http.HttpHost;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/routing/RouteInfo.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/routing/RouteInfo.class */
public interface RouteInfo {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:org/apache/http/conn/routing/RouteInfo$LayerType.class
     */
    /* loaded from: combined.jar:classes1.jar:org/apache/http/conn/routing/RouteInfo$LayerType.class */
    public enum LayerType {
        PLAIN,
        LAYERED
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:org/apache/http/conn/routing/RouteInfo$TunnelType.class
     */
    /* loaded from: combined.jar:classes1.jar:org/apache/http/conn/routing/RouteInfo$TunnelType.class */
    public enum TunnelType {
        PLAIN,
        TUNNELLED
    }

    int getHopCount();

    HttpHost getHopTarget(int i10);

    LayerType getLayerType();

    InetAddress getLocalAddress();

    HttpHost getProxyHost();

    HttpHost getTargetHost();

    TunnelType getTunnelType();

    boolean isLayered();

    boolean isSecure();

    boolean isTunnelled();
}
