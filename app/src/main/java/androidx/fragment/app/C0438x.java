package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/x.class
 */
/* renamed from: androidx.fragment.app.x */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/x.class */
public class C0438x {

    /* renamed from: a */
    public final ArrayList<Fragment> f3031a = new ArrayList<>();

    /* renamed from: b */
    public final HashMap<String, C0436v> f3032b = new HashMap<>();

    /* renamed from: c */
    public C0431q f3033c;

    /* renamed from: a */
    public void m2337a(Fragment fragment) {
        if (this.f3031a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f3031a) {
            this.f3031a.add(fragment);
        }
        fragment.mAdded = true;
    }

    /* renamed from: b */
    public void m2338b() {
        this.f3032b.values().removeAll(Collections.singleton(null));
    }

    /* renamed from: c */
    public boolean m2339c(String str) {
        return this.f3032b.get(str) != null;
    }

    /* renamed from: d */
    public void m2340d(int i10) {
        for (C0436v c0436v : this.f3032b.values()) {
            if (c0436v != null) {
                c0436v.m2333u(i10);
            }
        }
    }

    /* renamed from: e */
    public void m2341e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f3032b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0436v c0436v : this.f3032b.values()) {
                printWriter.print(str);
                if (c0436v != null) {
                    Fragment m2323k = c0436v.m2323k();
                    printWriter.println(m2323k);
                    m2323k.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f3031a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = this.f3031a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    /* renamed from: f */
    public Fragment m2342f(String str) {
        C0436v c0436v = this.f3032b.get(str);
        if (c0436v != null) {
            return c0436v.m2323k();
        }
        return null;
    }

    /* renamed from: g */
    public Fragment m2343g(int i10) {
        for (int size = this.f3031a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f3031a.get(size);
            if (fragment != null && fragment.mFragmentId == i10) {
                return fragment;
            }
        }
        for (C0436v c0436v : this.f3032b.values()) {
            if (c0436v != null) {
                Fragment m2323k = c0436v.m2323k();
                if (m2323k.mFragmentId == i10) {
                    return m2323k;
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    public Fragment m2344h(String str) {
        if (str != null) {
            for (int size = this.f3031a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f3031a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C0436v c0436v : this.f3032b.values()) {
            if (c0436v != null) {
                Fragment m2323k = c0436v.m2323k();
                if (str.equals(m2323k.mTag)) {
                    return m2323k;
                }
            }
        }
        return null;
    }

    /* renamed from: i */
    public Fragment m2345i(String str) {
        Fragment findFragmentByWho;
        for (C0436v c0436v : this.f3032b.values()) {
            if (c0436v != null && (findFragmentByWho = c0436v.m2323k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* renamed from: j */
    public int m2346j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f3031a.indexOf(fragment);
        int i10 = indexOf - 1;
        while (true) {
            int i11 = indexOf;
            if (i10 >= 0) {
                Fragment fragment2 = this.f3031a.get(i10);
                if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                    return viewGroup.indexOfChild(view2) + 1;
                }
                i10--;
            } else {
                while (true) {
                    i11++;
                    if (i11 >= this.f3031a.size()) {
                        return -1;
                    }
                    Fragment fragment3 = this.f3031a.get(i11);
                    if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                        return viewGroup.indexOfChild(view);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public List<C0436v> m2347k() {
        ArrayList arrayList = new ArrayList();
        for (C0436v c0436v : this.f3032b.values()) {
            if (c0436v != null) {
                arrayList.add(c0436v);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public List<Fragment> m2348l() {
        ArrayList arrayList = new ArrayList();
        Iterator<C0436v> it = this.f3032b.values().iterator();
        while (it.hasNext()) {
            C0436v next = it.next();
            arrayList.add(next != null ? next.m2323k() : null);
        }
        return arrayList;
    }

    /* renamed from: m */
    public C0436v m2349m(String str) {
        return this.f3032b.get(str);
    }

    /* renamed from: n */
    public List<Fragment> m2350n() {
        ArrayList arrayList;
        if (this.f3031a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3031a) {
            arrayList = new ArrayList(this.f3031a);
        }
        return arrayList;
    }

    /* renamed from: o */
    public C0431q m2351o() {
        return this.f3033c;
    }

    /* renamed from: p */
    public void m2352p(C0436v c0436v) {
        Fragment m2323k = c0436v.m2323k();
        if (m2339c(m2323k.mWho)) {
            return;
        }
        this.f3032b.put(m2323k.mWho, c0436v);
        if (m2323k.mRetainInstanceChangedWhileDetached) {
            if (m2323k.mRetainInstance) {
                this.f3033c.m2288f(m2323k);
            } else {
                this.f3033c.m2295n(m2323k);
            }
            m2323k.mRetainInstanceChangedWhileDetached = false;
        }
        if (AbstractC0428n.m2129G0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + m2323k);
        }
    }

    /* renamed from: q */
    public void m2353q(C0436v c0436v) {
        Fragment m2323k = c0436v.m2323k();
        if (m2323k.mRetainInstance) {
            this.f3033c.m2295n(m2323k);
        }
        if (this.f3032b.put(m2323k.mWho, null) != null && AbstractC0428n.m2129G0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + m2323k);
        }
    }

    /* renamed from: r */
    public void m2354r() {
        Iterator<Fragment> it = this.f3031a.iterator();
        while (it.hasNext()) {
            C0436v c0436v = this.f3032b.get(it.next().mWho);
            if (c0436v != null) {
                c0436v.m2325m();
            }
        }
        for (C0436v c0436v2 : this.f3032b.values()) {
            if (c0436v2 != null) {
                c0436v2.m2325m();
                Fragment m2323k = c0436v2.m2323k();
                if (m2323k.mRemoving && !m2323k.isInBackStack()) {
                    m2353q(c0436v2);
                }
            }
        }
    }

    /* renamed from: s */
    public void m2355s(Fragment fragment) {
        synchronized (this.f3031a) {
            this.f3031a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* renamed from: t */
    public void m2356t() {
        this.f3032b.clear();
    }

    /* renamed from: u */
    public void m2357u(List<String> list) {
        this.f3031a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment m2342f = m2342f(str);
                if (m2342f == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (AbstractC0428n.m2129G0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + m2342f);
                }
                m2337a(m2342f);
            }
        }
    }

    /* renamed from: v */
    public ArrayList<C0435u> m2358v() {
        ArrayList<C0435u> arrayList = new ArrayList<>(this.f3032b.size());
        for (C0436v c0436v : this.f3032b.values()) {
            if (c0436v != null) {
                Fragment m2323k = c0436v.m2323k();
                C0435u m2331s = c0436v.m2331s();
                arrayList.add(m2331s);
                if (AbstractC0428n.m2129G0(2)) {
                    Log.v("FragmentManager", "Saved state of " + m2323k + ": " + m2331s.f3015n);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: w */
    public ArrayList<String> m2359w() {
        synchronized (this.f3031a) {
            if (this.f3031a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f3031a.size());
            Iterator<Fragment> it = this.f3031a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (AbstractC0428n.m2129G0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: x */
    public void m2360x(C0431q c0431q) {
        this.f3033c = c0431q;
    }
}
