package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.C0355t1;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC0416e;
import androidx.lifecycle.C0571f0;
import androidx.lifecycle.C0573g0;
import androidx.savedstate.C0734d;
import androidx.savedstate.SavedStateRegistry;
import p000a.InterfaceC0001b;
import p030c0.C0936d;
import p030c0.C0960p;
import p030c0.C0969t0;
import p049d.AbstractC4275a;
import p049d.AbstractC4277c;
import p049d.InterfaceC4276b;
import p137i.AbstractC5134b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/app/b.class
 */
/* renamed from: androidx.appcompat.app.b */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/app/b.class */
public class ActivityC0243b extends ActivityC0416e implements InterfaceC4276b, C0969t0.a {

    /* renamed from: b */
    public AbstractC4277c f1480b;

    /* renamed from: c */
    public Resources f1481c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/app/b$a.class
     */
    /* renamed from: androidx.appcompat.app.b$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/app/b$a.class */
    public class a implements SavedStateRegistry.InterfaceC0730b {

        /* renamed from: a */
        public final ActivityC0243b f1482a;

        public a(ActivityC0243b activityC0243b) {
            this.f1482a = activityC0243b;
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0730b
        /* renamed from: a */
        public Bundle mo882a() {
            Bundle bundle = new Bundle();
            this.f1482a.m867e0().mo21559u(bundle);
            return bundle;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/app/b$b.class
     */
    /* renamed from: androidx.appcompat.app.b$b */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/app/b$b.class */
    public class b implements InterfaceC0001b {

        /* renamed from: a */
        public final ActivityC0243b f1483a;

        public b(ActivityC0243b activityC0243b) {
            this.f1483a = activityC0243b;
        }

        @Override // p000a.InterfaceC0001b
        /* renamed from: a */
        public void mo5a(Context context) {
            AbstractC4277c m867e0 = this.f1483a.m867e0();
            m867e0.mo21552n();
            m867e0.mo21555q(this.f1483a.getSavedStateRegistry().m4734a("androidx:appcompat"));
        }
    }

    public ActivityC0243b() {
        m870g0();
    }

    @Override // p049d.InterfaceC4276b
    /* renamed from: G */
    public AbstractC5134b mo866G(AbstractC5134b.a aVar) {
        return null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        m867e0().mo21545d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(m867e0().mo21547f(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC4275a m868f0 = m868f0();
        if (getWindow().hasFeature(0)) {
            if (m868f0 == null || !m868f0.mo21509f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // p030c0.ActivityC0952l, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC4275a m868f0 = m868f0();
        if (keyCode == 82 && m868f0 != null && m868f0.mo21518o(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: e0 */
    public AbstractC4277c m867e0() {
        if (this.f1480b == null) {
            this.f1480b = AbstractC4277c.m21534g(this, this);
        }
        return this.f1480b;
    }

    /* renamed from: f0 */
    public AbstractC4275a m868f0() {
        return m867e0().mo21551m();
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i10) {
        return (T) m867e0().mo21548i(i10);
    }

    @Override // p049d.InterfaceC4276b
    /* renamed from: g */
    public void mo869g(AbstractC5134b abstractC5134b) {
    }

    /* renamed from: g0 */
    public final void m870g0() {
        getSavedStateRegistry().m4737d("androidx:appcompat", new a(this));
        addOnContextAvailableListener(new b(this));
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m867e0().mo21550l();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f1481c == null && C0355t1.m1612b()) {
            this.f1481c = new C0355t1(this, super.getResources());
        }
        Resources resources = this.f1481c;
        Resources resources2 = resources;
        if (resources == null) {
            resources2 = super.getResources();
        }
        return resources2;
    }

    /* renamed from: h0 */
    public void m871h0(C0969t0 c0969t0) {
        c0969t0.m5818d(this);
    }

    /* renamed from: i0 */
    public void m872i0(int i10) {
    }

    public final void initViewTreeOwners() {
        C0571f0.m3153a(getWindow().getDecorView(), this);
        C0573g0.m3157a(getWindow().getDecorView(), this);
        C0734d.m4743a(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m867e0().mo21553o();
    }

    /* renamed from: j0 */
    public void m873j0(C0969t0 c0969t0) {
    }

    @Deprecated
    /* renamed from: k0 */
    public void m874k0() {
    }

    /* renamed from: l0 */
    public boolean m875l0() {
        Intent mo876m = mo876m();
        if (mo876m == null) {
            return false;
        }
        if (!m880p0(mo876m)) {
            m879o0(mo876m);
            return true;
        }
        C0969t0 m5815f = C0969t0.m5815f(this);
        m871h0(m5815f);
        m873j0(m5815f);
        m5815f.m5824v();
        try {
            C0936d.m5636m(this);
            return true;
        } catch (IllegalStateException e10) {
            finish();
            return true;
        }
    }

    @Override // p030c0.C0969t0.a
    /* renamed from: m */
    public Intent mo876m() {
        return C0960p.m5728a(this);
    }

    /* renamed from: m0 */
    public final boolean m877m0(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    /* renamed from: n0 */
    public void m878n0(Toolbar toolbar) {
        m867e0().mo21542D(toolbar);
    }

    /* renamed from: o0 */
    public void m879o0(Intent intent) {
        C0960p.m5732e(this, intent);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f1481c != null) {
            this.f1481c.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        m867e0().mo21554p(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        m874k0();
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m867e0().mo21556r();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (m877m0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        AbstractC4275a m868f0 = m868f0();
        if (menuItem.getItemId() != 16908332 || m868f0 == null || (m868f0.mo21512i() & 4) == 0) {
            return false;
        }
        return m875l0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m867e0().mo21557s(bundle);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m867e0().mo21558t();
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStart() {
        super.onStart();
        m867e0().mo21560v();
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStop() {
        super.onStop();
        m867e0().mo21561w();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        m867e0().mo21544F(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC4275a m868f0 = m868f0();
        if (getWindow().hasFeature(0)) {
            if (m868f0 == null || !m868f0.mo21519p()) {
                super.openOptionsMenu();
            }
        }
    }

    /* renamed from: p0 */
    public boolean m880p0(Intent intent) {
        return C0960p.m5733f(this, intent);
    }

    @Override // p049d.InterfaceC4276b
    /* renamed from: s */
    public void mo881s(AbstractC5134b abstractC5134b) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i10) {
        initViewTreeOwners();
        m867e0().mo21539A(i10);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        m867e0().mo21540B(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        m867e0().mo21541C(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        m867e0().mo21543E(i10);
    }

    @Override // androidx.fragment.app.ActivityC0416e
    public void supportInvalidateOptionsMenu() {
        m867e0().mo21553o();
    }
}
