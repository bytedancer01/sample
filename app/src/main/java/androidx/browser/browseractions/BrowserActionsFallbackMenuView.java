package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p220n.C6608a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/browser/browseractions/BrowserActionsFallbackMenuView.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:androidx/browser/browseractions/BrowserActionsFallbackMenuView.class */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: b */
    public final int f2349b;

    /* renamed from: c */
    public final int f2350c;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2349b = getResources().getDimensionPixelOffset(C6608a.f34520b);
        this.f2350c = getResources().getDimensionPixelOffset(C6608a.f34519a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f2349b * 2), this.f2350c), NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH), i11);
    }
}
