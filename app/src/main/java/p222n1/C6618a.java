package p222n1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import com.amplifyframework.core.model.ModelIdentifier;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n1/a.class
 */
/* renamed from: n1.a */
/* loaded from: combined.jar:classes1.jar:n1/a.class */
public final class C6618a {

    /* renamed from: a */
    public static final Set<File> f34528a = new HashSet();

    /* renamed from: b */
    public static final boolean f34529b = m30548n(System.getProperty("java.vm.version"));

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n1/a$a.class
     */
    /* renamed from: n1.a$a */
    /* loaded from: combined.jar:classes1.jar:n1/a$a.class */
    public static final class a {
        /* renamed from: a */
        public static void m30550a(ClassLoader classLoader, List<? extends File> list, File file) {
            IOException[] iOExceptionArr;
            Object obj = C6618a.m30541g(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            C6618a.m30540f(obj, "dexElements", m30551b(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                }
                Field m30541g = C6618a.m30541g(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) m30541g.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    iOExceptionArr = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr, arrayList.size(), iOExceptionArr2.length);
                }
                m30541g.set(obj, iOExceptionArr);
                IOException iOException = new IOException("I/O exception during makeDexElement");
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        /* renamed from: b */
        public static Object[] m30551b(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
            return (Object[]) C6618a.m30542h(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, arrayList, file, arrayList2);
        }
    }

