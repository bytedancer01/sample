package p305ra;

import java.util.Comparator;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/b5.class
 */
/* renamed from: ra.b5 */
/* loaded from: combined.jar:classes2.jar:ra/b5.class */
public final class C8080b5 implements Comparator<AbstractC8230l5> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(AbstractC8230l5 abstractC8230l5, AbstractC8230l5 abstractC8230l52) {
        int compare;
        AbstractC8230l5 abstractC8230l53 = abstractC8230l5;
        AbstractC8230l5 abstractC8230l54 = abstractC8230l52;
        C8065a5 c8065a5 = new C8065a5(abstractC8230l53);
        C8065a5 c8065a52 = new C8065a5(abstractC8230l54);
        while (c8065a5.hasNext() && c8065a52.hasNext()) {
            compare = Integer.compare(c8065a5.zza() & 255, c8065a52.zza() & 255);
            if (compare != 0) {
                break;
            }
        }
        compare = Integer.compare(abstractC8230l53.mo35264d(), abstractC8230l54.mo35264d());
        return compare;
    }
}
