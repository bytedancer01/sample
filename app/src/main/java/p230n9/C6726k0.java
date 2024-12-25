package p230n9;

import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.api.Status;
import org.json.JSONObject;
import p230n9.C6721i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/k0.class
 */
/* renamed from: n9.k0 */
/* loaded from: combined.jar:classes2.jar:n9/k0.class */
public final class C6726k0 implements C6721i.c {

    /* renamed from: b */
    public final Status f35185b;

    /* renamed from: c */
    public final JSONObject f35186c;

    /* renamed from: d */
    public final MediaError f35187d;

    public C6726k0(Status status, JSONObject jSONObject, MediaError mediaError) {
        this.f35185b = status;
        this.f35186c = jSONObject;
        this.f35187d = mediaError;
    }

    @Override // p368v9.InterfaceC9320f
    /* renamed from: w */
    public final Status mo13127w() {
        return this.f35185b;
    }
}
