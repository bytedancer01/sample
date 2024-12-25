package com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.ListPreference;
import ve.C9341b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/preference/IjkListPreference.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/preference/IjkListPreference.class */
public class IjkListPreference extends ListPreference {

    /* renamed from: S */
    public CharSequence[] f24919S;

    public IjkListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m19721P(context, attributeSet);
    }

    /* renamed from: Q */
    public static String m19718Q() {
        return "W91ciBUViBTZXJ2aWNlIFByb3ZpZGVyIGhhcyBub3QgcHJvdmlkZWQgeW91ciB0aGUgb3JpZ2luYWwgYXBwLg==";
    }

    /* renamed from: R */
    public static String m19719R() {
        return "3VjaCBraW5kIG9mIGFwcHMgY291bGQgc2VuZCB0aGUgZGF0YSB0byBsZWdhbCBhdXRob3JpdGllcy4=";
    }

    /* renamed from: S */
    public static String m19720S() {
        return "W";
    }

    /* renamed from: P */
    public final void m19721P(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9341b.f42566A0, 0, 0);
        if (obtainStyledAttributes == null) {
            return;
        }
        this.f24919S = obtainStyledAttributes.getTextArray(0);
        obtainStyledAttributes.recycle();
    }
}
