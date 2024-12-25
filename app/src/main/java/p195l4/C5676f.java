package p195l4;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.security.MessageDigest;
import java.util.UUID;
import p005a4.InterfaceC0065b;
import p122h4.C5023a;
import p318s4.InterfaceC8527c;
import p329t3.C8615e;
import p329t3.C8617g;
import p330t4.AbstractC8627g;
import p362v3.C9231a;
import p396x3.InterfaceC9646c;
import p396x3.InterfaceC9650g;
import p435z3.EnumC10038b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l4/f.class
 */
/* renamed from: l4.f */
/* loaded from: combined.jar:classes1.jar:l4/f.class */
public class C5676f {

    /* renamed from: a */
    public final c f31989a;

    /* renamed from: b */
    public final C9231a f31990b;

    /* renamed from: c */
    public final Handler f31991c;

    /* renamed from: d */
    public boolean f31992d;

    /* renamed from: e */
    public boolean f31993e;

    /* renamed from: f */
    public C8615e<C9231a, C9231a, Bitmap, Bitmap> f31994f;

    /* renamed from: g */
    public b f31995g;

    /* renamed from: h */
    public boolean f31996h;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l4/f$b.class
     */
    /* renamed from: l4.f$b */
    /* loaded from: combined.jar:classes1.jar:l4/f$b.class */
    public static class b extends AbstractC8627g<Bitmap> {

        /* renamed from: d */
        public final Handler f31997d;

        /* renamed from: e */
        public final int f31998e;

        /* renamed from: f */
        public final long f31999f;

        /* renamed from: g */
        public Bitmap f32000g;

        public b(Handler handler, int i10, long j10) {
            this.f31997d = handler;
            this.f31998e = i10;
            this.f31999f = j10;
        }

        /* renamed from: k */
        public Bitmap m27920k() {
            return this.f32000g;
        }

        @Override // p330t4.InterfaceC8630j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo16635c(Bitmap bitmap, InterfaceC8527c<? super Bitmap> interfaceC8527c) {
            this.f32000g = bitmap;
            this.f31997d.sendMessageAtTime(this.f31997d.obtainMessage(1, this), this.f31999f);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l4/f$c.class
     */
    /* renamed from: l4.f$c */
    /* loaded from: combined.jar:classes1.jar:l4/f$c.class */
    public interface c {
        /* renamed from: a */
        void mo27901a(int i10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l4/f$d.class
     */
    /* renamed from: l4.f$d */
    /* loaded from: combined.jar:classes1.jar:l4/f$d.class */
    public class d implements Handler.Callback {

        /* renamed from: b */
        public final C5676f f32001b;

        public d(C5676f c5676f) {
            this.f32001b = c5676f;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                this.f32001b.m27915e((b) message.obj);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            C8617g.m37001g((b) message.obj);
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l4/f$e.class
     */
    /* renamed from: l4.f$e */
    /* loaded from: combined.jar:classes1.jar:l4/f$e.class */
    public static class e implements InterfaceC9646c {

        /* renamed from: a */
        public final UUID f32002a;

        public e() {
            this(UUID.randomUUID());
        }

        public e(UUID uuid) {
            this.f32002a = uuid;
        }

        @Override // p396x3.InterfaceC9646c
        /* renamed from: a */
        public void mo27922a(MessageDigest messageDigest) {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // p396x3.InterfaceC9646c
        public boolean equals(Object obj) {
            if (obj instanceof e) {
                return ((e) obj).f32002a.equals(this.f32002a);
            }
            return false;
        }

        @Override // p396x3.InterfaceC9646c
        public int hashCode() {
            return this.f32002a.hashCode();
        }
    }

    public C5676f(Context context, c cVar, C9231a c9231a, int i10, int i11) {
        this(cVar, c9231a, null, m27911c(context, c9231a, i10, i11, C8617g.m37002i(context).m37011l()));
    }

    public C5676f(c cVar, C9231a c9231a, Handler handler, C8615e<C9231a, C9231a, Bitmap, Bitmap> c8615e) {
        this.f31992d = false;
        this.f31993e = false;
        Handler handler2 = handler == null ? new Handler(Looper.getMainLooper(), new d()) : handler;
        this.f31989a = cVar;
        this.f31990b = c9231a;
        this.f31991c = handler2;
        this.f31994f = c8615e;
    }

    /* renamed from: c */
    public static C8615e<C9231a, C9231a, Bitmap, Bitmap> m27911c(Context context, C9231a c9231a, int i10, int i11, InterfaceC0065b interfaceC0065b) {
        C5678h c5678h = new C5678h(interfaceC0065b);
        C5677g c5677g = new C5677g();
        return C8617g.m37004u(context).m37035w(c5677g, C9231a.class).m37039c(c9231a).m37040a(Bitmap.class).m36996s(C5023a.m25229b()).mo36966h(c5678h).mo36970r(true).mo36967i(EnumC10038b.NONE).mo36968o(i10, i11);
    }

    /* renamed from: a */
    public void m27912a() {
        m27918h();
        b bVar = this.f31995g;
        if (bVar != null) {
            C8617g.m37001g(bVar);
            this.f31995g = null;
        }
        this.f31996h = true;
    }

    /* renamed from: b */
    public Bitmap m27913b() {
        b bVar = this.f31995g;
        return bVar != null ? bVar.m27920k() : null;
    }

    /* renamed from: d */
    public final void m27914d() {
        if (!this.f31992d || this.f31993e) {
            return;
        }
        this.f31993e = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        long m38916h = this.f31990b.m38916h();
        this.f31990b.m38909a();
        this.f31994f.mo36969p(new e()).m36993l(new b(this.f31991c, this.f31990b.m38912d(), uptimeMillis + m38916h));
    }

    /* renamed from: e */
    public void m27915e(b bVar) {
        if (this.f31996h) {
            this.f31991c.obtainMessage(2, bVar).sendToTarget();
            return;
        }
        b bVar2 = this.f31995g;
        this.f31995g = bVar;
        this.f31989a.mo27901a(bVar.f31998e);
        if (bVar2 != null) {
            this.f31991c.obtainMessage(2, bVar2).sendToTarget();
        }
        this.f31993e = false;
        m27914d();
    }

    /* renamed from: f */
    public void m27916f(InterfaceC9650g<Bitmap> interfaceC9650g) {
        if (interfaceC9650g == null) {
            throw new NullPointerException("Transformation must not be null");
        }
        this.f31994f = this.f31994f.mo36971u(interfaceC9650g);
    }

    /* renamed from: g */
    public void m27917g() {
        if (this.f31992d) {
            return;
        }
        this.f31992d = true;
        this.f31996h = false;
        m27914d();
    }

    /* renamed from: h */
    public void m27918h() {
        this.f31992d = false;
    }
}
