package ma;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ji.class
 */
/* renamed from: ma.ji */
/* loaded from: combined.jar:classes2.jar:ma/ji.class */
public final class C6213ji extends C6423ti {
    public C6213ji(int i10) {
        super(i10, null);
    }

    @Override // ma.C6423ti
    /* renamed from: b */
    public final void mo29788b() {
        if (!m30053k()) {
            for (int i10 = 0; i10 < m30049c(); i10++) {
                Map.Entry m30052h = m30052h(i10);
                if (((InterfaceC6169hg) m30052h.getKey()).m29664l()) {
                    m30052h.setValue(Collections.unmodifiableList((List) m30052h.getValue()));
                }
            }
            for (Map.Entry entry : m30050d()) {
                if (((InterfaceC6169hg) entry.getKey()).m29664l()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo29788b();
    }
}
