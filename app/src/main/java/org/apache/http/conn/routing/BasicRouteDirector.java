package org.apache.http.conn.routing;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/routing/BasicRouteDirector.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/routing/BasicRouteDirector.class */
public class BasicRouteDirector implements HttpRouteDirector {
    public int directStep(RouteInfo routeInfo, RouteInfo routeInfo2) {
        if (routeInfo2.getHopCount() <= 1 && routeInfo.getTargetHost().equals(routeInfo2.getTargetHost()) && routeInfo.isSecure() == routeInfo2.isSecure()) {
            return (routeInfo.getLocalAddress() == null || routeInfo.getLocalAddress().equals(routeInfo2.getLocalAddress())) ? 0 : -1;
        }
        return -1;
    }

    public int firstStep(RouteInfo routeInfo) {
        int i10 = 1;
        if (routeInfo.getHopCount() > 1) {
            i10 = 2;
        }
        return i10;
    }

    @Override // org.apache.http.conn.routing.HttpRouteDirector
    public int nextStep(RouteInfo routeInfo, RouteInfo routeInfo2) {
        Args.notNull(routeInfo, "Planned route");
        return (routeInfo2 == null || routeInfo2.getHopCount() < 1) ? firstStep(routeInfo) : routeInfo.getHopCount() > 1 ? proxiedStep(routeInfo, routeInfo2) : directStep(routeInfo, routeInfo2);
    }

    public int proxiedStep(RouteInfo routeInfo, RouteInfo routeInfo2) {
        int hopCount;
        int hopCount2;
        if (routeInfo2.getHopCount() <= 1 || !routeInfo.getTargetHost().equals(routeInfo2.getTargetHost()) || (hopCount = routeInfo.getHopCount()) < (hopCount2 = routeInfo2.getHopCount())) {
            return -1;
        }
        for (int i10 = 0; i10 < hopCount2 - 1; i10++) {
            if (!routeInfo.getHopTarget(i10).equals(routeInfo2.getHopTarget(i10))) {
                return -1;
            }
        }
        if (hopCount > hopCount2) {
            return 4;
        }
        if (routeInfo2.isTunnelled() && !routeInfo.isTunnelled()) {
            return -1;
        }
        if (routeInfo2.isLayered() && !routeInfo.isLayered()) {
            return -1;
        }
        if (routeInfo.isTunnelled() && !routeInfo2.isTunnelled()) {
            return 3;
        }
        if (!routeInfo.isLayered() || routeInfo2.isLayered()) {
            return routeInfo.isSecure() != routeInfo2.isSecure() ? -1 : 0;
        }
        return 5;
    }
}
