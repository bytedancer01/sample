package p224n3;

import java.io.IOException;
import java.util.concurrent.Executor;
import org.simpleframework.xml.strategy.Name;
import p004a3.InterfaceC0050d;
import p021b3.C0790b;
import p033c3.AbstractC0984d;
import p033c3.C0986f;
import p109g3.C4938d;
import p141i3.InterfaceC5168a;
import p141i3.InterfaceC5169b;
import p159j3.C5284b;
import p173ji.AbstractC5408e0;
import p173ji.C5406d0;
import p173ji.C5410f0;
import p173ji.C5433x;
import p173ji.C5435z;
import p173ji.InterfaceC5407e;
import p173ji.InterfaceC5409f;
import p238o3.AbstractC6890g;
import p264p3.C7550d;
import p411xi.C9761e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n3/c.class
 */
/* renamed from: n3.c */
/* loaded from: combined.jar:classes1.jar:n3/c.class */
public final class C6645c implements InterfaceC5168a {

    /* renamed from: j */
    public static final C5435z f34654j = C5435z.m27174g("application/json; charset=utf-8");

    /* renamed from: a */
    public final C5433x f34655a;

    /* renamed from: b */
    public final InterfaceC5407e.a f34656b;

    /* renamed from: c */
    public final AbstractC0984d<C0790b.c> f34657c;

    /* renamed from: d */
    public final boolean f34658d;

    /* renamed from: e */
    public final C5284b f34659e;

    /* renamed from: f */
    public final C7550d f34660f;

    /* renamed from: g */
    public final boolean f34661g;

    /* renamed from: h */
    public volatile InterfaceC5407e f34662h;

    /* renamed from: i */
    public volatile boolean f34663i;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n3/c$a.class
     */
    /* renamed from: n3.c$a */
    /* loaded from: combined.jar:classes1.jar:n3/c$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final InterfaceC5168a.a f34664b;

        /* renamed from: c */
        public final InterfaceC5168a.c f34665c;

        /* renamed from: d */
        public final C6645c f34666d;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:n3/c$a$a.class
         */
        /* renamed from: n3.c$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:n3/c$a$a.class */
        public class C10324a implements InterfaceC5409f {

            /* renamed from: a */
            public final a f34667a;

            public C10324a(a aVar) {
                this.f34667a = aVar;
            }

            @Override // p173ji.InterfaceC5409f
            public void onFailure(InterfaceC5407e interfaceC5407e, IOException iOException) {
                if (this.f34667a.f34666d.f34663i) {
                    return;
                }
                a aVar = this.f34667a;
                aVar.f34666d.f34659e.m26389d(iOException, "Failed to execute http call for operation %s", aVar.f34665c.f29536b.name().name());
                this.f34667a.f34664b.onFailure(new C4938d("Failed to execute http call", iOException));
            }

            @Override // p173ji.InterfaceC5409f
            public void onResponse(InterfaceC5407e interfaceC5407e, C5410f0 c5410f0) {
                if (this.f34667a.f34666d.f34663i) {
                    return;
                }
                this.f34667a.f34664b.onResponse(new InterfaceC5168a.d(c5410f0));
                this.f34667a.f34664b.onCompleted();
            }
        }

