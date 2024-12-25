package p036c6;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import p162j6.InterfaceC5300e;
import p181k6.C5503r;
import p181k6.C5507v;
import p227n6.InterfaceC6654a;
import p437z5.C10054b;
import p437z5.InterfaceC10059g;
import p437z5.InterfaceC10060h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c6/t.class
 */
/* renamed from: c6.t */
/* loaded from: combined.jar:classes1.jar:c6/t.class */
public class C1009t implements InterfaceC1008s {

    /* renamed from: e */
    public static volatile AbstractC1010u f6826e;

    /* renamed from: a */
    public final InterfaceC6654a f6827a;

    /* renamed from: b */
    public final InterfaceC6654a f6828b;

    /* renamed from: c */
    public final InterfaceC5300e f6829c;

    /* renamed from: d */
    public final C5503r f6830d;

    public C1009t(InterfaceC6654a interfaceC6654a, InterfaceC6654a interfaceC6654a2, InterfaceC5300e interfaceC5300e, C5503r c5503r, C5507v c5507v) {
        this.f6827a = interfaceC6654a;
        this.f6828b = interfaceC6654a2;
        this.f6829c = interfaceC5300e;
        this.f6830d = c5503r;
        c5507v.m27336c();
    }

    /* renamed from: c */
    public static C1009t m5970c() {
        AbstractC1010u abstractC1010u = f6826e;
        if (abstractC1010u != null) {
            return abstractC1010u.mo5936l();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    public static Set<C10054b> m5971d(InterfaceC0995f interfaceC0995f) {
        return interfaceC0995f instanceof InterfaceC0996g ? Collections.unmodifiableSet(((InterfaceC0996g) interfaceC0995f).mo275a()) : Collections.singleton(C10054b.m42268b("proto"));
    }

    /* renamed from: f */
    public static void m5972f(Context context) {
        if (f6826e == null) {
            synchronized (C1009t.class) {
                try {
                    if (f6826e == null) {
                        f6826e = C0994e.m5934o().mo5938a(context).build();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p036c6.InterfaceC1008s
    /* renamed from: a */
    public void mo5969a(AbstractC1003n abstractC1003n, InterfaceC10060h interfaceC10060h) {
        this.f6829c.mo26483a(abstractC1003n.mo5919f().m5962f(abstractC1003n.mo5917c().mo42267c()), m5973b(abstractC1003n), interfaceC10060h);
    }

    /* renamed from: b */
    public final AbstractC0998i m5973b(AbstractC1003n abstractC1003n) {
        return AbstractC0998i.m5942a().mo5913i(this.f6827a.mo30655a()).mo5915k(this.f6828b.mo30655a()).mo5914j(abstractC1003n.mo5920g()).mo5912h(new C0997h(abstractC1003n.mo5916b(), abstractC1003n.m5959d())).mo5911g(abstractC1003n.mo5917c().mo42265a()).mo5908d();
    }

    /* renamed from: e */
    public C5503r m5974e() {
        return this.f6830d;
    }

    /* renamed from: g */
    public InterfaceC10059g m5975g(InterfaceC0995f interfaceC0995f) {
        return new C1005p(m5971d(interfaceC0995f), AbstractC1004o.m5960a().mo5931b(interfaceC0995f.getName()).mo5932c(interfaceC0995f.getExtras()).mo5930a(), this);
    }
}
