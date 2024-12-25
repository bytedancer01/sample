package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import p069e0.C4570i;
import p296r1.C7944c;
import p296r1.C7945d;
import p296r1.C7948g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/preference/SwitchPreferenceCompat.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/preference/SwitchPreferenceCompat.class */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: M */
    public final C0657a f4423M;

    /* renamed from: N */
    public CharSequence f4424N;

    /* renamed from: O */
    public CharSequence f4425O;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/preference/SwitchPreferenceCompat$a.class
     */
    /* renamed from: androidx.preference.SwitchPreferenceCompat$a */
    /* loaded from: combined.jar:classes1.jar:androidx/preference/SwitchPreferenceCompat$a.class */
    public class C0657a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: b */
        public final SwitchPreferenceCompat f4426b;

        public C0657a(SwitchPreferenceCompat switchPreferenceCompat) {
            this.f4426b = switchPreferenceCompat;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (this.f4426b.m3700a(Boolean.valueOf(z10))) {
                this.f4426b.m3739J(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7944c.f38219i);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f4423M = new C0657a(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7948g.f38256K1, i10, i11);
        m3742M(C4570i.m23083o(obtainStyledAttributes, C7948g.f38280S1, C7948g.f38259L1));
        m3741L(C4570i.m23083o(obtainStyledAttributes, C7948g.f38277R1, C7948g.f38262M1));
        m3735P(C4570i.m23083o(obtainStyledAttributes, C7948g.f38286U1, C7948g.f38268O1));
        m3734O(C4570i.m23083o(obtainStyledAttributes, C7948g.f38283T1, C7948g.f38271P1));
        m3740K(C4570i.m23070b(obtainStyledAttributes, C7948g.f38274Q1, C7948g.f38265N1, false));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: B */
    public void mo3671B(View view) {
        super.mo3671B(view);
        m3737R(view);
    }

    /* renamed from: O */
    public void m3734O(CharSequence charSequence) {
        this.f4425O = charSequence;
        mo3677u();
    }

    /* renamed from: P */
    public void m3735P(CharSequence charSequence) {
        this.f4424N = charSequence;
        mo3677u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Q */
    public final void m3736Q(View view) {
        boolean z10 = view instanceof SwitchCompat;
        if (z10) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f4427H);
        }
        if (z10) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f4424N);
            switchCompat.setTextOff(this.f4425O);
            switchCompat.setOnCheckedChangeListener(this.f4423M);
        }
    }

    /* renamed from: R */
    public final void m3737R(View view) {
        if (((AccessibilityManager) m3702d().getSystemService("accessibility")).isEnabled()) {
            m3736Q(view.findViewById(C7945d.f38221a));
            m3743N(view.findViewById(R.id.summary));
        }
    }
}
