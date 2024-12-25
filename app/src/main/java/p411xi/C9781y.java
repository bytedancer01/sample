package p411xi;

import java.security.MessageDigest;
import kh.C5612f;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;
import p430yi.C10024c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/y.class
 */
/* renamed from: xi.y */
/* loaded from: combined.jar:classes2.jar:xi/y.class */
public final class C9781y extends C9764h {

    /* renamed from: g */
    @NotNull
    public final transient byte[][] f44578g;

    /* renamed from: h */
    @NotNull
    public final transient int[] f44579h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9781y(@NotNull byte[][] bArr, @NotNull int[] iArr) {
        super(C9764h.f44530e.m41194j());
        C9367f.m39526e(bArr, "segments");
        C9367f.m39526e(iArr, "directory");
        this.f44578g = bArr;
        this.f44579h = iArr;
    }

    @Override // p411xi.C9764h
    @NotNull
    /* renamed from: B */
    public C9764h mo41186B() {
        return m41278H().mo41186B();
    }

    @Override // p411xi.C9764h
    @NotNull
    /* renamed from: C */
    public byte[] mo41187C() {
        byte[] bArr = new byte[size()];
        int length = m41277G().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = m41276F()[length + i10];
            int i14 = m41276F()[i10];
            int i15 = i14 - i11;
            C5612f.m27677c(m41277G()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // p411xi.C9764h
    /* renamed from: E */
    public void mo41189E(@NotNull C9761e c9761e, int i10, int i11) {
        C9367f.m39526e(c9761e, "buffer");
        int i12 = i11 + i10;
        int i13 = i10;
        int m42177b = C10024c.m42177b(this, i10);
        while (i13 < i12) {
            int i14 = m42177b == 0 ? 0 : m41276F()[m42177b - 1];
            int i15 = m41276F()[m42177b];
            int i16 = m41276F()[m41277G().length + m42177b];
            int min = Math.min(i12, (i15 - i14) + i14) - i13;
            int i17 = i16 + (i13 - i14);
            C9779w c9779w = new C9779w(m41277G()[m42177b], i17, i17 + min, true, false);
            C9779w c9779w2 = c9761e.f44519b;
            if (c9779w2 == null) {
                c9779w.f44572g = c9779w;
                c9779w.f44571f = c9779w;
                c9761e.f44519b = c9779w;
            } else {
                C9367f.m39524c(c9779w2);
                C9779w c9779w3 = c9779w2.f44572g;
                C9367f.m39524c(c9779w3);
                c9779w3.m41268c(c9779w);
            }
            i13 += min;
            m42177b++;
        }
        c9761e.m41137Q0(c9761e.size() + size());
    }

    @NotNull
    /* renamed from: F */
    public final int[] m41276F() {
        return this.f44579h;
    }

    @NotNull
    /* renamed from: G */
    public final byte[][] m41277G() {
        return this.f44578g;
    }

    /* renamed from: H */
    public final C9764h m41278H() {
        return new C9764h(mo41187C());
    }

    @Override // p411xi.C9764h
    @NotNull
    /* renamed from: d */
    public String mo41190d() {
        return m41278H().mo41190d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (mo41202u(0, r0, 0, size()) != false) goto L13;
     */
    @Override // p411xi.C9764h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            r8 = r0
            r0 = r7
            r1 = r6
            if (r0 != r1) goto La
            goto L34
        La:
            r0 = r7
            boolean r0 = r0 instanceof p411xi.C9764h
            if (r0 == 0) goto L32
            r0 = r7
            xi.h r0 = (p411xi.C9764h) r0
            r7 = r0
            r0 = r7
            int r0 = r0.size()
            r1 = r6
            int r1 = r1.size()
            if (r0 != r1) goto L32
            r0 = r6
            r1 = 0
            r2 = r7
            r3 = 0
            r4 = r6
            int r4 = r4.size()
            boolean r0 = r0.mo41202u(r1, r2, r3, r4)
            if (r0 == 0) goto L32
            goto L34
        L32:
            r0 = 0
            r8 = r0
        L34:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p411xi.C9781y.equals(java.lang.Object):boolean");
    }

    @Override // p411xi.C9764h
    @NotNull
    /* renamed from: g */
    public C9764h mo41192g(@NotNull String str) {
        C9367f.m39526e(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = m41277G().length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i11;
            if (i10 >= length) {
                byte[] digest = messageDigest.digest();
                C9367f.m39525d(digest, "digest.digest()");
                return new C9764h(digest);
            }
            int i13 = m41276F()[length + i10];
            int i14 = m41276F()[i10];
            messageDigest.update(m41277G()[i10], i13, i14 - i12);
            i10++;
            i11 = i14;
        }
    }

    @Override // p411xi.C9764h
    public int hashCode() {
        int m41195m = m41195m();
        if (m41195m == 0) {
            int length = m41277G().length;
            int i10 = 0;
            m41195m = 1;
            int i11 = 0;
            while (true) {
                int i12 = i11;
                if (i10 >= length) {
                    break;
                }
                int i13 = m41276F()[length + i10];
                int i14 = m41276F()[i10];
                byte[] bArr = m41277G()[i10];
                for (int i15 = i13; i15 < (i14 - i12) + i13; i15++) {
                    m41195m = (m41195m * 31) + bArr[i15];
                }
                i10++;
                i11 = i14;
            }
            m41204w(m41195m);
        }
        return m41195m;
    }

    @Override // p411xi.C9764h
    /* renamed from: n */
    public int mo41196n() {
        return m41276F()[m41277G().length - 1];
    }

    @Override // p411xi.C9764h
    @NotNull
    /* renamed from: p */
    public String mo41198p() {
        return m41278H().mo41198p();
    }

    @Override // p411xi.C9764h
    @NotNull
    /* renamed from: q */
    public byte[] mo41199q() {
        return mo41187C();
    }

    @Override // p411xi.C9764h
    /* renamed from: r */
    public byte mo41200r(int i10) {
        C9757c.m41081b(m41276F()[m41277G().length - 1], i10, 1L);
        int m42177b = C10024c.m42177b(this, i10);
        return m41277G()[m42177b][(i10 - (m42177b == 0 ? 0 : m41276F()[m42177b - 1])) + m41276F()[m41277G().length + m42177b]];
    }

    @Override // p411xi.C9764h
    @NotNull
    public String toString() {
        return m41278H().toString();
    }

    @Override // p411xi.C9764h
    /* renamed from: u */
    public boolean mo41202u(int i10, @NotNull C9764h c9764h, int i11, int i12) {
        C9367f.m39526e(c9764h, "other");
        boolean z10 = false;
        if (i10 >= 0) {
            if (i10 <= size() - i12) {
                int i13 = i12 + i10;
                int i14 = i11;
                int i15 = i10;
                int m42177b = C10024c.m42177b(this, i10);
                while (true) {
                    if (i15 >= i13) {
                        z10 = true;
                        break;
                    }
                    int i16 = m42177b == 0 ? 0 : m41276F()[m42177b - 1];
                    int i17 = m41276F()[m42177b];
                    int i18 = m41276F()[m41277G().length + m42177b];
                    int min = Math.min(i13, (i17 - i16) + i16) - i15;
                    if (!c9764h.mo41203v(i14, m41277G()[m42177b], i18 + (i15 - i16), min)) {
                        z10 = false;
                        break;
                    }
                    i14 += min;
                    i15 += min;
                    m42177b++;
                }
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // p411xi.C9764h
    /* renamed from: v */
    public boolean mo41203v(int i10, @NotNull byte[] bArr, int i11, int i12) {
        C9367f.m39526e(bArr, "other");
        boolean z10 = false;
        if (i10 >= 0) {
            z10 = false;
            if (i10 <= size() - i12) {
                z10 = false;
                if (i11 >= 0) {
                    if (i11 <= bArr.length - i12) {
                        int i13 = i12 + i10;
                        int m42177b = C10024c.m42177b(this, i10);
                        while (true) {
                            if (i10 >= i13) {
                                z10 = true;
                                break;
                            }
                            int i14 = m42177b == 0 ? 0 : m41276F()[m42177b - 1];
                            int i15 = m41276F()[m42177b];
                            int i16 = m41276F()[m41277G().length + m42177b];
                            int min = Math.min(i13, (i15 - i14) + i14) - i10;
                            if (!C9757c.m41080a(m41277G()[m42177b], i16 + (i10 - i14), bArr, i11, min)) {
                                z10 = false;
                                break;
                            }
                            i11 += min;
                            i10 += min;
                            m42177b++;
                        }
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        return z10;
    }
}
