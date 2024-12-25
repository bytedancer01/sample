package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.InterfaceC0255j;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/view/menu/d.class
 */
/* renamed from: androidx.appcompat.view.menu.d */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/d.class */
public class C0249d extends BaseAdapter {

    /* renamed from: b */
    public C0250e f1574b;

    /* renamed from: c */
    public int f1575c = -1;

    /* renamed from: d */
    public boolean f1576d;

    /* renamed from: e */
    public final boolean f1577e;

    /* renamed from: f */
    public final LayoutInflater f1578f;

    /* renamed from: g */
    public final int f1579g;

    public C0249d(C0250e c0250e, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f1577e = z10;
        this.f1578f = layoutInflater;
        this.f1574b = c0250e;
        this.f1579g = i10;
        m943a();
    }

    /* renamed from: a */
    public void m943a() {
        C0252g m998v = this.f1574b.m998v();
        if (m998v != null) {
            ArrayList<C0252g> m1002z = this.f1574b.m1002z();
            int size = m1002z.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (m1002z.get(i10) == m998v) {
                    this.f1575c = i10;
                    return;
                }
            }
        }
        this.f1575c = -1;
    }

    /* renamed from: b */
    public C0250e m944b() {
        return this.f1574b;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0252g getItem(int i10) {
        ArrayList<C0252g> m1002z = this.f1577e ? this.f1574b.m1002z() : this.f1574b.m952E();
        int i11 = this.f1575c;
        int i12 = i10;
        if (i11 >= 0) {
            i12 = i10;
            if (i10 >= i11) {
                i12 = i10 + 1;
            }
        }
        return m1002z.get(i12);
    }

    /* renamed from: d */
    public void m946d(boolean z10) {
        this.f1576d = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<C0252g> m1002z = this.f1577e ? this.f1574b.m1002z() : this.f1574b.m952E();
        int i10 = this.f1575c;
        int size = m1002z.size();
        return i10 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        View view2 = view;
        if (view == null) {
            view2 = this.f1578f.inflate(this.f1579g, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        int groupId2 = i11 >= 0 ? getItem(i11).getGroupId() : groupId;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view2;
        listMenuItemView.setGroupDividerEnabled(this.f1574b.mo953F() && groupId != groupId2);
        InterfaceC0255j.a aVar = (InterfaceC0255j.a) view2;
        if (this.f1576d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo885c(getItem(i10), 0);
        return view2;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m943a();
        super.notifyDataSetChanged();
    }
}
