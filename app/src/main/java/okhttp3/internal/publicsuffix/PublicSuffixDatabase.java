package okhttp3.internal.publicsuffix;

import bi.C0911i;
import ci.C1129o;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kh.C5615i;
import kh.C5624r;
import ki.C5634b;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;
import p172jh.C5398q;
import p372vh.C9365d;
import p372vh.C9367f;
import p411xi.C9769m;
import p411xi.C9772p;
import p411xi.InterfaceC9763g;
import si.C8588j;
import th.C8749a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:okhttp3/internal/publicsuffix/PublicSuffixDatabase.class
 */
/* loaded from: combined.jar:classes2.jar:okhttp3/internal/publicsuffix/PublicSuffixDatabase.class */
public final class PublicSuffixDatabase {

    /* renamed from: a */
    public final AtomicBoolean f36107a = new AtomicBoolean(false);

    /* renamed from: b */
    public final CountDownLatch f36108b = new CountDownLatch(1);

    /* renamed from: c */
    public byte[] f36109c;

    /* renamed from: d */
    public byte[] f36110d;

    /* renamed from: h */
    public static final C6988a f36106h = new C6988a(null);

    /* renamed from: e */
    public static final byte[] f36103e = {(byte) 42};

    /* renamed from: f */
    public static final List<String> f36104f = C5615i.m27696b(Marker.ANY_MARKER);

    /* renamed from: g */
    public static final PublicSuffixDatabase f36105g = new PublicSuffixDatabase();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:okhttp3/internal/publicsuffix/PublicSuffixDatabase$a.class
     */
    /* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a */
    /* loaded from: combined.jar:classes2.jar:okhttp3/internal/publicsuffix/PublicSuffixDatabase$a.class */
    public static final class C6988a {
        public C6988a() {
        }

        public /* synthetic */ C6988a(C9365d c9365d) {
            this();
        }

        /* renamed from: b */
        public final String m32140b(byte[] bArr, byte[][] bArr2, int i10) {
            String str;
            int i11;
            int m27782b;
            int m27782b2;
            int length = bArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    str = null;
                    break;
                }
                int i13 = (i12 + length) / 2;
                while (i13 > -1 && bArr[i13] != ((byte) 10)) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i11 = i14 + i15;
                    if (bArr[i11] == ((byte) 10)) {
                        break;
                    }
                    i15++;
                }
                int i16 = i11 - i14;
                int i17 = i10;
                boolean z10 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z10) {
                        m27782b = 46;
                        z10 = false;
                    } else {
                        m27782b = C5634b.m27782b(bArr2[i17][i18], 255);
                    }
                    m27782b2 = m27782b - C5634b.m27782b(bArr[i14 + i19], 255);
                    if (m27782b2 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    }
                    if (bArr2[i17].length == i18) {
                        if (i17 == bArr2.length - 1) {
                            break;
                        }
                        i17++;
                        z10 = true;
                        i18 = -1;
                    }
                }
                if (m27782b2 >= 0) {
                    if (m27782b2 <= 0) {
                        int i20 = i16 - i19;
                        int length2 = bArr2[i17].length - i18;
                        int length3 = bArr2.length;
                        for (int i21 = i17 + 1; i21 < length3; i21++) {
                            length2 += bArr2[i21].length;
                        }
                        if (length2 >= i20) {
                            if (length2 <= i20) {
                                Charset charset = StandardCharsets.UTF_8;
                                C9367f.m39525d(charset, "UTF_8");
                                str = new String(bArr, i14, i16, charset);
                                break;
                            }
                        }
                    }
                    i12 = i11 + 1;
                }
                length = i14 - 1;
            }
            return str;
        }

        @NotNull
        /* renamed from: c */
        public final PublicSuffixDatabase m32141c() {
            return PublicSuffixDatabase.f36105g;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01bf, code lost:
    
        if (r8 != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01e4, code lost:
    
        if (r12 != null) goto L82;
     */
    /* JADX WARN: Type inference failed for: r0v14, types: [byte[], byte[][], java.lang.Object] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> m32134b(java.util.List<java.lang.String> r8) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.m32134b(java.util.List):java.util.List");
    }

    @Nullable
    /* renamed from: c */
    public final String m32135c(@NotNull String str) {
        C9367f.m39526e(str, ClientCookie.DOMAIN_ATTR);
        String unicode = IDN.toUnicode(str);
        C9367f.m39525d(unicode, "unicodeDomain");
        List<String> m32138f = m32138f(unicode);
        List<String> m32134b = m32134b(m32138f);
        if (m32138f.size() == m32134b.size() && m32134b.get(0).charAt(0) != '!') {
            return null;
        }
        char charAt = m32134b.get(0).charAt(0);
        int size = m32138f.size();
        int size2 = m32134b.size();
        if (charAt != '!') {
            size2++;
        }
        return C0911i.m5594g(C0911i.m5591d(C5624r.m27722r(m32138f(str)), size - size2), InstructionFileId.DOT, null, null, 0, null, null, 62, null);
    }

    /* renamed from: d */
    public final void m32136d() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        InterfaceC9763g m41229c = C9772p.m41229c(new C9769m(C9772p.m41237k(resourceAsStream)));
        try {
            byte[] mo41145W = m41229c.mo41145W(m41229c.readInt());
            byte[] mo41145W2 = m41229c.mo41145W(m41229c.readInt());
            C5398q c5398q = C5398q.f30770a;
            C8749a.m37542a(m41229c, null);
            synchronized (this) {
                C9367f.m39524c(mo41145W);
                this.f36109c = mo41145W;
                C9367f.m39524c(mo41145W2);
                this.f36110d = mo41145W2;
            }
            this.f36108b.countDown();
        } finally {
        }
    }

    /* renamed from: e */
    public final void m32137e() {
        boolean z10;
        boolean z11 = false;
        while (true) {
            try {
                try {
                    try {
                        z10 = z11;
                        m32136d();
                        break;
                    } catch (InterruptedIOException e10) {
                        Thread.interrupted();
                        z11 = true;
                    }
                } catch (IOException e11) {
                    C8588j.f40042c.m36880g().m36873j("Failed to read public suffix list", 5, e11);
                    if (z10) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: f */
    public final List<String> m32138f(String str) {
        List<String> m6768j0 = C1129o.m6768j0(str, new char[]{'.'}, false, 0, 6, null);
        List<String> list = m6768j0;
        if (C9367f.m39522a((String) C5624r.m27730z(m6768j0), "")) {
            list = C5624r.m27723s(m6768j0, 1);
        }
        return list;
    }
}
