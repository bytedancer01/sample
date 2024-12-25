package p289qe;

import td.C8701p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qe/i.class
 */
/* renamed from: qe.i */
/* loaded from: combined.jar:classes2.jar:qe/i.class */
public final class C7918i {

    /* renamed from: a */
    public final boolean f38058a;

    public C7918i(boolean z10) {
        this.f38058a = z10;
    }

    /* renamed from: a */
    public void m34286a(C8701p[] c8701pArr) {
        if (!this.f38058a || c8701pArr == null || c8701pArr.length < 3) {
            return;
        }
        C8701p c8701p = c8701pArr[0];
        c8701pArr[0] = c8701pArr[2];
        c8701pArr[2] = c8701p;
    }
}
