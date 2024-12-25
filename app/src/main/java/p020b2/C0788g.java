package p020b2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.apache.http.cookie.ClientCookie;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p069e0.C4563b;
import p069e0.C4568g;
import p069e0.C4570i;
import p087f0.C4740c;
import p106g0.C4917c;
import p294r.C7928a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b2/g.class
 */
/* renamed from: b2.g */
/* loaded from: combined.jar:classes1.jar:b2/g.class */
public class C0788g extends AbstractC0787f {

    /* renamed from: l */
    public static final PorterDuff.Mode f5451l = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public h f5452c;

    /* renamed from: d */
    public PorterDuffColorFilter f5453d;

    /* renamed from: e */
    public ColorFilter f5454e;

    /* renamed from: f */
    public boolean f5455f;

    /* renamed from: g */
    public boolean f5456g;

    /* renamed from: h */
    public Drawable.ConstantState f5457h;

    /* renamed from: i */
    public final float[] f5458i;

    /* renamed from: j */
    public final Matrix f5459j;

    /* renamed from: k */
    public final Rect f5460k;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b2/g$b.class
     */
    /* renamed from: b2.g$b */
    /* loaded from: combined.jar:classes1.jar:b2/g$b.class */
    public static class b extends f {
        public b() {
        }

        public b(b bVar) {
            super(bVar);
        }

        @Override // p020b2.C0788g.f
        /* renamed from: c */
        public boolean mo5056c() {
            return true;
        }

