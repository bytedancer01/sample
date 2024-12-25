package org.pcap4j.core;

import com.sun.jna.AbstractC4271d;
import com.sun.jna.Callback;
import com.sun.jna.Function;
import com.sun.jna.InterfaceC4269b;
import com.sun.jna.Native;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import java.lang.reflect.Method;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p447zg.C10225p;
import p447zg.C10229t;
import p447zg.InterfaceC10214e;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings.class */
final class NativeMappings {
    public static final Pointer ERRNO_P;
    private static final Logger LOG;
    public static final ByteOrder NATIVE_BYTE_ORDER;
    public static final Map<String, Object> NATIVE_LOAD_LIBRARY_OPTIONS;
    public static final Function PCAP_DUMP;
    public static final String PCAP_LIB_NAME;
    public static final int SBIOCSTIME = 16897;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$PcapErrbuf.class */
    public static class PcapErrbuf extends AbstractC4271d {
        public byte[] buf = new byte[PCAP_ERRBUF_SIZE()];

        private static int PCAP_ERRBUF_SIZE() {
            return 256;
        }

        @Override // com.sun.jna.AbstractC4271d
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("buf");
            return arrayList;
        }

        public int length() {
            return toString().length();
        }

        @Override // com.sun.jna.AbstractC4271d
        public String toString() {
            return Native.m21355K(this.buf);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$PcapLibrary.class */
    public interface PcapLibrary extends InterfaceC4269b {
        public static final PcapLibrary INSTANCE = (PcapLibrary) Native.m21346B(NativeMappings.PCAP_LIB_NAME, PcapLibrary.class, NativeMappings.NATIVE_LOAD_LIBRARY_OPTIONS);

        int dos_pcap_stats_ex(Pointer pointer, pcap_stat_ex pcap_stat_exVar);

        Pointer pcap_open_dead_with_tstamp_precision(int i10, int i11, int i12);

        Pointer pcap_open_offline_with_tstamp_precision(String str, int i10, PcapErrbuf pcapErrbuf);

        int pcap_set_immediate_mode(Pointer pointer, int i10);

        int pcap_set_rfmon(Pointer pointer, int i10);

        int pcap_set_tstamp_precision(Pointer pointer, int i10);

        int strioctl(int i10, int i11, int i12, Pointer pointer);

        Pointer win_pcap_stats_ex(Pointer pointer, IntByReference intByReference);
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$bpf_insn.class */
    public static class bpf_insn extends AbstractC4271d {
        public short code;

        /* renamed from: jf */
        public byte f36234jf;

        /* renamed from: jt */
        public byte f36235jt;

        /* renamed from: k */
        public int f36236k;

        /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$bpf_insn$ByReference.class */
        public static class ByReference extends bpf_insn implements AbstractC4271d.e {
        }

        public bpf_insn() {
            setAutoSynch(false);
        }

        @Override // com.sun.jna.AbstractC4271d
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("code");
            arrayList.add("jt");
            arrayList.add("jf");
            arrayList.add("k");
            return arrayList;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$bpf_program.class */
    public static class bpf_program extends AbstractC4271d {
        public bpf_insn.ByReference bf_insns;
        public int bf_len;

        public bpf_program() {
            setAutoSynch(false);
        }

        @Override // com.sun.jna.AbstractC4271d
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("bf_len");
            arrayList.add("bf_insns");
            return arrayList;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$in6_addr.class */
    public static class in6_addr extends AbstractC4271d {
        public byte[] s6_addr = new byte[16];

        @Override // com.sun.jna.AbstractC4271d
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("s6_addr");
            return arrayList;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$in_addr.class */
    public static class in_addr extends AbstractC4271d {
        public int s_addr;

        @Override // com.sun.jna.AbstractC4271d
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("s_addr");
            return arrayList;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$pcap_addr.class */
    public static class pcap_addr extends AbstractC4271d {
        public sockaddr.ByReference addr;
        public sockaddr.ByReference broadaddr;
        public sockaddr.ByReference dstaddr;
        public sockaddr.ByReference netmask;
        public ByReference next;

        /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$pcap_addr$ByReference.class */
        public static class ByReference extends pcap_addr implements AbstractC4271d.e {
        }

        public pcap_addr() {
        }

        public pcap_addr(Pointer pointer) {
            super(pointer);
            read();
        }

        @Override // com.sun.jna.AbstractC4271d
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("next");
            arrayList.add("addr");
            arrayList.add("netmask");
            arrayList.add("broadaddr");
            arrayList.add("dstaddr");
            return arrayList;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$pcap_handler.class */
    public interface pcap_handler extends Callback {
        void got_packet(Pointer pointer, Pointer pointer2, Pointer pointer3);
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$pcap_if.class */
    public static class pcap_if extends AbstractC4271d {
        public pcap_addr.ByReference addresses;
        public String description;
        public int flags;
        public String name;
        public ByReference next;

        /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$pcap_if$ByReference.class */
        public static class ByReference extends pcap_if implements AbstractC4271d.e {
        }

        public pcap_if() {
        }

        public pcap_if(Pointer pointer) {
            super(pointer);
            read();
        }

        @Override // com.sun.jna.AbstractC4271d
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("next");
            arrayList.add("name");
            arrayList.add("description");
            arrayList.add("addresses");
            arrayList.add("flags");
            return arrayList;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$pcap_pkthdr.class */
    public static class pcap_pkthdr extends AbstractC4271d {
        public static final int CAPLEN_OFFSET;
        public static final int LEN_OFFSET;
        public static final int TS_OFFSET;
        public int caplen;
        public int len;

        /* renamed from: ts */
        public timeval f36237ts;

        /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$pcap_pkthdr$ByReference.class */
        public static class ByReference extends pcap_pkthdr implements AbstractC4271d.e {
        }

        static {
            pcap_pkthdr pcap_pkthdrVar = new pcap_pkthdr();
            TS_OFFSET = pcap_pkthdrVar.fieldOffset("ts");
            CAPLEN_OFFSET = pcap_pkthdrVar.fieldOffset("caplen");
            LEN_OFFSET = pcap_pkthdrVar.fieldOffset("len");
        }

        public pcap_pkthdr() {
        }

        public pcap_pkthdr(Pointer pointer) {
            super(pointer);
            read();
        }

        public static int getCaplen(Pointer pointer) {
            return pointer.mo21421g(CAPLEN_OFFSET);
        }

        public static int getLen(Pointer pointer) {
            return pointer.mo21421g(LEN_OFFSET);
        }

        public static NativeLong getTvSec(Pointer pointer) {
            return pointer.m21424j(TS_OFFSET + timeval.TV_SEC_OFFSET);
        }

        public static NativeLong getTvUsec(Pointer pointer) {
            return pointer.m21424j(TS_OFFSET + timeval.TV_USEC_OFFSET);
        }

        @Override // com.sun.jna.AbstractC4271d
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("ts");
            arrayList.add("caplen");
            arrayList.add("len");
            return arrayList;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$pcap_stat.class */
    public static class pcap_stat extends AbstractC4271d {
        public static final int PS_DROP_OFFSET;
        public static final int PS_IFDROP_OFFSET;
        public static final int PS_RECV_OFFSET;
        public int ps_drop;
        public int ps_ifdrop;
        public int ps_recv;

        /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$pcap_stat$ByReference.class */
        public static class ByReference extends pcap_stat implements AbstractC4271d.e {
        }

        static {
            pcap_stat pcap_statVar = new pcap_stat();
            PS_RECV_OFFSET = pcap_statVar.fieldOffset("ps_recv");
            PS_DROP_OFFSET = pcap_statVar.fieldOffset("ps_drop");
            PS_IFDROP_OFFSET = pcap_statVar.fieldOffset("ps_ifdrop");
        }

        public pcap_stat() {
        }

        public pcap_stat(Pointer pointer) {
            super(pointer);
            read();
        }

        public static int getPsDrop(Pointer pointer) {
            return pointer.mo21421g(PS_DROP_OFFSET);
        }

        public static int getPsIfdrop(Pointer pointer) {
            return pointer.mo21421g(PS_IFDROP_OFFSET);
        }

        public static int getPsRecv(Pointer pointer) {
            return pointer.mo21421g(PS_RECV_OFFSET);
        }

        @Override // com.sun.jna.AbstractC4271d
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("ps_recv");
            arrayList.add("ps_drop");
            arrayList.add("ps_ifdrop");
            return arrayList;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$pcap_stat_ex.class */
    public static class pcap_stat_ex extends AbstractC4271d {
        public NativeLong collisions;
        public NativeLong multicast;
        public NativeLong rx_bytes;
        public NativeLong rx_crc_errors;
        public NativeLong rx_dropped;
        public NativeLong rx_errors;
        public NativeLong rx_fifo_errors;
        public NativeLong rx_frame_errors;
        public NativeLong rx_length_errors;
        public NativeLong rx_missed_errors;
        public NativeLong rx_over_errors;
        public NativeLong rx_packets;
        public NativeLong tx_aborted_errors;
        public NativeLong tx_bytes;
        public NativeLong tx_carrier_errors;
        public NativeLong tx_dropped;
        public NativeLong tx_errors;
        public NativeLong tx_fifo_errors;
        public NativeLong tx_heartbeat_errors;
        public NativeLong tx_packets;
        public NativeLong tx_window_errors;

        /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$pcap_stat_ex$ByReference.class */
        public static class ByReference extends pcap_stat_ex implements AbstractC4271d.e {
        }

        @Override // com.sun.jna.AbstractC4271d
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("rx_packets");
            arrayList.add("tx_packets");
            arrayList.add("rx_bytes");
            arrayList.add("tx_bytes");
            arrayList.add("rx_errors");
            arrayList.add("tx_errors");
            arrayList.add("rx_dropped");
            arrayList.add("tx_dropped");
            arrayList.add("multicast");
            arrayList.add("collisions");
            arrayList.add("rx_length_errors");
            arrayList.add("rx_over_errors");
            arrayList.add("rx_crc_errors");
            arrayList.add("rx_frame_errors");
            arrayList.add("rx_fifo_errors");
            arrayList.add("rx_missed_errors");
            arrayList.add("tx_aborted_errors");
            arrayList.add("tx_carrier_errors");
            arrayList.add("tx_fifo_errors");
            arrayList.add("tx_heartbeat_errors");
            arrayList.add("tx_window_errors");
            return arrayList;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$sockaddr.class */
    public static class sockaddr extends AbstractC4271d {
        public byte[] sa_data;
        public short sa_family;

        /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$sockaddr$ByReference.class */
        public static class ByReference extends sockaddr implements AbstractC4271d.e {
        }

        public sockaddr() {
            this.sa_data = new byte[14];
        }

        public sockaddr(Pointer pointer) {
            super(pointer);
            this.sa_data = new byte[14];
            read();
        }

        public static boolean isWindowsType() {
            return (C10229t.m42808n() || C10229t.m42803i() || C10229t.m42810p() || C10229t.m42816v()) ? false : true;
        }

        @Override // com.sun.jna.AbstractC4271d
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("sa_family");
            arrayList.add("sa_data");
            return arrayList;
        }

        public short getSaFamily() {
            if (isWindowsType()) {
                return this.sa_family;
            }
            return (short) ((NativeMappings.NATIVE_BYTE_ORDER.equals(ByteOrder.BIG_ENDIAN) ? this.sa_family : this.sa_family >> 8) & 255);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$sockaddr_dl.class */
    public static class sockaddr_dl extends AbstractC4271d {
        public byte sdl_alen;
        public byte[] sdl_data;
        public byte sdl_family;
        public short sdl_index;
        public byte sdl_len;
        public byte sdl_nlen;
        public byte sdl_slen;
        public byte sdl_type;

        public sockaddr_dl() {
            this.sdl_data = new byte[46];
        }

        public sockaddr_dl(Pointer pointer) {
            super(pointer);
            this.sdl_data = new byte[46];
            read();
        }

        public byte[] getAddress() {
            return getPointer().m21417c((this.sdl_nlen & 255) + 8, this.sdl_alen & 255);
        }

        @Override // com.sun.jna.AbstractC4271d
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("sdl_len");
            arrayList.add("sdl_family");
            arrayList.add("sdl_index");
            arrayList.add("sdl_type");
            arrayList.add("sdl_nlen");
            arrayList.add("sdl_alen");
            arrayList.add("sdl_slen");
            arrayList.add("sdl_data");
            return arrayList;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$sockaddr_in.class */
    public static class sockaddr_in extends AbstractC4271d {
        public in_addr sin_addr;
        public short sin_family;
        public short sin_port;
        public byte[] sin_zero;

        public sockaddr_in() {
            this.sin_zero = new byte[8];
        }

        public sockaddr_in(Pointer pointer) {
            super(pointer);
            this.sin_zero = new byte[8];
            read();
        }

        @Override // com.sun.jna.AbstractC4271d
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("sin_family");
            arrayList.add("sin_port");
            arrayList.add("sin_addr");
            arrayList.add("sin_zero");
            return arrayList;
        }

        public short getSaFamily() {
            if (sockaddr.isWindowsType()) {
                return this.sin_family;
            }
            return (short) ((NativeMappings.NATIVE_BYTE_ORDER.equals(ByteOrder.BIG_ENDIAN) ? this.sin_family : this.sin_family >> 8) & 255);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$sockaddr_in6.class */
    public static class sockaddr_in6 extends AbstractC4271d {
        public in6_addr sin6_addr;
        public short sin6_family;
        public int sin6_flowinfo;
        public short sin6_port;
        public int sin6_scope_id;

        public sockaddr_in6() {
        }

        public sockaddr_in6(Pointer pointer) {
            super(pointer);
            read();
        }

        @Override // com.sun.jna.AbstractC4271d
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("sin6_family");
            arrayList.add("sin6_port");
            arrayList.add("sin6_flowinfo");
            arrayList.add("sin6_addr");
            arrayList.add("sin6_scope_id");
            return arrayList;
        }

        public short getSaFamily() {
            if (sockaddr.isWindowsType()) {
                return this.sin6_family;
            }
            return (short) ((NativeMappings.NATIVE_BYTE_ORDER.equals(ByteOrder.BIG_ENDIAN) ? this.sin6_family : this.sin6_family >> 8) & 255);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$sockaddr_ll.class */
    public static class sockaddr_ll extends AbstractC4271d {
        public byte[] sll_addr;
        public short sll_family;
        public byte sll_halen;
        public short sll_hatype;
        public int sll_ifindex;
        public byte sll_pkttype;
        public short sll_protocol;

        public sockaddr_ll() {
            this.sll_addr = new byte[8];
        }

        public sockaddr_ll(Pointer pointer) {
            super(pointer);
            this.sll_addr = new byte[8];
            read();
        }

        @Override // com.sun.jna.AbstractC4271d
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("sll_family");
            arrayList.add("sll_protocol");
            arrayList.add("sll_ifindex");
            arrayList.add("sll_hatype");
            arrayList.add("sll_pkttype");
            arrayList.add("sll_halen");
            arrayList.add("sll_addr");
            return arrayList;
        }

        public short getSaFamily() {
            if (sockaddr.isWindowsType()) {
                return this.sll_family;
            }
            return (short) ((NativeMappings.NATIVE_BYTE_ORDER.equals(ByteOrder.BIG_ENDIAN) ? this.sll_family : this.sll_family >> 8) & 255);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$timeval.class */
    public static class timeval extends AbstractC4271d {
        public static final int TV_SEC_OFFSET;
        public static final int TV_USEC_OFFSET;
        public NativeLong tv_sec;
        public NativeLong tv_usec;

        static {
            timeval timevalVar = new timeval();
            TV_SEC_OFFSET = timevalVar.fieldOffset("tv_sec");
            TV_USEC_OFFSET = timevalVar.fieldOffset("tv_usec");
        }

        @Override // com.sun.jna.AbstractC4271d
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("tv_sec");
            arrayList.add("tv_usec");
            return arrayList;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$win_pcap_stat.class */
    public static class win_pcap_stat extends pcap_stat {
        public static final int BS_CAPT_OFFSET = new win_pcap_stat().fieldOffset("bs_capt");
        public int bs_capt;

        /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativeMappings$win_pcap_stat$ByReference.class */
        public static class ByReference extends win_pcap_stat implements AbstractC4271d.e {
        }

        public win_pcap_stat() {
        }

        public win_pcap_stat(Pointer pointer) {
            super(pointer);
            read();
        }

        public static int getBsCapt(Pointer pointer) {
            return pointer.mo21421g(BS_CAPT_OFFSET);
        }

        @Override // org.pcap4j.core.NativeMappings.pcap_stat, com.sun.jna.AbstractC4271d
        public List<String> getFieldOrder() {
            List<String> fieldOrder = super.getFieldOrder();
            fieldOrder.add("bs_capt");
            return fieldOrder;
        }
    }

    static {
        Logger logger = LoggerFactory.getLogger((Class<?>) NativeMappings.class);
        LOG = logger;
        String property = System.getProperty(NativeMappings.class.getPackage().getName() + ".pcapLibName", C10229t.m42815u() ? "wpcap" : "pcap");
        PCAP_LIB_NAME = property;
        PCAP_DUMP = Function.m21332g0(property, "pcap_dump");
        HashMap hashMap = new HashMap();
        NATIVE_LOAD_LIBRARY_OPTIONS = hashMap;
        NATIVE_BYTE_ORDER = ByteOrder.nativeOrder();
        ERRNO_P = C10229t.m42814t() ? C10225p.m42771m(property).m42787l("errno") : null;
        Native.m21352H(NativeMappings.class, C10225p.m42771m(property));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("pcap_set_rfmon", "pcap_set_rfmon");
        hashMap2.put("strioctl", "strioctl");
        hashMap2.put("dos_pcap_stats_ex", "pcap_stats_ex");
        hashMap2.put("win_pcap_stats_ex", "pcap_stats_ex");
        hashMap2.put("pcap_open_offline_with_tstamp_precision", "pcap_open_offline_with_tstamp_precision");
        hashMap2.put("pcap_open_dead_with_tstamp_precision", "pcap_open_dead_with_tstamp_precision");
        hashMap2.put("pcap_set_tstamp_precision", "pcap_set_tstamp_precision");
        hashMap2.put("pcap_set_immediate_mode", "pcap_set_immediate_mode");
        hashMap.put("function-mapper", new InterfaceC10214e(hashMap2) { // from class: org.pcap4j.core.NativeMappings.1
            public final Map val$funcMap;

            {
                this.val$funcMap = hashMap2;
            }

            @Override // p447zg.InterfaceC10214e
            public String getFunctionName(C10225p c10225p, Method method) {
                return (String) this.val$funcMap.get(method.getName());
            }
        });
        logger.info("Pcap4J successfully loaded a native pcap library: {}", pcap_lib_version());
    }

    public static native int bpf_filter(bpf_insn.ByReference byReference, byte[] bArr, int i10, int i11);

    public static int getFdFromPcapT(Pointer pointer) {
        if (C10229t.m42815u()) {
            return -1;
        }
        return pointer.mo21421g(0L);
    }

    public static native int pcap_activate(Pointer pointer);

    public static native void pcap_breakloop(Pointer pointer);

    public static native void pcap_close(Pointer pointer);

    public static native int pcap_compile(Pointer pointer, bpf_program bpf_programVar, String str, int i10, int i11);

    public static native int pcap_compile_nopcap(int i10, int i11, bpf_program bpf_programVar, String str, int i12, int i13);

    public static native Pointer pcap_create(String str, PcapErrbuf pcapErrbuf);

    public static native int pcap_datalink(Pointer pointer);

    public static native int pcap_datalink_name_to_val(String str);

    public static native String pcap_datalink_val_to_description(int i10);

    public static native String pcap_datalink_val_to_name(int i10);

    public static native int pcap_dispatch(Pointer pointer, int i10, pcap_handler pcap_handlerVar, Pointer pointer2);

    public static native void pcap_dump(Pointer pointer, pcap_pkthdr pcap_pkthdrVar, byte[] bArr);

    public static native void pcap_dump_close(Pointer pointer);

    public static native int pcap_dump_flush(Pointer pointer);

    public static native NativeLong pcap_dump_ftell(Pointer pointer);

    public static native Pointer pcap_dump_open(Pointer pointer, String str);

    public static native int pcap_findalldevs(PointerByReference pointerByReference, PcapErrbuf pcapErrbuf);

    public static native void pcap_free_datalinks(Pointer pointer);

    public static native void pcap_freealldevs(Pointer pointer);

    public static native void pcap_freecode(bpf_program bpf_programVar);

    public static native Pointer pcap_geterr(Pointer pointer);

    public static native int pcap_getnonblock(Pointer pointer, PcapErrbuf pcapErrbuf);

    public static native int pcap_is_swapped(Pointer pointer);

    public static native String pcap_lib_version();

    public static native int pcap_list_datalinks(Pointer pointer, PointerByReference pointerByReference);

    public static native Pointer pcap_lookupdev(PcapErrbuf pcapErrbuf);

    public static native int pcap_lookupnet(String str, IntByReference intByReference, IntByReference intByReference2, PcapErrbuf pcapErrbuf);

    public static native int pcap_loop(Pointer pointer, int i10, Function function, Pointer pointer2);

    public static native int pcap_loop(Pointer pointer, int i10, pcap_handler pcap_handlerVar, Pointer pointer2);

    public static native int pcap_major_version(Pointer pointer);

    public static native int pcap_minor_version(Pointer pointer);

    public static native Pointer pcap_next(Pointer pointer, pcap_pkthdr pcap_pkthdrVar);

    public static native int pcap_next_ex(Pointer pointer, PointerByReference pointerByReference, PointerByReference pointerByReference2);

    public static native Pointer pcap_open_dead(int i10, int i11);

    public static native Pointer pcap_open_live(String str, int i10, int i11, int i12, PcapErrbuf pcapErrbuf);

    public static native Pointer pcap_open_offline(String str, PcapErrbuf pcapErrbuf);

    public static native int pcap_sendpacket(Pointer pointer, byte[] bArr, int i10);

    public static native int pcap_set_buffer_size(Pointer pointer, int i10);

    public static native int pcap_set_datalink(Pointer pointer, int i10);

    public static native int pcap_set_promisc(Pointer pointer, int i10);

    public static native int pcap_set_snaplen(Pointer pointer, int i10);

    public static native int pcap_set_timeout(Pointer pointer, int i10);

    public static native int pcap_setdirection(Pointer pointer, int i10);

    public static native int pcap_setfilter(Pointer pointer, bpf_program bpf_programVar);

    public static native int pcap_setnonblock(Pointer pointer, int i10, PcapErrbuf pcapErrbuf);

    public static native int pcap_snapshot(Pointer pointer);

    public static native int pcap_stats(Pointer pointer, pcap_stat pcap_statVar);

    public static native Pointer pcap_strerror(int i10);
}
