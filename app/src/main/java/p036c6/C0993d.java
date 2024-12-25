package p036c6;

import java.util.Arrays;
import p036c6.AbstractC1004o;
import p437z5.EnumC10056d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c6/d.class
 */
/* renamed from: c6.d */
/* loaded from: combined.jar:classes1.jar:c6/d.class */
public final class C0993d extends AbstractC1004o {

    /* renamed from: a */
    public final String f6792a;

    /* renamed from: b */
    public final byte[] f6793b;

    /* renamed from: c */
    public final EnumC10056d f6794c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c6/d$b.class
     */
    /* renamed from: c6.d$b */
    /* loaded from: combined.jar:classes1.jar:c6/d$b.class */
    public static final class b extends AbstractC1004o.a {

        /* renamed from: a */
        public String f6795a;

        /* renamed from: b */
        public byte[] f6796b;

        /* renamed from: c */
        public EnumC10056d f6797c;

        @Override // p036c6.AbstractC1004o.a
        /* renamed from: a */
        public AbstractC1004o mo5930a() {
            String str = "";
            if (this.f6795a == null) {
                str = " backendName";
            }
            String str2 = str;
            if (this.f6797c == null) {
                str2 = str + " priority";
            }
            if (str2.isEmpty()) {
                return new C0993d(this.f6795a, this.f6796b, this.f6797c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // p036c6.AbstractC1004o.a
        /* renamed from: b */
        public AbstractC1004o.a mo5931b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f6795a = str;
            return this;
        }

        @Override // p036c6.AbstractC1004o.a
        /* renamed from: c */
        public AbstractC1004o.a mo5932c(byte[] bArr) {
            this.f6796b = bArr;
            return this;
        }

        @Override // p036c6.AbstractC1004o.a
        /* renamed from: d */
        public AbstractC1004o.a mo5933d(EnumC10056d enumC10056d) {
            if (enumC10056d == null) {
                throw new NullPointerException("Null priority");
            }
            this.f6797c = enumC10056d;
            return this;
        }
    }

    public C0993d(String str, byte[] bArr, EnumC10056d enumC10056d) {
        this.f6792a = str;
        this.f6793b = bArr;
        this.f6794c = enumC10056d;
    }

    @Override // p036c6.AbstractC1004o
    /* renamed from: b */
    public String mo5927b() {
        return this.f6792a;
    }

    @Override // p036c6.AbstractC1004o
    /* renamed from: c */
    public byte[] mo5928c() {
        return this.f6793b;
    }

    @Override // p036c6.AbstractC1004o
    /* renamed from: d */
    public EnumC10056d mo5929d() {
        return this.f6794c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r3.f6794c.equals(r0.mo5929d()) != false) goto L20;
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
            boolean r0 = r0 instanceof p036c6.AbstractC1004o
            if (r0 == 0) goto L5e
            r0 = r4
            c6.o r0 = (p036c6.AbstractC1004o) r0
            r6 = r0
            r0 = r3
            java.lang.String r0 = r0.f6792a
            r1 = r6
            java.lang.String r1 = r1.mo5927b()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a
            r0 = r3
            byte[] r0 = r0.f6793b
            r7 = r0
            r0 = r6
            boolean r0 = r0 instanceof p036c6.C0993d
            if (r0 == 0) goto L3b
            r0 = r6
            c6.d r0 = (p036c6.C0993d) r0
            byte[] r0 = r0.f6793b
            r4 = r0
            goto L40
        L3b:
            r0 = r6
            byte[] r0 = r0.mo5928c()
            r4 = r0
        L40:
            r0 = r7
            r1 = r4
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L5a
            r0 = r3
            z5.d r0 = r0.f6794c
            r1 = r6
            z5.d r1 = r1.mo5929d()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a
            goto L5c
        L5a:
            r0 = 0
            r5 = r0
        L5c:
            r0 = r5
            return r0
        L5e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p036c6.C0993d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return ((((this.f6792a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f6793b)) * 1000003) ^ this.f6794c.hashCode();
    }
}
