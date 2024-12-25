package ph;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5392k;
import p172jh.C5393l;
import p172jh.C5398q;
import p233nh.InterfaceC6789d;
import p252oh.C6976c;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ph/a.class
 */
/* renamed from: ph.a */
/* loaded from: combined.jar:classes2.jar:ph/a.class */
public abstract class AbstractC7714a implements InterfaceC6789d<Object>, InterfaceC7717d, Serializable {

    /* renamed from: b */
    @Nullable
    public final InterfaceC6789d<Object> f37479b;

    public AbstractC7714a(@Nullable InterfaceC6789d<Object> interfaceC6789d) {
        this.f37479b = interfaceC6789d;
    }

    @Override // ph.InterfaceC7717d
    @Nullable
    /* renamed from: a */
    public InterfaceC7717d mo22751a() {
        InterfaceC6789d<Object> interfaceC6789d = this.f37479b;
        return interfaceC6789d instanceof InterfaceC7717d ? (InterfaceC7717d) interfaceC6789d : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p233nh.InterfaceC6789d
    /* renamed from: c */
    public final void mo22620c(@NotNull Object obj) {
        Object mo4817k;
        InterfaceC6789d interfaceC6789d = this;
        do {
            C7720g.m33719b(interfaceC6789d);
            AbstractC7714a abstractC7714a = (AbstractC7714a) interfaceC6789d;
            interfaceC6789d = abstractC7714a.f37479b;
            C9367f.m39524c(interfaceC6789d);
            try {
                mo4817k = abstractC7714a.mo4817k(obj);
            } catch (Throwable th2) {
                C5392k.a aVar = C5392k.f30764b;
                obj = C5392k.m26741a(C5393l.m26745a(th2));
            }
            if (mo4817k == C6976c.m32004d()) {
                return;
            }
            obj = C5392k.m26741a(mo4817k);
            abstractC7714a.mo33707n();
        } while (interfaceC6789d instanceof AbstractC7714a);
        interfaceC6789d.mo22620c(obj);
    }

    @NotNull
    /* renamed from: f */
    public InterfaceC6789d<C5398q> mo4816f(@Nullable Object obj, @NotNull InterfaceC6789d<?> interfaceC6789d) {
        C9367f.m39526e(interfaceC6789d, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @NotNull
    /* renamed from: g */
    public InterfaceC6789d<C5398q> m33704g(@NotNull InterfaceC6789d<?> interfaceC6789d) {
        C9367f.m39526e(interfaceC6789d, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Nullable
    /* renamed from: i */
    public final InterfaceC6789d<Object> m33705i() {
        return this.f37479b;
    }

    @Nullable
    /* renamed from: j */
    public StackTraceElement m33706j() {
        return C7719f.m33717d(this);
    }

    @Nullable
    /* renamed from: k */
    public abstract Object mo4817k(@NotNull Object obj);

    /* renamed from: n */
    public void mo33707n() {
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object m33706j = m33706j();
        if (m33706j == null) {
            m33706j = getClass().getName();
        }
        sb2.append(m33706j);
        return sb2.toString();
    }
}
