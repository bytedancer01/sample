package p049d;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.C0250e;
import androidx.appcompat.view.menu.InterfaceC0254i;
import androidx.appcompat.widget.C0340o1;
import androidx.appcompat.widget.InterfaceC0333m0;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p049d.AbstractC4275a;
import p137i.WindowCallbackC5145m;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:d/k.class
 */
/* renamed from: d.k */
/* loaded from: combined.jar:classes1.jar:d/k.class */
public class C4285k extends AbstractC4275a {

    /* renamed from: a */
    public InterfaceC0333m0 f26347a;

    /* renamed from: b */
    public boolean f26348b;

    /* renamed from: c */
    public Window.Callback f26349c;

    /* renamed from: d */
    public boolean f26350d;

    /* renamed from: e */
    public boolean f26351e;

    /* renamed from: f */
    public ArrayList<AbstractC4275a.b> f26352f = new ArrayList<>();

    /* renamed from: g */
    public final Runnable f26353g = new a(this);

    /* renamed from: h */
    public final Toolbar.InterfaceC0293f f26354h;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/k$a.class
     */
    /* renamed from: d.k$a */
    /* loaded from: combined.jar:classes1.jar:d/k$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final C4285k f26355b;

        public a(C4285k c4285k) {
            this.f26355b = c4285k;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26355b.m21676A();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/k$b.class
     */
    /* renamed from: d.k$b */
    /* loaded from: combined.jar:classes1.jar:d/k$b.class */
    public class b implements Toolbar.InterfaceC0293f {

        /* renamed from: a */
        public final C4285k f26356a;

        public b(C4285k c4285k) {
            this.f26356a = c4285k;
        }

        @Override // androidx.appcompat.widget.Toolbar.InterfaceC0293f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f26356a.f26349c.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/k$c.class
     */
    /* renamed from: d.k$c */
    /* loaded from: combined.jar:classes1.jar:d/k$c.class */
    public final class c implements InterfaceC0254i.a {

        /* renamed from: b */
        public boolean f26357b;

        /* renamed from: c */
        public final C4285k f26358c;

