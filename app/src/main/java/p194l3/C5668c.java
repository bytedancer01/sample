package p194l3;

import java.util.concurrent.Executor;
import p004a3.C0053g;
import p004a3.InterfaceC0050d;
import p109g3.C4936b;
import p121h3.InterfaceC5022a;
import p141i3.InterfaceC5168a;
import p141i3.InterfaceC5169b;
import p159j3.C5284b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l3/c.class
 */
/* renamed from: l3.c */
/* loaded from: combined.jar:classes1.jar:l3/c.class */
public final class C5668c implements InterfaceC5022a {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l3/c$b.class
     */
    /* renamed from: l3.c$b */
    /* loaded from: combined.jar:classes1.jar:l3/c$b.class */
    public static final class b implements InterfaceC5168a {

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:l3/c$b$a.class
         */
        /* renamed from: l3.c$b$a */
        /* loaded from: combined.jar:classes1.jar:l3/c$b$a.class */
        public class a implements InterfaceC5168a.a {

            /* renamed from: a */
            public final InterfaceC5168a.a f31951a;

            /* renamed from: b */
            public final InterfaceC5168a.c f31952b;

            /* renamed from: c */
            public final b f31953c;

            public a(b bVar, InterfaceC5168a.a aVar, InterfaceC5168a.c cVar) {
                this.f31953c = bVar;
                this.f31951a = aVar;
                this.f31952b = cVar;
            }

            @Override // p141i3.InterfaceC5168a.a
            public void onCompleted() {
                this.f31951a.onCompleted();
            }

            @Override // p141i3.InterfaceC5168a.a
            public void onFailure(C4936b c4936b) {
                this.f31951a.onResponse(this.f31953c.m27896b(this.f31952b.f29536b));
                this.f31951a.onCompleted();
            }

            @Override // p141i3.InterfaceC5168a.a
            public void onFetch(InterfaceC5168a.b bVar) {
                this.f31951a.onFetch(bVar);
            }

            @Override // p141i3.InterfaceC5168a.a
            public void onResponse(InterfaceC5168a.d dVar) {
                this.f31951a.onResponse(dVar);
            }
        }

        public b() {
        }

        /* renamed from: b */
        public final InterfaceC5168a.d m27896b(InterfaceC0050d interfaceC0050d) {
            return new InterfaceC5168a.d(null, C0053g.m210a(interfaceC0050d).m225j(true).m221f(), null);
        }

        @Override // p141i3.InterfaceC5168a
        public void dispose() {
        }

        @Override // p141i3.InterfaceC5168a
        public void interceptAsync(InterfaceC5168a.c cVar, InterfaceC5169b interfaceC5169b, Executor executor, InterfaceC5168a.a aVar) {
            interfaceC5169b.mo25821a(cVar.m25815b().m25818c(true).m25816a(), executor, new a(this, aVar, cVar));
        }
    }

    @Override // p121h3.InterfaceC5022a
    /* renamed from: a */
    public InterfaceC5168a mo25228a(C5284b c5284b) {
        return new b();
    }
}
