package p404xb;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p385wb.C9558a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xb/m.class
 */
/* renamed from: xb.m */
/* loaded from: combined.jar:classes2.jar:xb/m.class */
public class C9718m {

    /* renamed from: a */
    @Deprecated
    public float f44348a;

    /* renamed from: b */
    @Deprecated
    public float f44349b;

    /* renamed from: c */
    @Deprecated
    public float f44350c;

    /* renamed from: d */
    @Deprecated
    public float f44351d;

    /* renamed from: e */
    @Deprecated
    public float f44352e;

    /* renamed from: f */
    @Deprecated
    public float f44353f;

    /* renamed from: g */
    public final List<f> f44354g = new ArrayList();

    /* renamed from: h */
    public final List<g> f44355h = new ArrayList();

    /* renamed from: i */
    public boolean f44356i;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xb/m$a.class
     */
    /* renamed from: xb.m$a */
    /* loaded from: combined.jar:classes2.jar:xb/m$a.class */
    public class a extends g {

        /* renamed from: b */
        public final List f44357b;

        /* renamed from: c */
        public final Matrix f44358c;

        /* renamed from: d */
        public final C9718m f44359d;

        public a(C9718m c9718m, List list, Matrix matrix) {
            this.f44359d = c9718m;
            this.f44357b = list;
            this.f44358c = matrix;
        }

