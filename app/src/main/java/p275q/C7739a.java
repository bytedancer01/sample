package p275q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:q/a.class
 */
/* renamed from: q.a */
/* loaded from: combined.jar:classes1.jar:q/a.class */
public class C7739a implements InterfaceC7741c {
    @Override // p275q.InterfaceC7741c
    /* renamed from: a */
    public void mo33810a(InterfaceC7740b interfaceC7740b) {
        mo33823n(interfaceC7740b, mo33819j(interfaceC7740b));
    }

    @Override // p275q.InterfaceC7741c
    /* renamed from: b */
    public void mo33811b(InterfaceC7740b interfaceC7740b, float f10) {
        m33824o(interfaceC7740b).m33833h(f10);
    }

    @Override // p275q.InterfaceC7741c
    /* renamed from: c */
    public float mo33812c(InterfaceC7740b interfaceC7740b) {
        return interfaceC7740b.mo1690f().getElevation();
    }

    @Override // p275q.InterfaceC7741c
    /* renamed from: d */
    public float mo33813d(InterfaceC7740b interfaceC7740b) {
        return mo33817h(interfaceC7740b) * 2.0f;
    }

    @Override // p275q.InterfaceC7741c
    /* renamed from: e */
    public void mo33814e(InterfaceC7740b interfaceC7740b, float f10) {
        interfaceC7740b.mo1690f().setElevation(f10);
    }

    @Override // p275q.InterfaceC7741c
    /* renamed from: f */
    public void mo33815f(InterfaceC7740b interfaceC7740b, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        interfaceC7740b.mo1686b(new C7742d(colorStateList, f10));
        View mo1690f = interfaceC7740b.mo1690f();
        mo1690f.setClipToOutline(true);
        mo1690f.setElevation(f11);
        mo33823n(interfaceC7740b, f12);
    }

    @Override // p275q.InterfaceC7741c
    /* renamed from: g */
    public float mo33816g(InterfaceC7740b interfaceC7740b) {
        return mo33817h(interfaceC7740b) * 2.0f;
    }

    @Override // p275q.InterfaceC7741c
    /* renamed from: h */
    public float mo33817h(InterfaceC7740b interfaceC7740b) {
        return m33824o(interfaceC7740b).m33829d();
    }

    @Override // p275q.InterfaceC7741c
    /* renamed from: i */
    public void mo33818i(InterfaceC7740b interfaceC7740b) {
        mo33823n(interfaceC7740b, mo33819j(interfaceC7740b));
    }

    @Override // p275q.InterfaceC7741c
    /* renamed from: j */
    public float mo33819j(InterfaceC7740b interfaceC7740b) {
        return m33824o(interfaceC7740b).m33828c();
    }

    @Override // p275q.InterfaceC7741c
    /* renamed from: k */
    public ColorStateList mo33820k(InterfaceC7740b interfaceC7740b) {
        return m33824o(interfaceC7740b).m33827b();
    }

    @Override // p275q.InterfaceC7741c
    /* renamed from: l */
    public void mo33821l() {
    }

    @Override // p275q.InterfaceC7741c
    /* renamed from: m */
    public void mo33822m(InterfaceC7740b interfaceC7740b, ColorStateList colorStateList) {
        m33824o(interfaceC7740b).m33831f(colorStateList);
    }

    @Override // p275q.InterfaceC7741c
    /* renamed from: n */
    public void mo33823n(InterfaceC7740b interfaceC7740b, float f10) {
        m33824o(interfaceC7740b).m33832g(f10, interfaceC7740b.mo1687c(), interfaceC7740b.mo1689e());
        m33825p(interfaceC7740b);
    }

    /* renamed from: o */
    public final C7742d m33824o(InterfaceC7740b interfaceC7740b) {
        return (C7742d) interfaceC7740b.mo1688d();
    }

    /* renamed from: p */
    public void m33825p(InterfaceC7740b interfaceC7740b) {
        if (!interfaceC7740b.mo1687c()) {
            interfaceC7740b.mo1685a(0, 0, 0, 0);
            return;
        }
        float mo33819j = mo33819j(interfaceC7740b);
        float mo33817h = mo33817h(interfaceC7740b);
        int ceil = (int) Math.ceil(C7743e.m33835a(mo33819j, mo33817h, interfaceC7740b.mo1689e()));
        int ceil2 = (int) Math.ceil(C7743e.m33836b(mo33819j, mo33817h, interfaceC7740b.mo1689e()));
        interfaceC7740b.mo1685a(ceil, ceil2, ceil, ceil2);
    }
}
