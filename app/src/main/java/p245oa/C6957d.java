package p245oa;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:oa/d.class
 */
/* renamed from: oa.d */
/* loaded from: combined.jar:classes2.jar:oa/d.class */
public final class C6957d {

    /* renamed from: a */
    public static final int f35932a;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r0.charAt(0) <= 'Z') goto L15;
     */
    static {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = r0
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r0
            r0 = r4
            r1 = 31
            if (r0 < r1) goto L10
            goto L3b
        L10:
            r0 = r4
            r1 = 30
            if (r0 < r1) goto L39
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            r5 = r0
            r0 = r5
            int r0 = r0.length()
            r1 = 1
            if (r0 != r1) goto L39
            r0 = r5
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 83
            if (r0 < r1) goto L39
            r0 = r5
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 90
            if (r0 > r1) goto L39
            goto L3b
        L39:
            r0 = 0
            r3 = r0
        L3b:
            r0 = r3
            p245oa.C6957d.f35932a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p245oa.C6957d.m45169clinit():void");
    }

    /* renamed from: a */
    public static PendingIntent m31955a(Context context, int i10, Intent intent, int i11) {
        return PendingIntent.getActivity(context, i10, intent, i11);
    }
}
