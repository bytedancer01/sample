package p137i;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0250e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p137i.AbstractC5134b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i/e.class
 */
/* renamed from: i.e */
/* loaded from: combined.jar:classes1.jar:i/e.class */
public class C5137e extends AbstractC5134b implements C0250e.a {

    /* renamed from: d */
    public Context f29449d;

    /* renamed from: e */
    public ActionBarContextView f29450e;

    /* renamed from: f */
    public AbstractC5134b.a f29451f;

    /* renamed from: g */
    public WeakReference<View> f29452g;

    /* renamed from: h */
    public boolean f29453h;

    /* renamed from: i */
    public boolean f29454i;

    /* renamed from: j */
    public C0250e f29455j;

    public C5137e(Context context, ActionBarContextView actionBarContextView, AbstractC5134b.a aVar, boolean z10) {
        this.f29449d = context;
        this.f29450e = actionBarContextView;
        this.f29451f = aVar;
        C0250e m966S = new C0250e(actionBarContextView.getContext()).m966S(1);
        this.f29455j = m966S;
        m966S.mo965R(this);
        this.f29454i = z10;
    }

    @Override // androidx.appcompat.view.menu.C0250e.a
    /* renamed from: a */
    public boolean mo1003a(C0250e c0250e, MenuItem menuItem) {
        return this.f29451f.mo21623a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0250e.a
    /* renamed from: b */
    public void mo1004b(C0250e c0250e) {
        mo21712k();
        this.f29450e.m1061l();
    }

    @Override // p137i.AbstractC5134b
    /* renamed from: c */
    public void mo21706c() {
        if (this.f29453h) {
            return;
        }
        this.f29453h = true;
        this.f29450e.sendAccessibilityEvent(32);
        this.f29451f.mo21624b(this);
    }

    @Override // p137i.AbstractC5134b
    /* renamed from: d */
    public View mo21707d() {
        WeakReference<View> weakReference = this.f29452g;
        return weakReference != null ? weakReference.get() : null;
    }

    @Override // p137i.AbstractC5134b
    /* renamed from: e */
    public Menu mo21708e() {
        return this.f29455j;
    }

    @Override // p137i.AbstractC5134b
    /* renamed from: f */
    public MenuInflater mo21709f() {
        return new C5139g(this.f29450e.getContext());
    }

    @Override // p137i.AbstractC5134b
    /* renamed from: g */
    public CharSequence mo21710g() {
        return this.f29450e.getSubtitle();
    }

    @Override // p137i.AbstractC5134b
    /* renamed from: i */
    public CharSequence mo21711i() {
        return this.f29450e.getTitle();
    }

    @Override // p137i.AbstractC5134b
    /* renamed from: k */
    public void mo21712k() {
        this.f29451f.mo21625c(this, this.f29455j);
    }

    @Override // p137i.AbstractC5134b
    /* renamed from: l */
    public boolean mo21713l() {
        return this.f29450e.m1059j();
    }

    @Override // p137i.AbstractC5134b
    /* renamed from: m */
    public void mo21714m(View view) {
        this.f29450e.setCustomView(view);
        this.f29452g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p137i.AbstractC5134b
    /* renamed from: n */
    public void mo21715n(int i10) {
        mo21716o(this.f29449d.getString(i10));
    }

    @Override // p137i.AbstractC5134b
    /* renamed from: o */
    public void mo21716o(CharSequence charSequence) {
        this.f29450e.setSubtitle(charSequence);
    }

    @Override // p137i.AbstractC5134b
    /* renamed from: q */
    public void mo21717q(int i10) {
        mo21718r(this.f29449d.getString(i10));
    }

    @Override // p137i.AbstractC5134b
    /* renamed from: r */
    public void mo21718r(CharSequence charSequence) {
        this.f29450e.setTitle(charSequence);
    }

    @Override // p137i.AbstractC5134b
    /* renamed from: s */
    public void mo21719s(boolean z10) {
        super.mo21719s(z10);
        this.f29450e.setTitleOptional(z10);
    }
}
