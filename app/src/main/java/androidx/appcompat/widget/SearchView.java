package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p029c.C0920a;
import p029c.C0923d;
import p029c.C0925f;
import p029c.C0926g;
import p029c.C0927h;
import p029c.C0929j;
import p137i.InterfaceC5135c;
import p235o0.C6824g0;
import p326t0.AbstractC8590a;
import p341u0.AbstractC8783a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/SearchView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/SearchView.class */
public class SearchView extends C0351s0 implements InterfaceC5135c {

    /* renamed from: w0 */
    public static final C0284n f1786w0;

    /* renamed from: A */
    public Rect f1787A;

    /* renamed from: B */
    public Rect f1788B;

    /* renamed from: C */
    public int[] f1789C;

    /* renamed from: D */
    public int[] f1790D;

    /* renamed from: E */
    public final ImageView f1791E;

    /* renamed from: F */
    public final Drawable f1792F;

    /* renamed from: G */
    public final int f1793G;

    /* renamed from: H */
    public final int f1794H;

    /* renamed from: I */
    public final Intent f1795I;

    /* renamed from: J */
    public final Intent f1796J;

    /* renamed from: K */
    public final CharSequence f1797K;

    /* renamed from: L */
    public InterfaceC0282l f1798L;

    /* renamed from: M */
    public InterfaceC0281k f1799M;

    /* renamed from: N */
    public View.OnFocusChangeListener f1800N;

    /* renamed from: O */
    public InterfaceC0283m f1801O;

    /* renamed from: P */
    public View.OnClickListener f1802P;

    /* renamed from: Q */
    public boolean f1803Q;

    /* renamed from: R */
    public boolean f1804R;

    /* renamed from: S */
    public AbstractC8590a f1805S;

    /* renamed from: T */
    public boolean f1806T;

    /* renamed from: U */
    public CharSequence f1807U;

    /* renamed from: V */
    public boolean f1808V;

    /* renamed from: W */
    public boolean f1809W;

    /* renamed from: f0 */
    public int f1810f0;

    /* renamed from: g0 */
    public boolean f1811g0;

    /* renamed from: h0 */
    public CharSequence f1812h0;

    /* renamed from: i0 */
    public CharSequence f1813i0;

    /* renamed from: j0 */
    public boolean f1814j0;

    /* renamed from: k0 */
    public int f1815k0;

    /* renamed from: l0 */
    public SearchableInfo f1816l0;

    /* renamed from: m0 */
    public Bundle f1817m0;

    /* renamed from: n0 */
    public final Runnable f1818n0;

    /* renamed from: o0 */
    public Runnable f1819o0;

    /* renamed from: p0 */
    public final WeakHashMap<String, Drawable.ConstantState> f1820p0;

    /* renamed from: q */
    public final SearchAutoComplete f1821q;

    /* renamed from: q0 */
    public final View.OnClickListener f1822q0;

    /* renamed from: r */
    public final View f1823r;

    /* renamed from: r0 */
    public View.OnKeyListener f1824r0;

    /* renamed from: s */
    public final View f1825s;

    /* renamed from: s0 */
    public final TextView.OnEditorActionListener f1826s0;

    /* renamed from: t */
    public final View f1827t;

    /* renamed from: t0 */
    public final AdapterView.OnItemClickListener f1828t0;

    /* renamed from: u */
    public final ImageView f1829u;

    /* renamed from: u0 */
    public final AdapterView.OnItemSelectedListener f1830u0;

    /* renamed from: v */
    public final ImageView f1831v;

    /* renamed from: v0 */
    public TextWatcher f1832v0;

    /* renamed from: w */
    public final ImageView f1833w;

    /* renamed from: x */
    public final ImageView f1834x;

    /* renamed from: y */
    public final View f1835y;

    /* renamed from: z */
    public C0286p f1836z;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/SearchView$SearchAutoComplete.class
     */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/SearchView$SearchAutoComplete.class */
    public static class SearchAutoComplete extends C0305d {

        /* renamed from: e */
        public int f1837e;

        /* renamed from: f */
        public SearchView f1838f;

        /* renamed from: g */
        public boolean f1839g;

        /* renamed from: h */
        public final Runnable f1840h;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/appcompat/widget/SearchView$SearchAutoComplete$a.class
         */
        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/SearchView$SearchAutoComplete$a.class */
        public class RunnableC0270a implements Runnable {

            /* renamed from: b */
            public final SearchAutoComplete f1841b;

