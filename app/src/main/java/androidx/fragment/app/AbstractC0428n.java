package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.AbstractC0222b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.AbstractC0231c;
import androidx.activity.result.C0229a;
import androidx.activity.result.C0233e;
import androidx.activity.result.InterfaceC0230b;
import androidx.fragment.app.AbstractC0439y;
import androidx.fragment.app.C0418f;
import androidx.fragment.app.C0440z;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0572g;
import androidx.lifecycle.C0567d0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p017b.AbstractC0773a;
import p175k0.C5441b;
import p294r.C7929b;
import p374w0.C9394b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/n.class
 */
/* renamed from: androidx.fragment.app.n */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/n.class */
public abstract class AbstractC0428n {

    /* renamed from: O */
    public static boolean f2917O = false;

    /* renamed from: P */
    public static boolean f2918P = true;

    /* renamed from: A */
    public AbstractC0231c<C0233e> f2919A;

    /* renamed from: B */
    public AbstractC0231c<String[]> f2920B;

    /* renamed from: D */
    public boolean f2922D;

    /* renamed from: E */
    public boolean f2923E;

    /* renamed from: F */
    public boolean f2924F;

    /* renamed from: G */
    public boolean f2925G;

    /* renamed from: H */
    public boolean f2926H;

    /* renamed from: I */
    public ArrayList<C0408a> f2927I;

    /* renamed from: J */
    public ArrayList<Boolean> f2928J;

    /* renamed from: K */
    public ArrayList<Fragment> f2929K;

    /* renamed from: L */
    public ArrayList<q> f2930L;

    /* renamed from: M */
    public C0431q f2931M;

    /* renamed from: b */
    public boolean f2934b;

    /* renamed from: d */
    public ArrayList<C0408a> f2936d;

    /* renamed from: e */
    public ArrayList<Fragment> f2937e;

    /* renamed from: g */
    public OnBackPressedDispatcher f2939g;

    /* renamed from: l */
    public ArrayList<n> f2944l;

    /* renamed from: r */
    public AbstractC0425k<?> f2950r;

    /* renamed from: s */
    public AbstractC0420g f2951s;

    /* renamed from: t */
    public Fragment f2952t;

    /* renamed from: u */
    public Fragment f2953u;

    /* renamed from: z */
    public AbstractC0231c<Intent> f2958z;

    /* renamed from: a */
    public final ArrayList<o> f2933a = new ArrayList<>();

    /* renamed from: c */
    public final C0438x f2935c = new C0438x();

    /* renamed from: f */
    public final LayoutInflaterFactory2C0426l f2938f = new LayoutInflaterFactory2C0426l(this);

    /* renamed from: h */
    public final AbstractC0222b f2940h = new c(this, false);

    /* renamed from: i */
    public final AtomicInteger f2941i = new AtomicInteger();

    /* renamed from: j */
    public final Map<String, Bundle> f2942j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    public final Map<String, Object> f2943k = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    public Map<Fragment, HashSet<C5441b>> f2945m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    public final C0440z.g f2946n = new d(this);

    /* renamed from: o */
    public final C0427m f2947o = new C0427m(this);

    /* renamed from: p */
    public final CopyOnWriteArrayList<InterfaceC0432r> f2948p = new CopyOnWriteArrayList<>();

    /* renamed from: q */
    public int f2949q = -1;

    /* renamed from: v */
    public C0424j f2954v = null;

    /* renamed from: w */
    public C0424j f2955w = new e(this);

    /* renamed from: x */
    public InterfaceC0419f0 f2956x = null;

    /* renamed from: y */
    public InterfaceC0419f0 f2957y = new f(this);

    /* renamed from: C */
    public ArrayDeque<m> f2921C = new ArrayDeque<>();

    /* renamed from: N */
    public Runnable f2932N = new g(this);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/n$a.class
     */
    /* renamed from: androidx.fragment.app.n$a */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/n$a.class */
    public class a implements InterfaceC0230b<C0229a> {

        /* renamed from: a */
        public final AbstractC0428n f2959a;

        public a(AbstractC0428n abstractC0428n) {
            this.f2959a = abstractC0428n;
        }

