package p036c6;

import p437z5.AbstractC10055c;
import p437z5.C10054b;
import p437z5.InterfaceC10057e;
import p437z5.InterfaceC10058f;
import p437z5.InterfaceC10060h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c6/r.class
 */
/* renamed from: c6.r */
/* loaded from: combined.jar:classes1.jar:c6/r.class */
public final class C1007r<T> implements InterfaceC10058f<T> {

    /* renamed from: a */
    public final AbstractC1004o f6821a;

    /* renamed from: b */
    public final String f6822b;

    /* renamed from: c */
    public final C10054b f6823c;

    /* renamed from: d */
    public final InterfaceC10057e<T, byte[]> f6824d;

    /* renamed from: e */
    public final InterfaceC1008s f6825e;

    public C1007r(AbstractC1004o abstractC1004o, String str, C10054b c10054b, InterfaceC10057e<T, byte[]> interfaceC10057e, InterfaceC1008s interfaceC1008s) {
        this.f6821a = abstractC1004o;
        this.f6822b = str;
        this.f6823c = c10054b;
        this.f6824d = interfaceC10057e;
        this.f6825e = interfaceC1008s;
    }

    /* renamed from: c */
    public static /* synthetic */ void m5966c(Exception exc) {
    }

    @Override // p437z5.InterfaceC10058f
    /* renamed from: a */
    public void mo5967a(AbstractC10055c<T> abstractC10055c) {
        m5968d(abstractC10055c, new InterfaceC10060h() { // from class: c6.q
            @Override // p437z5.InterfaceC10060h
            /* renamed from: a */
            public final void mo5964a(Exception exc) {
                C1007r.m5966c(exc);
            }
        });
    }

    /* renamed from: d */
    public void m5968d(AbstractC10055c<T> abstractC10055c, InterfaceC10060h interfaceC10060h) {
        this.f6825e.mo5969a(AbstractC1003n.m5958a().mo5925e(this.f6821a).mo5923c(abstractC10055c).mo5926f(this.f6822b).mo5924d(this.f6824d).mo5922b(this.f6823c).mo5921a(), interfaceC10060h);
    }
}
