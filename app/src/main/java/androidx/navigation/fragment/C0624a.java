package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.AbstractC0428n;
import androidx.fragment.app.Fragment;
import androidx.navigation.AbstractC0639s;
import androidx.navigation.C0631k;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/navigation/fragment/a.class
 */
@AbstractC0639s.b("fragment")
/* renamed from: androidx.navigation.fragment.a */
/* loaded from: combined.jar:classes1.jar:androidx/navigation/fragment/a.class */
public class C0624a extends AbstractC0639s<a> {

    /* renamed from: a */
    public final Context f4204a;

    /* renamed from: b */
    public final AbstractC0428n f4205b;

    /* renamed from: c */
    public final int f4206c;

    /* renamed from: d */
    public ArrayDeque<Integer> f4207d = new ArrayDeque<>();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/fragment/a$a.class
     */
    /* renamed from: androidx.navigation.fragment.a$a */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/fragment/a$a.class */
    public static class a extends C0631k {

        /* renamed from: k */
        public String f4208k;

        public a(AbstractC0639s<? extends a> abstractC0639s) {
            super(abstractC0639s);
        }

        @Override // androidx.navigation.C0631k
        /* renamed from: B */
        public void mo3470B(Context context, AttributeSet attributeSet) {
            super.mo3470B(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0626c.f4219i);
            String string = obtainAttributes.getString(C0626c.f4220j);
            if (string != null) {
                m3528J(string);
            }
            obtainAttributes.recycle();
        }

        /* renamed from: I */
        public final String m3527I() {
            String str = this.f4208k;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("Fragment class was not set");
        }

        /* renamed from: J */
        public final a m3528J(String str) {
            this.f4208k = str;
            return this;
        }

        @Override // androidx.navigation.C0631k
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append(" class=");
            String str = this.f4208k;
            String str2 = str;
            if (str == null) {
                str2 = "null";
            }
            sb2.append(str2);
            return sb2.toString();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/fragment/a$b.class
     */
    /* renamed from: androidx.navigation.fragment.a$b */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/fragment/a$b.class */
    public static final class b implements AbstractC0639s.a {

        /* renamed from: a */
        public final LinkedHashMap<View, String> f4209a;

        /* renamed from: a */
        public Map<View, String> m3529a() {
            return Collections.unmodifiableMap(this.f4209a);
        }
    }

    public C0624a(Context context, AbstractC0428n abstractC0428n, int i10) {
        this.f4204a = context;
        this.f4205b = abstractC0428n;
        this.f4206c = i10;
    }

    @Override // androidx.navigation.AbstractC0639s
    /* renamed from: c */
    public void mo3511c(Bundle bundle) {
        int[] intArray;
        if (bundle == null || (intArray = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds")) == null) {
            return;
        }
        this.f4207d.clear();
        for (int i10 : intArray) {
            this.f4207d.add(Integer.valueOf(i10));
        }
    }

    @Override // androidx.navigation.AbstractC0639s
    /* renamed from: d */
    public Bundle mo3512d() {
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.f4207d.size()];
        Iterator<Integer> it = this.f4207d.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
        return bundle;
    }

    @Override // androidx.navigation.AbstractC0639s
    /* renamed from: e */
    public boolean mo3466e() {
        if (this.f4207d.isEmpty()) {
            return false;
        }
        if (this.f4205b.m2156L0()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        this.f4205b.m2182Y0(m3524g(this.f4207d.size(), this.f4207d.peekLast().intValue()), 1);
        this.f4207d.removeLast();
        return true;
    }

    @Override // androidx.navigation.AbstractC0639s
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a mo3464a() {
        return new a(this);
    }

    /* renamed from: g */
    public final String m3524g(int i10, int i11) {
        return i10 + "-" + i11;
    }

    @Deprecated
    /* renamed from: h */
    public Fragment m3525h(Context context, AbstractC0428n abstractC0428n, String str, Bundle bundle) {
        return abstractC0428n.m2232r0().mo2105a(context.getClassLoader(), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x022a A[RETURN] */
    @Override // androidx.navigation.AbstractC0639s
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.navigation.C0631k mo3465b(androidx.navigation.fragment.C0624a.a r7, android.os.Bundle r8, androidx.navigation.C0636p r9, androidx.navigation.AbstractC0639s.a r10) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.C0624a.mo3465b(androidx.navigation.fragment.a$a, android.os.Bundle, androidx.navigation.p, androidx.navigation.s$a):androidx.navigation.k");
    }
}
