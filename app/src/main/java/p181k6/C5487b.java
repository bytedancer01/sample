package p181k6;

import java.util.Map;
import p181k6.AbstractC5491f;
import p227n6.InterfaceC6654a;
import p437z5.EnumC10056d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k6/b.class
 */
/* renamed from: k6.b */
/* loaded from: combined.jar:classes1.jar:k6/b.class */
public final class C5487b extends AbstractC5491f {

    /* renamed from: a */
    public final InterfaceC6654a f31323a;

    /* renamed from: b */
    public final Map<EnumC10056d, AbstractC5491f.b> f31324b;

    public C5487b(InterfaceC6654a interfaceC6654a, Map<EnumC10056d, AbstractC5491f.b> map) {
        if (interfaceC6654a == null) {
            throw new NullPointerException("Null clock");
        }
        this.f31323a = interfaceC6654a;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f31324b = map;
    }

    @Override // p181k6.AbstractC5491f
    /* renamed from: e */
    public InterfaceC6654a mo27282e() {
        return this.f31323a;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5491f)) {
            return false;
        }
        AbstractC5491f abstractC5491f = (AbstractC5491f) obj;
        if (!this.f31323a.equals(abstractC5491f.mo27282e()) || !this.f31324b.equals(abstractC5491f.mo27283h())) {
            z10 = false;
        }
        return z10;
    }

    @Override // p181k6.AbstractC5491f
    /* renamed from: h */
    public Map<EnumC10056d, AbstractC5491f.b> mo27283h() {
        return this.f31324b;
    }

    public int hashCode() {
        return ((this.f31323a.hashCode() ^ 1000003) * 1000003) ^ this.f31324b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f31323a + ", values=" + this.f31324b + "}";
    }
}
