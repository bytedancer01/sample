package fi;

import ci.C1128n;
import ci.C1129o;
import com.amplifyframework.core.model.ModelIdentifier;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kh.C5617k;
import kh.C5621o;
import kh.C5624r;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import org.jetbrains.annotations.NotNull;
import p172jh.C5382a;
import p372vh.C9367f;
import th.C8749a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fi/g.class
 */
/* renamed from: fi.g */
/* loaded from: combined.jar:classes2.jar:fi/g.class */
public final class C4868g {

    /* renamed from: a */
    @NotNull
    public static final C4868g f28558a = new C4868g();

    /* renamed from: a */
    public final <S> S m24752a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* renamed from: b */
    public final <S> List<S> m24753b(Class<S> cls, ClassLoader classLoader) {
        List<S> m27718G;
        try {
            m27718G = m24755d(cls, classLoader);
        } catch (Throwable th2) {
            m27718G = C5624r.m27718G(ServiceLoader.load(cls, classLoader));
        }
        return m27718G;
    }

    @NotNull
    /* renamed from: c */
    public final List<MainDispatcherFactory> m24754c() {
        List<MainDispatcherFactory> m24753b;
        MainDispatcherFactory mainDispatcherFactory;
        MainDispatcherFactory mainDispatcherFactory2;
        if (!C4869h.m24758a()) {
            return m24753b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException e10) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException e11) {
                mainDispatcherFactory2 = null;
            }
            if (mainDispatcherFactory2 == null) {
                m24753b = arrayList;
            } else {
                arrayList.add(mainDispatcherFactory2);
                m24753b = arrayList;
            }
        } catch (Throwable th2) {
            m24753b = m24753b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        return m24753b;
    }

    @NotNull
    /* renamed from: d */
    public final <S> List<S> m24755d(@NotNull Class<S> cls, @NotNull ClassLoader classLoader) {
        ArrayList list = Collections.list(classLoader.getResources(C9367f.m39532k("META-INF/services/", cls.getName())));
        C9367f.m39525d(list, "java.util.Collections.list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5621o.m27710p(arrayList, f28558a.m24756e((URL) it.next()));
        }
        Set m27721J = C5624r.m27721J(arrayList);
        if (!(!m27721J.isEmpty())) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        ArrayList arrayList2 = new ArrayList(C5617k.m27708n(m27721J, 10));
        Iterator it2 = m27721J.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f28558a.m24752a((String) it2.next(), classLoader, cls));
        }
        return arrayList2;
    }

    /* renamed from: e */
    public final List<String> m24756e(URL url) {
        BufferedReader bufferedReader;
        String url2 = url.toString();
        if (C1128n.m6732y(url2, "jar", false, 2, null)) {
            String m6778t0 = C1129o.m6778t0(C1129o.m6775q0(url2, "jar:file:", null, 2, null), '!', null, 2, null);
            String m6775q0 = C1129o.m6775q0(url2, "!/", null, 2, null);
            JarFile jarFile = new JarFile(m6778t0, false);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(m6775q0)), "UTF-8"));
                try {
                    List<String> m24757f = f28558a.m24757f(bufferedReader);
                    C8749a.m37542a(bufferedReader, null);
                    jarFile.close();
                    return m24757f;
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        jarFile.close();
                        throw th3;
                    } catch (Throwable th4) {
                        C5382a.m26732a(th2, th4);
                        throw th2;
                    }
                }
            }
        } else {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> m24757f2 = f28558a.m24757f(bufferedReader);
                C8749a.m37542a(bufferedReader, null);
                return m24757f2;
            } finally {
            }
        }
    }

    /* renamed from: f */
    public final List<String> m24757f(BufferedReader bufferedReader) {
        boolean z10;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return C5624r.m27718G(linkedHashSet);
            }
            String m6779u0 = C1129o.m6779u0(readLine, ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER, null, 2, null);
            if (m6779u0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            String obj = C1129o.m6780v0(m6779u0).toString();
            int i10 = 0;
            while (true) {
                if (i10 >= obj.length()) {
                    z10 = true;
                    break;
                }
                char charAt = obj.charAt(i10);
                if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                    z10 = false;
                    break;
                }
                i10++;
            }
            if (!z10) {
                throw new IllegalArgumentException(C9367f.m39532k("Illegal service provider class name: ", obj).toString());
            }
            boolean z11 = false;
            if (obj.length() > 0) {
                z11 = true;
            }
            if (z11) {
                linkedHashSet.add(obj);
            }
        }
    }
}