        /* renamed from: e */
        public void m5057e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C4570i.m23086r(xmlPullParser, "pathData")) {
                TypedArray m23087s = C4570i.m23087s(resources, theme, attributeSet, C0782a.f5426d);
                m5058f(m23087s, xmlPullParser);
                m23087s.recycle();
            }
        }

        /* renamed from: f */
        public final void m5058f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f5487b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f5486a = C4740c.m23983d(string2);
            }
            this.f5488c = C4570i.m23079k(typedArray, xmlPullParser, "fillType", 2, 0);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b2/g$c.class
     */
    /* renamed from: b2.g$c */
    /* loaded from: combined.jar:classes1.jar:b2/g$c.class */
    public static class c extends f {

        /* renamed from: e */
        public int[] f5461e;

        /* renamed from: f */
        public C4563b f5462f;

        /* renamed from: g */
        public float f5463g;

        /* renamed from: h */
        public C4563b f5464h;

        /* renamed from: i */
        public float f5465i;

        /* renamed from: j */
        public float f5466j;

        /* renamed from: k */
        public float f5467k;

        /* renamed from: l */
        public float f5468l;

        /* renamed from: m */
        public float f5469m;

        /* renamed from: n */
        public Paint.Cap f5470n;

        /* renamed from: o */
        public Paint.Join f5471o;

        /* renamed from: p */
        public float f5472p;

        public c() {
            this.f5463g = 0.0f;
            this.f5465i = 1.0f;
            this.f5466j = 1.0f;
            this.f5467k = 0.0f;
            this.f5468l = 1.0f;
            this.f5469m = 0.0f;
            this.f5470n = Paint.Cap.BUTT;
            this.f5471o = Paint.Join.MITER;
            this.f5472p = 4.0f;
        }

        public c(c cVar) {
            super(cVar);
            this.f5463g = 0.0f;
            this.f5465i = 1.0f;
            this.f5466j = 1.0f;
            this.f5467k = 0.0f;
            this.f5468l = 1.0f;
            this.f5469m = 0.0f;
            this.f5470n = Paint.Cap.BUTT;
            this.f5471o = Paint.Join.MITER;
            this.f5472p = 4.0f;
            this.f5461e = cVar.f5461e;
            this.f5462f = cVar.f5462f;
            this.f5463g = cVar.f5463g;
            this.f5465i = cVar.f5465i;
            this.f5464h = cVar.f5464h;
            this.f5488c = cVar.f5488c;
            this.f5466j = cVar.f5466j;
            this.f5467k = cVar.f5467k;
            this.f5468l = cVar.f5468l;
            this.f5469m = cVar.f5469m;
            this.f5470n = cVar.f5470n;
            this.f5471o = cVar.f5471o;
            this.f5472p = cVar.f5472p;
        }

        @Override // p020b2.C0788g.e
        /* renamed from: a */
        public boolean mo5059a() {
            return this.f5464h.m23019i() || this.f5462f.m23019i();
        }

        @Override // p020b2.C0788g.e
        /* renamed from: b */
        public boolean mo5060b(int[] iArr) {
            return this.f5462f.m23020j(iArr) | this.f5464h.m23020j(iArr);
        }

        /* renamed from: e */
        public final Paint.Cap m5061e(int i10, Paint.Cap cap) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        /* renamed from: f */
        public final Paint.Join m5062f(int i10, Paint.Join join) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* renamed from: g */
        public void m5063g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m23087s = C4570i.m23087s(resources, theme, attributeSet, C0782a.f5425c);
            m5064h(m23087s, xmlPullParser, theme);
            m23087s.recycle();
        }

        public float getFillAlpha() {
            return this.f5466j;
        }

        public int getFillColor() {
            return this.f5464h.m23016e();
        }

        public float getStrokeAlpha() {
            return this.f5465i;
        }

        public int getStrokeColor() {
            return this.f5462f.m23016e();
        }

        public float getStrokeWidth() {
            return this.f5463g;
        }

        public float getTrimPathEnd() {
            return this.f5468l;
        }

        public float getTrimPathOffset() {
            return this.f5469m;
        }

        public float getTrimPathStart() {
            return this.f5467k;
        }

        /* renamed from: h */
        public final void m5064h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f5461e = null;
            if (C4570i.m23086r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f5487b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f5486a = C4740c.m23983d(string2);
                }
                this.f5464h = C4570i.m23077i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f5466j = C4570i.m23078j(typedArray, xmlPullParser, "fillAlpha", 12, this.f5466j);
                this.f5470n = m5061e(C4570i.m23079k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f5470n);
                this.f5471o = m5062f(C4570i.m23079k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f5471o);
                this.f5472p = C4570i.m23078j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f5472p);
                this.f5462f = C4570i.m23077i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f5465i = C4570i.m23078j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f5465i);
                this.f5463g = C4570i.m23078j(typedArray, xmlPullParser, "strokeWidth", 4, this.f5463g);
                this.f5468l = C4570i.m23078j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f5468l);
                this.f5469m = C4570i.m23078j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f5469m);
                this.f5467k = C4570i.m23078j(typedArray, xmlPullParser, "trimPathStart", 5, this.f5467k);
                this.f5488c = C4570i.m23079k(typedArray, xmlPullParser, "fillType", 13, this.f5488c);
            }
        }

        public void setFillAlpha(float f10) {
            this.f5466j = f10;
        }

        public void setFillColor(int i10) {
            this.f5464h.m23021k(i10);
        }

        public void setStrokeAlpha(float f10) {
            this.f5465i = f10;
        }

        public void setStrokeColor(int i10) {
            this.f5462f.m23021k(i10);
        }

        public void setStrokeWidth(float f10) {
            this.f5463g = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.f5468l = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f5469m = f10;
        }

        public void setTrimPathStart(float f10) {
            this.f5467k = f10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b2/g$d.class
     */
    /* renamed from: b2.g$d */
    /* loaded from: combined.jar:classes1.jar:b2/g$d.class */
    public static class d extends e {

        /* renamed from: a */
        public final Matrix f5473a;

        /* renamed from: b */
        public final ArrayList<e> f5474b;

        /* renamed from: c */
        public float f5475c;

        /* renamed from: d */
        public float f5476d;

        /* renamed from: e */
        public float f5477e;

        /* renamed from: f */
        public float f5478f;

        /* renamed from: g */
        public float f5479g;

        /* renamed from: h */
        public float f5480h;

        /* renamed from: i */
        public float f5481i;

        /* renamed from: j */
        public final Matrix f5482j;

        /* renamed from: k */
        public int f5483k;

        /* renamed from: l */
        public int[] f5484l;

        /* renamed from: m */
        public String f5485m;

        public d() {
            super();
            this.f5473a = new Matrix();
            this.f5474b = new ArrayList<>();
            this.f5475c = 0.0f;
            this.f5476d = 0.0f;
            this.f5477e = 0.0f;
            this.f5478f = 1.0f;
            this.f5479g = 1.0f;
            this.f5480h = 0.0f;
            this.f5481i = 0.0f;
            this.f5482j = new Matrix();
            this.f5485m = null;
        }

        public d(d dVar, C7928a<String, Object> c7928a) {
            super();
            f bVar;
            this.f5473a = new Matrix();
            this.f5474b = new ArrayList<>();
            this.f5475c = 0.0f;
            this.f5476d = 0.0f;
            this.f5477e = 0.0f;
            this.f5478f = 1.0f;
            this.f5479g = 1.0f;
            this.f5480h = 0.0f;
            this.f5481i = 0.0f;
            Matrix matrix = new Matrix();
            this.f5482j = matrix;
            this.f5485m = null;
            this.f5475c = dVar.f5475c;
            this.f5476d = dVar.f5476d;
            this.f5477e = dVar.f5477e;
            this.f5478f = dVar.f5478f;
            this.f5479g = dVar.f5479g;
            this.f5480h = dVar.f5480h;
            this.f5481i = dVar.f5481i;
            this.f5484l = dVar.f5484l;
            String str = dVar.f5485m;
            this.f5485m = str;
            this.f5483k = dVar.f5483k;
            if (str != null) {
                c7928a.put(str, this);
            }
            matrix.set(dVar.f5482j);
            ArrayList<e> arrayList = dVar.f5474b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.f5474b.add(new d((d) eVar, c7928a));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f5474b.add(bVar);
                    String str2 = bVar.f5487b;
                    if (str2 != null) {
                        c7928a.put(str2, bVar);
                    }
                }
            }
        }

        @Override // p020b2.C0788g.e
        /* renamed from: a */
        public boolean mo5059a() {
            for (int i10 = 0; i10 < this.f5474b.size(); i10++) {
                if (this.f5474b.get(i10).mo5059a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p020b2.C0788g.e
        /* renamed from: b */
        public boolean mo5060b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f5474b.size(); i10++) {
                z10 |= this.f5474b.get(i10).mo5060b(iArr);
            }
            return z10;
        }

        /* renamed from: c */
        public void m5065c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m23087s = C4570i.m23087s(resources, theme, attributeSet, C0782a.f5424b);
            m5067e(m23087s, xmlPullParser);
            m23087s.recycle();
        }

        /* renamed from: d */
        public final void m5066d() {
            this.f5482j.reset();
            this.f5482j.postTranslate(-this.f5476d, -this.f5477e);
            this.f5482j.postScale(this.f5478f, this.f5479g);
            this.f5482j.postRotate(this.f5475c, 0.0f, 0.0f);
            this.f5482j.postTranslate(this.f5480h + this.f5476d, this.f5481i + this.f5477e);
        }

        /* renamed from: e */
        public final void m5067e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f5484l = null;
            this.f5475c = C4570i.m23078j(typedArray, xmlPullParser, "rotation", 5, this.f5475c);
            this.f5476d = typedArray.getFloat(1, this.f5476d);
            this.f5477e = typedArray.getFloat(2, this.f5477e);
            this.f5478f = C4570i.m23078j(typedArray, xmlPullParser, "scaleX", 3, this.f5478f);
            this.f5479g = C4570i.m23078j(typedArray, xmlPullParser, "scaleY", 4, this.f5479g);
            this.f5480h = C4570i.m23078j(typedArray, xmlPullParser, "translateX", 6, this.f5480h);
            this.f5481i = C4570i.m23078j(typedArray, xmlPullParser, "translateY", 7, this.f5481i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f5485m = string;
            }
            m5066d();
        }

        public String getGroupName() {
            return this.f5485m;
        }

        public Matrix getLocalMatrix() {
            return this.f5482j;
        }

        public float getPivotX() {
            return this.f5476d;
        }

        public float getPivotY() {
            return this.f5477e;
        }

        public float getRotation() {
            return this.f5475c;
        }

        public float getScaleX() {
            return this.f5478f;
        }

        public float getScaleY() {
            return this.f5479g;
        }

        public float getTranslateX() {
            return this.f5480h;
        }

        public float getTranslateY() {
            return this.f5481i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f5476d) {
                this.f5476d = f10;
                m5066d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f5477e) {
                this.f5477e = f10;
                m5066d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f5475c) {
                this.f5475c = f10;
                m5066d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f5478f) {
                this.f5478f = f10;
                m5066d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f5479g) {
                this.f5479g = f10;
                m5066d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f5480h) {
                this.f5480h = f10;
                m5066d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f5481i) {
                this.f5481i = f10;
                m5066d();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b2/g$e.class
     */
    /* renamed from: b2.g$e */
    /* loaded from: combined.jar:classes1.jar:b2/g$e.class */
    public static abstract class e {
        public e() {
        }

        /* renamed from: a */
        public boolean mo5059a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo5060b(int[] iArr) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b2/g$f.class
     */
    /* renamed from: b2.g$f */
    /* loaded from: combined.jar:classes1.jar:b2/g$f.class */
    public static abstract class f extends e {

        /* renamed from: a */
        public C4740c.b[] f5486a;

        /* renamed from: b */
        public String f5487b;

        /* renamed from: c */
        public int f5488c;

        /* renamed from: d */
        public int f5489d;

        public f() {
            super();
            this.f5486a = null;
            this.f5488c = 0;
        }

        public f(f fVar) {
            super();
            this.f5486a = null;
            this.f5488c = 0;
            this.f5487b = fVar.f5487b;
            this.f5489d = fVar.f5489d;
            this.f5486a = C4740c.m23985f(fVar.f5486a);
        }

        /* renamed from: c */
        public boolean mo5056c() {
            return false;
        }

        /* renamed from: d */
        public void m5068d(Path path) {
            path.reset();
            C4740c.b[] bVarArr = this.f5486a;
            if (bVarArr != null) {
                C4740c.b.m23993e(bVarArr, path);
            }
        }

        public C4740c.b[] getPathData() {
            return this.f5486a;
        }

        public String getPathName() {
            return this.f5487b;
        }

        public void setPathData(C4740c.b[] bVarArr) {
            if (C4740c.m23981b(this.f5486a, bVarArr)) {
                C4740c.m23989j(this.f5486a, bVarArr);
            } else {
                this.f5486a = C4740c.m23985f(bVarArr);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b2/g$g.class
     */
    /* renamed from: b2.g$g */
    /* loaded from: combined.jar:classes1.jar:b2/g$g.class */
    public static class g {

        /* renamed from: q */
        public static final Matrix f5490q = new Matrix();

        /* renamed from: a */
        public final Path f5491a;

        /* renamed from: b */
        public final Path f5492b;

        /* renamed from: c */
        public final Matrix f5493c;

        /* renamed from: d */
        public Paint f5494d;

        /* renamed from: e */
        public Paint f5495e;

        /* renamed from: f */
        public PathMeasure f5496f;

        /* renamed from: g */
        public int f5497g;

        /* renamed from: h */
        public final d f5498h;

        /* renamed from: i */
        public float f5499i;

        /* renamed from: j */
        public float f5500j;

        /* renamed from: k */
        public float f5501k;

        /* renamed from: l */
        public float f5502l;

        /* renamed from: m */
        public int f5503m;

        /* renamed from: n */
        public String f5504n;

        /* renamed from: o */
        public Boolean f5505o;

        /* renamed from: p */
        public final C7928a<String, Object> f5506p;

        public g() {
            this.f5493c = new Matrix();
            this.f5499i = 0.0f;
            this.f5500j = 0.0f;
            this.f5501k = 0.0f;
            this.f5502l = 0.0f;
            this.f5503m = 255;
            this.f5504n = null;
            this.f5505o = null;
            this.f5506p = new C7928a<>();
            this.f5498h = new d();
            this.f5491a = new Path();
            this.f5492b = new Path();
        }

        public g(g gVar) {
            this.f5493c = new Matrix();
            this.f5499i = 0.0f;
            this.f5500j = 0.0f;
            this.f5501k = 0.0f;
            this.f5502l = 0.0f;
            this.f5503m = 255;
            this.f5504n = null;
            this.f5505o = null;
            C7928a<String, Object> c7928a = new C7928a<>();
            this.f5506p = c7928a;
            this.f5498h = new d(gVar.f5498h, c7928a);
            this.f5491a = new Path(gVar.f5491a);
            this.f5492b = new Path(gVar.f5492b);
            this.f5499i = gVar.f5499i;
            this.f5500j = gVar.f5500j;
            this.f5501k = gVar.f5501k;
            this.f5502l = gVar.f5502l;
            this.f5497g = gVar.f5497g;
            this.f5503m = gVar.f5503m;
            this.f5504n = gVar.f5504n;
            String str = gVar.f5504n;
            if (str != null) {
                c7928a.put(str, this);
            }
            this.f5505o = gVar.f5505o;
        }

        /* renamed from: a */
        public static float m5069a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        /* renamed from: b */
        public void m5070b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            m5071c(this.f5498h, f5490q, canvas, i10, i11, colorFilter);
        }

        /* renamed from: c */
        public final void m5071c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            dVar.f5473a.set(matrix);
            dVar.f5473a.preConcat(dVar.f5482j);
            canvas.save();
            for (int i12 = 0; i12 < dVar.f5474b.size(); i12++) {
                e eVar = dVar.f5474b.get(i12);
                if (eVar instanceof d) {
                    m5071c((d) eVar, dVar.f5473a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    m5072d(dVar, (f) eVar, canvas, i10, i11, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        public final void m5072d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f5501k;
            float f11 = i11 / this.f5502l;
            float min = Math.min(f10, f11);
            Matrix matrix = dVar.f5473a;
            this.f5493c.set(matrix);
            this.f5493c.postScale(f10, f11);
            float m5073e = m5073e(matrix);
            if (m5073e == 0.0f) {
                return;
            }
            fVar.m5068d(this.f5491a);
            Path path = this.f5491a;
            this.f5492b.reset();
            if (fVar.mo5056c()) {
                this.f5492b.setFillType(fVar.f5488c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f5492b.addPath(path, this.f5493c);
                canvas.clipPath(this.f5492b);
                return;
            }
            c cVar = (c) fVar;
            float f12 = cVar.f5467k;
            if (f12 != 0.0f || cVar.f5468l != 1.0f) {
                float f13 = cVar.f5469m;
                float f14 = cVar.f5468l;
                if (this.f5496f == null) {
                    this.f5496f = new PathMeasure();
                }
                this.f5496f.setPath(this.f5491a, false);
                float length = this.f5496f.getLength();
                float f15 = ((f12 + f13) % 1.0f) * length;
                float f16 = ((f14 + f13) % 1.0f) * length;
                path.reset();
                if (f15 > f16) {
                    this.f5496f.getSegment(f15, length, path, true);
                    this.f5496f.getSegment(0.0f, f16, path, true);
                } else {
                    this.f5496f.getSegment(f15, f16, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f5492b.addPath(path, this.f5493c);
            if (cVar.f5464h.m23022l()) {
                C4563b c4563b = cVar.f5464h;
                if (this.f5495e == null) {
                    Paint paint = new Paint(1);
                    this.f5495e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f5495e;
                if (c4563b.m23018h()) {
                    Shader m23017f = c4563b.m23017f();
                    m23017f.setLocalMatrix(this.f5493c);
                    paint2.setShader(m23017f);
                    paint2.setAlpha(Math.round(cVar.f5466j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(C0788g.m5046a(c4563b.m23016e(), cVar.f5466j));
                }
                paint2.setColorFilter(colorFilter);
                this.f5492b.setFillType(cVar.f5488c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f5492b, paint2);
            }
            if (cVar.f5462f.m23022l()) {
                C4563b c4563b2 = cVar.f5462f;
                if (this.f5494d == null) {
                    Paint paint3 = new Paint(1);
                    this.f5494d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f5494d;
                Paint.Join join = cVar.f5471o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f5470n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f5472p);
                if (c4563b2.m23018h()) {
                    Shader m23017f2 = c4563b2.m23017f();
                    m23017f2.setLocalMatrix(this.f5493c);
                    paint4.setShader(m23017f2);
                    paint4.setAlpha(Math.round(cVar.f5465i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(C0788g.m5046a(c4563b2.m23016e(), cVar.f5465i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f5463g * min * m5073e);
                canvas.drawPath(this.f5492b, paint4);
            }
        }

        /* renamed from: e */
        public final float m5073e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float m5069a = m5069a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            float f10 = 0.0f;
            if (max > 0.0f) {
                f10 = Math.abs(m5069a) / max;
            }
            return f10;
        }

        /* renamed from: f */
        public boolean m5074f() {
            if (this.f5505o == null) {
                this.f5505o = Boolean.valueOf(this.f5498h.mo5059a());
            }
            return this.f5505o.booleanValue();
        }

        /* renamed from: g */
        public boolean m5075g(int[] iArr) {
            return this.f5498h.mo5060b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f5503m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f5503m = i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b2/g$h.class
     */
    /* renamed from: b2.g$h */
    /* loaded from: combined.jar:classes1.jar:b2/g$h.class */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a */
        public int f5507a;

        /* renamed from: b */
        public g f5508b;

        /* renamed from: c */
        public ColorStateList f5509c;

        /* renamed from: d */
        public PorterDuff.Mode f5510d;

        /* renamed from: e */
        public boolean f5511e;

        /* renamed from: f */
        public Bitmap f5512f;

        /* renamed from: g */
        public ColorStateList f5513g;

        /* renamed from: h */
        public PorterDuff.Mode f5514h;

        /* renamed from: i */
        public int f5515i;

        /* renamed from: j */
        public boolean f5516j;

        /* renamed from: k */
        public boolean f5517k;

        /* renamed from: l */
        public Paint f5518l;

        public h() {
            this.f5509c = null;
            this.f5510d = C0788g.f5451l;
            this.f5508b = new g();
        }

        public h(h hVar) {
            this.f5509c = null;
            this.f5510d = C0788g.f5451l;
            if (hVar != null) {
                this.f5507a = hVar.f5507a;
                g gVar = new g(hVar.f5508b);
                this.f5508b = gVar;
                if (hVar.f5508b.f5495e != null) {
                    gVar.f5495e = new Paint(hVar.f5508b.f5495e);
                }
                if (hVar.f5508b.f5494d != null) {
                    this.f5508b.f5494d = new Paint(hVar.f5508b.f5494d);
                }
                this.f5509c = hVar.f5509c;
                this.f5510d = hVar.f5510d;
                this.f5511e = hVar.f5511e;
            }
        }

        /* renamed from: a */
        public boolean m5076a(int i10, int i11) {
            return i10 == this.f5512f.getWidth() && i11 == this.f5512f.getHeight();
        }

        /* renamed from: b */
        public boolean m5077b() {
            return !this.f5517k && this.f5513g == this.f5509c && this.f5514h == this.f5510d && this.f5516j == this.f5511e && this.f5515i == this.f5508b.getRootAlpha();
        }

        /* renamed from: c */
        public void m5078c(int i10, int i11) {
            if (this.f5512f == null || !m5076a(i10, i11)) {
                this.f5512f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f5517k = true;
            }
        }

        /* renamed from: d */
        public void m5079d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f5512f, (Rect) null, rect, m5080e(colorFilter));
        }

        /* renamed from: e */
        public Paint m5080e(ColorFilter colorFilter) {
            if (!m5081f() && colorFilter == null) {
                return null;
            }
            if (this.f5518l == null) {
                Paint paint = new Paint();
                this.f5518l = paint;
                paint.setFilterBitmap(true);
            }
            this.f5518l.setAlpha(this.f5508b.getRootAlpha());
            this.f5518l.setColorFilter(colorFilter);
            return this.f5518l;
        }

        /* renamed from: f */
        public boolean m5081f() {
            return this.f5508b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean m5082g() {
            return this.f5508b.m5074f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f5507a;
        }

        /* renamed from: h */
        public boolean m5083h(int[] iArr) {
            boolean m5075g = this.f5508b.m5075g(iArr);
            this.f5517k |= m5075g;
            return m5075g;
        }

        /* renamed from: i */
        public void m5084i() {
            this.f5513g = this.f5509c;
            this.f5514h = this.f5510d;
            this.f5515i = this.f5508b.getRootAlpha();
            this.f5516j = this.f5511e;
            this.f5517k = false;
        }

        /* renamed from: j */
        public void m5085j(int i10, int i11) {
            this.f5512f.eraseColor(0);
            this.f5508b.m5070b(new Canvas(this.f5512f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0788g(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0788g(this);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b2/g$i.class
     */
    /* renamed from: b2.g$i */
    /* loaded from: combined.jar:classes1.jar:b2/g$i.class */
    public static class i extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f5519a;

        public i(Drawable.ConstantState constantState) {
            this.f5519a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f5519a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f5519a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0788g c0788g = new C0788g();
            c0788g.f5450b = (VectorDrawable) this.f5519a.newDrawable();
            return c0788g;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0788g c0788g = new C0788g();
            c0788g.f5450b = (VectorDrawable) this.f5519a.newDrawable(resources);
            return c0788g;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0788g c0788g = new C0788g();
            c0788g.f5450b = (VectorDrawable) this.f5519a.newDrawable(resources, theme);
            return c0788g;
        }
    }

    public C0788g() {
        this.f5456g = true;
        this.f5458i = new float[9];
        this.f5459j = new Matrix();
        this.f5460k = new Rect();
        this.f5452c = new h();
    }

    public C0788g(h hVar) {
        this.f5456g = true;
        this.f5458i = new float[9];
        this.f5459j = new Matrix();
        this.f5460k = new Rect();
        this.f5452c = hVar;
        this.f5453d = m5055j(this.f5453d, hVar.f5509c, hVar.f5510d);
    }

    /* renamed from: a */
    public static int m5046a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    /* renamed from: b */
    public static C0788g m5047b(Resources resources, int i10, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C0788g c0788g = new C0788g();
            c0788g.f5450b = C4568g.m23053d(resources, i10, theme);
            c0788g.f5457h = new i(c0788g.f5450b.getConstantState());
            return c0788g;
        }
        try {
            XmlResourceParser xml = resources.getXml(i10);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return m5048c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e10) {
            Log.e("VectorDrawableCompat", "parser error", e10);
            return null;
        }
    }

    /* renamed from: c */
    public static C0788g m5048c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0788g c0788g = new C0788g();
        c0788g.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0788g;
    }

    /* renamed from: g */
    public static PorterDuff.Mode m5049g(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f5450b;
        if (drawable == null) {
            return false;
        }
        C4917c.m24838b(drawable);
        return false;
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* renamed from: d */
    public Object m5050d(String str) {
        return this.f5452c.f5508b.f5506p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f5460k);
        if (this.f5460k.width() <= 0 || this.f5460k.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f5454e;
        ColorFilter colorFilter2 = colorFilter;
        if (colorFilter == null) {
            colorFilter2 = this.f5453d;
        }
        canvas.getMatrix(this.f5459j);
        this.f5459j.getValues(this.f5458i);
        float abs = Math.abs(this.f5458i[0]);
        float abs2 = Math.abs(this.f5458i[4]);
        float abs3 = Math.abs(this.f5458i[1]);
        float abs4 = Math.abs(this.f5458i[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f5460k.width() * abs));
        int min2 = Math.min(2048, (int) (this.f5460k.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f5460k;
        canvas.translate(rect.left, rect.top);
        if (m5052f()) {
            canvas.translate(this.f5460k.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f5460k.offsetTo(0, 0);
        this.f5452c.m5078c(min, min2);
        if (!this.f5456g) {
            this.f5452c.m5085j(min, min2);
        } else if (!this.f5452c.m5077b()) {
            this.f5452c.m5085j(min, min2);
            this.f5452c.m5084i();
        }
        this.f5452c.m5079d(canvas, colorFilter2, this.f5460k);
        canvas.restoreToCount(save);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public final void m5051e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        b bVar;
        boolean z12;
        h hVar = this.f5452c;
        g gVar = hVar.f5508b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f5498h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth();
        boolean z13 = true;
        while (true) {
            z10 = z13;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth + 1 && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if (ClientCookie.PATH_ATTR.equals(name)) {
                    c cVar = new c();
                    cVar.m5063g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f5474b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f5506p.put(cVar.getPathName(), cVar);
                    }
                    z12 = false;
                    bVar = cVar;
                } else if ("clip-path".equals(name)) {
                    b bVar2 = new b();
                    bVar2.m5057e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f5474b.add(bVar2);
                    bVar = bVar2;
                    z12 = z10;
                    if (bVar2.getPathName() != null) {
                        gVar.f5506p.put(bVar2.getPathName(), bVar2);
                        z12 = z10;
                        bVar = bVar2;
                    }
                } else {
                    z11 = z10;
                    if ("group".equals(name)) {
                        d dVar2 = new d();
                        dVar2.m5065c(resources, attributeSet, theme, xmlPullParser);
                        dVar.f5474b.add(dVar2);
                        arrayDeque.push(dVar2);
                        if (dVar2.getGroupName() != null) {
                            gVar.f5506p.put(dVar2.getGroupName(), dVar2);
                        }
                        i10 = hVar.f5507a;
                        i11 = dVar2.f5483k;
                        hVar.f5507a = i11 | i10;
                        z11 = z10;
                    }
                }
                i10 = hVar.f5507a;
                z10 = z12;
                i11 = bVar.f5489d;
                hVar.f5507a = i11 | i10;
                z11 = z10;
            } else {
                z11 = z10;
                if (eventType == 3) {
                    z11 = z10;
                    if ("group".equals(xmlPullParser.getName())) {
                        arrayDeque.pop();
                        z11 = z10;
                    }
                }
            }
            eventType = xmlPullParser.next();
            z13 = z11;
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: f */
    public final boolean m5052f() {
        boolean z10 = true;
        if (!isAutoMirrored() || C4917c.m24842f(this) != 1) {
            z10 = false;
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f5450b;
        return drawable != null ? C4917c.m24840d(drawable) : this.f5452c.f5508b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f5450b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f5452c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f5450b;
        return drawable != null ? C4917c.m24841e(drawable) : this.f5454e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f5450b != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f5450b.getConstantState());
        }
        this.f5452c.f5507a = getChangingConfigurations();
        return this.f5452c;
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f5450b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f5452c.f5508b.f5500j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f5450b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f5452c.f5508b.f5499i;
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* renamed from: h */
    public void m5053h(boolean z10) {
        this.f5456g = z10;
    }

    /* renamed from: i */
    public final void m5054i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        h hVar = this.f5452c;
        g gVar = hVar.f5508b;
        hVar.f5510d = m5049g(C4570i.m23079k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList m23075g = C4570i.m23075g(typedArray, xmlPullParser, theme, "tint", 1);
        if (m23075g != null) {
            hVar.f5509c = m23075g;
        }
        hVar.f5511e = C4570i.m23073e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f5511e);
        gVar.f5501k = C4570i.m23078j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f5501k);
        float m23078j = C4570i.m23078j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f5502l);
        gVar.f5502l = m23078j;
        if (gVar.f5501k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (m23078j <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f5499i = typedArray.getDimension(3, gVar.f5499i);
        float dimension = typedArray.getDimension(2, gVar.f5500j);
        gVar.f5500j = dimension;
        if (gVar.f5499i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(C4570i.m23078j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f5504n = string;
            gVar.f5506p.put(string, gVar);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            C4917c.m24843g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f5452c;
        hVar.f5508b = new g();
        TypedArray m23087s = C4570i.m23087s(resources, theme, attributeSet, C0782a.f5423a);
        m5054i(m23087s, xmlPullParser, theme);
        m23087s.recycle();
        hVar.f5507a = getChangingConfigurations();
        hVar.f5517k = true;
        m5051e(resources, xmlPullParser, attributeSet, theme);
        this.f5453d = m5055j(this.f5453d, hVar.f5509c, hVar.f5510d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f5450b;
        return drawable != null ? C4917c.m24844h(drawable) : this.f5452c.f5511e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((hVar = this.f5452c) != null && (hVar.m5082g() || ((colorStateList = this.f5452c.f5509c) != null && colorStateList.isStateful())));
    }

    /* renamed from: j */
    public PorterDuffColorFilter m5055j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f5455f && super.mutate() == this) {
            this.f5452c = new h(this.f5452c);
            this.f5455f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f5452c;
        ColorStateList colorStateList = hVar.f5509c;
        boolean z10 = false;
        if (colorStateList != null) {
            PorterDuff.Mode mode = hVar.f5510d;
            z10 = false;
            if (mode != null) {
                this.f5453d = m5055j(this.f5453d, colorStateList, mode);
                invalidateSelf();
                z10 = true;
            }
        }
        if (hVar.m5082g() && hVar.m5083h(iArr)) {
            invalidateSelf();
            z10 = true;
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f5452c.f5508b.getRootAlpha() != i10) {
            this.f5452c.f5508b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            C4917c.m24846j(drawable, z10);
        } else {
            this.f5452c.f5511e = z10;
        }
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f5454e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            C4917c.m24850n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            C4917c.m24851o(drawable, colorStateList);
            return;
        }
        h hVar = this.f5452c;
        if (hVar.f5509c != colorStateList) {
            hVar.f5509c = colorStateList;
            this.f5453d = m5055j(this.f5453d, colorStateList, hVar.f5510d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            C4917c.m24852p(drawable, mode);
            return;
        }
        h hVar = this.f5452c;
        if (hVar.f5510d != mode) {
            hVar.f5510d = mode;
            this.f5453d = m5055j(this.f5453d, hVar.f5509c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f5450b;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
