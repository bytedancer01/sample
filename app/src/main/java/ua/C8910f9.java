package ua;

import android.os.Handler;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/f9.class
 */
/* renamed from: ua.f9 */
/* loaded from: combined.jar:classes2.jar:ua/f9.class */
public final class C8910f9 {

    /* renamed from: a */
    public RunnableC8898e9 f41086a;

    /* renamed from: b */
    public final C8970k9 f41087b;

    public C8910f9(C8970k9 c8970k9) {
        this.f41087b = c8970k9;
    }

    /* renamed from: a */
    public final void m37952a() {
        Handler handler;
        this.f41087b.mo37811h();
        if (this.f41086a != null) {
            handler = this.f41087b.f41269c;
            handler.removeCallbacks(this.f41086a);
        }
        if (this.f41087b.f41723a.m37797z().m37900w(null, C8988m3.f41394v0)) {
            this.f41087b.f41723a.m37759A().f41499v.m38091b(false);
        }
    }

    /* renamed from: b */
    public final void m37953b(long j10) {
        Handler handler;
        this.f41086a = new RunnableC8898e9(this, this.f41087b.f41723a.mo37778a().mo22432a(), j10);
        handler = this.f41087b.f41269c;
        handler.postDelayed(this.f41086a, 2000L);
    }
}
