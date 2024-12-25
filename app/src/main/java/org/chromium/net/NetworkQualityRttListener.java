package org.chromium.net;

import java.util.concurrent.Executor;

/* loaded from: combined.jar:classes3.jar:org/chromium/net/NetworkQualityRttListener.class */
public abstract class NetworkQualityRttListener {
    private final Executor mExecutor;

    public NetworkQualityRttListener(Executor executor) {
        if (executor == null) {
            throw new IllegalStateException("Executor must not be null");
        }
        this.mExecutor = executor;
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public abstract void onRttObservation(int i10, long j10, int i11);
}
