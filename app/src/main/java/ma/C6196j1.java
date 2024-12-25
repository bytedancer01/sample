package ma;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executors;
import p304r9.C8015b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/j1.class
 */
/* renamed from: ma.j1 */
/* loaded from: combined.jar:classes2.jar:ma/j1.class */
public final class C6196j1 {

    /* renamed from: a */
    public final C8015b f33838a;

    /* renamed from: b */
    public final InterfaceC6238l1 f33839b;

    public C6196j1(Context context) {
        InterfaceC6238l1 c6322p1 = Build.VERSION.SDK_INT >= 23 ? new C6322p1(context, C6540ze.m30191a(Executors.newFixedThreadPool(3))) : new C6343q1();
        this.f33838a = new C8015b("BaseNetUtils");
        this.f33839b = c6322p1;
        c6322p1.zza();
    }

    /* renamed from: a */
    public final boolean m29770a() {
        InterfaceC6238l1 interfaceC6238l1 = this.f33839b;
        return interfaceC6238l1 != null && interfaceC6238l1.mo29827k();
    }
}
