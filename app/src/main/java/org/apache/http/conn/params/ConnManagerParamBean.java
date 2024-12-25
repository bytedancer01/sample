package org.apache.http.conn.params;

import org.apache.http.params.HttpAbstractParamBean;
import org.apache.http.params.HttpParams;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/params/ConnManagerParamBean.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/params/ConnManagerParamBean.class */
public class ConnManagerParamBean extends HttpAbstractParamBean {
    public ConnManagerParamBean(HttpParams httpParams) {
        super(httpParams);
    }

    public void setConnectionsPerRoute(ConnPerRouteBean connPerRouteBean) {
        this.params.setParameter(ConnManagerPNames.MAX_CONNECTIONS_PER_ROUTE, connPerRouteBean);
    }

    public void setMaxTotalConnections(int i10) {
        this.params.setIntParameter(ConnManagerPNames.MAX_TOTAL_CONNECTIONS, i10);
    }

    public void setTimeout(long j10) {
        this.params.setLongParameter("http.conn-manager.timeout", j10);
    }
}
