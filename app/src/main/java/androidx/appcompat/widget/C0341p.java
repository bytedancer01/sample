package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.amazonaws.services.p045s3.internal.Constants;
import p106g0.InterfaceC4925k;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/p.class
 */
/* renamed from: androidx.appcompat.widget.p */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/p.class */
public class C0341p {

    /* renamed from: c */
    public static final int[] f2199c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a */
    public final ProgressBar f2200a;

    /* renamed from: b */
    public Bitmap f2201b;

    public C0341p(ProgressBar progressBar) {
        this.f2200a = progressBar;
    }

    /* renamed from: a */
    public final Shape m1544a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* renamed from: b */
    public Bitmap m1545b() {
        return this.f2201b;
    }

    /* renamed from: c */
    public void mo1546c(AttributeSet attributeSet, int i10) {
        C0337n1 m1505v = C0337n1.m1505v(this.f2200a.getContext(), attributeSet, f2199c, i10, 0);
        Drawable m1513h = m1505v.m1513h(0);
        if (m1513h != null) {
            this.f2200a.setIndeterminateDrawable(m1548e(m1513h));
        }
        Drawable m1513h2 = m1505v.m1513h(1);
        if (m1513h2 != null) {
            this.f2200a.setProgressDrawable(m1547d(m1513h2, false));
        }
        m1505v.m1525w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final Drawable m1547d(Drawable drawable, boolean z10) {
        if (drawable instanceof InterfaceC4925k) {
            InterfaceC4925k interfaceC4925k = (InterfaceC4925k) drawable;
            Drawable mo24861a = interfaceC4925k.mo24861a();
            if (mo24861a != null) {
                interfaceC4925k.mo24862b(m1547d(mo24861a, z10));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    int id2 = layerDrawable.getId(i10);
                    drawableArr[i10] = m1547d(layerDrawable.getDrawable(i10), id2 == 16908301 || id2 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i11 = 0; i11 < numberOfLayers; i11++) {
                    layerDrawable2.setId(i11, layerDrawable.getId(i11));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f2201b == null) {
                    this.f2201b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(m1544a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                Drawable drawable2 = shapeDrawable;
                if (z10) {
                    drawable2 = new ClipDrawable(shapeDrawable, 3, 1);
                }
                return drawable2;
            }
        }
        return drawable;
    }

    /* renamed from: e */
    public final Drawable m1548e(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            AnimationDrawable animationDrawable2 = new AnimationDrawable();
            animationDrawable2.setOneShot(animationDrawable.isOneShot());
            for (int i10 = 0; i10 < numberOfFrames; i10++) {
                Drawable m1547d = m1547d(animationDrawable.getFrame(i10), true);
                m1547d.setLevel(Constants.MAXIMUM_UPLOAD_PARTS);
                animationDrawable2.addFrame(m1547d, animationDrawable.getDuration(i10));
            }
            animationDrawable2.setLevel(Constants.MAXIMUM_UPLOAD_PARTS);
            drawable2 = animationDrawable2;
        }
        return drawable2;
    }
}
