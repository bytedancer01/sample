package p415y2;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import p395x2.AbstractC9635n;
import p395x2.C9628g;
import p395x2.C9640s;
import p395x2.C9642u;
import p395x2.C9643v;
import p395x2.InterfaceC9623b;
import p395x2.InterfaceC9629h;
import p395x2.InterfaceC9639r;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y2/b.class
 */
/* renamed from: y2.b */
/* loaded from: combined.jar:classes1.jar:y2/b.class */
public class C9805b implements InterfaceC9629h {

    /* renamed from: d */
    public static final boolean f45104d = C9643v.f44021b;

    /* renamed from: a */
    @Deprecated
    public final InterfaceC9810g f45105a;

    /* renamed from: b */
    public final AbstractC9804a f45106b;

    /* renamed from: c */
    public final C9806c f45107c;

    public C9805b(AbstractC9804a abstractC9804a) {
        this(abstractC9804a, new C9806c(4096));
    }

    public C9805b(AbstractC9804a abstractC9804a, C9806c c9806c) {
        this.f45106b = abstractC9804a;
        this.f45105a = abstractC9804a;
        this.f45107c = c9806c;
    }

    /* renamed from: b */
    public static void m41288b(String str, AbstractC9635n<?> abstractC9635n, C9642u c9642u) {
        InterfaceC9639r m40565y = abstractC9635n.m40565y();
        int m40566z = abstractC9635n.m40566z();
        try {
            m40565y.mo40513c(c9642u);
            abstractC9635n.m40546b(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(m40566z)));
        } catch (C9642u e10) {
            abstractC9635n.m40546b(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(m40566z)));
            throw e10;
        }
    }

    /* renamed from: c */
    public static List<C9628g> m41289c(List<C9628g> list, InterfaceC9623b.a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<C9628g> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().m40518a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<C9628g> list2 = aVar.f43951h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (C9628g c9628g : aVar.f43951h) {
                    if (!treeSet.contains(c9628g.m40518a())) {
                        arrayList.add(c9628g);
                    }
                }
            }
        } else if (!aVar.f43950g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVar.f43950g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new C9628g(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f8, code lost:
    
        throw new java.io.IOException();
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0212 A[SYNTHETIC] */
    @Override // p395x2.InterfaceC9629h
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p395x2.C9632k mo40520a(p395x2.AbstractC9635n<?> r11) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p415y2.C9805b.mo40520a(x2.n):x2.k");
    }

    /* renamed from: d */
    public final Map<String, String> m41290d(InterfaceC9623b.a aVar) {
        if (aVar == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        String str = aVar.f43945b;
        if (str != null) {
            hashMap.put("If-None-Match", str);
        }
        long j10 = aVar.f43947d;
        if (j10 > 0) {
            hashMap.put("If-Modified-Since", C9808e.m41320a(j10));
        }
        return hashMap;
    }

    /* JADX WARN: Failed to calculate best type for var: r0v7 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v0 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException
     */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00a4: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:35:0x00a0 */
    /* renamed from: e */
    public final byte[] m41291e(InputStream inputStream, int i10) {
        byte[] bArr;
        C9813j c9813j = new C9813j(this.f45107c, i10);
        try {
            if (inputStream == null) {
                throw new C9640s();
            }
            byte[] m41293a = this.f45107c.m41293a(1024);
            while (true) {
                int read = inputStream.read(m41293a);
                if (read == -1) {
                    break;
                }
                c9813j.write(m41293a, 0, read);
            }
            byte[] byteArray = c9813j.toByteArray();
            try {
                inputStream.close();
            } catch (IOException e10) {
                C9643v.m40581e("Error occurred when closing InputStream", new Object[0]);
            }
            this.f45107c.m41294b(m41293a);
            c9813j.close();
            return byteArray;
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e11) {
                    C9643v.m40581e("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.f45107c.m41294b(bArr);
            c9813j.close();
            throw th2;
        }
    }

    /* renamed from: f */
    public final void m41292f(long j10, AbstractC9635n<?> abstractC9635n, byte[] bArr, int i10) {
        if (f45104d || j10 > 3000) {
            C9643v.m40578b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", abstractC9635n, Long.valueOf(j10), bArr != null ? Integer.valueOf(bArr.length) : "null", Integer.valueOf(i10), Integer.valueOf(abstractC9635n.m40565y().mo40511a()));
        }
    }
}
