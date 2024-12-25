package p194l3;

import java.util.concurrent.Executor;
import p109g3.C4936b;
import p121h3.InterfaceC5022a;
import p141i3.InterfaceC5168a;
import p141i3.InterfaceC5169b;
import p159j3.C5284b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l3/d.class
 */
/* renamed from: l3.d */
/* loaded from: combined.jar:classes1.jar:l3/d.class */
public final class C5669d implements InterfaceC5022a {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l3/d$a.class
     */
    /* renamed from: l3.d$a */
    /* loaded from: combined.jar:classes1.jar:l3/d$a.class */
    public static final class a implements InterfaceC5168a {

        /* renamed from: a */
        public volatile boolean f31954a;

        /* renamed from: b */
        public final C5284b f31955b;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:l3/d$a$a.class
         */
        /* renamed from: l3.d$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:l3/d$a$a.class */
        public class C10314a implements InterfaceC5168a.a {

            /* renamed from: a */
            public final InterfaceC5168a.a f31956a;

            /* renamed from: b */
            public final InterfaceC5168a.c f31957b;

            /* renamed from: c */
            public final InterfaceC5169b f31958c;

            /* renamed from: d */
            public final Executor f31959d;

            /* renamed from: e */
            public final a f31960e;

            public C10314a(a aVar, InterfaceC5168a.a aVar2, InterfaceC5168a.c cVar, InterfaceC5169b interfaceC5169b, Executor executor) {
                this.f31960e = aVar;
                this.f31956a = aVar2;
                this.f31957b = cVar;
                this.f31958c = interfaceC5169b;
                this.f31959d = executor;
            }

            @Override // p141i3.InterfaceC5168a.a
            public void onCompleted() {
                this.f31956a.onCompleted();
            }

            @Override // p141i3.InterfaceC5168a.a
            public void onFailure(C4936b c4936b) {
                this.f31960e.f31955b.m26387b(c4936b, "Failed to fetch network response for operation %s, trying to return cached one", this.f31957b.f29536b);
                if (this.f31960e.f31954a) {
                    return;
                }
                this.f31958c.mo25821a(this.f31957b.m25815b().m25818c(true).m25816a(), this.f31959d, this.f31956a);
            }

            @Override // p141i3.InterfaceC5168a.a
            public void onFetch(InterfaceC5168a.b bVar) {
                this.f31956a.onFetch(bVar);
            }

            @Override // p141i3.InterfaceC5168a.a
            public void onResponse(InterfaceC5168a.d dVar) {
                this.f31956a.onResponse(dVar);
            }
        }

        public a(C5284b c5284b) {
            this.f31955b = c5284b;
        }

        @Override // p141i3.InterfaceC5168a
        public void dispose() {
            this.f31954a = true;
        }

        @Override // p141i3.InterfaceC5168a
        public void interceptAsync(InterfaceC5168a.c cVar, InterfaceC5169b interfaceC5169b, Executor executor, InterfaceC5168a.a aVar) {
            interfaceC5169b.mo25821a(cVar.m25815b().m25818c(false).m25816a(), executor, new C10314a(this, aVar, cVar, interfaceC5169b, executor));
        }
    }

    @Override // p121h3.InterfaceC5022a
    /* renamed from: a */
    public InterfaceC5168a mo25228a(C5284b c5284b) {
        return new a(c5284b);
    }
}
