package p005a4;

import java.util.Queue;
import p005a4.InterfaceC0069f;
import p363v4.C9242h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a4/a.class
 */
/* renamed from: a4.a */
/* loaded from: combined.jar:classes1.jar:a4/a.class */
public abstract class AbstractC0064a<T extends InterfaceC0069f> {

    /* renamed from: a */
    public final Queue<T> f194a = C9242h.m38965c(20);

    /* renamed from: a */
    public abstract T mo228a();

    /* renamed from: b */
    public T m229b() {
        T poll = this.f194a.poll();
        T t10 = poll;
        if (poll == null) {
            t10 = mo228a();
        }
        return t10;
    }

    /* renamed from: c */
    public void m230c(T t10) {
        if (this.f194a.size() < 20) {
            this.f194a.offer(t10);
        }
    }
}
