package p003a2;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/u.class
 */
/* renamed from: a2.u */
/* loaded from: combined.jar:classes1.jar:a2/u.class */
public class C0041u implements InterfaceC0042v {

    /* renamed from: a */
    public final ViewGroupOverlay f176a;

    public C0041u(ViewGroup viewGroup) {
        this.f176a = viewGroup.getOverlay();
    }

    @Override // p003a2.InterfaceC0046z
    /* renamed from: a */
    public void mo194a(Drawable drawable) {
        this.f176a.add(drawable);
    }

    @Override // p003a2.InterfaceC0046z
    /* renamed from: b */
    public void mo195b(Drawable drawable) {
        this.f176a.remove(drawable);
    }

    @Override // p003a2.InterfaceC0042v
    /* renamed from: c */
    public void mo196c(View view) {
        this.f176a.add(view);
    }

    @Override // p003a2.InterfaceC0042v
    /* renamed from: d */
    public void mo197d(View view) {
        this.f176a.remove(view);
    }
}
