package p086f;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import p106g0.C4917c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f/b.class
 */
/* renamed from: f.b */
/* loaded from: combined.jar:classes1.jar:f/b.class */
public class C4734b extends Drawable implements Drawable.Callback {

    /* renamed from: b */
    public d f27899b;

    /* renamed from: c */
    public Rect f27900c;

    /* renamed from: d */
    public Drawable f27901d;

    /* renamed from: e */
    public Drawable f27902e;

    /* renamed from: g */
    public boolean f27904g;

    /* renamed from: i */
    public boolean f27906i;

    /* renamed from: j */
    public Runnable f27907j;

    /* renamed from: k */
    public long f27908k;

    /* renamed from: l */
    public long f27909l;

    /* renamed from: m */
    public c f27910m;

    /* renamed from: f */
    public int f27903f = 255;

    /* renamed from: h */
    public int f27905h = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f/b$a.class
     */
    /* renamed from: f.b$a */
    /* loaded from: combined.jar:classes1.jar:f/b$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final C4734b f27911b;

        public a(C4734b c4734b) {
            this.f27911b = c4734b;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f27911b.m23916a(true);
            this.f27911b.invalidateSelf();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f/b$b.class
     */
    /* renamed from: f.b$b */
    /* loaded from: combined.jar:classes1.jar:f/b$b.class */
    public static class b {
        /* renamed from: a */
        public static boolean m23922a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        /* renamed from: b */
        public static void m23923b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        /* renamed from: c */
        public static Resources m23924c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f/b$c.class
     */
    /* renamed from: f.b$c */
    /* loaded from: combined.jar:classes1.jar:f/b$c.class */
    public static class c implements Drawable.Callback {

        /* renamed from: b */
        public Drawable.Callback f27912b;

        /* renamed from: a */
        public Drawable.Callback m23925a() {
            Drawable.Callback callback = this.f27912b;
            this.f27912b = null;
            return callback;
        }

