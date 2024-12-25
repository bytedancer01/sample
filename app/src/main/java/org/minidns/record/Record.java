package org.minidns.record;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.minidns.dnsmessage.DnsMessage;
import org.minidns.dnsmessage.Question;
import org.minidns.dnsname.DnsName;
import org.minidns.record.Data;

/* loaded from: combined.jar:classes3.jar:org/minidns/record/Record.class */
public final class Record<D extends Data> {
    private transient byte[] bytes;
    public final CLASS clazz;
    public final int clazzValue;
    private transient Integer hashCodeCache;
    public final DnsName name;
    public final D payloadData;
    public final long ttl;
    public final TYPE type;
    public final boolean unicastQuery;

    /* renamed from: org.minidns.record.Record$1 */
    /* loaded from: combined.jar:classes3.jar:org/minidns/record/Record$1.class */
    public static /* synthetic */ class C71991 {
        public static final int[] $SwitchMap$org$minidns$record$Record$TYPE;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:141:0x014d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                Method dump skipped, instructions count: 341
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.minidns.record.Record.C71991.m45521clinit():void");
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/minidns/record/Record$CLASS.class */
    public enum CLASS {
        IN(1),
        CH(3),
        HS(4),
        NONE(TelnetCommand.DONT),
        ANY(255);

        private static final HashMap<Integer, CLASS> INVERSE_LUT = new HashMap<>();
        private final int value;

        static {
            for (CLASS r02 : values()) {
                INVERSE_LUT.put(Integer.valueOf(r02.getValue()), r02);
            }
        }

        CLASS(int i10) {
            this.value = i10;
        }

        public static CLASS getClass(int i10) {
            return INVERSE_LUT.get(Integer.valueOf(i10));
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/minidns/record/Record$TYPE.class */
    public enum TYPE {
        UNKNOWN(-1),
        A(1, C7194A.class),
        NS(2, C7198NS.class),
        MD(3),
        MF(4),
        CNAME(5, CNAME.class),
        SOA(6, SOA.class),
        MB(7),
        MG(8),
        MR(9),
        NULL(10),
        WKS(11),
        PTR(12, PTR.class),
        HINFO(13),
        MINFO(14),
        MX(15, C7197MX.class),
        TXT(16, TXT.class),
        RP(17),
        AFSDB(18),
        X25(19),
        ISDN(20),
        RT(21),
        NSAP(22),
        NSAP_PTR(23),
        SIG(24),
        KEY(25),
        PX(26),
        GPOS(27),
        AAAA(28, AAAA.class),
        LOC(29),
        NXT(30),
        EID(31),
        NIMLOC(32),
        SRV(33, SRV.class),
        ATMA(34),
        NAPTR(35),
        KX(36),
        CERT(37),
        A6(38),
        DNAME(39, DNAME.class),
        SINK(40),
        OPT(41, OPT.class),
        APL(42),
        DS(43, C7195DS.class),
        SSHFP(44),
        IPSECKEY(45),
        RRSIG(46, RRSIG.class),
        NSEC(47, NSEC.class),
        DNSKEY(48, DNSKEY.class),
        DHCID(49),
        NSEC3(50, NSEC3.class),
        NSEC3PARAM(51, NSEC3PARAM.class),
        TLSA(52, TLSA.class),
        HIP(55),
        NINFO(56),
        RKEY(57),
        TALINK(58),
        CDS(59),
        CDNSKEY(60),
        OPENPGPKEY(61, OPENPGPKEY.class),
        CSYNC(62),
        SPF(99),
        UINFO(100),
        UID(101),
        GID(102),
        UNSPEC(103),
        NID(104),
        L32(105),
        L64(106),
        LP(107),
        EUI48(108),
        EUI64(109),
        TKEY(TelnetCommand.f36140GA),
        TSIG(250),
        IXFR(251),
        AXFR(TelnetCommand.WONT),
        MAILB(TelnetCommand.f36137DO),
        MAILA(TelnetCommand.DONT),
        ANY(255),
        URI(256),
        CAA(FTPReply.PATHNAME_CREATED),
        TA(32768),
        DLV(32769, DLV.class);

        private final Class<?> dataClass;
        private final int value;
        private static final Map<Integer, TYPE> INVERSE_LUT = new HashMap();
        private static final Map<Class<?>, TYPE> DATA_LUT = new HashMap();

        static {
            for (TYPE type : values()) {
                INVERSE_LUT.put(Integer.valueOf(type.getValue()), type);
                Class<?> cls = type.dataClass;
                if (cls != null) {
                    DATA_LUT.put(cls, type);
                }
            }
        }

        TYPE(int i10) {
            this(i10, null);
        }

        TYPE(int i10, Class cls) {
            this.value = i10;
            this.dataClass = cls;
        }

        public static TYPE getType(int i10) {
            TYPE type = INVERSE_LUT.get(Integer.valueOf(i10));
            TYPE type2 = type;
            if (type == null) {
                type2 = UNKNOWN;
            }
            return type2;
        }

        public static <D extends Data> TYPE getType(Class<D> cls) {
            return DATA_LUT.get(cls);
        }

        public <D extends Data> Class<D> getDataClass() {
            return (Class<D>) this.dataClass;
        }

        public int getValue() {
            return this.value;
        }
    }

    public Record(String str, TYPE type, int i10, long j10, D d10) {
        this(DnsName.from(str), type, CLASS.NONE, i10, j10, d10, false);
    }

    public Record(String str, TYPE type, CLASS r12, long j10, D d10, boolean z10) {
        this(DnsName.from(str), type, r12, j10, d10, z10);
    }

    public Record(DnsName dnsName, TYPE type, int i10, long j10, D d10) {
        this(dnsName, type, CLASS.NONE, i10, j10, d10, false);
    }

    private Record(DnsName dnsName, TYPE type, CLASS r72, int i10, long j10, D d10, boolean z10) {
        this.name = dnsName;
        this.type = type;
        this.clazz = r72;
        this.clazzValue = i10;
        this.ttl = j10;
        this.payloadData = d10;
        this.unicastQuery = z10;
    }

    public Record(DnsName dnsName, TYPE type, CLASS r13, long j10, D d10, boolean z10) {
        this(dnsName, type, r13, r13.getValue() + (z10 ? 32768 : 0), j10, d10, z10);
    }

    public static <E extends Data> List<Record<E>> filter(Class<E> cls, Collection<Record<? extends Data>> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        filter(arrayList, cls, collection);
        return arrayList;
    }

    public static <E extends Data> void filter(Collection<Record<E>> collection, Class<E> cls, Collection<Record<? extends Data>> collection2) {
        Iterator<Record<? extends Data>> it = collection2.iterator();
        while (it.hasNext()) {
            Record<E> ifPossibleAs = it.next().ifPossibleAs(cls);
            if (ifPossibleAs != null) {
                collection.add(ifPossibleAs);
            }
        }
    }

    public static Record<Data> parse(DataInputStream dataInputStream, byte[] bArr) {
        Data parse;
        DnsName parse2 = DnsName.parse(dataInputStream, bArr);
        TYPE type = TYPE.getType(dataInputStream.readUnsignedShort());
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        CLASS r02 = CLASS.getClass(readUnsignedShort & 32767);
        boolean z10 = (32768 & readUnsignedShort) > 0;
        long readUnsignedShort2 = dataInputStream.readUnsignedShort();
        long readUnsignedShort3 = dataInputStream.readUnsignedShort();
        int readUnsignedShort4 = dataInputStream.readUnsignedShort();
        switch (C71991.$SwitchMap$org$minidns$record$Record$TYPE[type.ordinal()]) {
            case 1:
                parse = SOA.parse(dataInputStream, bArr);
                break;
            case 2:
                parse = SRV.parse(dataInputStream, bArr);
                break;
            case 3:
                parse = C7197MX.parse(dataInputStream, bArr);
                break;
            case 4:
                parse = AAAA.parse(dataInputStream);
                break;
            case 5:
                parse = C7194A.parse(dataInputStream);
                break;
            case 6:
                parse = C7198NS.parse(dataInputStream, bArr);
                break;
            case 7:
                parse = CNAME.parse(dataInputStream, bArr);
                break;
            case 8:
                parse = DNAME.parse(dataInputStream, bArr);
                break;
            case 9:
                parse = PTR.parse(dataInputStream, bArr);
                break;
            case 10:
                parse = TXT.parse(dataInputStream, readUnsignedShort4);
                break;
            case 11:
                parse = OPT.parse(dataInputStream, readUnsignedShort4);
                break;
            case 12:
                parse = DNSKEY.parse(dataInputStream, readUnsignedShort4);
                break;
            case 13:
                parse = RRSIG.parse(dataInputStream, bArr, readUnsignedShort4);
                break;
            case 14:
                parse = C7195DS.parse(dataInputStream, readUnsignedShort4);
                break;
            case 15:
                parse = NSEC.parse(dataInputStream, bArr, readUnsignedShort4);
                break;
            case 16:
                parse = NSEC3.parse(dataInputStream, readUnsignedShort4);
                break;
            case 17:
                parse = NSEC3PARAM.parse(dataInputStream);
                break;
            case 18:
                parse = TLSA.parse(dataInputStream, readUnsignedShort4);
                break;
            case 19:
                parse = OPENPGPKEY.parse(dataInputStream, readUnsignedShort4);
                break;
            case 20:
                parse = DLV.parse(dataInputStream, readUnsignedShort4);
                break;
            default:
                parse = UNKNOWN.parse(dataInputStream, readUnsignedShort4, type);
                break;
        }
        return new Record<>(parse2, type, r02, readUnsignedShort, (readUnsignedShort2 << 16) + readUnsignedShort3, parse, z10);
    }

    /* renamed from: as */
    public <E extends Data> Record<E> m32157as(Class<E> cls) {
        Record<E> ifPossibleAs = ifPossibleAs(cls);
        if (ifPossibleAs != null) {
            return ifPossibleAs;
        }
        throw new IllegalArgumentException("The instance " + this + " can not be cast to a Record with" + cls);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Record)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Record record = (Record) obj;
        return this.name.equals(record.name) && this.type == record.type && this.clazz == record.clazz && this.payloadData.equals(record.payloadData);
    }

    public D getPayload() {
        return this.payloadData;
    }

    public Question getQuestion() {
        int i10 = C71991.$SwitchMap$org$minidns$record$Record$TYPE[this.type.ordinal()];
        if (i10 == 11) {
            return null;
        }
        if (i10 != 13) {
            return new Question(this.name, this.type, this.clazz);
        }
        return new Question(this.name, ((RRSIG) this.payloadData).typeCovered, this.clazz);
    }

    public DnsMessage.Builder getQuestionMessage() {
        Question question = getQuestion();
        if (question == null) {
            return null;
        }
        return question.asMessageBuilder();
    }

    public long getTtl() {
        return this.ttl;
    }

    public int hashCode() {
        if (this.hashCodeCache == null) {
            this.hashCodeCache = Integer.valueOf(((((((this.name.hashCode() + 37) * 37) + this.type.hashCode()) * 37) + this.clazz.hashCode()) * 37) + this.payloadData.hashCode());
        }
        return this.hashCodeCache.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends Data> Record<E> ifPossibleAs(Class<E> cls) {
        if (this.type.dataClass == cls) {
            return this;
        }
        return null;
    }

    public boolean isAnswer(Question question) {
        CLASS r02;
        TYPE type = question.type;
        return (type == this.type || type == TYPE.ANY) && ((r02 = question.clazz) == this.clazz || r02 == CLASS.ANY) && question.name.equals(this.name);
    }

    public boolean isUnicastQuery() {
        return this.unicastQuery;
    }

    public byte[] toByteArray() {
        if (this.bytes == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(this.name.size() + 10 + this.payloadData.length());
            try {
                toOutputStream(new DataOutputStream(byteArrayOutputStream));
                this.bytes = byteArrayOutputStream.toByteArray();
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
        return (byte[]) this.bytes.clone();
    }

    public void toOutputStream(OutputStream outputStream) {
        if (this.payloadData == null) {
            throw new IllegalStateException("Empty Record has no byte representation");
        }
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        this.name.writeToStream(dataOutputStream);
        dataOutputStream.writeShort(this.type.getValue());
        dataOutputStream.writeShort(this.clazzValue);
        dataOutputStream.writeInt((int) this.ttl);
        dataOutputStream.writeShort(this.payloadData.length());
        this.payloadData.toOutputStream(dataOutputStream);
    }

    public String toString() {
        return this.name.getRawAce() + ".\t" + this.ttl + '\t' + this.clazz + '\t' + this.type + '\t' + this.payloadData;
    }
}
