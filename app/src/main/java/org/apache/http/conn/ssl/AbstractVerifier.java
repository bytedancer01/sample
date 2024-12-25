package org.apache.http.conn.ssl;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.util.InetAddressUtils;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/ssl/AbstractVerifier.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/ssl/AbstractVerifier.class */
public abstract class AbstractVerifier implements X509HostnameVerifier {
    public static final String[] BAD_COUNTRY_2LDS;
    private final Log log = LogFactory.getLog(getClass());

    static {
        String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
        BAD_COUNTRY_2LDS = strArr;
        Arrays.sort(strArr);
    }

    public static boolean acceptableCountryWildcard(String str) {
        return validCountryWildcard(str.split("\\."));
    }

    public static int countDots(String str) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i11;
            if (i10 >= str.length()) {
                return i12;
            }
            int i13 = i12;
            if (str.charAt(i10) == '.') {
                i13 = i12 + 1;
            }
            i10++;
            i11 = i13;
        }
    }

    public static String[] getCNs(X509Certificate x509Certificate) {
        String x500Principal = x509Certificate.getSubjectX500Principal().toString();
        String[] strArr = null;
        try {
            String extractCN = DefaultHostnameVerifier.extractCN(x500Principal);
            if (extractCN != null) {
                strArr = new String[]{extractCN};
            }
        } catch (SSLException e10) {
        }
        return strArr;
    }

    public static String[] getDNSSubjectAlts(X509Certificate x509Certificate) {
        List<SubjectName> subjectAltNames = DefaultHostnameVerifier.getSubjectAltNames(x509Certificate);
        if (subjectAltNames == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (SubjectName subjectName : subjectAltNames) {
            if (subjectName.getType() == 2) {
                arrayList.add(subjectName.getValue());
            }
        }
        return arrayList.isEmpty() ? (String[]) arrayList.toArray(new String[arrayList.size()]) : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c5, code lost:
    
        if (countDots(r0) == countDots(r0)) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean matchIdentity(java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.ssl.AbstractVerifier.matchIdentity(java.lang.String, java.lang.String, boolean):boolean");
    }

    private static boolean validCountryWildcard(String[] strArr) {
        boolean z10 = true;
        if (strArr.length == 3) {
            z10 = strArr[2].length() != 2 ? true : Arrays.binarySearch(BAD_COUNTRY_2LDS, strArr[1]) < 0;
        }
        return z10;
    }

    @Override // org.apache.http.conn.ssl.X509HostnameVerifier
    public final void verify(String str, X509Certificate x509Certificate) {
        List<SubjectName> subjectAltNames = DefaultHostnameVerifier.getSubjectAltNames(x509Certificate);
        ArrayList arrayList = new ArrayList();
        if (InetAddressUtils.isIPv4Address(str) || InetAddressUtils.isIPv6Address(str)) {
            for (SubjectName subjectName : subjectAltNames) {
                if (subjectName.getType() == 7) {
                    arrayList.add(subjectName.getValue());
                }
            }
        } else {
            for (SubjectName subjectName2 : subjectAltNames) {
                if (subjectName2.getType() == 2) {
                    arrayList.add(subjectName2.getValue());
                }
            }
        }
        String extractCN = DefaultHostnameVerifier.extractCN(x509Certificate.getSubjectX500Principal().getName("RFC2253"));
        verify(str, extractCN != null ? new String[]{extractCN} : null, arrayList.isEmpty() ? null : (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // org.apache.http.conn.ssl.X509HostnameVerifier
    public final void verify(String str, SSLSocket sSLSocket) {
        Args.notNull(str, "Host");
        SSLSession session = sSLSocket.getSession();
        SSLSession sSLSession = session;
        if (session == null) {
            sSLSocket.getInputStream().available();
            SSLSession session2 = sSLSocket.getSession();
            sSLSession = session2;
            if (session2 == null) {
                sSLSocket.startHandshake();
                sSLSession = sSLSocket.getSession();
            }
        }
        verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
    }

    public final void verify(String str, String[] strArr, String[] strArr2, boolean z10) {
        String str2 = (strArr == null || strArr.length <= 0) ? null : strArr[0];
        List<String> list = null;
        if (strArr2 != null) {
            list = null;
            if (strArr2.length > 0) {
                list = Arrays.asList(strArr2);
            }
        }
        String normaliseAddress = InetAddressUtils.isIPv6Address(str) ? DefaultHostnameVerifier.normaliseAddress(str.toLowerCase(Locale.ROOT)) : str;
        if (list != null) {
            for (String str3 : list) {
                String str4 = str3;
                if (InetAddressUtils.isIPv6Address(str3)) {
                    str4 = DefaultHostnameVerifier.normaliseAddress(str3);
                }
                if (matchIdentity(normaliseAddress, str4, z10)) {
                    return;
                }
            }
            throw new SSLException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
        }
        if (str2 == null) {
            throw new SSLException("Certificate subject for <" + str + "> doesn't contain a common name and does not have alternative names");
        }
        if (matchIdentity(normaliseAddress, InetAddressUtils.isIPv6Address(str2) ? DefaultHostnameVerifier.normaliseAddress(str2) : str2, z10)) {
            return;
        }
        throw new SSLException("Certificate for <" + str + "> doesn't match common name of the certificate subject: " + str2);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
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
