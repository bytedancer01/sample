package com.maxdigitall.maxdigitaliptvbox.view.fragment;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.speech.SpeechRecognizer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.leanback.app.C0442b;
import androidx.leanback.widget.AbstractC0494a0;
import androidx.leanback.widget.AbstractC0519j0;
import androidx.leanback.widget.AbstractC0537r0;
import androidx.leanback.widget.C0529o0;
import androidx.leanback.widget.InterfaceC0506e0;
import androidx.leanback.widget.InterfaceC0509f0;
import androidx.leanback.widget.InterfaceC0551y0;
import androidx.leanback.widget.SearchBar;
import androidx.leanback.widget.VerticalGridView;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/a.class
 */
/* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.a */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/a.class */
public class C3746a extends Fragment {

    /* renamed from: A */
    public static final String f22437A;

    /* renamed from: x */
    public static final String f22438x = C3746a.class.getSimpleName();

    /* renamed from: y */
    public static final String f22439y;

    /* renamed from: z */
    public static final String f22440z;

    /* renamed from: g */
    public C0442b f22446g;

    /* renamed from: h */
    public SearchBar f22447h;

    /* renamed from: i */
    public i f22448i;

    /* renamed from: k */
    public InterfaceC0509f0 f22450k;

    /* renamed from: l */
    public InterfaceC0506e0 f22451l;

    /* renamed from: m */
    public AbstractC0494a0 f22452m;

    /* renamed from: n */
    public InterfaceC0551y0 f22453n;

    /* renamed from: o */
    public String f22454o;

    /* renamed from: p */
    public Drawable f22455p;

    /* renamed from: q */
    public h f22456q;

    /* renamed from: r */
    public SpeechRecognizer f22457r;

    /* renamed from: s */
    public int f22458s;

    /* renamed from: u */
    public boolean f22460u;

    /* renamed from: v */
    public boolean f22461v;

    /* renamed from: b */
    public final AbstractC0494a0.b f22441b = new a(this);

    /* renamed from: c */
    public final Handler f22442c = new Handler();

    /* renamed from: d */
    public final Runnable f22443d = new b(this);

    /* renamed from: e */
    public final Runnable f22444e = new c(this);

    /* renamed from: f */
    public final Runnable f22445f = new d(this);

    /* renamed from: j */
    public String f22449j = null;

    /* renamed from: t */
    public boolean f22459t = true;

    /* renamed from: w */
    public SearchBar.InterfaceC0486l f22462w = new e(this);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/a$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.a$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/a$a.class */
    public class a extends AbstractC0494a0.b {

        /* renamed from: a */
        public final C3746a f22463a;

        public a(C3746a c3746a) {
            this.f22463a = c3746a;
        }

