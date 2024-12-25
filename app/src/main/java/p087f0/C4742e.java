package p087f0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p069e0.C4564c;
import p191l0.C5643f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f0/e.class
 */
/* renamed from: f0.e */
/* loaded from: combined.jar:classes1.jar:f0/e.class */
public class C4742e extends C4747j {

    /* renamed from: b */
    public static Class<?> f27978b;

    /* renamed from: c */
    public static Constructor<?> f27979c;

    /* renamed from: d */
    public static Method f27980d;

    /* renamed from: e */
    public static Method f27981e;

    /* renamed from: f */
    public static boolean f27982f;

    /* renamed from: g */
    public static boolean m24004g(Object obj, String str, int i10, boolean z10) {
        m24006j();
        try {
            return ((Boolean) f27980d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: h */
    public static Typeface m24005h(Object obj) {
        m24006j();
        try {
            Object newInstance = Array.newInstance(f27978b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f27981e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: j */
    public static void m24006j() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f27982f) {
            return;
        }
        f27982f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f27979c = constructor;
        f27978b = cls;
        f27980d = method2;
        f27981e = method;
    }

    /* renamed from: k */
    public static Object m24007k() {
        m24006j();
        try {
            return f27979c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // p087f0.C4747j
    /* renamed from: a */
    public Typeface mo24008a(Context context, C4564c.b bVar, Resources resources, int i10) {
        Object m24007k = m24007k();
        for (C4564c.c cVar : bVar.m23031a()) {
            File m24041e = C4748k.m24041e(context);
            if (m24041e == null) {
                return null;
            }
            try {
                if (!C4748k.m24039c(m24041e, resources, cVar.m23033b())) {
                    m24041e.delete();
                    return null;
                }
                boolean m24004g = m24004g(m24007k, m24041e.getPath(), cVar.m23036e(), cVar.m23037f());
                m24041e.delete();
                if (!m24004g) {
                    return null;
                }
            } catch (RuntimeException e10) {
                m24041e.delete();
                return null;
            } catch (Throwable th2) {
                m24041e.delete();
                throw th2;
            }
        }
        return m24005h(m24007k);
    }

    @Override // p087f0.C4747j
    /* renamed from: b */
    public Typeface mo24009b(Context context, CancellationSignal cancellationSignal, C5643f.b[] bVarArr, int i10) {
        if (bVarArr.length < 1) {
            return null;
        }
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
                File m24010i = m24010i(openFileDescriptor);
                if (m24010i != null && m24010i.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(m24010i);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface m24032c = super.m24032c(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return m24032c;
                } finally {
                }
            } finally {
            }
        } catch (IOException e10) {
            return null;
        }
    }

    /* renamed from: i */
    public final File m24010i(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
            return null;
        } catch (ErrnoException e10) {
            return null;
        }
    }
}
