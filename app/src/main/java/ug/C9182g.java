package ug;

import java.util.LinkedHashSet;
import java.util.Set;
import tg.C8747w;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ug/g.class
 */
/* renamed from: ug.g */
/* loaded from: combined.jar:classes2.jar:ug/g.class */
public final class C9182g {

    /* renamed from: a */
    public final Set<C8747w> f42011a = new LinkedHashSet();

    /* renamed from: a */
    public void m38678a(C8747w c8747w) {
        synchronized (this) {
            this.f42011a.remove(c8747w);
        }
    }

    /* renamed from: b */
    public void m38679b(C8747w c8747w) {
        synchronized (this) {
            this.f42011a.add(c8747w);
        }
    }

    /* renamed from: c */
    public boolean m38680c(C8747w c8747w) {
        boolean contains;
        synchronized (this) {
            contains = this.f42011a.contains(c8747w);
        }
        return contains;
    }
}
