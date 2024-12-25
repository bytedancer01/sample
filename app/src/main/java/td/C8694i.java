package td;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p041ce.C1076a;
import p101fe.C4852a;
import p132he.C5067i;
import p202le.C5845b;
import p353ud.C9155b;
import pe.C7704a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:td/i.class
 */
/* renamed from: td.i */
/* loaded from: combined.jar:classes2.jar:td/i.class */
public final class C8694i implements InterfaceC8697l {

    /* renamed from: c */
    public static final InterfaceC8697l[] f40467c = new InterfaceC8697l[0];

    /* renamed from: a */
    public Map<EnumC8690e, ?> f40468a;

    /* renamed from: b */
    public InterfaceC8697l[] f40469b;

    @Override // td.InterfaceC8697l
    /* renamed from: a */
    public C8699n mo6324a(C8688c c8688c, Map<EnumC8690e, ?> map) {
        m37208e(map);
        return m37206c(c8688c);
    }

    @Override // td.InterfaceC8697l
    /* renamed from: b */
    public C8699n mo6325b(C8688c c8688c) {
        m37208e(null);
        return m37206c(c8688c);
    }

    /* renamed from: c */
    public final C8699n m37206c(C8688c c8688c) {
        InterfaceC8697l[] interfaceC8697lArr = this.f40469b;
        if (interfaceC8697lArr != null) {
            for (InterfaceC8697l interfaceC8697l : interfaceC8697lArr) {
                try {
                    return interfaceC8697l.mo6324a(c8688c, this.f40468a);
                } catch (AbstractC8698m e10) {
                }
            }
        }
        throw C8695j.m37209a();
    }

    /* renamed from: d */
    public C8699n m37207d(C8688c c8688c) {
        if (this.f40469b == null) {
            m37208e(null);
        }
        return m37206c(c8688c);
    }

    /* renamed from: e */
    public void m37208e(Map<EnumC8690e, ?> map) {
        this.f40468a = map;
        boolean z10 = map != null && map.containsKey(EnumC8690e.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(EnumC8690e.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            boolean z11 = true;
            if (!collection.contains(EnumC8686a.UPC_A)) {
                z11 = true;
                if (!collection.contains(EnumC8686a.UPC_E)) {
                    z11 = true;
                    if (!collection.contains(EnumC8686a.EAN_13)) {
                        z11 = true;
                        if (!collection.contains(EnumC8686a.EAN_8)) {
                            z11 = true;
                            if (!collection.contains(EnumC8686a.CODABAR)) {
                                z11 = true;
                                if (!collection.contains(EnumC8686a.CODE_39)) {
                                    z11 = true;
                                    if (!collection.contains(EnumC8686a.CODE_93)) {
                                        z11 = true;
                                        if (!collection.contains(EnumC8686a.CODE_128)) {
                                            z11 = true;
                                            if (!collection.contains(EnumC8686a.ITF)) {
                                                z11 = true;
                                                if (!collection.contains(EnumC8686a.RSS_14)) {
                                                    z11 = collection.contains(EnumC8686a.RSS_EXPANDED);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (z11 && !z10) {
                arrayList.add(new C5067i(map));
            }
            if (collection.contains(EnumC8686a.QR_CODE)) {
                arrayList.add(new C7704a());
            }
            if (collection.contains(EnumC8686a.DATA_MATRIX)) {
                arrayList.add(new C1076a());
            }
            if (collection.contains(EnumC8686a.AZTEC)) {
                arrayList.add(new C9155b());
            }
            if (collection.contains(EnumC8686a.PDF_417)) {
                arrayList.add(new C5845b());
            }
            if (collection.contains(EnumC8686a.MAXICODE)) {
                arrayList.add(new C4852a());
            }
            if (z11 && z10) {
                arrayList.add(new C5067i(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z10) {
                arrayList.add(new C5067i(map));
            }
            arrayList.add(new C7704a());
            arrayList.add(new C1076a());
            arrayList.add(new C9155b());
            arrayList.add(new C5845b());
            arrayList.add(new C4852a());
            if (z10) {
                arrayList.add(new C5067i(map));
            }
        }
        this.f40469b = (InterfaceC8697l[]) arrayList.toArray(f40467c);
    }

    @Override // td.InterfaceC8697l
    public void reset() {
        InterfaceC8697l[] interfaceC8697lArr = this.f40469b;
        if (interfaceC8697lArr != null) {
            for (InterfaceC8697l interfaceC8697l : interfaceC8697lArr) {
                interfaceC8697l.reset();
            }
        }
    }
}