        /* renamed from: b */
        public c m23926b(Drawable.Callback callback) {
            this.f27912b = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f27912b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f27912b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f/b$d.class
     */
    /* renamed from: f.b$d */
    /* loaded from: combined.jar:classes1.jar:f/b$d.class */
    public static abstract class d extends Drawable.ConstantState {

        /* renamed from: A */
        public int f27913A;

        /* renamed from: B */
        public int f27914B;

        /* renamed from: C */
        public boolean f27915C;

        /* renamed from: D */
        public ColorFilter f27916D;

        /* renamed from: E */
        public boolean f27917E;

        /* renamed from: F */
        public ColorStateList f27918F;

        /* renamed from: G */
        public PorterDuff.Mode f27919G;

        /* renamed from: H */
        public boolean f27920H;

        /* renamed from: I */
        public boolean f27921I;

        /* renamed from: a */
        public final C4734b f27922a;

        /* renamed from: b */
        public Resources f27923b;

        /* renamed from: c */
        public int f27924c;

        /* renamed from: d */
        public int f27925d;

        /* renamed from: e */
        public int f27926e;

        /* renamed from: f */
        public SparseArray<Drawable.ConstantState> f27927f;

        /* renamed from: g */
        public Drawable[] f27928g;

        /* renamed from: h */
        public int f27929h;

        /* renamed from: i */
        public boolean f27930i;

        /* renamed from: j */
        public boolean f27931j;

        /* renamed from: k */
        public Rect f27932k;

        /* renamed from: l */
        public boolean f27933l;

        /* renamed from: m */
        public boolean f27934m;

        /* renamed from: n */
        public int f27935n;

        /* renamed from: o */
        public int f27936o;

        /* renamed from: p */
        public int f27937p;

        /* renamed from: q */
        public int f27938q;

        /* renamed from: r */
        public boolean f27939r;

        /* renamed from: s */
        public int f27940s;

        /* renamed from: t */
        public boolean f27941t;

        /* renamed from: u */
        public boolean f27942u;

        /* renamed from: v */
        public boolean f27943v;

        /* renamed from: w */
        public boolean f27944w;

        /* renamed from: x */
        public boolean f27945x;

        /* renamed from: y */
        public boolean f27946y;

        /* renamed from: z */
        public int f27947z;

        public d(d dVar, C4734b c4734b, Resources resources) {
            this.f27930i = false;
            this.f27933l = false;
            this.f27945x = true;
            this.f27913A = 0;
            this.f27914B = 0;
            this.f27922a = c4734b;
            this.f27923b = resources != null ? resources : dVar != null ? dVar.f27923b : null;
            int m23915f = C4734b.m23915f(resources, dVar != null ? dVar.f27924c : 0);
            this.f27924c = m23915f;
            if (dVar == null) {
                this.f27928g = new Drawable[10];
                this.f27929h = 0;
                return;
            }
            this.f27925d = dVar.f27925d;
            this.f27926e = dVar.f27926e;
            this.f27943v = true;
            this.f27944w = true;
            this.f27930i = dVar.f27930i;
            this.f27933l = dVar.f27933l;
            this.f27945x = dVar.f27945x;
            this.f27946y = dVar.f27946y;
            this.f27947z = dVar.f27947z;
            this.f27913A = dVar.f27913A;
            this.f27914B = dVar.f27914B;
            this.f27915C = dVar.f27915C;
            this.f27916D = dVar.f27916D;
            this.f27917E = dVar.f27917E;
            this.f27918F = dVar.f27918F;
            this.f27919G = dVar.f27919G;
            this.f27920H = dVar.f27920H;
            this.f27921I = dVar.f27921I;
            if (dVar.f27924c == m23915f) {
                if (dVar.f27931j) {
                    this.f27932k = dVar.f27932k != null ? new Rect(dVar.f27932k) : null;
                    this.f27931j = true;
                }
                if (dVar.f27934m) {
                    this.f27935n = dVar.f27935n;
                    this.f27936o = dVar.f27936o;
                    this.f27937p = dVar.f27937p;
                    this.f27938q = dVar.f27938q;
                    this.f27934m = true;
                }
            }
            if (dVar.f27939r) {
                this.f27940s = dVar.f27940s;
                this.f27939r = true;
            }
            if (dVar.f27941t) {
                this.f27942u = dVar.f27942u;
                this.f27941t = true;
            }
            Drawable[] drawableArr = dVar.f27928g;
            this.f27928g = new Drawable[drawableArr.length];
            this.f27929h = dVar.f27929h;
            SparseArray<Drawable.ConstantState> sparseArray = dVar.f27927f;
            this.f27927f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f27929h);
            int i10 = this.f27929h;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f27927f.put(i11, constantState);
                    } else {
                        this.f27928g[i11] = drawableArr[i11];
                    }
                }
            }
        }

