package vi;

import ci.C1128n;
import ci.C1129o;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kh.C5616j;
import kh.C5624r;
import ki.C5633a;
import ki.C5634b;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;
import p372vh.C9367f;
import p411xi.C9760d0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vi/d.class
 */
/* renamed from: vi.d */
/* loaded from: combined.jar:classes2.jar:vi/d.class */
public final class C9379d implements HostnameVerifier {

    /* renamed from: a */
    public static final C9379d f42912a = new C9379d();

    @NotNull
    /* renamed from: a */
    public final List<String> m39554a(@NotNull X509Certificate x509Certificate) {
        C9367f.m39526e(x509Certificate, "certificate");
        return C5624r.m27712A(m39556c(x509Certificate, 7), m39556c(x509Certificate, 2));
    }

    /* renamed from: b */
    public final String m39555b(String str) {
        String str2 = str;
        if (m39557d(str)) {
            Locale locale = Locale.US;
            C9367f.m39525d(locale, "Locale.US");
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            str2 = str.toLowerCase(locale);
            C9367f.m39525d(str2, "(this as java.lang.String).toLowerCase(locale)");
        }
        return str2;
    }

    /* renamed from: c */
    public final List<String> m39556c(X509Certificate x509Certificate, int i10) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C5616j.m27700f();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && !(!C9367f.m39522a(list.get(0), Integer.valueOf(i10))) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException e10) {
            return C5616j.m27700f();
        }
    }

    /* renamed from: d */
    public final boolean m39557d(String str) {
        boolean z10 = false;
        if (str.length() == ((int) C9760d0.m41116b(str, 0, 0, 3, null))) {
            z10 = true;
        }
        return z10;
    }

    /* renamed from: e */
    public final boolean m39558e(@NotNull String str, @NotNull X509Certificate x509Certificate) {
        C9367f.m39526e(str, "host");
        C9367f.m39526e(x509Certificate, "certificate");
        return C5634b.m27786f(str) ? m39561h(str, x509Certificate) : m39560g(str, x509Certificate);
    }

    /* renamed from: f */
    public final boolean m39559f(String str, String str2) {
        if ((str == null || str.length() == 0) || C1128n.m6732y(str, InstructionFileId.DOT, false, 2, null) || C1128n.m6718k(str, "..", false, 2, null)) {
            return false;
        }
        if ((str2 == null || str2.length() == 0) || C1128n.m6732y(str2, InstructionFileId.DOT, false, 2, null) || C1128n.m6718k(str2, "..", false, 2, null)) {
            return false;
        }
        String str3 = str;
        if (!C1128n.m6718k(str, InstructionFileId.DOT, false, 2, null)) {
            str3 = str + InstructionFileId.DOT;
        }
        String str4 = str2;
        if (!C1128n.m6718k(str2, InstructionFileId.DOT, false, 2, null)) {
            str4 = str2 + InstructionFileId.DOT;
        }
        String m39555b = m39555b(str4);
        if (!C1129o.m6736D(m39555b, Marker.ANY_MARKER, false, 2, null)) {
            return C9367f.m39522a(str3, m39555b);
        }
        if (!C1128n.m6732y(m39555b, "*.", false, 2, null) || C1129o.m6746N(m39555b, '*', 1, false, 4, null) != -1 || str3.length() < m39555b.length() || C9367f.m39522a("*.", m39555b)) {
            return false;
        }
        String substring = m39555b.substring(1);
        C9367f.m39525d(substring, "(this as java.lang.String).substring(startIndex)");
        if (!C1128n.m6718k(str3, substring, false, 2, null)) {
            return false;
        }
        int length = str3.length() - substring.length();
        return length <= 0 || C1129o.m6751S(str3, '.', length - 1, false, 4, null) == -1;
    }

    /* renamed from: g */
    public final boolean m39560g(String str, X509Certificate x509Certificate) {
        boolean z10;
        String m39555b = m39555b(str);
        List<String> m39556c = m39556c(x509Certificate, 2);
        if (!(m39556c instanceof Collection) || !m39556c.isEmpty()) {
            Iterator<T> it = m39556c.iterator();
            while (true) {
                z10 = false;
                if (!it.hasNext()) {
                    break;
                }
                if (f42912a.m39559f(m39555b, (String) it.next())) {
                    z10 = true;
                    break;
                }
            }
        } else {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: h */
    public final boolean m39561h(String str, X509Certificate x509Certificate) {
        boolean z10;
        String m27756e = C5633a.m27756e(str);
        List<String> m39556c = m39556c(x509Certificate, 7);
        if ((m39556c instanceof Collection) && m39556c.isEmpty()) {
            z10 = false;
        } else {
            Iterator<T> it = m39556c.iterator();
            while (true) {
                z10 = false;
                if (!it.hasNext()) {
                    break;
                }
                if (C9367f.m39522a(m27756e, C5633a.m27756e((String) it.next()))) {
                    z10 = true;
                    break;
                }
            }
        }
        return z10;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@NotNull String str, @NotNull SSLSession sSLSession) {
        C9367f.m39526e(str, "host");
        C9367f.m39526e(sSLSession, "session");
        boolean z10 = false;
        if (m39557d(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                z10 = m39558e(str, (X509Certificate) certificate);
            } catch (SSLException e10) {
            }
        }
        return z10;
    }
}
