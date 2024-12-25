package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0250e;
import androidx.appcompat.widget.C0337n1;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/view/menu/ExpandedMenuView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/ExpandedMenuView.class */
public final class ExpandedMenuView extends ListView implements C0250e.b, InterfaceC0255j, AdapterView.OnItemClickListener {

    /* renamed from: d */
    public static final int[] f1496d = {R.attr.background, R.attr.divider};

    /* renamed from: b */
    public C0250e f1497b;

    /* renamed from: c */
    public int f1498c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0337n1 m1505v = C0337n1.m1505v(context, attributeSet, f1496d, i10, 0);
        if (m1505v.m1524s(0)) {
            setBackgroundDrawable(m1505v.m1512g(0));
        }
        if (m1505v.m1524s(1)) {
            setDivider(m1505v.m1512g(1));
        }
        m1505v.m1525w();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0255j
    /* renamed from: a */
    public void mo893a(C0250e c0250e) {
        this.f1497b = c0250e;
    }

    @Override // androidx.appcompat.view.menu.C0250e.b
    /* renamed from: b */
    public boolean mo894b(C0252g c0252g) {
        return this.f1497b.m959L(c0252g, 0);
    }

    public int getWindowAnimations() {
        return this.f1498c;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        mo894b((C0252g) getAdapter().getItem(i10));
    }
}
