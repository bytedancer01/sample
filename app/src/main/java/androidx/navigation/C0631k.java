package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p236o1.C6867a;
import p294r.C7937j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/navigation/k.class
 */
/* renamed from: androidx.navigation.k */
/* loaded from: combined.jar:classes1.jar:androidx/navigation/k.class */
public class C0631k {

    /* renamed from: j */
    public static final HashMap<String, Class<?>> f4259j = new HashMap<>();

    /* renamed from: b */
    public final String f4260b;

    /* renamed from: c */
    public C0632l f4261c;

    /* renamed from: d */
    public int f4262d;

    /* renamed from: e */
    public String f4263e;

    /* renamed from: f */
    public CharSequence f4264f;

    /* renamed from: g */
    public ArrayList<C0628h> f4265g;

    /* renamed from: h */
    public C7937j<C0618c> f4266h;

    /* renamed from: i */
    public HashMap<String, C0619d> f4267i;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/k$a.class
     */
    /* renamed from: androidx.navigation.k$a */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/k$a.class */
    public static class a implements Comparable<a> {

        /* renamed from: b */
        public final C0631k f4268b;

        /* renamed from: c */
        public final Bundle f4269c;

        /* renamed from: d */
        public final boolean f4270d;

        /* renamed from: e */
        public final boolean f4271e;

        /* renamed from: f */
        public final int f4272f;

        public a(C0631k c0631k, Bundle bundle, boolean z10, boolean z11, int i10) {
            this.f4268b = c0631k;
            this.f4269c = bundle;
            this.f4270d = z10;
            this.f4271e = z11;
            this.f4272f = i10;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            boolean z10 = this.f4270d;
            if (z10 && !aVar.f4270d) {
                return 1;
            }
            if (!z10 && aVar.f4270d) {
                return -1;
            }
            Bundle bundle = this.f4269c;
            if (bundle != null && aVar.f4269c == null) {
                return 1;
            }
            if (bundle == null && aVar.f4269c != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size() - aVar.f4269c.size();
                if (size > 0) {
                    return 1;
                }
                if (size < 0) {
                    return -1;
                }
            }
            boolean z11 = this.f4271e;
            if (z11 && !aVar.f4271e) {
                return 1;
            }
            if (z11 || !aVar.f4271e) {
                return this.f4272f - aVar.f4272f;
            }
            return -1;
        }

        /* renamed from: d */
        public C0631k m3574d() {
            return this.f4268b;
        }

        /* renamed from: e */
        public Bundle m3575e() {
            return this.f4269c;
        }
    }

    public C0631k(AbstractC0639s<? extends C0631k> abstractC0639s) {
        this(C0640t.m3664c(abstractC0639s.getClass()));
    }

    public C0631k(String str) {
        this.f4260b = str;
    }

    /* renamed from: t */
    public static String m3556t(Context context, int i10) {
        if (i10 <= 16777215) {
            return Integer.toString(i10);
        }
        try {
            return context.getResources().getResourceName(i10);
        } catch (Resources.NotFoundException e10) {
            return Integer.toString(i10);
        }
    }

    /* renamed from: A */
    public a mo3557A(C0630j c0630j) {
        ArrayList<C0628h> arrayList = this.f4265g;
        if (arrayList == null) {
            return null;
        }
        Iterator<C0628h> it = arrayList.iterator();
        a aVar = null;
        while (it.hasNext()) {
            C0628h next = it.next();
            Uri m3555c = c0630j.m3555c();
            Bundle m3535c = m3555c != null ? next.m3535c(m3555c, m3567i()) : null;
            String m3553a = c0630j.m3553a();
            boolean z10 = m3553a != null && m3553a.equals(next.m3534b());
            String m3554b = c0630j.m3554b();
            int m3536d = m3554b != null ? next.m3536d(m3554b) : -1;
            if (m3535c != null || z10 || m3536d > -1) {
                a aVar2 = new a(this, m3535c, next.m3537e(), z10, m3536d);
                if (aVar == null || aVar2.compareTo(aVar) > 0) {
                    aVar = aVar2;
                }
            }
        }
        return aVar;
    }

