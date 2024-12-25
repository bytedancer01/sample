package org.pcap4j.util;

import java.io.Serializable;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/util/LinkLayerAddress.class */
public class LinkLayerAddress implements Serializable {
    public static final Pattern HEX_SEPARATOR_PATTERN = Pattern.compile("([^0-9a-fA-F])");
    private static final long serialVersionUID = -2832879271594305200L;
    private final byte[] address;

    public LinkLayerAddress(byte[] bArr) {
        this.address = bArr;
    }

    public static LinkLayerAddress getByAddress(byte[] bArr) {
        return new LinkLayerAddress(ByteArrays.clone(bArr));
    }

    public static LinkLayerAddress getByName(String str) {
        Matcher matcher = HEX_SEPARATOR_PATTERN.matcher(str);
        matcher.find();
        return getByName(str, matcher.group(1));
    }

    public static LinkLayerAddress getByName(String str, String str2) {
        return getByAddress(ByteArrays.parseByteArray(str, str2));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LinkLayerAddress) {
            return Arrays.equals(((LinkLayerAddress) obj).getAddress(), this.address);
        }
        return false;
    }

    public byte[] getAddress() {
        return ByteArrays.clone(this.address);
    }

    public int hashCode() {
        return Arrays.hashCode(this.address);
    }

    public int length() {
        return this.address.length;
    }

    public String toString() {
        return ByteArrays.toHexString(this.address, ":");
    }
}
