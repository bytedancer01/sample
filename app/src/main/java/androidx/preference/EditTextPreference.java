package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import p069e0.C4570i;
import p296r1.C7944c;
import p296r1.C7947f;
import p296r1.C7948g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/preference/EditTextPreference.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/preference/EditTextPreference.class */
public class EditTextPreference extends DialogPreference {

    /* renamed from: N */
    public String f4350N;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/preference/EditTextPreference$a.class
     */
    /* renamed from: androidx.preference.EditTextPreference$a */
    /* loaded from: combined.jar:classes1.jar:androidx/preference/EditTextPreference$a.class */
    public static final class C0645a implements Preference.InterfaceC0651e<EditTextPreference> {

        /* renamed from: a */
        public static C0645a f4351a;

        /* renamed from: b */
        public static C0645a m3681b() {
            if (f4351a == null) {
                f4351a = new C0645a();
            }
            return f4351a;
        }

        @Override // androidx.preference.Preference.InterfaceC0651e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence mo3682a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.m3679I()) ? editTextPreference.m3702d().getString(C7947f.f38223a) : editTextPreference.m3679I();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4570i.m23069a(context, C7944c.f38214d, R.attr.editTextPreferenceStyle));
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7948g.f38272Q, i10, i11);
        int i12 = C7948g.f38275R;
        if (C4570i.m23070b(obtainStyledAttributes, i12, i12, false)) {
            m3698F(C0645a.m3681b());
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: G */
    public boolean mo3678G() {
        return TextUtils.isEmpty(this.f4350N) || super.mo3678G();
    }

    /* renamed from: I */
    public String m3679I() {
        return this.f4350N;
    }

    @Override // androidx.preference.Preference
    /* renamed from: y */
    public Object mo3680y(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }
}
