package org.apache.http.config;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/config/SocketConfig.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/config/SocketConfig.class */
public class SocketConfig implements Cloneable {
    public static final SocketConfig DEFAULT = new Builder().build();
    private final int backlogSize;
    private final int rcvBufSize;
    private final int sndBufSize;
    private final boolean soKeepAlive;
    private final int soLinger;
    private final boolean soReuseAddress;
    private final int soTimeout;
    private final boolean tcpNoDelay;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:org/apache/http/config/SocketConfig$Builder.class
     */
    /* loaded from: combined.jar:classes1.jar:org/apache/http/config/SocketConfig$Builder.class */
    public static class Builder {
        private int backlogSize;
        private int rcvBufSize;
        private int sndBufSize;
        private boolean soKeepAlive;
        private boolean soReuseAddress;
        private int soTimeout;
        private int soLinger = -1;
        private boolean tcpNoDelay = true;

        public SocketConfig build() {
            return new SocketConfig(this.soTimeout, this.soReuseAddress, this.soLinger, this.soKeepAlive, this.tcpNoDelay, this.sndBufSize, this.rcvBufSize, this.backlogSize);
        }

        public Builder setBacklogSize(int i10) {
            this.backlogSize = i10;
            return this;
        }

        public Builder setRcvBufSize(int i10) {
            this.rcvBufSize = i10;
            return this;
        }

        public Builder setSndBufSize(int i10) {
            this.sndBufSize = i10;
            return this;
        }

        public Builder setSoKeepAlive(boolean z10) {
            this.soKeepAlive = z10;
            return this;
        }

        public Builder setSoLinger(int i10) {
            this.soLinger = i10;
            return this;
        }

        public Builder setSoReuseAddress(boolean z10) {
            this.soReuseAddress = z10;
            return this;
        }

        public Builder setSoTimeout(int i10) {
            this.soTimeout = i10;
            return this;
        }

        public Builder setTcpNoDelay(boolean z10) {
            this.tcpNoDelay = z10;
            return this;
        }
    }

    public SocketConfig(int i10, boolean z10, int i11, boolean z11, boolean z12, int i12, int i13, int i14) {
        this.soTimeout = i10;
        this.soReuseAddress = z10;
        this.soLinger = i11;
        this.soKeepAlive = z11;
        this.tcpNoDelay = z12;
        this.sndBufSize = i12;
        this.rcvBufSize = i13;
        this.backlogSize = i14;
    }

    public static Builder copy(SocketConfig socketConfig) {
        Args.notNull(socketConfig, "Socket config");
        return new Builder().setSoTimeout(socketConfig.getSoTimeout()).setSoReuseAddress(socketConfig.isSoReuseAddress()).setSoLinger(socketConfig.getSoLinger()).setSoKeepAlive(socketConfig.isSoKeepAlive()).setTcpNoDelay(socketConfig.isTcpNoDelay()).setSndBufSize(socketConfig.getSndBufSize()).setRcvBufSize(socketConfig.getRcvBufSize()).setBacklogSize(socketConfig.getBacklogSize());
    }

    public static Builder custom() {
        return new Builder();
    }

    public SocketConfig clone() {
        return (SocketConfig) super.clone();
    }

    public int getBacklogSize() {
        return this.backlogSize;
    }

    public int getRcvBufSize() {
        return this.rcvBufSize;
    }

    public int getSndBufSize() {
        return this.sndBufSize;
    }

    public int getSoLinger() {
        return this.soLinger;
    }

    public int getSoTimeout() {
        return this.soTimeout;
    }

    public boolean isSoKeepAlive() {
        return this.soKeepAlive;
    }

    public boolean isSoReuseAddress() {
        return this.soReuseAddress;
    }

    public boolean isTcpNoDelay() {
        return this.tcpNoDelay;
    }

    public String toString() {
        return "[soTimeout=" + this.soTimeout + ", soReuseAddress=" + this.soReuseAddress + ", soLinger=" + this.soLinger + ", soKeepAlive=" + this.soKeepAlive + ", tcpNoDelay=" + this.tcpNoDelay + ", sndBufSize=" + this.sndBufSize + ", rcvBufSize=" + this.rcvBufSize + ", backlogSize=" + this.backlogSize + "]";
    }
}
