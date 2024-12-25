package org.minidns;

import java.io.IOException;
import java.net.InetAddress;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.minidns.MiniDnsFuture;
import org.minidns.cache.LruCache;
import org.minidns.dnsmessage.DnsMessage;
import org.minidns.dnsmessage.Question;
import org.minidns.dnsname.DnsName;
import org.minidns.dnsqueryresult.CachedDnsQueryResult;
import org.minidns.dnsqueryresult.DnsQueryResult;
import org.minidns.record.AAAA;
import org.minidns.record.C7194A;
import org.minidns.record.C7198NS;
import org.minidns.record.Data;
import org.minidns.record.Record;
import org.minidns.source.DnsDataSource;
import org.minidns.source.NetworkDataSource;

/* loaded from: combined.jar:classes3.jar:org/minidns/AbstractDnsClient.class */
public abstract class AbstractDnsClient {
    public final DnsCache cache;
    public DnsDataSource dataSource;
    public final Random insecureRandom;
    public IpVersionSetting ipVersionSetting;
    private final DnsDataSource.OnResponseCallback onResponseCallback;
    public final Random random;
    public static final LruCache DEFAULT_CACHE = new LruCache();
    public static final Logger LOGGER = Logger.getLogger(AbstractDnsClient.class.getName());
    public static IpVersionSetting DEFAULT_IP_VERSION_SETTING = IpVersionSetting.v4v6;

