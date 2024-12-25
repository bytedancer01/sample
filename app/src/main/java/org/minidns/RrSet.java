package org.minidns;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.minidns.dnsname.DnsName;
import org.minidns.record.Data;
import org.minidns.record.Record;

/* loaded from: combined.jar:classes3.jar:org/minidns/RrSet.class */
public final class RrSet {
    public final Record.CLASS clazz;
    public final DnsName name;
    public final Set<Record<? extends Data>> records;
    public final Record.TYPE type;

    /* loaded from: combined.jar:classes3.jar:org/minidns/RrSet$Builder.class */
    public static final class Builder {
        public static final boolean $assertionsDisabled = false;
        private Record.CLASS clazz;
        private DnsName name;
        public Set<Record<? extends Data>> records;
        private Record.TYPE type;

        private Builder() {
            this.records = new LinkedHashSet(8);
        }

        public boolean addIfPossible(Record<? extends Data> record) {
            if (!couldContain(record)) {
                return false;
            }
            addRecord(record);
            return true;
        }

        public Builder addRecord(Record<? extends Data> record) {
            if (this.name == null) {
                this.name = record.name;
                this.type = record.type;
                this.clazz = record.clazz;
            } else if (!couldContain(record)) {
                throw new IllegalArgumentException("Can not add " + record + " to RRSet " + ((Object) this.name) + ' ' + this.type + ' ' + this.clazz);
            }
            this.records.add(record);
            return this;
        }

        public RrSet build() {
            DnsName dnsName = this.name;
            if (dnsName != null) {
                return new RrSet(dnsName, this.type, this.clazz, this.records);
            }
            throw new IllegalStateException();
        }

        public boolean couldContain(Record<? extends Data> record) {
            DnsName dnsName = this.name;
            boolean z10 = true;
            if (dnsName == null) {
                return true;
            }
            if (!dnsName.equals(record.name) || this.type != record.type || this.clazz != record.clazz) {
                z10 = false;
            }
            return z10;
        }
    }

    private RrSet(DnsName dnsName, Record.TYPE type, Record.CLASS r62, Set<Record<? extends Data>> set) {
        this.name = dnsName;
        this.type = type;
        this.clazz = r62;
        this.records = Collections.unmodifiableSet(set);
    }

    public static Builder builder() {
        return new Builder();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) this.name);
        sb2.append('\t');
        sb2.append(this.clazz);
        sb2.append('\t');
        sb2.append(this.type);
        sb2.append('\n');
        Iterator<Record<? extends Data>> it = this.records.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
