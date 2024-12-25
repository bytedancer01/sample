package org.apache.commons.net.ntp;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.net.DatagramPacket;
import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ntp/NtpV3Impl.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ntp/NtpV3Impl.class */
public class NtpV3Impl implements NtpV3Packet {
    private static final int LI_INDEX = 0;
    private static final int LI_SHIFT = 6;
    private static final int MODE_INDEX = 0;
    private static final int MODE_SHIFT = 0;
    private static final int ORIGINATE_TIMESTAMP_INDEX = 24;
    private static final int POLL_INDEX = 2;
    private static final int PRECISION_INDEX = 3;
    private static final int RECEIVE_TIMESTAMP_INDEX = 32;
    private static final int REFERENCE_ID_INDEX = 12;
    private static final int REFERENCE_TIMESTAMP_INDEX = 16;
    private static final int ROOT_DELAY_INDEX = 4;
    private static final int ROOT_DISPERSION_INDEX = 8;
    private static final int STRATUM_INDEX = 1;
    private static final int TRANSMIT_TIMESTAMP_INDEX = 40;
    private static final int VERSION_INDEX = 0;
    private static final int VERSION_SHIFT = 3;
    private final byte[] buf = new byte[48];

    /* renamed from: dp */
    private volatile DatagramPacket f36132dp;

    private int getInt(int i10) {
        return m32142ui(this.buf[i10 + 3]) | (m32142ui(this.buf[i10]) << 24) | (m32142ui(this.buf[i10 + 1]) << 16) | (m32142ui(this.buf[i10 + 2]) << 8);
    }

    private long getLong(int i10) {
        return (m32143ul(this.buf[i10]) << 56) | (m32143ul(this.buf[i10 + 1]) << 48) | (m32143ul(this.buf[i10 + 2]) << 40) | (m32143ul(this.buf[i10 + 3]) << 32) | (m32143ul(this.buf[i10 + 4]) << 24) | (m32143ul(this.buf[i10 + 5]) << 16) | (m32143ul(this.buf[i10 + 6]) << 8) | m32143ul(this.buf[i10 + 7]);
    }

    private TimeStamp getTimestamp(int i10) {
        return new TimeStamp(getLong(i10));
    }

    private String idAsHex() {
        return Integer.toHexString(getReferenceId());
    }

    private String idAsIPAddress() {
        return m32142ui(this.buf[12]) + InstructionFileId.DOT + m32142ui(this.buf[13]) + InstructionFileId.DOT + m32142ui(this.buf[14]) + InstructionFileId.DOT + m32142ui(this.buf[15]);
    }

