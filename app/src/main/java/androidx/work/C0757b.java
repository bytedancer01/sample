package androidx.work;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p071e2.AbstractC4582k;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/b.class
 */
/* renamed from: androidx.work.b */
/* loaded from: combined.jar:classes1.jar:androidx/work/b.class */
public final class C0757b {

    /* renamed from: b */
    public static final String f5185b = AbstractC4582k.m23128f("Data");

    /* renamed from: c */
    public static final C0757b f5186c = new a().m4878a();

    /* renamed from: a */
    public Map<String, Object> f5187a;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/b$a.class
     */
    /* renamed from: androidx.work.b$a */
    /* loaded from: combined.jar:classes1.jar:androidx/work/b$a.class */
    public static final class a {

        /* renamed from: a */
        public Map<String, Object> f5188a = new HashMap();

        /* renamed from: a */
        public C0757b m4878a() {
            C0757b c0757b = new C0757b((Map<String, ?>) this.f5188a);
            C0757b.m4871n(c0757b);
            return c0757b;
        }

        /* renamed from: b */
        public a m4879b(String str, Object obj) {
            if (obj == null) {
                this.f5188a.put(str, null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.f5188a.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.f5188a.put(str, C0757b.m4864a((boolean[]) obj));
                } else if (cls == byte[].class) {
                    this.f5188a.put(str, C0757b.m4865b((byte[]) obj));
                } else if (cls == int[].class) {
                    this.f5188a.put(str, C0757b.m4868e((int[]) obj));
                } else if (cls == long[].class) {
                    this.f5188a.put(str, C0757b.m4869f((long[]) obj));
                } else if (cls == float[].class) {
                    this.f5188a.put(str, C0757b.m4867d((float[]) obj));
                } else {
                    if (cls != double[].class) {
                        throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
                    }
                    this.f5188a.put(str, C0757b.m4866c((double[]) obj));
                }
            }
            return this;
        }

        /* renamed from: c */
        public a m4880c(C0757b c0757b) {
            m4881d(c0757b.f5187a);
            return this;
        }

        /* renamed from: d */
        public a m4881d(Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                m4879b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        /* renamed from: e */
        public a m4882e(String str, boolean z10) {
            this.f5188a.put(str, Boolean.valueOf(z10));
            return this;
        }

        /* renamed from: f */
        public a m4883f(String str, int i10) {
            this.f5188a.put(str, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: g */
        public a m4884g(String str, long j10) {
            this.f5188a.put(str, Long.valueOf(j10));
            return this;
        }

        /* renamed from: h */
        public a m4885h(String str, String str2) {
            this.f5188a.put(str, str2);
            return this;
        }
    }

    public C0757b() {
    }

    public C0757b(C0757b c0757b) {
        this.f5187a = new HashMap(c0757b.f5187a);
    }

    public C0757b(Map<String, ?> map) {
        this.f5187a = new HashMap(map);
    }

    /* renamed from: a */
    public static Boolean[] m4864a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i10 = 0; i10 < zArr.length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    /* renamed from: b */
    public static Byte[] m4865b(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = Byte.valueOf(bArr[i10]);
        }
        return bArr2;
    }

    /* renamed from: c */
    public static Double[] m4866c(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i10 = 0; i10 < dArr.length; i10++) {
            dArr2[i10] = Double.valueOf(dArr[i10]);
        }
        return dArr2;
    }

    /* renamed from: d */
    public static Float[] m4867d(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    /* renamed from: e */
    public static Integer[] m4868e(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    /* renamed from: f */
    public static Long[] m4869f(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i10 = 0; i10 < jArr.length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00a4 -> B:18:0x00ae). Please report as a decompilation issue!!! */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.C0757b m4870g(byte[] r4) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C0757b.m4870g(byte[]):androidx.work.b");
    }

    /* renamed from: n */
    public static byte[] m4871n(C0757b c0757b) {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                ObjectOutputStream objectOutputStream3 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream3.writeInt(c0757b.m4877m());
                    for (Map.Entry<String, Object> entry : c0757b.f5187a.entrySet()) {
                        objectOutputStream3.writeUTF(entry.getKey());
                        objectOutputStream3.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream3.close();
                    } catch (IOException e10) {
                        Log.e(f5185b, "Error in Data#toByteArray: ", e10);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e11) {
                        Log.e(f5185b, "Error in Data#toByteArray: ", e11);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e12) {
                    objectOutputStream = objectOutputStream3;
                    e = e12;
                    Log.e(f5185b, "Error in Data#toByteArray: ", e);
                    ObjectOutputStream objectOutputStream4 = objectOutputStream;
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e13) {
                            Log.e(f5185b, "Error in Data#toByteArray: ", e13);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e14) {
                        Log.e(f5185b, "Error in Data#toByteArray: ", e14);
                    }
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    objectOutputStream2 = objectOutputStream3;
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e15) {
                            Log.e(f5185b, "Error in Data#toByteArray: ", e15);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e16) {
                        Log.e(f5185b, "Error in Data#toByteArray: ", e16);
                    }
                    throw th;
                }
            } catch (IOException e17) {
                e = e17;
                objectOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0757b.class != obj.getClass()) {
            return false;
        }
        C0757b c0757b = (C0757b) obj;
        Set<String> keySet = this.f5187a.keySet();
        if (!keySet.equals(c0757b.f5187a.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = this.f5187a.get(str);
            Object obj3 = c0757b.f5187a.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public boolean m4872h(String str, boolean z10) {
        Object obj = this.f5187a.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z10;
    }

    public int hashCode() {
        return this.f5187a.hashCode() * 31;
    }

    /* renamed from: i */
    public int m4873i(String str, int i10) {
        Object obj = this.f5187a.get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : i10;
    }

    /* renamed from: j */
    public Map<String, Object> m4874j() {
        return Collections.unmodifiableMap(this.f5187a);
    }

    /* renamed from: k */
    public long m4875k(String str, long j10) {
        Object obj = this.f5187a.get(str);
        return obj instanceof Long ? ((Long) obj).longValue() : j10;
    }

    /* renamed from: l */
    public String m4876l(String str) {
        Object obj = this.f5187a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* renamed from: m */
    public int m4877m() {
        return this.f5187a.size();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        if (!this.f5187a.isEmpty()) {
            for (String str : this.f5187a.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = this.f5187a.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }
}
