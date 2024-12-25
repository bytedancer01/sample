package p418y5;

import android.animation.ValueAnimator;
import android.os.Build;
import p364v5.C9246d;
import p398x5.AbstractC9668f;
import p398x5.AbstractC9669g;
import p398x5.C9664b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y5/d.class
 */
/* renamed from: y5.d */
/* loaded from: combined.jar:classes1.jar:y5/d.class */
public class C9828d extends AbstractC9669g {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:y5/d$a.class
     */
    /* renamed from: y5.d$a */
    /* loaded from: combined.jar:classes1.jar:y5/d$a.class */
    public class a extends C9664b {

        /* renamed from: I */
        public final C9828d f45161I;

        public a(C9828d c9828d) {
            this.f45161I = c9828d;
            setAlpha(153);
            m40598C(0.0f);
        }

        @Override // p398x5.AbstractC9668f
        /* renamed from: r */
        public ValueAnimator mo40620r() {
            float[] fArr = {0.0f, 0.5f, 1.0f};
            C9246d c9246d = new C9246d(this);
            Float valueOf = Float.valueOf(0.0f);
            return c9246d.m38996l(fArr, valueOf, Float.valueOf(1.0f), valueOf).m38987c(2000L).m38988d(fArr).m38986b();
        }
    }

    @Override // p398x5.AbstractC9669g
    /* renamed from: N */
    public void mo40653N(AbstractC9668f... abstractC9668fArr) {
        AbstractC9668f abstractC9668f;
        int i10;
        super.mo40653N(abstractC9668fArr);
        if (Build.VERSION.SDK_INT >= 24) {
            abstractC9668f = abstractC9668fArr[1];
            i10 = 1000;
        } else {
            abstractC9668f = abstractC9668fArr[1];
            i10 = -1000;
        }
        abstractC9668f.m40622t(i10);
    }

    @Override // p398x5.AbstractC9669g
    /* renamed from: O */
    public AbstractC9668f[] mo40654O() {
        return new AbstractC9668f[]{new a(this), new a(this)};
    }
}
