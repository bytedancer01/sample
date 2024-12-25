package ma;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ig.class
 */
/* renamed from: ma.ig */
/* loaded from: combined.jar:classes2.jar:ma/ig.class */
public final class C6190ig {

    /* renamed from: d */
    public static final C6190ig f33819d = new C6190ig(true);

    /* renamed from: a */
    public final C6423ti f33820a = new C6213ji(16);

    /* renamed from: b */
    public boolean f33821b;

    /* renamed from: c */
    public boolean f33822c;

    public C6190ig() {
    }

    public C6190ig(boolean z10) {
        m29681b();
        m29681b();
    }

    /* renamed from: a */
    public static C6190ig m29679a() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m29680d(ma.InterfaceC6169hg r8, java.lang.Object r9) {
        /*
            r0 = r8
            ma.nj r0 = r0.m29663k()
            r11 = r0
            java.nio.charset.Charset r0 = ma.C6482wg.f34130a
            r12 = r0
            r0 = r9
            java.lang.Class r0 = r0.getClass()
            ma.nj r0 = ma.EnumC6298nj.zza
            r12 = r0
            ma.oj r0 = ma.EnumC6319oj.INT
            r12 = r0
            r0 = r11
            ma.oj r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto Lab;
                case 1: goto La3;
                case 2: goto L9b;
                case 3: goto L93;
                case 4: goto L8b;
                case 5: goto L83;
                case 6: goto L72;
                case 7: goto L61;
                case 8: goto L57;
                default: goto L54;
            }
        L54:
            goto Lb5
        L57:
            r0 = r9
            boolean r0 = r0 instanceof ma.InterfaceC6443uh
            if (r0 == 0) goto Lb5
            goto Lb4
        L61:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 != 0) goto Lb4
            r0 = r9
            boolean r0 = r0 instanceof ma.InterfaceC6337pg
            if (r0 == 0) goto Lb5
            goto Lb4
        L72:
            r0 = r9
            boolean r0 = r0 instanceof ma.AbstractC6399sf
            if (r0 != 0) goto Lb4
            r0 = r9
            boolean r0 = r0 instanceof byte[]
            if (r0 == 0) goto Lb5
            goto Lb4
        L83:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.String
            r10 = r0
            goto Lb0
        L8b:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Boolean
            r10 = r0
            goto Lb0
        L93:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Double
            r10 = r0
            goto Lb0
        L9b:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Float
            r10 = r0
            goto Lb0
        La3:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Long
            r10 = r0
            goto Lb0
        Lab:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Integer
            r10 = r0
        Lb0:
            r0 = r10
            if (r0 == 0) goto Lb5
        Lb4:
            return
        Lb5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r8
            int r6 = r6.zza()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r8
            ma.nj r6 = r6.m29663k()
            ma.oj r6 = r6.zza()
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = r9
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.C6190ig.m29680d(ma.hg, java.lang.Object):void");
    }

    /* renamed from: b */
    public final void m29681b() {
        if (this.f33821b) {
            return;
        }
        for (int i10 = 0; i10 < this.f33820a.m30049c(); i10++) {
            Map.Entry m30052h = this.f33820a.m30052h(i10);
            if (m30052h.getValue() instanceof AbstractC6295ng) {
                ((AbstractC6295ng) m30052h.getValue()).m29908f();
            }
        }
        this.f33820a.mo29788b();
        this.f33821b = true;
    }

    /* renamed from: c */
    public final void m29682c(InterfaceC6169hg interfaceC6169hg, Object obj) {
        if (!interfaceC6169hg.m29664l()) {
            m29680d(interfaceC6169hg, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                m29680d(interfaceC6169hg, arrayList.get(i10));
            }
            obj = arrayList;
        }
        this.f33820a.put(interfaceC6169hg, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C6190ig c6190ig = new C6190ig();
        for (int i10 = 0; i10 < this.f33820a.m30049c(); i10++) {
            Map.Entry m30052h = this.f33820a.m30052h(i10);
            c6190ig.m29682c((InterfaceC6169hg) m30052h.getKey(), m30052h.getValue());
        }
        for (Map.Entry entry : this.f33820a.m30050d()) {
            c6190ig.m29682c((InterfaceC6169hg) entry.getKey(), entry.getValue());
        }
        c6190ig.f33822c = this.f33822c;
        return c6190ig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6190ig) {
            return this.f33820a.equals(((C6190ig) obj).f33820a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33820a.hashCode();
    }
}
