package p059d9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import p059d9.C4377n0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/n0.class
 */
/* renamed from: d9.n0 */
/* loaded from: combined.jar:classes2.jar:d9/n0.class */
public class C4377n0 {

    /* renamed from: h */
    public static final Comparator<b> f26609h = new Comparator() { // from class: d9.l0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m22163g;
            m22163g = C4377n0.m22163g((C4377n0.b) obj, (C4377n0.b) obj2);
            return m22163g;
        }
    };

    /* renamed from: i */
    public static final Comparator<b> f26610i = new Comparator() { // from class: d9.m0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m22164h;
            m22164h = C4377n0.m22164h((C4377n0.b) obj, (C4377n0.b) obj2);
            return m22164h;
        }
    };

    /* renamed from: a */
    public final int f26611a;

    /* renamed from: e */
    public int f26615e;

    /* renamed from: f */
    public int f26616f;

    /* renamed from: g */
    public int f26617g;

    /* renamed from: c */
    public final b[] f26613c = new b[5];

    /* renamed from: b */
    public final ArrayList<b> f26612b = new ArrayList<>();

    /* renamed from: d */
    public int f26614d = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:d9/n0$b.class
     */
    /* renamed from: d9.n0$b */
    /* loaded from: combined.jar:classes2.jar:d9/n0$b.class */
    public static class b {

        /* renamed from: a */
        public int f26618a;

        /* renamed from: b */
        public int f26619b;

        /* renamed from: c */
        public float f26620c;

        public b() {
        }
    }

    public C4377n0(int i10) {
        this.f26611a = i10;
    }

    /* renamed from: g */
    public static /* synthetic */ int m22163g(b bVar, b bVar2) {
        return bVar.f26618a - bVar2.f26618a;
    }

    /* renamed from: h */
    public static /* synthetic */ int m22164h(b bVar, b bVar2) {
        return Float.compare(bVar.f26620c, bVar2.f26620c);
    }

    /* renamed from: c */
    public void m22165c(int i10, float f10) {
        b bVar;
        int i11;
        b bVar2;
        int i12;
        m22166d();
        int i13 = this.f26617g;
        if (i13 > 0) {
            b[] bVarArr = this.f26613c;
            int i14 = i13 - 1;
            this.f26617g = i14;
            bVar = bVarArr[i14];
        } else {
            bVar = new b();
        }
        int i15 = this.f26615e;
        this.f26615e = i15 + 1;
        bVar.f26618a = i15;
        bVar.f26619b = i10;
        bVar.f26620c = f10;
        this.f26612b.add(bVar);
        int i16 = this.f26616f + i10;
        while (true) {
            this.f26616f = i16;
            while (true) {
                int i17 = this.f26616f;
                int i18 = this.f26611a;
                if (i17 <= i18) {
                    return;
                }
                i11 = i17 - i18;
                bVar2 = this.f26612b.get(0);
                i12 = bVar2.f26619b;
                if (i12 <= i11) {
                    this.f26616f -= i12;
                    this.f26612b.remove(0);
                    int i19 = this.f26617g;
                    if (i19 < 5) {
                        b[] bVarArr2 = this.f26613c;
                        this.f26617g = i19 + 1;
                        bVarArr2[i19] = bVar2;
                    }
                }
            }
            bVar2.f26619b = i12 - i11;
            i16 = this.f26616f - i11;
        }
    }

    /* renamed from: d */
    public final void m22166d() {
        if (this.f26614d != 1) {
            Collections.sort(this.f26612b, f26609h);
            this.f26614d = 1;
        }
    }

    /* renamed from: e */
    public final void m22167e() {
        if (this.f26614d != 0) {
            Collections.sort(this.f26612b, f26610i);
            this.f26614d = 0;
        }
    }

    /* renamed from: f */
    public float m22168f(float f10) {
        float f11;
        m22167e();
        float f12 = this.f26616f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f26612b.size(); i11++) {
            b bVar = this.f26612b.get(i11);
            i10 += bVar.f26619b;
            if (i10 >= f10 * f12) {
                return bVar.f26620c;
            }
        }
        if (this.f26612b.isEmpty()) {
            f11 = Float.NaN;
        } else {
            ArrayList<b> arrayList = this.f26612b;
            f11 = arrayList.get(arrayList.size() - 1).f26620c;
        }
        return f11;
    }

    /* renamed from: i */
    public void m22169i() {
        this.f26612b.clear();
        this.f26614d = -1;
        this.f26615e = 0;
        this.f26616f = 0;
    }
}
