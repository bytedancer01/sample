package p178k3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p004a3.C0054h;
import p004a3.InterfaceC0050d;
import p072e3.AbstractC4597c;
import p072e3.C4596b;
import p072e3.C4603i;
import p072e3.C4605k;
import p264p3.InterfaceC7549c;
import p298r3.C7952b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k3/h.class
 */
/* renamed from: k3.h */
/* loaded from: combined.jar:classes1.jar:k3/h.class */
public abstract class AbstractC5469h<R> implements InterfaceC7549c<R> {

    /* renamed from: h */
    public static final AbstractC5469h f31274h = new a();

    /* renamed from: a */
    public C7952b<List<String>> f31275a;

    /* renamed from: b */
    public C7952b<C4603i> f31276b;

    /* renamed from: c */
    public C7952b<Object> f31277c;

    /* renamed from: d */
    public List<String> f31278d;

    /* renamed from: e */
    public C4603i.a f31279e;

    /* renamed from: f */
    public C4605k f31280f = new C4605k();

    /* renamed from: g */
    public Set<String> f31281g = Collections.emptySet();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k3/h$a.class
     */
    /* renamed from: k3.h$a */
    /* loaded from: combined.jar:classes1.jar:k3/h$a.class */
    public static final class a extends AbstractC5469h {

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:k3/h$a$a.class
         */
        /* renamed from: k3.h$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:k3/h$a$a.class */
        public class C10310a implements InterfaceC5462a {

            /* renamed from: a */
            public final a f31282a;

            public C10310a(a aVar) {
                this.f31282a = aVar;
            }

            @Override // p178k3.InterfaceC5462a
            /* renamed from: a */
            public String mo27224a(C0054h c0054h, InterfaceC0050d.b bVar) {
                return C4596b.f27245b.m23181b();
            }
        }

        @Override // p178k3.AbstractC5469h
        /* renamed from: a */
        public InterfaceC5462a mo27255a() {
            return new C10310a(this);
        }

        @Override // p178k3.AbstractC5469h
        /* renamed from: b */
        public Set<String> mo27270b() {
            return Collections.emptySet();
        }

        @Override // p178k3.AbstractC5469h
        /* renamed from: c */
        public Collection<C4603i> mo27271c() {
            return Collections.emptyList();
        }

        @Override // p178k3.AbstractC5469h
        /* renamed from: d */
        public void mo27272d(C0054h c0054h, InterfaceC0050d.b bVar) {
        }

        @Override // p178k3.AbstractC5469h
        /* renamed from: f */
        public void mo27274f(InterfaceC0050d interfaceC0050d) {
        }
    }

    /* renamed from: a */
    public abstract InterfaceC5462a mo27255a();

    /* renamed from: b */
    public Set<String> mo27270b() {
        return this.f31281g;
    }

    /* renamed from: c */
    public Collection<C4603i> mo27271c() {
        return this.f31280f.m23224a();
    }

    /* renamed from: d */
    public void mo27272d(C0054h c0054h, InterfaceC0050d.b bVar) {
        this.f31278d.add(mo27255a().mo27224a(c0054h, bVar));
    }

    /* renamed from: e */
    public void m27273e(C4596b c4596b) {
        this.f31275a = new C7952b<>();
        this.f31276b = new C7952b<>();
        this.f31277c = new C7952b<>();
        this.f31281g = new HashSet();
        this.f31278d = new ArrayList();
        this.f31279e = C4603i.m23209b(c4596b.m23181b());
        this.f31280f = new C4605k();
    }

    /* renamed from: f */
    public void mo27274f(InterfaceC0050d interfaceC0050d) {
        m27273e(AbstractC4597c.rootKeyForOperation(interfaceC0050d));
    }
}