        /* renamed from: a */
        public final int m23927a(Drawable drawable) {
            int i10 = this.f27929h;
            if (i10 >= this.f27928g.length) {
                mo23941o(i10, i10 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f27922a);
            this.f27928g[i10] = drawable;
            this.f27929h++;
            this.f27926e = drawable.getChangingConfigurations() | this.f27926e;
            m23942p();
            this.f27932k = null;
            this.f27931j = false;
            this.f27934m = false;
            this.f27943v = false;
            return i10;
        }

        /* renamed from: b */
        public final void m23928b(Resources.Theme theme) {
            if (theme != null) {
                m23931e();
                int i10 = this.f27929h;
                Drawable[] drawableArr = this.f27928g;
                for (int i11 = 0; i11 < i10; i11++) {
                    Drawable drawable = drawableArr[i11];
                    if (drawable != null && C4917c.m24838b(drawable)) {
                        C4917c.m24837a(drawableArr[i11], theme);
                        this.f27926e |= drawableArr[i11].getChangingConfigurations();
                    }
                }
                m23950y(b.m23924c(theme));
            }
        }

        /* renamed from: c */
        public boolean m23929c() {
            if (this.f27943v) {
                return this.f27944w;
            }
            m23931e();
            this.f27943v = true;
            int i10 = this.f27929h;
            Drawable[] drawableArr = this.f27928g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    this.f27944w = false;
                    return false;
                }
            }
            this.f27944w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i10 = this.f27929h;
            Drawable[] drawableArr = this.f27928g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f27927f.get(i11);
                    if (constantState != null && b.m23922a(constantState)) {
                        return true;
                    }
                } else if (C4917c.m24838b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public void m23930d() {
            this.f27934m = true;
            m23931e();
            int i10 = this.f27929h;
            Drawable[] drawableArr = this.f27928g;
            this.f27936o = -1;
            this.f27935n = -1;
            this.f27938q = 0;
            this.f27937p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f27935n) {
                    this.f27935n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f27936o) {
                    this.f27936o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f27937p) {
                    this.f27937p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f27938q) {
                    this.f27938q = minimumHeight;
                }
            }
        }

        /* renamed from: e */
        public final void m23931e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f27927f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f27928g[this.f27927f.keyAt(i10)] = m23944s(this.f27927f.valueAt(i10).newDrawable(this.f27923b));
                }
                this.f27927f = null;
            }
        }

        /* renamed from: f */
        public final int m23932f() {
            return this.f27928g.length;
        }

        /* renamed from: g */
        public final Drawable m23933g(int i10) {
            int indexOfKey;
            Drawable drawable = this.f27928g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f27927f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable m23944s = m23944s(this.f27927f.valueAt(indexOfKey).newDrawable(this.f27923b));
            this.f27928g[i10] = m23944s;
            this.f27927f.removeAt(indexOfKey);
            if (this.f27927f.size() == 0) {
                this.f27927f = null;
            }
            return m23944s;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f27925d | this.f27926e;
        }

        /* renamed from: h */
        public final int m23934h() {
            return this.f27929h;
        }

        /* renamed from: i */
        public final int m23935i() {
            if (!this.f27934m) {
                m23930d();
            }
            return this.f27936o;
        }

        /* renamed from: j */
        public final int m23936j() {
            if (!this.f27934m) {
                m23930d();
            }
            return this.f27938q;
        }

        /* renamed from: k */
        public final int m23937k() {
            if (!this.f27934m) {
                m23930d();
            }
            return this.f27937p;
        }

        /* renamed from: l */
        public final Rect m23938l() {
            Rect rect = null;
            if (this.f27930i) {
                return null;
            }
            Rect rect2 = this.f27932k;
            if (rect2 != null || this.f27931j) {
                return rect2;
            }
            m23931e();
            Rect rect3 = new Rect();
            int i10 = this.f27929h;
            Drawable[] drawableArr = this.f27928g;
            int i11 = 0;
            while (i11 < i10) {
                Rect rect4 = rect;
                if (drawableArr[i11].getPadding(rect3)) {
                    Rect rect5 = rect;
                    if (rect == null) {
                        rect5 = new Rect(0, 0, 0, 0);
                    }
                    int i12 = rect3.left;
                    if (i12 > rect5.left) {
                        rect5.left = i12;
                    }
                    int i13 = rect3.top;
                    if (i13 > rect5.top) {
                        rect5.top = i13;
                    }
                    int i14 = rect3.right;
                    if (i14 > rect5.right) {
                        rect5.right = i14;
                    }
                    int i15 = rect3.bottom;
                    rect4 = rect5;
                    if (i15 > rect5.bottom) {
                        rect5.bottom = i15;
                        rect4 = rect5;
                    }
                }
                i11++;
                rect = rect4;
            }
            this.f27931j = true;
            this.f27932k = rect;
            return rect;
        }

        /* renamed from: m */
        public final int m23939m() {
            if (!this.f27934m) {
                m23930d();
            }
            return this.f27935n;
        }

        /* renamed from: n */
        public final int m23940n() {
            if (this.f27939r) {
                return this.f27940s;
            }
            m23931e();
            int i10 = this.f27929h;
            Drawable[] drawableArr = this.f27928g;
            int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            this.f27940s = opacity;
            this.f27939r = true;
            return opacity;
        }

        /* renamed from: o */
        public void mo23941o(int i10, int i11) {
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f27928g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f27928g = drawableArr;
        }

        /* renamed from: p */
        public void m23942p() {
            this.f27939r = false;
            this.f27941t = false;
        }

        /* renamed from: q */
        public final boolean m23943q() {
            return this.f27933l;
        }

        /* renamed from: r */
        public abstract void mo23910r();

        /* renamed from: s */
        public final Drawable m23944s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                C4917c.m24849m(drawable, this.f27947z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f27922a);
            return mutate;
        }

        /* renamed from: t */
        public final void m23945t(boolean z10) {
            this.f27933l = z10;
        }

        /* renamed from: u */
        public final void m23946u(int i10) {
            this.f27913A = i10;
        }

        /* renamed from: v */
        public final void m23947v(int i10) {
            this.f27914B = i10;
        }

        /* renamed from: w */
        public final boolean m23948w(int i10, int i11) {
            int i12 = this.f27929h;
            Drawable[] drawableArr = this.f27928g;
            int i13 = 0;
            boolean z10 = false;
            while (true) {
                boolean z11 = z10;
                if (i13 >= i12) {
                    this.f27947z = i10;
                    return z11;
                }
                Drawable drawable = drawableArr[i13];
                boolean z12 = z11;
                if (drawable != null) {
                    boolean m24849m = Build.VERSION.SDK_INT >= 23 ? C4917c.m24849m(drawable, i10) : false;
                    z12 = z11;
                    if (i13 == i11) {
                        z12 = m24849m;
                    }
                }
                i13++;
                z10 = z12;
            }
        }

        /* renamed from: x */
        public final void m23949x(boolean z10) {
            this.f27930i = z10;
        }

        /* renamed from: y */
        public final void m23950y(Resources resources) {
            if (resources != null) {
                this.f27923b = resources;
                int m23915f = C4734b.m23915f(resources, this.f27924c);
                int i10 = this.f27924c;
                this.f27924c = m23915f;
                if (i10 != m23915f) {
                    this.f27934m = false;
                    this.f27931j = false;
                }
            }
        }
    }

    /* renamed from: f */
    public static int m23915f(Resources resources, int i10) {
        if (resources != null) {
            i10 = resources.getDisplayMetrics().densityDpi;
        }
        int i11 = i10;
        if (i10 == 0) {
            i11 = 160;
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m23916a(boolean r8) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.C4734b.m23916a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f27899b.m23928b(theme);
    }

    /* renamed from: b */
    public d mo23889b() {
        throw null;
    }

    /* renamed from: c */
    public int m23917c() {
        return this.f27905h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f27899b.canApplyTheme();
    }

    /* renamed from: d */
    public final void m23918d(Drawable drawable) {
        if (this.f27910m == null) {
            this.f27910m = new c();
        }
        drawable.setCallback(this.f27910m.m23926b(drawable.getCallback()));
        try {
            if (this.f27899b.f27913A <= 0 && this.f27904g) {
                drawable.setAlpha(this.f27903f);
            }
            d dVar = this.f27899b;
            if (dVar.f27917E) {
                drawable.setColorFilter(dVar.f27916D);
            } else {
                if (dVar.f27920H) {
                    C4917c.m24851o(drawable, dVar.f27918F);
                }
                d dVar2 = this.f27899b;
                if (dVar2.f27921I) {
                    C4917c.m24852p(drawable, dVar2.f27919G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f27899b.f27945x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                C4917c.m24849m(drawable, C4917c.m24842f(this));
            }
            C4917c.m24846j(drawable, this.f27899b.f27915C);
            Rect rect = this.f27900c;
            if (rect != null) {
                C4917c.m24848l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f27910m.m23925a());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f27901d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f27902e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* renamed from: e */
    public final boolean m23919e() {
        boolean z10 = true;
        if (!isAutoMirrored() || C4917c.m24842f(this) != 1) {
            z10 = false;
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m23920g(int r7) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.C4734b.m23920g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f27903f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f27899b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f27899b.m23929c()) {
            return null;
        }
        this.f27899b.f27925d = getChangingConfigurations();
        return this.f27899b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f27901d;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f27900c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f27899b.m23943q()) {
            return this.f27899b.m23935i();
        }
        Drawable drawable = this.f27901d;
        return drawable != null ? drawable.getIntrinsicHeight() : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f27899b.m23943q()) {
            return this.f27899b.m23939m();
        }
        Drawable drawable = this.f27901d;
        return drawable != null ? drawable.getIntrinsicWidth() : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f27899b.m23943q()) {
            return this.f27899b.m23936j();
        }
        Drawable drawable = this.f27901d;
        return drawable != null ? drawable.getMinimumHeight() : 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f27899b.m23943q()) {
            return this.f27899b.m23937k();
        }
        Drawable drawable = this.f27901d;
        return drawable != null ? drawable.getMinimumWidth() : 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f27901d;
        return (drawable == null || !drawable.isVisible()) ? -2 : this.f27899b.m23940n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f27901d;
        if (drawable != null) {
            b.m23923b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect m23938l = this.f27899b.m23938l();
        if (m23938l != null) {
            rect.set(m23938l);
            padding = (m23938l.right | ((m23938l.left | m23938l.top) | m23938l.bottom)) != 0;
        } else {
            Drawable drawable = this.f27901d;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m23919e()) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return padding;
    }

    /* renamed from: h */
    public void mo23890h(d dVar) {
        this.f27899b = dVar;
        int i10 = this.f27905h;
        if (i10 >= 0) {
            Drawable m23933g = dVar.m23933g(i10);
            this.f27901d = m23933g;
            if (m23933g != null) {
                m23918d(m23933g);
            }
        }
        this.f27902e = null;
    }

    /* renamed from: i */
    public final void m23921i(Resources resources) {
        this.f27899b.m23950y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f27899b;
        if (dVar != null) {
            dVar.m23942p();
        }
        if (drawable != this.f27901d || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f27899b.f27915C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f27902e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f27902e = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f27901d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f27904g) {
                this.f27901d.setAlpha(this.f27903f);
            }
        }
        if (this.f27909l != 0) {
            this.f27909l = 0L;
            z10 = true;
        }
        if (this.f27908k != 0) {
            this.f27908k = 0L;
            z10 = true;
        }
        if (z10) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f27906i && super.mutate() == this) {
            d mo23889b = mo23889b();
            mo23889b.mo23910r();
            mo23890h(mo23889b);
            this.f27906i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f27902e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f27901d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return this.f27899b.m23948w(i10, m23917c());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f27902e;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f27901d;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f27902e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f27901d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable != this.f27901d || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f27904g && this.f27903f == i10) {
            return;
        }
        this.f27904g = true;
        this.f27903f = i10;
        Drawable drawable = this.f27901d;
        if (drawable != null) {
            if (this.f27908k == 0) {
                drawable.setAlpha(i10);
            } else {
                m23916a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        d dVar = this.f27899b;
        if (dVar.f27915C != z10) {
            dVar.f27915C = z10;
            Drawable drawable = this.f27901d;
            if (drawable != null) {
                C4917c.m24846j(drawable, z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f27899b;
        dVar.f27917E = true;
        if (dVar.f27916D != colorFilter) {
            dVar.f27916D = colorFilter;
            Drawable drawable = this.f27901d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        d dVar = this.f27899b;
        if (dVar.f27945x != z10) {
            dVar.f27945x = z10;
            Drawable drawable = this.f27901d;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f27901d;
        if (drawable != null) {
            C4917c.m24847k(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f27900c;
        if (rect == null) {
            this.f27900c = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f27901d;
        if (drawable != null) {
            C4917c.m24848l(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f27899b;
        dVar.f27920H = true;
        if (dVar.f27918F != colorStateList) {
            dVar.f27918F = colorStateList;
            C4917c.m24851o(this.f27901d, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f27899b;
        dVar.f27921I = true;
        if (dVar.f27919G != mode) {
            dVar.f27919G = mode;
            C4917c.m24852p(this.f27901d, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f27902e;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f27901d;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f27901d || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
