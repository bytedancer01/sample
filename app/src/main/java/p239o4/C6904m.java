package p239o4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p299r4.InterfaceC7954b;
import p363v4.C9242h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o4/m.class
 */
/* renamed from: o4.m */
/* loaded from: combined.jar:classes1.jar:o4/m.class */
public class C6904m {

    /* renamed from: a */
    public final Set<InterfaceC7954b> f35735a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public final List<InterfaceC7954b> f35736b = new ArrayList();

    /* renamed from: c */
    public boolean f35737c;

    /* renamed from: a */
    public void m31826a() {
        Iterator it = C9242h.m38969g(this.f35735a).iterator();
        while (it.hasNext()) {
            ((InterfaceC7954b) it.next()).clear();
        }
        this.f35736b.clear();
    }

    /* renamed from: b */
    public void m31827b() {
        this.f35737c = true;
        for (InterfaceC7954b interfaceC7954b : C9242h.m38969g(this.f35735a)) {
            if (interfaceC7954b.isRunning()) {
                interfaceC7954b.pause();
                this.f35736b.add(interfaceC7954b);
            }
        }
    }

    /* renamed from: c */
    public void m31828c(InterfaceC7954b interfaceC7954b) {
        this.f35735a.remove(interfaceC7954b);
        this.f35736b.remove(interfaceC7954b);
    }

    /* renamed from: d */
    public void m31829d() {
        for (InterfaceC7954b interfaceC7954b : C9242h.m38969g(this.f35735a)) {
            if (!interfaceC7954b.isComplete() && !interfaceC7954b.isCancelled()) {
                interfaceC7954b.pause();
                if (this.f35737c) {
                    this.f35736b.add(interfaceC7954b);
                } else {
                    interfaceC7954b.mo34489f();
                }
            }
        }
    }

    /* renamed from: e */
    public void m31830e() {
        this.f35737c = false;
        for (InterfaceC7954b interfaceC7954b : C9242h.m38969g(this.f35735a)) {
            if (!interfaceC7954b.isComplete() && !interfaceC7954b.isCancelled() && !interfaceC7954b.isRunning()) {
                interfaceC7954b.mo34489f();
            }
        }
        this.f35736b.clear();
    }

    /* renamed from: f */
    public void m31831f(InterfaceC7954b interfaceC7954b) {
        this.f35735a.add(interfaceC7954b);
        if (this.f35737c) {
            this.f35736b.add(interfaceC7954b);
        } else {
            interfaceC7954b.mo34489f();
        }
    }
}
