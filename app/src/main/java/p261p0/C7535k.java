package p261p0;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.amazonaws.services.p045s3.internal.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p018b0.C0778c;
import p175k0.C5440a;
import p261p0.InterfaceC7538n;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:p0/k.class
 */
/* renamed from: p0.k */
/* loaded from: combined.jar:classes1.jar:p0/k.class */
public class C7535k {

    /* renamed from: d */
    public static int f36319d;

    /* renamed from: a */
    public final AccessibilityNodeInfo f36320a;

    /* renamed from: b */
    public int f36321b = -1;

    /* renamed from: c */
    public int f36322c = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p0/k$a.class
     */
    /* renamed from: p0.k$a */
    /* loaded from: combined.jar:classes1.jar:p0/k$a.class */
    public static class a {

        /* renamed from: A */
        public static final a f36323A;

        /* renamed from: B */
        public static final a f36324B;

        /* renamed from: C */
        public static final a f36325C;

        /* renamed from: D */
        public static final a f36326D;

        /* renamed from: E */
        public static final a f36327E;

        /* renamed from: F */
        public static final a f36328F;

        /* renamed from: G */
        public static final a f36329G;

        /* renamed from: H */
        public static final a f36330H;

        /* renamed from: I */
        public static final a f36331I;

        /* renamed from: J */
        public static final a f36332J;

        /* renamed from: K */
        public static final a f36333K;

        /* renamed from: L */
        public static final a f36334L;

        /* renamed from: M */
        public static final a f36335M;

        /* renamed from: N */
        public static final a f36336N;

        /* renamed from: O */
        public static final a f36337O;

        /* renamed from: P */
        public static final a f36338P;

        /* renamed from: Q */
        public static final a f36339Q;

        /* renamed from: e */
        public static final a f36340e = new a(1, null);

        /* renamed from: f */
        public static final a f36341f = new a(2, null);

        /* renamed from: g */
        public static final a f36342g = new a(4, null);

        /* renamed from: h */
        public static final a f36343h = new a(8, null);

        /* renamed from: i */
        public static final a f36344i = new a(16, null);

        /* renamed from: j */
        public static final a f36345j = new a(32, null);

        /* renamed from: k */
        public static final a f36346k = new a(64, null);

        /* renamed from: l */
        public static final a f36347l = new a(128, null);

        /* renamed from: m */
        public static final a f36348m = new a(256, (CharSequence) null, (Class<? extends InterfaceC7538n.a>) InterfaceC7538n.b.class);

        /* renamed from: n */
        public static final a f36349n = new a(512, (CharSequence) null, (Class<? extends InterfaceC7538n.a>) InterfaceC7538n.b.class);

        /* renamed from: o */
        public static final a f36350o = new a(1024, (CharSequence) null, (Class<? extends InterfaceC7538n.a>) InterfaceC7538n.c.class);

        /* renamed from: p */
        public static final a f36351p = new a(2048, (CharSequence) null, (Class<? extends InterfaceC7538n.a>) InterfaceC7538n.c.class);

        /* renamed from: q */
        public static final a f36352q = new a(4096, null);

        /* renamed from: r */
        public static final a f36353r = new a(NTLMEngineImpl.FLAG_WORKSTATION_PRESENT, null);

        /* renamed from: s */
        public static final a f36354s = new a(16384, null);

        /* renamed from: t */
        public static final a f36355t = new a(32768, null);

        /* renamed from: u */
        public static final a f36356u = new a(65536, null);

        /* renamed from: v */
        public static final a f36357v = new a(131072, (CharSequence) null, (Class<? extends InterfaceC7538n.a>) InterfaceC7538n.g.class);

        /* renamed from: w */
        public static final a f36358w = new a(262144, null);

        /* renamed from: x */
        public static final a f36359x = new a(NTLMEngineImpl.FLAG_REQUEST_NTLM2_SESSION, null);

        /* renamed from: y */
        public static final a f36360y = new a(Constants.f7590MB, null);

        /* renamed from: z */
        public static final a f36361z = new a(2097152, (CharSequence) null, (Class<? extends InterfaceC7538n.a>) InterfaceC7538n.h.class);

        /* renamed from: a */
        public final Object f36362a;

        /* renamed from: b */
        public final int f36363b;

        /* renamed from: c */
        public final Class<? extends InterfaceC7538n.a> f36364c;

