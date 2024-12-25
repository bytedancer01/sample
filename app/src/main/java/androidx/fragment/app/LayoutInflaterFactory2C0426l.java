package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/l.class
 */
/* renamed from: androidx.fragment.app.l */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/l.class */
public class LayoutInflaterFactory2C0426l implements LayoutInflater.Factory2 {

    /* renamed from: b */
    public final AbstractC0428n f2910b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/l$a.class
     */
    /* renamed from: androidx.fragment.app.l$a */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/l$a.class */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final C0436v f2911b;

        /* renamed from: c */
        public final LayoutInflaterFactory2C0426l f2912c;

        public a(LayoutInflaterFactory2C0426l layoutInflaterFactory2C0426l, C0436v c0436v) {
            this.f2912c = layoutInflaterFactory2C0426l;
            this.f2911b = c0436v;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment m2323k = this.f2911b.m2323k();
            this.f2911b.m2325m();
            AbstractC0417e0.m2042n((ViewGroup) m2323k.mView.getParent(), this.f2912c.f2910b).m2052j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public LayoutInflaterFactory2C0426l(AbstractC0428n abstractC0428n) {
        this.f2910b = abstractC0428n;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02a3  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onCreateView(android.view.View r7, java.lang.String r8, android.content.Context r9, android.util.AttributeSet r10) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflaterFactory2C0426l.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
