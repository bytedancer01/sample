package p383w9;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p245oa.HandlerC6962i;
import p294r.C7928a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/m3.class
 */
/* renamed from: w9.m3 */
/* loaded from: combined.jar:classes2.jar:w9/m3.class */
public final class FragmentC9496m3 extends Fragment implements InterfaceC9467h {

    /* renamed from: e */
    public static final WeakHashMap<Activity, WeakReference<FragmentC9496m3>> f43342e = new WeakHashMap<>();

    /* renamed from: b */
    public final Map<String, LifecycleCallback> f43343b = Collections.synchronizedMap(new C7928a());

    /* renamed from: c */
    public int f43344c = 0;

    /* renamed from: d */
    public Bundle f43345d;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r0.isRemoving() != false) goto L13;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p383w9.FragmentC9496m3 m39963c(android.app.Activity r6) {
        /*
            java.util.WeakHashMap<android.app.Activity, java.lang.ref.WeakReference<w9.m3>> r0 = p383w9.FragmentC9496m3.f43342e
            r9 = r0
            r0 = r9
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L22
            r0 = r7
            java.lang.Object r0 = r0.get()
            w9.m3 r0 = (p383w9.FragmentC9496m3) r0
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L20
            goto L22
        L20:
            r0 = r7
            return r0
        L22:
            r0 = r6
            android.app.FragmentManager r0 = r0.getFragmentManager()     // Catch: java.lang.ClassCastException -> L65
            java.lang.String r1 = "LifecycleFragmentImpl"
            android.app.Fragment r0 = r0.findFragmentByTag(r1)     // Catch: java.lang.ClassCastException -> L65
            w9.m3 r0 = (p383w9.FragmentC9496m3) r0     // Catch: java.lang.ClassCastException -> L65
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L3c
            r0 = r8
            r7 = r0
            r0 = r8
            boolean r0 = r0.isRemoving()
            if (r0 == 0) goto L55
        L3c:
            w9.m3 r0 = new w9.m3
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            android.app.FragmentManager r0 = r0.getFragmentManager()
            android.app.FragmentTransaction r0 = r0.beginTransaction()
            r1 = r7
            java.lang.String r2 = "LifecycleFragmentImpl"
            android.app.FragmentTransaction r0 = r0.add(r1, r2)
            int r0 = r0.commitAllowingStateLoss()
        L55:
            r0 = r9
            r1 = r6
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r3 = r2
            r4 = r7
            r3.<init>(r4)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            return r0
        L65:
            r6 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl"
            r3 = r6
            r1.<init>(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p383w9.FragmentC9496m3.m39963c(android.app.Activity):w9.m3");
    }

    @Override // p383w9.InterfaceC9467h
    /* renamed from: d */
    public final void mo39917d(String str, LifecycleCallback lifecycleCallback) {
        if (this.f43343b.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 59);
            sb2.append("LifecycleCallback with tag ");
            sb2.append(str);
            sb2.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f43343b.put(str, lifecycleCallback);
        if (this.f43344c > 0) {
            new HandlerC6962i(Looper.getMainLooper()).post(new RunnableC9491l3(this, lifecycleCallback, str));
        }
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator<LifecycleCallback> it = this.f43343b.values().iterator();
        while (it.hasNext()) {
            it.next().mo13155a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // p383w9.InterfaceC9467h
    /* renamed from: f */
    public final <T extends LifecycleCallback> T mo39918f(String str, Class<T> cls) {
        return cls.cast(this.f43343b.get(str));
    }

    @Override // p383w9.InterfaceC9467h
    /* renamed from: h */
    public final Activity mo39919h() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator<LifecycleCallback> it = this.f43343b.values().iterator();
        while (it.hasNext()) {
            it.next().mo13157e(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f43344c = 1;
        this.f43345d = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f43343b.entrySet()) {
            entry.getValue().mo13158f(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f43344c = 5;
        Iterator<LifecycleCallback> it = this.f43343b.values().iterator();
        while (it.hasNext()) {
            it.next().m13159g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f43344c = 3;
        Iterator<LifecycleCallback> it = this.f43343b.values().iterator();
        while (it.hasNext()) {
            it.next().mo13160h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f43343b.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().mo13161i(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f43344c = 2;
        Iterator<LifecycleCallback> it = this.f43343b.values().iterator();
        while (it.hasNext()) {
            it.next().mo13162j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f43344c = 4;
        Iterator<LifecycleCallback> it = this.f43343b.values().iterator();
        while (it.hasNext()) {
            it.next().mo13163k();
        }
    }
}
