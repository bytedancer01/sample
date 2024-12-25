package p287qc;

import java.util.Map;
import p405xc.C9720a;
import p405xc.InterfaceC9721b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qc/t.class
 */
/* renamed from: qc.t */
/* loaded from: combined.jar:classes2.jar:qc/t.class */
public final /* synthetic */ class RunnableC7899t implements Runnable {

    /* renamed from: b */
    public final Map.Entry f38019b;

    /* renamed from: c */
    public final C9720a f38020c;

    public RunnableC7899t(Map.Entry entry, C9720a c9720a) {
        this.f38019b = entry;
        this.f38020c = c9720a;
    }

    /* renamed from: a */
    public static Runnable m34242a(Map.Entry entry, C9720a c9720a) {
        return new RunnableC7899t(entry, c9720a);
    }

    @Override // java.lang.Runnable
    public void run() {
        ((InterfaceC9721b) this.f38019b.getKey()).mo26106a(this.f38020c);
    }
}
