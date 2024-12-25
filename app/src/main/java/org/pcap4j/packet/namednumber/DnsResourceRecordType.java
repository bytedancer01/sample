package org.pcap4j.packet.namednumber;

import java.util.HashMap;
import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/DnsResourceRecordType.class */
public final class DnsResourceRecordType extends NamedNumber<Short, DnsResourceRecordType> {

    /* renamed from: A */
    public static final DnsResourceRecordType f36265A;

    /* renamed from: A6 */
    public static final DnsResourceRecordType f36266A6;
    public static final DnsResourceRecordType AAAA;
    public static final DnsResourceRecordType AFSDB;
    public static final DnsResourceRecordType ALL_RECORDS;
    public static final DnsResourceRecordType APL;
    public static final DnsResourceRecordType ATMA;
    public static final DnsResourceRecordType AVC;
    public static final DnsResourceRecordType AXFR;
    public static final DnsResourceRecordType CAA;
    public static final DnsResourceRecordType CDNSKEY;
    public static final DnsResourceRecordType CDS;
    public static final DnsResourceRecordType CERT;
    public static final DnsResourceRecordType CNAME;
    public static final DnsResourceRecordType CSYNC;
    public static final DnsResourceRecordType DHCID;
    public static final DnsResourceRecordType DLV;
    public static final DnsResourceRecordType DNAME;
    public static final DnsResourceRecordType DNSKEY;

    /* renamed from: DS */
    public static final DnsResourceRecordType f36267DS;
    public static final DnsResourceRecordType EID;
    public static final DnsResourceRecordType EUI48;
    public static final DnsResourceRecordType EUI64;
    public static final DnsResourceRecordType GID;
    public static final DnsResourceRecordType GPOS;
    public static final DnsResourceRecordType HINFO;
    public static final DnsResourceRecordType HIP;
    public static final DnsResourceRecordType IPSECKEY;
    public static final DnsResourceRecordType ISDN;
    public static final DnsResourceRecordType IXFR;
    public static final DnsResourceRecordType KEY;

    /* renamed from: KX */
    public static final DnsResourceRecordType f36268KX;
    public static final DnsResourceRecordType L32;
    public static final DnsResourceRecordType L64;
    public static final DnsResourceRecordType LOC;

    /* renamed from: LP */
    public static final DnsResourceRecordType f36269LP;
    public static final DnsResourceRecordType MAILA;
    public static final DnsResourceRecordType MAILB;

    /* renamed from: MB */
    public static final DnsResourceRecordType f36270MB;

    /* renamed from: MD */
    public static final DnsResourceRecordType f36271MD;

    /* renamed from: MF */
    public static final DnsResourceRecordType f36272MF;

    /* renamed from: MG */
    public static final DnsResourceRecordType f36273MG;
    public static final DnsResourceRecordType MINFO;

    /* renamed from: MR */
    public static final DnsResourceRecordType f36274MR;

    /* renamed from: MX */
    public static final DnsResourceRecordType f36275MX;
    public static final DnsResourceRecordType NAPTR;
    public static final DnsResourceRecordType NID;
    public static final DnsResourceRecordType NIMLOC;
    public static final DnsResourceRecordType NINFO;

    /* renamed from: NS */
    public static final DnsResourceRecordType f36276NS;
    public static final DnsResourceRecordType NSAP;
    public static final DnsResourceRecordType NSAP_PTR;
    public static final DnsResourceRecordType NSEC;
    public static final DnsResourceRecordType NSEC3;
    public static final DnsResourceRecordType NSEC3PARAM;
    public static final DnsResourceRecordType NULL;
    public static final DnsResourceRecordType NXT;
    public static final DnsResourceRecordType OPENPGPKEY;
    public static final DnsResourceRecordType OPT;
    public static final DnsResourceRecordType PTR;

    /* renamed from: PX */
    public static final DnsResourceRecordType f36277PX;
    public static final DnsResourceRecordType RKEY;

    /* renamed from: RP */
    public static final DnsResourceRecordType f36278RP;
    public static final DnsResourceRecordType RRSIG;

