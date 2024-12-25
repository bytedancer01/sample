package p135hh;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import p083eh.C4726a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/z.class
 */
/* renamed from: hh.z */
/* loaded from: combined.jar:classes2.jar:hh/z.class */
public class C5118z {

    /* renamed from: b */
    public static C5118z f29386b;

    /* renamed from: c */
    public static C4726a f29387c;

    /* renamed from: d */
    public static C4726a f29388d;

    /* renamed from: a */
    public HashMap<String, C4726a> f29389a = new HashMap<>();

    /* renamed from: b */
    public static void m25658b(Context context) {
        if (f29386b == null) {
            C5118z c5118z = new C5118z();
            f29386b = c5118z;
            c5118z.m25672k(context);
        }
    }

    /* renamed from: c */
    public static C4726a m25659c(Context context, String str) {
        return m25660d(context, str, 0, 10);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:24:0x0083
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* renamed from: d */
    public static p083eh.C4726a m25660d(android.content.Context r7, java.lang.String r8, int r9, int r10) {
        /*
            r0 = r7
            m25658b(r0)
            r0 = r8
            eh.a r0 = m25661e(r0)
            r13 = r0
            r0 = 0
            r11 = r0
        Ld:
            r0 = r13
            if (r0 == 0) goto L1f
            r0 = r11
            r12 = r0
            r0 = r13
            int r0 = r0.f27847o0
            r1 = r9
            if (r0 >= r1) goto L45
        L1f:
            r0 = r11
            r1 = 1
            int r0 = r0 + r1
            r12 = r0
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L45
            r0 = 100
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L83
        L31:
            hh.z r0 = p135hh.C5118z.f29386b     // Catch: java.lang.InterruptedException -> L83
            r1 = r7
            r0.m25672k(r1)
            r0 = r8
            eh.a r0 = m25661e(r0)
            r13 = r0
            r0 = r12
            r11 = r0
            goto Ld
        L45:
            r0 = r12
            r1 = 5
            if (r0 <= r1) goto L80
            r0 = r13
            if (r0 != 0) goto L55
            r0 = -1
            r10 = r0
            goto L5b
        L55:
            r0 = r13
            int r0 = r0.f27847o0
            r10 = r0
        L5b:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = "Used x %d tries to get current version (%d/%d) of the profile"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r12
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            java.lang.String r0 = java.lang.String.format(r0, r1, r2)
            p135hh.C5095d0.m25473p(r0)
        L80:
            r0 = r13
            return r0
        L83:
            r13 = move-exception
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: p135hh.C5118z.m25660d(android.content.Context, java.lang.String, int, int):eh.a");
    }

    /* renamed from: e */
    public static C4726a m25661e(String str) {
        C4726a c4726a = f29388d;
        if (c4726a != null && c4726a.m23855F().equals(str)) {
            return f29388d;
        }
        C5118z c5118z = f29386b;
        if (c5118z == null) {
            return null;
        }
        return c5118z.f29389a.get(str);
    }

    /* renamed from: f */
    public static C4726a m25662f(Context context) {
        m25658b(context);
        return m25661e(C5117y.m25656a(context).getString("alwaysOnVpn", null));
    }

    /* renamed from: g */
    public static C5118z m25663g(Context context) {
        C5118z c5118z;
        synchronized (C5118z.class) {
            try {
                m25658b(context);
                c5118z = f29386b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5118z;
    }

    /* renamed from: h */
    public static C4726a m25664h(Context context) {
        String string = C5117y.m25656a(context).getString("lastConnectedProfile", null);
        if (string != null) {
            return m25659c(context, string);
        }
        return null;
    }

    /* renamed from: i */
    public static C4726a m25665i() {
        return f29387c;
    }

    /* renamed from: m */
    public static void m25666m(Context context, C4726a c4726a, boolean z10, boolean z11) {
        if (z10) {
            c4726a.f27847o0++;
        }
        String str = c4726a.m23854E().toString() + ".vp";
        if (z11) {
            str = "temporary-vpn-profile.vp";
        }
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(context.openFileOutput(str, 0));
            objectOutputStream.writeObject(c4726a);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e10) {
            C5095d0.m25476s("saving VPN profile", e10);
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: o */
    public static void m25667o(Context context, C4726a c4726a) {
        SharedPreferences.Editor edit = C5117y.m25656a(context).edit();
        edit.putString("lastConnectedProfile", c4726a.m23855F());
        edit.apply();
        f29387c = c4726a;
    }

    /* renamed from: p */
    public static void m25668p(Context context) {
        SharedPreferences.Editor edit = C5117y.m25656a(context).edit();
        edit.putString("lastConnectedProfile", null);
        edit.apply();
    }

    /* renamed from: q */
    public static void m25669q(Context context, C4726a c4726a) {
        c4726a.f27849p0 = System.currentTimeMillis();
        if (c4726a != f29388d) {
            m25666m(context, c4726a, false, false);
        }
    }

    /* renamed from: a */
    public void m25670a(C4726a c4726a) {
        this.f29389a.put(c4726a.m23854E().toString(), c4726a);
    }

    /* renamed from: j */
    public C4726a m25671j(String str) {
        for (C4726a c4726a : this.f29389a.values()) {
            if (c4726a.getName().equals(str)) {
                return c4726a;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x003e A[SYNTHETIC] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m25672k(android.content.Context r5) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p135hh.C5118z.m25672k(android.content.Context):void");
    }

    /* renamed from: l */
    public void m25673l(Context context, C4726a c4726a) {
        m25666m(context, c4726a, true, false);
    }

    /* renamed from: n */
    public void m25674n(Context context) {
        SharedPreferences m25657b = C5117y.m25657b("VPNList", context);
        SharedPreferences.Editor edit = m25657b.edit();
        edit.putStringSet("vpnlist", this.f29389a.keySet());
        edit.putInt("counter", m25657b.getInt("counter", 0) + 1);
        edit.apply();
    }
}
