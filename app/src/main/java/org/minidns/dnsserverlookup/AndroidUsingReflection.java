package org.minidns.dnsserverlookup;

import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import org.minidns.util.PlatformDetection;

/* loaded from: combined.jar:classes3.jar:org/minidns/dnsserverlookup/AndroidUsingReflection.class */
public class AndroidUsingReflection extends AbstractDnsServerLookupMechanism {
    public static final DnsServerLookupMechanism INSTANCE = new AndroidUsingReflection();
    public static final int PRIORITY = 1000;

    public AndroidUsingReflection() {
        super(AndroidUsingReflection.class.getSimpleName(), 1000);
    }

    @Override // org.minidns.dnsserverlookup.AbstractDnsServerLookupMechanism, org.minidns.dnsserverlookup.DnsServerLookupMechanism
    public List<String> getDnsServerAddresses() {
        InetAddress byName;
        String hostAddress;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            ArrayList arrayList = new ArrayList(5);
            for (int i10 = 0; i10 < 4; i10++) {
                String str = (String) method.invoke(null, new String[]{"net.dns1", "net.dns2", "net.dns3", "net.dns4"}[i10]);
                if (str != null && str.length() != 0 && !arrayList.contains(str) && (byName = InetAddress.getByName(str)) != null && (hostAddress = byName.getHostAddress()) != null && hostAddress.length() != 0 && !arrayList.contains(hostAddress)) {
                    arrayList.add(hostAddress);
                }
            }
            if (arrayList.size() > 0) {
                return arrayList;
            }
            return null;
        } catch (Exception e10) {
            AbstractDnsServerLookupMechanism.LOGGER.log(Level.WARNING, "Exception in findDNSByReflection", (Throwable) e10);
            return null;
        }
    }

    @Override // org.minidns.dnsserverlookup.DnsServerLookupMechanism
    public boolean isAvailable() {
        return PlatformDetection.isAndroid();
    }
}
