package p368v9;

import p350u9.C8808d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v9/k.class
 */
/* renamed from: v9.k */
/* loaded from: combined.jar:classes2.jar:v9/k.class */
public final class C9325k extends UnsupportedOperationException {

    /* renamed from: b */
    public final C8808d f42515b;

    public C9325k(C8808d c8808d) {
        this.f42515b = c8808d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f42515b));
    }
}
