package p301r6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p301r6.InterfaceC7980h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r6/z.class
 */
/* renamed from: r6.z */
/* loaded from: combined.jar:classes2.jar:r6/z.class */
public abstract class AbstractC8008z implements InterfaceC7980h {

    /* renamed from: b */
    public InterfaceC7980h.a f38771b;

    /* renamed from: c */
    public InterfaceC7980h.a f38772c;

    /* renamed from: d */
    public InterfaceC7980h.a f38773d;

    /* renamed from: e */
    public InterfaceC7980h.a f38774e;

    /* renamed from: f */
    public ByteBuffer f38775f;

    /* renamed from: g */
    public ByteBuffer f38776g;

    /* renamed from: h */
    public boolean f38777h;

    public AbstractC8008z() {
        ByteBuffer byteBuffer = InterfaceC7980h.f38600a;
        this.f38775f = byteBuffer;
        this.f38776g = byteBuffer;
        InterfaceC7980h.a aVar = InterfaceC7980h.a.f38601e;
        this.f38773d = aVar;
        this.f38774e = aVar;
        this.f38771b = aVar;
        this.f38772c = aVar;
    }

    @Override // p301r6.InterfaceC7980h
    /* renamed from: a */
    public ByteBuffer mo34691a() {
        ByteBuffer byteBuffer = this.f38776g;
        this.f38776g = InterfaceC7980h.f38600a;
        return byteBuffer;
    }

    @Override // p301r6.InterfaceC7980h
    /* renamed from: b */
    public final InterfaceC7980h.a mo34692b(InterfaceC7980h.a aVar) {
        this.f38773d = aVar;
        this.f38774e = mo34532g(aVar);
        return isActive() ? this.f38774e : InterfaceC7980h.a.f38601e;
    }

    @Override // p301r6.InterfaceC7980h
    /* renamed from: d */
    public boolean mo34693d() {
        return this.f38777h && this.f38776g == InterfaceC7980h.f38600a;
    }

    @Override // p301r6.InterfaceC7980h
    /* renamed from: e */
    public final void mo34694e() {
        this.f38777h = true;
        mo34738i();
    }

    /* renamed from: f */
    public final boolean m34845f() {
        return this.f38776g.hasRemaining();
    }

    @Override // p301r6.InterfaceC7980h
    public final void flush() {
        this.f38776g = InterfaceC7980h.f38600a;
        this.f38777h = false;
        this.f38771b = this.f38773d;
        this.f38772c = this.f38774e;
        mo34533h();
    }

    /* renamed from: g */
    public abstract InterfaceC7980h.a mo34532g(InterfaceC7980h.a aVar);

    /* renamed from: h */
    public void mo34533h() {
    }

    /* renamed from: i */
    public void mo34738i() {
    }

    @Override // p301r6.InterfaceC7980h
    public boolean isActive() {
        return this.f38774e != InterfaceC7980h.a.f38601e;
    }

    /* renamed from: j */
    public void mo34534j() {
    }

    /* renamed from: k */
    public final ByteBuffer m34846k(int i10) {
        if (this.f38775f.capacity() < i10) {
            this.f38775f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f38775f.clear();
        }
        ByteBuffer byteBuffer = this.f38775f;
        this.f38776g = byteBuffer;
        return byteBuffer;
    }

    @Override // p301r6.InterfaceC7980h
    public final void reset() {
        flush();
        this.f38775f = InterfaceC7980h.f38600a;
        InterfaceC7980h.a aVar = InterfaceC7980h.a.f38601e;
        this.f38773d = aVar;
        this.f38774e = aVar;
        this.f38771b = aVar;
        this.f38772c = aVar;
        mo34534j();
    }
}
