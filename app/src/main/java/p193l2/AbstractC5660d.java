package p193l2;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p071e2.AbstractC4582k;
import p158j2.InterfaceC5279a;
import p278q2.InterfaceC7748a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l2/d.class
 */
/* renamed from: l2.d */
/* loaded from: combined.jar:classes1.jar:l2/d.class */
public abstract class AbstractC5660d<T> {

    /* renamed from: f */
    public static final String f31914f = AbstractC4582k.m23128f("ConstraintTracker");

    /* renamed from: a */
    public final InterfaceC7748a f31915a;

    /* renamed from: b */
    public final Context f31916b;

    /* renamed from: c */
    public final Object f31917c = new Object();

    /* renamed from: d */
    public final Set<InterfaceC5279a<T>> f31918d = new LinkedHashSet();

    /* renamed from: e */
    public T f31919e;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l2/d$a.class
     */
    /* renamed from: l2.d$a */
    /* loaded from: combined.jar:classes1.jar:l2/d$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final List f31920b;

        /* renamed from: c */
        public final AbstractC5660d f31921c;

        public a(AbstractC5660d abstractC5660d, List list) {
            this.f31921c = abstractC5660d;
            this.f31920b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f31920b.iterator();
            while (it.hasNext()) {
                ((InterfaceC5279a) it.next()).mo26361a(this.f31921c.f31919e);
            }
        }
    }

    public AbstractC5660d(Context context, InterfaceC7748a interfaceC7748a) {
        this.f31916b = context.getApplicationContext();
        this.f31915a = interfaceC7748a;
    }

    /* renamed from: a */
    public void m27870a(InterfaceC5279a<T> interfaceC5279a) {
        synchronized (this.f31917c) {
            if (this.f31918d.add(interfaceC5279a)) {
                if (this.f31918d.size() == 1) {
                    this.f31919e = mo27862b();
                    AbstractC4582k.m23126c().mo23129a(f31914f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f31919e), new Throwable[0]);
                    mo27868e();
                }
                interfaceC5279a.mo26361a(this.f31919e);
            }
        }
    }

    /* renamed from: b */
    public abstract T mo27862b();

    /* renamed from: c */
    public void m27871c(InterfaceC5279a<T> interfaceC5279a) {
        synchronized (this.f31917c) {
            if (this.f31918d.remove(interfaceC5279a) && this.f31918d.isEmpty()) {
                mo27869f();
            }
        }
    }

    /* renamed from: d */
    public void m27872d(T t10) {
        synchronized (this.f31917c) {
            T t11 = this.f31919e;
            if (t11 != t10 && (t11 == null || !t11.equals(t10))) {
                this.f31919e = t10;
                this.f31915a.mo33901a().execute(new a(this, new ArrayList(this.f31918d)));
            }
        }
    }

    /* renamed from: e */
    public abstract void mo27868e();

    /* renamed from: f */
    public abstract void mo27869f();
}
