package p146i8;

import java.util.List;
import p027b9.C0843g0;
import p420y7.C9850e0;
import p420y7.C9858i0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:i8/e.class
 */
/* renamed from: i8.e */
/* loaded from: combined.jar:classes2.jar:i8/e.class */
public final class C5204e implements InterfaceC5209j {

    /* renamed from: a */
    public final InterfaceC5209j f29766a;

    /* renamed from: b */
    public final List<C9858i0> f29767b;

    public C5204e(InterfaceC5209j interfaceC5209j, List<C9858i0> list) {
        this.f29766a = interfaceC5209j;
        this.f29767b = list;
    }

    @Override // p146i8.InterfaceC5209j
    /* renamed from: a */
    public C0843g0.a<AbstractC5207h> mo25956a() {
        return new C9850e0(this.f29766a.mo25956a(), this.f29767b);
    }

    @Override // p146i8.InterfaceC5209j
    /* renamed from: b */
    public C0843g0.a<AbstractC5207h> mo25957b(C5205f c5205f, C5206g c5206g) {
        return new C9850e0(this.f29766a.mo25957b(c5205f, c5206g), this.f29767b);
    }
}
