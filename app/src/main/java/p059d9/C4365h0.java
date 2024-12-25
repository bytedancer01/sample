package p059d9;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import org.apache.http.impl.auth.NTLMEngineImpl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/h0.class
 */
/* renamed from: d9.h0 */
/* loaded from: combined.jar:classes2.jar:d9/h0.class */
public final class C4365h0 {

    /* renamed from: a */
    public final Object f26578a = new Object();

    /* renamed from: b */
    public final PriorityQueue<Integer> f26579b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c */
    public int f26580c = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:d9/h0$a.class
     */
    /* renamed from: d9.h0$a */
    /* loaded from: combined.jar:classes2.jar:d9/h0$a.class */
    public static class a extends IOException {
        public a(int i10, int i11) {
            super("Priority too low [priority=" + i10 + ", highest=" + i11 + "]");
        }
    }

    /* renamed from: a */
    public void m22027a(int i10) {
        synchronized (this.f26578a) {
            this.f26579b.add(Integer.valueOf(i10));
            this.f26580c = Math.max(this.f26580c, i10);
        }
    }

    /* renamed from: b */
    public void m22028b(int i10) {
        synchronized (this.f26578a) {
            while (this.f26580c != i10) {
                this.f26578a.wait();
            }
        }
    }

    /* renamed from: c */
    public void m22029c(int i10) {
        synchronized (this.f26578a) {
            if (this.f26580c != i10) {
                throw new a(i10, this.f26580c);
            }
        }
    }

    /* renamed from: d */
    public void m22030d(int i10) {
        synchronized (this.f26578a) {
            this.f26579b.remove(Integer.valueOf(i10));
            this.f26580c = this.f26579b.isEmpty() ? Integer.MIN_VALUE : ((Integer) C4401z0.m22391j(this.f26579b.peek())).intValue();
            this.f26578a.notifyAll();
        }
    }
}
