package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.AbstractC0246a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0250e;
import androidx.appcompat.view.menu.C0252g;
import androidx.appcompat.view.menu.C0253h;
import androidx.appcompat.view.menu.InterfaceC0254i;
import androidx.appcompat.view.menu.InterfaceC0255j;
import androidx.appcompat.view.menu.SubMenuC0257l;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import p029c.C0920a;
import p029c.C0926g;
import p106g0.C4917c;
import p137i.C5133a;
import p155j.InterfaceC5274f;
import p235o0.AbstractC6808b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/c.class
 */
/* renamed from: androidx.appcompat.widget.c */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/c.class */
public class C0302c extends AbstractC0246a implements AbstractC6808b.a {

    /* renamed from: A */
    public a f1976A;

    /* renamed from: B */
    public c f1977B;

    /* renamed from: C */
    public b f1978C;

    /* renamed from: D */
    public final f f1979D;

    /* renamed from: E */
    public int f1980E;

    /* renamed from: l */
    public d f1981l;

    /* renamed from: m */
    public Drawable f1982m;

    /* renamed from: n */
    public boolean f1983n;

    /* renamed from: o */
    public boolean f1984o;

    /* renamed from: p */
    public boolean f1985p;

    /* renamed from: q */
    public int f1986q;

    /* renamed from: r */
    public int f1987r;

    /* renamed from: s */
    public int f1988s;

    /* renamed from: t */
    public boolean f1989t;

    /* renamed from: u */
    public boolean f1990u;

    /* renamed from: v */
    public boolean f1991v;

    /* renamed from: w */
    public boolean f1992w;

    /* renamed from: x */
    public int f1993x;

    /* renamed from: y */
    public final SparseBooleanArray f1994y;

    /* renamed from: z */
    public e f1995z;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/c$a.class
     */
    /* renamed from: androidx.appcompat.widget.c$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/c$a.class */
    public class a extends C0253h {

        /* renamed from: m */
        public final C0302c f1996m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0302c c0302c, Context context, SubMenuC0257l subMenuC0257l, View view) {
            super(context, subMenuC0257l, view, false, C0920a.f6117l);
            this.f1996m = c0302c;
            if (!((C0252g) subMenuC0257l.getItem()).m1022l()) {
                d dVar = c0302c.f1981l;
                m1042f(dVar == null ? (View) c0302c.f1524j : dVar);
            }
            m1046j(c0302c.f1979D);
        }