            public RunnableC0270a(SearchAutoComplete searchAutoComplete) {
                this.f1841b = searchAutoComplete;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f1841b.m1161c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0920a.f6121p);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f1840h = new RunnableC0270a(this);
            this.f1837e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* renamed from: a */
        public void m1159a() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f1786w0.m1165c(this);
                return;
            }
            setInputMethodMode(1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        /* renamed from: b */
        public boolean m1160b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* renamed from: c */
        public void m1161c() {
            if (this.f1839g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1839g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1837e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C0305d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1839g) {
                removeCallbacks(this.f1840h);
                post(this.f1840h);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f1838f.m1145X();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState == null) {
                        return true;
                    }
                    keyDispatcherState.startTracking(keyEvent, this);
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1838f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f1838f.hasFocus() && getVisibility() == 0) {
                this.f1839g = true;
                if (SearchView.m1122K(getContext())) {
                    m1159a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f1839g = false;
                removeCallbacks(this.f1840h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1839g = true;
                    return;
                }
                this.f1839g = false;
                removeCallbacks(this.f1840h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1838f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f1837e = i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/SearchView$a.class
     */
    /* renamed from: androidx.appcompat.widget.SearchView$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/SearchView$a.class */
    public class C0271a implements TextWatcher {

        /* renamed from: b */
        public final SearchView f1842b;

        public C0271a(SearchView searchView) {
            this.f1842b = searchView;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            this.f1842b.m1144W(charSequence);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/SearchView$b.class
     */
    /* renamed from: androidx.appcompat.widget.SearchView$b */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/SearchView$b.class */
    public class RunnableC0272b implements Runnable {

        /* renamed from: b */
        public final SearchView f1843b;

        public RunnableC0272b(SearchView searchView) {
            this.f1843b = searchView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1843b.m1151d0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/SearchView$c.class
     */
    /* renamed from: androidx.appcompat.widget.SearchView$c */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/SearchView$c.class */
    public class RunnableC0273c implements Runnable {

        /* renamed from: b */
        public final SearchView f1844b;

        public RunnableC0273c(SearchView searchView) {
            this.f1844b = searchView;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC8590a abstractC8590a = this.f1844b.f1805S;
            if (abstractC8590a instanceof ViewOnClickListenerC0319h1) {
                abstractC8590a.mo1417a(null);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/SearchView$d.class
     */
    /* renamed from: androidx.appcompat.widget.SearchView$d */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/SearchView$d.class */
    public class ViewOnFocusChangeListenerC0274d implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final SearchView f1845b;

        public ViewOnFocusChangeListenerC0274d(SearchView searchView) {
            this.f1845b = searchView;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = this.f1845b;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1800N;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/SearchView$e.class
     */
    /* renamed from: androidx.appcompat.widget.SearchView$e */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/SearchView$e.class */
    public class ViewOnLayoutChangeListenerC0275e implements View.OnLayoutChangeListener {

        /* renamed from: b */
        public final SearchView f1846b;

        public ViewOnLayoutChangeListenerC0275e(SearchView searchView) {
            this.f1846b = searchView;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f1846b.m1158z();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/SearchView$f.class
     */
    /* renamed from: androidx.appcompat.widget.SearchView$f */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/SearchView$f.class */
    public class ViewOnClickListenerC0276f implements View.OnClickListener {

        /* renamed from: b */
        public final SearchView f1847b;

        public ViewOnClickListenerC0276f(SearchView searchView) {
            this.f1847b = searchView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = this.f1847b;
            if (view == searchView.f1829u) {
                searchView.m1141T();
                return;
            }
            if (view == searchView.f1833w) {
                searchView.m1137P();
                return;
            }
            if (view == searchView.f1831v) {
                searchView.m1142U();
            } else if (view == searchView.f1834x) {
                searchView.m1146Y();
            } else if (view == searchView.f1821q) {
                searchView.m1128F();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/SearchView$g.class
     */
    /* renamed from: androidx.appcompat.widget.SearchView$g */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/SearchView$g.class */
    public class ViewOnKeyListenerC0277g implements View.OnKeyListener {

        /* renamed from: b */
        public final SearchView f1848b;

        public ViewOnKeyListenerC0277g(SearchView searchView) {
            this.f1848b = searchView;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = this.f1848b;
            if (searchView.f1816l0 == null) {
                return false;
            }
            if (searchView.f1821q.isPopupShowing() && this.f1848b.f1821q.getListSelection() != -1) {
                return this.f1848b.m1143V(view, i10, keyEvent);
            }
            if (this.f1848b.f1821q.m1160b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = this.f1848b;
            searchView2.m1135N(0, null, searchView2.f1821q.getText().toString());
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/SearchView$h.class
     */
    /* renamed from: androidx.appcompat.widget.SearchView$h */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/SearchView$h.class */
    public class C0278h implements TextView.OnEditorActionListener {

        /* renamed from: a */
        public final SearchView f1849a;

        public C0278h(SearchView searchView) {
            this.f1849a = searchView;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            this.f1849a.m1142U();
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/SearchView$i.class
     */
    /* renamed from: androidx.appcompat.widget.SearchView$i */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/SearchView$i.class */
    public class C0279i implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final SearchView f1850b;

        public C0279i(SearchView searchView) {
            this.f1850b = searchView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            this.f1850b.m1138Q(i10, 0, null);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/SearchView$j.class
     */
    /* renamed from: androidx.appcompat.widget.SearchView$j */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/SearchView$j.class */
    public class C0280j implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        public final SearchView f1851b;

        public C0280j(SearchView searchView) {
            this.f1851b = searchView;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            this.f1851b.m1139R(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/SearchView$k.class
     */
    /* renamed from: androidx.appcompat.widget.SearchView$k */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/SearchView$k.class */
    public interface InterfaceC0281k {
        boolean onClose();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/SearchView$l.class
     */
    /* renamed from: androidx.appcompat.widget.SearchView$l */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/SearchView$l.class */
    public interface InterfaceC0282l {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/SearchView$m.class
     */
    /* renamed from: androidx.appcompat.widget.SearchView$m */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/SearchView$m.class */
    public interface InterfaceC0283m {
        boolean onSuggestionClick(int i10);

        boolean onSuggestionSelect(int i10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/SearchView$n.class
     */
    /* renamed from: androidx.appcompat.widget.SearchView$n */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/SearchView$n.class */
    public static class C0284n {

        /* renamed from: a */
        public Method f1852a;

        /* renamed from: b */
        public Method f1853b;

        /* renamed from: c */
        public Method f1854c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public C0284n() {
            this.f1852a = null;
            this.f1853b = null;
            this.f1854c = null;
            m1162d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1852a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1853b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException e11) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1854c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException e12) {
            }
        }

        /* renamed from: d */
        public static void m1162d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* renamed from: a */
        public void m1163a(AutoCompleteTextView autoCompleteTextView) {
            m1162d();
            Method method = this.f1853b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception e10) {
                }
            }
        }

        /* renamed from: b */
        public void m1164b(AutoCompleteTextView autoCompleteTextView) {
            m1162d();
            Method method = this.f1852a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception e10) {
                }
            }
        }

        /* renamed from: c */
        public void m1165c(AutoCompleteTextView autoCompleteTextView) {
            m1162d();
            Method method = this.f1854c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception e10) {
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/SearchView$o.class
     */
    /* renamed from: androidx.appcompat.widget.SearchView$o */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/SearchView$o.class */
    public static class C0285o extends AbstractC8783a {
        public static final Parcelable.Creator<C0285o> CREATOR = new a();

        /* renamed from: d */
        public boolean f1855d;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/appcompat/widget/SearchView$o$a.class
         */
        /* renamed from: androidx.appcompat.widget.SearchView$o$a */
        /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/SearchView$o$a.class */
        public class a implements Parcelable.ClassLoaderCreator<C0285o> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0285o createFromParcel(Parcel parcel) {
                return new C0285o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0285o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0285o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C0285o[] newArray(int i10) {
                return new C0285o[i10];
            }
        }

        public C0285o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1855d = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public C0285o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1855d + "}";
        }

        @Override // p341u0.AbstractC8783a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f1855d));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/SearchView$p.class
     */
    /* renamed from: androidx.appcompat.widget.SearchView$p */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/SearchView$p.class */
    public static class C0286p extends TouchDelegate {

        /* renamed from: a */
        public final View f1856a;

        /* renamed from: b */
        public final Rect f1857b;

        /* renamed from: c */
        public final Rect f1858c;

        /* renamed from: d */
        public final Rect f1859d;

        /* renamed from: e */
        public final int f1860e;

        /* renamed from: f */
        public boolean f1861f;

        public C0286p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1860e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1857b = new Rect();
            this.f1859d = new Rect();
            this.f1858c = new Rect();
            m1169a(rect, rect2);
            this.f1856a = view;
        }

        /* renamed from: a */
        public void m1169a(Rect rect, Rect rect2) {
            this.f1857b.set(rect);
            this.f1859d.set(rect);
            Rect rect3 = this.f1859d;
            int i10 = this.f1860e;
            rect3.inset(-i10, -i10);
            this.f1858c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            float f10;
            int i10;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z11 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    boolean z12 = this.f1861f;
                    z11 = z12;
                    if (z12) {
                        z11 = z12;
                        if (!this.f1859d.contains(x10, y10)) {
                            z11 = z12;
                            z10 = false;
                        }
                    }
                } else {
                    if (action == 3) {
                        z11 = this.f1861f;
                        this.f1861f = false;
                    }
                    z10 = true;
                    z11 = false;
                }
                z10 = true;
            } else {
                if (this.f1857b.contains(x10, y10)) {
                    this.f1861f = true;
                    z10 = true;
                }
                z10 = true;
                z11 = false;
            }
            boolean z13 = false;
            if (z11) {
                if (!z10 || this.f1858c.contains(x10, y10)) {
                    Rect rect = this.f1858c;
                    f10 = x10 - rect.left;
                    i10 = y10 - rect.top;
                } else {
                    f10 = this.f1856a.getWidth() / 2;
                    i10 = this.f1856a.getHeight() / 2;
                }
                motionEvent.setLocation(f10, i10);
                z13 = this.f1856a.dispatchTouchEvent(motionEvent);
            }
            return z13;
        }
    }

    static {
        f1786w0 = Build.VERSION.SDK_INT < 29 ? new C0284n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0920a.f6098M);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1787A = new Rect();
        this.f1788B = new Rect();
        this.f1789C = new int[2];
        this.f1790D = new int[2];
        this.f1818n0 = new RunnableC0272b(this);
        this.f1819o0 = new RunnableC0273c(this);
        this.f1820p0 = new WeakHashMap<>();
        ViewOnClickListenerC0276f viewOnClickListenerC0276f = new ViewOnClickListenerC0276f(this);
        this.f1822q0 = viewOnClickListenerC0276f;
        this.f1824r0 = new ViewOnKeyListenerC0277g(this);
        C0278h c0278h = new C0278h(this);
        this.f1826s0 = c0278h;
        C0279i c0279i = new C0279i(this);
        this.f1828t0 = c0279i;
        C0280j c0280j = new C0280j(this);
        this.f1830u0 = c0280j;
        this.f1832v0 = new C0271a(this);
        C0337n1 m1505v = C0337n1.m1505v(context, attributeSet, C0929j.f6502q2, i10, 0);
        LayoutInflater.from(context).inflate(m1505v.m1519n(C0929j.f6285A2, C0926g.f6260r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C0925f.f6204D);
        this.f1821q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1823r = findViewById(C0925f.f6242z);
        View findViewById = findViewById(C0925f.f6203C);
        this.f1825s = findViewById;
        View findViewById2 = findViewById(C0925f.f6210J);
        this.f1827t = findViewById2;
        ImageView imageView = (ImageView) findViewById(C0925f.f6240x);
        this.f1829u = imageView;
        ImageView imageView2 = (ImageView) findViewById(C0925f.f6201A);
        this.f1831v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C0925f.f6241y);
        this.f1833w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C0925f.f6205E);
        this.f1834x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C0925f.f6202B);
        this.f1791E = imageView5;
        C6824g0.m31545s0(findViewById, m1505v.m1512g(C0929j.f6290B2));
        C6824g0.m31545s0(findViewById2, m1505v.m1512g(C0929j.f6310F2));
        int i11 = C0929j.f6305E2;
        imageView.setImageDrawable(m1505v.m1512g(i11));
        imageView2.setImageDrawable(m1505v.m1512g(C0929j.f6542y2));
        imageView3.setImageDrawable(m1505v.m1512g(C0929j.f6527v2));
        imageView4.setImageDrawable(m1505v.m1512g(C0929j.f6320H2));
        imageView5.setImageDrawable(m1505v.m1512g(i11));
        this.f1792F = m1505v.m1512g(C0929j.f6300D2);
        C0346q1.m1563a(imageView, getResources().getString(C0927h.f6276n));
        this.f1793G = m1505v.m1519n(C0929j.f6315G2, C0926g.f6259q);
        this.f1794H = m1505v.m1519n(C0929j.f6532w2, 0);
        imageView.setOnClickListener(viewOnClickListenerC0276f);
        imageView3.setOnClickListener(viewOnClickListenerC0276f);
        imageView2.setOnClickListener(viewOnClickListenerC0276f);
        imageView4.setOnClickListener(viewOnClickListenerC0276f);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC0276f);
        searchAutoComplete.addTextChangedListener(this.f1832v0);
        searchAutoComplete.setOnEditorActionListener(c0278h);
        searchAutoComplete.setOnItemClickListener(c0279i);
        searchAutoComplete.setOnItemSelectedListener(c0280j);
        searchAutoComplete.setOnKeyListener(this.f1824r0);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0274d(this));
        setIconifiedByDefault(m1505v.m1506a(C0929j.f6547z2, true));
        int m1511f = m1505v.m1511f(C0929j.f6512s2, -1);
        if (m1511f != -1) {
            setMaxWidth(m1511f);
        }
        this.f1797K = m1505v.m1521p(C0929j.f6537x2);
        this.f1807U = m1505v.m1521p(C0929j.f6295C2);
        int m1516k = m1505v.m1516k(C0929j.f6522u2, -1);
        if (m1516k != -1) {
            setImeOptions(m1516k);
        }
        int m1516k2 = m1505v.m1516k(C0929j.f6517t2, -1);
        if (m1516k2 != -1) {
            setInputType(m1516k2);
        }
        setFocusable(m1505v.m1506a(C0929j.f6507r2, true));
        m1505v.m1525w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1795I = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1796J = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1835y = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0275e(this));
        }
        m1156i0(this.f1803Q);
        m1152e0();
    }

    /* renamed from: K */
    public static boolean m1122K(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0923d.f6147g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0923d.f6148h);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1821q.setText(charSequence);
        this.f1821q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: A */
    public final Intent m1123A(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1813i0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1817m0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1816l0.getSearchActivity());
        return intent;
    }

    /* renamed from: B */
    public final Intent m1124B(Cursor cursor, int i10, String str) {
        int i11;
        try {
            String m1414n = ViewOnClickListenerC0319h1.m1414n(cursor, "suggest_intent_action");
            String str2 = m1414n;
            if (m1414n == null) {
                str2 = this.f1816l0.getSuggestIntentAction();
            }
            String str3 = str2;
            if (str2 == null) {
                str3 = "android.intent.action.SEARCH";
            }
            String m1414n2 = ViewOnClickListenerC0319h1.m1414n(cursor, "suggest_intent_data");
            String str4 = m1414n2;
            if (m1414n2 == null) {
                str4 = this.f1816l0.getSuggestIntentData();
            }
            String str5 = str4;
            if (str4 != null) {
                String m1414n3 = ViewOnClickListenerC0319h1.m1414n(cursor, "suggest_intent_data_id");
                str5 = str4;
                if (m1414n3 != null) {
                    str5 = str4 + "/" + Uri.encode(m1414n3);
                }
            }
            return m1123A(str3, str5 == null ? null : Uri.parse(str5), ViewOnClickListenerC0319h1.m1414n(cursor, "suggest_intent_extra_data"), ViewOnClickListenerC0319h1.m1414n(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                i11 = cursor.getPosition();
            } catch (RuntimeException e11) {
                i11 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            return null;
        }
    }

    /* renamed from: C */
    public final Intent m1125C(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1817m0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i10 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i10 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i10);
        intent3.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: D */
    public final Intent m1126D(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: E */
    public final void m1127E() {
        this.f1821q.dismissDropDown();
    }

    /* renamed from: F */
    public void m1128F() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1821q.refreshAutoCompleteResults();
            return;
        }
        C0284n c0284n = f1786w0;
        c0284n.m1164b(this.f1821q);
        c0284n.m1163a(this.f1821q);
    }

    /* renamed from: G */
    public final void m1129G(View view, Rect rect) {
        view.getLocationInWindow(this.f1789C);
        getLocationInWindow(this.f1790D);
        int[] iArr = this.f1789C;
        int i10 = iArr[1];
        int[] iArr2 = this.f1790D;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    /* renamed from: H */
    public final CharSequence m1130H(CharSequence charSequence) {
        if (!this.f1803Q || this.f1792F == null) {
            return charSequence;
        }
        int textSize = (int) (this.f1821q.getTextSize() * 1.25d);
        this.f1792F.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f1792F), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: I */
    public final boolean m1131I() {
        SearchableInfo searchableInfo = this.f1816l0;
        boolean z10 = false;
        if (searchableInfo != null) {
            z10 = false;
            if (searchableInfo.getVoiceSearchEnabled()) {
                Intent intent = null;
                if (this.f1816l0.getVoiceSearchLaunchWebSearch()) {
                    intent = this.f1795I;
                } else if (this.f1816l0.getVoiceSearchLaunchRecognizer()) {
                    intent = this.f1796J;
                }
                z10 = false;
                if (intent != null) {
                    z10 = false;
                    if (getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                        z10 = true;
                    }
                }
            }
        }
        return z10;
    }

    /* renamed from: J */
    public boolean m1132J() {
        return this.f1804R;
    }

    /* renamed from: L */
    public final boolean m1133L() {
        return (this.f1806T || this.f1811g0) && !m1132J();
    }

    /* renamed from: M */
    public final void m1134M(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e("SearchView", "Failed launch activity: " + intent, e10);
        }
    }

    /* renamed from: N */
    public void m1135N(int i10, String str, String str2) {
        getContext().startActivity(m1123A("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    /* renamed from: O */
    public final boolean m1136O(int i10, int i11, String str) {
        Cursor mo36885c = this.f1805S.mo36885c();
        if (mo36885c == null || !mo36885c.moveToPosition(i10)) {
            return false;
        }
        m1134M(m1124B(mo36885c, i11, str));
        return true;
    }

    /* renamed from: P */
    public void m1137P() {
        if (!TextUtils.isEmpty(this.f1821q.getText())) {
            this.f1821q.setText("");
            this.f1821q.requestFocus();
            this.f1821q.setImeVisibility(true);
        } else if (this.f1803Q) {
            InterfaceC0281k interfaceC0281k = this.f1799M;
            if (interfaceC0281k == null || !interfaceC0281k.onClose()) {
                clearFocus();
                m1156i0(true);
            }
        }
    }

    /* renamed from: Q */
    public boolean m1138Q(int i10, int i11, String str) {
        InterfaceC0283m interfaceC0283m = this.f1801O;
        if (interfaceC0283m != null && interfaceC0283m.onSuggestionClick(i10)) {
            return false;
        }
        m1136O(i10, 0, null);
        this.f1821q.setImeVisibility(false);
        m1127E();
        return true;
    }

    /* renamed from: R */
    public boolean m1139R(int i10) {
        InterfaceC0283m interfaceC0283m = this.f1801O;
        if (interfaceC0283m != null && interfaceC0283m.onSuggestionSelect(i10)) {
            return false;
        }
        m1148a0(i10);
        return true;
    }

    /* renamed from: S */
    public void m1140S(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: T */
    public void m1141T() {
        m1156i0(false);
        this.f1821q.requestFocus();
        this.f1821q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1802P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: U */
    public void m1142U() {
        Editable text = this.f1821q.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        InterfaceC0282l interfaceC0282l = this.f1798L;
        if (interfaceC0282l == null || !interfaceC0282l.onQueryTextSubmit(text.toString())) {
            if (this.f1816l0 != null) {
                m1135N(0, null, text.toString());
            }
            this.f1821q.setImeVisibility(false);
            m1127E();
        }
    }

    /* renamed from: V */
    public boolean m1143V(View view, int i10, KeyEvent keyEvent) {
        if (this.f1816l0 == null || this.f1805S == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
            return false;
        }
        if (i10 == 66 || i10 == 84 || i10 == 61) {
            return m1138Q(this.f1821q.getListSelection(), 0, null);
        }
        if (i10 != 21 && i10 != 22) {
            if (i10 != 19) {
                return false;
            }
            this.f1821q.getListSelection();
            return false;
        }
        this.f1821q.setSelection(i10 == 21 ? 0 : this.f1821q.length());
        this.f1821q.setListSelection(0);
        this.f1821q.clearListSelection();
        this.f1821q.m1159a();
        return true;
    }

    /* renamed from: W */
    public void m1144W(CharSequence charSequence) {
        Editable text = this.f1821q.getText();
        this.f1813i0 = text;
        boolean z10 = !TextUtils.isEmpty(text);
        m1155h0(z10);
        m1157j0(!z10);
        m1150c0();
        m1154g0();
        if (this.f1798L != null && !TextUtils.equals(charSequence, this.f1812h0)) {
            this.f1798L.onQueryTextChange(charSequence.toString());
        }
        this.f1812h0 = charSequence.toString();
    }

    /* renamed from: X */
    public void m1145X() {
        m1156i0(m1132J());
        m1147Z();
        if (this.f1821q.hasFocus()) {
            m1128F();
        }
    }

    /* renamed from: Y */
    public void m1146Y() {
        Intent m1125C;
        SearchableInfo searchableInfo = this.f1816l0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                m1125C = m1126D(this.f1795I, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                m1125C = m1125C(this.f1796J, searchableInfo);
            }
            getContext().startActivity(m1125C);
        } catch (ActivityNotFoundException e10) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    /* renamed from: Z */
    public final void m1147Z() {
        post(this.f1818n0);
    }

    /* renamed from: a0 */
    public final void m1148a0(int i10) {
        CharSequence convertToString;
        Editable text = this.f1821q.getText();
        Cursor mo36885c = this.f1805S.mo36885c();
        if (mo36885c == null) {
            return;
        }
        if (!mo36885c.moveToPosition(i10) || (convertToString = this.f1805S.convertToString(mo36885c)) == null) {
            setQuery(text);
        } else {
            setQuery(convertToString);
        }
    }

    /* renamed from: b0 */
    public void m1149b0(CharSequence charSequence, boolean z10) {
        this.f1821q.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1821q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1813i0 = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        m1142U();
    }

    /* renamed from: c0 */
    public final void m1150c0() {
        boolean z10 = !TextUtils.isEmpty(this.f1821q.getText());
        boolean z11 = true;
        if (!z10) {
            z11 = this.f1803Q && !this.f1814j0;
        }
        this.f1833w.setVisibility(z11 ? 0 : 8);
        Drawable drawable = this.f1833w.getDrawable();
        if (drawable != null) {
            drawable.setState(z10 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f1809W = true;
        super.clearFocus();
        this.f1821q.clearFocus();
        this.f1821q.setImeVisibility(false);
        this.f1809W = false;
    }

    /* renamed from: d0 */
    public void m1151d0() {
        int[] iArr = this.f1821q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1825s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1827t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* renamed from: e0 */
    public final void m1152e0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1821q;
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        searchAutoComplete.setHint(m1130H(charSequence));
    }

    /* renamed from: f0 */
    public final void m1153f0() {
        this.f1821q.setThreshold(this.f1816l0.getSuggestThreshold());
        this.f1821q.setImeOptions(this.f1816l0.getImeOptions());
        int inputType = this.f1816l0.getInputType();
        int i10 = inputType;
        if ((inputType & 15) == 1) {
            int i11 = inputType & (-65537);
            i10 = i11;
            if (this.f1816l0.getSuggestAuthority() != null) {
                i10 = i11 | 65536 | NTLMEngineImpl.FLAG_REQUEST_NTLM2_SESSION;
            }
        }
        this.f1821q.setInputType(i10);
        AbstractC8590a abstractC8590a = this.f1805S;
        if (abstractC8590a != null) {
            abstractC8590a.mo1417a(null);
        }
        if (this.f1816l0.getSuggestAuthority() != null) {
            ViewOnClickListenerC0319h1 viewOnClickListenerC0319h1 = new ViewOnClickListenerC0319h1(getContext(), this, this.f1816l0, this.f1820p0);
            this.f1805S = viewOnClickListenerC0319h1;
            this.f1821q.setAdapter(viewOnClickListenerC0319h1);
            ViewOnClickListenerC0319h1 viewOnClickListenerC0319h12 = (ViewOnClickListenerC0319h1) this.f1805S;
            int i12 = 1;
            if (this.f1808V) {
                i12 = 2;
            }
            viewOnClickListenerC0319h12.m1432w(i12);
        }
    }

    /* renamed from: g0 */
    public final void m1154g0() {
        this.f1827t.setVisibility((m1133L() && (this.f1831v.getVisibility() == 0 || this.f1834x.getVisibility() == 0)) ? 0 : 8);
    }

    public int getImeOptions() {
        return this.f1821q.getImeOptions();
    }

    public int getInputType() {
        return this.f1821q.getInputType();
    }

    public int getMaxWidth() {
        return this.f1810f0;
    }

    public CharSequence getQuery() {
        return this.f1821q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1807U;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.f1816l0;
            charSequence = (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1797K : getContext().getText(this.f1816l0.getHintId());
        }
        return charSequence;
    }

    public int getSuggestionCommitIconResId() {
        return this.f1794H;
    }

    public int getSuggestionRowLayout() {
        return this.f1793G;
    }

    public AbstractC8590a getSuggestionsAdapter() {
        return this.f1805S;
    }

    /* renamed from: h0 */
    public final void m1155h0(boolean z10) {
        this.f1831v.setVisibility((this.f1806T && m1133L() && hasFocus() && (z10 || !this.f1811g0)) ? 0 : 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
    
        if (r4.f1803Q != false) goto L14;
     */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1156i0(boolean r5) {
        /*
            r4 = this;
            r0 = r4
            r1 = r5
            r0.f1804R = r1
            r0 = 0
            r7 = r0
            r0 = r5
            if (r0 == 0) goto L10
            r0 = 0
            r6 = r0
            goto L13
        L10:
            r0 = 8
            r6 = r0
        L13:
            r0 = r4
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.f1821q
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            r0 = r0 ^ r1
            r8 = r0
            r0 = r4
            android.widget.ImageView r0 = r0.f1829u
            r1 = r6
            r0.setVisibility(r1)
            r0 = r4
            r1 = r8
            r0.m1155h0(r1)
            r0 = r4
            android.view.View r0 = r0.f1823r
            r9 = r0
            r0 = r5
            if (r0 == 0) goto L3f
            r0 = 8
            r6 = r0
            goto L41
        L3f:
            r0 = 0
            r6 = r0
        L41:
            r0 = r9
            r1 = r6
            r0.setVisibility(r1)
            r0 = r4
            android.widget.ImageView r0 = r0.f1791E
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L5a
            r0 = r7
            r6 = r0
            r0 = r4
            boolean r0 = r0.f1803Q
            if (r0 == 0) goto L5d
        L5a:
            r0 = 8
            r6 = r0
        L5d:
            r0 = r4
            android.widget.ImageView r0 = r0.f1791E
            r1 = r6
            r0.setVisibility(r1)
            r0 = r4
            r0.m1150c0()
            r0 = r4
            r1 = r8
            r2 = 1
            r1 = r1 ^ r2
            r0.m1157j0(r1)
            r0 = r4
            r0.m1154g0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.m1156i0(boolean):void");
    }

    /* renamed from: j0 */
    public final void m1157j0(boolean z10) {
        int i10 = 8;
        if (this.f1811g0) {
            i10 = 8;
            if (!m1132J()) {
                i10 = 8;
                if (z10) {
                    this.f1831v.setVisibility(8);
                    i10 = 0;
                }
            }
        }
        this.f1834x.setVisibility(i10);
    }

    @Override // p137i.InterfaceC5135c
    public void onActionViewCollapsed() {
        m1149b0("", false);
        clearFocus();
        m1156i0(true);
        this.f1821q.setImeOptions(this.f1815k0);
        this.f1814j0 = false;
    }

    @Override // p137i.InterfaceC5135c
    public void onActionViewExpanded() {
        if (this.f1814j0) {
            return;
        }
        this.f1814j0 = true;
        int imeOptions = this.f1821q.getImeOptions();
        this.f1815k0 = imeOptions;
        this.f1821q.setImeOptions(imeOptions | NTLMEngineImpl.FLAG_REQUEST_VERSION);
        this.f1821q.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1818n0);
        post(this.f1819o0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.C0351s0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            m1129G(this.f1821q, this.f1787A);
            Rect rect = this.f1788B;
            Rect rect2 = this.f1787A;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            C0286p c0286p = this.f1836z;
            if (c0286p != null) {
                c0286p.m1169a(this.f1788B, this.f1787A);
                return;
            }
            C0286p c0286p2 = new C0286p(this.f1788B, this.f1787A, this.f1821q);
            this.f1836z = c0286p2;
            setTouchDelegate(c0286p2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    @Override // androidx.appcompat.widget.C0351s0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            r0 = r5
            boolean r0 = r0.m1132J()
            if (r0 == 0) goto Le
            r0 = r5
            r1 = r6
            r2 = r7
            super.onMeasure(r1, r2)
            return
        Le:
            r0 = r6
            int r0 = android.view.View.MeasureSpec.getMode(r0)
            r9 = r0
            r0 = r6
            int r0 = android.view.View.MeasureSpec.getSize(r0)
            r8 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L5a
            r0 = r9
            if (r0 == 0) goto L46
            r0 = r9
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L33
            r0 = r8
            r6 = r0
            goto L71
        L33:
            r0 = r5
            int r0 = r0.f1810f0
            r9 = r0
            r0 = r8
            r6 = r0
            r0 = r9
            if (r0 <= 0) goto L71
            r0 = r9
            r6 = r0
            goto L63
        L46:
            r0 = r5
            int r0 = r0.f1810f0
            r6 = r0
            r0 = r6
            if (r0 <= 0) goto L52
            goto L71
        L52:
            r0 = r5
            int r0 = r0.getPreferredWidth()
            r6 = r0
            goto L71
        L5a:
            r0 = r5
            int r0 = r0.f1810f0
            r6 = r0
            r0 = r6
            if (r0 <= 0) goto L66
        L63:
            goto L6b
        L66:
            r0 = r5
            int r0 = r0.getPreferredWidth()
            r6 = r0
        L6b:
            r0 = r6
            r1 = r8
            int r0 = java.lang.Math.min(r0, r1)
            r6 = r0
        L71:
            r0 = r7
            int r0 = android.view.View.MeasureSpec.getMode(r0)
            r8 = r0
            r0 = r7
            int r0 = android.view.View.MeasureSpec.getSize(r0)
            r7 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L91
            r0 = r8
            if (r0 == 0) goto L89
            goto L9a
        L89:
            r0 = r5
            int r0 = r0.getPreferredHeight()
            r7 = r0
            goto L9a
        L91:
            r0 = r5
            int r0 = r0.getPreferredHeight()
            r1 = r7
            int r0 = java.lang.Math.min(r0, r1)
            r7 = r0
        L9a:
            r0 = r5
            r1 = r6
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
            r2 = r7
            r3 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
            super.onMeasure(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0285o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0285o c0285o = (C0285o) parcelable;
        super.onRestoreInstanceState(c0285o.m37586b());
        m1156i0(c0285o.f1855d);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0285o c0285o = new C0285o(super.onSaveInstanceState());
        c0285o.f1855d = m1132J();
        return c0285o;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m1147Z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.f1809W || !isFocusable()) {
            return false;
        }
        if (m1132J()) {
            return super.requestFocus(i10, rect);
        }
        boolean requestFocus = this.f1821q.requestFocus(i10, rect);
        if (requestFocus) {
            m1156i0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1817m0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            m1137P();
        } else {
            m1141T();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f1803Q == z10) {
            return;
        }
        this.f1803Q = z10;
        m1156i0(z10);
        m1152e0();
    }

    public void setImeOptions(int i10) {
        this.f1821q.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f1821q.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f1810f0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0281k interfaceC0281k) {
        this.f1799M = interfaceC0281k;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1800N = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0282l interfaceC0282l) {
        this.f1798L = interfaceC0282l;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1802P = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0283m interfaceC0283m) {
        this.f1801O = interfaceC0283m;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1807U = charSequence;
        m1152e0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f1808V = z10;
        AbstractC8590a abstractC8590a = this.f1805S;
        if (abstractC8590a instanceof ViewOnClickListenerC0319h1) {
            ((ViewOnClickListenerC0319h1) abstractC8590a).m1432w(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1816l0 = searchableInfo;
        if (searchableInfo != null) {
            m1153f0();
            m1152e0();
        }
        boolean m1131I = m1131I();
        this.f1811g0 = m1131I;
        if (m1131I) {
            this.f1821q.setPrivateImeOptions("nm");
        }
        m1156i0(m1132J());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f1806T = z10;
        m1156i0(m1132J());
    }

    public void setSuggestionsAdapter(AbstractC8590a abstractC8590a) {
        this.f1805S = abstractC8590a;
        this.f1821q.setAdapter(abstractC8590a);
    }

    /* renamed from: z */
    public void m1158z() {
        if (this.f1835y.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1825s.getPaddingLeft();
            Rect rect = new Rect();
            boolean m1621b = C0358u1.m1621b(this);
            int dimensionPixelSize = this.f1803Q ? resources.getDimensionPixelSize(C0923d.f6145e) + resources.getDimensionPixelSize(C0923d.f6146f) : 0;
            this.f1821q.getDropDownBackground().getPadding(rect);
            int i10 = rect.left;
            this.f1821q.setDropDownHorizontalOffset(m1621b ? -i10 : paddingLeft - (i10 + dimensionPixelSize));
            this.f1821q.setDropDownWidth((((this.f1835y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