    /* renamed from: org.minidns.AbstractDnsClient$2 */
    /* loaded from: combined.jar:classes3.jar:org/minidns/AbstractDnsClient$2.class */
    public static /* synthetic */ class C71802 {
        public static final int[] $SwitchMap$org$minidns$record$Record$TYPE;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:8:0x0020
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                org.minidns.record.Record$TYPE[] r0 = org.minidns.record.Record.TYPE.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                org.minidns.AbstractDnsClient.C71802.$SwitchMap$org$minidns$record$Record$TYPE = r0
                r0 = r4
                org.minidns.record.Record$TYPE r1 = org.minidns.record.Record.TYPE.A     // Catch: java.lang.NoSuchFieldError -> L20
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L20
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L20
            L14:
                int[] r0 = org.minidns.AbstractDnsClient.C71802.$SwitchMap$org$minidns$record$Record$TYPE     // Catch: java.lang.NoSuchFieldError -> L20 java.lang.NoSuchFieldError -> L24
                org.minidns.record.Record$TYPE r1 = org.minidns.record.Record.TYPE.AAAA     // Catch: java.lang.NoSuchFieldError -> L24
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L24
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L24
            L1f:
                return
            L20:
                r4 = move-exception
                goto L14
            L24:
                r4 = move-exception
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: org.minidns.AbstractDnsClient.C71802.m45475clinit():void");
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/minidns/AbstractDnsClient$IpVersionSetting.class */
    public enum IpVersionSetting {
        v4only(true, false),
        v6only(false, true),
        v4v6(true, true),
        v6v4(true, true);


        /* renamed from: v4 */
        public final boolean f36208v4;

        /* renamed from: v6 */
        public final boolean f36209v6;

        IpVersionSetting(boolean z10, boolean z11) {
            this.f36208v4 = z10;
            this.f36209v6 = z11;
        }
    }

    public AbstractDnsClient() {
        this(DEFAULT_CACHE);
    }

    public AbstractDnsClient(DnsCache dnsCache) {
        SecureRandom secureRandom;
        this.onResponseCallback = new DnsDataSource.OnResponseCallback(this) { // from class: org.minidns.AbstractDnsClient.1
            public final AbstractDnsClient this$0;

            {
                this.this$0 = this;
            }

            @Override // org.minidns.source.DnsDataSource.OnResponseCallback
            public void onResponse(DnsMessage dnsMessage, DnsQueryResult dnsQueryResult) {
                Question question = dnsMessage.getQuestion();
                AbstractDnsClient abstractDnsClient = this.this$0;
                if (abstractDnsClient.cache == null || !abstractDnsClient.isResponseCacheable(question, dnsQueryResult)) {
                    return;
                }
                this.this$0.cache.put(dnsMessage.asNormalizedVersion(), dnsQueryResult);
            }
        };
        this.insecureRandom = new Random();
        this.dataSource = new NetworkDataSource();
        this.ipVersionSetting = DEFAULT_IP_VERSION_SETTING;
        try {
            secureRandom = SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException e10) {
            secureRandom = new SecureRandom();
        }
        this.random = secureRandom;
        this.cache = dnsCache;
    }

    private <D extends Data> Set<D> getCachedIPNameserverAddressesFor(DnsName dnsName, Record.TYPE type) {
        Collection cachedIPv4AddressesFor;
        Set<C7198NS> cachedNameserverRecordsFor = getCachedNameserverRecordsFor(dnsName);
        if (cachedNameserverRecordsFor.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(cachedNameserverRecordsFor.size() * 3);
        for (C7198NS c7198ns : cachedNameserverRecordsFor) {
            int i10 = C71802.$SwitchMap$org$minidns$record$Record$TYPE[type.ordinal()];
            if (i10 == 1) {
                cachedIPv4AddressesFor = getCachedIPv4AddressesFor(c7198ns.target);
            } else {
                if (i10 != 2) {
                    throw new AssertionError();
                }
                cachedIPv4AddressesFor = getCachedIPv6AddressesFor(c7198ns.target);
            }
            hashSet.addAll(cachedIPv4AddressesFor);
        }
        return hashSet;
    }

    private <D extends Data> Set<D> getCachedRecordsFor(DnsName dnsName, Record.TYPE type) {
        if (this.cache == null) {
            return Collections.emptySet();
        }
        Question question = new Question(dnsName, type);
        CachedDnsQueryResult cachedDnsQueryResult = this.cache.get(getQueryFor(question));
        return cachedDnsQueryResult == null ? Collections.emptySet() : cachedDnsQueryResult.response.getAnswersFor(question);
    }

    public static void setDefaultIpVersion(IpVersionSetting ipVersionSetting) {
        if (ipVersionSetting == null) {
            throw new IllegalArgumentException();
        }
        DEFAULT_IP_VERSION_SETTING = ipVersionSetting;
    }

    public final DnsMessage.Builder buildMessage(Question question) {
        DnsMessage.Builder builder = DnsMessage.builder();
        builder.setQuestion(question);
        builder.setId(this.random.nextInt());
        return newQuestion(builder);
    }

    public DnsCache getCache() {
        return this.cache;
    }

    public Set<C7194A> getCachedIPv4AddressesFor(DnsName dnsName) {
        return getCachedRecordsFor(dnsName, Record.TYPE.A);
    }

    public Set<C7194A> getCachedIPv4NameserverAddressesFor(DnsName dnsName) {
        return getCachedIPNameserverAddressesFor(dnsName, Record.TYPE.A);
    }

    public Set<AAAA> getCachedIPv6AddressesFor(DnsName dnsName) {
        return getCachedRecordsFor(dnsName, Record.TYPE.AAAA);
    }

    public Set<AAAA> getCachedIPv6NameserverAddressesFor(DnsName dnsName) {
        return getCachedIPNameserverAddressesFor(dnsName, Record.TYPE.AAAA);
    }

    public Set<C7198NS> getCachedNameserverRecordsFor(DnsName dnsName) {
        return getCachedRecordsFor(dnsName, Record.TYPE.NS);
    }

    public DnsDataSource getDataSource() {
        return this.dataSource;
    }

    public IpVersionSetting getPreferedIpVersion() {
        return this.ipVersionSetting;
    }

    public DnsMessage getQueryFor(Question question) {
        return buildMessage(question).build();
    }

    public boolean isResponseCacheable(Question question, DnsQueryResult dnsQueryResult) {
        Iterator<Record<? extends Data>> it = dnsQueryResult.response.answerSection.iterator();
        while (it.hasNext()) {
            if (it.next().isAnswer(question)) {
                return true;
            }
        }
        return false;
    }

    public abstract DnsMessage.Builder newQuestion(DnsMessage.Builder builder);

    public final DnsQueryResult query(CharSequence charSequence, Record.TYPE type) {
        return query(new Question(charSequence, type, Record.CLASS.IN));
    }

    public DnsQueryResult query(String str, Record.TYPE type, InetAddress inetAddress) {
        return query(new Question(str, type, Record.CLASS.IN), inetAddress);
    }

    public final DnsQueryResult query(String str, Record.TYPE type, Record.CLASS r10) {
        return query(new Question(str, type, r10));
    }

    public DnsQueryResult query(String str, Record.TYPE type, Record.CLASS r10, InetAddress inetAddress) {
        return query(new Question(str, type, r10), inetAddress);
    }

    public DnsQueryResult query(String str, Record.TYPE type, Record.CLASS r10, InetAddress inetAddress, int i10) {
        return query(new Question(str, type, r10), inetAddress, i10);
    }

    public abstract DnsQueryResult query(DnsMessage.Builder builder);

    public final DnsQueryResult query(DnsMessage dnsMessage, InetAddress inetAddress) {
        return query(dnsMessage, inetAddress, 53);
    }

    public final DnsQueryResult query(DnsMessage dnsMessage, InetAddress inetAddress, int i10) {
        DnsCache dnsCache = this.cache;
        CachedDnsQueryResult cachedDnsQueryResult = dnsCache == null ? null : dnsCache.get(dnsMessage);
        if (cachedDnsQueryResult != null) {
            return cachedDnsQueryResult;
        }
        Question question = dnsMessage.getQuestion();
        Level level = Level.FINE;
        Logger logger = LOGGER;
        logger.log(level, "Asking {0} on {1} for {2} with:\n{3}", new Object[]{inetAddress, Integer.valueOf(i10), question, dnsMessage});
        try {
            DnsQueryResult query = this.dataSource.query(dnsMessage, inetAddress, i10);
            logger.log(level, "Response from {0} on {1} for {2}:\n{3}", new Object[]{inetAddress, Integer.valueOf(i10), question, query});
            this.onResponseCallback.onResponse(dnsMessage, query);
            return query;
        } catch (IOException e10) {
            LOGGER.log(level, "IOException {0} on {1} while resolving {2}: {3}", new Object[]{inetAddress, Integer.valueOf(i10), question, e10});
            throw e10;
        }
    }

    public DnsQueryResult query(Question question) {
        return query(buildMessage(question));
    }

    public DnsQueryResult query(Question question, InetAddress inetAddress) {
        return query(question, inetAddress, 53);
    }

    public final DnsQueryResult query(Question question, InetAddress inetAddress, int i10) {
        return query(getQueryFor(question), inetAddress, i10);
    }

    public final DnsQueryResult query(DnsName dnsName, Record.TYPE type) {
        return query(new Question(dnsName, type, Record.CLASS.IN));
    }

    public final MiniDnsFuture<DnsQueryResult, IOException> queryAsync(CharSequence charSequence, Record.TYPE type) {
        return queryAsync(new Question(charSequence, type, Record.CLASS.IN));
    }

    public MiniDnsFuture<DnsQueryResult, IOException> queryAsync(DnsMessage.Builder builder) {
        MiniDnsFuture.InternalMiniDnsFuture internalMiniDnsFuture = new MiniDnsFuture.InternalMiniDnsFuture();
        try {
            internalMiniDnsFuture.setResult(query(builder));
            return internalMiniDnsFuture;
        } catch (IOException e10) {
            internalMiniDnsFuture.setException(e10);
            return internalMiniDnsFuture;
        }
    }

    public final MiniDnsFuture<DnsQueryResult, IOException> queryAsync(DnsMessage dnsMessage, InetAddress inetAddress) {
        return queryAsync(dnsMessage, inetAddress, 53);
    }

    public final MiniDnsFuture<DnsQueryResult, IOException> queryAsync(DnsMessage dnsMessage, InetAddress inetAddress, int i10) {
        DnsCache dnsCache = this.cache;
        CachedDnsQueryResult cachedDnsQueryResult = dnsCache == null ? null : dnsCache.get(dnsMessage);
        if (cachedDnsQueryResult != null) {
            return MiniDnsFuture.from(cachedDnsQueryResult);
        }
        LOGGER.log(Level.FINE, "Asynchronusly asking {0} on {1} for {2} with:\n{3}", new Object[]{inetAddress, Integer.valueOf(i10), dnsMessage.getQuestion(), dnsMessage});
        return this.dataSource.queryAsync(dnsMessage, inetAddress, i10, this.onResponseCallback);
    }

    public final MiniDnsFuture<DnsQueryResult, IOException> queryAsync(Question question) {
        return queryAsync(buildMessage(question));
    }

    public void setDataSource(DnsDataSource dnsDataSource) {
        if (dnsDataSource == null) {
            throw new IllegalArgumentException();
        }
        this.dataSource = dnsDataSource;
    }

    public void setPreferedIpVersion(IpVersionSetting ipVersionSetting) {
        if (ipVersionSetting == null) {
            throw new IllegalArgumentException();
        }
        this.ipVersionSetting = ipVersionSetting;
    }
}
