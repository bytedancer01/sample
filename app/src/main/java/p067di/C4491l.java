package p067di;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/l.class
 */
/* renamed from: di.l */
/* loaded from: combined.jar:classes2.jar:di/l.class */
public final class C4491l extends C4521v {

    /* renamed from: c */
    public static final AtomicIntegerFieldUpdater f26911c = AtomicIntegerFieldUpdater.newUpdater(C4491l.class, "_resumed");

    @NotNull
    private volatile int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4491l(@org.jetbrains.annotations.NotNull p233nh.InterfaceC6789d<?> r5, @org.jetbrains.annotations.Nullable java.lang.Throwable r6, boolean r7) {
        /*
            r4 = this;
            r0 = r6
            r8 = r0
            r0 = r6
            if (r0 != 0) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            java.lang.String r1 = "Continuation "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            java.lang.String r1 = " was cancelled normally"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r8 = r0
        L30:
            r0 = r4
            r1 = r8
            r2 = r7
            r0.<init>(r1, r2)
            r0 = r4
            r1 = 0
            r0._resumed = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p067di.C4491l.<init>(nh.d, java.lang.Throwable, boolean):void");
    }

    /* renamed from: c */
    public final boolean m22781c() {
        return f26911c.compareAndSet(this, 0, 1);
    }
}
