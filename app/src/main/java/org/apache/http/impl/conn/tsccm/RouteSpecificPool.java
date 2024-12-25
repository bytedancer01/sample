package org.apache.http.impl.conn.tsccm;

import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.params.ConnPerRoute;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.LangUtils;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/tsccm/RouteSpecificPool.class */
public class RouteSpecificPool {
    public final ConnPerRoute connPerRoute;
    public final LinkedList<BasicPoolEntry> freeEntries;
    private final Log log;
    public final int maxEntries;
    public int numEntries;
    public final HttpRoute route;
    public final Queue<WaitingThread> waitingThreads;

    @Deprecated
    public RouteSpecificPool(HttpRoute httpRoute, int i10) {
        this.log = LogFactory.getLog(getClass());
        this.route = httpRoute;
        this.maxEntries = i10;
        this.connPerRoute = new ConnPerRoute(this) { // from class: org.apache.http.impl.conn.tsccm.RouteSpecificPool.1
            public final RouteSpecificPool this$0;

            {
                this.this$0 = this;
            }

            @Override // org.apache.http.conn.params.ConnPerRoute
            public int getMaxForRoute(HttpRoute httpRoute2) {
                return this.this$0.maxEntries;
            }
        };
        this.freeEntries = new LinkedList<>();
        this.waitingThreads = new LinkedList();
        this.numEntries = 0;
    }

    public RouteSpecificPool(HttpRoute httpRoute, ConnPerRoute connPerRoute) {
        this.log = LogFactory.getLog(getClass());
        this.route = httpRoute;
        this.connPerRoute = connPerRoute;
        this.maxEntries = connPerRoute.getMaxForRoute(httpRoute);
        this.freeEntries = new LinkedList<>();
        this.waitingThreads = new LinkedList();
        this.numEntries = 0;
    }

    public BasicPoolEntry allocEntry(Object obj) {
        if (!this.freeEntries.isEmpty()) {
            LinkedList<BasicPoolEntry> linkedList = this.freeEntries;
            ListIterator<BasicPoolEntry> listIterator = linkedList.listIterator(linkedList.size());
            while (listIterator.hasPrevious()) {
                BasicPoolEntry previous = listIterator.previous();
                if (previous.getState() == null || LangUtils.equals(obj, previous.getState())) {
                    listIterator.remove();
                    return previous;
                }
            }
        }
        if (getCapacity() != 0 || this.freeEntries.isEmpty()) {
            return null;
        }
        BasicPoolEntry remove = this.freeEntries.remove();
        remove.shutdownEntry();
        try {
            remove.getConnection().close();
        } catch (IOException e10) {
            this.log.debug("I/O error closing connection", e10);
        }
        return remove;
    }

    public void createdEntry(BasicPoolEntry basicPoolEntry) {
        Args.check(this.route.equals(basicPoolEntry.getPlannedRoute()), "Entry not planned for this pool");
        this.numEntries++;
    }

    public boolean deleteEntry(BasicPoolEntry basicPoolEntry) {
        boolean remove = this.freeEntries.remove(basicPoolEntry);
        if (remove) {
            this.numEntries--;
        }
        return remove;
    }

    public void dropEntry() {
        Asserts.check(this.numEntries > 0, "There is no entry that could be dropped");
        this.numEntries--;
    }

    public void freeEntry(BasicPoolEntry basicPoolEntry) {
        int i10 = this.numEntries;
        if (i10 < 1) {
            throw new IllegalStateException("No entry created for this pool. " + this.route);
        }
        if (i10 > this.freeEntries.size()) {
            this.freeEntries.add(basicPoolEntry);
            return;
        }
        throw new IllegalStateException("No entry allocated from this pool. " + this.route);
    }

    public int getCapacity() {
        return this.connPerRoute.getMaxForRoute(this.route) - this.numEntries;
    }

    public final int getEntryCount() {
        return this.numEntries;
    }

    public final int getMaxEntries() {
        return this.maxEntries;
    }

    public final HttpRoute getRoute() {
        return this.route;
    }

    public boolean hasThread() {
        return !this.waitingThreads.isEmpty();
    }

    public boolean isUnused() {
        boolean z10 = true;
        if (this.numEntries >= 1 || !this.waitingThreads.isEmpty()) {
            z10 = false;
        }
        return z10;
    }

    public WaitingThread nextThread() {
        return this.waitingThreads.peek();
    }

    public void queueThread(WaitingThread waitingThread) {
        Args.notNull(waitingThread, "Waiting thread");
        this.waitingThreads.add(waitingThread);
    }

    public void removeThread(WaitingThread waitingThread) {
        if (waitingThread == null) {
            return;
        }
        this.waitingThreads.remove(waitingThread);
    }
}
