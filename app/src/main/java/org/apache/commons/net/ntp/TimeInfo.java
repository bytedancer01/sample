package org.apache.commons.net.ntp;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ntp/TimeInfo.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ntp/TimeInfo.class */
public class TimeInfo {
    private List<String> _comments;
    private Long _delay;
    private boolean _detailsComputed;
    private final NtpV3Packet _message;
    private Long _offset;
    private final long _returnTime;

    public TimeInfo(NtpV3Packet ntpV3Packet, long j10) {
        this(ntpV3Packet, j10, null, true);
    }

    public TimeInfo(NtpV3Packet ntpV3Packet, long j10, List<String> list) {
        this(ntpV3Packet, j10, list, true);
    }

    public TimeInfo(NtpV3Packet ntpV3Packet, long j10, List<String> list, boolean z10) {
        if (ntpV3Packet == null) {
            throw new IllegalArgumentException("message cannot be null");
        }
        this._returnTime = j10;
        this._message = ntpV3Packet;
        this._comments = list;
        if (z10) {
            computeDetails();
        }
    }

    public TimeInfo(NtpV3Packet ntpV3Packet, long j10, boolean z10) {
        this(ntpV3Packet, j10, null, z10);
    }

    public void addComment(String str) {
        if (this._comments == null) {
            this._comments = new ArrayList();
        }
        this._comments.add(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void computeDetails() {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.ntp.TimeInfo.computeDetails():void");
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimeInfo timeInfo = (TimeInfo) obj;
        if (this._returnTime != timeInfo._returnTime || !this._message.equals(timeInfo._message)) {
            z10 = false;
        }
        return z10;
    }

    public InetAddress getAddress() {
        DatagramPacket datagramPacket = this._message.getDatagramPacket();
        return datagramPacket == null ? null : datagramPacket.getAddress();
    }

    public List<String> getComments() {
        return this._comments;
    }

    public Long getDelay() {
        return this._delay;
    }

    public NtpV3Packet getMessage() {
        return this._message;
    }

    public Long getOffset() {
        return this._offset;
    }

    public long getReturnTime() {
        return this._returnTime;
    }

    public int hashCode() {
        return (((int) this._returnTime) * 31) + this._message.hashCode();
    }
}
