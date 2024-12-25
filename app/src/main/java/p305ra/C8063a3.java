package p305ra;

import android.content.Context;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/a3.class
 */
/* renamed from: ra.a3 */
/* loaded from: combined.jar:classes2.jar:ra/a3.class */
public final class C8063a3 extends AbstractC8393w3 {

    /* renamed from: a */
    public final Context f38924a;

    /* renamed from: b */
    public final InterfaceC8139f4<AbstractC8109d4<C8228l3>> f38925b;

    public C8063a3(Context context, InterfaceC8139f4<AbstractC8109d4<C8228l3>> interfaceC8139f4) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.f38924a = context;
        this.f38925b = interfaceC8139f4;
    }

    @Override // p305ra.AbstractC8393w3
    /* renamed from: a */
    public final Context mo34994a() {
        return this.f38924a;
    }

    @Override // p305ra.AbstractC8393w3
    /* renamed from: b */
    public final InterfaceC8139f4<AbstractC8109d4<C8228l3>> mo34995b() {
        return this.f38925b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8393w3)) {
            return false;
        }
        AbstractC8393w3 abstractC8393w3 = (AbstractC8393w3) obj;
        if (!this.f38924a.equals(abstractC8393w3.mo34994a())) {
            return false;
        }
        InterfaceC8139f4<AbstractC8109d4<C8228l3>> interfaceC8139f4 = this.f38925b;
        InterfaceC8139f4<AbstractC8109d4<C8228l3>> mo34995b = abstractC8393w3.mo34995b();
        return interfaceC8139f4 == null ? mo34995b == null : interfaceC8139f4.equals(mo34995b);
    }

    public final int hashCode() {
        int hashCode = this.f38924a.hashCode();
        InterfaceC8139f4<AbstractC8109d4<C8228l3>> interfaceC8139f4 = this.f38925b;
        return ((hashCode ^ 1000003) * 1000003) ^ (interfaceC8139f4 == null ? 0 : interfaceC8139f4.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f38924a);
        String valueOf2 = String.valueOf(this.f38925b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 46 + valueOf2.length());
        sb2.append("FlagsContext{context=");
        sb2.append(valueOf);
        sb2.append(", hermeticFileOverrides=");
        sb2.append(valueOf2);
        sb2.append("}");
        return sb2.toString();
    }
}
