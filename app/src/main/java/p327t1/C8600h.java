package p327t1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p375w1.InterfaceC9399d;
import p375w1.InterfaceC9400e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t1/h.class
 */
/* renamed from: t1.h */
/* loaded from: combined.jar:classes1.jar:t1/h.class */
public class C8600h implements InterfaceC9400e, InterfaceC9399d {

    /* renamed from: j */
    public static final TreeMap<Integer, C8600h> f40113j = new TreeMap<>();

    /* renamed from: b */
    public volatile String f40114b;

    /* renamed from: c */
    public final long[] f40115c;

    /* renamed from: d */
    public final double[] f40116d;

    /* renamed from: e */
    public final String[] f40117e;

    /* renamed from: f */
    public final byte[][] f40118f;

    /* renamed from: g */
    public final int[] f40119g;

    /* renamed from: h */
    public final int f40120h;

    /* renamed from: i */
    public int f40121i;

    /* JADX WARN: Type inference failed for: r1v10, types: [byte[], byte[][]] */
    public C8600h(int i10) {
        this.f40120h = i10;
        int i11 = i10 + 1;
        this.f40119g = new int[i11];
        this.f40115c = new long[i11];
        this.f40116d = new double[i11];
        this.f40117e = new String[i11];
        this.f40118f = new byte[i11];
    }

    /* renamed from: o */
    public static C8600h m36935o(String str, int i10) {
        TreeMap<Integer, C8600h> treeMap = f40113j;
        synchronized (treeMap) {
            Map.Entry<Integer, C8600h> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (ceilingEntry == null) {
                C8600h c8600h = new C8600h(i10);
                c8600h.m36943p(str, i10);
                return c8600h;
            }
            treeMap.remove(ceilingEntry.getKey());
            C8600h value = ceilingEntry.getValue();
            value.m36943p(str, i10);
            return value;
        }
    }

    /* renamed from: q */
    public static void m36936q() {
        TreeMap<Integer, C8600h> treeMap = f40113j;
        if (treeMap.size() > 15) {
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            for (int size = treeMap.size() - 10; size > 0; size--) {
                it.next();
                it.remove();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p375w1.InterfaceC9400e
    /* renamed from: f */
    public void mo36937f(InterfaceC9399d interfaceC9399d) {
        for (int i10 = 1; i10 <= this.f40121i; i10++) {
            int i11 = this.f40119g[i10];
            if (i11 == 1) {
                interfaceC9399d.mo36945t0(i10);
            } else if (i11 == 2) {
                interfaceC9399d.mo36941m0(i10, this.f40115c[i10]);
            } else if (i11 == 3) {
                interfaceC9399d.mo36939i(i10, this.f40116d[i10]);
            } else if (i11 == 4) {
                interfaceC9399d.mo36938h0(i10, this.f40117e[i10]);
            } else if (i11 == 5) {
                interfaceC9399d.mo36942n0(i10, this.f40118f[i10]);
            }
        }
    }

    @Override // p375w1.InterfaceC9399d
    /* renamed from: h0 */
    public void mo36938h0(int i10, String str) {
        this.f40119g[i10] = 4;
        this.f40117e[i10] = str;
    }

    @Override // p375w1.InterfaceC9399d
    /* renamed from: i */
    public void mo36939i(int i10, double d10) {
        this.f40119g[i10] = 3;
        this.f40116d[i10] = d10;
    }

    @Override // p375w1.InterfaceC9400e
    /* renamed from: l */
    public String mo36940l() {
        return this.f40114b;
    }

    @Override // p375w1.InterfaceC9399d
    /* renamed from: m0 */
    public void mo36941m0(int i10, long j10) {
        this.f40119g[i10] = 2;
        this.f40115c[i10] = j10;
    }

    @Override // p375w1.InterfaceC9399d
    /* renamed from: n0 */
    public void mo36942n0(int i10, byte[] bArr) {
        this.f40119g[i10] = 5;
        this.f40118f[i10] = bArr;
    }

    /* renamed from: p */
    public void m36943p(String str, int i10) {
        this.f40114b = str;
        this.f40121i = i10;
    }

    /* renamed from: t */
    public void m36944t() {
        TreeMap<Integer, C8600h> treeMap = f40113j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f40120h), this);
            m36936q();
        }
    }

    @Override // p375w1.InterfaceC9399d
    /* renamed from: t0 */
    public void mo36945t0(int i10) {
        this.f40119g[i10] = 1;
    }
}
