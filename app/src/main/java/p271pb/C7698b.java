package p271pb;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pb/b.class
 */
/* renamed from: pb.b */
/* loaded from: combined.jar:classes2.jar:pb/b.class */
public final class C7698b {

    /* renamed from: a */
    public final View f37437a;

    /* renamed from: b */
    public boolean f37438b = false;

    /* renamed from: c */
    public int f37439c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public C7698b(InterfaceC7697a interfaceC7697a) {
        this.f37437a = (View) interfaceC7697a;
    }

    /* renamed from: a */
    public final void m33633a() {
        ViewParent parent = this.f37437a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).m1798g(this.f37437a);
        }
    }

    /* renamed from: b */
    public int m33634b() {
        return this.f37439c;
    }

    /* renamed from: c */
    public boolean m33635c() {
        return this.f37438b;
    }

    /* renamed from: d */
    public void m33636d(Bundle bundle) {
        this.f37438b = bundle.getBoolean("expanded", false);
        this.f37439c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f37438b) {
            m33633a();
        }
    }

    /* renamed from: e */
    public Bundle m33637e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f37438b);
        bundle.putInt("expandedComponentIdHint", this.f37439c);
        return bundle;
    }

    /* renamed from: f */
    public void m33638f(int i10) {
        this.f37439c = i10;
    }
}
