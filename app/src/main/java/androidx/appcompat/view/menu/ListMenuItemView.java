package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0255j;
import androidx.appcompat.widget.C0337n1;
import p029c.C0920a;
import p029c.C0925f;
import p029c.C0926g;
import p029c.C0929j;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/view/menu/ListMenuItemView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/ListMenuItemView.class */
public class ListMenuItemView extends LinearLayout implements InterfaceC0255j.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b */
    public C0252g f1499b;

    /* renamed from: c */
    public ImageView f1500c;

    /* renamed from: d */
    public RadioButton f1501d;

    /* renamed from: e */
    public TextView f1502e;

    /* renamed from: f */
    public CheckBox f1503f;

    /* renamed from: g */
    public TextView f1504g;

    /* renamed from: h */
    public ImageView f1505h;

    /* renamed from: i */
    public ImageView f1506i;

    /* renamed from: j */
    public LinearLayout f1507j;

    /* renamed from: k */
    public Drawable f1508k;

    /* renamed from: l */
    public int f1509l;

    /* renamed from: m */
    public Context f1510m;

    /* renamed from: n */
    public boolean f1511n;

    /* renamed from: o */
    public Drawable f1512o;

    /* renamed from: p */
    public boolean f1513p;

    /* renamed from: q */
    public LayoutInflater f1514q;

    /* renamed from: r */
    public boolean f1515r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0920a.f6092G);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        C0337n1 m1505v = C0337n1.m1505v(getContext(), attributeSet, C0929j.f6439e2, i10, 0);
        this.f1508k = m1505v.m1512g(C0929j.f6451g2);
        this.f1509l = m1505v.m1519n(C0929j.f6445f2, -1);
        this.f1511n = m1505v.m1506a(C0929j.f6457h2, false);
        this.f1510m = context;
        this.f1512o = m1505v.m1512g(C0929j.f6462i2);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C0920a.f6088C, 0);
        this.f1513p = obtainStyledAttributes.hasValue(0);
        m1505v.m1525w();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1514q == null) {
            this.f1514q = LayoutInflater.from(getContext());
        }
        return this.f1514q;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f1505h;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    /* renamed from: a */
    public final void m895a(View view) {
        m896b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1506i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1506i.getLayoutParams();
        rect.top += this.f1506i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    public final void m896b(View view, int i10) {
        LinearLayout linearLayout = this.f1507j;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0255j.a
    /* renamed from: c */
    public void mo885c(C0252g c0252g, int i10) {
        this.f1499b = c0252g;
        setVisibility(c0252g.isVisible() ? 0 : 8);
        setTitle(c0252g.m1019i(this));
        setCheckable(c0252g.isCheckable());
        m900h(c0252g.m1010A(), c0252g.m1017g());
        setIcon(c0252g.getIcon());
        setEnabled(c0252g.isEnabled());
        setSubMenuArrowVisible(c0252g.hasSubMenu());
        setContentDescription(c0252g.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0255j.a
    /* renamed from: d */
    public boolean mo886d() {
        return false;
    }

    /* renamed from: e */
    public final void m897e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C0926g.f6250h, (ViewGroup) this, false);
        this.f1503f = checkBox;
        m895a(checkBox);
    }

    /* renamed from: f */
    public final void m898f() {
        ImageView imageView = (ImageView) getInflater().inflate(C0926g.f6251i, (ViewGroup) this, false);
        this.f1500c = imageView;
        m896b(imageView, 0);
    }

    /* renamed from: g */
    public final void m899g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C0926g.f6253k, (ViewGroup) this, false);
        this.f1501d = radioButton;
        m895a(radioButton);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0255j.a
    public C0252g getItemData() {
        return this.f1499b;
    }

    /* renamed from: h */
    public void m900h(boolean z10, char c10) {
        int i10 = (z10 && this.f1499b.m1010A()) ? 0 : 8;
        if (i10 == 0) {
            this.f1504g.setText(this.f1499b.m1018h());
        }
        if (this.f1504g.getVisibility() != i10) {
            this.f1504g.setVisibility(i10);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        C6824g0.m31545s0(this, this.f1508k);
        TextView textView = (TextView) findViewById(C0925f.f6213M);
        this.f1502e = textView;
        int i10 = this.f1509l;
        if (i10 != -1) {
            textView.setTextAppearance(this.f1510m, i10);
        }
        this.f1504g = (TextView) findViewById(C0925f.f6206F);
        ImageView imageView = (ImageView) findViewById(C0925f.f6209I);
        this.f1505h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1512o);
        }
        this.f1506i = (ImageView) findViewById(C0925f.f6234r);
        this.f1507j = (LinearLayout) findViewById(C0925f.f6228l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f1500c != null && this.f1511n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1500c.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        TextView textView;
        if (!z10 && this.f1501d == null && this.f1503f == null) {
            return;
        }
        if (this.f1499b.m1023m()) {
            if (this.f1501d == null) {
                m899g();
            }
            compoundButton = this.f1501d;
            textView = this.f1503f;
        } else {
            if (this.f1503f == null) {
                m897e();
            }
            compoundButton = this.f1503f;
            textView = this.f1501d;
        }
        if (z10) {
            compoundButton.setChecked(this.f1499b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (textView == null || textView.getVisibility() == 8) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f1503f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f1501d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f1499b.m1023m()) {
            if (this.f1501d == null) {
                m899g();
            }
            compoundButton = this.f1501d;
        } else {
            if (this.f1503f == null) {
                m897e();
            }
            compoundButton = this.f1503f;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f1515r = z10;
        this.f1511n = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f1506i;
        if (imageView != null) {
            imageView.setVisibility((this.f1513p || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f1499b.m1036z() || this.f1515r;
        if (z10 || this.f1511n) {
            ImageView imageView = this.f1500c;
            if (imageView == null && drawable == null && !this.f1511n) {
                return;
            }
            if (imageView == null) {
                m898f();
            }
            if (drawable == null && !this.f1511n) {
                this.f1500c.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f1500c;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f1500c.getVisibility() != 0) {
                this.f1500c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i10;
        TextView textView;
        if (charSequence != null) {
            this.f1502e.setText(charSequence);
            if (this.f1502e.getVisibility() == 0) {
                return;
            }
            textView = this.f1502e;
            i10 = 0;
        } else {
            i10 = 8;
            if (this.f1502e.getVisibility() == 8) {
                return;
            } else {
                textView = this.f1502e;
            }
        }
        textView.setVisibility(i10);
    }
}
