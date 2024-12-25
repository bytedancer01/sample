package p305ra;

import java.io.IOException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/r5.class
 */
/* renamed from: ra.r5 */
/* loaded from: combined.jar:classes2.jar:ra/r5.class */
public final class C8320r5 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C8320r5(java.lang.String r5, java.lang.Throwable r6) {
        /*
            r4 = this;
            r0 = r5
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.length()
            if (r0 == 0) goto L16
            java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
            r1 = r5
            java.lang.String r0 = r0.concat(r1)
            r5 = r0
            goto L20
        L16:
            java.lang.String r0 = new java.lang.String
            r1 = r0
            java.lang.String r2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
            r1.<init>(r2)
            r5 = r0
        L20:
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p305ra.C8320r5.<init>(java.lang.String, java.lang.Throwable):void");
    }

    public C8320r5(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
