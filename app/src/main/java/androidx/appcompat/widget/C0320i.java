package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.C0307d1;
import p029c.C0920a;
import p029c.C0922c;
import p029c.C0923d;
import p029c.C0924e;
import p068e.C4561b;
import p087f0.C4738a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/i.class
 */
/* renamed from: androidx.appcompat.widget.i */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/i.class */
public final class C0320i {

    /* renamed from: b */
    public static final PorterDuff.Mode f2125b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static C0320i f2126c;

    /* renamed from: a */
    public C0307d1 f2127a;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/i$a.class
     */
    /* renamed from: androidx.appcompat.widget.i$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/i$a.class */
    public class a implements C0307d1.f {

        /* renamed from: a */
        public final int[] f2128a = {C0924e.f6173R, C0924e.f6171P, C0924e.f6175a};

        /* renamed from: b */
        public final int[] f2129b = {C0924e.f6189o, C0924e.f6157B, C0924e.f6194t, C0924e.f6190p, C0924e.f6191q, C0924e.f6193s, C0924e.f6192r};

        /* renamed from: c */
        public final int[] f2130c = {C0924e.f6170O, C0924e.f6172Q, C0924e.f6185k, C0924e.f6166K, C0924e.f6167L, C0924e.f6168M, C0924e.f6169N};

        /* renamed from: d */
        public final int[] f2131d = {C0924e.f6197w, C0924e.f6183i, C0924e.f6196v};

        /* renamed from: e */
        public final int[] f2132e = {C0924e.f6165J, C0924e.f6174S};

        /* renamed from: f */
        public final int[] f2133f = {C0924e.f6177c, C0924e.f6181g, C0924e.f6178d, C0924e.f6182h};

        @Override // androidx.appcompat.widget.C0307d1.f
        /* renamed from: a */
        public Drawable mo1311a(C0307d1 c0307d1, Context context, int i10) {
            int i11;
            if (i10 == C0924e.f6184j) {
                return new LayerDrawable(new Drawable[]{c0307d1.m1296j(context, C0924e.f6183i), c0307d1.m1296j(context, C0924e.f6185k)});
            }
            if (i10 == C0924e.f6199y) {
                i11 = C0923d.f6149i;
            } else if (i10 == C0924e.f6198x) {
                i11 = C0923d.f6150j;
            } else {
                if (i10 != C0924e.f6200z) {
                    return null;
                }
                i11 = C0923d.f6151k;
            }
            return m1451l(c0307d1, context, i11);
        }

