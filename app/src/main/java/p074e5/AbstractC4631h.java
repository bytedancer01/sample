package p074e5;

import java.io.Serializable;
import java.lang.reflect.Type;
import p035c5.AbstractC0989a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e5/h.class
 */
/* renamed from: e5.h */
/* loaded from: combined.jar:classes1.jar:e5/h.class */
public abstract class AbstractC4631h extends AbstractC0989a implements Serializable, Type {

    /* renamed from: b */
    public final Class<?> f27336b;

    /* renamed from: c */
    public final int f27337c;

    /* renamed from: d */
    public final Object f27338d;

    /* renamed from: e */
    public final Object f27339e;

    /* renamed from: f */
    public final boolean f27340f;

    public AbstractC4631h(Class<?> cls, int i10, Object obj, Object obj2, boolean z10) {
        this.f27336b = cls;
        this.f27337c = cls.getName().hashCode() + i10;
        this.f27338d = obj;
        this.f27339e = obj2;
        this.f27340f = z10;
    }

    /* renamed from: b */
    public String m23271b() {
        StringBuilder sb2 = new StringBuilder(40);
        mo23272c(sb2);
        return sb2.toString();
    }

    /* renamed from: c */
    public abstract StringBuilder mo23272c(StringBuilder sb2);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        return this.f27337c;
    }
}
