package p193l2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p071e2.AbstractC4582k;
import p278q2.InterfaceC7748a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l2/b.class
 */
/* renamed from: l2.b */
/* loaded from: combined.jar:classes1.jar:l2/b.class */
public class C5658b extends AbstractC5659c<Boolean> {

    /* renamed from: i */
    public static final String f31910i = AbstractC4582k.m23128f("BatteryNotLowTracker");

    public C5658b(Context context, InterfaceC7748a interfaceC7748a) {
        super(context, interfaceC7748a);
    }

    @Override // p193l2.AbstractC5659c
    /* renamed from: g */
    public IntentFilter mo27863g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // p193l2.AbstractC5659c
    /* renamed from: h */
    public void mo27864h(Context context, Intent intent) {
        Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        AbstractC4582k.m23126c().mo23129a(f31910i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            bool = Boolean.TRUE;
        } else if (!action.equals("android.intent.action.BATTERY_LOW")) {
            return;
        } else {
            bool = Boolean.FALSE;
        }
        m27872d(bool);
    }

    @Override // p193l2.AbstractC5660d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean mo27862b() {
        Intent registerReceiver = this.f31916b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z10 = false;
        if (registerReceiver == null) {
            AbstractC4582k.m23126c().mo23130b(f31910i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
        if (intExtra == 1 || intExtra2 > 0.15f) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
