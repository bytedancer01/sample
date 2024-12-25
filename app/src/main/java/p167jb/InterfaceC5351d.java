package p167jb;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import sb.C8553a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:jb/d.class
 */
/* renamed from: jb.d */
/* loaded from: combined.jar:classes2.jar:jb/d.class */
public interface InterfaceC5351d {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jb/d$b.class
     */
    /* renamed from: jb.d$b */
    /* loaded from: combined.jar:classes2.jar:jb/d$b.class */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b */
        public static final TypeEvaluator<e> f30660b = new b();

        /* renamed from: a */
        public final e f30661a = new e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f10, e eVar, e eVar2) {
            this.f30661a.m26632a(C8553a.m36784c(eVar.f30664a, eVar2.f30664a, f10), C8553a.m36784c(eVar.f30665b, eVar2.f30665b, f10), C8553a.m36784c(eVar.f30666c, eVar2.f30666c, f10));
            return this.f30661a;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jb/d$c.class
     */
    /* renamed from: jb.d$c */
    /* loaded from: combined.jar:classes2.jar:jb/d$c.class */
    public static class c extends Property<InterfaceC5351d, e> {

        /* renamed from: a */
        public static final Property<InterfaceC5351d, e> f30662a = new c("circularReveal");

        public c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(InterfaceC5351d interfaceC5351d) {
            return interfaceC5351d.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(InterfaceC5351d interfaceC5351d, e eVar) {
            interfaceC5351d.setRevealInfo(eVar);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jb/d$d.class
     */
    /* renamed from: jb.d$d */
    /* loaded from: combined.jar:classes2.jar:jb/d$d.class */
    public static class d extends Property<InterfaceC5351d, Integer> {

        /* renamed from: a */
        public static final Property<InterfaceC5351d, Integer> f30663a = new d("circularRevealScrimColor");

        public d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(InterfaceC5351d interfaceC5351d) {
            return Integer.valueOf(interfaceC5351d.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(InterfaceC5351d interfaceC5351d, Integer num) {
            interfaceC5351d.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jb/d$e.class
     */
    /* renamed from: jb.d$e */
    /* loaded from: combined.jar:classes2.jar:jb/d$e.class */
    public static class e {

        /* renamed from: a */
        public float f30664a;

        /* renamed from: b */
        public float f30665b;

        /* renamed from: c */
        public float f30666c;

        public e() {
        }

        public e(float f10, float f11, float f12) {
            this.f30664a = f10;
            this.f30665b = f11;
            this.f30666c = f12;
        }

        /* renamed from: a */
        public void m26632a(float f10, float f11, float f12) {
            this.f30664a = f10;
            this.f30665b = f11;
            this.f30666c = f12;
        }
    }

    /* renamed from: a */
    void mo26625a();

    /* renamed from: b */
    void mo26626b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(e eVar);
}
