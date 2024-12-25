package p194l3;

import java.util.concurrent.Executor;
import p109g3.C4936b;
import p121h3.InterfaceC5022a;
import p141i3.InterfaceC5168a;
import p141i3.InterfaceC5169b;
import p159j3.C5284b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l3/b.class
 */
/* renamed from: l3.b */
/* loaded from: combined.jar:classes1.jar:l3/b.class */
public final class C5667b implements InterfaceC5022a {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l3/b$b.class
     */
    /* renamed from: l3.b$b */
    /* loaded from: combined.jar:classes1.jar:l3/b$b.class */
    public static final class b implements InterfaceC5168a {

        /* renamed from: a */
        public volatile boolean f31945a;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:l3/b$b$a.class
         */
        /* renamed from: l3.b$b$a */
        /* loaded from: combined.jar:classes1.jar:l3/b$b$a.class */
        public class a implements InterfaceC5168a.a {

            /* renamed from: a */
            public final InterfaceC5168a.a f31946a;

            /* renamed from: b */
            public final InterfaceC5168a.c f31947b;

            /* renamed from: c */
            public final InterfaceC5169b f31948c;

            /* renamed from: d */
            public final Executor f31949d;

            /* renamed from: e */
            public final b f31950e;

            public a(b bVar, InterfaceC5168a.a aVar, InterfaceC5168a.c cVar, InterfaceC5169b interfaceC5169b, Executor executor) {
                this.f31950e = bVar;
                this.f31946a = aVar;
                this.f31947b = cVar;
                this.f31948c = interfaceC5169b;
                this.f31949d = executor;
            }

            @Override // p141i3.InterfaceC5168a.a
            public void onCompleted() {
                this.f31946a.onCompleted();
            }

            @Override // p141i3.InterfaceC5168a.a
            public void onFailure(C4936b c4936b) {
                if (this.f31950e.f31945a) {
                    return;
                }
                this.f31948c.mo25821a(this.f31947b.m25815b().m25818c(false).m25816a(), this.f31949d, this.f31946a);
            }

            @Override // p141i3.InterfaceC5168a.a
            public void onFetch(InterfaceC5168a.b bVar) {
                this.f31946a.onFetch(bVar);
            }

            @Override // p141i3.InterfaceC5168a.a
            public void onResponse(InterfaceC5168a.d dVar) {
                this.f31946a.onResponse(dVar);
            }
        }

        public b() {
        }

        @Override // p141i3.InterfaceC5168a
        public void dispose() {
            this.f31945a = true;
        }

        @Override // p141i3.InterfaceC5168a
        public void interceptAsync(InterfaceC5168a.c cVar, InterfaceC5169b interfaceC5169b, Executor executor, InterfaceC5168a.a aVar) {
            interfaceC5169b.mo25821a(cVar.m25815b().m25818c(true).m25816a(), executor, new a(this, aVar, cVar, interfaceC5169b, executor));
        }
    }

    @Override // p121h3.InterfaceC5022a
    /* renamed from: a */
    public InterfaceC5168a mo25228a(C5284b c5284b) {
        return new b();
    }
}
