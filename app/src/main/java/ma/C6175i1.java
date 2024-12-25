package ma;

import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p216m9.C5947e;
import p216m9.C5965k;
import p216m9.C5974n;
import p216m9.C5983q;
import p216m9.C5986r;
import p230n9.C6721i;
import p270p9.C7672c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/i1.class
 */
/* renamed from: ma.i1 */
/* loaded from: combined.jar:classes2.jar:ma/i1.class */
public final class C6175i1 extends AbstractC6070d1 {

    /* renamed from: c */
    public final RelativeLayout f33803c;

    /* renamed from: d */
    public final TextView f33804d;

    /* renamed from: e */
    public final CastSeekBar f33805e;

    /* renamed from: f */
    public final C7672c f33806f;

    public C6175i1(RelativeLayout relativeLayout, CastSeekBar castSeekBar, C7672c c7672c) {
        this.f33803c = relativeLayout;
        TextView textView = (TextView) relativeLayout.findViewById(C5974n.f33515e0);
        this.f33804d = textView;
        this.f33805e = castSeekBar;
        this.f33806f = c7672c;
        TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(null, C5986r.f33599b, C5965k.f33453a, C5983q.f33575a);
        int resourceId = obtainStyledAttributes.getResourceId(C5986r.f33620w, 0);
        obtainStyledAttributes.recycle();
        textView.getBackground().setColorFilter(textView.getContext().getResources().getColor(resourceId), PorterDuff.Mode.SRC_IN);
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: c */
    public final void mo29375c() {
        m29666j();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: e */
    public final void mo29377e(C5947e c5947e) {
        super.mo29377e(c5947e);
        m29666j();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: f */
    public final void mo29378f() {
        super.mo29378f();
        m29666j();
    }

    @Override // ma.AbstractC6070d1
    /* renamed from: g */
    public final void mo29537g(boolean z10) {
        super.mo29537g(z10);
        m29666j();
    }

    @Override // ma.AbstractC6070d1
    /* renamed from: h */
    public final void mo29538h(long j10) {
        m29666j();
    }

    /* renamed from: j */
    public final void m29666j() {
        C6721i mo29823b = mo29823b();
        if (mo29823b == null || !mo29823b.m31020p() || m29539i()) {
            this.f33803c.setVisibility(8);
            return;
        }
        this.f33803c.setVisibility(0);
        TextView textView = this.f33804d;
        C7672c c7672c = this.f33806f;
        textView.setText(c7672c.m33618l(this.f33805e.getProgress() + c7672c.m33612e()));
        int measuredWidth = (this.f33805e.getMeasuredWidth() - this.f33805e.getPaddingLeft()) - this.f33805e.getPaddingRight();
        this.f33804d.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth2 = this.f33804d.getMeasuredWidth();
        int min = Math.min(Math.max(0, ((int) ((this.f33805e.getProgress() / this.f33805e.getMaxProgress()) * measuredWidth)) - (measuredWidth2 / 2)), measuredWidth - measuredWidth2);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f33804d.getLayoutParams();
        layoutParams.leftMargin = min;
        this.f33804d.setLayoutParams(layoutParams);
    }
}
