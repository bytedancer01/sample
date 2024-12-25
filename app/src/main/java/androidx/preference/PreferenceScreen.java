package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import p069e0.C4570i;
import p296r1.C7944c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/preference/PreferenceScreen.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/preference/PreferenceScreen.class */
public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: Q */
    public boolean f4404Q;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C4570i.m23069a(context, C7944c.f38216f, R.attr.preferenceScreenStyle));
        this.f4404Q = true;
    }

    @Override // androidx.preference.Preference
    /* renamed from: w */
    public void mo3674w() {
        if (m3705g() == null && m3704f() == null && m3723J() != 0) {
            m3710n();
            throw null;
        }
    }
}
