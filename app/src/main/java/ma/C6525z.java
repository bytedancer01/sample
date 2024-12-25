package ma;

import android.os.Handler;
import android.os.Looper;
import lc.InterfaceFutureC5838a;
import p208m1.C5901j;
import p304r9.C8015b;
import p313s.C8491c;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/z.class
 */
/* renamed from: ma.z */
/* loaded from: combined.jar:classes2.jar:ma/z.class */
public final class C6525z implements C5901j.e {

    /* renamed from: c */
    public static final C8015b f34193c = new C8015b("MediaRouterOPTListener");

    /* renamed from: a */
    public final C6216k0 f34194a;

    /* renamed from: b */
    public final Handler f34195b = new HandlerC6385s1(Looper.getMainLooper());

    public C6525z(C6216k0 c6216k0) {
        this.f34194a = (C6216k0) C9935o.m41850j(c6216k0);
    }

    @Override // p208m1.C5901j.e
    /* renamed from: a */
    public final InterfaceFutureC5838a mo28959a(final C5901j.h hVar, final C5901j.h hVar2) {
        f34193c.m34873a("Prepare transfer from Route(%s) to Route(%s)", hVar, hVar2);
        return C8491c.m36640a(new C8491c.c(this, hVar, hVar2) { // from class: ma.y

            /* renamed from: a */
            public final C6525z f34172a;

            /* renamed from: b */
            public final C5901j.h f34173b;

            /* renamed from: c */
            public final C5901j.h f34174c;

            {
                this.f34172a = this;
                this.f34173b = hVar;
                this.f34174c = hVar2;
            }

            @Override // p313s.C8491c.c
            /* renamed from: a */
            public final Object mo30154a(C8491c.a aVar) {
                return this.f34172a.m30182b(this.f34173b, this.f34174c, aVar);
            }
        });
    }

    /* renamed from: b */
    public final /* synthetic */ Object m30182b(final C5901j.h hVar, final C5901j.h hVar2, final C8491c.a aVar) {
        return Boolean.valueOf(this.f34195b.post(new Runnable(this, hVar, hVar2, aVar) { // from class: ma.w

            /* renamed from: b */
            public final C6525z f34113b;

            /* renamed from: c */
            public final C5901j.h f34114c;

            /* renamed from: d */
            public final C5901j.h f34115d;

            /* renamed from: e */
            public final C8491c.a f34116e;

            {
                this.f34113b = this;
                this.f34114c = hVar;
                this.f34115d = hVar2;
                this.f34116e = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f34113b.m30183c(this.f34114c, this.f34115d, this.f34116e);
            }
        }));
    }

    /* renamed from: c */
    public final /* synthetic */ void m30183c(C5901j.h hVar, C5901j.h hVar2, C8491c.a aVar) {
        this.f34194a.m29802l(hVar, hVar2, aVar);
    }
}
