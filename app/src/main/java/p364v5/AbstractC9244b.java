package p364v5;

import android.util.Property;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v5/b.class
 */
/* renamed from: v5.b */
/* loaded from: combined.jar:classes1.jar:v5/b.class */
public abstract class AbstractC9244b<T> extends Property<T, Float> {
    public AbstractC9244b(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void set(T t10, Float f10) {
        mo38982b(t10, f10.floatValue());
    }

    /* renamed from: b */
    public abstract void mo38982b(T t10, float f10);
}
