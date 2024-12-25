package p000a;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a/a.class
 */
/* renamed from: a.a */
/* loaded from: combined.jar:classes1.jar:a/a.class */
public final class C0000a {

    /* renamed from: a */
    public final Set<InterfaceC0001b> f0a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public volatile Context f1b;

    /* renamed from: a */
    public void m0a(InterfaceC0001b interfaceC0001b) {
        if (this.f1b != null) {
            interfaceC0001b.mo5a(this.f1b);
        }
        this.f0a.add(interfaceC0001b);
    }

    /* renamed from: b */
    public void m1b() {
        this.f1b = null;
    }

    /* renamed from: c */
    public void m2c(Context context) {
        this.f1b = context;
        Iterator<InterfaceC0001b> it = this.f0a.iterator();
        while (it.hasNext()) {
            it.next().mo5a(context);
        }
    }

    /* renamed from: d */
    public Context m3d() {
        return this.f1b;
    }

    /* renamed from: e */
    public void m4e(InterfaceC0001b interfaceC0001b) {
        this.f0a.remove(interfaceC0001b);
    }
}
