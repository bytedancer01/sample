package p069e0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p221n0.C6611c;
import p221n0.C6616h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e0/g.class
 */
/* renamed from: e0.g */
/* loaded from: combined.jar:classes1.jar:e0/g.class */
public final class C4568g {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f27180a = new ThreadLocal<>();

    /* renamed from: b */
    public static final WeakHashMap<b, SparseArray<a>> f27181b = new WeakHashMap<>(0);

    /* renamed from: c */
    public static final Object f27182c = new Object();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e0/g$a.class
     */
    /* renamed from: e0.g$a */
    /* loaded from: combined.jar:classes1.jar:e0/g$a.class */
    public static class a {

        /* renamed from: a */
        public final ColorStateList f27183a;

        /* renamed from: b */
        public final Configuration f27184b;

        public a(ColorStateList colorStateList, Configuration configuration) {
            this.f27183a = colorStateList;
            this.f27184b = configuration;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e0/g$b.class
     */
    /* renamed from: e0.g$b */
    /* loaded from: combined.jar:classes1.jar:e0/g$b.class */
    public static final class b {

        /* renamed from: a */
        public final Resources f27185a;

        /* renamed from: b */
        public final Resources.Theme f27186b;

        public b(Resources resources, Resources.Theme theme) {
            this.f27185a = resources;
            this.f27186b = theme;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f27185a.equals(bVar.f27185a) || !C6611c.m30516a(this.f27186b, bVar.f27186b)) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            return C6611c.m30517b(this.f27185a, this.f27186b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e0/g$c.class
     */
    /* renamed from: e0.g$c */
    /* loaded from: combined.jar:classes1.jar:e0/g$c.class */
    public static abstract class c {

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:e0/g$c$a.class
         */
        /* renamed from: e0.g$c$a */
        /* loaded from: combined.jar:classes1.jar:e0/g$c$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final Typeface f27187b;

            /* renamed from: c */
            public final c f27188c;

            public a(c cVar, Typeface typeface) {
                this.f27188c = cVar;
                this.f27187b = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f27188c.mo1357e(this.f27187b);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:e0/g$c$b.class
         */
        /* renamed from: e0.g$c$b */
        /* loaded from: combined.jar:classes1.jar:e0/g$c$b.class */
        public class b implements Runnable {

            /* renamed from: b */
            public final int f27189b;

            /* renamed from: c */
            public final c f27190c;

            public b(c cVar, int i10) {
                this.f27190c = cVar;
                this.f27189b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f27190c.mo1356d(this.f27189b);
            }
        }

        /* renamed from: c */
        public static Handler m23062c(Handler handler) {
            Handler handler2 = handler;
            if (handler == null) {
                handler2 = new Handler(Looper.getMainLooper());
            }
            return handler2;
        }

        /* renamed from: a */
        public final void m23063a(int i10, Handler handler) {
            m23062c(handler).post(new b(this, i10));
        }

        /* renamed from: b */
        public final void m23064b(Typeface typeface, Handler handler) {
            m23062c(handler).post(new a(this, typeface));
        }

        /* renamed from: d */
        public abstract void mo1356d(int i10);

        /* renamed from: e */
        public abstract void mo1357e(Typeface typeface);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e0/g$d.class
     */
    /* renamed from: e0.g$d */
    /* loaded from: combined.jar:classes1.jar:e0/g$d.class */
    public static final class d {

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:e0/g$d$a.class
         */
        /* renamed from: e0.g$d$a */
        /* loaded from: combined.jar:classes1.jar:e0/g$d$a.class */
        public static class a {

            /* renamed from: a */
            public static final Object f27191a = new Object();

            /* renamed from: b */
            public static Method f27192b;

            /* renamed from: c */
            public static boolean f27193c;

            /* renamed from: a */
            public static void m23066a(Resources.Theme theme) {
                synchronized (f27191a) {
                    if (!f27193c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f27192b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e10) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                        }
                        f27193c = true;
                    }
                    Method method = f27192b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e11) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                            f27192b = null;
                        }
                    }
                }
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:e0/g$d$b.class
         */
        /* renamed from: e0.g$d$b */
        /* loaded from: combined.jar:classes1.jar:e0/g$d$b.class */
        public static class b {
            /* renamed from: a */
            public static void m23067a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m23065a(Resources.Theme theme) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                b.m23067a(theme);
            } else if (i10 >= 23) {
                a.m23066a(theme);
            }
        }
    }

    /* renamed from: a */
    public static void m23050a(b bVar, int i10, ColorStateList colorStateList) {
        synchronized (f27182c) {
            WeakHashMap<b, SparseArray<a>> weakHashMap = f27181b;
            SparseArray<a> sparseArray = weakHashMap.get(bVar);
            SparseArray<a> sparseArray2 = sparseArray;
            if (sparseArray == null) {
                sparseArray2 = new SparseArray<>();
                weakHashMap.put(bVar, sparseArray2);
            }
            sparseArray2.append(i10, new a(colorStateList, bVar.f27185a.getConfiguration()));
        }
    }

    /* renamed from: b */
    public static ColorStateList m23051b(b bVar, int i10) {
        a aVar;
        synchronized (f27182c) {
            SparseArray<a> sparseArray = f27181b.get(bVar);
            if (sparseArray != null && sparseArray.size() > 0 && (aVar = sparseArray.get(i10)) != null) {
                if (aVar.f27184b.equals(bVar.f27185a.getConfiguration())) {
                    return aVar.f27183a;
                }
                sparseArray.remove(i10);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static ColorStateList m23052c(Resources resources, int i10, Resources.Theme theme) {
        ColorStateList colorStateList;
        if (Build.VERSION.SDK_INT >= 23) {
            colorStateList = resources.getColorStateList(i10, theme);
            return colorStateList;
        }
        b bVar = new b(resources, theme);
        ColorStateList m23051b = m23051b(bVar, i10);
        if (m23051b != null) {
            return m23051b;
        }
        ColorStateList m23058i = m23058i(resources, i10, theme);
        if (m23058i == null) {
            return resources.getColorStateList(i10);
        }
        m23050a(bVar, i10, m23058i);
        return m23058i;
    }

    /* renamed from: d */
    public static Drawable m23053d(Resources resources, int i10, Resources.Theme theme) {
        return resources.getDrawable(i10, theme);
    }

    /* renamed from: e */
    public static Typeface m23054e(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return m23060k(context, i10, new TypedValue(), 0, null, null, false, false);
    }

    /* renamed from: f */
    public static Typeface m23055f(Context context, int i10, TypedValue typedValue, int i11, c cVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m23060k(context, i10, typedValue, i11, cVar, null, true, false);
    }

    /* renamed from: g */
    public static void m23056g(Context context, int i10, c cVar, Handler handler) {
        C6616h.m30527e(cVar);
        if (context.isRestricted()) {
            cVar.m23063a(-4, handler);
        } else {
            m23060k(context, i10, new TypedValue(), 0, cVar, handler, false, false);
        }
    }

    /* renamed from: h */
    public static TypedValue m23057h() {
        ThreadLocal<TypedValue> threadLocal = f27180a;
        TypedValue typedValue = threadLocal.get();
        TypedValue typedValue2 = typedValue;
        if (typedValue == null) {
            typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
        }
        return typedValue2;
    }

    /* renamed from: i */
    public static ColorStateList m23058i(Resources resources, int i10, Resources.Theme theme) {
        if (m23059j(resources, i10)) {
            return null;
        }
        try {
            return C4562a.m23003a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.e("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    /* renamed from: j */
    public static boolean m23059j(Resources resources, int i10) {
        TypedValue m23057h = m23057h();
        boolean z10 = true;
        resources.getValue(i10, m23057h, true);
        int i11 = m23057h.type;
        if (i11 < 28 || i11 > 31) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: k */
    public static Typeface m23060k(Context context, int i10, TypedValue typedValue, int i11, c cVar, Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        Typeface m23061l = m23061l(context, resources, typedValue, i10, i11, cVar, handler, z10, z11);
        if (m23061l != null || cVar != null || z11) {
            return m23061l;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface m23061l(android.content.Context r9, android.content.res.Resources r10, android.util.TypedValue r11, int r12, int r13, p069e0.C4568g.c r14, android.os.Handler r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p069e0.C4568g.m23061l(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, e0.g$c, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
