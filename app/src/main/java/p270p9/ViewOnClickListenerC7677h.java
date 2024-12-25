package p270p9;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p9/h.class
 */
/* renamed from: p9.h */
/* loaded from: combined.jar:classes2.jar:p9/h.class */
public final class ViewOnClickListenerC7677h implements View.OnClickListener {

    /* renamed from: b */
    public final long f37419b;

    /* renamed from: c */
    public final C7671b f37420c;

    public ViewOnClickListenerC7677h(C7671b c7671b, long j10) {
        this.f37420c = c7671b;
        this.f37419b = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f37420c.m33565L(view, this.f37419b);
    }
}
