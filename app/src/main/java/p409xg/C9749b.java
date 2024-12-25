package p409xg;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import org.slf4j.Marker;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xg/b.class
 */
/* renamed from: xg.b */
/* loaded from: combined.jar:classes2.jar:xg/b.class */
public final class C9749b implements HostnameVerifier {

    /* renamed from: a */
    public static final C9749b f44495a = new C9749b();

    /* renamed from: b */
    public static final Pattern f44496b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: c */
    public static boolean m41065c(String str) {
        return f44496b.matcher(str).matches();
    }

    /* renamed from: a */
    public final List<String> m41066a(X509Certificate x509Certificate, int i10) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i10 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException e10) {
            return Collections.emptyList();
        }
    }

    /* renamed from: b */
    public boolean m41067b(String str, X509Certificate x509Certificate) {
        return m41065c(str) ? m41070f(str, x509Certificate) : m41069e(str, x509Certificate);
    }

    /* renamed from: d */
    public boolean m41068d(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return false;
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        if (!lowerCase.contains(Marker.ANY_MARKER)) {
            return str.equals(lowerCase);
        }
        if (lowerCase.startsWith("*.") && str.regionMatches(0, lowerCase, 2, lowerCase.length() - 2)) {
            return true;
        }
        int indexOf = lowerCase.indexOf(42);
        if (indexOf > lowerCase.indexOf(46) || !str.regionMatches(0, lowerCase, 0, indexOf)) {
            return false;
        }
        int length = lowerCase.length();
        int i10 = indexOf + 1;
        int i11 = length - i10;
        int length2 = str.length() - i11;
        return str.indexOf(46, indexOf) >= length2 && str.regionMatches(length2, lowerCase, i10, i11);
    }

    /* renamed from: e */
    public final boolean m41069e(String str, X509Certificate x509Certificate) {
        String m41058b;
        String lowerCase = str.toLowerCase(Locale.US);
        Iterator<String> it = m41066a(x509Certificate, 2).iterator();
        boolean z10 = false;
        while (true) {
            boolean z11 = z10;
            if (!it.hasNext()) {
                if (z11 || (m41058b = new C9748a(x509Certificate.getSubjectX500Principal()).m41058b("cn")) == null) {
                    return false;
                }
                return m41068d(lowerCase, m41058b);
            }
            if (m41068d(lowerCase, it.next())) {
                return true;
            }
            z10 = true;
        }
    }

    /* renamed from: f */
    public final boolean m41070f(String str, X509Certificate x509Certificate) {
        Iterator<String> it = m41066a(x509Certificate, 7).iterator();
        while (it.hasNext()) {
            if (str.equalsIgnoreCase(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return m41067b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException e10) {
            return false;
        }
    }
}
