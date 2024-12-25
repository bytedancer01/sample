package p235o0;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o0/b.class
 */
/* renamed from: o0.b */
/* loaded from: combined.jar:classes1.jar:o0/b.class */
public abstract class AbstractC6808b {

    /* renamed from: a */
    public final Context f35496a;

    /* renamed from: b */
    public a f35497b;

    /* renamed from: c */
    public b f35498c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/b$a.class
     */
    /* renamed from: o0.b$a */
    /* loaded from: combined.jar:classes1.jar:o0/b$a.class */
    public interface a {
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/b$b.class
     */
    /* renamed from: o0.b$b */
    /* loaded from: combined.jar:classes1.jar:o0/b$b.class */
    public interface b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public AbstractC6808b(Context context) {
        this.f35496a = context;
    }

    /* renamed from: a */
    public Context m31373a() {
        return this.f35496a;
    }

    /* renamed from: b */
    public boolean mo26343b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo3222c() {
        return true;
    }

    /* renamed from: d */
    public abstract View mo3223d();

    /* renamed from: e */
    public View mo26345e(MenuItem menuItem) {
        return mo3223d();
    }

    /* renamed from: f */
    public boolean mo3224f() {
        return false;
    }

    /* renamed from: g */
    public void mo26344g(SubMenu subMenu) {
    }

    /* renamed from: h */
    public boolean mo3225h() {
        return false;
    }

    /* renamed from: i */
    public void m31374i() {
        if (this.f35498c == null || !mo3225h()) {
            return;
        }
        this.f35498c.onActionProviderVisibilityChanged(mo3222c());
    }

    /* renamed from: j */
    public void m31375j() {
        this.f35498c = null;
        this.f35497b = null;
    }

    /* renamed from: k */
    public void m31376k(a aVar) {
        this.f35497b = aVar;
    }

    /* renamed from: l */
    public void mo26346l(b bVar) {
        if (this.f35498c != null && bVar != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f35498c = bVar;
    }
}
