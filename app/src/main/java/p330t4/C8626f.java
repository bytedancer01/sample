package p330t4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p160j4.AbstractC5293b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t4/f.class
 */
/* renamed from: t4.f */
/* loaded from: combined.jar:classes1.jar:t4/f.class */
public class C8626f {
    /* renamed from: a */
    public <Z> InterfaceC8630j<Z> m37052a(ImageView imageView, Class<Z> cls) {
        if (AbstractC5293b.class.isAssignableFrom(cls)) {
            return new C8624d(imageView);
        }
        if (Bitmap.class.equals(cls)) {
            return new C8622b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C8623c(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