        @Override // androidx.appcompat.widget.C0307d1.f
        /* renamed from: b */
        public ColorStateList mo1312b(Context context, int i10) {
            if (i10 == C0924e.f6187m) {
                return C4561b.m22998c(context, C0922c.f6137e);
            }
            if (i10 == C0924e.f6164I) {
                return C4561b.m22998c(context, C0922c.f6140h);
            }
            if (i10 == C0924e.f6163H) {
                return m1450k(context);
            }
            if (i10 == C0924e.f6180f) {
                return m1449j(context);
            }
            if (i10 == C0924e.f6176b) {
                return m1446g(context);
            }
            if (i10 == C0924e.f6179e) {
                return m1448i(context);
            }
            if (i10 == C0924e.f6159D || i10 == C0924e.f6160E) {
                return C4561b.m22998c(context, C0922c.f6139g);
            }
            if (m1445f(this.f2129b, i10)) {
                return C0322i1.m1458e(context, C0920a.f6128w);
            }
            if (m1445f(this.f2132e, i10)) {
                return C4561b.m22998c(context, C0922c.f6136d);
            }
            if (m1445f(this.f2133f, i10)) {
                return C4561b.m22998c(context, C0922c.f6135c);
            }
            if (i10 == C0924e.f6156A) {
                return C4561b.m22998c(context, C0922c.f6138f);
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00ac A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x007e  */
        @Override // androidx.appcompat.widget.C0307d1.f
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean mo1313c(android.content.Context r5, int r6, android.graphics.drawable.Drawable r7) {
            /*
                r4 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0320i.m1436a()
                r11 = r0
                r0 = r4
                r1 = r4
                int[] r1 = r1.f2128a
                r2 = r6
                boolean r0 = r0.m1445f(r1, r2)
                r10 = r0
                r0 = 16842801(0x1010031, float:2.3693695E-38)
                r8 = r0
                r0 = r10
                if (r0 == 0) goto L26
                int r0 = p029c.C0920a.f6128w
                r6 = r0
            L1d:
                r0 = -1
                r8 = r0
            L20:
                r0 = 1
                r9 = r0
                goto L79
            L26:
                r0 = r4
                r1 = r4
                int[] r1 = r1.f2130c
                r2 = r6
                boolean r0 = r0.m1445f(r1, r2)
                if (r0 == 0) goto L39
                int r0 = p029c.C0920a.f6126u
                r6 = r0
                goto L1d
            L39:
                r0 = r4
                r1 = r4
                int[] r1 = r1.f2131d
                r2 = r6
                boolean r0 = r0.m1445f(r1, r2)
                if (r0 == 0) goto L50
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                r11 = r0
                r0 = r8
                r6 = r0
                goto L1d
            L50:
                r0 = r6
                int r1 = p029c.C0924e.f6195u
                if (r0 != r1) goto L64
                r0 = 16842800(0x1010030, float:2.3693693E-38)
                r6 = r0
                r0 = 1109603123(0x42233333, float:40.8)
                int r0 = java.lang.Math.round(r0)
                r8 = r0
                goto L20
            L64:
                r0 = r6
                int r1 = p029c.C0924e.f6186l
                if (r0 != r1) goto L71
                r0 = r8
                r6 = r0
                goto L1d
            L71:
                r0 = -1
                r8 = r0
                r0 = 0
                r9 = r0
                r0 = 0
                r6 = r0
            L79:
                r0 = r9
                if (r0 == 0) goto Lac
                r0 = r7
                r12 = r0
                r0 = r7
                boolean r0 = androidx.appcompat.widget.C0339o0.m1528a(r0)
                if (r0 == 0) goto L8e
                r0 = r7
                android.graphics.drawable.Drawable r0 = r0.mutate()
                r12 = r0
            L8e:
                r0 = r12
                r1 = r5
                r2 = r6
                int r1 = androidx.appcompat.widget.C0322i1.m1456c(r1, r2)
                r2 = r11
                android.graphics.PorterDuffColorFilter r1 = androidx.appcompat.widget.C0320i.m1438e(r1, r2)
                r0.setColorFilter(r1)
                r0 = r8
                r1 = -1
                if (r0 == r1) goto Laa
                r0 = r12
                r1 = r8
                r0.setAlpha(r1)
            Laa:
                r0 = 1
                return r0
            Lac:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0320i.a.mo1313c(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.C0307d1.f
        /* renamed from: d */
        public PorterDuff.Mode mo1314d(int i10) {
            return i10 == C0924e.f6163H ? PorterDuff.Mode.MULTIPLY : null;
        }

        @Override // androidx.appcompat.widget.C0307d1.f
        /* renamed from: e */
        public boolean mo1315e(Context context, int i10, Drawable drawable) {
            int m1456c;
            Drawable drawable2;
            if (i10 == C0924e.f6158C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i11 = C0920a.f6128w;
                m1452m(findDrawableByLayerId, C0322i1.m1456c(context, i11), C0320i.f2125b);
                m1452m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), C0322i1.m1456c(context, i11), C0320i.f2125b);
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.progress);
                m1456c = C0322i1.m1456c(context, C0920a.f6126u);
                drawable2 = findDrawableByLayerId2;
            } else {
                if (i10 != C0924e.f6199y && i10 != C0924e.f6198x && i10 != C0924e.f6200z) {
                    return false;
                }
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m1452m(layerDrawable2.findDrawableByLayerId(R.id.background), C0322i1.m1455b(context, C0920a.f6128w), C0320i.f2125b);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
                int i12 = C0920a.f6126u;
                m1452m(findDrawableByLayerId3, C0322i1.m1456c(context, i12), C0320i.f2125b);
                Drawable findDrawableByLayerId4 = layerDrawable2.findDrawableByLayerId(R.id.progress);
                m1456c = C0322i1.m1456c(context, i12);
                drawable2 = findDrawableByLayerId4;
            }
            m1452m(drawable2, m1456c, C0320i.f2125b);
            return true;
        }

