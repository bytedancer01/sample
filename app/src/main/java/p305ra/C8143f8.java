package p305ra;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/f8.class
 */
/* renamed from: ra.f8 */
/* loaded from: combined.jar:classes2.jar:ra/f8.class */
public final class C8143f8 extends C8248m8 {
    public C8143f8(int i10) {
        super(i10, null);
    }

    @Override // p305ra.C8248m8
    /* renamed from: b */
    public final void mo35369b() {
        if (!m35617c()) {
            for (int i10 = 0; i10 < m35618d(); i10++) {
                Map.Entry m35619e = m35619e(i10);
                if (((InterfaceC8096c6) m35619e.getKey()).m35093l()) {
                    m35619e.setValue(Collections.unmodifiableList((List) m35619e.getValue()));
                }
            }
            for (Map.Entry entry : m35620f()) {
                if (((InterfaceC8096c6) entry.getKey()).m35093l()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo35369b();
    }
}
