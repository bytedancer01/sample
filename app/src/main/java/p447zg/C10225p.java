package p447zg;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import com.sun.jna.Function;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.Reference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zg/p.class
 */
/* renamed from: zg.p */
/* loaded from: combined.jar:classes2.jar:zg/p.class */
public class C10225p {

    /* renamed from: h */
    public static final Logger f46795h = Logger.getLogger(C10225p.class.getName());

    /* renamed from: i */
    public static final Level f46796i;

    /* renamed from: j */
    public static final Map<String, Reference<C10225p>> f46797j;

    /* renamed from: k */
    public static final Map<String, List<String>> f46798k;

    /* renamed from: l */
    public static final List<String> f46799l;

    /* renamed from: m */
    public static Method f46800m;

    /* renamed from: a */
    public long f46801a;

    /* renamed from: b */
    public final String f46802b;

    /* renamed from: c */
    public final String f46803c;

    /* renamed from: d */
    public final Map<String, Function> f46804d;

    /* renamed from: e */
    public final int f46805e;

    /* renamed from: f */
    public String f46806f;

    /* renamed from: g */
    public final Map<String, ?> f46807g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:zg/p$a.class
     */
    /* renamed from: zg.p$a */
    /* loaded from: combined.jar:classes2.jar:zg/p$a.class */
    public class a extends Function {

        /* renamed from: k */
        public final C10225p f46808k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C10225p c10225p, C10225p c10225p2, String str, int i10, String str2) {
            super(c10225p2, str, i10, str2);
            this.f46808k = c10225p;
        }

        @Override // com.sun.jna.Function
        /* renamed from: j0 */
        public Object mo21340j0(Method method, Class<?>[] clsArr, Class<?> cls, Object[] objArr, Map<String, ?> map) {
            return Integer.valueOf(Native.getLastError());
        }

