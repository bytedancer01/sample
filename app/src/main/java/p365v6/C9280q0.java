package p365v6;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.Map;
import p009a8.InterfaceC0127w;
import p027b9.InterfaceC0831a0;
import p059d9.C4349a;
import p267p6.C7629w0;
import p365v6.C9263i;
import p365v6.C9273n;
import p365v6.InterfaceC9277p;
import p365v6.InterfaceC9290x;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v6/q0.class
 */
/* renamed from: v6.q0 */
/* loaded from: combined.jar:classes2.jar:v6/q0.class */
public final class C9280q0 {

    /* renamed from: e */
    public static final C7629w0 f42370e = new C7629w0.b().m33201L(new C9273n(new C9273n.b[0])).m33194E();

    /* renamed from: a */
    public final ConditionVariable f42371a;

    /* renamed from: b */
    public final C9263i f42372b;

    /* renamed from: c */
    public final HandlerThread f42373c;

    /* renamed from: d */
    public final InterfaceC9290x.a f42374d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/q0$a.class
     */
    /* renamed from: v6.q0$a */
    /* loaded from: combined.jar:classes2.jar:v6/q0$a.class */
    public class a implements InterfaceC9290x {

        /* renamed from: b */
        public final C9280q0 f42375b;

        public a(C9280q0 c9280q0) {
            this.f42375b = c9280q0;
        }

        @Override // p365v6.InterfaceC9290x
        /* renamed from: P */
        public void mo423P(int i10, InterfaceC0127w.a aVar) {
            this.f42375b.f42371a.open();
        }

        @Override // p365v6.InterfaceC9290x
        /* renamed from: T */
        public /* synthetic */ void mo424T(int i10, InterfaceC0127w.a aVar) {
            C9279q.m39150a(this, i10, aVar);
        }

        @Override // p365v6.InterfaceC9290x
        /* renamed from: X */
        public void mo425X(int i10, InterfaceC0127w.a aVar) {
            this.f42375b.f42371a.open();
        }

        @Override // p365v6.InterfaceC9290x
        /* renamed from: g */
        public void mo428g(int i10, InterfaceC0127w.a aVar, Exception exc) {
            this.f42375b.f42371a.open();
        }

        @Override // p365v6.InterfaceC9290x
        /* renamed from: k0 */
        public void mo429k0(int i10, InterfaceC0127w.a aVar) {
            this.f42375b.f42371a.open();
        }

        @Override // p365v6.InterfaceC9290x
        /* renamed from: l */
        public /* synthetic */ void mo430l(int i10, InterfaceC0127w.a aVar, int i11) {
            C9279q.m39151b(this, i10, aVar, i11);
        }

        @Override // p365v6.InterfaceC9290x
        /* renamed from: n */
        public /* synthetic */ void mo431n(int i10, InterfaceC0127w.a aVar) {
            C9279q.m39152c(this, i10, aVar);
        }
    }

    public C9280q0(C9263i c9263i, InterfaceC9290x.a aVar) {
        this.f42372b = c9263i;
        this.f42374d = aVar;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:OfflineLicenseHelper");
        this.f42373c = handlerThread;
        handlerThread.start();
        this.f42371a = new ConditionVariable();
        aVar.m39173g(new Handler(handlerThread.getLooper()), new a(this));
    }

    /* renamed from: d */
    public static C9280q0 m39154d(String str, boolean z10, InterfaceC0831a0.b bVar, Map<String, String> map, InterfaceC9290x.a aVar) {
        return new C9280q0(new C9263i.b().m39099b(map).m39098a(new C9272m0(str, z10, bVar)), aVar);
    }

    /* renamed from: b */
    public final byte[] m39155b(int i10, byte[] bArr, C7629w0 c7629w0) {
        this.f42372b.prepare();
        InterfaceC9277p m39157e = m39157e(i10, bArr, c7629w0);
        InterfaceC9277p.a error = m39157e.getError();
        byte[] mo39027e = m39157e.mo39027e();
        m39157e.mo39028f(this.f42374d);
        this.f42372b.release();
        if (error == null) {
            return (byte[]) C4349a.m21882e(mo39027e);
        }
        throw error;
    }

    /* renamed from: c */
    public byte[] m39156c(C7629w0 c7629w0) {
        byte[] m39155b;
        synchronized (this) {
            C4349a.m21878a(c7629w0.f37089p != null);
            m39155b = m39155b(2, null, c7629w0);
        }
        return m39155b;
    }

    /* renamed from: e */
    public final InterfaceC9277p m39157e(int i10, byte[] bArr, C7629w0 c7629w0) {
        C4349a.m21882e(c7629w0.f37089p);
        this.f42372b.m39086C(i10, bArr);
        this.f42371a.close();
        InterfaceC9277p mo39090c = this.f42372b.mo39090c(this.f42373c.getLooper(), this.f42374d, c7629w0);
        this.f42371a.block();
        return (InterfaceC9277p) C4349a.m21882e(mo39090c);
    }

    /* renamed from: f */
    public void m39158f() {
        this.f42373c.quit();
    }
}
