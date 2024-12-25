package p022b4;

import android.annotation.SuppressLint;
import p022b4.InterfaceC0798h;
import p363v4.C9239e;
import p396x3.InterfaceC9646c;
import p435z3.InterfaceC10048l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b4/g.class
 */
/* renamed from: b4.g */
/* loaded from: combined.jar:classes1.jar:b4/g.class */
public class C0797g extends C9239e<InterfaceC9646c, InterfaceC10048l<?>> implements InterfaceC0798h {

    /* renamed from: e */
    public InterfaceC0798h.a f5543e;

    public C0797g(int i10) {
        super(i10);
    }

    @Override // p022b4.InterfaceC0798h
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC10048l mo5100a(InterfaceC9646c interfaceC9646c) {
        return (InterfaceC10048l) super.m38958l(interfaceC9646c);
    }

    @Override // p022b4.InterfaceC0798h
    @SuppressLint({"InlinedApi"})
    /* renamed from: b */
    public void mo5101b(int i10) {
        if (i10 >= 60) {
            m38953c();
        } else if (i10 >= 40) {
            m38959m(m38956h() / 2);
        }
    }

    @Override // p022b4.InterfaceC0798h
    /* renamed from: d */
    public /* bridge */ /* synthetic */ InterfaceC10048l mo5102d(InterfaceC9646c interfaceC9646c, InterfaceC10048l interfaceC10048l) {
        return (InterfaceC10048l) super.m38957k(interfaceC9646c, interfaceC10048l);
    }

    @Override // p022b4.InterfaceC0798h
    /* renamed from: e */
    public void mo5103e(InterfaceC0798h.a aVar) {
        this.f5543e = aVar;
    }

    @Override // p363v4.C9239e
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int mo5104i(InterfaceC10048l<?> interfaceC10048l) {
        return interfaceC10048l.getSize();
    }

    @Override // p363v4.C9239e
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo5105j(InterfaceC9646c interfaceC9646c, InterfaceC10048l<?> interfaceC10048l) {
        InterfaceC0798h.a aVar = this.f5543e;
        if (aVar != null) {
            aVar.mo5109a(interfaceC10048l);
        }
    }
}
