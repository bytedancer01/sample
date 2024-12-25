package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p020b2.C0783b;
import p020b2.C0788g;
import p050d0.C4290b;
import p086f.C4733a;
import p105g.C4913a;
import p106g0.C4917c;
import p294r.C7933f;
import p294r.C7934g;
import p294r.C7936i;
import p294r.C7937j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/d1.class
 */
/* renamed from: androidx.appcompat.widget.d1 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/d1.class */
public final class C0307d1 {

    /* renamed from: i */
    public static C0307d1 f2017i;

    /* renamed from: a */
    public WeakHashMap<Context, C7937j<ColorStateList>> f2019a;

    /* renamed from: b */
    public C7936i<String, e> f2020b;

    /* renamed from: c */
    public C7937j<String> f2021c;

    /* renamed from: d */
    public final WeakHashMap<Context, C7933f<WeakReference<Drawable.ConstantState>>> f2022d = new WeakHashMap<>(0);

    /* renamed from: e */
    public TypedValue f2023e;

    /* renamed from: f */
    public boolean f2024f;

    /* renamed from: g */
    public f f2025g;

    /* renamed from: h */
    public static final PorterDuff.Mode f2016h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    public static final c f2018j = new c(6);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/d1$a.class
     */
    /* renamed from: androidx.appcompat.widget.d1$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/d1$a.class */
    public static class a implements e {
        @Override // androidx.appcompat.widget.C0307d1.e
        /* renamed from: a */
        public Drawable mo1307a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C4733a.m23888m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                return null;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/d1$b.class
     */
    /* renamed from: androidx.appcompat.widget.d1$b */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/d1$b.class */
    public static class b implements e {
        @Override // androidx.appcompat.widget.C0307d1.e
        /* renamed from: a */
        public Drawable mo1307a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0783b.m5021a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                return null;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/d1$c.class
     */
    /* renamed from: androidx.appcompat.widget.d1$c */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/d1$c.class */
    public static class c extends C7934g<Integer, PorterDuffColorFilter> {
        public c(int i10) {
            super(i10);
        }

