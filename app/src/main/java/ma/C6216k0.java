package ma;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.cast.CastDevice;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p200l9.C5800r;
import p208m1.C5901j;
import p216m9.AbstractC5997w;
import p216m9.C5941c;
import p216m9.C5947e;
import p216m9.C5991t;
import p230n9.C6721i;
import p304r9.C8015b;
import p313s.C8491c;
import p422y9.C9935o;
import za.InterfaceC10136e;
import za.InterfaceC10138f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/k0.class
 */
@TargetApi(30)
/* renamed from: ma.k0 */
/* loaded from: combined.jar:classes2.jar:ma/k0.class */
public final class C6216k0 {

    /* renamed from: i */
    public static final C8015b f33851i = new C8015b("SessionTransController");

    /* renamed from: a */
    public final C5941c f33852a;

    /* renamed from: f */
    public C5991t f33857f;

    /* renamed from: g */
    public C8491c.a f33858g;

    /* renamed from: h */
    public C5800r f33859h;

    /* renamed from: b */
    public final Set f33853b = Collections.synchronizedSet(new HashSet());

    /* renamed from: e */
    public int f33856e = 0;

    /* renamed from: c */
    public final Handler f33854c = new HandlerC6385s1(Looper.getMainLooper());

    /* renamed from: d */
    public final Runnable f33855d = new Runnable(this) { // from class: ma.f0

        /* renamed from: b */
        public final C6216k0 f33756b;

        {
            this.f33756b = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C6216k0.m29795e(this.f33756b);
        }
    };

    public C6216k0(C5941c c5941c) {
        this.f33852a = c5941c;
    }

