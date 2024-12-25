package p049d;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.C0250e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0316g1;
import androidx.appcompat.widget.InterfaceC0333m0;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p029c.C0920a;
import p029c.C0925f;
import p029c.C0929j;
import p049d.AbstractC4275a;
import p137i.AbstractC5134b;
import p137i.C5133a;
import p137i.C5139g;
import p137i.C5140h;
import p235o0.C6807a1;
import p235o0.C6824g0;
import p235o0.C6864y0;
import p235o0.InterfaceC6810b1;
import p235o0.InterfaceC6866z0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:d/n.class
 */
/* renamed from: d.n */
/* loaded from: combined.jar:classes1.jar:d/n.class */
public class C4288n extends AbstractC4275a implements ActionBarOverlayLayout.InterfaceC0262d {

    /* renamed from: E */
    public static final Interpolator f26375E = new AccelerateInterpolator();

    /* renamed from: F */
    public static final Interpolator f26376F = new DecelerateInterpolator();

    /* renamed from: A */
    public boolean f26377A;

    /* renamed from: a */
    public Context f26381a;

    /* renamed from: b */
    public Context f26382b;

    /* renamed from: c */
    public Activity f26383c;

    /* renamed from: d */
    public ActionBarOverlayLayout f26384d;

    /* renamed from: e */
    public ActionBarContainer f26385e;

    /* renamed from: f */
    public InterfaceC0333m0 f26386f;

    /* renamed from: g */
    public ActionBarContextView f26387g;

    /* renamed from: h */
    public View f26388h;

    /* renamed from: i */
    public C0316g1 f26389i;

    /* renamed from: l */
    public boolean f26392l;

    /* renamed from: m */
    public d f26393m;

    /* renamed from: n */
    public AbstractC5134b f26394n;

    /* renamed from: o */
    public AbstractC5134b.a f26395o;

    /* renamed from: p */
    public boolean f26396p;

    /* renamed from: r */
    public boolean f26398r;

    /* renamed from: u */
    public boolean f26401u;

    /* renamed from: v */
    public boolean f26402v;

    /* renamed from: w */
    public boolean f26403w;

    /* renamed from: y */
    public C5140h f26405y;

    /* renamed from: z */
    public boolean f26406z;

    /* renamed from: j */
    public ArrayList<Object> f26390j = new ArrayList<>();

    /* renamed from: k */
    public int f26391k = -1;

    /* renamed from: q */
    public ArrayList<AbstractC4275a.b> f26397q = new ArrayList<>();

    /* renamed from: s */
    public int f26399s = 0;

    /* renamed from: t */
    public boolean f26400t = true;

    /* renamed from: x */
    public boolean f26404x = true;

    /* renamed from: B */
    public final InterfaceC6866z0 f26378B = new a(this);

    /* renamed from: C */
    public final InterfaceC6866z0 f26379C = new b(this);

    /* renamed from: D */
    public final InterfaceC6810b1 f26380D = new c(this);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/n$a.class
     */
    /* renamed from: d.n$a */
    /* loaded from: combined.jar:classes1.jar:d/n$a.class */
    public class a extends C6807a1 {

        /* renamed from: a */
        public final C4288n f26407a;

        public a(C4288n c4288n) {
            this.f26407a = c4288n;
        }

