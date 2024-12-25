package p362v3;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.achartengine.renderer.DefaultRenderer;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v3/d.class
 */
/* renamed from: v3.d */
/* loaded from: combined.jar:classes1.jar:v3/d.class */
public class C9234d {

    /* renamed from: b */
    public ByteBuffer f42218b;

    /* renamed from: c */
    public C9233c f42219c;

    /* renamed from: a */
    public final byte[] f42217a = new byte[256];

    /* renamed from: d */
    public int f42220d = 0;

    /* renamed from: a */
    public void m38925a() {
        this.f42218b = null;
        this.f42219c = null;
    }

    /* renamed from: b */
    public final boolean m38926b() {
        return this.f42219c.f42205b != 0;
    }

    /* renamed from: c */
    public C9233c m38927c() {
        if (this.f42218b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m38926b()) {
            return this.f42219c;
        }
        m38934j();
        if (!m38926b()) {
            m38932h();
            C9233c c9233c = this.f42219c;
            if (c9233c.f42206c < 0) {
                c9233c.f42205b = 1;
            }
        }
        return this.f42219c;
    }

    /* renamed from: d */
    public final int m38928d() {
        int i10;
        try {
            i10 = this.f42218b.get() & 255;
        } catch (Exception e10) {
            this.f42219c.f42205b = 1;
            i10 = 0;
        }
        return i10;
    }

    /* renamed from: e */
    public final void m38929e() {
        this.f42219c.f42207d.f42193a = m38937m();
        this.f42219c.f42207d.f42194b = m38937m();
        this.f42219c.f42207d.f42195c = m38937m();
        this.f42219c.f42207d.f42196d = m38937m();
        int m38928d = m38928d();
        boolean z10 = false;
        boolean z11 = (m38928d & 128) != 0;
        int pow = (int) Math.pow(2.0d, (m38928d & 7) + 1);
        C9232b c9232b = this.f42219c.f42207d;
        if ((m38928d & 64) != 0) {
            z10 = true;
        }
        c9232b.f42197e = z10;
        if (z11) {
            c9232b.f42203k = m38931g(pow);
        } else {
            c9232b.f42203k = null;
        }
        this.f42219c.f42207d.f42202j = this.f42218b.position();
        m38941q();
        if (m38926b()) {
            return;
        }
        C9233c c9233c = this.f42219c;
        c9233c.f42206c++;
        c9233c.f42208e.add(c9233c.f42207d);
    }

