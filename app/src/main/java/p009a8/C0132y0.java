package p009a8;

import android.util.SparseArray;
import p059d9.C4349a;
import p059d9.InterfaceC4362g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/y0.class
 */
/* renamed from: a8.y0 */
/* loaded from: combined.jar:classes2.jar:a8/y0.class */
public final class C0132y0<V> {

    /* renamed from: c */
    public final InterfaceC4362g<V> f611c;

    /* renamed from: b */
    public final SparseArray<V> f610b = new SparseArray<>();

    /* renamed from: a */
    public int f609a = -1;

    public C0132y0(InterfaceC4362g<V> interfaceC4362g) {
        this.f611c = interfaceC4362g;
    }

    /* renamed from: a */
    public void m653a(int i10, V v10) {
        if (this.f609a == -1) {
            C4349a.m21884g(this.f610b.size() == 0);
            this.f609a = 0;
        }
        if (this.f610b.size() > 0) {
            SparseArray<V> sparseArray = this.f610b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            boolean z10 = false;
            if (i10 >= keyAt) {
                z10 = true;
            }
            C4349a.m21878a(z10);
            if (keyAt == i10) {
                InterfaceC4362g<V> interfaceC4362g = this.f611c;
                SparseArray<V> sparseArray2 = this.f610b;
                interfaceC4362g.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f610b.append(i10, v10);
    }

    /* renamed from: b */
    public void m654b() {
        for (int i10 = 0; i10 < this.f610b.size(); i10++) {
            this.f611c.accept(this.f610b.valueAt(i10));
        }
        this.f609a = -1;
        this.f610b.clear();
    }

    /* renamed from: c */
    public void m655c(int i10) {
        for (int size = this.f610b.size() - 1; size >= 0 && i10 < this.f610b.keyAt(size); size--) {
            this.f611c.accept(this.f610b.valueAt(size));
            this.f610b.removeAt(size);
        }
        this.f609a = this.f610b.size() > 0 ? Math.min(this.f609a, this.f610b.size() - 1) : -1;
    }

    /* renamed from: d */
    public void m656d(int i10) {
        int i11 = 0;
        while (true) {
            int i12 = i11;
            if (i12 >= this.f610b.size() - 1) {
                return;
            }
            int i13 = i12 + 1;
            if (i10 < this.f610b.keyAt(i13)) {
                return;
            }
            this.f611c.accept(this.f610b.valueAt(i12));
            this.f610b.removeAt(i12);
            int i14 = this.f609a;
            if (i14 > 0) {
                this.f609a = i14 - 1;
            }
            i11 = i13;
        }
    }

    /* renamed from: e */
    public V m657e(int i10) {
        if (this.f609a == -1) {
            this.f609a = 0;
        }
        while (true) {
            int i11 = this.f609a;
            if (i11 <= 0 || i10 >= this.f610b.keyAt(i11)) {
                break;
            }
            this.f609a--;
        }
        while (this.f609a < this.f610b.size() - 1 && i10 >= this.f610b.keyAt(this.f609a + 1)) {
            this.f609a++;
        }
        return this.f610b.valueAt(this.f609a);
    }

    /* renamed from: f */
    public V m658f() {
        SparseArray<V> sparseArray = this.f610b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    /* renamed from: g */
    public boolean m659g() {
        return this.f610b.size() == 0;
    }
}
