package p132he;

import ie.C5249e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import je.C5368d;
import p444zd.C10193a;
import td.AbstractC8698m;
import td.C8695j;
import td.C8699n;
import td.EnumC8686a;
import td.EnumC8690e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:he/i.class
 */
/* renamed from: he.i */
/* loaded from: combined.jar:classes2.jar:he/i.class */
public final class C5067i extends AbstractC5069k {

    /* renamed from: b */
    public static final AbstractC5069k[] f29167b = new AbstractC5069k[0];

    /* renamed from: a */
    public final AbstractC5069k[] f29168a;

    public C5067i(Map<EnumC8690e, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(EnumC8690e.POSSIBLE_FORMATS);
        boolean z10 = (map == null || map.get(EnumC8690e.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(EnumC8686a.EAN_13) || collection.contains(EnumC8686a.UPC_A) || collection.contains(EnumC8686a.EAN_8) || collection.contains(EnumC8686a.UPC_E)) {
                arrayList.add(new C5068j(map));
            }
            if (collection.contains(EnumC8686a.CODE_39)) {
                arrayList.add(new C5061c(z10));
            }
            if (collection.contains(EnumC8686a.CODE_93)) {
                arrayList.add(new C5062d());
            }
            if (collection.contains(EnumC8686a.CODE_128)) {
                arrayList.add(new C5060b());
            }
            if (collection.contains(EnumC8686a.ITF)) {
                arrayList.add(new C5066h());
            }
            if (collection.contains(EnumC8686a.CODABAR)) {
                arrayList.add(new C5059a());
            }
            if (collection.contains(EnumC8686a.RSS_14)) {
                arrayList.add(new C5249e());
            }
            if (collection.contains(EnumC8686a.RSS_EXPANDED)) {
                arrayList.add(new C5368d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C5068j(map));
            arrayList.add(new C5061c());
            arrayList.add(new C5059a());
            arrayList.add(new C5062d());
            arrayList.add(new C5060b());
            arrayList.add(new C5066h());
            arrayList.add(new C5249e());
            arrayList.add(new C5368d());
        }
        this.f29168a = (AbstractC5069k[]) arrayList.toArray(f29167b);
    }

    @Override // p132he.AbstractC5069k
    /* renamed from: c */
    public C8699n mo25297c(int i10, C10193a c10193a, Map<EnumC8690e, ?> map) {
        for (AbstractC5069k abstractC5069k : this.f29168a) {
            try {
                return abstractC5069k.mo25297c(i10, c10193a, map);
            } catch (AbstractC8698m e10) {
            }
        }
        throw C8695j.m37209a();
    }

    @Override // p132he.AbstractC5069k, td.InterfaceC8697l
    public void reset() {
        for (AbstractC5069k abstractC5069k : this.f29168a) {
            abstractC5069k.reset();
        }
    }
}
