package p377w3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.net.telnet.TelnetCommand;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:w3/a.class
 */
/* renamed from: w3.a */
/* loaded from: combined.jar:classes1.jar:w3/a.class */
public class C9404a {

    /* renamed from: a */
    public int f43103a;

    /* renamed from: b */
    public int f43104b;

    /* renamed from: d */
    public int f43106d;

    /* renamed from: h */
    public OutputStream f43110h;

    /* renamed from: i */
    public Bitmap f43111i;

    /* renamed from: j */
    public byte[] f43112j;

    /* renamed from: k */
    public byte[] f43113k;

    /* renamed from: l */
    public int f43114l;

    /* renamed from: m */
    public byte[] f43115m;

    /* renamed from: u */
    public boolean f43123u;

    /* renamed from: c */
    public Integer f43105c = null;

    /* renamed from: e */
    public int f43107e = -1;

    /* renamed from: f */
    public int f43108f = 0;

    /* renamed from: g */
    public boolean f43109g = false;

    /* renamed from: n */
    public boolean[] f43116n = new boolean[256];

    /* renamed from: o */
    public int f43117o = 7;

    /* renamed from: p */
    public int f43118p = -1;

    /* renamed from: q */
    public boolean f43119q = false;

    /* renamed from: r */
    public boolean f43120r = true;

    /* renamed from: s */
    public boolean f43121s = false;

    /* renamed from: t */
    public int f43122t = 10;

