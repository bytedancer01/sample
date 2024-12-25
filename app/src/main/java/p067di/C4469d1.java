package p067di;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/d1.class
 */
/* renamed from: di.d1 */
/* loaded from: combined.jar:classes2.jar:di/d1.class */
public final class C4469d1 extends CancellationException {

    /* renamed from: b */
    @NotNull
    public final InterfaceC4466c1 f26882b;

    public C4469d1(@NotNull String str, @Nullable Throwable th2, @NotNull InterfaceC4466c1 interfaceC4466c1) {
        super(str);
        this.f26882b = interfaceC4466c1;
        if (th2 != null) {
            initCause(th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (p372vh.C9367f.m39522a(r0.getCause(), getCause()) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            r1 = r3
            if (r0 == r1) goto L43
            r0 = r4
            boolean r0 = r0 instanceof p067di.C4469d1
            if (r0 == 0) goto L3e
            r0 = r4
            di.d1 r0 = (p067di.C4469d1) r0
            r4 = r0
            r0 = r4
            java.lang.String r0 = r0.getMessage()
            r1 = r3
            java.lang.String r1 = r1.getMessage()
            boolean r0 = p372vh.C9367f.m39522a(r0, r1)
            if (r0 == 0) goto L3e
            r0 = r4
            di.c1 r0 = r0.f26882b
            r1 = r3
            di.c1 r1 = r1.f26882b
            boolean r0 = p372vh.C9367f.m39522a(r0, r1)
            if (r0 == 0) goto L3e
            r0 = r4
            java.lang.Throwable r0 = r0.getCause()
            r1 = r3
            java.lang.Throwable r1 = r1.getCause()
            boolean r0 = p372vh.C9367f.m39522a(r0, r1)
            if (r0 == 0) goto L3e
            goto L43
        L3e:
            r0 = 0
            r5 = r0
            goto L45
        L43:
            r0 = 1
            r5 = r0
        L45:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p067di.C4469d1.equals(java.lang.Object):boolean");
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        C9367f.m39524c(message);
        int hashCode = message.hashCode();
        int hashCode2 = this.f26882b.hashCode();
        Throwable cause = getCause();
        return (((hashCode * 31) + hashCode2) * 31) + (cause == null ? 0 : cause.hashCode());
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return super.toString() + "; job=" + this.f26882b;
    }
}
