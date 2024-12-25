package androidx.appcompat.widget;

import org.apache.http.impl.auth.NTLMEngineImpl;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/f1.class
 */
/* renamed from: androidx.appcompat.widget.f1 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/f1.class */
public class C0313f1 {

    /* renamed from: a */
    public int f2056a = 0;

    /* renamed from: b */
    public int f2057b = 0;

    /* renamed from: c */
    public int f2058c = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;

    /* renamed from: d */
    public int f2059d = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;

    /* renamed from: e */
    public int f2060e = 0;

    /* renamed from: f */
    public int f2061f = 0;

    /* renamed from: g */
    public boolean f2062g = false;

    /* renamed from: h */
    public boolean f2063h = false;

    /* renamed from: a */
    public int m1359a() {
        return this.f2062g ? this.f2056a : this.f2057b;
    }

    /* renamed from: b */
    public int m1360b() {
        return this.f2056a;
    }

    /* renamed from: c */
    public int m1361c() {
        return this.f2057b;
    }

    /* renamed from: d */
    public int m1362d() {
        return this.f2062g ? this.f2057b : this.f2056a;
    }

    /* renamed from: e */
    public void m1363e(int i10, int i11) {
        this.f2063h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f2060e = i10;
            this.f2056a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f2061f = i11;
            this.f2057b = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r5 != Integer.MIN_VALUE) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r5 != Integer.MIN_VALUE) goto L25;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1364f(boolean r4) {
        /*
            r3 = this;
            r0 = r4
            r1 = r3
            boolean r1 = r1.f2062g
            if (r0 != r1) goto L9
            return
        L9:
            r0 = r3
            r1 = r4
            r0.f2062g = r1
            r0 = r3
            boolean r0 = r0.f2063h
            if (r0 == 0) goto L65
            r0 = r4
            if (r0 == 0) goto L3f
            r0 = r3
            int r0 = r0.f2059d
            r5 = r0
            r0 = r5
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L27
            goto L2c
        L27:
            r0 = r3
            int r0 = r0.f2060e
            r5 = r0
        L2c:
            r0 = r3
            r1 = r5
            r0.f2056a = r1
            r0 = r3
            int r0 = r0.f2058c
            r5 = r0
            r0 = r5
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L6d
            goto L72
        L3f:
            r0 = r3
            int r0 = r0.f2058c
            r5 = r0
            r0 = r5
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L4d
            goto L52
        L4d:
            r0 = r3
            int r0 = r0.f2060e
            r5 = r0
        L52:
            r0 = r3
            r1 = r5
            r0.f2056a = r1
            r0 = r3
            int r0 = r0.f2059d
            r5 = r0
            r0 = r5
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L6d
            goto L72
        L65:
            r0 = r3
            r1 = r3
            int r1 = r1.f2060e
            r0.f2056a = r1
        L6d:
            r0 = r3
            int r0 = r0.f2061f
            r5 = r0
        L72:
            r0 = r3
            r1 = r5
            r0.f2057b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0313f1.m1364f(boolean):void");
    }

    /* renamed from: g */
    public void m1365g(int i10, int i11) {
        this.f2058c = i10;
        this.f2059d = i11;
        this.f2063h = true;
        if (this.f2062g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f2056a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f2057b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f2056a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f2057b = i11;
        }
    }
}