    /* renamed from: a */
    public boolean m39731a(Bitmap bitmap) {
        boolean z10 = false;
        if (bitmap != null) {
            if (this.f43109g) {
                try {
                    if (!this.f43121s) {
                        m39737g(bitmap.getWidth(), bitmap.getHeight());
                    }
                    this.f43111i = bitmap;
                    m39735e();
                    m39732b();
                    if (this.f43120r) {
                        m39741k();
                        m39743m();
                        if (this.f43107e >= 0) {
                            m39742l();
                        }
                    }
                    m39739i();
                    m39740j();
                    if (!this.f43120r) {
                        m39743m();
                    }
                    m39744n();
                    this.f43120r = false;
                    z10 = true;
                } catch (IOException e10) {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    /* renamed from: b */
    public final void m39732b() {
        int i10;
        byte[] bArr = this.f43112j;
        int length = bArr.length;
        int i11 = length / 3;
        this.f43113k = new byte[i11];
        C9406c c9406c = new C9406c(bArr, length, this.f43122t);
        this.f43115m = c9406c.m39763h();
        int i12 = 0;
        while (true) {
            byte[] bArr2 = this.f43115m;
            if (i12 >= bArr2.length) {
                break;
            }
            byte b10 = bArr2[i12];
            int i13 = i12 + 2;
            bArr2[i12] = bArr2[i13];
            bArr2[i13] = b10;
            this.f43116n[i12 / 3] = false;
            i12 += 3;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < i11) {
            byte[] bArr3 = this.f43112j;
            int i16 = i15 + 1;
            byte b11 = bArr3[i15];
            int i17 = i16 + 1;
            int m39762g = c9406c.m39762g(b11 & 255, bArr3[i16] & 255, bArr3[i17] & 255);
            this.f43116n[m39762g] = true;
            this.f43113k[i14] = (byte) m39762g;
            i14++;
            i15 = i17 + 1;
        }
        this.f43112j = null;
        this.f43114l = 8;
        this.f43117o = 7;
        Integer num = this.f43105c;
        if (num != null) {
            i10 = num.intValue();
        } else if (!this.f43123u) {
            return;
        } else {
            i10 = 0;
        }
        this.f43106d = m39733c(i10);
    }

    /* renamed from: c */
    public final int m39733c(int i10) {
        if (this.f43115m == null) {
            return -1;
        }
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        int i11 = 16777216;
        int length = this.f43115m.length;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = i13;
            if (i12 >= length) {
                return i14;
            }
            byte[] bArr = this.f43115m;
            int i15 = i12 + 1;
            int i16 = red - (bArr[i12] & 255);
            int i17 = i15 + 1;
            int i18 = green - (bArr[i15] & 255);
            int i19 = blue - (bArr[i17] & 255);
            int i20 = (i16 * i16) + (i18 * i18) + (i19 * i19);
            int i21 = i17 / 3;
            int i22 = i11;
            int i23 = i14;
            if (this.f43116n[i21]) {
                i22 = i11;
                i23 = i14;
                if (i20 < i11) {
                    i22 = i20;
                    i23 = i21;
                }
            }
            i11 = i22;
            i12 = i17 + 1;
            i13 = i23;
        }
    }

    /* renamed from: d */
    public boolean m39734d() {
        boolean z10;
        if (!this.f43109g) {
            return false;
        }
        this.f43109g = false;
        try {
            this.f43110h.write(59);
            this.f43110h.flush();
            if (this.f43119q) {
                this.f43110h.close();
            }
            z10 = true;
        } catch (IOException e10) {
            z10 = false;
        }
        this.f43106d = 0;
        this.f43110h = null;
        this.f43111i = null;
        this.f43112j = null;
        this.f43113k = null;
        this.f43115m = null;
        this.f43119q = false;
        this.f43120r = true;
        return z10;
    }

    /* renamed from: e */
    public final void m39735e() {
        int width = this.f43111i.getWidth();
        int height = this.f43111i.getHeight();
        int i10 = this.f43103a;
        if (width != i10 || height != this.f43104b) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, this.f43104b, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            this.f43111i = createBitmap;
        }
        int i11 = width * height;
        int[] iArr = new int[i11];
        this.f43111i.getPixels(iArr, 0, width, 0, 0, width, height);
        this.f43112j = new byte[i11 * 3];
        boolean z10 = false;
        this.f43123u = false;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i11) {
            int i15 = iArr[i12];
            int i16 = i13;
            if (i15 == 0) {
                i16 = i13 + 1;
            }
            byte[] bArr = this.f43112j;
            int i17 = i14 + 1;
            bArr[i14] = (byte) (i15 & 255);
            int i18 = i17 + 1;
            bArr[i17] = (byte) ((i15 >> 8) & 255);
            bArr[i18] = (byte) ((i15 >> 16) & 255);
            i12++;
            i14 = i18 + 1;
            i13 = i16;
        }
        double d10 = (i13 * 100) / i11;
        if (d10 > 4.0d) {
            z10 = true;
        }
        this.f43123u = z10;
        if (Log.isLoggable("AnimatedGifEncoder", 3)) {
            Log.d("AnimatedGifEncoder", "got pixels for frame with " + d10 + "% transparent pixels");
        }
    }

    /* renamed from: f */
    public void m39736f(int i10) {
        this.f43108f = Math.round(i10 / 10.0f);
    }

    /* renamed from: g */
    public void m39737g(int i10, int i11) {
        if (!this.f43109g || this.f43120r) {
            this.f43103a = i10;
            this.f43104b = i11;
            if (i10 < 1) {
                this.f43103a = 320;
            }
            if (i11 < 1) {
                this.f43104b = 240;
            }
            this.f43121s = true;
        }
    }

    /* renamed from: h */
    public boolean m39738h(OutputStream outputStream) {
        boolean z10 = false;
        if (outputStream == null) {
            return false;
        }
        this.f43119q = false;
        this.f43110h = outputStream;
        try {
            m39746p("GIF89a");
            z10 = true;
        } catch (IOException e10) {
        }
        this.f43109g = z10;
        return z10;
    }

    /* renamed from: i */
    public final void m39739i() {
        int i10;
        int i11;
        this.f43110h.write(33);
        this.f43110h.write(TelnetCommand.f36140GA);
        this.f43110h.write(4);
        if (this.f43105c != null || this.f43123u) {
            i10 = 1;
            i11 = 2;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i12 = this.f43118p;
        if (i12 >= 0) {
            i11 = i12 & 7;
        }
        this.f43110h.write(i10 | (i11 << 2) | 0 | 0);
        m39745o(this.f43108f);
        this.f43110h.write(this.f43106d);
        this.f43110h.write(0);
    }

    /* renamed from: j */
    public final void m39740j() {
        this.f43110h.write(44);
        m39745o(0);
        m39745o(0);
        m39745o(this.f43103a);
        m39745o(this.f43104b);
        if (this.f43120r) {
            this.f43110h.write(0);
        } else {
            this.f43110h.write(this.f43117o | 128);
        }
    }

    /* renamed from: k */
    public final void m39741k() {
        m39745o(this.f43103a);
        m39745o(this.f43104b);
        this.f43110h.write(this.f43117o | 240);
        this.f43110h.write(0);
        this.f43110h.write(0);
    }

    /* renamed from: l */
    public final void m39742l() {
        this.f43110h.write(33);
        this.f43110h.write(255);
        this.f43110h.write(11);
        m39746p("NETSCAPE2.0");
        this.f43110h.write(3);
        this.f43110h.write(1);
        m39745o(this.f43107e);
        this.f43110h.write(0);
    }

    /* renamed from: m */
    public final void m39743m() {
        OutputStream outputStream = this.f43110h;
        byte[] bArr = this.f43115m;
        outputStream.write(bArr, 0, bArr.length);
        int length = this.f43115m.length;
        for (int i10 = 0; i10 < 768 - length; i10++) {
            this.f43110h.write(0);
        }
    }

    /* renamed from: n */
    public final void m39744n() {
        new C9405b(this.f43103a, this.f43104b, this.f43113k, this.f43114l).m39752f(this.f43110h);
    }

    /* renamed from: o */
    public final void m39745o(int i10) {
        this.f43110h.write(i10 & 255);
        this.f43110h.write((i10 >> 8) & 255);
    }

    /* renamed from: p */
    public final void m39746p(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            this.f43110h.write((byte) str.charAt(i10));
        }
    }
}
