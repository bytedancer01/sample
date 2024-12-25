package p164j8;

import android.net.Uri;
import android.util.Base64;
import org.slf4j.Marker;
import p059d9.C4349a;
import p059d9.C4350a0;
import p059d9.C4356d;
import p059d9.C4401z0;
import p099fc.AbstractC4834t;
import p099fc.AbstractC4838v;
import p267p6.C7629w0;
import p301r6.C7966a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:j8/p.class
 */
/* renamed from: j8.p */
/* loaded from: combined.jar:classes2.jar:j8/p.class */
public final class C5330p {

    /* renamed from: a */
    public final C5322h f30591a;

    /* renamed from: b */
    public final Uri f30592b;

    public C5330p(C5314a c5314a, Uri uri) {
        C4349a.m21878a(c5314a.f30519i.containsKey("control"));
        this.f30591a = m26581b(c5314a);
        this.f30592b = m26580a(uri, (String) C4401z0.m22391j(c5314a.f30519i.get("control")));
    }

    /* renamed from: a */
    public static Uri m26580a(Uri uri, String str) {
        Uri parse = Uri.parse(str);
        return parse.isAbsolute() ? parse : str.equals(Marker.ANY_MARKER) ? uri : uri.buildUpon().appendEncodedPath(str).build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:
    
        if (r0.equals("audio/ac3") != false) goto L30;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p164j8.C5322h m26581b(p164j8.C5314a r7) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p164j8.C5330p.m26581b(j8.a):j8.h");
    }

    /* renamed from: c */
    public static byte[] m26582c(String str) {
        byte[] decode = Base64.decode(str, 0);
        int length = decode.length;
        byte[] bArr = C4350a0.f26520a;
        byte[] bArr2 = new byte[length + bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(decode, 0, bArr2, bArr.length, decode.length);
        return bArr2;
    }

    /* renamed from: d */
    public static int m26583d(int i10, String str) {
        return i10 != -1 ? i10 : str.equals("audio/ac3") ? 6 : 1;
    }

    /* renamed from: e */
    public static void m26584e(C7629w0.b bVar, AbstractC4838v<String, String> abstractC4838v, int i10, int i11) {
        C4349a.m21878a(abstractC4838v.containsKey("profile-level-id"));
        bVar.m33198I("mp4a.40." + ((String) C4349a.m21882e(abstractC4838v.get("profile-level-id"))));
        bVar.m33209T(AbstractC4834t.m24540F(C7966a.m34523a(i11, i10)));
    }

    /* renamed from: f */
    public static void m26585f(C7629w0.b bVar, AbstractC4838v<String, String> abstractC4838v) {
        String m21929a;
        C4349a.m21878a(abstractC4838v.containsKey("sprop-parameter-sets"));
        String[] m22356V0 = C4401z0.m22356V0((String) C4349a.m21882e(abstractC4838v.get("sprop-parameter-sets")), ",");
        C4349a.m21878a(m22356V0.length == 2);
        AbstractC4834t m24541G = AbstractC4834t.m24541G(m26582c(m22356V0[0]), m26582c(m22356V0[1]));
        bVar.m33209T(m24541G);
        byte[] bArr = m24541G.get(0);
        C4350a0.b m21896i = C4350a0.m21896i(bArr, C4350a0.f26520a.length, bArr.length);
        bVar.m33216a0(m21896i.f26533g);
        bVar.m33206Q(m21896i.f26532f);
        bVar.m33225j0(m21896i.f26531e);
        String str = abstractC4838v.get("profile-level-id");
        if (str != null) {
            m21929a = "avc1." + str;
        } else {
            m21929a = C4356d.m21929a(m21896i.f26527a, m21896i.f26528b, m21896i.f26529c);
        }
        bVar.m33198I(m21929a);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C5330p.class != obj.getClass()) {
            return false;
        }
        C5330p c5330p = (C5330p) obj;
        if (!this.f30591a.equals(c5330p.f30591a) || !this.f30592b.equals(c5330p.f30592b)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return ((217 + this.f30591a.hashCode()) * 31) + this.f30592b.hashCode();
    }
}
