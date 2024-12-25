package org.pcap4j.core;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.core.BpfProgram;
import org.pcap4j.core.NativeMappings;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.packet.namednumber.DataLinkType;
import org.pcap4j.util.ByteArrays;
import org.pcap4j.util.Inet4NetworkAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.MessageFormatter;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/core/Pcaps.class */
public final class Pcaps {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) Pcaps.class);
    private static final Object lock = new Object();

    private Pcaps() {
        throw new AssertionError();
    }

    public static BpfProgram compileFilter(int i10, DataLinkType dataLinkType, String str, BpfProgram.BpfCompileMode bpfCompileMode, Inet4Address inet4Address) {
        if (dataLinkType != null && str != null && bpfCompileMode != null && inet4Address != null) {
            NativeMappings.bpf_program bpf_programVar = new NativeMappings.bpf_program();
            int pcap_compile_nopcap = NativeMappings.pcap_compile_nopcap(i10, dataLinkType.value().intValue(), bpf_programVar, str, bpfCompileMode.getValue(), ByteArrays.getInt(ByteArrays.toByteArray(inet4Address), 0));
            if (pcap_compile_nopcap >= 0) {
                return new BpfProgram(bpf_programVar, str);
            }
            throw new PcapNativeException("Failed to compile the BPF expression: " + str, Integer.valueOf(pcap_compile_nopcap));
        }
        throw new NullPointerException("dlt: " + dataLinkType + " bpfExpression: " + str + " mode: " + bpfCompileMode + " netmask: " + inet4Address);
    }

    public static DataLinkType dataLinkNameToVal(String str) {
        if (str == null) {
            throw new NullPointerException("name: " + str);
        }
        int pcap_datalink_name_to_val = NativeMappings.pcap_datalink_name_to_val(str);
        if (pcap_datalink_name_to_val >= 0) {
            return DataLinkType.getInstance(Integer.valueOf(pcap_datalink_name_to_val));
        }
        throw new PcapNativeException("Failed to convert the data link name to the value: " + str, Integer.valueOf(pcap_datalink_name_to_val));
    }

    public static String dataLinkTypeToDescription(DataLinkType dataLinkType) {
        if (dataLinkType != null) {
            return dataLinkValToDescription(dataLinkType.value().intValue());
        }
        throw new NullPointerException("dlt: " + dataLinkType);
    }

    public static String dataLinkTypeToName(DataLinkType dataLinkType) {
        if (dataLinkType != null) {
            return dataLinkValToName(dataLinkType.value().intValue());
        }
        throw new NullPointerException("dlt: " + dataLinkType);
    }

    public static String dataLinkValToDescription(int i10) {
        String pcap_datalink_val_to_description = NativeMappings.pcap_datalink_val_to_description(i10);
        if (pcap_datalink_val_to_description != null) {
            return pcap_datalink_val_to_description;
        }
        throw new PcapNativeException("Failed to convert the data link value to the description: " + i10);
    }

    public static String dataLinkValToName(int i10) {
        String pcap_datalink_val_to_name = NativeMappings.pcap_datalink_val_to_name(i10);
        if (pcap_datalink_val_to_name != null) {
            return pcap_datalink_val_to_name;
        }
        throw new PcapNativeException("Failed to convert the data link value to the name: " + i10);
    }

    public static List<PcapNetworkInterface> findAllDevs() {
        PointerByReference pointerByReference = new PointerByReference();
        NativeMappings.PcapErrbuf pcapErrbuf = new NativeMappings.PcapErrbuf();
        ArrayList arrayList = new ArrayList();
        synchronized (lock) {
            int pcap_findalldevs = NativeMappings.pcap_findalldevs(pointerByReference, pcapErrbuf);
            if (pcap_findalldevs != 0) {
                StringBuilder sb2 = new StringBuilder(50);
                sb2.append("Return code: ");
                sb2.append(pcap_findalldevs);
                sb2.append(", Message: ");
                sb2.append(pcapErrbuf);
                throw new PcapNativeException(sb2.toString(), Integer.valueOf(pcap_findalldevs));
            }
            if (pcapErrbuf.length() != 0) {
                logger.warn(MessageFormatter.DELIM_STR, pcapErrbuf);
            }
            Pointer m21495f = pointerByReference.m21495f();
            if (m21495f == null) {
                logger.info("No NIF was found.");
                return Collections.emptyList();
            }
            NativeMappings.pcap_if pcap_ifVar = new NativeMappings.pcap_if(m21495f);
            for (NativeMappings.pcap_if pcap_ifVar2 = pcap_ifVar; pcap_ifVar2 != null; pcap_ifVar2 = pcap_ifVar2.next) {
                arrayList.add(PcapNetworkInterface.newInstance(pcap_ifVar2, true));
            }
            NativeMappings.pcap_freealldevs(pcap_ifVar.getPointer());
            logger.info("{} NIF(s) found.", Integer.valueOf(arrayList.size()));
            return arrayList;
        }
    }

    public static PcapNetworkInterface getDevByAddress(InetAddress inetAddress) {
        if (inetAddress == null) {
            throw new NullPointerException("addr: " + inetAddress);
        }
        for (PcapNetworkInterface pcapNetworkInterface : findAllDevs()) {
            Iterator<PcapAddress> it = pcapNetworkInterface.getAddresses().iterator();
            while (it.hasNext()) {
                if (it.next().getAddress().equals(inetAddress)) {
                    return pcapNetworkInterface;
                }
            }
        }
        return null;
    }

    public static PcapNetworkInterface getDevByName(String str) {
        if (str == null) {
            throw new NullPointerException("name: " + str);
        }
        for (PcapNetworkInterface pcapNetworkInterface : findAllDevs()) {
            if (pcapNetworkInterface.getName().equals(str)) {
                return pcapNetworkInterface;
            }
        }
        return null;
    }

    public static String libVersion() {
        return NativeMappings.pcap_lib_version();
    }

    public static String lookupDev() {
        NativeMappings.PcapErrbuf pcapErrbuf = new NativeMappings.PcapErrbuf();
        Pointer pcap_lookupdev = NativeMappings.pcap_lookupdev(pcapErrbuf);
        if (pcap_lookupdev == null || pcapErrbuf.length() != 0) {
            throw new PcapNativeException(pcapErrbuf.toString());
        }
        return pcap_lookupdev.mo21434t(0L);
    }

    public static Inet4NetworkAddress lookupNet(String str) {
        if (str == null) {
            throw new NullPointerException("devName: " + str);
        }
        NativeMappings.PcapErrbuf pcapErrbuf = new NativeMappings.PcapErrbuf();
        IntByReference intByReference = new IntByReference();
        IntByReference intByReference2 = new IntByReference();
        int pcap_lookupnet = NativeMappings.pcap_lookupnet(str, intByReference, intByReference2, pcapErrbuf);
        if (pcap_lookupnet < 0) {
            throw new PcapNativeException(pcapErrbuf.toString(), Integer.valueOf(pcap_lookupnet));
        }
        return new Inet4NetworkAddress(Inets.itoInetAddress(intByReference.m21493f()), Inets.itoInetAddress(intByReference2.m21493f()));
    }

    public static PcapHandle openDead(DataLinkType dataLinkType, int i10) {
        if (dataLinkType == null) {
            throw new NullPointerException("dlt: " + dataLinkType);
        }
        Pointer pcap_open_dead = NativeMappings.pcap_open_dead(dataLinkType.value().intValue(), i10);
        if (pcap_open_dead != null) {
            return new PcapHandle(pcap_open_dead, PcapHandle.TimestampPrecision.MICRO);
        }
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append("Failed to open a PcapHandle. dlt: ");
        sb2.append(dataLinkType);
        sb2.append(" snaplen: ");
        sb2.append(i10);
        throw new PcapNativeException(sb2.toString());
    }

    public static PcapHandle openDead(DataLinkType dataLinkType, int i10, PcapHandle.TimestampPrecision timestampPrecision) {
        if (dataLinkType == null || timestampPrecision == null) {
            throw new NullPointerException("dlt: " + dataLinkType + " precision: " + timestampPrecision);
        }
        try {
            Pointer pcap_open_dead_with_tstamp_precision = NativeMappings.PcapLibrary.INSTANCE.pcap_open_dead_with_tstamp_precision(dataLinkType.value().intValue(), i10, timestampPrecision.getValue());
            if (pcap_open_dead_with_tstamp_precision != null) {
                return new PcapHandle(pcap_open_dead_with_tstamp_precision, timestampPrecision);
            }
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Failed to open a PcapHandle. dlt: ");
            sb2.append(dataLinkType);
            sb2.append(" snaplen: ");
            sb2.append(i10);
            sb2.append(" precision: ");
            sb2.append(timestampPrecision);
            throw new PcapNativeException(sb2.toString());
        } catch (UnsatisfiedLinkError e10) {
            throw new PcapNativeException("pcap_open_dead_with_tstamp_precision is not supported by the pcap library installed in this environment.");
        }
    }

    public static PcapHandle openOffline(String str) {
        if (str == null) {
            throw new NullPointerException("filePath: " + str);
        }
        NativeMappings.PcapErrbuf pcapErrbuf = new NativeMappings.PcapErrbuf();
        Pointer pcap_open_offline = NativeMappings.pcap_open_offline(str, pcapErrbuf);
        if (pcap_open_offline == null || pcapErrbuf.length() != 0) {
            throw new PcapNativeException(pcapErrbuf.toString());
        }
        return new PcapHandle(pcap_open_offline, PcapHandle.TimestampPrecision.MICRO);
    }

    public static PcapHandle openOffline(String str, PcapHandle.TimestampPrecision timestampPrecision) {
        if (str == null || timestampPrecision == null) {
            throw new NullPointerException("filePath: " + str + " precision: " + timestampPrecision);
        }
        NativeMappings.PcapErrbuf pcapErrbuf = new NativeMappings.PcapErrbuf();
        try {
            Pointer pcap_open_offline_with_tstamp_precision = NativeMappings.PcapLibrary.INSTANCE.pcap_open_offline_with_tstamp_precision(str, timestampPrecision.getValue(), pcapErrbuf);
            if (pcap_open_offline_with_tstamp_precision == null || pcapErrbuf.length() != 0) {
                throw new PcapNativeException(pcapErrbuf.toString());
            }
            return new PcapHandle(pcap_open_offline_with_tstamp_precision, timestampPrecision);
        } catch (UnsatisfiedLinkError e10) {
            throw new PcapNativeException("pcap_open_offline_with_tstamp_precision is not supported by the pcap library installed in this environment.");
        }
    }

    public static String strError(int i10) {
        return NativeMappings.pcap_strerror(i10).m21429o(0L);
    }

    public static String toBpfString(InetAddress inetAddress) {
        if (inetAddress != null) {
            String inetAddress2 = inetAddress.toString();
            return inetAddress2.substring(inetAddress2.lastIndexOf("/") + 1);
        }
        throw new NullPointerException("inetAddr: " + inetAddress);
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static java.lang.String toBpfString(
    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        */
}
