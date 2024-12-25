package p383w9;

import p383w9.ComponentCallbacks2C9442c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/b1.class
 */
/* renamed from: w9.b1 */
/* loaded from: combined.jar:classes2.jar:w9/b1.class */
public final class C9439b1 implements ComponentCallbacks2C9442c.a {

    /* renamed from: a */
    public final C9457f f43211a;

    public C9439b1(C9457f c9457f) {
        this.f43211a = c9457f;
    }

    @Override // p383w9.ComponentCallbacks2C9442c.a
    /* renamed from: a */
    public final void mo30249a(boolean z10) {
        C9457f c9457f = this.f43211a;
        c9457f.f43255q.sendMessage(c9457f.f43255q.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
