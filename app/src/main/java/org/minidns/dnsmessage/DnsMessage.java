package org.minidns.dnsmessage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.parser.CharacterReader;
import org.minidns.edns.Edns;
import org.minidns.record.Data;
import org.minidns.record.OPT;
import org.minidns.record.Record;

/* loaded from: combined.jar:classes3.jar:org/minidns/dnsmessage/DnsMessage.class */
public class DnsMessage {
    private static final Logger LOGGER = Logger.getLogger(DnsMessage.class.getName());
    public final List<Record<? extends Data>> additionalSection;
    public final List<Record<? extends Data>> answerSection;
    private long answersMinTtlCache;
    public final boolean authenticData;
    public final boolean authoritativeAnswer;
    public final List<Record<? extends Data>> authoritySection;
    private byte[] byteCache;
    public final boolean checkingDisabled;
    private Edns edns;
    private transient Integer hashCodeCache;

    /* renamed from: id */
    public final int f36211id;
    private DnsMessage normalizedVersionCache;
    public final OPCODE opcode;
    public final int optRrPosition;

    /* renamed from: qr */
    public final boolean f36212qr;
    public final List<Question> questions;
    public final long receiveTimestamp;
    public final boolean recursionAvailable;
    public final boolean recursionDesired;
    public final RESPONSE_CODE responseCode;
    private String terminalOutputCache;
    private String toStringCache;
    public final boolean truncated;

