package p036c6;

import java.util.Set;
import p437z5.C10054b;
import p437z5.InterfaceC10057e;
import p437z5.InterfaceC10058f;
import p437z5.InterfaceC10059g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c6/p.class
 */
/* renamed from: c6.p */
/* loaded from: combined.jar:classes1.jar:c6/p.class */
public final class C1005p implements InterfaceC10059g {

    /* renamed from: a */
    public final Set<C10054b> f6818a;

    /* renamed from: b */
    public final AbstractC1004o f6819b;

    /* renamed from: c */
    public final InterfaceC1008s f6820c;

    public C1005p(Set<C10054b> set, AbstractC1004o abstractC1004o, InterfaceC1008s interfaceC1008s) {
        this.f6818a = set;
        this.f6819b = abstractC1004o;
        this.f6820c = interfaceC1008s;
    }

    @Override // p437z5.InterfaceC10059g
    /* renamed from: a */
    public <T> InterfaceC10058f<T> mo5963a(String str, Class<T> cls, C10054b c10054b, InterfaceC10057e<T, byte[]> interfaceC10057e) {
        if (this.f6818a.contains(c10054b)) {
            return new C1007r(this.f6819b, str, c10054b, interfaceC10057e, this.f6820c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c10054b, this.f6818a));
    }
}
