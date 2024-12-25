package p049d;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.p016os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.view.menu.C0248c;
import androidx.appcompat.view.menu.C0250e;
import androidx.appcompat.view.menu.InterfaceC0254i;
import androidx.appcompat.view.menu.InterfaceC0255j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0320i;
import androidx.appcompat.widget.C0337n1;
import androidx.appcompat.widget.C0355t1;
import androidx.appcompat.widget.C0358u1;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC0330l0;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.AbstractC0572g;
import androidx.lifecycle.InterfaceC0579m;
import com.facebook.ads.AdError;
import java.util.List;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.xmlpull.v1.XmlPullParser;
import p029c.C0920a;
import p029c.C0922c;
import p029c.C0925f;
import p029c.C0926g;
import p029c.C0928i;
import p029c.C0929j;
import p030c0.C0960p;
import p050d0.C4290b;
import p068e.C4561b;
import p069e0.C4568g;
import p137i.AbstractC5134b;
import p137i.C5136d;
import p137i.C5138f;
import p137i.C5139g;
import p137i.WindowCallbackC5145m;
import p221n0.C6611c;
import p235o0.C6807a1;
import p235o0.C6813c1;
import p235o0.C6823g;
import p235o0.C6824g0;
import p235o0.C6826h;
import p235o0.C6864y0;
import p235o0.InterfaceC6859w;
import p294r.C7936i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:d/d.class
 */
/* renamed from: d.d */
/* loaded from: combined.jar:classes1.jar:d/d.class */
public class LayoutInflaterFactory2C4278d extends AbstractC4277c implements C0250e.a, LayoutInflater.Factory2 {

    /* renamed from: h0 */
    public static final C7936i<String, Integer> f26232h0 = new C7936i<>();

    /* renamed from: i0 */
    public static final boolean f26233i0 = false;

    /* renamed from: j0 */
    public static final int[] f26234j0 = {R.attr.windowBackground};

    /* renamed from: k0 */
    public static final boolean f26235k0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: l0 */
    public static final boolean f26236l0 = true;

    /* renamed from: A */
    public boolean f26237A;

    /* renamed from: B */
    public boolean f26238B;

    /* renamed from: C */
    public boolean f26239C;

    /* renamed from: D */
    public boolean f26240D;

    /* renamed from: E */
    public boolean f26241E;

    /* renamed from: F */
    public boolean f26242F;

    /* renamed from: G */
    public boolean f26243G;

    /* renamed from: H */
    public r[] f26244H;

    /* renamed from: I */
    public r f26245I;

    /* renamed from: J */
    public boolean f26246J;

    /* renamed from: K */
    public boolean f26247K;

    /* renamed from: L */
    public boolean f26248L;

    /* renamed from: M */
    public boolean f26249M;

    /* renamed from: N */
    public boolean f26250N;

    /* renamed from: O */
    public int f26251O;

    /* renamed from: P */
    public int f26252P;

    /* renamed from: Q */
    public boolean f26253Q;

    /* renamed from: R */
    public boolean f26254R;

    /* renamed from: S */
    public n f26255S;

    /* renamed from: T */
    public n f26256T;

    /* renamed from: U */
    public boolean f26257U;

    /* renamed from: V */
    public int f26258V;

    /* renamed from: W */
    public final Runnable f26259W;

    /* renamed from: X */
    public boolean f26260X;

    /* renamed from: Y */
    public Rect f26261Y;

    /* renamed from: Z */
    public Rect f26262Z;

    /* renamed from: e */
    public final Object f26263e;

    /* renamed from: f */
    public final Context f26264f;

    /* renamed from: f0 */
    public C4282h f26265f0;

    /* renamed from: g */
    public Window f26266g;

    /* renamed from: g0 */
    public C4283i f26267g0;

    /* renamed from: h */
    public l f26268h;

    /* renamed from: i */
    public final InterfaceC4276b f26269i;

    /* renamed from: j */
    public AbstractC4275a f26270j;

    /* renamed from: k */
    public MenuInflater f26271k;

    /* renamed from: l */
    public CharSequence f26272l;

    /* renamed from: m */
    public InterfaceC0330l0 f26273m;

    /* renamed from: n */
    public f f26274n;

    /* renamed from: o */
    public s f26275o;

    /* renamed from: p */
    public AbstractC5134b f26276p;

    /* renamed from: q */
    public ActionBarContextView f26277q;

    /* renamed from: r */
    public PopupWindow f26278r;

    /* renamed from: s */
    public Runnable f26279s;

    /* renamed from: t */
    public C6864y0 f26280t;

    /* renamed from: u */
    public boolean f26281u;

    /* renamed from: v */
    public boolean f26282v;

    /* renamed from: w */
    public ViewGroup f26283w;

    /* renamed from: x */
    public TextView f26284x;

    /* renamed from: y */
    public View f26285y;

    /* renamed from: z */
    public boolean f26286z;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/d$a.class
     */
    /* renamed from: d.d$a */
    /* loaded from: combined.jar:classes1.jar:d/d$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final LayoutInflaterFactory2C4278d f26287b;

        public a(LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d) {
            this.f26287b = layoutInflaterFactory2C4278d;
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d = this.f26287b;
            if ((layoutInflaterFactory2C4278d.f26258V & 1) != 0) {
                layoutInflaterFactory2C4278d.m21593V(0);
            }
            LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d2 = this.f26287b;
            if ((layoutInflaterFactory2C4278d2.f26258V & 4096) != 0) {
                layoutInflaterFactory2C4278d2.m21593V(108);
            }
            LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d3 = this.f26287b;
            layoutInflaterFactory2C4278d3.f26257U = false;
            layoutInflaterFactory2C4278d3.f26258V = 0;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/d$b.class
     */
    /* renamed from: d.d$b */
    /* loaded from: combined.jar:classes1.jar:d/d$b.class */
    public class b implements InterfaceC6859w {

        /* renamed from: a */
        public final LayoutInflaterFactory2C4278d f26288a;

        public b(LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d) {
            this.f26288a = layoutInflaterFactory2C4278d;
        }

