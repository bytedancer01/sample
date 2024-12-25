package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.DialogC0242a;
import p029c.C0920a;
import p068e.C4561b;
import p155j.InterfaceC5274f;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/v.class
 */
/* renamed from: androidx.appcompat.widget.v */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/v.class */
public class C0359v extends Spinner {

    /* renamed from: j */
    public static final int[] f2276j = {R.attr.spinnerMode};

    /* renamed from: b */
    public final C0308e f2277b;

    /* renamed from: c */
    public final Context f2278c;

    /* renamed from: d */
    public AbstractViewOnTouchListenerC0348r0 f2279d;

    /* renamed from: e */
    public SpinnerAdapter f2280e;

    /* renamed from: f */
    public final boolean f2281f;

    /* renamed from: g */
    public g f2282g;

    /* renamed from: h */
    public int f2283h;

    /* renamed from: i */
    public final Rect f2284i;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/v$a.class
     */
    /* renamed from: androidx.appcompat.widget.v$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/v$a.class */
    public class a extends AbstractViewOnTouchListenerC0348r0 {

        /* renamed from: k */
        public final e f2285k;

        /* renamed from: l */
        public final C0359v f2286l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0359v c0359v, View view, e eVar) {
            super(view);
            this.f2286l = c0359v;
            this.f2285k = eVar;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0348r0
        /* renamed from: b */
        public InterfaceC5274f mo890b() {
            return this.f2285k;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0348r0
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: c */
        public boolean mo891c() {
            if (this.f2286l.getInternalPopup().mo1625a()) {
                return true;
            }
            this.f2286l.m1624b();
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/v$b.class
     */
    /* renamed from: androidx.appcompat.widget.v$b */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/v$b.class */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b */
        public final C0359v f2287b;

        public b(C0359v c0359v) {
            this.f2287b = c0359v;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!this.f2287b.getInternalPopup().mo1625a()) {
                this.f2287b.m1624b();
            }
            ViewTreeObserver viewTreeObserver = this.f2287b.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/v$c.class
     */
    /* renamed from: androidx.appcompat.widget.v$c */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/v$c.class */
    public class c implements g, DialogInterface.OnClickListener {

        /* renamed from: b */
        public DialogC0242a f2288b;

        /* renamed from: c */
        public ListAdapter f2289c;

        /* renamed from: d */
        public CharSequence f2290d;

        /* renamed from: e */
        public final C0359v f2291e;

        public c(C0359v c0359v) {
            this.f2291e = c0359v;
        }

        @Override // androidx.appcompat.widget.C0359v.g
        /* renamed from: a */
        public boolean mo1625a() {
            DialogC0242a dialogC0242a = this.f2288b;
            return dialogC0242a != null ? dialogC0242a.isShowing() : false;
        }

        @Override // androidx.appcompat.widget.C0359v.g
        /* renamed from: b */
        public void mo1626b(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0359v.g
        /* renamed from: c */
        public int mo1627c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C0359v.g
        public void dismiss() {
            DialogC0242a dialogC0242a = this.f2288b;
            if (dialogC0242a != null) {
                dialogC0242a.dismiss();
                this.f2288b = null;
            }
        }

        @Override // androidx.appcompat.widget.C0359v.g
        /* renamed from: e */
        public void mo1628e(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0359v.g
        /* renamed from: f */
        public CharSequence mo1629f() {
            return this.f2290d;
        }

        @Override // androidx.appcompat.widget.C0359v.g
        /* renamed from: g */
        public Drawable mo1630g() {
            return null;
        }

        @Override // androidx.appcompat.widget.C0359v.g
        /* renamed from: h */
        public void mo1631h(CharSequence charSequence) {
            this.f2290d = charSequence;
        }

        @Override // androidx.appcompat.widget.C0359v.g
        /* renamed from: i */
        public void mo1632i(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0359v.g
        /* renamed from: j */
        public void mo1633j(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0359v.g
        /* renamed from: k */
        public void mo1634k(int i10, int i11) {
            if (this.f2289c == null) {
                return;
            }
            DialogC0242a.a aVar = new DialogC0242a.a(this.f2291e.getPopupContext());
            CharSequence charSequence = this.f2290d;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            DialogC0242a create = aVar.m862j(this.f2289c, this.f2291e.getSelectedItemPosition(), this).create();
            this.f2288b = create;
            ListView m852f = create.m852f();
            m852f.setTextDirection(i10);
            m852f.setTextAlignment(i11);
            this.f2288b.show();
        }

        @Override // androidx.appcompat.widget.C0359v.g
        /* renamed from: l */
        public int mo1635l() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C0359v.g
        /* renamed from: m */
        public void mo1636m(ListAdapter listAdapter) {
            this.f2289c = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.f2291e.setSelection(i10);
            if (this.f2291e.getOnItemClickListener() != null) {
                this.f2291e.performItemClick(null, i10, this.f2289c.getItemId(i10));
            }
            dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/v$d.class
     */
    /* renamed from: androidx.appcompat.widget.v$d */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/v$d.class */
    public static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: b */
        public SpinnerAdapter f2292b;

        /* renamed from: c */
        public ListAdapter f2293c;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f2292b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f2293c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof InterfaceC0325j1) {
                    InterfaceC0325j1 interfaceC0325j1 = (InterfaceC0325j1) spinnerAdapter;
                    if (interfaceC0325j1.getDropDownViewTheme() == null) {
                        interfaceC0325j1.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f2293c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f2292b;
            return spinnerAdapter == null ? 0 : spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f2292b;
            return spinnerAdapter == null ? null : spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f2292b;
            return spinnerAdapter == null ? null : spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f2292b;
            return spinnerAdapter == null ? -1L : spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f2292b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f2293c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2292b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2292b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/v$e.class
     */
    /* renamed from: androidx.appcompat.widget.v$e */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/v$e.class */
    public class e extends C0363w0 implements g {

        /* renamed from: K */
        public CharSequence f2294K;

        /* renamed from: L */
        public ListAdapter f2295L;

        /* renamed from: M */
        public final Rect f2296M;

        /* renamed from: N */
        public int f2297N;

        /* renamed from: O */
        public final C0359v f2298O;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/appcompat/widget/v$e$a.class
         */
        /* renamed from: androidx.appcompat.widget.v$e$a */
        /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/v$e$a.class */
        public class a implements AdapterView.OnItemClickListener {

            /* renamed from: b */
            public final C0359v f2299b;

            /* renamed from: c */
            public final e f2300c;

            public a(e eVar, C0359v c0359v) {
                this.f2300c = eVar;
                this.f2299b = c0359v;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                this.f2300c.f2298O.setSelection(i10);
                if (this.f2300c.f2298O.getOnItemClickListener() != null) {
                    e eVar = this.f2300c;
                    eVar.f2298O.performItemClick(view, i10, eVar.f2295L.getItemId(i10));
                }
                this.f2300c.dismiss();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/appcompat/widget/v$e$b.class
         */
        /* renamed from: androidx.appcompat.widget.v$e$b */
        /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/v$e$b.class */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {

            /* renamed from: b */
            public final e f2301b;

            public b(e eVar) {
                this.f2301b = eVar;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                e eVar = this.f2301b;
                if (!eVar.m1640T(eVar.f2298O)) {
                    this.f2301b.dismiss();
                } else {
                    this.f2301b.m1638R();
                    e.super.show();
                }
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/appcompat/widget/v$e$c.class
         */
        /* renamed from: androidx.appcompat.widget.v$e$c */
        /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/v$e$c.class */
        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: b */
            public final ViewTreeObserver.OnGlobalLayoutListener f2302b;

            /* renamed from: c */
            public final e f2303c;

            public c(e eVar, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f2303c = eVar;
                this.f2302b = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = this.f2303c.f2298O.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f2302b);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C0359v c0359v, Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f2298O = c0359v;
            this.f2296M = new Rect();
            m1648C(c0359v);
            m1654I(true);
            m1659N(0);
            m1656K(new a(this, c0359v));
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0112  */
        /* renamed from: R */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m1638R() {
            /*
                Method dump skipped, instructions count: 290
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0359v.e.m1638R():void");
        }

        /* renamed from: S */
        public int m1639S() {
            return this.f2297N;
        }

        /* renamed from: T */
        public boolean m1640T(View view) {
            return C6824g0.m31501T(view) && view.getGlobalVisibleRect(this.f2296M);
        }

        @Override // androidx.appcompat.widget.C0359v.g
        /* renamed from: f */
        public CharSequence mo1629f() {
            return this.f2294K;
        }

        @Override // androidx.appcompat.widget.C0359v.g
        /* renamed from: h */
        public void mo1631h(CharSequence charSequence) {
            this.f2294K = charSequence;
        }

        @Override // androidx.appcompat.widget.C0359v.g
        /* renamed from: j */
        public void mo1633j(int i10) {
            this.f2297N = i10;
        }

        @Override // androidx.appcompat.widget.C0359v.g
        /* renamed from: k */
        public void mo1634k(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean mo922a = mo922a();
            m1638R();
            m1653H(2);
            super.show();
            ListView mo927o = mo927o();
            mo927o.setChoiceMode(1);
            mo927o.setTextDirection(i10);
            mo927o.setTextAlignment(i11);
            m1660O(this.f2298O.getSelectedItemPosition());
            if (mo922a || (viewTreeObserver = this.f2298O.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b(this);
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            m1655J(new c(this, bVar));
        }

        @Override // androidx.appcompat.widget.C0363w0, androidx.appcompat.widget.C0359v.g
        /* renamed from: m */
        public void mo1636m(ListAdapter listAdapter) {
            super.mo1636m(listAdapter);
            this.f2295L = listAdapter;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/v$f.class
     */
    /* renamed from: androidx.appcompat.widget.v$f */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/v$f.class */
    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: b */
        public boolean f2304b;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/appcompat/widget/v$f$a.class
         */
        /* renamed from: androidx.appcompat.widget.v$f$a */
        /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/v$f$a.class */
        public class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        public f(Parcel parcel) {
            super(parcel);
            this.f2304b = parcel.readByte() != 0;
        }

        public f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f2304b ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/v$g.class
     */
    /* renamed from: androidx.appcompat.widget.v$g */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/v$g.class */
    public interface g {
        /* renamed from: a */
        boolean mo1625a();

        /* renamed from: b */
        void mo1626b(Drawable drawable);

        /* renamed from: c */
        int mo1627c();

        void dismiss();

        /* renamed from: e */
        void mo1628e(int i10);

        /* renamed from: f */
        CharSequence mo1629f();

        /* renamed from: g */
        Drawable mo1630g();

        /* renamed from: h */
        void mo1631h(CharSequence charSequence);

        /* renamed from: i */
        void mo1632i(int i10);

        /* renamed from: j */
        void mo1633j(int i10);

        /* renamed from: k */
        void mo1634k(int i10, int i11);

        /* renamed from: l */
        int mo1635l();

        /* renamed from: m */
        void mo1636m(ListAdapter listAdapter);
    }

    public C0359v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0920a.f6101P);
    }

    public C0359v(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    public C0359v(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0359v(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0359v.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* renamed from: a */
    public int m1623a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int max2 = Math.max(0, max - (15 - (min - max)));
        View view = null;
        int i11 = 0;
        while (max2 < min) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            int i12 = i10;
            if (itemViewType != i10) {
                view = null;
                i12 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
            max2++;
            i10 = i12;
        }
        int i13 = i11;
        if (drawable != null) {
            drawable.getPadding(this.f2284i);
            Rect rect = this.f2284i;
            i13 = i11 + rect.left + rect.right;
        }
        return i13;
    }

    /* renamed from: b */
    public void m1624b() {
        this.f2282g.mo1634k(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0308e c0308e = this.f2277b;
        if (c0308e != null) {
            c0308e.m1317b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.f2282g;
        return gVar != null ? gVar.mo1627c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.f2282g;
        return gVar != null ? gVar.mo1635l() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2282g != null ? this.f2283h : super.getDropDownWidth();
    }

    public final g getInternalPopup() {
        return this.f2282g;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.f2282g;
        return gVar != null ? gVar.mo1630g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2278c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.f2282g;
        return gVar != null ? gVar.mo1629f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0308e c0308e = this.f2277b;
        return c0308e != null ? c0308e.m1318c() : null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0308e c0308e = this.f2277b;
        return c0308e != null ? c0308e.m1319d() : null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f2282g;
        if (gVar == null || !gVar.mo1625a()) {
            return;
        }
        this.f2282g.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f2282g == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m1623a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (!fVar.f2304b || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b(this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f2282g;
        fVar.f2304b = gVar != null && gVar.mo1625a();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0348r0 abstractViewOnTouchListenerC0348r0 = this.f2279d;
        if (abstractViewOnTouchListenerC0348r0 == null || !abstractViewOnTouchListenerC0348r0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.f2282g;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.mo1625a()) {
            return true;
        }
        m1624b();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2281f) {
            this.f2280e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f2282g != null) {
            Context context = this.f2278c;
            Context context2 = context;
            if (context == null) {
                context2 = getContext();
            }
            this.f2282g.mo1636m(new d(spinnerAdapter, context2.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0308e c0308e = this.f2277b;
        if (c0308e != null) {
            c0308e.m1321f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0308e c0308e = this.f2277b;
        if (c0308e != null) {
            c0308e.m1322g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        g gVar = this.f2282g;
        if (gVar == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            gVar.mo1633j(i10);
            this.f2282g.mo1628e(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        g gVar = this.f2282g;
        if (gVar != null) {
            gVar.mo1632i(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f2282g != null) {
            this.f2283h = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f2282g;
        if (gVar != null) {
            gVar.mo1626b(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(C4561b.m22999d(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f2282g;
        if (gVar != null) {
            gVar.mo1631h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0308e c0308e = this.f2277b;
        if (c0308e != null) {
            c0308e.m1324i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0308e c0308e = this.f2277b;
        if (c0308e != null) {
            c0308e.m1325j(mode);
        }
    }
}
