package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import p069e0.C4570i;
import p296r1.C7944c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/preference/PreferenceCategory.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/preference/PreferenceCategory.class */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4570i.m23069a(context, C7944c.f38215e, R.attr.preferenceCategoryStyle));
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // androidx.preference.Preference
    /* renamed from: G */
    public boolean mo3678G() {
        return !super.mo3714s();
    }

    @Override // androidx.preference.Preference
    /* renamed from: s */
    public boolean mo3714s() {
        return false;
    }
}
