package p019b1;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.leanback.widget.AbstractC0503d0;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p413y0.C9790c;
import p413y0.C9793f;
import p413y0.C9795h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b1/a.class
 */
/* renamed from: b1.a */
/* loaded from: combined.jar:classes1.jar:b1/a.class */
public class C0780a extends FrameLayout {

    /* renamed from: b */
    public ViewGroup f5392b;

    /* renamed from: c */
    public ViewGroup f5393c;

    /* renamed from: d */
    public final List<VerticalGridView> f5394d;

    /* renamed from: e */
    public ArrayList<C0781b> f5395e;

    /* renamed from: f */
    public float f5396f;

    /* renamed from: g */
    public float f5397g;

    /* renamed from: h */
    public float f5398h;

    /* renamed from: i */
    public float f5399i;

    /* renamed from: j */
    public int f5400j;

    /* renamed from: k */
    public Interpolator f5401k;

    /* renamed from: l */
    public Interpolator f5402l;

    /* renamed from: m */
    public ArrayList<c> f5403m;

    /* renamed from: n */
    public float f5404n;

    /* renamed from: o */
    public float f5405o;

    /* renamed from: p */
    public int f5406p;

    /* renamed from: q */
    public List<CharSequence> f5407q;

    /* renamed from: r */
    public int f5408r;

    /* renamed from: s */
    public int f5409s;

    /* renamed from: t */
    public final AbstractC0503d0 f5410t;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b1/a$a.class
     */
    /* renamed from: b1.a$a */
    /* loaded from: combined.jar:classes1.jar:b1/a$a.class */
    public class a extends AbstractC0503d0 {

        /* renamed from: a */
        public final C0780a f5411a;

        public a(C0780a c0780a) {
            this.f5411a = c0780a;
        }

