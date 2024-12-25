package p261p0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:p0/l.class
 */
/* renamed from: p0.l */
/* loaded from: combined.jar:classes1.jar:p0/l.class */
public class C7536l {

    /* renamed from: a */
    public final Object f36368a;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p0/l$a.class
     */
    /* renamed from: p0.l$a */
    /* loaded from: combined.jar:classes1.jar:p0/l$a.class */
    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a */
        public final C7536l f36369a;

        public a(C7536l c7536l) {
            this.f36369a = c7536l;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            C7535k mo32256b = this.f36369a.mo32256b(i10);
            if (mo32256b == null) {
                return null;
            }
            return mo32256b.m32245w0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            List<C7535k> m32257c = this.f36369a.m32257c(str, i10);
            if (m32257c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = m32257c.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(m32257c.get(i11).m32245w0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f36369a.mo32260f(i10, i11, bundle);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p0/l$b.class
     */
    /* renamed from: p0.l$b */
    /* loaded from: combined.jar:classes1.jar:p0/l$b.class */
    public static class b extends a {
        public b(C7536l c7536l) {
            super(c7536l);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            C7535k mo32258d = this.f36369a.mo32258d(i10);
            if (mo32258d == null) {
                return null;
            }
            return mo32258d.m32245w0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p0/l$c.class
     */
    /* renamed from: p0.l$c */
    /* loaded from: combined.jar:classes1.jar:p0/l$c.class */
    public static class c extends b {
        public c(C7536l c7536l) {
            super(c7536l);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f36369a.m32255a(i10, C7535k.m32178x0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C7536l() {
        this.f36368a = Build.VERSION.SDK_INT >= 26 ? new c(this) : new b(this);
    }

    public C7536l(Object obj) {
        this.f36368a = obj;
    }

    /* renamed from: a */
    public void m32255a(int i10, C7535k c7535k, String str, Bundle bundle) {
    }

    /* renamed from: b */
    public C7535k mo32256b(int i10) {
        return null;
    }

    /* renamed from: c */
    public List<C7535k> m32257c(String str, int i10) {
        return null;
    }

    /* renamed from: d */
    public C7535k mo32258d(int i10) {
        return null;
    }

    /* renamed from: e */
    public Object m32259e() {
        return this.f36368a;
    }

    /* renamed from: f */
    public boolean mo32260f(int i10, int i11, Bundle bundle) {
        return false;
    }
}
