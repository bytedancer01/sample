package org.chromium.net;

/* loaded from: combined.jar:classes3.jar:org/chromium/net/UploadDataSink.class */
public abstract class UploadDataSink {
    public abstract void onReadError(Exception exc);

    public abstract void onReadSucceeded(boolean z10);

    public abstract void onRewindError(Exception exc);

    public abstract void onRewindSucceeded();
}
