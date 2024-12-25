package androidx.leanback.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.leanback.widget.SearchEditText;
import androidx.leanback.widget.SearchOrbView;
import java.util.ArrayList;
import p413y0.C9789b;
import p413y0.C9790c;
import p413y0.C9793f;
import p413y0.C9794g;
import p413y0.C9795h;
import p413y0.C9796i;
import p413y0.C9797j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/SearchBar.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SearchBar.class */
public class SearchBar extends RelativeLayout {

    /* renamed from: D */
    public static final String f3284D = SearchBar.class.getSimpleName();

    /* renamed from: A */
    public final Context f3285A;

    /* renamed from: B */
    public AudioManager f3286B;

    /* renamed from: C */
    public InterfaceC0486l f3287C;

    /* renamed from: b */
    public InterfaceC0485k f3288b;

    /* renamed from: c */
    public SearchEditText f3289c;

    /* renamed from: d */
    public SpeechOrbView f3290d;

    /* renamed from: e */
    public ImageView f3291e;

    /* renamed from: f */
    public String f3292f;

    /* renamed from: g */
    public String f3293g;

    /* renamed from: h */
    public String f3294h;

    /* renamed from: i */
    public Drawable f3295i;

    /* renamed from: j */
    public final Handler f3296j;

    /* renamed from: k */
    public final InputMethodManager f3297k;

    /* renamed from: l */
    public boolean f3298l;

    /* renamed from: m */
    public Drawable f3299m;

    /* renamed from: n */
    public final int f3300n;

    /* renamed from: o */
    public final int f3301o;

    /* renamed from: p */
    public final int f3302p;

    /* renamed from: q */
    public final int f3303q;

    /* renamed from: r */
    public int f3304r;

    /* renamed from: s */
    public int f3305s;

    /* renamed from: t */
    public int f3306t;

    /* renamed from: u */
    public SpeechRecognizer f3307u;

    /* renamed from: v */
    public InterfaceC0551y0 f3308v;

    /* renamed from: w */
    public boolean f3309w;

    /* renamed from: x */
    public SoundPool f3310x;

    /* renamed from: y */
    public SparseIntArray f3311y;

    /* renamed from: z */
    public boolean f3312z;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/SearchBar$a.class
     */
    /* renamed from: androidx.leanback.widget.SearchBar$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SearchBar$a.class */
    public class RunnableC0475a implements Runnable {

        /* renamed from: b */
        public final int f3313b;

        /* renamed from: c */
        public final SearchBar f3314c;

