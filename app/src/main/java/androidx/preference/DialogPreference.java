package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import p069e0.C4570i;
import p296r1.C7944c;
import p296r1.C7948g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/preference/DialogPreference.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/preference/DialogPreference.class */
public abstract class DialogPreference extends Preference {

    /* renamed from: H */
    public CharSequence f4339H;

    /* renamed from: I */
    public CharSequence f4340I;

    /* renamed from: J */
    public Drawable f4341J;

    /* renamed from: K */
    public CharSequence f4342K;

    /* renamed from: L */
    public CharSequence f4343L;

    /* renamed from: M */
    public int f4344M;

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4570i.m23069a(context, C7944c.f38212b, R.attr.dialogPreferenceStyle));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7948g.f38230C, i10, i11);
        String m23083o = C4570i.m23083o(obtainStyledAttributes, C7948g.f38260M, C7948g.f38233D);
        this.f4339H = m23083o;
        if (m23083o == null) {
            this.f4339H = m3712q();
        }
        this.f4340I = C4570i.m23083o(obtainStyledAttributes, C7948g.f38257L, C7948g.f38236E);
        this.f4341J = C4570i.m23071c(obtainStyledAttributes, C7948g.f38251J, C7948g.f38239F);
        this.f4342K = C4570i.m23083o(obtainStyledAttributes, C7948g.f38266O, C7948g.f38242G);
        this.f4343L = C4570i.m23083o(obtainStyledAttributes, C7948g.f38263N, C7948g.f38245H);
        this.f4344M = C4570i.m23082n(obtainStyledAttributes, C7948g.f38254K, C7948g.f38248I, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: w */
    public void mo3674w() {
        m3710n();
        throw null;
    }
}