    private String idAsString() {
        char c10;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 <= 3 && (c10 = (char) this.buf[i10 + 12]) != 0; i10++) {
            sb2.append(c10);
        }
        return sb2.toString();
    }

    private void setInt(int i10, int i11) {
        int i12 = i11;
        for (int i13 = 3; i13 >= 0; i13--) {
            this.buf[i10 + i13] = (byte) (i12 & 255);
            i12 >>>= 8;
        }
    }

    private void setTimestamp(int i10, TimeStamp timeStamp) {
        long ntpValue = timeStamp == null ? 0L : timeStamp.ntpValue();
        for (int i11 = 7; i11 >= 0; i11--) {
            this.buf[i10 + i11] = (byte) (255 & ntpValue);
            ntpValue >>>= 8;
        }
    }

    /* renamed from: ui */
    public static final int m32142ui(byte b10) {
        return b10 & 255;
    }

    /* renamed from: ul */
    public static final long m32143ul(byte b10) {
        return b10 & 255;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.buf, ((NtpV3Impl) obj).buf);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public DatagramPacket getDatagramPacket() {
        DatagramPacket datagramPacket;
        synchronized (this) {
            if (this.f36132dp == null) {
                byte[] bArr = this.buf;
                this.f36132dp = new DatagramPacket(bArr, bArr.length);
                this.f36132dp.setPort(123);
            }
            datagramPacket = this.f36132dp;
        }
        return datagramPacket;
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public int getLeapIndicator() {
        return (m32142ui(this.buf[0]) >> 6) & 3;
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public int getMode() {
        return (m32142ui(this.buf[0]) >> 0) & 7;
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public String getModeName() {
        return NtpUtils.getModeName(getMode());
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public TimeStamp getOriginateTimeStamp() {
        return getTimestamp(24);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public int getPoll() {
        return this.buf[2];
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public int getPrecision() {
        return this.buf[3];
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public TimeStamp getReceiveTimeStamp() {
        return getTimestamp(32);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public int getReferenceId() {
        return getInt(12);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public String getReferenceIdString() {
        int version = getVersion();
        int stratum = getStratum();
        if (version == 3 || version == 4) {
            if (stratum == 0 || stratum == 1) {
                return idAsString();
            }
            if (version == 4) {
                return idAsHex();
            }
        }
        return stratum >= 2 ? idAsIPAddress() : idAsHex();
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public TimeStamp getReferenceTimeStamp() {
        return getTimestamp(16);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public int getRootDelay() {
        return getInt(4);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public double getRootDelayInMillisDouble() {
        return getRootDelay() / 65.536d;
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public int getRootDispersion() {
        return getInt(8);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public long getRootDispersionInMillis() {
        return (getRootDispersion() * 1000) / 65536;
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public double getRootDispersionInMillisDouble() {
        return getRootDispersion() / 65.536d;
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public int getStratum() {
        return m32142ui(this.buf[1]);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public TimeStamp getTransmitTimeStamp() {
        return getTimestamp(40);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public String getType() {
        return NtpV3Packet.TYPE_NTP;
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public int getVersion() {
        return (m32142ui(this.buf[0]) >> 3) & 7;
    }

    public int hashCode() {
        return Arrays.hashCode(this.buf);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setDatagramPacket(DatagramPacket datagramPacket) {
        if (datagramPacket == null || datagramPacket.getLength() < this.buf.length) {
            throw new IllegalArgumentException();
        }
        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();
        byte[] bArr = this.buf;
        int i10 = length;
        if (length > bArr.length) {
            i10 = bArr.length;
        }
        System.arraycopy(data, 0, bArr, 0, i10);
        DatagramPacket datagramPacket2 = getDatagramPacket();
        datagramPacket2.setAddress(datagramPacket.getAddress());
        int port = datagramPacket.getPort();
        if (port <= 0) {
            port = 123;
        }
        datagramPacket2.setPort(port);
        datagramPacket2.setData(this.buf);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setLeapIndicator(int i10) {
        byte[] bArr = this.buf;
        bArr[0] = (byte) (((i10 & 3) << 6) | (bArr[0] & 63));
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setMode(int i10) {
        byte[] bArr = this.buf;
        bArr[0] = (byte) ((i10 & 7) | (bArr[0] & 248));
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setOriginateTimeStamp(TimeStamp timeStamp) {
        setTimestamp(24, timeStamp);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setPoll(int i10) {
        this.buf[2] = (byte) (i10 & 255);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setPrecision(int i10) {
        this.buf[3] = (byte) (i10 & 255);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setReceiveTimeStamp(TimeStamp timeStamp) {
        setTimestamp(32, timeStamp);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setReferenceId(int i10) {
        setInt(12, i10);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setReferenceTime(TimeStamp timeStamp) {
        setTimestamp(16, timeStamp);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setRootDelay(int i10) {
        setInt(4, i10);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setRootDispersion(int i10) {
        setInt(8, i10);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setStratum(int i10) {
        this.buf[1] = (byte) (i10 & 255);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setTransmitTime(TimeStamp timeStamp) {
        setTimestamp(40, timeStamp);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setVersion(int i10) {
        byte[] bArr = this.buf;
        bArr[0] = (byte) (((i10 & 7) << 3) | (bArr[0] & 199));
    }

    public String toString() {
        return "[version:" + getVersion() + ", mode:" + getMode() + ", poll:" + getPoll() + ", precision:" + getPrecision() + ", delay:" + getRootDelay() + ", dispersion(ms):" + getRootDispersionInMillisDouble() + ", id:" + getReferenceIdString() + ", xmitTime:" + getTransmitTimeStamp().toDateString() + " ]";
    }
}