        @Override // androidx.leanback.widget.AbstractC0503d0
        /* renamed from: a */
        public void mo2417a(RecyclerView recyclerView, RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, int i11) {
            int indexOf = this.f5411a.f5394d.indexOf(recyclerView);
            this.f5411a.m5003h(indexOf, true);
            if (abstractC0674e0 != null) {
                this.f5411a.mo2922c(indexOf, this.f5411a.f5395e.get(indexOf).m5015e() + i10);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b1/a$b.class
     */
    /* renamed from: b1.a$b */
    /* loaded from: combined.jar:classes1.jar:b1/a$b.class */
    public class b extends RecyclerView.AbstractC0677h<d> {

        /* renamed from: e */
        public final int f5412e;

        /* renamed from: f */
        public final int f5413f;

        /* renamed from: g */
        public final int f5414g;

        /* renamed from: h */
        public C0781b f5415h;

        /* renamed from: i */
        public final C0780a f5416i;

        public b(C0780a c0780a, Context context, int i10, int i11, int i12) {
            this.f5416i = c0780a;
            this.f5412e = i10;
            this.f5413f = i12;
            this.f5414g = i11;
            this.f5415h = c0780a.f5395e.get(i12);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
        /* renamed from: d0, reason: merged with bridge method [inline-methods] */
        public void mo2996G(d dVar, int i10) {
            C0781b c0781b;
            TextView textView = dVar.f5417u;
            if (textView != null && (c0781b = this.f5415h) != null) {
                textView.setText(c0781b.m5013c(c0781b.m5015e() + i10));
            }
            C0780a c0780a = this.f5416i;
            c0780a.m5002g(dVar.f4620a, c0780a.f5394d.get(this.f5413f).getSelectedPosition() == i10, this.f5413f, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
        /* renamed from: e0, reason: merged with bridge method [inline-methods] */
        public d mo2998J(ViewGroup viewGroup, int i10) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f5412e, viewGroup, false);
            int i11 = this.f5414g;
            return new d(inflate, i11 != 0 ? (TextView) inflate.findViewById(i11) : (TextView) inflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
        /* renamed from: f0, reason: merged with bridge method [inline-methods] */
        public void mo3000O(d dVar) {
            dVar.f4620a.setFocusable(this.f5416i.isActivated());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
        /* renamed from: n */
        public int mo3013n() {
            C0781b c0781b = this.f5415h;
            return c0781b == null ? 0 : c0781b.m5011a();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b1/a$c.class
     */
    /* renamed from: b1.a$c */
    /* loaded from: combined.jar:classes1.jar:b1/a$c.class */
    public interface c {
        /* renamed from: a */
        void m5010a(C0780a c0780a, int i10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b1/a$d.class
     */
    /* renamed from: b1.a$d */
    /* loaded from: combined.jar:classes1.jar:b1/a$d.class */
    public static class d extends RecyclerView.AbstractC0674e0 {

        /* renamed from: u */
        public final TextView f5417u;

        public d(View view, TextView textView) {
            super(view);
            this.f5417u = textView;
        }
    }

    public C0780a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5394d = new ArrayList();
        this.f5404n = 3.0f;
        this.f5405o = 1.0f;
        this.f5406p = 0;
        this.f5407q = new ArrayList();
        this.f5408r = C9795h.f45013d;
        this.f5409s = 0;
        this.f5410t = new a(this);
        setEnabled(true);
        setDescendantFocusability(262144);
        this.f5397g = 1.0f;
        this.f5396f = 1.0f;
        this.f5398h = 0.5f;
        this.f5399i = 0.0f;
        this.f5400j = 200;
        this.f5401k = new DecelerateInterpolator(2.5f);
        this.f5402l = new AccelerateInterpolator(2.5f);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(C9795h.f45011b, (ViewGroup) this, true);
        this.f5392b = viewGroup;
        this.f5393c = (ViewGroup) viewGroup.findViewById(C9793f.f45000v);
    }

    /* renamed from: a */
    public C0781b m4997a(int i10) {
        ArrayList<C0781b> arrayList = this.f5395e;
        if (arrayList == null) {
            return null;
        }
        return arrayList.get(i10);
    }

    /* renamed from: b */
    public final void m4998b(int i10) {
        ArrayList<c> arrayList = this.f5403m;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.f5403m.get(size).m5010a(this, i10);
            }
        }
    }

    /* renamed from: c */
    public void mo2922c(int i10, int i11) {
        C0781b c0781b = this.f5395e.get(i10);
        if (c0781b.m5012b() != i11) {
            c0781b.m5016f(i11);
            m4998b(i10);
        }
    }

    /* renamed from: d */
    public void m4999d(int i10, C0781b c0781b) {
        this.f5395e.set(i10, c0781b);
        VerticalGridView verticalGridView = this.f5394d.get(i10);
        b bVar = (b) verticalGridView.getAdapter();
        if (bVar != null) {
            bVar.m4099w();
        }
        verticalGridView.setSelectedPosition(c0781b.m5012b() - c0781b.m5015e());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isActivated()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 23 && keyCode != 66) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() != 1) {
            return true;
        }
        performClick();
        return true;
    }

    /* renamed from: e */
    public void m5000e(int i10, int i11, boolean z10) {
        C0781b c0781b = this.f5395e.get(i10);
        if (c0781b.m5012b() != i11) {
            c0781b.m5016f(i11);
            m4998b(i10);
            VerticalGridView verticalGridView = this.f5394d.get(i10);
            if (verticalGridView != null) {
                int m5015e = i11 - this.f5395e.get(i10).m5015e();
                if (z10) {
                    verticalGridView.setSelectedPositionSmooth(m5015e);
                } else {
                    verticalGridView.setSelectedPosition(m5015e);
                }
            }
        }
    }

    /* renamed from: f */
    public final void m5001f(View view, boolean z10, float f10, float f11, Interpolator interpolator) {
        view.animate().cancel();
        if (!z10) {
            view.setAlpha(f10);
            return;
        }
        if (f11 >= 0.0f) {
            view.setAlpha(f11);
        }
        view.animate().alpha(f10).setDuration(this.f5400j).setInterpolator(interpolator).start();
    }

    /* renamed from: g */
    public void m5002g(View view, boolean z10, int i10, boolean z11) {
        boolean z12 = i10 == this.f5406p || !hasFocus();
        m5001f(view, z11, z10 ? z12 ? this.f5397g : this.f5396f : z12 ? this.f5398h : this.f5399i, -1.0f, this.f5401k);
    }

    public float getActivatedVisibleItemCount() {
        return this.f5404n;
    }

    public int getColumnsCount() {
        ArrayList<C0781b> arrayList = this.f5395e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public int getPickerItemHeightPixels() {
        return getContext().getResources().getDimensionPixelSize(C9790c.f44958x);
    }

    public final int getPickerItemLayoutId() {
        return this.f5408r;
    }

    public final int getPickerItemTextViewId() {
        return this.f5409s;
    }

    public int getSelectedColumn() {
        return this.f5406p;
    }

    public final CharSequence getSeparator() {
        return this.f5407q.get(0);
    }

    public final List<CharSequence> getSeparators() {
        return this.f5407q;
    }

    public float getVisibleItemCount() {
        return 1.0f;
    }

    /* renamed from: h */
    public void m5003h(int i10, boolean z10) {
        VerticalGridView verticalGridView = this.f5394d.get(i10);
        int selectedPosition = verticalGridView.getSelectedPosition();
        int i11 = 0;
        while (i11 < verticalGridView.getAdapter().mo3013n()) {
            View mo3812a0 = verticalGridView.getLayoutManager().mo3812a0(i11);
            if (mo3812a0 != null) {
                m5002g(mo3812a0, selectedPosition == i11, i10, z10);
            }
            i11++;
        }
    }

    /* renamed from: i */
    public final void m5004i() {
        for (int i10 = 0; i10 < getColumnsCount(); i10++) {
            m5005j(this.f5394d.get(i10));
        }
    }

    /* renamed from: j */
    public final void m5005j(VerticalGridView verticalGridView) {
        ViewGroup.LayoutParams layoutParams = verticalGridView.getLayoutParams();
        float activatedVisibleItemCount = isActivated() ? getActivatedVisibleItemCount() : getVisibleItemCount();
        layoutParams.height = (int) ((getPickerItemHeightPixels() * activatedVisibleItemCount) + (verticalGridView.getVerticalSpacing() * (activatedVisibleItemCount - 1.0f)));
        verticalGridView.setLayoutParams(layoutParams);
    }

    /* renamed from: k */
    public final void m5006k() {
        boolean isActivated = isActivated();
        for (int i10 = 0; i10 < getColumnsCount(); i10++) {
            VerticalGridView verticalGridView = this.f5394d.get(i10);
            for (int i11 = 0; i11 < verticalGridView.getChildCount(); i11++) {
                verticalGridView.getChildAt(i11).setFocusable(isActivated);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int selectedColumn = getSelectedColumn();
        if (selectedColumn < this.f5394d.size()) {
            return this.f5394d.get(selectedColumn).requestFocus(i10, rect);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        for (int i10 = 0; i10 < this.f5394d.size(); i10++) {
            if (this.f5394d.get(i10).hasFocus()) {
                setSelectedColumn(i10);
            }
        }
    }

    @Override // android.view.View
    public void setActivated(boolean z10) {
        boolean isActivated = isActivated();
        super.setActivated(z10);
        if (z10 == isActivated) {
            return;
        }
        boolean hasFocus = hasFocus();
        int selectedColumn = getSelectedColumn();
        setDescendantFocusability(131072);
        if (!z10 && hasFocus && isFocusable()) {
            requestFocus();
        }
        for (int i10 = 0; i10 < getColumnsCount(); i10++) {
            this.f5394d.get(i10).setFocusable(z10);
        }
        m5004i();
        m5006k();
        if (z10 && hasFocus && selectedColumn >= 0) {
            this.f5394d.get(selectedColumn).requestFocus();
        }
        setDescendantFocusability(262144);
    }

    public void setActivatedVisibleItemCount(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException();
        }
        if (this.f5404n != f10) {
            this.f5404n = f10;
            if (isActivated()) {
                m5004i();
            }
        }
    }

    public void setColumns(List<C0781b> list) {
        if (this.f5407q.size() == 0) {
            throw new IllegalStateException("Separators size is: " + this.f5407q.size() + ". At least one separator must be provided");
        }
        if (this.f5407q.size() == 1) {
            CharSequence charSequence = this.f5407q.get(0);
            this.f5407q.clear();
            this.f5407q.add("");
            for (int i10 = 0; i10 < list.size() - 1; i10++) {
                this.f5407q.add(charSequence);
            }
            this.f5407q.add("");
        } else if (this.f5407q.size() != list.size() + 1) {
            throw new IllegalStateException("Separators size: " + this.f5407q.size() + " mustequal the size of columns: " + list.size() + " + 1");
        }
        this.f5394d.clear();
        this.f5393c.removeAllViews();
        ArrayList<C0781b> arrayList = new ArrayList<>(list);
        this.f5395e = arrayList;
        if (this.f5406p > arrayList.size() - 1) {
            this.f5406p = this.f5395e.size() - 1;
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        int columnsCount = getColumnsCount();
        if (!TextUtils.isEmpty(this.f5407q.get(0))) {
            TextView textView = (TextView) from.inflate(C9795h.f45014e, this.f5393c, false);
            textView.setText(this.f5407q.get(0));
            this.f5393c.addView(textView);
        }
        int i11 = 0;
        while (true) {
            int i12 = i11;
            if (i12 >= columnsCount) {
                return;
            }
            VerticalGridView verticalGridView = (VerticalGridView) from.inflate(C9795h.f45012c, this.f5393c, false);
            m5005j(verticalGridView);
            verticalGridView.setWindowAlignment(0);
            verticalGridView.setHasFixedSize(false);
            verticalGridView.setFocusable(isActivated());
            verticalGridView.setItemViewCacheSize(0);
            this.f5394d.add(verticalGridView);
            this.f5393c.addView(verticalGridView);
            int i13 = i12 + 1;
            if (!TextUtils.isEmpty(this.f5407q.get(i13))) {
                TextView textView2 = (TextView) from.inflate(C9795h.f45014e, this.f5393c, false);
                textView2.setText(this.f5407q.get(i13));
                this.f5393c.addView(textView2);
            }
            verticalGridView.setAdapter(new b(this, getContext(), getPickerItemLayoutId(), getPickerItemTextViewId(), i12));
            verticalGridView.setOnChildViewHolderSelectedListener(this.f5410t);
            i11 = i13;
        }
    }

    public final void setPickerItemTextViewId(int i10) {
        this.f5409s = i10;
    }

    public void setSelectedColumn(int i10) {
        if (this.f5406p != i10) {
            this.f5406p = i10;
            for (int i11 = 0; i11 < this.f5394d.size(); i11++) {
                m5003h(i11, true);
            }
        }
    }

    public final void setSeparator(CharSequence charSequence) {
        setSeparators(Arrays.asList(charSequence));
    }

    public final void setSeparators(List<CharSequence> list) {
        this.f5407q.clear();
        this.f5407q.addAll(list);
    }

    public void setVisibleItemCount(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException();
        }
        if (this.f5405o != f10) {
            this.f5405o = f10;
            if (isActivated()) {
                return;
            }
            m5004i();
        }
    }
}
