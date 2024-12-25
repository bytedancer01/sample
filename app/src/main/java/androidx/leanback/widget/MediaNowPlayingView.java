package androidx.leanback.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p413y0.C9793f;
import p413y0.C9795h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/MediaNowPlayingView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/MediaNowPlayingView.class */
public class MediaNowPlayingView extends LinearLayout {

    /* renamed from: b */
    public final ImageView f3215b;

    /* renamed from: c */
    public final ImageView f3216c;

    /* renamed from: d */
    public final ImageView f3217d;

    /* renamed from: e */
    public final ObjectAnimator f3218e;

    /* renamed from: f */
    public final ObjectAnimator f3219f;

    /* renamed from: g */
    public final ObjectAnimator f3220g;

    /* renamed from: h */
    public final LinearInterpolator f3221h;

    public MediaNowPlayingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        this.f3221h = linearInterpolator;
        LayoutInflater.from(context).inflate(C9795h.f45015f, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(C9793f.f44979a);
        this.f3215b = imageView;
        ImageView imageView2 = (ImageView) findViewById(C9793f.f44980b);
        this.f3216c = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C9793f.f44981c);
        this.f3217d = imageView3;
        imageView.setPivotY(imageView.getDrawable().getIntrinsicHeight());
        imageView2.setPivotY(imageView2.getDrawable().getIntrinsicHeight());
        imageView3.setPivotY(imageView3.getDrawable().getIntrinsicHeight());
        setDropScale(imageView);
        setDropScale(imageView2);
        setDropScale(imageView3);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "scaleY", 0.41666666f, 0.25f, 0.41666666f, 0.5833333f, 0.75f, 0.8333333f, 0.9166667f, 1.0f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.5f, 0.33333334f, 0.16666667f, 0.33333334f, 0.5f, 0.5833333f, 0.75f, 0.9166667f, 0.75f, 0.5833333f, 0.41666666f, 0.25f, 0.41666666f, 0.6666667f, 0.41666666f, 0.25f, 0.33333334f, 0.41666666f);
        this.f3218e = ofFloat;
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(2320L);
        ofFloat.setInterpolator(linearInterpolator);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, "scaleY", 1.0f, 0.9166667f, 0.8333333f, 0.9166667f, 1.0f, 0.9166667f, 0.75f, 0.5833333f, 0.75f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.8333333f, 1.0f, 0.9166667f, 0.75f, 0.41666666f, 0.25f, 0.41666666f, 0.6666667f, 0.8333333f, 1.0f, 0.8333333f, 0.75f, 0.6666667f, 1.0f);
        this.f3219f = ofFloat2;
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setDuration(2080L);
        ofFloat2.setInterpolator(linearInterpolator);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView3, "scaleY", 0.6666667f, 0.75f, 0.8333333f, 1.0f, 0.9166667f, 0.75f, 0.5833333f, 0.41666666f, 0.5833333f, 0.6666667f, 0.75f, 1.0f, 0.9166667f, 1.0f, 0.75f, 0.5833333f, 0.75f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.75f, 0.5833333f, 0.41666666f, 0.25f, 0.6666667f);
        this.f3220g = ofFloat3;
        ofFloat3.setRepeatCount(-1);
        ofFloat3.setDuration(2000L);
        ofFloat3.setInterpolator(linearInterpolator);
    }

    public static void setDropScale(View view) {
        view.setScaleY(0.083333336f);
    }

    /* renamed from: a */
    public final void m2464a() {
        m2465b(this.f3218e);
        m2465b(this.f3219f);
        m2465b(this.f3220g);
        this.f3215b.setVisibility(0);
        this.f3216c.setVisibility(0);
        this.f3217d.setVisibility(0);
    }

    /* renamed from: b */
    public final void m2465b(Animator animator) {
        if (animator.isStarted()) {
            return;
        }
        animator.start();
    }

    /* renamed from: c */
    public final void m2466c() {
        m2467d(this.f3218e, this.f3215b);
        m2467d(this.f3219f, this.f3216c);
        m2467d(this.f3220g, this.f3217d);
        this.f3215b.setVisibility(8);
        this.f3216c.setVisibility(8);
        this.f3217d.setVisibility(8);
    }

    /* renamed from: d */
    public final void m2467d(Animator animator, View view) {
        if (animator.isStarted()) {
            animator.cancel();
            setDropScale(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            m2464a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2466c();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            m2466c();
        } else {
            m2464a();
        }
    }
}
