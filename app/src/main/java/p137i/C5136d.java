package p137i;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import p029c.C0928i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i/d.class
 */
/* renamed from: i.d */
/* loaded from: combined.jar:classes1.jar:i/d.class */
public class C5136d extends ContextWrapper {

    /* renamed from: a */
    public int f29444a;

    /* renamed from: b */
    public Resources.Theme f29445b;

    /* renamed from: c */
    public LayoutInflater f29446c;

    /* renamed from: d */
    public Configuration f29447d;

    /* renamed from: e */
    public Resources f29448e;

    public C5136d() {
        super(null);
    }

    public C5136d(Context context, int i10) {
        super(context);
        this.f29444a = i10;
    }

    public C5136d(Context context, Resources.Theme theme) {
        super(context);
        this.f29445b = theme;
    }

    /* renamed from: a */
    public void m25745a(Configuration configuration) {
        if (this.f29448e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f29447d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f29447d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final Resources m25746b() {
        if (this.f29448e == null) {
            Configuration configuration = this.f29447d;
            this.f29448e = configuration == null ? super.getResources() : createConfigurationContext(configuration).getResources();
        }
        return this.f29448e;
    }

    /* renamed from: c */
    public int m25747c() {
        return this.f29444a;
    }

    /* renamed from: d */
    public final void m25748d() {
        boolean z10 = this.f29445b == null;
        if (z10) {
            this.f29445b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f29445b.setTo(theme);
            }
        }
        m25749e(this.f29445b, this.f29444a, z10);
    }

    /* renamed from: e */
    public void m25749e(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m25746b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f29446c == null) {
            this.f29446c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f29446c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f29445b;
        if (theme != null) {
            return theme;
        }
        if (this.f29444a == 0) {
            this.f29444a = C0928i.f6281e;
        }
        m25748d();
        return this.f29445b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f29444a != i10) {
            this.f29444a = i10;
            m25748d();
        }
    }
}
