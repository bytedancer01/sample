package p141i3;

import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.Executor;
import p004a3.C0053g;
import p004a3.InterfaceC0050d;
import p033c3.AbstractC0984d;
import p033c3.C0986f;
import p053d3.C4301a;
import p072e3.C4603i;
import p109g3.C4936b;
import p173ji.C5410f0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i3/a.class
 */
/* renamed from: i3.a */
/* loaded from: combined.jar:classes1.jar:i3/a.class */
public interface InterfaceC5168a {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:i3/a$a.class
     */
    /* renamed from: i3.a$a */
    /* loaded from: combined.jar:classes1.jar:i3/a$a.class */
    public interface a {
        void onCompleted();

        void onFailure(C4936b c4936b);

        void onFetch(b bVar);

        void onResponse(d dVar);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:i3/a$b.class
     */
    /* renamed from: i3.a$b */
    /* loaded from: combined.jar:classes1.jar:i3/a$b.class */
    public enum b {
        CACHE,
        NETWORK
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:i3/a$c.class
     */
    /* renamed from: i3.a$c */
    /* loaded from: combined.jar:classes1.jar:i3/a$c.class */
    public static final class c {

        /* renamed from: a */
        public final UUID f29535a = UUID.randomUUID();

        /* renamed from: b */
        public final InterfaceC0050d f29536b;

        /* renamed from: c */
        public final C4301a f29537c;

        /* renamed from: d */
        public final boolean f29538d;

        /* renamed from: e */
        public final AbstractC0984d<InterfaceC0050d.a> f29539e;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:i3/a$c$a.class
         */
        /* renamed from: i3.a$c$a */
        /* loaded from: combined.jar:classes1.jar:i3/a$c$a.class */
        public static final class a {

            /* renamed from: a */
            public final InterfaceC0050d f29540a;

            /* renamed from: c */
            public boolean f29542c;

            /* renamed from: b */
            public C4301a f29541b = C4301a.f26420b;

            /* renamed from: d */
            public AbstractC0984d<InterfaceC0050d.a> f29543d = AbstractC0984d.m5887a();

            public a(InterfaceC0050d interfaceC0050d) {
                this.f29540a = (InterfaceC0050d) C0986f.m5892c(interfaceC0050d, "operation == null");
            }

            /* renamed from: a */
            public c m25816a() {
                return new c(this.f29540a, this.f29541b, this.f29543d, this.f29542c);
            }

            /* renamed from: b */
            public a m25817b(C4301a c4301a) {
                this.f29541b = (C4301a) C0986f.m5892c(c4301a, "cacheHeaders == null");
                return this;
            }

            /* renamed from: c */
            public a m25818c(boolean z10) {
                this.f29542c = z10;
                return this;
            }

            /* renamed from: d */
            public a m25819d(InterfaceC0050d.a aVar) {
                this.f29543d = AbstractC0984d.m5888d(aVar);
                return this;
            }

            /* renamed from: e */
            public a m25820e(AbstractC0984d<InterfaceC0050d.a> abstractC0984d) {
                this.f29543d = (AbstractC0984d) C0986f.m5892c(abstractC0984d, "optimisticUpdates == null");
                return this;
            }
        }

        public c(InterfaceC0050d interfaceC0050d, C4301a c4301a, AbstractC0984d<InterfaceC0050d.a> abstractC0984d, boolean z10) {
            this.f29536b = interfaceC0050d;
            this.f29537c = c4301a;
            this.f29539e = abstractC0984d;
            this.f29538d = z10;
        }

        /* renamed from: a */
        public static a m25814a(InterfaceC0050d interfaceC0050d) {
            return new a(interfaceC0050d);
        }

        /* renamed from: b */
        public a m25815b() {
            return new a(this.f29536b).m25817b(this.f29537c).m25818c(this.f29538d).m25819d(this.f29539e.mo5886k());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:i3/a$d.class
     */
    /* renamed from: i3.a$d */
    /* loaded from: combined.jar:classes1.jar:i3/a$d.class */
    public static final class d {

        /* renamed from: a */
        public final AbstractC0984d<C5410f0> f29544a;

        /* renamed from: b */
        public final AbstractC0984d<C0053g> f29545b;

        /* renamed from: c */
        public final AbstractC0984d<Collection<C4603i>> f29546c;

        /* renamed from: d */
        public final AbstractC0984d<String> f29547d;

        public d(C5410f0 c5410f0) {
            this(c5410f0, null, null);
        }

        public d(C5410f0 c5410f0, C0053g c0053g, Collection<C4603i> collection) {
            this.f29544a = AbstractC0984d.m5888d(c5410f0);
            this.f29545b = AbstractC0984d.m5888d(c0053g);
            this.f29546c = AbstractC0984d.m5888d(collection);
            this.f29547d = AbstractC0984d.m5888d(null);
        }

        public d(C5410f0 c5410f0, C0053g c0053g, Collection<C4603i> collection, String str) {
            this.f29544a = AbstractC0984d.m5888d(c5410f0);
            this.f29545b = AbstractC0984d.m5888d(c0053g);
            this.f29546c = AbstractC0984d.m5888d(collection);
            this.f29547d = AbstractC0984d.m5888d(str);
        }
    }

    void dispose();

    void interceptAsync(c cVar, InterfaceC5169b interfaceC5169b, Executor executor, a aVar);
}
