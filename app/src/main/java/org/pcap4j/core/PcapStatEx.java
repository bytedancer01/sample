package org.pcap4j.core;

import java.math.BigInteger;
import org.pcap4j.core.NativeMappings;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/core/PcapStatEx.class */
public final class PcapStatEx {
    private final BigInteger numCollisions;
    private final BigInteger rxNumBytes;
    private final BigInteger rxNumCrcErrors;
    private final BigInteger rxNumFifoErrors;
    private final BigInteger rxNumFrameErrors;
    private final BigInteger rxNumLenghErrors;
    private final BigInteger rxNumMissedErrors;
    private final BigInteger rxNumMulticastPackets;
    private final BigInteger rxNumPackets;
    private final BigInteger rxNumPacketsDropped;
    private final BigInteger rxNumPacketsError;
    private final BigInteger txNumAbortedErrors;
    private final BigInteger txNumBytes;
    private final BigInteger txNumCarrierErrors;
    private final BigInteger txNumFifoErrors;
    private final BigInteger txNumHeartbeatErrors;
    private final BigInteger txNumOverflowErrors;
    private final BigInteger txNumPackets;
    private final BigInteger txNumPacketsDropped;
    private final BigInteger txNumPacketsError;
    private final BigInteger txNumWindowErrors;

    public PcapStatEx(NativeMappings.pcap_stat_ex pcap_stat_exVar) {
        this.rxNumPackets = new BigInteger(pcap_stat_exVar.rx_packets.toString());
        this.txNumPackets = new BigInteger(pcap_stat_exVar.tx_packets.toString());
        this.rxNumBytes = new BigInteger(pcap_stat_exVar.rx_bytes.toString());
        this.txNumBytes = new BigInteger(pcap_stat_exVar.tx_bytes.toString());
        this.rxNumPacketsError = new BigInteger(pcap_stat_exVar.rx_errors.toString());
        this.txNumPacketsError = new BigInteger(pcap_stat_exVar.tx_errors.toString());
        this.rxNumPacketsDropped = new BigInteger(pcap_stat_exVar.rx_dropped.toString());
        this.txNumPacketsDropped = new BigInteger(pcap_stat_exVar.tx_dropped.toString());
        this.rxNumMulticastPackets = new BigInteger(pcap_stat_exVar.multicast.toString());
        this.numCollisions = new BigInteger(pcap_stat_exVar.collisions.toString());
        this.rxNumLenghErrors = new BigInteger(pcap_stat_exVar.rx_length_errors.toString());
        this.txNumOverflowErrors = new BigInteger(pcap_stat_exVar.rx_over_errors.toString());
        this.rxNumCrcErrors = new BigInteger(pcap_stat_exVar.rx_crc_errors.toString());
        this.rxNumFrameErrors = new BigInteger(pcap_stat_exVar.rx_frame_errors.toString());
        this.rxNumFifoErrors = new BigInteger(pcap_stat_exVar.rx_fifo_errors.toString());
        this.rxNumMissedErrors = new BigInteger(pcap_stat_exVar.rx_missed_errors.toString());
        this.txNumAbortedErrors = new BigInteger(pcap_stat_exVar.tx_aborted_errors.toString());
        this.txNumCarrierErrors = new BigInteger(pcap_stat_exVar.tx_carrier_errors.toString());
        this.txNumFifoErrors = new BigInteger(pcap_stat_exVar.tx_fifo_errors.toString());
        this.txNumHeartbeatErrors = new BigInteger(pcap_stat_exVar.tx_heartbeat_errors.toString());
        this.txNumWindowErrors = new BigInteger(pcap_stat_exVar.tx_window_errors.toString());
    }

    public BigInteger getNumCollisions() {
        return this.numCollisions;
    }

    public BigInteger getRxNumBytes() {
        return this.rxNumBytes;
    }

    public BigInteger getRxNumCrcErrors() {
        return this.rxNumCrcErrors;
    }

    public BigInteger getRxNumFifoErrors() {
        return this.rxNumFifoErrors;
    }

    public BigInteger getRxNumFrameErrors() {
        return this.rxNumFrameErrors;
    }

    public BigInteger getRxNumLenghErrors() {
        return this.rxNumLenghErrors;
    }

    public BigInteger getRxNumMissedErrors() {
        return this.rxNumMissedErrors;
    }

    public BigInteger getRxNumMulticastPackets() {
        return this.rxNumMulticastPackets;
    }

    public BigInteger getRxNumPackets() {
        return this.rxNumPackets;
    }

    public BigInteger getRxNumPacketsDropped() {
        return this.rxNumPacketsDropped;
    }

    public BigInteger getRxNumPacketsError() {
        return this.rxNumPacketsError;
    }

    public BigInteger getTxNumAbortedErrors() {
        return this.txNumAbortedErrors;
    }

    public BigInteger getTxNumBytes() {
        return this.txNumBytes;
    }

    public BigInteger getTxNumCarrierErrors() {
        return this.txNumCarrierErrors;
    }

    public BigInteger getTxNumFifoErrors() {
        return this.txNumFifoErrors;
    }

    public BigInteger getTxNumHeartbeatErrors() {
        return this.txNumHeartbeatErrors;
    }

    public BigInteger getTxNumOverflowErrors() {
        return this.txNumOverflowErrors;
    }

    public BigInteger getTxNumPackets() {
        return this.txNumPackets;
    }

    public BigInteger getTxNumPacketsDropped() {
        return this.txNumPacketsDropped;
    }

    public BigInteger getTxNumPacketsError() {
        return this.txNumPacketsError;
    }

    public BigInteger getTxNumWindowErrors() {
        return this.txNumWindowErrors;
    }
}
