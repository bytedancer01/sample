package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p413y0.C9789b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/MediaRowFocusView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/MediaRowFocusView.class */
class MediaRowFocusView extends View {

    /* renamed from: b */
    public final Paint f3222b;

    /* renamed from: c */
    public final RectF f3223c;

    /* renamed from: d */
    public int f3224d;

    public MediaRowFocusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3223c = new RectF();
        this.f3222b = m2468a(context);
    }

    /* renamed from: a */
    public final Paint m2468a(Context context) {
        Paint paint = new Paint();
        paint.setColor(context.getResources().getColor(C9789b.f44925e));
        return paint;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        this.f3224d = height;
        int height2 = ((height * 2) - getHeight()) / 2;
        this.f3223c.set(0.0f, -height2, getWidth(), getHeight() + height2);
        RectF rectF = this.f3223c;
        int i10 = this.f3224d;
        canvas.drawRoundRect(rectF, i10, i10, this.f3222b);
    }
}
