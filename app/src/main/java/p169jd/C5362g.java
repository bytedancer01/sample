package p169jd;

import android.content.Context;
import p169jd.C5363h;
import p287qc.InterfaceC7884e;
import p287qc.InterfaceC7887h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:jd/g.class
 */
/* renamed from: jd.g */
/* loaded from: combined.jar:classes2.jar:jd/g.class */
public final /* synthetic */ class C5362g implements InterfaceC7887h {

    /* renamed from: a */
    public final String f30677a;

    /* renamed from: b */
    public final C5363h.a f30678b;

    public C5362g(String str, C5363h.a aVar) {
        this.f30677a = str;
        this.f30678b = aVar;
    }

    /* renamed from: b */
    public static InterfaceC7887h m26663b(String str, C5363h.a aVar) {
        return new C5362g(str, aVar);
    }

    @Override // p287qc.InterfaceC7887h
    /* renamed from: a */
    public Object mo6307a(InterfaceC7884e interfaceC7884e) {
        AbstractC5361f m26662a;
        m26662a = AbstractC5361f.m26662a(this.f30677a, this.f30678b.mo26667a((Context) interfaceC7884e.get(Context.class)));
        return m26662a;
    }
}
