package p194l3;

import java.util.concurrent.Executor;
import p033c3.AbstractC0984d;
import p109g3.C4936b;
import p121h3.InterfaceC5022a;
import p141i3.InterfaceC5168a;
import p141i3.InterfaceC5169b;
import p159j3.C5284b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l3/a.class
 */
/* renamed from: l3.a */
/* loaded from: combined.jar:classes1.jar:l3/a.class */
public final class C5666a implements InterfaceC5022a {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l3/a$b.class
     */
    /* renamed from: l3.a$b */
    /* loaded from: combined.jar:classes1.jar:l3/a$b.class */
    public static final class b implements InterfaceC5168a {

        /* renamed from: a */
        public AbstractC0984d<InterfaceC5168a.d> f31934a;

        /* renamed from: b */
        public AbstractC0984d<InterfaceC5168a.d> f31935b;

        /* renamed from: c */
        public AbstractC0984d<C4936b> f31936c;

        /* renamed from: d */
        public AbstractC0984d<C4936b> f31937d;

        /* renamed from: e */
        public boolean f31938e;

        /* renamed from: f */
        public InterfaceC5168a.a f31939f;

        /* renamed from: g */
        public volatile boolean f31940g;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:l3/a$b$a.class
         */
        /* renamed from: l3.a$b$a */
        /* loaded from: combined.jar:classes1.jar:l3/a$b$a.class */
        public class a implements InterfaceC5168a.a {

            /* renamed from: a */
            public final InterfaceC5168a.a f31941a;

            /* renamed from: b */
            public final b f31942b;

            public a(b bVar, InterfaceC5168a.a aVar) {
                this.f31942b = bVar;
                this.f31941a = aVar;
            }

            @Override // p141i3.InterfaceC5168a.a
            public void onCompleted() {
            }

            @Override // p141i3.InterfaceC5168a.a
            public void onFailure(C4936b c4936b) {
                this.f31942b.m27890f(c4936b);
            }

            @Override // p141i3.InterfaceC5168a.a
            public void onFetch(InterfaceC5168a.b bVar) {
                this.f31941a.onFetch(bVar);
            }

            @Override // p141i3.InterfaceC5168a.a
            public void onResponse(InterfaceC5168a.d dVar) {
                this.f31942b.m27891g(dVar);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:l3/a$b$b.class
         */
        /* renamed from: l3.a$b$b, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:l3/a$b$b.class */
        public class C10313b implements InterfaceC5168a.a {

            /* renamed from: a */
            public final InterfaceC5168a.a f31943a;

            /* renamed from: b */
            public final b f31944b;

            public C10313b(b bVar, InterfaceC5168a.a aVar) {
                this.f31944b = bVar;
                this.f31943a = aVar;
            }

            @Override // p141i3.InterfaceC5168a.a
            public void onCompleted() {
            }

            @Override // p141i3.InterfaceC5168a.a
            public void onFailure(C4936b c4936b) {
                this.f31944b.m27892h(c4936b);
            }

            @Override // p141i3.InterfaceC5168a.a
            public void onFetch(InterfaceC5168a.b bVar) {
                this.f31943a.onFetch(bVar);
            }

            @Override // p141i3.InterfaceC5168a.a
            public void onResponse(InterfaceC5168a.d dVar) {
                this.f31944b.m27893i(dVar);
            }
        }

        public b() {
            this.f31934a = AbstractC0984d.m5887a();
            this.f31935b = AbstractC0984d.m5887a();
            this.f31936c = AbstractC0984d.m5887a();
            this.f31937d = AbstractC0984d.m5887a();
        }

        @Override // p141i3.InterfaceC5168a
        public void dispose() {
            this.f31940g = true;
        }

        /* renamed from: e */
        public final void m27889e() {
            InterfaceC5168a.a aVar;
            synchronized (this) {
                if (this.f31940g) {
                    return;
                }
                if (!this.f31938e) {
                    if (this.f31934a.mo5882f()) {
                        this.f31939f.onResponse(this.f31934a.mo5881e());
                    } else if (this.f31936c.mo5882f()) {
                    }
                    this.f31938e = true;
                }
                if (this.f31938e) {
                    if (this.f31935b.mo5882f()) {
                        this.f31939f.onResponse(this.f31935b.mo5881e());
                        aVar = this.f31939f;
                    } else if (this.f31937d.mo5882f()) {
                        if (this.f31936c.mo5882f()) {
                            this.f31939f.onFailure(this.f31937d.mo5881e());
                        } else {
                            aVar = this.f31939f;
                        }
                    }
                    aVar.onCompleted();
                }
            }
        }

        /* renamed from: f */
        public final void m27890f(C4936b c4936b) {
            synchronized (this) {
                this.f31936c = AbstractC0984d.m5889h(c4936b);
                m27889e();
            }
        }

        /* renamed from: g */
        public final void m27891g(InterfaceC5168a.d dVar) {
            synchronized (this) {
                this.f31934a = AbstractC0984d.m5889h(dVar);
                m27889e();
            }
        }

        /* renamed from: h */
        public final void m27892h(C4936b c4936b) {
            synchronized (this) {
                this.f31937d = AbstractC0984d.m5889h(c4936b);
                m27889e();
            }
        }

        /* renamed from: i */
        public final void m27893i(InterfaceC5168a.d dVar) {
            synchronized (this) {
                this.f31935b = AbstractC0984d.m5889h(dVar);
                m27889e();
            }
        }

        @Override // p141i3.InterfaceC5168a
        public void interceptAsync(InterfaceC5168a.c cVar, InterfaceC5169b interfaceC5169b, Executor executor, InterfaceC5168a.a aVar) {
            if (this.f31940g) {
                return;
            }
            this.f31939f = aVar;
            interfaceC5169b.mo25821a(cVar.m25815b().m25818c(true).m25816a(), executor, new a(this, aVar));
            interfaceC5169b.mo25821a(cVar.m25815b().m25818c(false).m25816a(), executor, new C10313b(this, aVar));
        }
    }

    @Override // p121h3.InterfaceC5022a
    /* renamed from: a */
    public InterfaceC5168a mo25228a(C5284b c5284b) {
        return new b();
    }
}
