package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import p069e0.C4570i;
import p296r1.C7944c;
import p296r1.C7948g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/preference/CheckBoxPreference.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/preference/CheckBoxPreference.class */
public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: M */
    public final C0643a f4337M;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/preference/CheckBoxPreference$a.class
     */
    /* renamed from: androidx.preference.CheckBoxPreference$a */
    /* loaded from: combined.jar:classes1.jar:androidx/preference/CheckBoxPreference$a.class */
    public class C0643a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: b */
        public final CheckBoxPreference f4338b;

        public C0643a(CheckBoxPreference checkBoxPreference) {
            this.f4338b = checkBoxPreference;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (this.f4338b.m3700a(Boolean.valueOf(z10))) {
                this.f4338b.m3739J(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4570i.m23069a(context, C7944c.f38211a, R.attr.checkBoxPreferenceStyle));
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f4337M = new C0643a(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7948g.f38353r, i10, i11);
        m3742M(C4570i.m23083o(obtainStyledAttributes, C7948g.f38371x, C7948g.f38356s));
        m3741L(C4570i.m23083o(obtainStyledAttributes, C7948g.f38368w, C7948g.f38359t));
        m3740K(C4570i.m23070b(obtainStyledAttributes, C7948g.f38365v, C7948g.f38362u, false));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: B */
    public void mo3671B(View view) {
        super.mo3671B(view);
        m3673P(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: O */
    public final void m3672O(View view) {
        boolean z10 = view instanceof CompoundButton;
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f4427H);
        }
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f4337M);
        }
    }

    /* renamed from: P */
    public final void m3673P(View view) {
        if (((AccessibilityManager) m3702d().getSystemService("accessibility")).isEnabled()) {
            m3672O(view.findViewById(R.id.checkbox));
            m3743N(view.findViewById(R.id.summary));
        }
    }
}
