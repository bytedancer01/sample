package p449zi;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import pl.droidsonroids.gif.C7735a;

/* renamed from: zi.d */
/* loaded from: combined.jar:classes3.jar:zi/d.class */
public class HandlerC10244d extends Handler {

    /* renamed from: a */
    public final WeakReference<C7735a> f46843a;

    public HandlerC10244d(C7735a c7735a) {
        super(Looper.getMainLooper());
        this.f46843a = new WeakReference<>(c7735a);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        C7735a c7735a = this.f46843a.get();
        if (c7735a == null) {
            return;
        }
        if (message.what == -1) {
            c7735a.invalidateSelf();
            return;
        }
        Iterator<InterfaceC10241a> it = c7735a.f37528i.iterator();
        while (it.hasNext()) {
            it.next().m42842a(message.what);
        }
    }
}