    /* renamed from: org.minidns.dnsmessage.DnsMessage$1 */
    /* loaded from: combined.jar:classes3.jar:org/minidns/dnsmessage/DnsMessage$1.class */
    public static /* synthetic */ class C71911 {
        public static final int[] $SwitchMap$org$minidns$dnsmessage$DnsMessage$SectionName;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x002f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                org.minidns.dnsmessage.DnsMessage$SectionName[] r0 = org.minidns.dnsmessage.DnsMessage.SectionName.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                org.minidns.dnsmessage.DnsMessage.C71911.$SwitchMap$org$minidns$dnsmessage$DnsMessage$SectionName = r0
                r0 = r4
                org.minidns.dnsmessage.DnsMessage$SectionName r1 = org.minidns.dnsmessage.DnsMessage.SectionName.answer     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L14:
                int[] r0 = org.minidns.dnsmessage.DnsMessage.C71911.$SwitchMap$org$minidns$dnsmessage$DnsMessage$SectionName     // Catch: java.lang.NoSuchFieldError -> L2b java.lang.NoSuchFieldError -> L2f
                org.minidns.dnsmessage.DnsMessage$SectionName r1 = org.minidns.dnsmessage.DnsMessage.SectionName.authority     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
            L1f:
                int[] r0 = org.minidns.dnsmessage.DnsMessage.C71911.$SwitchMap$org$minidns$dnsmessage$DnsMessage$SectionName     // Catch: java.lang.NoSuchFieldError -> L2f java.lang.NoSuchFieldError -> L33
                org.minidns.dnsmessage.DnsMessage$SectionName r1 = org.minidns.dnsmessage.DnsMessage.SectionName.additional     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L2a:
                return
            L2b:
                r4 = move-exception
                goto L14
            L2f:
                r4 = move-exception
                goto L1f
            L33:
                r4 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: org.minidns.dnsmessage.DnsMessage.C71911.m45494clinit():void");
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/minidns/dnsmessage/DnsMessage$Builder.class */
    public static final class Builder {
        private List<Record<? extends Data>> additionalSection;
        private List<Record<? extends Data>> answerSection;
        private boolean authenticData;
        private boolean authoritativeAnswer;
        private List<Record<? extends Data>> authoritySection;
        private boolean checkingDisabled;
        private Edns.Builder ednsBuilder;

        /* renamed from: id */
        private int f36213id;
        private OPCODE opcode;
        private boolean query;
        private List<Question> questions;
        private long receiveTimestamp;
        private boolean recursionAvailable;
        private boolean recursionDesired;
        private RESPONSE_CODE responseCode;
        private boolean truncated;

        private Builder() {
            this.opcode = OPCODE.QUERY;
            this.responseCode = RESPONSE_CODE.NO_ERROR;
            this.receiveTimestamp = -1L;
        }

        public /* synthetic */ Builder(C71911 c71911) {
            this();
        }

        private Builder(DnsMessage dnsMessage) {
            this.opcode = OPCODE.QUERY;
            this.responseCode = RESPONSE_CODE.NO_ERROR;
            this.receiveTimestamp = -1L;
            this.f36213id = dnsMessage.f36211id;
            this.opcode = dnsMessage.opcode;
            this.responseCode = dnsMessage.responseCode;
            this.query = dnsMessage.f36212qr;
            this.authoritativeAnswer = dnsMessage.authoritativeAnswer;
            this.truncated = dnsMessage.truncated;
            this.recursionDesired = dnsMessage.recursionDesired;
            this.recursionAvailable = dnsMessage.recursionAvailable;
            this.authenticData = dnsMessage.authenticData;
            this.checkingDisabled = dnsMessage.checkingDisabled;
            this.receiveTimestamp = dnsMessage.receiveTimestamp;
            ArrayList arrayList = new ArrayList(dnsMessage.questions.size());
            this.questions = arrayList;
            arrayList.addAll(dnsMessage.questions);
            ArrayList arrayList2 = new ArrayList(dnsMessage.answerSection.size());
            this.answerSection = arrayList2;
            arrayList2.addAll(dnsMessage.answerSection);
            ArrayList arrayList3 = new ArrayList(dnsMessage.authoritySection.size());
            this.authoritySection = arrayList3;
            arrayList3.addAll(dnsMessage.authoritySection);
            ArrayList arrayList4 = new ArrayList(dnsMessage.additionalSection.size());
            this.additionalSection = arrayList4;
            arrayList4.addAll(dnsMessage.additionalSection);
        }

        public /* synthetic */ Builder(DnsMessage dnsMessage, C71911 c71911) {
            this(dnsMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToStringBuilder(StringBuilder sb2) {
            sb2.append('(');
            sb2.append(this.f36213id);
            sb2.append(' ');
            sb2.append(this.opcode);
            sb2.append(' ');
            sb2.append(this.responseCode);
            sb2.append(' ');
            sb2.append(this.query ? "resp[qr=1]" : "query[qr=0]");
            if (this.authoritativeAnswer) {
                sb2.append(" aa");
            }
            if (this.truncated) {
                sb2.append(" tr");
            }
            if (this.recursionDesired) {
                sb2.append(" rd");
            }
            if (this.recursionAvailable) {
                sb2.append(" ra");
            }
            if (this.authenticData) {
                sb2.append(" ad");
            }
            if (this.checkingDisabled) {
                sb2.append(" cd");
            }
            sb2.append(")\n");
            List<Question> list = this.questions;
            if (list != null) {
                for (Object obj : list) {
                    sb2.append("[Q: ");
                    sb2.append(obj);
                    sb2.append("]\n");
                }
            }
            List<Record<? extends Data>> list2 = this.answerSection;
            if (list2 != null) {
                for (Object obj2 : list2) {
                    sb2.append("[A: ");
                    sb2.append(obj2);
                    sb2.append("]\n");
                }
            }
            List<Record<? extends Data>> list3 = this.authoritySection;
            if (list3 != null) {
                for (Object obj3 : list3) {
                    sb2.append("[N: ");
                    sb2.append(obj3);
                    sb2.append("]\n");
                }
            }
            List<Record<? extends Data>> list4 = this.additionalSection;
            if (list4 != null) {
                for (Record<? extends Data> record : list4) {
                    sb2.append("[X: ");
                    Edns fromRecord = Edns.fromRecord(record);
                    if (fromRecord != null) {
                        sb2.append(fromRecord.toString());
                    } else {
                        sb2.append(record);
                    }
                    sb2.append("]\n");
                }
            }
            if (sb2.charAt(sb2.length() - 1) == '\n') {
                sb2.setLength(sb2.length() - 1);
            }
        }

        public Builder addAdditionalResourceRecord(Record<? extends Data> record) {
            if (this.additionalSection == null) {
                this.additionalSection = new ArrayList();
            }
            this.additionalSection.add(record);
            return this;
        }

        public Builder addAdditionalResourceRecords(List<Record<? extends Data>> list) {
            if (this.additionalSection == null) {
                this.additionalSection = new ArrayList(list.size());
            }
            this.additionalSection.addAll(list);
            return this;
        }

        public Builder addAnswer(Record<? extends Data> record) {
            if (this.answerSection == null) {
                this.answerSection = new ArrayList(1);
            }
            this.answerSection.add(record);
            return this;
        }

        public Builder addAnswers(Collection<Record<? extends Data>> collection) {
            if (this.answerSection == null) {
                this.answerSection = new ArrayList(collection.size());
            }
            this.answerSection.addAll(collection);
            return this;
        }

        public Builder addNameserverRecords(Record<? extends Data> record) {
            if (this.authoritySection == null) {
                this.authoritySection = new ArrayList(8);
            }
            this.authoritySection.add(record);
            return this;
        }

        public Builder addQuestion(Question question) {
            if (this.questions == null) {
                this.questions = new ArrayList(1);
            }
            this.questions.add(question);
            return this;
        }

        public DnsMessage build() {
            return new DnsMessage(this);
        }

        public void copyFlagsFrom(DnsMessage dnsMessage) {
            this.query = dnsMessage.f36212qr;
            boolean z10 = dnsMessage.authenticData;
            this.authoritativeAnswer = z10;
            this.truncated = dnsMessage.truncated;
            this.recursionDesired = dnsMessage.recursionDesired;
            this.recursionAvailable = dnsMessage.recursionAvailable;
            this.authenticData = z10;
            this.checkingDisabled = dnsMessage.checkingDisabled;
        }

        public List<Record<? extends Data>> getAdditionalResourceRecords() {
            List<Record<? extends Data>> list = this.additionalSection;
            List<Record<? extends Data>> list2 = list;
            if (list == null) {
                list2 = Collections.emptyList();
            }
            return list2;
        }

        public List<Record<? extends Data>> getAnswers() {
            List<Record<? extends Data>> list = this.answerSection;
            List<Record<? extends Data>> list2 = list;
            if (list == null) {
                list2 = Collections.emptyList();
            }
            return list2;
        }

        public Edns.Builder getEdnsBuilder() {
            if (this.ednsBuilder == null) {
                this.ednsBuilder = Edns.builder();
            }
            return this.ednsBuilder;
        }

        public Builder setAdditionalResourceRecords(Collection<Record<? extends Data>> collection) {
            ArrayList arrayList = new ArrayList(collection.size());
            this.additionalSection = arrayList;
            arrayList.addAll(collection);
            return this;
        }

        public Builder setAnswers(Collection<Record<? extends Data>> collection) {
            ArrayList arrayList = new ArrayList(collection.size());
            this.answerSection = arrayList;
            arrayList.addAll(collection);
            return this;
        }

        public Builder setAuthenticData(boolean z10) {
            this.authenticData = z10;
            return this;
        }

        public Builder setAuthoritativeAnswer(boolean z10) {
            this.authoritativeAnswer = z10;
            return this;
        }

        @Deprecated
        public Builder setCheckDisabled(boolean z10) {
            this.checkingDisabled = z10;
            return this;
        }

        public Builder setCheckingDisabled(boolean z10) {
            this.checkingDisabled = z10;
            return this;
        }

        public Builder setId(int i10) {
            this.f36213id = i10 & CharacterReader.EOF;
            return this;
        }

        public Builder setNameserverRecords(Collection<Record<? extends Data>> collection) {
            ArrayList arrayList = new ArrayList(collection.size());
            this.authoritySection = arrayList;
            arrayList.addAll(collection);
            return this;
        }

        public Builder setOpcode(OPCODE opcode) {
            this.opcode = opcode;
            return this;
        }

        public Builder setQrFlag(boolean z10) {
            this.query = z10;
            return this;
        }

        public Builder setQuestion(Question question) {
            ArrayList arrayList = new ArrayList(1);
            this.questions = arrayList;
            arrayList.add(question);
            return this;
        }

        public Builder setQuestions(List<Question> list) {
            this.questions = list;
            return this;
        }

        public Builder setReceiveTimestamp(long j10) {
            this.receiveTimestamp = j10;
            return this;
        }

        public Builder setRecursionAvailable(boolean z10) {
            this.recursionAvailable = z10;
            return this;
        }

        public Builder setRecursionDesired(boolean z10) {
            this.recursionDesired = z10;
            return this;
        }

        public Builder setResponseCode(RESPONSE_CODE response_code) {
            this.responseCode = response_code;
            return this;
        }

        public Builder setTruncated(boolean z10) {
            this.truncated = z10;
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Builder of DnsMessage");
            writeToStringBuilder(sb2);
            return sb2.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Found several "values" enum fields: [] */
    /* loaded from: combined.jar:classes3.jar:org/minidns/dnsmessage/DnsMessage$OPCODE.class */
    public static final class OPCODE {
        private static final OPCODE[] $VALUES;
        private static final OPCODE[] INVERSE_LUT;
        public static final OPCODE INVERSE_QUERY;
        public static final OPCODE NOTIFY;
        public static final OPCODE QUERY;
        public static final OPCODE STATUS;
        public static final OPCODE UNASSIGNED3;
        public static final OPCODE UPDATE;
        private final byte value = (byte) ordinal();

        static {
            OPCODE opcode = new OPCODE("QUERY", 0);
            QUERY = opcode;
            OPCODE opcode2 = new OPCODE("INVERSE_QUERY", 1);
            INVERSE_QUERY = opcode2;
            OPCODE opcode3 = new OPCODE("STATUS", 2);
            STATUS = opcode3;
            OPCODE opcode4 = new OPCODE("UNASSIGNED3", 3);
            UNASSIGNED3 = opcode4;
            OPCODE opcode5 = new OPCODE("NOTIFY", 4);
            NOTIFY = opcode5;
            OPCODE opcode6 = new OPCODE("UPDATE", 5);
            UPDATE = opcode6;
            $VALUES = new OPCODE[]{opcode, opcode2, opcode3, opcode4, opcode5, opcode6};
            INVERSE_LUT = new OPCODE[values().length];
            for (OPCODE opcode7 : values()) {
                OPCODE[] opcodeArr = INVERSE_LUT;
                if (opcodeArr[opcode7.getValue()] != null) {
                    throw new IllegalStateException();
                }
                opcodeArr[opcode7.getValue()] = opcode7;
            }
        }

        private OPCODE(String str, int i10) {
        }

        public static OPCODE getOpcode(int i10) {
            if (i10 < 0 || i10 > 15) {
                throw new IllegalArgumentException();
            }
            OPCODE[] opcodeArr = INVERSE_LUT;
            if (i10 >= opcodeArr.length) {
                return null;
            }
            return opcodeArr[i10];
        }

        public static OPCODE valueOf(String str) {
            return (OPCODE) Enum.valueOf(OPCODE.class, str);
        }

        public static OPCODE[] values() {
            return (OPCODE[]) $VALUES.clone();
        }

        public byte getValue() {
            return this.value;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/minidns/dnsmessage/DnsMessage$RESPONSE_CODE.class */
    public enum RESPONSE_CODE {
        NO_ERROR(0),
        FORMAT_ERR(1),
        SERVER_FAIL(2),
        NX_DOMAIN(3),
        NO_IMP(4),
        REFUSED(5),
        YXDOMAIN(6),
        YXRRSET(7),
        NXRRSET(8),
        NOT_AUTH(9),
        NOT_ZONE(10),
        BADVERS_BADSIG(16),
        BADKEY(17),
        BADTIME(18),
        BADMODE(19),
        BADNAME(20),
        BADALG(21),
        BADTRUNC(22),
        BADCOOKIE(23);

        private static final Map<Integer, RESPONSE_CODE> INVERSE_LUT = new HashMap(values().length);
        private final byte value;

        static {
            for (RESPONSE_CODE response_code : values()) {
                INVERSE_LUT.put(Integer.valueOf(response_code.value), response_code);
            }
        }

        RESPONSE_CODE(int i10) {
            this.value = (byte) i10;
        }

        public static RESPONSE_CODE getResponseCode(int i10) {
            if (i10 < 0 || i10 > 65535) {
                throw new IllegalArgumentException();
            }
            return INVERSE_LUT.get(Integer.valueOf(i10));
        }

        public byte getValue() {
            return this.value;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/minidns/dnsmessage/DnsMessage$SectionName.class */
    public enum SectionName {
        answer,
        authority,
        additional
    }

    public DnsMessage(Builder builder) {
        List<Question> unmodifiableList;
        List<Record<? extends Data>> unmodifiableList2;
        List<Record<? extends Data>> unmodifiableList3;
        List<Record<? extends Data>> unmodifiableList4;
        this.answersMinTtlCache = -1L;
        this.f36211id = builder.f36213id;
        this.opcode = builder.opcode;
        this.responseCode = builder.responseCode;
        this.receiveTimestamp = builder.receiveTimestamp;
        this.f36212qr = builder.query;
        this.authoritativeAnswer = builder.authoritativeAnswer;
        this.truncated = builder.truncated;
        this.recursionDesired = builder.recursionDesired;
        this.recursionAvailable = builder.recursionAvailable;
        this.authenticData = builder.authenticData;
        this.checkingDisabled = builder.checkingDisabled;
        if (builder.questions == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(builder.questions.size());
            arrayList.addAll(builder.questions);
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.questions = unmodifiableList;
        if (builder.answerSection == null) {
            unmodifiableList2 = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(builder.answerSection.size());
            arrayList2.addAll(builder.answerSection);
            unmodifiableList2 = Collections.unmodifiableList(arrayList2);
        }
        this.answerSection = unmodifiableList2;
        if (builder.authoritySection == null) {
            unmodifiableList3 = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(builder.authoritySection.size());
            arrayList3.addAll(builder.authoritySection);
            unmodifiableList3 = Collections.unmodifiableList(arrayList3);
        }
        this.authoritySection = unmodifiableList3;
        if (builder.additionalSection == null && builder.ednsBuilder == null) {
            unmodifiableList4 = Collections.emptyList();
        } else {
            int size = builder.additionalSection != null ? 0 + builder.additionalSection.size() : 0;
            ArrayList arrayList4 = new ArrayList(builder.ednsBuilder != null ? size + 1 : size);
            if (builder.additionalSection != null) {
                arrayList4.addAll(builder.additionalSection);
            }
            if (builder.ednsBuilder != null) {
                Edns build = builder.ednsBuilder.build();
                this.edns = build;
                arrayList4.add(build.asRecord());
            }
            unmodifiableList4 = Collections.unmodifiableList(arrayList4);
        }
        this.additionalSection = unmodifiableList4;
        int optRrPosition = getOptRrPosition(this.additionalSection);
        this.optRrPosition = optRrPosition;
        if (optRrPosition != -1) {
            do {
                optRrPosition++;
                if (optRrPosition >= this.additionalSection.size()) {
                    return;
                }
            } while (this.additionalSection.get(optRrPosition).type != Record.TYPE.OPT);
            throw new IllegalArgumentException("There must be only one OPT pseudo RR in the additional section");
        }
    }

    private DnsMessage(DnsMessage dnsMessage) {
        this.answersMinTtlCache = -1L;
        this.f36211id = 0;
        this.f36212qr = dnsMessage.f36212qr;
        this.opcode = dnsMessage.opcode;
        this.authoritativeAnswer = dnsMessage.authoritativeAnswer;
        this.truncated = dnsMessage.truncated;
        this.recursionDesired = dnsMessage.recursionDesired;
        this.recursionAvailable = dnsMessage.recursionAvailable;
        this.authenticData = dnsMessage.authenticData;
        this.checkingDisabled = dnsMessage.checkingDisabled;
        this.responseCode = dnsMessage.responseCode;
        this.receiveTimestamp = dnsMessage.receiveTimestamp;
        this.questions = dnsMessage.questions;
        this.answerSection = dnsMessage.answerSection;
        this.authoritySection = dnsMessage.authoritySection;
        this.additionalSection = dnsMessage.additionalSection;
        this.optRrPosition = dnsMessage.optRrPosition;
    }

    public DnsMessage(byte[] bArr) {
        this.answersMinTtlCache = -1L;
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f36211id = dataInputStream.readUnsignedShort();
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        this.f36212qr = ((readUnsignedShort >> 15) & 1) == 1;
        this.opcode = OPCODE.getOpcode((readUnsignedShort >> 11) & 15);
        this.authoritativeAnswer = ((readUnsignedShort >> 10) & 1) == 1;
        this.truncated = ((readUnsignedShort >> 9) & 1) == 1;
        this.recursionDesired = ((readUnsignedShort >> 8) & 1) == 1;
        this.recursionAvailable = ((readUnsignedShort >> 7) & 1) == 1;
        this.authenticData = ((readUnsignedShort >> 5) & 1) == 1;
        this.checkingDisabled = ((readUnsignedShort >> 4) & 1) == 1;
        this.responseCode = RESPONSE_CODE.getResponseCode(readUnsignedShort & 15);
        this.receiveTimestamp = System.currentTimeMillis();
        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
        int readUnsignedShort3 = dataInputStream.readUnsignedShort();
        int readUnsignedShort4 = dataInputStream.readUnsignedShort();
        int readUnsignedShort5 = dataInputStream.readUnsignedShort();
        this.questions = new ArrayList(readUnsignedShort2);
        for (int i10 = 0; i10 < readUnsignedShort2; i10++) {
            this.questions.add(new Question(dataInputStream, bArr));
        }
        this.answerSection = new ArrayList(readUnsignedShort3);
        for (int i11 = 0; i11 < readUnsignedShort3; i11++) {
            this.answerSection.add(Record.parse(dataInputStream, bArr));
        }
        this.authoritySection = new ArrayList(readUnsignedShort4);
        for (int i12 = 0; i12 < readUnsignedShort4; i12++) {
            this.authoritySection.add(Record.parse(dataInputStream, bArr));
        }
        this.additionalSection = new ArrayList(readUnsignedShort5);
        for (int i13 = 0; i13 < readUnsignedShort5; i13++) {
            this.additionalSection.add(Record.parse(dataInputStream, bArr));
        }
        this.optRrPosition = getOptRrPosition(this.additionalSection);
    }

    public static Builder builder() {
        return new Builder((C71911) null);
    }

    private <D extends Data> List<Record<D>> filterSectionByType(SectionName sectionName, Class<D> cls) {
        return filterSectionByType(false, sectionName, cls);
    }

    private <D extends Data> List<Record<D>> filterSectionByType(boolean z10, SectionName sectionName, Class<D> cls) {
        List<Record<? extends Data>> list;
        int i10 = C71911.$SwitchMap$org$minidns$dnsmessage$DnsMessage$SectionName[sectionName.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            list = this.answerSection;
        } else if (i10 == 2) {
            list = this.authoritySection;
        } else {
            if (i10 != 3) {
                throw new AssertionError("Unknown section name " + sectionName);
            }
            list = this.additionalSection;
        }
        if (!z10) {
            i11 = list.size();
        }
        ArrayList arrayList = new ArrayList(i11);
        Iterator<Record<? extends Data>> it = list.iterator();
        while (it.hasNext()) {
            Object ifPossibleAs = it.next().ifPossibleAs(cls);
            if (ifPossibleAs != null) {
                arrayList.add(ifPossibleAs);
                if (z10) {
                    break;
                }
            }
        }
        return arrayList;
    }

    private <D extends Data> Record<D> getFirstOfType(SectionName sectionName, Class<D> cls) {
        List<Record<D>> filterSectionByType = filterSectionByType(true, sectionName, cls);
        if (filterSectionByType.isEmpty()) {
            return null;
        }
        return filterSectionByType.get(0);
    }

    private static int getOptRrPosition(List<Record<? extends Data>> list) {
        int i10 = 0;
        while (true) {
            if (i10 >= list.size()) {
                i10 = -1;
                break;
            }
            if (list.get(i10).type == Record.TYPE.OPT) {
                break;
            }
            i10++;
        }
        return i10;
    }

    private byte[] serialize() {
        byte[] bArr = this.byteCache;
        if (bArr != null) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        int calculateHeaderBitmap = calculateHeaderBitmap();
        try {
            dataOutputStream.writeShort((short) this.f36211id);
            dataOutputStream.writeShort((short) calculateHeaderBitmap);
            List<Question> list = this.questions;
            if (list == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort((short) list.size());
            }
            List<Record<? extends Data>> list2 = this.answerSection;
            if (list2 == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort((short) list2.size());
            }
            List<Record<? extends Data>> list3 = this.authoritySection;
            if (list3 == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort((short) list3.size());
            }
            List<Record<? extends Data>> list4 = this.additionalSection;
            if (list4 == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort((short) list4.size());
            }
            List<Question> list5 = this.questions;
            if (list5 != null) {
                Iterator<Question> it = list5.iterator();
                while (it.hasNext()) {
                    dataOutputStream.write(it.next().toByteArray());
                }
            }
            List<Record<? extends Data>> list6 = this.answerSection;
            if (list6 != null) {
                Iterator<Record<? extends Data>> it2 = list6.iterator();
                while (it2.hasNext()) {
                    dataOutputStream.write(it2.next().toByteArray());
                }
            }
            List<Record<? extends Data>> list7 = this.authoritySection;
            if (list7 != null) {
                Iterator<Record<? extends Data>> it3 = list7.iterator();
                while (it3.hasNext()) {
                    dataOutputStream.write(it3.next().toByteArray());
                }
            }
            List<Record<? extends Data>> list8 = this.additionalSection;
            if (list8 != null) {
                Iterator<Record<? extends Data>> it4 = list8.iterator();
                while (it4.hasNext()) {
                    dataOutputStream.write(it4.next().toByteArray());
                }
            }
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            this.byteCache = byteArray;
            return byteArray;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public Builder asBuilder() {
        return new Builder(this, null);
    }

    public DatagramPacket asDatagram(InetAddress inetAddress, int i10) {
        byte[] serialize = serialize();
        return new DatagramPacket(serialize, serialize.length, inetAddress, i10);
    }

    public DnsMessage asNormalizedVersion() {
        if (this.normalizedVersionCache == null) {
            this.normalizedVersionCache = new DnsMessage(this);
        }
        return this.normalizedVersionCache;
    }

    public String asTerminalOutput() {
        String str = this.terminalOutputCache;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(";; ->>HEADER<<-");
        sb2.append(" opcode: ");
        sb2.append(this.opcode);
        sb2.append(", status: ");
        sb2.append(this.responseCode);
        sb2.append(", id: ");
        sb2.append(this.f36211id);
        sb2.append("\n");
        sb2.append(";; flags:");
        if (!this.f36212qr) {
            sb2.append(" qr");
        }
        if (this.authoritativeAnswer) {
            sb2.append(" aa");
        }
        if (this.truncated) {
            sb2.append(" tr");
        }
        if (this.recursionDesired) {
            sb2.append(" rd");
        }
        if (this.recursionAvailable) {
            sb2.append(" ra");
        }
        if (this.authenticData) {
            sb2.append(" ad");
        }
        if (this.checkingDisabled) {
            sb2.append(" cd");
        }
        sb2.append("; QUERY: ");
        sb2.append(this.questions.size());
        sb2.append(", ANSWER: ");
        sb2.append(this.answerSection.size());
        sb2.append(", AUTHORITY: ");
        sb2.append(this.authoritySection.size());
        sb2.append(", ADDITIONAL: ");
        sb2.append(this.additionalSection.size());
        sb2.append("\n\n");
        Iterator<Record<? extends Data>> it = this.additionalSection.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Edns fromRecord = Edns.fromRecord(it.next());
            if (fromRecord != null) {
                sb2.append(";; OPT PSEUDOSECTION:\n; ");
                sb2.append(fromRecord.asTerminalOutput());
                break;
            }
        }
        if (this.questions.size() != 0) {
            sb2.append(";; QUESTION SECTION:\n");
            for (Question question : this.questions) {
                sb2.append(';');
                sb2.append(question.toString());
                sb2.append('\n');
            }
        }
        if (this.authoritySection.size() != 0) {
            sb2.append("\n;; AUTHORITY SECTION:\n");
            Iterator<Record<? extends Data>> it2 = this.authoritySection.iterator();
            while (it2.hasNext()) {
                sb2.append(it2.next().toString());
                sb2.append('\n');
            }
        }
        if (this.answerSection.size() != 0) {
            sb2.append("\n;; ANSWER SECTION:\n");
            Iterator<Record<? extends Data>> it3 = this.answerSection.iterator();
            while (it3.hasNext()) {
                sb2.append(it3.next().toString());
                sb2.append('\n');
            }
        }
        if (this.additionalSection.size() != 0) {
            boolean z10 = false;
            for (Record<? extends Data> record : this.additionalSection) {
                if (record.type != Record.TYPE.OPT) {
                    boolean z11 = z10;
                    if (!z10) {
                        z11 = true;
                        sb2.append("\n;; ADDITIONAL SECTION:\n");
                    }
                    sb2.append(record.toString());
                    sb2.append('\n');
                    z10 = z11;
                }
            }
        }
        if (this.receiveTimestamp > 0) {
            sb2.append("\n;; WHEN: ");
            sb2.append(new Date(this.receiveTimestamp).toString());
        }
        String sb3 = sb2.toString();
        this.terminalOutputCache = sb3;
        return sb3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [int] */
    /* JADX WARN: Type inference failed for: r0v33, types: [int] */
    /* JADX WARN: Type inference failed for: r0v35, types: [int] */
    /* JADX WARN: Type inference failed for: r0v37, types: [int] */
    /* JADX WARN: Type inference failed for: r0v39, types: [int] */
    /* JADX WARN: Type inference failed for: r0v41, types: [int] */
    /* JADX WARN: Type inference failed for: r0v43, types: [int] */
    /* JADX WARN: Type inference failed for: r0v45, types: [int] */
    public int calculateHeaderBitmap() {
        byte b10 = this.f36212qr ? (byte) 32768 : (byte) 0;
        OPCODE opcode = this.opcode;
        byte b11 = b10;
        if (opcode != null) {
            b11 = b10 + (opcode.getValue() << 11);
        }
        byte b12 = b11;
        if (this.authoritativeAnswer) {
            b12 = b11 + 1024;
        }
        byte b13 = b12;
        if (this.truncated) {
            b13 = b12 + 512;
        }
        byte b14 = b13;
        if (this.recursionDesired) {
            b14 = b13 + 256;
        }
        byte b15 = b14;
        if (this.recursionAvailable) {
            b15 = b14 + 128;
        }
        byte b16 = b15;
        if (this.authenticData) {
            b16 = b15 + 32;
        }
        byte b17 = b16;
        if (this.checkingDisabled) {
            b17 = b16 + 16;
        }
        RESPONSE_CODE response_code = this.responseCode;
        byte b18 = b17;
        if (response_code != null) {
            b18 = b17 + response_code.getValue();
        }
        return b18;
    }

    public List<Record<? extends Data>> copyAnswers() {
        ArrayList arrayList = new ArrayList(this.answerSection.size());
        arrayList.addAll(this.answerSection);
        return arrayList;
    }

    public List<Record<? extends Data>> copyAuthority() {
        ArrayList arrayList = new ArrayList(this.authoritySection.size());
        arrayList.addAll(this.authoritySection);
        return arrayList;
    }

    public List<Question> copyQuestions() {
        ArrayList arrayList = new ArrayList(this.questions.size());
        arrayList.addAll(this.questions);
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DnsMessage)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return Arrays.equals(serialize(), ((DnsMessage) obj).serialize());
    }

    public <D extends Data> List<Record<D>> filterAdditionalSectionBy(Class<D> cls) {
        return filterSectionByType(SectionName.additional, cls);
    }

    public <D extends Data> List<Record<D>> filterAnswerSectionBy(Class<D> cls) {
        return filterSectionByType(SectionName.answer, cls);
    }

    public <D extends Data> List<Record<D>> filterAuthoritySectionBy(Class<D> cls) {
        return filterSectionByType(SectionName.authority, cls);
    }

    public <D extends Data> Set<D> getAnswersFor(Question question) {
        if (this.responseCode != RESPONSE_CODE.NO_ERROR) {
            return null;
        }
        HashSet hashSet = new HashSet(this.answerSection.size());
        for (Record<? extends Data> record : this.answerSection) {
            if (record.isAnswer(question) && !hashSet.add(record.getPayload())) {
                LOGGER.log(Level.WARNING, "DnsMessage contains duplicate answers. Record: " + record + "; DnsMessage: " + this);
            }
        }
        return hashSet;
    }

    public long getAnswersMinTtl() {
        long j10 = this.answersMinTtlCache;
        if (j10 >= 0) {
            return j10;
        }
        this.answersMinTtlCache = Long.MAX_VALUE;
        Iterator<Record<? extends Data>> it = this.answerSection.iterator();
        while (it.hasNext()) {
            this.answersMinTtlCache = Math.min(this.answersMinTtlCache, it.next().ttl);
        }
        return this.answersMinTtlCache;
    }

    public Edns getEdns() {
        Edns edns = this.edns;
        if (edns != null) {
            return edns;
        }
        Record<OPT> optPseudoRecord = getOptPseudoRecord();
        if (optPseudoRecord == null) {
            return null;
        }
        Edns edns2 = new Edns(optPseudoRecord);
        this.edns = edns2;
        return edns2;
    }

    public <D extends Data> Record<D> getFirstOfTypeFromAdditionalSection(Class<D> cls) {
        return getFirstOfType(SectionName.additional, cls);
    }

    public <D extends Data> Record<D> getFirstOfTypeFromAnswerSection(Class<D> cls) {
        return getFirstOfType(SectionName.answer, cls);
    }

    public <D extends Data> Record<D> getFirstOfTypeFromAuthoritySection(Class<D> cls) {
        return getFirstOfType(SectionName.authority, cls);
    }

    public ByteBuffer getInByteBuffer() {
        return ByteBuffer.wrap((byte[]) serialize().clone());
    }

    public Record<OPT> getOptPseudoRecord() {
        int i10 = this.optRrPosition;
        if (i10 == -1) {
            return null;
        }
        return (Record) this.additionalSection.get(i10);
    }

    public Question getQuestion() {
        return this.questions.get(0);
    }

    public Builder getResponseBuilder(RESPONSE_CODE response_code) {
        if (this.f36212qr) {
            throw new IllegalStateException();
        }
        return builder().setQrFlag(true).setResponseCode(response_code).setId(this.f36211id).setQuestion(getQuestion());
    }

    public int hashCode() {
        if (this.hashCodeCache == null) {
            this.hashCodeCache = Integer.valueOf(Arrays.hashCode(serialize()));
        }
        return this.hashCodeCache.intValue();
    }

    public boolean isDnssecOk() {
        Edns edns = getEdns();
        if (edns == null) {
            return false;
        }
        return edns.dnssecOk;
    }

    public byte[] toArray() {
        return (byte[]) serialize().clone();
    }

    public String toString() {
        String str = this.toStringCache;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder("DnsMessage");
        asBuilder().writeToStringBuilder(sb2);
        String sb3 = sb2.toString();
        this.toStringCache = sb3;
        return sb3;
    }

    public void writeTo(OutputStream outputStream) {
        writeTo(outputStream, true);
    }

    public void writeTo(OutputStream outputStream, boolean z10) {
        byte[] serialize = serialize();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        if (z10) {
            dataOutputStream.writeShort(serialize.length);
        }
        dataOutputStream.write(serialize);
    }
}