    /* renamed from: d */
    public static /* synthetic */ void m29794d(C6216k0 c6216k0, C5800r c5800r) {
        c6216k0.f33859h = c5800r;
        C8491c.a aVar = c6216k0.f33858g;
        if (aVar != null) {
            aVar.m36642b(null);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m29795e(C6216k0 c6216k0) {
        f33851i.m34877e("transfer with type = %d has timed out", Integer.valueOf(c6216k0.f33856e));
        c6216k0.m29805o(101);
    }

    /* renamed from: g */
    public static /* bridge */ /* synthetic */ void m29797g(C6216k0 c6216k0) {
        int i10 = c6216k0.f33856e;
        if (i10 == 0) {
            f33851i.m34873a("No need to notify transferred if the transfer type is unknown", new Object[0]);
            return;
        }
        C5800r c5800r = c6216k0.f33859h;
        if (c5800r == null) {
            f33851i.m34873a("No need to notify with null sessionState", new Object[0]);
            return;
        }
        f33851i.m34873a("notify transferred with type = %d, sessionState = %s", Integer.valueOf(i10), c6216k0.f33859h);
        Iterator it = new HashSet(c6216k0.f33853b).iterator();
        while (it.hasNext()) {
            ((AbstractC5997w) it.next()).mo29368b(c6216k0.f33856e, c5800r);
        }
    }

    /* renamed from: i */
    public static /* bridge */ /* synthetic */ void m29799i(C6216k0 c6216k0) {
        if (c6216k0.f33859h == null) {
            f33851i.m34873a("skip restoring session state due to null SessionState", new Object[0]);
            return;
        }
        C6721i m29804n = c6216k0.m29804n();
        if (m29804n == null) {
            f33851i.m34873a("skip restoring session state due to null RemoteMediaClient", new Object[0]);
        } else {
            f33851i.m34873a("resume SessionState to current session", new Object[0]);
            m29804n.m31013l0(c6216k0.f33859h);
        }
    }

    /* renamed from: j */
    public final void m29800j(C5991t c5991t) {
        this.f33857f = c5991t;
        ((Handler) C9935o.m41850j(this.f33854c)).post(new Runnable(this) { // from class: ma.e0

            /* renamed from: b */
            public final C6216k0 f33742b;

            {
                this.f33742b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ((C5991t) C9935o.m41850j(r0.f33857f)).m29356a(new C6195j0(this.f33742b, null), C5947e.class);
            }
        });
    }

    /* renamed from: k */
    public final /* synthetic */ void m29801k(Exception exc) {
        f33851i.m34879g(exc, "Fail to store SessionState", new Object[0]);
        m29805o(100);
    }

    /* renamed from: l */
    public final void m29802l(C5901j.h hVar, C5901j.h hVar2, C8491c.a aVar) {
        int i10;
        if (new HashSet(this.f33853b).isEmpty()) {
            f33851i.m34873a("No need to prepare transfer without any callback", new Object[0]);
            aVar.m36642b(null);
            return;
        }
        if (hVar.m28999o() != 1) {
            f33851i.m34873a("No need to prepare transfer when transferring from local", new Object[0]);
            aVar.m36642b(null);
            return;
        }
        C6721i m29804n = m29804n();
        if (m29804n == null || !m29804n.m31020p()) {
            f33851i.m34873a("No need to prepare transfer when there is no media session", new Object[0]);
            aVar.m36642b(null);
            return;
        }
        C8015b c8015b = f33851i;
        c8015b.m34873a("Prepare route transfer for changing endpoint", new Object[0]);
        if (hVar2.m28999o() == 0) {
            C6126ff.m29603d(EnumC6057c9.CAST_TRANSFER_TO_LOCAL_USED);
            i10 = 1;
        } else {
            i10 = CastDevice.m13037S(hVar2.m28993i()) == null ? 3 : 2;
        }
        this.f33856e = i10;
        this.f33858g = aVar;
        c8015b.m34873a("notify transferring with type = %d", Integer.valueOf(i10));
        Iterator it = new HashSet(this.f33853b).iterator();
        while (it.hasNext()) {
            ((AbstractC5997w) it.next()).mo29369c(this.f33856e);
        }
        this.f33859h = null;
        m29804n.m31005f0(null).mo42558g(new InterfaceC10138f(this) { // from class: ma.g0

            /* renamed from: a */
            public final C6216k0 f33782a;

            {
                this.f33782a = this;
            }

            @Override // za.InterfaceC10138f
            public final void onSuccess(Object obj) {
                C6216k0.m29794d(this.f33782a, (C5800r) obj);
            }
        }).mo42556e(new InterfaceC10136e(this) { // from class: ma.h0

            /* renamed from: a */
            public final C6216k0 f33792a;

            {
                this.f33792a = this;
            }

            @Override // za.InterfaceC10136e
            public final void onFailure(Exception exc) {
                this.f33792a.m29801k(exc);
            }
        });
        ((Handler) C9935o.m41850j(this.f33854c)).postDelayed((Runnable) C9935o.m41850j(this.f33855d), 10000L);
    }

    /* renamed from: m */
    public final void m29803m(AbstractC5997w abstractC5997w) {
        f33851i.m34873a("register callback = %s", abstractC5997w);
        C9935o.m41845e("Must be called from the main thread.");
        C9935o.m41850j(abstractC5997w);
        this.f33853b.add(abstractC5997w);
    }

    /* renamed from: n */
    public final C6721i m29804n() {
        C5991t c5991t = this.f33857f;
        if (c5991t == null) {
            f33851i.m34873a("skip transferring as SessionManager is null", new Object[0]);
            return null;
        }
        C5947e m29358c = c5991t.m29358c();
        if (m29358c != null) {
            return m29358c.m29290r();
        }
        f33851i.m34873a("skip transferring as CastSession is null", new Object[0]);
        return null;
    }

    /* renamed from: o */
    public final void m29805o(int i10) {
        C8491c.a aVar = this.f33858g;
        if (aVar != null) {
            aVar.m36643c();
        }
        f33851i.m34873a("notify failed transfer with type = %d, reason = %d", Integer.valueOf(this.f33856e), Integer.valueOf(i10));
        Iterator it = new HashSet(this.f33853b).iterator();
        while (it.hasNext()) {
            ((AbstractC5997w) it.next()).mo29367a(this.f33856e, i10);
        }
        m29806p();
    }

    /* renamed from: p */
    public final void m29806p() {
        ((Handler) C9935o.m41850j(this.f33854c)).removeCallbacks((Runnable) C9935o.m41850j(this.f33855d));
        this.f33856e = 0;
        this.f33859h = null;
    }
}
