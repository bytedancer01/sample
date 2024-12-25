package p028bc;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.C0305d;
import androidx.appcompat.widget.C0363w0;
import cc.C1060a;
import com.google.android.material.textfield.TextInputLayout;
import p012ab.C0142b;
import p012ab.C0151k;
import p012ab.C0152l;
import p306rb.C8453e;
import p306rb.C8458j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:bc/e.class
 */
/* renamed from: bc.e */
/* loaded from: combined.jar:classes2.jar:bc/e.class */
public class C0886e extends C0305d {

    /* renamed from: e */
    public final C0363w0 f6006e;

    /* renamed from: f */
    public final AccessibilityManager f6007f;

    /* renamed from: g */
    public final Rect f6008g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:bc/e$a.class
     */
    /* renamed from: bc.e$a */
    /* loaded from: combined.jar:classes2.jar:bc/e$a.class */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final C0886e f6009b;

        public a(C0886e c0886e) {
            this.f6009b = c0886e;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
        
            if (r10 < 0) goto L12;
         */
        @Override // android.widget.AdapterView.OnItemClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onItemClick(android.widget.AdapterView<?> r8, android.view.View r9, int r10, long r11) {
            /*
                r7 = this;
                r0 = r7
                bc.e r0 = r0.f6009b
                r8 = r0
                r0 = r10
                if (r0 >= 0) goto L14
                r0 = r8
                androidx.appcompat.widget.w0 r0 = p028bc.C0886e.m5522a(r0)
                java.lang.Object r0 = r0.m1672u()
                r8 = r0
                goto L1f
            L14:
                r0 = r8
                android.widget.ListAdapter r0 = r0.getAdapter()
                r1 = r10
                java.lang.Object r0 = r0.getItem(r1)
                r8 = r0
            L1f:
                r0 = r7
                bc.e r0 = r0.f6009b
                r1 = r8
                p028bc.C0886e.m5523b(r0, r1)
                r0 = r7
                bc.e r0 = r0.f6009b
                android.widget.AdapterView$OnItemClickListener r0 = r0.getOnItemClickListener()
                r8 = r0
                r0 = r8
                if (r0 == 0) goto L76
                r0 = r9
                if (r0 == 0) goto L3e
                r0 = r10
                r13 = r0
                r0 = r10
                if (r0 >= 0) goto L61
            L3e:
                r0 = r7
                bc.e r0 = r0.f6009b
                androidx.appcompat.widget.w0 r0 = p028bc.C0886e.m5522a(r0)
                android.view.View r0 = r0.m1675x()
                r9 = r0
                r0 = r7
                bc.e r0 = r0.f6009b
                androidx.appcompat.widget.w0 r0 = p028bc.C0886e.m5522a(r0)
                int r0 = r0.m1674w()
                r13 = r0
                r0 = r7
                bc.e r0 = r0.f6009b
                androidx.appcompat.widget.w0 r0 = p028bc.C0886e.m5522a(r0)
                long r0 = r0.m1673v()
                r11 = r0
            L61:
                r0 = r8
                r1 = r7
                bc.e r1 = r1.f6009b
                androidx.appcompat.widget.w0 r1 = p028bc.C0886e.m5522a(r1)
                android.widget.ListView r1 = r1.mo927o()
                r2 = r9
                r3 = r13
                r4 = r11
                r0.onItemClick(r1, r2, r3, r4)
            L76:
                r0 = r7
                bc.e r0 = r0.f6009b
                androidx.appcompat.widget.w0 r0 = p028bc.C0886e.m5522a(r0)
                r0.dismiss()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p028bc.C0886e.a.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    public C0886e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0142b.f642b);
    }

    public C0886e(Context context, AttributeSet attributeSet, int i10) {
        super(C1060a.m6267c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f6008g = new Rect();
        Context context2 = getContext();
        TypedArray m36338h = C8458j.m36338h(context2, attributeSet, C0152l.f1168p2, i10, C0151k.f822d, new int[0]);
        int i11 = C0152l.f1176q2;
        if (m36338h.hasValue(i11) && m36338h.getInt(i11, 0) == 0) {
            setKeyListener(null);
        }
        this.f6007f = (AccessibilityManager) context2.getSystemService("accessibility");
        C0363w0 c0363w0 = new C0363w0(context2);
        this.f6006e = c0363w0;
        c0363w0.m1654I(true);
        c0363w0.m1648C(this);
        c0363w0.m1653H(2);
        c0363w0.mo1636m(getAdapter());
        c0363w0.m1656K(new a(this));
        m36338h.recycle();
    }

    /* renamed from: c */
    public final TextInputLayout m5524c() {
        ViewParent parent = getParent();
        while (true) {
            ViewParent viewParent = parent;
            if (viewParent == null) {
                return null;
            }
            if (viewParent instanceof TextInputLayout) {
                return (TextInputLayout) viewParent;
            }
            parent = viewParent.getParent();
        }
    }

    /* renamed from: d */
    public final int m5525d() {
        ListAdapter adapter = getAdapter();
        TextInputLayout m5524c = m5524c();
        int i10 = 0;
        if (adapter == null || m5524c == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f6006e.m1674w()) + 15);
        int max = Math.max(0, min - 15);
        View view = null;
        int i11 = 0;
        while (max < min) {
            int itemViewType = adapter.getItemViewType(max);
            int i12 = i10;
            if (itemViewType != i10) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(max, view, m5524c);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
            max++;
            i10 = i12;
        }
        Drawable m1665g = this.f6006e.m1665g();
        int i13 = i11;
        if (m1665g != null) {
            m1665g.getPadding(this.f6008g);
            Rect rect = this.f6008g;
            i13 = i11 + rect.left + rect.right;
        }
        return i13 + m5524c.getEndIconView().getMeasuredWidth();
    }

    /* renamed from: e */
    public final <T extends ListAdapter & Filterable> void m5526e(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout m5524c = m5524c();
        return (m5524c == null || !m5524c.m14042O()) ? super.getHint() : m5524c.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout m5524c = m5524c();
        if (m5524c != null && m5524c.m14042O() && super.getHint() == null && C8453e.m36311a()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m5525d()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f6006e.mo1636m(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f6007f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f6006e.show();
        }
    }
}
