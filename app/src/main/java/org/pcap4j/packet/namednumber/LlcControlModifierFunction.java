package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/LlcControlModifierFunction.class */
public final class LlcControlModifierFunction extends NamedNumber<Byte, LlcControlModifierFunction> {
    public static final LlcControlModifierFunction AC0;
    public static final LlcControlModifierFunction AC1;
    public static final LlcControlModifierFunction DISC;

    /* renamed from: DM */
    public static final LlcControlModifierFunction f36288DM;
    public static final LlcControlModifierFunction FRMR;
    public static final LlcControlModifierFunction SABME;
    public static final LlcControlModifierFunction TEST;

    /* renamed from: UA */
    public static final LlcControlModifierFunction f36289UA;

    /* renamed from: UI */
    public static final LlcControlModifierFunction f36290UI;
    public static final LlcControlModifierFunction XID;
    private static final Map<Byte, LlcControlModifierFunction> registry;
    private static final long serialVersionUID = 468392162004904375L;

    static {
        LlcControlModifierFunction llcControlModifierFunction = new LlcControlModifierFunction((byte) 0, "UI");
        f36290UI = llcControlModifierFunction;
        LlcControlModifierFunction llcControlModifierFunction2 = new LlcControlModifierFunction((byte) 3, "DM");
        f36288DM = llcControlModifierFunction2;
        LlcControlModifierFunction llcControlModifierFunction3 = new LlcControlModifierFunction((byte) 16, "DISC");
        DISC = llcControlModifierFunction3;
        LlcControlModifierFunction llcControlModifierFunction4 = new LlcControlModifierFunction((byte) 24, "UA");
        f36289UA = llcControlModifierFunction4;
        LlcControlModifierFunction llcControlModifierFunction5 = new LlcControlModifierFunction((byte) 25, "AC0");
        AC0 = llcControlModifierFunction5;
        LlcControlModifierFunction llcControlModifierFunction6 = new LlcControlModifierFunction((byte) 27, "SABME");
        SABME = llcControlModifierFunction6;
        LlcControlModifierFunction llcControlModifierFunction7 = new LlcControlModifierFunction((byte) 33, "FRMR");
        FRMR = llcControlModifierFunction7;
        LlcControlModifierFunction llcControlModifierFunction8 = new LlcControlModifierFunction((byte) 43, "XID");
        XID = llcControlModifierFunction8;
        LlcControlModifierFunction llcControlModifierFunction9 = new LlcControlModifierFunction((byte) 56, "TEST");
        TEST = llcControlModifierFunction9;
        LlcControlModifierFunction llcControlModifierFunction10 = new LlcControlModifierFunction((byte) 57, "AC1");
        AC1 = llcControlModifierFunction10;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(llcControlModifierFunction.value(), llcControlModifierFunction);
        hashMap.put(llcControlModifierFunction2.value(), llcControlModifierFunction2);
        hashMap.put(llcControlModifierFunction3.value(), llcControlModifierFunction3);
        hashMap.put(llcControlModifierFunction4.value(), llcControlModifierFunction4);
        hashMap.put(llcControlModifierFunction5.value(), llcControlModifierFunction5);
        hashMap.put(llcControlModifierFunction6.value(), llcControlModifierFunction6);
        hashMap.put(llcControlModifierFunction7.value(), llcControlModifierFunction7);
        hashMap.put(llcControlModifierFunction8.value(), llcControlModifierFunction8);
        hashMap.put(llcControlModifierFunction9.value(), llcControlModifierFunction9);
        hashMap.put(llcControlModifierFunction10.value(), llcControlModifierFunction10);
    }

    public LlcControlModifierFunction(Byte b10, String str) {
        super(b10, str);
        if (b10.byteValue() < 0 || b10.byteValue() > 59 || (b10.byteValue() & 4) != 0) {
            throw new IllegalArgumentException("value must be (value >= 0 || value <= 55 || (value & 0x04) == 0). value: " + b10);
        }
    }

    public static LlcControlModifierFunction getInstance(Byte b10) {
        Map<Byte, LlcControlModifierFunction> map = registry;
        return map.containsKey(b10) ? map.get(b10) : new LlcControlModifierFunction(b10, "unknown");
    }

    public static LlcControlModifierFunction register(LlcControlModifierFunction llcControlModifierFunction) {
        return registry.put(llcControlModifierFunction.value(), llcControlModifierFunction);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(LlcControlModifierFunction llcControlModifierFunction) {
        return value().compareTo(llcControlModifierFunction.value());
    }
}
