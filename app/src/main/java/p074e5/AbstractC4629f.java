package p074e5;

import java.io.Serializable;
import p111g5.AbstractC4950d;
import p123h5.AbstractC5032f;
import p123h5.C5031e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e5/f.class
 */
/* renamed from: e5.f */
/* loaded from: combined.jar:classes1.jar:e5/f.class */
public abstract class AbstractC4629f extends AbstractC4627d implements Serializable {

    /* renamed from: b */
    public final C5031e f27330b;

    /* renamed from: c */
    public final AbstractC5032f f27331c;

    /* renamed from: d */
    public final C4628e f27332d;

    /* renamed from: e */
    public final int f27333e;

    /* renamed from: f */
    public final Class<?> f27334f;

    /* renamed from: g */
    public transient AbstractC4950d f27335g;

    public AbstractC4629f(AbstractC5032f abstractC5032f, C5031e c5031e) {
        if (abstractC5032f == null) {
            throw new IllegalArgumentException("Can not pass null DeserializerFactory");
        }
        this.f27331c = abstractC5032f;
        this.f27330b = c5031e == null ? new C5031e() : c5031e;
        this.f27333e = 0;
        this.f27332d = null;
        this.f27334f = null;
        this.f27335g = null;
    }
}
