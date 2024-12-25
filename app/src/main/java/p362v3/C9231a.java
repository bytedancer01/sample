package p362v3;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v3/a.class
 */
/* renamed from: v3.a */
/* loaded from: combined.jar:classes1.jar:v3/a.class */
public class C9231a {

    /* renamed from: q */
    public static final String f42175q = "a";

    /* renamed from: r */
    public static final Bitmap.Config f42176r = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public int[] f42177a;

    /* renamed from: c */
    public ByteBuffer f42179c;

    /* renamed from: e */
    public short[] f42181e;

    /* renamed from: f */
    public byte[] f42182f;

    /* renamed from: g */
    public byte[] f42183g;

    /* renamed from: h */
    public byte[] f42184h;

    /* renamed from: i */
    public int[] f42185i;

    /* renamed from: j */
    public int f42186j;

    /* renamed from: k */
    public byte[] f42187k;

    /* renamed from: m */
    public a f42189m;

    /* renamed from: n */
    public Bitmap f42190n;

    /* renamed from: o */
    public boolean f42191o;

    /* renamed from: p */
    public int f42192p;

    /* renamed from: b */
    public final int[] f42178b = new int[256];

    /* renamed from: d */
    public final byte[] f42180d = new byte[256];

    /* renamed from: l */
    public C9233c f42188l = new C9233c();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:v3/a$a.class
     */
    /* renamed from: v3.a$a */
    /* loaded from: combined.jar:classes1.jar:v3/a$a.class */
    public interface a {
        /* renamed from: a */
        void mo27899a(Bitmap bitmap);

        /* renamed from: b */
        Bitmap mo27900b(int i10, int i11, Bitmap.Config config);
    }

    public C9231a(a aVar) {
        this.f42189m = aVar;
    }

    @TargetApi(12)
    /* renamed from: m */
    public static void m38908m(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
    }

    /* renamed from: a */
    public void m38909a() {
        this.f42186j = (this.f42186j + 1) % this.f42188l.f42206c;
    }

    /* renamed from: b */
    public void m38910b() {
        this.f42188l = null;
        this.f42187k = null;
        this.f42184h = null;
        this.f42185i = null;
        Bitmap bitmap = this.f42190n;
        if (bitmap != null) {
            this.f42189m.mo27899a(bitmap);
        }
        this.f42190n = null;
        this.f42179c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x02b9 A[LOOP:5: B:71:0x02b4->B:73:0x02b9, LOOP_END] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m38911c(p362v3.C9232b r6) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p362v3.C9231a.m38911c(v3.b):void");
    }

    /* renamed from: d */
    public int m38912d() {
        return this.f42186j;
    }

    /* renamed from: e */
    public int m38913e(int i10) {
        int i11;
        if (i10 >= 0) {
            C9233c c9233c = this.f42188l;
            if (i10 < c9233c.f42206c) {
                i11 = c9233c.f42208e.get(i10).f42201i;
                return i11;
            }
        }
        i11 = -1;
        return i11;
    }

    /* renamed from: f */
    public int m38914f() {
        return this.f42188l.f42206c;
    }

    /* renamed from: g */
    public final Bitmap m38915g() {
        a aVar = this.f42189m;
        C9233c c9233c = this.f42188l;
        int i10 = c9233c.f42209f;
        int i11 = c9233c.f42210g;
        Bitmap.Config config = f42176r;
        Bitmap mo27900b = aVar.mo27900b(i10, i11, config);
        Bitmap bitmap = mo27900b;
        if (mo27900b == null) {
            C9233c c9233c2 = this.f42188l;
            bitmap = Bitmap.createBitmap(c9233c2.f42209f, c9233c2.f42210g, config);
        }
        m38908m(bitmap);
        return bitmap;
    }

    /* renamed from: h */
    public int m38916h() {
        int i10;
        if (this.f42188l.f42206c <= 0 || (i10 = this.f42186j) < 0) {
            return -1;
        }
        return m38913e(i10);
    }

    /* renamed from: i */
    public Bitmap m38917i() {
        synchronized (this) {
            if (this.f42188l.f42206c <= 0 || this.f42186j < 0) {
                String str = f42175q;
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "unable to decode frame, frameCount=" + this.f42188l.f42206c + " framePointer=" + this.f42186j);
                }
                this.f42192p = 1;
            }
            int i10 = this.f42192p;
            if (i10 == 1 || i10 == 2) {
                String str2 = f42175q;
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "Unable to decode frame, status=" + this.f42192p);
                }
                return null;
            }
            this.f42192p = 0;
            C9232b c9232b = this.f42188l.f42208e.get(this.f42186j);
            int i11 = this.f42186j - 1;
            C9232b c9232b2 = i11 >= 0 ? this.f42188l.f42208e.get(i11) : null;
            int[] iArr = c9232b.f42203k;
            if (iArr == null) {
                iArr = this.f42188l.f42204a;
            }
            this.f42177a = iArr;
            if (iArr == null) {
                String str3 = f42175q;
                if (Log.isLoggable(str3, 3)) {
                    Log.d(str3, "No Valid Color Table");
                }
                this.f42192p = 1;
                return null;
            }
            if (c9232b.f42198f) {
                System.arraycopy(iArr, 0, this.f42178b, 0, iArr.length);
                int[] iArr2 = this.f42178b;
                this.f42177a = iArr2;
                iArr2[c9232b.f42200h] = 0;
            }
            return m38922o(c9232b, c9232b2);
        }
    }

    /* renamed from: j */
    public int m38918j() {
        int i10 = this.f42188l.f42216m;
        if (i10 == -1) {
            return 1;
        }
        if (i10 == 0) {
            return 0;
        }
        return i10 + 1;
    }

    /* renamed from: k */
    public final int m38919k() {
        int i10;
        try {
            i10 = this.f42179c.get() & 255;
        } catch (Exception e10) {
            this.f42192p = 1;
            i10 = 0;
        }
        return i10;
    }

    /* renamed from: l */
    public final int m38920l() {
        int m38919k = m38919k();
        int i10 = 0;
        int i11 = 0;
        if (m38919k > 0) {
            while (true) {
                i10 = i11;
                if (i11 >= m38919k) {
                    break;
                }
                int i12 = m38919k - i11;
                try {
                    this.f42179c.get(this.f42180d, i11, i12);
                    i11 += i12;
                } catch (Exception e10) {
                    Log.w(f42175q, "Error Reading Block", e10);
                    this.f42192p = 1;
                    i10 = i11;
                }
            }
        }
        return i10;
    }

    /* renamed from: n */
    public void m38921n(C9233c c9233c, byte[] bArr) {
        this.f42188l = c9233c;
        this.f42187k = bArr;
        this.f42192p = 0;
        this.f42186j = -1;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.f42179c = wrap;
        wrap.rewind();
        this.f42179c.order(ByteOrder.LITTLE_ENDIAN);
        this.f42191o = false;
        Iterator<C9232b> it = c9233c.f42208e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().f42199g == 3) {
                this.f42191o = true;
                break;
            }
        }
        int i10 = c9233c.f42209f;
        int i11 = c9233c.f42210g;
        this.f42184h = new byte[i10 * i11];
        this.f42185i = new int[i10 * i11];
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (r0.f42213j == r10.f42200h) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2 A[EDGE_INSN: B:25:0x00d2->B:32:0x00d2 BREAK  A[LOOP:0: B:17:0x007f->B:24:0x00aa], SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap m38922o(p362v3.C9232b r10, p362v3.C9232b r11) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p362v3.C9231a.m38922o(v3.b, v3.b):android.graphics.Bitmap");
    }
}
