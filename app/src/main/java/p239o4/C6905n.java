package p239o4;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.HashSet;
import p329t3.C8620j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o4/n.class
 */
/* renamed from: o4.n */
/* loaded from: combined.jar:classes1.jar:o4/n.class */
public class C6905n extends Fragment {

    /* renamed from: b */
    public C8620j f35738b;

    /* renamed from: c */
    public final C6892a f35739c;

    /* renamed from: d */
    public final InterfaceC6903l f35740d;

    /* renamed from: e */
    public final HashSet<C6905n> f35741e;

    /* renamed from: f */
    public C6905n f35742f;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o4/n$b.class
     */
    /* renamed from: o4.n$b */
    /* loaded from: combined.jar:classes1.jar:o4/n$b.class */
    public class b implements InterfaceC6903l {

        /* renamed from: a */
        public final C6905n f35743a;

        public b(C6905n c6905n) {
            this.f35743a = c6905n;
        }
    }

    public C6905n() {
        this(new C6892a());
    }

    @SuppressLint({"ValidFragment"})
    public C6905n(C6892a c6892a) {
        this.f35740d = new b();
        this.f35741e = new HashSet<>();
        this.f35739c = c6892a;
    }

    /* renamed from: m */
    public final void m31832m(C6905n c6905n) {
        this.f35741e.add(c6905n);
    }

    /* renamed from: n */
    public C6892a m31833n() {
        return this.f35739c;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            C6905n m31824i = C6902k.m31817c().m31824i(getActivity().getSupportFragmentManager());
            this.f35742f = m31824i;
            if (m31824i != this) {
                m31824i.m31832m(this);
            }
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f35739c.m31799b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        C6905n c6905n = this.f35742f;
        if (c6905n != null) {
            c6905n.m31836s(this);
            this.f35742f = null;
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        C8620j c8620j = this.f35738b;
        if (c8620j != null) {
            c8620j.m37031s();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f35739c.m31800c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f35739c.m31801d();
    }

    /* renamed from: p */
    public C8620j m31834p() {
        return this.f35738b;
    }

    /* renamed from: q */
    public InterfaceC6903l m31835q() {
        return this.f35740d;
    }

    /* renamed from: s */
    public final void m31836s(C6905n c6905n) {
        this.f35741e.remove(c6905n);
    }

    /* renamed from: u */
    public void m31837u(C8620j c8620j) {
        this.f35738b = c8620j;
    }
}
