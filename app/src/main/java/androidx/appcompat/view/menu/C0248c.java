package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.InterfaceC0254i;
import androidx.appcompat.view.menu.InterfaceC0255j;
import java.util.ArrayList;
import p029c.C0926g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/view/menu/c.class
 */
/* renamed from: androidx.appcompat.view.menu.c */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/c.class */
public class C0248c implements InterfaceC0254i, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public Context f1563b;

    /* renamed from: c */
    public LayoutInflater f1564c;

    /* renamed from: d */
    public C0250e f1565d;

    /* renamed from: e */
    public ExpandedMenuView f1566e;

    /* renamed from: f */
    public int f1567f;

    /* renamed from: g */
    public int f1568g;

    /* renamed from: h */
    public int f1569h;

    /* renamed from: i */
    public InterfaceC0254i.a f1570i;

    /* renamed from: j */
    public a f1571j;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/view/menu/c$a.class
     */
    /* renamed from: androidx.appcompat.view.menu.c$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/c$a.class */
    public class a extends BaseAdapter {

        /* renamed from: b */
        public int f1572b = -1;

        /* renamed from: c */
        public final C0248c f1573c;

        public a(C0248c c0248c) {
            this.f1573c = c0248c;
            m941a();
        }

        /* renamed from: a */
        public void m941a() {
            C0252g m998v = this.f1573c.f1565d.m998v();
            if (m998v != null) {
                ArrayList<C0252g> m1002z = this.f1573c.f1565d.m1002z();
                int size = m1002z.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (m1002z.get(i10) == m998v) {
                        this.f1572b = i10;
                        return;
                    }
                }
            }
            this.f1572b = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0252g getItem(int i10) {
            ArrayList<C0252g> m1002z = this.f1573c.f1565d.m1002z();
            int i11 = i10 + this.f1573c.f1567f;
            int i12 = this.f1572b;
            int i13 = i11;
            if (i12 >= 0) {
                i13 = i11;
                if (i11 >= i12) {
                    i13 = i11 + 1;
                }
            }
            return m1002z.get(i13);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = this.f1573c.f1565d.m1002z().size() - this.f1573c.f1567f;
            return this.f1572b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            View view2 = view;
            if (view == null) {
                C0248c c0248c = this.f1573c;
                view2 = c0248c.f1564c.inflate(c0248c.f1569h, viewGroup, false);
            }
            ((InterfaceC0255j.a) view2).mo885c(getItem(i10), 0);
            return view2;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m941a();
            super.notifyDataSetChanged();
        }
    }

    public C0248c(int i10, int i11) {
        this.f1569h = i10;
        this.f1568g = i11;
    }

    public C0248c(Context context, int i10) {
        this(i10, 0);
        this.f1563b = context;
        this.f1564c = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter m939a() {
        if (this.f1571j == null) {
            this.f1571j = new a(this);
        }
        return this.f1571j;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: b */
    public void mo902b(C0250e c0250e, boolean z10) {
        InterfaceC0254i.a aVar = this.f1570i;
        if (aVar != null) {
            aVar.mo1006b(c0250e, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: c */
    public boolean mo903c(C0250e c0250e, C0252g c0252g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: d */
    public void mo904d(InterfaceC0254i.a aVar) {
        this.f1570i = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: e */
    public boolean mo905e(SubMenuC0257l subMenuC0257l) {
        if (!subMenuC0257l.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnKeyListenerC0251f(subMenuC0257l).m1008d(null);
        InterfaceC0254i.a aVar = this.f1570i;
        if (aVar == null) {
            return true;
        }
        aVar.mo1007c(subMenuC0257l);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: f */
    public void mo906f(boolean z10) {
        a aVar = this.f1571j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: g */
    public boolean mo923g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: h */
    public boolean mo907h(C0250e c0250e, C0252g c0252g) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004f  */
    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo908i(android.content.Context r6, androidx.appcompat.view.menu.C0250e r7) {
        /*
            r5 = this;
            r0 = r5
            int r0 = r0.f1568g
            if (r0 == 0) goto L26
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r1 = r0
            r2 = r6
            r3 = r5
            int r3 = r3.f1568g
            r1.<init>(r2, r3)
            r6 = r0
            r0 = r5
            r1 = r6
            r0.f1563b = r1
            r0 = r6
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r6 = r0
        L1e:
            r0 = r5
            r1 = r6
            r0.f1564c = r1
            goto L41
        L26:
            r0 = r5
            android.content.Context r0 = r0.f1563b
            if (r0 == 0) goto L41
            r0 = r5
            r1 = r6
            r0.f1563b = r1
            r0 = r5
            android.view.LayoutInflater r0 = r0.f1564c
            if (r0 != 0) goto L41
            r0 = r6
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r6 = r0
            goto L1e
        L41:
            r0 = r5
            r1 = r7
            r0.f1565d = r1
            r0 = r5
            androidx.appcompat.view.menu.c$a r0 = r0.f1571j
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L53
            r0 = r6
            r0.notifyDataSetChanged()
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0248c.mo908i(android.content.Context, androidx.appcompat.view.menu.e):void");
    }

    /* renamed from: j */
    public InterfaceC0255j m940j(ViewGroup viewGroup) {
        if (this.f1566e == null) {
            this.f1566e = (ExpandedMenuView) this.f1564c.inflate(C0926g.f6249g, viewGroup, false);
            if (this.f1571j == null) {
                this.f1571j = new a(this);
            }
            this.f1566e.setAdapter((ListAdapter) this.f1571j);
            this.f1566e.setOnItemClickListener(this);
        }
        return this.f1566e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f1565d.m960M(this.f1571j.getItem(i10), this, 0);
    }
}
