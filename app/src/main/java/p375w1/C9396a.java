package p375w1;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:w1/a.class
 */
/* renamed from: w1.a */
/* loaded from: combined.jar:classes1.jar:w1/a.class */
public final class C9396a implements InterfaceC9400e {

    /* renamed from: b */
    public final String f43090b;

    /* renamed from: c */
    public final Object[] f43091c;

    public C9396a(String str) {
        this(str, null);
    }

    public C9396a(String str, Object[] objArr) {
        this.f43090b = str;
        this.f43091c = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [short] */
    /* JADX WARN: Type inference failed for: r0v47, types: [int] */
    /* renamed from: a */
    public static void m39709a(InterfaceC9399d interfaceC9399d, int i10, Object obj) {
        long j10;
        byte byteValue;
        double doubleValue;
        if (obj == null) {
            interfaceC9399d.mo36945t0(i10);
            return;
        }
        if (obj instanceof byte[]) {
            interfaceC9399d.mo36942n0(i10, (byte[]) obj);
            return;
        }
        if (obj instanceof Float) {
            doubleValue = ((Float) obj).floatValue();
        } else {
            if (!(obj instanceof Double)) {
                if (obj instanceof Long) {
                    j10 = ((Long) obj).longValue();
                } else {
                    if (obj instanceof Integer) {
                        byteValue = ((Integer) obj).intValue();
                    } else if (obj instanceof Short) {
                        byteValue = ((Short) obj).shortValue();
                    } else if (obj instanceof Byte) {
                        byteValue = ((Byte) obj).byteValue();
                    } else {
                        if (obj instanceof String) {
                            interfaceC9399d.mo36938h0(i10, (String) obj);
                            return;
                        }
                        if (!(obj instanceof Boolean)) {
                            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                        }
                        j10 = ((Boolean) obj).booleanValue() ? 1L : 0L;
                    }
                    j10 = byteValue;
                }
                interfaceC9399d.mo36941m0(i10, j10);
                return;
            }
            doubleValue = ((Double) obj).doubleValue();
        }
        interfaceC9399d.mo36939i(i10, doubleValue);
    }

    /* renamed from: b */
    public static void m39710b(InterfaceC9399d interfaceC9399d, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i10 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            i10++;
            m39709a(interfaceC9399d, i10, obj);
        }
    }

    @Override // p375w1.InterfaceC9400e
    /* renamed from: f */
    public void mo36937f(InterfaceC9399d interfaceC9399d) {
        m39710b(interfaceC9399d, this.f43091c);
    }

    @Override // p375w1.InterfaceC9400e
    /* renamed from: l */
    public String mo36940l() {
        return this.f43090b;
    }
}
