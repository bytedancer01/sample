package org.apache.http.conn.params;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/params/ConnManagerParams.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/params/ConnManagerParams.class */
public final class ConnManagerParams implements ConnManagerPNames {
    private static final ConnPerRoute DEFAULT_CONN_PER_ROUTE = new ConnPerRoute() { // from class: org.apache.http.conn.params.ConnManagerParams.1
        @Override // org.apache.http.conn.params.ConnPerRoute
        public int getMaxForRoute(HttpRoute httpRoute) {
            return 2;
        }
    };
    public static final int DEFAULT_MAX_TOTAL_CONNECTIONS = 20;

    public static ConnPerRoute getMaxConnectionsPerRoute(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        ConnPerRoute connPerRoute = (ConnPerRoute) httpParams.getParameter(ConnManagerPNames.MAX_CONNECTIONS_PER_ROUTE);
        ConnPerRoute connPerRoute2 = connPerRoute;
        if (connPerRoute == null) {
            connPerRoute2 = DEFAULT_CONN_PER_ROUTE;
        }
        return connPerRoute2;
    }

    public static int getMaxTotalConnections(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        return httpParams.getIntParameter(ConnManagerPNames.MAX_TOTAL_CONNECTIONS, 20);
    }

    @Deprecated
    public static long getTimeout(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        return httpParams.getLongParameter("http.conn-manager.timeout", 0L);
    }

    public static void setMaxConnectionsPerRoute(HttpParams httpParams, ConnPerRoute connPerRoute) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setParameter(ConnManagerPNames.MAX_CONNECTIONS_PER_ROUTE, connPerRoute);
    }

    public static void setMaxTotalConnections(HttpParams httpParams, int i10) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setIntParameter(ConnManagerPNames.MAX_TOTAL_CONNECTIONS, i10);
    }

    @Deprecated
    public static void setTimeout(HttpParams httpParams, long j10) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setLongParameter("http.conn-manager.timeout", j10);
    }
}
