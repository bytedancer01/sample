package p338te;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import java.io.ByteArrayOutputStream;
import td.C8696k;
import td.C8701p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:te/t.class
 */
/* renamed from: te.t */
/* loaded from: combined.jar:classes2.jar:te/t.class */
public class C8722t {

    /* renamed from: a */
    public C8718p f40528a;

    /* renamed from: b */
    public int f40529b;

    /* renamed from: c */
    public int f40530c;

    /* renamed from: d */
    public Rect f40531d;

    /* renamed from: e */
    public int f40532e = 1;

    /* renamed from: f */
    public boolean f40533f;

    public C8722t(byte[] bArr, int i10, int i11, int i12, int i13) {
        this.f40528a = new C8718p(bArr, i10, i11);
        this.f40530c = i13;
        this.f40529b = i12;
        if (i10 * i11 <= bArr.length) {
            return;
        }
        throw new IllegalArgumentException("Image data does not match the resolution. " + i10 + "x" + i11 + " > " + bArr.length);
    }

    /* renamed from: a */
    public C8696k m37268a() {
        C8718p m37253a = this.f40528a.m37257h(this.f40530c).m37253a(this.f40531d, this.f40532e);
        return new C8696k(m37253a.m37254b(), m37253a.m37256d(), m37253a.m37255c(), 0, 0, m37253a.m37256d(), m37253a.m37255c(), false);
    }

    /* renamed from: b */
    public Bitmap m37269b(Rect rect, int i10) {
        Rect rect2;
        if (rect == null) {
            rect2 = new Rect(0, 0, this.f40528a.m37256d(), this.f40528a.m37255c());
        } else {
            rect2 = rect;
            if (m37270c()) {
                rect2 = new Rect(rect.top, rect.left, rect.bottom, rect.right);
            }
        }
        YuvImage yuvImage = new YuvImage(this.f40528a.m37254b(), this.f40529b, this.f40528a.m37256d(), this.f40528a.m37255c(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect2, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i10;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        Bitmap bitmap = decodeByteArray;
        if (this.f40530c != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(this.f40530c);
            bitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
        }
        return bitmap;
    }

    /* renamed from: c */
    public boolean m37270c() {
        return this.f40530c % 180 != 0;
    }

    /* renamed from: d */
    public void m37271d(Rect rect) {
        this.f40531d = rect;
    }

    /* renamed from: e */
    public void m37272e(boolean z10) {
        this.f40533f = z10;
    }

    /* renamed from: f */
    public C8701p m37273f(C8701p c8701p) {
        float m37222c = (c8701p.m37222c() * this.f40532e) + this.f40531d.left;
        float m37223d = c8701p.m37223d();
        float f10 = this.f40532e;
        float f11 = this.f40531d.top;
        float f12 = m37222c;
        if (this.f40533f) {
            f12 = this.f40528a.m37256d() - m37222c;
        }
        return new C8701p(f12, (m37223d * f10) + f11);
    }
}
