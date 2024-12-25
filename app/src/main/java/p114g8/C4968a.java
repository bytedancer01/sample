package p114g8;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p027b9.C0857o;
import p027b9.C0858p;
import p027b9.InterfaceC0853l0;
import p027b9.InterfaceC0854m;
import p059d9.C4349a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:g8/a.class
 */
/* renamed from: g8.a */
/* loaded from: combined.jar:classes2.jar:g8/a.class */
public class C4968a implements InterfaceC0854m {

    /* renamed from: a */
    public final InterfaceC0854m f28804a;

    /* renamed from: b */
    public final byte[] f28805b;

    /* renamed from: c */
    public final byte[] f28806c;

    /* renamed from: d */
    public CipherInputStream f28807d;

    public C4968a(InterfaceC0854m interfaceC0854m, byte[] bArr, byte[] bArr2) {
        this.f28804a = interfaceC0854m;
        this.f28805b = bArr;
        this.f28806c = bArr2;
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: a */
    public final long mo521a(C0858p c0858p) {
        try {
            Cipher m25008h = m25008h();
            try {
                m25008h.init(2, new SecretKeySpec(this.f28805b, "AES"), new IvParameterSpec(this.f28806c));
                C0857o c0857o = new C0857o(this.f28804a, c0858p);
                this.f28807d = new CipherInputStream(c0857o, m25008h);
                c0857o.m5375l();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: c */
    public final void mo522c(InterfaceC0853l0 interfaceC0853l0) {
        C4349a.m21882e(interfaceC0853l0);
        this.f28804a.mo522c(interfaceC0853l0);
    }

    @Override // p027b9.InterfaceC0854m
    public void close() {
        if (this.f28807d != null) {
            this.f28807d = null;
            this.f28804a.close();
        }
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: e */
    public final Map<String, List<String>> mo523e() {
        return this.f28804a.mo523e();
    }

    @Override // p027b9.InterfaceC0854m
    public final Uri getUri() {
        return this.f28804a.getUri();
    }

    /* renamed from: h */
    public Cipher m25008h() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // p027b9.InterfaceC0846i
    public final int read(byte[] bArr, int i10, int i11) {
        C4349a.m21882e(this.f28807d);
        int read = this.f28807d.read(bArr, i10, i11);
        int i12 = read;
        if (read < 0) {
            i12 = -1;
        }
        return i12;
    }
}
