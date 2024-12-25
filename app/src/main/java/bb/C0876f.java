package bb;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:bb/f.class
 */
/* renamed from: bb.f */
/* loaded from: combined.jar:classes2.jar:bb/f.class */
public class C0876f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    public final Matrix f5960a;

    public C0876f() {
        super(Matrix.class, "imageMatrixProperty");
        this.f5960a = new Matrix();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix get(ImageView imageView) {
        this.f5960a.set(imageView.getImageMatrix());
        return this.f5960a;
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
