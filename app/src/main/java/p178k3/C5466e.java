package p178k3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p004a3.C0053g;
import p004a3.InterfaceC0048b;
import p004a3.InterfaceC0050d;
import p004a3.InterfaceC0055i;
import p033c3.C0986f;
import p053d3.C4301a;
import p072e3.AbstractC4597c;
import p072e3.AbstractC4599e;
import p072e3.AbstractC4600f;
import p072e3.C4596b;
import p072e3.C4602h;
import p072e3.C4603i;
import p072e3.InterfaceC4595a;
import p159j3.C5284b;
import p210m3.C5919a;
import p264p3.C7548b;
import p264p3.C7550d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k3/e.class
 */
/* renamed from: k3.e */
/* loaded from: combined.jar:classes1.jar:k3/e.class */
public final class C5466e implements InterfaceC4595a, InterfaceC5465d, InterfaceC5471j {

    /* renamed from: b */
    public final C4602h f31213b;

    /* renamed from: c */
    public final AbstractC4597c f31214c;

    /* renamed from: d */
    public final C7550d f31215d;

    /* renamed from: e */
    public final ReadWriteLock f31216e;

    /* renamed from: f */
    public final Set<InterfaceC4595a.a> f31217f;

    /* renamed from: g */
    public final Executor f31218g;

    /* renamed from: h */
    public final InterfaceC5462a f31219h;

    /* renamed from: i */
    public final C5284b f31220i;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k3/e$a.class
     */
    /* renamed from: k3.e$a */
    /* loaded from: combined.jar:classes1.jar:k3/e$a.class */
    public class a extends AbstractC4599e<Boolean> {

        /* renamed from: d */
        public final InterfaceC0050d f31221d;

        /* renamed from: e */
        public final InterfaceC0050d.a f31222e;

        /* renamed from: f */
        public final C5466e f31223f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C5466e c5466e, Executor executor, InterfaceC0050d interfaceC0050d, InterfaceC0050d.a aVar) {
            super(executor);
            this.f31223f = c5466e;
            this.f31221d = interfaceC0050d;
            this.f31222e = aVar;
        }

        @Override // p072e3.AbstractC4599e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean mo23189d() {
            this.f31223f.mo23172p(this.f31223f.m27246K(this.f31221d, this.f31222e, false, null));
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k3/e$b.class
     */
    /* renamed from: k3.e$b */
    /* loaded from: combined.jar:classes1.jar:k3/e$b.class */
    public class b extends AbstractC4599e<Set<String>> {

        /* renamed from: d */
        public final InterfaceC0048b f31224d;

        /* renamed from: e */
        public final C4596b f31225e;

        /* renamed from: f */
        public final C5466e f31226f;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:k3/e$b$a.class
         */
        /* renamed from: k3.e$b$a */
        /* loaded from: combined.jar:classes1.jar:k3/e$b$a.class */
        public class a implements InterfaceC5470i<InterfaceC5471j, Set<String>> {

            /* renamed from: a */
            public final b f31227a;

            public a(b bVar) {
                this.f31227a = bVar;
            }

            @Override // p178k3.InterfaceC5470i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Set<String> mo27249a(InterfaceC5471j interfaceC5471j) {
                b bVar = this.f31227a;
                C5466e c5466e = bVar.f31226f;
                InterfaceC0048b interfaceC0048b = bVar.f31224d;
                C4596b c4596b = bVar.f31225e;
                bVar.getClass();
                return c5466e.m27245J(interfaceC0048b, c4596b, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C5466e c5466e, Executor executor, InterfaceC0048b interfaceC0048b, C4596b c4596b, InterfaceC0050d.b bVar) {
            super(executor);
            this.f31226f = c5466e;
            this.f31224d = interfaceC0048b;
            this.f31225e = c4596b;
        }

