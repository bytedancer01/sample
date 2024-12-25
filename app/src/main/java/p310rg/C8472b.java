package p310rg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:rg/b.class
 */
/* renamed from: rg.b */
/* loaded from: combined.jar:classes2.jar:rg/b.class */
public class C8472b extends BroadcastReceiver {

    /* renamed from: a */
    public a f39578a;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:rg/b$a.class
     */
    /* renamed from: rg.b$a */
    /* loaded from: combined.jar:classes2.jar:rg/b$a.class */
    public interface a {
        /* renamed from: c */
        void mo21317c();

        /* renamed from: e */
        void mo21318e();
    }

    public C8472b(a aVar) {
        this.f39578a = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (C8473c.m36397b(context)) {
            this.f39578a.mo21318e();
        } else {
            this.f39578a.mo21317c();
        }
    }
}
