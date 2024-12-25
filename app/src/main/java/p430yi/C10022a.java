package p430yi;

import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;
import p411xi.C9755b;
import p411xi.C9761e;
import p411xi.C9775s;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yi/a.class
 */
/* renamed from: yi.a */
/* loaded from: combined.jar:classes2.jar:yi/a.class */
public final class C10022a {

    /* renamed from: a */
    @NotNull
    public static final byte[] f45976a = C9755b.m41078a("0123456789abcdef");

    @NotNull
    /* renamed from: a */
    public static final byte[] m42166a() {
        return f45976a;
    }

    @NotNull
    /* renamed from: b */
    public static final String m42167b(@NotNull C9761e c9761e, long j10) {
        String m41135P0;
        long j11;
        C9367f.m39526e(c9761e, "$this$readUtf8Line");
        if (j10 > 0) {
            long j12 = j10 - 1;
            if (c9761e.m41119B0(j12) == ((byte) 13)) {
                m41135P0 = c9761e.m41135P0(j12);
                j11 = 2;
                c9761e.skip(j11);
                return m41135P0;
            }
        }
        m41135P0 = c9761e.m41135P0(j10);
        j11 = 1;
        c9761e.skip(j11);
        return m41135P0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00da, code lost:
    
        if (r7 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dd, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e2, code lost:
    
        return r11;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m42168c(@org.jetbrains.annotations.NotNull p411xi.C9761e r5, @org.jetbrains.annotations.NotNull p411xi.C9775s r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p430yi.C10022a.m42168c(xi.e, xi.s, boolean):int");
    }

    /* renamed from: d */
    public static /* synthetic */ int m42169d(C9761e c9761e, C9775s c9775s, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m42168c(c9761e, c9775s, z10);
    }
}
