package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/preference/TwoStatePreference.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/preference/TwoStatePreference.class */
public abstract class TwoStatePreference extends Preference {

    /* renamed from: H */
    public boolean f4427H;

    /* renamed from: I */
    public CharSequence f4428I;

    /* renamed from: J */
    public CharSequence f4429J;

    /* renamed from: K */
    public boolean f4430K;

    /* renamed from: L */
    public boolean f4431L;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // androidx.preference.Preference
    /* renamed from: G */
    public boolean mo3678G() {
        boolean z10 = true;
        if (!(this.f4431L ? this.f4427H : !this.f4427H)) {
            z10 = super.mo3678G();
        }
        return z10;
    }

    /* renamed from: I */
    public boolean m3738I() {
        return this.f4427H;
    }

    /* renamed from: J */
    public void m3739J(boolean z10) {
        boolean z11 = this.f4427H != z10;
        if (z11 || !this.f4430K) {
            this.f4427H = z10;
            this.f4430K = true;
            m3695C(z10);
            if (z11) {
                mo3716v(mo3678G());
                mo3677u();
            }
        }
    }

    /* renamed from: K */
    public void m3740K(boolean z10) {
        this.f4431L = z10;
    }

    /* renamed from: L */
    public void m3741L(CharSequence charSequence) {
        this.f4429J = charSequence;
        if (m3738I()) {
            return;
        }
        mo3677u();
    }

    /* renamed from: M */
    public void m3742M(CharSequence charSequence) {
        this.f4428I = charSequence;
        if (m3738I()) {
            mo3677u();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m3743N(android.view.View r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof android.widget.TextView
            if (r0 != 0) goto L8
            return
        L8:
            r0 = r4
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9 = r0
            r0 = 1
            r6 = r0
            r0 = r3
            boolean r0 = r0.f4427H
            r8 = r0
            r0 = 0
            r7 = r0
            r0 = r8
            if (r0 == 0) goto L38
            r0 = r3
            java.lang.CharSequence r0 = r0.f4428I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L38
            r0 = r3
            java.lang.CharSequence r0 = r0.f4428I
            r4 = r0
        L2d:
            r0 = r9
            r1 = r4
            r0.setText(r1)
            r0 = 0
            r5 = r0
            goto L55
        L38:
            r0 = r6
            r5 = r0
            r0 = r3
            boolean r0 = r0.f4427H
            if (r0 != 0) goto L55
            r0 = r6
            r5 = r0
            r0 = r3
            java.lang.CharSequence r0 = r0.f4429J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L55
            r0 = r3
            java.lang.CharSequence r0 = r0.f4429J
            r4 = r0
            goto L2d
        L55:
            r0 = r5
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L71
            r0 = r3
            java.lang.CharSequence r0 = r0.mo3691o()
            r4 = r0
            r0 = r5
            r6 = r0
            r0 = r4
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L71
            r0 = r9
            r1 = r4
            r0.setText(r1)
            r0 = 0
            r6 = r0
        L71:
            r0 = r6
            if (r0 != 0) goto L7b
            r0 = r7
            r5 = r0
            goto L7e
        L7b:
            r0 = 8
            r5 = r0
        L7e:
            r0 = r5
            r1 = r9
            int r1 = r1.getVisibility()
            if (r0 == r1) goto L8d
            r0 = r9
            r1 = r5
            r0.setVisibility(r1)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.m3743N(android.view.View):void");
    }

    @Override // androidx.preference.Preference
    /* renamed from: w */
    public void mo3674w() {
        super.mo3674w();
        boolean z10 = !m3738I();
        if (m3700a(Boolean.valueOf(z10))) {
            m3739J(z10);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: y */
    public Object mo3680y(TypedArray typedArray, int i10) {
        return Boolean.valueOf(typedArray.getBoolean(i10, false));
    }
}
