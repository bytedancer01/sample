package p350u9;

import android.os.RemoteException;
import android.util.Log;
import ga.BinderC4994b;
import ga.InterfaceC4993a;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p422y9.AbstractBinderC9952t1;
import p422y9.C9935o;
import p422y9.InterfaceC9955u1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u9/x.class
 */
/* renamed from: u9.x */
/* loaded from: combined.jar:classes2.jar:u9/x.class */
public abstract class AbstractBinderC8837x extends AbstractBinderC9952t1 {

    /* renamed from: b */
    public final int f40880b;

    public AbstractBinderC8837x(byte[] bArr) {
        C9935o.m41841a(bArr.length == 25);
        this.f40880b = Arrays.hashCode(bArr);
    }

    /* renamed from: U0 */
    public static byte[] m37732U0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: B1 */
    public abstract byte[] mo37733B1();

    public final boolean equals(Object obj) {
        InterfaceC4993a mo37735o;
        if (obj == null || !(obj instanceof InterfaceC9955u1)) {
            return false;
        }
        try {
            InterfaceC9955u1 interfaceC9955u1 = (InterfaceC9955u1) obj;
            if (interfaceC9955u1.mo37734l() == this.f40880b && (mo37735o = interfaceC9955u1.mo37735o()) != null) {
                return Arrays.equals(mo37733B1(), (byte[]) BinderC4994b.m25161U0(mo37735o));
            }
            return false;
        } catch (RemoteException e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return false;
        }
    }

    public final int hashCode() {
        return this.f40880b;
    }

    @Override // p422y9.InterfaceC9955u1
    /* renamed from: l */
    public final int mo37734l() {
        return this.f40880b;
    }

    @Override // p422y9.InterfaceC9955u1
    /* renamed from: o */
    public final InterfaceC4993a mo37735o() {
        return BinderC4994b.m25160B1(mo37733B1());
    }
}
