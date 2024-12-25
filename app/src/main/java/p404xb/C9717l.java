package p404xb;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xb/l.class
 */
/* renamed from: xb.l */
/* loaded from: combined.jar:classes2.jar:xb/l.class */
public class C9717l {

    /* renamed from: a */
    public final C9718m[] f44330a = new C9718m[4];

    /* renamed from: b */
    public final Matrix[] f44331b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f44332c = new Matrix[4];

    /* renamed from: d */
    public final PointF f44333d = new PointF();

    /* renamed from: e */
    public final Path f44334e = new Path();

    /* renamed from: f */
    public final Path f44335f = new Path();

    /* renamed from: g */
    public final C9718m f44336g = new C9718m();

    /* renamed from: h */
    public final float[] f44337h = new float[2];

    /* renamed from: i */
    public final float[] f44338i = new float[2];

    /* renamed from: j */
    public final Path f44339j = new Path();

    /* renamed from: k */
    public final Path f44340k = new Path();

    /* renamed from: l */
    public boolean f44341l = true;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xb/l$a.class
     */
    /* renamed from: xb.l$a */
    /* loaded from: combined.jar:classes2.jar:xb/l$a.class */
    public static class a {

        /* renamed from: a */
        public static final C9717l f44342a = new C9717l();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xb/l$b.class
     */
    /* renamed from: xb.l$b */
    /* loaded from: combined.jar:classes2.jar:xb/l$b.class */
    public interface b {
        /* renamed from: a */
        void mo40872a(C9718m c9718m, Matrix matrix, int i10);

        /* renamed from: b */
        void mo40873b(C9718m c9718m, Matrix matrix, int i10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xb/l$c.class
     */
    /* renamed from: xb.l$c */
    /* loaded from: combined.jar:classes2.jar:xb/l$c.class */
    public static final class c {

        /* renamed from: a */
        public final C9716k f44343a;

        /* renamed from: b */
        public final Path f44344b;

        /* renamed from: c */
        public final RectF f44345c;

        /* renamed from: d */
        public final b f44346d;

        /* renamed from: e */
        public final float f44347e;

        public c(C9716k c9716k, float f10, RectF rectF, b bVar, Path path) {
            this.f44346d = bVar;
            this.f44343a = c9716k;
            this.f44347e = f10;
            this.f44345c = rectF;
            this.f44344b = path;
        }
    }

    public C9717l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f44330a[i10] = new C9718m();
            this.f44331b[i10] = new Matrix();
            this.f44332c[i10] = new Matrix();
        }
    }

    /* renamed from: k */
    public static C9717l m40938k() {
        return a.f44342a;
    }

    /* renamed from: a */
    public final float m40939a(int i10) {
        return (i10 + 1) * 90;
    }

