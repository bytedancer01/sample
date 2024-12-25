package androidx.mediarouter.app;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.C0353t;
import p029c.C0920a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/mediarouter/app/MediaRouteVolumeSlider.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/MediaRouteVolumeSlider.class */
class MediaRouteVolumeSlider extends C0353t {

    /* renamed from: c */
    public final float f3864c;

    /* renamed from: d */
    public boolean f3865d;

    /* renamed from: e */
    public Drawable f3866e;

    /* renamed from: f */
    public int f3867f;

    /* renamed from: g */
    public int f3868g;

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0920a.f6099N);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3864c = C0612i.m3414h(context);
    }

    /* renamed from: a */
    public void m3257a(int i10) {
        m3258b(i10, i10);
    }

    /* renamed from: b */
    public void m3258b(int i10, int i11) {
        if (this.f3867f != i10) {
            if (Color.alpha(i10) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider progress and thumb color cannot be translucent: #" + Integer.toHexString(i10));
            }
            this.f3867f = i10;
        }
        if (this.f3868g != i11) {
            if (Color.alpha(i11) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider background color cannot be translucent: #" + Integer.toHexString(i11));
            }
            this.f3868g = i11;
        }
    }

    /* renamed from: c */
    public void m3259c(boolean z10) {
        if (this.f3865d == z10) {
            return;
        }
        this.f3865d = z10;
        super.setThumb(z10 ? null : this.f3866e);
    }

    @Override // androidx.appcompat.widget.C0353t, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int i10 = isEnabled() ? 255 : (int) (this.f3864c * 255.0f);
        this.f3866e.setColorFilter(this.f3867f, PorterDuff.Mode.SRC_IN);
        this.f3866e.setAlpha(i10);
        Drawable progressDrawable = getProgressDrawable();
        Drawable drawable = progressDrawable;
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            drawable = layerDrawable.findDrawableByLayerId(R.id.progress);
            layerDrawable.findDrawableByLayerId(R.id.background).setColorFilter(this.f3868g, PorterDuff.Mode.SRC_IN);
        }
        drawable.setColorFilter(this.f3867f, PorterDuff.Mode.SRC_IN);
        drawable.setAlpha(i10);
    }

    @Override // android.widget.AbsSeekBar
    public void setThumb(Drawable drawable) {
        this.f3866e = drawable;
        if (this.f3865d) {
            drawable = null;
        }
        super.setThumb(drawable);
    }
}
