package p087f0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p069e0.C4564c;
import p191l0.C5643f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f0/g.class
 */
/* renamed from: f0.g */
/* loaded from: combined.jar:classes1.jar:f0/g.class */
public class C4744g extends C4742e {

    /* renamed from: g */
    public final Class<?> f27987g;

    /* renamed from: h */
    public final Constructor<?> f27988h;

    /* renamed from: i */
    public final Method f27989i;

    /* renamed from: j */
    public final Method f27990j;

    /* renamed from: k */
    public final Method f27991k;

    /* renamed from: l */
    public final Method f27992l;

    /* renamed from: m */
    public final Method f27993m;

    public C4744g() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls;
        try {
            cls = m24027u();
            constructor = m24028v(cls);
            method5 = m24024r(cls);
            method2 = m24025s(cls);
            method3 = m24029w(cls);
            method4 = m24023q(cls);
            method = mo24026t(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e10.getClass().getName(), e10);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
            cls = null;
        }
        this.f27987g = cls;
        this.f27988h = constructor;
        this.f27989i = method5;
        this.f27990j = method2;
        this.f27991k = method3;
        this.f27992l = method4;
        this.f27993m = method;
    }

    /* renamed from: k */
    private Object m24015k() {
        try {
            return this.f27988h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            return null;
        }
    }

    @Override // p087f0.C4742e, p087f0.C4747j
    /* renamed from: a */
    public Typeface mo24008a(Context context, C4564c.b bVar, Resources resources, int i10) {
        if (!m24022p()) {
            return super.mo24008a(context, bVar, resources, i10);
        }
        Object m24015k = m24015k();
        if (m24015k == null) {
            return null;
        }
        for (C4564c.c cVar : bVar.m23031a()) {
            if (!m24019m(context, m24015k, cVar.m23032a(), cVar.m23034c(), cVar.m23036e(), cVar.m23037f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.m23035d()))) {
                m24018l(m24015k);
                return null;
            }
        }
        if (m24021o(m24015k)) {
            return mo24017h(m24015k);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v49, types: [android.graphics.Typeface$Builder] */
    @Override // p087f0.C4742e, p087f0.C4747j
    /* renamed from: b */
    public Typeface mo24009b(Context context, CancellationSignal cancellationSignal, C5643f.b[] bVarArr, int i10) {
        Typeface mo24017h;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m24022p()) {
            C5643f.b mo24030f = mo24030f(bVarArr, i10);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo24030f.m27856d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor == null) {
                        return null;
                    }
                    openFileDescriptor.close();
                    return null;
                }
                try {
                    final FileDescriptor fileDescriptor = openFileDescriptor.getFileDescriptor();
                    Typeface build = new Object(fileDescriptor) { // from class: android.graphics.Typeface$Builder
                        static {
                            throw new NoClassDefFoundError();
                        }

                        public native /* synthetic */ Typeface build();

                        public native /* synthetic */ Typeface$Builder setItalic(boolean z10);

                        public native /* synthetic */ Typeface$Builder setWeight(int i11);
                    }.setWeight(mo24030f.m27857e()).setItalic(mo24030f.m27858f()).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException e10) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> m24044h = C4748k.m24044h(context, bVarArr, cancellationSignal);
        Object m24015k = m24015k();
        if (m24015k == null) {
            return null;
        }
        int length = bVarArr.length;
        boolean z10 = false;
        int i11 = 0;
        while (i11 < length) {
            C5643f.b bVar = bVarArr[i11];
            ByteBuffer byteBuffer = m24044h.get(bVar.m27856d());
            if (byteBuffer != null) {
                if (!m24020n(m24015k, byteBuffer, bVar.m27855c(), bVar.m27857e(), bVar.m27858f() ? 1 : 0)) {
                    m24018l(m24015k);
                    return null;
                }
                z10 = true;
            }
            i11++;
            z10 = z10;
        }
        if (!z10) {
            m24018l(m24015k);
            return null;
        }
        if (m24021o(m24015k) && (mo24017h = mo24017h(m24015k)) != null) {
            return Typeface.create(mo24017h, i10);
        }
        return null;
    }

    @Override // p087f0.C4747j
    /* renamed from: d */
    public Typeface mo24016d(Context context, Resources resources, int i10, String str, int i11) {
        if (!m24022p()) {
            return super.mo24016d(context, resources, i10, str, i11);
        }
        Object m24015k = m24015k();
        if (m24015k == null) {
            return null;
        }
        if (!m24019m(context, m24015k, str, 0, -1, -1, null)) {
            m24018l(m24015k);
            return null;
        }
        if (m24021o(m24015k)) {
            return mo24017h(m24015k);
        }
        return null;
    }

    /* renamed from: h */
    public Typeface mo24017h(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f27987g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f27993m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            return null;
        }
    }

    /* renamed from: l */
    public final void m24018l(Object obj) {
        try {
            this.f27992l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e10) {
        }
    }

    /* renamed from: m */
    public final boolean m24019m(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f27989i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            return false;
        }
    }

    /* renamed from: n */
    public final boolean m24020n(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f27990j.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            return false;
        }
    }

    /* renamed from: o */
    public final boolean m24021o(Object obj) {
        try {
            return ((Boolean) this.f27991k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            return false;
        }
    }

    /* renamed from: p */
    public final boolean m24022p() {
        if (this.f27989i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f27989i != null;
    }

    /* renamed from: q */
    public Method m24023q(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: r */
    public Method m24024r(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: s */
    public Method m24025s(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: t */
    public Method mo24026t(Class<?> cls) {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: u */
    public Class<?> m24027u() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: v */
    public Constructor<?> m24028v(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }

    /* renamed from: w */
    public Method m24029w(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
