package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC0572g;
import androidx.lifecycle.InterfaceC0577k;
import androidx.lifecycle.InterfaceC0579m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import p017b.AbstractC0773a;
import p030c0.C0940f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/activity/result/ActivityResultRegistry.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/activity/result/ActivityResultRegistry.class */
public abstract class ActivityResultRegistry {

    /* renamed from: a */
    public Random f1328a = new Random();

    /* renamed from: b */
    public final Map<Integer, String> f1329b = new HashMap();

    /* renamed from: c */
    public final Map<String, Integer> f1330c = new HashMap();

    /* renamed from: d */
    public final Map<String, C0228d> f1331d = new HashMap();

    /* renamed from: e */
    public ArrayList<String> f1332e = new ArrayList<>();

    /* renamed from: f */
    public final transient Map<String, C0227c<?>> f1333f = new HashMap();

    /* renamed from: g */
    public final Map<String, Object> f1334g = new HashMap();

    /* renamed from: h */
    public final Bundle f1335h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/activity/result/ActivityResultRegistry$a.class
     */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$a */
    /* loaded from: combined.jar:classes1.jar:androidx/activity/result/ActivityResultRegistry$a.class */
    public class C0225a<I> extends AbstractC0231c<I> {

        /* renamed from: a */
        public final String f1340a;

        /* renamed from: b */
        public final int f1341b;

        /* renamed from: c */
        public final AbstractC0773a f1342c;

        /* renamed from: d */
        public final ActivityResultRegistry f1343d;

        public C0225a(ActivityResultRegistry activityResultRegistry, String str, int i10, AbstractC0773a abstractC0773a) {
            this.f1343d = activityResultRegistry;
            this.f1340a = str;
            this.f1341b = i10;
            this.f1342c = abstractC0773a;
        }

        @Override // androidx.activity.result.AbstractC0231c
        /* renamed from: b */
        public void mo798b(I i10, C0940f c0940f) {
            this.f1343d.f1332e.add(this.f1340a);
            this.f1343d.mo776f(this.f1341b, this.f1342c, i10, c0940f);
        }

