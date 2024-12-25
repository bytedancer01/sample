package p049d;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:d/j.class
 */
/* renamed from: d.j */
/* loaded from: combined.jar:classes1.jar:d/j.class */
public class C4284j {

    /* renamed from: a */
    public static Field f26339a;

    /* renamed from: b */
    public static boolean f26340b;

    /* renamed from: c */
    public static Class<?> f26341c;

    /* renamed from: d */
    public static boolean f26342d;

    /* renamed from: e */
    public static Field f26343e;

    /* renamed from: f */
    public static boolean f26344f;

    /* renamed from: g */
    public static Field f26345g;

    /* renamed from: h */
    public static boolean f26346h;

    /* renamed from: a */
    public static void m21671a(Resources resources) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return;
        }
        if (i10 >= 24) {
            m21674d(resources);
        } else if (i10 >= 23) {
            m21673c(resources);
        } else {
            m21672b(resources);
        }
    }

    /* renamed from: b */
    public static void m21672b(Resources resources) {
        Map map;
        if (!f26340b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f26339a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e10);
            }
            f26340b = true;
        }
        Field field = f26339a;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e11);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    public static void m21673c(Resources resources) {
        if (!f26340b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f26339a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e10);
            }
            f26340b = true;
        }
        Field field = f26339a;
        Object obj = null;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e11);
                obj = null;
            }
        }
        if (obj == null) {
            return;
        }
        m21675e(obj);
    }

    /* renamed from: d */
    public static void m21674d(Resources resources) {
        Object obj;
        if (!f26346h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f26345g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f26346h = true;
        }
        Field field = f26345g;
        if (field == null) {
            return;
        }
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f26340b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f26339a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
            }
            f26340b = true;
        }
        Field field2 = f26339a;
        Object obj2 = null;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e13) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
                obj2 = null;
            }
        }
        if (obj2 != null) {
            m21675e(obj2);
        }
    }

    /* renamed from: e */
    public static void m21675e(Object obj) {
        LongSparseArray longSparseArray;
        if (!f26342d) {
            try {
                f26341c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f26342d = true;
        }
        Class<?> cls = f26341c;
        if (cls == null) {
            return;
        }
        if (!f26344f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f26343e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f26344f = true;
        }
        Field field = f26343e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
