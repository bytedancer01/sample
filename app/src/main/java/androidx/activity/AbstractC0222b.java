package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/activity/b.class
 */
/* renamed from: androidx.activity.b */
/* loaded from: combined.jar:classes1.jar:androidx/activity/b.class */
public abstract class AbstractC0222b {

    /* renamed from: a */
    public boolean f1326a;

    /* renamed from: b */
    public CopyOnWriteArrayList<InterfaceC0221a> f1327b = new CopyOnWriteArrayList<>();

    public AbstractC0222b(boolean z10) {
        this.f1326a = z10;
    }

    /* renamed from: a */
    public void m781a(InterfaceC0221a interfaceC0221a) {
        this.f1327b.add(interfaceC0221a);
    }

    /* renamed from: b */
    public abstract void mo782b();

    /* renamed from: c */
    public final boolean m783c() {
        return this.f1326a;
    }

    /* renamed from: d */
    public final void m784d() {
        Iterator<InterfaceC0221a> it = this.f1327b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* renamed from: e */
    public void m785e(InterfaceC0221a interfaceC0221a) {
        this.f1327b.remove(interfaceC0221a);
    }

    /* renamed from: f */
    public final void m786f(boolean z10) {
        this.f1326a = z10;
    }
}
