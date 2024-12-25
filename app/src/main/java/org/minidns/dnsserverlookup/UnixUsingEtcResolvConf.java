package org.minidns.dnsserverlookup;

import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import org.minidns.util.PlatformDetection;

/* loaded from: combined.jar:classes3.jar:org/minidns/dnsserverlookup/UnixUsingEtcResolvConf.class */
public final class UnixUsingEtcResolvConf extends AbstractDnsServerLookupMechanism {
    public static final DnsServerLookupMechanism INSTANCE = new UnixUsingEtcResolvConf();
    private static final Logger LOGGER = Logger.getLogger(UnixUsingEtcResolvConf.class.getName());
    private static final Pattern NAMESERVER_PATTERN = Pattern.compile("^nameserver\\s+(.*)$");
    public static final int PRIORITY = 2000;
    private static final String RESOLV_CONF_FILE = "/etc/resolv.conf";
    private static List<String> cached;
    private static long lastModified;

    private UnixUsingEtcResolvConf() {
        super(UnixUsingEtcResolvConf.class.getSimpleName(), 2000);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.minidns.dnsserverlookup.AbstractDnsServerLookupMechanism, org.minidns.dnsserverlookup.DnsServerLookupMechanism
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<java.lang.String> getDnsServerAddresses() {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.minidns.dnsserverlookup.UnixUsingEtcResolvConf.getDnsServerAddresses():java.util.List");
    }

    @Override // org.minidns.dnsserverlookup.DnsServerLookupMechanism
    public boolean isAvailable() {
        if (PlatformDetection.isAndroid()) {
            return false;
        }
        try {
            return new File(RESOLV_CONF_FILE).exists();
        } catch (SecurityException e10) {
            LOGGER.log(Level.FINE, "Access to /etc/resolv.conf not possible", (Throwable) e10);
            return false;
        }
    }
}
