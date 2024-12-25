package p056d6;

import android.content.Context;
import p227n6.InterfaceC6654a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:d6/c.class
 */
/* renamed from: d6.c */
/* loaded from: combined.jar:classes1.jar:d6/c.class */
public final class C4307c extends AbstractC4312h {

    /* renamed from: a */
    public final Context f26444a;

    /* renamed from: b */
    public final InterfaceC6654a f26445b;

    /* renamed from: c */
    public final InterfaceC6654a f26446c;

    /* renamed from: d */
    public final String f26447d;

    public C4307c(Context context, InterfaceC6654a interfaceC6654a, InterfaceC6654a interfaceC6654a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f26444a = context;
        if (interfaceC6654a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f26445b = interfaceC6654a;
        if (interfaceC6654a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f26446c = interfaceC6654a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f26447d = str;
    }

    @Override // p056d6.AbstractC4312h
    /* renamed from: b */
    public Context mo21775b() {
        return this.f26444a;
    }

    @Override // p056d6.AbstractC4312h
    /* renamed from: c */
    public String mo21776c() {
        return this.f26447d;
    }

    @Override // p056d6.AbstractC4312h
    /* renamed from: d */
    public InterfaceC6654a mo21777d() {
        return this.f26446c;
    }

    @Override // p056d6.AbstractC4312h
    /* renamed from: e */
    public InterfaceC6654a mo21778e() {
        return this.f26445b;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4312h)) {
            return false;
        }
        AbstractC4312h abstractC4312h = (AbstractC4312h) obj;
        if (!this.f26444a.equals(abstractC4312h.mo21775b()) || !this.f26445b.equals(abstractC4312h.mo21778e()) || !this.f26446c.equals(abstractC4312h.mo21777d()) || !this.f26447d.equals(abstractC4312h.mo21776c())) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return ((((((this.f26444a.hashCode() ^ 1000003) * 1000003) ^ this.f26445b.hashCode()) * 1000003) ^ this.f26446c.hashCode()) * 1000003) ^ this.f26447d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f26444a + ", wallClock=" + this.f26445b + ", monotonicClock=" + this.f26446c + ", backendName=" + this.f26447d + "}";
    }
}
