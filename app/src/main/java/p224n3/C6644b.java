package p224n3;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.Executor;
import p004a3.C0053g;
import p004a3.InterfaceC0050d;
import p004a3.InterfaceC0055i;
import p021b3.InterfaceC0789a;
import p109g3.C4936b;
import p109g3.C4937c;
import p109g3.C4939e;
import p141i3.InterfaceC5168a;
import p141i3.InterfaceC5169b;
import p159j3.C5284b;
import p173ji.C5410f0;
import p178k3.AbstractC5469h;
import p264p3.C7547a;
import p264p3.C7550d;
import p411xi.InterfaceC9763g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n3/b.class
 */
/* renamed from: n3.b */
/* loaded from: combined.jar:classes1.jar:n3/b.class */
public final class C6644b implements InterfaceC5168a {

    /* renamed from: a */
    public final InterfaceC0789a f34645a;

    /* renamed from: b */
    public final AbstractC5469h<Map<String, Object>> f34646b;

    /* renamed from: c */
    public final InterfaceC0055i f34647c;

    /* renamed from: d */
    public final C7550d f34648d;

    /* renamed from: e */
    public final C5284b f34649e;

    /* renamed from: f */
    public volatile boolean f34650f;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n3/b$a.class
     */
    /* renamed from: n3.b$a */
    /* loaded from: combined.jar:classes1.jar:n3/b$a.class */
    public class a implements InterfaceC5168a.a {

        /* renamed from: a */
        public final InterfaceC5168a.a f34651a;

        /* renamed from: b */
        public final InterfaceC5168a.c f34652b;

        /* renamed from: c */
        public final C6644b f34653c;

        public a(C6644b c6644b, InterfaceC5168a.a aVar, InterfaceC5168a.c cVar) {
            this.f34653c = c6644b;
            this.f34651a = aVar;
            this.f34652b = cVar;
        }

        @Override // p141i3.InterfaceC5168a.a
        public void onCompleted() {
        }

        @Override // p141i3.InterfaceC5168a.a
        public void onFailure(C4936b c4936b) {
            if (this.f34653c.f34650f) {
                return;
            }
            this.f34651a.onFailure(c4936b);
        }

        @Override // p141i3.InterfaceC5168a.a
        public void onFetch(InterfaceC5168a.b bVar) {
            this.f34651a.onFetch(bVar);
        }

        @Override // p141i3.InterfaceC5168a.a
        public void onResponse(InterfaceC5168a.d dVar) {
            InterfaceC5168a.d m30642d;
            InterfaceC5168a.a aVar;
            try {
                if (this.f34653c.f34650f) {
                    return;
                }
                if (dVar.f29545b.mo5882f()) {
                    m30642d = dVar;
                    aVar = this.f34651a;
                } else {
                    m30642d = this.f34653c.m30642d(this.f34652b.f29536b, dVar.f29544a.mo5881e());
                    aVar = this.f34651a;
                }
                aVar.onResponse(m30642d);
                this.f34651a.onCompleted();
            } catch (C4936b e10) {
                onFailure(e10);
            }
        }
    }

    public C6644b(InterfaceC0789a interfaceC0789a, AbstractC5469h<Map<String, Object>> abstractC5469h, InterfaceC0055i interfaceC0055i, C7550d c7550d, C5284b c5284b) {
        this.f34645a = interfaceC0789a;
        this.f34646b = abstractC5469h;
        this.f34647c = interfaceC0055i;
        this.f34648d = c7550d;
        this.f34649e = c5284b;
    }

    /* renamed from: c */
    public static void m30641c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e10) {
            }
        }
    }

    /* renamed from: d */
    public final InterfaceC5168a.d m30642d(InterfaceC0050d interfaceC0050d, C5410f0 c5410f0) {
        String str;
        InterfaceC0789a interfaceC0789a;
        String m26874d = c5410f0.m26918F0().m26874d("X-APOLLO-CACHE-KEY");
        InterfaceC9763g mo22899v = c5410f0.m26920f().mo22899v();
        try {
            mo22899v.mo41175u(Long.MAX_VALUE);
            str = mo22899v.mo41177z().clone().mo41172r0(Charset.forName("UTF-8"));
        } catch (IOException e10) {
            e10.printStackTrace();
            str = null;
        }
        if (!c5410f0.m26926q0()) {
            this.f34649e.m26388c("Failed to parse network response: %s", c5410f0);
            throw new C4937c(c5410f0);
        }
        try {
            C0053g m221f = new C7547a(interfaceC0050d, this.f34647c, this.f34648d, this.f34646b).m32308f(c5410f0.m26920f().mo22899v()).m215f().m225j(c5410f0.m26922o() != null).m221f();
            if (m221f.m214e() && (interfaceC0789a = this.f34645a) != null) {
                interfaceC0789a.m5087b(m26874d);
            }
            return new InterfaceC5168a.d(c5410f0, m221f, this.f34646b.mo27271c(), str);
        } catch (Exception e11) {
            this.f34649e.m26389d(e11, "Failed to parse network response for operation: %s", interfaceC0050d);
            m30641c(c5410f0);
            InterfaceC0789a interfaceC0789a2 = this.f34645a;
            if (interfaceC0789a2 != null) {
                interfaceC0789a2.m5087b(m26874d);
            }
            throw new C4939e("Failed to parse http response", e11);
        }
    }

    @Override // p141i3.InterfaceC5168a
    public void dispose() {
        this.f34650f = true;
    }

    @Override // p141i3.InterfaceC5168a
    public void interceptAsync(InterfaceC5168a.c cVar, InterfaceC5169b interfaceC5169b, Executor executor, InterfaceC5168a.a aVar) {
        if (this.f34650f) {
            return;
        }
        interfaceC5169b.mo25821a(cVar, executor, new a(this, aVar, cVar));
    }
}
