package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.widget.SearchOrbView;
import p413y0.C9788a;
import p413y0.C9793f;
import p413y0.C9795h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/TitleView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/TitleView.class */
public class TitleView extends FrameLayout {

    /* renamed from: b */
    public ImageView f3380b;

    /* renamed from: c */
    public TextView f3381c;

    /* renamed from: d */
    public SearchOrbView f3382d;

    /* renamed from: e */
    public int f3383e;

    /* renamed from: f */
    public boolean f3384f;

    /* renamed from: g */
    public final AbstractC0504d1 f3385g;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/TitleView$a.class
     */
    /* renamed from: androidx.leanback.widget.TitleView$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/TitleView$a.class */
    public class C0492a extends AbstractC0504d1 {

        /* renamed from: a */
        public final TitleView f3386a;

        public C0492a(TitleView titleView) {
            this.f3386a = titleView;
        }
    }

    public TitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9788a.f44918a);
    }

    public TitleView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3383e = 6;
        this.f3384f = false;
        this.f3385g = new C0492a(this);
        View inflate = LayoutInflater.from(context).inflate(C9795h.f45023n, this);
        this.f3380b = (ImageView) inflate.findViewById(C9793f.f44975B);
        this.f3381c = (TextView) inflate.findViewById(C9793f.f44977D);
        this.f3382d = (SearchOrbView) inflate.findViewById(C9793f.f44976C);
        setClipToPadding(false);
        setClipChildren(false);
    }

    /* renamed from: a */
    public final void m2532a() {
        if (this.f3380b.getDrawable() != null) {
            this.f3380b.setVisibility(0);
            this.f3381c.setVisibility(8);
        } else {
            this.f3380b.setVisibility(8);
            this.f3381c.setVisibility(0);
        }
    }

    /* renamed from: b */
    public final void m2533b() {
        int i10 = 4;
        if (this.f3384f) {
            i10 = 4;
            if ((this.f3383e & 4) == 4) {
                i10 = 0;
            }
        }
        this.f3382d.setVisibility(i10);
    }

    public Drawable getBadgeDrawable() {
        return this.f3380b.getDrawable();
    }

    public SearchOrbView.C0490c getSearchAffordanceColors() {
        return this.f3382d.getOrbColors();
    }

    public View getSearchAffordanceView() {
        return this.f3382d;
    }

    public CharSequence getTitle() {
        return this.f3381c.getText();
    }

    public AbstractC0504d1 getTitleViewAdapter() {
        return this.f3385g;
    }

    public void setBadgeDrawable(Drawable drawable) {
        this.f3380b.setImageDrawable(drawable);
        m2532a();
    }

    public void setOnSearchClickedListener(View.OnClickListener onClickListener) {
        this.f3384f = onClickListener != null;
        this.f3382d.setOnOrbClickedListener(onClickListener);
        m2533b();
    }

    public void setSearchAffordanceColors(SearchOrbView.C0490c c0490c) {
        this.f3382d.setOrbColors(c0490c);
    }

    public void setTitle(CharSequence charSequence) {
        this.f3381c.setText(charSequence);
        m2532a();
    }
}