        /* renamed from: m */
        public static int m1308m(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        /* renamed from: n */
        public PorterDuffColorFilter m1309n(int i10, PorterDuff.Mode mode) {
            return m34411d(Integer.valueOf(m1308m(i10, mode)));
        }

        /* renamed from: o */
        public PorterDuffColorFilter m1310o(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return m34413f(Integer.valueOf(m1308m(i10, mode)), porterDuffColorFilter);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/d1$d.class
     */
    /* renamed from: androidx.appcompat.widget.d1$d */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/d1$d.class */
    public static class d implements e {
        @Override // androidx.appcompat.widget.C0307d1.e
        /* renamed from: a */
        public Drawable mo1307a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute == null) {
                return null;
            }
            try {
                Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                return drawable;
            } catch (Exception e10) {
                Log.e("DrawableDelegate", "Exception while inflating <drawable>", e10);
                return null;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/d1$e.class
     */
    /* renamed from: androidx.appcompat.widget.d1$e */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/d1$e.class */
    public interface e {
        /* renamed from: a */
        Drawable mo1307a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/d1$f.class
     */
    /* renamed from: androidx.appcompat.widget.d1$f */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/d1$f.class */
    public interface f {
        /* renamed from: a */
        Drawable mo1311a(C0307d1 c0307d1, Context context, int i10);

        /* renamed from: b */
        ColorStateList mo1312b(Context context, int i10);

        /* renamed from: c */
        boolean mo1313c(Context context, int i10, Drawable drawable);

        /* renamed from: d */
        PorterDuff.Mode mo1314d(int i10);

        /* renamed from: e */
        boolean mo1315e(Context context, int i10, Drawable drawable);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/d1$g.class
     */
    /* renamed from: androidx.appcompat.widget.d1$g */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/d1$g.class */
    public static class g implements e {
        @Override // androidx.appcompat.widget.C0307d1.e
        /* renamed from: a */
        public Drawable mo1307a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0788g.m5048c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                return null;
            }
        }
    }

    /* renamed from: e */
    public static long m1283e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    /* renamed from: g */
    public static PorterDuffColorFilter m1284g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m1286l(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: h */
    public static C0307d1 m1285h() {
        C0307d1 c0307d1;
        synchronized (C0307d1.class) {
            try {
                if (f2017i == null) {
                    C0307d1 c0307d12 = new C0307d1();
                    f2017i = c0307d12;
                    m1287p(c0307d12);
                }
                c0307d1 = f2017i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0307d1;
    }

    /* renamed from: l */
    public static PorterDuffColorFilter m1286l(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C0307d1.class) {
            try {
                c cVar = f2018j;
                PorterDuffColorFilter m1309n = cVar.m1309n(i10, mode);
                porterDuffColorFilter = m1309n;
                if (m1309n == null) {
                    porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
                    cVar.m1310o(i10, mode, porterDuffColorFilter);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return porterDuffColorFilter;
    }

    /* renamed from: p */
    public static void m1287p(C0307d1 c0307d1) {
        if (Build.VERSION.SDK_INT < 24) {
            c0307d1.m1290a("vector", new g());
            c0307d1.m1290a("animated-vector", new b());
            c0307d1.m1290a("animated-selector", new a());
            c0307d1.m1290a("drawable", new d());
        }
    }

    /* renamed from: q */
    public static boolean m1288q(Drawable drawable) {
        return (drawable instanceof C0788g) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: w */
    public static void m1289w(Drawable drawable, C0331l1 c0331l1, int[] iArr) {
        if (C0339o0.m1528a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z10 = c0331l1.f2159d;
        if (z10 || c0331l1.f2158c) {
            drawable.setColorFilter(m1284g(z10 ? c0331l1.f2156a : null, c0331l1.f2158c ? c0331l1.f2157b : f2016h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: a */
    public final void m1290a(String str, e eVar) {
        if (this.f2020b == null) {
            this.f2020b = new C7936i<>();
        }
        this.f2020b.put(str, eVar);
    }

    /* renamed from: b */
    public final boolean m1291b(Context context, long j10, Drawable drawable) {
        boolean z10;
        synchronized (this) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C7933f<WeakReference<Drawable.ConstantState>> c7933f = this.f2022d.get(context);
                C7933f<WeakReference<Drawable.ConstantState>> c7933f2 = c7933f;
                if (c7933f == null) {
                    c7933f2 = new C7933f<>();
                    this.f2022d.put(context, c7933f2);
                }
                c7933f2.m34403j(j10, new WeakReference<>(constantState));
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    /* renamed from: c */
    public final void m1292c(Context context, int i10, ColorStateList colorStateList) {
        if (this.f2019a == null) {
            this.f2019a = new WeakHashMap<>();
        }
        C7937j<ColorStateList> c7937j = this.f2019a.get(context);
        C7937j<ColorStateList> c7937j2 = c7937j;
        if (c7937j == null) {
            c7937j2 = new C7937j<>();
            this.f2019a.put(context, c7937j2);
        }
        c7937j2.m34444a(i10, colorStateList);
    }

    /* renamed from: d */
    public final void m1293d(Context context) {
        if (this.f2024f) {
            return;
        }
        this.f2024f = true;
        Drawable m1296j = m1296j(context, C4913a.f28595a);
        if (m1296j == null || !m1288q(m1296j)) {
            this.f2024f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    /* renamed from: f */
    public final Drawable m1294f(Context context, int i10) {
        if (this.f2023e == null) {
            this.f2023e = new TypedValue();
        }
        TypedValue typedValue = this.f2023e;
        context.getResources().getValue(i10, typedValue, true);
        long m1283e = m1283e(typedValue);
        Drawable m1295i = m1295i(context, m1283e);
        if (m1295i != null) {
            return m1295i;
        }
        f fVar = this.f2025g;
        Drawable mo1311a = fVar == null ? null : fVar.mo1311a(this, context, i10);
        if (mo1311a != null) {
            mo1311a.setChangingConfigurations(typedValue.changingConfigurations);
            m1291b(context, m1283e, mo1311a);
        }
        return mo1311a;
    }

    /* renamed from: i */
    public final Drawable m1295i(Context context, long j10) {
        synchronized (this) {
            C7933f<WeakReference<Drawable.ConstantState>> c7933f = this.f2022d.get(context);
            if (c7933f == null) {
                return null;
            }
            WeakReference<Drawable.ConstantState> m34399e = c7933f.m34399e(j10);
            if (m34399e != null) {
                Drawable.ConstantState constantState = m34399e.get();
                if (constantState != null) {
                    return constantState.newDrawable(context.getResources());
                }
                c7933f.m34404k(j10);
            }
            return null;
        }
    }

    /* renamed from: j */
    public Drawable m1296j(Context context, int i10) {
        Drawable m1297k;
        synchronized (this) {
            m1297k = m1297k(context, i10, false);
        }
        return m1297k;
    }

    /* renamed from: k */
    public Drawable m1297k(Context context, int i10, boolean z10) {
        Drawable drawable;
        synchronized (this) {
            m1293d(context);
            Drawable m1301r = m1301r(context, i10);
            Drawable drawable2 = m1301r;
            if (m1301r == null) {
                drawable2 = m1294f(context, i10);
            }
            Drawable drawable3 = drawable2;
            if (drawable2 == null) {
                drawable3 = C4290b.m21726e(context, i10);
            }
            drawable = drawable3;
            if (drawable3 != null) {
                drawable = m1305v(context, i10, z10, drawable3);
            }
            if (drawable != null) {
                C0339o0.m1529b(drawable);
            }
        }
        return drawable;
    }

    /* renamed from: m */
    public ColorStateList m1298m(Context context, int i10) {
        ColorStateList colorStateList;
        synchronized (this) {
            ColorStateList m1299n = m1299n(context, i10);
            colorStateList = m1299n;
            if (m1299n == null) {
                f fVar = this.f2025g;
                ColorStateList mo1312b = fVar == null ? null : fVar.mo1312b(context, i10);
                colorStateList = mo1312b;
                if (mo1312b != null) {
                    m1292c(context, i10, mo1312b);
                    colorStateList = mo1312b;
                }
            }
        }
        return colorStateList;
    }

    /* renamed from: n */
    public final ColorStateList m1299n(Context context, int i10) {
        WeakHashMap<Context, C7937j<ColorStateList>> weakHashMap = this.f2019a;
        ColorStateList colorStateList = null;
        if (weakHashMap != null) {
            C7937j<ColorStateList> c7937j = weakHashMap.get(context);
            colorStateList = null;
            if (c7937j != null) {
                colorStateList = c7937j.m34448e(i10);
            }
        }
        return colorStateList;
    }

    /* renamed from: o */
    public PorterDuff.Mode m1300o(int i10) {
        f fVar = this.f2025g;
        return fVar == null ? null : fVar.mo1314d(i10);
    }

    /* renamed from: r */
    public final Drawable m1301r(Context context, int i10) {
        int next;
        C7936i<String, e> c7936i = this.f2020b;
        if (c7936i == null || c7936i.isEmpty()) {
            return null;
        }
        C7937j<String> c7937j = this.f2021c;
        if (c7937j != null) {
            String m34448e = c7937j.m34448e(i10);
            if ("appcompat_skip_skip".equals(m34448e)) {
                return null;
            }
            if (m34448e != null && this.f2020b.get(m34448e) == null) {
                return null;
            }
        } else {
            this.f2021c = new C7937j<>();
        }
        if (this.f2023e == null) {
            this.f2023e = new TypedValue();
        }
        TypedValue typedValue = this.f2023e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long m1283e = m1283e(typedValue);
        Drawable m1295i = m1295i(context, m1283e);
        if (m1295i != null) {
            return m1295i;
        }
        CharSequence charSequence = typedValue.string;
        Drawable drawable = m1295i;
        if (charSequence != null) {
            drawable = m1295i;
            if (charSequence.toString().endsWith(".xml")) {
                drawable = m1295i;
                try {
                    XmlResourceParser xml = resources.getXml(i10);
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    String name = xml.getName();
                    this.f2021c.m34444a(i10, name);
                    e eVar = this.f2020b.get(name);
                    Drawable drawable2 = m1295i;
                    if (eVar != null) {
                        drawable2 = eVar.mo1307a(context, xml, asAttributeSet, context.getTheme());
                    }
                    drawable = drawable2;
                    if (drawable2 != null) {
                        drawable2.setChangingConfigurations(typedValue.changingConfigurations);
                        Drawable drawable3 = drawable2;
                        m1291b(context, m1283e, drawable2);
                        drawable = drawable2;
                    }
                } catch (Exception e10) {
                    Log.e("ResourceManagerInternal", "Exception while inflating drawable", e10);
                }
            }
        }
        if (drawable == null) {
            this.f2021c.m34444a(i10, "appcompat_skip_skip");
        }
        return drawable;
    }

    /* renamed from: s */
    public void m1302s(Context context) {
        synchronized (this) {
            C7933f<WeakReference<Drawable.ConstantState>> c7933f = this.f2022d.get(context);
            if (c7933f != null) {
                c7933f.m34396b();
            }
        }
    }

    /* renamed from: t */
    public Drawable m1303t(Context context, C0355t1 c0355t1, int i10) {
        synchronized (this) {
            Drawable m1301r = m1301r(context, i10);
            Drawable drawable = m1301r;
            if (m1301r == null) {
                drawable = c0355t1.m1613c(i10);
            }
            if (drawable == null) {
                return null;
            }
            return m1305v(context, i10, false, drawable);
        }
    }

    /* renamed from: u */
    public void m1304u(f fVar) {
        synchronized (this) {
            this.f2025g = fVar;
        }
    }

    /* renamed from: v */
    public final Drawable m1305v(Context context, int i10, boolean z10, Drawable drawable) {
        Drawable drawable2;
        ColorStateList m1298m = m1298m(context, i10);
        if (m1298m != null) {
            Drawable drawable3 = drawable;
            if (C0339o0.m1528a(drawable)) {
                drawable3 = drawable.mutate();
            }
            Drawable m24854r = C4917c.m24854r(drawable3);
            C4917c.m24851o(m24854r, m1298m);
            PorterDuff.Mode m1300o = m1300o(i10);
            drawable2 = m24854r;
            if (m1300o != null) {
                C4917c.m24852p(m24854r, m1300o);
                drawable2 = m24854r;
            }
        } else {
            f fVar = this.f2025g;
            if (fVar == null || !fVar.mo1315e(context, i10, drawable)) {
                drawable2 = drawable;
                if (!m1306x(context, i10, drawable)) {
                    drawable2 = drawable;
                    if (z10) {
                        drawable2 = null;
                    }
                }
            } else {
                drawable2 = drawable;
            }
        }
        return drawable2;
    }

    /* renamed from: x */
    public boolean m1306x(Context context, int i10, Drawable drawable) {
        f fVar = this.f2025g;
        return fVar != null && fVar.mo1313c(context, i10, drawable);
    }
}
