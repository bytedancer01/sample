package p304r9;

import com.google.android.gms.cast.CastDevice;
import java.util.Map;
import p200l9.C5758e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r9/o0.class
 */
/* renamed from: r9.o0 */
/* loaded from: combined.jar:classes2.jar:r9/o0.class */
public final class RunnableC8042o0 implements Runnable {

    /* renamed from: b */
    public final C8046q0 f38845b;

    /* renamed from: c */
    public final String f38846c;

    /* renamed from: d */
    public final String f38847d;

    public RunnableC8042o0(BinderC8044p0 binderC8044p0, C8046q0 c8046q0, String str, String str2) {
        this.f38845b = c8046q0;
        this.f38846c = str;
        this.f38847d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        Map map2;
        C5758e.e eVar;
        C8015b c8015b;
        CastDevice castDevice;
        map = this.f38845b.f38856e;
        synchronized (map) {
            map2 = this.f38845b.f38856e;
            eVar = (C5758e.e) map2.get(this.f38846c);
        }
        if (eVar != null) {
            castDevice = this.f38845b.f38854c;
            eVar.mo28190a(castDevice, this.f38846c, this.f38847d);
        } else {
            c8015b = C8046q0.f38851y;
            c8015b.m34873a("Discarded message for unknown namespace '%s'", this.f38846c);
        }
    }
}
