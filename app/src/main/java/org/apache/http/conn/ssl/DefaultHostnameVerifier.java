package org.apache.http.conn.ssl;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import javax.naming.InvalidNameException;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.ldap.LdapName;
import javax.naming.ldap.Rdn;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.util.DomainType;
import org.apache.http.conn.util.InetAddressUtils;
import org.apache.http.conn.util.PublicSuffixMatcher;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/ssl/DefaultHostnameVerifier.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/ssl/DefaultHostnameVerifier.class */
public final class DefaultHostnameVerifier implements HostnameVerifier {
    private final Log log;
    private final PublicSuffixMatcher publicSuffixMatcher;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:org/apache/http/conn/ssl/DefaultHostnameVerifier$1.class
     */
    /* renamed from: org.apache.http.conn.ssl.DefaultHostnameVerifier$1 */
    /* loaded from: combined.jar:classes1.jar:org/apache/http/conn/ssl/DefaultHostnameVerifier$1.class */
    public static /* synthetic */ class C70361 {

        /* renamed from: $SwitchMap$org$apache$http$conn$ssl$DefaultHostnameVerifier$HostNameType */
        public static final int[] f36152xdc99fdb1;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:8:0x0020
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                org.apache.http.conn.ssl.DefaultHostnameVerifier$HostNameType[] r0 = org.apache.http.conn.ssl.DefaultHostnameVerifier.HostNameType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                org.apache.http.conn.ssl.DefaultHostnameVerifier.C70361.f36152xdc99fdb1 = r0
                r0 = r4
                org.apache.http.conn.ssl.DefaultHostnameVerifier$HostNameType r1 = org.apache.http.conn.ssl.DefaultHostnameVerifier.HostNameType.IPv4     // Catch: java.lang.NoSuchFieldError -> L20
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L20
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L20
            L14:
                int[] r0 = org.apache.http.conn.ssl.DefaultHostnameVerifier.C70361.f36152xdc99fdb1     // Catch: java.lang.NoSuchFieldError -> L20 java.lang.NoSuchFieldError -> L24
                org.apache.http.conn.ssl.DefaultHostnameVerifier$HostNameType r1 = org.apache.http.conn.ssl.DefaultHostnameVerifier.HostNameType.IPv6     // Catch: java.lang.NoSuchFieldError -> L24
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
            throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.ssl.DefaultHostnameVerifier.C70361.m45300clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:org/apache/http/conn/ssl/DefaultHostnameVerifier$HostNameType.class
     */
    /* loaded from: combined.jar:classes1.jar:org/apache/http/conn/ssl/DefaultHostnameVerifier$HostNameType.class */
    public enum HostNameType {
        IPv4(7),
        IPv6(7),
        DNS(2);

        public final int subjectType;

        HostNameType(int i10) {
            this.subjectType = i10;
        }
    }

    public DefaultHostnameVerifier() {
        this(null);
    }

    public DefaultHostnameVerifier(PublicSuffixMatcher publicSuffixMatcher) {
        this.log = LogFactory.getLog(DefaultHostnameVerifier.class);
        this.publicSuffixMatcher = publicSuffixMatcher;
    }

    public static HostNameType determineHostFormat(String str) {
        if (InetAddressUtils.isIPv4Address(str)) {
            return HostNameType.IPv4;
        }
        String str2 = str;
        if (str.startsWith("[")) {
            str2 = str;
            if (str.endsWith("]")) {
                str2 = str.substring(1, str.length() - 1);
            }
        }
        return InetAddressUtils.isIPv6Address(str2) ? HostNameType.IPv6 : HostNameType.DNS;
    }

    public static String extractCN(String str) {
        if (str == null) {
            return null;
        }
        try {
            List rdns = new LdapName(str).getRdns();
            for (int size = rdns.size() - 1; size >= 0; size--) {
                Attribute attribute = ((Rdn) rdns.get(size)).toAttributes().get("cn");
                if (attribute != null) {
                    try {
                        Object obj = attribute.get();
                        if (obj != null) {
                            return obj.toString();
                        }
                        continue;
                    } catch (NoSuchElementException | NamingException e10) {
                    }
                }
            }
            return null;
        } catch (InvalidNameException e11) {
            throw new SSLException(str + " is not a valid X500 distinguished name");
        }
    }

    public static List<SubjectName> getSubjectAltNames(X509Certificate x509Certificate) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                Integer num = list.size() >= 2 ? (Integer) list.get(0) : null;
                if (num != null && (num.intValue() == 2 || num.intValue() == 7)) {
                    Object obj = list.get(1);
                    if (obj instanceof String) {
                        arrayList.add(new SubjectName((String) obj, num.intValue()));
                    } else {
                        boolean z10 = obj instanceof byte[];
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException e10) {
            return Collections.emptyList();
        }
    }

    public static void matchCN(String str, String str2, PublicSuffixMatcher publicSuffixMatcher) {
        Locale locale = Locale.ROOT;
        if (matchIdentityStrict(str.toLowerCase(locale), str2.toLowerCase(locale), publicSuffixMatcher)) {
            return;
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match common name of the certificate subject: " + str2);
    }

    public static void matchDNSName(String str, List<SubjectName> list, PublicSuffixMatcher publicSuffixMatcher) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        for (int i10 = 0; i10 < list.size(); i10++) {
            SubjectName subjectName = list.get(i10);
            if (subjectName.getType() == 2 && matchIdentityStrict(lowerCase, subjectName.getValue().toLowerCase(Locale.ROOT), publicSuffixMatcher)) {
                return;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r4.charAt((r4.length() - r5.length()) - 1) == '.') goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean matchDomainRoot(java.lang.String r4, java.lang.String r5) {
        /*
            r0 = 0
            r7 = r0
            r0 = r5
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = r7
            r6 = r0
            r0 = r4
            r1 = r5
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L35
            r0 = r4
            int r0 = r0.length()
            r1 = r5
            int r1 = r1.length()
            if (r0 == r1) goto L33
            r0 = r7
            r6 = r0
            r0 = r4
            r1 = r4
            int r1 = r1.length()
            r2 = r5
            int r2 = r2.length()
            int r1 = r1 - r2
            r2 = 1
            int r1 = r1 - r2
            char r0 = r0.charAt(r1)
            r1 = 46
            if (r0 != r1) goto L35
        L33:
            r0 = 1
            r6 = r0
        L35:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.ssl.DefaultHostnameVerifier.matchDomainRoot(java.lang.String, java.lang.String):boolean");
    }

    public static void matchIPAddress(String str, List<SubjectName> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            SubjectName subjectName = list.get(i10);
            if (subjectName.getType() == 7 && str.equals(subjectName.getValue())) {
                return;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }

    public static void matchIPv6Address(String str, List<SubjectName> list) {
        String normaliseAddress = normaliseAddress(str);
        for (int i10 = 0; i10 < list.size(); i10++) {
            SubjectName subjectName = list.get(i10);
            if (subjectName.getType() == 7 && normaliseAddress.equals(normaliseAddress(subjectName.getValue()))) {
                return;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }

    public static boolean matchIdentity(String str, String str2) {
        return matchIdentity(str, str2, null, false);
    }

    public static boolean matchIdentity(String str, String str2, PublicSuffixMatcher publicSuffixMatcher) {
        return matchIdentity(str, str2, publicSuffixMatcher, false);
    }

    private static boolean matchIdentity(String str, String str2, PublicSuffixMatcher publicSuffixMatcher, boolean z10) {
        if (publicSuffixMatcher != null && str.contains(InstructionFileId.DOT) && !matchDomainRoot(str, publicSuffixMatcher.getDomainRoot(str2, DomainType.ICANN))) {
            return false;
        }
        int indexOf = str2.indexOf(42);
        if (indexOf == -1) {
            return str.equalsIgnoreCase(str2);
        }
        String substring = str2.substring(0, indexOf);
        String substring2 = str2.substring(indexOf + 1);
        if (!substring.isEmpty() && !str.startsWith(substring)) {
            return false;
        }
        if (substring2.isEmpty() || str.endsWith(substring2)) {
            return (z10 && str.substring(substring.length(), str.length() - substring2.length()).contains(InstructionFileId.DOT)) ? false : true;
        }
        return false;
    }

    public static boolean matchIdentityStrict(String str, String str2) {
        return matchIdentity(str, str2, null, true);
    }

    public static boolean matchIdentityStrict(String str, String str2, PublicSuffixMatcher publicSuffixMatcher) {
        return matchIdentity(str, str2, publicSuffixMatcher, true);
    }

    public static String normaliseAddress(String str) {
        if (str == null) {
            return str;
        }
        try {
            str = InetAddress.getByName(str).getHostAddress();
        } catch (UnknownHostException e10) {
        }
        return str;
    }

    public void verify(String str, X509Certificate x509Certificate) {
        HostNameType determineHostFormat = determineHostFormat(str);
        List<SubjectName> subjectAltNames = getSubjectAltNames(x509Certificate);
        if (subjectAltNames != null && !subjectAltNames.isEmpty()) {
            int i10 = C70361.f36152xdc99fdb1[determineHostFormat.ordinal()];
            if (i10 == 1) {
                matchIPAddress(str, subjectAltNames);
                return;
            } else if (i10 != 2) {
                matchDNSName(str, subjectAltNames, this.publicSuffixMatcher);
                return;
            } else {
                matchIPv6Address(str, subjectAltNames);
                return;
            }
        }
        String extractCN = extractCN(x509Certificate.getSubjectX500Principal().getName("RFC2253"));
        if (extractCN != null) {
            matchCN(str, extractCN, this.publicSuffixMatcher);
            return;
        }
        throw new SSLException("Certificate subject for <" + str + "> doesn't contain a common name and does not have alternative names");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException e10) {
            if (!this.log.isDebugEnabled()) {
                return false;
            }
            this.log.debug(e10.getMessage(), e10);
            return false;
        }
    }
}
