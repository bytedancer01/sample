package org.chromium.net;

import org.chromium.net.BidirectionalStream;

/* loaded from: combined.jar:classes3.jar:org/chromium/net/ExperimentalBidirectionalStream.class */
public abstract class ExperimentalBidirectionalStream extends BidirectionalStream {

    /* loaded from: combined.jar:classes3.jar:org/chromium/net/ExperimentalBidirectionalStream$Builder.class */
    public static abstract class Builder extends BidirectionalStream.Builder {
        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract Builder addHeader(String str, String str2);

        public Builder addRequestAnnotation(Object obj) {
            return this;
        }

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract ExperimentalBidirectionalStream build();

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract Builder delayRequestHeadersUntilFirstFlush(boolean z10);

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract Builder setHttpMethod(String str);

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract Builder setPriority(int i10);

        public Builder setTrafficStatsTag(int i10) {
            return this;
        }

        public Builder setTrafficStatsUid(int i10) {
            return this;
        }
    }
}
