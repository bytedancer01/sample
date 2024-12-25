package p247oc;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mc.C6551a;
import mc.C6553c;
import p272pc.C7700b;
import p305ra.C8120e0;
import p336ta.C8676a;
import p405xc.C9720a;
import p405xc.InterfaceC9723d;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:oc/b.class
 */
/* renamed from: oc.b */
/* loaded from: combined.jar:classes2.jar:oc/b.class */
public class C6965b implements InterfaceC6964a {

    /* renamed from: c */
    public static volatile InterfaceC6964a f35939c;

    /* renamed from: a */
    public final C8676a f35940a;

    /* renamed from: b */
    public final Map<String, Object> f35941b;

    public C6965b(C8676a c8676a) {
        C9935o.m41850j(c8676a);
        this.f35940a = c8676a;
        this.f35941b = new ConcurrentHashMap();
    }

    @RecentlyNonNull
    /* renamed from: c */
    public static InterfaceC6964a m31964c(@RecentlyNonNull C6553c c6553c, @RecentlyNonNull Context context, @RecentlyNonNull InterfaceC9723d interfaceC9723d) {
        C9935o.m41850j(c6553c);
        C9935o.m41850j(context);
        C9935o.m41850j(interfaceC9723d);
        C9935o.m41850j(context.getApplicationContext());
        if (f35939c == null) {
            synchronized (C6965b.class) {
                try {
                    if (f35939c == null) {
                        Bundle bundle = new Bundle(1);
                        if (c6553c.m30244q()) {
                            interfaceC9723d.mo34245b(C6551a.class, ExecutorC6966c.f35942b, C6967d.f35943a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", c6553c.m30243p());
                        }
                        f35939c = new C6965b(C8120e0.m35230t(context, null, null, null, bundle).m35247u());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f35939c;
    }

    /* renamed from: d */
    public static final /* synthetic */ void m31965d(C9720a c9720a) {
        boolean z10 = ((C6551a) c9720a.m41001a()).f34283a;
        synchronized (C6965b.class) {
            try {
                ((C6965b) f35939c).f35940a.m37170c(z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p247oc.InterfaceC6964a
    /* renamed from: a */
    public void mo31962a(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        if (C7700b.m33639a(str) && C7700b.m33640b(str2, bundle2) && C7700b.m33642d(str, str2, bundle2)) {
            C7700b.m33643e(str, str2, bundle2);
            this.f35940a.m37168a(str, str2, bundle2);
        }
    }

    @Override // p247oc.InterfaceC6964a
    /* renamed from: b */
    public void mo31963b(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Object obj) {
        if (C7700b.m33639a(str) && C7700b.m33641c(str, str2)) {
            this.f35940a.m37169b(str, str2, obj);
        }
    }
}
