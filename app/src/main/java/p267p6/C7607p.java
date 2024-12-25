package p267p6;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import p009a8.C0123u;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/p.class
 */
/* renamed from: p6.p */
/* loaded from: combined.jar:classes2.jar:p6/p.class */
public final class C7607p extends C7597l1 {

    /* renamed from: l */
    public static final InterfaceC7579g<C7607p> f36917l = new C7604o();

    /* renamed from: e */
    public final int f36918e;

    /* renamed from: f */
    public final String f36919f;

    /* renamed from: g */
    public final int f36920g;

    /* renamed from: h */
    public final C7629w0 f36921h;

    /* renamed from: i */
    public final int f36922i;

    /* renamed from: j */
    public final C0123u f36923j;

    /* renamed from: k */
    public final boolean f36924k;

    public C7607p(int i10, Throwable th2, int i11) {
        this(i10, th2, null, i11, null, -1, null, 4, false);
    }

    public C7607p(int i10, Throwable th2, String str, int i11, String str2, int i12, C7629w0 c7629w0, int i13, boolean z10) {
        this(m32878h(i10, str, str2, i12, c7629w0, i13), th2, i11, i10, str2, i12, c7629w0, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (r11 == 3) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7607p(java.lang.String r8, java.lang.Throwable r9, int r10, int r11, java.lang.String r12, int r13, p267p6.C7629w0 r14, int r15, p009a8.C0123u r16, long r17, boolean r19) {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r17
            r0.<init>(r1, r2, r3, r4)
            r0 = 0
            r21 = r0
            r0 = r19
            if (r0 == 0) goto L20
            r0 = r11
            r1 = 1
            if (r0 != r1) goto L1a
            goto L20
        L1a:
            r0 = 0
            r20 = r0
            goto L23
        L20:
            r0 = 1
            r20 = r0
        L23:
            r0 = r20
            p059d9.C4349a.m21878a(r0)
            r0 = r9
            if (r0 != 0) goto L36
            r0 = r21
            r20 = r0
            r0 = r11
            r1 = 3
            if (r0 != r1) goto L39
        L36:
            r0 = 1
            r20 = r0
        L39:
            r0 = r20
            p059d9.C4349a.m21878a(r0)
            r0 = r7
            r1 = r11
            r0.f36918e = r1
            r0 = r7
            r1 = r12
            r0.f36919f = r1
            r0 = r7
            r1 = r13
            r0.f36920g = r1
            r0 = r7
            r1 = r14
            r0.f36921h = r1
            r0 = r7
            r1 = r15
            r0.f36922i = r1
            r0 = r7
            r1 = r16
            r0.f36923j = r1
            r0 = r7
            r1 = r19
            r0.f36924k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p267p6.C7607p.<init>(java.lang.String, java.lang.Throwable, int, int, java.lang.String, int, p6.w0, int, a8.u, long, boolean):void");
    }

    /* renamed from: d */
    public static C7607p m32874d(Throwable th2, String str, int i10, C7629w0 c7629w0, int i11, boolean z10, int i12) {
        if (c7629w0 == null) {
            i11 = 4;
        }
        return new C7607p(1, th2, null, i12, str, i10, c7629w0, i11, z10);
    }

    /* renamed from: e */
    public static C7607p m32875e(IOException iOException, int i10) {
        return new C7607p(0, iOException, i10);
    }

    @Deprecated
    /* renamed from: f */
    public static C7607p m32876f(RuntimeException runtimeException) {
        return m32877g(runtimeException, 1000);
    }

    /* renamed from: g */
    public static C7607p m32877g(RuntimeException runtimeException, int i10) {
        return new C7607p(2, runtimeException, i10);
    }

    /* renamed from: h */
    public static String m32878h(int i10, String str, String str2, int i11, C7629w0 c7629w0, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + c7629w0 + ", format_supported=" + C7583h.m32759c(i12);
        }
        String str4 = str3;
        if (!TextUtils.isEmpty(str)) {
            str4 = str3 + ": " + str;
        }
        return str4;
    }

    /* renamed from: c */
    public C7607p m32879c(C0123u c0123u) {
        return new C7607p((String) C4401z0.m22391j(getMessage()), getCause(), this.f36854b, this.f36918e, this.f36919f, this.f36920g, this.f36921h, this.f36922i, c0123u, this.f36855c, this.f36924k);
    }
}
