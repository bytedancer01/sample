package p383w9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p368v9.C9315a;
import p368v9.InterfaceC9320f;
import za.C10146j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/w.class
 */
/* renamed from: w9.w */
/* loaded from: combined.jar:classes2.jar:w9/w.class */
public final class C9535w {

    /* renamed from: a */
    public final Map<BasePendingResult<?>, Boolean> f43472a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    public final Map<C10146j<?>, Boolean> f43473b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: c */
    public final void m40065c(BasePendingResult<? extends InterfaceC9320f> basePendingResult, boolean z10) {
        this.f43472a.put(basePendingResult, Boolean.valueOf(z10));
        basePendingResult.mo13139b(new C9527u(this, basePendingResult));
    }

    /* renamed from: d */
    public final <TResult> void m40066d(C10146j<TResult> c10146j, boolean z10) {
        this.f43473b.put(c10146j, Boolean.valueOf(z10));
        c10146j.m42578a().mo42554c(new C9531v(this, c10146j));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m40067e(int r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "The connection to Google Play services was lost"
            r1.<init>(r2)
            r11 = r0
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L1d
            java.lang.String r0 = " due to service disconnection."
            r10 = r0
        L13:
            r0 = r11
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L28
        L1d:
            r0 = r8
            r1 = 3
            if (r0 != r1) goto L28
            java.lang.String r0 = " due to dead object exception."
            r10 = r0
            goto L13
        L28:
            r0 = r9
            if (r0 == 0) goto L3b
            r0 = r11
            java.lang.String r1 = " Last reason for disconnect: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r11
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
        L3b:
            r0 = r7
            r1 = 1
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r3 = r2
            r4 = 20
            r5 = r11
            java.lang.String r5 = r5.toString()
            r3.<init>(r4, r5)
            r0.m40070h(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p383w9.C9535w.m40067e(int, java.lang.String):void");
    }

    /* renamed from: f */
    public final void m40068f() {
        m40070h(false, C9457f.f43236s);
    }

    /* renamed from: g */
    public final boolean m40069g() {
        return (this.f43472a.isEmpty() && this.f43473b.isEmpty()) ? false : true;
    }

    /* renamed from: h */
    public final void m40070h(boolean z10, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f43472a) {
            hashMap = new HashMap(this.f43472a);
        }
        synchronized (this.f43473b) {
            hashMap2 = new HashMap(this.f43473b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m13143f(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C10146j) entry2.getKey()).m42581d(new C9315a(status));
            }
        }
    }
}
