package p193l2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p071e2.AbstractC4582k;
import p278q2.InterfaceC7748a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l2/h.class
 */
/* renamed from: l2.h */
/* loaded from: combined.jar:classes1.jar:l2/h.class */
public class C5664h extends AbstractC5659c<Boolean> {

    /* renamed from: i */
    public static final String f31928i = AbstractC4582k.m23128f("StorageNotLowTracker");

    public C5664h(Context context, InterfaceC7748a interfaceC7748a) {
        super(context, interfaceC7748a);
    }

    @Override // p193l2.AbstractC5659c
    /* renamed from: g */
    public IntentFilter mo27863g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // p193l2.AbstractC5659c
    /* renamed from: h */
    public void mo27864h(Context context, Intent intent) {
        Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        AbstractC4582k.m23126c().mo23129a(f31928i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            bool = Boolean.FALSE;
        } else if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return;
        } else {
            bool = Boolean.TRUE;
        }
        m27872d(bool);
    }

    @Override // p193l2.AbstractC5660d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean mo27862b() {
        Intent registerReceiver = this.f31916b.registerReceiver(null, mo27863g());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }
}
