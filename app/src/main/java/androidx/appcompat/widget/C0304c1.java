package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0250e;
import androidx.appcompat.view.menu.C0253h;
import p029c.C0920a;
import p137i.C5139g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/c1.class
 */
/* renamed from: androidx.appcompat.widget.c1 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/c1.class */
public class C0304c1 {

    /* renamed from: a */
    public final Context f2005a;

    /* renamed from: b */
    public final C0250e f2006b;

    /* renamed from: c */
    public final View f2007c;

    /* renamed from: d */
    public final C0253h f2008d;

    /* renamed from: e */
    public d f2009e;

    /* renamed from: f */
    public c f2010f;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/c1$a.class
     */
    /* renamed from: androidx.appcompat.widget.c1$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/c1$a.class */
    public class a implements C0250e.a {

        /* renamed from: b */
        public final C0304c1 f2011b;

        public a(C0304c1 c0304c1) {
            this.f2011b = c0304c1;
        }

        @Override // androidx.appcompat.view.menu.C0250e.a
        /* renamed from: a */
        public boolean mo1003a(C0250e c0250e, MenuItem menuItem) {
            d dVar = this.f2011b.f2009e;
            if (dVar != null) {
                return dVar.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0250e.a
        /* renamed from: b */
        public void mo1004b(C0250e c0250e) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/c1$b.class
     */
    /* renamed from: androidx.appcompat.widget.c1$b */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/c1$b.class */
    public class b implements PopupWindow.OnDismissListener {

        /* renamed from: b */
        public final C0304c1 f2012b;

        public b(C0304c1 c0304c1) {
            this.f2012b = c0304c1;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C0304c1 c0304c1 = this.f2012b;
            c cVar = c0304c1.f2010f;
            if (cVar != null) {
                cVar.mo1281a(c0304c1);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/c1$c.class
     */
    /* renamed from: androidx.appcompat.widget.c1$c */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/c1$c.class */
    public interface c {
        /* renamed from: a */
        void mo1281a(C0304c1 c0304c1);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/c1$d.class
     */
    /* renamed from: androidx.appcompat.widget.c1$d */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/c1$d.class */
    public interface d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public C0304c1(Context context, View view) {
        this(context, view, 0);
    }

    public C0304c1(Context context, View view, int i10) {
        this(context, view, i10, C0920a.f6095J, 0);
    }

    public C0304c1(Context context, View view, int i10, int i11, int i12) {
        this.f2005a = context;
        this.f2007c = view;
        C0250e c0250e = new C0250e(context);
        this.f2006b = c0250e;
        c0250e.mo965R(new a(this));
        C0253h c0253h = new C0253h(context, c0250e, view, false, i11, i12);
        this.f2008d = c0253h;
        c0253h.m1044h(i10);
        c0253h.m1045i(new b(this));
    }

    /* renamed from: a */
    public void m1274a() {
        this.f2008d.m1038b();
    }

    /* renamed from: b */
    public Menu m1275b() {
        return this.f2006b;
    }

    /* renamed from: c */
    public MenuInflater m1276c() {
        return new C5139g(this.f2005a);
    }

    /* renamed from: d */
    public void m1277d(int i10) {
        m1276c().inflate(i10, this.f2006b);
    }

    /* renamed from: e */
    public void m1278e(c cVar) {
        this.f2010f = cVar;
    }

    /* renamed from: f */
    public void m1279f(d dVar) {
        this.f2009e = dVar;
    }

    /* renamed from: g */
    public void m1280g() {
        this.f2008d.m1047k();
    }
}
