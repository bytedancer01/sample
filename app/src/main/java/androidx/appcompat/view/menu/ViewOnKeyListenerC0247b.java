package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0254i;
import androidx.appcompat.widget.C0301b1;
import androidx.appcompat.widget.InterfaceC0365x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p029c.C0923d;
import p029c.C0926g;
import p155j.AbstractC5272d;
import p235o0.C6820f;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/view/menu/b.class
 */
/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/b.class */
public final class ViewOnKeyListenerC0247b extends AbstractC5272d implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: C */
    public static final int f1526C = C0926g.f6247e;

    /* renamed from: A */
    public PopupWindow.OnDismissListener f1527A;

    /* renamed from: B */
    public boolean f1528B;

    /* renamed from: c */
    public final Context f1529c;

    /* renamed from: d */
    public final int f1530d;

    /* renamed from: e */
    public final int f1531e;

    /* renamed from: f */
    public final int f1532f;

    /* renamed from: g */
    public final boolean f1533g;

    /* renamed from: h */
    public final Handler f1534h;

    /* renamed from: p */
    public View f1542p;

    /* renamed from: q */
    public View f1543q;

    /* renamed from: s */
    public boolean f1545s;

    /* renamed from: t */
    public boolean f1546t;

    /* renamed from: u */
    public int f1547u;

    /* renamed from: v */
    public int f1548v;

    /* renamed from: x */
    public boolean f1550x;

    /* renamed from: y */
    public InterfaceC0254i.a f1551y;

    /* renamed from: z */
    public ViewTreeObserver f1552z;

    /* renamed from: i */
    public final List<C0250e> f1535i = new ArrayList();

    /* renamed from: j */
    public final List<d> f1536j = new ArrayList();

    /* renamed from: k */
    public final ViewTreeObserver.OnGlobalLayoutListener f1537k = new a(this);

    /* renamed from: l */
    public final View.OnAttachStateChangeListener f1538l = new b(this);

    /* renamed from: m */
    public final InterfaceC0365x0 f1539m = new c(this);

    /* renamed from: n */
    public int f1540n = 0;

    /* renamed from: o */
    public int f1541o = 0;

    /* renamed from: w */
    public boolean f1549w = false;

    /* renamed from: r */
    public int f1544r = m919C();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/view/menu/b$a.class
     */
    /* renamed from: androidx.appcompat.view.menu.b$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/b$a.class */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b */
        public final ViewOnKeyListenerC0247b f1553b;

        public a(ViewOnKeyListenerC0247b viewOnKeyListenerC0247b) {
            this.f1553b = viewOnKeyListenerC0247b;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!this.f1553b.mo922a() || this.f1553b.f1536j.size() <= 0 || this.f1553b.f1536j.get(0).f1560a.m1646A()) {
                return;
            }
            View view = this.f1553b.f1543q;
            if (view == null || !view.isShown()) {
                this.f1553b.dismiss();
                return;
            }
            Iterator<d> it = this.f1553b.f1536j.iterator();
            while (it.hasNext()) {
                it.next().f1560a.show();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/view/menu/b$b.class
     */
    /* renamed from: androidx.appcompat.view.menu.b$b */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/b$b.class */
    public class b implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final ViewOnKeyListenerC0247b f1554b;

        public b(ViewOnKeyListenerC0247b viewOnKeyListenerC0247b) {
            this.f1554b = viewOnKeyListenerC0247b;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = this.f1554b.f1552z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    this.f1554b.f1552z = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0247b viewOnKeyListenerC0247b = this.f1554b;
                viewOnKeyListenerC0247b.f1552z.removeGlobalOnLayoutListener(viewOnKeyListenerC0247b.f1537k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/view/menu/b$c.class
     */
    /* renamed from: androidx.appcompat.view.menu.b$c */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/b$c.class */
    public class c implements InterfaceC0365x0 {

        /* renamed from: b */
        public final ViewOnKeyListenerC0247b f1555b;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/appcompat/view/menu/b$c$a.class
         */
        /* renamed from: androidx.appcompat.view.menu.b$c$a */
        /* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/b$c$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final d f1556b;

            /* renamed from: c */
            public final MenuItem f1557c;

            /* renamed from: d */
            public final C0250e f1558d;

            /* renamed from: e */
            public final c f1559e;

            public a(c cVar, d dVar, MenuItem menuItem, C0250e c0250e) {
                this.f1559e = cVar;
                this.f1556b = dVar;
                this.f1557c = menuItem;
                this.f1558d = c0250e;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f1556b;
                if (dVar != null) {
                    this.f1559e.f1555b.f1528B = true;
                    dVar.f1561b.m982e(false);
                    this.f1559e.f1555b.f1528B = false;
                }
                if (this.f1557c.isEnabled() && this.f1557c.hasSubMenu()) {
                    this.f1558d.m959L(this.f1557c, 4);
                }
            }
        }

        public c(ViewOnKeyListenerC0247b viewOnKeyListenerC0247b) {
            this.f1555b = viewOnKeyListenerC0247b;
        }

        @Override // androidx.appcompat.widget.InterfaceC0365x0
        /* renamed from: d */
        public void mo936d(C0250e c0250e, MenuItem menuItem) {
            d dVar = null;
            this.f1555b.f1534h.removeCallbacksAndMessages(null);
            int size = this.f1555b.f1536j.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (c0250e == this.f1555b.f1536j.get(i10).f1561b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            if (i11 < this.f1555b.f1536j.size()) {
                dVar = this.f1555b.f1536j.get(i11);
            }
            this.f1555b.f1534h.postAtTime(new a(this, dVar, menuItem, c0250e), c0250e, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.InterfaceC0365x0
        /* renamed from: n */
        public void mo937n(C0250e c0250e, MenuItem menuItem) {
            this.f1555b.f1534h.removeCallbacksAndMessages(c0250e);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/view/menu/b$d.class
     */
    /* renamed from: androidx.appcompat.view.menu.b$d */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/b$d.class */
    public static class d {

        /* renamed from: a */
        public final C0301b1 f1560a;

        /* renamed from: b */
        public final C0250e f1561b;

        /* renamed from: c */
        public final int f1562c;

        public d(C0301b1 c0301b1, C0250e c0250e, int i10) {
            this.f1560a = c0301b1;
            this.f1561b = c0250e;
            this.f1562c = i10;
        }

        /* renamed from: a */
        public ListView m938a() {
            return this.f1560a.mo927o();
        }
    }

    public ViewOnKeyListenerC0247b(Context context, View view, int i10, int i11, boolean z10) {
        this.f1529c = context;
        this.f1542p = view;
        this.f1531e = i10;
        this.f1532f = i11;
        this.f1533g = z10;
        Resources resources = context.getResources();
        this.f1530d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0923d.f6144d));
        this.f1534h = new Handler();
    }

    /* renamed from: A */
    public final MenuItem m917A(C0250e c0250e, C0250e c0250e2) {
        int size = c0250e.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = c0250e.getItem(i10);
            if (item.hasSubMenu() && c0250e2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: B */
    public final View m918B(d dVar, C0250e c0250e) {
        C0249d c0249d;
        int i10;
        int firstVisiblePosition;
        MenuItem m917A = m917A(dVar.f1561b, c0250e);
        if (m917A == null) {
            return null;
        }
        ListView m938a = dVar.m938a();
        ListAdapter adapter = m938a.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i10 = headerViewListAdapter.getHeadersCount();
            c0249d = (C0249d) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0249d = (C0249d) adapter;
            i10 = 0;
        }
        int count = c0249d.getCount();
        while (true) {
            if (i11 >= count) {
                i11 = -1;
                break;
            }
            if (m917A == c0249d.getItem(i11)) {
                break;
            }
            i11++;
        }
        if (i11 != -1 && (firstVisiblePosition = (i11 + i10) - m938a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < m938a.getChildCount()) {
            return m938a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: C */
    public final int m919C() {
        int i10 = 1;
        if (C6824g0.m31473C(this.f1542p) == 1) {
            i10 = 0;
        }
        return i10;
    }

    /* renamed from: D */
    public final int m920D(int i10) {
        List<d> list = this.f1536j;
        ListView m938a = list.get(list.size() - 1).m938a();
        int[] iArr = new int[2];
        m938a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1543q.getWindowVisibleDisplayFrame(rect);
        return this.f1544r == 1 ? (iArr[0] + m938a.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    /* renamed from: E */
    public final void m921E(C0250e c0250e) {
        d dVar;
        View view;
        int i10;
        int i11;
        int i12;
        LayoutInflater from = LayoutInflater.from(this.f1529c);
        C0249d c0249d = new C0249d(c0250e, from, this.f1533g, f1526C);
        if (!mo922a() && this.f1549w) {
            c0249d.m946d(true);
        } else if (mo922a()) {
            c0249d.m946d(AbstractC5272d.m26349w(c0250e));
        }
        int m26348m = AbstractC5272d.m26348m(c0249d, null, this.f1529c, this.f1530d);
        C0301b1 m934y = m934y();
        m934y.mo1636m(c0249d);
        m934y.m1650E(m26348m);
        m934y.m1651F(this.f1541o);
        if (this.f1536j.size() > 0) {
            List<d> list = this.f1536j;
            dVar = list.get(list.size() - 1);
            view = m918B(dVar, c0250e);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            m934y.m1248T(false);
            m934y.m1245Q(null);
            int m920D = m920D(m26348m);
            boolean z10 = m920D == 1;
            this.f1544r = m920D;
            if (Build.VERSION.SDK_INT >= 26) {
                m934y.m1648C(view);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f1542p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1541o & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1542p.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f1541o & 5) == 5) {
                if (!z10) {
                    m26348m = view.getWidth();
                    i12 = i10 - m26348m;
                }
                i12 = i10 + m26348m;
            } else {
                if (z10) {
                    m26348m = view.getWidth();
                    i12 = i10 + m26348m;
                }
                i12 = i10 - m26348m;
            }
            m934y.m1664e(i12);
            m934y.m1657L(true);
            m934y.m1666i(i11);
        } else {
            if (this.f1545s) {
                m934y.m1664e(this.f1547u);
            }
            if (this.f1546t) {
                m934y.m1666i(this.f1548v);
            }
            m934y.m1652G(m26351l());
        }
        this.f1536j.add(new d(m934y, c0250e, this.f1544r));
        m934y.show();
        ListView mo927o = m934y.mo927o();
        mo927o.setOnKeyListener(this);
        if (dVar == null && this.f1550x && c0250e.m1000x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0926g.f6254l, (ViewGroup) mo927o, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(c0250e.m1000x());
            mo927o.addHeaderView(frameLayout, null, false);
            m934y.show();
        }
    }

    @Override // p155j.InterfaceC5274f
    /* renamed from: a */
    public boolean mo922a() {
        boolean z10 = false;
        if (this.f1536j.size() > 0) {
            z10 = false;
            if (this.f1536j.get(0).f1560a.mo922a()) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: b */
    public void mo902b(C0250e c0250e, boolean z10) {
        int m935z = m935z(c0250e);
        if (m935z < 0) {
            return;
        }
        int i10 = m935z + 1;
        if (i10 < this.f1536j.size()) {
            this.f1536j.get(i10).f1561b.m982e(false);
        }
        d remove = this.f1536j.remove(m935z);
        remove.f1561b.m962O(this);
        if (this.f1528B) {
            remove.f1560a.m1246R(null);
            remove.f1560a.m1649D(0);
        }
        remove.f1560a.dismiss();
        int size = this.f1536j.size();
        this.f1544r = size > 0 ? this.f1536j.get(size - 1).f1562c : m919C();
        if (size != 0) {
            if (z10) {
                this.f1536j.get(0).f1561b.m982e(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0254i.a aVar = this.f1551y;
        if (aVar != null) {
            aVar.mo1006b(c0250e, true);
        }
        ViewTreeObserver viewTreeObserver = this.f1552z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f1552z.removeGlobalOnLayoutListener(this.f1537k);
            }
            this.f1552z = null;
        }
        this.f1543q.removeOnAttachStateChangeListener(this.f1538l);
        this.f1527A.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: d */
    public void mo904d(InterfaceC0254i.a aVar) {
        this.f1551y = aVar;
    }

    @Override // p155j.InterfaceC5274f
    public void dismiss() {
        int size = this.f1536j.size();
        if (size <= 0) {
            return;
        }
        d[] dVarArr = (d[]) this.f1536j.toArray(new d[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            d dVar = dVarArr[size];
            if (dVar.f1560a.mo922a()) {
                dVar.f1560a.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: e */
    public boolean mo905e(SubMenuC0257l subMenuC0257l) {
        for (d dVar : this.f1536j) {
            if (subMenuC0257l == dVar.f1561b) {
                dVar.m938a().requestFocus();
                return true;
            }
        }
        if (!subMenuC0257l.hasVisibleItems()) {
            return false;
        }
        mo924j(subMenuC0257l);
        InterfaceC0254i.a aVar = this.f1551y;
        if (aVar == null) {
            return true;
        }
        aVar.mo1007c(subMenuC0257l);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: f */
    public void mo906f(boolean z10) {
        Iterator<d> it = this.f1536j.iterator();
        while (it.hasNext()) {
            AbstractC5272d.m26350x(it.next().m938a().getAdapter()).notifyDataSetChanged();
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
        c0250e.m978c(this, this.f1529c);
        if (mo922a()) {
            m921E(c0250e);
        } else {
            this.f1535i.add(c0250e);
        }
    }

    @Override // p155j.AbstractC5272d
    /* renamed from: k */
    public boolean mo925k() {
        return false;
    }

    @Override // p155j.AbstractC5272d
    /* renamed from: n */
    public void mo926n(View view) {
        if (this.f1542p != view) {
            this.f1542p = view;
            this.f1541o = C6820f.m31460b(this.f1540n, C6824g0.m31473C(view));
        }
    }

    @Override // p155j.InterfaceC5274f
    /* renamed from: o */
    public ListView mo927o() {
        ListView m938a;
        if (this.f1536j.isEmpty()) {
            m938a = null;
        } else {
            List<d> list = this.f1536j;
            m938a = list.get(list.size() - 1).m938a();
        }
        return m938a;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f1536j.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f1536j.get(i10);
            if (!dVar.f1560a.mo922a()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f1561b.m982e(false);
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
        this.f1549w = z10;
    }

    @Override // p155j.AbstractC5272d
    /* renamed from: r */
    public void mo929r(int i10) {
        if (this.f1540n != i10) {
            this.f1540n = i10;
            this.f1541o = C6820f.m31460b(i10, C6824g0.m31473C(this.f1542p));
        }
    }

    @Override // p155j.AbstractC5272d
    /* renamed from: s */
    public void mo930s(int i10) {
        this.f1545s = true;
        this.f1547u = i10;
    }

    @Override // p155j.InterfaceC5274f
    public void show() {
        if (mo922a()) {
            return;
        }
        Iterator<C0250e> it = this.f1535i.iterator();
        while (it.hasNext()) {
            m921E(it.next());
        }
        this.f1535i.clear();
        View view = this.f1542p;
        this.f1543q = view;
        if (view != null) {
            boolean z10 = this.f1552z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f1552z = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1537k);
            }
            this.f1543q.addOnAttachStateChangeListener(this.f1538l);
        }
    }

    @Override // p155j.AbstractC5272d
    /* renamed from: t */
    public void mo931t(PopupWindow.OnDismissListener onDismissListener) {
        this.f1527A = onDismissListener;
    }

    @Override // p155j.AbstractC5272d
    /* renamed from: u */
    public void mo932u(boolean z10) {
        this.f1550x = z10;
    }

    @Override // p155j.AbstractC5272d
    /* renamed from: v */
    public void mo933v(int i10) {
        this.f1546t = true;
        this.f1548v = i10;
    }

    /* renamed from: y */
    public final C0301b1 m934y() {
        C0301b1 c0301b1 = new C0301b1(this.f1529c, null, this.f1531e, this.f1532f);
        c0301b1.m1247S(this.f1539m);
        c0301b1.m1656K(this);
        c0301b1.m1655J(this);
        c0301b1.m1648C(this.f1542p);
        c0301b1.m1651F(this.f1541o);
        c0301b1.m1654I(true);
        c0301b1.m1653H(2);
        return c0301b1;
    }

    /* renamed from: z */
    public final int m935z(C0250e c0250e) {
        int size = this.f1536j.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (c0250e == this.f1536j.get(i10).f1561b) {
                return i10;
            }
        }
        return -1;
    }
}
