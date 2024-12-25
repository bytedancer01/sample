package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.InterfaceC0254i;
import p029c.C0923d;
import p155j.AbstractC5272d;
import p235o0.C6820f;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/view/menu/h.class
 */
/* renamed from: androidx.appcompat.view.menu.h */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/h.class */
public class C0253h {

    /* renamed from: a */
    public final Context f1643a;

    /* renamed from: b */
    public final C0250e f1644b;

    /* renamed from: c */
    public final boolean f1645c;

    /* renamed from: d */
    public final int f1646d;

    /* renamed from: e */
    public final int f1647e;

    /* renamed from: f */
    public View f1648f;

    /* renamed from: g */
    public int f1649g;

    /* renamed from: h */
    public boolean f1650h;

    /* renamed from: i */
    public InterfaceC0254i.a f1651i;

    /* renamed from: j */
    public AbstractC5272d f1652j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f1653k;

    /* renamed from: l */
    public final PopupWindow.OnDismissListener f1654l;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/view/menu/h$a.class
     */
    /* renamed from: androidx.appcompat.view.menu.h$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/h$a.class */
    public class a implements PopupWindow.OnDismissListener {

        /* renamed from: b */
        public final C0253h f1655b;

        public a(C0253h c0253h) {
            this.f1655b = c0253h;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            this.f1655b.mo1041e();
        }
    }

    public C0253h(Context context, C0250e c0250e, View view, boolean z10, int i10) {
        this(context, c0250e, view, z10, i10, 0);
    }

    public C0253h(Context context, C0250e c0250e, View view, boolean z10, int i10, int i11) {
        this.f1649g = 8388611;
        this.f1654l = new a(this);
        this.f1643a = context;
        this.f1644b = c0250e;
        this.f1648f = view;
        this.f1645c = z10;
        this.f1646d = i10;
        this.f1647e = i11;
    }

    /* renamed from: a */
    public final AbstractC5272d m1037a() {
        Display defaultDisplay = ((WindowManager) this.f1643a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        AbstractC5272d viewOnKeyListenerC0247b = Math.min(point.x, point.y) >= this.f1643a.getResources().getDimensionPixelSize(C0923d.f6143c) ? new ViewOnKeyListenerC0247b(this.f1643a, this.f1648f, this.f1646d, this.f1647e, this.f1645c) : new ViewOnKeyListenerC0256k(this.f1643a, this.f1644b, this.f1648f, this.f1646d, this.f1647e, this.f1645c);
        viewOnKeyListenerC0247b.mo924j(this.f1644b);
        viewOnKeyListenerC0247b.mo931t(this.f1654l);
        viewOnKeyListenerC0247b.mo926n(this.f1648f);
        viewOnKeyListenerC0247b.mo904d(this.f1651i);
        viewOnKeyListenerC0247b.mo928q(this.f1650h);
        viewOnKeyListenerC0247b.mo929r(this.f1649g);
        return viewOnKeyListenerC0247b;
    }

    /* renamed from: b */
    public void m1038b() {
        if (m1040d()) {
            this.f1652j.dismiss();
        }
    }

    /* renamed from: c */
    public AbstractC5272d m1039c() {
        if (this.f1652j == null) {
            this.f1652j = m1037a();
        }
        return this.f1652j;
    }

    /* renamed from: d */
    public boolean m1040d() {
        AbstractC5272d abstractC5272d = this.f1652j;
        return abstractC5272d != null && abstractC5272d.mo922a();
    }

    /* renamed from: e */
    public void mo1041e() {
        this.f1652j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1653k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void m1042f(View view) {
        this.f1648f = view;
    }

    /* renamed from: g */
    public void m1043g(boolean z10) {
        this.f1650h = z10;
        AbstractC5272d abstractC5272d = this.f1652j;
        if (abstractC5272d != null) {
            abstractC5272d.mo928q(z10);
        }
    }

    /* renamed from: h */
    public void m1044h(int i10) {
        this.f1649g = i10;
    }

    /* renamed from: i */
    public void m1045i(PopupWindow.OnDismissListener onDismissListener) {
        this.f1653k = onDismissListener;
    }

    /* renamed from: j */
    public void m1046j(InterfaceC0254i.a aVar) {
        this.f1651i = aVar;
        AbstractC5272d abstractC5272d = this.f1652j;
        if (abstractC5272d != null) {
            abstractC5272d.mo904d(aVar);
        }
    }

    /* renamed from: k */
    public void m1047k() {
        if (!m1049m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: l */
    public final void m1048l(int i10, int i11, boolean z10, boolean z11) {
        AbstractC5272d m1039c = m1039c();
        m1039c.mo932u(z11);
        if (z10) {
            int i12 = i10;
            if ((C6820f.m31460b(this.f1649g, C6824g0.m31473C(this.f1648f)) & 7) == 5) {
                i12 = i10 - this.f1648f.getWidth();
            }
            m1039c.mo930s(i12);
            m1039c.mo933v(i11);
            int i13 = (int) ((this.f1643a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m1039c.m26352p(new Rect(i12 - i13, i11 - i13, i12 + i13, i11 + i13));
        }
        m1039c.show();
    }

    /* renamed from: m */
    public boolean m1049m() {
        if (m1040d()) {
            return true;
        }
        if (this.f1648f == null) {
            return false;
        }
        m1048l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean m1050n(int i10, int i11) {
        if (m1040d()) {
            return true;
        }
        if (this.f1648f == null) {
            return false;
        }
        m1048l(i10, i11, true, true);
        return true;
    }
}
