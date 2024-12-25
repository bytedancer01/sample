package p003a2;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/j.class
 */
/* renamed from: a2.j */
/* loaded from: combined.jar:classes1.jar:a2/j.class */
public class C0023j implements TypeEvaluator<Rect> {

    /* renamed from: a */
    public Rect f81a;

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f10, Rect rect, Rect rect2) {
        int i10 = rect.left + ((int) ((rect2.left - r0) * f10));
        int i11 = rect.top + ((int) ((rect2.top - r0) * f10));
        int i12 = rect.right + ((int) ((rect2.right - r0) * f10));
        int i13 = rect.bottom + ((int) ((rect2.bottom - r0) * f10));
        Rect rect3 = this.f81a;
        if (rect3 == null) {
            return new Rect(i10, i11, i12, i13);
        }
        rect3.set(i10, i11, i12, i13);
        return this.f81a;
    }
}