        @Override // p072e3.AbstractC4599e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Set<String> mo23189d() {
            return (Set) this.f31226f.mo23177v(new a(this));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k3/e$c.class
     */
    /* renamed from: k3.e$c */
    /* loaded from: combined.jar:classes1.jar:k3/e$c.class */
    public class c extends AbstractC4599e<Boolean> {

        /* renamed from: d */
        public final InterfaceC0048b f31228d;

        /* renamed from: e */
        public final C4596b f31229e;

        /* renamed from: f */
        public final C5466e f31230f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C5466e c5466e, Executor executor, InterfaceC0048b interfaceC0048b, C4596b c4596b, InterfaceC0050d.b bVar) {
            super(executor);
            this.f31230f = c5466e;
            this.f31228d = interfaceC0048b;
            this.f31229e = c4596b;
        }

        @Override // p072e3.AbstractC4599e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean mo23189d() {
            this.f31230f.mo23172p(this.f31230f.m27245J(this.f31228d, this.f31229e, null));
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k3/e$d.class
     */
    /* renamed from: k3.e$d */
    /* loaded from: combined.jar:classes1.jar:k3/e$d.class */
    public class d<T> implements InterfaceC5470i<InterfaceC5465d, T> {

        /* renamed from: a */
        public final InterfaceC0050d f31231a;

        /* renamed from: b */
        public final C5466e f31232b;

        public d(C5466e c5466e, InterfaceC0050d interfaceC0050d) {
            this.f31232b = c5466e;
            this.f31231a = interfaceC0050d;
        }

        @Override // p178k3.InterfaceC5470i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public T mo27249a(InterfaceC5465d interfaceC5465d) {
            String m23181b = AbstractC4597c.rootKeyForOperation(this.f31231a).m23181b();
            C4301a c4301a = C4301a.f26420b;
            C4603i mo27230d = interfaceC5465d.mo27230d(m23181b, c4301a);
            if (mo27230d == null) {
                return null;
            }
            InterfaceC0055i m204a = this.f31231a.m204a();
            this.f31231a.m208e();
            C5919a c5919a = new C5919a(interfaceC5465d, null, this.f31232b.mo23163f(), c4301a, this.f31232b.f31219h);
            this.f31231a.m208e();
            return (T) this.f31231a.m206c((InterfaceC0050d.a) m204a.m226a(new C7548b(null, mo27230d, c5919a, this.f31232b.f31215d, AbstractC5469h.f31274h)));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k3/e$e.class
     */
    /* renamed from: k3.e$e */
    /* loaded from: combined.jar:classes1.jar:k3/e$e.class */
    public class e<T> implements InterfaceC5470i<InterfaceC5465d, C0053g<T>> {

        /* renamed from: a */
        public final InterfaceC0050d f31233a;

        /* renamed from: b */
        public final C4301a f31234b;

        /* renamed from: c */
        public final AbstractC5469h f31235c;

        /* renamed from: d */
        public final InterfaceC0055i f31236d;

        /* renamed from: e */
        public final C5466e f31237e;

