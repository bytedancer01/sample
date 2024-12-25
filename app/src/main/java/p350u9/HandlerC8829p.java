package p350u9;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import la.HandlerC5836j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u9/p.class
 */
@SuppressLint({"HandlerLeak"})
/* renamed from: u9.p */
/* loaded from: combined.jar:classes2.jar:u9/p.class */
public final class HandlerC8829p extends HandlerC5836j {

    /* renamed from: a */
    public final Context f40875a;

    /* renamed from: b */
    public final C8812f f40876b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC8829p(C8812f c8812f, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f40876b = c8812f;
        this.f40875a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i10);
            Log.w("GoogleApiAvailability", sb2.toString());
            return;
        }
        int mo37680i = this.f40876b.mo37680i(this.f40875a);
        if (this.f40876b.mo37682m(mo37680i)) {
            this.f40876b.m37686s(this.f40875a, mo37680i);
        }
    }
}
