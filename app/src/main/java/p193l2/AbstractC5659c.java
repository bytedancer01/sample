package p193l2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p071e2.AbstractC4582k;
import p278q2.InterfaceC7748a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l2/c.class
 */
/* renamed from: l2.c */
/* loaded from: combined.jar:classes1.jar:l2/c.class */
public abstract class AbstractC5659c<T> extends AbstractC5660d<T> {

    /* renamed from: h */
    public static final String f31911h = AbstractC4582k.m23128f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g */
    public final BroadcastReceiver f31912g;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l2/c$a.class
     */
    /* renamed from: l2.c$a */
    /* loaded from: combined.jar:classes1.jar:l2/c$a.class */
    public class a extends BroadcastReceiver {

        /* renamed from: a */
        public final AbstractC5659c f31913a;

        public a(AbstractC5659c abstractC5659c) {
            this.f31913a = abstractC5659c;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                this.f31913a.mo27864h(context, intent);
            }
        }
    }

    public AbstractC5659c(Context context, InterfaceC7748a interfaceC7748a) {
        super(context, interfaceC7748a);
        this.f31912g = new a(this);
    }

    @Override // p193l2.AbstractC5660d
    /* renamed from: e */
    public void mo27868e() {
        AbstractC4582k.m23126c().mo23129a(f31911h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f31916b.registerReceiver(this.f31912g, mo27863g());
    }

    @Override // p193l2.AbstractC5660d
    /* renamed from: f */
    public void mo27869f() {
        AbstractC4582k.m23126c().mo23129a(f31911h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f31916b.unregisterReceiver(this.f31912g);
    }

    /* renamed from: g */
    public abstract IntentFilter mo27863g();

    /* renamed from: h */
    public abstract void mo27864h(Context context, Intent intent);
}
