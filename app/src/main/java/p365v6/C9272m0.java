package p365v6;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p027b9.C0849j0;
import p027b9.C0857o;
import p027b9.C0858p;
import p027b9.InterfaceC0831a0;
import p059d9.C4349a;
import p059d9.C4401z0;
import p365v6.InterfaceC9260g0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v6/m0.class
 */
/* renamed from: v6.m0 */
/* loaded from: combined.jar:classes2.jar:v6/m0.class */
public final class C9272m0 implements InterfaceC9276o0 {

    /* renamed from: a */
    public final InterfaceC0831a0.b f42352a;

    /* renamed from: b */
    public final String f42353b;

    /* renamed from: c */
    public final boolean f42354c;

    /* renamed from: d */
    public final Map<String, String> f42355d;

    public C9272m0(String str, boolean z10, InterfaceC0831a0.b bVar) {
        C4349a.m21878a((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f42352a = bVar;
        this.f42353b = str;
        this.f42354c = z10;
        this.f42355d = new HashMap();
    }

    /* renamed from: c */
    public static byte[] m39130c(InterfaceC0831a0.b bVar, String str, byte[] bArr, Map<String, String> map) {
        C0849j0 c0849j0 = new C0849j0(bVar.mo5296a());
        C0858p m5383a = new C0858p.b().m5392j(str).m5387e(map).m5386d(2).m5385c(bArr).m5384b(1).m5383a();
        int i10 = 0;
        C0858p c0858p = m5383a;
        while (true) {
            try {
                C0857o c0857o = new C0857o(c0849j0, c0858p);
                try {
                    return C4401z0.m22370b1(c0857o);
                } catch (InterfaceC0831a0.e e10) {
                    try {
                        String m39131d = m39131d(e10, i10);
                        if (m39131d == null) {
                            throw e10;
                        }
                        i10++;
                        c0858p = c0858p.m5377a().m5392j(m39131d).m5383a();
                        C4401z0.m22403p(c0857o);
                    } finally {
                        C4401z0.m22403p(c0857o);
                    }
                }
            } catch (Exception e11) {
                throw new C9278p0(m5383a, (Uri) C4349a.m21882e(c0849j0.m5364r()), c0849j0.mo523e(), c0849j0.m5363h(), e11);
            }
        }
    }

    /* renamed from: d */
    public static String m39131d(InterfaceC0831a0.e eVar, int i10) {
        Map<String, List<String>> map;
        List<String> list;
        int i11 = eVar.f5741e;
        if (!((i11 == 307 || i11 == 308) && i10 < 5) || (map = eVar.f5743g) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L6;
     */
    @Override // p365v6.InterfaceC9276o0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] mo39132a(java.util.UUID r12, p365v6.InterfaceC9260g0.a r13) {
        /*
            r11 = this;
            r0 = r13
            java.lang.String r0 = r0.m39031b()
            r14 = r0
            r0 = r11
            boolean r0 = r0.f42354c
            if (r0 != 0) goto L16
            r0 = r14
            r15 = r0
            r0 = r14
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
        L16:
            r0 = r11
            java.lang.String r0 = r0.f42353b
            r15 = r0
        L1c:
            r0 = r15
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L9d
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r16 = r0
            java.util.UUID r0 = p267p6.C7583h.f36780e
            r17 = r0
            r0 = r17
            r1 = r12
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L41
            java.lang.String r0 = "text/xml"
            r14 = r0
            goto L54
        L41:
            java.util.UUID r0 = p267p6.C7583h.f36778c
            r1 = r12
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L51
            java.lang.String r0 = "application/json"
            r14 = r0
            goto L54
        L51:
            java.lang.String r0 = "application/octet-stream"
            r14 = r0
        L54:
            r0 = r16
            java.lang.String r1 = "Content-Type"
            r2 = r14
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r17
            r1 = r12
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L74
            r0 = r16
            java.lang.String r1 = "SOAPAction"
            java.lang.String r2 = "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense"
            java.lang.Object r0 = r0.put(r1, r2)
        L74:
            r0 = r11
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f42355d
            r12 = r0
            r0 = r12
            monitor-enter(r0)
            r0 = r16
            r1 = r11
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f42355d     // Catch: java.lang.Throwable -> L98
            r0.putAll(r1)     // Catch: java.lang.Throwable -> L98
            r0 = r12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L98
            r0 = r11
            b9.a0$b r0 = r0.f42352a
            r1 = r15
            r2 = r13
            byte[] r2 = r2.m39030a()
            r3 = r16
            byte[] r0 = m39130c(r0, r1, r2, r3)
            return r0
        L98:
            r13 = move-exception
            r0 = r12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L98
            r0 = r13
            throw r0
        L9d:
            v6.p0 r0 = new v6.p0
            r1 = r0
            b9.p$b r2 = new b9.p$b
            r3 = r2
            r3.<init>()
            android.net.Uri r3 = android.net.Uri.EMPTY
            b9.p$b r2 = r2.m5391i(r3)
            b9.p r2 = r2.m5383a()
            android.net.Uri r3 = android.net.Uri.EMPTY
            fc.v r4 = p099fc.AbstractC4838v.m24568k()
            r5 = 0
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r7 = r6
            java.lang.String r8 = "No license URL"
            r7.<init>(r8)
            r1.<init>(r2, r3, r4, r5, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p365v6.C9272m0.mo39132a(java.util.UUID, v6.g0$a):byte[]");
    }

    @Override // p365v6.InterfaceC9276o0
    /* renamed from: b */
    public byte[] mo39133b(UUID uuid, InterfaceC9260g0.d dVar) {
        return m39130c(this.f42352a, dVar.m39035b() + "&signedRequest=" + C4401z0.m22323F(dVar.m39034a()), null, Collections.emptyMap());
    }

    /* renamed from: e */
    public void m39134e(String str, String str2) {
        C4349a.m21882e(str);
        C4349a.m21882e(str2);
        synchronized (this.f42355d) {
            this.f42355d.put(str, str2);
        }
    }
}
