package p350u9;

import java.util.concurrent.Callable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u9/k0.class
 */
/* renamed from: u9.k0 */
/* loaded from: combined.jar:classes2.jar:u9/k0.class */
public final class C8823k0 extends C8825l0 {

    /* renamed from: e */
    public final Callable<String> f40862e;

    public /* synthetic */ C8823k0(Callable callable, C8821j0 c8821j0) {
        super(false, null, null);
        this.f40862e = callable;
    }

    @Override // p350u9.C8825l0
    /* renamed from: a */
    public final String mo37719a() {
        try {
            return this.f40862e.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
