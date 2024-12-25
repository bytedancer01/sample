package p137i;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p118h0.InterfaceMenuC5016a;
import p118h0.InterfaceMenuItemC5017b;
import p137i.AbstractC5134b;
import p155j.MenuC5273e;
import p155j.MenuItemC5271c;
import p294r.C7936i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i/f.class
 */
/* renamed from: i.f */
/* loaded from: combined.jar:classes1.jar:i/f.class */
public class C5138f extends ActionMode {

    /* renamed from: a */
    public final Context f29456a;

    /* renamed from: b */
    public final AbstractC5134b f29457b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:i/f$a.class
     */
    /* renamed from: i.f$a */
    /* loaded from: combined.jar:classes1.jar:i/f$a.class */
    public static class a implements AbstractC5134b.a {

        /* renamed from: a */
        public final ActionMode.Callback f29458a;

        /* renamed from: b */
        public final Context f29459b;

        /* renamed from: c */
        public final ArrayList<C5138f> f29460c = new ArrayList<>();

        /* renamed from: d */
        public final C7936i<Menu, Menu> f29461d = new C7936i<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f29459b = context;
            this.f29458a = callback;
        }

        @Override // p137i.AbstractC5134b.a
        /* renamed from: a */
        public boolean mo21623a(AbstractC5134b abstractC5134b, MenuItem menuItem) {
            return this.f29458a.onActionItemClicked(m25750e(abstractC5134b), new MenuItemC5271c(this.f29459b, (InterfaceMenuItemC5017b) menuItem));
        }

        @Override // p137i.AbstractC5134b.a
        /* renamed from: b */
        public void mo21624b(AbstractC5134b abstractC5134b) {
            this.f29458a.onDestroyActionMode(m25750e(abstractC5134b));
        }

        @Override // p137i.AbstractC5134b.a
        /* renamed from: c */
        public boolean mo21625c(AbstractC5134b abstractC5134b, Menu menu) {
            return this.f29458a.onPrepareActionMode(m25750e(abstractC5134b), m25751f(menu));
        }

        @Override // p137i.AbstractC5134b.a
        /* renamed from: d */
        public boolean mo21626d(AbstractC5134b abstractC5134b, Menu menu) {
            return this.f29458a.onCreateActionMode(m25750e(abstractC5134b), m25751f(menu));
        }

        /* renamed from: e */
        public ActionMode m25750e(AbstractC5134b abstractC5134b) {
            int size = this.f29460c.size();
            for (int i10 = 0; i10 < size; i10++) {
                C5138f c5138f = this.f29460c.get(i10);
                if (c5138f != null && c5138f.f29457b == abstractC5134b) {
                    return c5138f;
                }
            }
            C5138f c5138f2 = new C5138f(this.f29459b, abstractC5134b);
            this.f29460c.add(c5138f2);
            return c5138f2;
        }

        /* renamed from: f */
        public final Menu m25751f(Menu menu) {
            Menu menu2 = this.f29461d.get(menu);
            Menu menu3 = menu2;
            if (menu2 == null) {
                menu3 = new MenuC5273e(this.f29459b, (InterfaceMenuC5016a) menu);
                this.f29461d.put(menu, menu3);
            }
            return menu3;
        }
    }

    public C5138f(Context context, AbstractC5134b abstractC5134b) {
        this.f29456a = context;
        this.f29457b = abstractC5134b;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f29457b.mo21706c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f29457b.mo21707d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC5273e(this.f29456a, (InterfaceMenuC5016a) this.f29457b.mo21708e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f29457b.mo21709f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f29457b.mo21710g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f29457b.m25742h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f29457b.mo21711i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f29457b.m25743j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f29457b.mo21712k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f29457b.mo21713l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f29457b.mo21714m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f29457b.mo21715n(i10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f29457b.mo21716o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f29457b.m25744p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f29457b.mo21717q(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f29457b.mo21718r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f29457b.mo21719s(z10);
    }
}