        /* renamed from: f */
        public final boolean m1445f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        public final ColorStateList m1446g(Context context) {
            return m1447h(context, 0);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [int[], int[][]] */
        /* renamed from: h */
        public final ColorStateList m1447h(Context context, int i10) {
            int m1456c = C0322i1.m1456c(context, C0920a.f6127v);
            int m1455b = C0322i1.m1455b(context, C0920a.f6125t);
            int[] iArr = C0322i1.f2135b;
            int[] iArr2 = C0322i1.f2138e;
            int m23970i = C4738a.m23970i(m1456c, i10);
            return new ColorStateList(new int[]{iArr, iArr2, C0322i1.f2136c, C0322i1.f2142i}, new int[]{m1455b, m23970i, C4738a.m23970i(m1456c, i10), i10});
        }

        /* renamed from: i */
        public final ColorStateList m1448i(Context context) {
            return m1447h(context, C0322i1.m1456c(context, C0920a.f6124s));
        }

        /* renamed from: j */
        public final ColorStateList m1449j(Context context) {
            return m1447h(context, C0322i1.m1456c(context, C0920a.f6125t));
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [int[], int[][]] */
        /* renamed from: k */
        public final ColorStateList m1450k(Context context) {
            ?? r02 = new int[3];
            int[] iArr = new int[3];
            int i10 = C0920a.f6131z;
            ColorStateList m1458e = C0322i1.m1458e(context, i10);
            if (m1458e == null || !m1458e.isStateful()) {
                r02[0] = C0322i1.f2135b;
                iArr[0] = C0322i1.m1455b(context, i10);
                r02[1] = C0322i1.f2139f;
                iArr[1] = C0322i1.m1456c(context, C0920a.f6126u);
                r02[2] = C0322i1.f2142i;
                iArr[2] = C0322i1.m1456c(context, i10);
            } else {
                int[] iArr2 = C0322i1.f2135b;
                r02[0] = iArr2;
                iArr[0] = m1458e.getColorForState(iArr2, 0);
                r02[1] = C0322i1.f2139f;
                iArr[1] = C0322i1.m1456c(context, C0920a.f6126u);
                r02[2] = C0322i1.f2142i;
                iArr[2] = m1458e.getDefaultColor();
            }
            return new ColorStateList(r02, iArr);
        }

        /* renamed from: l */
        public final LayerDrawable m1451l(C0307d1 c0307d1, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable m1296j = c0307d1.m1296j(context, C0924e.f6161F);
            Drawable m1296j2 = c0307d1.m1296j(context, C0924e.f6162G);
            if ((m1296j instanceof BitmapDrawable) && m1296j.getIntrinsicWidth() == dimensionPixelSize && m1296j.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) m1296j;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                m1296j.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                m1296j.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((m1296j2 instanceof BitmapDrawable) && m1296j2.getIntrinsicWidth() == dimensionPixelSize && m1296j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) m1296j2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                m1296j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                m1296j2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        /* renamed from: m */
        public final void m1452m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            Drawable drawable2 = drawable;
            if (C0339o0.m1528a(drawable)) {
                drawable2 = drawable.mutate();
            }
            PorterDuff.Mode mode2 = mode;
            if (mode == null) {
                mode2 = C0320i.f2125b;
            }
            drawable2.setColorFilter(C0320i.m1438e(i10, mode2));
        }
    }

    /* renamed from: b */
    public static C0320i m1437b() {
        C0320i c0320i;
        synchronized (C0320i.class) {
            try {
                if (f2126c == null) {
                    m1439h();
                }
                c0320i = f2126c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0320i;
    }

    /* renamed from: e */
    public static PorterDuffColorFilter m1438e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter m1286l;
        synchronized (C0320i.class) {
            try {
                m1286l = C0307d1.m1286l(i10, mode);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m1286l;
    }

    /* renamed from: h */
    public static void m1439h() {
        synchronized (C0320i.class) {
            try {
                if (f2126c == null) {
                    C0320i c0320i = new C0320i();
                    f2126c = c0320i;
                    c0320i.f2127a = C0307d1.m1285h();
                    f2126c.f2127a.m1304u(new a());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: i */
    public static void m1440i(Drawable drawable, C0331l1 c0331l1, int[] iArr) {
        C0307d1.m1289w(drawable, c0331l1, iArr);
    }

    /* renamed from: c */
    public Drawable m1441c(Context context, int i10) {
        Drawable m1296j;
        synchronized (this) {
            m1296j = this.f2127a.m1296j(context, i10);
        }
        return m1296j;
    }

    /* renamed from: d */
    public Drawable m1442d(Context context, int i10, boolean z10) {
        Drawable m1297k;
        synchronized (this) {
            m1297k = this.f2127a.m1297k(context, i10, z10);
        }
        return m1297k;
    }

    /* renamed from: f */
    public ColorStateList m1443f(Context context, int i10) {
        ColorStateList m1298m;
        synchronized (this) {
            m1298m = this.f2127a.m1298m(context, i10);
        }
        return m1298m;
    }

    /* renamed from: g */
    public void m1444g(Context context) {
        synchronized (this) {
            this.f2127a.m1302s(context);
        }
    }
}