    /* renamed from: RT */
    public static final DnsResourceRecordType f36279RT;
    public static final DnsResourceRecordType SIG;
    public static final DnsResourceRecordType SINK;
    public static final DnsResourceRecordType SMIMEA;
    public static final DnsResourceRecordType SOA;
    public static final DnsResourceRecordType SPF;
    public static final DnsResourceRecordType SRV;
    public static final DnsResourceRecordType SSHFP;

    /* renamed from: TA */
    public static final DnsResourceRecordType f36280TA;
    public static final DnsResourceRecordType TALINK;
    public static final DnsResourceRecordType TKEY;
    public static final DnsResourceRecordType TLSA;
    public static final DnsResourceRecordType TSIG;
    public static final DnsResourceRecordType TXT;
    public static final DnsResourceRecordType UID;
    public static final DnsResourceRecordType UINFO;
    public static final DnsResourceRecordType UNSPEC;
    public static final DnsResourceRecordType URI;
    public static final DnsResourceRecordType WKS;
    public static final DnsResourceRecordType X25;
    private static final Map<Short, DnsResourceRecordType> registry;
    private static final long serialVersionUID = 513163065994381046L;

    static {
        DnsResourceRecordType dnsResourceRecordType = new DnsResourceRecordType((short) 1, "A (Host address)");
        f36265A = dnsResourceRecordType;
        DnsResourceRecordType dnsResourceRecordType2 = new DnsResourceRecordType((short) 2, "NS (Authoritative name server)");
        f36276NS = dnsResourceRecordType2;
        DnsResourceRecordType dnsResourceRecordType3 = new DnsResourceRecordType((short) 3, "MD (Mail destination)");
        f36271MD = dnsResourceRecordType3;
        DnsResourceRecordType dnsResourceRecordType4 = new DnsResourceRecordType((short) 4, "MF (Mail forwarder)");
        f36272MF = dnsResourceRecordType4;
        DnsResourceRecordType dnsResourceRecordType5 = new DnsResourceRecordType((short) 5, "CNAME (Canonical name for an alias)");
        CNAME = dnsResourceRecordType5;
        DnsResourceRecordType dnsResourceRecordType6 = new DnsResourceRecordType((short) 6, "SOA (Start of a zone of authority)");
        SOA = dnsResourceRecordType6;
        DnsResourceRecordType dnsResourceRecordType7 = new DnsResourceRecordType((short) 7, "MB (Mailbox domain name)");
        f36270MB = dnsResourceRecordType7;
        DnsResourceRecordType dnsResourceRecordType8 = new DnsResourceRecordType((short) 8, "MG (Mail group member)");
        f36273MG = dnsResourceRecordType8;
        DnsResourceRecordType dnsResourceRecordType9 = new DnsResourceRecordType((short) 9, "MR (Mail rename domain name)");
        f36274MR = dnsResourceRecordType9;
        DnsResourceRecordType dnsResourceRecordType10 = new DnsResourceRecordType((short) 10, "NULL (Null RR)");
        NULL = dnsResourceRecordType10;
        DnsResourceRecordType dnsResourceRecordType11 = new DnsResourceRecordType((short) 11, "WKS (Well known service description)");
        WKS = dnsResourceRecordType11;
        DnsResourceRecordType dnsResourceRecordType12 = new DnsResourceRecordType((short) 12, "PTR (Domain name pointer)");
        PTR = dnsResourceRecordType12;
        DnsResourceRecordType dnsResourceRecordType13 = new DnsResourceRecordType((short) 13, "HINFO (Host information)");
        HINFO = dnsResourceRecordType13;
        DnsResourceRecordType dnsResourceRecordType14 = new DnsResourceRecordType((short) 14, "MINFO (Mailbox or mail list information)");
        MINFO = dnsResourceRecordType14;
        DnsResourceRecordType dnsResourceRecordType15 = new DnsResourceRecordType((short) 15, "MX (Mail exchange)");
        f36275MX = dnsResourceRecordType15;
        DnsResourceRecordType dnsResourceRecordType16 = new DnsResourceRecordType((short) 16, "TXT (Text strings)");
        TXT = dnsResourceRecordType16;
        DnsResourceRecordType dnsResourceRecordType17 = new DnsResourceRecordType((short) 17, "RP (Responsible Person)");
        f36278RP = dnsResourceRecordType17;
        DnsResourceRecordType dnsResourceRecordType18 = new DnsResourceRecordType((short) 18, "AFSDB (AFS Data Base location)");
        AFSDB = dnsResourceRecordType18;
        DnsResourceRecordType dnsResourceRecordType19 = new DnsResourceRecordType((short) 19, "X25 (X.25 PSDN address)");
        X25 = dnsResourceRecordType19;
        DnsResourceRecordType dnsResourceRecordType20 = new DnsResourceRecordType((short) 20, "ISDN (ISDN address)");
        ISDN = dnsResourceRecordType20;
        DnsResourceRecordType dnsResourceRecordType21 = new DnsResourceRecordType((short) 21, "RT (Route Through)");
        f36279RT = dnsResourceRecordType21;
        DnsResourceRecordType dnsResourceRecordType22 = new DnsResourceRecordType((short) 22, "NSAP (NSAP address)");
        NSAP = dnsResourceRecordType22;
        DnsResourceRecordType dnsResourceRecordType23 = new DnsResourceRecordType((short) 23, "NSAP-PTR (NSAP style domain name pointer)");
        NSAP_PTR = dnsResourceRecordType23;
        DnsResourceRecordType dnsResourceRecordType24 = new DnsResourceRecordType((short) 24, "SIG (Security signature)");
        SIG = dnsResourceRecordType24;
        DnsResourceRecordType dnsResourceRecordType25 = new DnsResourceRecordType((short) 25, "KEY (Security key)");
        KEY = dnsResourceRecordType25;
        DnsResourceRecordType dnsResourceRecordType26 = new DnsResourceRecordType((short) 26, "PX (X.400 mail mapping information)");
        f36277PX = dnsResourceRecordType26;
        DnsResourceRecordType dnsResourceRecordType27 = new DnsResourceRecordType((short) 27, "GPOS (Geographical Position)");
        GPOS = dnsResourceRecordType27;
        DnsResourceRecordType dnsResourceRecordType28 = new DnsResourceRecordType((short) 28, "AAAA (IP6 Address)");
        AAAA = dnsResourceRecordType28;
        DnsResourceRecordType dnsResourceRecordType29 = new DnsResourceRecordType((short) 29, "LOC (Location Information)");
        LOC = dnsResourceRecordType29;
        DnsResourceRecordType dnsResourceRecordType30 = new DnsResourceRecordType((short) 30, "NXT (Next Domain)");
        NXT = dnsResourceRecordType30;
        DnsResourceRecordType dnsResourceRecordType31 = new DnsResourceRecordType((short) 31, "EID (Endpoint Identifier)");
        EID = dnsResourceRecordType31;
        DnsResourceRecordType dnsResourceRecordType32 = new DnsResourceRecordType((short) 32, "NIMLOC (Nimrod Locator)");
        NIMLOC = dnsResourceRecordType32;
        DnsResourceRecordType dnsResourceRecordType33 = new DnsResourceRecordType((short) 33, "SRV (Server Selection)");
        SRV = dnsResourceRecordType33;
        DnsResourceRecordType dnsResourceRecordType34 = new DnsResourceRecordType((short) 34, "ATMA (ATM Address)");
        ATMA = dnsResourceRecordType34;
        DnsResourceRecordType dnsResourceRecordType35 = new DnsResourceRecordType((short) 35, "NAPTR (Naming Authority Pointer)");
        NAPTR = dnsResourceRecordType35;
        DnsResourceRecordType dnsResourceRecordType36 = new DnsResourceRecordType((short) 36, "KX (Key Exchanger)");
        f36268KX = dnsResourceRecordType36;
        DnsResourceRecordType dnsResourceRecordType37 = new DnsResourceRecordType((short) 37, "CERT");
        CERT = dnsResourceRecordType37;
        DnsResourceRecordType dnsResourceRecordType38 = new DnsResourceRecordType((short) 38, "A6");
        f36266A6 = dnsResourceRecordType38;
        DnsResourceRecordType dnsResourceRecordType39 = new DnsResourceRecordType((short) 39, "DNAME");
        DNAME = dnsResourceRecordType39;
        DnsResourceRecordType dnsResourceRecordType40 = new DnsResourceRecordType((short) 40, "SINK");
        SINK = dnsResourceRecordType40;
        DnsResourceRecordType dnsResourceRecordType41 = new DnsResourceRecordType((short) 41, "OPT");
        OPT = dnsResourceRecordType41;
        DnsResourceRecordType dnsResourceRecordType42 = new DnsResourceRecordType((short) 42, "APL");
        APL = dnsResourceRecordType42;
        DnsResourceRecordType dnsResourceRecordType43 = new DnsResourceRecordType((short) 43, "DS (Delegation Signer)");
        f36267DS = dnsResourceRecordType43;
        DnsResourceRecordType dnsResourceRecordType44 = new DnsResourceRecordType((short) 44, "SSHFP (SSH Key Fingerprint)");
        SSHFP = dnsResourceRecordType44;
        DnsResourceRecordType dnsResourceRecordType45 = new DnsResourceRecordType((short) 45, "IPSECKEY");
        IPSECKEY = dnsResourceRecordType45;
        DnsResourceRecordType dnsResourceRecordType46 = new DnsResourceRecordType((short) 46, "RRSIG");
        RRSIG = dnsResourceRecordType46;
        DnsResourceRecordType dnsResourceRecordType47 = new DnsResourceRecordType((short) 47, "NSEC");
        NSEC = dnsResourceRecordType47;
        DnsResourceRecordType dnsResourceRecordType48 = new DnsResourceRecordType((short) 48, "DNSKEY");
        DNSKEY = dnsResourceRecordType48;
        DnsResourceRecordType dnsResourceRecordType49 = new DnsResourceRecordType((short) 49, "DHCID");
        DHCID = dnsResourceRecordType49;
        DnsResourceRecordType dnsResourceRecordType50 = new DnsResourceRecordType((short) 50, "NSEC3");
        NSEC3 = dnsResourceRecordType50;
        DnsResourceRecordType dnsResourceRecordType51 = new DnsResourceRecordType((short) 51, "NSEC3PARAM");
        NSEC3PARAM = dnsResourceRecordType51;
        DnsResourceRecordType dnsResourceRecordType52 = new DnsResourceRecordType((short) 52, "TLSA");
        TLSA = dnsResourceRecordType52;
        DnsResourceRecordType dnsResourceRecordType53 = new DnsResourceRecordType((short) 53, "SMIMEA (S/MIME cert association)");
        SMIMEA = dnsResourceRecordType53;
        DnsResourceRecordType dnsResourceRecordType54 = new DnsResourceRecordType((short) 55, "HIP (Host Identity Protocol)");
        HIP = dnsResourceRecordType54;
        DnsResourceRecordType dnsResourceRecordType55 = new DnsResourceRecordType((short) 56, "NINFO");
        NINFO = dnsResourceRecordType55;
        DnsResourceRecordType dnsResourceRecordType56 = new DnsResourceRecordType((short) 57, "RKEY");
        RKEY = dnsResourceRecordType56;
        DnsResourceRecordType dnsResourceRecordType57 = new DnsResourceRecordType((short) 58, "TALINK (Trust Anchor LINK)");
        TALINK = dnsResourceRecordType57;
        DnsResourceRecordType dnsResourceRecordType58 = new DnsResourceRecordType((short) 59, "CDS (Child DS)");
        CDS = dnsResourceRecordType58;
        DnsResourceRecordType dnsResourceRecordType59 = new DnsResourceRecordType((short) 60, "CDNSKEY (DNSKEY(s) the Child wants reflected in DS)");
        CDNSKEY = dnsResourceRecordType59;
        DnsResourceRecordType dnsResourceRecordType60 = new DnsResourceRecordType((short) 61, "OPENPGPKEY (OpenPGP Key)");
        OPENPGPKEY = dnsResourceRecordType60;
        DnsResourceRecordType dnsResourceRecordType61 = new DnsResourceRecordType((short) 62, "CSYNC (Child-To-Parent Synchronization)");
        CSYNC = dnsResourceRecordType61;
        DnsResourceRecordType dnsResourceRecordType62 = new DnsResourceRecordType((short) 99, "SPF");
        SPF = dnsResourceRecordType62;
        DnsResourceRecordType dnsResourceRecordType63 = new DnsResourceRecordType((short) 100, "UINFO");
        UINFO = dnsResourceRecordType63;
        DnsResourceRecordType dnsResourceRecordType64 = new DnsResourceRecordType((short) 101, "UID");
        UID = dnsResourceRecordType64;
        DnsResourceRecordType dnsResourceRecordType65 = new DnsResourceRecordType((short) 102, "GID");
        GID = dnsResourceRecordType65;
        DnsResourceRecordType dnsResourceRecordType66 = new DnsResourceRecordType((short) 103, "UNSPEC");
        UNSPEC = dnsResourceRecordType66;
        DnsResourceRecordType dnsResourceRecordType67 = new DnsResourceRecordType((short) 104, "NID");
        NID = dnsResourceRecordType67;
        DnsResourceRecordType dnsResourceRecordType68 = new DnsResourceRecordType((short) 105, "L32");
        L32 = dnsResourceRecordType68;
        DnsResourceRecordType dnsResourceRecordType69 = new DnsResourceRecordType((short) 106, "L64");
        L64 = dnsResourceRecordType69;
        DnsResourceRecordType dnsResourceRecordType70 = new DnsResourceRecordType((short) 107, "LP");
        f36269LP = dnsResourceRecordType70;
        DnsResourceRecordType dnsResourceRecordType71 = new DnsResourceRecordType((short) 108, "EUI48 (EUI-48 address)");
        EUI48 = dnsResourceRecordType71;
        DnsResourceRecordType dnsResourceRecordType72 = new DnsResourceRecordType((short) 109, "EUI64 (EUI-64 address)");
        EUI64 = dnsResourceRecordType72;
        DnsResourceRecordType dnsResourceRecordType73 = new DnsResourceRecordType((short) 249, "TKEY (Transaction Key)");
        TKEY = dnsResourceRecordType73;
        DnsResourceRecordType dnsResourceRecordType74 = new DnsResourceRecordType((short) 250, "TSIG (Transaction Signature)");
        TSIG = dnsResourceRecordType74;
        DnsResourceRecordType dnsResourceRecordType75 = new DnsResourceRecordType((short) 251, "IXFR (Incremental transfer)");
        IXFR = dnsResourceRecordType75;
        DnsResourceRecordType dnsResourceRecordType76 = new DnsResourceRecordType((short) 252, "AXFR (Transfer of an entire zone)");
        AXFR = dnsResourceRecordType76;
        DnsResourceRecordType dnsResourceRecordType77 = new DnsResourceRecordType((short) 253, "MAILB (Mailbox-related RRs (MB, MG or MR))");
        MAILB = dnsResourceRecordType77;
        DnsResourceRecordType dnsResourceRecordType78 = new DnsResourceRecordType((short) 254, "MAILA (Mail agent RRs)");
        MAILA = dnsResourceRecordType78;
        DnsResourceRecordType dnsResourceRecordType79 = new DnsResourceRecordType((short) 255, "* (All records)");
        ALL_RECORDS = dnsResourceRecordType79;
        DnsResourceRecordType dnsResourceRecordType80 = new DnsResourceRecordType((short) 256, "URI");
        URI = dnsResourceRecordType80;
        DnsResourceRecordType dnsResourceRecordType81 = new DnsResourceRecordType((short) 257, "CAA (Certification Authority Restriction)");
        CAA = dnsResourceRecordType81;
        DnsResourceRecordType dnsResourceRecordType82 = new DnsResourceRecordType((short) 258, "AVC (Application Visibility and Control)");
        AVC = dnsResourceRecordType82;
        DnsResourceRecordType dnsResourceRecordType83 = new DnsResourceRecordType(Short.MIN_VALUE, "TA (DNSSEC Trust Authorities)");
        f36280TA = dnsResourceRecordType83;
        DnsResourceRecordType dnsResourceRecordType84 = new DnsResourceRecordType((short) -32767, "DLV (DNSSEC Lookaside Validation)");
        DLV = dnsResourceRecordType84;
        HashMap hashMap = new HashMap();
        registry = hashMap;
        hashMap.put(dnsResourceRecordType.value(), dnsResourceRecordType);
        hashMap.put(dnsResourceRecordType2.value(), dnsResourceRecordType2);
        hashMap.put(dnsResourceRecordType3.value(), dnsResourceRecordType3);
        hashMap.put(dnsResourceRecordType4.value(), dnsResourceRecordType4);
        hashMap.put(dnsResourceRecordType5.value(), dnsResourceRecordType5);
        hashMap.put(dnsResourceRecordType6.value(), dnsResourceRecordType6);
        hashMap.put(dnsResourceRecordType7.value(), dnsResourceRecordType7);
        hashMap.put(dnsResourceRecordType8.value(), dnsResourceRecordType8);
        hashMap.put(dnsResourceRecordType9.value(), dnsResourceRecordType9);
        hashMap.put(dnsResourceRecordType10.value(), dnsResourceRecordType10);
        hashMap.put(dnsResourceRecordType11.value(), dnsResourceRecordType11);
        hashMap.put(dnsResourceRecordType12.value(), dnsResourceRecordType12);
        hashMap.put(dnsResourceRecordType13.value(), dnsResourceRecordType13);
        hashMap.put(dnsResourceRecordType14.value(), dnsResourceRecordType14);
        hashMap.put(dnsResourceRecordType15.value(), dnsResourceRecordType15);
        hashMap.put(dnsResourceRecordType16.value(), dnsResourceRecordType16);
        hashMap.put(dnsResourceRecordType17.value(), dnsResourceRecordType17);
        hashMap.put(dnsResourceRecordType18.value(), dnsResourceRecordType18);
        hashMap.put(dnsResourceRecordType19.value(), dnsResourceRecordType19);
        hashMap.put(dnsResourceRecordType20.value(), dnsResourceRecordType20);
        hashMap.put(dnsResourceRecordType21.value(), dnsResourceRecordType21);
        hashMap.put(dnsResourceRecordType22.value(), dnsResourceRecordType22);
        hashMap.put(dnsResourceRecordType23.value(), dnsResourceRecordType23);
        hashMap.put(dnsResourceRecordType24.value(), dnsResourceRecordType24);
        hashMap.put(dnsResourceRecordType25.value(), dnsResourceRecordType25);
        hashMap.put(dnsResourceRecordType26.value(), dnsResourceRecordType26);
        hashMap.put(dnsResourceRecordType27.value(), dnsResourceRecordType27);
        hashMap.put(dnsResourceRecordType28.value(), dnsResourceRecordType28);
        hashMap.put(dnsResourceRecordType29.value(), dnsResourceRecordType29);
        hashMap.put(dnsResourceRecordType30.value(), dnsResourceRecordType30);
        hashMap.put(dnsResourceRecordType31.value(), dnsResourceRecordType31);
        hashMap.put(dnsResourceRecordType32.value(), dnsResourceRecordType32);
        hashMap.put(dnsResourceRecordType33.value(), dnsResourceRecordType33);
        hashMap.put(dnsResourceRecordType34.value(), dnsResourceRecordType34);
        hashMap.put(dnsResourceRecordType35.value(), dnsResourceRecordType35);
        hashMap.put(dnsResourceRecordType36.value(), dnsResourceRecordType36);
        hashMap.put(dnsResourceRecordType37.value(), dnsResourceRecordType37);
        hashMap.put(dnsResourceRecordType38.value(), dnsResourceRecordType38);
        hashMap.put(dnsResourceRecordType39.value(), dnsResourceRecordType39);
        hashMap.put(dnsResourceRecordType40.value(), dnsResourceRecordType40);
        hashMap.put(dnsResourceRecordType41.value(), dnsResourceRecordType41);
        hashMap.put(dnsResourceRecordType42.value(), dnsResourceRecordType42);
        hashMap.put(dnsResourceRecordType43.value(), dnsResourceRecordType43);
        hashMap.put(dnsResourceRecordType44.value(), dnsResourceRecordType44);
        hashMap.put(dnsResourceRecordType45.value(), dnsResourceRecordType45);
        hashMap.put(dnsResourceRecordType46.value(), dnsResourceRecordType46);
        hashMap.put(dnsResourceRecordType47.value(), dnsResourceRecordType47);
        hashMap.put(dnsResourceRecordType48.value(), dnsResourceRecordType48);
        hashMap.put(dnsResourceRecordType49.value(), dnsResourceRecordType49);
        hashMap.put(dnsResourceRecordType50.value(), dnsResourceRecordType50);
        hashMap.put(dnsResourceRecordType51.value(), dnsResourceRecordType51);
        hashMap.put(dnsResourceRecordType52.value(), dnsResourceRecordType52);
        hashMap.put(dnsResourceRecordType53.value(), dnsResourceRecordType53);
        hashMap.put(dnsResourceRecordType54.value(), dnsResourceRecordType54);
        hashMap.put(dnsResourceRecordType55.value(), dnsResourceRecordType55);
        hashMap.put(dnsResourceRecordType56.value(), dnsResourceRecordType56);
        hashMap.put(dnsResourceRecordType57.value(), dnsResourceRecordType57);
        hashMap.put(dnsResourceRecordType58.value(), dnsResourceRecordType58);
        hashMap.put(dnsResourceRecordType59.value(), dnsResourceRecordType59);
        hashMap.put(dnsResourceRecordType60.value(), dnsResourceRecordType60);
        hashMap.put(dnsResourceRecordType61.value(), dnsResourceRecordType61);
        hashMap.put(dnsResourceRecordType62.value(), dnsResourceRecordType62);
        hashMap.put(dnsResourceRecordType63.value(), dnsResourceRecordType63);
        hashMap.put(dnsResourceRecordType64.value(), dnsResourceRecordType64);
        hashMap.put(dnsResourceRecordType65.value(), dnsResourceRecordType65);
        hashMap.put(dnsResourceRecordType66.value(), dnsResourceRecordType66);
        hashMap.put(dnsResourceRecordType67.value(), dnsResourceRecordType67);
        hashMap.put(dnsResourceRecordType68.value(), dnsResourceRecordType68);
        hashMap.put(dnsResourceRecordType69.value(), dnsResourceRecordType69);
        hashMap.put(dnsResourceRecordType70.value(), dnsResourceRecordType70);
        hashMap.put(dnsResourceRecordType71.value(), dnsResourceRecordType71);
        hashMap.put(dnsResourceRecordType72.value(), dnsResourceRecordType72);
        hashMap.put(dnsResourceRecordType73.value(), dnsResourceRecordType73);
        hashMap.put(dnsResourceRecordType74.value(), dnsResourceRecordType74);
        hashMap.put(dnsResourceRecordType75.value(), dnsResourceRecordType75);
        hashMap.put(dnsResourceRecordType76.value(), dnsResourceRecordType76);
        hashMap.put(dnsResourceRecordType77.value(), dnsResourceRecordType77);
        hashMap.put(dnsResourceRecordType78.value(), dnsResourceRecordType78);
        hashMap.put(dnsResourceRecordType79.value(), dnsResourceRecordType79);
        hashMap.put(dnsResourceRecordType80.value(), dnsResourceRecordType80);
        hashMap.put(dnsResourceRecordType81.value(), dnsResourceRecordType81);
        hashMap.put(dnsResourceRecordType82.value(), dnsResourceRecordType82);
        hashMap.put(dnsResourceRecordType83.value(), dnsResourceRecordType83);
        hashMap.put(dnsResourceRecordType84.value(), dnsResourceRecordType84);
    }

    public DnsResourceRecordType(Short sh2, String str) {
        super(sh2, str);
    }

    public static DnsResourceRecordType getInstance(Short sh2) {
        Map<Short, DnsResourceRecordType> map = registry;
        return map.containsKey(sh2) ? map.get(sh2) : new DnsResourceRecordType(sh2, "unknown");
    }

    public static DnsResourceRecordType register(DnsResourceRecordType dnsResourceRecordType) {
        return registry.put(dnsResourceRecordType.value(), dnsResourceRecordType);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(DnsResourceRecordType dnsResourceRecordType) {
        return value().compareTo(dnsResourceRecordType.value());
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return String.valueOf(value().shortValue() & 65535);
    }
}