        public c(C4285k c4285k) {
            this.f26358c = c4285k;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0254i.a
        /* renamed from: b */
        public void mo1006b(C0250e c0250e, boolean z10) {
            if (this.f26357b) {
                return;
            }
            this.f26357b = true;
            this.f26358c.f26347a.mo1494s();
            Window.Callback callback = this.f26358c.f26349c;
            if (callback != null) {
                callback.onPanelClosed(108, c0250e);
            }
            this.f26357b = false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0254i.a
        /* renamed from: c */
        public boolean mo1007c(C0250e c0250e) {
            Window.Callback callback = this.f26358c.f26349c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, c0250e);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/k$d.class
     */
    /* renamed from: d.k$d */
    /* loaded from: combined.jar:classes1.jar:d/k$d.class */
    public final class d implements C0250e.a {

        /* renamed from: b */
        public final C4285k f26359b;

        public d(C4285k c4285k) {
            this.f26359b = c4285k;
        }

        @Override // androidx.appcompat.view.menu.C0250e.a
        /* renamed from: a */
        public boolean mo1003a(C0250e c0250e, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0250e.a
        /* renamed from: b */
        public void mo1004b(C0250e c0250e) {
            C4285k c4285k = this.f26359b;
            if (c4285k.f26349c != null) {
                if (c4285k.f26347a.mo1481f()) {
                    this.f26359b.f26349c.onPanelClosed(108, c0250e);
                } else if (this.f26359b.f26349c.onPreparePanel(0, null, c0250e)) {
                    this.f26359b.f26349c.onMenuOpened(108, c0250e);
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/k$e.class
     */
    /* renamed from: d.k$e */
    /* loaded from: combined.jar:classes1.jar:d/k$e.class */
    public class e extends WindowCallbackC5145m {

        /* renamed from: c */
        public final C4285k f26360c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C4285k c4285k, Window.Callback callback) {
            super(callback);
            this.f26360c = c4285k;
        }

        @Override // p137i.WindowCallbackC5145m, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            return i10 == 0 ? new View(this.f26360c.f26347a.mo1477b()) : super.onCreatePanelView(i10);
        }

        @Override // p137i.WindowCallbackC5145m, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i10, view, menu);
            if (onPreparePanel) {
                C4285k c4285k = this.f26360c;
                if (!c4285k.f26348b) {
                    c4285k.f26347a.mo1482g();
                    this.f26360c.f26348b = true;
                }
            }
            return onPreparePanel;
        }
    }

    public C4285k(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b(this);
        this.f26354h = bVar;
        this.f26347a = new C0340o1(toolbar, false);
        e eVar = new e(this, callback);
        this.f26349c = eVar;
        this.f26347a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(bVar);
        this.f26347a.setWindowTitle(charSequence);
    }

    /* renamed from: A */
    public void m21676A() {
        Menu m21678y = m21678y();
        C0250e c0250e = m21678y instanceof C0250e ? (C0250e) m21678y : null;
        if (c0250e != null) {
            c0250e.m981d0();
        }
        try {
            m21678y.clear();
            if (!this.f26349c.onCreatePanelMenu(0, m21678y) || !this.f26349c.onPreparePanel(0, null, m21678y)) {
                m21678y.clear();
            }
        } finally {
            if (c0250e != null) {
                c0250e.m979c0();
            }
        }
    }

    /* renamed from: B */
    public void m21677B(int i10, int i11) {
        this.f26347a.mo1485j((i10 & i11) | ((i11 ^ (-1)) & this.f26347a.mo1500y()));
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: f */
    public boolean mo21509f() {
        return this.f26347a.mo1478c();
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: g */
    public boolean mo21510g() {
        if (!this.f26347a.mo1484i()) {
            return false;
        }
        this.f26347a.collapseActionView();
        return true;
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: h */
    public void mo21511h(boolean z10) {
        if (z10 == this.f26351e) {
            return;
        }
        this.f26351e = z10;
        int size = this.f26352f.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f26352f.get(i10).onMenuVisibilityChanged(z10);
        }
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: i */
    public int mo21512i() {
        return this.f26347a.mo1500y();
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: j */
    public Context mo21513j() {
        return this.f26347a.mo1477b();
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: k */
    public boolean mo21514k() {
        this.f26347a.mo1490o().removeCallbacks(this.f26353g);
        C6824g0.m31523h0(this.f26347a.mo1490o(), this.f26353g);
        return true;
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: l */
    public void mo21515l(Configuration configuration) {
        super.mo21515l(configuration);
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: m */
    public void mo21516m() {
        this.f26347a.mo1490o().removeCallbacks(this.f26353g);
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: n */
    public boolean mo21517n(int i10, KeyEvent keyEvent) {
        Menu m21678y = m21678y();
        if (m21678y == null) {
            return false;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z10 = false;
        }
        m21678y.setQwertyMode(z10);
        return m21678y.performShortcut(i10, keyEvent, 0);
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: o */
    public boolean mo21518o(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1) {
            return true;
        }
        mo21519p();
        return true;
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: p */
    public boolean mo21519p() {
        return this.f26347a.mo1479d();
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: q */
    public void mo21520q(boolean z10) {
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: r */
    public void mo21521r(boolean z10) {
        m21677B(z10 ? 4 : 0, 4);
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: s */
    public void mo21522s(int i10) {
        this.f26347a.mo1497v(i10);
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: t */
    public void mo21523t(boolean z10) {
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: u */
    public void mo21524u(CharSequence charSequence) {
        this.f26347a.mo1486k(charSequence);
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: v */
    public void mo21525v(CharSequence charSequence) {
        this.f26347a.setTitle(charSequence);
    }

    @Override // p049d.AbstractC4275a
    /* renamed from: w */
    public void mo21526w(CharSequence charSequence) {
        this.f26347a.setWindowTitle(charSequence);
    }

    /* renamed from: y */
    public final Menu m21678y() {
        if (!this.f26350d) {
            this.f26347a.mo1498w(new c(this), new d(this));
            this.f26350d = true;
        }
        return this.f26347a.mo1487l();
    }

    /* renamed from: z */
    public Window.Callback m21679z() {
        return this.f26349c;
    }
}
