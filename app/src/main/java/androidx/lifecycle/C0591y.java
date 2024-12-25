package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.SavedStateRegistry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/lifecycle/y.class
 */
/* renamed from: androidx.lifecycle.y */
/* loaded from: combined.jar:classes1.jar:androidx/lifecycle/y.class */
public final class C0591y {

    /* renamed from: e */
    public static final Class[] f3793e = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a */
    public final Map<String, Object> f3794a;

    /* renamed from: b */
    public final Map<String, SavedStateRegistry.InterfaceC0730b> f3795b;

    /* renamed from: c */
    public final Map<String, Object> f3796c;

    /* renamed from: d */
    public final SavedStateRegistry.InterfaceC0730b f3797d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/lifecycle/y$a.class
     */
    /* renamed from: androidx.lifecycle.y$a */
    /* loaded from: combined.jar:classes1.jar:androidx/lifecycle/y$a.class */
    public class a implements SavedStateRegistry.InterfaceC0730b {

        /* renamed from: a */
        public final C0591y f3798a;

        public a(C0591y c0591y) {
            this.f3798a = c0591y;
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0730b
        /* renamed from: a */
        public Bundle mo882a() {
            for (Map.Entry entry : new HashMap(this.f3798a.f3795b).entrySet()) {
                this.f3798a.m3203c((String) entry.getKey(), ((SavedStateRegistry.InterfaceC0730b) entry.getValue()).mo882a());
            }
            Set<String> keySet = this.f3798a.f3794a.keySet();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(keySet.size());
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
            for (String str : keySet) {
                arrayList.add(str);
                arrayList2.add(this.f3798a.f3794a.get(str));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("keys", arrayList);
            bundle.putParcelableArrayList("values", arrayList2);
            return bundle;
        }
    }

    public C0591y() {
        this.f3795b = new HashMap();
        this.f3796c = new HashMap();
        this.f3797d = new a(this);
        this.f3794a = new HashMap();
    }

    public C0591y(Map<String, Object> map) {
        this.f3795b = new HashMap();
        this.f3796c = new HashMap();
        this.f3797d = new a(this);
        this.f3794a = new HashMap(map);
    }

    /* renamed from: a */
    public static C0591y m3200a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return new C0591y();
        }
        HashMap hashMap = new HashMap();
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                hashMap.put(str, bundle2.get(str));
            }
        }
        if (bundle == null) {
            return new C0591y(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
            hashMap.put((String) parcelableArrayList.get(i10), parcelableArrayList2.get(i10));
        }
        return new C0591y(hashMap);
    }

    /* renamed from: d */
    public static void m3201d(Object obj) {
        if (obj == null) {
            return;
        }
        for (Class cls : f3793e) {
            if (cls.isInstance(obj)) {
                return;
            }
        }
        throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
    }

    /* renamed from: b */
    public SavedStateRegistry.InterfaceC0730b m3202b() {
        return this.f3797d;
    }

    /* renamed from: c */
    public <T> void m3203c(String str, T t10) {
        m3201d(t10);
        C0585s c0585s = (C0585s) this.f3796c.get(str);
        if (c0585s != null) {
            c0585s.mo3106n(t10);
        } else {
            this.f3794a.put(str, t10);
        }
    }
}
