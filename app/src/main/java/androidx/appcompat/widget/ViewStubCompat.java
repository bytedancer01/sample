package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p029c.C0929j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/ViewStubCompat.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/ViewStubCompat.class */
public final class ViewStubCompat extends View {

    /* renamed from: b */
    public int f1953b;

    /* renamed from: c */
    public int f1954c;

    /* renamed from: d */
    public WeakReference<View> f1955d;

    /* renamed from: e */
    public LayoutInflater f1956e;

    /* renamed from: f */
    public InterfaceC0295a f1957f;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/ViewStubCompat$a.class
     */
    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/ViewStubCompat$a.class */
    public interface InterfaceC0295a {
        /* renamed from: a */
        void m1232a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1953b = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0929j.f6435d4, i10, 0);
        this.f1954c = obtainStyledAttributes.getResourceId(C0929j.f6453g4, -1);
        this.f1953b = obtainStyledAttributes.getResourceId(C0929j.f6447f4, 0);
        setId(obtainStyledAttributes.getResourceId(C0929j.f6441e4, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View m1231a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f1953b == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f1956e;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f1953b, viewGroup, false);
        int i10 = this.f1954c;
        if (i10 != -1) {
            inflate.setId(i10);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f1955d = new WeakReference<>(inflate);
        InterfaceC0295a interfaceC0295a = this.f1957f;
        if (interfaceC0295a != null) {
            interfaceC0295a.m1232a(this, inflate);
        }
        return inflate;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1954c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1956e;
    }

    public int getLayoutResource() {
        return this.f1953b;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i10) {
        this.f1954c = i10;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1956e = layoutInflater;
    }

    public void setLayoutResource(int i10) {
        this.f1953b = i10;
    }

    public void setOnInflateListener(InterfaceC0295a interfaceC0295a) {
        this.f1957f = interfaceC0295a;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        WeakReference<View> weakReference = this.f1955d;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i10);
            return;
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            m1231a();
        }
    }
}
