package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/GtpV1ExtensionHeaderType.class */
public final class GtpV1ExtensionHeaderType extends NamedNumber<Byte, GtpV1ExtensionHeaderType> {
    public static final GtpV1ExtensionHeaderType MBMS_SUPPORT_INDICATION;
    public static final GtpV1ExtensionHeaderType MS_INFO_CHANGE_REPORTING_SUPPORT_INDICATION;
    public static final GtpV1ExtensionHeaderType NO_MORE_EXTENSION_HEADERS;
    public static final GtpV1ExtensionHeaderType PDCP_PDU_NUMBER;
    public static final GtpV1ExtensionHeaderType SUSPEND_REQUEST;
    public static final GtpV1ExtensionHeaderType SUSPEND_RESPONSE;
    private static final Map<Byte, GtpV1ExtensionHeaderType> registry;
    private static final long serialVersionUID = -4403955365412522031L;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/GtpV1ExtensionHeaderType$ComprehensionRequirement.class */
    public enum ComprehensionRequirement {
        NOT_REQUIRED_SHALL_FORWARD,
        NOT_REQUIRED_SHALL_DISCARD,
        REQUIRED_BY_ENDPOINT,
        REQUIRED_BY_RECIPIENT
    }

    static {
        GtpV1ExtensionHeaderType gtpV1ExtensionHeaderType = new GtpV1ExtensionHeaderType((byte) 0, "No more extension headers");
        NO_MORE_EXTENSION_HEADERS = gtpV1ExtensionHeaderType;
        GtpV1ExtensionHeaderType gtpV1ExtensionHeaderType2 = new GtpV1ExtensionHeaderType((byte) 1, "MBMS support indication");
        MBMS_SUPPORT_INDICATION = gtpV1ExtensionHeaderType2;
        GtpV1ExtensionHeaderType gtpV1ExtensionHeaderType3 = new GtpV1ExtensionHeaderType((byte) 2, "MS Info Change Reporting support indication");
        MS_INFO_CHANGE_REPORTING_SUPPORT_INDICATION = gtpV1ExtensionHeaderType3;
        GtpV1ExtensionHeaderType gtpV1ExtensionHeaderType4 = new GtpV1ExtensionHeaderType((byte) -64, "PDCP PDU number");
        PDCP_PDU_NUMBER = gtpV1ExtensionHeaderType4;
        GtpV1ExtensionHeaderType gtpV1ExtensionHeaderType5 = new GtpV1ExtensionHeaderType((byte) -63, "Suspend Request");
        SUSPEND_REQUEST = gtpV1ExtensionHeaderType5;
        GtpV1ExtensionHeaderType gtpV1ExtensionHeaderType6 = new GtpV1ExtensionHeaderType((byte) -62, "Suspend Response");
        SUSPEND_RESPONSE = gtpV1ExtensionHeaderType6;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(gtpV1ExtensionHeaderType.value(), gtpV1ExtensionHeaderType);
        hashMap.put(gtpV1ExtensionHeaderType2.value(), gtpV1ExtensionHeaderType2);
        hashMap.put(gtpV1ExtensionHeaderType3.value(), gtpV1ExtensionHeaderType3);
        hashMap.put(gtpV1ExtensionHeaderType4.value(), gtpV1ExtensionHeaderType4);
        hashMap.put(gtpV1ExtensionHeaderType5.value(), gtpV1ExtensionHeaderType5);
        hashMap.put(gtpV1ExtensionHeaderType6.value(), gtpV1ExtensionHeaderType6);
    }

    public GtpV1ExtensionHeaderType(Byte b10, String str) {
        super(b10, str);
    }

    public static GtpV1ExtensionHeaderType getInstance(Byte b10) {
        Map<Byte, GtpV1ExtensionHeaderType> map = registry;
        return map.containsKey(b10) ? map.get(b10) : new GtpV1ExtensionHeaderType(b10, "unknown");
    }

    public static GtpV1ExtensionHeaderType register(GtpV1ExtensionHeaderType gtpV1ExtensionHeaderType) {
        return registry.put(gtpV1ExtensionHeaderType.value(), gtpV1ExtensionHeaderType);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(GtpV1ExtensionHeaderType gtpV1ExtensionHeaderType) {
        return value().compareTo(gtpV1ExtensionHeaderType.value());
    }

    public ComprehensionRequirement getComprehensionRequirement() {
        return ComprehensionRequirement.values()[(value().byteValue() >> 6) & 3];
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return "0x" + ByteArrays.toHexString(value().byteValue(), "");
    }
}
