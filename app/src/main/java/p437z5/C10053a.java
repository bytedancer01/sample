package p437z5;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:z5/a.class
 */
/* renamed from: z5.a */
/* loaded from: combined.jar:classes1.jar:z5/a.class */
public final class C10053a<T> extends AbstractC10055c<T> {

    /* renamed from: a */
    public final Integer f46127a;

    /* renamed from: b */
    public final T f46128b;

    /* renamed from: c */
    public final EnumC10056d f46129c;

    public C10053a(Integer num, T t10, EnumC10056d enumC10056d) {
        this.f46127a = num;
        if (t10 == null) {
            throw new NullPointerException("Null payload");
        }
        this.f46128b = t10;
        if (enumC10056d == null) {
            throw new NullPointerException("Null priority");
        }
        this.f46129c = enumC10056d;
    }

    @Override // p437z5.AbstractC10055c
    /* renamed from: a */
    public Integer mo42265a() {
        return this.f46127a;
    }

    @Override // p437z5.AbstractC10055c
    /* renamed from: b */
    public T mo42266b() {
        return this.f46128b;
    }

    @Override // p437z5.AbstractC10055c
    /* renamed from: c */
    public EnumC10056d mo42267c() {
        return this.f46129c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r3.f46129c.equals(r0.mo42267c()) != false) goto L21;
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
            boolean r0 = r0 instanceof p437z5.AbstractC10055c
            if (r0 == 0) goto L56
            r0 = r4
            z5.c r0 = (p437z5.AbstractC10055c) r0
            r6 = r0
            r0 = r3
            java.lang.Integer r0 = r0.f46127a
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L28
            r0 = r6
            java.lang.Integer r0 = r0.mo42265a()
            if (r0 != 0) goto L52
            goto L33
        L28:
            r0 = r4
            r1 = r6
            java.lang.Integer r1 = r1.mo42265a()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L52
        L33:
            r0 = r3
            T r0 = r0.f46128b
            r1 = r6
            java.lang.Object r1 = r1.mo42266b()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L52
            r0 = r3
            z5.d r0 = r0.f46129c
            r1 = r6
            z5.d r1 = r1.mo42267c()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L52
            goto L54
        L52:
            r0 = 0
            r5 = r0
        L54:
            r0 = r5
            return r0
        L56:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p437z5.C10053a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Integer num = this.f46127a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f46128b.hashCode()) * 1000003) ^ this.f46129c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f46127a + ", payload=" + this.f46128b + ", priority=" + this.f46129c + "}";
    }
}
