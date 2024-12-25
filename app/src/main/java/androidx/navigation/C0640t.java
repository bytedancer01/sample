package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.navigation.AbstractC0639s;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/navigation/t.class
 */
@SuppressLint({"TypeParameterUnusedInFormals"})
/* renamed from: androidx.navigation.t */
/* loaded from: combined.jar:classes1.jar:androidx/navigation/t.class */
public class C0640t {

    /* renamed from: b */
    public static final HashMap<Class<?>, String> f4314b = new HashMap<>();

    /* renamed from: a */
    public final HashMap<String, AbstractC0639s<? extends C0631k>> f4315a = new HashMap<>();

    /* renamed from: c */
    public static String m3664c(Class<? extends AbstractC0639s> cls) {
        HashMap<Class<?>, String> hashMap = f4314b;
        String str = hashMap.get(cls);
        String str2 = str;
        if (str == null) {
            AbstractC0639s.b bVar = (AbstractC0639s.b) cls.getAnnotation(AbstractC0639s.b.class);
            str2 = bVar != null ? bVar.value() : null;
            if (!m3665g(str2)) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for " + cls.getSimpleName());
            }
            hashMap.put(cls, str2);
        }
        return str2;
    }

    /* renamed from: g */
    public static boolean m3665g(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    /* renamed from: a */
    public final AbstractC0639s<? extends C0631k> m3666a(AbstractC0639s<? extends C0631k> abstractC0639s) {
        return m3667b(m3664c(abstractC0639s.getClass()), abstractC0639s);
    }

    /* renamed from: b */
    public AbstractC0639s<? extends C0631k> m3667b(String str, AbstractC0639s<? extends C0631k> abstractC0639s) {
        if (m3665g(str)) {
            return this.f4315a.put(str, abstractC0639s);
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    /* renamed from: d */
    public final <T extends AbstractC0639s<?>> T m3668d(Class<T> cls) {
        return (T) m3669e(m3664c(cls));
    }

    /* renamed from: e */
    public <T extends AbstractC0639s<?>> T m3669e(String str) {
        if (!m3665g(str)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        AbstractC0639s<? extends C0631k> abstractC0639s = this.f4315a.get(str);
        if (abstractC0639s != null) {
            return abstractC0639s;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
    }

    /* renamed from: f */
    public Map<String, AbstractC0639s<? extends C0631k>> m3670f() {
        return this.f4315a;
    }
}
