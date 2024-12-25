package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.C0250e;
import androidx.appcompat.view.menu.InterfaceC0255j;
import androidx.appcompat.widget.AbstractViewOnTouchListenerC0348r0;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0346q1;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p029c.C0929j;
import p155j.InterfaceC5274f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/view/menu/ActionMenuItemView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/ActionMenuItemView.class */
public class ActionMenuItemView extends AppCompatTextView implements InterfaceC0255j.a, View.OnClickListener, ActionMenuView.InterfaceC0264a {

    /* renamed from: g */
    public C0252g f1484g;

    /* renamed from: h */
    public CharSequence f1485h;

    /* renamed from: i */
    public Drawable f1486i;

    /* renamed from: j */
    public C0250e.b f1487j;

    /* renamed from: k */
    public AbstractViewOnTouchListenerC0348r0 f1488k;

    /* renamed from: l */
    public AbstractC0245b f1489l;

    /* renamed from: m */
    public boolean f1490m;

    /* renamed from: n */
    public boolean f1491n;

    /* renamed from: o */
    public int f1492o;

    /* renamed from: p */
    public int f1493p;

    /* renamed from: q */
    public int f1494q;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/view/menu/ActionMenuItemView$a.class
     */
    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/ActionMenuItemView$a.class */
    public class C0244a extends AbstractViewOnTouchListenerC0348r0 {

        /* renamed from: k */
        public final ActionMenuItemView f1495k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0244a(ActionMenuItemView actionMenuItemView) {
            super(actionMenuItemView);
            this.f1495k = actionMenuItemView;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0348r0
        /* renamed from: b */
        public InterfaceC5274f mo890b() {
            AbstractC0245b abstractC0245b = this.f1495k.f1489l;
            if (abstractC0245b != null) {
                return abstractC0245b.mo892a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0348r0
        /* renamed from: c */
        public boolean mo891c() {
            ActionMenuItemView actionMenuItemView = this.f1495k;
            C0250e.b bVar = actionMenuItemView.f1487j;
            boolean z10 = false;
            if (bVar != null) {
                z10 = false;
                if (bVar.mo894b(actionMenuItemView.f1484g)) {
                    InterfaceC5274f mo890b = mo890b();
                    z10 = false;
                    if (mo890b != null) {
                        z10 = false;
                        if (mo890b.mo922a()) {
                            z10 = true;
                        }
                    }
                }
            }
            return z10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/view/menu/ActionMenuItemView$b.class
     */
    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/ActionMenuItemView$b.class */
    public static abstract class AbstractC0245b {
        /* renamed from: a */
        public abstract InterfaceC5274f mo892a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f1490m = m888g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0929j.f6524v, i10, 0);
        this.f1492o = obtainStyledAttributes.getDimensionPixelSize(C0929j.f6529w, 0);
        obtainStyledAttributes.recycle();
        this.f1494q = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1493p = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0264a
    /* renamed from: a */
    public boolean mo883a() {
        return m887f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0264a
    /* renamed from: b */
    public boolean mo884b() {
        return m887f() && this.f1484g.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0255j.a
    /* renamed from: c */
    public void mo885c(C0252g c0252g, int i10) {
        this.f1484g = c0252g;
        setIcon(c0252g.getIcon());
        setTitle(c0252g.m1019i(this));
        setId(c0252g.getItemId());
        setVisibility(c0252g.isVisible() ? 0 : 8);
        setEnabled(c0252g.isEnabled());
        if (c0252g.hasSubMenu() && this.f1488k == null) {
            this.f1488k = new C0244a(this);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0255j.a
    /* renamed from: d */
    public boolean mo886d() {
        return true;
    }

    /* renamed from: f */
    public boolean m887f() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: g */
    public final boolean m888g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0255j.a
    public C0252g getItemData() {
        return this.f1484g;
    }

    /* renamed from: h */
    public final void m889h() {
        boolean isEmpty = TextUtils.isEmpty(this.f1485h);
        boolean z10 = true;
        if (this.f1486i != null) {
            if (this.f1484g.m1011B()) {
                z10 = true;
                if (!this.f1490m) {
                    if (this.f1491n) {
                        z10 = true;
                    }
                }
            }
            z10 = false;
        }
        boolean z11 = (!isEmpty) & z10;
        setText(z11 ? this.f1485h : null);
        CharSequence contentDescription = this.f1484g.getContentDescription();
        CharSequence charSequence = contentDescription;
        if (TextUtils.isEmpty(contentDescription)) {
            charSequence = z11 ? null : this.f1484g.getTitle();
        }
        setContentDescription(charSequence);
        CharSequence tooltipText = this.f1484g.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            C0346q1.m1563a(this, z11 ? null : this.f1484g.getTitle());
        } else {
            C0346q1.m1563a(this, tooltipText);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0250e.b bVar = this.f1487j;
        if (bVar != null) {
            bVar.mo894b(this.f1484g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1490m = m888g();
        m889h();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean m887f = m887f();
        if (m887f && (i12 = this.f1493p) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f1492o) : this.f1492o;
        if (mode != 1073741824 && this.f1492o > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH), i11);
        }
        if (m887f || this.f1486i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1486i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0348r0 abstractViewOnTouchListenerC0348r0;
        if (this.f1484g.hasSubMenu() && (abstractViewOnTouchListenerC0348r0 = this.f1488k) != null && abstractViewOnTouchListenerC0348r0.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f1491n != z10) {
            this.f1491n = z10;
            C0252g c0252g = this.f1484g;
            if (c0252g != null) {
                c0252g.m1014c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1486i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f1494q;
            int i11 = intrinsicWidth;
            int i12 = intrinsicHeight;
            if (intrinsicWidth > i10) {
                i12 = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                i11 = i10;
            }
            if (i12 > i10) {
                i11 = (int) (i11 * (i10 / i12));
            } else {
                i10 = i12;
            }
            drawable.setBounds(0, 0, i11, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        m889h();
    }

    public void setItemInvoker(C0250e.b bVar) {
        this.f1487j = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f1493p = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(AbstractC0245b abstractC0245b) {
        this.f1489l = abstractC0245b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1485h = charSequence;
        m889h();
    }
}
