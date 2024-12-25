package p305ra;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p305ra.InterfaceC8096c6;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/d6.class
 */
/* renamed from: ra.d6 */
/* loaded from: combined.jar:classes2.jar:ra/d6.class */
public final class C8111d6<T extends InterfaceC8096c6<T>> {

    /* renamed from: d */
    public static final C8111d6 f38994d = new C8111d6(true);

    /* renamed from: a */
    public final C8248m8<T, Object> f38995a = new C8143f8(16);

    /* renamed from: b */
    public boolean f38996b;

    /* renamed from: c */
    public boolean f38997c;

    public C8111d6() {
    }

    public C8111d6(boolean z10) {
        m35205b();
        m35205b();
    }

    /* renamed from: a */
    public static <T extends InterfaceC8096c6<T>> C8111d6<T> m35203a() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m35204d(T r8, java.lang.Object r9) {
        /*
            r0 = r8
            ra.j9 r0 = r0.m35092k()
            r11 = r0
            r0 = r9
            java.lang.Object r0 = p305ra.C8366u6.m35902a(r0)
            ra.j9 r0 = p305ra.EnumC8204j9.zza
            r12 = r0
            ra.k9 r0 = p305ra.EnumC8219k9.INT
            r12 = r0
            r0 = r11
            ra.k9 r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto La7;
                case 1: goto L9f;
                case 2: goto L97;
                case 3: goto L8f;
                case 4: goto L87;
                case 5: goto L7f;
                case 6: goto L6e;
                case 7: goto L5d;
                case 8: goto L53;
                default: goto L50;
            }
        L50:
            goto Lb1
        L53:
            r0 = r9
            boolean r0 = r0 instanceof p305ra.InterfaceC8307q7
            if (r0 == 0) goto Lb1
            goto Lb0
        L5d:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 != 0) goto Lb0
            r0 = r9
            boolean r0 = r0 instanceof p305ra.InterfaceC8261n6
            if (r0 == 0) goto Lb1
            goto Lb0
        L6e:
            r0 = r9
            boolean r0 = r0 instanceof p305ra.AbstractC8230l5
            if (r0 != 0) goto Lb0
            r0 = r9
            boolean r0 = r0 instanceof byte[]
            if (r0 == 0) goto Lb1
            goto Lb0
        L7f:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.String
            r10 = r0
            goto Lac
        L87:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Boolean
            r10 = r0
            goto Lac
        L8f:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Double
            r10 = r0
            goto Lac
        L97:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Float
            r10 = r0
            goto Lac
        L9f:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Long
            r10 = r0
            goto Lac
        La7:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Integer
            r10 = r0
        Lac:
            r0 = r10
            if (r0 == 0) goto Lb1
        Lb0:
            return
        Lb1:
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
            ra.j9 r6 = r6.m35092k()
            ra.k9 r6 = r6.zza()
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
        throw new UnsupportedOperationException("Method not decompiled: p305ra.C8111d6.m35204d(ra.c6, java.lang.Object):void");
    }

    /* renamed from: b */
    public final void m35205b() {
        if (this.f38996b) {
            return;
        }
        this.f38995a.mo35369b();
        this.f38996b = true;
    }

    /* renamed from: c */
    public final void m35206c(T t10, Object obj) {
        if (!t10.m35093l()) {
            m35204d(t10, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                m35204d(t10, arrayList.get(i10));
            }
            obj = arrayList;
        }
        this.f38995a.put(t10, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C8111d6 c8111d6 = new C8111d6();
        for (int i10 = 0; i10 < this.f38995a.m35618d(); i10++) {
            Map.Entry<T, Object> m35619e = this.f38995a.m35619e(i10);
            c8111d6.m35206c(m35619e.getKey(), m35619e.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f38995a.m35620f()) {
            c8111d6.m35206c(entry.getKey(), entry.getValue());
        }
        c8111d6.f38997c = this.f38997c;
        return c8111d6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8111d6) {
            return this.f38995a.equals(((C8111d6) obj).f38995a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38995a.hashCode();
    }
}
