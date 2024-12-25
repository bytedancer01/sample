package org.minidns.dnsserverlookup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import org.minidns.util.PlatformDetection;

/* loaded from: combined.jar:classes3.jar:org/minidns/dnsserverlookup/AndroidUsingExec.class */
public final class AndroidUsingExec extends AbstractDnsServerLookupMechanism {
    public static final DnsServerLookupMechanism INSTANCE = new AndroidUsingExec();
    public static final int PRIORITY = 999;
    private static final String PROP_DELIM = "]: [";

    private AndroidUsingExec() {
        super(AndroidUsingExec.class.getSimpleName(), PRIORITY);
    }

    public static Set<String> parseProps(BufferedReader bufferedReader, boolean z10) {
        String hostAddress;
        HashSet hashSet = new HashSet(6);
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return hashSet;
            }
            int indexOf = readLine.indexOf(PROP_DELIM);
            if (indexOf != -1) {
                String substring = readLine.substring(1, indexOf);
                int i10 = indexOf + 4;
                int length = readLine.length() - 1;
                if (length >= i10) {
                    String substring2 = readLine.substring(i10, length);
                    if (!substring2.isEmpty() && (substring.endsWith(".dns") || substring.endsWith(".dns1") || substring.endsWith(".dns2") || substring.endsWith(".dns3") || substring.endsWith(".dns4"))) {
                        InetAddress byName = InetAddress.getByName(substring2);
                        if (byName != null && (hostAddress = byName.getHostAddress()) != null && hostAddress.length() != 0) {
                            hashSet.add(hostAddress);
                        }
                    }
                } else if (z10) {
                    AbstractDnsServerLookupMechanism.LOGGER.warning("Malformed property detected: \"" + readLine + '\"');
                }
            }
        }
    }

    @Override // org.minidns.dnsserverlookup.AbstractDnsServerLookupMechanism, org.minidns.dnsserverlookup.DnsServerLookupMechanism
    public List<String> getDnsServerAddresses() {
        try {
            Set<String> parseProps = parseProps(new LineNumberReader(new InputStreamReader(Runtime.getRuntime().exec("getprop").getInputStream(), StandardCharsets.UTF_8)), true);
            if (parseProps.size() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(parseProps.size());
            arrayList.addAll(parseProps);
            return arrayList;
        } catch (IOException e10) {
            AbstractDnsServerLookupMechanism.LOGGER.log(Level.WARNING, "Exception in findDNSByExec", (Throwable) e10);
            return null;
        }
    }

    @Override // org.minidns.dnsserverlookup.DnsServerLookupMechanism
    public boolean isAvailable() {
        return PlatformDetection.isAndroid();
    }
}
