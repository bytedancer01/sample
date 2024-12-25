package ma;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p208m1.C5900i;
import p208m1.C5901j;
import p208m1.C5911t;
import p208m1.C5912u;
import p216m9.C5941c;
import p304r9.C8015b;
import p304r9.C8028h0;
import p422y9.C9935o;
import za.AbstractC10144i;
import za.InterfaceC10134d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/d0.class
 */
/* renamed from: ma.d0 */
/* loaded from: combined.jar:classes2.jar:ma/d0.class */
public final class BinderC6069d0 extends AbstractBinderC6236l {

    /* renamed from: g */
    public static final C8015b f33719g = new C8015b("MediaRouterProxy");

    /* renamed from: b */
    public final C5901j f33720b;

    /* renamed from: c */
    public final C5941c f33721c;

    /* renamed from: d */
    public final Map f33722d = new HashMap();

    /* renamed from: e */
    public C6216k0 f33723e;

    /* renamed from: f */
    public boolean f33724f;

    public BinderC6069d0(Context context, C5901j c5901j, final C5941c c5941c, C8028h0 c8028h0) {
        this.f33720b = c5901j;
        this.f33721c = c5941c;
        if (Build.VERSION.SDK_INT <= 32) {
            f33719g.m34877e("Don't need to set MediaRouterParams for Android S v2 or below", new Object[0]);
            return;
        }
        f33719g.m34873a("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.f33723e = new C6216k0(c5941c);
        Intent intent = new Intent(context, (Class<?>) C5912u.class);
        intent.setPackage(context.getPackageName());
        boolean z10 = !context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.f33724f = z10;
        if (z10) {
            C6126ff.m29603d(EnumC6057c9.CAST_OUTPUT_SWITCHER_ENABLED);
        }
        c8028h0.m34891b(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).mo42554c(new InterfaceC10134d(this, c5941c) { // from class: ma.b0

            /* renamed from: a */
            public final BinderC6069d0 f33673a;

            /* renamed from: b */
            public final C5941c f33674b;

            {
                this.f33673a = this;
                this.f33674b = c5941c;
            }

            @Override // za.InterfaceC10134d
            /* renamed from: a */
            public final void mo26091a(AbstractC10144i abstractC10144i) {
                this.f33673a.m29517B1(this.f33674b, abstractC10144i);
            }
        });
    }

    /* renamed from: B1 */
    public final /* synthetic */ void m29517B1(C5941c c5941c, AbstractC10144i abstractC10144i) {
        boolean z10;
        C5901j c5901j;
        C5941c c5941c2;
        if (abstractC10144i.mo42567p()) {
            Bundle bundle = (Bundle) abstractC10144i.mo42563l();
            boolean z11 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            f33719g.m34873a("The module-to-client output switcher flag %s", true != z11 ? "not existed" : "existed");
            if (z11) {
                z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                C8015b c8015b = f33719g;
                c8015b.m34877e("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(c5941c.m29264c0()));
                boolean z12 = !z10 && c5941c.m29264c0();
                c5901j = this.f33720b;
                if (c5901j != null || (c5941c2 = this.f33721c) == null) {
                }
                boolean m29262a0 = c5941c2.m29262a0();
                boolean m29260Y = c5941c2.m29260Y();
                c5901j.m28887x(new C5911t.a().m29078b(z12).m29080d(m29262a0).m29079c(m29260Y).m29077a());
                c8015b.m34877e("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(this.f33724f), Boolean.valueOf(z12), Boolean.valueOf(m29262a0), Boolean.valueOf(m29260Y));
                if (m29262a0) {
                    this.f33720b.m28886w(new C6525z((C6216k0) C9935o.m41850j(this.f33723e)));
                    C6126ff.m29603d(EnumC6057c9.CAST_TRANSFER_TO_LOCAL_ENABLED);
                    return;
                }
                return;
            }
        }
        z10 = true;
        C8015b c8015b2 = f33719g;
        c8015b2.m34877e("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(c5941c.m29264c0()));
        if (z10) {
        }
        c5901j = this.f33720b;
        if (c5901j != null) {
        }
    }

    /* renamed from: D1 */
    public final void m29519D1(MediaSessionCompat mediaSessionCompat) {
        this.f33720b.m28885v(mediaSessionCompat);
    }

    /* renamed from: E1 */
    public final boolean m29520E1() {
        return this.f33724f;
    }

    /* renamed from: F1 */
    public final void m29521F1(C5900i c5900i, int i10) {
        Set set = (Set) this.f33722d.get(c5900i);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.f33720b.m28872b(c5900i, (C5901j.a) it.next(), i10);
        }
    }

    /* renamed from: G1, reason: merged with bridge method [inline-methods] */
    public final void m29518C1(C5900i c5900i) {
        Set set = (Set) this.f33722d.get(c5900i);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.f33720b.m28882s((C5901j.a) it.next());
        }
    }

    @Override // ma.InterfaceC6257m
    /* renamed from: N0 */
    public final boolean mo29523N0(Bundle bundle, int i10) {
        C5900i m28852d = C5900i.m28852d(bundle);
        if (m28852d == null) {
            return false;
        }
        return this.f33720b.m28881q(m28852d, i10);
    }

    /* renamed from: U0 */
    public final /* synthetic */ void m29524U0(C5900i c5900i, int i10) {
        synchronized (this.f33722d) {
            m29521F1(c5900i, i10);
        }
    }

    @Override // ma.InterfaceC6257m
    /* renamed from: W */
    public final void mo29525W(Bundle bundle, final int i10) {
        final C5900i m28852d = C5900i.m28852d(bundle);
        if (m28852d == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m29521F1(m28852d, i10);
        } else {
            new HandlerC6385s1(Looper.getMainLooper()).post(new Runnable(this, m28852d, i10) { // from class: ma.a0

                /* renamed from: b */
                public final BinderC6069d0 f33642b;

                /* renamed from: c */
                public final C5900i f33643c;

                /* renamed from: d */
                public final int f33644d;

                {
                    this.f33642b = this;
                    this.f33643c = m28852d;
                    this.f33644d = i10;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f33642b.m29524U0(this.f33643c, this.f33644d);
                }
            });
        }
    }

    @Override // ma.InterfaceC6257m
    /* renamed from: Z0 */
    public final void mo29526Z0(Bundle bundle, InterfaceC6299o interfaceC6299o) {
        C5900i m28852d = C5900i.m28852d(bundle);
        if (m28852d == null) {
            return;
        }
        if (!this.f33722d.containsKey(m28852d)) {
            this.f33722d.put(m28852d, new HashSet());
        }
        ((Set) this.f33722d.get(m28852d)).add(new C6320p(interfaceC6299o));
    }

    @Override // ma.InterfaceC6257m
    /* renamed from: d */
    public final void mo29527d() {
        Iterator it = this.f33722d.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Set) it.next()).iterator();
            while (it2.hasNext()) {
                this.f33720b.m28882s((C5901j.a) it2.next());
            }
        }
        this.f33722d.clear();
    }

    @Override // ma.InterfaceC6257m
    /* renamed from: e */
    public final void mo29528e(Bundle bundle) {
        final C5900i m28852d = C5900i.m28852d(bundle);
        if (m28852d == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m29518C1(m28852d);
        } else {
            new HandlerC6385s1(Looper.getMainLooper()).post(new Runnable(this, m28852d) { // from class: ma.c0

                /* renamed from: b */
                public final BinderC6069d0 f33694b;

                /* renamed from: c */
                public final C5900i f33695c;

                {
                    this.f33694b = this;
                    this.f33695c = m28852d;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f33694b.m29518C1(this.f33695c);
                }
            });
        }
    }

    @Override // ma.InterfaceC6257m
    /* renamed from: f */
    public final boolean mo29529f() {
        C5901j.h m28876g = this.f33720b.m28876g();
        return m28876g != null && this.f33720b.m28880n().m28995k().equals(m28876g.m28995k());
    }

    @Override // ma.InterfaceC6257m
    /* renamed from: h */
    public final boolean mo29530h() {
        C5901j.h m28875f = this.f33720b.m28875f();
        return m28875f != null && this.f33720b.m28880n().m28995k().equals(m28875f.m28995k());
    }

    @Override // ma.InterfaceC6257m
    /* renamed from: l */
    public final String mo29531l() {
        return this.f33720b.m28880n().m28995k();
    }

    @Override // ma.InterfaceC6257m
    /* renamed from: p */
    public final void mo29532p() {
        C5901j c5901j = this.f33720b;
        c5901j.m28884u(c5901j.m28876g());
    }

    @Override // ma.InterfaceC6257m
    /* renamed from: q */
    public final void mo29533q(int i10) {
        this.f33720b.m28889z(i10);
    }

    @Override // ma.InterfaceC6257m
    /* renamed from: w */
    public final Bundle mo29534w(String str) {
        for (C5901j.h hVar : this.f33720b.m28879m()) {
            if (hVar.m28995k().equals(str)) {
                return hVar.m28993i();
            }
        }
        return null;
    }

    /* renamed from: y0 */
    public final C6216k0 m29535y0() {
        return this.f33723e;
    }

    @Override // ma.InterfaceC6257m
    /* renamed from: y1 */
    public final void mo29536y1(String str) {
        f33719g.m34873a("select route with routeId = %s", str);
        for (C5901j.h hVar : this.f33720b.m28879m()) {
            if (hVar.m28995k().equals(str)) {
                f33719g.m34873a("media route is found and selected", new Object[0]);
                this.f33720b.m28884u(hVar);
                return;
            }
        }
    }
}
