package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import p069e0.C4570i;
import p296r1.C7944c;
import p296r1.C7947f;
import p296r1.C7948g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/preference/ListPreference.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/preference/ListPreference.class */
public class ListPreference extends DialogPreference {

    /* renamed from: N */
    public CharSequence[] f4352N;

    /* renamed from: O */
    public CharSequence[] f4353O;

    /* renamed from: P */
    public String f4354P;

    /* renamed from: Q */
    public String f4355Q;

    /* renamed from: R */
    public boolean f4356R;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/preference/ListPreference$a.class
     */
    /* renamed from: androidx.preference.ListPreference$a */
    /* loaded from: combined.jar:classes1.jar:androidx/preference/ListPreference$a.class */
    public static final class C0646a implements Preference.InterfaceC0651e<ListPreference> {

        /* renamed from: a */
        public static C0646a f4357a;

        /* renamed from: b */
        public static C0646a m3692b() {
            if (f4357a == null) {
                f4357a = new C0646a();
            }
            return f4357a;
        }

        @Override // androidx.preference.Preference.InterfaceC0651e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence mo3682a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.m3686K()) ? listPreference.m3702d().getString(C7947f.f38223a) : listPreference.m3686K();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4570i.m23069a(context, C7944c.f38212b, R.attr.dialogPreferenceStyle));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7948g.f38306b0, i10, i11);
        this.f4352N = C4570i.m23085q(obtainStyledAttributes, C7948g.f38315e0, C7948g.f38309c0);
        this.f4353O = C4570i.m23085q(obtainStyledAttributes, C7948g.f38318f0, C7948g.f38312d0);
        int i12 = C7948g.f38321g0;
        if (C4570i.m23070b(obtainStyledAttributes, i12, i12, false)) {
            m3698F(C0646a.m3692b());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C7948g.f38354r0, i10, i11);
        this.f4355Q = C4570i.m23083o(obtainStyledAttributes2, C7948g.f38300Z0, C7948g.f38378z0);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: I */
    public int m3684I(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f4353O) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (this.f4353O[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: J */
    public CharSequence[] m3685J() {
        return this.f4352N;
    }

    /* renamed from: K */
    public CharSequence m3686K() {
        CharSequence[] charSequenceArr;
        int m3689N = m3689N();
        return (m3689N < 0 || (charSequenceArr = this.f4352N) == null) ? null : charSequenceArr[m3689N];
    }

    /* renamed from: L */
    public CharSequence[] m3687L() {
        return this.f4353O;
    }

    /* renamed from: M */
    public String m3688M() {
        return this.f4354P;
    }

    /* renamed from: N */
    public final int m3689N() {
        return m3684I(this.f4354P);
    }

    /* renamed from: O */
    public void m3690O(String str) {
        boolean z10 = !TextUtils.equals(this.f4354P, str);
        if (z10 || !this.f4356R) {
            this.f4354P = str;
            this.f4356R = true;
            m3697E(str);
            if (z10) {
                mo3677u();
            }
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: o */
    public CharSequence mo3691o() {
        if (m3711p() != null) {
            return m3711p().mo3682a(this);
        }
        CharSequence m3686K = m3686K();
        CharSequence mo3691o = super.mo3691o();
        String str = this.f4355Q;
        if (str == null) {
            return mo3691o;
        }
        CharSequence charSequence = m3686K;
        if (m3686K == null) {
            charSequence = "";
        }
        String format = String.format(str, charSequence);
        if (TextUtils.equals(format, mo3691o)) {
            return mo3691o;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    @Override // androidx.preference.Preference
    /* renamed from: y */
    public Object mo3680y(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }
}