        public a(C6645c c6645c, InterfaceC5168a.a aVar, InterfaceC5168a.c cVar) {
            this.f34666d = c6645c;
            this.f34664b = aVar;
            this.f34665c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34664b.onFetch(InterfaceC5168a.b.NETWORK);
            try {
                C6645c c6645c = this.f34666d;
                c6645c.f34662h = c6645c.m30645c(this.f34665c.f29536b);
                if (this.f34666d.f34662h != null) {
                    this.f34666d.f34662h.mo26894w(new C10324a(this));
                } else {
                    this.f34664b.onFailure(new C4938d("Failed to prepare http call, prepared call was null"));
                }
            } catch (IOException e10) {
                this.f34666d.f34659e.m26389d(e10, "Failed to prepare http call for operation %s", this.f34665c.f29536b.name().name());
                this.f34664b.onFailure(new C4938d("Failed to prepare http call", e10));
            }
        }
    }

    public C6645c(C5433x c5433x, InterfaceC5407e.a aVar, C0790b.c cVar, boolean z10, C7550d c7550d, C5284b c5284b, boolean z11) {
        this.f34655a = (C5433x) C0986f.m5892c(c5433x, "serverUrl == null");
        this.f34656b = (InterfaceC5407e.a) C0986f.m5892c(aVar, "httpCallFactory == null");
        this.f34657c = AbstractC0984d.m5888d(cVar);
        this.f34658d = z10;
        this.f34660f = (C7550d) C0986f.m5892c(c7550d, "scalarTypeAdapters == null");
        this.f34659e = (C5284b) C0986f.m5892c(c5284b, "logger == null");
        this.f34661g = z11;
    }

    /* renamed from: b */
    public static String m30644b(AbstractC5408e0 abstractC5408e0) {
        C9761e c9761e = new C9761e();
        try {
            abstractC5408e0.mo22937i(c9761e);
            return c9761e.m41129K0().m41201s().mo41198p();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: c */
    public final InterfaceC5407e m30645c(InterfaceC0050d interfaceC0050d) {
        AbstractC5408e0 m30646d = m30646d(interfaceC0050d);
        C5406d0.a m26886f = new C5406d0.a().m26893m(this.f34655a).m26889i(m30646d).m26886f("Accept", "application/json").m26886f("CONTENT_TYPE", "application/json").m26886f("X-APOLLO-OPERATION-ID", interfaceC0050d.m207d());
        C5406d0.a aVar = m26886f;
        if (this.f34657c.mo5882f()) {
            C0790b.c mo5881e = this.f34657c.mo5881e();
            aVar = m26886f.m26886f("X-APOLLO-CACHE-KEY", m30644b(m30646d)).m26886f("X-APOLLO-CACHE-FETCH-STRATEGY", mo5881e.f5524a.name()).m26886f("X-APOLLO-EXPIRE-TIMEOUT", String.valueOf(mo5881e.m5088a())).m26886f("X-APOLLO-EXPIRE-AFTER-READ", Boolean.toString(mo5881e.f5527d)).m26886f("X-APOLLO-PREFETCH", Boolean.toString(this.f34658d));
        }
        return this.f34656b.mo26796a(aVar.m26883b());
    }

    /* renamed from: d */
    public final AbstractC5408e0 m30646d(InterfaceC0050d interfaceC0050d) {
        AbstractC6890g mo31766q;
        String replaceAll;
        AbstractC6890g m31770v = AbstractC6890g.m31770v(new C9761e());
        m31770v.mo31763l();
        if (this.f34661g) {
            mo31766q = m31770v.mo31766q(Name.MARK);
            replaceAll = interfaceC0050d.m207d();
        } else {
            mo31766q = m31770v.mo31766q("query");
            replaceAll = interfaceC0050d.m205b().replaceAll("\\n", "");
        }
        mo31766q.mo31769v0(replaceAll);
        m31770v.mo31766q("variables").mo31763l();
        interfaceC0050d.m208e();
        throw null;
    }

    @Override // p141i3.InterfaceC5168a
    public void dispose() {
        this.f34663i = true;
        InterfaceC5407e interfaceC5407e = this.f34662h;
        if (interfaceC5407e != null) {
            interfaceC5407e.cancel();
        }
        this.f34662h = null;
    }

    @Override // p141i3.InterfaceC5168a
    public void interceptAsync(InterfaceC5168a.c cVar, InterfaceC5169b interfaceC5169b, Executor executor, InterfaceC5168a.a aVar) {
        if (this.f34663i) {
            return;
        }
        executor.execute(new a(this, aVar, cVar));
    }
}
