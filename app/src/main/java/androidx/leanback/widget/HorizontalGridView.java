package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import org.achartengine.renderer.DefaultRenderer;
import p413y0.C9799l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/HorizontalGridView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/HorizontalGridView.class */
public class HorizontalGridView extends AbstractC0496b {

    /* renamed from: b1 */
    public boolean f3203b1;

    /* renamed from: c1 */
    public boolean f3204c1;

    /* renamed from: d1 */
    public Paint f3205d1;

    /* renamed from: e1 */
    public Bitmap f3206e1;

    /* renamed from: f1 */
    public LinearGradient f3207f1;

    /* renamed from: g1 */
    public int f3208g1;

    /* renamed from: h1 */
    public int f3209h1;

    /* renamed from: i1 */
    public Bitmap f3210i1;

    /* renamed from: j1 */
    public LinearGradient f3211j1;

    /* renamed from: k1 */
    public int f3212k1;

    /* renamed from: l1 */
    public int f3213l1;

    /* renamed from: m1 */
    public Rect f3214m1;

    public HorizontalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3205d1 = new Paint();
        this.f3214m1 = new Rect();
        this.f3393R0.m2842q4(0);
        m2460G1(context, attributeSet);
    }

    private Bitmap getTempBitmapHigh() {
        Bitmap bitmap = this.f3210i1;
        if (bitmap == null || bitmap.getWidth() != this.f3212k1 || this.f3210i1.getHeight() != getHeight()) {
            this.f3210i1 = Bitmap.createBitmap(this.f3212k1, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.f3210i1;
    }

    private Bitmap getTempBitmapLow() {
        Bitmap bitmap = this.f3206e1;
        if (bitmap == null || bitmap.getWidth() != this.f3208g1 || this.f3206e1.getHeight() != getHeight()) {
            this.f3206e1 = Bitmap.createBitmap(this.f3208g1, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.f3206e1;
    }

    /* renamed from: G1 */
    public void m2460G1(Context context, AttributeSet attributeSet) {
        m2555E1(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9799l.f45047O);
        setRowHeight(obtainStyledAttributes);
        setNumRows(obtainStyledAttributes.getInt(C9799l.f45048P, 1));
        obtainStyledAttributes.recycle();
        m2463J1();
        Paint paint = new Paint();
        this.f3205d1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    /* renamed from: H1 */
    public final boolean m2461H1() {
        if (!this.f3204c1) {
            return false;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (this.f3393R0.m2756O2(getChildAt(childCount)) > (getWidth() - getPaddingRight()) + this.f3213l1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: I1 */
    public final boolean m2462I1() {
        if (!this.f3203b1) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (this.f3393R0.m2753N2(getChildAt(i10)) < getPaddingLeft() - this.f3209h1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J1 */
    public final void m2463J1() {
        if (this.f3203b1 || this.f3204c1) {
            setLayerType(2, null);
            setWillNotDraw(false);
        } else {
            setLayerType(0, null);
            setWillNotDraw(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        boolean m2462I1 = m2462I1();
        boolean m2461H1 = m2461H1();
        if (!m2462I1) {
            this.f3206e1 = null;
        }
        if (!m2461H1) {
            this.f3210i1 = null;
        }
        if (!m2462I1 && !m2461H1) {
            super.draw(canvas);
            return;
        }
        int paddingLeft = this.f3203b1 ? (getPaddingLeft() - this.f3209h1) - this.f3208g1 : 0;
        int width = this.f3204c1 ? (getWidth() - getPaddingRight()) + this.f3213l1 + this.f3212k1 : getWidth();
        int save = canvas.save();
        canvas.clipRect((this.f3203b1 ? this.f3208g1 : 0) + paddingLeft, 0, width - (this.f3204c1 ? this.f3212k1 : 0), getHeight());
        super.draw(canvas);
        canvas.restoreToCount(save);
        Canvas canvas2 = new Canvas();
        Rect rect = this.f3214m1;
        rect.top = 0;
        rect.bottom = getHeight();
        if (m2462I1 && this.f3208g1 > 0) {
            Bitmap tempBitmapLow = getTempBitmapLow();
            tempBitmapLow.eraseColor(0);
            canvas2.setBitmap(tempBitmapLow);
            int save2 = canvas2.save();
            canvas2.clipRect(0, 0, this.f3208g1, getHeight());
            float f10 = -paddingLeft;
            canvas2.translate(f10, 0.0f);
            super.draw(canvas2);
            canvas2.restoreToCount(save2);
            this.f3205d1.setShader(this.f3207f1);
            canvas2.drawRect(0.0f, 0.0f, this.f3208g1, getHeight(), this.f3205d1);
            Rect rect2 = this.f3214m1;
            rect2.left = 0;
            rect2.right = this.f3208g1;
            canvas.translate(paddingLeft, 0.0f);
            Rect rect3 = this.f3214m1;
            canvas.drawBitmap(tempBitmapLow, rect3, rect3, (Paint) null);
            canvas.translate(f10, 0.0f);
        }
        if (!m2461H1 || this.f3212k1 <= 0) {
            return;
        }
        Bitmap tempBitmapHigh = getTempBitmapHigh();
        tempBitmapHigh.eraseColor(0);
        canvas2.setBitmap(tempBitmapHigh);
        int save3 = canvas2.save();
        canvas2.clipRect(0, 0, this.f3212k1, getHeight());
        canvas2.translate(-(width - this.f3212k1), 0.0f);
        super.draw(canvas2);
        canvas2.restoreToCount(save3);
        this.f3205d1.setShader(this.f3211j1);
        canvas2.drawRect(0.0f, 0.0f, this.f3212k1, getHeight(), this.f3205d1);
        Rect rect4 = this.f3214m1;
        rect4.left = 0;
        rect4.right = this.f3212k1;
        canvas.translate(width - r0, 0.0f);
        Rect rect5 = this.f3214m1;
        canvas.drawBitmap(tempBitmapHigh, rect5, rect5, (Paint) null);
        canvas.translate(-(width - this.f3212k1), 0.0f);
    }

    public final boolean getFadingLeftEdge() {
        return this.f3203b1;
    }

    public final int getFadingLeftEdgeLength() {
        return this.f3208g1;
    }

    public final int getFadingLeftEdgeOffset() {
        return this.f3209h1;
    }

    public final boolean getFadingRightEdge() {
        return this.f3204c1;
    }

    public final int getFadingRightEdgeLength() {
        return this.f3212k1;
    }

    public final int getFadingRightEdgeOffset() {
        return this.f3213l1;
    }

    public final void setFadingLeftEdge(boolean z10) {
        if (this.f3203b1 != z10) {
            this.f3203b1 = z10;
            if (!z10) {
                this.f3206e1 = null;
            }
            invalidate();
            m2463J1();
        }
    }

    public final void setFadingLeftEdgeLength(int i10) {
        if (this.f3208g1 != i10) {
            this.f3208g1 = i10;
            this.f3207f1 = i10 != 0 ? new LinearGradient(0.0f, 0.0f, this.f3208g1, 0.0f, 0, DefaultRenderer.BACKGROUND_COLOR, Shader.TileMode.CLAMP) : null;
            invalidate();
        }
    }

    public final void setFadingLeftEdgeOffset(int i10) {
        if (this.f3209h1 != i10) {
            this.f3209h1 = i10;
            invalidate();
        }
    }

    public final void setFadingRightEdge(boolean z10) {
        if (this.f3204c1 != z10) {
            this.f3204c1 = z10;
            if (!z10) {
                this.f3210i1 = null;
            }
            invalidate();
            m2463J1();
        }
    }

    public final void setFadingRightEdgeLength(int i10) {
        if (this.f3212k1 != i10) {
            this.f3212k1 = i10;
            this.f3211j1 = i10 != 0 ? new LinearGradient(0.0f, 0.0f, this.f3212k1, 0.0f, DefaultRenderer.BACKGROUND_COLOR, 0, Shader.TileMode.CLAMP) : null;
            invalidate();
        }
    }

    public final void setFadingRightEdgeOffset(int i10) {
        if (this.f3213l1 != i10) {
            this.f3213l1 = i10;
            invalidate();
        }
    }

    public void setNumRows(int i10) {
        this.f3393R0.m2824m4(i10);
        requestLayout();
    }

    public void setRowHeight(int i10) {
        this.f3393R0.m2851s4(i10);
        requestLayout();
    }

    public void setRowHeight(TypedArray typedArray) {
        int i10 = C9799l.f45049Q;
        if (typedArray.peekValue(i10) != null) {
            setRowHeight(typedArray.getLayoutDimension(i10, 0));
        }
    }
}
