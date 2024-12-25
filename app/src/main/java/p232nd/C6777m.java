package p232nd;

import java.lang.reflect.Type;
import p188kd.AbstractC5569v;
import p188kd.C5552e;
import p232nd.C6775k;
import p308rd.C8462a;
import sd.C8555a;
import sd.C8557c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:nd/m.class
 */
/* renamed from: nd.m */
/* loaded from: combined.jar:classes2.jar:nd/m.class */
public final class C6777m<T> extends AbstractC5569v<T> {

    /* renamed from: a */
    public final C5552e f35307a;

    /* renamed from: b */
    public final AbstractC5569v<T> f35308b;

    /* renamed from: c */
    public final Type f35309c;

    public C6777m(C5552e c5552e, AbstractC5569v<T> abstractC5569v, Type type) {
        this.f35307a = c5552e;
        this.f35308b = abstractC5569v;
        this.f35309c = type;
    }

    @Override // p188kd.AbstractC5569v
    /* renamed from: b */
    public T mo27561b(C8555a c8555a) {
        return this.f35308b.mo27561b(c8555a);
    }

    @Override // p188kd.AbstractC5569v
    /* renamed from: d */
    public void mo27562d(C8557c c8557c, T t10) {
        AbstractC5569v<T> abstractC5569v = this.f35308b;
        Type m31153e = m31153e(this.f35309c, t10);
        if (m31153e != this.f35309c) {
            abstractC5569v = this.f35307a.m27550m(C8462a.m36349b(m31153e));
            if (abstractC5569v instanceof C6775k.b) {
                AbstractC5569v<T> abstractC5569v2 = this.f35308b;
                if (!(abstractC5569v2 instanceof C6775k.b)) {
                    abstractC5569v = abstractC5569v2;
                }
            }
        }
        abstractC5569v.mo27562d(c8557c, t10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if ((r4 instanceof java.lang.Class) != false) goto L10;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.reflect.Type m31153e(java.lang.reflect.Type r4, java.lang.Object r5) {
        /*
            r3 = this;
            r0 = r4
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L21
            r0 = r4
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 == r1) goto L1c
            r0 = r4
            boolean r0 = r0 instanceof java.lang.reflect.TypeVariable
            if (r0 != 0) goto L1c
            r0 = r4
            r6 = r0
            r0 = r4
            boolean r0 = r0 instanceof java.lang.Class
            if (r0 == 0) goto L21
        L1c:
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r6 = r0
        L21:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p232nd.C6777m.m31153e(java.lang.reflect.Type, java.lang.Object):java.lang.reflect.Type");
    }
}
