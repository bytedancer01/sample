package p239o4;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p363v4.C9242h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o4/a.class
 */
/* renamed from: o4.a */
/* loaded from: combined.jar:classes1.jar:o4/a.class */
public class C6892a implements InterfaceC6898g {

    /* renamed from: a */
    public final Set<InterfaceC6899h> f35715a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public boolean f35716b;

    /* renamed from: c */
    public boolean f35717c;

    @Override // p239o4.InterfaceC6898g
    /* renamed from: a */
    public void mo31798a(InterfaceC6899h interfaceC6899h) {
        this.f35715a.add(interfaceC6899h);
        if (this.f35717c) {
            interfaceC6899h.onDestroy();
        } else if (this.f35716b) {
            interfaceC6899h.onStart();
        } else {
            interfaceC6899h.onStop();
        }
    }

    /* renamed from: b */
    public void m31799b() {
        this.f35717c = true;
        Iterator it = C9242h.m38969g(this.f35715a).iterator();
        while (it.hasNext()) {
            ((InterfaceC6899h) it.next()).onDestroy();
        }
    }

    /* renamed from: c */
    public void m31800c() {
        this.f35716b = true;
        Iterator it = C9242h.m38969g(this.f35715a).iterator();
        while (it.hasNext()) {
            ((InterfaceC6899h) it.next()).onStart();
        }
    }

    /* renamed from: d */
    public void m31801d() {
        this.f35716b = false;
        Iterator it = C9242h.m38969g(this.f35715a).iterator();
        while (it.hasNext()) {
            ((InterfaceC6899h) it.next()).onStop();
        }
    }
}
