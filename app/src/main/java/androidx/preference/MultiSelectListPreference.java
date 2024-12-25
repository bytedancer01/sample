package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashSet;
import java.util.Set;
import p069e0.C4570i;
import p296r1.C7944c;
import p296r1.C7948g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/preference/MultiSelectListPreference.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/preference/MultiSelectListPreference.class */
public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: N */
    public CharSequence[] f4358N;

    /* renamed from: O */
    public CharSequence[] f4359O;

    /* renamed from: P */
    public Set<String> f4360P;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4570i.m23069a(context, C7944c.f38212b, R.attr.dialogPreferenceStyle));
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f4360P = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7948g.f38333k0, i10, i11);
        this.f4358N = C4570i.m23085q(obtainStyledAttributes, C7948g.f38342n0, C7948g.f38336l0);
        this.f4359O = C4570i.m23085q(obtainStyledAttributes, C7948g.f38345o0, C7948g.f38339m0);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: y */
    public Object mo3680y(TypedArray typedArray, int i10) {
        CharSequence[] textArray = typedArray.getTextArray(i10);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }
}
