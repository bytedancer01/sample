package p383w9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import p368v9.AbstractC9317c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/u.class
 */
/* renamed from: w9.u */
/* loaded from: combined.jar:classes2.jar:w9/u.class */
public final class C9527u implements AbstractC9317c.a {

    /* renamed from: a */
    public final BasePendingResult f43434a;

    /* renamed from: b */
    public final C9535w f43435b;

    public C9527u(C9535w c9535w, BasePendingResult basePendingResult) {
        this.f43435b = c9535w;
        this.f43434a = basePendingResult;
    }

    @Override // p368v9.AbstractC9317c.a
    /* renamed from: a */
    public final void mo39316a(Status status) {
        Map map;
        map = this.f43435b.f43472a;
        map.remove(this.f43434a);
    }
}
