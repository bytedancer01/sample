package p040cb;

import android.view.View;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cb/d.class
 */
/* renamed from: cb.d */
/* loaded from: combined.jar:classes2.jar:cb/d.class */
public class C1058d {

    /* renamed from: a */
    public final View f7059a;

    /* renamed from: b */
    public int f7060b;

    /* renamed from: c */
    public int f7061c;

    /* renamed from: d */
    public int f7062d;

    /* renamed from: e */
    public int f7063e;

    /* renamed from: f */
    public boolean f7064f = true;

    /* renamed from: g */
    public boolean f7065g = true;

    public C1058d(View view) {
        this.f7059a = view;
    }

    /* renamed from: a */
    public void m6257a() {
        View view = this.f7059a;
        C6824g0.m31509a0(view, this.f7062d - (view.getTop() - this.f7060b));
        View view2 = this.f7059a;
        C6824g0.m31507Z(view2, this.f7063e - (view2.getLeft() - this.f7061c));
    }

    /* renamed from: b */
    public int m6258b() {
        return this.f7062d;
    }

    /* renamed from: c */
    public void m6259c() {
        this.f7060b = this.f7059a.getTop();
        this.f7061c = this.f7059a.getLeft();
    }

    /* renamed from: d */
    public boolean m6260d(int i10) {
        if (!this.f7065g || this.f7063e == i10) {
            return false;
        }
        this.f7063e = i10;
        m6257a();
        return true;
    }

    /* renamed from: e */
    public boolean m6261e(int i10) {
        if (!this.f7064f || this.f7062d == i10) {
            return false;
        }
        this.f7062d = i10;
        m6257a();
        return true;
    }
}
