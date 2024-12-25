package p418y5;

import android.animation.ValueAnimator;
import android.os.Build;
import p364v5.C9246d;
import p398x5.AbstractC9663a;
import p398x5.AbstractC9668f;
import p398x5.C9664b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y5/e.class
 */
/* renamed from: y5.e */
/* loaded from: combined.jar:classes1.jar:y5/e.class */
public class C9829e extends AbstractC9663a {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:y5/e$a.class
     */
    /* renamed from: y5.e$a */
    /* loaded from: combined.jar:classes1.jar:y5/e$a.class */
    public class a extends C9664b {

        /* renamed from: I */
        public final C9829e f45162I;

        public a(C9829e c9829e) {
            this.f45162I = c9829e;
            setAlpha(0);
        }

        @Override // p398x5.AbstractC9668f
        /* renamed from: r */
        public ValueAnimator mo40620r() {
            float[] fArr = {0.0f, 0.39f, 0.4f, 1.0f};
            return new C9246d(this).m38985a(fArr, 0, 0, 255, 0).m38987c(1200L).m38988d(fArr).m38986b();
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
