package p335t9;

import android.os.Bundle;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:t9/r.class
 */
/* renamed from: t9.r */
/* loaded from: combined.jar:classes2.jar:t9/r.class */
public final class C8667r extends AbstractC8670u<Void> {
    public C8667r(int i10, int i11, Bundle bundle) {
        super(i10, 2, bundle);
    }

    @Override // p335t9.AbstractC8670u
    /* renamed from: a */
    public final void mo37160a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m37163b(null);
        } else {
            m37164c(new C8669t(4, "Invalid response to one way request"));
        }
    }

    @Override // p335t9.AbstractC8670u
    /* renamed from: d */
    public final boolean mo37161d() {
        return true;
    }
}
