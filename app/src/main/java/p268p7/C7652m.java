package p268p7;

import android.media.MediaCodec;
import p332t6.C8637e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p7/m.class
 */
/* renamed from: p7.m */
/* loaded from: combined.jar:classes2.jar:p7/m.class */
public class C7652m extends C8637e {

    /* renamed from: b */
    public final C7653n f37199b;

    /* renamed from: c */
    public final String f37200c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7652m(java.lang.Throwable r5, p268p7.C7653n r6) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r9
            java.lang.String r1 = "Decoder failed: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 0
            r8 = r0
            r0 = r6
            if (r0 != 0) goto L1d
            r0 = 0
            r7 = r0
            goto L22
        L1d:
            r0 = r6
            java.lang.String r0 = r0.f37201a
            r7 = r0
        L22:
            r0 = r9
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r9
            java.lang.String r1 = r1.toString()
            r2 = r5
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r6
            r0.f37199b = r1
            r0 = r8
            r6 = r0
            int r0 = p059d9.C4401z0.f26679a
            r1 = 21
            if (r0 < r1) goto L48
            r0 = r5
            java.lang.String r0 = m33311a(r0)
            r6 = r0
        L48:
            r0 = r4
            r1 = r6
            r0.f37200c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p268p7.C7652m.<init>(java.lang.Throwable, p7.n):void");
    }

    /* renamed from: a */
    public static String m33311a(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        return null;
    }
}