        @Override // androidx.leanback.widget.AbstractC0494a0.b
        /* renamed from: a */
        public void mo2546a() {
            C3746a c3746a = this.f22463a;
            c3746a.f22442c.removeCallbacks(c3746a.f22443d);
            C3746a c3746a2 = this.f22463a;
            c3746a2.f22442c.post(c3746a2.f22443d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/a$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.a$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/a$b.class */
    public class b implements Runnable {

        /* renamed from: b */
        public final C3746a f22464b;

        public b(C3746a c3746a) {
            this.f22464b = c3746a;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0442b c0442b = this.f22464b.f22446g;
            if (c0442b != null) {
                AbstractC0494a0 m2409n = c0442b.m2409n();
                C3746a c3746a = this.f22464b;
                if (m2409n != c3746a.f22452m && (c3746a.f22446g.m2409n() != null || this.f22464b.f22452m.mo2536i() != 0)) {
                    C3746a c3746a2 = this.f22464b;
                    c3746a2.f22446g.m2416y(c3746a2.f22452m);
                    this.f22464b.f22446g.mo2405B(0);
                }
            }
            this.f22464b.m18232T();
            C3746a c3746a3 = this.f22464b;
            int i10 = c3746a3.f22458s | 1;
            c3746a3.f22458s = i10;
            if ((i10 & 2) != 0) {
                c3746a3.m18230O();
            }
            this.f22464b.m18231S();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/a$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.a$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/a$c.class */
    public class c implements Runnable {

        /* renamed from: b */
        public final C3746a f22465b;

        public c(C3746a c3746a) {
            this.f22465b = c3746a;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0494a0 abstractC0494a0;
            C3746a c3746a = this.f22465b;
            if (c3746a.f22446g == null) {
                return;
            }
            AbstractC0494a0 mo18132l = c3746a.f22448i.mo18132l();
            C3746a c3746a2 = this.f22465b;
            AbstractC0494a0 abstractC0494a02 = c3746a2.f22452m;
            if (mo18132l != abstractC0494a02) {
                boolean z10 = abstractC0494a02 == null;
                c3746a2.m18239w();
                C3746a c3746a3 = this.f22465b;
                c3746a3.f22452m = mo18132l;
                if (mo18132l != null) {
                    mo18132l.m2542g(c3746a3.f22441b);
                }
                if (!z10 || ((abstractC0494a0 = this.f22465b.f22452m) != null && abstractC0494a0.mo2536i() != 0)) {
                    C3746a c3746a4 = this.f22465b;
                    c3746a4.f22446g.m2416y(c3746a4.f22452m);
                }
                this.f22465b.m18234n();
            }
            this.f22465b.m18231S();
            C3746a c3746a5 = this.f22465b;
            if (!c3746a5.f22459t) {
                c3746a5.m18230O();
                return;
            }
            c3746a5.f22442c.removeCallbacks(c3746a5.f22445f);
            C3746a c3746a6 = this.f22465b;
            c3746a6.f22442c.postDelayed(c3746a6.f22445f, 300L);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/a$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.a$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/a$d.class */
    public class d implements Runnable {

        /* renamed from: b */
        public final C3746a f22466b;

        public d(C3746a c3746a) {
            this.f22466b = c3746a;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3746a c3746a = this.f22466b;
            c3746a.f22459t = false;
            c3746a.f22447h.m2506i();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/a$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.a$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/a$e.class */
    public class e implements SearchBar.InterfaceC0486l {

        /* renamed from: a */
        public final C3746a f22467a;

        public e(C3746a c3746a) {
            this.f22467a = c3746a;
        }

        @Override // androidx.leanback.widget.SearchBar.InterfaceC0486l
        /* renamed from: a */
        public void mo2516a() {
            this.f22467a.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 0);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/a$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.a$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/a$f.class */
    public class f implements SearchBar.InterfaceC0485k {

        /* renamed from: a */
        public final C3746a f22468a;

        public f(C3746a c3746a) {
            this.f22468a = c3746a;
        }

        @Override // androidx.leanback.widget.SearchBar.InterfaceC0485k
        /* renamed from: a */
        public void mo2513a(String str) {
            C3746a c3746a = this.f22468a;
            if (c3746a.f22448i != null) {
                c3746a.m18241y(str);
            } else {
                c3746a.f22449j = str;
            }
        }

        @Override // androidx.leanback.widget.SearchBar.InterfaceC0485k
        /* renamed from: b */
        public void mo2514b(String str) {
            this.f22468a.m18237s();
        }

        @Override // androidx.leanback.widget.SearchBar.InterfaceC0485k
        /* renamed from: c */
        public void mo2515c(String str) {
            this.f22468a.m18229N(str);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/a$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.a$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/a$g.class */
    public class g implements InterfaceC0509f0 {

        /* renamed from: a */
        public final C3746a f22469a;

        public g(C3746a c3746a) {
            this.f22469a = c3746a;
        }

        @Override // androidx.leanback.widget.InterfaceC0502d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2579a(AbstractC0519j0.a aVar, Object obj, AbstractC0537r0.b bVar, C0529o0 c0529o0) {
            this.f22469a.m18232T();
            InterfaceC0509f0 interfaceC0509f0 = this.f22469a.f22450k;
            if (interfaceC0509f0 != null) {
                interfaceC0509f0.mo2579a(aVar, obj, bVar, c0529o0);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/a$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.a$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/a$h.class */
    public static class h {

        /* renamed from: a */
        public String f22470a;

        /* renamed from: b */
        public boolean f22471b;

        public h(String str, boolean z10) {
            this.f22470a = str;
            this.f22471b = z10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/a$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.a$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/a$i.class */
    public interface i {
        /* renamed from: l */
        AbstractC0494a0 mo18132l();

        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    static {
        String canonicalName = C3746a.class.getCanonicalName();
        f22439y = canonicalName;
        f22440z = canonicalName + ".query";
        f22437A = canonicalName + ".title";
    }

    /* renamed from: A */
    public void m18221A(Drawable drawable) {
        this.f22455p = drawable;
        SearchBar searchBar = this.f22447h;
        if (searchBar != null) {
            searchBar.setBadgeDrawable(drawable);
        }
    }

    /* renamed from: B */
    public void m18222B(InterfaceC0506e0 interfaceC0506e0) {
        if (interfaceC0506e0 != this.f22451l) {
            this.f22451l = interfaceC0506e0;
            C0442b c0442b = this.f22446g;
            if (c0442b != null) {
                c0442b.m2428N(interfaceC0506e0);
            }
        }
    }

    /* renamed from: E */
    public void m18223E(Intent intent, boolean z10) {
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
        if (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) {
            return;
        }
        m18225G(stringArrayListExtra.get(0), z10);
    }

    /* renamed from: F */
    public final void m18224F(String str) {
        this.f22447h.setSearchQuery(str);
    }

    /* renamed from: G */
    public void m18225G(String str, boolean z10) {
        if (str == null) {
            return;
        }
        this.f22456q = new h(str, z10);
        m18233m();
        if (this.f22459t) {
            this.f22459t = false;
            this.f22442c.removeCallbacks(this.f22445f);
        }
    }

    /* renamed from: I */
    public void m18226I(i iVar) {
        if (this.f22448i != iVar) {
            this.f22448i = iVar;
            m18236q();
        }
    }

    /* renamed from: J */
    public void m18227J(String str) {
        this.f22454o = str;
        SearchBar searchBar = this.f22447h;
        if (searchBar != null) {
            searchBar.setTitle(str);
        }
    }

    /* renamed from: M */
    public void m18228M() {
        if (this.f22460u) {
            this.f22461v = true;
        } else {
            this.f22447h.m2506i();
        }
    }

    /* renamed from: N */
    public void m18229N(String str) {
        m18237s();
        i iVar = this.f22448i;
        if (iVar != null) {
            iVar.onQueryTextSubmit(str);
        }
    }

    /* renamed from: O */
    public void m18230O() {
        C0442b c0442b;
        AbstractC0494a0 abstractC0494a0 = this.f22452m;
        if (abstractC0494a0 == null || abstractC0494a0.mo2536i() <= 0 || (c0442b = this.f22446g) == null || c0442b.m2409n() != this.f22452m) {
            this.f22447h.requestFocus();
        } else {
            m18235p();
        }
    }

    /* renamed from: S */
    public void m18231S() {
        AbstractC0494a0 abstractC0494a0;
        C0442b c0442b;
        if (this.f22447h == null || (abstractC0494a0 = this.f22452m) == null) {
            return;
        }
        this.f22447h.setNextFocusDownId((abstractC0494a0.mo2536i() == 0 || (c0442b = this.f22446g) == null || c0442b.m2413u() == null) ? 0 : this.f22446g.m2413u().getId());
    }

    /* renamed from: T */
    public void m18232T() {
        AbstractC0494a0 abstractC0494a0;
        C0442b c0442b = this.f22446g;
        this.f22447h.setVisibility(((c0442b != null ? c0442b.mo2412s() : -1) <= 0 || (abstractC0494a0 = this.f22452m) == null || abstractC0494a0.mo2536i() == 0) ? 0 : 8);
    }

    /* renamed from: m */
    public final void m18233m() {
        SearchBar searchBar;
        h hVar = this.f22456q;
        if (hVar == null || (searchBar = this.f22447h) == null) {
            return;
        }
        searchBar.setSearchQuery(hVar.f22470a);
        h hVar2 = this.f22456q;
        if (hVar2.f22471b) {
            m18229N(hVar2.f22470a);
        }
        this.f22456q = null;
    }

    /* renamed from: n */
    public void m18234n() {
        String str = this.f22449j;
        if (str == null || this.f22452m == null) {
            return;
        }
        this.f22449j = null;
        m18241y(str);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        if (this.f22459t) {
            this.f22459t = bundle == null;
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(2131624301, viewGroup, false);
        SearchBar searchBar = (SearchBar) ((FrameLayout) inflate.findViewById(2131428286)).findViewById(2131428282);
        this.f22447h = searchBar;
        searchBar.setSearchBarListener(new f(this));
        this.f22447h.setSpeechRecognitionCallback(this.f22453n);
        this.f22447h.setPermissionListener(this.f22462w);
        m18233m();
        m18238u(getArguments());
        Drawable drawable = this.f22455p;
        if (drawable != null) {
            m18221A(drawable);
        }
        String str = this.f22454o;
        if (str != null) {
            m18227J(str);
        }
        if (getChildFragmentManager().m2203h0(2131428280) == null) {
            this.f22446g = new C0442b();
            getChildFragmentManager().m2216m().m2370r(2131428280, this.f22446g).mo1964j();
        } else {
            this.f22446g = (C0442b) getChildFragmentManager().m2203h0(2131428280);
        }
        this.f22446g.m2429O(new g(this));
        this.f22446g.m2428N(this.f22451l);
        this.f22446g.m2427M(true);
        if (this.f22448i != null) {
            m18236q();
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        m18239w();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        m18240x();
        this.f22460u = true;
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 == 0 && strArr.length > 0 && strArr[0].equals("android.permission.RECORD_AUDIO") && iArr[0] == 0) {
            m18228M();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f22460u = false;
        if (this.f22453n == null && this.f22457r == null) {
            SpeechRecognizer createSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(getContext());
            this.f22457r = createSpeechRecognizer;
            this.f22447h.setSpeechRecognizer(createSpeechRecognizer);
        }
        if (!this.f22461v) {
            this.f22447h.m2507j();
        } else {
            this.f22461v = false;
            this.f22447h.m2506i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        VerticalGridView m2413u = this.f22446g.m2413u();
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131166447);
        m2413u.setItemAlignmentOffset(0);
        m2413u.setItemAlignmentOffsetPercent(-1.0f);
        m2413u.setWindowAlignmentOffset(dimensionPixelSize);
        m2413u.setWindowAlignmentOffsetPercent(-1.0f);
        m2413u.setWindowAlignment(0);
        m2413u.setFocusable(false);
        m2413u.setFocusableInTouchMode(false);
    }

    /* renamed from: p */
    public final void m18235p() {
        C0442b c0442b = this.f22446g;
        if (c0442b == null || c0442b.m2413u() == null || this.f22452m.mo2536i() == 0 || !this.f22446g.m2413u().requestFocus()) {
            return;
        }
        this.f22458s &= -2;
    }

    /* renamed from: q */
    public final void m18236q() {
        this.f22442c.removeCallbacks(this.f22444e);
        this.f22442c.post(this.f22444e);
    }

    /* renamed from: s */
    public void m18237s() {
        this.f22458s |= 2;
        m18235p();
    }

    /* renamed from: u */
    public final void m18238u(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        String str = f22440z;
        if (bundle.containsKey(str)) {
            m18224F(bundle.getString(str));
        }
        String str2 = f22437A;
        if (bundle.containsKey(str2)) {
            m18227J(bundle.getString(str2));
        }
    }

    /* renamed from: w */
    public void m18239w() {
        AbstractC0494a0 abstractC0494a0 = this.f22452m;
        if (abstractC0494a0 != null) {
            abstractC0494a0.m2544j(this.f22441b);
            this.f22452m = null;
        }
    }

    /* renamed from: x */
    public final void m18240x() {
        try {
            if (this.f22457r != null) {
                this.f22447h.setSpeechRecognizer(null);
                this.f22457r.destroy();
                this.f22457r = null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            Log.e(f22438x, e10.getMessage());
        }
    }

    /* renamed from: y */
    public void m18241y(String str) {
        if (this.f22448i.onQueryTextChange(str)) {
            this.f22458s &= -3;
        }
    }
}
