package p087f0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p069e0.C4564c;
import p191l0.C5643f;
import p294r.C7936i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f0/f.class
 */
/* renamed from: f0.f */
/* loaded from: combined.jar:classes1.jar:f0/f.class */
public class C4743f extends C4747j {

    /* renamed from: b */
    public static final Class<?> f27983b;

    /* renamed from: c */
    public static final Constructor<?> f27984c;

    /* renamed from: d */
    public static final Method f27985d;

    /* renamed from: e */
    public static final Method f27986e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            method2 = null;
        }
        f27984c = constructor;
        f27983b = cls;
        f27985d = method2;
        f27986e = method;
    }

    /* renamed from: g */
    public static boolean m24011g(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f27985d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            return false;
        }
    }

    /* renamed from: h */
    public static Typeface m24012h(Object obj) {
        try {
            Object newInstance = Array.newInstance(f27983b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f27986e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m24013i() {
        Method method = f27985d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: j */
    public static Object m24014j() {
        try {
            return f27984c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            return null;
        }
    }

    @Override // p087f0.C4747j
    /* renamed from: a */
    public Typeface mo24008a(Context context, C4564c.b bVar, Resources resources, int i10) {
        Object m24014j = m24014j();
        if (m24014j == null) {
            return null;
        }
        for (C4564c.c cVar : bVar.m23031a()) {
            ByteBuffer m24038b = C4748k.m24038b(context, resources, cVar.m23033b());
            if (m24038b == null || !m24011g(m24014j, m24038b, cVar.m23034c(), cVar.m23036e(), cVar.m23037f())) {
                return null;
            }
        }
        return m24012h(m24014j);
    }

    @Override // p087f0.C4747j
    /* renamed from: b */
    public Typeface mo24009b(Context context, CancellationSignal cancellationSignal, C5643f.b[] bVarArr, int i10) {
        Object m24014j = m24014j();
        if (m24014j == null) {
            return null;
        }
        C7936i c7936i = new C7936i();
        for (C5643f.b bVar : bVarArr) {
            Uri m27856d = bVar.m27856d();
            ByteBuffer byteBuffer = (ByteBuffer) c7936i.get(m27856d);
            ByteBuffer byteBuffer2 = byteBuffer;
            if (byteBuffer == null) {
                byteBuffer2 = C4748k.m24042f(context, cancellationSignal, m27856d);
                c7936i.put(m27856d, byteBuffer2);
            }
            if (byteBuffer2 == null || !m24011g(m24014j, byteBuffer2, bVar.m27855c(), bVar.m27857e(), bVar.m27858f())) {
                return null;
            }
        }
        Typeface m24012h = m24012h(m24014j);
        if (m24012h == null) {
            return null;
        }
        return Typeface.create(m24012h, i10);
    }
}
