package p420y7;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p027b9.C0858p;
import p039c9.C1033c;
import p039c9.C1041k;
import p059d9.AbstractRunnableFutureC4371k0;
import p059d9.C4349a;
import p059d9.C4365h0;
import p059d9.C4401z0;
import p267p6.C7561b1;
import p420y7.InterfaceC9844b0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y7/g0.class
 */
/* renamed from: y7.g0 */
/* loaded from: combined.jar:classes2.jar:y7/g0.class */
public final class C9854g0 implements InterfaceC9844b0 {

    /* renamed from: a */
    public final Executor f45193a;

    /* renamed from: b */
    public final C0858p f45194b;

    /* renamed from: c */
    public final C1033c f45195c;

    /* renamed from: d */
    public final C1041k f45196d;

    /* renamed from: e */
    public final C4365h0 f45197e;

    /* renamed from: f */
    public InterfaceC9844b0.a f45198f;

    /* renamed from: g */
    public volatile AbstractRunnableFutureC4371k0<Void, IOException> f45199g;

    /* renamed from: h */
    public volatile boolean f45200h;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y7/g0$a.class
     */
    /* renamed from: y7.g0$a */
    /* loaded from: combined.jar:classes2.jar:y7/g0$a.class */
    public class a extends AbstractRunnableFutureC4371k0<Void, IOException> {

        /* renamed from: i */
        public final C9854g0 f45201i;

        public a(C9854g0 c9854g0) {
            this.f45201i = c9854g0;
        }

        @Override // p059d9.AbstractRunnableFutureC4371k0
        /* renamed from: d */
        public void mo22056d() {
            this.f45201i.f45196d.m6115b();
        }

        @Override // p059d9.AbstractRunnableFutureC4371k0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Void mo22057e() {
            this.f45201i.f45196d.m6114a();
            return null;
        }
    }

    public C9854g0(C7561b1 c7561b1, C1033c.c cVar, Executor executor) {
        this.f45193a = (Executor) C4349a.m21882e(executor);
        C4349a.m21882e(c7561b1.f36449b);
        C0858p m5383a = new C0858p.b().m5391i(c7561b1.f36449b.f36504a).m5388f(c7561b1.f36449b.f36509f).m5384b(4).m5383a();
        this.f45194b = m5383a;
        C1033c m6088c = cVar.m6088c();
        this.f45195c = m6088c;
        this.f45196d = new C1041k(m6088c, m5383a, null, new C1041k.a(this) { // from class: y7.f0

            /* renamed from: a */
            public final C9854g0 f45192a;

            {
                this.f45192a = this;
            }

            @Override // p039c9.C1041k.a
            /* renamed from: a */
            public final void mo6121a(long j10, long j11, long j12) {
                this.f45192a.m41408d(j10, j11, j12);
            }
        });
        this.f45197e = cVar.m6093h();
    }

    @Override // p420y7.InterfaceC9844b0
    /* renamed from: a */
    public void mo41375a(InterfaceC9844b0.a aVar) {
        this.f45198f = aVar;
        this.f45199g = new a(this);
        C4365h0 c4365h0 = this.f45197e;
        if (c4365h0 != null) {
            c4365h0.m22027a(-1000);
        }
        boolean z10 = false;
        while (!z10) {
            try {
                if (this.f45200h) {
                    break;
                }
                C4365h0 c4365h02 = this.f45197e;
                if (c4365h02 != null) {
                    c4365h02.m22028b(-1000);
                }
                this.f45193a.execute(this.f45199g);
                try {
                    this.f45199g.get();
                    z10 = true;
                } catch (ExecutionException e10) {
                    Throwable th2 = (Throwable) C4349a.m21882e(e10.getCause());
                    if (!(th2 instanceof C4365h0.a)) {
                        if (th2 instanceof IOException) {
                            throw ((IOException) th2);
                        }
                        C4401z0.m22352T0(th2);
                    }
                }
            } finally {
                this.f45199g.m22054b();
                C4365h0 c4365h03 = this.f45197e;
                if (c4365h03 != null) {
                    c4365h03.m22030d(-1000);
                }
            }
        }
    }

    @Override // p420y7.InterfaceC9844b0
    public void cancel() {
        this.f45200h = true;
        AbstractRunnableFutureC4371k0<Void, IOException> abstractRunnableFutureC4371k0 = this.f45199g;
        if (abstractRunnableFutureC4371k0 != null) {
            abstractRunnableFutureC4371k0.cancel(true);
        }
    }

    /* renamed from: d */
    public final void m41408d(long j10, long j11, long j12) {
        InterfaceC9844b0.a aVar = this.f45198f;
        if (aVar == null) {
            return;
        }
        aVar.mo41376a(j10, j11, (j10 == -1 || j10 == 0) ? -1.0f : (j11 * 100.0f) / j10);
    }

    @Override // p420y7.InterfaceC9844b0
    public void remove() {
        this.f45195c.m6077r().mo6063j(this.f45195c.m6078s().mo6109a(this.f45194b));
    }
}
