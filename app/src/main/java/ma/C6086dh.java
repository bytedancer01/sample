package ma;

import java.util.Collections;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/dh.class
 */
/* renamed from: ma.dh */
/* loaded from: combined.jar:classes2.jar:ma/dh.class */
public final class C6086dh extends AbstractC6191ih {

    /* renamed from: c */
    public static final Class f33738c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ C6086dh(C6065ch c6065ch) {
        super(null);
    }

    @Override // ma.AbstractC6191ih
    /* renamed from: a */
    public final void mo29553a(Object obj, long j10) {
        List unmodifiableList;
        List list = (List) C6193ij.m29749k(obj, j10);
        if (list instanceof InterfaceC6044bh) {
            unmodifiableList = ((InterfaceC6044bh) list).mo29431o();
        } else {
            if (f33738c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC6045bi) && (list instanceof InterfaceC6462vg)) {
                InterfaceC6462vg interfaceC6462vg = (InterfaceC6462vg) list;
                if (interfaceC6462vg.mo29641l()) {
                    interfaceC6462vg.mo29640k();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C6193ij.m29762x(obj, j10, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0123  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // ma.AbstractC6191ih
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo29554b(java.lang.Object r6, java.lang.Object r7, long r8) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.C6086dh.mo29554b(java.lang.Object, java.lang.Object, long):void");
    }
}