        @Override // p235o0.InterfaceC6859w
        /* renamed from: a */
        public C6813c1 mo1813a(View view, C6813c1 c6813c1) {
            int m31402l = c6813c1.m31402l();
            int m21583M0 = this.f26288a.m21583M0(c6813c1, null);
            C6813c1 c6813c12 = c6813c1;
            if (m31402l != m21583M0) {
                c6813c12 = c6813c1.m31405p(c6813c1.m31400j(), m21583M0, c6813c1.m31401k(), c6813c1.m31399i());
            }
            return C6824g0.m31511b0(view, c6813c12);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/d$c.class
     */
    /* renamed from: d.d$c */
    /* loaded from: combined.jar:classes1.jar:d/d$c.class */
    public class c implements ContentFrameLayout.InterfaceC0269a {

        /* renamed from: a */
        public final LayoutInflaterFactory2C4278d f26289a;

        public c(LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d) {
            this.f26289a = layoutInflaterFactory2C4278d;
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0269a
        /* renamed from: a */
        public void mo1121a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0269a
        public void onDetachedFromWindow() {
            this.f26289a.m21591T();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/d$d.class
     */
    /* renamed from: d.d$d */
    /* loaded from: combined.jar:classes1.jar:d/d$d.class */
    public class d implements Runnable {

        /* renamed from: b */
        public final LayoutInflaterFactory2C4278d f26290b;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:d/d$d$a.class
         */
        /* renamed from: d.d$d$a */
        /* loaded from: combined.jar:classes1.jar:d/d$d$a.class */
        public class a extends C6807a1 {

            /* renamed from: a */
            public final d f26291a;

            public a(d dVar) {
                this.f26291a = dVar;
            }

            @Override // p235o0.InterfaceC6866z0
            /* renamed from: b */
            public void mo1239b(View view) {
                this.f26291a.f26290b.f26277q.setAlpha(1.0f);
                this.f26291a.f26290b.f26280t.m31678h(null);
                this.f26291a.f26290b.f26280t = null;
            }

            @Override // p235o0.C6807a1, p235o0.InterfaceC6866z0
            /* renamed from: c */
            public void mo1240c(View view) {
                this.f26291a.f26290b.f26277q.setVisibility(0);
            }
        }

        public d(LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d) {
            this.f26290b = layoutInflaterFactory2C4278d;
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d = this.f26290b;
            layoutInflaterFactory2C4278d.f26278r.showAtLocation(layoutInflaterFactory2C4278d.f26277q, 55, 0, 0);
            this.f26290b.m21594W();
            if (!this.f26290b.m21568E0()) {
                this.f26290b.f26277q.setAlpha(1.0f);
                this.f26290b.f26277q.setVisibility(0);
            } else {
                this.f26290b.f26277q.setAlpha(0.0f);
                LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d2 = this.f26290b;
                layoutInflaterFactory2C4278d2.f26280t = C6824g0.m31514d(layoutInflaterFactory2C4278d2.f26277q).m31671a(1.0f);
                this.f26290b.f26280t.m31678h(new a(this));
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/d$e.class
     */
    /* renamed from: d.d$e */
    /* loaded from: combined.jar:classes1.jar:d/d$e.class */
    public class e extends C6807a1 {

        /* renamed from: a */
        public final LayoutInflaterFactory2C4278d f26292a;

        public e(LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d) {
            this.f26292a = layoutInflaterFactory2C4278d;
        }

        @Override // p235o0.InterfaceC6866z0
        /* renamed from: b */
        public void mo1239b(View view) {
            this.f26292a.f26277q.setAlpha(1.0f);
            this.f26292a.f26280t.m31678h(null);
            this.f26292a.f26280t = null;
        }

        @Override // p235o0.C6807a1, p235o0.InterfaceC6866z0
        /* renamed from: c */
        public void mo1240c(View view) {
            this.f26292a.f26277q.setVisibility(0);
            this.f26292a.f26277q.sendAccessibilityEvent(32);
            if (this.f26292a.f26277q.getParent() instanceof View) {
                C6824g0.m31533m0((View) this.f26292a.f26277q.getParent());
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/d$f.class
     */
    /* renamed from: d.d$f */
    /* loaded from: combined.jar:classes1.jar:d/d$f.class */
    public final class f implements InterfaceC0254i.a {

        /* renamed from: b */
        public final LayoutInflaterFactory2C4278d f26293b;

        public f(LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d) {
            this.f26293b = layoutInflaterFactory2C4278d;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0254i.a
        /* renamed from: b */
        public void mo1006b(C0250e c0250e, boolean z10) {
            this.f26293b.m21582M(c0250e);
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0254i.a
        /* renamed from: c */
        public boolean mo1007c(C0250e c0250e) {
            Window.Callback m21603g0 = this.f26293b.m21603g0();
            if (m21603g0 == null) {
                return true;
            }
            m21603g0.onMenuOpened(108, c0250e);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/d$g.class
     */
    /* renamed from: d.d$g */
    /* loaded from: combined.jar:classes1.jar:d/d$g.class */
    public class g implements AbstractC5134b.a {

        /* renamed from: a */
        public AbstractC5134b.a f26294a;

        /* renamed from: b */
        public final LayoutInflaterFactory2C4278d f26295b;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:d/d$g$a.class
         */
        /* renamed from: d.d$g$a */
        /* loaded from: combined.jar:classes1.jar:d/d$g$a.class */
        public class a extends C6807a1 {

            /* renamed from: a */
            public final g f26296a;

            public a(g gVar) {
                this.f26296a = gVar;
            }

            @Override // p235o0.InterfaceC6866z0
            /* renamed from: b */
            public void mo1239b(View view) {
                this.f26296a.f26295b.f26277q.setVisibility(8);
                LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d = this.f26296a.f26295b;
                PopupWindow popupWindow = layoutInflaterFactory2C4278d.f26278r;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C4278d.f26277q.getParent() instanceof View) {
                    C6824g0.m31533m0((View) this.f26296a.f26295b.f26277q.getParent());
                }
                this.f26296a.f26295b.f26277q.m1060k();
                this.f26296a.f26295b.f26280t.m31678h(null);
                LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d2 = this.f26296a.f26295b;
                layoutInflaterFactory2C4278d2.f26280t = null;
                C6824g0.m31533m0(layoutInflaterFactory2C4278d2.f26283w);
            }
        }

        public g(LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d, AbstractC5134b.a aVar) {
            this.f26295b = layoutInflaterFactory2C4278d;
            this.f26294a = aVar;
        }

        @Override // p137i.AbstractC5134b.a
        /* renamed from: a */
        public boolean mo21623a(AbstractC5134b abstractC5134b, MenuItem menuItem) {
            return this.f26294a.mo21623a(abstractC5134b, menuItem);
        }

        @Override // p137i.AbstractC5134b.a
        /* renamed from: b */
        public void mo21624b(AbstractC5134b abstractC5134b) {
            this.f26294a.mo21624b(abstractC5134b);
            LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d = this.f26295b;
            if (layoutInflaterFactory2C4278d.f26278r != null) {
                layoutInflaterFactory2C4278d.f26266g.getDecorView().removeCallbacks(this.f26295b.f26279s);
            }
            LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d2 = this.f26295b;
            if (layoutInflaterFactory2C4278d2.f26277q != null) {
                layoutInflaterFactory2C4278d2.m21594W();
                LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d3 = this.f26295b;
                layoutInflaterFactory2C4278d3.f26280t = C6824g0.m31514d(layoutInflaterFactory2C4278d3.f26277q).m31671a(0.0f);
                this.f26295b.f26280t.m31678h(new a(this));
            }
            LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d4 = this.f26295b;
            InterfaceC4276b interfaceC4276b = layoutInflaterFactory2C4278d4.f26269i;
            if (interfaceC4276b != null) {
                interfaceC4276b.mo881s(layoutInflaterFactory2C4278d4.f26276p);
            }
            LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d5 = this.f26295b;
            layoutInflaterFactory2C4278d5.f26276p = null;
            C6824g0.m31533m0(layoutInflaterFactory2C4278d5.f26283w);
        }

        @Override // p137i.AbstractC5134b.a
        /* renamed from: c */
        public boolean mo21625c(AbstractC5134b abstractC5134b, Menu menu) {
            C6824g0.m31533m0(this.f26295b.f26283w);
            return this.f26294a.mo21625c(abstractC5134b, menu);
        }

        @Override // p137i.AbstractC5134b.a
        /* renamed from: d */
        public boolean mo21626d(AbstractC5134b abstractC5134b, Menu menu) {
            return this.f26294a.mo21626d(abstractC5134b, menu);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/d$h.class
     */
    /* renamed from: d.d$h */
    /* loaded from: combined.jar:classes1.jar:d/d$h.class */
    public static class h {
        /* renamed from: a */
        public static Context m21627a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        /* renamed from: b */
        public static void m21628b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.densityDpi;
            int i11 = configuration2.densityDpi;
            if (i10 != i11) {
                configuration3.densityDpi = i11;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/d$i.class
     */
    /* renamed from: d.d$i */
    /* loaded from: combined.jar:classes1.jar:d/d$i.class */
    public static class i {
        /* renamed from: a */
        public static boolean m21629a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/d$j.class
     */
    /* renamed from: d.d$j */
    /* loaded from: combined.jar:classes1.jar:d/d$j.class */
    public static class j {
        /* renamed from: a */
        public static void m21630a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales;
            LocaleList locales2;
            locales = configuration.getLocales();
            locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/d$k.class
     */
    /* renamed from: d.d$k */
    /* loaded from: combined.jar:classes1.jar:d/d$k.class */
    public static class k {
        /* renamed from: a */
        public static void m21631a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode;
            int i11 = configuration2.colorMode;
            if ((i10 & 3) != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode;
            int i13 = configuration2.colorMode;
            if ((i12 & 12) != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/d$l.class
     */
    /* renamed from: d.d$l */
    /* loaded from: combined.jar:classes1.jar:d/d$l.class */
    public class l extends WindowCallbackC5145m {

        /* renamed from: c */
        public final LayoutInflaterFactory2C4278d f26297c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d, Window.Callback callback) {
            super(callback);
            this.f26297c = layoutInflaterFactory2C4278d;
        }

        /* renamed from: b */
        public final ActionMode m21632b(ActionMode.Callback callback) {
            C5138f.a aVar = new C5138f.a(this.f26297c.f26264f, callback);
            AbstractC5134b m21571G0 = this.f26297c.m21571G0(aVar);
            if (m21571G0 != null) {
                return aVar.m25750e(m21571G0);
            }
            return null;
        }

        @Override // p137i.WindowCallbackC5145m, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f26297c.m21592U(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // p137i.WindowCallbackC5145m, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || this.f26297c.m21615s0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // p137i.WindowCallbackC5145m, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // p137i.WindowCallbackC5145m, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof C0250e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // p137i.WindowCallbackC5145m, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            this.f26297c.m21618v0(i10);
            return true;
        }

        @Override // p137i.WindowCallbackC5145m, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            super.onPanelClosed(i10, menu);
            this.f26297c.m21619w0(i10);
        }

        @Override // p137i.WindowCallbackC5145m, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            C0250e c0250e = menu instanceof C0250e ? (C0250e) menu : null;
            if (i10 == 0 && c0250e == null) {
                return false;
            }
            if (c0250e != null) {
                c0250e.m975a0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i10, view, menu);
            if (c0250e != null) {
                c0250e.m975a0(false);
            }
            return onPreparePanel;
        }

        @Override // p137i.WindowCallbackC5145m, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            C0250e c0250e;
            r m21601e0 = this.f26297c.m21601e0(0, true);
            if (m21601e0 == null || (c0250e = m21601e0.f26315j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, c0250e, i10);
            }
        }

        @Override // p137i.WindowCallbackC5145m, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return this.f26297c.m21610n0() ? m21632b(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // p137i.WindowCallbackC5145m, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (this.f26297c.m21610n0() && i10 == 0) ? m21632b(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/d$m.class
     */
    /* renamed from: d.d$m */
    /* loaded from: combined.jar:classes1.jar:d/d$m.class */
    public class m extends n {

        /* renamed from: c */
        public final PowerManager f26298c;

        /* renamed from: d */
        public final LayoutInflaterFactory2C4278d f26299d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d, Context context) {
            super(layoutInflaterFactory2C4278d);
            this.f26299d = layoutInflaterFactory2C4278d;
            this.f26298c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // p049d.LayoutInflaterFactory2C4278d.n
        /* renamed from: b */
        public IntentFilter mo21633b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // p049d.LayoutInflaterFactory2C4278d.n
        /* renamed from: c */
        public int mo21634c() {
            return i.m21629a(this.f26298c) ? 2 : 1;
        }

        @Override // p049d.LayoutInflaterFactory2C4278d.n
        /* renamed from: d */
        public void mo21635d() {
            this.f26299d.m21570G();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/d$n.class
     */
    /* renamed from: d.d$n */
    /* loaded from: combined.jar:classes1.jar:d/d$n.class */
    public abstract class n {

        /* renamed from: a */
        public BroadcastReceiver f26300a;

        /* renamed from: b */
        public final LayoutInflaterFactory2C4278d f26301b;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:d/d$n$a.class
         */
        /* renamed from: d.d$n$a */
        /* loaded from: combined.jar:classes1.jar:d/d$n$a.class */
        public class a extends BroadcastReceiver {

            /* renamed from: a */
            public final n f26302a;

            public a(n nVar) {
                this.f26302a = nVar;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                this.f26302a.mo21635d();
            }
        }

        public n(LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d) {
            this.f26301b = layoutInflaterFactory2C4278d;
        }

        /* renamed from: a */
        public void m21636a() {
            BroadcastReceiver broadcastReceiver = this.f26300a;
            if (broadcastReceiver != null) {
                try {
                    this.f26301b.f26264f.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException e10) {
                }
                this.f26300a = null;
            }
        }

        /* renamed from: b */
        public abstract IntentFilter mo21633b();

        /* renamed from: c */
        public abstract int mo21634c();

        /* renamed from: d */
        public abstract void mo21635d();

        /* renamed from: e */
        public void m21637e() {
            m21636a();
            IntentFilter mo21633b = mo21633b();
            if (mo21633b == null || mo21633b.countActions() == 0) {
                return;
            }
            if (this.f26300a == null) {
                this.f26300a = new a(this);
            }
            this.f26301b.f26264f.registerReceiver(this.f26300a, mo21633b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/d$o.class
     */
    /* renamed from: d.d$o */
    /* loaded from: combined.jar:classes1.jar:d/d$o.class */
    public class o extends n {

        /* renamed from: c */
        public final C4287m f26303c;

        /* renamed from: d */
        public final LayoutInflaterFactory2C4278d f26304d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d, C4287m c4287m) {
            super(layoutInflaterFactory2C4278d);
            this.f26304d = layoutInflaterFactory2C4278d;
            this.f26303c = c4287m;
        }

        @Override // p049d.LayoutInflaterFactory2C4278d.n
        /* renamed from: b */
        public IntentFilter mo21633b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // p049d.LayoutInflaterFactory2C4278d.n
        /* renamed from: c */
        public int mo21634c() {
            return this.f26303c.m21685d() ? 2 : 1;
        }

        @Override // p049d.LayoutInflaterFactory2C4278d.n
        /* renamed from: d */
        public void mo21635d() {
            this.f26304d.m21570G();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/d$p.class
     */
    /* renamed from: d.d$p */
    /* loaded from: combined.jar:classes1.jar:d/d$p.class */
    public static class p {
        /* renamed from: a */
        public static void m21638a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/d$q.class
     */
    /* renamed from: d.d$q */
    /* loaded from: combined.jar:classes1.jar:d/d$q.class */
    public class q extends ContentFrameLayout {

        /* renamed from: j */
        public final LayoutInflaterFactory2C4278d f26305j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d, Context context) {
            super(context);
            this.f26305j = layoutInflaterFactory2C4278d;
        }

        /* renamed from: b */
        public final boolean m21639b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f26305j.m21592U(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m21639b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            this.f26305j.m21586O(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(C4561b.m22999d(getContext(), i10));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/d$r.class
     */
    /* renamed from: d.d$r */
    /* loaded from: combined.jar:classes1.jar:d/d$r.class */
    public static final class r {

        /* renamed from: a */
        public int f26306a;

        /* renamed from: b */
        public int f26307b;

        /* renamed from: c */
        public int f26308c;

        /* renamed from: d */
        public int f26309d;

        /* renamed from: e */
        public int f26310e;

        /* renamed from: f */
        public int f26311f;

        /* renamed from: g */
        public ViewGroup f26312g;

        /* renamed from: h */
        public View f26313h;

        /* renamed from: i */
        public View f26314i;

        /* renamed from: j */
        public C0250e f26315j;

        /* renamed from: k */
        public C0248c f26316k;

        /* renamed from: l */
        public Context f26317l;

        /* renamed from: m */
        public boolean f26318m;

        /* renamed from: n */
        public boolean f26319n;

        /* renamed from: o */
        public boolean f26320o;

        /* renamed from: p */
        public boolean f26321p;

        /* renamed from: q */
        public boolean f26322q = false;

        /* renamed from: r */
        public boolean f26323r;

        /* renamed from: s */
        public Bundle f26324s;

        public r(int i10) {
            this.f26306a = i10;
        }

        /* renamed from: a */
        public InterfaceC0255j m21640a(InterfaceC0254i.a aVar) {
            if (this.f26315j == null) {
                return null;
            }
            if (this.f26316k == null) {
                C0248c c0248c = new C0248c(this.f26317l, C0926g.f6252j);
                this.f26316k = c0248c;
                c0248c.mo904d(aVar);
                this.f26315j.m976b(this.f26316k);
            }
            return this.f26316k.m940j(this.f26312g);
        }

        /* renamed from: b */
        public boolean m21641b() {
            boolean z10 = false;
            if (this.f26313h == null) {
                return false;
            }
            if (this.f26314i != null) {
                return true;
            }
            if (this.f26316k.m939a().getCount() > 0) {
                z10 = true;
            }
            return z10;
        }

        /* renamed from: c */
        public void m21642c(C0250e c0250e) {
            C0248c c0248c;
            C0250e c0250e2 = this.f26315j;
            if (c0250e == c0250e2) {
                return;
            }
            if (c0250e2 != null) {
                c0250e2.m962O(this.f26316k);
            }
            this.f26315j = c0250e;
            if (c0250e == null || (c0248c = this.f26316k) == null) {
                return;
            }
            c0250e.m976b(c0248c);
        }

        /* renamed from: d */
        public void m21643d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0920a.f6106a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(C0920a.f6094I, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 == 0) {
                i11 = C0928i.f6279c;
            }
            newTheme.applyStyle(i11, true);
            C5136d c5136d = new C5136d(context, 0);
            c5136d.getTheme().setTo(newTheme);
            this.f26317l = c5136d;
            TypedArray obtainStyledAttributes = c5136d.obtainStyledAttributes(C0929j.f6545z0);
            this.f26307b = obtainStyledAttributes.getResourceId(C0929j.f6293C0, 0);
            this.f26311f = obtainStyledAttributes.getResourceId(C0929j.f6288B0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/d$s.class
     */
    /* renamed from: d.d$s */
    /* loaded from: combined.jar:classes1.jar:d/d$s.class */
    public final class s implements InterfaceC0254i.a {

        /* renamed from: b */
        public final LayoutInflaterFactory2C4278d f26325b;

        public s(LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d) {
            this.f26325b = layoutInflaterFactory2C4278d;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0254i.a
        /* renamed from: b */
        public void mo1006b(C0250e c0250e, boolean z10) {
            C0250e mo951D = c0250e.mo951D();
            boolean z11 = mo951D != c0250e;
            LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d = this.f26325b;
            if (z11) {
                c0250e = mo951D;
            }
            r m21597Z = layoutInflaterFactory2C4278d.m21597Z(c0250e);
            if (m21597Z != null) {
                if (!z11) {
                    this.f26325b.m21587P(m21597Z, z10);
                } else {
                    this.f26325b.m21580L(m21597Z.f26306a, m21597Z, mo951D);
                    this.f26325b.m21587P(m21597Z, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0254i.a
        /* renamed from: c */
        public boolean mo1007c(C0250e c0250e) {
            Window.Callback m21603g0;
            if (c0250e != c0250e.mo951D()) {
                return true;
            }
            LayoutInflaterFactory2C4278d layoutInflaterFactory2C4278d = this.f26325b;
            if (!layoutInflaterFactory2C4278d.f26238B || (m21603g0 = layoutInflaterFactory2C4278d.m21603g0()) == null || this.f26325b.f26250N) {
                return true;
            }
            m21603g0.onMenuOpened(108, c0250e);
            return true;
        }
    }

    public LayoutInflaterFactory2C4278d(Activity activity, InterfaceC4276b interfaceC4276b) {
        this(activity, null, interfaceC4276b, activity);
    }

    public LayoutInflaterFactory2C4278d(Dialog dialog, InterfaceC4276b interfaceC4276b) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC4276b, dialog);
    }

    public LayoutInflaterFactory2C4278d(Context context, Window window, InterfaceC4276b interfaceC4276b, Object obj) {
        C7936i<String, Integer> c7936i;
        Integer num;
        ActivityC0243b m21577J0;
        this.f26280t = null;
        this.f26281u = true;
        this.f26251O = -100;
        this.f26259W = new a(this);
        this.f26264f = context;
        this.f26269i = interfaceC4276b;
        this.f26263e = obj;
        if (this.f26251O == -100 && (obj instanceof Dialog) && (m21577J0 = m21577J0()) != null) {
            this.f26251O = m21577J0.m867e0().mo21549k();
        }
        if (this.f26251O == -100 && (num = (c7936i = f26232h0).get(obj.getClass().getName())) != null) {
            this.f26251O = num.intValue();
            c7936i.remove(obj.getClass().getName());
        }
        if (window != null) {
            m21576J(window);
        }
        C0320i.m1439h();
    }

    /* renamed from: a0 */
    public static Configuration m21563a0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 24) {
                j.m21630a(configuration, configuration2, configuration3);
            } else if (!C6611c.m30516a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout;
            int i28 = configuration2.screenLayout;
            if ((i27 & 15) != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout;
            int i30 = configuration2.screenLayout;
            if ((i29 & 192) != (i30 & 192)) {
                configuration3.screenLayout |= i30 & 192;
            }
            int i31 = configuration.screenLayout;
            int i32 = configuration2.screenLayout;
            if ((i31 & 48) != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout;
            int i34 = configuration2.screenLayout;
            if ((i33 & 768) != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                k.m21631a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode;
            int i36 = configuration2.uiMode;
            if ((i35 & 15) != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode;
            int i38 = configuration2.uiMode;
            if ((i37 & 48) != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            h.m21628b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    @Override // p049d.AbstractC4277c
    /* renamed from: A */
    public void mo21539A(int i10) {
        m21595X();
        ViewGroup viewGroup = (ViewGroup) this.f26283w.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f26264f).inflate(i10, viewGroup);
        this.f26268h.m25777a().onContentChanged();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (m21565B0(r6, r8) != false) goto L10;
     */
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m21564A0(p049d.LayoutInflaterFactory2C4278d.r r6, int r7, android.view.KeyEvent r8, int r9) {
        /*
            r5 = this;
            r0 = r8
            boolean r0 = r0.isSystem()
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r10
            if (r0 == 0) goto L10
            r0 = 0
            return r0
        L10:
            r0 = r6
            boolean r0 = r0.f26318m
            if (r0 != 0) goto L24
            r0 = r11
            r10 = r0
            r0 = r5
            r1 = r6
            r2 = r8
            boolean r0 = r0.m21565B0(r1, r2)
            if (r0 == 0) goto L3e
        L24:
            r0 = r6
            androidx.appcompat.view.menu.e r0 = r0.f26315j
            r12 = r0
            r0 = r11
            r10 = r0
            r0 = r12
            if (r0 == 0) goto L3e
            r0 = r12
            r1 = r7
            r2 = r8
            r3 = r9
            boolean r0 = r0.performShortcut(r1, r2, r3)
            r10 = r0
        L3e:
            r0 = r10
            if (r0 == 0) goto L57
            r0 = r9
            r1 = 1
            r0 = r0 & r1
            if (r0 != 0) goto L57
            r0 = r5
            androidx.appcompat.widget.l0 r0 = r0.f26273m
            if (r0 != 0) goto L57
            r0 = r5
            r1 = r6
            r2 = 1
            r0.m21587P(r1, r2)
        L57:
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p049d.LayoutInflaterFactory2C4278d.m21564A0(d.d$r, int, android.view.KeyEvent, int):boolean");
    }

    @Override // p049d.AbstractC4277c
    /* renamed from: B */
    public void mo21540B(View view) {
        m21595X();
        ViewGroup viewGroup = (ViewGroup) this.f26283w.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f26268h.m25777a().onContentChanged();
    }

    /* renamed from: B0 */
    public final boolean m21565B0(r rVar, KeyEvent keyEvent) {
        InterfaceC0330l0 interfaceC0330l0;
        InterfaceC0330l0 interfaceC0330l02;
        InterfaceC0330l0 interfaceC0330l03;
        if (this.f26250N) {
            return false;
        }
        if (rVar.f26318m) {
            return true;
        }
        r rVar2 = this.f26245I;
        if (rVar2 != null && rVar2 != rVar) {
            m21587P(rVar2, false);
        }
        Window.Callback m21603g0 = m21603g0();
        if (m21603g0 != null) {
            rVar.f26314i = m21603g0.onCreatePanelView(rVar.f26306a);
        }
        int i10 = rVar.f26306a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (interfaceC0330l03 = this.f26273m) != null) {
            interfaceC0330l03.mo1070g();
        }
        if (rVar.f26314i == null && (!z10 || !(m21622z0() instanceof C4285k))) {
            C0250e c0250e = rVar.f26315j;
            if (c0250e == null || rVar.f26323r) {
                if (c0250e == null && (!m21607k0(rVar) || rVar.f26315j == null)) {
                    return false;
                }
                if (z10 && this.f26273m != null) {
                    if (this.f26274n == null) {
                        this.f26274n = new f(this);
                    }
                    this.f26273m.mo1068e(rVar.f26315j, this.f26274n);
                }
                rVar.f26315j.m981d0();
                if (!m21603g0.onCreatePanelMenu(rVar.f26306a, rVar.f26315j)) {
                    rVar.m21642c(null);
                    if (!z10 || (interfaceC0330l0 = this.f26273m) == null) {
                        return false;
                    }
                    interfaceC0330l0.mo1068e(null, this.f26274n);
                    return false;
                }
                rVar.f26323r = false;
            }
            rVar.f26315j.m981d0();
            Bundle bundle = rVar.f26324s;
            if (bundle != null) {
                rVar.f26315j.m963P(bundle);
                rVar.f26324s = null;
            }
            if (!m21603g0.onPreparePanel(0, rVar.f26314i, rVar.f26315j)) {
                if (z10 && (interfaceC0330l02 = this.f26273m) != null) {
                    interfaceC0330l02.mo1068e(null, this.f26274n);
                }
                rVar.f26315j.m979c0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            rVar.f26321p = z11;
            rVar.f26315j.setQwertyMode(z11);
            rVar.f26315j.m979c0();
        }
        rVar.f26318m = true;
        rVar.f26319n = false;
        this.f26245I = rVar;
        return true;
    }

    @Override // p049d.AbstractC4277c
    /* renamed from: C */
    public void mo21541C(View view, ViewGroup.LayoutParams layoutParams) {
        m21595X();
        ViewGroup viewGroup = (ViewGroup) this.f26283w.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f26268h.m25777a().onContentChanged();
    }

    /* renamed from: C0 */
    public final void m21566C0(boolean z10) {
        InterfaceC0330l0 interfaceC0330l0 = this.f26273m;
        if (interfaceC0330l0 == null || !interfaceC0330l0.mo1064a() || (ViewConfiguration.get(this.f26264f).hasPermanentMenuKey() && !this.f26273m.mo1071h())) {
            r m21601e0 = m21601e0(0, true);
            m21601e0.f26322q = true;
            m21587P(m21601e0, false);
            m21621y0(m21601e0, null);
            return;
        }
        Window.Callback m21603g0 = m21603g0();
        if (this.f26273m.mo1069f() && z10) {
            this.f26273m.mo1066c();
            if (this.f26250N) {
                return;
            }
            m21603g0.onPanelClosed(108, m21601e0(0, true).f26315j);
            return;
        }
        if (m21603g0 == null || this.f26250N) {
            return;
        }
        if (this.f26257U && (this.f26258V & 1) != 0) {
            this.f26266g.getDecorView().removeCallbacks(this.f26259W);
            this.f26259W.run();
        }
        r m21601e02 = m21601e0(0, true);
        C0250e c0250e = m21601e02.f26315j;
        if (c0250e == null || m21601e02.f26323r || !m21603g0.onPreparePanel(0, m21601e02.f26314i, c0250e)) {
            return;
        }
        m21603g0.onMenuOpened(108, m21601e02.f26315j);
        this.f26273m.mo1067d();
    }

    @Override // p049d.AbstractC4277c
    /* renamed from: D */
    public void mo21542D(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        if (this.f26263e instanceof Activity) {
            AbstractC4275a mo21551m = mo21551m();
            if (mo21551m instanceof C4288n) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f26271k = null;
            if (mo21551m != null) {
                mo21551m.mo21516m();
            }
            if (toolbar != null) {
                C4285k c4285k = new C4285k(toolbar, m21602f0(), this.f26268h);
                this.f26270j = c4285k;
                window = this.f26266g;
                callback = c4285k.m21679z();
            } else {
                this.f26270j = null;
                window = this.f26266g;
                callback = this.f26268h;
            }
            window.setCallback(callback);
            mo21553o();
        }
    }

    /* renamed from: D0 */
    public final int m21567D0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        int i11 = i10;
        if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i11 = 109;
        }
        return i11;
    }

    @Override // p049d.AbstractC4277c
    /* renamed from: E */
    public void mo21543E(int i10) {
        this.f26252P = i10;
    }

    /* renamed from: E0 */
    public final boolean m21568E0() {
        ViewGroup viewGroup;
        return this.f26282v && (viewGroup = this.f26283w) != null && C6824g0.m31502U(viewGroup);
    }

    @Override // p049d.AbstractC4277c
    /* renamed from: F */
    public final void mo21544F(CharSequence charSequence) {
        this.f26272l = charSequence;
        InterfaceC0330l0 interfaceC0330l0 = this.f26273m;
        if (interfaceC0330l0 != null) {
            interfaceC0330l0.setWindowTitle(charSequence);
            return;
        }
        if (m21622z0() != null) {
            m21622z0().mo21526w(charSequence);
            return;
        }
        TextView textView = this.f26284x;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: F0 */
    public final boolean m21569F0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f26266g.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C6824g0.m31501T((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: G */
    public boolean m21570G() {
        return m21572H(true);
    }

    /* renamed from: G0 */
    public AbstractC5134b m21571G0(AbstractC5134b.a aVar) {
        InterfaceC4276b interfaceC4276b;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC5134b abstractC5134b = this.f26276p;
        if (abstractC5134b != null) {
            abstractC5134b.mo21706c();
        }
        g gVar = new g(this, aVar);
        AbstractC4275a mo21551m = mo21551m();
        if (mo21551m != null) {
            AbstractC5134b mo21527x = mo21551m.mo21527x(gVar);
            this.f26276p = mo21527x;
            if (mo21527x != null && (interfaceC4276b = this.f26269i) != null) {
                interfaceC4276b.mo869g(mo21527x);
            }
        }
        if (this.f26276p == null) {
            this.f26276p = m21573H0(gVar);
        }
        return this.f26276p;
    }

    /* renamed from: H */
    public final boolean m21572H(boolean z10) {
        if (this.f26250N) {
            return false;
        }
        int m21578K = m21578K();
        boolean m21579K0 = m21579K0(m21611o0(this.f26264f, m21578K), z10);
        if (m21578K == 0) {
            m21600d0(this.f26264f).m21637e();
        } else {
            n nVar = this.f26255S;
            if (nVar != null) {
                nVar.m21636a();
            }
        }
        if (m21578K == 3) {
            m21599c0(this.f26264f).m21637e();
        } else {
            n nVar2 = this.f26256T;
            if (nVar2 != null) {
                nVar2.m21636a();
            }
        }
        return m21579K0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* renamed from: H0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p137i.AbstractC5134b m21573H0(p137i.AbstractC5134b.a r8) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p049d.LayoutInflaterFactory2C4278d.m21573H0(i.b$a):i.b");
    }

    /* renamed from: I */
    public final void m21574I() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f26283w.findViewById(R.id.content);
        View decorView = this.f26266g.getDecorView();
        contentFrameLayout.m1120a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f26264f.obtainStyledAttributes(C0929j.f6545z0);
        obtainStyledAttributes.getValue(C0929j.f6338L0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C0929j.f6343M0, contentFrameLayout.getMinWidthMinor());
        int i10 = C0929j.f6328J0;
        if (obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = C0929j.f6333K0;
        if (obtainStyledAttributes.hasValue(i11)) {
            obtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = C0929j.f6318H0;
        if (obtainStyledAttributes.hasValue(i12)) {
            obtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = C0929j.f6323I0;
        if (obtainStyledAttributes.hasValue(i13)) {
            obtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: I0 */
    public final void m21575I0() {
        if (this.f26282v) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: J */
    public final void m21576J(Window window) {
        if (this.f26266g != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof l) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        l lVar = new l(this, callback);
        this.f26268h = lVar;
        window.setCallback(lVar);
        C0337n1 m1504u = C0337n1.m1504u(this.f26264f, null, f26234j0);
        Drawable m1513h = m1504u.m1513h(0);
        if (m1513h != null) {
            window.setBackgroundDrawable(m1513h);
        }
        m1504u.m1525w();
        this.f26266g = window;
    }

    /* renamed from: J0 */
    public final ActivityC0243b m21577J0() {
        Context context = this.f26264f;
        while (true) {
            Context context2 = context;
            if (context2 == null) {
                return null;
            }
            if (context2 instanceof ActivityC0243b) {
                return (ActivityC0243b) context2;
            }
            if (!(context2 instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context2).getBaseContext();
        }
    }

    /* renamed from: K */
    public final int m21578K() {
        int i10 = this.f26251O;
        if (i10 == -100) {
            i10 = AbstractC4277c.m21536j();
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* renamed from: K0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m21579K0(int r6, boolean r7) {
        /*
            r5 = this;
            r0 = r5
            r1 = r5
            android.content.Context r1 = r1.f26264f
            r2 = r6
            r3 = 0
            android.content.res.Configuration r0 = r0.m21588Q(r1, r2, r3)
            r12 = r0
            r0 = r5
            boolean r0 = r0.m21609m0()
            r11 = r0
            r0 = r5
            android.content.Context r0 = r0.f26264f
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r1 = 48
            r0 = r0 & r1
            r9 = r0
            r0 = r12
            int r0 = r0.uiMode
            r1 = 48
            r0 = r0 & r1
            r8 = r0
            r0 = 1
            r10 = r0
            r0 = r9
            r1 = r8
            if (r0 == r1) goto L7b
            r0 = r7
            if (r0 == 0) goto L7b
            r0 = r11
            if (r0 != 0) goto L7b
            r0 = r5
            boolean r0 = r0.f26247K
            if (r0 == 0) goto L7b
            boolean r0 = p049d.LayoutInflaterFactory2C4278d.f26235k0
            if (r0 != 0) goto L53
            r0 = r5
            boolean r0 = r0.f26248L
            if (r0 == 0) goto L7b
        L53:
            r0 = r5
            java.lang.Object r0 = r0.f26263e
            r12 = r0
            r0 = r12
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L7b
            r0 = r12
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChild()
            if (r0 != 0) goto L7b
            r0 = r5
            java.lang.Object r0 = r0.f26263e
            android.app.Activity r0 = (android.app.Activity) r0
            p030c0.C0936d.m5640q(r0)
            r0 = 1
            r7 = r0
            goto L7d
        L7b:
            r0 = 0
            r7 = r0
        L7d:
            r0 = r7
            if (r0 != 0) goto L95
            r0 = r9
            r1 = r8
            if (r0 == r1) goto L95
            r0 = r5
            r1 = r8
            r2 = r11
            r3 = 0
            r0.m21581L0(r1, r2, r3)
            r0 = r10
            r7 = r0
            goto L95
        L95:
            r0 = r7
            if (r0 == 0) goto Lb0
            r0 = r5
            java.lang.Object r0 = r0.f26263e
            r12 = r0
            r0 = r12
            boolean r0 = r0 instanceof androidx.appcompat.app.ActivityC0243b
            if (r0 == 0) goto Lb0
            r0 = r12
            androidx.appcompat.app.b r0 = (androidx.appcompat.app.ActivityC0243b) r0
            r1 = r6
            r0.m872i0(r1)
        Lb0:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p049d.LayoutInflaterFactory2C4278d.m21579K0(int, boolean):boolean");
    }

    /* renamed from: L */
    public void m21580L(int i10, r rVar, Menu menu) {
        r rVar2 = rVar;
        Menu menu2 = menu;
        if (menu == null) {
            r rVar3 = rVar;
            if (rVar == null) {
                rVar3 = rVar;
                if (i10 >= 0) {
                    r[] rVarArr = this.f26244H;
                    rVar3 = rVar;
                    if (i10 < rVarArr.length) {
                        rVar3 = rVarArr[i10];
                    }
                }
            }
            rVar2 = rVar3;
            menu2 = menu;
            if (rVar3 != null) {
                menu2 = rVar3.f26315j;
                rVar2 = rVar3;
            }
        }
        if ((rVar2 == null || rVar2.f26320o) && !this.f26250N) {
            this.f26268h.m25777a().onPanelClosed(i10, menu2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: L0 */
    public final void m21581L0(int i10, boolean z10, Configuration configuration) {
        Resources resources = this.f26264f.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            C4284j.m21671a(resources);
        }
        int i12 = this.f26252P;
        if (i12 != 0) {
            this.f26264f.setTheme(i12);
            if (i11 >= 23) {
                this.f26264f.getTheme().applyStyle(this.f26252P, true);
            }
        }
        if (z10) {
            Object obj = this.f26263e;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof InterfaceC0579m) {
                    if (!((InterfaceC0579m) activity).getLifecycle().mo3155b().isAtLeast(AbstractC0572g.c.STARTED)) {
                        return;
                    }
                } else if (!this.f26249M) {
                    return;
                }
                activity.onConfigurationChanged(configuration2);
            }
        }
    }

    /* renamed from: M */
    public void m21582M(C0250e c0250e) {
        if (this.f26243G) {
            return;
        }
        this.f26243G = true;
        this.f26273m.mo1075l();
        Window.Callback m21603g0 = m21603g0();
        if (m21603g0 != null && !this.f26250N) {
            m21603g0.onPanelClosed(108, c0250e);
        }
        this.f26243G = false;
    }

    /* renamed from: M0 */
    public final int m21583M0(C6813c1 c6813c1, Rect rect) {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        int m31402l = c6813c1 != null ? c6813c1.m31402l() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f26277q;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
            i10 = m31402l;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f26277q.getLayoutParams();
            boolean z13 = true;
            if (this.f26277q.isShown()) {
                if (this.f26261Y == null) {
                    this.f26261Y = new Rect();
                    this.f26262Z = new Rect();
                }
                Rect rect2 = this.f26261Y;
                Rect rect3 = this.f26262Z;
                if (c6813c1 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c6813c1.m31400j(), c6813c1.m31402l(), c6813c1.m31401k(), c6813c1.m31399i());
                }
                C0358u1.m1620a(this.f26283w, rect2, rect3);
                int i11 = rect2.top;
                int i12 = rect2.left;
                int i13 = rect2.right;
                C6813c1 m31487J = C6824g0.m31487J(this.f26283w);
                int m31400j = m31487J == null ? 0 : m31487J.m31400j();
                int m31401k = m31487J == null ? 0 : m31487J.m31401k();
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z12 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z12 = true;
                }
                if (i11 <= 0 || this.f26285y != null) {
                    View view = this.f26285y;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != m31400j || marginLayoutParams2.rightMargin != m31401k) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = m31400j;
                            marginLayoutParams2.rightMargin = m31401k;
                            this.f26285y.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f26264f);
                    this.f26285y = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = m31400j;
                    layoutParams.rightMargin = m31401k;
                    this.f26283w.addView(this.f26285y, -1, layoutParams);
                }
                View view3 = this.f26285y;
                boolean z14 = view3 != null;
                if (z14 && view3.getVisibility() != 0) {
                    m21585N0(this.f26285y);
                }
                int i16 = m31402l;
                if (!this.f26240D) {
                    i16 = m31402l;
                    if (z14) {
                        i16 = 0;
                    }
                }
                m31402l = i16;
                z13 = z12;
                z11 = z14;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z11 = false;
            } else {
                z11 = false;
                z13 = false;
            }
            i10 = m31402l;
            z10 = z11;
            if (z13) {
                this.f26277q.setLayoutParams(marginLayoutParams);
                i10 = m31402l;
                z10 = z11;
            }
        }
        View view4 = this.f26285y;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return i10;
    }

    /* renamed from: N */
    public final void m21584N() {
        n nVar = this.f26255S;
        if (nVar != null) {
            nVar.m21636a();
        }
        n nVar2 = this.f26256T;
        if (nVar2 != null) {
            nVar2.m21636a();
        }
    }

    /* renamed from: N0 */
    public final void m21585N0(View view) {
        Context context;
        int i10;
        if ((C6824g0.m31495N(view) & NTLMEngineImpl.FLAG_WORKSTATION_PRESENT) != 0) {
            context = this.f26264f;
            i10 = C0922c.f6134b;
        } else {
            context = this.f26264f;
            i10 = C0922c.f6133a;
        }
        view.setBackgroundColor(C4290b.m21724c(context, i10));
    }

    /* renamed from: O */
    public void m21586O(int i10) {
        m21587P(m21601e0(i10, true), true);
    }

    /* renamed from: P */
    public void m21587P(r rVar, boolean z10) {
        ViewGroup viewGroup;
        InterfaceC0330l0 interfaceC0330l0;
        if (z10 && rVar.f26306a == 0 && (interfaceC0330l0 = this.f26273m) != null && interfaceC0330l0.mo1069f()) {
            m21582M(rVar.f26315j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f26264f.getSystemService("window");
        if (windowManager != null && rVar.f26320o && (viewGroup = rVar.f26312g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                m21580L(rVar.f26306a, rVar, null);
            }
        }
        rVar.f26318m = false;
        rVar.f26319n = false;
        rVar.f26320o = false;
        rVar.f26313h = null;
        rVar.f26322q = true;
        if (this.f26245I == rVar) {
            this.f26245I = null;
        }
    }

    /* renamed from: Q */
    public final Configuration m21588Q(Context context, int i10, Configuration configuration) {
        int i11 = i10 != 1 ? i10 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* renamed from: R */
    public final ViewGroup m21589R() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f26264f.obtainStyledAttributes(C0929j.f6545z0);
        int i10 = C0929j.f6303E0;
        if (!obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(C0929j.f6348N0, false)) {
            mo21562z(1);
        } else if (obtainStyledAttributes.getBoolean(i10, false)) {
            mo21562z(108);
        }
        if (obtainStyledAttributes.getBoolean(C0929j.f6308F0, false)) {
            mo21562z(109);
        }
        if (obtainStyledAttributes.getBoolean(C0929j.f6313G0, false)) {
            mo21562z(10);
        }
        this.f26241E = obtainStyledAttributes.getBoolean(C0929j.f6283A0, false);
        obtainStyledAttributes.recycle();
        m21596Y();
        this.f26266g.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f26264f);
        if (this.f26242F) {
            viewGroup = (ViewGroup) from.inflate(this.f26240D ? C0926g.f6257o : C0926g.f6256n, (ViewGroup) null);
        } else if (this.f26241E) {
            viewGroup = (ViewGroup) from.inflate(C0926g.f6248f, (ViewGroup) null);
            this.f26239C = false;
            this.f26238B = false;
        } else if (this.f26238B) {
            TypedValue typedValue = new TypedValue();
            this.f26264f.getTheme().resolveAttribute(C0920a.f6111f, typedValue, true);
            ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C5136d(this.f26264f, typedValue.resourceId) : this.f26264f).inflate(C0926g.f6258p, (ViewGroup) null);
            InterfaceC0330l0 interfaceC0330l0 = (InterfaceC0330l0) viewGroup2.findViewById(C0925f.f6232p);
            this.f26273m = interfaceC0330l0;
            interfaceC0330l0.setWindowCallback(m21603g0());
            if (this.f26239C) {
                this.f26273m.mo1072i(109);
            }
            if (this.f26286z) {
                this.f26273m.mo1072i(2);
            }
            viewGroup = viewGroup2;
            if (this.f26237A) {
                this.f26273m.mo1072i(5);
                viewGroup = viewGroup2;
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f26238B + ", windowActionBarOverlay: " + this.f26239C + ", android:windowIsFloating: " + this.f26241E + ", windowActionModeOverlay: " + this.f26240D + ", windowNoTitle: " + this.f26242F + " }");
        }
        C6824g0.m31470A0(viewGroup, new b(this));
        if (this.f26273m == null) {
            this.f26284x = (TextView) viewGroup.findViewById(C0925f.f6213M);
        }
        C0358u1.m1622c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0925f.f6218b);
        ViewGroup viewGroup3 = (ViewGroup) this.f26266g.findViewById(R.id.content);
        if (viewGroup3 != null) {
            while (viewGroup3.getChildCount() > 0) {
                View childAt = viewGroup3.getChildAt(0);
                viewGroup3.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup3.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup3 instanceof FrameLayout) {
                ((FrameLayout) viewGroup3).setForeground(null);
            }
        }
        this.f26266g.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c(this));
        return viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: S */
    public View m21590S(View view, String str, Context context, AttributeSet attributeSet) {
        C4282h c4282h;
        boolean z10 = false;
        if (this.f26265f0 == null) {
            String string = this.f26264f.obtainStyledAttributes(C0929j.f6545z0).getString(C0929j.f6298D0);
            if (string == null) {
                c4282h = new C4282h();
            } else {
                try {
                    this.f26265f0 = (C4282h) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    c4282h = new C4282h();
                }
            }
            this.f26265f0 = c4282h;
        }
        boolean z11 = f26233i0;
        if (z11) {
            if (this.f26267g0 == null) {
                this.f26267g0 = new C4283i();
            }
            if (this.f26267g0.m21670a(attributeSet)) {
                z10 = true;
            } else if (!(attributeSet instanceof XmlPullParser)) {
                z10 = m21569F0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        return this.f26265f0.m21662q(view, str, context, attributeSet, z10, z11, true, C0355t1.m1612b());
    }

    /* renamed from: T */
    public void m21591T() {
        C0250e c0250e;
        InterfaceC0330l0 interfaceC0330l0 = this.f26273m;
        if (interfaceC0330l0 != null) {
            interfaceC0330l0.mo1075l();
        }
        if (this.f26278r != null) {
            this.f26266g.getDecorView().removeCallbacks(this.f26279s);
            if (this.f26278r.isShowing()) {
                try {
                    this.f26278r.dismiss();
                } catch (IllegalArgumentException e10) {
                }
            }
            this.f26278r = null;
        }
        m21594W();
        r m21601e0 = m21601e0(0, false);
        if (m21601e0 == null || (c0250e = m21601e0.f26315j) == null) {
            return;
        }
        c0250e.close();
    }

    /* renamed from: U */
    public boolean m21592U(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f26263e;
        boolean z10 = true;
        if (((obj instanceof C6823g.a) || (obj instanceof DialogC4281g)) && (decorView = this.f26266g.getDecorView()) != null && C6823g.m31466d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f26268h.m25777a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z10 = false;
        }
        return z10 ? m21613q0(keyCode, keyEvent) : m21616t0(keyCode, keyEvent);
    }

    /* renamed from: V */
    public void m21593V(int i10) {
        r m21601e0;
        r m21601e02 = m21601e0(i10, true);
        if (m21601e02.f26315j != null) {
            Bundle bundle = new Bundle();
            m21601e02.f26315j.m964Q(bundle);
            if (bundle.size() > 0) {
                m21601e02.f26324s = bundle;
            }
            m21601e02.f26315j.m981d0();
            m21601e02.f26315j.clear();
        }
        m21601e02.f26323r = true;
        m21601e02.f26322q = true;
        if ((i10 != 108 && i10 != 0) || this.f26273m == null || (m21601e0 = m21601e0(0, false)) == null) {
            return;
        }
        m21601e0.f26318m = false;
        m21565B0(m21601e0, null);
    }

    /* renamed from: W */
    public void m21594W() {
        C6864y0 c6864y0 = this.f26280t;
        if (c6864y0 != null) {
            c6864y0.m31672b();
        }
    }

    /* renamed from: X */
    public final void m21595X() {
        if (this.f26282v) {
            return;
        }
        this.f26283w = m21589R();
        CharSequence m21602f0 = m21602f0();
        if (!TextUtils.isEmpty(m21602f0)) {
            InterfaceC0330l0 interfaceC0330l0 = this.f26273m;
            if (interfaceC0330l0 != null) {
                interfaceC0330l0.setWindowTitle(m21602f0);
            } else if (m21622z0() != null) {
                m21622z0().mo21526w(m21602f0);
            } else {
                TextView textView = this.f26284x;
                if (textView != null) {
                    textView.setText(m21602f0);
                }
            }
        }
        m21574I();
        m21620x0(this.f26283w);
        this.f26282v = true;
        r m21601e0 = m21601e0(0, false);
        if (this.f26250N) {
            return;
        }
        if (m21601e0 == null || m21601e0.f26315j == null) {
            m21608l0(108);
        }
    }

    /* renamed from: Y */
    public final void m21596Y() {
        if (this.f26266g == null) {
            Object obj = this.f26263e;
            if (obj instanceof Activity) {
                m21576J(((Activity) obj).getWindow());
            }
        }
        if (this.f26266g == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: Z */
    public r m21597Z(Menu menu) {
        r[] rVarArr = this.f26244H;
        int length = rVarArr != null ? rVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            r rVar = rVarArr[i10];
            if (rVar != null && rVar.f26315j == menu) {
                return rVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.C0250e.a
    /* renamed from: a */
    public boolean mo1003a(C0250e c0250e, MenuItem menuItem) {
        r m21597Z;
        Window.Callback m21603g0 = m21603g0();
        if (m21603g0 == null || this.f26250N || (m21597Z = m21597Z(c0250e.mo951D())) == null) {
            return false;
        }
        return m21603g0.onMenuItemSelected(m21597Z.f26306a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0250e.a
    /* renamed from: b */
    public void mo1004b(C0250e c0250e) {
        m21566C0(true);
    }

    /* renamed from: b0 */
    public final Context m21598b0() {
        AbstractC4275a mo21551m = mo21551m();
        Context mo21513j = mo21551m != null ? mo21551m.mo21513j() : null;
        Context context = mo21513j;
        if (mo21513j == null) {
            context = this.f26264f;
        }
        return context;
    }

    /* renamed from: c0 */
    public final n m21599c0(Context context) {
        if (this.f26256T == null) {
            this.f26256T = new m(this, context);
        }
        return this.f26256T;
    }

    @Override // p049d.AbstractC4277c
    /* renamed from: d */
    public void mo21545d(View view, ViewGroup.LayoutParams layoutParams) {
        m21595X();
        ((ViewGroup) this.f26283w.findViewById(R.id.content)).addView(view, layoutParams);
        this.f26268h.m25777a().onContentChanged();
    }

    /* renamed from: d0 */
    public final n m21600d0(Context context) {
        if (this.f26255S == null) {
            this.f26255S = new o(this, C4287m.m21682a(context));
        }
        return this.f26255S;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r0.length <= r7) goto L6;
     */
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p049d.LayoutInflaterFactory2C4278d.r m21601e0(int r7, boolean r8) {
        /*
            r6 = this;
            r0 = r6
            d.d$r[] r0 = r0.f26244H
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L15
            r0 = r10
            r9 = r0
            r0 = r10
            int r0 = r0.length
            r1 = r7
            if (r0 > r1) goto L31
        L15:
            r0 = r7
            r1 = 1
            int r0 = r0 + r1
            d.d$r[] r0 = new p049d.LayoutInflaterFactory2C4278d.r[r0]
            r9 = r0
            r0 = r10
            if (r0 == 0) goto L2c
            r0 = r10
            r1 = 0
            r2 = r9
            r3 = 0
            r4 = r10
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
        L2c:
            r0 = r6
            r1 = r9
            r0.f26244H = r1
        L31:
            r0 = r9
            r1 = r7
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            r10 = r0
            r0 = r11
            if (r0 != 0) goto L4e
            d.d$r r0 = new d.d$r
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r10 = r0
            r0 = r9
            r1 = r7
            r2 = r10
            r0[r1] = r2
        L4e:
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p049d.LayoutInflaterFactory2C4278d.m21601e0(int, boolean):d.d$r");
    }

    @Override // p049d.AbstractC4277c
    /* renamed from: f */
    public Context mo21547f(Context context) {
        boolean z10 = true;
        this.f26247K = true;
        int m21611o0 = m21611o0(context, m21578K());
        Configuration configuration = null;
        if (f26236l0 && (context instanceof ContextThemeWrapper)) {
            try {
                p.m21638a((ContextThemeWrapper) context, m21588Q(context, m21611o0, null));
                return context;
            } catch (IllegalStateException e10) {
            }
        }
        if (context instanceof C5136d) {
            try {
                ((C5136d) context).m25745a(m21588Q(context, m21611o0, null));
                return context;
            } catch (IllegalStateException e11) {
            }
        }
        if (!f26235k0) {
            return super.mo21547f(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = h.m21627a(context, configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = m21563a0(configuration3, configuration4);
        }
        Configuration m21588Q = m21588Q(context, m21611o0, configuration);
        C5136d c5136d = new C5136d(context, C0928i.f6280d);
        c5136d.m25745a(m21588Q);
        try {
            if (context.getTheme() == null) {
                z10 = false;
            }
        } catch (NullPointerException e12) {
            z10 = false;
        }
        if (z10) {
            C4568g.d.m23065a(c5136d.getTheme());
        }
        return super.mo21547f(c5136d);
    }

    /* renamed from: f0 */
    public final CharSequence m21602f0() {
        Object obj = this.f26263e;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f26272l;
    }

    /* renamed from: g0 */
    public final Window.Callback m21603g0() {
        return this.f26266g.getCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m21604h0() {
        /*
            r5 = this;
            r0 = r5
            r0.m21595X()
            r0 = r5
            boolean r0 = r0.f26238B
            if (r0 == 0) goto L66
            r0 = r5
            d.a r0 = r0.f26270j
            if (r0 == 0) goto L15
            goto L66
        L15:
            r0 = r5
            java.lang.Object r0 = r0.f26263e
            r6 = r0
            r0 = r6
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L3c
            d.n r0 = new d.n
            r1 = r0
            r2 = r5
            java.lang.Object r2 = r2.f26263e
            android.app.Activity r2 = (android.app.Activity) r2
            r3 = r5
            boolean r3 = r3.f26239C
            r1.<init>(r2, r3)
            r6 = r0
        L34:
            r0 = r5
            r1 = r6
            r0.f26270j = r1
            goto L55
        L3c:
            r0 = r6
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L55
            d.n r0 = new d.n
            r1 = r0
            r2 = r5
            java.lang.Object r2 = r2.f26263e
            android.app.Dialog r2 = (android.app.Dialog) r2
            r1.<init>(r2)
            r6 = r0
            goto L34
        L55:
            r0 = r5
            d.a r0 = r0.f26270j
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L66
            r0 = r6
            r1 = r5
            boolean r1 = r1.f26260X
            r0.mo21520q(r1)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p049d.LayoutInflaterFactory2C4278d.m21604h0():void");
    }

    @Override // p049d.AbstractC4277c
    /* renamed from: i */
    public <T extends View> T mo21548i(int i10) {
        m21595X();
        return (T) this.f26266g.findViewById(i10);
    }

    /* renamed from: i0 */
    public final boolean m21605i0(r rVar) {
        View view = rVar.f26314i;
        boolean z10 = true;
        if (view != null) {
            rVar.f26313h = view;
            return true;
        }
        if (rVar.f26315j == null) {
            return false;
        }
        if (this.f26275o == null) {
            this.f26275o = new s(this);
        }
        View view2 = (View) rVar.m21640a(this.f26275o);
        rVar.f26313h = view2;
        if (view2 == null) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: j0 */
    public final boolean m21606j0(r rVar) {
        rVar.m21643d(m21598b0());
        rVar.f26312g = new q(this, rVar.f26317l);
        rVar.f26308c = 81;
        return true;
    }

    @Override // p049d.AbstractC4277c
    /* renamed from: k */
    public int mo21549k() {
        return this.f26251O;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r0 == 108) goto L6;
     */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m21607k0(p049d.LayoutInflaterFactory2C4278d.r r6) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p049d.LayoutInflaterFactory2C4278d.m21607k0(d.d$r):boolean");
    }

    @Override // p049d.AbstractC4277c
    /* renamed from: l */
    public MenuInflater mo21550l() {
        if (this.f26271k == null) {
            m21604h0();
            AbstractC4275a abstractC4275a = this.f26270j;
            this.f26271k = new C5139g(abstractC4275a != null ? abstractC4275a.mo21513j() : this.f26264f);
        }
        return this.f26271k;
    }

    /* renamed from: l0 */
    public final void m21608l0(int i10) {
        this.f26258V = (1 << i10) | this.f26258V;
        if (this.f26257U) {
            return;
        }
        C6824g0.m31523h0(this.f26266g.getDecorView(), this.f26259W);
        this.f26257U = true;
    }

    @Override // p049d.AbstractC4277c
    /* renamed from: m */
    public AbstractC4275a mo21551m() {
        m21604h0();
        return this.f26270j;
    }

    /* renamed from: m0 */
    public final boolean m21609m0() {
        if (!this.f26254R && (this.f26263e instanceof Activity)) {
            PackageManager packageManager = this.f26264f.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i10 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f26264f, this.f26263e.getClass()), i10 >= 29 ? 269221888 : i10 >= 24 ? 786432 : 0);
                this.f26253Q = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.f26253Q = false;
            }
        }
        this.f26254R = true;
        return this.f26253Q;
    }

    @Override // p049d.AbstractC4277c
    /* renamed from: n */
    public void mo21552n() {
        LayoutInflater from = LayoutInflater.from(this.f26264f);
        if (from.getFactory() == null) {
            C6826h.m31596a(from, this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C4278d) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: n0 */
    public boolean m21610n0() {
        return this.f26281u;
    }

    @Override // p049d.AbstractC4277c
    /* renamed from: o */
    public void mo21553o() {
        AbstractC4275a mo21551m = mo21551m();
        if (mo21551m == null || !mo21551m.mo21514k()) {
            m21608l0(0);
        }
    }

    /* renamed from: o0 */
    public int m21611o0(Context context, int i10) {
        n m21600d0;
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    m21600d0 = m21599c0(context);
                }
            } else {
                if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                m21600d0 = m21600d0(context);
            }
            return m21600d0.mo21634c();
        }
        return i10;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m21590S(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // p049d.AbstractC4277c
    /* renamed from: p */
    public void mo21554p(Configuration configuration) {
        AbstractC4275a mo21551m;
        if (this.f26238B && this.f26282v && (mo21551m = mo21551m()) != null) {
            mo21551m.mo21515l(configuration);
        }
        C0320i.m1437b().m1444g(this.f26264f);
        m21572H(false);
    }

    /* renamed from: p0 */
    public boolean m21612p0() {
        AbstractC5134b abstractC5134b = this.f26276p;
        if (abstractC5134b != null) {
            abstractC5134b.mo21706c();
            return true;
        }
        AbstractC4275a mo21551m = mo21551m();
        return mo21551m != null && mo21551m.mo21510g();
    }

    @Override // p049d.AbstractC4277c
    /* renamed from: q */
    public void mo21555q(Bundle bundle) {
        this.f26247K = true;
        m21572H(false);
        m21596Y();
        Object obj = this.f26263e;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = C0960p.m5730c((Activity) obj);
            } catch (IllegalArgumentException e10) {
            }
            if (str != null) {
                AbstractC4275a m21622z0 = m21622z0();
                if (m21622z0 == null) {
                    this.f26260X = true;
                } else {
                    m21622z0.mo21520q(true);
                }
            }
            AbstractC4277c.m21533c(this);
        }
        this.f26248L = true;
    }

    /* renamed from: q0 */
    public boolean m21613q0(int i10, KeyEvent keyEvent) {
        boolean z10 = true;
        if (i10 != 4) {
            if (i10 != 82) {
                return false;
            }
            m21614r0(0, keyEvent);
            return true;
        }
        if ((keyEvent.getFlags() & 128) == 0) {
            z10 = false;
        }
        this.f26246J = z10;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    @Override // p049d.AbstractC4277c
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo21556r() {
        /*
            r4 = this;
            r0 = r4
            java.lang.Object r0 = r0.f26263e
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto Le
            r0 = r4
            p049d.AbstractC4277c.m21537x(r0)
        Le:
            r0 = r4
            boolean r0 = r0.f26257U
            if (r0 == 0) goto L24
            r0 = r4
            android.view.Window r0 = r0.f26266g
            android.view.View r0 = r0.getDecorView()
            r1 = r4
            java.lang.Runnable r1 = r1.f26259W
            boolean r0 = r0.removeCallbacks(r1)
        L24:
            r0 = r4
            r1 = 0
            r0.f26249M = r1
            r0 = r4
            r1 = 1
            r0.f26250N = r1
            r0 = r4
            int r0 = r0.f26251O
            r1 = -100
            if (r0 == r1) goto L68
            r0 = r4
            java.lang.Object r0 = r0.f26263e
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L68
            r0 = r5
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L68
            r.i<java.lang.String, java.lang.Integer> r0 = p049d.LayoutInflaterFactory2C4278d.f26232h0
            r1 = r4
            java.lang.Object r1 = r1.f26263e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r2 = r4
            int r2 = r2.f26251O
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            goto L79
        L68:
            r.i<java.lang.String, java.lang.Integer> r0 = p049d.LayoutInflaterFactory2C4278d.f26232h0
            r1 = r4
            java.lang.Object r1 = r1.f26263e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.Object r0 = r0.remove(r1)
        L79:
            r0 = r4
            d.a r0 = r0.f26270j
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L86
            r0 = r5
            r0.mo21516m()
        L86:
            r0 = r4
            r0.m21584N()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p049d.LayoutInflaterFactory2C4278d.mo21556r():void");
    }

    /* renamed from: r0 */
    public final boolean m21614r0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        r m21601e0 = m21601e0(i10, true);
        if (m21601e0.f26320o) {
            return false;
        }
        return m21565B0(m21601e0, keyEvent);
    }

    @Override // p049d.AbstractC4277c
    /* renamed from: s */
    public void mo21557s(Bundle bundle) {
        m21595X();
    }

    /* renamed from: s0 */
    public boolean m21615s0(int i10, KeyEvent keyEvent) {
        AbstractC4275a mo21551m = mo21551m();
        if (mo21551m != null && mo21551m.mo21517n(i10, keyEvent)) {
            return true;
        }
        r rVar = this.f26245I;
        if (rVar != null && m21564A0(rVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            r rVar2 = this.f26245I;
            if (rVar2 == null) {
                return true;
            }
            rVar2.f26319n = true;
            return true;
        }
        if (this.f26245I != null) {
            return false;
        }
        r m21601e0 = m21601e0(0, true);
        m21565B0(m21601e0, keyEvent);
        boolean m21564A0 = m21564A0(m21601e0, keyEvent.getKeyCode(), keyEvent, 1);
        m21601e0.f26318m = false;
        return m21564A0;
    }

    @Override // p049d.AbstractC4277c
    /* renamed from: t */
    public void mo21558t() {
        AbstractC4275a mo21551m = mo21551m();
        if (mo21551m != null) {
            mo21551m.mo21523t(true);
        }
    }

    /* renamed from: t0 */
    public boolean m21616t0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 != 82) {
                return false;
            }
            m21617u0(0, keyEvent);
            return true;
        }
        boolean z10 = this.f26246J;
        this.f26246J = false;
        r m21601e0 = m21601e0(0, false);
        if (m21601e0 == null || !m21601e0.f26320o) {
            return m21612p0();
        }
        if (z10) {
            return true;
        }
        m21587P(m21601e0, true);
        return true;
    }

    @Override // p049d.AbstractC4277c
    /* renamed from: u */
    public void mo21559u(Bundle bundle) {
    }

    /* renamed from: u0 */
    public final boolean m21617u0(int i10, KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        InterfaceC0330l0 interfaceC0330l0;
        if (this.f26276p != null) {
            return false;
        }
        r m21601e0 = m21601e0(i10, true);
        if (i10 != 0 || (interfaceC0330l0 = this.f26273m) == null || !interfaceC0330l0.mo1064a() || ViewConfiguration.get(this.f26264f).hasPermanentMenuKey()) {
            z10 = m21601e0.f26320o;
            if (z10 || m21601e0.f26319n) {
                m21587P(m21601e0, true);
            } else {
                if (m21601e0.f26318m) {
                    if (m21601e0.f26323r) {
                        m21601e0.f26318m = false;
                        z11 = m21565B0(m21601e0, keyEvent);
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        m21621y0(m21601e0, keyEvent);
                        z10 = true;
                    }
                }
                z10 = false;
            }
        } else if (this.f26273m.mo1069f()) {
            z10 = this.f26273m.mo1066c();
        } else {
            if (!this.f26250N && m21565B0(m21601e0, keyEvent)) {
                z10 = this.f26273m.mo1067d();
            }
            z10 = false;
        }
        if (z10) {
            AudioManager audioManager = (AudioManager) this.f26264f.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z10;
    }

    @Override // p049d.AbstractC4277c
    /* renamed from: v */
    public void mo21560v() {
        this.f26249M = true;
        m21570G();
    }

    /* renamed from: v0 */
    public void m21618v0(int i10) {
        AbstractC4275a mo21551m;
        if (i10 != 108 || (mo21551m = mo21551m()) == null) {
            return;
        }
        mo21551m.mo21511h(true);
    }

    @Override // p049d.AbstractC4277c
    /* renamed from: w */
    public void mo21561w() {
        this.f26249M = false;
        AbstractC4275a mo21551m = mo21551m();
        if (mo21551m != null) {
            mo21551m.mo21523t(false);
        }
    }

    /* renamed from: w0 */
    public void m21619w0(int i10) {
        if (i10 == 108) {
            AbstractC4275a mo21551m = mo21551m();
            if (mo21551m != null) {
                mo21551m.mo21511h(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            r m21601e0 = m21601e0(i10, true);
            if (m21601e0.f26320o) {
                m21587P(m21601e0, false);
            }
        }
    }

    /* renamed from: x0 */
    public void m21620x0(ViewGroup viewGroup) {
    }

    /* renamed from: y0 */
    public final void m21621y0(r rVar, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (rVar.f26320o || this.f26250N) {
            return;
        }
        if (rVar.f26306a == 0) {
            if ((this.f26264f.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback m21603g0 = m21603g0();
        if (m21603g0 != null && !m21603g0.onMenuOpened(rVar.f26306a, rVar.f26315j)) {
            m21587P(rVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f26264f.getSystemService("window");
        if (windowManager != null && m21565B0(rVar, keyEvent)) {
            ViewGroup viewGroup = rVar.f26312g;
            if (viewGroup == null || rVar.f26322q) {
                if (viewGroup == null) {
                    if (!m21606j0(rVar) || rVar.f26312g == null) {
                        return;
                    }
                } else if (rVar.f26322q && viewGroup.getChildCount() > 0) {
                    rVar.f26312g.removeAllViews();
                }
                if (!m21605i0(rVar) || !rVar.m21641b()) {
                    rVar.f26322q = true;
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = rVar.f26313h.getLayoutParams();
                ViewGroup.LayoutParams layoutParams3 = layoutParams2;
                if (layoutParams2 == null) {
                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                }
                rVar.f26312g.setBackgroundResource(rVar.f26307b);
                ViewParent parent = rVar.f26313h.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(rVar.f26313h);
                }
                rVar.f26312g.addView(rVar.f26313h, layoutParams3);
                if (!rVar.f26313h.hasFocus()) {
                    rVar.f26313h.requestFocus();
                }
            } else {
                View view = rVar.f26314i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i10 = -1;
                    rVar.f26319n = false;
                    WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i10, -2, rVar.f26309d, rVar.f26310e, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 8519680, -3);
                    layoutParams4.gravity = rVar.f26308c;
                    layoutParams4.windowAnimations = rVar.f26311f;
                    windowManager.addView(rVar.f26312g, layoutParams4);
                    rVar.f26320o = true;
                }
            }
            i10 = -2;
            rVar.f26319n = false;
            WindowManager.LayoutParams layoutParams42 = new WindowManager.LayoutParams(i10, -2, rVar.f26309d, rVar.f26310e, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 8519680, -3);
            layoutParams42.gravity = rVar.f26308c;
            layoutParams42.windowAnimations = rVar.f26311f;
            windowManager.addView(rVar.f26312g, layoutParams42);
            rVar.f26320o = true;
        }
    }

    @Override // p049d.AbstractC4277c
    /* renamed from: z */
    public boolean mo21562z(int i10) {
        int m21567D0 = m21567D0(i10);
        if (this.f26242F && m21567D0 == 108) {
            return false;
        }
        if (this.f26238B && m21567D0 == 1) {
            this.f26238B = false;
        }
        if (m21567D0 == 1) {
            m21575I0();
            this.f26242F = true;
            return true;
        }
        if (m21567D0 == 2) {
            m21575I0();
            this.f26286z = true;
            return true;
        }
        if (m21567D0 == 5) {
            m21575I0();
            this.f26237A = true;
            return true;
        }
        if (m21567D0 == 10) {
            m21575I0();
            this.f26240D = true;
            return true;
        }
        if (m21567D0 == 108) {
            m21575I0();
            this.f26238B = true;
            return true;
        }
        if (m21567D0 != 109) {
            return this.f26266g.requestFeature(m21567D0);
        }
        m21575I0();
        this.f26239C = true;
        return true;
    }

    /* renamed from: z0 */
    public final AbstractC4275a m21622z0() {
        return this.f26270j;
    }
}
