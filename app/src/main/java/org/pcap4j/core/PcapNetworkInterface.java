package org.pcap4j.core;

import com.sun.jna.Native;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.core.NativeMappings;
import org.pcap4j.core.NativePacketDllMappings;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.util.LinkLayerAddress;
import org.pcap4j.util.MacAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p447zg.C10222m;
import p447zg.C10229t;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/core/PcapNetworkInterface.class */
public final class PcapNetworkInterface {
    private static final int PCAP_IF_LOOPBACK = 1;
    private static final int PCAP_IF_RUNNING = 4;
    private static final int PCAP_IF_UP = 2;
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) PcapNetworkInterface.class);
    private final String description;
    private final boolean local;
    private final boolean loopBack;
    private final String name;
    private final boolean running;

    /* renamed from: up */
    private final boolean f36239up;
    private final List<PcapAddress> addresses = new ArrayList();
    private final List<LinkLayerAddress> linkLayerAddresses = new ArrayList();

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/PcapNetworkInterface$PromiscuousMode.class */
    public enum PromiscuousMode {
        PROMISCUOUS(1),
        NONPROMISCUOUS(0);

        private final int value;

        PromiscuousMode(int i10) {
            this.value = i10;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private PcapNetworkInterface(org.pcap4j.core.NativeMappings.pcap_if r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pcap4j.core.PcapNetworkInterface.<init>(org.pcap4j.core.NativeMappings$pcap_if, boolean):void");
    }

    private MacAddress getMacAddress(String str) {
        Pointer PacketOpenAdapter = NativePacketDllMappings.PacketOpenAdapter(str);
        if ((PacketOpenAdapter != null ? Native.f26127l == 4 ? PacketOpenAdapter.mo21421g(0L) : PacketOpenAdapter.mo21423i(0L) : -1L) == -1) {
            logger.error("Unable to open the NIF {}, Error Code: {}", str, Integer.valueOf(Native.getLastError()));
            return null;
        }
        C10222m c10222m = new C10222m(NativePacketDllMappings.PACKET_OID_DATA_SIZE);
        c10222m.m42761c0();
        NativePacketDllMappings.PACKET_OID_DATA packet_oid_data = new NativePacketDllMappings.PACKET_OID_DATA(c10222m);
        packet_oid_data.Length = new NativeLong(6L);
        packet_oid_data.Oid = new NativeLong(16843010L);
        int PacketRequest = NativePacketDllMappings.PacketRequest(PacketOpenAdapter, 0, packet_oid_data);
        NativePacketDllMappings.PacketCloseAdapter(PacketOpenAdapter);
        if (PacketRequest != 0) {
            return MacAddress.getByAddress(packet_oid_data.Data);
        }
        logger.error("Failed to retrieve the link layer address of the NIF: {}", str);
        return null;
    }

    public static PcapNetworkInterface newInstance(NativeMappings.pcap_if pcap_ifVar, boolean z10) {
        return new PcapNetworkInterface(pcap_ifVar, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PcapNetworkInterface)) {
            return false;
        }
        PcapNetworkInterface pcapNetworkInterface = (PcapNetworkInterface) obj;
        if (!this.addresses.equals(pcapNetworkInterface.addresses)) {
            return false;
        }
        String str = this.description;
        if (str == null) {
            if (pcapNetworkInterface.description != null) {
                return false;
            }
        } else if (!str.equals(pcapNetworkInterface.description)) {
            return false;
        }
        return this.linkLayerAddresses.equals(pcapNetworkInterface.linkLayerAddresses) && this.local == pcapNetworkInterface.local && this.loopBack == pcapNetworkInterface.loopBack && this.f36239up == pcapNetworkInterface.f36239up && this.running == pcapNetworkInterface.running && this.name.equals(pcapNetworkInterface.name);
    }

    public List<PcapAddress> getAddresses() {
        return new ArrayList(this.addresses);
    }

    public String getDescription() {
        return this.description;
    }

    public ArrayList<LinkLayerAddress> getLinkLayerAddresses() {
        return new ArrayList<>(this.linkLayerAddresses);
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = this.addresses.hashCode();
        String str = this.description;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.linkLayerAddresses.hashCode();
        int i10 = 1231;
        int i11 = this.local ? 1231 : 1237;
        int i12 = this.loopBack ? 1231 : 1237;
        int i13 = this.f36239up ? 1231 : 1237;
        if (!this.running) {
            i10 = 1237;
        }
        return ((((((((((((((hashCode + 31) * 31) + hashCode2) * 31) + hashCode3) * 31) + i11) * 31) + i12) * 31) + i13) * 31) + i10) * 31) + this.name.hashCode();
    }

    public boolean isLocal() {
        return this.local;
    }

    public boolean isLoopBack() {
        return this.loopBack;
    }

    public boolean isRunning() {
        return this.running;
    }

    public boolean isUp() {
        return this.f36239up;
    }

    public PcapHandle openLive(int i10, PromiscuousMode promiscuousMode, int i11) {
        if (promiscuousMode == null) {
            throw new NullPointerException("mode: " + promiscuousMode);
        }
        NativeMappings.PcapErrbuf pcapErrbuf = new NativeMappings.PcapErrbuf();
        Pointer pcap_open_live = NativeMappings.pcap_open_live(this.name, i10, promiscuousMode.getValue(), i11, pcapErrbuf);
        if (pcap_open_live == null || pcapErrbuf.length() != 0) {
            throw new PcapNativeException(pcapErrbuf.toString());
        }
        if (i11 == 0 && C10229t.m42814t()) {
            NativeMappings.timeval timevalVar = new NativeMappings.timeval();
            timevalVar.tv_sec = new NativeLong(0L);
            timevalVar.tv_usec = new NativeLong(0L);
            if (NativeMappings.PcapLibrary.INSTANCE.strioctl(NativeMappings.getFdFromPcapT(pcap_open_live), NativeMappings.SBIOCSTIME, timevalVar.size(), timevalVar.getPointer()) < 0) {
                throw new PcapNativeException("SBIOCSTIME: " + NativeMappings.pcap_strerror(NativeMappings.ERRNO_P.mo21421g(0L)).m21429o(0L));
            }
        }
        return new PcapHandle(pcap_open_live, PcapHandle.TimestampPrecision.MICRO);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(250);
        sb2.append("name: [");
        sb2.append(this.name);
        sb2.append("] description: [");
        sb2.append(this.description);
        for (PcapAddress pcapAddress : this.addresses) {
            sb2.append("] address: [");
            sb2.append(pcapAddress.getAddress());
        }
        for (LinkLayerAddress linkLayerAddress : this.linkLayerAddresses) {
            sb2.append("] link layer address: [");
            sb2.append(linkLayerAddress.getAddress());
        }
        sb2.append("] loopBack: [");
        sb2.append(this.loopBack);
        sb2.append("]");
        sb2.append("] up: [");
        sb2.append(this.f36239up);
        sb2.append("]");
        sb2.append("] running: [");
        sb2.append(this.running);
        sb2.append("]");
        sb2.append("] local: [");
        sb2.append(this.local);
        sb2.append("]");
        return sb2.toString();
    }
}
