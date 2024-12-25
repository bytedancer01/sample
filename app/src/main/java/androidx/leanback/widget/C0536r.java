package androidx.leanback.widget;

import android.view.View;
import androidx.leanback.widget.C0538s;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/r.class
 */
/* renamed from: androidx.leanback.widget.r */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/r.class */
public class C0536r {

    /* renamed from: a */
    public int f3579a = 0;

    /* renamed from: b */
    public final a f3580b;

    /* renamed from: c */
    public final a f3581c;

    /* renamed from: d */
    public a f3582d;

    /* renamed from: e */
    public a f3583e;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/r$a.class
     */
    /* renamed from: androidx.leanback.widget.r$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/r$a.class */
    public static final class a extends C0538s.a {

        /* renamed from: g */
        public int f3584g;

        public a(int i10) {
            this.f3584g = i10;
        }

        /* renamed from: j */
        public int m2942j(View view) {
            return C0540t.m2993a(view, this, this.f3584g);
        }
    }

    public C0536r() {
        a aVar = new a(1);
        this.f3580b = aVar;
        a aVar2 = new a(0);
        this.f3581c = aVar2;
        this.f3582d = aVar2;
        this.f3583e = aVar;
    }

    /* renamed from: a */
    public final a m2940a() {
        return this.f3582d;
    }

    /* renamed from: b */
    public final void m2941b(int i10) {
        a aVar;
        this.f3579a = i10;
        if (i10 == 0) {
            this.f3582d = this.f3581c;
            aVar = this.f3580b;
        } else {
            this.f3582d = this.f3580b;
            aVar = this.f3581c;
        }
        this.f3583e = aVar;
    }
}
