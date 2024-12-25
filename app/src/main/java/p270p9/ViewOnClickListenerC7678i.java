package p270p9;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p9/i.class
 */
/* renamed from: p9.i */
/* loaded from: combined.jar:classes2.jar:p9/i.class */
public final class ViewOnClickListenerC7678i implements View.OnClickListener {

    /* renamed from: b */
    public final long f37421b;

    /* renamed from: c */
    public final C7671b f37422c;

    public ViewOnClickListenerC7678i(C7671b c7671b, long j10) {
        this.f37422c = c7671b;
        this.f37421b = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f37422c.m33569P(view, this.f37421b);
    }
}
