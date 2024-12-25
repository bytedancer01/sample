package p262p1;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.C0631k;
import androidx.navigation.NavController;
import java.lang.ref.WeakReference;
import p003a2.C0031n;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:p1/e.class
 */
/* renamed from: p1.e */
/* loaded from: combined.jar:classes1.jar:p1/e.class */
public class C7543e extends AbstractC7539a {

    /* renamed from: f */
    public final WeakReference<Toolbar> f36386f;

    public C7543e(Toolbar toolbar, C7540b c7540b) {
        super(toolbar.getContext(), c7540b);
        this.f36386f = new WeakReference<>(toolbar);
    }

    @Override // p262p1.AbstractC7539a, androidx.navigation.NavController.InterfaceC0615b
    /* renamed from: a */
    public void mo3463a(NavController navController, C0631k c0631k, Bundle bundle) {
        if (this.f36386f.get() == null) {
            navController.m3460x(this);
        } else {
            super.mo3463a(navController, c0631k, bundle);
        }
    }

    @Override // p262p1.AbstractC7539a
    /* renamed from: c */
    public void mo32266c(Drawable drawable, int i10) {
        Toolbar toolbar = this.f36386f.get();
        if (toolbar != null) {
            boolean z10 = drawable == null && toolbar.getNavigationIcon() != null;
            toolbar.setNavigationIcon(drawable);
            toolbar.setNavigationContentDescription(i10);
            if (z10) {
                C0031n.m164a(toolbar);
            }
        }
    }

    @Override // p262p1.AbstractC7539a
    /* renamed from: d */
    public void mo32267d(CharSequence charSequence) {
        this.f36386f.get().setTitle(charSequence);
    }
}
