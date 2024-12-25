package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.InterfaceC0569e0;
import p221n0.C6616h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/i.class
 */
/* renamed from: androidx.fragment.app.i */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/i.class */
public class C0423i {

    /* renamed from: a */
    public final AbstractC0425k<?> f2903a;

    public C0423i(AbstractC0425k<?> abstractC0425k) {
        this.f2903a = abstractC0425k;
    }

    /* renamed from: b */
    public static C0423i m2078b(AbstractC0425k<?> abstractC0425k) {
        return new C0423i((AbstractC0425k) C6616h.m30528f(abstractC0425k, "callbacks == null"));
    }

    /* renamed from: a */
    public void m2079a(Fragment fragment) {
        AbstractC0425k<?> abstractC0425k = this.f2903a;
        abstractC0425k.f2909f.m2211k(abstractC0425k, abstractC0425k, fragment);
    }

    /* renamed from: c */
    public void m2080c() {
        this.f2903a.f2909f.m2254z();
    }

    /* renamed from: d */
    public void m2081d(Configuration configuration) {
        this.f2903a.f2909f.m2136B(configuration);
    }

    /* renamed from: e */
    public boolean m2082e(MenuItem menuItem) {
        return this.f2903a.f2909f.m2138C(menuItem);
    }

    /* renamed from: f */
    public void m2083f() {
        this.f2903a.f2909f.m2140D();
    }

    /* renamed from: g */
    public boolean m2084g(Menu menu, MenuInflater menuInflater) {
        return this.f2903a.f2909f.m2142E(menu, menuInflater);
    }

    /* renamed from: h */
    public void m2085h() {
        this.f2903a.f2909f.m2144F();
    }

    /* renamed from: i */
    public void m2086i() {
        this.f2903a.f2909f.m2147H();
    }

    /* renamed from: j */
    public void m2087j(boolean z10) {
        this.f2903a.f2909f.m2149I(z10);
    }

    /* renamed from: k */
    public boolean m2088k(MenuItem menuItem) {
        return this.f2903a.f2909f.m2153K(menuItem);
    }

    /* renamed from: l */
    public void m2089l(Menu menu) {
        this.f2903a.f2909f.m2155L(menu);
    }

    /* renamed from: m */
    public void m2090m() {
        this.f2903a.f2909f.m2159N();
    }

    /* renamed from: n */
    public void m2091n(boolean z10) {
        this.f2903a.f2909f.m2161O(z10);
    }

    /* renamed from: o */
    public boolean m2092o(Menu menu) {
        return this.f2903a.f2909f.m2163P(menu);
    }

    /* renamed from: p */
    public void m2093p() {
        this.f2903a.f2909f.m2167R();
    }

    /* renamed from: q */
    public void m2094q() {
        this.f2903a.f2909f.m2169S();
    }

    /* renamed from: r */
    public void m2095r() {
        this.f2903a.f2909f.m2173U();
    }

    /* renamed from: s */
    public boolean m2096s() {
        return this.f2903a.f2909f.m2187b0(true);
    }

    /* renamed from: t */
    public AbstractC0428n m2097t() {
        return this.f2903a.f2909f;
    }

    /* renamed from: u */
    public void m2098u() {
        this.f2903a.f2909f.m2174U0();
    }

    /* renamed from: v */
    public View m2099v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2903a.f2909f.m2244v0().onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: w */
    public void m2100w(Parcelable parcelable) {
        AbstractC0425k<?> abstractC0425k = this.f2903a;
        if (!(abstractC0425k instanceof InterfaceC0569e0)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        abstractC0425k.f2909f.m2213k1(parcelable);
    }

    /* renamed from: x */
    public Parcelable m2101x() {
        return this.f2903a.f2909f.m2218m1();
    }
}
