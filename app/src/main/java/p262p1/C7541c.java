package p262p1;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.C0631k;
import androidx.navigation.C0632l;
import androidx.navigation.NavController;
import java.util.Set;
import p359v0.InterfaceC9221c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:p1/c.class
 */
/* renamed from: p1.c */
/* loaded from: combined.jar:classes1.jar:p1/c.class */
public final class C7541c {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p1/c$a.class
     */
    /* renamed from: p1.c$a */
    /* loaded from: combined.jar:classes1.jar:p1/c$a.class */
    public class a implements View.OnClickListener {

        /* renamed from: b */
        public final NavController f36382b;

        /* renamed from: c */
        public final C7540b f36383c;

        public a(NavController navController, C7540b c7540b) {
            this.f36382b = navController;
            this.f36383c = c7540b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C7541c.m32275c(this.f36382b, this.f36383c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.navigation.k] */
    /* renamed from: a */
    public static C0631k m32273a(C0632l c0632l) {
        while (c0632l instanceof C0632l) {
            C0632l c0632l2 = c0632l;
            c0632l = c0632l2.m3577J(c0632l2.m3580M());
        }
        return c0632l;
    }

    /* renamed from: b */
    public static boolean m32274b(C0631k c0631k, Set<Integer> set) {
        while (!set.contains(Integer.valueOf(c0631k.m3569v()))) {
            C0632l m3572y = c0631k.m3572y();
            c0631k = m3572y;
            if (m3572y == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m32275c(NavController navController, C7540b c7540b) {
        InterfaceC9221c m32269b = c7540b.m32269b();
        C0631k m3444h = navController.m3444h();
        Set<Integer> m32270c = c7540b.m32270c();
        if (m32269b != null && m3444h != null && m32274b(m3444h, m32270c)) {
            m32269b.m38847a();
            return true;
        }
        if (navController.m3455s()) {
            return true;
        }
        if (c7540b.m32268a() != null) {
            return c7540b.m32268a().m32272a();
        }
        return false;
    }

    /* renamed from: d */
    public static void m32276d(Toolbar toolbar, NavController navController, C7540b c7540b) {
        navController.m3437a(new C7543e(toolbar, c7540b));
        toolbar.setNavigationOnClickListener(new a(navController, c7540b));
    }
}
