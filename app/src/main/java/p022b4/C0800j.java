package p022b4;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import p363v4.C9239e;
import p363v4.C9242h;
import p396x3.InterfaceC9646c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b4/j.class
 */
/* renamed from: b4.j */
/* loaded from: combined.jar:classes1.jar:b4/j.class */
public class C0800j {

    /* renamed from: a */
    public final C9239e<InterfaceC9646c, String> f5548a = new C9239e<>(1000);

    /* renamed from: a */
    public String m5117a(InterfaceC9646c interfaceC9646c) {
        String m38955g;
        synchronized (this.f5548a) {
            m38955g = this.f5548a.m38955g(interfaceC9646c);
        }
        String str = m38955g;
        if (m38955g == null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
                interfaceC9646c.mo27922a(messageDigest);
                m38955g = C9242h.m38974l(messageDigest.digest());
            } catch (UnsupportedEncodingException | NoSuchAlgorithmException e10) {
                e10.printStackTrace();
            }
            synchronized (this.f5548a) {
                this.f5548a.m38957k(interfaceC9646c, m38955g);
            }
            str = m38955g;
        }
        return str;
    }
}
