package p418y5;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import p364v5.C9246d;
import p398x5.AbstractC9668f;
import p398x5.AbstractC9669g;
import p398x5.C9665c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y5/n.class
 */
/* renamed from: y5.n */
/* loaded from: combined.jar:classes1.jar:y5/n.class */
public class C9838n extends AbstractC9669g {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:y5/n$a.class
     */
    /* renamed from: y5.n$a */
    /* loaded from: combined.jar:classes1.jar:y5/n$a.class */
    public class a extends C9665c {

        /* renamed from: I */
        public int f45166I;

        /* renamed from: J */
        public final C9838n f45167J;

        public a(C9838n c9838n, int i10) {
            this.f45167J = c9838n;
            this.f45166I = i10;
        }

        @Override // p398x5.AbstractC9668f
        /* renamed from: r */
        public ValueAnimator mo40620r() {
            float[] fArr = {0.0f, 0.25f, 0.5f, 0.51f, 0.75f, 1.0f};
            C9246d m38993i = new C9246d(this).m38993i(fArr, 0, -90, -179, -180, -270, -360);
            Float valueOf = Float.valueOf(0.0f);
            Float valueOf2 = Float.valueOf(0.75f);
            C9246d m39000p = m38993i.m38999o(fArr, valueOf, valueOf2, valueOf2, valueOf2, valueOf, valueOf).m39000p(fArr, valueOf, valueOf, valueOf2, valueOf2, valueOf2, valueOf);
            Float valueOf3 = Float.valueOf(1.0f);
            Float valueOf4 = Float.valueOf(0.5f);
            C9246d m38988d = m39000p.m38996l(fArr, valueOf3, valueOf4, valueOf3, valueOf3, valueOf4, valueOf3).m38987c(1800L).m38988d(fArr);
            if (Build.VERSION.SDK_INT >= 24) {
                m38988d.m38998n(this.f45166I);
            }
            return m38988d.m38986b();
        }
    }

    @Override // p398x5.AbstractC9669g
    /* renamed from: N */
    public void mo40653N(AbstractC9668f... abstractC9668fArr) {
        super.mo40653N(abstractC9668fArr);
        if (Build.VERSION.SDK_INT < 24) {
            abstractC9668fArr[1].m40622t(-900);
        }
    }

    @Override // p398x5.AbstractC9669g
    /* renamed from: O */
    public AbstractC9668f[] mo40654O() {
        return new AbstractC9668f[]{new a(this, 0), new a(this, 3)};
    }

    @Override // p398x5.AbstractC9669g, p398x5.AbstractC9668f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Rect m40605a = m40605a(rect);
        super.onBoundsChange(m40605a);
        for (int i10 = 0; i10 < m40651L(); i10++) {
            AbstractC9668f m40650K = m40650K(i10);
            int i11 = m40605a.left;
            m40650K.m40623v(i11, m40605a.top, (m40605a.width() / 4) + i11, m40605a.top + (m40605a.height() / 4));
        }
    }
}
