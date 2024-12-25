package p235o0;

import android.view.View;
import android.view.ViewGroup;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o0/v.class
 */
/* renamed from: o0.v */
/* loaded from: combined.jar:classes1.jar:o0/v.class */
public class C6857v {

    /* renamed from: a */
    public int f35575a;

    /* renamed from: b */
    public int f35576b;

    public C6857v(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int m31653a() {
        return this.f35575a | this.f35576b;
    }

    /* renamed from: b */
    public void m31654b(View view, View view2, int i10) {
        m31655c(view, view2, i10, 0);
    }

    /* renamed from: c */
    public void m31655c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f35576b = i10;
        } else {
            this.f35575a = i10;
        }
    }

    /* renamed from: d */
    public void m31656d(View view, int i10) {
        if (i10 == 1) {
            this.f35576b = 0;
        } else {
            this.f35575a = 0;
        }
    }
}
