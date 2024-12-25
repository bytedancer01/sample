package p364v5;

import android.util.Property;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v5/c.class
 */
/* renamed from: v5.c */
/* loaded from: combined.jar:classes1.jar:v5/c.class */
public abstract class AbstractC9245c<T> extends Property<T, Integer> {
    public AbstractC9245c(String str) {
        super(Integer.class, str);
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void set(T t10, Integer num) {
        mo38984b(t10, num.intValue());
    }

    /* renamed from: b */
    public abstract void mo38984b(T t10, int i10);
}
