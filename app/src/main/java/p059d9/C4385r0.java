package p059d9;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import p059d9.InterfaceC4380p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/r0.class
 */
/* renamed from: d9.r0 */
/* loaded from: combined.jar:classes2.jar:d9/r0.class */
public final class C4385r0 implements InterfaceC4380p {

    /* renamed from: b */
    public static final List<b> f26640b = new ArrayList(50);

    /* renamed from: a */
    public final Handler f26641a;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:d9/r0$b.class
     */
    /* renamed from: d9.r0$b */
    /* loaded from: combined.jar:classes2.jar:d9/r0$b.class */
    public static final class b implements InterfaceC4380p.a {

        /* renamed from: a */
        public Message f26642a;

        /* renamed from: b */
        public C4385r0 f26643b;

        public b() {
        }

        @Override // p059d9.InterfaceC4380p.a
        /* renamed from: a */
        public void mo22206a() {
            ((Message) C4349a.m21882e(this.f26642a)).sendToTarget();
            m22222b();
        }

        /* renamed from: b */
        public final void m22222b() {
            this.f26642a = null;
            this.f26643b = null;
            C4385r0.m22221n(this);
        }

        /* renamed from: c */
        public boolean m22223c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) C4349a.m21882e(this.f26642a));
            m22222b();
            return sendMessageAtFrontOfQueue;
        }

        /* renamed from: d */
        public b m22224d(Message message, C4385r0 c4385r0) {
            this.f26642a = message;
            this.f26643b = c4385r0;
            return this;
        }
    }

    public C4385r0(Handler handler) {
        this.f26641a = handler;
    }

    /* renamed from: m */
    public static b m22220m() {
        b bVar;
        List<b> list = f26640b;
        synchronized (list) {
            bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
        }
        return bVar;
    }

    /* renamed from: n */
    public static void m22221n(b bVar) {
        List<b> list = f26640b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    @Override // p059d9.InterfaceC4380p
    /* renamed from: a */
    public boolean mo22195a(InterfaceC4380p.a aVar) {
        return ((b) aVar).m22223c(this.f26641a);
    }

    @Override // p059d9.InterfaceC4380p
    /* renamed from: b */
    public InterfaceC4380p.a mo22196b(int i10) {
        return m22220m().m22224d(this.f26641a.obtainMessage(i10), this);
    }

    @Override // p059d9.InterfaceC4380p
    /* renamed from: c */
    public boolean mo22197c(int i10) {
        return this.f26641a.hasMessages(i10);
    }

    @Override // p059d9.InterfaceC4380p
    /* renamed from: d */
    public InterfaceC4380p.a mo22198d(int i10, int i11, int i12, Object obj) {
        return m22220m().m22224d(this.f26641a.obtainMessage(i10, i11, i12, obj), this);
    }

    @Override // p059d9.InterfaceC4380p
    /* renamed from: e */
    public InterfaceC4380p.a mo22199e(int i10, Object obj) {
        return m22220m().m22224d(this.f26641a.obtainMessage(i10, obj), this);
    }

    @Override // p059d9.InterfaceC4380p
    /* renamed from: f */
    public void mo22200f(Object obj) {
        this.f26641a.removeCallbacksAndMessages(obj);
    }

    @Override // p059d9.InterfaceC4380p
    /* renamed from: g */
    public InterfaceC4380p.a mo22201g(int i10, int i11, int i12) {
        return m22220m().m22224d(this.f26641a.obtainMessage(i10, i11, i12), this);
    }

    @Override // p059d9.InterfaceC4380p
    /* renamed from: h */
    public boolean mo22202h(Runnable runnable) {
        return this.f26641a.post(runnable);
    }

    @Override // p059d9.InterfaceC4380p
    /* renamed from: i */
    public boolean mo22203i(int i10) {
        return this.f26641a.sendEmptyMessage(i10);
    }

    @Override // p059d9.InterfaceC4380p
    /* renamed from: j */
    public boolean mo22204j(int i10, long j10) {
        return this.f26641a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // p059d9.InterfaceC4380p
    /* renamed from: k */
    public void mo22205k(int i10) {
        this.f26641a.removeMessages(i10);
    }
}
