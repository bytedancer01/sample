package p305ra;

import java.util.Collections;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/c7.class
 */
/* renamed from: ra.c7 */
/* loaded from: combined.jar:classes2.jar:ra/c7.class */
public final class C8097c7 extends AbstractC8127e7 {

    /* renamed from: c */
    public static final Class<?> f38968c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ C8097c7(C8082b7 c8082b7) {
        super(null);
    }

    @Override // p305ra.AbstractC8127e7
    /* renamed from: a */
    public final void mo35094a(Object obj, long j10) {
        List unmodifiableList;
        List list = (List) C8099c9.m35139y(obj, j10);
        if (list instanceof InterfaceC8067a7) {
            unmodifiableList = ((InterfaceC8067a7) list).mo34999j();
        } else {
            if (f38968c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC8427y7) && (list instanceof InterfaceC8351t6)) {
                InterfaceC8351t6 interfaceC8351t6 = (InterfaceC8351t6) list;
                if (interfaceC8351t6.zza()) {
                    interfaceC8351t6.mo35827k();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C8099c9.m35140z(obj, j10, unmodifiableList);
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
    @Override // p305ra.AbstractC8127e7
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <E> void mo35095b(java.lang.Object r6, java.lang.Object r7, long r8) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p305ra.C8097c7.mo35095b(java.lang.Object, java.lang.Object, long):void");
    }
}
