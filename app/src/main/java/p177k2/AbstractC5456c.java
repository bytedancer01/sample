package p177k2;

import java.util.ArrayList;
import java.util.List;
import p158j2.InterfaceC5279a;
import p193l2.AbstractC5660d;
import p223n2.C6636p;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k2/c.class
 */
/* renamed from: k2.c */
/* loaded from: combined.jar:classes1.jar:k2/c.class */
public abstract class AbstractC5456c<T> implements InterfaceC5279a<T> {

    /* renamed from: a */
    public final List<String> f31203a = new ArrayList();

    /* renamed from: b */
    public T f31204b;

    /* renamed from: c */
    public AbstractC5660d<T> f31205c;

    /* renamed from: d */
    public a f31206d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k2/c$a.class
     */
    /* renamed from: k2.c$a */
    /* loaded from: combined.jar:classes1.jar:k2/c$a.class */
    public interface a {
        /* renamed from: a */
        void mo26366a(List<String> list);

        /* renamed from: b */
        void mo26367b(List<String> list);
    }

    public AbstractC5456c(AbstractC5660d<T> abstractC5660d) {
        this.f31205c = abstractC5660d;
    }

    @Override // p158j2.InterfaceC5279a
    /* renamed from: a */
    public void mo26361a(T t10) {
        this.f31204b = t10;
        m27218h(this.f31206d, t10);
    }

    /* renamed from: b */
    public abstract boolean mo27210b(C6636p c6636p);

    /* renamed from: c */
    public abstract boolean mo27211c(T t10);

    /* renamed from: d */
    public boolean m27214d(String str) {
        T t10 = this.f31204b;
        return t10 != null && mo27211c(t10) && this.f31203a.contains(str);
    }

    /* renamed from: e */
    public void m27215e(Iterable<C6636p> iterable) {
        this.f31203a.clear();
        for (C6636p c6636p : iterable) {
            if (mo27210b(c6636p)) {
                this.f31203a.add(c6636p.f34573a);
            }
        }
        if (this.f31203a.isEmpty()) {
            this.f31205c.m27871c(this);
        } else {
            this.f31205c.m27870a(this);
        }
        m27218h(this.f31206d, this.f31204b);
    }

    /* renamed from: f */
    public void m27216f() {
        if (this.f31203a.isEmpty()) {
            return;
        }
        this.f31203a.clear();
        this.f31205c.m27871c(this);
    }

    /* renamed from: g */
    public void m27217g(a aVar) {
        if (this.f31206d != aVar) {
            this.f31206d = aVar;
            m27218h(aVar, this.f31204b);
        }
    }

    /* renamed from: h */
    public final void m27218h(a aVar, T t10) {
        if (this.f31203a.isEmpty() || aVar == null) {
            return;
        }
        if (t10 == null || mo27211c(t10)) {
            aVar.mo26367b(this.f31203a);
        } else {
            aVar.mo26366a(this.f31203a);
        }
    }
}
