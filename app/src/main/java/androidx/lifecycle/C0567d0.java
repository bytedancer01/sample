package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/lifecycle/d0.class
 */
/* renamed from: androidx.lifecycle.d0 */
/* loaded from: combined.jar:classes1.jar:androidx/lifecycle/d0.class */
public class C0567d0 {

    /* renamed from: a */
    public final HashMap<String, AbstractC0563b0> f3761a = new HashMap<>();

    /* renamed from: a */
    public final void m3142a() {
        Iterator<AbstractC0563b0> it = this.f3761a.values().iterator();
        while (it.hasNext()) {
            it.next().m3133a();
        }
        this.f3761a.clear();
    }

    /* renamed from: b */
    public final AbstractC0563b0 m3143b(String str) {
        return this.f3761a.get(str);
    }

    /* renamed from: c */
    public Set<String> m3144c() {
        return new HashSet(this.f3761a.keySet());
    }

    /* renamed from: d */
    public final void m3145d(String str, AbstractC0563b0 abstractC0563b0) {
        AbstractC0563b0 put = this.f3761a.put(str, abstractC0563b0);
        if (put != null) {
            put.mo2287d();
        }
    }
}
