package org.chromium.net;

import java.util.concurrent.RejectedExecutionException;

/* loaded from: combined.jar:classes3.jar:org/chromium/net/InlineExecutionProhibitedException.class */
public final class InlineExecutionProhibitedException extends RejectedExecutionException {
    public InlineExecutionProhibitedException() {
        super("Inline execution is prohibited for this request");
    }
}
