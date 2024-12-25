package p285q9;

import android.os.Looper;
import java.util.TimerTask;
import ma.HandlerC6385s1;
import p230n9.C6721i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:q9/l.class
 */
/* renamed from: q9.l */
/* loaded from: combined.jar:classes2.jar:q9/l.class */
public final class C7861l extends TimerTask {

    /* renamed from: b */
    public final C6721i f37933b;

    /* renamed from: c */
    public final AbstractActivityC7850a f37934c;

    public C7861l(AbstractActivityC7850a abstractActivityC7850a, C6721i c6721i) {
        this.f37934c = abstractActivityC7850a;
        this.f37933b = c6721i;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        new HandlerC6385s1(Looper.getMainLooper()).post(new RunnableC7860k(this));
    }
}
