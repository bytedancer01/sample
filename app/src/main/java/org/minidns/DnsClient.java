package org.minidns;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.minidns.MiniDnsException;
import org.minidns.dnsmessage.DnsMessage;
import org.minidns.dnsmessage.Question;
import org.minidns.dnsname.DnsName;
import org.minidns.dnsqueryresult.CachedDnsQueryResult;
import org.minidns.dnsqueryresult.DnsQueryResult;
import org.minidns.dnsserverlookup.AndroidUsingExec;
import org.minidns.dnsserverlookup.AndroidUsingReflection;
import org.minidns.dnsserverlookup.DnsServerLookupMechanism;
import org.minidns.dnsserverlookup.UnixUsingEtcResolvConf;
import org.minidns.record.Record;
import org.minidns.util.CollectionsUtil;
import org.minidns.util.InetAddressUtil;
import org.minidns.util.MultipleIoException;

/* loaded from: combined.jar:classes3.jar:org/minidns/DnsClient.class */
public class DnsClient extends AbstractDnsClient {
    public static final boolean $assertionsDisabled = false;
    public static final List<DnsServerLookupMechanism> LOOKUP_MECHANISMS = new CopyOnWriteArrayList();
    public static final Set<Inet4Address> STATIC_IPV4_DNS_SERVERS;
    public static final Set<Inet6Address> STATIC_IPV6_DNS_SERVERS;
    private static final Set<String> blacklistedDnsServers;
    private boolean askForDnssec;
    private boolean disableResultFilter;
    private final Set<InetAddress> nonRaServers;
    private boolean useHardcodedDnsServers;

