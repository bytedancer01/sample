package org.pcap4j.core;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import java.io.Closeable;
import java.io.EOFException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.pcap4j.core.BpfProgram;
import org.pcap4j.core.NativeMappings;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.factory.PacketFactory;
import org.pcap4j.packet.namednumber.DataLinkType;
import org.pcap4j.util.ByteArrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p447zg.C10229t;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/core/PcapHandle.class */
public final class PcapHandle implements Closeable {
    public static final Inet4Address PCAP_NETMASK_UNKNOWN;
    private volatile DataLinkType dlt;
    private volatile String filteringExpression;
    private final Pointer handle;
    private final ReentrantReadWriteLock handleLock;
    private volatile boolean open;
    private final ThreadLocal<Integer> originalLengths;
    private final TimestampPrecision timestampPrecision;
    private final ThreadLocal<Timestamp> timestamps;
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) PcapHandle.class);
    private static final Object compileLock = new Object();

    /* renamed from: org.pcap4j.core.PcapHandle$1 */
    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/PcapHandle$1.class */
    public static /* synthetic */ class C72041 {
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
                org.pcap4j.core.PcapHandle.C72041.$SwitchMap$org$pcap4j$core$PcapHandle$TimestampPrecision = r0
                r0 = r4
                org.pcap4j.core.PcapHandle$TimestampPrecision r1 = org.pcap4j.core.PcapHandle.TimestampPrecision.MICRO     // Catch: java.lang.NoSuchFieldError -> L20
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L20
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L20
            L14:
                int[] r0 = org.pcap4j.core.PcapHandle.C72041.$SwitchMap$org$pcap4j$core$PcapHandle$TimestampPrecision     // Catch: java.lang.NoSuchFieldError -> L20 java.lang.NoSuchFieldError -> L24
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
            throw new UnsupportedOperationException("Method not decompiled: org.pcap4j.core.PcapHandle.C72041.m45547clinit():void");
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/PcapHandle$BlockingMode.class */
    public enum BlockingMode {
        BLOCKING(0),
        NONBLOCKING(1);

        private final int value;

        BlockingMode(int i10) {
            this.value = i10;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/PcapHandle$Builder.class */
    public static final class Builder {
        private int bufferSize;
        private final String deviceName;
        private boolean immediateMode;
        private boolean rfmon;
        private int snaplen;
        private int timeoutMillis;
        private boolean isSnaplenSet = false;
        private PcapNetworkInterface.PromiscuousMode promiscuousMode = null;
        private boolean isRfmonSet = false;
        private boolean isTimeoutMillisSet = false;
        private boolean isBufferSizeSet = false;
        private TimestampPrecision timestampPrecision = null;
        private PcapDirection direction = null;
        private boolean isImmediateModeSet = false;

        public Builder(String str) {
            if (str != null && str.length() != 0) {
                this.deviceName = str;
                return;
            }
            throw new IllegalArgumentException("deviceName: " + str);
        }

        public Builder bufferSize(int i10) {
            this.bufferSize = i10;
            this.isBufferSizeSet = true;
            return this;
        }

        public PcapHandle build() {
            return new PcapHandle(this, (C72041) null);
        }

        public Builder direction(PcapDirection pcapDirection) {
            this.direction = pcapDirection;
            return this;
        }

        public Builder immediateMode(boolean z10) {
            this.immediateMode = z10;
            this.isImmediateModeSet = true;
            return this;
        }

        public Builder promiscuousMode(PcapNetworkInterface.PromiscuousMode promiscuousMode) {
            this.promiscuousMode = promiscuousMode;
            return this;
        }

        public Builder rfmon(boolean z10) {
            this.rfmon = z10;
            this.isRfmonSet = true;
            return this;
        }

        public Builder snaplen(int i10) {
            this.snaplen = i10;
            this.isSnaplenSet = true;
            return this;
        }

        public Builder timeoutMillis(int i10) {
            this.timeoutMillis = i10;
            this.isTimeoutMillisSet = true;
            return this;
        }

        public Builder timestampPrecision(TimestampPrecision timestampPrecision) {
            this.timestampPrecision = timestampPrecision;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/PcapHandle$GotPacketFuncExecutor.class */
    public final class GotPacketFuncExecutor implements NativeMappings.pcap_handler {
        private final DataLinkType dlt;
        private final Executor executor;
        private final PacketListener listener;
        public final PcapHandle this$0;

        public GotPacketFuncExecutor(PcapHandle pcapHandle, PacketListener packetListener, DataLinkType dataLinkType, Executor executor) {
            this.this$0 = pcapHandle;
            this.dlt = dataLinkType;
            this.listener = packetListener;
            this.executor = executor;
        }

        @Override // org.pcap4j.core.NativeMappings.pcap_handler
        public void got_packet(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            try {
                this.executor.execute(new Runnable(this, this.this$0.buildTimestamp(pointer2), NativeMappings.pcap_pkthdr.getLen(pointer2), pointer3.m21417c(0L, NativeMappings.pcap_pkthdr.getCaplen(pointer2))) { // from class: org.pcap4j.core.PcapHandle.GotPacketFuncExecutor.1
                    public final GotPacketFuncExecutor this$1;
                    public final byte[] val$ba;
                    public final int val$len;
                    public final Timestamp val$ts;

                    {
                        this.this$1 = this;
                        this.val$ts = r5;
                        this.val$len = r6;
                        this.val$ba = r7;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.this$1.this$0.timestamps.set(this.val$ts);
                        this.this$1.this$0.originalLengths.set(Integer.valueOf(this.val$len));
                        PacketListener packetListener = this.this$1.listener;
                        PacketFactory factory = PacketFactories.getFactory(Packet.class, DataLinkType.class);
                        byte[] bArr = this.val$ba;
                        packetListener.gotPacket((Packet) factory.newInstance(bArr, 0, bArr.length, this.this$1.dlt));
                    }
                });
            } catch (Throwable th2) {
                PcapHandle.logger.error("The executor has thrown an exception.", th2);
            }
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/PcapHandle$GotRawPacketFuncExecutor.class */
    public final class GotRawPacketFuncExecutor implements NativeMappings.pcap_handler {
        private final Executor executor;
        private final RawPacketListener listener;
        public final PcapHandle this$0;

        public GotRawPacketFuncExecutor(PcapHandle pcapHandle, RawPacketListener rawPacketListener, Executor executor) {
            this.this$0 = pcapHandle;
            this.listener = rawPacketListener;
            this.executor = executor;
        }

        @Override // org.pcap4j.core.NativeMappings.pcap_handler
        public void got_packet(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            try {
                this.executor.execute(new Runnable(this, this.this$0.buildTimestamp(pointer2), NativeMappings.pcap_pkthdr.getLen(pointer2), pointer3.m21417c(0L, NativeMappings.pcap_pkthdr.getCaplen(pointer2))) { // from class: org.pcap4j.core.PcapHandle.GotRawPacketFuncExecutor.1
                    public final GotRawPacketFuncExecutor this$1;
                    public final byte[] val$ba;
                    public final int val$len;
                    public final Timestamp val$ts;

                    {
                        this.this$1 = this;
                        this.val$ts = r5;
                        this.val$len = r6;
                        this.val$ba = r7;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.this$1.this$0.timestamps.set(this.val$ts);
                        this.this$1.this$0.originalLengths.set(Integer.valueOf(this.val$len));
                        this.this$1.listener.gotPacket(this.val$ba);
                    }
                });
            } catch (Throwable th2) {
                PcapHandle.logger.error("The executor has thrown an exception.", th2);
            }
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/PcapHandle$PcapDirection.class */
    public enum PcapDirection {
        INOUT(0),
        IN(1),
        OUT(2);

        private final int value;

        PcapDirection(int i10) {
            this.value = i10;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/PcapHandle$SimpleExecutor.class */
    public static final class SimpleExecutor implements Executor {
        private static final SimpleExecutor INSTANCE = new SimpleExecutor();

        private SimpleExecutor() {
        }

        public static SimpleExecutor getInstance() {
            return INSTANCE;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/PcapHandle$SwappedType.class */
    public enum SwappedType {
        NOT_SWAPPED(0),
        SWAPPED(1),
        MAYBE_SWAPPED(2);

        private final int value;

        SwappedType(int i10) {
            this.value = i10;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/PcapHandle$TimestampPrecision.class */
    public enum TimestampPrecision {
        MICRO(0),
        NANO(1);

        private final int value;

        TimestampPrecision(int i10) {
            this.value = i10;
        }

        public int getValue() {
            return this.value;
        }
    }

    static {
        try {
            PCAP_NETMASK_UNKNOWN = (Inet4Address) InetAddress.getByName("255.255.255.255");
        } catch (UnknownHostException e10) {
            throw new AssertionError("never get here");
        }
    }

    public PcapHandle(Pointer pointer, TimestampPrecision timestampPrecision) {
        this.timestamps = new ThreadLocal<>();
        this.originalLengths = new ThreadLocal<>();
        this.handleLock = new ReentrantReadWriteLock(true);
        this.open = true;
        this.filteringExpression = "";
        this.handle = pointer;
        this.dlt = getDltByNative();
        this.timestampPrecision = timestampPrecision;
    }

    private PcapHandle(Builder builder) {
        int pcap_setdirection;
        int pcap_set_buffer_size;
        int pcap_set_timeout;
        int pcap_set_promisc;
        int pcap_set_snaplen;
        this.timestamps = new ThreadLocal<>();
        this.originalLengths = new ThreadLocal<>();
        this.handleLock = new ReentrantReadWriteLock(true);
        this.open = true;
        this.filteringExpression = "";
        NativeMappings.PcapErrbuf pcapErrbuf = new NativeMappings.PcapErrbuf();
        Pointer pcap_create = NativeMappings.pcap_create(builder.deviceName, pcapErrbuf);
        this.handle = pcap_create;
        if (pcap_create == null || pcapErrbuf.length() != 0) {
            throw new PcapNativeException(pcapErrbuf.toString());
        }
        try {
            if (builder.isSnaplenSet && (pcap_set_snaplen = NativeMappings.pcap_set_snaplen(pcap_create, builder.snaplen)) != 0) {
                throw new PcapNativeException(getError(), Integer.valueOf(pcap_set_snaplen));
            }
            if (builder.promiscuousMode != null && (pcap_set_promisc = NativeMappings.pcap_set_promisc(pcap_create, builder.promiscuousMode.getValue())) != 0) {
                throw new PcapNativeException(getError(), Integer.valueOf(pcap_set_promisc));
            }
            if (builder.isRfmonSet) {
                try {
                    int pcap_set_rfmon = NativeMappings.PcapLibrary.INSTANCE.pcap_set_rfmon(pcap_create, builder.rfmon ? 1 : 0);
                    if (pcap_set_rfmon != 0) {
                        throw new PcapNativeException(getError(), Integer.valueOf(pcap_set_rfmon));
                    }
                } catch (UnsatisfiedLinkError e10) {
                    logger.error("Failed to instantiate PcapHandle object.", (Throwable) e10);
                    throw new PcapNativeException("Monitor mode is not supported on this platform.");
                }
            }
            if (builder.isTimeoutMillisSet && (pcap_set_timeout = NativeMappings.pcap_set_timeout(pcap_create, builder.timeoutMillis)) != 0) {
                throw new PcapNativeException(getError(), Integer.valueOf(pcap_set_timeout));
            }
            if (builder.isBufferSizeSet && (pcap_set_buffer_size = NativeMappings.pcap_set_buffer_size(pcap_create, builder.bufferSize)) != 0) {
                throw new PcapNativeException(getError(), Integer.valueOf(pcap_set_buffer_size));
            }
            if (builder.timestampPrecision != null) {
                try {
                    if (NativeMappings.PcapLibrary.INSTANCE.pcap_set_tstamp_precision(pcap_create, builder.timestampPrecision.getValue()) == 0) {
                        this.timestampPrecision = builder.timestampPrecision;
                    } else {
                        StringBuilder sb2 = new StringBuilder(100);
                        sb2.append("The specified timestamp precision ");
                        sb2.append(builder.timestampPrecision);
                        sb2.append(" is not supported on this platform. ");
                        TimestampPrecision timestampPrecision = TimestampPrecision.MICRO;
                        sb2.append(timestampPrecision);
                        sb2.append(" is set instead.");
                        logger.error(sb2.toString());
                        this.timestampPrecision = timestampPrecision;
                    }
                } catch (UnsatisfiedLinkError e11) {
                    throw new PcapNativeException("pcap_set_tstamp_precision is not supported by the pcap library installed in this environment.");
                }
            } else {
                this.timestampPrecision = TimestampPrecision.MICRO;
            }
            if (builder.isImmediateModeSet) {
                try {
                    int pcap_set_immediate_mode = NativeMappings.PcapLibrary.INSTANCE.pcap_set_immediate_mode(pcap_create, builder.immediateMode ? 1 : 0);
                    if (pcap_set_immediate_mode != 0) {
                        throw new PcapNativeException(getError(), Integer.valueOf(pcap_set_immediate_mode));
                    }
                } catch (UnsatisfiedLinkError e12) {
                    logger.error("Failed to instantiate PcapHandle object.", (Throwable) e12);
                    throw new PcapNativeException("Immediate mode is not supported on this platform.");
                }
            }
            int pcap_activate = NativeMappings.pcap_activate(pcap_create);
            if (pcap_activate < 0) {
                throw new PcapNativeException(getError(), Integer.valueOf(pcap_activate));
            }
            if (builder.direction == null || (pcap_setdirection = NativeMappings.pcap_setdirection(pcap_create, builder.direction.getValue())) >= 0) {
                this.dlt = getDltByNative();
                return;
            }
            throw new PcapNativeException("Failed to set direction: " + getError(), Integer.valueOf(pcap_setdirection));
        } catch (NotOpenException e13) {
            throw new AssertionError("Never get here.");
        }
    }

    public /* synthetic */ PcapHandle(Builder builder, C72041 c72041) {
        this(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Timestamp buildTimestamp(Pointer pointer) {
        int intValue;
        Timestamp timestamp = new Timestamp(NativeMappings.pcap_pkthdr.getTvSec(pointer).longValue() * 1000);
        int i10 = C72041.$SwitchMap$org$pcap4j$core$PcapHandle$TimestampPrecision[this.timestampPrecision.ordinal()];
        if (i10 == 1) {
            intValue = NativeMappings.pcap_pkthdr.getTvUsec(pointer).intValue() * 1000;
        } else {
            if (i10 != 2) {
                throw new AssertionError("Never get here.");
            }
            intValue = NativeMappings.pcap_pkthdr.getTvUsec(pointer).intValue();
        }
        timestamp.setNanos(intValue);
        return timestamp;
    }

    private int doDispatch(int i10, NativeMappings.pcap_handler pcap_handlerVar) {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            Logger logger2 = logger;
            logger2.info("Starting dispatch.");
            int pcap_dispatch = NativeMappings.pcap_dispatch(this.handle, i10, pcap_handlerVar, null);
            if (pcap_dispatch >= 0) {
                this.handleLock.readLock().unlock();
                logger2.info("Finish dispatch.");
                return pcap_dispatch;
            }
            if (pcap_dispatch == -2) {
                logger2.info("Broken.");
                throw new InterruptedException();
            }
            if (pcap_dispatch != -1) {
                throw new PcapNativeException("Unexpected error occurred: " + getError(), Integer.valueOf(pcap_dispatch));
            }
            throw new PcapNativeException("Error occurred: " + getError(), Integer.valueOf(pcap_dispatch));
        } catch (Throwable th2) {
            this.handleLock.readLock().unlock();
            throw th2;
        }
    }

    private void doLoop(int i10, NativeMappings.pcap_handler pcap_handlerVar) {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            Logger logger2 = logger;
            logger2.info("Starting loop.");
            int pcap_loop = NativeMappings.pcap_loop(this.handle, i10, pcap_handlerVar, (Pointer) null);
            if (pcap_loop == -2) {
                logger2.info("Broken.");
                throw new InterruptedException();
            }
            if (pcap_loop == -1) {
                throw new PcapNativeException("Error occurred: " + getError(), Integer.valueOf(pcap_loop));
            }
            if (pcap_loop == 0) {
                logger2.info("Finished loop.");
                return;
            }
            throw new PcapNativeException("Unexpected error occurred: " + getError(), Integer.valueOf(pcap_loop));
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    private DataLinkType getDltByNative() {
        return DataLinkType.getInstance(Integer.valueOf(NativeMappings.pcap_datalink(this.handle)));
    }

    public void breakLoop() {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            logger.info("Break loop.");
            NativeMappings.pcap_breakloop(this.handle);
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.open) {
            logger.warn("Already closed.");
            return;
        }
        this.handleLock.writeLock().lock();
        try {
            if (!this.open) {
                logger.warn("Already closed.");
                return;
            }
            this.open = false;
            this.handleLock.writeLock().unlock();
            NativeMappings.pcap_close(this.handle);
            logger.info("Closed.");
        } finally {
            this.handleLock.writeLock().unlock();
        }
    }

    public BpfProgram compileFilter(String str, BpfProgram.BpfCompileMode bpfCompileMode, Inet4Address inet4Address) {
        int pcap_compile;
        if (str == null || bpfCompileMode == null || inet4Address == null) {
            throw new NullPointerException("bpfExpression: " + str + " mode: " + bpfCompileMode + " netmask: " + inet4Address);
        }
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            NativeMappings.bpf_program bpf_programVar = new NativeMappings.bpf_program();
            synchronized (compileLock) {
                pcap_compile = NativeMappings.pcap_compile(this.handle, bpf_programVar, str, bpfCompileMode.getValue(), ByteArrays.getInt(ByteArrays.toByteArray(inet4Address), 0));
            }
            if (pcap_compile < 0) {
                throw new PcapNativeException(getError(), Integer.valueOf(pcap_compile));
            }
            this.handleLock.readLock().unlock();
            return new BpfProgram(bpf_programVar, str);
        } catch (Throwable th2) {
            this.handleLock.readLock().unlock();
            throw th2;
        }
    }

    public int dispatch(int i10, PacketListener packetListener) {
        return dispatch(i10, packetListener, SimpleExecutor.getInstance());
    }

    public int dispatch(int i10, PacketListener packetListener, Executor executor) {
        if (packetListener != null && executor != null) {
            return doDispatch(i10, new GotPacketFuncExecutor(this, packetListener, this.dlt, executor));
        }
        throw new NullPointerException("listener: " + packetListener + " executor: " + executor);
    }

    public int dispatch(int i10, RawPacketListener rawPacketListener) {
        return dispatch(i10, rawPacketListener, SimpleExecutor.getInstance());
    }

    public int dispatch(int i10, RawPacketListener rawPacketListener, Executor executor) {
        if (rawPacketListener != null && executor != null) {
            return doDispatch(i10, new GotRawPacketFuncExecutor(this, rawPacketListener, executor));
        }
        throw new NullPointerException("listener: " + rawPacketListener + " executor: " + executor);
    }

    public PcapDumper dumpOpen(String str) {
        if (str == null) {
            throw new NullPointerException("filePath must not be null.");
        }
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            Pointer pcap_dump_open = NativeMappings.pcap_dump_open(this.handle, str);
            if (pcap_dump_open == null) {
                throw new PcapNativeException(getError());
            }
            this.handleLock.readLock().unlock();
            return new PcapDumper(pcap_dump_open, this.timestampPrecision);
        } catch (Throwable th2) {
            this.handleLock.readLock().unlock();
            throw th2;
        }
    }

    public BlockingMode getBlockingMode() {
        if (!this.open) {
            throw new NotOpenException();
        }
        NativeMappings.PcapErrbuf pcapErrbuf = new NativeMappings.PcapErrbuf();
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            int pcap_getnonblock = NativeMappings.pcap_getnonblock(this.handle, pcapErrbuf);
            if (pcap_getnonblock == 0) {
                return BlockingMode.BLOCKING;
            }
            if (pcap_getnonblock > 0) {
                return BlockingMode.NONBLOCKING;
            }
            throw new PcapNativeException(pcapErrbuf.toString(), Integer.valueOf(pcap_getnonblock));
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public DataLinkType getDlt() {
        return this.dlt;
    }

    public String getError() {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (this.open) {
                return NativeMappings.pcap_geterr(this.handle).m21429o(0L);
            }
            throw new NotOpenException();
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public String getFilteringExpression() {
        return this.filteringExpression;
    }

    public int getMajorVersion() {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (this.open) {
                return NativeMappings.pcap_major_version(this.handle);
            }
            throw new NotOpenException();
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public int getMinorVersion() {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (this.open) {
                return NativeMappings.pcap_minor_version(this.handle);
            }
            throw new NotOpenException();
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public Packet getNextPacket() {
        byte[] nextRawPacket = getNextRawPacket();
        if (nextRawPacket == null) {
            return null;
        }
        return (Packet) PacketFactories.getFactory(Packet.class, DataLinkType.class).newInstance(nextRawPacket, 0, nextRawPacket.length, this.dlt);
    }

    public Packet getNextPacketEx() {
        byte[] nextRawPacketEx = getNextRawPacketEx();
        return (Packet) PacketFactories.getFactory(Packet.class, DataLinkType.class).newInstance(nextRawPacketEx, 0, nextRawPacketEx.length, this.dlt);
    }

    public byte[] getNextRawPacket() {
        if (!this.open) {
            throw new NotOpenException();
        }
        NativeMappings.pcap_pkthdr pcap_pkthdrVar = new NativeMappings.pcap_pkthdr();
        pcap_pkthdrVar.setAutoSynch(false);
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            Pointer pcap_next = NativeMappings.pcap_next(this.handle, pcap_pkthdrVar);
            if (pcap_next == null) {
                return null;
            }
            Pointer pointer = pcap_pkthdrVar.getPointer();
            this.timestamps.set(buildTimestamp(pointer));
            this.originalLengths.set(Integer.valueOf(NativeMappings.pcap_pkthdr.getLen(pointer)));
            return pcap_next.m21417c(0L, NativeMappings.pcap_pkthdr.getCaplen(pointer));
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public byte[] getNextRawPacketEx() {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            PointerByReference pointerByReference = new PointerByReference();
            PointerByReference pointerByReference2 = new PointerByReference();
            int pcap_next_ex = NativeMappings.pcap_next_ex(this.handle, pointerByReference, pointerByReference2);
            if (pcap_next_ex == -2) {
                throw new EOFException();
            }
            if (pcap_next_ex == -1) {
                throw new PcapNativeException("Error occurred in pcap_next_ex(): " + getError(), Integer.valueOf(pcap_next_ex));
            }
            if (pcap_next_ex == 0) {
                throw new TimeoutException();
            }
            if (pcap_next_ex != 1) {
                throw new PcapNativeException("Unexpected error occurred: " + getError(), Integer.valueOf(pcap_next_ex));
            }
            Pointer m21495f = pointerByReference.m21495f();
            Pointer m21495f2 = pointerByReference2.m21495f();
            if (m21495f != null && m21495f2 != null) {
                this.timestamps.set(buildTimestamp(m21495f));
                this.originalLengths.set(Integer.valueOf(NativeMappings.pcap_pkthdr.getLen(m21495f)));
                return m21495f2.m21417c(0L, NativeMappings.pcap_pkthdr.getCaplen(m21495f));
            }
            throw new PcapNativeException("Failed to get packet. *header: " + m21495f + " *data: " + m21495f2);
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public Integer getOriginalLength() {
        return this.originalLengths.get();
    }

    public int getSnapshot() {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (this.open) {
                return NativeMappings.pcap_snapshot(this.handle);
            }
            throw new NotOpenException();
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public PcapStat getStats() {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            if (C10229t.m42815u()) {
                IntByReference intByReference = new IntByReference();
                Pointer win_pcap_stats_ex = NativeMappings.PcapLibrary.INSTANCE.win_pcap_stats_ex(this.handle, intByReference);
                if (!getError().equals("Cannot retrieve the extended statistics from a file or a TurboCap port")) {
                    if (intByReference.m21493f() != 24) {
                        throw new PcapNativeException(getError());
                    }
                    if (win_pcap_stats_ex != null) {
                        return new PcapStat(win_pcap_stats_ex, true);
                    }
                    throw new PcapNativeException(getError());
                }
            }
            NativeMappings.pcap_stat pcap_statVar = new NativeMappings.pcap_stat();
            pcap_statVar.setAutoSynch(false);
            int pcap_stats = NativeMappings.pcap_stats(this.handle, pcap_statVar);
            if (pcap_stats >= 0) {
                return new PcapStat(pcap_statVar.getPointer(), false);
            }
            throw new PcapNativeException(getError(), Integer.valueOf(pcap_stats));
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public Timestamp getTimestamp() {
        return this.timestamps.get();
    }

    public TimestampPrecision getTimestampPrecision() {
        return this.timestampPrecision;
    }

    public boolean isOpen() {
        return this.open;
    }

    public SwappedType isSwapped() {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            int pcap_is_swapped = NativeMappings.pcap_is_swapped(this.handle);
            if (pcap_is_swapped == 0) {
                return SwappedType.NOT_SWAPPED;
            }
            if (pcap_is_swapped == 1) {
                return SwappedType.SWAPPED;
            }
            if (pcap_is_swapped == 2) {
                return SwappedType.MAYBE_SWAPPED;
            }
            logger.warn("pcap_snapshot returned an unexpected code: " + pcap_is_swapped);
            return SwappedType.MAYBE_SWAPPED;
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public List<DataLinkType> listDatalinks() {
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            PointerByReference pointerByReference = new PointerByReference();
            int pcap_list_datalinks = NativeMappings.pcap_list_datalinks(this.handle, pointerByReference);
            if (pcap_list_datalinks < 0) {
                throw new PcapNativeException(getError(), Integer.valueOf(pcap_list_datalinks));
            }
            Pointer m21495f = pointerByReference.m21495f();
            ArrayList arrayList = new ArrayList(pcap_list_datalinks);
            for (int i10 : m21495f.m21422h(0L, pcap_list_datalinks)) {
                arrayList.add(DataLinkType.getInstance(Integer.valueOf(i10)));
            }
            NativeMappings.pcap_free_datalinks(m21495f);
            return arrayList;
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public void loop(int i10, PacketListener packetListener) {
        loop(i10, packetListener, SimpleExecutor.getInstance());
    }

    public void loop(int i10, PacketListener packetListener, Executor executor) {
        if (packetListener != null && executor != null) {
            doLoop(i10, new GotPacketFuncExecutor(this, packetListener, this.dlt, executor));
            return;
        }
        throw new NullPointerException("listener: " + packetListener + " executor: " + executor);
    }

    public void loop(int i10, PcapDumper pcapDumper) {
        if (pcapDumper == null) {
            throw new NullPointerException("dumper must not be null.");
        }
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            Logger logger2 = logger;
            logger2.info("Starting dump loop.");
            int pcap_loop = NativeMappings.pcap_loop(this.handle, i10, NativeMappings.PCAP_DUMP, pcapDumper.getDumper());
            if (pcap_loop == -2) {
                logger2.info("Broken.");
                throw new InterruptedException();
            }
            if (pcap_loop == -1) {
                throw new PcapNativeException("Error occurred: " + getError(), Integer.valueOf(pcap_loop));
            }
            if (pcap_loop == 0) {
                logger2.info("Finished dump loop.");
                return;
            }
            throw new PcapNativeException("Unexpected error occurred: " + getError(), Integer.valueOf(pcap_loop));
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public void loop(int i10, RawPacketListener rawPacketListener) {
        loop(i10, rawPacketListener, SimpleExecutor.getInstance());
    }

    public void loop(int i10, RawPacketListener rawPacketListener, Executor executor) {
        if (rawPacketListener != null && executor != null) {
            doLoop(i10, new GotRawPacketFuncExecutor(this, rawPacketListener, executor));
            return;
        }
        throw new NullPointerException("listener: " + rawPacketListener + " executor: " + executor);
    }

    public void sendPacket(Packet packet) {
        if (packet == null) {
            throw new NullPointerException("packet may not be null");
        }
        sendPacket(packet.getRawData());
    }

    public void sendPacket(byte[] bArr) {
        sendPacket(bArr, bArr.length);
    }

    public void sendPacket(byte[] bArr, int i10) {
        if (bArr == null) {
            throw new NullPointerException("bytes may not be null");
        }
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            int pcap_sendpacket = NativeMappings.pcap_sendpacket(this.handle, bArr, i10);
            if (pcap_sendpacket >= 0) {
                return;
            }
            throw new PcapNativeException("Error occurred in pcap_sendpacket(): " + getError(), Integer.valueOf(pcap_sendpacket));
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public void setBlockingMode(BlockingMode blockingMode) {
        if (blockingMode == null) {
            throw new NullPointerException(" mode: " + blockingMode);
        }
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            NativeMappings.PcapErrbuf pcapErrbuf = new NativeMappings.PcapErrbuf();
            int pcap_setnonblock = NativeMappings.pcap_setnonblock(this.handle, blockingMode.getValue(), pcapErrbuf);
            if (pcap_setnonblock < 0) {
                throw new PcapNativeException(pcapErrbuf.toString(), Integer.valueOf(pcap_setnonblock));
            }
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public void setDirection(PcapDirection pcapDirection) {
        if (pcapDirection == null) {
            throw new NullPointerException("direction must not be null.");
        }
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            int pcap_setdirection = NativeMappings.pcap_setdirection(this.handle, pcapDirection.getValue());
            if (pcap_setdirection >= 0) {
                return;
            }
            throw new PcapNativeException("Failed to set direction: " + getError(), Integer.valueOf(pcap_setdirection));
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public void setDlt(DataLinkType dataLinkType) {
        if (dataLinkType == null) {
            throw new NullPointerException("dlt must not be null.");
        }
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            int pcap_set_datalink = NativeMappings.pcap_set_datalink(this.handle, dataLinkType.value().intValue());
            if (pcap_set_datalink < 0) {
                throw new PcapNativeException(getError(), Integer.valueOf(pcap_set_datalink));
            }
            this.handleLock.readLock().unlock();
            this.dlt = dataLinkType;
        } catch (Throwable th2) {
            this.handleLock.readLock().unlock();
            throw th2;
        }
    }

    public void setFilter(String str, BpfProgram.BpfCompileMode bpfCompileMode) {
        setFilter(str, bpfCompileMode, PCAP_NETMASK_UNKNOWN);
    }

    public void setFilter(String str, BpfProgram.BpfCompileMode bpfCompileMode, Inet4Address inet4Address) {
        int pcap_compile;
        if (str == null || bpfCompileMode == null || inet4Address == null) {
            throw new NullPointerException("bpfExpression: " + str + " mode: " + bpfCompileMode + " netmask: " + inet4Address);
        }
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            NativeMappings.bpf_program bpf_programVar = new NativeMappings.bpf_program();
            try {
                int i10 = ByteArrays.getInt(ByteArrays.toByteArray(inet4Address), 0);
                synchronized (compileLock) {
                    pcap_compile = NativeMappings.pcap_compile(this.handle, bpf_programVar, str, bpfCompileMode.getValue(), i10);
                }
                if (pcap_compile < 0) {
                    throw new PcapNativeException("Error occurred in pcap_compile: " + getError(), Integer.valueOf(pcap_compile));
                }
                int pcap_setfilter = NativeMappings.pcap_setfilter(this.handle, bpf_programVar);
                if (pcap_setfilter >= 0) {
                    this.filteringExpression = str;
                    return;
                }
                throw new PcapNativeException("Error occurred in pcap_setfilter: " + getError(), Integer.valueOf(pcap_setfilter));
            } finally {
                NativeMappings.pcap_freecode(bpf_programVar);
            }
        } finally {
            this.handleLock.readLock().unlock();
        }
    }

    public void setFilter(BpfProgram bpfProgram) {
        if (bpfProgram == null) {
            throw new NullPointerException("prog is null.");
        }
        if (!this.open) {
            throw new NotOpenException();
        }
        if (!this.handleLock.readLock().tryLock()) {
            throw new NotOpenException();
        }
        try {
            if (!this.open) {
                throw new NotOpenException();
            }
            int pcap_setfilter = NativeMappings.pcap_setfilter(this.handle, bpfProgram.getProgram());
            if (pcap_setfilter >= 0) {
                this.handleLock.readLock().unlock();
                this.filteringExpression = bpfProgram.getExpression();
            } else {
                throw new PcapNativeException("Failed to set filter: " + getError(), Integer.valueOf(pcap_setfilter));
            }
        } catch (Throwable th2) {
            this.handleLock.readLock().unlock();
            throw th2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("Link type: [");
        sb2.append(this.dlt);
        sb2.append("] handle: [");
        sb2.append(this.handle);
        sb2.append("] Open: [");
        sb2.append(this.open);
        sb2.append("] Filtering Expression: [");
        sb2.append(this.filteringExpression);
        sb2.append("]");
        return sb2.toString();
    }
}
