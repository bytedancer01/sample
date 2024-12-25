package org.pcap4j.util;

import java.util.regex.Matcher;
import org.pcap4j.packet.namednumber.Oui;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/util/MacAddress.class */
public final class MacAddress extends LinkLayerAddress {
    public static final MacAddress ETHER_BROADCAST_ADDRESS = getByAddress(new byte[]{-1, -1, -1, -1, -1, -1});
    public static final int SIZE_IN_BYTES = 6;
    private static final long serialVersionUID = -8222662646993989547L;

    private MacAddress(byte[] bArr) {
        super(bArr);
    }

    public static MacAddress getByAddress(byte[] bArr) {
        if (bArr.length == 6) {
            return new MacAddress(ByteArrays.clone(bArr));
        }
        throw new IllegalArgumentException(ByteArrays.toHexString(bArr, ":") + " is invalid for address. The length must be 6");
    }

    public static MacAddress getByName(String str) {
        Matcher matcher = LinkLayerAddress.HEX_SEPARATOR_PATTERN.matcher(str);
        matcher.find();
        return getByName(str, matcher.group(1));
    }

    public static MacAddress getByName(String str, String str2) {
        return getByAddress(ByteArrays.parseByteArray(str, str2));
    }

    public Oui getOui() {
        return Oui.getInstance(Integer.valueOf(ByteArrays.getInt(getAddress(), 0) >>> 8));
    }

    public boolean isGloballyUnique() {
        boolean z10 = false;
        if ((getAddress()[0] & 2) == 0) {
            z10 = true;
        }
        return z10;
    }

    public boolean isUnicast() {
        boolean z10 = false;
        if ((getAddress()[0] & 1) == 0) {
            z10 = true;
        }
        return z10;
    }
}