    /* renamed from: d */
    public static void m30538d(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            Log.i("MultiDex", "Clearing old secondary dex dir (" + file.getPath() + ").");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : listFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (file2.delete()) {
                    Log.i("MultiDex", "Deleted old file " + file2.getPath());
                } else {
                    Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
                }
            }
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old secondary dex dir " + file.getPath());
                return;
            }
            Log.w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
        }
    }

    /* renamed from: e */
    public static void m30539e(Context context, File file, File file2, String str, String str2, boolean z10) {
        Set<File> set = f34528a;
        synchronized (set) {
            if (set.contains(file)) {
                return;
            }
            set.add(file);
            Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + Build.VERSION.SDK_INT + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            ClassLoader m30544j = m30544j(context);
            if (m30544j == null) {
                return;
            }
            try {
                m30538d(context);
            } catch (Throwable th2) {
                Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th2);
            }
            File m30545k = m30545k(context, file2, str);
            C6619b c6619b = new C6619b(file, m30545k);
            try {
                try {
                    m30547m(m30544j, m30545k, c6619b.m30561w(context, str2, false));
                } catch (IOException e10) {
                    if (!z10) {
                        throw e10;
                    }
                    Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e10);
                    m30547m(m30544j, m30545k, c6619b.m30561w(context, str2, true));
                }
                try {
                    r7 = null;
                } catch (IOException e11) {
                }
                if (r7 != null) {
                    throw r7;
                }
            } finally {
                try {
                    c6619b.close();
                } catch (IOException e12) {
                }
            }
        }
    }

    /* renamed from: f */
    public static void m30540f(Object obj, String str, Object[] objArr) {
        Field m30541g = m30541g(obj, str);
        Object[] objArr2 = (Object[]) m30541g.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        m30541g.set(obj, objArr3);
    }

    /* renamed from: g */
    public static Field m30541g(Object obj, String str) {
        Field declaredField;
        Class<?> cls = obj.getClass();
        while (true) {
            Class<?> cls2 = cls;
            if (cls2 == null) {
                throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
            }
            try {
                declaredField = cls2.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                    break;
                }
                break;
            } catch (NoSuchFieldException e10) {
                cls = cls2.getSuperclass();
            }
        }
        return declaredField;
    }

    /* renamed from: h */
    public static Method m30542h(Object obj, String str, Class<?>... clsArr) {
        Method declaredMethod;
        Class<?> cls = obj.getClass();
        while (true) {
            Class<?> cls2 = cls;
            if (cls2 == null) {
                throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
            }
            try {
                declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                    break;
                }
                break;
            } catch (NoSuchMethodException e10) {
                cls = cls2.getSuperclass();
            }
        }
        return declaredMethod;
    }

    /* renamed from: i */
    public static ApplicationInfo m30543i(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException e10) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e10);
            return null;
        }
    }

    /* renamed from: j */
    public static ClassLoader m30544j(Context context) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                return classLoader;
            }
            Log.e("MultiDex", "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
            return null;
        } catch (RuntimeException e10) {
            Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e10);
            return null;
        }
    }

    /* renamed from: k */
    public static File m30545k(Context context, File file, String str) {
        File file2;
        File file3 = new File(file, "code_cache");
        try {
            m30549o(file3);
            file2 = file3;
        } catch (IOException e10) {
            file2 = new File(context.getFilesDir(), "code_cache");
            m30549o(file2);
        }
        File file4 = new File(file2, str);
        m30549o(file4);
        return file4;
    }

    /* renamed from: l */
    public static void m30546l(Context context) {
        String str;
        Log.i("MultiDex", "Installing application");
        if (f34529b) {
            str = "VM has multidex support, MultiDex support library is disabled.";
        } else {
            try {
                ApplicationInfo m30543i = m30543i(context);
                if (m30543i == null) {
                    Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                    return;
                } else {
                    m30539e(context, new File(m30543i.sourceDir), new File(m30543i.dataDir), "secondary-dexes", "", true);
                    str = "install done";
                }
            } catch (Exception e10) {
                Log.e("MultiDex", "MultiDex installation failure", e10);
                throw new RuntimeException("MultiDex installation failed (" + e10.getMessage() + ").");
            }
        }
        Log.i("MultiDex", str);
    }

    /* renamed from: m */
    public static void m30547m(ClassLoader classLoader, File file, List<? extends File> list) {
        if (list.isEmpty()) {
            return;
        }
        a.m30550a(classLoader, list, file);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r0 >= 1) goto L22;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m30548n(java.lang.String r5) {
        /*
            r0 = 0
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r5
            if (r0 == 0) goto L7b
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            r1 = r0
            r2 = r5
            java.lang.String r3 = "."
            r1.<init>(r2, r3)
            r12 = r0
            r0 = r12
            boolean r0 = r0.hasMoreTokens()
            r8 = r0
            r0 = 0
            r11 = r0
            r0 = r8
            if (r0 == 0) goto L2e
            r0 = r12
            java.lang.String r0 = r0.nextToken()
            r10 = r0
            goto L31
        L2e:
            r0 = 0
            r10 = r0
        L31:
            r0 = r12
            boolean r0 = r0.hasMoreTokens()
            if (r0 == 0) goto L40
            r0 = r12
            java.lang.String r0 = r0.nextToken()
            r11 = r0
        L40:
            r0 = r9
            r8 = r0
            r0 = r10
            if (r0 == 0) goto L7b
            r0 = r9
            r8 = r0
            r0 = r11
            if (r0 == 0) goto L7b
            r0 = r10
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L76
            r7 = r0
            r0 = r11
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L76
            r6 = r0
            r0 = r7
            r1 = 2
            if (r0 > r1) goto L71
            r0 = r9
            r8 = r0
            r0 = r7
            r1 = 2
            if (r0 != r1) goto L7b
            r0 = r9
            r8 = r0
            r0 = r6
            r1 = 1
            if (r0 < r1) goto L7b
        L71:
            r0 = 1
            r8 = r0
            goto L7b
        L76:
            r10 = move-exception
            r0 = r9
            r8 = r0
        L7b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            java.lang.String r1 = "VM with version "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            if (r0 == 0) goto L9f
            java.lang.String r0 = " has multidex support"
            r5 = r0
            goto La3
        L9f:
            java.lang.String r0 = " does not have multidex support"
            r5 = r0
        La3:
            r0 = r10
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = "MultiDex"
            r1 = r10
            java.lang.String r1 = r1.toString()
            int r0 = android.util.Log.i(r0, r1)
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p222n1.C6618a.m30548n(java.lang.String):boolean");
    }

    /* renamed from: o */
    public static void m30549o(File file) {
        String str;
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            str = "Failed to create dir " + file.getPath() + ". Parent file is null.";
        } else {
            str = "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite();
        }
        Log.e("MultiDex", str);
        throw new IOException("Failed to create directory " + file.getPath());
    }
}
