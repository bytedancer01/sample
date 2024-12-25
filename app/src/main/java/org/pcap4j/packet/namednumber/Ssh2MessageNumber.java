package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/Ssh2MessageNumber.class */
public final class Ssh2MessageNumber extends NamedNumber<Byte, Ssh2MessageNumber> {
    public static final Ssh2MessageNumber SSH_MSG_CHANNEL_CLOSE;
    public static final Ssh2MessageNumber SSH_MSG_CHANNEL_DATA;
    public static final Ssh2MessageNumber SSH_MSG_CHANNEL_EOF;
    public static final Ssh2MessageNumber SSH_MSG_CHANNEL_EXTENDED_DATA;
    public static final Ssh2MessageNumber SSH_MSG_CHANNEL_FAILURE;
    public static final Ssh2MessageNumber SSH_MSG_CHANNEL_OPEN;
    public static final Ssh2MessageNumber SSH_MSG_CHANNEL_OPEN_CONFIRMATION;
    public static final Ssh2MessageNumber SSH_MSG_CHANNEL_OPEN_FAILURE;
    public static final Ssh2MessageNumber SSH_MSG_CHANNEL_REQUEST;
    public static final Ssh2MessageNumber SSH_MSG_CHANNEL_SUCCESS;
    public static final Ssh2MessageNumber SSH_MSG_CHANNEL_WINDOW_ADJUST;
    public static final Ssh2MessageNumber SSH_MSG_DEBUG;
    public static final Ssh2MessageNumber SSH_MSG_DISCONNECT;
    public static final Ssh2MessageNumber SSH_MSG_GLOBAL_REQUEST;
    public static final Ssh2MessageNumber SSH_MSG_IGNORE;
    public static final Ssh2MessageNumber SSH_MSG_KEXDH_INIT;
    public static final Ssh2MessageNumber SSH_MSG_KEXDH_REPLY;
    public static final Ssh2MessageNumber SSH_MSG_KEXINIT;
    public static final Ssh2MessageNumber SSH_MSG_NEWKEYS;
    public static final Ssh2MessageNumber SSH_MSG_REQUEST_FAILURE;
    public static final Ssh2MessageNumber SSH_MSG_REQUEST_SUCCESS;
    public static final Ssh2MessageNumber SSH_MSG_SERVICE_ACCEPT;
    public static final Ssh2MessageNumber SSH_MSG_SERVICE_REQUEST;
    public static final Ssh2MessageNumber SSH_MSG_UNIMPLEMENTED;
    public static final Ssh2MessageNumber SSH_MSG_USERAUTH_BANNER;
    public static final Ssh2MessageNumber SSH_MSG_USERAUTH_FAILURE;
    public static final Ssh2MessageNumber SSH_MSG_USERAUTH_INFO_REQUEST;
    public static final Ssh2MessageNumber SSH_MSG_USERAUTH_INFO_RESPONSE;
    public static final Ssh2MessageNumber SSH_MSG_USERAUTH_REQUEST;
    public static final Ssh2MessageNumber SSH_MSG_USERAUTH_SUCCESS;
    private static final Map<Byte, Ssh2MessageNumber> registry;
    private static final long serialVersionUID = -8900248269268898171L;

