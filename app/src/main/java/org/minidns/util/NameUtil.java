package org.minidns.util;

import org.minidns.dnsname.DnsName;

/* loaded from: combined.jar:classes3.jar:org/minidns/util/NameUtil.class */
public final class NameUtil {
    public static boolean idnEquals(String str, String str2) {
        boolean z10 = true;
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        if (DnsName.from(str).compareTo(DnsName.from(str2)) != 0) {
            z10 = false;
        }
        return z10;
    }
}
