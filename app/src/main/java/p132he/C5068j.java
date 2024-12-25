package p132he;

import java.util.Collection;
import java.util.Map;
import p444zd.C10193a;
import td.AbstractC8698m;
import td.C8695j;
import td.C8699n;
import td.EnumC8686a;
import td.EnumC8690e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:he/j.class
 */
/* renamed from: he.j */
/* loaded from: combined.jar:classes2.jar:he/j.class */
public final class C5068j extends AbstractC5069k {

    /* renamed from: b */
    public static final AbstractC5074p[] f29169b = new AbstractC5074p[0];

    /* renamed from: a */
    public final AbstractC5074p[] f29170a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Type inference failed for: r0v31, types: [he.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C5068j(java.util.Map<td.EnumC8690e, ?> r5) {
        /*
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r5
            if (r0 != 0) goto Ld
            r0 = 0
            r5 = r0
            goto L1a
        Ld:
            r0 = r5
            td.e r1 = td.EnumC8690e.POSSIBLE_FORMATS
            java.lang.Object r0 = r0.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            r5 = r0
        L1a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r5
            if (r0 == 0) goto L90
            r0 = r5
            td.a r1 = td.EnumC8686a.EAN_13
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L45
            he.e r0 = new he.e
            r1 = r0
            r1.<init>()
            r6 = r0
        L3a:
            r0 = r7
            r1 = r6
            boolean r0 = r0.add(r1)
            goto L5c
        L45:
            r0 = r5
            td.a r1 = td.EnumC8686a.UPC_A
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L5c
            he.l r0 = new he.l
            r1 = r0
            r1.<init>()
            r6 = r0
            goto L3a
        L5c:
            r0 = r5
            td.a r1 = td.EnumC8686a.EAN_8
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L76
            r0 = r7
            he.f r1 = new he.f
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
        L76:
            r0 = r5
            td.a r1 = td.EnumC8686a.UPC_E
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L90
            r0 = r7
            he.q r1 = new he.q
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
        L90:
            r0 = r7
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc3
            r0 = r7
            he.e r1 = new he.e
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            r0 = r7
            he.f r1 = new he.f
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
            r0 = r7
            he.q r1 = new he.q
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
        Lc3:
            r0 = r4
            r1 = r7
            he.p[] r2 = p132he.C5068j.f29169b
            java.lang.Object[] r1 = r1.toArray(r2)
            he.p[] r1 = (p132he.AbstractC5074p[]) r1
            r0.f29170a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p132he.C5068j.<init>(java.util.Map):void");
    }

    @Override // p132he.AbstractC5069k
    /* renamed from: c */
    public C8699n mo25297c(int i10, C10193a c10193a, Map<EnumC8690e, ?> map) {
        boolean z10;
        int[] m25348p = AbstractC5074p.m25348p(c10193a);
        for (AbstractC5074p abstractC5074p : this.f29170a) {
            try {
                C8699n mo25333m = abstractC5074p.mo25333m(i10, c10193a, m25348p, map);
                boolean z11 = mo25333m.m37212b() == EnumC8686a.EAN_13 && mo25333m.m37216f().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(EnumC8690e.POSSIBLE_FORMATS);
                if (collection != null && !collection.contains(EnumC8686a.UPC_A)) {
                    z10 = false;
                    if (z11 || !z10) {
                        return mo25333m;
                    }
                    C8699n c8699n = new C8699n(mo25333m.m37216f().substring(1), mo25333m.m37213c(), mo25333m.m37215e(), EnumC8686a.UPC_A);
                    c8699n.m37217g(mo25333m.m37214d());
                    return c8699n;
                }
                z10 = true;
                if (z11) {
                }
                return mo25333m;
            } catch (AbstractC8698m e10) {
            }
        }
        throw C8695j.m37209a();
    }

    @Override // p132he.AbstractC5069k, td.InterfaceC8697l
    public void reset() {
        for (AbstractC5074p abstractC5074p : this.f29170a) {
            abstractC5074p.reset();
        }
    }
}
