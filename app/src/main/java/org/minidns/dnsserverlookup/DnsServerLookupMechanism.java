package org.minidns.dnsserverlookup;

import java.util.List;

/* loaded from: combined.jar:classes3.jar:org/minidns/dnsserverlookup/DnsServerLookupMechanism.class */
public interface DnsServerLookupMechanism extends Comparable<DnsServerLookupMechanism> {
    List<String> getDnsServerAddresses();

    String getName();

    int getPriority();

    boolean isAvailable();
}
