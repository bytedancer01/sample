package p155j;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0249d;
import androidx.appcompat.view.menu.C0250e;
import androidx.appcompat.view.menu.C0252g;
import androidx.appcompat.view.menu.InterfaceC0254i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j/d.class
 */
/* renamed from: j.d */
/* loaded from: combined.jar:classes1.jar:j/d.class */
public abstract class AbstractC5272d implements InterfaceC5274f, InterfaceC0254i, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public Rect f30315b;

    /* renamed from: m */
    public static int m26348m(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i10) {
        int i11 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i12 = 0;
        int i13 = 0;
        ViewGroup viewGroup2 = viewGroup;
        View view = null;
        while (i11 < count) {
            int itemViewType = listAdapter.getItemViewType(i11);
            int i14 = i13;
            if (itemViewType != i13) {
                view = null;
                i14 = itemViewType;
            }
            ViewGroup viewGroup3 = viewGroup2;
            if (viewGroup2 == null) {
                viewGroup3 = new FrameLayout(context);
            }
            view = listAdapter.getView(i11, view, viewGroup3);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            int i15 = i12;
            if (measuredWidth > i12) {
                i15 = measuredWidth;
            }
            i11++;
            i12 = i15;
            i13 = i14;
            viewGroup2 = viewGroup3;
        }
        return i12;
    }

    /* renamed from: w */
    public static boolean m26349w(C0250e c0250e) {
        boolean z10;
        int size = c0250e.size();
        int i10 = 0;
        while (true) {
            z10 = false;
            if (i10 >= size) {
                break;
            }
            MenuItem item = c0250e.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        return z10;
    }

    /* renamed from: x */
    public static C0249d m26350x(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0249d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0249d) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: c */
    public boolean mo903c(C0250e c0250e, C0252g c0252g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: h */
    public boolean mo907h(C0250e c0250e, C0252g c0252g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: i */
    public void mo908i(Context context, C0250e c0250e) {
    }

    /* renamed from: j */
    public abstract void mo924j(C0250e c0250e);

    /* renamed from: k */
    public boolean mo925k() {
        return true;
    }

    /* renamed from: l */
    public Rect m26351l() {
        return this.f30315b;
    }

    /* renamed from: n */
    public abstract void mo926n(View view);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m26350x(listAdapter).f1574b.m960M((MenuItem) listAdapter.getItem(i10), this, mo925k() ? 0 : 4);
    }

    /* renamed from: p */
    public void m26352p(Rect rect) {
        this.f30315b = rect;
    }

    /* renamed from: q */
    public abstract void mo928q(boolean z10);

    /* renamed from: r */
    public abstract void mo929r(int i10);

    /* renamed from: s */
    public abstract void mo930s(int i10);

    /* renamed from: t */
    public abstract void mo931t(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: u */
    public abstract void mo932u(boolean z10);

    /* renamed from: v */
    public abstract void mo933v(int i10);
}
