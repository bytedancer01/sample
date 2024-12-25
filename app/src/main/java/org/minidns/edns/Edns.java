package org.minidns.edns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jsoup.parser.CharacterReader;
import org.minidns.dnsname.DnsName;
import org.minidns.record.Data;
import org.minidns.record.OPT;
import org.minidns.record.Record;

/* loaded from: combined.jar:classes3.jar:org/minidns/edns/Edns.class */
public class Edns {
    public static final boolean $assertionsDisabled = false;
    public static final int FLAG_DNSSEC_OK = 32768;
    public final boolean dnssecOk;
    public final int extendedRcode;
    public final int flags;
    private Record<OPT> optRecord;
    private String terminalOutputCache;
    public final int udpPayloadSize;
    public final List<EdnsOption> variablePart;
    public final int version;

    /* loaded from: combined.jar:classes3.jar:org/minidns/edns/Edns$Builder.class */
    public static final class Builder {
        private boolean dnssecOk;
        private int extendedRcode;
        private int udpPayloadSize;
        private List<EdnsOption> variablePart;
        private int version;

        private Builder() {
        }

        public Builder addEdnsOption(EdnsOption ednsOption) {
            if (this.variablePart == null) {
                this.variablePart = new ArrayList(4);
            }
            this.variablePart.add(ednsOption);
            return this;
        }

        public Edns build() {
            return new Edns(this);
        }

        public Builder setDnssecOk() {
            this.dnssecOk = true;
            return this;
        }

        public Builder setDnssecOk(boolean z10) {
            this.dnssecOk = z10;
            return this;
        }

        public Builder setUdpPayloadSize(int i10) {
            if (i10 <= 65535) {
                this.udpPayloadSize = i10;
                return this;
            }
            throw new IllegalArgumentException("UDP payload size must not be greater than 65536, was " + i10);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/minidns/edns/Edns$OptionCode.class */
    public enum OptionCode {
        UNKNOWN(-1, UnknownEdnsOption.class),
        NSID(3, Nsid.class);

        private static Map<Integer, OptionCode> INVERSE_LUT = new HashMap(values().length);
        public final int asInt;
        public final Class<? extends EdnsOption> clazz;

        static {
            for (OptionCode optionCode : values()) {
                INVERSE_LUT.put(Integer.valueOf(optionCode.asInt), optionCode);
            }
        }

        OptionCode(int i10, Class cls) {
            this.asInt = i10;
            this.clazz = cls;
        }

        public static OptionCode from(int i10) {
            OptionCode optionCode = INVERSE_LUT.get(Integer.valueOf(i10));
            OptionCode optionCode2 = optionCode;
            if (optionCode == null) {
                optionCode2 = UNKNOWN;
            }
            return optionCode2;
        }
    }

    public Edns(Builder builder) {
        this.udpPayloadSize = builder.udpPayloadSize;
        this.extendedRcode = builder.extendedRcode;
        this.version = builder.version;
        int i10 = builder.dnssecOk ? 32768 : 0;
        this.dnssecOk = builder.dnssecOk;
        this.flags = i10;
        this.variablePart = builder.variablePart != null ? builder.variablePart : Collections.emptyList();
    }

    public Edns(Record<OPT> record) {
        this.udpPayloadSize = record.clazzValue;
        long j10 = record.ttl;
        this.extendedRcode = (int) ((j10 >> 8) & 255);
        this.version = (int) ((j10 >> 16) & 255);
        this.flags = ((int) j10) & CharacterReader.EOF;
        this.dnssecOk = (j10 & 32768) > 0;
        this.variablePart = record.payloadData.variablePart;
        this.optRecord = record;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Edns fromRecord(Record<? extends Data> record) {
        if (record.type != Record.TYPE.OPT) {
            return null;
        }
        return new Edns((Record<OPT>) record);
    }

    public Record<OPT> asRecord() {
        if (this.optRecord == null) {
            this.optRecord = new Record<>(DnsName.ROOT, Record.TYPE.OPT, this.udpPayloadSize, this.flags | (this.extendedRcode << 8) | (this.version << 16), new OPT(this.variablePart));
        }
        return this.optRecord;
    }

    public String asTerminalOutput() {
        if (this.terminalOutputCache == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("EDNS: version: ");
            sb2.append(this.version);
            sb2.append(", flags:");
            if (this.dnssecOk) {
                sb2.append(" do");
            }
            sb2.append("; udp: ");
            sb2.append(this.udpPayloadSize);
            if (!this.variablePart.isEmpty()) {
                sb2.append('\n');
                Iterator<EdnsOption> it = this.variablePart.iterator();
                while (it.hasNext()) {
                    EdnsOption next = it.next();
                    sb2.append(next.getOptionCode());
                    sb2.append(": ");
                    sb2.append(next.asTerminalOutput());
                    if (it.hasNext()) {
                        sb2.append('\n');
                    }
                }
            }
            this.terminalOutputCache = sb2.toString();
        }
        return this.terminalOutputCache;
    }

    public <O extends EdnsOption> O getEdnsOption(OptionCode optionCode) {
        Iterator<EdnsOption> it = this.variablePart.iterator();
        while (it.hasNext()) {
            O o10 = (O) it.next();
            if (o10.getOptionCode().equals(optionCode)) {
                return o10;
            }
        }
        return null;
    }

    public String toString() {
        return asTerminalOutput();
    }
}
