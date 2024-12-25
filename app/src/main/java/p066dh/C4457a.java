package p066dh;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import ch.AbstractC1112a;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:dh/a.class
 */
/* renamed from: dh.a */
/* loaded from: combined.jar:classes2.jar:dh/a.class */
public class C4457a extends AbstractC1112a {

    /* renamed from: i */
    public float[] f26868i = {1.0f, 1.0f, 1.0f};

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:dh/a$a.class
     */
    /* renamed from: dh.a$a */
    /* loaded from: combined.jar:classes2.jar:dh/a$a.class */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b */
        public final int f26869b;

        /* renamed from: c */
        public final C4457a f26870c;

        public a(C4457a c4457a, int i10) {
            this.f26870c = c4457a;
            this.f26869b = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f26870c.f26868i[this.f26869b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f26870c.m6685h();
        }
    }

    @Override // ch.AbstractC1112a
    /* renamed from: b */
    public void mo6679b(Canvas canvas, Paint paint) {
        float min = (Math.min(m6682e(), m6681d()) - 8.0f) / 6.0f;
        float m6682e = m6682e() / 2;
        float f10 = 2.0f * min;
        float m6681d = m6681d() / 2;
        for (int i10 = 0; i10 < 3; i10++) {
            canvas.save();
            float f11 = i10;
            canvas.translate((f10 * f11) + (m6682e - (f10 + 4.0f)) + (f11 * 4.0f), m6681d);
            float f12 = this.f26868i[i10];
            canvas.scale(f12, f12);
            canvas.drawCircle(0.0f, 0.0f, min, paint);
            canvas.restore();
        }
    }

    @Override // ch.AbstractC1112a
    /* renamed from: g */
    public ArrayList<ValueAnimator> mo6684g() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < 3; i10++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.3f, 1.0f);
            ofFloat.setDuration(750L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setStartDelay(new int[]{120, 240, 360}[i10]);
            m6678a(ofFloat, new a(this, i10));
            arrayList.add(ofFloat);
        }
        return arrayList;
    }
}