        @Override // androidx.activity.result.AbstractC0231c
        /* renamed from: c */
        public void mo799c() {
            this.f1343d.m797l(this.f1340a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/activity/result/ActivityResultRegistry$b.class
     */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$b */
    /* loaded from: combined.jar:classes1.jar:androidx/activity/result/ActivityResultRegistry$b.class */
    public class C0226b<I> extends AbstractC0231c<I> {

        /* renamed from: a */
        public final String f1344a;

        /* renamed from: b */
        public final int f1345b;

        /* renamed from: c */
        public final AbstractC0773a f1346c;

        /* renamed from: d */
        public final ActivityResultRegistry f1347d;

        public C0226b(ActivityResultRegistry activityResultRegistry, String str, int i10, AbstractC0773a abstractC0773a) {
            this.f1347d = activityResultRegistry;
            this.f1344a = str;
            this.f1345b = i10;
            this.f1346c = abstractC0773a;
        }

        @Override // androidx.activity.result.AbstractC0231c
        /* renamed from: b */
        public void mo798b(I i10, C0940f c0940f) {
            this.f1347d.f1332e.add(this.f1344a);
            this.f1347d.mo776f(this.f1345b, this.f1346c, i10, c0940f);
        }

        @Override // androidx.activity.result.AbstractC0231c
        /* renamed from: c */
        public void mo799c() {
            this.f1347d.m797l(this.f1344a);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/activity/result/ActivityResultRegistry$c.class
     */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$c */
    /* loaded from: combined.jar:classes1.jar:androidx/activity/result/ActivityResultRegistry$c.class */
    public static class C0227c<O> {

        /* renamed from: a */
        public final InterfaceC0230b<O> f1348a;

        /* renamed from: b */
        public final AbstractC0773a<?, O> f1349b;

        public C0227c(InterfaceC0230b<O> interfaceC0230b, AbstractC0773a<?, O> abstractC0773a) {
            this.f1348a = interfaceC0230b;
            this.f1349b = abstractC0773a;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/activity/result/ActivityResultRegistry$d.class
     */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$d */
    /* loaded from: combined.jar:classes1.jar:androidx/activity/result/ActivityResultRegistry$d.class */
    public static class C0228d {

        /* renamed from: a */
        public final AbstractC0572g f1350a;

        /* renamed from: b */
        public final ArrayList<InterfaceC0577k> f1351b = new ArrayList<>();

        public C0228d(AbstractC0572g abstractC0572g) {
            this.f1350a = abstractC0572g;
        }

        /* renamed from: a */
        public void m800a(InterfaceC0577k interfaceC0577k) {
            this.f1350a.mo3154a(interfaceC0577k);
            this.f1351b.add(interfaceC0577k);
        }

        /* renamed from: b */
        public void m801b() {
            Iterator<InterfaceC0577k> it = this.f1351b.iterator();
            while (it.hasNext()) {
                this.f1350a.mo3156c(it.next());
            }
            this.f1351b.clear();
        }
    }

    /* renamed from: a */
    public final void m787a(int i10, String str) {
        this.f1329b.put(Integer.valueOf(i10), str);
        this.f1330c.put(str, Integer.valueOf(i10));
    }

    /* renamed from: b */
    public final boolean m788b(int i10, int i11, Intent intent) {
        String str = this.f1329b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        this.f1332e.remove(str);
        m790d(str, i11, intent, this.f1333f.get(str));
        return true;
    }

    /* renamed from: c */
    public final <O> boolean m789c(int i10, @SuppressLint({"UnknownNullness"}) O o10) {
        InterfaceC0230b<?> interfaceC0230b;
        String str = this.f1329b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        this.f1332e.remove(str);
        C0227c<?> c0227c = this.f1333f.get(str);
        if (c0227c != null && (interfaceC0230b = c0227c.f1348a) != null) {
            interfaceC0230b.mo807a(o10);
            return true;
        }
        this.f1335h.remove(str);
        this.f1334g.put(str, o10);
        return true;
    }

    /* renamed from: d */
    public final <O> void m790d(String str, int i10, Intent intent, C0227c<O> c0227c) {
        InterfaceC0230b<O> interfaceC0230b;
        if (c0227c != null && (interfaceC0230b = c0227c.f1348a) != null) {
            interfaceC0230b.mo807a(c0227c.f1349b.mo2262c(i10, intent));
        } else {
            this.f1334g.remove(str);
            this.f1335h.putParcelable(str, new C0229a(i10, intent));
        }
    }

    /* renamed from: e */
    public final int m791e() {
        int nextInt = this.f1328a.nextInt(2147418112);
        while (true) {
            int i10 = nextInt + 65536;
            if (!this.f1329b.containsKey(Integer.valueOf(i10))) {
                return i10;
            }
            nextInt = this.f1328a.nextInt(2147418112);
        }
    }

    /* renamed from: f */
    public abstract <I, O> void mo776f(int i10, AbstractC0773a<I, O> abstractC0773a, @SuppressLint({"UnknownNullness"}) I i11, C0940f c0940f);

    /* renamed from: g */
    public final void m792g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m787a(integerArrayList.get(i10).intValue(), stringArrayList.get(i10));
        }
        this.f1332e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f1328a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f1335h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
    }

    /* renamed from: h */
    public final void m793h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f1329b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f1329b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f1332e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f1335h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f1328a);
    }

    /* renamed from: i */
    public final <I, O> AbstractC0231c<I> m794i(String str, InterfaceC0579m interfaceC0579m, AbstractC0773a<I, O> abstractC0773a, InterfaceC0230b<O> interfaceC0230b) {
        AbstractC0572g lifecycle = interfaceC0579m.getLifecycle();
        if (lifecycle.mo3155b().isAtLeast(AbstractC0572g.c.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + interfaceC0579m + " is attempting to register while current state is " + lifecycle.mo3155b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        int m796k = m796k(str);
        C0228d c0228d = this.f1331d.get(str);
        C0228d c0228d2 = c0228d;
        if (c0228d == null) {
            c0228d2 = new C0228d(lifecycle);
        }
        c0228d2.m800a(new InterfaceC0577k(this, str, interfaceC0230b, abstractC0773a) { // from class: androidx.activity.result.ActivityResultRegistry.1

            /* renamed from: b */
            public final String f1336b;

            /* renamed from: c */
            public final InterfaceC0230b f1337c;

            /* renamed from: d */
            public final AbstractC0773a f1338d;

            /* renamed from: e */
            public final ActivityResultRegistry f1339e;

            {
                this.f1339e = this;
                this.f1336b = str;
                this.f1337c = interfaceC0230b;
                this.f1338d = abstractC0773a;
            }

            @Override // androidx.lifecycle.InterfaceC0577k
            /* renamed from: b */
            public void mo775b(InterfaceC0579m interfaceC0579m2, AbstractC0572g.b bVar) {
                if (!AbstractC0572g.b.ON_START.equals(bVar)) {
                    if (AbstractC0572g.b.ON_STOP.equals(bVar)) {
                        this.f1339e.f1333f.remove(this.f1336b);
                        return;
                    } else {
                        if (AbstractC0572g.b.ON_DESTROY.equals(bVar)) {
                            this.f1339e.m797l(this.f1336b);
                            return;
                        }
                        return;
                    }
                }
                this.f1339e.f1333f.put(this.f1336b, new C0227c<>(this.f1337c, this.f1338d));
                if (this.f1339e.f1334g.containsKey(this.f1336b)) {
                    Object obj = this.f1339e.f1334g.get(this.f1336b);
                    this.f1339e.f1334g.remove(this.f1336b);
                    this.f1337c.mo807a(obj);
                }
                C0229a c0229a = (C0229a) this.f1339e.f1335h.getParcelable(this.f1336b);
                if (c0229a != null) {
                    this.f1339e.f1335h.remove(this.f1336b);
                    this.f1337c.mo807a(this.f1338d.mo2262c(c0229a.m804c(), c0229a.m803b()));
                }
            }
        });
        this.f1331d.put(str, c0228d2);
        return new C0225a(this, str, m796k, abstractC0773a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final <I, O> AbstractC0231c<I> m795j(String str, AbstractC0773a<I, O> abstractC0773a, InterfaceC0230b<O> interfaceC0230b) {
        int m796k = m796k(str);
        this.f1333f.put(str, new C0227c<>(interfaceC0230b, abstractC0773a));
        if (this.f1334g.containsKey(str)) {
            Object obj = this.f1334g.get(str);
            this.f1334g.remove(str);
            interfaceC0230b.mo807a(obj);
        }
        C0229a c0229a = (C0229a) this.f1335h.getParcelable(str);
        if (c0229a != null) {
            this.f1335h.remove(str);
            interfaceC0230b.mo807a(abstractC0773a.mo2262c(c0229a.m804c(), c0229a.m803b()));
        }
        return new C0226b(this, str, m796k, abstractC0773a);
    }

    /* renamed from: k */
    public final int m796k(String str) {
        Integer num = this.f1330c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int m791e = m791e();
        m787a(m791e, str);
        return m791e;
    }

    /* renamed from: l */
    public final void m797l(String str) {
        Integer remove;
        if (!this.f1332e.contains(str) && (remove = this.f1330c.remove(str)) != null) {
            this.f1329b.remove(remove);
        }
        this.f1333f.remove(str);
        if (this.f1334g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f1334g.get(str));
            this.f1334g.remove(str);
        }
        if (this.f1335h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f1335h.getParcelable(str));
            this.f1335h.remove(str);
        }
        C0228d c0228d = this.f1331d.get(str);
        if (c0228d != null) {
            c0228d.m801b();
            this.f1331d.remove(str);
        }
    }
}
