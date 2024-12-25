package p067di;

import fi.C4880s;
import fi.C4885x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5398q;
import p233nh.InterfaceC6789d;
import p233nh.InterfaceC6792g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/v1.class
 */
/* renamed from: di.v1 */
/* loaded from: combined.jar:classes2.jar:di/v1.class */
public final class C4523v1<T> extends C4880s<T> {

    /* renamed from: e */
    @Nullable
    public InterfaceC6792g f26949e;

    /* renamed from: f */
    @Nullable
    public Object f26950f;

    @Override // fi.C4880s, p067di.AbstractC4458a
    /* renamed from: p0 */
    public void mo22621p0(@Nullable Object obj) {
        InterfaceC6792g interfaceC6792g = this.f26949e;
        if (interfaceC6792g != null) {
            C4885x.m24816a(interfaceC6792g, this.f26950f);
            this.f26949e = null;
            this.f26950f = null;
        }
        Object m22849a = C4532z.m22849a(obj, this.f28584d);
        InterfaceC6789d<T> interfaceC6789d = this.f28584d;
        InterfaceC6792g mo22619b = interfaceC6789d.mo22619b();
        Object m24818c = C4885x.m24818c(mo22619b, null);
        C4523v1<?> c4523v1 = null;
        if (m24818c != C4885x.f28587a) {
            c4523v1 = C4459a0.m22630e(interfaceC6789d, mo22619b, m24818c);
        }
        try {
            this.f28584d.mo22620c(m22849a);
            C5398q c5398q = C5398q.f30770a;
            if (c4523v1 == null || c4523v1.m22847t0()) {
                C4885x.m24816a(mo22619b, m24818c);
            }
        } catch (Throwable th2) {
            if (c4523v1 == null || c4523v1.m22847t0()) {
                C4885x.m24816a(mo22619b, m24818c);
            }
            throw th2;
        }
    }

    /* renamed from: t0 */
    public final boolean m22847t0() {
        if (this.f26949e == null) {
            return false;
        }
        this.f26949e = null;
        this.f26950f = null;
        return true;
    }

    /* renamed from: u0 */
    public final void m22848u0(@NotNull InterfaceC6792g interfaceC6792g, @Nullable Object obj) {
        this.f26949e = interfaceC6792g;
        this.f26950f = obj;
    }
}
