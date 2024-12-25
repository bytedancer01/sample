package p383w9;

import android.app.Dialog;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/y2.class
 */
/* renamed from: w9.y2 */
/* loaded from: combined.jar:classes2.jar:w9/y2.class */
public final class C9546y2 extends AbstractC9494m1 {

    /* renamed from: a */
    public final Dialog f43507a;

    /* renamed from: b */
    public final RunnableC9550z2 f43508b;

    public C9546y2(RunnableC9550z2 runnableC9550z2, Dialog dialog) {
        this.f43508b = runnableC9550z2;
        this.f43507a = dialog;
    }

    @Override // p383w9.AbstractC9494m1
    /* renamed from: a */
    public final void mo39951a() {
        this.f43508b.f43513c.m39807o();
        if (this.f43507a.isShowing()) {
            this.f43507a.dismiss();
        }
    }
}
