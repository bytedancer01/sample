package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0254i;
import androidx.appcompat.widget.C0301b1;
import p029c.C0923d;
import p029c.C0926g;
import p155j.AbstractC5272d;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/view/menu/k.class
 */
/* renamed from: androidx.appcompat.view.menu.k */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/k.class */
public final class ViewOnKeyListenerC0256k extends AbstractC5272d implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: w */
    public static final int f1656w = C0926g.f6255m;

    /* renamed from: c */
    public final Context f1657c;

    /* renamed from: d */
    public final C0250e f1658d;

    /* renamed from: e */
    public final C0249d f1659e;

    /* renamed from: f */
    public final boolean f1660f;

    /* renamed from: g */
    public final int f1661g;

    /* renamed from: h */
    public final int f1662h;

    /* renamed from: i */
    public final int f1663i;

    /* renamed from: j */
    public final C0301b1 f1664j;

    /* renamed from: m */
    public PopupWindow.OnDismissListener f1667m;

    /* renamed from: n */
    public View f1668n;

    /* renamed from: o */
    public View f1669o;

    /* renamed from: p */
    public InterfaceC0254i.a f1670p;

    /* renamed from: q */
    public ViewTreeObserver f1671q;

    /* renamed from: r */
    public boolean f1672r;

    /* renamed from: s */
    public boolean f1673s;

    /* renamed from: t */
    public int f1674t;

    /* renamed from: v */
    public boolean f1676v;

    /* renamed from: k */
    public final ViewTreeObserver.OnGlobalLayoutListener f1665k = new a(this);

    /* renamed from: l */
    public final View.OnAttachStateChangeListener f1666l = new b(this);

    /* renamed from: u */
    public int f1675u = 0;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/view/menu/k$a.class
     */
    /* renamed from: androidx.appcompat.view.menu.k$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/k$a.class */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b */
        public final ViewOnKeyListenerC0256k f1677b;

        public a(ViewOnKeyListenerC0256k viewOnKeyListenerC0256k) {
            this.f1677b = viewOnKeyListenerC0256k;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!this.f1677b.mo922a() || this.f1677b.f1664j.m1646A()) {
                return;
            }
            View view = this.f1677b.f1669o;
            if (view == null || !view.isShown()) {
                this.f1677b.dismiss();
            } else {
                this.f1677b.f1664j.show();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/view/menu/k$b.class
     */
    /* renamed from: androidx.appcompat.view.menu.k$b */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/k$b.class */
    public class b implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final ViewOnKeyListenerC0256k f1678b;

        public b(ViewOnKeyListenerC0256k viewOnKeyListenerC0256k) {
            this.f1678b = viewOnKeyListenerC0256k;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = this.f1678b.f1671q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    this.f1678b.f1671q = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0256k viewOnKeyListenerC0256k = this.f1678b;
                viewOnKeyListenerC0256k.f1671q.removeGlobalOnLayoutListener(viewOnKeyListenerC0256k.f1665k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerC0256k(Context context, C0250e c0250e, View view, int i10, int i11, boolean z10) {
        this.f1657c = context;
        this.f1658d = c0250e;
        this.f1660f = z10;
        this.f1659e = new C0249d(c0250e, LayoutInflater.from(context), z10, f1656w);
        this.f1662h = i10;
        this.f1663i = i11;
        Resources resources = context.getResources();
        this.f1661g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0923d.f6144d));
        this.f1668n = view;
        this.f1664j = new C0301b1(context, null, i10, i11);
        c0250e.m978c(this, context);
    }

    @Override // p155j.InterfaceC5274f
    /* renamed from: a */
    public boolean mo922a() {
        return !this.f1672r && this.f1664j.mo922a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: b */
    public void mo902b(C0250e c0250e, boolean z10) {
        if (c0250e != this.f1658d) {
            return;
        }
        dismiss();
        InterfaceC0254i.a aVar = this.f1670p;
        if (aVar != null) {
            aVar.mo1006b(c0250e, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: d */
    public void mo904d(InterfaceC0254i.a aVar) {
        this.f1670p = aVar;
    }

    @Override // p155j.InterfaceC5274f
    public void dismiss() {
        if (mo922a()) {
            this.f1664j.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: e */
    public boolean mo905e(SubMenuC0257l subMenuC0257l) {
        if (!subMenuC0257l.hasVisibleItems()) {
            return false;
        }
        C0253h c0253h = new C0253h(this.f1657c, subMenuC0257l, this.f1669o, this.f1660f, this.f1662h, this.f1663i);
        c0253h.m1046j(this.f1670p);
        c0253h.m1043g(AbstractC5272d.m26349w(subMenuC0257l));
        c0253h.m1045i(this.f1667m);
        this.f1667m = null;
        this.f1658d.m982e(false);
        int m1663c = this.f1664j.m1663c();
        int m1667l = this.f1664j.m1667l();
        int i10 = m1663c;
        if ((Gravity.getAbsoluteGravity(this.f1675u, C6824g0.m31473C(this.f1668n)) & 7) == 5) {
            i10 = m1663c + this.f1668n.getWidth();
        }
        if (!c0253h.m1050n(i10, m1667l)) {
            return false;
        }
        InterfaceC0254i.a aVar = this.f1670p;
        if (aVar == null) {
            return true;
        }
        aVar.mo1007c(subMenuC0257l);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: f */
    public void mo906f(boolean z10) {
        this.f1673s = false;
        C0249d c0249d = this.f1659e;
        if (c0249d != null) {
            c0249d.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: g */
    public boolean mo923g() {
        return false;
    }

    @Override // p155j.AbstractC5272d
    /* renamed from: j */
    public void mo924j(C0250e c0250e) {
    }

    @Override // p155j.AbstractC5272d
    /* renamed from: n */
    public void mo926n(View view) {
        this.f1668n = view;
    }

    @Override // p155j.InterfaceC5274f
    /* renamed from: o */
    public ListView mo927o() {
        return this.f1664j.mo927o();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1672r = true;
        this.f1658d.close();
        ViewTreeObserver viewTreeObserver = this.f1671q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1671q = this.f1669o.getViewTreeObserver();
            }
            this.f1671q.removeGlobalOnLayoutListener(this.f1665k);
            this.f1671q = null;
        }
        this.f1669o.removeOnAttachStateChangeListener(this.f1666l);
        PopupWindow.OnDismissListener onDismissListener = this.f1667m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p155j.AbstractC5272d
    /* renamed from: q */
    public void mo928q(boolean z10) {
        this.f1659e.m946d(z10);
    }

    @Override // p155j.AbstractC5272d
    /* renamed from: r */
    public void mo929r(int i10) {
        this.f1675u = i10;
    }

    @Override // p155j.AbstractC5272d
    /* renamed from: s */
    public void mo930s(int i10) {
        this.f1664j.m1664e(i10);
    }

    @Override // p155j.InterfaceC5274f
    public void show() {
        if (!m1051y()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // p155j.AbstractC5272d
    /* renamed from: t */
    public void mo931t(PopupWindow.OnDismissListener onDismissListener) {
        this.f1667m = onDismissListener;
    }

    @Override // p155j.AbstractC5272d
    /* renamed from: u */
    public void mo932u(boolean z10) {
        this.f1676v = z10;
    }

    @Override // p155j.AbstractC5272d
    /* renamed from: v */
    public void mo933v(int i10) {
        this.f1664j.m1666i(i10);
    }

    /* renamed from: y */
    public final boolean m1051y() {
        View view;
        if (mo922a()) {
            return true;
        }
        if (this.f1672r || (view = this.f1668n) == null) {
            return false;
        }
        this.f1669o = view;
        this.f1664j.m1655J(this);
        this.f1664j.m1656K(this);
        this.f1664j.m1654I(true);
        View view2 = this.f1669o;
        boolean z10 = this.f1671q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1671q = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1665k);
        }
        view2.addOnAttachStateChangeListener(this.f1666l);
        this.f1664j.m1648C(view2);
        this.f1664j.m1651F(this.f1675u);
        if (!this.f1673s) {
            this.f1674t = AbstractC5272d.m26348m(this.f1659e, null, this.f1657c, this.f1661g);
            this.f1673s = true;
        }
        this.f1664j.m1650E(this.f1674t);
        this.f1664j.m1653H(2);
        this.f1664j.m1652G(m26351l());
        this.f1664j.show();
        ListView mo927o = this.f1664j.mo927o();
        mo927o.setOnKeyListener(this);
        if (this.f1676v && this.f1658d.m1000x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1657c).inflate(C0926g.f6254l, (ViewGroup) mo927o, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f1658d.m1000x());
            }
            frameLayout.setEnabled(false);
            mo927o.addHeaderView(frameLayout, null, false);
        }
        this.f1664j.mo1636m(this.f1659e);
        this.f1664j.show();
        return true;
    }
}
