package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import p069e0.C4570i;
import p296r1.C7944c;
import p296r1.C7948g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/preference/SwitchPreference.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/preference/SwitchPreference.class */
public class SwitchPreference extends TwoStatePreference {

    /* renamed from: M */
    public final C0656a f4419M;

    /* renamed from: N */
    public CharSequence f4420N;

    /* renamed from: O */
    public CharSequence f4421O;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/preference/SwitchPreference$a.class
     */
    /* renamed from: androidx.preference.SwitchPreference$a */
    /* loaded from: combined.jar:classes1.jar:androidx/preference/SwitchPreference$a.class */
    public class C0656a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: b */
        public final SwitchPreference f4422b;

        public C0656a(SwitchPreference switchPreference) {
            this.f4422b = switchPreference;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (this.f4422b.m3700a(Boolean.valueOf(z10))) {
                this.f4422b.m3739J(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4570i.m23069a(context, C7944c.f38220j, R.attr.switchPreferenceStyle));
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f4419M = new C0656a(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7948g.f38379z1, i10, i11);
        m3742M(C4570i.m23083o(obtainStyledAttributes, C7948g.f38247H1, C7948g.f38226A1));
        m3741L(C4570i.m23083o(obtainStyledAttributes, C7948g.f38244G1, C7948g.f38229B1));
        m3731P(C4570i.m23083o(obtainStyledAttributes, C7948g.f38253J1, C7948g.f38235D1));
        m3730O(C4570i.m23083o(obtainStyledAttributes, C7948g.f38250I1, C7948g.f38238E1));
        m3740K(C4570i.m23070b(obtainStyledAttributes, C7948g.f38241F1, C7948g.f38232C1, false));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: B */
    public void mo3671B(View view) {
        super.mo3671B(view);
        m3733R(view);
    }

    /* renamed from: O */
    public void m3730O(CharSequence charSequence) {
        this.f4421O = charSequence;
        mo3677u();
    }

    /* renamed from: P */
    public void m3731P(CharSequence charSequence) {
        this.f4420N = charSequence;
        mo3677u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Q */
    public final void m3732Q(View view) {
        boolean z10 = view instanceof Switch;
        if (z10) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f4427H);
        }
        if (z10) {
            Switch r02 = (Switch) view;
            r02.setTextOn(this.f4420N);
            r02.setTextOff(this.f4421O);
            r02.setOnCheckedChangeListener(this.f4419M);
        }
    }

    /* renamed from: R */
    public final void m3733R(View view) {
        if (((AccessibilityManager) m3702d().getSystemService("accessibility")).isEnabled()) {
            m3732Q(view.findViewById(R.id.switch_widget));
            m3743N(view.findViewById(R.id.summary));
        }
    }
}
