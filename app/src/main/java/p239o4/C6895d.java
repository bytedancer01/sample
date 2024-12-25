package p239o4;

import android.content.Context;
import p239o4.InterfaceC6894c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o4/d.class
 */
/* renamed from: o4.d */
/* loaded from: combined.jar:classes1.jar:o4/d.class */
public class C6895d {
    /* renamed from: a */
    public InterfaceC6894c m31802a(Context context, InterfaceC6894c.a aVar) {
        return context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 ? new C6896e(context, aVar) : new C6900i();
    }
}
