package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amplifyframework.core.model.ModelIdentifier;
import java.util.Arrays;
import java.util.HashMap;
import org.simpleframework.xml.strategy.Name;
import p373w.C9385e;
import p373w.InterfaceC9388h;
import p412y.C9785c;
import p412y.C9786d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/constraintlayout/widget/b.class
 */
/* renamed from: androidx.constraintlayout.widget.b */
/* loaded from: combined.jar:classes1.jar:androidx/constraintlayout/widget/b.class */
public abstract class AbstractC0375b extends View {

    /* renamed from: b */
    public int[] f2473b;

    /* renamed from: c */
    public int f2474c;

    /* renamed from: d */
    public Context f2475d;

    /* renamed from: e */
    public InterfaceC9388h f2476e;

    /* renamed from: f */
    public boolean f2477f;

    /* renamed from: g */
    public String f2478g;

    /* renamed from: h */
    public View[] f2479h;

    /* renamed from: i */
    public HashMap<Integer, String> f2480i;

    public AbstractC0375b(Context context) {
        super(context);
        this.f2473b = new int[32];
        this.f2477f = false;
        this.f2479h = null;
        this.f2480i = new HashMap<>();
        this.f2475d = context;
        mo1691g(null);
    }

    public AbstractC0375b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2473b = new int[32];
        this.f2477f = false;
        this.f2479h = null;
        this.f2480i = new HashMap<>();
        this.f2475d = context;
        mo1691g(attributeSet);
    }

    /* renamed from: a */
    public final void m1721a(String str) {
        if (str == null || str.length() == 0 || this.f2475d == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int m1726f = m1726f(trim);
        if (m1726f != 0) {
            this.f2480i.put(Integer.valueOf(m1726f), trim);
            m1722b(m1726f);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
    }

    /* renamed from: b */
    public final void m1722b(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f2474c;
        int[] iArr = this.f2473b;
        if (i11 + 1 > iArr.length) {
            this.f2473b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2473b;
        int i12 = this.f2474c;
        iArr2[i12] = i10;
        this.f2474c = i12 + 1;
    }

    /* renamed from: c */
    public void m1723c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m1724d((ConstraintLayout) parent);
    }

    /* renamed from: d */
    public void m1724d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f2474c; i10++) {
            View m1701h = constraintLayout.m1701h(this.f2473b[i10]);
            if (m1701h != null) {
                m1701h.setVisibility(visibility);
                if (elevation > 0.0f) {
                    m1701h.setTranslationZ(m1701h.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: e */
    public final int m1725e(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f2475d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException e10) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: f */
    public final int m1726f(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i10 = 0;
        if (isInEditMode()) {
            i10 = 0;
            if (constraintLayout != null) {
                Object m1699f = constraintLayout.m1699f(0, str);
                i10 = 0;
                if (m1699f instanceof Integer) {
                    i10 = ((Integer) m1699f).intValue();
                }
            }
        }
        int i11 = i10;
        if (i10 == 0) {
            i11 = i10;
            if (constraintLayout != null) {
                i11 = m1725e(constraintLayout, str);
            }
        }
        int i12 = i11;
        if (i11 == 0) {
            try {
                i12 = C9785c.class.getField(str).getInt(null);
            } catch (Exception e10) {
                i12 = i11;
            }
        }
        int i13 = i12;
        if (i12 == 0) {
            i13 = this.f2475d.getResources().getIdentifier(str, Name.MARK, this.f2475d.getPackageName());
        }
        return i13;
    }

    /* renamed from: g */
    public void mo1691g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C9786d.f44753a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == C9786d.f44834m1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2478g = string;
                    setIds(string);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2473b, this.f2474c);
    }

    /* renamed from: h */
    public void mo1692h(C9385e c9385e, boolean z10) {
    }

    /* renamed from: i */
    public void m1727i(ConstraintLayout constraintLayout) {
    }

    /* renamed from: j */
    public void m1728j(ConstraintLayout constraintLayout) {
    }

    /* renamed from: k */
    public void m1729k(ConstraintLayout constraintLayout) {
    }

    /* renamed from: l */
    public void m1730l(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f2478g);
        }
        InterfaceC9388h interfaceC9388h = this.f2476e;
        if (interfaceC9388h == null) {
            return;
        }
        interfaceC9388h.mo39701c();
        for (int i10 = 0; i10 < this.f2474c; i10++) {
            int i11 = this.f2473b[i10];
            View m1701h = constraintLayout.m1701h(i11);
            View view = m1701h;
            if (m1701h == null) {
                String str = this.f2480i.get(Integer.valueOf(i11));
                int m1725e = m1725e(constraintLayout, str);
                view = m1701h;
                if (m1725e != 0) {
                    this.f2473b[i10] = m1725e;
                    this.f2480i.put(Integer.valueOf(m1725e), str);
                    view = constraintLayout.m1701h(m1725e);
                }
            }
            if (view != null) {
                this.f2476e.mo39700b(constraintLayout.m1702i(view));
            }
        }
        this.f2476e.mo39699a(constraintLayout.f2367d);
    }

    /* renamed from: m */
    public void m1731m() {
        if (this.f2476e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C0372b) {
            ((ConstraintLayout.C0372b) layoutParams).f2442n0 = (C9385e) this.f2476e;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2478g;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f2477f) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setIds(String str) {
        this.f2478g = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f2474c = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                m1721a(str.substring(i10));
                return;
            } else {
                m1721a(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2478g = null;
        this.f2474c = 0;
        for (int i10 : iArr) {
            m1722b(i10);
        }
    }
}