        @Override // androidx.activity.result.InterfaceC0230b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo807a(C0229a c0229a) {
            m pollFirst = this.f2959a.f2921C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f2973b;
            int i10 = pollFirst.f2974c;
            Fragment m2345i = this.f2959a.f2935c.m2345i(str);
            if (m2345i != null) {
                m2345i.onActivityResult(i10, c0229a.m804c(), c0229a.m803b());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/n$b.class
     */
    /* renamed from: androidx.fragment.app.n$b */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/n$b.class */
    public class b implements InterfaceC0230b<Map<String, Boolean>> {

        /* renamed from: a */
        public final AbstractC0428n f2960a;

        public b(AbstractC0428n abstractC0428n) {
            this.f2960a = abstractC0428n;
        }

        @Override // androidx.activity.result.InterfaceC0230b
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo807a(Map<String, Boolean> map) {
            StringBuilder sb2;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            m pollFirst = this.f2960a.f2921C.pollFirst();
            if (pollFirst == null) {
                sb2 = new StringBuilder();
                sb2.append("No permissions were requested for ");
                sb2.append(this);
            } else {
                String str = pollFirst.f2973b;
                int i11 = pollFirst.f2974c;
                Fragment m2345i = this.f2960a.f2935c.m2345i(str);
                if (m2345i != null) {
                    m2345i.onRequestPermissionsResult(i11, strArr, iArr);
                    return;
                } else {
                    sb2 = new StringBuilder();
                    sb2.append("Permission request result delivered for unknown Fragment ");
                    sb2.append(str);
                }
            }
            Log.w("FragmentManager", sb2.toString());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/n$c.class
     */
    /* renamed from: androidx.fragment.app.n$c */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/n$c.class */
    public class c extends AbstractC0222b {

        /* renamed from: c */
        public final AbstractC0428n f2961c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC0428n abstractC0428n, boolean z10) {
            super(z10);
            this.f2961c = abstractC0428n;
        }

        @Override // androidx.activity.AbstractC0222b
        /* renamed from: b */
        public void mo782b() {
            this.f2961c.m2139C0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/n$d.class
     */
    /* renamed from: androidx.fragment.app.n$d */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/n$d.class */
    public class d implements C0440z.g {

        /* renamed from: a */
        public final AbstractC0428n f2962a;

        public d(AbstractC0428n abstractC0428n) {
            this.f2962a = abstractC0428n;
        }

        @Override // androidx.fragment.app.C0440z.g
        /* renamed from: a */
        public void mo2258a(Fragment fragment, C5441b c5441b) {
            if (c5441b.m27192c()) {
                return;
            }
            this.f2962a.m2198f1(fragment, c5441b);
        }

        @Override // androidx.fragment.app.C0440z.g
        /* renamed from: b */
        public void mo2259b(Fragment fragment, C5441b c5441b) {
            this.f2962a.m2196f(fragment, c5441b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/n$e.class
     */
    /* renamed from: androidx.fragment.app.n$e */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/n$e.class */
    public class e extends C0424j {

        /* renamed from: b */
        public final AbstractC0428n f2963b;

        public e(AbstractC0428n abstractC0428n) {
            this.f2963b = abstractC0428n;
        }

        @Override // androidx.fragment.app.C0424j
        /* renamed from: a */
        public Fragment mo2105a(ClassLoader classLoader, String str) {
            return this.f2963b.m2241u0().m2076b(this.f2963b.m2241u0().m2107f(), str, null);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/n$f.class
     */
    /* renamed from: androidx.fragment.app.n$f */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/n$f.class */
    public class f implements InterfaceC0419f0 {

        /* renamed from: a */
        public final AbstractC0428n f2964a;

        public f(AbstractC0428n abstractC0428n) {
            this.f2964a = abstractC0428n;
        }

        @Override // androidx.fragment.app.InterfaceC0419f0
        /* renamed from: a */
        public AbstractC0417e0 mo2075a(ViewGroup viewGroup) {
            return new C0412c(viewGroup);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/n$g.class
     */
    /* renamed from: androidx.fragment.app.n$g */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/n$g.class */
    public class g implements Runnable {

        /* renamed from: b */
        public final AbstractC0428n f2965b;

        public g(AbstractC0428n abstractC0428n) {
            this.f2965b = abstractC0428n;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2965b.m2187b0(true);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/n$h.class
     */
    /* renamed from: androidx.fragment.app.n$h */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/n$h.class */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final ViewGroup f2966b;

        /* renamed from: c */
        public final View f2967c;

        /* renamed from: d */
        public final Fragment f2968d;

        /* renamed from: e */
        public final AbstractC0428n f2969e;

        public h(AbstractC0428n abstractC0428n, ViewGroup viewGroup, View view, Fragment fragment) {
            this.f2969e = abstractC0428n;
            this.f2966b = viewGroup;
            this.f2967c = view;
            this.f2968d = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2966b.endViewTransition(this.f2967c);
            animator.removeListener(this);
            Fragment fragment = this.f2968d;
            View view = fragment.mView;
            if (view == null || !fragment.mHidden) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/n$i.class
     */
    /* renamed from: androidx.fragment.app.n$i */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/n$i.class */
    public class i implements InterfaceC0432r {

        /* renamed from: b */
        public final Fragment f2970b;

        /* renamed from: c */
        public final AbstractC0428n f2971c;

        public i(AbstractC0428n abstractC0428n, Fragment fragment) {
            this.f2971c = abstractC0428n;
            this.f2970b = fragment;
        }

        @Override // androidx.fragment.app.InterfaceC0432r
        /* renamed from: a */
        public void mo2034a(AbstractC0428n abstractC0428n, Fragment fragment) {
            this.f2970b.onAttachFragment(fragment);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/n$j.class
     */
    /* renamed from: androidx.fragment.app.n$j */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/n$j.class */
    public class j implements InterfaceC0230b<C0229a> {

        /* renamed from: a */
        public final AbstractC0428n f2972a;

        public j(AbstractC0428n abstractC0428n) {
            this.f2972a = abstractC0428n;
        }

        @Override // androidx.activity.result.InterfaceC0230b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo807a(C0229a c0229a) {
            m pollFirst = this.f2972a.f2921C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f2973b;
            int i10 = pollFirst.f2974c;
            Fragment m2345i = this.f2972a.f2935c.m2345i(str);
            if (m2345i != null) {
                m2345i.onActivityResult(i10, c0229a.m804c(), c0229a.m803b());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/n$k.class
     */
    /* renamed from: androidx.fragment.app.n$k */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/n$k.class */
    public static class k extends AbstractC0773a<C0233e, C0229a> {
        @Override // p017b.AbstractC0773a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent mo2261a(Context context, C0233e c0233e) {
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent m809b = c0233e.m809b();
            C0233e c0233e2 = c0233e;
            if (m809b != null) {
                Bundle bundleExtra = m809b.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                c0233e2 = c0233e;
                if (bundleExtra != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    m809b.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    c0233e2 = c0233e;
                    if (m809b.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        c0233e2 = new C0233e.b(c0233e.m812k()).m816b(null).m817c(c0233e.m811j(), c0233e.m810c()).m815a();
                    }
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0233e2);
            if (AbstractC0428n.m2129G0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // p017b.AbstractC0773a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C0229a mo2262c(int i10, Intent intent) {
            return new C0229a(i10, intent);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/n$l.class
     */
    /* renamed from: androidx.fragment.app.n$l */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/n$l.class */
    public static abstract class l {
        @Deprecated
        /* renamed from: a */
        public void m2265a(AbstractC0428n abstractC0428n, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: b */
        public void m2266b(AbstractC0428n abstractC0428n, Fragment fragment, Context context) {
        }

        /* renamed from: c */
        public void m2267c(AbstractC0428n abstractC0428n, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: d */
        public void m2268d(AbstractC0428n abstractC0428n, Fragment fragment) {
        }

        /* renamed from: e */
        public void mo2269e(AbstractC0428n abstractC0428n, Fragment fragment) {
        }

        /* renamed from: f */
        public void m2270f(AbstractC0428n abstractC0428n, Fragment fragment) {
        }

        /* renamed from: g */
        public void m2271g(AbstractC0428n abstractC0428n, Fragment fragment, Context context) {
        }

        /* renamed from: h */
        public void m2272h(AbstractC0428n abstractC0428n, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: i */
        public void m2273i(AbstractC0428n abstractC0428n, Fragment fragment) {
        }

        /* renamed from: j */
        public void m2274j(AbstractC0428n abstractC0428n, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: k */
        public void m2275k(AbstractC0428n abstractC0428n, Fragment fragment) {
        }

        /* renamed from: l */
        public void m2276l(AbstractC0428n abstractC0428n, Fragment fragment) {
        }

        /* renamed from: m */
        public void m2277m(AbstractC0428n abstractC0428n, Fragment fragment, View view, Bundle bundle) {
        }

        /* renamed from: n */
        public void m2278n(AbstractC0428n abstractC0428n, Fragment fragment) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/n$m.class
     */
    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.fragment.app.n$m */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/n$m.class */
    public static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: b */
        public String f2973b;

        /* renamed from: c */
        public int f2974c;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/fragment/app/n$m$a.class
         */
        /* renamed from: androidx.fragment.app.n$m$a */
        /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/n$m$a.class */
        public class a implements Parcelable.Creator<m> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public m[] newArray(int i10) {
                return new m[i10];
            }
        }

        public m(Parcel parcel) {
            this.f2973b = parcel.readString();
            this.f2974c = parcel.readInt();
        }

        public m(String str, int i10) {
            this.f2973b = str;
            this.f2974c = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f2973b);
            parcel.writeInt(this.f2974c);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/n$n.class
     */
    /* renamed from: androidx.fragment.app.n$n */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/n$n.class */
    public interface n {
        void onBackStackChanged();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/n$o.class
     */
    /* renamed from: androidx.fragment.app.n$o */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/n$o.class */
    public interface o {
        /* renamed from: a */
        boolean mo1963a(ArrayList<C0408a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/n$p.class
     */
    /* renamed from: androidx.fragment.app.n$p */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/n$p.class */
    public class p implements o {

        /* renamed from: a */
        public final String f2975a;

        /* renamed from: b */
        public final int f2976b;

        /* renamed from: c */
        public final int f2977c;

        /* renamed from: d */
        public final AbstractC0428n f2978d;

        public p(AbstractC0428n abstractC0428n, String str, int i10, int i11) {
            this.f2978d = abstractC0428n;
            this.f2975a = str;
            this.f2976b = i10;
            this.f2977c = i11;
        }

        @Override // androidx.fragment.app.AbstractC0428n.o
        /* renamed from: a */
        public boolean mo1963a(ArrayList<C0408a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = this.f2978d.f2953u;
            if (fragment == null || this.f2976b >= 0 || this.f2975a != null || !fragment.getChildFragmentManager().m2184Z0()) {
                return this.f2978d.m2188b1(arrayList, arrayList2, this.f2975a, this.f2976b, this.f2977c);
            }
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/n$q.class
     */
    /* renamed from: androidx.fragment.app.n$q */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/n$q.class */
    public static class q implements Fragment.InterfaceC0406l {

        /* renamed from: a */
        public final boolean f2979a;

        /* renamed from: b */
        public final C0408a f2980b;

        /* renamed from: c */
        public int f2981c;

        public q(C0408a c0408a, boolean z10) {
            this.f2979a = z10;
            this.f2980b = c0408a;
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC0406l
        /* renamed from: a */
        public void mo1945a() {
            this.f2981c++;
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC0406l
        /* renamed from: b */
        public void mo1946b() {
            int i10 = this.f2981c - 1;
            this.f2981c = i10;
            if (i10 != 0) {
                return;
            }
            this.f2980b.f2743t.m2224o1();
        }

        /* renamed from: c */
        public void m2281c() {
            C0408a c0408a = this.f2980b;
            c0408a.f2743t.m2240u(c0408a, this.f2979a, false, false);
        }

        /* renamed from: d */
        public void m2282d() {
            boolean z10 = this.f2981c > 0;
            for (Fragment fragment : this.f2980b.f2743t.m2238t0()) {
                fragment.setOnStartEnterTransitionListener(null);
                if (z10 && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            C0408a c0408a = this.f2980b;
            c0408a.f2743t.m2240u(c0408a, this.f2979a, !z10, true);
        }

        /* renamed from: e */
        public boolean m2283e() {
            return this.f2981c == 0;
        }
    }

    /* renamed from: A0 */
    public static Fragment m2128A0(View view) {
        Object tag = view.getTag(C9394b.f43075a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* renamed from: G0 */
    public static boolean m2129G0(int i10) {
        return f2917O || Log.isLoggable("FragmentManager", i10);
    }

    /* renamed from: d0 */
    public static void m2133d0(ArrayList<C0408a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            C0408a c0408a = arrayList.get(i10);
            boolean z10 = true;
            if (arrayList2.get(i10).booleanValue()) {
                c0408a.m1973y(-1);
                if (i10 != i11 - 1) {
                    z10 = false;
                }
                c0408a.m1954D(z10);
            } else {
                c0408a.m1973y(1);
                c0408a.m1953C();
            }
            i10++;
        }
    }

    /* renamed from: l1 */
    public static int m2134l1(int i10) {
        int i11 = 8194;
        if (i10 != 4097) {
            i11 = i10 != 4099 ? i10 != 8194 ? 0 : 4097 : 4099;
        }
        return i11;
    }

    /* renamed from: A */
    public void m2135A() {
        this.f2923E = false;
        this.f2924F = false;
        this.f2931M.m2296o(false);
        m2171T(0);
    }

    /* renamed from: B */
    public void m2136B(Configuration configuration) {
        for (Fragment fragment : this.f2935c.m2350n()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    /* renamed from: B0 */
    public C0567d0 m2137B0(Fragment fragment) {
        return this.f2931M.m2293l(fragment);
    }

    /* renamed from: C */
    public boolean m2138C(MenuItem menuItem) {
        if (this.f2949q < 1) {
            return false;
        }
        for (Fragment fragment : this.f2935c.m2350n()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C0 */
    public void m2139C0() {
        m2187b0(true);
        if (this.f2940h.m783c()) {
            m2184Z0();
        } else {
            this.f2939g.m780c();
        }
    }

    /* renamed from: D */
    public void m2140D() {
        this.f2923E = false;
        this.f2924F = false;
        this.f2931M.m2296o(false);
        m2171T(1);
    }

    /* renamed from: D0 */
    public void m2141D0(Fragment fragment) {
        if (m2129G0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        m2236s1(fragment);
    }

    /* renamed from: E */
    public boolean m2142E(Menu menu, MenuInflater menuInflater) {
        if (this.f2949q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f2935c.m2350n()) {
            if (fragment != null && m2150I0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                ArrayList<Fragment> arrayList2 = arrayList;
                if (arrayList == null) {
                    arrayList2 = new ArrayList<>();
                }
                arrayList2.add(fragment);
                z10 = true;
                arrayList = arrayList2;
            }
        }
        if (this.f2937e != null) {
            for (int i10 = 0; i10 < this.f2937e.size(); i10++) {
                Fragment fragment2 = this.f2937e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f2937e = arrayList;
        return z10;
    }

    /* renamed from: E0 */
    public void m2143E0(Fragment fragment) {
        if (fragment.mAdded && m2148H0(fragment)) {
            this.f2922D = true;
        }
    }

    /* renamed from: F */
    public void m2144F() {
        this.f2925G = true;
        m2187b0(true);
        m2181Y();
        m2171T(-1);
        this.f2950r = null;
        this.f2951s = null;
        this.f2952t = null;
        if (this.f2939g != null) {
            this.f2940h.m784d();
            this.f2939g = null;
        }
        AbstractC0231c<Intent> abstractC0231c = this.f2958z;
        if (abstractC0231c != null) {
            abstractC0231c.mo799c();
            this.f2919A.mo799c();
            this.f2920B.mo799c();
        }
    }

    /* renamed from: F0 */
    public boolean m2145F0() {
        return this.f2925G;
    }

    /* renamed from: G */
    public void m2146G() {
        m2171T(1);
    }

    /* renamed from: H */
    public void m2147H() {
        for (Fragment fragment : this.f2935c.m2350n()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    /* renamed from: H0 */
    public final boolean m2148H0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.m2222o();
    }

    /* renamed from: I */
    public void m2149I(boolean z10) {
        for (Fragment fragment : this.f2935c.m2350n()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
            }
        }
    }

    /* renamed from: I0 */
    public boolean m2150I0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* renamed from: J */
    public void m2151J(Fragment fragment) {
        Iterator<InterfaceC0432r> it = this.f2948p.iterator();
        while (it.hasNext()) {
            it.next().mo2034a(this, fragment);
        }
    }

    /* renamed from: J0 */
    public boolean m2152J0(Fragment fragment) {
        boolean z10 = true;
        if (fragment == null) {
            return true;
        }
        AbstractC0428n abstractC0428n = fragment.mFragmentManager;
        if (!fragment.equals(abstractC0428n.m2253y0()) || !m2152J0(abstractC0428n.f2952t)) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: K */
    public boolean m2153K(MenuItem menuItem) {
        if (this.f2949q < 1) {
            return false;
        }
        for (Fragment fragment : this.f2935c.m2350n()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K0 */
    public boolean m2154K0(int i10) {
        return this.f2949q >= i10;
    }

    /* renamed from: L */
    public void m2155L(Menu menu) {
        if (this.f2949q < 1) {
            return;
        }
        for (Fragment fragment : this.f2935c.m2350n()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    /* renamed from: L0 */
    public boolean m2156L0() {
        return this.f2923E || this.f2924F;
    }

    /* renamed from: M */
    public final void m2157M(Fragment fragment) {
        if (fragment == null || !fragment.equals(m2200g0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    /* renamed from: M0 */
    public void m2158M0(Fragment fragment, String[] strArr, int i10) {
        if (this.f2920B == null) {
            this.f2950r.m2109k(fragment, strArr, i10);
            return;
        }
        this.f2921C.addLast(new m(fragment.mWho, i10));
        this.f2920B.m808a(strArr);
    }

    /* renamed from: N */
    public void m2159N() {
        m2171T(5);
    }

    /* renamed from: N0 */
    public void m2160N0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (this.f2958z == null) {
            this.f2950r.m2110n(fragment, intent, i10, bundle);
            return;
        }
        this.f2921C.addLast(new m(fragment.mWho, i10));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f2958z.m808a(intent);
    }

    /* renamed from: O */
    public void m2161O(boolean z10) {
        for (Fragment fragment : this.f2935c.m2350n()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
            }
        }
    }

    /* renamed from: O0 */
    public void m2162O0(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (this.f2919A == null) {
            this.f2950r.m2111o(fragment, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (m2129G0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + fragment);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        C0233e m815a = new C0233e.b(intentSender).m816b(intent).m817c(i12, i11).m815a();
        this.f2921C.addLast(new m(fragment.mWho, i10));
        if (m2129G0(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.f2919A.m808a(m815a);
    }

    /* renamed from: P */
    public boolean m2163P(Menu menu) {
        boolean z10 = false;
        if (this.f2949q < 1) {
            return false;
        }
        for (Fragment fragment : this.f2935c.m2350n()) {
            if (fragment != null && m2150I0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: P0 */
    public final void m2164P0(C7929b<Fragment> c7929b) {
        int size = c7929b.size();
        for (int i10 = 0; i10 < size; i10++) {
            Fragment m34373t = c7929b.m34373t(i10);
            if (!m34373t.mAdded) {
                View requireView = m34373t.requireView();
                m34373t.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: Q */
    public void m2165Q() {
        m2251x1();
        m2157M(this.f2953u);
    }

    /* renamed from: Q0 */
    public void m2166Q0(Fragment fragment) {
        if (!this.f2935c.m2339c(fragment.mWho)) {
            if (m2129G0(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f2949q + "since it is not added to " + this);
                return;
            }
            return;
        }
        m2170S0(fragment);
        View view = fragment.mView;
        if (view != null && fragment.mIsNewlyAdded && fragment.mContainer != null) {
            float f10 = fragment.mPostponedAlpha;
            if (f10 > 0.0f) {
                view.setAlpha(f10);
            }
            fragment.mPostponedAlpha = 0.0f;
            fragment.mIsNewlyAdded = false;
            C0418f.d m2073c = C0418f.m2073c(this.f2950r.m2107f(), fragment, true, fragment.getPopDirection());
            if (m2073c != null) {
                Animation animation = m2073c.f2892a;
                if (animation != null) {
                    fragment.mView.startAnimation(animation);
                } else {
                    m2073c.f2893b.setTarget(fragment.mView);
                    m2073c.f2893b.start();
                }
            }
        }
        if (fragment.mHiddenChanged) {
            m2243v(fragment);
        }
    }

    /* renamed from: R */
    public void m2167R() {
        this.f2923E = false;
        this.f2924F = false;
        this.f2931M.m2296o(false);
        m2171T(7);
    }

    /* renamed from: R0 */
    public void m2168R0(int i10, boolean z10) {
        AbstractC0425k<?> abstractC0425k;
        if (this.f2950r == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f2949q) {
            this.f2949q = i10;
            if (f2918P) {
                this.f2935c.m2354r();
            } else {
                Iterator<Fragment> it = this.f2935c.m2350n().iterator();
                while (it.hasNext()) {
                    m2166Q0(it.next());
                }
                for (C0436v c0436v : this.f2935c.m2347k()) {
                    Fragment m2323k = c0436v.m2323k();
                    if (!m2323k.mIsNewlyAdded) {
                        m2166Q0(m2323k);
                    }
                    if (m2323k.mRemoving && !m2323k.isInBackStack()) {
                        this.f2935c.m2353q(c0436v);
                    }
                }
            }
            m2242u1();
            if (this.f2922D && (abstractC0425k = this.f2950r) != null && this.f2949q == 7) {
                abstractC0425k.mo2040p();
                this.f2922D = false;
            }
        }
    }

    /* renamed from: S */
    public void m2169S() {
        this.f2923E = false;
        this.f2924F = false;
        this.f2931M.m2296o(false);
        m2171T(5);
    }

    /* renamed from: S0 */
    public void m2170S0(Fragment fragment) {
        m2172T0(fragment, this.f2949q);
    }

    /* renamed from: T */
    public final void m2171T(int i10) {
        try {
            this.f2934b = true;
            this.f2935c.m2340d(i10);
            m2168R0(i10, false);
            if (f2918P) {
                Iterator<AbstractC0417e0> it = m2234s().iterator();
                while (it.hasNext()) {
                    it.next().m2052j();
                }
            }
            this.f2934b = false;
            m2187b0(true);
        } catch (Throwable th2) {
            this.f2934b = false;
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9  */
    /* renamed from: T0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m2172T0(androidx.fragment.app.Fragment r7, int r8) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.AbstractC0428n.m2172T0(androidx.fragment.app.Fragment, int):void");
    }

    /* renamed from: U */
    public void m2173U() {
        this.f2924F = true;
        this.f2931M.m2296o(true);
        m2171T(4);
    }

    /* renamed from: U0 */
    public void m2174U0() {
        if (this.f2950r == null) {
            return;
        }
        this.f2923E = false;
        this.f2924F = false;
        this.f2931M.m2296o(false);
        for (Fragment fragment : this.f2935c.m2350n()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* renamed from: V */
    public void m2175V() {
        m2171T(2);
    }

    /* renamed from: V0 */
    public void m2176V0(C0422h c0422h) {
        View view;
        for (C0436v c0436v : this.f2935c.m2347k()) {
            Fragment m2323k = c0436v.m2323k();
            if (m2323k.mContainerId == c0422h.getId() && (view = m2323k.mView) != null && view.getParent() == null) {
                m2323k.mContainer = c0422h;
                c0436v.m2314b();
            }
        }
    }

    /* renamed from: W */
    public final void m2177W() {
        if (this.f2926H) {
            this.f2926H = false;
            m2242u1();
        }
    }

    /* renamed from: W0 */
    public void m2178W0(C0436v c0436v) {
        Fragment m2323k = c0436v.m2323k();
        if (m2323k.mDeferStart) {
            if (this.f2934b) {
                this.f2926H = true;
                return;
            }
            m2323k.mDeferStart = false;
            if (f2918P) {
                c0436v.m2325m();
            } else {
                m2170S0(m2323k);
            }
        }
    }

    /* renamed from: X */
    public void m2179X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f2935c.m2341e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f2937e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                Fragment fragment = this.f2937e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<C0408a> arrayList2 = this.f2936d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                C0408a c0408a = this.f2936d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(c0408a.toString());
                c0408a.m1951A(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2941i.get());
        synchronized (this.f2933a) {
            int size3 = this.f2933a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i12 = 0; i12 < size3; i12++) {
                    o oVar = this.f2933a.get(i12);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i12);
                    printWriter.print(": ");
                    printWriter.println(oVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2950r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2951s);
        if (this.f2952t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2952t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2949q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2923E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2924F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2925G);
        if (this.f2922D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2922D);
        }
    }

    /* renamed from: X0 */
    public void m2180X0(int i10, int i11) {
        if (i10 >= 0) {
            m2183Z(new p(this, null, i10, i11), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    /* renamed from: Y */
    public final void m2181Y() {
        if (f2918P) {
            Iterator<AbstractC0417e0> it = m2234s().iterator();
            while (it.hasNext()) {
                it.next().m2052j();
            }
        } else {
            if (this.f2945m.isEmpty()) {
                return;
            }
            for (Fragment fragment : this.f2945m.keySet()) {
                m2219n(fragment);
                m2170S0(fragment);
            }
        }
    }

    /* renamed from: Y0 */
    public void m2182Y0(String str, int i10) {
        m2183Z(new p(this, str, -1, i10), false);
    }

    /* renamed from: Z */
    public void m2183Z(o oVar, boolean z10) {
        if (!z10) {
            if (this.f2950r == null) {
                if (!this.f2925G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            m2225p();
        }
        synchronized (this.f2933a) {
            if (this.f2950r == null) {
                if (!z10) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f2933a.add(oVar);
                m2224o1();
            }
        }
    }

    /* renamed from: Z0 */
    public boolean m2184Z0() {
        return m2186a1(null, -1, 0);
    }

    /* renamed from: a0 */
    public final void m2185a0(boolean z10) {
        if (this.f2934b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f2950r == null) {
            if (!this.f2925G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f2950r.m2108g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            m2225p();
        }
        if (this.f2927I == null) {
            this.f2927I = new ArrayList<>();
            this.f2928J = new ArrayList<>();
        }
        this.f2934b = true;
        try {
            m2197f0(null, null);
        } finally {
            this.f2934b = false;
        }
    }

    /* renamed from: a1 */
    public final boolean m2186a1(String str, int i10, int i11) {
        m2187b0(false);
        m2185a0(true);
        Fragment fragment = this.f2953u;
        if (fragment != null && i10 < 0 && str == null && fragment.getChildFragmentManager().m2184Z0()) {
            return true;
        }
        boolean m2188b1 = m2188b1(this.f2927I, this.f2928J, str, i10, i11);
        if (m2188b1) {
            this.f2934b = true;
            try {
                m2204h1(this.f2927I, this.f2928J);
            } finally {
                m2228q();
            }
        }
        m2251x1();
        m2177W();
        this.f2935c.m2338b();
        return m2188b1;
    }

    /* renamed from: b0 */
    public boolean m2187b0(boolean z10) {
        m2185a0(z10);
        boolean z11 = false;
        while (true) {
            boolean z12 = z11;
            if (!m2215l0(this.f2927I, this.f2928J)) {
                m2251x1();
                m2177W();
                this.f2935c.m2338b();
                return z12;
            }
            this.f2934b = true;
            try {
                m2204h1(this.f2927I, this.f2928J);
                m2228q();
                z11 = true;
            } catch (Throwable th2) {
                m2228q();
                throw th2;
            }
        }
    }

    /* renamed from: b1 */
    public boolean m2188b1(ArrayList<C0408a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int i12;
        ArrayList<C0408a> arrayList3 = this.f2936d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i10 < 0 && (i11 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f2936d.remove(size));
            arrayList2.add(Boolean.TRUE);
            return true;
        }
        if (str != null || i10 >= 0) {
            int size2 = arrayList3.size() - 1;
            while (size2 >= 0) {
                C0408a c0408a = this.f2936d.get(size2);
                if ((str != null && str.equals(c0408a.m1956F())) || (i10 >= 0 && i10 == c0408a.f2745v)) {
                    break;
                }
                size2--;
            }
            if (size2 < 0) {
                return false;
            }
            int i13 = size2;
            if ((i11 & 1) != 0) {
                while (true) {
                    int i14 = size2 - 1;
                    i13 = i14;
                    if (i14 < 0) {
                        break;
                    }
                    C0408a c0408a2 = this.f2936d.get(i14);
                    if (str != null) {
                        size2 = i14;
                        if (str.equals(c0408a2.m1956F())) {
                            continue;
                        }
                    }
                    i13 = i14;
                    if (i10 < 0) {
                        break;
                    }
                    i13 = i14;
                    if (i10 != c0408a2.f2745v) {
                        break;
                    }
                    size2 = i14;
                }
            }
            i12 = i13;
        } else {
            i12 = -1;
        }
        if (i12 == this.f2936d.size() - 1) {
            return false;
        }
        for (int size3 = this.f2936d.size() - 1; size3 > i12; size3--) {
            arrayList.add(this.f2936d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* renamed from: c0 */
    public void m2189c0(o oVar, boolean z10) {
        if (z10 && (this.f2950r == null || this.f2925G)) {
            return;
        }
        m2185a0(z10);
        if (oVar.mo1963a(this.f2927I, this.f2928J)) {
            this.f2934b = true;
            try {
                m2204h1(this.f2927I, this.f2928J);
            } finally {
                m2228q();
            }
        }
        m2251x1();
        m2177W();
        this.f2935c.m2338b();
    }

    /* renamed from: c1 */
    public final int m2190c1(ArrayList<C0408a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11, C7929b<Fragment> c7929b) {
        int i12 = i11 - 1;
        int i13 = i11;
        while (true) {
            int i14 = i13;
            if (i12 < i10) {
                return i14;
            }
            C0408a c0408a = arrayList.get(i12);
            boolean booleanValue = arrayList2.get(i12).booleanValue();
            int i15 = i14;
            if (c0408a.m1959J() && !c0408a.m1958H(arrayList, i12 + 1, i11)) {
                if (this.f2930L == null) {
                    this.f2930L = new ArrayList<>();
                }
                q qVar = new q(c0408a, booleanValue);
                this.f2930L.add(qVar);
                c0408a.m1961L(qVar);
                if (booleanValue) {
                    c0408a.m1953C();
                } else {
                    c0408a.m1954D(false);
                }
                i15 = i14 - 1;
                if (i12 != i15) {
                    arrayList.remove(i12);
                    arrayList.add(i15, c0408a);
                }
                m2191d(c7929b);
            }
            i12--;
            i13 = i15;
        }
    }

    /* renamed from: d */
    public final void m2191d(C7929b<Fragment> c7929b) {
        int i10 = this.f2949q;
        if (i10 < 1) {
            return;
        }
        int min = Math.min(i10, 5);
        for (Fragment fragment : this.f2935c.m2350n()) {
            if (fragment.mState < min) {
                m2172T0(fragment, min);
                if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                    c7929b.add(fragment);
                }
            }
        }
    }

    /* renamed from: d1 */
    public void m2192d1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            m2245v1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    /* renamed from: e */
    public void m2193e(C0408a c0408a) {
        if (this.f2936d == null) {
            this.f2936d = new ArrayList<>();
        }
        this.f2936d.add(c0408a);
    }

    /* renamed from: e0 */
    public final void m2194e0(ArrayList<C0408a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        int i12;
        boolean z10 = arrayList.get(i10).f3051r;
        ArrayList<Fragment> arrayList3 = this.f2929K;
        if (arrayList3 == null) {
            this.f2929K = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f2929K.addAll(this.f2935c.m2350n());
        Fragment m2253y0 = m2253y0();
        boolean z11 = false;
        for (int i13 = i10; i13 < i11; i13++) {
            C0408a c0408a = arrayList.get(i13);
            m2253y0 = !arrayList2.get(i13).booleanValue() ? c0408a.m1955E(this.f2929K, m2253y0) : c0408a.m1962M(this.f2929K, m2253y0);
            z11 = z11 || c0408a.f3042i;
        }
        this.f2929K.clear();
        if (!z10 && this.f2949q >= 1) {
            if (f2918P) {
                for (int i14 = i10; i14 < i11; i14++) {
                    Iterator<AbstractC0439y.a> it = arrayList.get(i14).f3036c.iterator();
                    while (it.hasNext()) {
                        Fragment fragment = it.next().f3054b;
                        if (fragment != null && fragment.mFragmentManager != null) {
                            this.f2935c.m2352p(m2246w(fragment));
                        }
                    }
                }
            } else {
                C0440z.m2376B(this.f2950r.m2107f(), this.f2951s, arrayList, arrayList2, i10, i11, false, this.f2946n);
            }
        }
        m2133d0(arrayList, arrayList2, i10, i11);
        if (f2918P) {
            boolean booleanValue = arrayList2.get(i11 - 1).booleanValue();
            for (int i15 = i10; i15 < i11; i15++) {
                C0408a c0408a2 = arrayList.get(i15);
                if (booleanValue) {
                    for (int size = c0408a2.f3036c.size() - 1; size >= 0; size--) {
                        Fragment fragment2 = c0408a2.f3036c.get(size).f3054b;
                        if (fragment2 != null) {
                            m2246w(fragment2).m2325m();
                        }
                    }
                } else {
                    Iterator<AbstractC0439y.a> it2 = c0408a2.f3036c.iterator();
                    while (it2.hasNext()) {
                        Fragment fragment3 = it2.next().f3054b;
                        if (fragment3 != null) {
                            m2246w(fragment3).m2325m();
                        }
                    }
                }
            }
            m2168R0(this.f2949q, true);
            for (AbstractC0417e0 abstractC0417e0 : m2237t(arrayList, i10, i11)) {
                abstractC0417e0.m2058r(booleanValue);
                abstractC0417e0.m2056p();
                abstractC0417e0.m2049g();
            }
        } else {
            if (z10) {
                C7929b<Fragment> c7929b = new C7929b<>();
                m2191d(c7929b);
                i12 = m2190c1(arrayList, arrayList2, i10, i11, c7929b);
                m2164P0(c7929b);
            } else {
                i12 = i11;
            }
            if (i12 != i10 && z10) {
                if (this.f2949q >= 1) {
                    C0440z.m2376B(this.f2950r.m2107f(), this.f2951s, arrayList, arrayList2, i10, i12, true, this.f2946n);
                }
                m2168R0(this.f2949q, true);
            }
        }
        while (i10 < i11) {
            C0408a c0408a3 = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue() && c0408a3.f2745v >= 0) {
                c0408a3.f2745v = -1;
            }
            c0408a3.m1960K();
            i10++;
        }
        if (z11) {
            m2210j1();
        }
    }

    /* renamed from: e1 */
    public void m2195e1(l lVar, boolean z10) {
        this.f2947o.m2126o(lVar, z10);
    }

    /* renamed from: f */
    public void m2196f(Fragment fragment, C5441b c5441b) {
        if (this.f2945m.get(fragment) == null) {
            this.f2945m.put(fragment, new HashSet<>());
        }
        this.f2945m.get(fragment).add(c5441b);
    }

    /* renamed from: f0 */
    public final void m2197f0(ArrayList<C0408a> arrayList, ArrayList<Boolean> arrayList2) {
        int i10;
        int indexOf;
        int indexOf2;
        ArrayList<q> arrayList3 = this.f2930L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i11 = 0;
        while (true) {
            int i12 = i11;
            int i13 = size;
            if (i12 >= i13) {
                return;
            }
            q qVar = this.f2930L.get(i12);
            if (arrayList == null || qVar.f2979a || (indexOf2 = arrayList.indexOf(qVar.f2980b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if (!qVar.m2283e()) {
                    size = i13;
                    i10 = i12;
                    if (arrayList != null) {
                        size = i13;
                        i10 = i12;
                        if (!qVar.f2980b.m1958H(arrayList, 0, arrayList.size())) {
                        }
                    }
                    i11 = i10 + 1;
                }
                this.f2930L.remove(i12);
                i10 = i12 - 1;
                size = i13 - 1;
                if (arrayList == null || qVar.f2979a || (indexOf = arrayList.indexOf(qVar.f2980b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                    qVar.m2282d();
                    i11 = i10 + 1;
                }
            } else {
                this.f2930L.remove(i12);
                i10 = i12 - 1;
                size = i13 - 1;
            }
            qVar.m2281c();
            i11 = i10 + 1;
        }
    }

    /* renamed from: f1 */
    public void m2198f1(Fragment fragment, C5441b c5441b) {
        HashSet<C5441b> hashSet = this.f2945m.get(fragment);
        if (hashSet != null && hashSet.remove(c5441b) && hashSet.isEmpty()) {
            this.f2945m.remove(fragment);
            if (fragment.mState < 5) {
                m2249x(fragment);
                m2170S0(fragment);
            }
        }
    }

    /* renamed from: g */
    public C0436v m2199g(Fragment fragment) {
        if (m2129G0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C0436v m2246w = m2246w(fragment);
        fragment.mFragmentManager = this;
        this.f2935c.m2352p(m2246w);
        if (!fragment.mDetached) {
            this.f2935c.m2337a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (m2148H0(fragment)) {
                this.f2922D = true;
            }
        }
        return m2246w;
    }

    /* renamed from: g0 */
    public Fragment m2200g0(String str) {
        return this.f2935c.m2342f(str);
    }

    /* renamed from: g1 */
    public void m2201g1(Fragment fragment) {
        if (m2129G0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean isInBackStack = fragment.isInBackStack();
        if (!fragment.mDetached || (!isInBackStack)) {
            this.f2935c.m2355s(fragment);
            if (m2148H0(fragment)) {
                this.f2922D = true;
            }
            fragment.mRemoving = true;
            m2236s1(fragment);
        }
    }

    /* renamed from: h */
    public void m2202h(InterfaceC0432r interfaceC0432r) {
        this.f2948p.add(interfaceC0432r);
    }

    /* renamed from: h0 */
    public Fragment m2203h0(int i10) {
        return this.f2935c.m2343g(i10);
    }

    /* renamed from: h1 */
    public final void m2204h1(ArrayList<C0408a> arrayList, ArrayList<Boolean> arrayList2) {
        int i10;
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        m2197f0(arrayList, arrayList2);
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = i12;
            if (i11 >= size) {
                break;
            }
            int i13 = i11;
            int i14 = i10;
            if (!arrayList.get(i11).f3051r) {
                if (i10 != i11) {
                    m2194e0(arrayList, arrayList2, i10, i11);
                }
                int i15 = i11 + 1;
                i14 = i15;
                if (arrayList2.get(i11).booleanValue()) {
                    while (true) {
                        i14 = i15;
                        if (i15 >= size) {
                            break;
                        }
                        i14 = i15;
                        if (!arrayList2.get(i15).booleanValue()) {
                            break;
                        }
                        i14 = i15;
                        if (arrayList.get(i15).f3051r) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
                m2194e0(arrayList, arrayList2, i11, i14);
                i13 = i14 - 1;
            }
            i11 = i13 + 1;
            i12 = i14;
        }
        if (i10 != size) {
            m2194e0(arrayList, arrayList2, i10, size);
        }
    }

    /* renamed from: i */
    public void m2205i(Fragment fragment) {
        this.f2931M.m2288f(fragment);
    }

    /* renamed from: i0 */
    public Fragment m2206i0(String str) {
        return this.f2935c.m2344h(str);
    }

    /* renamed from: i1 */
    public void m2207i1(Fragment fragment) {
        this.f2931M.m2295n(fragment);
    }

    /* renamed from: j */
    public int m2208j() {
        return this.f2941i.getAndIncrement();
    }

    /* renamed from: j0 */
    public Fragment m2209j0(String str) {
        return this.f2935c.m2345i(str);
    }

    /* renamed from: j1 */
    public final void m2210j1() {
        if (this.f2944l != null) {
            for (int i10 = 0; i10 < this.f2944l.size(); i10++) {
                this.f2944l.get(i10).onBackStackChanged();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    /* JADX WARN: Type inference failed for: r10v3, types: [androidx.activity.c] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.fragment.app.k<?>] */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m2211k(androidx.fragment.app.AbstractC0425k<?> r9, androidx.fragment.app.AbstractC0420g r10, androidx.fragment.app.Fragment r11) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.AbstractC0428n.m2211k(androidx.fragment.app.k, androidx.fragment.app.g, androidx.fragment.app.Fragment):void");
    }

    /* renamed from: k0 */
    public final void m2212k0() {
        if (f2918P) {
            Iterator<AbstractC0417e0> it = m2234s().iterator();
            while (it.hasNext()) {
                it.next().m2053k();
            }
        } else if (this.f2930L != null) {
            while (!this.f2930L.isEmpty()) {
                this.f2930L.remove(0).m2282d();
            }
        }
    }

    /* renamed from: k1 */
    public void m2213k1(Parcelable parcelable) {
        C0436v c0436v;
        if (parcelable == null) {
            return;
        }
        C0430p c0430p = (C0430p) parcelable;
        if (c0430p.f2982b == null) {
            return;
        }
        this.f2935c.m2356t();
        Iterator<C0435u> it = c0430p.f2982b.iterator();
        while (it.hasNext()) {
            C0435u next = it.next();
            if (next != null) {
                Fragment m2290h = this.f2931M.m2290h(next.f3004c);
                if (m2290h != null) {
                    if (m2129G0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + m2290h);
                    }
                    c0436v = new C0436v(this.f2947o, this.f2935c, m2290h, next);
                } else {
                    c0436v = new C0436v(this.f2947o, this.f2935c, this.f2950r.m2107f().getClassLoader(), m2232r0(), next);
                }
                Fragment m2323k = c0436v.m2323k();
                m2323k.mFragmentManager = this;
                if (m2129G0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + m2323k.mWho + "): " + m2323k);
                }
                c0436v.m2327o(this.f2950r.m2107f().getClassLoader());
                this.f2935c.m2352p(c0436v);
                c0436v.m2333u(this.f2949q);
            }
        }
        for (Fragment fragment : this.f2931M.m2292k()) {
            if (!this.f2935c.m2339c(fragment.mWho)) {
                if (m2129G0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + c0430p.f2982b);
                }
                this.f2931M.m2295n(fragment);
                fragment.mFragmentManager = this;
                C0436v c0436v2 = new C0436v(this.f2947o, this.f2935c, fragment);
                c0436v2.m2333u(1);
                c0436v2.m2325m();
                fragment.mRemoving = true;
                c0436v2.m2325m();
            }
        }
        this.f2935c.m2357u(c0430p.f2983c);
        if (c0430p.f2984d != null) {
            this.f2936d = new ArrayList<>(c0430p.f2984d.length);
            int i10 = 0;
            while (true) {
                C0410b[] c0410bArr = c0430p.f2984d;
                if (i10 >= c0410bArr.length) {
                    break;
                }
                C0408a m1976b = c0410bArr[i10].m1976b(this);
                if (m2129G0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + m1976b.f2745v + "): " + m1976b);
                    PrintWriter printWriter = new PrintWriter(new C0415d0("FragmentManager"));
                    m1976b.m1952B("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2936d.add(m1976b);
                i10++;
            }
        } else {
            this.f2936d = null;
        }
        this.f2941i.set(c0430p.f2985e);
        String str = c0430p.f2986f;
        if (str != null) {
            Fragment m2200g0 = m2200g0(str);
            this.f2953u = m2200g0;
            m2157M(m2200g0);
        }
        ArrayList<String> arrayList = c0430p.f2987g;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                Bundle bundle = c0430p.f2988h.get(i11);
                bundle.setClassLoader(this.f2950r.m2107f().getClassLoader());
                this.f2942j.put(arrayList.get(i11), bundle);
            }
        }
        this.f2921C = new ArrayDeque<>(c0430p.f2989i);
    }

    /* renamed from: l */
    public void m2214l(Fragment fragment) {
        if (m2129G0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f2935c.m2337a(fragment);
            if (m2129G0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (m2148H0(fragment)) {
                this.f2922D = true;
            }
        }
    }

    /* renamed from: l0 */
    public final boolean m2215l0(ArrayList<C0408a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f2933a) {
            if (this.f2933a.isEmpty()) {
                return false;
            }
            int size = this.f2933a.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                z10 |= this.f2933a.get(i10).mo1963a(arrayList, arrayList2);
            }
            this.f2933a.clear();
            this.f2950r.m2108g().removeCallbacks(this.f2932N);
            return z10;
        }
    }

    /* renamed from: m */
    public AbstractC0439y m2216m() {
        return new C0408a(this);
    }

    /* renamed from: m0 */
    public int m2217m0() {
        ArrayList<C0408a> arrayList = this.f2936d;
        return arrayList != null ? arrayList.size() : 0;
    }

    /* renamed from: m1 */
    public Parcelable m2218m1() {
        m2212k0();
        m2181Y();
        m2187b0(true);
        this.f2923E = true;
        this.f2931M.m2296o(true);
        ArrayList<C0435u> m2358v = this.f2935c.m2358v();
        if (m2358v.isEmpty()) {
            if (!m2129G0(2)) {
                return null;
            }
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return null;
        }
        ArrayList<String> m2359w = this.f2935c.m2359w();
        ArrayList<C0408a> arrayList = this.f2936d;
        C0410b[] c0410bArr = null;
        if (arrayList != null) {
            int size = arrayList.size();
            c0410bArr = null;
            if (size > 0) {
                C0410b[] c0410bArr2 = new C0410b[size];
                int i10 = 0;
                while (true) {
                    c0410bArr = c0410bArr2;
                    if (i10 >= size) {
                        break;
                    }
                    c0410bArr2[i10] = new C0410b(this.f2936d.get(i10));
                    if (m2129G0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f2936d.get(i10));
                    }
                    i10++;
                }
            }
        }
        C0430p c0430p = new C0430p();
        c0430p.f2982b = m2358v;
        c0430p.f2983c = m2359w;
        c0430p.f2984d = c0410bArr;
        c0430p.f2985e = this.f2941i.get();
        Fragment fragment = this.f2953u;
        if (fragment != null) {
            c0430p.f2986f = fragment.mWho;
        }
        c0430p.f2987g.addAll(this.f2942j.keySet());
        c0430p.f2988h.addAll(this.f2942j.values());
        c0430p.f2989i = new ArrayList<>(this.f2921C);
        return c0430p;
    }

    /* renamed from: n */
    public final void m2219n(Fragment fragment) {
        HashSet<C5441b> hashSet = this.f2945m.get(fragment);
        if (hashSet != null) {
            Iterator<C5441b> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().m27190a();
            }
            hashSet.clear();
            m2249x(fragment);
            this.f2945m.remove(fragment);
        }
    }

    /* renamed from: n0 */
    public final C0431q m2220n0(Fragment fragment) {
        return this.f2931M.m2291i(fragment);
    }

    /* renamed from: n1 */
    public Fragment.C0407m m2221n1(Fragment fragment) {
        C0436v m2349m = this.f2935c.m2349m(fragment.mWho);
        if (m2349m == null || !m2349m.m2323k().equals(fragment)) {
            m2245v1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return m2349m.m2330r();
    }

    /* renamed from: o */
    public boolean m2222o() {
        boolean z10 = false;
        for (Fragment fragment : this.f2935c.m2348l()) {
            boolean z11 = z10;
            if (fragment != null) {
                z11 = m2148H0(fragment);
            }
            z10 = z11;
            if (z11) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o0 */
    public AbstractC0420g m2223o0() {
        return this.f2951s;
    }

    /* renamed from: o1 */
    public void m2224o1() {
        synchronized (this.f2933a) {
            ArrayList<q> arrayList = this.f2930L;
            boolean z10 = false;
            boolean z11 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            if (this.f2933a.size() == 1) {
                z10 = true;
            }
            if (z11 || z10) {
                this.f2950r.m2108g().removeCallbacks(this.f2932N);
                this.f2950r.m2108g().post(this.f2932N);
                m2251x1();
            }
        }
    }

    /* renamed from: p */
    public final void m2225p() {
        if (m2156L0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: p0 */
    public Fragment m2226p0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment m2200g0 = m2200g0(string);
        if (m2200g0 == null) {
            m2245v1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return m2200g0;
    }

    /* renamed from: p1 */
    public void m2227p1(Fragment fragment, boolean z10) {
        ViewGroup m2229q0 = m2229q0(fragment);
        if (m2229q0 == null || !(m2229q0 instanceof C0422h)) {
            return;
        }
        ((C0422h) m2229q0).setDrawDisappearingViewsLast(!z10);
    }

    /* renamed from: q */
    public final void m2228q() {
        this.f2934b = false;
        this.f2928J.clear();
        this.f2927I.clear();
    }

    /* renamed from: q0 */
    public final ViewGroup m2229q0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.f2951s.mo1941d()) {
            return null;
        }
        View mo1940c = this.f2951s.mo1940c(fragment.mContainerId);
        if (mo1940c instanceof ViewGroup) {
            return (ViewGroup) mo1940c;
        }
        return null;
    }

    /* renamed from: q1 */
    public void m2230q1(Fragment fragment, AbstractC0572g.c cVar) {
        if (fragment.equals(m2200g0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: r */
    public final void m2231r(String str) {
        this.f2942j.remove(str);
    }

    /* renamed from: r0 */
    public C0424j m2232r0() {
        C0424j c0424j = this.f2954v;
        if (c0424j != null) {
            return c0424j;
        }
        Fragment fragment = this.f2952t;
        return fragment != null ? fragment.mFragmentManager.m2232r0() : this.f2955w;
    }

    /* renamed from: r1 */
    public void m2233r1(Fragment fragment) {
        if (fragment == null || (fragment.equals(m2200g0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f2953u;
            this.f2953u = fragment;
            m2157M(fragment2);
            m2157M(this.f2953u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: s */
    public final Set<AbstractC0417e0> m2234s() {
        HashSet hashSet = new HashSet();
        Iterator<C0436v> it = this.f2935c.m2347k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().m2323k().mContainer;
            if (viewGroup != null) {
                hashSet.add(AbstractC0417e0.m2043o(viewGroup, m2255z0()));
            }
        }
        return hashSet;
    }

    /* renamed from: s0 */
    public C0438x m2235s0() {
        return this.f2935c;
    }

    /* renamed from: s1 */
    public final void m2236s1(Fragment fragment) {
        ViewGroup m2229q0 = m2229q0(fragment);
        if (m2229q0 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        int i10 = C9394b.f43077c;
        if (m2229q0.getTag(i10) == null) {
            m2229q0.setTag(i10, fragment);
        }
        ((Fragment) m2229q0.getTag(i10)).setPopDirection(fragment.getPopDirection());
    }

    /* renamed from: t */
    public final Set<AbstractC0417e0> m2237t(ArrayList<C0408a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<AbstractC0439y.a> it = arrayList.get(i10).f3036c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f3054b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(AbstractC0417e0.m2042n(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    /* renamed from: t0 */
    public List<Fragment> m2238t0() {
        return this.f2935c.m2350n();
    }

    /* renamed from: t1 */
    public void m2239t1(Fragment fragment) {
        if (m2129G0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f2952t;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            obj = this.f2952t;
        } else {
            AbstractC0425k<?> abstractC0425k = this.f2950r;
            if (abstractC0425k == null) {
                sb2.append("null");
                sb2.append("}}");
                return sb2.toString();
            }
            sb2.append(abstractC0425k.getClass().getSimpleName());
            sb2.append("{");
            obj = this.f2950r;
        }
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        sb2.append("}");
        sb2.append("}}");
        return sb2.toString();
    }

    /* renamed from: u */
    public void m2240u(C0408a c0408a, boolean z10, boolean z11, boolean z12) {
        if (z10) {
            c0408a.m1954D(z12);
        } else {
            c0408a.m1953C();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0408a);
        arrayList2.add(Boolean.valueOf(z10));
        if (z11 && this.f2949q >= 1) {
            C0440z.m2376B(this.f2950r.m2107f(), this.f2951s, arrayList, arrayList2, 0, 1, true, this.f2946n);
        }
        if (z12) {
            m2168R0(this.f2949q, true);
        }
        for (Fragment fragment : this.f2935c.m2348l()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && c0408a.m1957G(fragment.mContainerId)) {
                float f10 = fragment.mPostponedAlpha;
                if (f10 > 0.0f) {
                    fragment.mView.setAlpha(f10);
                }
                if (z12) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    /* renamed from: u0 */
    public AbstractC0425k<?> m2241u0() {
        return this.f2950r;
    }

    /* renamed from: u1 */
    public final void m2242u1() {
        Iterator<C0436v> it = this.f2935c.m2347k().iterator();
        while (it.hasNext()) {
            m2178W0(it.next());
        }
    }

    /* renamed from: v */
    public final void m2243v(Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            C0418f.d m2073c = C0418f.m2073c(this.f2950r.m2107f(), fragment, !fragment.mHidden, fragment.getPopDirection());
            if (m2073c == null || (animator = m2073c.f2893b) == null) {
                if (m2073c != null) {
                    fragment.mView.startAnimation(m2073c.f2892a);
                    m2073c.f2892a.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                animator.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    ViewGroup viewGroup = fragment.mContainer;
                    View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    m2073c.f2893b.addListener(new h(this, viewGroup, view, fragment));
                }
                m2073c.f2893b.start();
            }
        }
        m2143E0(fragment);
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    /* renamed from: v0 */
    public LayoutInflater.Factory2 m2244v0() {
        return this.f2938f;
    }

    /* renamed from: v1 */
    public final void m2245v1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0415d0("FragmentManager"));
        AbstractC0425k<?> abstractC0425k = this.f2950r;
        try {
            if (abstractC0425k != null) {
                abstractC0425k.mo2035h("  ", null, printWriter, new String[0]);
            } else {
                m2179X("  ", null, printWriter, new String[0]);
            }
        } catch (Exception e10) {
            Log.e("FragmentManager", "Failed dumping state", e10);
        }
        throw runtimeException;
    }

    /* renamed from: w */
    public C0436v m2246w(Fragment fragment) {
        C0436v m2349m = this.f2935c.m2349m(fragment.mWho);
        if (m2349m != null) {
            return m2349m;
        }
        C0436v c0436v = new C0436v(this.f2947o, this.f2935c, fragment);
        c0436v.m2327o(this.f2950r.m2107f().getClassLoader());
        c0436v.m2333u(this.f2949q);
        return c0436v;
    }

    /* renamed from: w0 */
    public C0427m m2247w0() {
        return this.f2947o;
    }

    /* renamed from: w1 */
    public void m2248w1(l lVar) {
        this.f2947o.m2127p(lVar);
    }

    /* renamed from: x */
    public final void m2249x(Fragment fragment) {
        fragment.performDestroyView();
        this.f2947o.m2125n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.mo3106n(null);
        fragment.mInLayout = false;
    }

    /* renamed from: x0 */
    public Fragment m2250x0() {
        return this.f2952t;
    }

    /* renamed from: x1 */
    public final void m2251x1() {
        synchronized (this.f2933a) {
            boolean z10 = true;
            if (!this.f2933a.isEmpty()) {
                this.f2940h.m786f(true);
                return;
            }
            AbstractC0222b abstractC0222b = this.f2940h;
            if (m2217m0() <= 0 || !m2152J0(this.f2952t)) {
                z10 = false;
            }
            abstractC0222b.m786f(z10);
        }
    }

    /* renamed from: y */
    public void m2252y(Fragment fragment) {
        if (m2129G0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (m2129G0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f2935c.m2355s(fragment);
            if (m2148H0(fragment)) {
                this.f2922D = true;
            }
            m2236s1(fragment);
        }
    }

    /* renamed from: y0 */
    public Fragment m2253y0() {
        return this.f2953u;
    }

    /* renamed from: z */
    public void m2254z() {
        this.f2923E = false;
        this.f2924F = false;
        this.f2931M.m2296o(false);
        m2171T(4);
    }

    /* renamed from: z0 */
    public InterfaceC0419f0 m2255z0() {
        InterfaceC0419f0 interfaceC0419f0 = this.f2956x;
        if (interfaceC0419f0 != null) {
            return interfaceC0419f0;
        }
        Fragment fragment = this.f2952t;
        return fragment != null ? fragment.mFragmentManager.m2255z0() : this.f2957y;
    }
}
