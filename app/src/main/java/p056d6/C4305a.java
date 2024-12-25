package p056d6;

import java.util.Arrays;
import p036c6.AbstractC0998i;
import p056d6.AbstractC4310f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:d6/a.class
 */
/* renamed from: d6.a */
/* loaded from: combined.jar:classes1.jar:d6/a.class */
public final class C4305a extends AbstractC4310f {

    /* renamed from: a */
    public final Iterable<AbstractC0998i> f26438a;

    /* renamed from: b */
    public final byte[] f26439b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d6/a$b.class
     */
    /* renamed from: d6.a$b */
    /* loaded from: combined.jar:classes1.jar:d6/a$b.class */
    public static final class b extends AbstractC4310f.a {

        /* renamed from: a */
        public Iterable<AbstractC0998i> f26440a;

        /* renamed from: b */
        public byte[] f26441b;

        @Override // p056d6.AbstractC4310f.a
        /* renamed from: a */
        public AbstractC4310f mo21770a() {
            String str = "";
            if (this.f26440a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C4305a(this.f26440a, this.f26441b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p056d6.AbstractC4310f.a
        /* renamed from: b */
        public AbstractC4310f.a mo21771b(Iterable<AbstractC0998i> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f26440a = iterable;
            return this;
        }

        @Override // p056d6.AbstractC4310f.a
        /* renamed from: c */
        public AbstractC4310f.a mo21772c(byte[] bArr) {
            this.f26441b = bArr;
            return this;
        }
    }

    public C4305a(Iterable<AbstractC0998i> iterable, byte[] bArr) {
        this.f26438a = iterable;
        this.f26439b = bArr;
    }

    @Override // p056d6.AbstractC4310f
    /* renamed from: b */
    public Iterable<AbstractC0998i> mo21768b() {
        return this.f26438a;
    }

    @Override // p056d6.AbstractC4310f
    /* renamed from: c */
    public byte[] mo21769c() {
        return this.f26439b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (java.util.Arrays.equals(r3.f26439b, r0 instanceof p056d6.C4305a ? ((p056d6.C4305a) r0).f26439b : r0.mo21769c()) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = r3
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = r4
            boolean r0 = r0 instanceof p056d6.AbstractC4310f
            if (r0 == 0) goto L4e
            r0 = r4
            d6.f r0 = (p056d6.AbstractC4310f) r0
            r4 = r0
            r0 = r3
            java.lang.Iterable<c6.i> r0 = r0.f26438a
            r1 = r4
            java.lang.Iterable r1 = r1.mo21768b()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4a
            r0 = r3
            byte[] r0 = r0.f26439b
            r6 = r0
            r0 = r4
            boolean r0 = r0 instanceof p056d6.C4305a
            if (r0 == 0) goto L3a
            r0 = r4
            d6.a r0 = (p056d6.C4305a) r0
            byte[] r0 = r0.f26439b
            r4 = r0
            goto L3f
        L3a:
            r0 = r4
            byte[] r0 = r0.mo21769c()
            r4 = r0
        L3f:
            r0 = r6
            r1 = r4
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L4a
            goto L4c
        L4a:
            r0 = 0
            r5 = r0
        L4c:
            r0 = r5
            return r0
        L4e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p056d6.C4305a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return ((this.f26438a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f26439b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f26438a + ", extras=" + Arrays.toString(this.f26439b) + "}";
    }
}
