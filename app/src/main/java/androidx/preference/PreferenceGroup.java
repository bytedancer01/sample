package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p069e0.C4570i;
import p294r.C7936i;
import p296r1.C7948g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/preference/PreferenceGroup.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/preference/PreferenceGroup.class */
public abstract class PreferenceGroup extends Preference {

    /* renamed from: H */
    public final C7936i<String, Long> f4394H;

    /* renamed from: I */
    public final Handler f4395I;

    /* renamed from: J */
    public List<Preference> f4396J;

    /* renamed from: K */
    public boolean f4397K;

    /* renamed from: L */
    public int f4398L;

    /* renamed from: M */
    public boolean f4399M;

    /* renamed from: N */
    public int f4400N;

    /* renamed from: O */
    public InterfaceC0653b f4401O;

    /* renamed from: P */
    public final Runnable f4402P;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/preference/PreferenceGroup$a.class
     */
    /* renamed from: androidx.preference.PreferenceGroup$a */
    /* loaded from: combined.jar:classes1.jar:androidx/preference/PreferenceGroup$a.class */
    public class RunnableC0652a implements Runnable {

        /* renamed from: b */
        public final PreferenceGroup f4403b;

        public RunnableC0652a(PreferenceGroup preferenceGroup) {
            this.f4403b = preferenceGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                this.f4403b.f4394H.clear();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/preference/PreferenceGroup$b.class
     */
    /* renamed from: androidx.preference.PreferenceGroup$b */
    /* loaded from: combined.jar:classes1.jar:androidx/preference/PreferenceGroup$b.class */
    public interface InterfaceC0653b {
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f4394H = new C7936i<>();
        this.f4395I = new Handler();
        this.f4397K = true;
        this.f4398L = 0;
        this.f4399M = false;
        this.f4400N = Integer.MAX_VALUE;
        this.f4401O = null;
        this.f4402P = new RunnableC0652a(this);
        this.f4396J = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7948g.f38316e1, i10, i11);
        int i12 = C7948g.f38322g1;
        this.f4397K = C4570i.m23070b(obtainStyledAttributes, i12, i12, true);
        int i13 = C7948g.f38319f1;
        if (obtainStyledAttributes.hasValue(i13)) {
            m3724K(C4570i.m23072d(obtainStyledAttributes, i13, i13, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: I */
    public Preference m3722I(int i10) {
        return this.f4396J.get(i10);
    }

    /* renamed from: J */
    public int m3723J() {
        return this.f4396J.size();
    }

    /* renamed from: K */
    public void m3724K(int i10) {
        if (i10 != Integer.MAX_VALUE && !m3713r()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f4400N = i10;
    }

    @Override // androidx.preference.Preference
    /* renamed from: v */
    public void mo3716v(boolean z10) {
        super.mo3716v(z10);
        int m3723J = m3723J();
        for (int i10 = 0; i10 < m3723J; i10++) {
            m3722I(i10).m3718z(this, z10);
        }
    }
}
