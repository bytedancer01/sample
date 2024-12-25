package org.apache.http.impl.client;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.util.Args;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/client/IdleConnectionEvictor.class */
public final class IdleConnectionEvictor {
    private final HttpClientConnectionManager connectionManager;
    private volatile Exception exception;
    private final long maxIdleTimeMs;
    private final long sleepTimeMs;
    private final Thread thread;
    private final ThreadFactory threadFactory;

    /* loaded from: combined.jar:classes3.jar:org/apache/http/impl/client/IdleConnectionEvictor$DefaultThreadFactory.class */
    public static class DefaultThreadFactory implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Connection evictor");
            thread.setDaemon(true);
            return thread;
        }
    }

    public IdleConnectionEvictor(HttpClientConnectionManager httpClientConnectionManager, long j10, TimeUnit timeUnit) {
        this(httpClientConnectionManager, null, j10 > 0 ? j10 : 5L, timeUnit != null ? timeUnit : TimeUnit.SECONDS, j10, timeUnit);
    }

    public IdleConnectionEvictor(HttpClientConnectionManager httpClientConnectionManager, long j10, TimeUnit timeUnit, long j11, TimeUnit timeUnit2) {
        this(httpClientConnectionManager, null, j10, timeUnit, j11, timeUnit2);
    }

    public IdleConnectionEvictor(HttpClientConnectionManager httpClientConnectionManager, ThreadFactory threadFactory, long j10, TimeUnit timeUnit, long j11, TimeUnit timeUnit2) {
        this.connectionManager = (HttpClientConnectionManager) Args.notNull(httpClientConnectionManager, "Connection manager");
        threadFactory = threadFactory == null ? new DefaultThreadFactory() : threadFactory;
        this.threadFactory = threadFactory;
        this.sleepTimeMs = timeUnit != null ? timeUnit.toMillis(j10) : j10;
        this.maxIdleTimeMs = timeUnit2 != null ? timeUnit2.toMillis(j11) : j11;
        this.thread = threadFactory.newThread(new Runnable(this, httpClientConnectionManager) { // from class: org.apache.http.impl.client.IdleConnectionEvictor.1
            public final IdleConnectionEvictor this$0;
            public final HttpClientConnectionManager val$connectionManager;

            {
                this.this$0 = this;
                this.val$connectionManager = httpClientConnectionManager;
            }

            @Override // java.lang.Runnable
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        Thread.sleep(this.this$0.sleepTimeMs);
                        this.val$connectionManager.closeExpiredConnections();
                        if (this.this$0.maxIdleTimeMs > 0) {
                            this.val$connectionManager.closeIdleConnections(this.this$0.maxIdleTimeMs, TimeUnit.MILLISECONDS);
                        }
                    } catch (Exception e10) {
                        this.this$0.exception = e10;
                        return;
                    }
                }
            }
        });
    }

    public void awaitTermination(long j10, TimeUnit timeUnit) {
        Thread thread = this.thread;
        if (timeUnit == null) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        thread.join(timeUnit.toMillis(j10));
    }

    public boolean isRunning() {
        return this.thread.isAlive();
    }

    public void shutdown() {
        this.thread.interrupt();
    }

    public void start() {
        this.thread.start();
    }
}