        @Override // p235o0.InterfaceC6866z0
        /* renamed from: b */
        public void mo1239b(View view) {
            View view2;
            C4288n c4288n = this.f26407a;
            if (c4288n.f26400t && (view2 = c4288n.f26388h) != null) {
                view2.setTranslationY(0.0f);
                this.f26407a.f26385e.setTranslationY(0.0f);
            }
            this.f26407a.f26385e.setVisibility(8);
            this.f26407a.f26385e.setTransitioning(false);
            C4288n c4288n2 = this.f26407a;
            c4288n2.f26405y = null;
            c4288n2.m21689A();
            ActionBarOverlayLayout actionBarOverlayLayout = this.f26407a.f26384d;
            if (actionBarOverlayLayout != null) {
                C6824g0.m31533m0(actionBarOverlayLayout);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/n$b.class
     */
    /* renamed from: d.n$b */
    /* loaded from: combined.jar:classes1.jar:d/n$b.class */
    public class b extends C6807a1 {

        /* renamed from: a */
        public final C4288n f26408a;

        public b(C4288n c4288n) {
            this.f26408a = c4288n;
        }

        @Override // p235o0.InterfaceC6866z0
        /* renamed from: b */
        public void mo1239b(View view) {
            C4288n c4288n = this.f26408a;
            c4288n.f26405y = null;
            c4288n.f26385e.requestLayout();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/n$c.class
     */
    /* renamed from: d.n$c */
    /* loaded from: combined.jar:classes1.jar:d/n$c.class */
    public class c implements InterfaceC6810b1 {

        /* renamed from: a */
        public final C4288n f26409a;

        public c(C4288n c4288n) {
            this.f26409a = c4288n;
        }

        @Override // p235o0.InterfaceC6810b1
        /* renamed from: a */
        public void mo21705a(View view) {
            ((View) this.f26409a.f26385e.getParent()).invalidate();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/n$d.class
     */
    /* renamed from: d.n$d */
    /* loaded from: combined.jar:classes1.jar:d/n$d.class */
    public class d extends AbstractC5134b implements C0250e.a {

        /* renamed from: d */
        public final Context f26410d;

        /* renamed from: e */
        public final C0250e f26411e;

        /* renamed from: f */
        public AbstractC5134b.a f26412f;

        /* renamed from: g */
        public WeakReference<View> f26413g;

        /* renamed from: h */
        public final C4288n f26414h;

        public d(C4288n c4288n, Context context, AbstractC5134b.a aVar) {
            this.f26414h = c4288n;
            this.f26410d = context;
            this.f26412f = aVar;
            C0250e m966S = new C0250e(context).m966S(1);
            this.f26411e = m966S;
            m966S.mo965R(this);
        }

        @Override // androidx.appcompat.view.menu.C0250e.a
        /* renamed from: a */
        public boolean mo1003a(C0250e c0250e, MenuItem menuItem) {
            AbstractC5134b.a aVar = this.f26412f;
            if (aVar != null) {
                return aVar.mo21623a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0250e.a
        /* renamed from: b */
        public void mo1004b(C0250e c0250e) {
            if (this.f26412f == null) {
                return;
            }
            mo21712k();
            this.f26414h.f26387g.m1061l();
        }

        @Override // p137i.AbstractC5134b
        /* renamed from: c */
        public void mo21706c() {
            C4288n c4288n = this.f26414h;
            if (c4288n.f26393m != this) {
                return;
            }
            if (C4288n.m21688z(c4288n.f26401u, c4288n.f26402v, false)) {
                this.f26412f.mo21624b(this);
            } else {
                C4288n c4288n2 = this.f26414h;
                c4288n2.f26394n = this;
                c4288n2.f26395o = this.f26412f;
            }
            this.f26412f = null;
            this.f26414h.m21704y(false);
            this.f26414h.f26387g.m1056g();
            this.f26414h.f26386f.mo1490o().sendAccessibilityEvent(32);
            C4288n c4288n3 = this.f26414h;
            c4288n3.f26384d.setHideOnContentScrollEnabled(c4288n3.f26377A);
            this.f26414h.f26393m = null;
        }

        @Override // p137i.AbstractC5134b
        /* renamed from: d */
        public View mo21707d() {
            WeakReference<View> weakReference = this.f26413g;
            return weakReference != null ? weakReference.get() : null;
        }

        @Override // p137i.AbstractC5134b
        /* renamed from: e */
        public Menu mo21708e() {
            return this.f26411e;
        }

        @Override // p137i.AbstractC5134b
        /* renamed from: f */
        public MenuInflater mo21709f() {
            return new C5139g(this.f26410d);
        }

        @Override // p137i.AbstractC5134b
        /* renamed from: g */
        public CharSequence mo21710g() {
            return this.f26414h.f26387g.getSubtitle();
        }

        @Override // p137i.AbstractC5134b
        /* renamed from: i */
        public CharSequence mo21711i() {
            return this.f26414h.f26387g.getTitle();
        }

        @Override // p137i.AbstractC5134b
        /* renamed from: k */
        public void mo21712k() {
            if (this.f26414h.f26393m != this) {
                return;
            }
            this.f26411e.m981d0();
            try {
                this.f26412f.mo21625c(this, this.f26411e);
            } finally {
                this.f26411e.m979c0();
            }
        }

        @Override // p137i.AbstractC5134b
        /* renamed from: l */
        public boolean mo21713l() {
            return this.f26414h.f26387g.m1059j();
        }

        @Override // p137i.AbstractC5134b
        /* renamed from: m */
        public void mo21714m(View view) {
            this.f26414h.f26387g.setCustomView(view);
            this.f26413g = new WeakReference<>(view);
        }

        @Override // p137i.AbstractC5134b
        /* renamed from: n */
        public void mo21715n(int i10) {
            mo21716o(this.f26414h.f26381a.getResources().getString(i10));
        }

        @Override // p137i.AbstractC5134b
        /* renamed from: o */
        public void mo21716o(CharSequence charSequence) {
            this.f26414h.f26387g.setSubtitle(charSequence);
        }

        @Override // p137i.AbstractC5134b
        /* renamed from: q */
        public void mo21717q(int i10) {
            mo21718r(this.f26414h.f26381a.getResources().getString(i10));
        }

        @Override // p137i.AbstractC5134b
        /* renamed from: r */
        public void mo21718r(CharSequence charSequence) {
            this.f26414h.f26387g.setTitle(charSequence);
        }

        @Override // p137i.AbstractC5134b
        /* renamed from: s */
        public void mo21719s(boolean z10) {
            super.mo21719s(z10);
            this.f26414h.f26387g.setTitleOptional(z10);
        }

        /* renamed from: t */
        public boolean m21720t() {
            this.f26411e.m981d0();
            try {
                return this.f26412f.mo21626d(this, this.f26411e);
            } finally {
                this.f26411e.m979c0();
            }
        }
    }

    public C4288n(Activity activity, boolean z10) {
        this.f26383c = activity;
        View decorView = activity.getWindow().getDecorView();
        m21695G(decorView);
        if (z10) {
            return;
        }
        this.f26388h = decorView.findViewById(R.id.content);
    }

    public C4288n(Dialog dialog) {
        m21695G(dialog.getWindow().getDecorView());
    }

    /* renamed from: z */
    public static boolean m21688z(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    /* renamed from: A */
    public void m21689A() {
        AbstractC5134b.a aVar = this.f26395o;
        if (aVar != null) {
            aVar.mo21624b(this.f26394n);
            this.f26394n = null;
            this.f26395o = null;
        }
    }

    /* renamed from: B */
    public void m21690B(boolean z10) {
        View view;
        C5140h c5140h = this.f26405y;
        if (c5140h != null) {
            c5140h.m25764a();
        }
        if (this.f26399s != 0 || (!this.f26406z && !z10)) {
            this.f26378B.mo1239b(null);
            return;
        }
        this.f26385e.setAlpha(1.0f);
        this.f26385e.setTransitioning(true);
        C5140h c5140h2 = new C5140h();
        float f10 = -this.f26385e.getHeight();
        float f11 = f10;
        if (z10) {
            this.f26385e.getLocationInWindow(new int[]{0, 0});
            f11 = f10 - r0[1];
        }
        C6864y0 m31683m = C6824g0.m31514d(this.f26385e).m31683m(f11);
        m31683m.m31681k(this.f26380D);
        c5140h2.m25766c(m31683m);
        if (this.f26400t && (view = this.f26388h) != null) {
            c5140h2.m25766c(C6824g0.m31514d(view).m31683m(f11));
        }
        c5140h2.m25769f(f26375E);
        c5140h2.m25768e(250L);
        c5140h2.m25770g(this.f26378B);
        this.f26405y = c5140h2;
        c5140h2.m25771h();
    }

    /* renamed from: C */
    public void m21691C(boolean z10) {
        View view;
        View view2;
        C5140h c5140h = this.f26405y;
        if (c5140h != null) {
            c5140h.m25764a();
        }
        this.f26385e.setVisibility(0);
        if (this.f26399s == 0 && (this.f26406z || z10)) {
            this.f26385e.setTranslationY(0.0f);
            float f10 = -this.f26385e.getHeight();
            float f11 = f10;
            if (z10) {
                this.f26385e.getLocationInWindow(new int[]{0, 0});
                f11 = f10 - r0[1];
            }
            this.f26385e.setTranslationY(f11);
            C5140h c5140h2 = new C5140h();
            C6864y0 m31683m = C6824g0.m31514d(this.f26385e).m31683m(0.0f);
            m31683m.m31681k(this.f26380D);
            c5140h2.m25766c(m31683m);
            if (this.f26400t && (view2 = this.f26388h) != null) {
                view2.setTranslationY(f11);
                c5140h2.m25766c(C6824g0.m31514d(this.f26388h).m31683m(0.0f));
            }
            c5140h2.m25769f(f26376F);
            c5140h2.m25768e(250L);
            c5140h2.m25770g(this.f26379C);
            this.f26405y = c5140h2;
            c5140h2.m25771h();
        } else {
            this.f26385e.setAlpha(1.0f);
            this.f26385e.setTranslationY(0.0f);
            if (this.f26400t && (view = this.f26388h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f26379C.mo1239b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f26384d;
        if (actionBarOverlayLayout != null) {
            C6824g0.m31533m0(actionBarOverlayLayout);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D */
    public final InterfaceC0333m0 m21692D(View view) {
        if (view instanceof InterfaceC0333m0) {
            return (InterfaceC0333m0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: E */
    public int m21693E() {
        return this.f26386f.mo1488m();
    }

    /* renamed from: F */
    public final void m21694F() {
        if (this.f26403w) {
            this.f26403w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f26384d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m21703O(false);
        }
    }

    /* renamed from: G */
    public final void m21695G(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C0925f.f6232p);
        this.f26384d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f26386f = m21692D(view.findViewById(C0925f.f6217a));
        this.f26387g = (ActionBarContextView) view.findViewById(C0925f.f6222f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C0925f.f6219c);
        this.f26385e = actionBarContainer;
        InterfaceC0333m0 interfaceC0333m0 = this.f26386f;
        if (interfaceC0333m0 == null || this.f26387g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f26381a = interfaceC0333m0.mo1477b();
        boolean z10 = (this.f26386f.mo1500y() & 4) != 0;
        if (z10) {
            this.f26392l = true;
        }
        C5133a m25734b = C5133a.m25734b(this.f26381a);
        m21700L(m25734b.m25735a() || z10);
        m21698J(m25734b.m25740g());
        TypedArray obtainStyledAttributes = this.f26381a.obtainStyledAttributes(null, C0929j.f6412a, C0920a.f6108c, 0);
        if (obtainStyledAttributes.getBoolean(C0929j.f6469k, false)) {
            m21699K(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0929j.f6459i, 0);
        if (dimensionPixelSize != 0) {
            m21697I(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: H */
    public void m21696H(int i10, int i11) {
        int mo1500y = this.f26386f.mo1500y();
        if ((i11 & 4) != 0) {
            this.f26392l = true;
        }
        this.f26386f.mo1485j((i10 & i11) | ((i11 ^ (-1)) & mo1500y));
    }

    /* renamed from: I */
    public void m21697I(float f10) {
        C6824g0.m31553w0(this.f26385e, f10);
    }

    /* renamed from: J */
    public final void m21698J(boolean z10) {
        this.f26398r = z10;
        if (z10) {
            this.f26385e.setTabContainer(null);
            this.f26386f.mo1495t(this.f26389i);
        } else {
            this.f26386f.mo1495t(null);
            this.f26385e.setTabContainer(this.f26389i);
        }
        boolean z11 = m21693E() == 2;
        C0316g1 c0316g1 = this.f26389i;
        if (c0316g1 != null) {
            if (z11) {
                c0316g1.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f26384d;
                if (actionBarOverlayLayout != null) {
                    C6824g0.m31533m0(actionBarOverlayLayout);
                }
            } else {
                c0316g1.setVisibility(8);
            }
        }
        this.f26386f.mo1493r(!this.f26398r && z11);
        this.f26384d.setHasNonEmbeddedTabs(!this.f26398r && z11);
    }

    /* renamed from: K */
    public void m21699K(boolean z10) {
        if (z10 && !this.f26384d.m1086w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f26377A = z10;
        this.f26384d.setHideOnContentScrollEnabled(z10);
    }

    /* renamed from: L */
    public void m21700L(boolean z10) {
        this.f26386f.mo1491p(z10);
    }

    /* renamed from: M */
    public final boolean m21701M() {
        return C6824g0.m31502U(this.f26385e);
    }

    /* renamed from: N */
    public final void m21702N() {
        if (this.f26403w) {
            return;
        }
        this.f26403w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f26384d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        m21703O(false);
    }

    /* renamed from: O */
    public final void m21703O(boolean z10) {
        if (m21688z(this.f26401u, this.f26402v, this.f26403w)) {
            if (this.f26404x) {
                return;
            }
            this.f26404x = true;
            m21691C(z10);
            return;
        }
        if (this.f26404x) {
            this.f26404x = false;
            m21690B(z10);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0262d
    /* renamed from: a */
    public void mo1090a() {
        if (this.f26402v) {
            this.f26402v = false;
            m21703O(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0262d
    /* renamed from: b */
    public void mo1091b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0262d
    /* renamed from: c */
    public void mo1092c(boolean z10) {
        this.f26400t = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0262d
    /* renamed from: d */
    public void mo1093d() {
        if (this.f26402v) {
            return;
        }
        this.f26402v = true;
        m21703O(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0262d
    /* renamed from: e */
    public void mo1094e() {
        C5140h c5140h = this.f26405y;
        if (c5140h != null) {
            c5140h.m25764a();
            this.f26405y = null;
        }
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: g */
    public boolean mo21510g() {
        InterfaceC0333m0 interfaceC0333m0 = this.f26386f;
        if (interfaceC0333m0 == null || !interfaceC0333m0.mo1484i()) {
            return false;
        }
        this.f26386f.collapseActionView();
        return true;
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: h */
    public void mo21511h(boolean z10) {
        if (z10 == this.f26396p) {
            return;
        }
        this.f26396p = z10;
        int size = this.f26397q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f26397q.get(i10).onMenuVisibilityChanged(z10);
        }
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: i */
    public int mo21512i() {
        return this.f26386f.mo1500y();
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: j */
    public Context mo21513j() {
        if (this.f26382b == null) {
            TypedValue typedValue = new TypedValue();
            this.f26381a.getTheme().resolveAttribute(C0920a.f6112g, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f26382b = new ContextThemeWrapper(this.f26381a, i10);
            } else {
                this.f26382b = this.f26381a;
            }
        }
        return this.f26382b;
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: l */
    public void mo21515l(Configuration configuration) {
        m21698J(C5133a.m25734b(this.f26381a).m25740g());
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: n */
    public boolean mo21517n(int i10, KeyEvent keyEvent) {
        Menu mo21708e;
        d dVar = this.f26393m;
        if (dVar == null || (mo21708e = dVar.mo21708e()) == null) {
            return false;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z10 = false;
        }
        mo21708e.setQwertyMode(z10);
        return mo21708e.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0262d
    public void onWindowVisibilityChanged(int i10) {
        this.f26399s = i10;
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: q */
    public void mo21520q(boolean z10) {
        if (this.f26392l) {
            return;
        }
        mo21521r(z10);
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: r */
    public void mo21521r(boolean z10) {
        m21696H(z10 ? 4 : 0, 4);
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: s */
    public void mo21522s(int i10) {
        this.f26386f.mo1497v(i10);
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: t */
    public void mo21523t(boolean z10) {
        C5140h c5140h;
        this.f26406z = z10;
        if (z10 || (c5140h = this.f26405y) == null) {
            return;
        }
        c5140h.m25764a();
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: u */
    public void mo21524u(CharSequence charSequence) {
        this.f26386f.mo1486k(charSequence);
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: v */
    public void mo21525v(CharSequence charSequence) {
        this.f26386f.setTitle(charSequence);
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: w */
    public void mo21526w(CharSequence charSequence) {
        this.f26386f.setWindowTitle(charSequence);
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: x */
    public AbstractC5134b mo21527x(AbstractC5134b.a aVar) {
        d dVar = this.f26393m;
        if (dVar != null) {
            dVar.mo21706c();
        }
        this.f26384d.setHideOnContentScrollEnabled(false);
        this.f26387g.m1060k();
        d dVar2 = new d(this, this.f26387g.getContext(), aVar);
        if (!dVar2.m21720t()) {
            return null;
        }
        this.f26393m = dVar2;
        dVar2.mo21712k();
        this.f26387g.m1057h(dVar2);
        m21704y(true);
        this.f26387g.sendAccessibilityEvent(32);
        return dVar2;
    }

    /* renamed from: y */
    public void m21704y(boolean z10) {
        C6864y0 mo1489n;
        C6864y0 mo1055f;
        if (z10) {
            m21702N();
        } else {
            m21694F();
        }
        if (!m21701M()) {
            if (z10) {
                this.f26386f.mo1499x(4);
                this.f26387g.setVisibility(0);
                return;
            } else {
                this.f26386f.mo1499x(0);
                this.f26387g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            mo1055f = this.f26386f.mo1489n(4, 100L);
            mo1489n = this.f26387g.mo1055f(0, 200L);
        } else {
            mo1489n = this.f26386f.mo1489n(0, 200L);
            mo1055f = this.f26387g.mo1055f(8, 100L);
        }
        C5140h c5140h = new C5140h();
        c5140h.m25767d(mo1055f, mo1489n);
        c5140h.m25771h();
    }
}
