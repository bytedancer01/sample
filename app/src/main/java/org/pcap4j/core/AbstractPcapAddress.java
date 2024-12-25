package org.pcap4j.core;

import java.net.InetAddress;
import org.pcap4j.core.NativeMappings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/core/AbstractPcapAddress.class */
abstract class AbstractPcapAddress implements PcapAddress {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) AbstractPcapAddress.class);
    private final InetAddress address;
    private final InetAddress broadcastAddr;
    private final InetAddress dstAddr;
    private final InetAddress netmask;

    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractPcapAddress(org.pcap4j.core.NativeMappings.pcap_addr r7, short r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pcap4j.core.AbstractPcapAddress.<init>(org.pcap4j.core.NativeMappings$pcap_addr, short, java.lang.String):void");
    }

    private void warn(short s10, short s11, String str, String str2) {
        Logger logger2 = logger;
        if (logger2.isWarnEnabled()) {
            logger2.warn("Couldn't analyze an address. devName: {}, field: {}, actual saFamily: {}, expected saFamily: {}", str, str2, Short.valueOf(s10), Short.valueOf(s11));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractPcapAddress abstractPcapAddress = (AbstractPcapAddress) obj;
        InetAddress inetAddress = this.address;
        if (inetAddress == null) {
            if (abstractPcapAddress.address != null) {
                return false;
            }
        } else if (!inetAddress.equals(abstractPcapAddress.address)) {
            return false;
        }
        InetAddress inetAddress2 = this.broadcastAddr;
        if (inetAddress2 == null) {
            if (abstractPcapAddress.broadcastAddr != null) {
                return false;
            }
        } else if (!inetAddress2.equals(abstractPcapAddress.broadcastAddr)) {
            return false;
        }
        InetAddress inetAddress3 = this.dstAddr;
        if (inetAddress3 == null) {
            if (abstractPcapAddress.dstAddr != null) {
                return false;
            }
        } else if (!inetAddress3.equals(abstractPcapAddress.dstAddr)) {
            return false;
        }
        InetAddress inetAddress4 = this.netmask;
        InetAddress inetAddress5 = abstractPcapAddress.netmask;
        return inetAddress4 == null ? inetAddress5 == null : inetAddress4.equals(inetAddress5);
    }

    @Override // org.pcap4j.core.PcapAddress
    public InetAddress getAddress() {
        return this.address;
    }

    @Override // org.pcap4j.core.PcapAddress
    public InetAddress getBroadcastAddress() {
        return this.broadcastAddr;
    }

    @Override // org.pcap4j.core.PcapAddress
    public InetAddress getDestinationAddress() {
        return this.dstAddr;
    }

    @Override // org.pcap4j.core.PcapAddress
    public InetAddress getNetmask() {
        return this.netmask;
    }

    public int hashCode() {
        InetAddress inetAddress = this.address;
        int i10 = 0;
        int hashCode = inetAddress == null ? 0 : inetAddress.hashCode();
        InetAddress inetAddress2 = this.broadcastAddr;
        int hashCode2 = inetAddress2 == null ? 0 : inetAddress2.hashCode();
        InetAddress inetAddress3 = this.dstAddr;
        int hashCode3 = inetAddress3 == null ? 0 : inetAddress3.hashCode();
        InetAddress inetAddress4 = this.netmask;
        if (inetAddress4 != null) {
            i10 = inetAddress4.hashCode();
        }
        return ((((((hashCode + 31) * 31) + hashCode2) * 31) + hashCode3) * 31) + i10;
    }

    public abstract InetAddress ntoInetAddress(NativeMappings.sockaddr sockaddrVar);

    public String toString() {
        StringBuilder sb2 = new StringBuilder(190);
        sb2.append("address: [");
        sb2.append(this.address);
        sb2.append("] netmask: [");
        sb2.append(this.netmask);
        sb2.append("] broadcastAddr: [");
        sb2.append(this.broadcastAddr);
        sb2.append("] dstAddr [");
        sb2.append(this.dstAddr);
        sb2.append("]");
        return sb2.toString();
    }
}
