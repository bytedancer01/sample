package p386wc;

import tc.C8680c;
import tc.C8681d;
import tc.InterfaceC8685h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wc/i.class
 */
/* renamed from: wc.i */
/* loaded from: combined.jar:classes2.jar:wc/i.class */
public class C9568i implements InterfaceC8685h {

    /* renamed from: a */
    public boolean f43566a = false;

    /* renamed from: b */
    public boolean f43567b = false;

    /* renamed from: c */
    public C8681d f43568c;

    /* renamed from: d */
    public final C9565f f43569d;

    public C9568i(C9565f c9565f) {
        this.f43569d = c9565f;
    }

    /* renamed from: a */
    public final void m40128a() {
        if (this.f43566a) {
            throw new C8680c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f43566a = true;
    }

    @Override // tc.InterfaceC8685h
    /* renamed from: b */
    public InterfaceC8685h mo37182b(String str) {
        m40128a();
        this.f43569d.m40108h(this.f43568c, str, this.f43567b);
        return this;
    }

    /* renamed from: c */
    public void m40129c(C8681d c8681d, boolean z10) {
        this.f43566a = false;
        this.f43568c = c8681d;
        this.f43567b = z10;
    }

    @Override // tc.InterfaceC8685h
    /* renamed from: e */
    public InterfaceC8685h mo37183e(boolean z10) {
        m40128a();
        this.f43569d.m40113m(this.f43568c, z10, this.f43567b);
        return this;
    }
}
