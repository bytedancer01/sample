package p072e3;

import cg.C1092e;
import cg.InterfaceC1091d;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import p033c3.AbstractC0984d;
import p033c3.C0986f;
import p033c3.InterfaceC0982b;
import p033c3.InterfaceC0983c;
import p053d3.C4301a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e3/h.class
 */
/* renamed from: e3.h */
/* loaded from: combined.jar:classes1.jar:e3/h.class */
public final class C4602h extends AbstractC4600f {

    /* renamed from: b */
    public final InterfaceC1091d<String, f> f27257b = C1092e.m6516q().m6517a();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e3/h$a.class
     */
    /* renamed from: e3.h$a */
    /* loaded from: combined.jar:classes1.jar:e3/h$a.class */
    public class a implements InterfaceC0983c<AbstractC4600f, AbstractC0984d<C4603i>> {

        /* renamed from: a */
        public final String f27258a;

        /* renamed from: b */
        public final C4301a f27259b;

        /* renamed from: c */
        public final C4602h f27260c;

        public a(C4602h c4602h, String str, C4301a c4301a) {
            this.f27260c = c4602h;
            this.f27258a = str;
            this.f27259b = c4301a;
        }

        @Override // p033c3.InterfaceC0983c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC0984d<C4603i> apply(AbstractC4600f abstractC4600f) {
            return AbstractC0984d.m5888d(abstractC4600f.mo23192c(this.f27258a, this.f27259b));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e3/h$b.class
     */
    /* renamed from: e3.h$b */
    /* loaded from: combined.jar:classes1.jar:e3/h$b.class */
    public class b implements InterfaceC0983c<C4603i, C4603i> {

        /* renamed from: a */
        public final f f27261a;

        /* renamed from: b */
        public final C4602h f27262b;

        public b(C4602h c4602h, f fVar) {
            this.f27262b = c4602h;
            this.f27261a = fVar;
        }

        @Override // p033c3.InterfaceC0983c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4603i apply(C4603i c4603i) {
            C4603i clone = c4603i.clone();
            clone.m23214f(this.f27261a.f27269a);
            return clone;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e3/h$c.class
     */
    /* renamed from: e3.h$c */
    /* loaded from: combined.jar:classes1.jar:e3/h$c.class */
    public class c implements InterfaceC0983c<AbstractC4600f, Set<String>> {

        /* renamed from: a */
        public final C4603i f27263a;

        /* renamed from: b */
        public final C4301a f27264b;

        /* renamed from: c */
        public final C4602h f27265c;

        public c(C4602h c4602h, C4603i c4603i, C4301a c4301a) {
            this.f27265c = c4602h;
            this.f27263a = c4603i;
            this.f27264b = c4301a;
        }

        @Override // p033c3.InterfaceC0983c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set<String> apply(AbstractC4600f abstractC4600f) {
            return abstractC4600f.mo23194e(this.f27263a, this.f27264b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e3/h$d.class
     */
    /* renamed from: e3.h$d */
    /* loaded from: combined.jar:classes1.jar:e3/h$d.class */
    public class d implements InterfaceC0982b<AbstractC4600f> {

        /* renamed from: a */
        public final C4602h f27266a;

        public d(C4602h c4602h) {
            this.f27266a = c4602h;
        }

        @Override // p033c3.InterfaceC0982b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(AbstractC4600f abstractC4600f) {
            abstractC4600f.mo23191b();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e3/h$e.class
     */
    /* renamed from: e3.h$e */
    /* loaded from: combined.jar:classes1.jar:e3/h$e.class */
    public class e implements InterfaceC0983c<AbstractC4600f, Boolean> {

        /* renamed from: a */
        public final C4596b f27267a;

        /* renamed from: b */
        public final C4602h f27268b;

        public e(C4602h c4602h, C4596b c4596b) {
            this.f27268b = c4602h;
            this.f27267a = c4596b;
        }

        @Override // p033c3.InterfaceC0983c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean apply(AbstractC4600f abstractC4600f) {
            return Boolean.valueOf(abstractC4600f.mo23197h(this.f27267a));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e3/h$f.class
     */
    /* renamed from: e3.h$f */
    /* loaded from: combined.jar:classes1.jar:e3/h$f.class */
    public final class f {

        /* renamed from: a */
        public C4603i f27269a;

        /* renamed from: b */
        public final LinkedList<C4603i> f27270b;

        /* renamed from: c */
        public final C4602h f27271c;

        public f(C4602h c4602h, C4603i c4603i) {
            this.f27271c = c4602h;
            LinkedList<C4603i> linkedList = new LinkedList<>();
            this.f27270b = linkedList;
            this.f27269a = c4603i.clone();
            linkedList.add(c4603i.clone());
        }

        /* renamed from: a */
        public Set<String> m23208a(C4603i c4603i) {
            this.f27270b.addLast(c4603i.clone());
            return this.f27269a.m23214f(c4603i);
        }
    }

    @Override // p072e3.AbstractC4600f
    /* renamed from: b */
    public void mo23191b() {
        this.f27257b.mo6515c();
        m23196g().mo5879b(new d(this));
    }

    @Override // p072e3.AbstractC4600f
    /* renamed from: c */
    public C4603i mo23192c(String str, C4301a c4301a) {
        C0986f.m5892c(str, "key == null");
        C0986f.m5892c(c4301a, "cacheHeaders == null");
        try {
            AbstractC0984d<V> mo5880c = m23196g().mo5880c(new a(this, str, c4301a));
            f mo6514b = this.f27257b.mo6514b(str);
            return mo6514b != null ? (C4603i) mo5880c.mo5883g(new b(this, mo6514b)).mo5885j(mo6514b.f27269a.clone()) : (C4603i) mo5880c.mo5886k();
        } catch (Exception e10) {
            return null;
        }
    }

    @Override // p072e3.AbstractC4600f
    /* renamed from: e */
    public Set<String> mo23194e(C4603i c4603i, C4301a c4301a) {
        C0986f.m5892c(c4603i, "record == null");
        C0986f.m5892c(c4301a, "cacheHeaders == null");
        return (Set) m23196g().mo5883g(new c(this, c4603i, c4301a)).mo5885j(Collections.emptySet());
    }

    @Override // p072e3.AbstractC4600f
    /* renamed from: h */
    public boolean mo23197h(C4596b c4596b) {
        C0986f.m5892c(c4596b, "cacheKey == null");
        boolean booleanValue = ((Boolean) m23196g().mo5883g(new e(this, c4596b)).mo5885j(Boolean.FALSE)).booleanValue();
        if (this.f27257b.mo6514b(c4596b.m23181b()) != null) {
            this.f27257b.mo6513a(c4596b.m23181b());
            booleanValue = true;
        }
        return booleanValue;
    }

    /* renamed from: i */
    public Set<String> m23201i(C4603i c4603i) {
        C0986f.m5892c(c4603i, "record == null");
        f mo6514b = this.f27257b.mo6514b(c4603i.m23213e());
        if (mo6514b != null) {
            return mo6514b.m23208a(c4603i);
        }
        this.f27257b.put(c4603i.m23213e(), new f(this, c4603i));
        return Collections.singleton(c4603i.m23213e());
    }

    /* renamed from: j */
    public Set<String> m23202j(Collection<C4603i> collection) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<C4603i> it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(m23201i(it.next()));
        }
        return linkedHashSet;
    }
}
