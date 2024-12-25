package org.pcap4j.core;

import com.sun.jna.AbstractC4271d;
import com.sun.jna.Native;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import java.util.ArrayList;
import java.util.List;
import p447zg.C10225p;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativePacketDllMappings.class */
final class NativePacketDllMappings {
    public static final String LIB_NAME;
    public static final int PACKET_OID_DATA_SIZE;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativePacketDllMappings$PACKET_OID_DATA.class */
    public static class PACKET_OID_DATA extends AbstractC4271d {
        public byte[] Data;
        public NativeLong Length;
        public NativeLong Oid;

        /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/NativePacketDllMappings$PACKET_OID_DATA$ByReference.class */
        public static class ByReference extends PACKET_OID_DATA implements AbstractC4271d.e {
        }

        public PACKET_OID_DATA() {
            this.Data = new byte[6];
        }

        public PACKET_OID_DATA(Pointer pointer) {
            super(pointer);
            this.Data = new byte[6];
            read();
        }

        @Override // com.sun.jna.AbstractC4271d
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("Oid");
            arrayList.add("Length");
            arrayList.add("Data");
            return arrayList;
        }
    }

    static {
        String property = System.getProperty(NativePacketDllMappings.class.getPackage().getName() + ".packetLibName", "Packet");
        LIB_NAME = property;
        Native.m21352H(NativePacketDllMappings.class, C10225p.m42771m(property));
        PACKET_OID_DATA_SIZE = new PACKET_OID_DATA().size();
    }

    private NativePacketDllMappings() {
    }

    public static native void PacketCloseAdapter(Pointer pointer);

    public static native Pointer PacketOpenAdapter(String str);

    public static native int PacketRequest(Pointer pointer, int i10, PACKET_OID_DATA packet_oid_data);
}
