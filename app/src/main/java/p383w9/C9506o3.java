package p383w9;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.ActivityC0416e;
import androidx.fragment.app.Fragment;
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
  classes2.jar:w9/o3.class
 */
/* renamed from: w9.o3 */
/* loaded from: combined.jar:classes2.jar:w9/o3.class */
public final class C9506o3 extends Fragment implements InterfaceC9467h {

    /* renamed from: e */
    public static final WeakHashMap<ActivityC0416e, WeakReference<C9506o3>> f43366e = new WeakHashMap<>();

    /* renamed from: b */
    public final Map<String, LifecycleCallback> f43367b = Collections.synchronizedMap(new C7928a());

    /* renamed from: c */
    public int f43368c = 0;

    /* renamed from: d */
    public Bundle f43369d;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r0.isRemoving() != false) goto L13;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p383w9.C9506o3 m39979p(androidx.fragment.app.ActivityC0416e r6) {
        /*
            java.util.WeakHashMap<androidx.fragment.app.e, java.lang.ref.WeakReference<w9.o3>> r0 = p383w9.C9506o3.f43366e
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
            w9.o3 r0 = (p383w9.C9506o3) r0
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L20
            goto L22
        L20:
            r0 = r7
            return r0
        L22:
            r0 = r6
            androidx.fragment.app.n r0 = r0.getSupportFragmentManager()     // Catch: java.lang.ClassCastException -> L65
            java.lang.String r1 = "SupportLifecycleFragmentImpl"
            androidx.fragment.app.Fragment r0 = r0.m2206i0(r1)     // Catch: java.lang.ClassCastException -> L65
            w9.o3 r0 = (p383w9.C9506o3) r0     // Catch: java.lang.ClassCastException -> L65
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L3c
            r0 = r8
            r7 = r0
            r0 = r8
            boolean r0 = r0.isRemoving()
            if (r0 == 0) goto L55
        L3c:
            w9.o3 r0 = new w9.o3
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            androidx.fragment.app.n r0 = r0.getSupportFragmentManager()
            androidx.fragment.app.y r0 = r0.m2216m()
            r1 = r7
            java.lang.String r2 = "SupportLifecycleFragmentImpl"
            androidx.fragment.app.y r0 = r0.m2364e(r1, r2)
            int r0 = r0.mo1965k()
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
            java.lang.String r2 = "Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl"
            r3 = r6
            r1.<init>(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p383w9.C9506o3.m39979p(androidx.fragment.app.e):w9.o3");
    }

    @Override // p383w9.InterfaceC9467h
    /* renamed from: d */
    public final void mo39917d(String str, LifecycleCallback lifecycleCallback) {
        if (this.f43367b.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 59);
            sb2.append("LifecycleCallback with tag ");
            sb2.append(str);
            sb2.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f43367b.put(str, lifecycleCallback);
        if (this.f43368c > 0) {
            new HandlerC6962i(Looper.getMainLooper()).post(new RunnableC9501n3(this, lifecycleCallback, str));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator<LifecycleCallback> it = this.f43367b.values().iterator();
        while (it.hasNext()) {
            it.next().mo13155a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // p383w9.InterfaceC9467h
    /* renamed from: f */
    public final <T extends LifecycleCallback> T mo39918f(String str, Class<T> cls) {
        return cls.cast(this.f43367b.get(str));
    }

    @Override // p383w9.InterfaceC9467h
    /* renamed from: h */
    public final /* synthetic */ Activity mo39919h() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator<LifecycleCallback> it = this.f43367b.values().iterator();
        while (it.hasNext()) {
            it.next().mo13157e(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f43368c = 1;
        this.f43369d = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f43367b.entrySet()) {
            entry.getValue().mo13158f(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f43368c = 5;
        Iterator<LifecycleCallback> it = this.f43367b.values().iterator();
        while (it.hasNext()) {
            it.next().m13159g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f43368c = 3;
        Iterator<LifecycleCallback> it = this.f43367b.values().iterator();
        while (it.hasNext()) {
            it.next().mo13160h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f43367b.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().mo13161i(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f43368c = 2;
        Iterator<LifecycleCallback> it = this.f43367b.values().iterator();
        while (it.hasNext()) {
            it.next().mo13162j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f43368c = 4;
        Iterator<LifecycleCallback> it = this.f43367b.values().iterator();
        while (it.hasNext()) {
            it.next().mo13163k();
        }
    }
}
