package bb;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:bb/e.class
 */
/* renamed from: bb.e */
/* loaded from: combined.jar:classes2.jar:bb/e.class */
public class C0875e extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f5958b = new C0875e();

    /* renamed from: a */
    public final WeakHashMap<Drawable, Integer> f5959a;

    public C0875e() {
        super(Integer.class, "drawableAlphaCompat");
        this.f5959a = new WeakHashMap<>();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
