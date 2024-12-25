package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.InterfaceC0254i;
import androidx.appcompat.view.menu.InterfaceC0255j;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/view/menu/a.class
 */
/* renamed from: androidx.appcompat.view.menu.a */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/a.class */
public abstract class AbstractC0246a implements InterfaceC0254i {

    /* renamed from: b */
    public Context f1516b;

    /* renamed from: c */
    public Context f1517c;

    /* renamed from: d */
    public C0250e f1518d;

    /* renamed from: e */
    public LayoutInflater f1519e;

    /* renamed from: f */
    public LayoutInflater f1520f;

    /* renamed from: g */
    public InterfaceC0254i.a f1521g;

    /* renamed from: h */
    public int f1522h;

    /* renamed from: i */
    public int f1523i;

    /* renamed from: j */
    public InterfaceC0255j f1524j;

    /* renamed from: k */
    public int f1525k;

    public AbstractC0246a(Context context, int i10, int i11) {
        this.f1516b = context;
        this.f1519e = LayoutInflater.from(context);
        this.f1522h = i10;
        this.f1523i = i11;
    }

    /* renamed from: a */
    public void m901a(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1524j).addView(view, i10);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: b */
    public void mo902b(C0250e c0250e, boolean z10) {
        InterfaceC0254i.a aVar = this.f1521g;
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
        this.f1521g = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: e */
    public boolean mo905e(SubMenuC0257l subMenuC0257l) {
        InterfaceC0254i.a aVar = this.f1521g;
        if (aVar == null) {
            return false;
        }
        if (subMenuC0257l == null) {
            subMenuC0257l = this.f1518d;
        }
        return aVar.mo1007c(subMenuC0257l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: f */
    public void mo906f(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f1524j;
        if (viewGroup == null) {
            return;
        }
        C0250e c0250e = this.f1518d;
        int i10 = 0;
        if (c0250e != null) {
            c0250e.m994r();
            ArrayList<C0252g> m952E = this.f1518d.m952E();
            int size = m952E.size();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                i10 = i12;
                if (i11 >= size) {
                    break;
                }
                C0252g c0252g = m952E.get(i11);
                int i13 = i10;
                if (mo916q(i10, c0252g)) {
                    View childAt = viewGroup.getChildAt(i10);
                    C0252g itemData = childAt instanceof InterfaceC0255j.a ? ((InterfaceC0255j.a) childAt).getItemData() : null;
                    View mo913n = mo913n(c0252g, childAt, viewGroup);
                    if (c0252g != itemData) {
                        mo913n.setPressed(false);
                        mo913n.jumpDrawablesToCurrentState();
                    }
                    if (mo913n != childAt) {
                        m901a(mo913n, i10);
                    }
                    i13 = i10 + 1;
                }
                i11++;
                i12 = i13;
            }
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!mo911l(viewGroup, i10)) {
                i10++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: h */
    public boolean mo907h(C0250e c0250e, C0252g c0252g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: i */
    public void mo908i(Context context, C0250e c0250e) {
        this.f1517c = context;
        this.f1520f = LayoutInflater.from(context);
        this.f1518d = c0250e;
    }

    /* renamed from: j */
    public abstract void mo909j(C0252g c0252g, InterfaceC0255j.a aVar);

    /* renamed from: k */
    public InterfaceC0255j.a m910k(ViewGroup viewGroup) {
        return (InterfaceC0255j.a) this.f1519e.inflate(this.f1523i, viewGroup, false);
    }

    /* renamed from: l */
    public boolean mo911l(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    /* renamed from: m */
    public InterfaceC0254i.a m912m() {
        return this.f1521g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public View mo913n(C0252g c0252g, View view, ViewGroup viewGroup) {
        InterfaceC0255j.a m910k = view instanceof InterfaceC0255j.a ? (InterfaceC0255j.a) view : m910k(viewGroup);
        mo909j(c0252g, m910k);
        return (View) m910k;
    }

    /* renamed from: o */
    public InterfaceC0255j mo914o(ViewGroup viewGroup) {
        if (this.f1524j == null) {
            InterfaceC0255j interfaceC0255j = (InterfaceC0255j) this.f1519e.inflate(this.f1522h, viewGroup, false);
            this.f1524j = interfaceC0255j;
            interfaceC0255j.mo893a(this.f1518d);
            mo906f(true);
        }
        return this.f1524j;
    }

    /* renamed from: p */
    public void m915p(int i10) {
        this.f1525k = i10;
    }

    /* renamed from: q */
    public abstract boolean mo916q(int i10, C0252g c0252g);
}
