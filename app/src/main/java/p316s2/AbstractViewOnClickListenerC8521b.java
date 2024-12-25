package p316s2;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:s2/b.class
 */
/* renamed from: s2.b */
/* loaded from: combined.jar:classes1.jar:s2/b.class */
public abstract class AbstractViewOnClickListenerC8521b implements View.OnClickListener {

    /* renamed from: b */
    public static boolean f39897b = true;

    /* renamed from: c */
    public static final Runnable f39898c = new Runnable() { // from class: s2.a
        @Override // java.lang.Runnable
        public final void run() {
            AbstractViewOnClickListenerC8521b.f39897b = true;
        }
    };

    /* renamed from: b */
    public abstract void mo14535b(View view);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (f39897b) {
            f39897b = false;
            view.post(f39898c);
            mo14535b(view);
        }
    }
}
