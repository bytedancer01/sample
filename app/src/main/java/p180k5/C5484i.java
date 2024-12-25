package p180k5;

import java.io.Serializable;
import java.util.Map;
import p180k5.AbstractC5481f;
import p300r5.C7959a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k5/i.class
 */
/* renamed from: k5.i */
/* loaded from: combined.jar:classes1.jar:k5/i.class */
public class C5484i implements AbstractC5481f.a, Serializable {

    /* renamed from: b */
    public final AbstractC5481f.a f31315b;

    /* renamed from: c */
    public Map<C7959a, Class<?>> f31316c;

    public C5484i(AbstractC5481f.a aVar) {
        this.f31315b = aVar;
    }

    @Override // p180k5.AbstractC5481f.a
    /* renamed from: a */
    public Class<?> mo24944a(Class<?> cls) {
        AbstractC5481f.a aVar = this.f31315b;
        Class<?> mo24944a = aVar == null ? null : aVar.mo24944a(cls);
        Class<?> cls2 = mo24944a;
        if (mo24944a == null) {
            Map<C7959a, Class<?>> map = this.f31316c;
            cls2 = mo24944a;
            if (map != null) {
                cls2 = map.get(new C7959a(cls));
            }
        }
        return cls2;
    }
}
