package p022b4;

import java.io.File;
import p022b4.InterfaceC0791a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b4/d.class
 */
/* renamed from: b4.d */
/* loaded from: combined.jar:classes1.jar:b4/d.class */
public class C0794d implements InterfaceC0791a.a {

    /* renamed from: a */
    public final int f5533a;

    /* renamed from: b */
    public final a f5534b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b4/d$a.class
     */
    /* renamed from: b4.d$a */
    /* loaded from: combined.jar:classes1.jar:b4/d$a.class */
    public interface a {
        /* renamed from: a */
        File mo5097a();
    }

    public C0794d(a aVar, int i10) {
        this.f5533a = i10;
        this.f5534b = aVar;
    }

    @Override // p022b4.InterfaceC0791a.a
    public InterfaceC0791a build() {
        File mo5097a = this.f5534b.mo5097a();
        if (mo5097a == null) {
            return null;
        }
        if (mo5097a.mkdirs() || (mo5097a.exists() && mo5097a.isDirectory())) {
            return C0795e.m5098d(mo5097a, this.f5533a);
        }
        return null;
    }
}
