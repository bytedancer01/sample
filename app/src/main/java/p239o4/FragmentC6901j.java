package p239o4;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.HashSet;
import p329t3.C8620j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o4/j.class
 */
@TargetApi(11)
/* renamed from: o4.j */
/* loaded from: combined.jar:classes1.jar:o4/j.class */
public class FragmentC6901j extends Fragment {

    /* renamed from: b */
    public final C6892a f35724b;

    /* renamed from: c */
    public final InterfaceC6903l f35725c;

    /* renamed from: d */
    public C8620j f35726d;

    /* renamed from: e */
    public final HashSet<FragmentC6901j> f35727e;

    /* renamed from: f */
    public FragmentC6901j f35728f;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o4/j$b.class
     */
    /* renamed from: o4.j$b */
    /* loaded from: combined.jar:classes1.jar:o4/j$b.class */
    public class b implements InterfaceC6903l {

        /* renamed from: a */
        public final FragmentC6901j f35729a;

        public b(FragmentC6901j fragmentC6901j) {
            this.f35729a = fragmentC6901j;
        }
    }

    public FragmentC6901j() {
        this(new C6892a());
    }

    @SuppressLint({"ValidFragment"})
    public FragmentC6901j(C6892a c6892a) {
        this.f35725c = new b();
        this.f35727e = new HashSet<>();
        this.f35724b = c6892a;
    }

    /* renamed from: a */
    public final void m31810a(FragmentC6901j fragmentC6901j) {
        this.f35727e.add(fragmentC6901j);
    }

    /* renamed from: b */
    public C6892a m31811b() {
        return this.f35724b;
    }

    /* renamed from: c */
    public C8620j m31812c() {
        return this.f35726d;
    }

    /* renamed from: d */
    public InterfaceC6903l m31813d() {
        return this.f35725c;
    }

    /* renamed from: e */
    public final void m31814e(FragmentC6901j fragmentC6901j) {
        this.f35727e.remove(fragmentC6901j);
    }

    /* renamed from: f */
    public void m31815f(C8620j c8620j) {
        this.f35726d = c8620j;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            FragmentC6901j m31823h = C6902k.m31817c().m31823h(getActivity().getFragmentManager());
            this.f35728f = m31823h;
            if (m31823h != this) {
                m31823h.m31810a(this);
            }
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f35724b.m31799b();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        FragmentC6901j fragmentC6901j = this.f35728f;
        if (fragmentC6901j != null) {
            fragmentC6901j.m31814e(this);
            this.f35728f = null;
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        C8620j c8620j = this.f35726d;
        if (c8620j != null) {
            c8620j.m37031s();
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f35724b.m31800c();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f35724b.m31801d();
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        C8620j c8620j = this.f35726d;
        if (c8620j != null) {
            c8620j.m37032t(i10);
        }
    }
}
