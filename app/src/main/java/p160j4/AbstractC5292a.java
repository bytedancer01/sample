package p160j4;

import android.graphics.drawable.Drawable;
import p435z3.InterfaceC10048l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j4/a.class
 */
/* renamed from: j4.a */
/* loaded from: combined.jar:classes1.jar:j4/a.class */
public abstract class AbstractC5292a<T extends Drawable> implements InterfaceC10048l<T> {

    /* renamed from: a */
    public final T f30446a;

    public AbstractC5292a(T t10) {
        if (t10 == null) {
            throw new NullPointerException("Drawable must not be null!");
        }
        this.f30446a = t10;
    }

    @Override // p435z3.InterfaceC10048l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T get() {
        return (T) this.f30446a.getConstantState().newDrawable();
    }
}
