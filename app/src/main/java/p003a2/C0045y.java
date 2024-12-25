package p003a2;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/y.class
 */
/* renamed from: a2.y */
/* loaded from: combined.jar:classes1.jar:a2/y.class */
public class C0045y implements InterfaceC0046z {

    /* renamed from: a */
    public final ViewOverlay f178a;

    public C0045y(View view) {
        this.f178a = view.getOverlay();
    }

    @Override // p003a2.InterfaceC0046z
    /* renamed from: a */
    public void mo194a(Drawable drawable) {
        this.f178a.add(drawable);
    }

    @Override // p003a2.InterfaceC0046z
    /* renamed from: b */
    public void mo195b(Drawable drawable) {
        this.f178a.remove(drawable);
    }
}
