package p181k6;

import java.util.Iterator;
import java.util.concurrent.Executor;
import p036c6.AbstractC1004o;
import p197l6.InterfaceC5689d;
import p213m6.InterfaceC5931b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k6/v.class
 */
/* renamed from: k6.v */
/* loaded from: combined.jar:classes1.jar:k6/v.class */
public class C5507v {

    /* renamed from: a */
    public final Executor f31383a;

    /* renamed from: b */
    public final InterfaceC5689d f31384b;

    /* renamed from: c */
    public final InterfaceC5509x f31385c;

    /* renamed from: d */
    public final InterfaceC5931b f31386d;

    public C5507v(Executor executor, InterfaceC5689d interfaceC5689d, InterfaceC5509x interfaceC5509x, InterfaceC5931b interfaceC5931b) {
        this.f31383a = executor;
        this.f31384b = interfaceC5689d;
        this.f31385c = interfaceC5509x;
        this.f31386d = interfaceC5931b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m27334d() {
        Iterator<AbstractC1004o> it = this.f31384b.mo27961K().iterator();
        while (it.hasNext()) {
            this.f31385c.mo27292b(it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m27335e() {
        this.f31386d.mo28062p(new InterfaceC5931b.a(this) { // from class: k6.u

            /* renamed from: a */
            public final C5507v f31382a;

            {
                this.f31382a = this;
            }

            @Override // p213m6.InterfaceC5931b.a
            public final Object execute() {
                Object m27334d;
                m27334d = this.f31382a.m27334d();
                return m27334d;
            }
        });
    }

    /* renamed from: c */
    public void m27336c() {
        this.f31383a.execute(new Runnable(this) { // from class: k6.t

            /* renamed from: b */
            public final C5507v f31381b;

            {
                this.f31381b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f31381b.m27335e();
            }
        });
    }
}
