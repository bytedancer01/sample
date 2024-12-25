package pl.droidsonroids.gif;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import p449zi.AbstractRunnableC10247g;

/* renamed from: pl.droidsonroids.gif.d */
/* loaded from: combined.jar:classes3.jar:pl/droidsonroids/gif/d.class */
public class C7738d extends AbstractRunnableC10247g {
    public C7738d(C7735a c7735a) {
        super(c7735a);
    }

    @Override // p449zi.AbstractRunnableC10247g
    /* renamed from: a */
    public void mo33804a() {
        C7735a c7735a = this.f46849b;
        long m33782p = c7735a.f37527h.m33782p(c7735a.f37526g);
        if (m33782p >= 0) {
            this.f46849b.f37523d = SystemClock.uptimeMillis() + m33782p;
            if (this.f46849b.isVisible() && this.f46849b.f37522c) {
                C7735a c7735a2 = this.f46849b;
                if (!c7735a2.f37532m) {
                    c7735a2.f37521b.remove(this);
                    C7735a c7735a3 = this.f46849b;
                    c7735a3.f37536q = c7735a3.f37521b.schedule(this, m33782p, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.f46849b.f37528i.isEmpty() && this.f46849b.m33794b() == this.f46849b.f37527h.m33776i() - 1) {
                C7735a c7735a4 = this.f46849b;
                c7735a4.f37533n.sendEmptyMessageAtTime(c7735a4.m33795c(), this.f46849b.f37523d);
            }
        } else {
            C7735a c7735a5 = this.f46849b;
            c7735a5.f37523d = Long.MIN_VALUE;
            c7735a5.f37522c = false;
        }
        if (!this.f46849b.isVisible() || this.f46849b.f37533n.hasMessages(-1)) {
            return;
        }
        this.f46849b.f37533n.sendEmptyMessageAtTime(-1, 0L);
    }
}
