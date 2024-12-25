package p383w9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p368v9.InterfaceC9320f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/o2.class
 */
/* renamed from: w9.o2 */
/* loaded from: combined.jar:classes2.jar:w9/o2.class */
public final class C9505o2 {

    /* renamed from: c */
    public static final Status f43363c = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: a */
    public final Set<BasePendingResult<?>> f43364a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b */
    public final C9500n2 f43365b = new C9500n2(this);

    /* renamed from: a */
    public final void m39975a(BasePendingResult<? extends InterfaceC9320f> basePendingResult) {
        this.f43364a.add(basePendingResult);
        basePendingResult.m13151p(this.f43365b);
    }

    /* renamed from: b */
    public final void m39976b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f43364a.toArray(new BasePendingResult[0])) {
            basePendingResult.m13151p(null);
            if (basePendingResult.m13150o()) {
                this.f43364a.remove(basePendingResult);
            }
        }
    }
}