        @Override // com.sun.jna.Function
        /* renamed from: k0 */
        public Object mo21341k0(Object[] objArr, Class<?> cls, boolean z10, int i10) {
            return Integer.valueOf(Native.getLastError());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:zg/p$b.class
     */
    /* renamed from: zg.p$b */
    /* loaded from: combined.jar:classes2.jar:zg/p$b.class */
    public static final class b implements FilenameFilter {

        /* renamed from: a */
        public final String f46809a;

        public b(String str) {
            this.f46809a = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0056, code lost:
        
            if (r3.f46809a.startsWith("lib") != false) goto L8;
         */
        @Override // java.io.FilenameFilter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean accept(java.io.File r4, java.lang.String r5) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r4 = r0
                r0 = r4
                java.lang.String r1 = "lib"
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r4
                r1 = r3
                java.lang.String r1 = r1.f46809a
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r4
                java.lang.String r1 = ".so"
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r5
                r1 = r4
                java.lang.String r1 = r1.toString()
                boolean r0 = r0.startsWith(r1)
                if (r0 != 0) goto L59
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r4 = r0
                r0 = r4
                r1 = r3
                java.lang.String r1 = r1.f46809a
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r4
                java.lang.String r1 = ".so"
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r5
                r1 = r4
                java.lang.String r1 = r1.toString()
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L65
                r0 = r3
                java.lang.String r0 = r0.f46809a
                java.lang.String r1 = "lib"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L65
            L59:
                r0 = r5
                boolean r0 = p447zg.C10225p.m42766a(r0)
                if (r0 == 0) goto L65
                r0 = 1
                r6 = r0
                goto L67
            L65:
                r0 = 0
                r6 = r0
            L67:
                r0 = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p447zg.C10225p.b.accept(java.io.File, java.lang.String):boolean");
        }
    }

    static {
        String sb2;
        f46796i = Native.f26119d ? Level.INFO : Level.FINE;
        f46797j = new HashMap();
        f46798k = Collections.synchronizedMap(new HashMap());
        f46799l = new ArrayList();
        if (Native.f26127l == 0) {
            throw new Error("Native library not initialized");
        }
        f46800m = null;
        try {
            f46800m = Throwable.class.getMethod("addSuppressed", Throwable.class);
        } catch (NoSuchMethodException e10) {
        } catch (SecurityException e11) {
            Logger.getLogger(C10225p.class.getName()).log(Level.SEVERE, "Failed to initialize 'addSuppressed' method", (Throwable) e11);
        }
        String m21381w = Native.m21381w("jnidispatch");
        if (m21381w != null) {
            f46799l.add(m21381w);
        }
        if (System.getProperty("jna.platform.library.path") == null && !C10229t.m42815u()) {
            if (C10229t.m42806l() || C10229t.m42814t() || C10229t.m42803i() || C10229t.m42816v()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(C10229t.m42814t() ? "/" : "");
                sb3.append(Native.f26127l * 8);
                sb2 = sb3.toString();
            } else {
                sb2 = "";
            }
            String[] strArr = {"/usr/lib" + sb2, "/lib" + sb2, "/usr/lib", "/lib"};
            if (C10229t.m42806l() || C10229t.m42816v() || C10229t.m42804j()) {
                String m42774q = m42774q();
                strArr = new String[]{"/usr/lib/" + m42774q, "/lib/" + m42774q, "/usr/lib" + sb2, "/lib" + sb2, "/usr/lib", "/lib"};
            }
            String[] strArr2 = strArr;
            if (C10229t.m42806l()) {
                ArrayList<String> m42773p = m42773p();
                for (int length = strArr.length - 1; length >= 0; length--) {
                    int indexOf = m42773p.indexOf(strArr[length]);
                    if (indexOf != -1) {
                        m42773p.remove(indexOf);
                    }
                    m42773p.add(0, strArr[length]);
                }
                strArr2 = (String[]) m42773p.toArray(new String[0]);
            }
            String str = "";
            String str2 = "";
            int i10 = 0;
            while (i10 < strArr2.length) {
                File file = new File(strArr2[i10]);
                String str3 = str;
                String str4 = str2;
                if (file.exists()) {
                    str3 = str;
                    str4 = str2;
                    if (file.isDirectory()) {
                        str3 = str + str2 + strArr2[i10];
                        str4 = File.pathSeparator;
                    }
                }
                i10++;
                str = str3;
                str2 = str4;
            }
            if (!"".equals(str)) {
                System.setProperty("jna.platform.library.path", str);
            }
        }
        f46799l.addAll(m42775u("jna.platform.library.path"));
    }

    public C10225p(String str, String str2, long j10, Map<String, ?> map) {
        HashMap hashMap = new HashMap();
        this.f46804d = hashMap;
        String m42788o = m42788o(str);
        this.f46802b = m42788o;
        this.f46803c = str2;
        this.f46801a = j10;
        Object obj = map.get("calling-convention");
        int intValue = obj instanceof Number ? ((Number) obj).intValue() : 0;
        this.f46805e = intValue;
        this.f46807g = map;
        String str3 = (String) map.get("string-encoding");
        this.f46806f = str3;
        if (str3 == null) {
            this.f46806f = Native.m21369k();
        }
        if (C10229t.m42815u() && "kernel32".equals(m42788o.toLowerCase())) {
            synchronized (hashMap) {
                hashMap.put(m42770f("GetLastError", intValue, this.f46806f), new a(this, this, "GetLastError", 63, this.f46806f));
            }
        }
    }

    /* renamed from: A */
    public static int m42764A(Map<String, ?> map) {
        Object obj = map.get("open-flags");
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        return -1;
    }

    /* renamed from: B */
    public static double m42765B(String str) {
        String str2;
        int indexOf = str.indexOf(InstructionFileId.DOT);
        double d10 = 1.0d;
        double d11 = 0.0d;
        while (str != null) {
            if (indexOf != -1) {
                str2 = str.substring(0, indexOf);
                str = str.substring(indexOf + 1);
                indexOf = str.indexOf(InstructionFileId.DOT);
            } else {
                str2 = str;
                str = null;
            }
            try {
                d11 += Integer.parseInt(str2) / d10;
                d10 *= 100.0d;
            } catch (NumberFormatException e10) {
                return 0.0d;
            }
        }
        return d11;
    }

    /* renamed from: b */
    public static void m42767b(Throwable th2, Throwable th3) {
        Method method = f46800m;
        if (method == null) {
            return;
        }
        try {
            method.invoke(th2, th3);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to call addSuppressedMethod", e10);
        } catch (IllegalArgumentException e11) {
            throw new RuntimeException("Failed to call addSuppressedMethod", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to call addSuppressedMethod", e12);
        }
    }

    /* renamed from: d */
    public static void m42768d() {
        LinkedHashSet linkedHashSet;
        Map<String, Reference<C10225p>> map = f46797j;
        synchronized (map) {
            linkedHashSet = new LinkedHashSet(map.values());
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            C10225p c10225p = (C10225p) ((Reference) it.next()).get();
            if (c10225p != null) {
                c10225p.m42781c();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        return r6;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m42769e(java.lang.String r6, java.util.List<java.lang.String> r7) {
        /*
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            boolean r0 = r0.isAbsolute()
            if (r0 == 0) goto L10
            r0 = r6
            return r0
        L10:
            r0 = r6
            java.lang.String r0 = m42778x(r0)
            r8 = r0
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L1c:
            r0 = r8
            r6 = r0
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L91
            r0 = r7
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r6 = r0
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r9
            boolean r0 = r0.exists()
            if (r0 == 0) goto L47
            r0 = r9
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
        L47:
            boolean r0 = p447zg.C10229t.m42808n()
            if (r0 == 0) goto L1c
            r0 = r8
            java.lang.String r1 = ".dylib"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r9
            r1 = r8
            r2 = 0
            r3 = r8
            java.lang.String r4 = ".dylib"
            int r3 = r3.lastIndexOf(r4)
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r9
            java.lang.String r1 = ".jnilib"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r6
            r3 = r9
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            r6 = r0
            r0 = r6
            boolean r0 = r0.exists()
            if (r0 == 0) goto L1c
            r0 = r6
            java.lang.String r0 = r0.getAbsolutePath()
            r6 = r0
        L91:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p447zg.C10225p.m42769e(java.lang.String, java.util.List):java.lang.String");
    }

    /* renamed from: f */
    public static String m42770f(String str, int i10, String str2) {
        return str + "|" + i10 + "|" + str2;
    }

    /* renamed from: m */
    public static final C10225p m42771m(String str) {
        return m42772n(str, Collections.emptyMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (p447zg.C10229t.m42800f() != false) goto L11;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p447zg.C10225p m42772n(java.lang.String r7, java.util.Map<java.lang.String, ?> r8) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p447zg.C10225p.m42772n(java.lang.String, java.util.Map):zg.p");
    }

    /* renamed from: p */
    public static ArrayList<String> m42773p() {
        BufferedReader bufferedReader;
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("/sbin/ldconfig -p").getInputStream()));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        int indexOf = readLine.indexOf(" => ");
                        int lastIndexOf = readLine.lastIndexOf(47);
                        if (indexOf != -1 && lastIndexOf != -1 && indexOf < lastIndexOf) {
                            String substring = readLine.substring(indexOf + 4, lastIndexOf);
                            if (!arrayList.contains(substring)) {
                                arrayList.add(substring);
                            }
                        }
                    } catch (Exception e10) {
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return arrayList;
                    } catch (Throwable th2) {
                        bufferedReader2 = bufferedReader;
                        th = th2;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException e11) {
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
            } catch (Exception e12) {
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e13) {
        }
        return arrayList;
    }

    /* renamed from: q */
    public static String m42774q() {
        String str;
        String str2 = C10229t.f46826j;
        String str3 = C10229t.m42816v() ? "-kfreebsd" : C10229t.m42804j() ? "" : "-linux";
        String str4 = "-gnu";
        if (C10229t.m42805k()) {
            str = C10229t.m42799e() ? "x86_64" : "i386";
        } else if (C10229t.m42811q()) {
            str = C10229t.m42799e() ? "powerpc64" : "powerpc";
        } else if (C10229t.m42801g()) {
            str = "arm";
            str4 = "-gnueabi";
        } else {
            str = str2;
            if (str2.equals("mips64el")) {
                str4 = "-gnuabi64";
                str = str2;
            }
        }
        return str + str3 + str4;
    }

    /* renamed from: u */
    public static List<String> m42775u(String str) {
        String property = System.getProperty(str, "");
        if ("".equals(property)) {
            return Collections.emptyList();
        }
        StringTokenizer stringTokenizer = new StringTokenizer(property, File.pathSeparator);
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (!"".equals(nextToken)) {
                arrayList.add(nextToken);
            }
        }
        return arrayList;
    }

    /* renamed from: v */
    public static boolean m42776v(String str) {
        if (!str.startsWith("lib")) {
            return false;
        }
        int lastIndexOf = str.lastIndexOf(".so.");
        if (lastIndexOf == -1) {
            return false;
        }
        int i10 = lastIndexOf + 4;
        if (i10 >= str.length()) {
            return false;
        }
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (!Character.isDigit(charAt) && charAt != '.') {
                return false;
            }
            i10++;
        }
        return true;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0535  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p447zg.C10225p m42777w(java.lang.String r8, java.util.Map<java.lang.String, ?> r9) {
        /*
            Method dump skipped, instructions count: 1755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p447zg.C10225p.m42777w(java.lang.String, java.util.Map):zg.p");
    }

    /* renamed from: x */
    public static String m42778x(String str) {
        String str2;
        if (C10229t.m42808n()) {
            if (str.startsWith("lib") && (str.endsWith(".dylib") || str.endsWith(".jnilib"))) {
                return str;
            }
            String mapLibraryName = System.mapLibraryName(str);
            String str3 = mapLibraryName;
            if (mapLibraryName.endsWith(".jnilib")) {
                str3 = mapLibraryName.substring(0, mapLibraryName.lastIndexOf(".jnilib")) + ".dylib";
            }
            return str3;
        }
        if (C10229t.m42806l() || C10229t.m42803i()) {
            str2 = str;
            if (!m42776v(str)) {
                if (str.endsWith(".so")) {
                    str2 = str;
                }
            }
            return str2;
        }
        if (C10229t.m42800f()) {
            if (str.startsWith("lib")) {
                return str;
            }
        } else if (C10229t.m42815u() && (str.endsWith(".drv") || str.endsWith(".dll"))) {
            return str;
        }
        str2 = System.mapLibraryName(str);
        return str2;
    }

    /* renamed from: y */
    public static String m42779y(String str) {
        File file = new File(str);
        if (file.isAbsolute()) {
            if (str.indexOf(".framework") != -1 && file.exists()) {
                return file.getAbsolutePath();
            }
            File file2 = new File(new File(file.getParentFile(), file.getName() + ".framework"), file.getName());
            if (file2.exists()) {
                return file2.getAbsolutePath();
            }
            return null;
        }
        String property = System.getProperty("user.home");
        int i10 = 0;
        String str2 = str;
        if (str.indexOf(".framework") == -1) {
            str2 = str + ".framework/" + str;
            i10 = 0;
        }
        while (i10 < 3) {
            String str3 = new String[]{property, "", "/System"}[i10] + "/Library/Frameworks/" + str2;
            if (new File(str3).exists()) {
                return str3;
            }
            i10++;
        }
        return null;
    }

    /* renamed from: z */
    public static String m42780z(String str, List<String> list) {
        File file = new File(str);
        if (file.isAbsolute()) {
            list = Arrays.asList(file.getParent());
        }
        b bVar = new b(str);
        LinkedList linkedList = new LinkedList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            File[] listFiles = new File(it.next()).listFiles(bVar);
            if (listFiles != null && listFiles.length > 0) {
                linkedList.addAll(Arrays.asList(listFiles));
            }
        }
        double d10 = -1.0d;
        String str2 = null;
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            String absolutePath = ((File) it2.next()).getAbsolutePath();
            double m42765B = m42765B(absolutePath.substring(absolutePath.lastIndexOf(".so.") + 4));
            if (m42765B > d10) {
                str2 = absolutePath;
                d10 = m42765B;
            }
        }
        return str2;
    }

    /* renamed from: c */
    public void m42781c() {
        HashSet hashSet = new HashSet();
        Map<String, Reference<C10225p>> map = f46797j;
        synchronized (map) {
            for (Map.Entry<String, Reference<C10225p>> entry : map.entrySet()) {
                if (entry.getValue().get() == this) {
                    hashSet.add(entry.getKey());
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                f46797j.remove((String) it.next());
            }
        }
        synchronized (this) {
            long j10 = this.f46801a;
            if (j10 != 0) {
                Native.close(j10);
                this.f46801a = 0L;
            }
        }
    }

    public void finalize() {
        m42781c();
    }

    /* renamed from: g */
    public File m42782g() {
        if (this.f46803c == null) {
            return null;
        }
        return new File(this.f46803c);
    }

    /* renamed from: h */
    public Function m42783h(String str) {
        return m42784i(str, this.f46805e);
    }

    /* renamed from: i */
    public Function m42784i(String str, int i10) {
        return m42785j(str, i10, this.f46806f);
    }

    /* renamed from: j */
    public Function m42785j(String str, int i10, String str2) {
        Function function;
        if (str == null) {
            throw new NullPointerException("Function name may not be null");
        }
        synchronized (this.f46804d) {
            String m42770f = m42770f(str, i10, str2);
            Function function2 = this.f46804d.get(m42770f);
            function = function2;
            if (function2 == null) {
                function = new Function(this, str, i10, str2);
                this.f46804d.put(m42770f, function);
            }
        }
        return function;
    }

    /* renamed from: k */
    public Function m42786k(String str, Method method) {
        InterfaceC10214e interfaceC10214e = (InterfaceC10214e) this.f46807g.get("function-mapper");
        if (interfaceC10214e != null) {
            str = interfaceC10214e.getFunctionName(this, method);
        }
        String property = System.getProperty("jna.profiler.prefix", "$$YJP$$");
        String str2 = str;
        if (str.startsWith(property)) {
            str2 = str.substring(property.length());
        }
        int i10 = this.f46805e;
        Class<?>[] exceptionTypes = method.getExceptionTypes();
        int i11 = 0;
        while (i11 < exceptionTypes.length) {
            int i12 = i10;
            if (C10221l.class.isAssignableFrom(exceptionTypes[i11])) {
                i12 = i10 | 64;
            }
            i11++;
            i10 = i12;
        }
        return m42784i(str2, i10);
    }

    /* renamed from: l */
    public Pointer m42787l(String str) {
        try {
            return new Pointer(m42791t(str));
        } catch (UnsatisfiedLinkError e10) {
            throw new UnsatisfiedLinkError("Error looking up '" + str + "': " + e10.getMessage());
        }
    }

    /* renamed from: o */
    public final String m42788o(String str) {
        String m42778x = m42778x("---");
        int indexOf = m42778x.indexOf("---");
        String str2 = str;
        if (indexOf > 0) {
            str2 = str;
            if (str.startsWith(m42778x.substring(0, indexOf))) {
                str2 = str.substring(indexOf);
            }
        }
        int indexOf2 = str2.indexOf(m42778x.substring(indexOf + 3));
        String str3 = str2;
        if (indexOf2 != -1) {
            str3 = str2.substring(0, indexOf2);
        }
        return str3;
    }

    /* renamed from: r */
    public String m42789r() {
        return this.f46802b;
    }

    /* renamed from: s */
    public Map<String, ?> m42790s() {
        return this.f46807g;
    }

    /* renamed from: t */
    public long m42791t(String str) {
        long j10 = this.f46801a;
        if (j10 != 0) {
            return Native.findSymbol(j10, str);
        }
        throw new UnsatisfiedLinkError("Library has been unloaded");
    }

    public String toString() {
        return "Native Library <" + this.f46803c + "@" + this.f46801a + ">";
    }
}
