package p432z0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import p413y0.C9789b;
import p413y0.C9792e;
import p413y0.C9799l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:z0/a.class
 */
/* renamed from: z0.a */
/* loaded from: combined.jar:classes1.jar:z0/a.class */
public final class C10028a {

    /* renamed from: a */
    public final float f45996a;

    /* renamed from: b */
    public final float f45997b;

    /* renamed from: c */
    public final Paint f45998c;

    /* renamed from: d */
    public int f45999d;

    /* renamed from: e */
    public float f46000e;

    public C10028a(int i10, float f10, float f11) {
        float f12 = f10 > 1.0f ? 1.0f : f10;
        float f13 = f12 < 0.0f ? 0.0f : f12;
        float f14 = f11 > 1.0f ? 1.0f : f11;
        f14 = f14 < 0.0f ? 0.0f : f14;
        Paint paint = new Paint();
        this.f45998c = paint;
        paint.setColor(Color.rgb(Color.red(i10), Color.green(i10), Color.blue(i10)));
        this.f45996a = f13;
        this.f45997b = f14;
        m42180c(1.0f);
    }

    /* renamed from: a */
    public static C10028a m42178a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C9799l.f45079k);
        int color = obtainStyledAttributes.getColor(C9799l.f45086o, context.getResources().getColor(C9789b.f44934n));
        float fraction = obtainStyledAttributes.getFraction(C9799l.f45083m, 1, 1, context.getResources().getFraction(C9792e.f44972h, 1, 0));
        float fraction2 = obtainStyledAttributes.getFraction(C9799l.f45085n, 1, 1, context.getResources().getFraction(C9792e.f44973i, 1, 1));
        obtainStyledAttributes.recycle();
        return new C10028a(color, fraction, fraction2);
    }

    /* renamed from: b */
    public Paint m42179b() {
        return this.f45998c;
    }

    /* renamed from: c */
    public void m42180c(float f10) {
        float f11 = this.f45997b;
        float f12 = f11 + (f10 * (this.f45996a - f11));
        this.f46000e = f12;
        int i10 = (int) (f12 * 255.0f);
        this.f45999d = i10;
        this.f45998c.setAlpha(i10);
    }
}
