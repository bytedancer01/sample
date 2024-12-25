package p422y9;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p245oa.HandlerC6962i;
import p350u9.C8804b;
import p422y9.AbstractC9899c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/x0.class
 */
/* renamed from: y9.x0 */
/* loaded from: combined.jar:classes2.jar:y9/x0.class */
public final class HandlerC9961x0 extends HandlerC6962i {

    /* renamed from: a */
    public final AbstractC9899c f45653a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC9961x0(AbstractC9899c abstractC9899c, Looper looper) {
        super(looper);
        this.f45653a = abstractC9899c;
    }

    /* renamed from: a */
    public static final void m41889a(Message message) {
        AbstractC9963y0 abstractC9963y0 = (AbstractC9963y0) message.obj;
        abstractC9963y0.mo41857b();
        abstractC9963y0.m41893e();
    }

    /* renamed from: b */
    public static final boolean m41890b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC9899c.a aVar;
        AbstractC9899c.a aVar2;
        C8804b c8804b;
        C8804b c8804b2;
        C8804b c8804b3;
        C8804b c8804b4;
        C8804b c8804b5;
        C8804b c8804b6;
        boolean z10;
        if (this.f45653a.zzd.get() != message.arg1) {
            if (m41890b(message)) {
                m41889a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !this.f45653a.enableLocalFallback()) || message.what == 5)) && !this.f45653a.isConnecting()) {
            m41889a(message);
            return;
        }
        int i11 = message.what;
        PendingIntent pendingIntent = null;
        if (i11 == 4) {
            this.f45653a.zzB = new C8804b(message.arg2);
            if (AbstractC9899c.zzo(this.f45653a)) {
                AbstractC9899c abstractC9899c = this.f45653a;
                z10 = abstractC9899c.zzC;
                if (!z10) {
                    abstractC9899c.zzp(3, null);
                    return;
                }
            }
            AbstractC9899c abstractC9899c2 = this.f45653a;
            c8804b4 = abstractC9899c2.zzB;
            if (c8804b4 != null) {
                c8804b6 = abstractC9899c2.zzB;
                c8804b5 = c8804b6;
            } else {
                c8804b5 = new C8804b(8);
            }
            this.f45653a.zzc.mo39826c(c8804b5);
            this.f45653a.onConnectionFailed(c8804b5);
            return;
        }
        if (i11 == 5) {
            AbstractC9899c abstractC9899c3 = this.f45653a;
            c8804b = abstractC9899c3.zzB;
            if (c8804b != null) {
                c8804b3 = abstractC9899c3.zzB;
                c8804b2 = c8804b3;
            } else {
                c8804b2 = new C8804b(8);
            }
            this.f45653a.zzc.mo39826c(c8804b2);
            this.f45653a.onConnectionFailed(c8804b2);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            if (obj instanceof PendingIntent) {
                pendingIntent = (PendingIntent) obj;
            }
            C8804b c8804b7 = new C8804b(message.arg2, pendingIntent);
            this.f45653a.zzc.mo39826c(c8804b7);
            this.f45653a.onConnectionFailed(c8804b7);
            return;
        }
        if (i11 == 6) {
            this.f45653a.zzp(5, null);
            AbstractC9899c abstractC9899c4 = this.f45653a;
            aVar = abstractC9899c4.zzw;
            if (aVar != null) {
                aVar2 = abstractC9899c4.zzw;
                aVar2.onConnectionSuspended(message.arg2);
            }
            this.f45653a.onConnectionSuspended(message.arg2);
            AbstractC9899c.zzn(this.f45653a, 5, 1, null);
            return;
        }
        if (i11 == 2 && !this.f45653a.isConnected()) {
            m41889a(message);
            return;
        }
        if (m41890b(message)) {
            ((AbstractC9963y0) message.obj).m41891c();
            return;
        }
        int i12 = message.what;
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append("Don't know how to handle message: ");
        sb2.append(i12);
        Log.wtf("GmsClient", sb2.toString(), new Exception());
    }
}
