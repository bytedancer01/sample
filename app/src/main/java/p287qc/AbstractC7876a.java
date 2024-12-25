package p287qc;

import bd.InterfaceC0891b;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qc/a.class
 */
/* renamed from: qc.a */
/* loaded from: combined.jar:classes2.jar:qc/a.class */
public abstract class AbstractC7876a implements InterfaceC7884e {
    @Override // p287qc.InterfaceC7884e
    /* renamed from: b */
    public <T> Set<T> mo34154b(Class<T> cls) {
        return mo34189a(cls).get();
    }

    @Override // p287qc.InterfaceC7884e
    public <T> T get(Class<T> cls) {
        InterfaceC0891b<T> mo34190c = mo34190c(cls);
        if (mo34190c == null) {
            return null;
        }
        return mo34190c.get();
    }
}
