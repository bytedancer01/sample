package p274pi;

import ci.C1128n;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import ki.C5634b;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.protocol.HTTP;
import org.jetbrains.annotations.NotNull;
import p173ji.C5410f0;
import p173ji.C5413h;
import p173ji.C5424o;
import p173ji.C5432w;
import p173ji.C5433x;
import p173ji.InterfaceC5425p;
import p372vh.C9367f;
import p411xi.C9761e;
import p411xi.C9764h;
import si.C8588j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pi/e.class
 */
/* renamed from: pi.e */
/* loaded from: combined.jar:classes2.jar:pi/e.class */
public final class C7728e {

    /* renamed from: a */
    public static final C9764h f37495a;

    /* renamed from: b */
    public static final C9764h f37496b;

    static {
        C9764h.a aVar = C9764h.f44531f;
        f37495a = aVar.m41212d(BasicHeaderValueFormatter.UNSAFE_CHARS);
        f37496b = aVar.m41212d("\t ,=");
    }

    @NotNull
    /* renamed from: a */
    public static final List<C5413h> m33736a(@NotNull C5432w c5432w, @NotNull String str) {
        C9367f.m39526e(c5432w, "$this$parseChallenges");
        C9367f.m39526e(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = c5432w.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (C1128n.m6719l(str, c5432w.m27082b(i10), true)) {
                try {
                    m33738c(new C9761e().mo41136Q(c5432w.m27085h(i10)), arrayList);
                } catch (EOFException e10) {
                    C8588j.f40042c.m36880g().m36873j("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final boolean m33737b(@NotNull C5410f0 c5410f0) {
        C9367f.m39526e(c5410f0, "$this$promisesBody");
        if (C9367f.m39522a(c5410f0.m26918F0().m26877g(), HttpHead.METHOD_NAME)) {
            return false;
        }
        int m26925q = c5410f0.m26925q();
        return (((m26925q >= 100 && m26925q < 200) || m26925q == 204 || m26925q == 304) && C5634b.m27799s(c5410f0) == -1 && !C1128n.m6719l(HTTP.CHUNK_CODING, C5410f0.m26912B(c5410f0, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e7, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e7, code lost:
    
        continue;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m33738c(p411xi.C9761e r6, java.util.List<p173ji.C5413h> r7) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p274pi.C7728e.m33738c(xi.e, java.util.List):void");
    }

    /* renamed from: d */
    public static final String m33739d(C9761e c9761e) {
        byte b10 = (byte) 34;
        if (!(c9761e.readByte() == b10)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        C9761e c9761e2 = new C9761e();
        while (true) {
            long mo41153c0 = c9761e.mo41153c0(f37495a);
            if (mo41153c0 == -1) {
                return null;
            }
            if (c9761e.m41119B0(mo41153c0) == b10) {
                c9761e2.mo32031h(c9761e, mo41153c0);
                c9761e.readByte();
                return c9761e2.m41134O0();
            }
            if (c9761e.size() == mo41153c0 + 1) {
                return null;
            }
            c9761e2.mo32031h(c9761e, mo41153c0);
            c9761e.readByte();
            c9761e2.mo32031h(c9761e, 1L);
        }
    }

    /* renamed from: e */
    public static final String m33740e(C9761e c9761e) {
        long mo41153c0 = c9761e.mo41153c0(f37496b);
        long j10 = mo41153c0;
        if (mo41153c0 == -1) {
            j10 = c9761e.size();
        }
        return j10 != 0 ? c9761e.m41135P0(j10) : null;
    }

    /* renamed from: f */
    public static final void m33741f(@NotNull InterfaceC5425p interfaceC5425p, @NotNull C5433x c5433x, @NotNull C5432w c5432w) {
        C9367f.m39526e(interfaceC5425p, "$this$receiveHeaders");
        C9367f.m39526e(c5433x, "url");
        C9367f.m39526e(c5432w, "headers");
        if (interfaceC5425p == InterfaceC5425p.f31115a) {
            return;
        }
        List<C5424o> m27022e = C5424o.f31105n.m27022e(c5433x, c5432w);
        if (m27022e.isEmpty()) {
            return;
        }
        interfaceC5425p.mo27027b(c5433x, m27022e);
    }

    /* renamed from: g */
    public static final boolean m33742g(C9761e c9761e) {
        boolean z10 = false;
        while (!c9761e.mo41164k0()) {
            byte m41119B0 = c9761e.m41119B0(0L);
            if (m41119B0 == 9 || m41119B0 == 32) {
                c9761e.readByte();
            } else {
                if (m41119B0 != 44) {
                    break;
                }
                c9761e.readByte();
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: h */
    public static final boolean m33743h(C9761e c9761e, byte b10) {
        return !c9761e.mo41164k0() && c9761e.m41119B0(0L) == b10;
    }
}
