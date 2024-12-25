package p067di;

import fi.C4866e;
import fi.C4885x;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p136hi.AbstractRunnableC5127i;
import p136hi.InterfaceC5128j;
import p172jh.C5382a;
import p172jh.C5392k;
import p172jh.C5393l;
import p172jh.C5398q;
import p233nh.InterfaceC6789d;
import p233nh.InterfaceC6792g;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/l0.class
 */
/* renamed from: di.l0 */
/* loaded from: combined.jar:classes2.jar:di/l0.class */
public abstract class AbstractC4492l0<T> extends AbstractRunnableC5127i {

    /* renamed from: d */
    public int f26912d;

    public AbstractC4492l0(int i10) {
        this.f26912d = i10;
    }

    /* renamed from: d */
    public void mo22752d(@Nullable Object obj, @NotNull Throwable th2) {
    }

    @NotNull
    /* renamed from: f */
    public abstract InterfaceC6789d<T> mo22753f();

    @Nullable
    /* renamed from: g */
    public Throwable mo22754g(@Nullable Object obj) {
        C4521v c4521v = obj instanceof C4521v ? (C4521v) obj : null;
        return c4521v == null ? null : c4521v.f26946a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public <T> T mo22755h(@Nullable Object obj) {
        return obj;
    }

    /* renamed from: i */
    public final void m22782i(@Nullable Throwable th2, @Nullable Throwable th3) {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            C5382a.m26732a(th2, th3);
        }
        Throwable th4 = th2;
        if (th2 == null) {
            th4 = th3;
        }
        C9367f.m39524c(th4);
        C4468d0.m22650a(mo22753f().mo22619b(), new C4480h0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th4));
    }

    @Nullable
    /* renamed from: j */
    public abstract Object mo22756j();

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object m26741a;
        Object m26741a2;
        Object m26741a3;
        InterfaceC5128j interfaceC5128j = this.f29428c;
        try {
            C4866e c4866e = (C4866e) mo22753f();
            InterfaceC6789d<T> interfaceC6789d = c4866e.f28553f;
            Object obj = c4866e.f28555h;
            InterfaceC6792g mo22619b = interfaceC6789d.mo22619b();
            Object m24818c = C4885x.m24818c(mo22619b, obj);
            C4523v1<?> m22630e = m24818c != C4885x.f28587a ? C4459a0.m22630e(interfaceC6789d, mo22619b, m24818c) : null;
            try {
                InterfaceC6792g mo22619b2 = interfaceC6789d.mo22619b();
                Object mo22756j = mo22756j();
                Throwable mo22754g = mo22754g(mo22756j);
                InterfaceC4466c1 interfaceC4466c1 = (mo22754g == null && C4495m0.m22784b(this.f26912d)) ? (InterfaceC4466c1) mo22619b2.get(InterfaceC4466c1.f26879b0) : null;
                if (interfaceC4466c1 != null && !interfaceC4466c1.isActive()) {
                    CancellationException mo22640l = interfaceC4466c1.mo22640l();
                    mo22752d(mo22756j, mo22640l);
                    C5392k.a aVar = C5392k.f30764b;
                    m26741a2 = C5392k.m26741a(C5393l.m26745a(mo22640l));
                } else if (mo22754g != null) {
                    C5392k.a aVar2 = C5392k.f30764b;
                    m26741a2 = C5392k.m26741a(C5393l.m26745a(mo22754g));
                } else {
                    m26741a2 = C5392k.m26741a(mo22755h(mo22756j));
                }
                interfaceC6789d.mo22620c(m26741a2);
                C5398q c5398q = C5398q.f30770a;
                if (m22630e == null || m22630e.m22847t0()) {
                    C4885x.m24816a(mo22619b, m24818c);
                }
                try {
                    interfaceC5128j.mo25716B();
                    m26741a3 = C5392k.m26741a(C5398q.f30770a);
                } catch (Throwable th2) {
                    C5392k.a aVar3 = C5392k.f30764b;
                    m26741a3 = C5392k.m26741a(C5393l.m26745a(th2));
                }
                m22782i(null, C5392k.m26742b(m26741a3));
            } catch (Throwable th3) {
                if (m22630e == null || m22630e.m22847t0()) {
                    C4885x.m24816a(mo22619b, m24818c);
                }
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                C5392k.a aVar4 = C5392k.f30764b;
                interfaceC5128j.mo25716B();
                m26741a = C5392k.m26741a(C5398q.f30770a);
            } catch (Throwable th5) {
                C5392k.a aVar5 = C5392k.f30764b;
                m26741a = C5392k.m26741a(C5393l.m26745a(th5));
            }
            m22782i(th4, C5392k.m26742b(m26741a));
        }
    }
}