        @Override // p404xb.C9718m.g
        /* renamed from: a */
        public void mo40973a(Matrix matrix, C9558a c9558a, int i10, Canvas canvas) {
            Iterator it = this.f44357b.iterator();
            while (it.hasNext()) {
                ((g) it.next()).mo40973a(this.f44358c, c9558a, i10, canvas);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xb/m$b.class
     */
    /* renamed from: xb.m$b */
    /* loaded from: combined.jar:classes2.jar:xb/m$b.class */
    public static class b extends g {

        /* renamed from: b */
        public final d f44360b;

        public b(d dVar) {
            this.f44360b = dVar;
        }

        @Override // p404xb.C9718m.g
        /* renamed from: a */
        public void mo40973a(Matrix matrix, C9558a c9558a, int i10, Canvas canvas) {
            c9558a.m40093a(canvas, matrix, new RectF(this.f44360b.m40985k(), this.f44360b.m40989o(), this.f44360b.m40986l(), this.f44360b.m40984j()), i10, this.f44360b.m40987m(), this.f44360b.m40988n());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xb/m$c.class
     */
    /* renamed from: xb.m$c */
    /* loaded from: combined.jar:classes2.jar:xb/m$c.class */
    public static class c extends g {

        /* renamed from: b */
        public final e f44361b;

        /* renamed from: c */
        public final float f44362c;

        /* renamed from: d */
        public final float f44363d;

        public c(e eVar, float f10, float f11) {
            this.f44361b = eVar;
            this.f44362c = f10;
            this.f44363d = f11;
        }

        @Override // p404xb.C9718m.g
        /* renamed from: a */
        public void mo40973a(Matrix matrix, C9558a c9558a, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f44361b.f44372c - this.f44363d, this.f44361b.f44371b - this.f44362c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f44362c, this.f44363d);
            matrix2.preRotate(m40974c());
            c9558a.m40094b(canvas, matrix2, rectF, i10);
        }

        /* renamed from: c */
        public float m40974c() {
            return (float) Math.toDegrees(Math.atan((this.f44361b.f44372c - this.f44363d) / (this.f44361b.f44371b - this.f44362c)));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xb/m$d.class
     */
    /* renamed from: xb.m$d */
    /* loaded from: combined.jar:classes2.jar:xb/m$d.class */
    public static class d extends f {

        /* renamed from: h */
        public static final RectF f44364h = new RectF();

        /* renamed from: b */
        @Deprecated
        public float f44365b;

        /* renamed from: c */
        @Deprecated
        public float f44366c;

        /* renamed from: d */
        @Deprecated
        public float f44367d;

        /* renamed from: e */
        @Deprecated
        public float f44368e;

        /* renamed from: f */
        @Deprecated
        public float f44369f;

        /* renamed from: g */
        @Deprecated
        public float f44370g;

        public d(float f10, float f11, float f12, float f13) {
            m40991q(f10);
            m40995u(f11);
            m40992r(f12);
            m40990p(f13);
        }

        @Override // p404xb.C9718m.f
        /* renamed from: a */
        public void mo40983a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f44373a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f44364h;
            rectF.set(m40985k(), m40989o(), m40986l(), m40984j());
            path.arcTo(rectF, m40987m(), m40988n(), false);
            path.transform(matrix);
        }

        /* renamed from: j */
        public final float m40984j() {
            return this.f44368e;
        }

        /* renamed from: k */
        public final float m40985k() {
            return this.f44365b;
        }

        /* renamed from: l */
        public final float m40986l() {
            return this.f44367d;
        }

        /* renamed from: m */
        public final float m40987m() {
            return this.f44369f;
        }

        /* renamed from: n */
        public final float m40988n() {
            return this.f44370g;
        }

        /* renamed from: o */
        public final float m40989o() {
            return this.f44366c;
        }

        /* renamed from: p */
        public final void m40990p(float f10) {
            this.f44368e = f10;
        }

        /* renamed from: q */
        public final void m40991q(float f10) {
            this.f44365b = f10;
        }

        /* renamed from: r */
        public final void m40992r(float f10) {
            this.f44367d = f10;
        }

        /* renamed from: s */
        public final void m40993s(float f10) {
            this.f44369f = f10;
        }

        /* renamed from: t */
        public final void m40994t(float f10) {
            this.f44370g = f10;
        }

        /* renamed from: u */
        public final void m40995u(float f10) {
            this.f44366c = f10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xb/m$e.class
     */
    /* renamed from: xb.m$e */
    /* loaded from: combined.jar:classes2.jar:xb/m$e.class */
    public static class e extends f {

        /* renamed from: b */
        public float f44371b;

        /* renamed from: c */
        public float f44372c;

        @Override // p404xb.C9718m.f
        /* renamed from: a */
        public void mo40983a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f44373a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f44371b, this.f44372c);
            path.transform(matrix);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xb/m$f.class
     */
    /* renamed from: xb.m$f */
    /* loaded from: combined.jar:classes2.jar:xb/m$f.class */
    public static abstract class f {

        /* renamed from: a */
        public final Matrix f44373a = new Matrix();

        /* renamed from: a */
        public abstract void mo40983a(Matrix matrix, Path path);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xb/m$g.class
     */
    /* renamed from: xb.m$g */
    /* loaded from: combined.jar:classes2.jar:xb/m$g.class */
    public static abstract class g {

        /* renamed from: a */
        public static final Matrix f44374a = new Matrix();

        /* renamed from: a */
        public abstract void mo40973a(Matrix matrix, C9558a c9558a, int i10, Canvas canvas);

        /* renamed from: b */
        public final void m41000b(C9558a c9558a, int i10, Canvas canvas) {
            mo40973a(f44374a, c9558a, i10, canvas);
        }
    }

    public C9718m() {
        m40965n(0.0f, 0.0f);
    }

    /* renamed from: a */
    public void m40952a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.m40993s(f14);
        dVar.m40994t(f15);
        this.f44354g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        float f17 = f14;
        if (z10) {
            f17 = (f14 + 180.0f) % 360.0f;
        }
        m40954c(bVar, f17, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = f16;
        m40969r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        m40970s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    /* renamed from: b */
    public final void m40953b(float f10) {
        if (m40958g() == f10) {
            return;
        }
        float m40958g = ((f10 - m40958g()) + 360.0f) % 360.0f;
        if (m40958g > 180.0f) {
            return;
        }
        d dVar = new d(m40960i(), m40961j(), m40960i(), m40961j());
        dVar.m40993s(m40958g());
        dVar.m40994t(m40958g);
        this.f44355h.add(new b(dVar));
        m40967p(f10);
    }

    /* renamed from: c */
    public final void m40954c(g gVar, float f10, float f11) {
        m40953b(f10);
        this.f44355h.add(gVar);
        m40967p(f11);
    }

    /* renamed from: d */
    public void m40955d(Matrix matrix, Path path) {
        int size = this.f44354g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f44354g.get(i10).mo40983a(matrix, path);
        }
    }

    /* renamed from: e */
    public boolean m40956e() {
        return this.f44356i;
    }

    /* renamed from: f */
    public g m40957f(Matrix matrix) {
        m40953b(m40959h());
        return new a(this, new ArrayList(this.f44355h), new Matrix(matrix));
    }

    /* renamed from: g */
    public final float m40958g() {
        return this.f44352e;
    }

    /* renamed from: h */
    public final float m40959h() {
        return this.f44353f;
    }

    /* renamed from: i */
    public float m40960i() {
        return this.f44350c;
    }

    /* renamed from: j */
    public float m40961j() {
        return this.f44351d;
    }

    /* renamed from: k */
    public float m40962k() {
        return this.f44348a;
    }

    /* renamed from: l */
    public float m40963l() {
        return this.f44349b;
    }

    /* renamed from: m */
    public void m40964m(float f10, float f11) {
        e eVar = new e();
        eVar.f44371b = f10;
        eVar.f44372c = f11;
        this.f44354g.add(eVar);
        c cVar = new c(eVar, m40960i(), m40961j());
        m40954c(cVar, cVar.m40974c() + 270.0f, cVar.m40974c() + 270.0f);
        m40969r(f10);
        m40970s(f11);
    }

    /* renamed from: n */
    public void m40965n(float f10, float f11) {
        m40966o(f10, f11, 270.0f, 0.0f);
    }

    /* renamed from: o */
    public void m40966o(float f10, float f11, float f12, float f13) {
        m40971t(f10);
        m40972u(f11);
        m40969r(f10);
        m40970s(f11);
        m40967p(f12);
        m40968q((f12 + f13) % 360.0f);
        this.f44354g.clear();
        this.f44355h.clear();
        this.f44356i = false;
    }

    /* renamed from: p */
    public final void m40967p(float f10) {
        this.f44352e = f10;
    }

    /* renamed from: q */
    public final void m40968q(float f10) {
        this.f44353f = f10;
    }

    /* renamed from: r */
    public final void m40969r(float f10) {
        this.f44350c = f10;
    }

    /* renamed from: s */
    public final void m40970s(float f10) {
        this.f44351d = f10;
    }

    /* renamed from: t */
    public final void m40971t(float f10) {
        this.f44348a = f10;
    }

    /* renamed from: u */
    public final void m40972u(float f10) {
        this.f44349b = f10;
    }
}
