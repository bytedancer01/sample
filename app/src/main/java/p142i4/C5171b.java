package p142i4;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.OutputStream;
import p363v4.C9238d;
import p363v4.C9242h;
import p396x3.InterfaceC9649f;
import p435z3.InterfaceC10048l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i4/b.class
 */
/* renamed from: i4.b */
/* loaded from: combined.jar:classes1.jar:i4/b.class */
public class C5171b implements InterfaceC9649f<Bitmap> {

    /* renamed from: a */
    public Bitmap.CompressFormat f29548a;

    /* renamed from: b */
    public int f29549b;

    public C5171b() {
        this(null, 90);
    }

    public C5171b(Bitmap.CompressFormat compressFormat, int i10) {
        this.f29548a = compressFormat;
        this.f29549b = i10;
    }

    @Override // p396x3.InterfaceC9645b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean mo23245a(InterfaceC10048l<Bitmap> interfaceC10048l, OutputStream outputStream) {
        Bitmap bitmap = interfaceC10048l.get();
        long m38952b = C9238d.m38952b();
        Bitmap.CompressFormat m25823c = m25823c(bitmap);
        bitmap.compress(m25823c, this.f29549b, outputStream);
        if (!Log.isLoggable("BitmapEncoder", 2)) {
            return true;
        }
        Log.v("BitmapEncoder", "Compressed with type: " + m25823c + " of size " + C9242h.m38967e(bitmap) + " in " + C9238d.m38951a(m38952b));
        return true;
    }

    /* renamed from: c */
    public final Bitmap.CompressFormat m25823c(Bitmap bitmap) {
        Bitmap.CompressFormat compressFormat = this.f29548a;
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // p396x3.InterfaceC9645b
    public String getId() {
        return "BitmapEncoder.com.bumptech.glide.load.resource.bitmap";
    }
}
