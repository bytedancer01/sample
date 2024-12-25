package p235o0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p018b0.C0778c;
import p261p0.C7535k;
import p261p0.C7536l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o0/a.class
 */
/* renamed from: o0.a */
/* loaded from: combined.jar:classes1.jar:o0/a.class */
public class C6805a {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f35491c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f35492a;

    /* renamed from: b */
    public final View.AccessibilityDelegate f35493b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/a$a.class
     */
    /* renamed from: o0.a$a */
    /* loaded from: combined.jar:classes1.jar:o0/a$a.class */
    public static final class a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final C6805a f35494a;

        public a(C6805a c6805a) {
            this.f35494a = c6805a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f35494a.mo4643a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C7536l mo4644b = this.f35494a.mo4644b(view);
            return mo4644b != null ? (AccessibilityNodeProvider) mo4644b.m32259e() : null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f35494a.mo1935f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C7535k m32178x0 = C7535k.m32178x0(accessibilityNodeInfo);
            m32178x0.m32230o0(C6824g0.m31505X(view));
            m32178x0.m32215g0(C6824g0.m31500S(view));
            m32178x0.m32222k0(C6824g0.m31538p(view));
            m32178x0.m32237s0(C6824g0.m31489K(view));
            this.f35494a.mo1936g(view, m32178x0);
            m32178x0.m32210e(accessibilityNodeInfo.getText(), view);
            List<C7535k.a> m31367c = C6805a.m31367c(view);
            for (int i10 = 0; i10 < m31367c.size(); i10++) {
                m32178x0.m32204b(m31367c.get(i10));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f35494a.mo4645h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f35494a.mo4646i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f35494a.mo1937j(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            this.f35494a.mo4647l(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f35494a.mo4648m(view, accessibilityEvent);
        }
    }

    public C6805a() {
        this(f35491c);
    }

    public C6805a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f35492a = accessibilityDelegate;
        this.f35493b = new a(this);
    }

    /* renamed from: c */
    public static List<C7535k.a> m31367c(View view) {
        List<C7535k.a> list = (List) view.getTag(C0778c.f5314H);
        List<C7535k.a> list2 = list;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }

    /* renamed from: a */
    public boolean mo4643a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f35492a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C7536l mo4644b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f35492a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C7536l(accessibilityNodeProvider);
        }
        return null;
    }

    /* renamed from: d */
    public View.AccessibilityDelegate m31368d() {
        return this.f35493b;
    }

    /* renamed from: e */
    public final boolean m31369e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan == null) {
            return false;
        }
        ClickableSpan[] m32177p = C7535k.m32177p(view.createAccessibilityNodeInfo().getText());
        for (int i10 = 0; m32177p != null && i10 < m32177p.length; i10++) {
            if (clickableSpan.equals(m32177p[i10])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo1935f(View view, AccessibilityEvent accessibilityEvent) {
        this.f35492a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo1936g(View view, C7535k c7535k) {
        this.f35492a.onInitializeAccessibilityNodeInfo(view, c7535k.m32245w0());
    }

    /* renamed from: h */
    public void mo4645h(View view, AccessibilityEvent accessibilityEvent) {
        this.f35492a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean mo4646i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f35492a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo1937j(View view, int i10, Bundle bundle) {
        boolean z10;
        List<C7535k.a> m31367c = m31367c(view);
        int i11 = 0;
        while (true) {
            z10 = false;
            if (i11 >= m31367c.size()) {
                break;
            }
            C7535k.a aVar = m31367c.get(i11);
            if (aVar.m32250b() == i10) {
                z10 = aVar.m32252d(view, bundle);
                break;
            }
            i11++;
        }
        boolean z11 = z10;
        if (!z10) {
            z11 = this.f35492a.performAccessibilityAction(view, i10, bundle);
        }
        boolean z12 = z11;
        if (!z11) {
            z12 = z11;
            if (i10 == C0778c.f5326a) {
                z12 = m31370k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
            }
        }
        return z12;
    }

    /* renamed from: k */
    public final boolean m31370k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C0778c.f5315I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m31369e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* renamed from: l */
    public void mo4647l(View view, int i10) {
        this.f35492a.sendAccessibilityEvent(view, i10);
    }

    /* renamed from: m */
    public void mo4648m(View view, AccessibilityEvent accessibilityEvent) {
        this.f35492a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
