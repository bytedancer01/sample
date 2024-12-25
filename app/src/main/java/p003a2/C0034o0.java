package p003a2;

import android.view.View;
import android.view.WindowId;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/o0.class
 */
/* renamed from: a2.o0 */
/* loaded from: combined.jar:classes1.jar:a2/o0.class */
public class C0034o0 implements InterfaceC0036p0 {

    /* renamed from: a */
    public final WindowId f157a;

    public C0034o0(View view) {
        this.f157a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0034o0) && ((C0034o0) obj).f157a.equals(this.f157a);
    }

    public int hashCode() {
        return this.f157a.hashCode();
    }
}