    /* renamed from: B */
    public void mo3470B(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C6867a.f35591A);
        m3559E(obtainAttributes.getResourceId(C6867a.f35593C, 0));
        this.f4263e = m3556t(context, this.f4262d);
        m3560F(obtainAttributes.getText(C6867a.f35592B));
        obtainAttributes.recycle();
    }

    /* renamed from: D */
    public final void m3558D(int i10, C0618c c0618c) {
        if (mo3471H()) {
            if (i10 == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            if (this.f4266h == null) {
                this.f4266h = new C7937j<>();
            }
            this.f4266h.m34452j(i10, c0618c);
            return;
        }
        throw new UnsupportedOperationException("Cannot add action " + i10 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    /* renamed from: E */
    public final void m3559E(int i10) {
        this.f4262d = i10;
        this.f4263e = null;
    }

    /* renamed from: F */
    public final void m3560F(CharSequence charSequence) {
        this.f4264f = charSequence;
    }

    /* renamed from: G */
    public final void m3561G(C0632l c0632l) {
        this.f4261c = c0632l;
    }

    /* renamed from: H */
    public boolean mo3471H() {
        return true;
    }

    /* renamed from: a */
    public final void m3562a(String str, C0619d c0619d) {
        if (this.f4267i == null) {
            this.f4267i = new HashMap<>();
        }
        this.f4267i.put(str, c0619d);
    }

    /* renamed from: b */
    public final void m3563b(C0628h c0628h) {
        if (this.f4265g == null) {
            this.f4265g = new ArrayList<>();
        }
        this.f4265g.add(c0628h);
    }

    /* renamed from: d */
    public Bundle m3564d(Bundle bundle) {
        HashMap<String, C0619d> hashMap;
        if (bundle == null && ((hashMap = this.f4267i) == null || hashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        HashMap<String, C0619d> hashMap2 = this.f4267i;
        if (hashMap2 != null) {
            for (Map.Entry<String, C0619d> entry : hashMap2.entrySet()) {
                entry.getValue().m3490c(entry.getKey(), bundle2);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            HashMap<String, C0619d> hashMap3 = this.f4267i;
            if (hashMap3 != null) {
                for (Map.Entry<String, C0619d> entry2 : hashMap3.entrySet()) {
                    if (!entry2.getValue().m3491d(entry2.getKey(), bundle)) {
                        throw new IllegalArgumentException("Wrong argument type for '" + entry2.getKey() + "' in argument bundle. " + entry2.getValue().m3488a().mo3611c() + " expected.");
                    }
                }
            }
        }
        return bundle2;
    }

    /* renamed from: f */
    public int[] m3565f() {
        ArrayDeque arrayDeque = new ArrayDeque();
        C0631k c0631k = this;
        while (true) {
            C0631k c0631k2 = c0631k;
            C0632l m3572y = c0631k2.m3572y();
            if (m3572y == null || m3572y.m3580M() != c0631k2.m3569v()) {
                arrayDeque.addFirst(c0631k2);
            }
            if (m3572y == null) {
                break;
            }
            c0631k = m3572y;
        }
        int[] iArr = new int[arrayDeque.size()];
        int i10 = 0;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            iArr[i10] = ((C0631k) it.next()).m3569v();
            i10++;
        }
        return iArr;
    }

    /* renamed from: g */
    public final C0618c m3566g(int i10) {
        C7937j<C0618c> c7937j = this.f4266h;
        C0618c m34448e = c7937j == null ? null : c7937j.m34448e(i10);
        if (m34448e == null) {
            m34448e = null;
            if (m3572y() != null) {
                m34448e = m3572y().m3566g(i10);
            }
        }
        return m34448e;
    }

    /* renamed from: i */
    public final Map<String, C0619d> m3567i() {
        HashMap<String, C0619d> hashMap = this.f4267i;
        return hashMap == null ? Collections.emptyMap() : Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: q */
    public String mo3568q() {
        if (this.f4263e == null) {
            this.f4263e = Integer.toString(this.f4262d);
        }
        return this.f4263e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        String str = this.f4263e;
        String str2 = str;
        if (str == null) {
            sb2.append("0x");
            str2 = Integer.toHexString(this.f4262d);
        }
        sb2.append(str2);
        sb2.append(")");
        if (this.f4264f != null) {
            sb2.append(" label=");
            sb2.append(this.f4264f);
        }
        return sb2.toString();
    }

    /* renamed from: v */
    public final int m3569v() {
        return this.f4262d;
    }

    /* renamed from: w */
    public final CharSequence m3570w() {
        return this.f4264f;
    }

    /* renamed from: x */
    public final String m3571x() {
        return this.f4260b;
    }

    /* renamed from: y */
    public final C0632l m3572y() {
        return this.f4261c;
    }
}
