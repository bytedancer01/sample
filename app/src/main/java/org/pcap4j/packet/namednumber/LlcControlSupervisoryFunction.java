package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/LlcControlSupervisoryFunction.class */
public final class LlcControlSupervisoryFunction extends NamedNumber<Byte, LlcControlSupervisoryFunction> {
    public static final LlcControlSupervisoryFunction REJ;
    public static final LlcControlSupervisoryFunction RNR;

    /* renamed from: RR */
    public static final LlcControlSupervisoryFunction f36291RR;
    private static final Map<Byte, LlcControlSupervisoryFunction> registry;
    private static final long serialVersionUID = 6818202103839595038L;

    static {
        LlcControlSupervisoryFunction llcControlSupervisoryFunction = new LlcControlSupervisoryFunction((byte) 0, "Receive ready");
        f36291RR = llcControlSupervisoryFunction;
        LlcControlSupervisoryFunction llcControlSupervisoryFunction2 = new LlcControlSupervisoryFunction((byte) 1, "Receive not ready");
        RNR = llcControlSupervisoryFunction2;
        LlcControlSupervisoryFunction llcControlSupervisoryFunction3 = new LlcControlSupervisoryFunction((byte) 2, "Reject");
        REJ = llcControlSupervisoryFunction3;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(llcControlSupervisoryFunction.value(), llcControlSupervisoryFunction);
        hashMap.put(llcControlSupervisoryFunction2.value(), llcControlSupervisoryFunction2);
        hashMap.put(llcControlSupervisoryFunction3.value(), llcControlSupervisoryFunction3);
    }

    public LlcControlSupervisoryFunction(Byte b10, String str) {
        super(b10, str);
        if ((b10.byteValue() & 252) == 0) {
            return;
        }
        throw new IllegalArgumentException(b10 + " is invalid value. It must be between 0 and 3");
    }

    public static LlcControlSupervisoryFunction getInstance(Byte b10) {
        Map<Byte, LlcControlSupervisoryFunction> map = registry;
        return map.containsKey(b10) ? map.get(b10) : new LlcControlSupervisoryFunction(b10, "unknown");
    }

    public static LlcControlSupervisoryFunction register(LlcControlSupervisoryFunction llcControlSupervisoryFunction) {
        return registry.put(llcControlSupervisoryFunction.value(), llcControlSupervisoryFunction);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(LlcControlSupervisoryFunction llcControlSupervisoryFunction) {
        return value().compareTo(llcControlSupervisoryFunction.value());
    }
}