        public e(C5466e c5466e, InterfaceC0050d interfaceC0050d, C4301a c4301a, AbstractC5469h abstractC5469h, InterfaceC0055i interfaceC0055i) {
            this.f31237e = c5466e;
            this.f31233a = interfaceC0050d;
            this.f31234b = c4301a;
            this.f31235c = abstractC5469h;
            this.f31236d = interfaceC0055i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p178k3.InterfaceC5470i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0053g<T> mo27249a(InterfaceC5465d interfaceC5465d) {
            C4603i mo27230d = interfaceC5465d.mo27230d(AbstractC4597c.rootKeyForOperation(this.f31233a).m23181b(), this.f31234b);
            if (mo27230d != null) {
                this.f31233a.m208e();
                C5919a c5919a = new C5919a(interfaceC5465d, null, this.f31237e.mo23163f(), this.f31234b, this.f31237e.f31219h);
                this.f31233a.m208e();
                C7548b c7548b = new C7548b(null, mo27230d, c5919a, this.f31237e.f31215d, this.f31235c);
                try {
                    this.f31235c.mo27274f(this.f31233a);
                    return C0053g.m210a(this.f31233a).m222g(this.f31233a.m206c((InterfaceC0050d.a) this.f31236d.m226a(c7548b))).m225j(true).m223h(this.f31235c.mo27270b()).m221f();
                } catch (Exception e10) {
                    this.f31237e.f31220i.m26389d(e10, "Failed to read cache response", new Object[0]);
                }
            }
            return C0053g.m210a(this.f31233a).m225j(true).m221f();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [F] */
    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k3/e$f.class
     */
    /* renamed from: k3.e$f */
    /* loaded from: combined.jar:classes1.jar:k3/e$f.class */
    public class f<F> implements InterfaceC5470i<InterfaceC5465d, F> {

        /* renamed from: a */
        public final C4596b f31238a;

        /* renamed from: b */
        public final InterfaceC0055i f31239b;

        /* renamed from: c */
        public final C5466e f31240c;

        public f(C5466e c5466e, C4596b c4596b, InterfaceC0050d.b bVar, InterfaceC0055i interfaceC0055i) {
            this.f31240c = c5466e;
            this.f31238a = c4596b;
            this.f31239b = interfaceC0055i;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lk3/d;)TF; */
        @Override // p178k3.InterfaceC5470i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC0048b mo27249a(InterfaceC5465d interfaceC5465d) {
            String m23181b = this.f31238a.m23181b();
            C4301a c4301a = C4301a.f26420b;
            C4603i mo27230d = interfaceC5465d.mo27230d(m23181b, c4301a);
            if (mo27230d == null) {
                return null;
            }
            return (InterfaceC0048b) this.f31239b.m226a(new C7548b(null, mo27230d, new C5919a(interfaceC5465d, null, this.f31240c.mo23163f(), c4301a, this.f31240c.f31219h), this.f31240c.f31215d, AbstractC5469h.f31274h));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k3/e$g.class
     */
    /* renamed from: k3.e$g */
    /* loaded from: combined.jar:classes1.jar:k3/e$g.class */
    public class g extends AbstractC5469h<Map<String, Object>> {

        /* renamed from: i */
        public final C5466e f31241i;

        public g(C5466e c5466e) {
            this.f31241i = c5466e;
        }

        @Override // p178k3.AbstractC5469h
        /* renamed from: a */
        public InterfaceC5462a mo27255a() {
            return this.f31241i.f31219h;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k3/e$h.class
     */
    /* renamed from: k3.e$h */
    /* loaded from: combined.jar:classes1.jar:k3/e$h.class */
    public class h implements InterfaceC5470i<InterfaceC5471j, Set<String>> {

        /* renamed from: a */
        public final InterfaceC0050d f31242a;

        /* renamed from: b */
        public final InterfaceC0050d.a f31243b;

        /* renamed from: c */
        public final boolean f31244c;

        /* renamed from: d */
        public final UUID f31245d;

        /* renamed from: e */
        public final C5466e f31246e;

        public h(C5466e c5466e, InterfaceC0050d interfaceC0050d, InterfaceC0050d.a aVar, boolean z10, UUID uuid) {
            this.f31246e = c5466e;
            this.f31242a = interfaceC0050d;
            this.f31243b = aVar;
            this.f31244c = z10;
            this.f31245d = uuid;
        }

        @Override // p178k3.InterfaceC5470i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Set<String> mo27249a(InterfaceC5471j interfaceC5471j) {
            this.f31242a.m208e();
            C5463b c5463b = new C5463b(null, this.f31246e.f31215d);
            this.f31243b.m209a().m227a(c5463b);
            AbstractC5469h<Map<String, Object>> mo23167j = this.f31246e.mo23167j();
            mo23167j.mo27274f(this.f31242a);
            Collection<C4603i> m27225a = c5463b.m27225a(mo23167j);
            if (!this.f31244c) {
                return this.f31246e.f31213b.m23195f(m27225a, C4301a.f26420b);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<C4603i> it = m27225a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m23215g().m23218c(this.f31245d).m23217b());
            }
            return this.f31246e.f31213b.m23202j(arrayList);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k3/e$i.class
     */
    /* renamed from: k3.e$i */
    /* loaded from: combined.jar:classes1.jar:k3/e$i.class */
    public class i implements InterfaceC5470i<InterfaceC5471j, Set<String>> {

        /* renamed from: a */
        public final InterfaceC0048b f31247a;

        /* renamed from: b */
        public final C4596b f31248b;

        /* renamed from: c */
        public final C5466e f31249c;

        public i(C5466e c5466e, InterfaceC0050d.b bVar, InterfaceC0048b interfaceC0048b, C4596b c4596b) {
            this.f31249c = c5466e;
            this.f31247a = interfaceC0048b;
            this.f31248b = c4596b;
        }

        @Override // p178k3.InterfaceC5470i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Set<String> mo27249a(InterfaceC5471j interfaceC5471j) {
            C5463b c5463b = new C5463b(null, this.f31249c.f31215d);
            this.f31247a.m203a().m227a(c5463b);
            AbstractC5469h<Map<String, Object>> mo23167j = this.f31249c.mo23167j();
            mo23167j.m27273e(this.f31248b);
            return this.f31249c.mo27229a(c5463b.m27225a(mo23167j), C4301a.f26420b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k3/e$j.class
     */
    /* renamed from: k3.e$j */
    /* loaded from: combined.jar:classes1.jar:k3/e$j.class */
    public class j extends AbstractC5469h<C4603i> {

        /* renamed from: i */
        public final C5466e f31250i;

        public j(C5466e c5466e) {
            this.f31250i = c5466e;
        }

        @Override // p178k3.AbstractC5469h
        /* renamed from: a */
        public InterfaceC5462a mo27255a() {
            return this.f31250i.f31219h;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k3/e$k.class
     */
    /* renamed from: k3.e$k */
    /* loaded from: combined.jar:classes1.jar:k3/e$k.class */
    public class k extends AbstractC4599e<Boolean> {

        /* renamed from: d */
        public final C5466e f31251d;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:k3/e$k$a.class
         */
        /* renamed from: k3.e$k$a */
        /* loaded from: combined.jar:classes1.jar:k3/e$k$a.class */
        public class a implements InterfaceC5470i<InterfaceC5471j, Boolean> {

            /* renamed from: a */
            public final k f31252a;

            public a(k kVar) {
                this.f31252a = kVar;
            }

            @Override // p178k3.InterfaceC5470i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Boolean mo27249a(InterfaceC5471j interfaceC5471j) {
                this.f31252a.f31251d.f31213b.mo23191b();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C5466e c5466e, Executor executor) {
            super(executor);
            this.f31251d = c5466e;
        }

        @Override // p072e3.AbstractC4599e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean mo23189d() {
            return (Boolean) this.f31251d.mo23177v(new a(this));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k3/e$l.class
     */
    /* renamed from: k3.e$l */
    /* loaded from: combined.jar:classes1.jar:k3/e$l.class */
    public class l extends AbstractC4599e<Boolean> {

        /* renamed from: d */
        public final C4596b f31253d;

        /* renamed from: e */
        public final C5466e f31254e;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:k3/e$l$a.class
         */
        /* renamed from: k3.e$l$a */
        /* loaded from: combined.jar:classes1.jar:k3/e$l$a.class */
        public class a implements InterfaceC5470i<InterfaceC5471j, Boolean> {

            /* renamed from: a */
            public final l f31255a;

            public a(l lVar) {
                this.f31255a = lVar;
            }

            @Override // p178k3.InterfaceC5470i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Boolean mo27249a(InterfaceC5471j interfaceC5471j) {
                return Boolean.valueOf(this.f31255a.f31254e.f31213b.mo23197h(this.f31255a.f31253d));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(C5466e c5466e, Executor executor, C4596b c4596b) {
            super(executor);
            this.f31254e = c5466e;
            this.f31253d = c4596b;
        }

        @Override // p072e3.AbstractC4599e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean mo23189d() {
            return (Boolean) this.f31254e.mo23177v(new a(this));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k3/e$m.class
     */
    /* renamed from: k3.e$m */
    /* loaded from: combined.jar:classes1.jar:k3/e$m.class */
    public class m extends AbstractC4599e<Integer> {

        /* renamed from: d */
        public final List f31256d;

        /* renamed from: e */
        public final C5466e f31257e;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:k3/e$m$a.class
         */
        /* renamed from: k3.e$m$a */
        /* loaded from: combined.jar:classes1.jar:k3/e$m$a.class */
        public class a implements InterfaceC5470i<InterfaceC5471j, Integer> {

            /* renamed from: a */
            public final m f31258a;

            public a(m mVar) {
                this.f31258a = mVar;
            }

            @Override // p178k3.InterfaceC5470i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Integer mo27249a(InterfaceC5471j interfaceC5471j) {
                Iterator it = this.f31258a.f31256d.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    if (this.f31258a.f31257e.f31213b.mo23197h((C4596b) it.next())) {
                        i10++;
                    }
                }
                return Integer.valueOf(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C5466e c5466e, Executor executor, List list) {
            super(executor);
            this.f31257e = c5466e;
            this.f31256d = list;
        }

        @Override // p072e3.AbstractC4599e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Integer mo23189d() {
            return (Integer) this.f31257e.mo23177v(new a(this));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k3/e$n.class
     */
    /* renamed from: k3.e$n */
    /* loaded from: combined.jar:classes1.jar:k3/e$n.class */
    public class n<T> extends AbstractC4599e<T> {

        /* renamed from: d */
        public final InterfaceC0050d f31259d;

        /* renamed from: e */
        public final C5466e f31260e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(C5466e c5466e, Executor executor, InterfaceC0050d interfaceC0050d) {
            super(executor);
            this.f31260e = c5466e;
            this.f31259d = interfaceC0050d;
        }

        @Override // p072e3.AbstractC4599e
        /* renamed from: d */
        public T mo23189d() {
            return (T) this.f31260e.m27244I(this.f31259d);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k3/e$o.class
     */
    /* renamed from: k3.e$o */
    /* loaded from: combined.jar:classes1.jar:k3/e$o.class */
    public class o<T> extends AbstractC4599e<C0053g<T>> {

        /* renamed from: d */
        public final InterfaceC0050d f31261d;

        /* renamed from: e */
        public final InterfaceC0055i f31262e;

        /* renamed from: f */
        public final AbstractC5469h f31263f;

        /* renamed from: g */
        public final C4301a f31264g;

        /* renamed from: h */
        public final C5466e f31265h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(C5466e c5466e, Executor executor, InterfaceC0050d interfaceC0050d, InterfaceC0055i interfaceC0055i, AbstractC5469h abstractC5469h, C4301a c4301a) {
            super(executor);
            this.f31265h = c5466e;
            this.f31261d = interfaceC0050d;
            this.f31262e = interfaceC0055i;
            this.f31263f = abstractC5469h;
            this.f31264g = c4301a;
        }

        @Override // p072e3.AbstractC4599e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C0053g<T> mo23189d() {
            return this.f31265h.m27243H(this.f31261d, this.f31262e, this.f31263f, this.f31264g);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [F] */
    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k3/e$p.class
     */
    /* renamed from: k3.e$p */
    /* loaded from: combined.jar:classes1.jar:k3/e$p.class */
    public class p<F> extends AbstractC4599e<F> {

        /* renamed from: d */
        public final InterfaceC0055i f31266d;

        /* renamed from: e */
        public final C4596b f31267e;

        /* renamed from: f */
        public final C5466e f31268f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(C5466e c5466e, Executor executor, InterfaceC0055i interfaceC0055i, C4596b c4596b, InterfaceC0050d.b bVar) {
            super(executor);
            this.f31268f = c5466e;
            this.f31266d = interfaceC0055i;
            this.f31267e = c4596b;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TF; */
        @Override // p072e3.AbstractC4599e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public InterfaceC0048b mo23189d() {
            return this.f31268f.m27242G(this.f31266d, this.f31267e, null);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k3/e$q.class
     */
    /* renamed from: k3.e$q */
    /* loaded from: combined.jar:classes1.jar:k3/e$q.class */
    public class q extends AbstractC4599e<Set<String>> {

        /* renamed from: d */
        public final InterfaceC0050d f31269d;

        /* renamed from: e */
        public final InterfaceC0050d.a f31270e;

        /* renamed from: f */
        public final C5466e f31271f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(C5466e c5466e, Executor executor, InterfaceC0050d interfaceC0050d, InterfaceC0050d.a aVar) {
            super(executor);
            this.f31271f = c5466e;
            this.f31269d = interfaceC0050d;
            this.f31270e = aVar;
        }

        @Override // p072e3.AbstractC4599e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Set<String> mo23189d() {
            return this.f31271f.m27246K(this.f31269d, this.f31270e, false, null);
        }
    }

    public C5466e(AbstractC4600f abstractC4600f, AbstractC4597c abstractC4597c, C7550d c7550d, Executor executor, C5284b c5284b) {
        C0986f.m5892c(abstractC4600f, "cacheStore == null");
        this.f31213b = (C4602h) new C4602h().m23190a(abstractC4600f);
        this.f31214c = (AbstractC4597c) C0986f.m5892c(abstractC4597c, "cacheKeyResolver == null");
        this.f31215d = (C7550d) C0986f.m5892c(c7550d, "scalarTypeAdapters == null");
        this.f31218g = (Executor) C0986f.m5892c(executor, "dispatcher == null");
        this.f31220i = (C5284b) C0986f.m5892c(c5284b, "logger == null");
        this.f31216e = new ReentrantReadWriteLock();
        this.f31217f = Collections.newSetFromMap(new WeakHashMap());
        this.f31219h = new C5467f();
    }

    /* renamed from: G */
    public final <F extends InterfaceC0048b> F m27242G(InterfaceC0055i<F> interfaceC0055i, C4596b c4596b, InterfaceC0050d.b bVar) {
        return (F) mo23176u(new f(this, c4596b, bVar, interfaceC0055i));
    }

    /* renamed from: H */
    public final <D extends InterfaceC0050d.a, T, V extends InterfaceC0050d.b> C0053g<T> m27243H(InterfaceC0050d<D, T, V> interfaceC0050d, InterfaceC0055i<D> interfaceC0055i, AbstractC5469h<C4603i> abstractC5469h, C4301a c4301a) {
        return (C0053g) mo23176u(new e(this, interfaceC0050d, c4301a, abstractC5469h, interfaceC0055i));
    }

    /* renamed from: I */
    public final <D extends InterfaceC0050d.a, T, V extends InterfaceC0050d.b> T m27244I(InterfaceC0050d<D, T, V> interfaceC0050d) {
        return (T) mo23176u(new d(this, interfaceC0050d));
    }

    /* renamed from: J */
    public final Set<String> m27245J(InterfaceC0048b interfaceC0048b, C4596b c4596b, InterfaceC0050d.b bVar) {
        return (Set) mo23177v(new i(this, bVar, interfaceC0048b, c4596b));
    }

    /* renamed from: K */
    public final <D extends InterfaceC0050d.a, T, V extends InterfaceC0050d.b> Set<String> m27246K(InterfaceC0050d<D, T, V> interfaceC0050d, D d10, boolean z10, UUID uuid) {
        return (Set) mo23177v(new h(this, interfaceC0050d, d10, z10, uuid));
    }

    @Override // p178k3.InterfaceC5471j
    /* renamed from: a */
    public Set<String> mo27229a(Collection<C4603i> collection, C4301a c4301a) {
        return this.f31213b.m23195f((Collection) C0986f.m5892c(collection, "recordSet == null"), c4301a);
    }

    @Override // p072e3.InterfaceC4595a
    /* renamed from: b */
    public <D extends InterfaceC0050d.a, T, V extends InterfaceC0050d.b> AbstractC4599e<Boolean> mo23160b(InterfaceC0050d<D, T, V> interfaceC0050d, D d10) {
        return new a(this, this.f31218g, interfaceC0050d, d10);
    }

    @Override // p072e3.InterfaceC4595a
    /* renamed from: c */
    public <D extends InterfaceC0050d.a, T, V extends InterfaceC0050d.b> AbstractC4599e<C0053g<T>> mo23161c(InterfaceC0050d<D, T, V> interfaceC0050d, InterfaceC0055i<D> interfaceC0055i, AbstractC5469h<C4603i> abstractC5469h, C4301a c4301a) {
        C0986f.m5892c(interfaceC0050d, "operation == null");
        C0986f.m5892c(abstractC5469h, "responseNormalizer == null");
        return new o(this, this.f31218g, interfaceC0050d, interfaceC0055i, abstractC5469h, c4301a);
    }

    @Override // p178k3.InterfaceC5465d
    /* renamed from: d */
    public C4603i mo27230d(String str, C4301a c4301a) {
        return this.f31213b.mo23192c((String) C0986f.m5892c(str, "key == null"), c4301a);
    }

    @Override // p072e3.InterfaceC4595a
    /* renamed from: e */
    public void mo23162e(InterfaceC4595a.a aVar) {
        synchronized (this) {
            this.f31217f.remove(aVar);
        }
    }

    @Override // p072e3.InterfaceC4595a
    /* renamed from: f */
    public AbstractC4597c mo23163f() {
        return this.f31214c;
    }

    @Override // p072e3.InterfaceC4595a
    /* renamed from: g */
    public AbstractC4599e<Boolean> mo23164g(C4596b c4596b) {
        C0986f.m5892c(c4596b, "cacheKey == null");
        return new l(this, this.f31218g, c4596b);
    }

    @Override // p072e3.InterfaceC4595a
    /* renamed from: h */
    public AbstractC5469h<C4603i> mo23165h() {
        return new j(this);
    }

    @Override // p072e3.InterfaceC4595a
    /* renamed from: i */
    public AbstractC4599e<Boolean> mo23166i(InterfaceC0048b interfaceC0048b, C4596b c4596b, InterfaceC0050d.b bVar) {
        return new c(this, this.f31218g, interfaceC0048b, c4596b, bVar);
    }

    @Override // p072e3.InterfaceC4595a
    /* renamed from: j */
    public AbstractC5469h<Map<String, Object>> mo23167j() {
        return new g(this);
    }

    @Override // p072e3.InterfaceC4595a
    /* renamed from: k */
    public AbstractC4599e<Integer> mo23168k(List<C4596b> list) {
        C0986f.m5892c(list, "cacheKey == null");
        return new m(this, this.f31218g, list);
    }

    @Override // p072e3.InterfaceC4595a
    /* renamed from: l */
    public <D extends InterfaceC0050d.a, T, V extends InterfaceC0050d.b> AbstractC4599e<T> mo23169l(InterfaceC0050d<D, T, V> interfaceC0050d) {
        C0986f.m5892c(interfaceC0050d, "operation == null");
        return new n(this, this.f31218g, interfaceC0050d);
    }

    @Override // p072e3.InterfaceC4595a
    /* renamed from: m */
    public <D extends InterfaceC0050d.a, T, V extends InterfaceC0050d.b> AbstractC4599e<Set<String>> mo23170m(InterfaceC0050d<D, T, V> interfaceC0050d, D d10) {
        C0986f.m5892c(interfaceC0050d, "operation == null");
        C0986f.m5892c(d10, "operationData == null");
        return new q(this, this.f31218g, interfaceC0050d, d10);
    }

    @Override // p178k3.InterfaceC5471j
    /* renamed from: n */
    public Set<String> mo27231n(C4603i c4603i, C4301a c4301a) {
        return this.f31213b.mo23194e((C4603i) C0986f.m5892c(c4603i, "record == null"), c4301a);
    }

    @Override // p072e3.InterfaceC4595a
    /* renamed from: o */
    public <F extends InterfaceC0048b> AbstractC4599e<F> mo23171o(InterfaceC0055i<F> interfaceC0055i, C4596b c4596b, InterfaceC0050d.b bVar) {
        C0986f.m5892c(interfaceC0055i, "responseFieldMapper == null");
        C0986f.m5892c(c4596b, "cacheKey == null");
        C0986f.m5892c(bVar, "variables == null");
        return new p(this, this.f31218g, interfaceC0055i, c4596b, bVar);
    }

    @Override // p072e3.InterfaceC4595a
    /* renamed from: p */
    public void mo23172p(Set<String> set) {
        LinkedHashSet linkedHashSet;
        C0986f.m5892c(set, "changedKeys == null");
        if (set.isEmpty()) {
            return;
        }
        synchronized (this) {
            linkedHashSet = new LinkedHashSet(this.f31217f);
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC4595a.a) it.next()).mo23179a(set);
        }
    }

    @Override // p072e3.InterfaceC4595a
    /* renamed from: q */
    public AbstractC4599e<Boolean> mo23173q() {
        return new k(this, this.f31218g);
    }

    @Override // p072e3.InterfaceC4595a
    /* renamed from: r */
    public AbstractC4599e<Set<String>> mo23174r(InterfaceC0048b interfaceC0048b, C4596b c4596b, InterfaceC0050d.b bVar) {
        C0986f.m5892c(interfaceC0048b, "fragment == null");
        C0986f.m5892c(c4596b, "cacheKey == null");
        C0986f.m5892c(bVar, "operation == null");
        if (c4596b != C4596b.f27245b) {
            return new b(this, this.f31218g, interfaceC0048b, c4596b, bVar);
        }
        throw new IllegalArgumentException("undefined cache key");
    }

    @Override // p178k3.InterfaceC5465d
    /* renamed from: s */
    public Collection<C4603i> mo27232s(Collection<String> collection, C4301a c4301a) {
        return this.f31213b.m23193d((Collection) C0986f.m5892c(collection, "keys == null"), c4301a);
    }

    @Override // p072e3.InterfaceC4595a
    /* renamed from: t */
    public AbstractC4600f mo23175t() {
        return this.f31213b;
    }

    @Override // p072e3.InterfaceC4595a
    /* renamed from: u */
    public <R> R mo23176u(InterfaceC5470i<InterfaceC5465d, R> interfaceC5470i) {
        this.f31216e.readLock().lock();
        try {
            return interfaceC5470i.mo27249a(this);
        } finally {
            this.f31216e.readLock().unlock();
        }
    }

    @Override // p072e3.InterfaceC4595a
    /* renamed from: v */
    public <R> R mo23177v(InterfaceC5470i<InterfaceC5471j, R> interfaceC5470i) {
        this.f31216e.writeLock().lock();
        try {
            return interfaceC5470i.mo27249a(this);
        } finally {
            this.f31216e.writeLock().unlock();
        }
    }

    @Override // p072e3.InterfaceC4595a
    /* renamed from: w */
    public void mo23178w(InterfaceC4595a.a aVar) {
        synchronized (this) {
            this.f31217f.add(aVar);
        }
    }
}
