package org.minidns.constants;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.apache.http.HttpStatus;

/* loaded from: combined.jar:classes3.jar:org/minidns/constants/DnsRootServer.class */
public class DnsRootServer {
    private static final Map<Character, Inet4Address> IPV4_ROOT_SERVER_MAP = new HashMap();
    private static final Map<Character, Inet6Address> IPV6_ROOT_SERVER_MAP = new HashMap();
    public static final Inet4Address[] IPV4_ROOT_SERVERS = {rootServerInet4Address('a', 198, 41, 0, 4), rootServerInet4Address('b', 192, 228, 79, 201), rootServerInet4Address('c', 192, 33, 4, 12), rootServerInet4Address('d', NNTPReply.DEBUG_OUTPUT, 7, 91, 13), rootServerInet4Address('e', 192, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 230, 10), rootServerInet4Address('f', 192, 5, 5, TelnetCommand.NOP), rootServerInet4Address('g', 192, 112, 36, 4), rootServerInet4Address('h', 198, 97, 190, 53), rootServerInet4Address('i', 192, 36, 148, 17), rootServerInet4Address('j', 192, 58, 128, 30), rootServerInet4Address('k', 193, 0, 14, 129), rootServerInet4Address('l', NNTPReply.DEBUG_OUTPUT, 7, 83, 42), rootServerInet4Address('m', 202, 12, 27, 33)};
    public static final Inet6Address[] IPV6_ROOT_SERVERS = {rootServerInet6Address('a', 8193, 1283, 47678, 0, 0, 0, 2, 48), rootServerInet6Address('b', 8193, 1280, 132, 0, 0, 0, 0, 11), rootServerInet6Address('c', 8193, 1280, 2, 0, 0, 0, 0, 12), rootServerInet6Address('d', 8193, 1280, 45, 0, 0, 0, 0, 13), rootServerInet6Address('f', 8193, 1280, 47, 0, 0, 0, 0, 15), rootServerInet6Address('h', 8193, 1280, 1, 0, 0, 0, 0, 83), rootServerInet6Address('i', 8193, 2046, 0, 0, 0, 0, 0, 83), rootServerInet6Address('j', 8193, 1283, 3111, 0, 0, 0, 2, 48), rootServerInet6Address('l', 8193, 1280, 3, 0, 0, 0, 0, 66), rootServerInet6Address('m', 8193, 3523, 0, 0, 0, 0, 0, 53)};

    public static Inet4Address getIpv4RootServerById(char c10) {
        return IPV4_ROOT_SERVER_MAP.get(Character.valueOf(c10));
    }

    public static Inet6Address getIpv6RootServerById(char c10) {
        return IPV6_ROOT_SERVER_MAP.get(Character.valueOf(c10));
    }

    public static Inet4Address getRandomIpv4RootServer(Random random) {
        Inet4Address[] inet4AddressArr = IPV4_ROOT_SERVERS;
        return inet4AddressArr[random.nextInt(inet4AddressArr.length)];
    }

    public static Inet6Address getRandomIpv6RootServer(Random random) {
        Inet6Address[] inet6AddressArr = IPV6_ROOT_SERVERS;
        return inet6AddressArr[random.nextInt(inet6AddressArr.length)];
    }

    private static Inet4Address rootServerInet4Address(char c10, int i10, int i11, int i12, int i13) {
        try {
            Inet4Address inet4Address = (Inet4Address) InetAddress.getByAddress(c10 + ".root-servers.net", new byte[]{(byte) i10, (byte) i11, (byte) i12, (byte) i13});
            IPV4_ROOT_SERVER_MAP.put(Character.valueOf(c10), inet4Address);
            return inet4Address;
        } catch (UnknownHostException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Inet6Address rootServerInet6Address(char c10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        try {
            Inet6Address inet6Address = (Inet6Address) InetAddress.getByAddress(c10 + ".root-servers.net", new byte[]{(byte) (i10 >> 8), (byte) i10, (byte) (i11 >> 8), (byte) i11, (byte) (i12 >> 8), (byte) i12, (byte) (i13 >> 8), (byte) i13, (byte) (i14 >> 8), (byte) i14, (byte) (i15 >> 8), (byte) i15, (byte) (i16 >> 8), (byte) i16, (byte) (i17 >> 8), (byte) i17});
            IPV6_ROOT_SERVER_MAP.put(Character.valueOf(c10), inet6Address);
            return inet6Address;
        } catch (UnknownHostException e10) {
            throw new RuntimeException(e10);
        }
    }
}