    /* renamed from: b */
    public final void m40940b(c cVar, int i10) {
        this.f44337h[0] = this.f44330a[i10].m40962k();
        this.f44337h[1] = this.f44330a[i10].m40963l();
        this.f44331b[i10].mapPoints(this.f44337h);
        Path path = cVar.f44344b;
        float[] fArr = this.f44337h;
        if (i10 == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f44330a[i10].m40955d(this.f44331b[i10], cVar.f44344b);
        b bVar = cVar.f44346d;
        if (bVar != null) {
            bVar.mo40872a(this.f44330a[i10], this.f44331b[i10], i10);
        }
    }

    /* renamed from: c */
    public final void m40941c(c cVar, int i10) {
        C9718m c9718m;
        Matrix matrix;
        Path path;
        int i11 = (i10 + 1) % 4;
        this.f44337h[0] = this.f44330a[i10].m40960i();
        this.f44337h[1] = this.f44330a[i10].m40961j();
        this.f44331b[i10].mapPoints(this.f44337h);
        this.f44338i[0] = this.f44330a[i11].m40962k();
        this.f44338i[1] = this.f44330a[i11].m40963l();
        this.f44331b[i11].mapPoints(this.f44338i);
        float f10 = this.f44337h[0];
        float[] fArr = this.f44338i;
        float max = Math.max(((float) Math.hypot(f10 - fArr[0], r0[1] - fArr[1])) - 0.001f, 0.0f);
        float m40947i = m40947i(cVar.f44345c, i10);
        this.f44336g.m40965n(0.0f, 0.0f);
        C9711f m40948j = m40948j(i10, cVar.f44343a);
        m40948j.mo23621b(max, m40947i, cVar.f44347e, this.f44336g);
        this.f44339j.reset();
        this.f44336g.m40955d(this.f44332c[i10], this.f44339j);
        if (this.f44341l && (m40948j.m40812a() || m40949l(this.f44339j, i10) || m40949l(this.f44339j, i11))) {
            Path path2 = this.f44339j;
            path2.op(path2, this.f44335f, Path.Op.DIFFERENCE);
            this.f44337h[0] = this.f44336g.m40962k();
            this.f44337h[1] = this.f44336g.m40963l();
            this.f44332c[i10].mapPoints(this.f44337h);
            Path path3 = this.f44334e;
            float[] fArr2 = this.f44337h;
            path3.moveTo(fArr2[0], fArr2[1]);
            c9718m = this.f44336g;
            matrix = this.f44332c[i10];
            path = this.f44334e;
        } else {
            c9718m = this.f44336g;
            matrix = this.f44332c[i10];
            path = cVar.f44344b;
        }
        c9718m.m40955d(matrix, path);
        b bVar = cVar.f44346d;
        if (bVar != null) {
            bVar.mo40873b(this.f44336g, this.f44332c[i10], i10);
        }
    }

    /* renamed from: d */
    public void m40942d(C9716k c9716k, float f10, RectF rectF, Path path) {
        m40943e(c9716k, f10, rectF, null, path);
    }

    /* renamed from: e */
    public void m40943e(C9716k c9716k, float f10, RectF rectF, b bVar, Path path) {
        int i10;
        path.rewind();
        this.f44334e.rewind();
        this.f44335f.rewind();
        this.f44335f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(c9716k, f10, rectF, bVar, path);
        int i11 = 0;
        while (true) {
            if (i11 >= 4) {
                break;
            }
            m40950m(cVar, i11);
            m40951n(i11);
            i11++;
        }
        for (i10 = 0; i10 < 4; i10++) {
            m40940b(cVar, i10);
            m40941c(cVar, i10);
        }
        path.close();
        this.f44334e.close();
        if (this.f44334e.isEmpty()) {
            return;
        }
        path.op(this.f44334e, Path.Op.UNION);
    }

    /* renamed from: f */
    public final void m40944f(int i10, RectF rectF, PointF pointF) {
        float f10;
        float f11;
        if (i10 == 1) {
            f10 = rectF.right;
        } else {
            if (i10 != 2) {
                f10 = i10 != 3 ? rectF.right : rectF.left;
                f11 = rectF.top;
                pointF.set(f10, f11);
            }
            f10 = rectF.left;
        }
        f11 = rectF.bottom;
        pointF.set(f10, f11);
    }

    /* renamed from: g */
    public final InterfaceC9708c m40945g(int i10, C9716k c9716k) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? c9716k.m40900t() : c9716k.m40898r() : c9716k.m40891j() : c9716k.m40893l();
    }

    /* renamed from: h */
    public final C9709d m40946h(int i10, C9716k c9716k) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? c9716k.m40899s() : c9716k.m40897q() : c9716k.m40890i() : c9716k.m40892k();
    }

    /* renamed from: i */
    public final float m40947i(RectF rectF, int i10) {
        float centerX;
        float f10;
        float[] fArr = this.f44337h;
        C9718m c9718m = this.f44330a[i10];
        fArr[0] = c9718m.f44350c;
        fArr[1] = c9718m.f44351d;
        this.f44331b[i10].mapPoints(fArr);
        if (i10 == 1 || i10 == 3) {
            centerX = rectF.centerX();
            f10 = this.f44337h[0];
        } else {
            centerX = rectF.centerY();
            f10 = this.f44337h[1];
        }
        return Math.abs(centerX - f10);
    }

    /* renamed from: j */
    public final C9711f m40948j(int i10, C9716k c9716k) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? c9716k.m40895o() : c9716k.m40896p() : c9716k.m40894n() : c9716k.m40889h();
    }

    /* renamed from: l */
    public final boolean m40949l(Path path, int i10) {
        this.f44340k.reset();
        this.f44330a[i10].m40955d(this.f44331b[i10], this.f44340k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f44340k.computeBounds(rectF, true);
        path.op(this.f44340k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        boolean z10 = true;
        if (rectF.isEmpty()) {
            z10 = rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return z10;
    }

    /* renamed from: m */
    public final void m40950m(c cVar, int i10) {
        m40946h(i10, cVar.f44343a).m40811b(this.f44330a[i10], 90.0f, cVar.f44347e, cVar.f44345c, m40945g(i10, cVar.f44343a));
        float m40939a = m40939a(i10);
        this.f44331b[i10].reset();
        m40944f(i10, cVar.f44345c, this.f44333d);
        Matrix matrix = this.f44331b[i10];
        PointF pointF = this.f44333d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f44331b[i10].preRotate(m40939a);
    }

    /* renamed from: n */
    public final void m40951n(int i10) {
        this.f44337h[0] = this.f44330a[i10].m40960i();
        this.f44337h[1] = this.f44330a[i10].m40961j();
        this.f44331b[i10].mapPoints(this.f44337h);
        float m40939a = m40939a(i10);
        this.f44332c[i10].reset();
        Matrix matrix = this.f44332c[i10];
        float[] fArr = this.f44337h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f44332c[i10].preRotate(m40939a);
    }
}