    static {
        Ssh2MessageNumber ssh2MessageNumber = new Ssh2MessageNumber((byte) 1, "SSH_MSG_DISCONNECT");
        SSH_MSG_DISCONNECT = ssh2MessageNumber;
        Ssh2MessageNumber ssh2MessageNumber2 = new Ssh2MessageNumber((byte) 2, "SSH_MSG_IGNORE");
        SSH_MSG_IGNORE = ssh2MessageNumber2;
        Ssh2MessageNumber ssh2MessageNumber3 = new Ssh2MessageNumber((byte) 3, "SSH_MSG_UNIMPLEMENTED");
        SSH_MSG_UNIMPLEMENTED = ssh2MessageNumber3;
        Ssh2MessageNumber ssh2MessageNumber4 = new Ssh2MessageNumber((byte) 4, "SSH_MSG_DEBUG");
        SSH_MSG_DEBUG = ssh2MessageNumber4;
        Ssh2MessageNumber ssh2MessageNumber5 = new Ssh2MessageNumber((byte) 5, "SSH_MSG_SERVICE_REQUEST");
        SSH_MSG_SERVICE_REQUEST = ssh2MessageNumber5;
        Ssh2MessageNumber ssh2MessageNumber6 = new Ssh2MessageNumber((byte) 6, "SSH_MSG_SERVICE_ACCEPT");
        SSH_MSG_SERVICE_ACCEPT = ssh2MessageNumber6;
        Ssh2MessageNumber ssh2MessageNumber7 = new Ssh2MessageNumber((byte) 20, "SSH_MSG_KEXINIT");
        SSH_MSG_KEXINIT = ssh2MessageNumber7;
        Ssh2MessageNumber ssh2MessageNumber8 = new Ssh2MessageNumber((byte) 21, "SSH_MSG_NEWKEYS");
        SSH_MSG_NEWKEYS = ssh2MessageNumber8;
        SSH_MSG_KEXDH_INIT = new Ssh2MessageNumber((byte) 30, "SSH_MSG_KEXDH_INIT");
        SSH_MSG_KEXDH_REPLY = new Ssh2MessageNumber((byte) 31, "SSH_MSG_KEXDH_REPLY");
        Ssh2MessageNumber ssh2MessageNumber9 = new Ssh2MessageNumber((byte) 50, "SSH_MSG_USERAUTH_REQUEST");
        SSH_MSG_USERAUTH_REQUEST = ssh2MessageNumber9;
        Ssh2MessageNumber ssh2MessageNumber10 = new Ssh2MessageNumber((byte) 51, "SSH_MSG_USERAUTH_FAILURE");
        SSH_MSG_USERAUTH_FAILURE = ssh2MessageNumber10;
        Ssh2MessageNumber ssh2MessageNumber11 = new Ssh2MessageNumber((byte) 52, "SSH_MSG_USERAUTH_SUCCESS");
        SSH_MSG_USERAUTH_SUCCESS = ssh2MessageNumber11;
        Ssh2MessageNumber ssh2MessageNumber12 = new Ssh2MessageNumber((byte) 53, "SSH_MSG_USERAUTH_BANNER");
        SSH_MSG_USERAUTH_BANNER = ssh2MessageNumber12;
        Ssh2MessageNumber ssh2MessageNumber13 = new Ssh2MessageNumber((byte) 60, "SSH_MSG_USERAUTH_INFO_REQUEST");
        SSH_MSG_USERAUTH_INFO_REQUEST = ssh2MessageNumber13;
        Ssh2MessageNumber ssh2MessageNumber14 = new Ssh2MessageNumber((byte) 61, "SSH_MSG_USERAUTH_INFO_RESPONSE");
        SSH_MSG_USERAUTH_INFO_RESPONSE = ssh2MessageNumber14;
        Ssh2MessageNumber ssh2MessageNumber15 = new Ssh2MessageNumber((byte) 80, "SSH_MSG_GLOBAL_REQUEST");
        SSH_MSG_GLOBAL_REQUEST = ssh2MessageNumber15;
        Ssh2MessageNumber ssh2MessageNumber16 = new Ssh2MessageNumber((byte) 81, "SSH_MSG_REQUEST_SUCCESS");
        SSH_MSG_REQUEST_SUCCESS = ssh2MessageNumber16;
        Ssh2MessageNumber ssh2MessageNumber17 = new Ssh2MessageNumber((byte) 82, "SSH_MSG_REQUEST_FAILURE");
        SSH_MSG_REQUEST_FAILURE = ssh2MessageNumber17;
        Ssh2MessageNumber ssh2MessageNumber18 = new Ssh2MessageNumber((byte) 90, "SSH_MSG_CHANNEL_OPEN");
        SSH_MSG_CHANNEL_OPEN = ssh2MessageNumber18;
        Ssh2MessageNumber ssh2MessageNumber19 = new Ssh2MessageNumber((byte) 91, "SSH_MSG_CHANNEL_OPEN_CONFIRMATION");
        SSH_MSG_CHANNEL_OPEN_CONFIRMATION = ssh2MessageNumber19;
        Ssh2MessageNumber ssh2MessageNumber20 = new Ssh2MessageNumber((byte) 92, "SSH_MSG_CHANNEL_OPEN_FAILURE");
        SSH_MSG_CHANNEL_OPEN_FAILURE = ssh2MessageNumber20;
        Ssh2MessageNumber ssh2MessageNumber21 = new Ssh2MessageNumber((byte) 93, "SSH_MSG_CHANNEL_WINDOW_ADJUST");
        SSH_MSG_CHANNEL_WINDOW_ADJUST = ssh2MessageNumber21;
        Ssh2MessageNumber ssh2MessageNumber22 = new Ssh2MessageNumber((byte) 94, "SSH_MSG_CHANNEL_DATA");
        SSH_MSG_CHANNEL_DATA = ssh2MessageNumber22;
        Ssh2MessageNumber ssh2MessageNumber23 = new Ssh2MessageNumber((byte) 95, "SSH_MSG_CHANNEL_EXTENDED_DATA");
        SSH_MSG_CHANNEL_EXTENDED_DATA = ssh2MessageNumber23;
        Ssh2MessageNumber ssh2MessageNumber24 = new Ssh2MessageNumber((byte) 96, "SSH_MSG_CHANNEL_EOF");
        SSH_MSG_CHANNEL_EOF = ssh2MessageNumber24;
        Ssh2MessageNumber ssh2MessageNumber25 = new Ssh2MessageNumber((byte) 97, "SSH_MSG_CHANNEL_CLOSE");
        SSH_MSG_CHANNEL_CLOSE = ssh2MessageNumber25;
        Ssh2MessageNumber ssh2MessageNumber26 = new Ssh2MessageNumber((byte) 98, "SSH_MSG_CHANNEL_REQUEST");
        SSH_MSG_CHANNEL_REQUEST = ssh2MessageNumber26;
        Ssh2MessageNumber ssh2MessageNumber27 = new Ssh2MessageNumber((byte) 99, "SSH_MSG_CHANNEL_SUCCESS");
        SSH_MSG_CHANNEL_SUCCESS = ssh2MessageNumber27;
        Ssh2MessageNumber ssh2MessageNumber28 = new Ssh2MessageNumber((byte) 100, "SSH_MSG_CHANNEL_FAILURE");
        SSH_MSG_CHANNEL_FAILURE = ssh2MessageNumber28;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(ssh2MessageNumber.value(), ssh2MessageNumber);
        hashMap.put(ssh2MessageNumber2.value(), ssh2MessageNumber2);
        hashMap.put(ssh2MessageNumber3.value(), ssh2MessageNumber3);
        hashMap.put(ssh2MessageNumber4.value(), ssh2MessageNumber4);
        hashMap.put(ssh2MessageNumber5.value(), ssh2MessageNumber5);
        hashMap.put(ssh2MessageNumber6.value(), ssh2MessageNumber6);
        hashMap.put(ssh2MessageNumber7.value(), ssh2MessageNumber7);
        hashMap.put(ssh2MessageNumber8.value(), ssh2MessageNumber8);
        hashMap.put(ssh2MessageNumber9.value(), ssh2MessageNumber9);
        hashMap.put(ssh2MessageNumber10.value(), ssh2MessageNumber10);
        hashMap.put(ssh2MessageNumber11.value(), ssh2MessageNumber11);
        hashMap.put(ssh2MessageNumber12.value(), ssh2MessageNumber12);
        hashMap.put(ssh2MessageNumber13.value(), ssh2MessageNumber13);
        hashMap.put(ssh2MessageNumber14.value(), ssh2MessageNumber14);
        hashMap.put(ssh2MessageNumber15.value(), ssh2MessageNumber15);
        hashMap.put(ssh2MessageNumber16.value(), ssh2MessageNumber16);
        hashMap.put(ssh2MessageNumber17.value(), ssh2MessageNumber17);
        hashMap.put(ssh2MessageNumber18.value(), ssh2MessageNumber18);
        hashMap.put(ssh2MessageNumber19.value(), ssh2MessageNumber19);
        hashMap.put(ssh2MessageNumber20.value(), ssh2MessageNumber20);
        hashMap.put(ssh2MessageNumber21.value(), ssh2MessageNumber21);
        hashMap.put(ssh2MessageNumber22.value(), ssh2MessageNumber22);
        hashMap.put(ssh2MessageNumber23.value(), ssh2MessageNumber23);
        hashMap.put(ssh2MessageNumber24.value(), ssh2MessageNumber24);
        hashMap.put(ssh2MessageNumber25.value(), ssh2MessageNumber25);
        hashMap.put(ssh2MessageNumber26.value(), ssh2MessageNumber26);
        hashMap.put(ssh2MessageNumber27.value(), ssh2MessageNumber27);
        hashMap.put(ssh2MessageNumber28.value(), ssh2MessageNumber28);
    }

    public Ssh2MessageNumber(Byte b10, String str) {
        super(b10, str);
    }

    public static Ssh2MessageNumber getInstance(Byte b10) {
        Map<Byte, Ssh2MessageNumber> map = registry;
        return map.containsKey(b10) ? map.get(b10) : new Ssh2MessageNumber(b10, "unknown");
    }

    public static Ssh2MessageNumber register(Ssh2MessageNumber ssh2MessageNumber) {
        return registry.put(ssh2MessageNumber.value(), ssh2MessageNumber);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(Ssh2MessageNumber ssh2MessageNumber) {
        return value().compareTo(ssh2MessageNumber.value());
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().byteValue() & 255);
    }
}
