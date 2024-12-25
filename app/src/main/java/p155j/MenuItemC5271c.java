package p155j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p118h0.InterfaceMenuItemC5017b;
import p137i.InterfaceC5135c;
import p235o0.AbstractC6808b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j/c.class
 */
/* renamed from: j.c */
/* loaded from: combined.jar:classes1.jar:j/c.class */
public class MenuItemC5271c extends AbstractC5270b implements MenuItem {

    /* renamed from: d */
    public final InterfaceMenuItemC5017b f30304d;

    /* renamed from: e */
    public Method f30305e;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:j/c$a.class
     */
    /* renamed from: j.c$a */
    /* loaded from: combined.jar:classes1.jar:j/c$a.class */
    public class a extends AbstractC6808b {

        /* renamed from: d */
        public final ActionProvider f30306d;

        /* renamed from: e */
        public final MenuItemC5271c f30307e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MenuItemC5271c menuItemC5271c, Context context, ActionProvider actionProvider) {
            super(context);
            this.f30307e = menuItemC5271c;
            this.f30306d = actionProvider;
        }

        @Override // p235o0.AbstractC6808b
        /* renamed from: b */
        public boolean mo26343b() {
            return this.f30306d.hasSubMenu();
        }

        @Override // p235o0.AbstractC6808b
        /* renamed from: d */
        public View mo3223d() {
            return this.f30306d.onCreateActionView();
        }

        @Override // p235o0.AbstractC6808b
        /* renamed from: f */
        public boolean mo3224f() {
            return this.f30306d.onPerformDefaultAction();
        }

        @Override // p235o0.AbstractC6808b
        /* renamed from: g */
        public void mo26344g(SubMenu subMenu) {
            this.f30306d.onPrepareSubMenu(this.f30307e.m26338d(subMenu));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:j/c$b.class
     */
    /* renamed from: j.c$b */
    /* loaded from: combined.jar:classes1.jar:j/c$b.class */
    public class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: f */
        public AbstractC6808b.b f30308f;

        /* renamed from: g */
        public final MenuItemC5271c f30309g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MenuItemC5271c menuItemC5271c, Context context, ActionProvider actionProvider) {
            super(menuItemC5271c, context, actionProvider);
            this.f30309g = menuItemC5271c;
        }

        @Override // p235o0.AbstractC6808b
        /* renamed from: c */
        public boolean mo3222c() {
            return this.f30306d.isVisible();
        }

        @Override // p235o0.AbstractC6808b
        /* renamed from: e */
        public View mo26345e(MenuItem menuItem) {
            return this.f30306d.onCreateActionView(menuItem);
        }

        @Override // p235o0.AbstractC6808b
        /* renamed from: h */
        public boolean mo3225h() {
            return this.f30306d.overridesItemVisibility();
        }

        @Override // p235o0.AbstractC6808b
        /* renamed from: l */
        public void mo26346l(AbstractC6808b.b bVar) {
            this.f30308f = bVar;
            this.f30306d.setVisibilityListener(bVar != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            AbstractC6808b.b bVar = this.f30308f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:j/c$c.class
     */
    /* renamed from: j.c$c */
    /* loaded from: combined.jar:classes1.jar:j/c$c.class */
    public static class c extends FrameLayout implements InterfaceC5135c {

        /* renamed from: b */
        public final CollapsibleActionView f30310b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(View view) {
            super(view.getContext());
            this.f30310b = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public View m26347a() {
            return (View) this.f30310b;
        }

        @Override // p137i.InterfaceC5135c
        public void onActionViewCollapsed() {
            this.f30310b.onActionViewCollapsed();
        }

        @Override // p137i.InterfaceC5135c
        public void onActionViewExpanded() {
            this.f30310b.onActionViewExpanded();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:j/c$d.class
     */
    /* renamed from: j.c$d */
    /* loaded from: combined.jar:classes1.jar:j/c$d.class */
    public class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        public final MenuItem.OnActionExpandListener f30311a;

        /* renamed from: b */
        public final MenuItemC5271c f30312b;

        public d(MenuItemC5271c menuItemC5271c, MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f30312b = menuItemC5271c;
            this.f30311a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f30311a.onMenuItemActionCollapse(this.f30312b.m26337c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f30311a.onMenuItemActionExpand(this.f30312b.m26337c(menuItem));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:j/c$e.class
     */
    /* renamed from: j.c$e */
    /* loaded from: combined.jar:classes1.jar:j/c$e.class */
    public class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        public final MenuItem.OnMenuItemClickListener f30313a;

        /* renamed from: b */
        public final MenuItemC5271c f30314b;

        public e(MenuItemC5271c menuItemC5271c, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f30314b = menuItemC5271c;
            this.f30313a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f30313a.onMenuItemClick(this.f30314b.m26337c(menuItem));
        }
    }

    public MenuItemC5271c(Context context, InterfaceMenuItemC5017b interfaceMenuItemC5017b) {
        super(context);
        if (interfaceMenuItemC5017b == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f30304d = interfaceMenuItemC5017b;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f30304d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f30304d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC6808b mo1012a = this.f30304d.mo1012a();
        if (mo1012a instanceof a) {
            return ((a) mo1012a).f30306d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f30304d.getActionView();
        View view = actionView;
        if (actionView instanceof c) {
            view = ((c) actionView).m26347a();
        }
        return view;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f30304d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f30304d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f30304d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f30304d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f30304d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f30304d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f30304d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f30304d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f30304d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f30304d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f30304d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f30304d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f30304d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m26338d(this.f30304d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f30304d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f30304d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f30304d.getTooltipText();
    }

    /* renamed from: h */
    public void m26342h(boolean z10) {
        try {
            if (this.f30305e == null) {
                this.f30305e = this.f30304d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f30305e.invoke(this.f30304d, Boolean.valueOf(z10));
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f30304d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f30304d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f30304d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f30304d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f30304d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f30304d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        this.f30304d.mo1013b(actionProvider != null ? new b(this, this.f30301a, actionProvider) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f30304d.setActionView(i10);
        View actionView = this.f30304d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f30304d.setActionView(new c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        View view2 = view;
        if (view instanceof CollapsibleActionView) {
            view2 = new c(view);
        }
        this.f30304d.setActionView(view2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f30304d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f30304d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f30304d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f30304d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f30304d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f30304d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f30304d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f30304d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f30304d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f30304d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f30304d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f30304d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f30304d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f30304d.setOnActionExpandListener(onActionExpandListener != null ? new d(this, onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f30304d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(this, onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f30304d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f30304d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f30304d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f30304d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f30304d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f30304d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f30304d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f30304d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f30304d.setVisible(z10);
    }
}
