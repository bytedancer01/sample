package org.pcap4j.core;

import com.sun.jna.Pointer;
import org.pcap4j.core.NativeMappings;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/core/PcapStat.class */
public final class PcapStat {
    private final long numPacketsCaptured;
    private final long numPacketsDropped;
    private final long numPacketsDroppedByIf;
    private final long numPacketsReceived;

    public PcapStat(Pointer pointer, boolean z10) {
        this.numPacketsReceived = NativeMappings.pcap_stat.getPsRecv(pointer) & 4294967295L;
        this.numPacketsDropped = NativeMappings.pcap_stat.getPsDrop(pointer) & 4294967295L;
        this.numPacketsDroppedByIf = NativeMappings.pcap_stat.getPsIfdrop(pointer) & 4294967295L;
        this.numPacketsCaptured = z10 ? NativeMappings.win_pcap_stat.getBsCapt(pointer) & 4294967295L : 0L;
    }

    public PcapStat(NativeMappings.pcap_stat pcap_statVar) {
        long j10;
        if (pcap_statVar instanceof NativeMappings.win_pcap_stat) {
            NativeMappings.win_pcap_stat win_pcap_statVar = (NativeMappings.win_pcap_stat) pcap_statVar;
            this.numPacketsReceived = win_pcap_statVar.ps_recv & 4294967295L;
            this.numPacketsDropped = win_pcap_statVar.ps_drop & 4294967295L;
            this.numPacketsDroppedByIf = win_pcap_statVar.ps_ifdrop & 4294967295L;
            j10 = win_pcap_statVar.bs_capt & 4294967295L;
        } else {
            this.numPacketsReceived = pcap_statVar.ps_recv & 4294967295L;
            this.numPacketsDropped = pcap_statVar.ps_drop & 4294967295L;
            this.numPacketsDroppedByIf = pcap_statVar.ps_ifdrop & 4294967295L;
            j10 = 0;
        }
        this.numPacketsCaptured = j10;
    }

    public long getNumPacketsCaptured() {
        return this.numPacketsCaptured;
    }

    public long getNumPacketsDropped() {
        return this.numPacketsDropped;
    }

    public long getNumPacketsDroppedByIf() {
        return this.numPacketsDroppedByIf;
    }

    public long getNumPacketsReceived() {
        return this.numPacketsReceived;
    }
}