    /* renamed from: org.minidns.DnsClient$1 */
    /* loaded from: combined.jar:classes3.jar:org/minidns/DnsClient$1.class */
    public static /* synthetic */ class C71811 {
        public static final int[] $SwitchMap$org$minidns$AbstractDnsClient$IpVersionSetting;
        public static final int[] $SwitchMap$org$minidns$dnsmessage$DnsMessage$RESPONSE_CODE;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:23:0x005d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                org.minidns.dnsmessage.DnsMessage$RESPONSE_CODE[] r0 = org.minidns.dnsmessage.DnsMessage.RESPONSE_CODE.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                org.minidns.DnsClient.C71811.$SwitchMap$org$minidns$dnsmessage$DnsMessage$RESPONSE_CODE = r0
                r0 = r4
                org.minidns.dnsmessage.DnsMessage$RESPONSE_CODE r1 = org.minidns.dnsmessage.DnsMessage.RESPONSE_CODE.NO_ERROR     // Catch: java.lang.NoSuchFieldError -> L55
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L55
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L55
            L14:
                int[] r0 = org.minidns.DnsClient.C71811.$SwitchMap$org$minidns$dnsmessage$DnsMessage$RESPONSE_CODE     // Catch: java.lang.NoSuchFieldError -> L55 java.lang.NoSuchFieldError -> L59
                org.minidns.dnsmessage.DnsMessage$RESPONSE_CODE r1 = org.minidns.dnsmessage.DnsMessage.RESPONSE_CODE.NX_DOMAIN     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L1f:
                org.minidns.AbstractDnsClient$IpVersionSetting[] r0 = org.minidns.AbstractDnsClient.IpVersionSetting.values()     // Catch: java.lang.NoSuchFieldError -> L59
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                org.minidns.DnsClient.C71811.$SwitchMap$org$minidns$AbstractDnsClient$IpVersionSetting = r0
                r0 = r4
                org.minidns.AbstractDnsClient$IpVersionSetting r1 = org.minidns.AbstractDnsClient.IpVersionSetting.v4v6     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L33:
                int[] r0 = org.minidns.DnsClient.C71811.$SwitchMap$org$minidns$AbstractDnsClient$IpVersionSetting     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                org.minidns.AbstractDnsClient$IpVersionSetting r1 = org.minidns.AbstractDnsClient.IpVersionSetting.v6v4     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L3e:
                int[] r0 = org.minidns.DnsClient.C71811.$SwitchMap$org$minidns$AbstractDnsClient$IpVersionSetting     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                org.minidns.AbstractDnsClient$IpVersionSetting r1 = org.minidns.AbstractDnsClient.IpVersionSetting.v4only     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L49:
                int[] r0 = org.minidns.DnsClient.C71811.$SwitchMap$org$minidns$AbstractDnsClient$IpVersionSetting     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                org.minidns.AbstractDnsClient$IpVersionSetting r1 = org.minidns.AbstractDnsClient.IpVersionSetting.v6only     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L54:
                return
            L55:
                r4 = move-exception
                goto L14
            L59:
                r4 = move-exception
                goto L1f
            L5d:
                r4 = move-exception
                goto L33
            L61:
                r4 = move-exception
                goto L3e
            L65:
                r4 = move-exception
                goto L49
            L69:
                r4 = move-exception
                goto L54
            */
            throw new UnsupportedOperationException("Method not decompiled: org.minidns.DnsClient.C71811.m45478clinit():void");
        }
    }

    static {
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        STATIC_IPV4_DNS_SERVERS = copyOnWriteArraySet;
        STATIC_IPV6_DNS_SERVERS = new CopyOnWriteArraySet();
        addDnsServerLookupMechanism(AndroidUsingExec.INSTANCE);
        addDnsServerLookupMechanism(AndroidUsingReflection.INSTANCE);
        addDnsServerLookupMechanism(UnixUsingEtcResolvConf.INSTANCE);
        try {
            copyOnWriteArraySet.add(InetAddressUtil.ipv4From("8.8.8.8"));
        } catch (IllegalArgumentException e10) {
            AbstractDnsClient.LOGGER.log(Level.WARNING, "Could not add static IPv4 DNS Server", (Throwable) e10);
        }
        try {
            STATIC_IPV6_DNS_SERVERS.add(InetAddressUtil.ipv6From("[2001:4860:4860::8888]"));
        } catch (IllegalArgumentException e11) {
            AbstractDnsClient.LOGGER.log(Level.WARNING, "Could not add static IPv6 DNS Server", (Throwable) e11);
        }
        blacklistedDnsServers = Collections.newSetFromMap(new ConcurrentHashMap(4));
    }

    public DnsClient() {
        this.nonRaServers = Collections.newSetFromMap(new ConcurrentHashMap(4));
        this.askForDnssec = false;
        this.disableResultFilter = false;
        this.useHardcodedDnsServers = true;
    }

    public DnsClient(DnsCache dnsCache) {
        super(dnsCache);
        this.nonRaServers = Collections.newSetFromMap(new ConcurrentHashMap(4));
        this.askForDnssec = false;
        this.disableResultFilter = false;
        this.useHardcodedDnsServers = true;
    }

    public static boolean addBlacklistedDnsServer(String str) {
        return blacklistedDnsServers.add(str);
    }

    public static void addDnsServerLookupMechanism(DnsServerLookupMechanism dnsServerLookupMechanism) {
        if (!dnsServerLookupMechanism.isAvailable()) {
            AbstractDnsClient.LOGGER.fine("Not adding " + dnsServerLookupMechanism.getName() + " as it is not available.");
            return;
        }
        List<DnsServerLookupMechanism> list = LOOKUP_MECHANISMS;
        synchronized (list) {
            ArrayList arrayList = new ArrayList(list.size() + 1);
            arrayList.addAll(list);
            arrayList.add(dnsServerLookupMechanism);
            Collections.sort(arrayList);
            list.clear();
            list.addAll(arrayList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        r0 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r0.hasNext() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        r0 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (org.minidns.util.InetAddressUtil.isIpAddress(r0) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ba, code lost:
    
        if (org.minidns.DnsClient.blacklistedDnsServers.contains(r0) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bd, code lost:
    
        org.minidns.AbstractDnsClient.LOGGER.fine("The DNS server lookup mechanism '" + r0.getName() + "' returned a blacklisted result: '" + r0 + "'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
    
        r0.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        org.minidns.AbstractDnsClient.LOGGER.warning("The DNS server lookup mechanism '" + r0.getName() + "' returned an invalid non-IP address result: '" + r0 + "'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0109, code lost:
    
        if (r5.isEmpty() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010c, code lost:
    
        r6 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.String> findDNS() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.minidns.DnsClient.findDNS():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x014d, code lost:
    
        if (r0 != 4) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.net.InetAddress> findDnsAddresses() {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.minidns.DnsClient.findDnsAddresses():java.util.List");
    }

    public static Question getReverseIpLookupQuestionFor(Inet4Address inet4Address) {
        return getReverseIpLookupQuestionFor(DnsName.from(InetAddressUtil.reverseIpAddressOf(inet4Address), DnsName.IN_ADDR_ARPA));
    }

    public static Question getReverseIpLookupQuestionFor(Inet6Address inet6Address) {
        return getReverseIpLookupQuestionFor(DnsName.from(InetAddressUtil.reverseIpAddressOf(inet6Address), DnsName.IP6_ARPA));
    }

    public static Question getReverseIpLookupQuestionFor(InetAddress inetAddress) {
        if (inetAddress instanceof Inet4Address) {
            return getReverseIpLookupQuestionFor((Inet4Address) inetAddress);
        }
        if (inetAddress instanceof Inet6Address) {
            return getReverseIpLookupQuestionFor((Inet6Address) inetAddress);
        }
        throw new IllegalArgumentException("The provided inetAddress '" + inetAddress + "' is neither of type Inet4Address nor Inet6Address");
    }

    private static Question getReverseIpLookupQuestionFor(DnsName dnsName) {
        return new Question(dnsName, Record.TYPE.PTR);
    }

    private List<InetAddress> getServerAddresses() {
        InetAddress randomHardcodedIpv4DnsServer;
        List<InetAddress> findDnsAddresses = findDnsAddresses();
        if (this.useHardcodedDnsServers) {
            InetAddress inetAddress = null;
            int i10 = C71811.$SwitchMap$org$minidns$AbstractDnsClient$IpVersionSetting[this.ipVersionSetting.ordinal()];
            if (i10 == 1) {
                randomHardcodedIpv4DnsServer = getRandomHardcodedIpv4DnsServer();
                inetAddress = getRandomHarcodedIpv6DnsServer();
            } else if (i10 == 2) {
                randomHardcodedIpv4DnsServer = getRandomHarcodedIpv6DnsServer();
                inetAddress = getRandomHardcodedIpv4DnsServer();
            } else if (i10 == 3) {
                randomHardcodedIpv4DnsServer = getRandomHardcodedIpv4DnsServer();
            } else {
                if (i10 != 4) {
                    throw new AssertionError("Unknown ipVersionSetting: " + this.ipVersionSetting);
                }
                randomHardcodedIpv4DnsServer = getRandomHarcodedIpv6DnsServer();
            }
            findDnsAddresses.add(randomHardcodedIpv4DnsServer);
            if (inetAddress != null) {
                findDnsAddresses.add(inetAddress);
            }
        }
        return findDnsAddresses;
    }

    public static boolean removeBlacklistedDnsServer(String str) {
        return blacklistedDnsServers.remove(str);
    }

    public static boolean removeDNSServerLookupMechanism(DnsServerLookupMechanism dnsServerLookupMechanism) {
        boolean remove;
        List<DnsServerLookupMechanism> list = LOOKUP_MECHANISMS;
        synchronized (list) {
            remove = list.remove(dnsServerLookupMechanism);
        }
        return remove;
    }

    public InetAddress getRandomHarcodedIpv6DnsServer() {
        return (InetAddress) CollectionsUtil.getRandomFrom(STATIC_IPV6_DNS_SERVERS, this.insecureRandom);
    }

    public InetAddress getRandomHardcodedIpv4DnsServer() {
        return (InetAddress) CollectionsUtil.getRandomFrom(STATIC_IPV4_DNS_SERVERS, this.insecureRandom);
    }

    public boolean isAskForDnssec() {
        return this.askForDnssec;
    }

    public boolean isDisableResultFilter() {
        return this.disableResultFilter;
    }

    public boolean isUseHardcodedDnsServersEnabled() {
        return this.useHardcodedDnsServers;
    }

    @Override // org.minidns.AbstractDnsClient
    public DnsMessage.Builder newQuestion(DnsMessage.Builder builder) {
        builder.setRecursionDesired(true);
        builder.getEdnsBuilder().setUdpPayloadSize(this.dataSource.getUdpPayloadSize()).setDnssecOk(this.askForDnssec);
        return builder;
    }

    @Override // org.minidns.AbstractDnsClient
    public DnsQueryResult query(DnsMessage.Builder builder) {
        DnsQueryResult query;
        DnsMessage dnsMessage;
        DnsMessage build = newQuestion(builder).build();
        DnsCache dnsCache = this.cache;
        CachedDnsQueryResult cachedDnsQueryResult = dnsCache == null ? null : dnsCache.get(build);
        if (cachedDnsQueryResult != null) {
            return cachedDnsQueryResult;
        }
        List<InetAddress> serverAddresses = getServerAddresses();
        ArrayList arrayList = new ArrayList(serverAddresses.size());
        for (InetAddress inetAddress : serverAddresses) {
            if (this.nonRaServers.contains(inetAddress)) {
                AbstractDnsClient.LOGGER.finer("Skipping " + inetAddress + " because it was marked as \"recursion not available\"");
            } else {
                try {
                    query = query(build, inetAddress);
                    dnsMessage = query.response;
                } catch (IOException e10) {
                    e = e10;
                }
                if (dnsMessage.recursionAvailable) {
                    if (this.disableResultFilter) {
                        return query;
                    }
                    int i10 = C71811.$SwitchMap$org$minidns$dnsmessage$DnsMessage$RESPONSE_CODE[dnsMessage.responseCode.ordinal()];
                    if (i10 == 1 || i10 == 2) {
                        return query;
                    }
                    String str = "Response from " + inetAddress + " asked for " + build.getQuestion() + " with error code: " + dnsMessage.responseCode + '.';
                    Logger logger = AbstractDnsClient.LOGGER;
                    String str2 = str;
                    if (!logger.isLoggable(Level.FINE)) {
                        str2 = str + "\n" + dnsMessage;
                    }
                    logger.warning(str2);
                    e = new MiniDnsException.ErrorResponseException(build, query);
                    arrayList.add(e);
                } else if (this.nonRaServers.add(inetAddress)) {
                    AbstractDnsClient.LOGGER.warning("The DNS server " + inetAddress + " returned a response without the \"recursion available\" (RA) flag set. This likely indicates a misconfiguration because the server is not suitable for DNS resolution");
                }
            }
        }
        MultipleIoException.throwIfRequired(arrayList);
        throw new MiniDnsException.NoQueryPossibleException(build);
    }

    @Override // org.minidns.AbstractDnsClient
    public MiniDnsFuture<DnsQueryResult, IOException> queryAsync(DnsMessage.Builder builder) {
        DnsMessage build = newQuestion(builder).build();
        DnsCache dnsCache = this.cache;
        CachedDnsQueryResult cachedDnsQueryResult = dnsCache == null ? null : dnsCache.get(build);
        if (cachedDnsQueryResult != null) {
            return MiniDnsFuture.from(cachedDnsQueryResult);
        }
        List<InetAddress> serverAddresses = getServerAddresses();
        Iterator<InetAddress> it = serverAddresses.iterator();
        while (it.hasNext()) {
            InetAddress next = it.next();
            if (this.nonRaServers.contains(next)) {
                it.remove();
                AbstractDnsClient.LOGGER.finer("Skipping " + next + " because it was marked as \"recursion not available\"");
            }
        }
        ArrayList arrayList = new ArrayList(serverAddresses.size());
        Iterator<InetAddress> it2 = serverAddresses.iterator();
        while (it2.hasNext()) {
            arrayList.add(queryAsync(build, it2.next()));
        }
        return MiniDnsFuture.anySuccessfulOf(arrayList);
    }

    public void setAskForDnssec(boolean z10) {
        this.askForDnssec = z10;
    }

    public void setDisableResultFilter(boolean z10) {
        this.disableResultFilter = z10;
    }

    public void setUseHardcodedDnsServers(boolean z10) {
        this.useHardcodedDnsServers = z10;
    }
}
