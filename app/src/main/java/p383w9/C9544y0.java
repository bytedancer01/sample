package p383w9;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.C2414a;
import com.google.android.gms.common.api.internal.AbstractC2418a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p350u9.C8804b;
import p350u9.C8814g;
import p368v9.InterfaceC9320f;
import p384wa.C9551a;
import p384wa.InterfaceC9556f;
import p422y9.C9902d;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/y0.class
 */
/* renamed from: w9.y0 */
/* loaded from: combined.jar:classes2.jar:w9/y0.class */
public final class C9544y0 implements InterfaceC9513q1, InterfaceC9466g3 {

    /* renamed from: b */
    public final Lock f43491b;

    /* renamed from: c */
    public final Condition f43492c;

    /* renamed from: d */
    public final Context f43493d;

    /* renamed from: e */
    public final C8814g f43494e;

    /* renamed from: f */
    public final HandlerC9540x0 f43495f;

    /* renamed from: g */
    public final Map<C2414a.c<?>, C2414a.f> f43496g;

    /* renamed from: i */
    public final C9902d f43498i;

    /* renamed from: j */
    public final Map<C2414a<?>, Boolean> f43499j;

    /* renamed from: k */
    public final C2414a.a<? extends InterfaceC9556f, C9551a> f43500k;

    /* renamed from: l */
    @NotOnlyInitialized
    public volatile InterfaceC9532v0 f43501l;

    /* renamed from: n */
    public int f43503n;

    /* renamed from: o */
    public final C9528u0 f43504o;

    /* renamed from: p */
    public final InterfaceC9504o1 f43505p;

    /* renamed from: h */
    public final Map<C2414a.c<?>, C8804b> f43497h = new HashMap();

    /* renamed from: m */
    public C8804b f43502m = null;

    public C9544y0(Context context, C9528u0 c9528u0, Lock lock, Looper looper, C8814g c8814g, Map<C2414a.c<?>, C2414a.f> map, C9902d c9902d, Map<C2414a<?>, Boolean> map2, C2414a.a<? extends InterfaceC9556f, C9551a> aVar, ArrayList<C9461f3> arrayList, InterfaceC9504o1 interfaceC9504o1) {
        this.f43493d = context;
        this.f43491b = lock;
        this.f43494e = c8814g;
        this.f43496g = map;
        this.f43498i = c9902d;
        this.f43499j = map2;
        this.f43500k = aVar;
        this.f43504o = c9528u0;
        this.f43505p = interfaceC9504o1;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).m39866a(this);
        }
        this.f43495f = new HandlerC9540x0(this, looper);
        this.f43492c = lock.newCondition();
        this.f43501l = new C9512q0(this);
    }

    @Override // p383w9.InterfaceC9466g3
    /* renamed from: Z */
    public final void mo39892Z(C8804b c8804b, C2414a<?> c2414a, boolean z10) {
        this.f43491b.lock();
        try {
            this.f43501l.mo39816a(c8804b, c2414a, z10);
        } finally {
            this.f43491b.unlock();
        }
    }

    @Override // p383w9.InterfaceC9513q1
    /* renamed from: a */
    public final void mo40012a() {
        this.f43501l.mo39819d();
    }

    @Override // p383w9.InterfaceC9513q1
    /* renamed from: b */
    public final void mo40013b() {
        if (this.f43501l instanceof C9443c0) {
            ((C9443c0) this.f43501l).m39823i();
        }
    }

    @Override // p383w9.InterfaceC9513q1
    /* renamed from: c */
    public final void mo40014c() {
        if (this.f43501l.mo39821f()) {
            this.f43497h.clear();
        }
    }

    @Override // p383w9.InterfaceC9513q1
    /* renamed from: d */
    public final void mo40015d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.f43501l);
        for (C2414a<?> c2414a : this.f43499j.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) c2414a.m13131d()).println(":");
            ((C2414a.f) C9935o.m41850j(this.f43496g.get(c2414a.m13129b()))).dump(concat, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // p383w9.InterfaceC9513q1
    /* renamed from: e */
    public final boolean mo40016e() {
        return this.f43501l instanceof C9443c0;
    }

    @Override // p383w9.InterfaceC9513q1
    /* renamed from: f */
    public final <A extends C2414a.b, T extends AbstractC2418a<? extends InterfaceC9320f, A>> T mo40017f(T t10) {
        t10.m13149m();
        return (T) this.f43501l.mo39822g(t10);
    }

    /* renamed from: i */
    public final void m40083i() {
        this.f43491b.lock();
        try {
            this.f43504o.m40056q();
            this.f43501l = new C9443c0(this);
            this.f43501l.mo39818c();
            this.f43492c.signalAll();
        } finally {
            this.f43491b.unlock();
        }
    }

    /* renamed from: j */
    public final void m40084j() {
        this.f43491b.lock();
        try {
            this.f43501l = new C9508p0(this, this.f43498i, this.f43499j, this.f43494e, this.f43500k, this.f43491b, this.f43493d);
            this.f43501l.mo39818c();
            this.f43492c.signalAll();
        } finally {
            this.f43491b.unlock();
        }
    }

    /* renamed from: k */
    public final void m40085k(C8804b c8804b) {
        this.f43491b.lock();
        try {
            this.f43502m = c8804b;
            this.f43501l = new C9512q0(this);
            this.f43501l.mo39818c();
            this.f43492c.signalAll();
        } finally {
            this.f43491b.unlock();
        }
    }

    /* renamed from: l */
    public final void m40086l(AbstractC9536w0 abstractC9536w0) {
        this.f43495f.sendMessage(this.f43495f.obtainMessage(1, abstractC9536w0));
    }

    /* renamed from: m */
    public final void m40087m(RuntimeException runtimeException) {
        this.f43495f.sendMessage(this.f43495f.obtainMessage(2, runtimeException));
    }

    @Override // p383w9.InterfaceC9452e
    public final void onConnected(Bundle bundle) {
        this.f43491b.lock();
        try {
            this.f43501l.mo39817b(bundle);
        } finally {
            this.f43491b.unlock();
        }
    }

    @Override // p383w9.InterfaceC9452e
    public final void onConnectionSuspended(int i10) {
        this.f43491b.lock();
        try {
            this.f43501l.mo39820e(i10);
        } finally {
            this.f43491b.unlock();
        }
    }
}