        @Override // androidx.appcompat.view.menu.C0253h
        /* renamed from: e */
        public void mo1041e() {
            C0302c c0302c = this.f1996m;
            c0302c.f1976A = null;
            c0302c.f1980E = 0;
            super.mo1041e();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/c$b.class
     */
    /* renamed from: androidx.appcompat.widget.c$b */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/c$b.class */
    public class b extends ActionMenuItemView.AbstractC0245b {

        /* renamed from: a */
        public final C0302c f1997a;

        public b(C0302c c0302c) {
            this.f1997a = c0302c;
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0245b
        /* renamed from: a */
        public InterfaceC5274f mo892a() {
            a aVar = this.f1997a.f1976A;
            return aVar != null ? aVar.m1039c() : null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/c$c.class
     */
    /* renamed from: androidx.appcompat.widget.c$c */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/c$c.class */
    public class c implements Runnable {

        /* renamed from: b */
        public e f1998b;

        /* renamed from: c */
        public final C0302c f1999c;

        public c(C0302c c0302c, e eVar) {
            this.f1999c = c0302c;
            this.f1998b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1999c.f1518d != null) {
                this.f1999c.f1518d.m980d();
            }
            View view = (View) this.f1999c.f1524j;
            if (view != null && view.getWindowToken() != null && this.f1998b.m1049m()) {
                this.f1999c.f1995z = this.f1998b;
            }
            this.f1999c.f1977B = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/c$d.class
     */
    /* renamed from: androidx.appcompat.widget.c$d */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/c$d.class */
    public class d extends AppCompatImageView implements ActionMenuView.InterfaceC0264a {

        /* renamed from: d */
        public final C0302c f2000d;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/appcompat/widget/c$d$a.class
         */
        /* renamed from: androidx.appcompat.widget.c$d$a */
        /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/c$d$a.class */
        public class a extends AbstractViewOnTouchListenerC0348r0 {

            /* renamed from: k */
            public final C0302c f2001k;

            /* renamed from: l */
            public final d f2002l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, View view, C0302c c0302c) {
                super(view);
                this.f2002l = dVar;
                this.f2001k = c0302c;
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0348r0
            /* renamed from: b */
            public InterfaceC5274f mo890b() {
                e eVar = this.f2002l.f2000d.f1995z;
                if (eVar == null) {
                    return null;
                }
                return eVar.m1039c();
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0348r0
            /* renamed from: c */
            public boolean mo891c() {
                this.f2002l.f2000d.m1269K();
                return true;
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0348r0
            /* renamed from: d */
            public boolean mo1272d() {
                C0302c c0302c = this.f2002l.f2000d;
                if (c0302c.f1977B != null) {
                    return false;
                }
                c0302c.m1260B();
                return true;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0302c c0302c, Context context) {
            super(context, null, C0920a.f6116k);
            this.f2000d = c0302c;
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0346q1.m1563a(this, getContentDescription());
            setOnTouchListener(new a(this, this, c0302c));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0264a
        /* renamed from: a */
        public boolean mo883a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0264a
        /* renamed from: b */
        public boolean mo884b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            this.f2000d.m1269K();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C4917c.m24848l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/c$e.class
     */
    /* renamed from: androidx.appcompat.widget.c$e */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/c$e.class */
    public class e extends C0253h {

        /* renamed from: m */
        public final C0302c f2003m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C0302c c0302c, Context context, C0250e c0250e, View view, boolean z10) {
            super(context, c0250e, view, z10, C0920a.f6117l);
            this.f2003m = c0302c;
            m1044h(8388613);
            m1046j(c0302c.f1979D);
        }

        @Override // androidx.appcompat.view.menu.C0253h
        /* renamed from: e */
        public void mo1041e() {
            if (this.f2003m.f1518d != null) {
                this.f2003m.f1518d.close();
            }
            this.f2003m.f1995z = null;
            super.mo1041e();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/c$f.class
     */
    /* renamed from: androidx.appcompat.widget.c$f */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/c$f.class */
    public class f implements InterfaceC0254i.a {

        /* renamed from: b */
        public final C0302c f2004b;

        public f(C0302c c0302c) {
            this.f2004b = c0302c;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0254i.a
        /* renamed from: b */
        public void mo1006b(C0250e c0250e, boolean z10) {
            if (c0250e instanceof SubMenuC0257l) {
                c0250e.mo951D().m982e(false);
            }
            InterfaceC0254i.a m912m = this.f2004b.m912m();
            if (m912m != null) {
                m912m.mo1006b(c0250e, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0254i.a
        /* renamed from: c */
        public boolean mo1007c(C0250e c0250e) {
            boolean z10 = false;
            if (c0250e == this.f2004b.f1518d) {
                return false;
            }
            this.f2004b.f1980E = ((SubMenuC0257l) c0250e).getItem().getItemId();
            InterfaceC0254i.a m912m = this.f2004b.m912m();
            if (m912m != null) {
                z10 = m912m.mo1007c(c0250e);
            }
            return z10;
        }
    }

    public C0302c(Context context) {
        super(context, C0926g.f6245c, C0926g.f6244b);
        this.f1994y = new SparseBooleanArray();
        this.f1979D = new f(this);
    }

    /* renamed from: A */
    public Drawable m1259A() {
        d dVar = this.f1981l;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1983n) {
            return this.f1982m;
        }
        return null;
    }

    /* renamed from: B */
    public boolean m1260B() {
        Object obj;
        c cVar = this.f1977B;
        if (cVar != null && (obj = this.f1524j) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f1977B = null;
            return true;
        }
        e eVar = this.f1995z;
        if (eVar == null) {
            return false;
        }
        eVar.m1038b();
        return true;
    }

    /* renamed from: C */
    public boolean m1261C() {
        a aVar = this.f1976A;
        if (aVar == null) {
            return false;
        }
        aVar.m1038b();
        return true;
    }

    /* renamed from: D */
    public boolean m1262D() {
        return this.f1977B != null || m1263E();
    }

    /* renamed from: E */
    public boolean m1263E() {
        e eVar = this.f1995z;
        return eVar != null && eVar.m1040d();
    }

    /* renamed from: F */
    public void m1264F(Configuration configuration) {
        if (!this.f1989t) {
            this.f1988s = C5133a.m25734b(this.f1517c).m25737d();
        }
        C0250e c0250e = this.f1518d;
        if (c0250e != null) {
            c0250e.m958K(true);
        }
    }

    /* renamed from: G */
    public void m1265G(boolean z10) {
        this.f1992w = z10;
    }

    /* renamed from: H */
    public void m1266H(ActionMenuView actionMenuView) {
        this.f1524j = actionMenuView;
        actionMenuView.mo893a(this.f1518d);
    }

    /* renamed from: I */
    public void m1267I(Drawable drawable) {
        d dVar = this.f1981l;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f1983n = true;
            this.f1982m = drawable;
        }
    }

    /* renamed from: J */
    public void m1268J(boolean z10) {
        this.f1984o = z10;
        this.f1985p = true;
    }

    /* renamed from: K */
    public boolean m1269K() {
        C0250e c0250e;
        if (!this.f1984o || m1263E() || (c0250e = this.f1518d) == null || this.f1524j == null || this.f1977B != null || c0250e.m1002z().isEmpty()) {
            return false;
        }
        c cVar = new c(this, new e(this, this.f1517c, this.f1518d, this.f1981l, true));
        this.f1977B = cVar;
        ((View) this.f1524j).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0246a, androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: b */
    public void mo902b(C0250e c0250e, boolean z10) {
        m1270y();
        super.mo902b(c0250e, z10);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0246a, androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: e */
    public boolean mo905e(SubMenuC0257l subMenuC0257l) {
        SubMenuC0257l subMenuC0257l2;
        boolean z10;
        if (!subMenuC0257l.hasVisibleItems()) {
            return false;
        }
        SubMenuC0257l subMenuC0257l3 = subMenuC0257l;
        while (true) {
            subMenuC0257l2 = subMenuC0257l3;
            if (subMenuC0257l2.m1052e0() == this.f1518d) {
                break;
            }
            subMenuC0257l3 = (SubMenuC0257l) subMenuC0257l2.m1052e0();
        }
        View m1271z = m1271z(subMenuC0257l2.getItem());
        if (m1271z == null) {
            return false;
        }
        this.f1980E = subMenuC0257l.getItem().getItemId();
        int size = subMenuC0257l.size();
        int i10 = 0;
        while (true) {
            z10 = false;
            if (i10 >= size) {
                break;
            }
            MenuItem item = subMenuC0257l.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this, this.f1517c, subMenuC0257l, m1271z);
        this.f1976A = aVar;
        aVar.m1043g(z10);
        this.f1976A.m1047k();
        super.mo905e(subMenuC0257l);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0246a, androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: f */
    public void mo906f(boolean z10) {
        super.mo906f(z10);
        ((View) this.f1524j).requestLayout();
        C0250e c0250e = this.f1518d;
        if (c0250e != null) {
            ArrayList<C0252g> m995s = c0250e.m995s();
            int size = m995s.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC6808b mo1012a = m995s.get(i10).mo1012a();
                if (mo1012a != null) {
                    mo1012a.m31376k(this);
                }
            }
        }
        C0250e c0250e2 = this.f1518d;
        ArrayList<C0252g> m1002z = c0250e2 != null ? c0250e2.m1002z() : null;
        boolean z11 = false;
        if (this.f1984o) {
            z11 = false;
            if (m1002z != null) {
                int size2 = m1002z.size();
                if (size2 == 1) {
                    z11 = !m1002z.get(0).isActionViewExpanded();
                } else {
                    z11 = false;
                    if (size2 > 0) {
                        z11 = true;
                    }
                }
            }
        }
        d dVar = this.f1981l;
        if (z11) {
            if (dVar == null) {
                this.f1981l = new d(this, this.f1516b);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1981l.getParent();
            if (viewGroup != this.f1524j) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1981l);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1524j;
                actionMenuView.addView(this.f1981l, actionMenuView.m1099D());
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.f1524j;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f1981l);
            }
        }
        ((ActionMenuView) this.f1524j).setOverflowReserved(this.f1984o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
    
        if ((r12 + r10) > r8) goto L28;
     */
    @Override // androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo923g() {
        /*
            Method dump skipped, instructions count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0302c.mo923g():boolean");
    }

    @Override // androidx.appcompat.view.menu.AbstractC0246a, androidx.appcompat.view.menu.InterfaceC0254i
    /* renamed from: i */
    public void mo908i(Context context, C0250e c0250e) {
        super.mo908i(context, c0250e);
        Resources resources = context.getResources();
        C5133a m25734b = C5133a.m25734b(context);
        if (!this.f1985p) {
            this.f1984o = m25734b.m25741h();
        }
        if (!this.f1991v) {
            this.f1986q = m25734b.m25736c();
        }
        if (!this.f1989t) {
            this.f1988s = m25734b.m25737d();
        }
        int i10 = this.f1986q;
        if (this.f1984o) {
            if (this.f1981l == null) {
                d dVar = new d(this, this.f1516b);
                this.f1981l = dVar;
                if (this.f1983n) {
                    dVar.setImageDrawable(this.f1982m);
                    this.f1982m = null;
                    this.f1983n = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1981l.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f1981l.getMeasuredWidth();
        } else {
            this.f1981l = null;
        }
        this.f1987r = i10;
        this.f1993x = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0246a
    /* renamed from: j */
    public void mo909j(C0252g c0252g, InterfaceC0255j.a aVar) {
        aVar.mo885c(c0252g, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1524j);
        if (this.f1978C == null) {
            this.f1978C = new b(this);
        }
        actionMenuItemView.setPopupCallback(this.f1978C);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0246a
    /* renamed from: l */
    public boolean mo911l(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f1981l) {
            return false;
        }
        return super.mo911l(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0246a
    /* renamed from: n */
    public View mo913n(C0252g c0252g, View view, ViewGroup viewGroup) {
        View actionView = c0252g.getActionView();
        if (actionView == null || c0252g.m1020j()) {
            actionView = super.mo913n(c0252g, view, viewGroup);
        }
        actionView.setVisibility(c0252g.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0246a
    /* renamed from: o */
    public InterfaceC0255j mo914o(ViewGroup viewGroup) {
        InterfaceC0255j interfaceC0255j = this.f1524j;
        InterfaceC0255j mo914o = super.mo914o(viewGroup);
        if (interfaceC0255j != mo914o) {
            ((ActionMenuView) mo914o).setPresenter(this);
        }
        return mo914o;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0246a
    /* renamed from: q */
    public boolean mo916q(int i10, C0252g c0252g) {
        return c0252g.m1022l();
    }

    /* renamed from: y */
    public boolean m1270y() {
        return m1260B() | m1261C();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    public final View m1271z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1524j;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof InterfaceC0255j.a) && ((InterfaceC0255j.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }
}
