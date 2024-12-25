package org.pcap4j.core;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import java.io.Closeable;
import java.sql.Timestamp;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.pcap4j.core.NativeMappings;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.packet.Packet;
import org.pcap4j.util.ByteArrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/core/PcapDumper.class */
public final class PcapDumper implements Closeable {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) PcapDumper.class);
    private final Pointer dumper;
    private final ReentrantReadWriteLock dumperLock = new ReentrantReadWriteLock(true);
    private volatile boolean open = true;
    private final PcapHandle.TimestampPrecision timestampPrecision;

    /* renamed from: org.pcap4j.core.PcapDumper$1 */
    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/PcapDumper$1.class */
    public static /* synthetic */ class C72031 {
        public static final int[] $SwitchMap$org$pcap4j$core$PcapHandle$TimestampPrecision;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:8:0x0020
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                org.pcap4j.core.PcapHandle$TimestampPrecision[] r0 = org.pcap4j.core.PcapHandle.TimestampPrecision.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                org.pcap4j.core.PcapDumper.C72031.$SwitchMap$org$pcap4j$core$PcapHandle$TimestampPrecision = r0
                r0 = r4
                org.pcap4j.core.PcapHandle$TimestampPrecision r1 = org.pcap4j.core.PcapHandle.TimestampPrecision.MICRO     // Catch: java.lang.NoSuchFieldError -> L20
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L20
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L20
            L14:
                int[] r0 = org.pcap4j.core.PcapDumper.C72031.$SwitchMap$org$pcap4j$core$PcapHandle$TimestampPrecision     // Catch: java.lang.NoSuchFieldError -> L20 java.lang.NoSuchFieldError -> L24
                org.pcap4j.core.PcapHandle$TimestampPrecision r1 = org.pcap4j.core.PcapHandle.TimestampPrecision.NANO     // Catch: java.lang.NoSuchFieldError -> L24
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L24
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L24
            L1f:
                return
            L20:
                r4 = move-exception
                goto L14
            L24:
                r4 = move-exception
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: org.pcap4j.core.PcapDumper.C72031.m45545clinit():void");
        }
    }

    public PcapDumper(Pointer pointer, PcapHandle.TimestampPrecision timestampPrecision) {
        this.timestampPrecision = timestampPrecision;
        this.dumper = pointer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.open) {
            logger.warn("Already closed.");
            return;
        }
        this.dumperLock.writeLock().lock();
        try {
            if (!this.open) {
                logger.warn("Already closed.");
                return;
            }
            this.open = false;
            this.dumperLock.writeLock().unlock();
            NativeMappings.pcap_dump_close(this.dumper);
            logger.info("Closed.");
        } finally {
            this.dumperLock.writeLock().unlock();
        }
    }

    public void dump(Packet packet) {
        dump(packet, new Timestamp(System.currentTimeMillis()));
    }

    public void dump(Packet packet, Timestamp timestamp) {
        if (packet == null || timestamp == null) {
            throw new NullPointerException("packet: " + packet + " ts: " + timestamp);
        }
        Logger logger2 = logger;
        if (logger2.isDebugEnabled()) {
            logger2.debug("Dumping a packet: " + packet);
        }
        dumpRaw(packet.getRawData(), timestamp);
    }

    public void dumpRaw(byte[] bArr) {
        dumpRaw(bArr, new Timestamp(System.currentTimeMillis()));
    }

    public void dumpRaw(byte[] bArr, Timestamp timestamp) {
        NativeMappings.timeval timevalVar;
        NativeLong nativeLong;
        if (bArr == null || timestamp == null) {
            throw new NullPointerException("packet: " + bArr + " timestamp: " + timestamp);
        }
        if (!this.open) {
            throw new NotOpenException();
        }
        NativeMappings.pcap_pkthdr pcap_pkthdrVar = new NativeMappings.pcap_pkthdr();
        int length = bArr.length;
        pcap_pkthdrVar.caplen = length;
        pcap_pkthdrVar.len = length;
        NativeMappings.timeval timevalVar2 = new NativeMappings.timeval();
        pcap_pkthdrVar.f36237ts = timevalVar2;
        timevalVar2.tv_sec = new NativeLong(timestamp.getTime() / 1000);
        int i10 = C72031.$SwitchMap$org$pcap4j$core$PcapHandle$TimestampPrecision[this.timestampPrecision.ordinal()];
        if (i10 == 1) {
            timevalVar = pcap_pkthdrVar.f36237ts;
            nativeLong = new NativeLong(timestamp.getNanos() / 1000);
        } else {
            if (i10 != 2) {
                throw new AssertionError("Never get here.");
            }
            timevalVar = pcap_pkthdrVar.f36237ts;
            nativeLong = new NativeLong(timestamp.getNanos());
        }
        timevalVar.tv_usec = nativeLong;
        if (!this.dumperLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            NativeMappings.pcap_dump(this.dumper, pcap_pkthdrVar, bArr);
            this.dumperLock.readLock().unlock();
            Logger logger2 = logger;
            if (logger2.isDebugEnabled()) {
                logger2.debug("Dumped a packet: " + ByteArrays.toHexString(bArr, " "));
            }
        } catch (Throwable th2) {
            this.dumperLock.readLock().unlock();
            throw th2;
        }
    }

    public void flush() {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.dumperLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            int pcap_dump_flush = NativeMappings.pcap_dump_flush(this.dumper);
            if (pcap_dump_flush < 0) {
                throw new PcapNativeException("Failed to flush.", Integer.valueOf(pcap_dump_flush));
            }
        } finally {
            this.dumperLock.readLock().unlock();
        }
    }

    public long ftell() {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.dumperLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            NativeLong pcap_dump_ftell = NativeMappings.pcap_dump_ftell(this.dumper);
            this.dumperLock.readLock().unlock();
            long longValue = pcap_dump_ftell.longValue();
            if (longValue >= 0) {
                return longValue;
            }
            throw new PcapNativeException("Failed to get the file position.");
        } catch (Throwable th2) {
            this.dumperLock.readLock().unlock();
            throw th2;
        }
    }

    public Pointer getDumper() {
        return this.dumper;
    }

    public boolean isOpen() {
        return this.open;
    }
}
