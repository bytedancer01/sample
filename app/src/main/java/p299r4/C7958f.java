package p299r4;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:r4/f.class
 */
/* renamed from: r4.f */
/* loaded from: combined.jar:classes1.jar:r4/f.class */
public class C7958f implements InterfaceC7955c, InterfaceC7954b {

    /* renamed from: a */
    public InterfaceC7954b f38411a;

    /* renamed from: b */
    public InterfaceC7954b f38412b;

    /* renamed from: c */
    public InterfaceC7955c f38413c;

    public C7958f(InterfaceC7955c interfaceC7955c) {
        this.f38413c = interfaceC7955c;
    }

    @Override // p299r4.InterfaceC7955c
    /* renamed from: a */
    public boolean mo34504a() {
        return m34512j() || mo34486c();
    }

    @Override // p299r4.InterfaceC7954b
    /* renamed from: b */
    public void mo34485b() {
        this.f38411a.mo34485b();
        this.f38412b.mo34485b();
    }

    @Override // p299r4.InterfaceC7954b
    /* renamed from: c */
    public boolean mo34486c() {
        return this.f38411a.mo34486c() || this.f38412b.mo34486c();
    }

    @Override // p299r4.InterfaceC7954b
    public void clear() {
        this.f38412b.clear();
        this.f38411a.clear();
    }

    @Override // p299r4.InterfaceC7955c
    /* renamed from: d */
    public void mo34505d(InterfaceC7954b interfaceC7954b) {
        if (interfaceC7954b.equals(this.f38412b)) {
            return;
        }
        InterfaceC7955c interfaceC7955c = this.f38413c;
        if (interfaceC7955c != null) {
            interfaceC7955c.mo34505d(this);
        }
        if (this.f38412b.isComplete()) {
            return;
        }
        this.f38412b.clear();
    }

    @Override // p299r4.InterfaceC7955c
    /* renamed from: e */
    public boolean mo34506e(InterfaceC7954b interfaceC7954b) {
        return m34511i() && (interfaceC7954b.equals(this.f38411a) || !this.f38411a.mo34486c());
    }

    @Override // p299r4.InterfaceC7954b
    /* renamed from: f */
    public void mo34489f() {
        if (!this.f38412b.isRunning()) {
            this.f38412b.mo34489f();
        }
        if (this.f38411a.isRunning()) {
            return;
        }
        this.f38411a.mo34489f();
    }

    @Override // p299r4.InterfaceC7955c
    /* renamed from: g */
    public boolean mo34507g(InterfaceC7954b interfaceC7954b) {
        return m34510h() && interfaceC7954b.equals(this.f38411a) && !mo34504a();
    }

    /* renamed from: h */
    public final boolean m34510h() {
        InterfaceC7955c interfaceC7955c = this.f38413c;
        return interfaceC7955c == null || interfaceC7955c.mo34507g(this);
    }

    /* renamed from: i */
    public final boolean m34511i() {
        InterfaceC7955c interfaceC7955c = this.f38413c;
        return interfaceC7955c == null || interfaceC7955c.mo34506e(this);
    }

    @Override // p299r4.InterfaceC7954b
    public boolean isCancelled() {
        return this.f38411a.isCancelled();
    }

    @Override // p299r4.InterfaceC7954b
    public boolean isComplete() {
        return this.f38411a.isComplete() || this.f38412b.isComplete();
    }

    @Override // p299r4.InterfaceC7954b
    public boolean isRunning() {
        return this.f38411a.isRunning();
    }

    /* renamed from: j */
    public final boolean m34512j() {
        InterfaceC7955c interfaceC7955c = this.f38413c;
        return interfaceC7955c != null && interfaceC7955c.mo34504a();
    }

    /* renamed from: k */
    public void m34513k(InterfaceC7954b interfaceC7954b, InterfaceC7954b interfaceC7954b2) {
        this.f38411a = interfaceC7954b;
        this.f38412b = interfaceC7954b2;
    }

    @Override // p299r4.InterfaceC7954b
    public void pause() {
        this.f38411a.pause();
        this.f38412b.pause();
    }
}
