package ng;

import android.view.View;
import android.view.ViewGroup;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import mg.InterfaceC6602e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ng/a.class
 */
/* renamed from: ng.a */
/* loaded from: combined.jar:classes2.jar:ng/a.class */
public class C6784a {

    /* renamed from: a */
    public boolean f35404a = false;

    /* renamed from: b */
    public final Set<InterfaceC6602e> f35405b = new HashSet();

    /* renamed from: a */
    public boolean m31289a(InterfaceC6602e interfaceC6602e) {
        return this.f35405b.add(interfaceC6602e);
    }

    /* renamed from: b */
    public void m31290b(View view) {
        if (this.f35404a) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        view.setLayoutParams(layoutParams);
        this.f35404a = true;
        Iterator<InterfaceC6602e> it = this.f35405b.iterator();
        while (it.hasNext()) {
            it.next().mo30497g();
        }
    }

    /* renamed from: c */
    public void m31291c(View view) {
        if (this.f35404a) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = -2;
            layoutParams.width = -1;
            view.setLayoutParams(layoutParams);
            this.f35404a = false;
            Iterator<InterfaceC6602e> it = this.f35405b.iterator();
            while (it.hasNext()) {
                it.next().mo30496d();
            }
        }
    }

    /* renamed from: d */
    public void m31292d(View view) {
        if (this.f35404a) {
            m31291c(view);
        } else {
            m31290b(view);
        }
    }
}
