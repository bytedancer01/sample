package org.chromium.net;

import java.util.concurrent.Executor;

/* loaded from: combined.jar:classes3.jar:org/chromium/net/NetworkQualityThroughputListener.class */
public abstract class NetworkQualityThroughputListener {
    private final Executor mExecutor;

    public NetworkQualityThroughputListener(Executor executor) {
        if (executor == null) {
            throw new IllegalStateException("Executor must not be null");
        }
        this.mExecutor = executor;
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public abstract void onThroughputObservation(int i10, long j10, int i11);
}
