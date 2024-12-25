package ma;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/fi.class
 */
/* renamed from: ma.fi */
/* loaded from: combined.jar:classes2.jar:ma/fi.class */
public final class ViewOnClickListenerC6129fi implements View.OnClickListener {

    /* renamed from: b */
    public final ViewTreeObserverOnGlobalLayoutListenerC6403sj f33780b;

    public ViewOnClickListenerC6129fi(ViewTreeObserverOnGlobalLayoutListenerC6403sj viewTreeObserverOnGlobalLayoutListenerC6403sj) {
        this.f33780b = viewTreeObserverOnGlobalLayoutListenerC6403sj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f33780b.dismiss();
    }
}
