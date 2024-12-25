package p385wb;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import org.achartengine.renderer.DefaultRenderer;
import p087f0.C4738a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wb/a.class
 */
/* renamed from: wb.a */
/* loaded from: combined.jar:classes2.jar:wb/a.class */
public class C9558a {

    /* renamed from: i */
    public static final int[] f43532i = new int[3];

    /* renamed from: j */
    public static final float[] f43533j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f43534k = new int[4];

    /* renamed from: l */
    public static final float[] f43535l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    public final Paint f43536a;

    /* renamed from: b */
    public final Paint f43537b;

    /* renamed from: c */
    public final Paint f43538c;

    /* renamed from: d */
    public int f43539d;

    /* renamed from: e */
    public int f43540e;

    /* renamed from: f */
    public int f43541f;

    /* renamed from: g */
    public final Path f43542g;

    /* renamed from: h */
    public Paint f43543h;

    public C9558a() {
        this(DefaultRenderer.BACKGROUND_COLOR);
    }

    public C9558a(int i10) {
        this.f43542g = new Path();
        this.f43543h = new Paint();
        this.f43536a = new Paint();
        m40096d(i10);
        this.f43543h.setColor(0);
        Paint paint = new Paint(4);
        this.f43537b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f43538c = new Paint(paint);
    }

    /* renamed from: a */
    public void m40093a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        boolean z10 = f11 < 0.0f;
        Path path = this.f43542g;
        if (z10) {
            int[] iArr = f43534k;
            iArr[0] = 0;
            iArr[1] = this.f43541f;
            iArr[2] = this.f43540e;
            iArr[3] = this.f43539d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i10;
            rectF.inset(f12, f12);
            int[] iArr2 = f43534k;
            iArr2[0] = 0;
            iArr2[1] = this.f43539d;
            iArr2[2] = this.f43540e;
            iArr2[3] = this.f43541f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f13 = 1.0f - (i10 / width);
        float f14 = (1.0f - f13) / 2.0f;
        float[] fArr = f43535l;
        fArr[1] = f13;
        fArr[2] = f14 + f13;
        this.f43537b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f43534k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f43543h);
        }
        canvas.drawArc(rectF, f10, f11, true, this.f43537b);
        canvas.restore();
    }

    /* renamed from: b */
    public void m40094b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f43532i;
        iArr[0] = this.f43541f;
        iArr[1] = this.f43540e;
        iArr[2] = this.f43539d;
        Paint paint = this.f43538c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f43533j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f43538c);
        canvas.restore();
    }

    /* renamed from: c */
    public Paint m40095c() {
        return this.f43536a;
    }

    /* renamed from: d */
    public void m40096d(int i10) {
        this.f43539d = C4738a.m23974m(i10, 68);
        this.f43540e = C4738a.m23974m(i10, 20);
        this.f43541f = C4738a.m23974m(i10, 0);
        this.f43536a.setColor(this.f43539d);
    }
}
