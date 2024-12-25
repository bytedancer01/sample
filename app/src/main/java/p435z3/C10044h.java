package p435z3;

import android.os.Looper;
import p396x3.InterfaceC9646c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:z3/h.class
 */
/* renamed from: z3.h */
/* loaded from: combined.jar:classes1.jar:z3/h.class */
public class C10044h<Z> implements InterfaceC10048l<Z> {

    /* renamed from: a */
    public final InterfaceC10048l<Z> f46099a;

    /* renamed from: b */
    public final boolean f46100b;

    /* renamed from: c */
    public a f46101c;

    /* renamed from: d */
    public InterfaceC9646c f46102d;

    /* renamed from: e */
    public int f46103e;

    /* renamed from: f */
    public boolean f46104f;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:z3/h$a.class
     */
    /* renamed from: z3.h$a */
    /* loaded from: combined.jar:classes1.jar:z3/h$a.class */
    public interface a {
        /* renamed from: b */
        void mo42224b(InterfaceC9646c interfaceC9646c, C10044h<?> c10044h);
    }

    public C10044h(InterfaceC10048l<Z> interfaceC10048l, boolean z10) {
        if (interfaceC10048l == null) {
            throw new NullPointerException("Wrapped resource must not be null");
        }
        this.f46099a = interfaceC10048l;
        this.f46100b = z10;
    }

    /* renamed from: a */
    public void m42250a() {
        if (this.f46104f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
        this.f46103e++;
    }

    @Override // p435z3.InterfaceC10048l
    /* renamed from: b */
    public void mo25232b() {
        if (this.f46103e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f46104f) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f46104f = true;
        this.f46099a.mo25232b();
    }

    /* renamed from: c */
    public boolean m42251c() {
        return this.f46100b;
    }

    /* renamed from: d */
    public void m42252d() {
        if (this.f46103e <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        }
        if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
        int i10 = this.f46103e - 1;
        this.f46103e = i10;
        if (i10 == 0) {
            this.f46101c.mo42224b(this.f46102d, this);
        }
    }

    /* renamed from: e */
    public void m42253e(InterfaceC9646c interfaceC9646c, a aVar) {
        this.f46102d = interfaceC9646c;
        this.f46101c = aVar;
    }

    @Override // p435z3.InterfaceC10048l
    public Z get() {
        return this.f46099a.get();
    }

    @Override // p435z3.InterfaceC10048l
    public int getSize() {
        return this.f46099a.getSize();
    }
}
