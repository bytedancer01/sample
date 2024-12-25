package p359v0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p235o0.C6805a;
import p235o0.C6824g0;
import p261p0.C7535k;
import p261p0.C7536l;
import p261p0.C7537m;
import p294r.C7937j;
import p359v0.C9220b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v0/a.class
 */
/* renamed from: v0.a */
/* loaded from: combined.jar:classes1.jar:v0/a.class */
public abstract class AbstractC9219a extends C6805a {

    /* renamed from: n */
    public static final Rect f42103n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);

    /* renamed from: o */
    public static final C9220b.a<C7535k> f42104o = new a();

    /* renamed from: p */
    public static final C9220b.b<C7937j<C7535k>, C7535k> f42105p = new b();

    /* renamed from: h */
    public final AccessibilityManager f42110h;

    /* renamed from: i */
    public final View f42111i;

    /* renamed from: j */
    public c f42112j;

    /* renamed from: d */
    public final Rect f42106d = new Rect();

    /* renamed from: e */
    public final Rect f42107e = new Rect();

    /* renamed from: f */
    public final Rect f42108f = new Rect();

    /* renamed from: g */
    public final int[] f42109g = new int[2];

    /* renamed from: k */
    public int f42113k = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;

    /* renamed from: l */
    public int f42114l = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;

    /* renamed from: m */
    public int f42115m = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:v0/a$a.class
     */
    /* renamed from: v0.a$a */
    /* loaded from: combined.jar:classes1.jar:v0/a$a.class */
    public class a implements C9220b.a<C7535k> {
        @Override // p359v0.C9220b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo38826a(C7535k c7535k, Rect rect) {
            c7535k.m32223l(rect);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:v0/a$b.class
     */
    /* renamed from: v0.a$b */
    /* loaded from: combined.jar:classes1.jar:v0/a$b.class */
    public class b implements C9220b.b<C7937j<C7535k>, C7535k> {
        @Override // p359v0.C9220b.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C7535k mo38828a(C7937j<C7535k> c7937j, int i10) {
            return c7937j.m34455m(i10);
        }

        @Override // p359v0.C9220b.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int mo38829b(C7937j<C7535k> c7937j) {
            return c7937j.m34454l();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:v0/a$c.class
     */
    /* renamed from: v0.a$c */
    /* loaded from: combined.jar:classes1.jar:v0/a$c.class */
    public class c extends C7536l {

        /* renamed from: b */
        public final AbstractC9219a f42116b;

        public c(AbstractC9219a abstractC9219a) {
            this.f42116b = abstractC9219a;
        }

        @Override // p261p0.C7536l
        /* renamed from: b */
        public C7535k mo32256b(int i10) {
            return C7535k.m32175M(this.f42116b.m38802H(i10));
        }

        @Override // p261p0.C7536l
        /* renamed from: d */
        public C7535k mo32258d(int i10) {
            int i11 = i10 == 2 ? this.f42116b.f42113k : this.f42116b.f42114l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return mo32256b(i11);
        }

        @Override // p261p0.C7536l
        /* renamed from: f */
        public boolean mo32260f(int i10, int i11, Bundle bundle) {
            return this.f42116b.m38806P(i10, i11, bundle);
        }
    }

    public AbstractC9219a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f42111i = view;
        this.f42110h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (C6824g0.m31469A(view) == 0) {
            C6824g0.m31557y0(view, 1);
        }
    }

    /* renamed from: D */
    public static Rect m38797D(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
        } else if (i10 == 33) {
            rect.set(0, height, width, height);
        } else if (i10 == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    /* renamed from: F */
    public static int m38798F(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    /* renamed from: A */
    public final int m38799A() {
        return this.f42114l;
    }

    /* renamed from: B */
    public abstract int mo13467B(float f10, float f11);

    /* renamed from: C */
    public abstract void mo13468C(List<Integer> list);

    /* renamed from: E */
    public final boolean m38800E(Rect rect) {
        View view;
        boolean z10 = false;
        if (rect != null) {
            if (!rect.isEmpty()) {
                if (this.f42111i.getWindowVisibility() != 0) {
                    return false;
                }
                View view2 = this.f42111i;
                do {
                    Object parent = view2.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                        if (view.getAlpha() <= 0.0f) {
                            return false;
                        }
                        view2 = view;
                    } else {
                        z10 = false;
                        if (parent != null) {
                            z10 = true;
                        }
                    }
                } while (view.getVisibility() == 0);
                return false;
            }
            z10 = false;
        }
        return z10;
    }

    /* renamed from: G */
    public final boolean m38801G(int i10, Rect rect) {
        Object m38835d;
        C7937j<C7535k> m38824y = m38824y();
        int i11 = this.f42114l;
        C7535k m34448e = i11 == Integer.MIN_VALUE ? null : m38824y.m34448e(i11);
        if (i10 == 1 || i10 == 2) {
            m38835d = C9220b.m38835d(m38824y, f42105p, f42104o, m34448e, i10, C6824g0.m31473C(this.f42111i) == 1, false);
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i12 = this.f42114l;
            if (i12 != Integer.MIN_VALUE) {
                m38825z(i12, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m38797D(this.f42111i, i10, rect2);
            }
            m38835d = C9220b.m38834c(m38824y, f42105p, f42104o, m34448e, rect2, i10);
        }
        C7535k c7535k = (C7535k) m38835d;
        return m38810T(c7535k == null ? Integer.MIN_VALUE : m38824y.m34451i(m38824y.m34450h(c7535k)));
    }

    /* renamed from: H */
    public C7535k m38802H(int i10) {
        return i10 == -1 ? m38820u() : m38819t(i10);
    }

    /* renamed from: I */
    public final void m38803I(boolean z10, int i10, Rect rect) {
        int i11 = this.f42114l;
        if (i11 != Integer.MIN_VALUE) {
            m38814o(i11);
        }
        if (z10) {
            m38801G(i10, rect);
        }
    }

    /* renamed from: J */
    public abstract boolean mo13469J(int i10, int i11, Bundle bundle);

    /* renamed from: K */
    public void m38804K(AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: L */
    public void m38805L(int i10, AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: M */
    public void mo13470M(C7535k c7535k) {
    }

    /* renamed from: N */
    public abstract void mo13471N(int i10, C7535k c7535k);

    /* renamed from: O */
    public void mo13472O(int i10, boolean z10) {
    }

    /* renamed from: P */
    public boolean m38806P(int i10, int i11, Bundle bundle) {
        return i10 != -1 ? m38807Q(i10, i11, bundle) : m38808R(i11, bundle);
    }

    /* renamed from: Q */
    public final boolean m38807Q(int i10, int i11, Bundle bundle) {
        return i11 != 1 ? i11 != 2 ? i11 != 64 ? i11 != 128 ? mo13469J(i10, i11, bundle) : m38813n(i10) : m38809S(i10) : m38814o(i10) : m38810T(i10);
    }

    /* renamed from: R */
    public final boolean m38808R(int i10, Bundle bundle) {
        return C6824g0.m31517e0(this.f42111i, i10, bundle);
    }

    /* renamed from: S */
    public final boolean m38809S(int i10) {
        int i11;
        if (!this.f42110h.isEnabled() || !this.f42110h.isTouchExplorationEnabled() || (i11 = this.f42113k) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            m38813n(i11);
        }
        this.f42113k = i10;
        this.f42111i.invalidate();
        m38811U(i10, 32768);
        return true;
    }

    /* renamed from: T */
    public final boolean m38810T(int i10) {
        int i11;
        if ((!this.f42111i.isFocused() && !this.f42111i.requestFocus()) || (i11 = this.f42114l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            m38814o(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f42114l = i10;
        mo13472O(i10, true);
        m38811U(i10, 8);
        return true;
    }

    /* renamed from: U */
    public final boolean m38811U(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f42110h.isEnabled() || (parent = this.f42111i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f42111i, m38816q(i10, i11));
    }

    /* renamed from: V */
    public final void m38812V(int i10) {
        int i11 = this.f42115m;
        if (i11 == i10) {
            return;
        }
        this.f42115m = i10;
        m38811U(i10, 128);
        m38811U(i11, 256);
    }

    @Override // p235o0.C6805a
    /* renamed from: b */
    public C7536l mo4644b(View view) {
        if (this.f42112j == null) {
            this.f42112j = new c(this);
        }
        return this.f42112j;
    }

    @Override // p235o0.C6805a
    /* renamed from: f */
    public void mo1935f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1935f(view, accessibilityEvent);
        m38804K(accessibilityEvent);
    }

    @Override // p235o0.C6805a
    /* renamed from: g */
    public void mo1936g(View view, C7535k c7535k) {
        super.mo1936g(view, c7535k);
        mo13470M(c7535k);
    }

    /* renamed from: n */
    public final boolean m38813n(int i10) {
        if (this.f42113k != i10) {
            return false;
        }
        this.f42113k = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
        this.f42111i.invalidate();
        m38811U(i10, 65536);
        return true;
    }

    /* renamed from: o */
    public final boolean m38814o(int i10) {
        if (this.f42114l != i10) {
            return false;
        }
        this.f42114l = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
        mo13472O(i10, false);
        m38811U(i10, 8);
        return true;
    }

    /* renamed from: p */
    public final boolean m38815p() {
        int i10 = this.f42114l;
        return i10 != Integer.MIN_VALUE && mo13469J(i10, 16, null);
    }

    /* renamed from: q */
    public final AccessibilityEvent m38816q(int i10, int i11) {
        return i10 != -1 ? m38817r(i10, i11) : m38818s(i11);
    }

    /* renamed from: r */
    public final AccessibilityEvent m38817r(int i10, int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        C7535k m38802H = m38802H(i10);
        obtain.getText().add(m38802H.m32242v());
        obtain.setContentDescription(m38802H.m32232q());
        obtain.setScrollable(m38802H.m32186H());
        obtain.setPassword(m38802H.m32185G());
        obtain.setEnabled(m38802H.m32181C());
        obtain.setChecked(m38802H.m32179A());
        m38805L(i10, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(m38802H.m32229o());
        C7537m.m32263c(obtain, this.f42111i, i10);
        obtain.setPackageName(this.f42111i.getContext().getPackageName());
        return obtain;
    }

    /* renamed from: s */
    public final AccessibilityEvent m38818s(int i10) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
        this.f42111i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: t */
    public final C7535k m38819t(int i10) {
        C7535k m32173K = C7535k.m32173K();
        m32173K.m32207c0(true);
        m32173K.m32211e0(true);
        m32173K.m32199X("android.view.View");
        Rect rect = f42103n;
        m32173K.m32195T(rect);
        m32173K.m32196U(rect);
        m32173K.m32224l0(this.f42111i);
        mo13471N(i10, m32173K);
        if (m32173K.m32242v() == null && m32173K.m32232q() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        m32173K.m32223l(this.f42107e);
        if (this.f42107e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int m32219j = m32173K.m32219j();
        if ((m32219j & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((m32219j & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        m32173K.m32220j0(this.f42111i.getContext().getPackageName());
        m32173K.m32235r0(this.f42111i, i10);
        if (this.f42113k == i10) {
            m32173K.m32193R(true);
            m32173K.m32202a(128);
        } else {
            m32173K.m32193R(false);
            m32173K.m32202a(64);
        }
        boolean z10 = this.f42114l == i10;
        if (z10) {
            m32173K.m32202a(2);
        } else if (m32173K.m32182D()) {
            m32173K.m32202a(1);
        }
        m32173K.m32213f0(z10);
        this.f42111i.getLocationOnScreen(this.f42109g);
        m32173K.m32225m(this.f42106d);
        if (this.f42106d.equals(rect)) {
            m32173K.m32223l(this.f42106d);
            if (m32173K.f36321b != -1) {
                C7535k m32173K2 = C7535k.m32173K();
                int i11 = m32173K.f36321b;
                while (true) {
                    int i12 = i11;
                    if (i12 == -1) {
                        break;
                    }
                    m32173K2.m32226m0(this.f42111i, -1);
                    m32173K2.m32195T(f42103n);
                    mo13471N(i12, m32173K2);
                    m32173K2.m32223l(this.f42107e);
                    Rect rect2 = this.f42106d;
                    Rect rect3 = this.f42107e;
                    rect2.offset(rect3.left, rect3.top);
                    i11 = m32173K2.f36321b;
                }
                m32173K2.m32190O();
            }
            this.f42106d.offset(this.f42109g[0] - this.f42111i.getScrollX(), this.f42109g[1] - this.f42111i.getScrollY());
        }
        if (this.f42111i.getLocalVisibleRect(this.f42108f)) {
            this.f42108f.offset(this.f42109g[0] - this.f42111i.getScrollX(), this.f42109g[1] - this.f42111i.getScrollY());
            if (this.f42106d.intersect(this.f42108f)) {
                m32173K.m32196U(this.f42106d);
                if (m38800E(this.f42106d)) {
                    m32173K.m32243v0(true);
                }
            }
        }
        return m32173K;
    }

    /* renamed from: u */
    public final C7535k m38820u() {
        C7535k m32174L = C7535k.m32174L(this.f42111i);
        C6824g0.m31513c0(this.f42111i, m32174L);
        ArrayList arrayList = new ArrayList();
        mo13468C(arrayList);
        if (m32174L.m32227n() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m32174L.m32206c(this.f42111i, ((Integer) arrayList.get(i10)).intValue());
        }
        return m32174L;
    }

    /* renamed from: v */
    public final boolean m38821v(MotionEvent motionEvent) {
        boolean z10 = false;
        if (this.f42110h.isEnabled()) {
            if (this.f42110h.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7 && action != 9) {
                    if (action != 10 || this.f42115m == Integer.MIN_VALUE) {
                        return false;
                    }
                    m38812V(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
                    return true;
                }
                int mo13467B = mo13467B(motionEvent.getX(), motionEvent.getY());
                m38812V(mo13467B);
                z10 = false;
                if (mo13467B != Integer.MIN_VALUE) {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    /* renamed from: w */
    public final boolean m38822w(KeyEvent keyEvent) {
        int i10 = 0;
        boolean z10 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            z10 = false;
                            if (keyEvent.hasNoModifiers()) {
                                int m38798F = m38798F(keyCode);
                                int repeatCount = keyEvent.getRepeatCount();
                                boolean z11 = false;
                                while (true) {
                                    z10 = z11;
                                    if (i10 < repeatCount + 1 && m38801G(m38798F, null)) {
                                        i10++;
                                        z11 = true;
                                    }
                                }
                            }
                            break;
                        case 23:
                            break;
                        default:
                            z10 = false;
                            break;
                    }
                }
                z10 = false;
                if (keyEvent.hasNoModifiers()) {
                    z10 = false;
                    if (keyEvent.getRepeatCount() == 0) {
                        m38815p();
                        z10 = true;
                    }
                }
            } else if (keyEvent.hasNoModifiers()) {
                z10 = m38801G(2, null);
            } else {
                z10 = false;
                if (keyEvent.hasModifiers(1)) {
                    z10 = m38801G(1, null);
                }
            }
        }
        return z10;
    }

    /* renamed from: x */
    public final int m38823x() {
        return this.f42113k;
    }

    /* renamed from: y */
    public final C7937j<C7535k> m38824y() {
        ArrayList arrayList = new ArrayList();
        mo13468C(arrayList);
        C7937j<C7535k> c7937j = new C7937j<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c7937j.m34452j(arrayList.get(i10).intValue(), m38819t(arrayList.get(i10).intValue()));
        }
        return c7937j;
    }

    /* renamed from: z */
    public final void m38825z(int i10, Rect rect) {
        m38802H(i10).m32223l(rect);
    }
}
