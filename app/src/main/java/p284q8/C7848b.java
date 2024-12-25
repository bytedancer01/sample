package p284q8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.achartengine.renderer.DefaultRenderer;
import p059d9.C4359e0;
import p059d9.C4392v;
import p059d9.C4401z0;
import p243o8.C6919a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:q8/b.class
 */
/* renamed from: q8.b */
/* loaded from: combined.jar:classes2.jar:q8/b.class */
public final class C7848b {

    /* renamed from: h */
    public static final byte[] f37818h = {0, 7, 8, 15};

    /* renamed from: i */
    public static final byte[] f37819i = {0, 119, -120, -1};

    /* renamed from: j */
    public static final byte[] f37820j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a */
    public final Paint f37821a;

    /* renamed from: b */
    public final Paint f37822b;

    /* renamed from: c */
    public final Canvas f37823c;

    /* renamed from: d */
    public final b f37824d;

    /* renamed from: e */
    public final a f37825e;

    /* renamed from: f */
    public final h f37826f;

    /* renamed from: g */
    public Bitmap f37827g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:q8/b$a.class
     */
    /* renamed from: q8.b$a */
    /* loaded from: combined.jar:classes2.jar:q8/b$a.class */
    public static final class a {

        /* renamed from: a */
        public final int f37828a;

        /* renamed from: b */
        public final int[] f37829b;

        /* renamed from: c */
        public final int[] f37830c;

        /* renamed from: d */
        public final int[] f37831d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f37828a = i10;
            this.f37829b = iArr;
            this.f37830c = iArr2;
            this.f37831d = iArr3;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:q8/b$b.class
     */
    /* renamed from: q8.b$b */
    /* loaded from: combined.jar:classes2.jar:q8/b$b.class */
    public static final class b {

        /* renamed from: a */
        public final int f37832a;

        /* renamed from: b */
        public final int f37833b;

        /* renamed from: c */
        public final int f37834c;

        /* renamed from: d */
        public final int f37835d;

        /* renamed from: e */
        public final int f37836e;

        /* renamed from: f */
        public final int f37837f;

        public b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f37832a = i10;
            this.f37833b = i11;
            this.f37834c = i12;
            this.f37835d = i13;
            this.f37836e = i14;
            this.f37837f = i15;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:q8/b$c.class
     */
    /* renamed from: q8.b$c */
    /* loaded from: combined.jar:classes2.jar:q8/b$c.class */
    public static final class c {

        /* renamed from: a */
        public final int f37838a;

        /* renamed from: b */
        public final boolean f37839b;

        /* renamed from: c */
        public final byte[] f37840c;

        /* renamed from: d */
        public final byte[] f37841d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f37838a = i10;
            this.f37839b = z10;
            this.f37840c = bArr;
            this.f37841d = bArr2;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:q8/b$d.class
     */
    /* renamed from: q8.b$d */
    /* loaded from: combined.jar:classes2.jar:q8/b$d.class */
    public static final class d {

        /* renamed from: a */
        public final int f37842a;

        /* renamed from: b */
        public final int f37843b;

        /* renamed from: c */
        public final int f37844c;

        /* renamed from: d */
        public final SparseArray<e> f37845d;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f37842a = i10;
            this.f37843b = i11;
            this.f37844c = i12;
            this.f37845d = sparseArray;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:q8/b$e.class
     */
    /* renamed from: q8.b$e */
    /* loaded from: combined.jar:classes2.jar:q8/b$e.class */
    public static final class e {

        /* renamed from: a */
        public final int f37846a;

        /* renamed from: b */
        public final int f37847b;

