package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/b.class
 */
/* renamed from: androidx.appcompat.widget.b */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/b.class */
public class C0299b extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f1969a;

    public C0299b(ActionBarContainer actionBarContainer) {
        this.f1969a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1969a;
        if (actionBarContainer.f1688i) {
            Drawable drawable = actionBarContainer.f1687h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1685f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1969a;
        Drawable drawable3 = actionBarContainer2.f1686g;
        if (drawable3 == null || !actionBarContainer2.f1689j) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f1969a;
        if (actionBarContainer.f1688i) {
            drawable = actionBarContainer.f1687h;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f1685f;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
