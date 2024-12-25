package p159j3;

import p033c3.AbstractC0984d;
import p033c3.C0986f;
import p434z2.InterfaceC10036e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j3/b.class
 */
/* renamed from: j3.b */
/* loaded from: combined.jar:classes1.jar:j3/b.class */
public final class C5284b {

    /* renamed from: a */
    public final AbstractC0984d<InterfaceC10036e> f30334a;

    public C5284b(AbstractC0984d<InterfaceC10036e> abstractC0984d) {
        this.f30334a = (AbstractC0984d) C0986f.m5892c(abstractC0984d, "logger == null");
    }

    /* renamed from: a */
    public void m26386a(String str, Object... objArr) {
        m26390e(3, str, null, objArr);
    }

    /* renamed from: b */
    public void m26387b(Throwable th2, String str, Object... objArr) {
        m26390e(3, str, th2, objArr);
    }

    /* renamed from: c */
    public void m26388c(String str, Object... objArr) {
        m26390e(6, str, null, objArr);
    }

    /* renamed from: d */
    public void m26389d(Throwable th2, String str, Object... objArr) {
        m26390e(6, str, th2, objArr);
    }

    /* renamed from: e */
    public final void m26390e(int i10, String str, Throwable th2, Object... objArr) {
        if (this.f30334a.mo5882f()) {
            this.f30334a.mo5881e().m42206a(i10, str, AbstractC0984d.m5888d(th2), objArr);
        }
    }

    /* renamed from: f */
    public void m26391f(String str, Object... objArr) {
        m26390e(5, str, null, objArr);
    }

    /* renamed from: g */
    public void m26392g(Throwable th2, String str, Object... objArr) {
        m26390e(5, str, th2, objArr);
    }
}