        public e(int i10, int i11) {
            this.f37846a = i10;
            this.f37847b = i11;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:q8/b$f.class
     */
    /* renamed from: q8.b$f */
    /* loaded from: combined.jar:classes2.jar:q8/b$f.class */
    public static final class f {

        /* renamed from: a */
        public final int f37848a;

        /* renamed from: b */
        public final boolean f37849b;

        /* renamed from: c */
        public final int f37850c;

        /* renamed from: d */
        public final int f37851d;

        /* renamed from: e */
        public final int f37852e;

        /* renamed from: f */
        public final int f37853f;

        /* renamed from: g */
        public final int f37854g;

        /* renamed from: h */
        public final int f37855h;

        /* renamed from: i */
        public final int f37856i;

        /* renamed from: j */
        public final int f37857j;

        /* renamed from: k */
        public final SparseArray<g> f37858k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f37848a = i10;
            this.f37849b = z10;
            this.f37850c = i11;
            this.f37851d = i12;
            this.f37852e = i13;
            this.f37853f = i14;
            this.f37854g = i15;
            this.f37855h = i16;
            this.f37856i = i17;
            this.f37857j = i18;
            this.f37858k = sparseArray;
        }

        /* renamed from: a */
        public void m34120a(f fVar) {
            SparseArray<g> sparseArray = fVar.f37858k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f37858k.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:q8/b$g.class
     */
    /* renamed from: q8.b$g */
    /* loaded from: combined.jar:classes2.jar:q8/b$g.class */
    public static final class g {

        /* renamed from: a */
        public final int f37859a;

        /* renamed from: b */
        public final int f37860b;

        /* renamed from: c */
        public final int f37861c;

        /* renamed from: d */
        public final int f37862d;

        /* renamed from: e */
        public final int f37863e;

        /* renamed from: f */
        public final int f37864f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f37859a = i10;
            this.f37860b = i11;
            this.f37861c = i12;
            this.f37862d = i13;
            this.f37863e = i14;
            this.f37864f = i15;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:q8/b$h.class
     */
    /* renamed from: q8.b$h */
    /* loaded from: combined.jar:classes2.jar:q8/b$h.class */
    public static final class h {

        /* renamed from: a */
        public final int f37865a;

        /* renamed from: b */
        public final int f37866b;

        /* renamed from: c */
        public final SparseArray<f> f37867c = new SparseArray<>();

        /* renamed from: d */
        public final SparseArray<a> f37868d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<c> f37869e = new SparseArray<>();

        /* renamed from: f */
        public final SparseArray<a> f37870f = new SparseArray<>();

        /* renamed from: g */
        public final SparseArray<c> f37871g = new SparseArray<>();

        /* renamed from: h */
        public b f37872h;

        /* renamed from: i */
        public d f37873i;

        public h(int i10, int i11) {
            this.f37865a = i10;
            this.f37866b = i11;
        }

        /* renamed from: a */
        public void m34121a() {
            this.f37867c.clear();
            this.f37868d.clear();
            this.f37869e.clear();
            this.f37870f.clear();
            this.f37871g.clear();
            this.f37872h = null;
            this.f37873i = null;
        }
    }

    public C7848b(int i10, int i11) {
        Paint paint = new Paint();
        this.f37821a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f37822b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f37823c = new Canvas();
        this.f37824d = new b(719, 575, 0, 719, 0, 575);
        this.f37825e = new a(0, m34103c(), m34104d(), m34105e());
        this.f37826f = new h(i10, i11);
    }

    /* renamed from: a */
    public static byte[] m34102a(int i10, int i11, C4359e0 c4359e0) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) c4359e0.m21950h(i11);
        }
        return bArr;
    }

    /* renamed from: c */
    public static int[] m34103c() {
        return new int[]{0, -1, DefaultRenderer.BACKGROUND_COLOR, -8421505};
    }

