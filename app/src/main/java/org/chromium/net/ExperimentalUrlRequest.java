package org.chromium.net;

import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;

/* loaded from: combined.jar:classes3.jar:org/chromium/net/ExperimentalUrlRequest.class */
public abstract class ExperimentalUrlRequest extends UrlRequest {

    /* loaded from: combined.jar:classes3.jar:org/chromium/net/ExperimentalUrlRequest$Builder.class */
    public static abstract class Builder extends UrlRequest.Builder {
        @Override // org.chromium.net.UrlRequest.Builder
        public abstract Builder addHeader(String str, String str2);

        public Builder addRequestAnnotation(Object obj) {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract Builder allowDirectExecutor();

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract ExperimentalUrlRequest build();

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract Builder disableCache();

        public Builder disableConnectionMigration() {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract Builder setHttpMethod(String str);

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract Builder setPriority(int i10);

        public Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
            return this;
        }

        public Builder setTrafficStatsTag(int i10) {
            return this;
        }

        public Builder setTrafficStatsUid(int i10) {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract Builder setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor);
    }
}