        public RunnableC0475a(SearchBar searchBar, int i10) {
            this.f3314c = searchBar;
            this.f3313b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3314c.f3310x.play(this.f3314c.f3311y.get(this.f3313b), 1.0f, 1.0f, 1, 0, 1.0f);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/SearchBar$b.class
     */
    /* renamed from: androidx.leanback.widget.SearchBar$b */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SearchBar$b.class */
    public class ViewOnFocusChangeListenerC0476b implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final SearchBar f3315b;

        public ViewOnFocusChangeListenerC0476b(SearchBar searchBar) {
            this.f3315b = searchBar;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchBar searchBar = this.f3315b;
            if (z10) {
                searchBar.m2505h();
            } else {
                searchBar.m2498a();
            }
            this.f3315b.m2511n(z10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/SearchBar$c.class
     */
    /* renamed from: androidx.leanback.widget.SearchBar$c */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SearchBar$c.class */
    public class RunnableC0477c implements Runnable {

        /* renamed from: b */
        public final SearchBar f3316b;

        public RunnableC0477c(SearchBar searchBar) {
            this.f3316b = searchBar;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchBar searchBar = this.f3316b;
            searchBar.setSearchQueryInternal(searchBar.f3289c.getText().toString());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/SearchBar$d.class
     */
    /* renamed from: androidx.leanback.widget.SearchBar$d */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SearchBar$d.class */
    public class C0478d implements TextWatcher {

        /* renamed from: b */
        public final Runnable f3317b;

        /* renamed from: c */
        public final SearchBar f3318c;

        public C0478d(SearchBar searchBar, Runnable runnable) {
            this.f3318c = searchBar;
            this.f3317b = runnable;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchBar searchBar = this.f3318c;
            if (searchBar.f3312z) {
                return;
            }
            searchBar.f3296j.removeCallbacks(this.f3317b);
            this.f3318c.f3296j.post(this.f3317b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/SearchBar$e.class
     */
    /* renamed from: androidx.leanback.widget.SearchBar$e */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SearchBar$e.class */
    public class C0479e implements SearchEditText.InterfaceC0487a {

        /* renamed from: a */
        public final SearchBar f3319a;

        public C0479e(SearchBar searchBar) {
            this.f3319a = searchBar;
        }

        @Override // androidx.leanback.widget.SearchEditText.InterfaceC0487a
        /* renamed from: a */
        public void mo2512a() {
            SearchBar searchBar = this.f3319a;
            InterfaceC0485k interfaceC0485k = searchBar.f3288b;
            if (interfaceC0485k != null) {
                interfaceC0485k.mo2514b(searchBar.f3292f);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/SearchBar$f.class
     */
    /* renamed from: androidx.leanback.widget.SearchBar$f */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SearchBar$f.class */
    public class C0480f implements TextView.OnEditorActionListener {

        /* renamed from: a */
        public final SearchBar f3320a;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/leanback/widget/SearchBar$f$a.class
         */
        /* renamed from: androidx.leanback.widget.SearchBar$f$a */
        /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SearchBar$f$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final C0480f f3321b;

            public a(C0480f c0480f) {
                this.f3321b = c0480f;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f3321b.f3320a.m2508k();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/leanback/widget/SearchBar$f$b.class
         */
        /* renamed from: androidx.leanback.widget.SearchBar$f$b */
        /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SearchBar$f$b.class */
        public class b implements Runnable {

            /* renamed from: b */
            public final C0480f f3322b;

            public b(C0480f c0480f) {
                this.f3322b = c0480f;
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchBar searchBar = this.f3322b.f3320a;
                searchBar.f3288b.mo2514b(searchBar.f3292f);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/leanback/widget/SearchBar$f$c.class
         */
        /* renamed from: androidx.leanback.widget.SearchBar$f$c */
        /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SearchBar$f$c.class */
        public class c implements Runnable {

            /* renamed from: b */
            public final C0480f f3323b;

            public c(C0480f c0480f) {
                this.f3323b = c0480f;
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchBar searchBar = this.f3323b.f3320a;
                searchBar.f3298l = true;
                searchBar.f3290d.requestFocus();
            }
        }

        public C0480f(SearchBar searchBar) {
            this.f3320a = searchBar;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            Handler handler;
            Runnable aVar;
            boolean z10 = true;
            if (3 == i10 || i10 == 0) {
                SearchBar searchBar = this.f3320a;
                if (searchBar.f3288b != null) {
                    searchBar.m2498a();
                    handler = this.f3320a.f3296j;
                    aVar = new a(this);
                    handler.postDelayed(aVar, 500L);
                    return z10;
                }
            }
            if (1 == i10) {
                SearchBar searchBar2 = this.f3320a;
                if (searchBar2.f3288b != null) {
                    searchBar2.m2498a();
                    handler = this.f3320a.f3296j;
                    aVar = new b(this);
                    handler.postDelayed(aVar, 500L);
                    return z10;
                }
            }
            if (2 != i10) {
                z10 = false;
                return z10;
            }
            this.f3320a.m2498a();
            handler = this.f3320a.f3296j;
            aVar = new c(this);
            handler.postDelayed(aVar, 500L);
            return z10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/SearchBar$g.class
     */
    /* renamed from: androidx.leanback.widget.SearchBar$g */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SearchBar$g.class */
    public class ViewOnClickListenerC0481g implements View.OnClickListener {

        /* renamed from: b */
        public final SearchBar f3324b;

        public ViewOnClickListenerC0481g(SearchBar searchBar) {
            this.f3324b = searchBar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f3324b.m2509l();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/SearchBar$h.class
     */
    /* renamed from: androidx.leanback.widget.SearchBar$h */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SearchBar$h.class */
    public class ViewOnFocusChangeListenerC0482h implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final SearchBar f3325b;

        public ViewOnFocusChangeListenerC0482h(SearchBar searchBar) {
            this.f3325b = searchBar;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchBar searchBar = this.f3325b;
            if (z10) {
                searchBar.m2498a();
                SearchBar searchBar2 = this.f3325b;
                if (searchBar2.f3298l) {
                    searchBar2.m2506i();
                    this.f3325b.f3298l = false;
                }
            } else {
                searchBar.m2507j();
            }
            this.f3325b.m2511n(z10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/SearchBar$i.class
     */
    /* renamed from: androidx.leanback.widget.SearchBar$i */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SearchBar$i.class */
    public class RunnableC0483i implements Runnable {

        /* renamed from: b */
        public final SearchBar f3326b;

        public RunnableC0483i(SearchBar searchBar) {
            this.f3326b = searchBar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3326b.f3289c.requestFocusFromTouch();
            this.f3326b.f3289c.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, this.f3326b.f3289c.getWidth(), this.f3326b.f3289c.getHeight(), 0));
            this.f3326b.f3289c.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, this.f3326b.f3289c.getWidth(), this.f3326b.f3289c.getHeight(), 0));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/SearchBar$j.class
     */
    /* renamed from: androidx.leanback.widget.SearchBar$j */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SearchBar$j.class */
    public class C0484j implements RecognitionListener {

        /* renamed from: a */
        public final SearchBar f3327a;

        public C0484j(SearchBar searchBar) {
            this.f3327a = searchBar;
        }

        @Override // android.speech.RecognitionListener
        public void onBeginningOfSpeech() {
        }

        @Override // android.speech.RecognitionListener
        public void onBufferReceived(byte[] bArr) {
        }

        @Override // android.speech.RecognitionListener
        public void onEndOfSpeech() {
        }

        @Override // android.speech.RecognitionListener
        public void onError(int i10) {
            String str;
            String str2;
            switch (i10) {
                case 1:
                    str = SearchBar.f3284D;
                    str2 = "recognizer network timeout";
                    Log.w(str, str2);
                    break;
                case 2:
                    str = SearchBar.f3284D;
                    str2 = "recognizer network error";
                    Log.w(str, str2);
                    break;
                case 3:
                    str = SearchBar.f3284D;
                    str2 = "recognizer audio error";
                    Log.w(str, str2);
                    break;
                case 4:
                    str = SearchBar.f3284D;
                    str2 = "recognizer server error";
                    Log.w(str, str2);
                    break;
                case 5:
                    str = SearchBar.f3284D;
                    str2 = "recognizer client error";
                    Log.w(str, str2);
                    break;
                case 6:
                    str = SearchBar.f3284D;
                    str2 = "recognizer speech timeout";
                    Log.w(str, str2);
                    break;
                case 7:
                    str = SearchBar.f3284D;
                    str2 = "recognizer no match";
                    Log.w(str, str2);
                    break;
                case 8:
                    str = SearchBar.f3284D;
                    str2 = "recognizer busy";
                    Log.w(str, str2);
                    break;
                case 9:
                    str = SearchBar.f3284D;
                    str2 = "recognizer insufficient permissions";
                    Log.w(str, str2);
                    break;
                default:
                    Log.d(SearchBar.f3284D, "recognizer other error");
                    break;
            }
            this.f3327a.m2507j();
            this.f3327a.m2502e();
        }

        @Override // android.speech.RecognitionListener
        public void onEvent(int i10, Bundle bundle) {
        }

        @Override // android.speech.RecognitionListener
        public void onPartialResults(Bundle bundle) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
            if (stringArrayList == null || stringArrayList.size() == 0) {
                return;
            }
            this.f3327a.f3289c.mo2518g(stringArrayList.get(0), stringArrayList.size() > 1 ? stringArrayList.get(1) : null);
        }

        @Override // android.speech.RecognitionListener
        public void onReadyForSpeech(Bundle bundle) {
            this.f3327a.f3290d.m2526f();
            this.f3327a.m2503f();
        }

        @Override // android.speech.RecognitionListener
        public void onResults(Bundle bundle) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
            if (stringArrayList != null) {
                this.f3327a.f3292f = stringArrayList.get(0);
                SearchBar searchBar = this.f3327a;
                searchBar.f3289c.setText(searchBar.f3292f);
                this.f3327a.m2508k();
            }
            this.f3327a.m2507j();
            this.f3327a.m2504g();
        }

        @Override // android.speech.RecognitionListener
        public void onRmsChanged(float f10) {
            this.f3327a.f3290d.setSoundLevel(f10 < 0.0f ? 0 : (int) (f10 * 10.0f));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/SearchBar$k.class
     */
    /* renamed from: androidx.leanback.widget.SearchBar$k */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SearchBar$k.class */
    public interface InterfaceC0485k {
        /* renamed from: a */
        void mo2513a(String str);

        /* renamed from: b */
        void mo2514b(String str);

        /* renamed from: c */
        void mo2515c(String str);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/SearchBar$l.class
     */
    /* renamed from: androidx.leanback.widget.SearchBar$l */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SearchBar$l.class */
    public interface InterfaceC0486l {
        /* renamed from: a */
        void mo2516a();
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SearchBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3296j = new Handler();
        this.f3298l = false;
        this.f3311y = new SparseIntArray();
        this.f3312z = false;
        this.f3285A = context;
        Resources resources = getResources();
        LayoutInflater.from(getContext()).inflate(C9795h.f45019j, (ViewGroup) this, true);
        this.f3306t = getResources().getDimensionPixelSize(C9790c.f44955u);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f3306t);
        layoutParams.addRule(10, -1);
        setLayoutParams(layoutParams);
        setBackgroundColor(0);
        setClipChildren(false);
        this.f3292f = "";
        this.f3297k = (InputMethodManager) context.getSystemService("input_method");
        this.f3301o = resources.getColor(C9789b.f44929i);
        this.f3300n = resources.getColor(C9789b.f44928h);
        this.f3305s = resources.getInteger(C9794g.f45006b);
        this.f3304r = resources.getInteger(C9794g.f45007c);
        this.f3303q = resources.getColor(C9789b.f44927g);
        this.f3302p = resources.getColor(C9789b.f44926f);
        this.f3286B = (AudioManager) context.getSystemService("audio");
    }

    /* renamed from: a */
    public void m2498a() {
        this.f3297k.hideSoftInputFromWindow(this.f3289c.getWindowToken(), 0);
    }

    /* renamed from: b */
    public final boolean m2499b() {
        return this.f3290d.isFocused();
    }

    /* renamed from: c */
    public final void m2500c(Context context) {
        int i10 = C9796i.f45024a;
        int i11 = C9796i.f45026c;
        int i12 = C9796i.f45025b;
        int i13 = C9796i.f45027d;
        for (int i14 = 0; i14 < 4; i14++) {
            int i15 = new int[]{i10, i11, i12, i13}[i14];
            this.f3311y.put(i15, this.f3310x.load(context, i15, 1));
        }
    }

    /* renamed from: d */
    public final void m2501d(int i10) {
        this.f3296j.post(new RunnableC0475a(this, i10));
    }

    /* renamed from: e */
    public void m2502e() {
        m2501d(C9796i.f45024a);
    }

    /* renamed from: f */
    public void m2503f() {
        m2501d(C9796i.f45026c);
    }

    /* renamed from: g */
    public void m2504g() {
        m2501d(C9796i.f45027d);
    }

    public Drawable getBadgeDrawable() {
        return this.f3295i;
    }

    public CharSequence getHint() {
        return this.f3293g;
    }

    public String getTitle() {
        return this.f3294h;
    }

    /* renamed from: h */
    public void m2505h() {
        this.f3296j.post(new RunnableC0483i(this));
    }

    /* renamed from: i */
    public void m2506i() {
        InterfaceC0486l interfaceC0486l;
        if (this.f3312z) {
            return;
        }
        if (!hasFocus()) {
            requestFocus();
        }
        if (this.f3308v != null) {
            this.f3289c.setText("");
            this.f3289c.setHint("");
            this.f3308v.m3082a();
            this.f3312z = true;
            return;
        }
        if (this.f3307u == null) {
            return;
        }
        if (getContext().checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            if (Build.VERSION.SDK_INT < 23 || (interfaceC0486l = this.f3287C) == null) {
                throw new IllegalStateException("android.permission.RECORD_AUDIO required for search");
            }
            interfaceC0486l.mo2516a();
            return;
        }
        this.f3312z = true;
        this.f3289c.setText("");
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
        this.f3307u.setRecognitionListener(new C0484j(this));
        this.f3309w = true;
        this.f3307u.startListening(intent);
    }

    /* renamed from: j */
    public void m2507j() {
        if (this.f3312z) {
            this.f3289c.setText(this.f3292f);
            this.f3289c.setHint(this.f3293g);
            this.f3312z = false;
            if (this.f3308v != null || this.f3307u == null) {
                return;
            }
            this.f3290d.m2527g();
            if (this.f3309w) {
                this.f3307u.cancel();
                this.f3309w = false;
            }
            this.f3307u.setRecognitionListener(null);
        }
    }

    /* renamed from: k */
    public void m2508k() {
        InterfaceC0485k interfaceC0485k;
        if (TextUtils.isEmpty(this.f3292f) || (interfaceC0485k = this.f3288b) == null) {
            return;
        }
        interfaceC0485k.mo2515c(this.f3292f);
    }

    /* renamed from: l */
    public void m2509l() {
        if (this.f3312z) {
            m2507j();
        } else {
            m2506i();
        }
    }

    /* renamed from: m */
    public final void m2510m() {
        String string = getResources().getString(C9797j.f45028a);
        if (!TextUtils.isEmpty(this.f3294h)) {
            string = m2499b() ? getResources().getString(C9797j.f45031d, this.f3294h) : getResources().getString(C9797j.f45030c, this.f3294h);
        } else if (m2499b()) {
            string = getResources().getString(C9797j.f45029b);
        }
        this.f3293g = string;
        SearchEditText searchEditText = this.f3289c;
        if (searchEditText != null) {
            searchEditText.setHint(string);
        }
    }

    /* renamed from: n */
    public void m2511n(boolean z10) {
        SearchEditText searchEditText;
        int i10;
        SearchEditText searchEditText2;
        int i11;
        if (z10) {
            this.f3299m.setAlpha(this.f3305s);
            if (m2499b()) {
                searchEditText2 = this.f3289c;
                i11 = this.f3303q;
            } else {
                searchEditText2 = this.f3289c;
                i11 = this.f3301o;
            }
            searchEditText2.setTextColor(i11);
            searchEditText = this.f3289c;
            i10 = this.f3303q;
        } else {
            this.f3299m.setAlpha(this.f3304r);
            this.f3289c.setTextColor(this.f3300n);
            searchEditText = this.f3289c;
            i10 = this.f3302p;
        }
        searchEditText.setHintTextColor(i10);
        m2510m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3310x = new SoundPool(2, 1, 0);
        m2500c(this.f3285A);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m2507j();
        this.f3310x.release();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3299m = ((RelativeLayout) findViewById(C9793f.f44993o)).getBackground();
        this.f3289c = (SearchEditText) findViewById(C9793f.f44995q);
        ImageView imageView = (ImageView) findViewById(C9793f.f44992n);
        this.f3291e = imageView;
        Drawable drawable = this.f3295i;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        this.f3289c.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0476b(this));
        this.f3289c.addTextChangedListener(new C0478d(this, new RunnableC0477c(this)));
        this.f3289c.setOnKeyboardDismissListener(new C0479e(this));
        this.f3289c.setOnEditorActionListener(new C0480f(this));
        this.f3289c.setPrivateImeOptions("escapeNorth,voiceDismiss");
        SpeechOrbView speechOrbView = (SpeechOrbView) findViewById(C9793f.f44994p);
        this.f3290d = speechOrbView;
        speechOrbView.setOnOrbClickedListener(new ViewOnClickListenerC0481g(this));
        this.f3290d.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0482h(this));
        m2511n(hasFocus());
        m2510m();
    }

    public void setBadgeDrawable(Drawable drawable) {
        ImageView imageView;
        int i10;
        this.f3295i = drawable;
        ImageView imageView2 = this.f3291e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
            if (drawable != null) {
                imageView = this.f3291e;
                i10 = 0;
            } else {
                imageView = this.f3291e;
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    @Override // android.view.View
    public void setNextFocusDownId(int i10) {
        this.f3290d.setNextFocusDownId(i10);
        this.f3289c.setNextFocusDownId(i10);
    }

    public void setPermissionListener(InterfaceC0486l interfaceC0486l) {
        this.f3287C = interfaceC0486l;
    }

    public void setSearchAffordanceColors(SearchOrbView.C0490c c0490c) {
        SpeechOrbView speechOrbView = this.f3290d;
        if (speechOrbView != null) {
            speechOrbView.setNotListeningOrbColors(c0490c);
        }
    }

    public void setSearchAffordanceColorsInListening(SearchOrbView.C0490c c0490c) {
        SpeechOrbView speechOrbView = this.f3290d;
        if (speechOrbView != null) {
            speechOrbView.setListeningOrbColors(c0490c);
        }
    }

    public void setSearchBarListener(InterfaceC0485k interfaceC0485k) {
        this.f3288b = interfaceC0485k;
    }

    public void setSearchQuery(String str) {
        m2507j();
        this.f3289c.setText(str);
        setSearchQueryInternal(str);
    }

    public void setSearchQueryInternal(String str) {
        if (TextUtils.equals(this.f3292f, str)) {
            return;
        }
        this.f3292f = str;
        InterfaceC0485k interfaceC0485k = this.f3288b;
        if (interfaceC0485k != null) {
            interfaceC0485k.mo2513a(str);
        }
    }

    @Deprecated
    public void setSpeechRecognitionCallback(InterfaceC0551y0 interfaceC0551y0) {
        this.f3308v = interfaceC0551y0;
        if (interfaceC0551y0 != null && this.f3307u != null) {
            throw new IllegalStateException("Can't have speech recognizer and request");
        }
    }

    public void setSpeechRecognizer(SpeechRecognizer speechRecognizer) {
        m2507j();
        SpeechRecognizer speechRecognizer2 = this.f3307u;
        if (speechRecognizer2 != null) {
            speechRecognizer2.setRecognitionListener(null);
            if (this.f3309w) {
                this.f3307u.cancel();
                this.f3309w = false;
            }
        }
        this.f3307u = speechRecognizer;
        if (this.f3308v != null && speechRecognizer != null) {
            throw new IllegalStateException("Can't have speech recognizer and request");
        }
    }

    public void setTitle(String str) {
        this.f3294h = str;
        m2510m();
    }
}
