package androidx.mediarouter.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import p208m1.C5900i;
import p208m1.C5901j;
import p235o0.AbstractC6808b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/mediarouter/app/MediaRouteActionProvider.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/MediaRouteActionProvider.class */
public class MediaRouteActionProvider extends AbstractC6808b {

    /* renamed from: d */
    public final C5901j f3822d;

    /* renamed from: e */
    public final C0598a f3823e;

    /* renamed from: f */
    public C5900i f3824f;

    /* renamed from: g */
    public C0608e f3825g;

    /* renamed from: h */
    public MediaRouteButton f3826h;

    /* renamed from: i */
    public boolean f3827i;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/MediaRouteActionProvider$a.class
     */
    /* renamed from: androidx.mediarouter.app.MediaRouteActionProvider$a */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/MediaRouteActionProvider$a.class */
    public static final class C0598a extends C5901j.a {

        /* renamed from: a */
        public final WeakReference<MediaRouteActionProvider> f3828a;

        public C0598a(MediaRouteActionProvider mediaRouteActionProvider) {
            this.f3828a = new WeakReference<>(mediaRouteActionProvider);
        }

        @Override // p208m1.C5901j.a
        /* renamed from: a */
        public void mo3231a(C5901j c5901j, C5901j.g gVar) {
            m3237o(c5901j);
        }

        @Override // p208m1.C5901j.a
        /* renamed from: b */
        public void mo3232b(C5901j c5901j, C5901j.g gVar) {
            m3237o(c5901j);
        }

        @Override // p208m1.C5901j.a
        /* renamed from: c */
        public void mo3233c(C5901j c5901j, C5901j.g gVar) {
            m3237o(c5901j);
        }

        @Override // p208m1.C5901j.a
        /* renamed from: d */
        public void mo3234d(C5901j c5901j, C5901j.h hVar) {
            m3237o(c5901j);
        }

        @Override // p208m1.C5901j.a
        /* renamed from: e */
        public void mo3235e(C5901j c5901j, C5901j.h hVar) {
            m3237o(c5901j);
        }

        @Override // p208m1.C5901j.a
        /* renamed from: g */
        public void mo3236g(C5901j c5901j, C5901j.h hVar) {
            m3237o(c5901j);
        }

        /* renamed from: o */
        public final void m3237o(C5901j c5901j) {
            MediaRouteActionProvider mediaRouteActionProvider = this.f3828a.get();
            if (mediaRouteActionProvider != null) {
                mediaRouteActionProvider.m3227n();
            } else {
                c5901j.m28882s(this);
            }
        }
    }

    public MediaRouteActionProvider(Context context) {
        super(context);
        this.f3824f = C5900i.f33081c;
        this.f3825g = C0608e.m3335a();
        this.f3822d = C5901j.m28867j(context);
        this.f3823e = new C0598a(this);
    }

    @Override // p235o0.AbstractC6808b
    /* renamed from: c */
    public boolean mo3222c() {
        boolean z10 = true;
        if (!this.f3827i) {
            z10 = this.f3822d.m28881q(this.f3824f, 1);
        }
        return z10;
    }

    @Override // p235o0.AbstractC6808b
    /* renamed from: d */
    public View mo3223d() {
        if (this.f3826h != null) {
            Log.e("MRActionProvider", "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
        }
        MediaRouteButton m3226m = m3226m();
        this.f3826h = m3226m;
        m3226m.setCheatSheetEnabled(true);
        this.f3826h.setRouteSelector(this.f3824f);
        this.f3826h.setAlwaysVisible(this.f3827i);
        this.f3826h.setDialogFactory(this.f3825g);
        this.f3826h.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return this.f3826h;
    }

    @Override // p235o0.AbstractC6808b
    /* renamed from: f */
    public boolean mo3224f() {
        MediaRouteButton mediaRouteButton = this.f3826h;
        if (mediaRouteButton != null) {
            return mediaRouteButton.m3241d();
        }
        return false;
    }

    @Override // p235o0.AbstractC6808b
    /* renamed from: h */
    public boolean mo3225h() {
        return true;
    }

    /* renamed from: m */
    public MediaRouteButton m3226m() {
        return new MediaRouteButton(m31373a());
    }

    /* renamed from: n */
    public void m3227n() {
        m31374i();
    }

    /* renamed from: o */
    public void m3228o(boolean z10) {
        if (this.f3827i != z10) {
            this.f3827i = z10;
            m31374i();
            MediaRouteButton mediaRouteButton = this.f3826h;
            if (mediaRouteButton != null) {
                mediaRouteButton.setAlwaysVisible(this.f3827i);
            }
        }
    }

    /* renamed from: p */
    public void m3229p(C0608e c0608e) {
        if (c0608e == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        if (this.f3825g != c0608e) {
            this.f3825g = c0608e;
            MediaRouteButton mediaRouteButton = this.f3826h;
            if (mediaRouteButton != null) {
                mediaRouteButton.setDialogFactory(c0608e);
            }
        }
    }

    /* renamed from: q */
    public void m3230q(C5900i c5900i) {
        if (c5900i == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f3824f.equals(c5900i)) {
            return;
        }
        if (!this.f3824f.m28857f()) {
            this.f3822d.m28882s(this.f3823e);
        }
        if (!c5900i.m28857f()) {
            this.f3822d.m28871a(c5900i, this.f3823e);
        }
        this.f3824f = c5900i;
        m3227n();
        MediaRouteButton mediaRouteButton = this.f3826h;
        if (mediaRouteButton != null) {
            mediaRouteButton.setRouteSelector(c5900i);
        }
    }
}
