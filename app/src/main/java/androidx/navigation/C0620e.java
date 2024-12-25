package androidx.navigation;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0572g;
import androidx.lifecycle.C0567d0;
import androidx.lifecycle.C0580n;
import androidx.lifecycle.InterfaceC0569e0;
import androidx.lifecycle.InterfaceC0579m;
import androidx.savedstate.C0732b;
import androidx.savedstate.InterfaceC0733c;
import androidx.savedstate.SavedStateRegistry;
import java.util.UUID;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/navigation/e.class
 */
/* renamed from: androidx.navigation.e */
/* loaded from: combined.jar:classes1.jar:androidx/navigation/e.class */
public final class C0620e implements InterfaceC0579m, InterfaceC0569e0, InterfaceC0733c {

    /* renamed from: b */
    public final Context f4178b;

    /* renamed from: c */
    public final C0631k f4179c;

    /* renamed from: d */
    public Bundle f4180d;

    /* renamed from: e */
    public final C0580n f4181e;

    /* renamed from: f */
    public final C0732b f4182f;

    /* renamed from: g */
    public final UUID f4183g;

    /* renamed from: h */
    public AbstractC0572g.c f4184h;

    /* renamed from: i */
    public AbstractC0572g.c f4185i;

    /* renamed from: j */
    public C0627g f4186j;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/e$a.class
     */
    /* renamed from: androidx.navigation.e$a */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/e$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f4187a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:43:0x006d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                androidx.lifecycle.g$b[] r0 = androidx.lifecycle.AbstractC0572g.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                androidx.navigation.C0620e.a.f4187a = r0
                r0 = r4
                androidx.lifecycle.g$b r1 = androidx.lifecycle.AbstractC0572g.b.ON_CREATE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = androidx.navigation.C0620e.a.f4187a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                androidx.lifecycle.g$b r1 = androidx.lifecycle.AbstractC0572g.b.ON_STOP     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = androidx.navigation.C0620e.a.f4187a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                androidx.lifecycle.g$b r1 = androidx.lifecycle.AbstractC0572g.b.ON_START     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = androidx.navigation.C0620e.a.f4187a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                androidx.lifecycle.g$b r1 = androidx.lifecycle.AbstractC0572g.b.ON_PAUSE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = androidx.navigation.C0620e.a.f4187a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                androidx.lifecycle.g$b r1 = androidx.lifecycle.AbstractC0572g.b.ON_RESUME     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = androidx.navigation.C0620e.a.f4187a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                androidx.lifecycle.g$b r1 = androidx.lifecycle.AbstractC0572g.b.ON_DESTROY     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = androidx.navigation.C0620e.a.f4187a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
                androidx.lifecycle.g$b r1 = androidx.lifecycle.AbstractC0572g.b.ON_ANY     // Catch: java.lang.NoSuchFieldError -> L71
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L71
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L71
            L58:
                return
            L59:
                r4 = move-exception
                goto L14
            L5d:
                r4 = move-exception
                goto L1f
            L61:
                r4 = move-exception
                goto L2a
            L65:
                r4 = move-exception
                goto L35
            L69:
                r4 = move-exception
                goto L40
            L6d:
                r4 = move-exception
                goto L4c
            L71:
                r4 = move-exception
                goto L58
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C0620e.a.m43064clinit():void");
        }
    }

    public C0620e(Context context, C0631k c0631k, Bundle bundle, InterfaceC0579m interfaceC0579m, C0627g c0627g) {
        this(context, c0631k, bundle, interfaceC0579m, c0627g, UUID.randomUUID(), null);
    }

    public C0620e(Context context, C0631k c0631k, Bundle bundle, InterfaceC0579m interfaceC0579m, C0627g c0627g, UUID uuid, Bundle bundle2) {
        this.f4181e = new C0580n(this);
        C0732b m4739a = C0732b.m4739a(this);
        this.f4182f = m4739a;
        this.f4184h = AbstractC0572g.c.CREATED;
        this.f4185i = AbstractC0572g.c.RESUMED;
        this.f4178b = context;
        this.f4183g = uuid;
        this.f4179c = c0631k;
        this.f4180d = bundle;
        this.f4186j = c0627g;
        m4739a.m4741c(bundle2);
        if (interfaceC0579m != null) {
            this.f4184h = interfaceC0579m.getLifecycle().mo3155b();
        }
    }

    /* renamed from: d */
    public static AbstractC0572g.c m3496d(AbstractC0572g.b bVar) {
        switch (a.f4187a[bVar.ordinal()]) {
            case 1:
            case 2:
                return AbstractC0572g.c.CREATED;
            case 3:
            case 4:
                return AbstractC0572g.c.STARTED;
            case 5:
                return AbstractC0572g.c.RESUMED;
            case 6:
                return AbstractC0572g.c.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + bVar);
        }
    }

    /* renamed from: a */
    public Bundle m3497a() {
        return this.f4180d;
    }

    /* renamed from: b */
    public C0631k m3498b() {
        return this.f4179c;
    }

    /* renamed from: c */
    public AbstractC0572g.c m3499c() {
        return this.f4185i;
    }

    /* renamed from: e */
    public void m3500e(AbstractC0572g.b bVar) {
        this.f4184h = m3496d(bVar);
        m3504i();
    }

    /* renamed from: f */
    public void m3501f(Bundle bundle) {
        this.f4180d = bundle;
    }

    /* renamed from: g */
    public void m3502g(Bundle bundle) {
        this.f4182f.m4742d(bundle);
    }

    @Override // androidx.lifecycle.InterfaceC0579m
    public AbstractC0572g getLifecycle() {
        return this.f4181e;
    }

    @Override // androidx.savedstate.InterfaceC0733c
    public SavedStateRegistry getSavedStateRegistry() {
        return this.f4182f.m4740b();
    }

    @Override // androidx.lifecycle.InterfaceC0569e0
    public C0567d0 getViewModelStore() {
        C0627g c0627g = this.f4186j;
        if (c0627g != null) {
            return c0627g.m3532h(this.f4183g);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    /* renamed from: h */
    public void m3503h(AbstractC0572g.c cVar) {
        this.f4185i = cVar;
        m3504i();
    }

    /* renamed from: i */
    public void m3504i() {
        C0580n c0580n;
        AbstractC0572g.c cVar;
        if (this.f4184h.ordinal() < this.f4185i.ordinal()) {
            c0580n = this.f4181e;
            cVar = this.f4184h;
        } else {
            c0580n = this.f4181e;
            cVar = this.f4185i;
        }
        c0580n.m3172o(cVar);
    }
}
