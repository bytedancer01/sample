package p191l0;

import android.util.Base64;
import com.amplifyframework.core.model.ModelIdentifier;
import java.util.List;
import p221n0.C6616h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l0/d.class
 */
/* renamed from: l0.d */
/* loaded from: combined.jar:classes1.jar:l0/d.class */
public final class C5641d {

    /* renamed from: a */
    public final String f31741a;

    /* renamed from: b */
    public final String f31742b;

    /* renamed from: c */
    public final String f31743c;

    /* renamed from: d */
    public final List<List<byte[]>> f31744d;

    /* renamed from: e */
    public final int f31745e = 0;

    /* renamed from: f */
    public final String f31746f;

    public C5641d(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f31741a = (String) C6616h.m30527e(str);
        this.f31742b = (String) C6616h.m30527e(str2);
        this.f31743c = (String) C6616h.m30527e(str3);
        this.f31744d = (List) C6616h.m30527e(list);
        this.f31746f = m27832a(str, str2, str3);
    }

    /* renamed from: a */
    public final String m27832a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* renamed from: b */
    public List<List<byte[]>> m27833b() {
        return this.f31744d;
    }

    /* renamed from: c */
    public int m27834c() {
        return this.f31745e;
    }

    /* renamed from: d */
    public String m27835d() {
        return this.f31746f;
    }

    /* renamed from: e */
    public String m27836e() {
        return this.f31741a;
    }

    /* renamed from: f */
    public String m27837f() {
        return this.f31742b;
    }

    /* renamed from: g */
    public String m27838g() {
        return this.f31743c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f31741a + ", mProviderPackage: " + this.f31742b + ", mQuery: " + this.f31743c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f31744d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f31744d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f31745e);
        return sb2.toString();
    }
}
