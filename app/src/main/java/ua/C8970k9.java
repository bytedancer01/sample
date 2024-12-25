package ua;

import android.os.Handler;
import android.os.Looper;
import p305ra.HandlerC8369u9;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/k9.class
 */
/* renamed from: ua.k9 */
/* loaded from: combined.jar:classes2.jar:ua/k9.class */
public final class C8970k9 extends AbstractC8905f4 {

    /* renamed from: c */
    public Handler f41269c;

    /* renamed from: d */
    public final C8958j9 f41270d;

    /* renamed from: e */
    public final C8934h9 f41271e;

    /* renamed from: f */
    public final C8910f9 f41272f;

    public C8970k9(C8870c5 c8870c5) {
        super(c8870c5);
        this.f41270d = new C8958j9(this);
        this.f41271e = new C8934h9(this);
        this.f41272f = new C8910f9(this);
    }

    /* renamed from: o */
    public static /* synthetic */ void m38102o(C8970k9 c8970k9, long j10) {
        c8970k9.mo37811h();
        c8970k9.m38106s();
        c8970k9.f41723a.mo37780c().m38416w().m38327b("Activity resumed, time", Long.valueOf(j10));
        C8900f m37797z = c8970k9.f41723a.m37797z();
        C8976l3<Boolean> c8976l3 = C8988m3.f41394v0;
        if (m37797z.m37900w(null, c8976l3)) {
            if (c8970k9.f41723a.m37797z().m37881C() || c8970k9.f41723a.m37759A().f41499v.m38090a()) {
                c8970k9.f41271e.m38037a(j10);
            }
            c8970k9.f41272f.m37952a();
        } else {
            c8970k9.f41272f.m37952a();
            if (c8970k9.f41723a.m37797z().m37881C()) {
                c8970k9.f41271e.m38037a(j10);
            }
        }
        C8958j9 c8958j9 = c8970k9.f41270d;
        c8958j9.f41227a.mo37811h();
        if (c8958j9.f41227a.f41723a.m37787k()) {
            if (!c8958j9.f41227a.f41723a.m37797z().m37900w(null, c8976l3)) {
                c8958j9.f41227a.f41723a.m37759A().f41499v.m38091b(false);
            }
            c8958j9.m38095b(c8958j9.f41227a.f41723a.mo37778a().mo22432a(), false);
        }
    }

    /* renamed from: p */
    public static /* synthetic */ void m38103p(C8970k9 c8970k9, long j10) {
        c8970k9.mo37811h();
        c8970k9.m38106s();
        c8970k9.f41723a.mo37780c().m38416w().m38327b("Activity paused, time", Long.valueOf(j10));
        c8970k9.f41272f.m37953b(j10);
        if (c8970k9.f41723a.m37797z().m37881C()) {
            c8970k9.f41271e.m38038b(j10);
        }
        C8958j9 c8958j9 = c8970k9.f41270d;
        if (c8958j9.f41227a.f41723a.m37797z().m37900w(null, C8988m3.f41394v0)) {
            return;
        }
        c8958j9.f41227a.f41723a.m37759A().f41499v.m38091b(true);
    }

    @Override // ua.AbstractC8905f4
    /* renamed from: m */
    public final boolean mo37908m() {
        return false;
    }

    /* renamed from: s */
    public final void m38106s() {
        mo37811h();
        if (this.f41269c == null) {
            this.f41269c = new HandlerC8369u9(Looper.getMainLooper());
        }
    }
}
