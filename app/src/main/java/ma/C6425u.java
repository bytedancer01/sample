package ma;

import android.content.Context;
import p208m1.C5901j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/u.class
 */
/* renamed from: ma.u */
/* loaded from: combined.jar:classes2.jar:ma/u.class */
public final class C6425u {

    /* renamed from: a */
    public final Context f34077a;

    /* renamed from: b */
    public C5901j f34078b;

    public C6425u(Context context) {
        this.f34077a = context;
    }

    /* renamed from: a */
    public final C5901j m30058a() {
        if (this.f34078b == null) {
            this.f34078b = C5901j.m28867j(this.f34077a);
        }
        return this.f34078b;
    }

    /* renamed from: b */
    public final void m30059b(C5901j.a aVar) {
        C5901j m30058a = m30058a();
        if (m30058a != null) {
            m30058a.m28882s(aVar);
        }
    }
}
