package p418y5;

import android.animation.ValueAnimator;
import android.os.Build;
import p364v5.C9246d;
import p398x5.AbstractC9663a;
import p398x5.AbstractC9668f;
import p398x5.C9664b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y5/b.class
 */
/* renamed from: y5.b */
/* loaded from: combined.jar:classes1.jar:y5/b.class */
public class C9826b extends AbstractC9663a {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:y5/b$a.class
     */
    /* renamed from: y5.b$a */
    /* loaded from: combined.jar:classes1.jar:y5/b$a.class */
    public class a extends C9664b {

        /* renamed from: I */
        public final C9826b f45159I;

        public a(C9826b c9826b) {
            this.f45159I = c9826b;
            m40598C(0.0f);
        }

        @Override // p398x5.AbstractC9668f
        /* renamed from: r */
        public ValueAnimator mo40620r() {
            float[] fArr = {0.0f, 0.5f, 1.0f};
            C9246d c9246d = new C9246d(this);
            Float valueOf = Float.valueOf(0.0f);
            return c9246d.m38996l(fArr, valueOf, Float.valueOf(1.0f), valueOf).m38987c(1200L).m38988d(fArr).m38986b();
        }
    }

    @Override // p398x5.AbstractC9669g
    /* renamed from: O */
    public AbstractC9668f[] mo40654O() {
        a[] aVarArr = new a[12];
        for (int i10 = 0; i10 < 12; i10++) {
            a aVar = new a(this);
            aVarArr[i10] = aVar;
            aVar.m40622t(Build.VERSION.SDK_INT >= 24 ? i10 * 100 : (i10 * 100) - 1200);
        }
        return aVarArr;
    }
}
