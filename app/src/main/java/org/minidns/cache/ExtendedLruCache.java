package org.minidns.cache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.minidns.dnsmessage.DnsMessage;
import org.minidns.dnsmessage.Question;
import org.minidns.dnsname.DnsName;
import org.minidns.dnsqueryresult.DnsQueryResult;
import org.minidns.dnsqueryresult.SynthesizedCachedDnsQueryResult;
import org.minidns.record.Data;
import org.minidns.record.Record;

/* loaded from: combined.jar:classes3.jar:org/minidns/cache/ExtendedLruCache.class */
public class ExtendedLruCache extends LruCache {
    public static final boolean $assertionsDisabled = false;

    public ExtendedLruCache() {
        this(512);
    }

    public ExtendedLruCache(int i10) {
        super(i10);
    }

    public ExtendedLruCache(int i10, long j10) {
        super(i10, j10);
    }

    private void gather(Map<DnsMessage, List<Record<? extends Data>>> map, DnsMessage dnsMessage, List<Record<? extends Data>> list, DnsName dnsName) {
        DnsMessage.Builder questionMessage;
        for (Record<? extends Data> record : list) {
            if (shouldGather(record, dnsMessage.getQuestion(), dnsName) && (questionMessage = record.getQuestionMessage()) != null) {
                questionMessage.copyFlagsFrom(dnsMessage);
                questionMessage.setAdditionalResourceRecords(dnsMessage.additionalSection);
                DnsMessage build = questionMessage.build();
                if (!build.equals(dnsMessage)) {
                    List<Record<? extends Data>> list2 = map.get(build);
                    List<Record<? extends Data>> list3 = list2;
                    if (list2 == null) {
                        list3 = new LinkedList();
                        map.put(build, list3);
                    }
                    list3.add(record);
                }
            }
        }
    }

    private void putExtraCaches(DnsQueryResult dnsQueryResult, Map<DnsMessage, List<Record<? extends Data>>> map) {
        DnsMessage dnsMessage = dnsQueryResult.response;
        for (Map.Entry<DnsMessage, List<Record<? extends Data>>> entry : map.entrySet()) {
            DnsMessage key = entry.getKey();
            SynthesizedCachedDnsQueryResult synthesizedCachedDnsQueryResult = new SynthesizedCachedDnsQueryResult(key, dnsMessage.asBuilder().setQuestion(key.getQuestion()).setAuthoritativeAnswer(true).addAnswers(entry.getValue()).build(), dnsQueryResult);
            synchronized (this) {
                this.backend.put(key, synthesizedCachedDnsQueryResult);
            }
        }
    }

    @Override // org.minidns.cache.LruCache, org.minidns.DnsCache
    public void offer(DnsMessage dnsMessage, DnsQueryResult dnsQueryResult, DnsName dnsName) {
        DnsMessage dnsMessage2 = dnsQueryResult.response;
        HashMap hashMap = new HashMap(dnsMessage2.additionalSection.size());
        gather(hashMap, dnsMessage, dnsMessage2.authoritySection, dnsName);
        gather(hashMap, dnsMessage, dnsMessage2.additionalSection, dnsName);
        putExtraCaches(dnsQueryResult, hashMap);
    }

    @Override // org.minidns.cache.LruCache, org.minidns.DnsCache
    public void putNormalized(DnsMessage dnsMessage, DnsQueryResult dnsQueryResult) {
        super.putNormalized(dnsMessage, dnsQueryResult);
        DnsMessage dnsMessage2 = dnsQueryResult.response;
        HashMap hashMap = new HashMap(dnsMessage2.additionalSection.size());
        gather(hashMap, dnsMessage, dnsMessage2.answerSection, null);
        gather(hashMap, dnsMessage, dnsMessage2.authoritySection, null);
        gather(hashMap, dnsMessage, dnsMessage2.additionalSection, null);
        putExtraCaches(dnsQueryResult, hashMap);
    }

    public boolean shouldGather(Record<? extends Data> record, Question question, DnsName dnsName) {
        boolean isChildOf = record.name.isChildOf(question.name);
        boolean z10 = false;
        boolean isChildOf2 = dnsName != null ? record.name.isChildOf(dnsName) : false;
        if (isChildOf || isChildOf2) {
            z10 = true;
        }
        return z10;
    }
}
