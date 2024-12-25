package bb;

import android.util.Property;
import android.view.ViewGroup;
import p012ab.C0146f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:bb/d.class
 */
/* renamed from: bb.d */
/* loaded from: combined.jar:classes2.jar:bb/d.class */
public class C0874d extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final Property<ViewGroup, Float> f5957a = new C0874d("childrenAlpha");

    public C0874d(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(ViewGroup viewGroup) {
        Float f10 = (Float) viewGroup.getTag(C0146f.f736B);
        return f10 != null ? f10 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ViewGroup viewGroup, Float f10) {
        float floatValue = f10.floatValue();
        viewGroup.setTag(C0146f.f736B, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            viewGroup.getChildAt(i10).setAlpha(floatValue);
        }
    }
}
