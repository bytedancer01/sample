package p200l9;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C2414a;
import com.google.android.gms.common.api.GoogleApiClient;
import p200l9.C5758e;
import p304r9.C8046q0;
import p422y9.C9902d;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/x1.class
 */
/* renamed from: l9.x1 */
/* loaded from: combined.jar:classes2.jar:l9/x1.class */
public final class C5820x1 extends C2414a.a {
    @Override // com.google.android.gms.common.api.C2414a.a
    public final /* bridge */ /* synthetic */ C2414a.f buildClient(Context context, Looper looper, C9902d c9902d, Object obj, GoogleApiClient.InterfaceC2412b interfaceC2412b, GoogleApiClient.InterfaceC2413c interfaceC2413c) {
        C5758e.c cVar = (C5758e.c) obj;
        C9935o.m41851k(cVar, "Setting the API options is required.");
        return new C8046q0(context, looper, c9902d, cVar.f32219b, cVar.f32222e, cVar.f32220c, cVar.f32221d, interfaceC2412b, interfaceC2413c);
    }
}
