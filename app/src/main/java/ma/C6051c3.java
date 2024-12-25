package ma;

import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/c3.class
 */
/* renamed from: ma.c3 */
/* loaded from: combined.jar:classes2.jar:ma/c3.class */
public final class C6051c3 extends AbstractC6407t2 {

    /* renamed from: h */
    public static final AbstractC6407t2 f33697h = new C6051c3(null, new Object[0], 0);

    /* renamed from: e */
    public final transient Object f33698e;

    /* renamed from: f */
    public final transient Object[] f33699f;

    /* renamed from: g */
    public final transient int f33700g;

    public C6051c3(Object obj, Object[] objArr, int i10) {
        this.f33698e = obj;
        this.f33699f = objArr;
        this.f33700g = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v130, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v182, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v185 */
    /* JADX WARN: Type inference failed for: r0v187 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v91 */
    /* renamed from: i */
    public static C6051c3 m29483i(int i10, Object[] objArr, C6386s2 c6386s2) {
        if (i10 == 0) {
            return (C6051c3) f33697h;
        }
        short[] sArr = null;
        if (i10 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            Object obj2 = objArr[1];
            obj2.getClass();
            C6134g2.m29619a(obj, obj2);
            return new C6051c3(null, objArr, 1);
        }
        C6050c2.m29479b(i10, objArr.length >> 1, "index");
        int m30061t = AbstractC6428u2.m30061t(i10);
        if (i10 == 1) {
            Object obj3 = objArr[0];
            obj3.getClass();
            Object obj4 = objArr[1];
            obj4.getClass();
            C6134g2.m29619a(obj3, obj4);
        } else {
            int i11 = m30061t - 1;
            if (m30061t <= 128) {
                byte[] bArr = new byte[m30061t];
                Arrays.fill(bArr, (byte) -1);
                int i12 = 0;
                C6365r2 c6365r2 = null;
                for (int i13 = 0; i13 < i10; i13++) {
                    int i14 = i12 + i12;
                    int i15 = i13 + i13;
                    Object obj5 = objArr[i15];
                    obj5.getClass();
                    Object obj6 = objArr[i15 ^ 1];
                    obj6.getClass();
                    C6134g2.m29619a(obj5, obj6);
                    int m29771a = C6197j2.m29771a(obj5.hashCode());
                    while (true) {
                        int i16 = m29771a & i11;
                        int i17 = bArr[i16] & 255;
                        if (i17 == 255) {
                            bArr[i16] = (byte) i14;
                            if (i12 < i13) {
                                objArr[i14] = obj5;
                                objArr[i14 ^ 1] = obj6;
                            }
                            i12++;
                        } else {
                            if (obj5.equals(objArr[i17])) {
                                int i18 = i17 ^ 1;
                                Object obj7 = objArr[i18];
                                obj7.getClass();
                                c6365r2 = new C6365r2(obj5, obj6, obj7);
                                objArr[i18] = obj6;
                                break;
                            }
                            m29771a = i16 + 1;
                        }
                    }
                }
                sArr = i12 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i12), c6365r2};
            } else if (m30061t <= 32768) {
                short[] sArr2 = new short[m30061t];
                Arrays.fill(sArr2, (short) -1);
                int i19 = 0;
                C6365r2 c6365r22 = null;
                for (int i20 = 0; i20 < i10; i20++) {
                    int i21 = i19 + i19;
                    int i22 = i20 + i20;
                    Object obj8 = objArr[i22];
                    obj8.getClass();
                    Object obj9 = objArr[i22 ^ 1];
                    obj9.getClass();
                    C6134g2.m29619a(obj8, obj9);
                    int m29771a2 = C6197j2.m29771a(obj8.hashCode());
                    while (true) {
                        int i23 = m29771a2 & i11;
                        char c10 = (char) sArr2[i23];
                        if (c10 == 65535) {
                            sArr2[i23] = (short) i21;
                            if (i19 < i20) {
                                objArr[i21] = obj8;
                                objArr[i21 ^ 1] = obj9;
                            }
                            i19++;
                        } else {
                            if (obj8.equals(objArr[c10])) {
                                int i24 = c10 ^ 1;
                                Object obj10 = objArr[i24];
                                obj10.getClass();
                                c6365r22 = new C6365r2(obj8, obj9, obj10);
                                objArr[i24] = obj9;
                                break;
                            }
                            m29771a2 = i23 + 1;
                        }
                    }
                }
                sArr = i19 == i10 ? sArr2 : new Object[]{sArr2, Integer.valueOf(i19), c6365r22};
            } else {
                ?? r02 = new int[m30061t];
                Arrays.fill((int[]) r02, -1);
                int i25 = 0;
                C6365r2 c6365r23 = null;
                for (int i26 = 0; i26 < i10; i26++) {
                    int i27 = i25 + i25;
                    int i28 = i26 + i26;
                    Object obj11 = objArr[i28];
                    obj11.getClass();
                    Object obj12 = objArr[i28 ^ 1];
                    obj12.getClass();
                    C6134g2.m29619a(obj11, obj12);
                    int m29771a3 = C6197j2.m29771a(obj11.hashCode());
                    while (true) {
                        int i29 = m29771a3 & i11;
                        ?? r03 = r02[i29];
                        if (r03 == -1) {
                            r02[i29] = i27;
                            if (i25 < i26) {
                                objArr[i27] = obj11;
                                objArr[i27 ^ 1] = obj12;
                            }
                            i25++;
                        } else {
                            if (obj11.equals(objArr[r03])) {
                                int i30 = r03 ^ 1;
                                Object obj13 = objArr[i30];
                                obj13.getClass();
                                c6365r23 = new C6365r2(obj11, obj12, obj13);
                                objArr[i30] = obj12;
                                break;
                            }
                            m29771a3 = i29 + 1;
                        }
                    }
                }
                sArr = i25 == i10 ? r02 : new Object[]{r02, Integer.valueOf(i25), c6365r23};
            }
        }
        int i31 = i10;
        Object[] objArr2 = objArr;
        short[] sArr3 = sArr;
        if (sArr instanceof Object[]) {
            ?? r04 = (Object[]) sArr;
            c6386s2.f34009c = (C6365r2) r04[2];
            sArr3 = r04[0];
            i31 = ((Integer) r04[1]).intValue();
            objArr2 = Arrays.copyOf(objArr, i31 + i31);
        }
        return new C6051c3(sArr3, objArr2, i31);
    }

    @Override // ma.AbstractC6407t2
    /* renamed from: b */
    public final AbstractC6260m2 mo29484b() {
        return new C6030b3(this.f33699f, 1, this.f33700g);
    }

    @Override // ma.AbstractC6407t2
    /* renamed from: f */
    public final AbstractC6428u2 mo29485f() {
        return new C6528z2(this, this.f33699f, 0, this.f33700g);
    }

    @Override // ma.AbstractC6407t2
    /* renamed from: g */
    public final AbstractC6428u2 mo29486g() {
        return new C6009a3(this, new C6030b3(this.f33699f, 0, this.f33700g));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x012d  */
    @Override // ma.AbstractC6407t2, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r5) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.C6051c3.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f33700g;
    }
}
