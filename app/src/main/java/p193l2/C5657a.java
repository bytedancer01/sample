package p193l2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import p071e2.AbstractC4582k;
import p278q2.InterfaceC7748a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l2/a.class
 */
/* renamed from: l2.a */
/* loaded from: combined.jar:classes1.jar:l2/a.class */
public class C5657a extends AbstractC5659c<Boolean> {

    /* renamed from: i */
    public static final String f31909i = AbstractC4582k.m23128f("BatteryChrgTracker");

    public C5657a(Context context, InterfaceC7748a interfaceC7748a) {
        super(context, interfaceC7748a);
    }

    @Override // p193l2.AbstractC5659c
    /* renamed from: g */
    public IntentFilter mo27863g() {
        String str;
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            str = "android.os.action.DISCHARGING";
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            str = "android.intent.action.ACTION_POWER_DISCONNECTED";
        }
        intentFilter.addAction(str);
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        if (r0.equals("android.os.action.DISCHARGING") == false) goto L7;
     */
    @Override // p193l2.AbstractC5659c
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo27864h(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            r0 = r10
            java.lang.String r0 = r0.getAction()
            r9 = r0
            r0 = r9
            if (r0 != 0) goto La
            return
        La:
            e2.k r0 = p071e2.AbstractC4582k.m23126c()
            r12 = r0
            java.lang.String r0 = p193l2.C5657a.f31909i
            r10 = r0
            r0 = 1
            r11 = r0
            r0 = r12
            r1 = r10
            java.lang.String r2 = "Received %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r9
            r4[r5] = r6
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r3 = 0
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            r0.mo23129a(r1, r2, r3)
            r0 = r9
            int r0 = r0.hashCode()
            switch(r0) {
                case -1886648615: goto L8f;
                case -54942926: goto L83;
                case 948344062: goto L72;
                case 1019184907: goto L61;
                default: goto L5c;
            }
        L5c:
            r0 = -1
            r11 = r0
            goto L9d
        L61:
            r0 = r9
            java.lang.String r1 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6d
            goto L5c
        L6d:
            r0 = 3
            r11 = r0
            goto L9d
        L72:
            r0 = r9
            java.lang.String r1 = "android.os.action.CHARGING"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7e
            goto L5c
        L7e:
            r0 = 2
            r11 = r0
            goto L9d
        L83:
            r0 = r9
            java.lang.String r1 = "android.os.action.DISCHARGING"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L9d
            goto L5c
        L8f:
            r0 = r9
            java.lang.String r1 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L9b
            goto L5c
        L9b:
            r0 = 0
            r11 = r0
        L9d:
            r0 = r11
            switch(r0) {
                case 0: goto Lcb;
                case 1: goto Lcb;
                case 2: goto Lbf;
                case 3: goto Lbf;
                default: goto Lbc;
            }
        Lbc:
            goto Ld2
        Lbf:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9 = r0
        Lc3:
            r0 = r8
            r1 = r9
            r0.m27872d(r1)
            goto Ld2
        Lcb:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9 = r0
            goto Lc3
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p193l2.C5657a.mo27864h(android.content.Context, android.content.Intent):void");
    }

    @Override // p193l2.AbstractC5660d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean mo27862b() {
        Intent registerReceiver = this.f31916b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(m27866j(registerReceiver));
        }
        AbstractC4582k.m23126c().mo23130b(f31909i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    /* renamed from: j */
    public final boolean m27866j(Intent intent) {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 23) {
            int intExtra = intent.getIntExtra("status", -1);
            z10 = true;
            if (intExtra != 2) {
                if (intExtra == 5) {
                    z10 = true;
                }
                z10 = false;
            }
        } else {
            if (intent.getIntExtra("plugged", 0) != 0) {
                z10 = true;
            }
            z10 = false;
        }
        return z10;
    }
}
