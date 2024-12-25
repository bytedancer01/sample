package org.apache.http.config;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.apache.http.Consts;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/config/ConnectionConfig.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/config/ConnectionConfig.class */
public class ConnectionConfig implements Cloneable {
    public static final ConnectionConfig DEFAULT = new Builder().build();
    private final int bufferSize;
    private final Charset charset;
    private final int fragmentSizeHint;
    private final CodingErrorAction malformedInputAction;
    private final MessageConstraints messageConstraints;
    private final CodingErrorAction unmappableInputAction;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:org/apache/http/config/ConnectionConfig$Builder.class
     */
    /* loaded from: combined.jar:classes1.jar:org/apache/http/config/ConnectionConfig$Builder.class */
    public static class Builder {
        private int bufferSize;
        private Charset charset;
        private int fragmentSizeHint = -1;
        private CodingErrorAction malformedInputAction;
        private MessageConstraints messageConstraints;
        private CodingErrorAction unmappableInputAction;

        /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
        
            if (r9.unmappableInputAction != null) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public org.apache.http.config.ConnectionConfig build() {
            /*
                r9 = this;
                r0 = r9
                java.nio.charset.Charset r0 = r0.charset
                r13 = r0
                r0 = r13
                r12 = r0
                r0 = r13
                if (r0 != 0) goto L23
                r0 = r9
                java.nio.charset.CodingErrorAction r0 = r0.malformedInputAction
                if (r0 != 0) goto L1f
                r0 = r13
                r12 = r0
                r0 = r9
                java.nio.charset.CodingErrorAction r0 = r0.unmappableInputAction
                if (r0 == 0) goto L23
            L1f:
                java.nio.charset.Charset r0 = org.apache.http.Consts.ASCII
                r12 = r0
            L23:
                r0 = r9
                int r0 = r0.bufferSize
                r10 = r0
                r0 = r10
                if (r0 <= 0) goto L2f
                goto L33
            L2f:
                r0 = 8192(0x2000, float:1.148E-41)
                r10 = r0
            L33:
                r0 = r9
                int r0 = r0.fragmentSizeHint
                r11 = r0
                r0 = r11
                if (r0 < 0) goto L3f
                goto L41
            L3f:
                r0 = r10
                r11 = r0
            L41:
                org.apache.http.config.ConnectionConfig r0 = new org.apache.http.config.ConnectionConfig
                r1 = r0
                r2 = r10
                r3 = r11
                r4 = r12
                r5 = r9
                java.nio.charset.CodingErrorAction r5 = r5.malformedInputAction
                r6 = r9
                java.nio.charset.CodingErrorAction r6 = r6.unmappableInputAction
                r7 = r9
                org.apache.http.config.MessageConstraints r7 = r7.messageConstraints
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.http.config.ConnectionConfig.Builder.build():org.apache.http.config.ConnectionConfig");
        }

        public Builder setBufferSize(int i10) {
            this.bufferSize = i10;
            return this;
        }

        public Builder setCharset(Charset charset) {
            this.charset = charset;
            return this;
        }

        public Builder setFragmentSizeHint(int i10) {
            this.fragmentSizeHint = i10;
            return this;
        }

        public Builder setMalformedInputAction(CodingErrorAction codingErrorAction) {
            this.malformedInputAction = codingErrorAction;
            if (codingErrorAction != null && this.charset == null) {
                this.charset = Consts.ASCII;
            }
            return this;
        }

        public Builder setMessageConstraints(MessageConstraints messageConstraints) {
            this.messageConstraints = messageConstraints;
            return this;
        }

        public Builder setUnmappableInputAction(CodingErrorAction codingErrorAction) {
            this.unmappableInputAction = codingErrorAction;
            if (codingErrorAction != null && this.charset == null) {
                this.charset = Consts.ASCII;
            }
            return this;
        }
    }

    public ConnectionConfig(int i10, int i11, Charset charset, CodingErrorAction codingErrorAction, CodingErrorAction codingErrorAction2, MessageConstraints messageConstraints) {
        this.bufferSize = i10;
        this.fragmentSizeHint = i11;
        this.charset = charset;
        this.malformedInputAction = codingErrorAction;
        this.unmappableInputAction = codingErrorAction2;
        this.messageConstraints = messageConstraints;
    }

    public static Builder copy(ConnectionConfig connectionConfig) {
        Args.notNull(connectionConfig, "Connection config");
        return new Builder().setBufferSize(connectionConfig.getBufferSize()).setCharset(connectionConfig.getCharset()).setFragmentSizeHint(connectionConfig.getFragmentSizeHint()).setMalformedInputAction(connectionConfig.getMalformedInputAction()).setUnmappableInputAction(connectionConfig.getUnmappableInputAction()).setMessageConstraints(connectionConfig.getMessageConstraints());
    }

    public static Builder custom() {
        return new Builder();
    }

    public ConnectionConfig clone() {
        return (ConnectionConfig) super.clone();
    }

    public int getBufferSize() {
        return this.bufferSize;
    }

    public Charset getCharset() {
        return this.charset;
    }

    public int getFragmentSizeHint() {
        return this.fragmentSizeHint;
    }

    public CodingErrorAction getMalformedInputAction() {
        return this.malformedInputAction;
    }

    public MessageConstraints getMessageConstraints() {
        return this.messageConstraints;
    }

    public CodingErrorAction getUnmappableInputAction() {
        return this.unmappableInputAction;
    }

    public String toString() {
        return "[bufferSize=" + this.bufferSize + ", fragmentSizeHint=" + this.fragmentSizeHint + ", charset=" + this.charset + ", malformedInputAction=" + this.malformedInputAction + ", unmappableInputAction=" + this.unmappableInputAction + ", messageConstraints=" + this.messageConstraints + "]";
    }
}
