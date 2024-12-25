package p318s4;

import android.graphics.drawable.Drawable;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import p318s4.C8530f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:s4/a.class
 */
/* renamed from: s4.a */
/* loaded from: combined.jar:classes1.jar:s4/a.class */
public class C8525a<T extends Drawable> implements InterfaceC8528d<T> {

    /* renamed from: a */
    public final C8531g<T> f39900a;

    /* renamed from: b */
    public final int f39901b;

    /* renamed from: c */
    public C8526b<T> f39902c;

    /* renamed from: d */
    public C8526b<T> f39903d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:s4/a$a.class
     */
    /* renamed from: s4.a$a */
    /* loaded from: combined.jar:classes1.jar:s4/a$a.class */
    public static class a implements C8530f.a {

        /* renamed from: a */
        public final int f39904a;

        public a(int i10) {
            this.f39904a = i10;
        }

        @Override // p318s4.C8530f.a
        public Animation build() {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(this.f39904a);
            return alphaAnimation;
        }
    }

    public C8525a() {
        this(300);
    }

    public C8525a(int i10) {
        this(new C8531g(new a(i10)), i10);
    }

    public C8525a(C8531g<T> c8531g, int i10) {
        this.f39900a = c8531g;
        this.f39901b = i10;
    }

    @Override // p318s4.InterfaceC8528d
    /* renamed from: a */
    public InterfaceC8527c<T> mo36741a(boolean z10, boolean z11) {
        return z10 ? C8529e.m36749c() : z11 ? m36742b() : m36743c();
    }

    /* renamed from: b */
    public final InterfaceC8527c<T> m36742b() {
        if (this.f39902c == null) {
            this.f39902c = new C8526b<>(this.f39900a.mo36741a(false, true), this.f39901b);
        }
        return this.f39902c;
    }

    /* renamed from: c */
    public final InterfaceC8527c<T> m36743c() {
        if (this.f39903d == null) {
            this.f39903d = new C8526b<>(this.f39900a.mo36741a(false, false), this.f39901b);
        }
        return this.f39903d;
    }
}