    /* renamed from: f */
    public final int m38930f() {
        int m38928d = m38928d();
        this.f42220d = m38928d;
        int i10 = 0;
        int i11 = 0;
        if (m38928d > 0) {
            int i12 = 0;
            while (true) {
                try {
                    i10 = i12;
                    int i13 = this.f42220d;
                    i10 = i11;
                    if (i11 >= i13) {
                        break;
                    }
                    int i14 = i13 - i11;
                    i10 = i14;
                    this.f42218b.get(this.f42217a, i11, i14);
                    i11 += i14;
                    i12 = i14;
                } catch (Exception e10) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i11 + " count: " + i10 + " blockSize: " + this.f42220d, e10);
                    }
                    this.f42219c.f42205b = 1;
                    i10 = i11;
                }
            }
        }
        return i10;
    }

    /* renamed from: g */
    public final int[] m38931g(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f42218b.get(bArr);
            iArr = null;
            int[] iArr2 = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (true) {
                iArr = iArr2;
                if (i11 >= i10) {
                    break;
                }
                int i13 = i12 + 1;
                byte b10 = bArr[i12];
                int i14 = i13 + 1;
                iArr2[i11] = ((b10 & 255) << 16) | DefaultRenderer.BACKGROUND_COLOR | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
                i12 = i14 + 1;
                i11++;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f42219c.f42205b = 1;
        }
        return iArr;
    }

    /* renamed from: h */
    public final void m38932h() {
        boolean z10 = false;
        while (!z10 && !m38926b()) {
            int m38928d = m38928d();
            if (m38928d == 33) {
                int m38928d2 = m38928d();
                if (m38928d2 != 1) {
                    if (m38928d2 == 249) {
                        this.f42219c.f42207d = new C9232b();
                        m38933i();
                    } else if (m38928d2 != 254 && m38928d2 == 255) {
                        m38930f();
                        String str = "";
                        for (int i10 = 0; i10 < 11; i10++) {
                            str = str + ((char) this.f42217a[i10]);
                        }
                        if (str.equals("NETSCAPE2.0")) {
                            m38936l();
                        }
                    }
                }
                m38940p();
            } else if (m38928d == 44) {
                C9233c c9233c = this.f42219c;
                if (c9233c.f42207d == null) {
                    c9233c.f42207d = new C9232b();
                }
                m38929e();
            } else if (m38928d != 59) {
                this.f42219c.f42205b = 1;
            } else {
                z10 = true;
            }
        }
    }

    /* renamed from: i */
    public final void m38933i() {
        m38928d();
        int m38928d = m38928d();
        C9232b c9232b = this.f42219c.f42207d;
        int i10 = (m38928d & 28) >> 2;
        c9232b.f42199g = i10;
        boolean z10 = true;
        if (i10 == 0) {
            c9232b.f42199g = 1;
        }
        if ((m38928d & 1) == 0) {
            z10 = false;
        }
        c9232b.f42198f = z10;
        int m38937m = m38937m();
        int i11 = m38937m;
        if (m38937m < 3) {
            i11 = 10;
        }
        C9232b c9232b2 = this.f42219c.f42207d;
        c9232b2.f42201i = i11 * 10;
        c9232b2.f42200h = m38928d();
        m38928d();
    }

    /* renamed from: j */
    public final void m38934j() {
        String str = "";
        for (int i10 = 0; i10 < 6; i10++) {
            str = str + ((char) m38928d());
        }
        if (!str.startsWith("GIF")) {
            this.f42219c.f42205b = 1;
            return;
        }
        m38935k();
        if (!this.f42219c.f42211h || m38926b()) {
            return;
        }
        C9233c c9233c = this.f42219c;
        c9233c.f42204a = m38931g(c9233c.f42212i);
        C9233c c9233c2 = this.f42219c;
        c9233c2.f42215l = c9233c2.f42204a[c9233c2.f42213j];
    }

    /* renamed from: k */
    public final void m38935k() {
        this.f42219c.f42209f = m38937m();
        this.f42219c.f42210g = m38937m();
        int m38928d = m38928d();
        C9233c c9233c = this.f42219c;
        c9233c.f42211h = (m38928d & 128) != 0;
        c9233c.f42212i = 2 << (m38928d & 7);
        c9233c.f42213j = m38928d();
        this.f42219c.f42214k = m38928d();
    }

    /* renamed from: l */
    public final void m38936l() {
        do {
            m38930f();
            byte[] bArr = this.f42217a;
            if (bArr[0] == 1) {
                byte b10 = bArr[1];
                this.f42219c.f42216m = ((bArr[2] & 255) << 8) | (b10 & 255);
            }
            if (this.f42220d <= 0) {
                return;
            }
        } while (!m38926b());
    }

    /* renamed from: m */
    public final int m38937m() {
        return this.f42218b.getShort();
    }

    /* renamed from: n */
    public final void m38938n() {
        this.f42218b = null;
        Arrays.fill(this.f42217a, (byte) 0);
        this.f42219c = new C9233c();
        this.f42220d = 0;
    }

    /* renamed from: o */
    public C9234d m38939o(byte[] bArr) {
        m38938n();
        if (bArr != null) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.f42218b = wrap;
            wrap.rewind();
            this.f42218b.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f42218b = null;
            this.f42219c.f42205b = 2;
        }
        return this;
    }

    /* renamed from: p */
    public final void m38940p() {
        int m38928d;
        do {
            m38928d = m38928d();
            ByteBuffer byteBuffer = this.f42218b;
            byteBuffer.position(byteBuffer.position() + m38928d);
        } while (m38928d > 0);
    }

    /* renamed from: q */
    public final void m38941q() {
        m38928d();
        m38940p();
    }
}
