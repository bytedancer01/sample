package androidx.navigation;

import androidx.lifecycle.AbstractC0563b0;
import androidx.lifecycle.C0565c0;
import androidx.lifecycle.C0567d0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/navigation/g.class
 */
/* renamed from: androidx.navigation.g */
/* loaded from: combined.jar:classes1.jar:androidx/navigation/g.class */
public class C0627g extends AbstractC0563b0 {

    /* renamed from: d */
    public static final C0565c0.b f4232d = new a();

    /* renamed from: c */
    public final HashMap<UUID, C0567d0> f4233c = new HashMap<>();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/g$a.class
     */
    /* renamed from: androidx.navigation.g$a */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/g$a.class */
    public class a implements C0565c0.b {
        @Override // androidx.lifecycle.C0565c0.b
        /* renamed from: a */
        public <T extends AbstractC0563b0> T mo2298a(Class<T> cls) {
            return new C0627g();
        }
    }

    /* renamed from: g */
    public static C0627g m3530g(C0567d0 c0567d0) {
        return (C0627g) new C0565c0(c0567d0, f4232d).m3136a(C0627g.class);
    }

    @Override // androidx.lifecycle.AbstractC0563b0
    /* renamed from: d */
    public void mo2287d() {
        Iterator<C0567d0> it = this.f4233c.values().iterator();
        while (it.hasNext()) {
            it.next().m3142a();
        }
        this.f4233c.clear();
    }

    /* renamed from: f */
    public void m3531f(UUID uuid) {
        C0567d0 remove = this.f4233c.remove(uuid);
        if (remove != null) {
            remove.m3142a();
        }
    }

    /* renamed from: h */
    public C0567d0 m3532h(UUID uuid) {
        C0567d0 c0567d0 = this.f4233c.get(uuid);
        C0567d0 c0567d02 = c0567d0;
        if (c0567d0 == null) {
            c0567d02 = new C0567d0();
            this.f4233c.put(uuid, c0567d02);
        }
        return c0567d02;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator<UUID> it = this.f4233c.keySet().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
