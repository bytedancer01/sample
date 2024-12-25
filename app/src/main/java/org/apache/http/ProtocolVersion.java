package org.apache.http;

import java.io.Serializable;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/ProtocolVersion.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/ProtocolVersion.class */
public class ProtocolVersion implements Serializable, Cloneable {
    private static final long serialVersionUID = 8950662842175091068L;
    public final int major;
    public final int minor;
    public final String protocol;

    public ProtocolVersion(String str, int i10, int i11) {
        this.protocol = (String) Args.notNull(str, "Protocol name");
        this.major = Args.notNegative(i10, "Protocol minor version");
        this.minor = Args.notNegative(i11, "Protocol minor version");
    }

    public Object clone() {
        return super.clone();
    }

    public int compareToVersion(ProtocolVersion protocolVersion) {
        Args.notNull(protocolVersion, "Protocol version");
        Args.check(this.protocol.equals(protocolVersion.protocol), "Versions for different protocols cannot be compared: %s %s", this, protocolVersion);
        int major = getMajor() - protocolVersion.getMajor();
        int i10 = major;
        if (major == 0) {
            i10 = getMinor() - protocolVersion.getMinor();
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtocolVersion)) {
            return false;
        }
        ProtocolVersion protocolVersion = (ProtocolVersion) obj;
        if (!this.protocol.equals(protocolVersion.protocol) || this.major != protocolVersion.major || this.minor != protocolVersion.minor) {
            z10 = false;
        }
        return z10;
    }

    public ProtocolVersion forVersion(int i10, int i11) {
        return (i10 == this.major && i11 == this.minor) ? this : new ProtocolVersion(this.protocol, i10, i11);
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final boolean greaterEquals(ProtocolVersion protocolVersion) {
        return isComparable(protocolVersion) && compareToVersion(protocolVersion) >= 0;
    }

    public final int hashCode() {
        return (this.protocol.hashCode() ^ (this.major * 100000)) ^ this.minor;
    }

    public boolean isComparable(ProtocolVersion protocolVersion) {
        return protocolVersion != null && this.protocol.equals(protocolVersion.protocol);
    }

    public final boolean lessEquals(ProtocolVersion protocolVersion) {
        return isComparable(protocolVersion) && compareToVersion(protocolVersion) <= 0;
    }

    public String toString() {
        return this.protocol + '/' + Integer.toString(this.major) + '.' + Integer.toString(this.minor);
    }
}