    /* renamed from: d */
    public static int[] m34104d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = m34106f(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = m34106f(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* renamed from: e */
    public static int[] m34105e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = m34106f(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = m34106f(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 != 8) {
                    if (i11 == 128) {
                        iArr[i10] = m34106f(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                    } else if (i11 == 136) {
                        iArr[i10] = m34106f(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                    }
                } else {
                    iArr[i10] = m34106f(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                }
            }
        }
        return iArr;
    }

    /* renamed from: f */
    public static int m34106f(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b8  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m34107g(p059d9.C4359e0 r7, int[] r8, byte[] r9, int r10, int r11, android.graphics.Paint r12, android.graphics.Canvas r13) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p284q8.C7848b.m34107g(d9.e0, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00db  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m34108h(p059d9.C4359e0 r7, int[] r8, byte[] r9, int r10, int r11, android.graphics.Paint r12, android.graphics.Canvas r13) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p284q8.C7848b.m34108h(d9.e0, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* renamed from: i */
    public static int m34109i(C4359e0 c4359e0, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        int m21950h;
        int i12 = i10;
        boolean z10 = false;
        do {
            int m21950h2 = c4359e0.m21950h(8);
            if (m21950h2 != 0) {
                m21950h = 1;
            } else if (c4359e0.m21949g()) {
                m21950h = c4359e0.m21950h(7);
                m21950h2 = c4359e0.m21950h(8);
            } else {
                m21950h = c4359e0.m21950h(7);
                if (m21950h != 0) {
                    m21950h2 = 0;
                } else {
                    m21950h2 = 0;
                    z10 = true;
                    m21950h = 0;
                }
            }
            if (m21950h != 0 && paint != null) {
                int i13 = m21950h2;
                if (bArr != null) {
                    i13 = bArr[m21950h2];
                }
                paint.setColor(iArr[i13]);
                canvas.drawRect(i12, i11, i12 + m21950h, i11 + 1, paint);
            }
            i12 += m21950h;
        } while (!z10);
        return i12;
    }

    /* renamed from: j */
    public static void m34110j(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int m34107g;
        C4359e0 c4359e0 = new C4359e0(bArr);
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        int i13 = i12;
        int i14 = i11;
        while (c4359e0.m21944b() != 0) {
            int m21950h = c4359e0.m21950h(8);
            if (m21950h != 240) {
                switch (m21950h) {
                    case 16:
                        m34107g = m34107g(c4359e0, iArr, i10 == 3 ? bArr2 == null ? f37819i : bArr2 : i10 == 2 ? bArr4 == null ? f37818h : bArr4 : null, i14, i13, paint, canvas);
                        break;
                    case 17:
                        m34107g = m34108h(c4359e0, iArr, i10 == 3 ? bArr3 == null ? f37820j : bArr3 : null, i14, i13, paint, canvas);
                        break;
                    case 18:
                        i14 = m34109i(c4359e0, iArr, null, i14, i13, paint, canvas);
                        continue;
                    default:
                        switch (m21950h) {
                            case 32:
                                bArr4 = m34102a(4, 4, c4359e0);
                                break;
                            case 33:
                                bArr2 = m34102a(4, 8, c4359e0);
                                break;
                            case 34:
                                bArr3 = m34102a(16, 8, c4359e0);
                                break;
                            default:
                                continue;
                        }
                }
                i14 = m34107g;
                c4359e0.m21945c();
            } else {
                i13 += 2;
                i14 = i11;
            }
        }
    }

    /* renamed from: k */
    public static void m34111k(c cVar, a aVar, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr = i10 == 3 ? aVar.f37831d : i10 == 2 ? aVar.f37830c : aVar.f37829b;
        m34110j(cVar.f37840c, iArr, i10, i11, i12, paint, canvas);
        m34110j(cVar.f37841d, iArr, i10, i11, i12 + 1, paint, canvas);
    }

    /* renamed from: l */
    public static a m34112l(C4359e0 c4359e0, int i10) {
        int m21950h;
        int m21950h2;
        int i11;
        int i12;
        int m21950h3 = c4359e0.m21950h(8);
        c4359e0.m21960r(8);
        int i13 = i10 - 2;
        int[] m34103c = m34103c();
        int[] m34104d = m34104d();
        int[] m34105e = m34105e();
        while (i13 > 0) {
            int m21950h4 = c4359e0.m21950h(8);
            int m21950h5 = c4359e0.m21950h(8);
            int i14 = i13 - 2;
            int[] iArr = (m21950h5 & 128) != 0 ? m34103c : (m21950h5 & 64) != 0 ? m34104d : m34105e;
            if ((m21950h5 & 1) != 0) {
                i11 = c4359e0.m21950h(8);
                i12 = c4359e0.m21950h(8);
                m21950h = c4359e0.m21950h(8);
                m21950h2 = c4359e0.m21950h(8);
                i13 = i14 - 4;
            } else {
                int m21950h6 = c4359e0.m21950h(6);
                int m21950h7 = c4359e0.m21950h(4);
                m21950h = c4359e0.m21950h(4) << 4;
                i13 = i14 - 2;
                m21950h2 = c4359e0.m21950h(2) << 6;
                i11 = m21950h6 << 2;
                i12 = m21950h7 << 4;
            }
            if (i11 == 0) {
                i12 = 0;
                m21950h = 0;
                m21950h2 = 255;
            }
            double d10 = i11;
            double d11 = i12 - 128;
            int i15 = (int) (d10 + (1.402d * d11));
            double d12 = m21950h - 128;
            iArr[m21950h4] = m34106f((byte) (255 - (m21950h2 & 255)), C4401z0.m22409s(i15, 0, 255), C4401z0.m22409s((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), C4401z0.m22409s((int) (d10 + (d12 * 1.772d)), 0, 255));
        }
        return new a(m21950h3, m34103c, m34104d, m34105e);
    }

    /* renamed from: m */
    public static b m34113m(C4359e0 c4359e0) {
        int i10;
        int i11;
        int i12;
        int i13;
        c4359e0.m21960r(4);
        boolean m21949g = c4359e0.m21949g();
        c4359e0.m21960r(3);
        int m21950h = c4359e0.m21950h(16);
        int m21950h2 = c4359e0.m21950h(16);
        if (m21949g) {
            i12 = c4359e0.m21950h(16);
            i10 = c4359e0.m21950h(16);
            i13 = c4359e0.m21950h(16);
            i11 = c4359e0.m21950h(16);
        } else {
            i10 = m21950h;
            i11 = m21950h2;
            i12 = 0;
            i13 = 0;
        }
        return new b(m21950h, m21950h2, i12, i10, i13, i11);
    }

    /* renamed from: n */
    public static c m34114n(C4359e0 c4359e0) {
        byte[] bArr;
        byte[] bArr2;
        int m21950h = c4359e0.m21950h(16);
        c4359e0.m21960r(4);
        int m21950h2 = c4359e0.m21950h(2);
        boolean m21949g = c4359e0.m21949g();
        c4359e0.m21960r(1);
        byte[] bArr3 = C4401z0.f26684f;
        if (m21950h2 == 1) {
            c4359e0.m21960r(c4359e0.m21950h(8) * 16);
            bArr = bArr3;
        } else {
            bArr = bArr3;
            if (m21950h2 == 0) {
                int m21950h3 = c4359e0.m21950h(16);
                int m21950h4 = c4359e0.m21950h(16);
                if (m21950h3 > 0) {
                    bArr3 = new byte[m21950h3];
                    c4359e0.m21953k(bArr3, 0, m21950h3);
                }
                bArr = bArr3;
                if (m21950h4 > 0) {
                    byte[] bArr4 = new byte[m21950h4];
                    c4359e0.m21953k(bArr4, 0, m21950h4);
                    bArr2 = bArr4;
                    bArr = bArr3;
                    return new c(m21950h, m21949g, bArr, bArr2);
                }
            }
        }
        bArr2 = bArr;
        return new c(m21950h, m21949g, bArr, bArr2);
    }

    /* renamed from: o */
    public static d m34115o(C4359e0 c4359e0, int i10) {
        int m21950h = c4359e0.m21950h(8);
        int m21950h2 = c4359e0.m21950h(4);
        int m21950h3 = c4359e0.m21950h(2);
        c4359e0.m21960r(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int m21950h4 = c4359e0.m21950h(8);
            c4359e0.m21960r(8);
            i11 -= 6;
            sparseArray.put(m21950h4, new e(c4359e0.m21950h(16), c4359e0.m21950h(16)));
        }
        return new d(m21950h, m21950h2, m21950h3, sparseArray);
    }

    /* renamed from: p */
    public static f m34116p(C4359e0 c4359e0, int i10) {
        int m21950h;
        int m21950h2;
        int m21950h3 = c4359e0.m21950h(8);
        c4359e0.m21960r(4);
        boolean m21949g = c4359e0.m21949g();
        c4359e0.m21960r(3);
        int m21950h4 = c4359e0.m21950h(16);
        int m21950h5 = c4359e0.m21950h(16);
        int m21950h6 = c4359e0.m21950h(3);
        int m21950h7 = c4359e0.m21950h(3);
        c4359e0.m21960r(2);
        int m21950h8 = c4359e0.m21950h(8);
        int m21950h9 = c4359e0.m21950h(8);
        int m21950h10 = c4359e0.m21950h(4);
        int m21950h11 = c4359e0.m21950h(2);
        c4359e0.m21960r(2);
        int i11 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int m21950h12 = c4359e0.m21950h(16);
            int m21950h13 = c4359e0.m21950h(2);
            int m21950h14 = c4359e0.m21950h(2);
            int m21950h15 = c4359e0.m21950h(12);
            c4359e0.m21960r(4);
            int m21950h16 = c4359e0.m21950h(12);
            i11 -= 6;
            if (m21950h13 == 1 || m21950h13 == 2) {
                m21950h = c4359e0.m21950h(8);
                m21950h2 = c4359e0.m21950h(8);
                i11 -= 2;
            } else {
                m21950h = 0;
                m21950h2 = 0;
            }
            sparseArray.put(m21950h12, new g(m21950h13, m21950h14, m21950h15, m21950h16, m21950h, m21950h2));
        }
        return new f(m21950h3, m21949g, m21950h4, m21950h5, m21950h6, m21950h7, m21950h8, m21950h9, m21950h10, m21950h11, sparseArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v67, types: [q8.b$c] */
    /* JADX WARN: Type inference failed for: r0v70, types: [q8.b$c] */
    /* JADX WARN: Type inference failed for: r0v74, types: [q8.b$c] */
    /* renamed from: q */
    public static void m34117q(C4359e0 c4359e0, h hVar) {
        f fVar;
        a aVar;
        SparseArray sparseArray;
        int i10;
        SparseArray sparseArray2;
        a aVar2;
        SparseArray sparseArray3;
        int m21950h = c4359e0.m21950h(8);
        int m21950h2 = c4359e0.m21950h(16);
        int m21950h3 = c4359e0.m21950h(16);
        int m21946d = c4359e0.m21946d();
        if (m21950h3 * 8 > c4359e0.m21944b()) {
            C4392v.m22275i("DvbParser", "Data field length exceeds limit");
            c4359e0.m21960r(c4359e0.m21944b());
            return;
        }
        switch (m21950h) {
            case 16:
                if (m21950h2 == hVar.f37865a) {
                    d dVar = hVar.f37873i;
                    d m34115o = m34115o(c4359e0, m21950h3);
                    if (m34115o.f37844c == 0) {
                        if (dVar != null && dVar.f37843b != m34115o.f37843b) {
                            hVar.f37873i = m34115o;
                            break;
                        }
                    } else {
                        hVar.f37873i = m34115o;
                        hVar.f37867c.clear();
                        hVar.f37868d.clear();
                        hVar.f37869e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f37873i;
                if (m21950h2 == hVar.f37865a && dVar2 != null) {
                    f m34116p = m34116p(c4359e0, m21950h3);
                    if (dVar2.f37844c == 0 && (fVar = hVar.f37867c.get(m34116p.f37848a)) != null) {
                        m34116p.m34120a(fVar);
                    }
                    hVar.f37867c.put(m34116p.f37848a, m34116p);
                    break;
                }
                break;
            case 18:
                if (m21950h2 == hVar.f37865a) {
                    a m34112l = m34112l(c4359e0, m21950h3);
                    sparseArray = hVar.f37868d;
                    aVar = m34112l;
                } else if (m21950h2 == hVar.f37866b) {
                    a m34112l2 = m34112l(c4359e0, m21950h3);
                    SparseArray sparseArray4 = hVar.f37870f;
                    aVar = m34112l2;
                    sparseArray = sparseArray4;
                }
                i10 = aVar.f37828a;
                sparseArray2 = sparseArray;
                aVar2 = aVar;
                sparseArray2.put(i10, aVar2);
                break;
            case 19:
                if (m21950h2 == hVar.f37865a) {
                    aVar2 = m34114n(c4359e0);
                    sparseArray3 = hVar.f37869e;
                } else if (m21950h2 == hVar.f37866b) {
                    aVar2 = m34114n(c4359e0);
                    sparseArray3 = hVar.f37871g;
                }
                i10 = aVar2.f37838a;
                sparseArray2 = sparseArray3;
                sparseArray2.put(i10, aVar2);
                break;
            case 20:
                if (m21950h2 == hVar.f37865a) {
                    hVar.f37872h = m34113m(c4359e0);
                    break;
                }
                break;
        }
        c4359e0.m21961s((m21946d + m21950h3) - c4359e0.m21946d());
    }

    /* renamed from: b */
    public List<C6919a> m34118b(byte[] bArr, int i10) {
        C4359e0 c4359e0 = new C4359e0(bArr, i10);
        while (c4359e0.m21944b() >= 48 && c4359e0.m21950h(8) == 15) {
            m34117q(c4359e0, this.f37826f);
        }
        h hVar = this.f37826f;
        d dVar = hVar.f37873i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        b bVar = hVar.f37872h;
        if (bVar == null) {
            bVar = this.f37824d;
        }
        Bitmap bitmap = this.f37827g;
        if (bitmap == null || bVar.f37832a + 1 != bitmap.getWidth() || bVar.f37833b + 1 != this.f37827g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f37832a + 1, bVar.f37833b + 1, Bitmap.Config.ARGB_8888);
            this.f37827g = createBitmap;
            this.f37823c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray = dVar.f37845d;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            this.f37823c.save();
            e valueAt = sparseArray.valueAt(i11);
            f fVar = this.f37826f.f37867c.get(sparseArray.keyAt(i11));
            int i12 = valueAt.f37846a + bVar.f37834c;
            int i13 = valueAt.f37847b + bVar.f37836e;
            this.f37823c.clipRect(i12, i13, Math.min(fVar.f37850c + i12, bVar.f37835d), Math.min(fVar.f37851d + i13, bVar.f37837f));
            a aVar = this.f37826f.f37868d.get(fVar.f37854g);
            a aVar2 = aVar;
            if (aVar == null) {
                a aVar3 = this.f37826f.f37870f.get(fVar.f37854g);
                aVar2 = aVar3;
                if (aVar3 == null) {
                    aVar2 = this.f37825e;
                }
            }
            SparseArray<g> sparseArray2 = fVar.f37858k;
            for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                int keyAt = sparseArray2.keyAt(i14);
                g valueAt2 = sparseArray2.valueAt(i14);
                c cVar = this.f37826f.f37869e.get(keyAt);
                if (cVar == null) {
                    cVar = this.f37826f.f37871g.get(keyAt);
                }
                if (cVar != null) {
                    m34111k(cVar, aVar2, fVar.f37853f, valueAt2.f37861c + i12, i13 + valueAt2.f37862d, cVar.f37839b ? null : this.f37821a, this.f37823c);
                }
            }
            if (fVar.f37849b) {
                int i15 = fVar.f37853f;
                this.f37822b.setColor(i15 == 3 ? aVar2.f37831d[fVar.f37855h] : i15 == 2 ? aVar2.f37830c[fVar.f37856i] : aVar2.f37829b[fVar.f37857j]);
                this.f37823c.drawRect(i12, i13, fVar.f37850c + i12, fVar.f37851d + i13, this.f37822b);
            }
            arrayList.add(new C6919a.b().m31862f(Bitmap.createBitmap(this.f37827g, i12, i13, fVar.f37850c, fVar.f37851d)).m31867k(i12 / bVar.f37832a).m31868l(0).m31864h(i13 / bVar.f37833b, 0).m31865i(0).m31870n(fVar.f37850c / bVar.f37832a).m31863g(fVar.f37851d / bVar.f37833b).m31857a());
            this.f37823c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f37823c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: r */
    public void m34119r() {
        this.f37826f.m34121a();
    }
}
