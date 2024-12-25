package org.minidns.dnsserverlookup;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: combined.jar:classes3.jar:org/minidns/dnsserverlookup/AbstractDnsServerLookupMechanism.class */
public abstract class AbstractDnsServerLookupMechanism implements DnsServerLookupMechanism {
    public static final Logger LOGGER = Logger.getLogger(AbstractDnsServerLookupMechanism.class.getName());
    private final String name;
    private final int priority;

    public AbstractDnsServerLookupMechanism(String str, int i10) {
        this.name = str;
        this.priority = i10;
    }

    public static List<String> toListOfStrings(Collection<? extends InetAddress> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<? extends InetAddress> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getHostAddress());
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    public final int compareTo(DnsServerLookupMechanism dnsServerLookupMechanism) {
        return Integer.compare(getPriority(), dnsServerLookupMechanism.getPriority());
    }

    @Override // org.minidns.dnsserverlookup.DnsServerLookupMechanism
    public abstract List<String> getDnsServerAddresses();

    @Override // org.minidns.dnsserverlookup.DnsServerLookupMechanism
    public final String getName() {
        return this.name;
    }

    @Override // org.minidns.dnsserverlookup.DnsServerLookupMechanism
    public final int getPriority() {
        return this.priority;
    }
}
