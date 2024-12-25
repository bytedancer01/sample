package pl.droidsonroids.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TextView;
import java.io.IOException;
import pl.droidsonroids.gif.C7737c;

/* loaded from: combined.jar:classes3.jar:pl/droidsonroids/gif/GifTextView.class */
public class GifTextView extends TextView {

    /* renamed from: b */
    public C7737c.a f37520b;

    public GifTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m33792c(attributeSet, 0, 0);
    }

    /* renamed from: d */
    public static void m33789d(Drawable[] drawableArr, boolean z10) {
        for (Drawable drawable : drawableArr) {
            if (drawable != null) {
                drawable.setVisible(z10, false);
            }
        }
    }

    private void setCompoundDrawablesVisible(boolean z10) {
        m33789d(getCompoundDrawables(), z10);
        m33789d(getCompoundDrawablesRelative(), z10);
    }

    /* renamed from: a */
    public final void m33790a() {
        if (this.f37520b.f37546b < 0) {
            return;
        }
        for (Drawable drawable : getCompoundDrawables()) {
            C7737c.m33808a(this.f37520b.f37546b, drawable);
        }
        for (Drawable drawable2 : getCompoundDrawablesRelative()) {
            C7737c.m33808a(this.f37520b.f37546b, drawable2);
        }
        C7737c.m33808a(this.f37520b.f37546b, getBackground());
    }

    /* renamed from: b */
    public final Drawable m33791b(int i10) {
        if (i10 == 0) {
            return null;
        }
        Resources resources = getResources();
        String resourceTypeName = resources.getResourceTypeName(i10);
        if (!isInEditMode() && C7737c.f37544a.contains(resourceTypeName)) {
            try {
                return new C7735a(resources, i10);
            } catch (Resources.NotFoundException | IOException e10) {
            }
        }
        return resources.getDrawable(i10, getContext().getTheme());
    }

    /* renamed from: c */
    public final void m33792c(AttributeSet attributeSet, int i10, int i11) {
        Drawable drawable;
        Drawable drawable2;
        if (attributeSet != null) {
            Drawable m33791b = m33791b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableLeft", 0));
            Drawable m33791b2 = m33791b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableTop", 0));
            Drawable m33791b3 = m33791b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableRight", 0));
            Drawable m33791b4 = m33791b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableBottom", 0));
            Drawable m33791b5 = m33791b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableStart", 0));
            Drawable m33791b6 = m33791b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableEnd", 0));
            if (getLayoutDirection() == 0) {
                if (m33791b5 == null) {
                    m33791b5 = m33791b;
                }
                drawable2 = m33791b5;
                drawable = m33791b6;
                if (m33791b6 == null) {
                    drawable = m33791b3;
                    drawable2 = m33791b5;
                }
            } else {
                if (m33791b5 == null) {
                    m33791b5 = m33791b3;
                }
                drawable = m33791b6;
                if (m33791b6 == null) {
                    drawable = m33791b;
                }
                drawable2 = m33791b5;
            }
            setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, m33791b2, drawable, m33791b4);
            setBackground(m33791b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "background", 0)));
            this.f37520b = new C7737c.a(this, attributeSet, i10, i11);
            m33790a();
        }
        this.f37520b = new C7737c.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setCompoundDrawablesVisible(true);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setCompoundDrawablesVisible(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C7736b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7736b c7736b = (C7736b) parcelable;
        super.onRestoreInstanceState(c7736b.getSuperState());
        Drawable[] compoundDrawables = getCompoundDrawables();
        c7736b.m33805b(compoundDrawables[0], 0);
        c7736b.m33805b(compoundDrawables[1], 1);
        c7736b.m33805b(compoundDrawables[2], 2);
        c7736b.m33805b(compoundDrawables[3], 3);
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        c7736b.m33805b(compoundDrawablesRelative[0], 4);
        c7736b.m33805b(compoundDrawablesRelative[2], 5);
        c7736b.m33805b(getBackground(), 6);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Drawable[] drawableArr = new Drawable[7];
        if (this.f37520b.f37545a) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            System.arraycopy(compoundDrawables, 0, drawableArr, 0, compoundDrawables.length);
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            drawableArr[4] = compoundDrawablesRelative[0];
            drawableArr[5] = compoundDrawablesRelative[2];
            drawableArr[6] = getBackground();
        }
        return new C7736b(super.onSaveInstanceState(), drawableArr);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        setBackground(m33791b(i10));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(m33791b(i10), m33791b(i11), m33791b(i12), m33791b(i13));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        setCompoundDrawablesWithIntrinsicBounds(m33791b(i10), m33791b(i11), m33791b(i12), m33791b(i13));
    }

    public void setFreezesAnimation(boolean z10) {
        this.f37520b.f37545a = z10;
    }
}
