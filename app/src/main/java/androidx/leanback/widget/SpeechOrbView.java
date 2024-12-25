package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.leanback.widget.SearchOrbView;
import p413y0.C9789b;
import p413y0.C9791d;
import p413y0.C9792e;
import p413y0.C9795h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/SpeechOrbView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SpeechOrbView.class */
public class SpeechOrbView extends SearchOrbView {

    /* renamed from: t */
    public final float f3367t;

    /* renamed from: u */
    public SearchOrbView.C0490c f3368u;

    /* renamed from: v */
    public SearchOrbView.C0490c f3369v;

    /* renamed from: w */
    public int f3370w;

    /* renamed from: x */
    public boolean f3371x;

    public SpeechOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpeechOrbView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3370w = 0;
        this.f3371x = false;
        Resources resources = context.getResources();
        this.f3367t = resources.getFraction(C9792e.f44970f, 1, 1);
        this.f3369v = new SearchOrbView.C0490c(resources.getColor(C9789b.f44930j), resources.getColor(C9789b.f44932l), resources.getColor(C9789b.f44931k));
        int i11 = C9789b.f44933m;
        this.f3368u = new SearchOrbView.C0490c(resources.getColor(i11), resources.getColor(i11), 0);
        m2527g();
    }

    /* renamed from: f */
    public void m2526f() {
        setOrbColors(this.f3368u);
        setOrbIcon(getResources().getDrawable(C9791d.f44961c));
        m2519a(true);
        m2520b(false);
        m2521c(1.0f);
        this.f3370w = 0;
        this.f3371x = true;
    }

    /* renamed from: g */
    public void m2527g() {
        setOrbColors(this.f3369v);
        setOrbIcon(getResources().getDrawable(C9791d.f44962d));
        m2519a(hasFocus());
        m2521c(1.0f);
        this.f3371x = false;
    }

    @Override // androidx.leanback.widget.SearchOrbView
    public int getLayoutResourceId() {
        return C9795h.f45022m;
    }

    public void setListeningOrbColors(SearchOrbView.C0490c c0490c) {
        this.f3368u = c0490c;
    }

    public void setNotListeningOrbColors(SearchOrbView.C0490c c0490c) {
        this.f3369v = c0490c;
    }

    public void setSoundLevel(int i10) {
        if (this.f3371x) {
            int i11 = this.f3370w;
            if (i10 > i11) {
                this.f3370w = i11 + ((i10 - i11) / 2);
            } else {
                this.f3370w = (int) (i11 * 0.7f);
            }
            m2521c((((this.f3367t - getFocusedZoom()) * this.f3370w) / 100.0f) + 1.0f);
        }
    }
}
