package org.minidns.util;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.regex.Pattern;
import org.minidns.dnsname.DnsName;

/* loaded from: combined.jar:classes3.jar:org/minidns/util/InetAddressUtil.class */
public class InetAddressUtil {
    public static final boolean $assertionsDisabled = false;
    private static final Pattern IPV4_PATTERN = Pattern.compile("\\A(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}\\z");
    private static final Pattern IPV6_PATTERN = Pattern.compile("(([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))");

    public static InetAddress convertToInetAddressIfPossible(CharSequence charSequence) {
        if (!isIpAddress(charSequence)) {
            return null;
        }
        try {
            return InetAddress.getByName(charSequence.toString());
        } catch (UnknownHostException e10) {
            throw new AssertionError(e10);
        }
    }

    public static Inet4Address ipv4From(CharSequence charSequence) {
        try {
            InetAddress byName = InetAddress.getByName(charSequence.toString());
            if (byName instanceof Inet4Address) {
                return (Inet4Address) byName;
            }
            throw new IllegalArgumentException();
        } catch (UnknownHostException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static Inet6Address ipv6From(CharSequence charSequence) {
        try {
            InetAddress byName = InetAddress.getByName(charSequence.toString());
            if (byName instanceof Inet6Address) {
                return (Inet6Address) byName;
            }
            throw new IllegalArgumentException();
        } catch (UnknownHostException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static boolean isIpAddress(CharSequence charSequence) {
        return isIpV6Address(charSequence) || isIpV4Address(charSequence);
    }

    public static boolean isIpV4Address(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        return IPV4_PATTERN.matcher(charSequence).matches();
    }

    public static boolean isIpV6Address(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        return IPV6_PATTERN.matcher(charSequence).matches();
    }

    public static DnsName reverseIpAddressOf(Inet4Address inet4Address) {
        return DnsName.from(inet4Address.getHostAddress().split("\\."));
    }

    public static DnsName reverseIpAddressOf(Inet6Address inet6Address) {
        String[] split = inet6Address.getHostAddress().split(":");
        String[] strArr = new String[32];
        int i10 = 0;
        for (int length = split.length - 1; length >= 0; length--) {
            String str = split[length];
            int length2 = str.length();
            int i11 = 0;
            while (i11 < 4 - length2) {
                strArr[i10] = "0";
                i11++;
                i10++;
            }
            int i12 = 0;
            while (i12 < str.length()) {
                strArr[i10] = Character.toString(str.charAt(i12));
                i12++;
                i10++;
            }
        }
        return DnsName.from(strArr);
    }
}
