package p373w;

import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:w/i.class
 */
/* renamed from: w.i */
/* loaded from: combined.jar:classes1.jar:w/i.class */
public class C9389i extends C9385e implements InterfaceC9388h {

    /* renamed from: w0 */
    public C9385e[] f43052w0 = new C9385e[4];

    /* renamed from: x0 */
    public int f43053x0 = 0;

    @Override // p373w.InterfaceC9388h
    /* renamed from: a */
    public void mo39699a(C9386f c9386f) {
    }

    @Override // p373w.InterfaceC9388h
    /* renamed from: b */
    public void mo39700b(C9385e c9385e) {
        if (c9385e == this || c9385e == null) {
            return;
        }
        int i10 = this.f43053x0;
        C9385e[] c9385eArr = this.f43052w0;
        if (i10 + 1 > c9385eArr.length) {
            this.f43052w0 = (C9385e[]) Arrays.copyOf(c9385eArr, c9385eArr.length * 2);
        }
        C9385e[] c9385eArr2 = this.f43052w0;
        int i11 = this.f43053x0;
        c9385eArr2[i11] = c9385e;
        this.f43053x0 = i11 + 1;
    }

    @Override // p373w.InterfaceC9388h
    /* renamed from: c */
    public void mo39701c() {
        this.f43053x0 = 0;
        Arrays.fill(this.f43052w0, (Object) null);
    }
}