        /* renamed from: d */
        public final InterfaceC7538n f36365d;

        static {
            int i10 = Build.VERSION.SDK_INT;
            f36323A = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
            f36324B = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, InterfaceC7538n.e.class);
            f36325C = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
            f36326D = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
            f36327E = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
            f36328F = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
            f36329G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f36330H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f36331I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f36332J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f36333K = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
            f36334L = new a(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, InterfaceC7538n.f.class);
            f36335M = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, InterfaceC7538n.d.class);
            f36336N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f36337O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f36338P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            if (i10 >= 30) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            f36339Q = new a(accessibilityAction, R.id.accessibilityActionImeEnter, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public a(int i10, CharSequence charSequence, Class<? extends InterfaceC7538n.a> cls) {
            this(null, i10, charSequence, null, cls);
        }

        public a(int i10, CharSequence charSequence, InterfaceC7538n interfaceC7538n) {
            this(null, i10, charSequence, interfaceC7538n, null);
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(Object obj, int i10, CharSequence charSequence, InterfaceC7538n interfaceC7538n, Class<? extends InterfaceC7538n.a> cls) {
            this.f36363b = i10;
            this.f36365d = interfaceC7538n;
            this.f36362a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence) : obj;
            this.f36364c = cls;
        }

        /* renamed from: a */
        public a m32249a(CharSequence charSequence, InterfaceC7538n interfaceC7538n) {
            return new a(null, this.f36363b, charSequence, interfaceC7538n, this.f36364c);
        }

        /* renamed from: b */
        public int m32250b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f36362a).getId();
        }

        /* renamed from: c */
        public CharSequence m32251c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f36362a).getLabel();
        }

        /* renamed from: d */
        public boolean m32252d(View view, Bundle bundle) {
            InterfaceC7538n.a aVar;
            if (this.f36365d == null) {
                return false;
            }
            InterfaceC7538n.a aVar2 = null;
            Class<? extends InterfaceC7538n.a> cls = this.f36364c;
            if (cls != null) {
                try {
                    aVar2 = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    try {
                        aVar2.m32264a(bundle);
                    } catch (Exception e10) {
                        aVar = aVar2;
                        e = e10;
                        Class<? extends InterfaceC7538n.a> cls2 = this.f36364c;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                        aVar2 = aVar;
                        return this.f36365d.mo13245a(view, aVar2);
                    }
                } catch (Exception e11) {
                    e = e11;
                    aVar = null;
                }
            }
            return this.f36365d.mo13245a(view, aVar2);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f36362a;
            Object obj3 = ((a) obj).f36362a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f36362a;
            return obj != null ? obj.hashCode() : 0;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p0/k$b.class
     */
    /* renamed from: p0.k$b */
    /* loaded from: combined.jar:classes1.jar:p0/k$b.class */
    public static class b {

        /* renamed from: a */
        public final Object f36366a;

        public b(Object obj) {
            this.f36366a = obj;
        }

        /* renamed from: a */
        public static b m32253a(int i10, int i11, boolean z10, int i12) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p0/k$c.class
     */
    /* renamed from: p0.k$c */
    /* loaded from: combined.jar:classes1.jar:p0/k$c.class */
    public static class c {

        /* renamed from: a */
        public final Object f36367a;

        public c(Object obj) {
            this.f36367a = obj;
        }

        /* renamed from: a */
        public static c m32254a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    public C7535k(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f36320a = accessibilityNodeInfo;
    }

    /* renamed from: K */
    public static C7535k m32173K() {
        return m32178x0(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: L */
    public static C7535k m32174L(View view) {
        return m32178x0(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: M */
    public static C7535k m32175M(C7535k c7535k) {
        return m32178x0(AccessibilityNodeInfo.obtain(c7535k.f36320a));
    }

    /* renamed from: i */
    public static String m32176i(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case NTLMEngineImpl.FLAG_WORKSTATION_PRESENT /* 8192 */:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case NTLMEngineImpl.FLAG_REQUEST_NTLM2_SESSION /* 524288 */:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionImeEnter:
                return "ACTION_IME_ENTER";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    /* renamed from: p */
    public static ClickableSpan[] m32177p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: x0 */
    public static C7535k m32178x0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C7535k(accessibilityNodeInfo);
    }

    /* renamed from: A */
    public boolean m32179A() {
        return this.f36320a.isChecked();
    }

    /* renamed from: B */
    public boolean m32180B() {
        return this.f36320a.isClickable();
    }

    /* renamed from: C */
    public boolean m32181C() {
        return this.f36320a.isEnabled();
    }

    /* renamed from: D */
    public boolean m32182D() {
        return this.f36320a.isFocusable();
    }

    /* renamed from: E */
    public boolean m32183E() {
        return this.f36320a.isFocused();
    }

    /* renamed from: F */
    public boolean m32184F() {
        return this.f36320a.isLongClickable();
    }

    /* renamed from: G */
    public boolean m32185G() {
        return this.f36320a.isPassword();
    }

    /* renamed from: H */
    public boolean m32186H() {
        return this.f36320a.isScrollable();
    }

    /* renamed from: I */
    public boolean m32187I() {
        return this.f36320a.isSelected();
    }

    /* renamed from: J */
    public boolean m32188J() {
        boolean isShowingHintText;
        if (Build.VERSION.SDK_INT < 26) {
            return m32221k(4);
        }
        isShowingHintText = this.f36320a.isShowingHintText();
        return isShowingHintText;
    }

    /* renamed from: N */
    public boolean m32189N(int i10, Bundle bundle) {
        return this.f36320a.performAction(i10, bundle);
    }

    /* renamed from: O */
    public void m32190O() {
        this.f36320a.recycle();
    }

    /* renamed from: P */
    public boolean m32191P(a aVar) {
        return this.f36320a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f36362a);
    }

    /* renamed from: Q */
    public final void m32192Q(View view) {
        int i10;
        SparseArray<WeakReference<ClickableSpan>> m32240u = m32240u(view);
        if (m32240u != null) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            while (true) {
                if (i11 >= m32240u.size()) {
                    break;
                }
                if (m32240u.valueAt(i11).get() == null) {
                    arrayList.add(Integer.valueOf(i11));
                }
                i11++;
            }
            for (i10 = 0; i10 < arrayList.size(); i10++) {
                m32240u.remove(((Integer) arrayList.get(i10)).intValue());
            }
        }
    }

    /* renamed from: R */
    public void m32193R(boolean z10) {
        this.f36320a.setAccessibilityFocused(z10);
    }

    /* renamed from: S */
    public final void m32194S(int i10, boolean z10) {
        Bundle m32234r = m32234r();
        if (m32234r != null) {
            m32234r.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (z10 ? i10 : 0) | (m32234r.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i10 ^ (-1))));
        }
    }

    @Deprecated
    /* renamed from: T */
    public void m32195T(Rect rect) {
        this.f36320a.setBoundsInParent(rect);
    }

    /* renamed from: U */
    public void m32196U(Rect rect) {
        this.f36320a.setBoundsInScreen(rect);
    }

    /* renamed from: V */
    public void m32197V(boolean z10) {
        this.f36320a.setCheckable(z10);
    }

    /* renamed from: W */
    public void m32198W(boolean z10) {
        this.f36320a.setChecked(z10);
    }

    /* renamed from: X */
    public void m32199X(CharSequence charSequence) {
        this.f36320a.setClassName(charSequence);
    }

    /* renamed from: Y */
    public void m32200Y(boolean z10) {
        this.f36320a.setClickable(z10);
    }

    /* renamed from: Z */
    public void m32201Z(Object obj) {
        this.f36320a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f36366a);
    }

    /* renamed from: a */
    public void m32202a(int i10) {
        this.f36320a.addAction(i10);
    }

    /* renamed from: a0 */
    public void m32203a0(Object obj) {
        this.f36320a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f36367a);
    }

    /* renamed from: b */
    public void m32204b(a aVar) {
        this.f36320a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f36362a);
    }

    /* renamed from: b0 */
    public void m32205b0(CharSequence charSequence) {
        this.f36320a.setContentDescription(charSequence);
    }

    /* renamed from: c */
    public void m32206c(View view, int i10) {
        this.f36320a.addChild(view, i10);
    }

    /* renamed from: c0 */
    public void m32207c0(boolean z10) {
        this.f36320a.setEnabled(z10);
    }

    /* renamed from: d */
    public final void m32208d(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        m32214g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m32214g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m32214g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m32214g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    /* renamed from: d0 */
    public void m32209d0(CharSequence charSequence) {
        this.f36320a.setError(charSequence);
    }

    /* renamed from: e */
    public void m32210e(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            m32212f();
            m32192Q(view);
            ClickableSpan[] m32177p = m32177p(charSequence);
            if (m32177p == null || m32177p.length <= 0) {
                return;
            }
            m32234r().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C0778c.f5326a);
            SparseArray<WeakReference<ClickableSpan>> m32236s = m32236s(view);
            for (int i10 = 0; i10 < m32177p.length; i10++) {
                int m32247y = m32247y(m32177p[i10], m32236s);
                m32236s.put(m32247y, new WeakReference<>(m32177p[i10]));
                m32208d(m32177p[i10], (Spanned) charSequence, m32247y);
            }
        }
    }

    /* renamed from: e0 */
    public void m32211e0(boolean z10) {
        this.f36320a.setFocusable(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C7535k)) {
            return false;
        }
        C7535k c7535k = (C7535k) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f36320a;
        if (accessibilityNodeInfo == null) {
            if (c7535k.f36320a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c7535k.f36320a)) {
            return false;
        }
        return this.f36322c == c7535k.f36322c && this.f36321b == c7535k.f36321b;
    }

    /* renamed from: f */
    public final void m32212f() {
        this.f36320a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f36320a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f36320a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f36320a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    /* renamed from: f0 */
    public void m32213f0(boolean z10) {
        this.f36320a.setFocused(z10);
    }

    /* renamed from: g */
    public final List<Integer> m32214g(String str) {
        ArrayList<Integer> integerArrayList = this.f36320a.getExtras().getIntegerArrayList(str);
        ArrayList<Integer> arrayList = integerArrayList;
        if (integerArrayList == null) {
            arrayList = new ArrayList<>();
            this.f36320a.getExtras().putIntegerArrayList(str, arrayList);
        }
        return arrayList;
    }

    /* renamed from: g0 */
    public void m32215g0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f36320a.setHeading(z10);
        } else {
            m32194S(2, z10);
        }
    }

    /* renamed from: h */
    public List<a> m32216h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f36320a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    /* renamed from: h0 */
    public void m32217h0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f36320a.setHintText(charSequence);
        } else {
            this.f36320a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f36320a;
        return accessibilityNodeInfo == null ? 0 : accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i0 */
    public void m32218i0(int i10) {
        this.f36320a.setMaxTextLength(i10);
    }

    /* renamed from: j */
    public int m32219j() {
        return this.f36320a.getActions();
    }

    /* renamed from: j0 */
    public void m32220j0(CharSequence charSequence) {
        this.f36320a.setPackageName(charSequence);
    }

    /* renamed from: k */
    public final boolean m32221k(int i10) {
        Bundle m32234r = m32234r();
        boolean z10 = false;
        if (m32234r == null) {
            return false;
        }
        if ((m32234r.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10) {
            z10 = true;
        }
        return z10;
    }

    /* renamed from: k0 */
    public void m32222k0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f36320a.setPaneTitle(charSequence);
        } else {
            this.f36320a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    @Deprecated
    /* renamed from: l */
    public void m32223l(Rect rect) {
        this.f36320a.getBoundsInParent(rect);
    }

    /* renamed from: l0 */
    public void m32224l0(View view) {
        this.f36321b = -1;
        this.f36320a.setParent(view);
    }

    /* renamed from: m */
    public void m32225m(Rect rect) {
        this.f36320a.getBoundsInScreen(rect);
    }

    /* renamed from: m0 */
    public void m32226m0(View view, int i10) {
        this.f36321b = i10;
        this.f36320a.setParent(view, i10);
    }

    /* renamed from: n */
    public int m32227n() {
        return this.f36320a.getChildCount();
    }

    /* renamed from: n0 */
    public void m32228n0(CharSequence charSequence) {
        this.f36320a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    /* renamed from: o */
    public CharSequence m32229o() {
        return this.f36320a.getClassName();
    }

    /* renamed from: o0 */
    public void m32230o0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f36320a.setScreenReaderFocusable(z10);
        } else {
            m32194S(1, z10);
        }
    }

    /* renamed from: p0 */
    public void m32231p0(boolean z10) {
        this.f36320a.setScrollable(z10);
    }

    /* renamed from: q */
    public CharSequence m32232q() {
        return this.f36320a.getContentDescription();
    }

    /* renamed from: q0 */
    public void m32233q0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f36320a.setShowingHintText(z10);
        } else {
            m32194S(4, z10);
        }
    }

    /* renamed from: r */
    public Bundle m32234r() {
        return this.f36320a.getExtras();
    }

    /* renamed from: r0 */
    public void m32235r0(View view, int i10) {
        this.f36322c = i10;
        this.f36320a.setSource(view, i10);
    }

    /* renamed from: s */
    public final SparseArray<WeakReference<ClickableSpan>> m32236s(View view) {
        SparseArray<WeakReference<ClickableSpan>> m32240u = m32240u(view);
        SparseArray<WeakReference<ClickableSpan>> sparseArray = m32240u;
        if (m32240u == null) {
            sparseArray = new SparseArray<>();
            view.setTag(C0778c.f5315I, sparseArray);
        }
        return sparseArray;
    }

    /* renamed from: s0 */
    public void m32237s0(CharSequence charSequence) {
        if (C5440a.m27188b()) {
            this.f36320a.setStateDescription(charSequence);
        } else {
            this.f36320a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: t */
    public CharSequence m32238t() {
        return this.f36320a.getPackageName();
    }

    /* renamed from: t0 */
    public void m32239t0(CharSequence charSequence) {
        this.f36320a.setText(charSequence);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m32223l(rect);
        sb2.append("; boundsInParent: " + rect);
        m32225m(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(m32238t());
        sb2.append("; className: ");
        sb2.append(m32229o());
        sb2.append("; text: ");
        sb2.append(m32242v());
        sb2.append("; contentDescription: ");
        sb2.append(m32232q());
        sb2.append("; viewId: ");
        sb2.append(m32244w());
        sb2.append("; checkable: ");
        sb2.append(m32248z());
        sb2.append("; checked: ");
        sb2.append(m32179A());
        sb2.append("; focusable: ");
        sb2.append(m32182D());
        sb2.append("; focused: ");
        sb2.append(m32183E());
        sb2.append("; selected: ");
        sb2.append(m32187I());
        sb2.append("; clickable: ");
        sb2.append(m32180B());
        sb2.append("; longClickable: ");
        sb2.append(m32184F());
        sb2.append("; enabled: ");
        sb2.append(m32181C());
        sb2.append("; password: ");
        sb2.append(m32185G());
        sb2.append("; scrollable: " + m32186H());
        sb2.append("; [");
        List<a> m32216h = m32216h();
        for (int i10 = 0; i10 < m32216h.size(); i10++) {
            a aVar = m32216h.get(i10);
            String m32176i = m32176i(aVar.m32250b());
            String str = m32176i;
            if (m32176i.equals("ACTION_UNKNOWN")) {
                str = m32176i;
                if (aVar.m32251c() != null) {
                    str = aVar.m32251c().toString();
                }
            }
            sb2.append(str);
            if (i10 != m32216h.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: u */
    public final SparseArray<WeakReference<ClickableSpan>> m32240u(View view) {
        return (SparseArray) view.getTag(C0778c.f5315I);
    }

    /* renamed from: u0 */
    public void m32241u0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f36320a.setTraversalAfter(view);
        }
    }

    /* renamed from: v */
    public CharSequence m32242v() {
        if (!m32246x()) {
            return this.f36320a.getText();
        }
        List<Integer> m32214g = m32214g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> m32214g2 = m32214g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> m32214g3 = m32214g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> m32214g4 = m32214g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f36320a.getText(), 0, this.f36320a.getText().length()));
        for (int i10 = 0; i10 < m32214g.size(); i10++) {
            spannableString.setSpan(new C7525a(m32214g4.get(i10).intValue(), this, m32234r().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), m32214g.get(i10).intValue(), m32214g2.get(i10).intValue(), m32214g3.get(i10).intValue());
        }
        return spannableString;
    }

    /* renamed from: v0 */
    public void m32243v0(boolean z10) {
        this.f36320a.setVisibleToUser(z10);
    }

    /* renamed from: w */
    public String m32244w() {
        return this.f36320a.getViewIdResourceName();
    }

    /* renamed from: w0 */
    public AccessibilityNodeInfo m32245w0() {
        return this.f36320a;
    }

    /* renamed from: x */
    public final boolean m32246x() {
        return !m32214g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: y */
    public final int m32247y(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals(sparseArray.valueAt(i10).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f36319d;
        f36319d = i11 + 1;
        return i11;
    }

    /* renamed from: z */
    public boolean m32248z() {
        return this.f36320a.isCheckable();
    }
}
