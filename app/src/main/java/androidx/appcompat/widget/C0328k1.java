package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/k1.class
 */
/* renamed from: androidx.appcompat.widget.k1 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/k1.class */
public class C0328k1 extends ContextWrapper {

    /* renamed from: c */
    public static final Object f2150c = new Object();

    /* renamed from: d */
    public static ArrayList<WeakReference<C0328k1>> f2151d;

    /* renamed from: a */
    public final Resources f2152a;

    /* renamed from: b */
    public final Resources.Theme f2153b;

    public C0328k1(Context context) {
        super(context);
        if (!C0355t1.m1612b()) {
            this.f2152a = new C0334m1(this, context.getResources());
            this.f2153b = null;
            return;
        }
        C0355t1 c0355t1 = new C0355t1(this, context.getResources());
        this.f2152a = c0355t1;
        Resources.Theme newTheme = c0355t1.newTheme();
        this.f2153b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    /* renamed from: a */
    public static boolean m1463a(Context context) {
        boolean z10 = false;
        if (!(context instanceof C0328k1)) {
            z10 = false;
            if (!(context.getResources() instanceof C0334m1)) {
                if (context.getResources() instanceof C0355t1) {
                    z10 = false;
                } else {
                    z10 = false;
                    if (C0355t1.m1612b()) {
                        z10 = true;
                    }
                }
            }
        }
        return z10;
    }

    /* renamed from: b */
    public static Context m1464b(Context context) {
        if (!m1463a(context)) {
            return context;
        }
        synchronized (f2150c) {
            ArrayList<WeakReference<C0328k1>> arrayList = f2151d;
            if (arrayList == null) {
                f2151d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<C0328k1> weakReference = f2151d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f2151d.remove(size);
                    }
                }
                for (int size2 = f2151d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<C0328k1> weakReference2 = f2151d.get(size2);
                    C0328k1 c0328k1 = weakReference2 != null ? weakReference2.get() : null;
                    if (c0328k1 != null && c0328k1.getBaseContext() == context) {
                        return c0328k1;
                    }
                }
            }
            C0328k1 c0328k12 = new C0328k1(context);
            f2151d.add(new WeakReference<>(c0328k12));
            return c0328k12;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f2152a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f2152a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f2153b;
        Resources.Theme theme2 = theme;
        if (theme == null) {
            theme2 = super.getTheme();
        }
        return theme2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f2153b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
