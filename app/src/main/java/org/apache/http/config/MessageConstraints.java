package org.apache.http.config;

import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/config/MessageConstraints.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/config/MessageConstraints.class */
public class MessageConstraints implements Cloneable {
    public static final MessageConstraints DEFAULT = new Builder().build();
    private final int maxHeaderCount;
    private final int maxLineLength;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:org/apache/http/config/MessageConstraints$Builder.class
     */
    /* loaded from: combined.jar:classes1.jar:org/apache/http/config/MessageConstraints$Builder.class */
    public static class Builder {
        private int maxLineLength = -1;
        private int maxHeaderCount = -1;

        public MessageConstraints build() {
            return new MessageConstraints(this.maxLineLength, this.maxHeaderCount);
        }

        public Builder setMaxHeaderCount(int i10) {
            this.maxHeaderCount = i10;
            return this;
        }

        public Builder setMaxLineLength(int i10) {
            this.maxLineLength = i10;
            return this;
        }
    }

    public MessageConstraints(int i10, int i11) {
        this.maxLineLength = i10;
        this.maxHeaderCount = i11;
    }

    public static Builder copy(MessageConstraints messageConstraints) {
        Args.notNull(messageConstraints, "Message constraints");
        return new Builder().setMaxHeaderCount(messageConstraints.getMaxHeaderCount()).setMaxLineLength(messageConstraints.getMaxLineLength());
    }

    public static Builder custom() {
        return new Builder();
    }

    public static MessageConstraints lineLen(int i10) {
        return new MessageConstraints(Args.notNegative(i10, "Max line length"), -1);
    }

    public MessageConstraints clone() {
        return (MessageConstraints) super.clone();
    }

    public int getMaxHeaderCount() {
        return this.maxHeaderCount;
    }

    public int getMaxLineLength() {
        return this.maxLineLength;
    }

    public String toString() {
        return "[maxLineLength=" + this.maxLineLength + ", maxHeaderCount=" + this.maxHeaderCount + "]";
    }
}
