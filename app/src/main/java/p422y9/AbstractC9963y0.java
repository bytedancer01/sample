package p422y9;

import android.util.Log;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/y0.class
 */
/* renamed from: y9.y0 */
/* loaded from: combined.jar:classes2.jar:y9/y0.class */
public abstract class AbstractC9963y0<TListener> {

    /* renamed from: a */
    public TListener f45654a;

    /* renamed from: b */
    public boolean f45655b = false;

    /* renamed from: c */
    public final AbstractC9899c f45656c;

    public AbstractC9963y0(AbstractC9899c abstractC9899c, TListener tlistener) {
        this.f45656c = abstractC9899c;
        this.f45654a = tlistener;
    }

    /* renamed from: a */
    public abstract void mo41856a(TListener tlistener);

    /* renamed from: b */
    public abstract void mo41857b();

    /* renamed from: c */
    public final void m41891c() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.f45654a;
            if (this.f45655b) {
                String obj = toString();
                StringBuilder sb2 = new StringBuilder(obj.length() + 47);
                sb2.append("Callback proxy ");
                sb2.append(obj);
                sb2.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb2.toString());
            }
        }
        if (tlistener != null) {
            try {
                mo41856a(tlistener);
            } catch (RuntimeException e10) {
                throw e10;
            }
        }
        synchronized (this) {
            this.f45655b = true;
        }
        m41893e();
    }

    /* renamed from: d */
    public final void m41892d() {
        synchronized (this) {
            this.f45654a = null;
        }
    }

    /* renamed from: e */
    public final void m41893e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        m41892d();
        arrayList = this.f45656c.zzt;
        synchronized (arrayList) {
            arrayList2 = this.f45656c.zzt;
            arrayList2.remove(this);
        }
    }
}
