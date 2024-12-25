package se;

import se.InterfaceC8559a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:se/c.class
 */
/* renamed from: se.c */
/* loaded from: combined.jar:classes2.jar:se/c.class */
public class C8561c<S extends InterfaceC8559a<C>, C> {

    /* renamed from: a */
    public boolean f39994a;

    /* renamed from: b */
    public S f39995b;

    /* renamed from: c */
    public C f39996c;

    /* renamed from: d */
    public int f39997d;

    /* renamed from: e */
    public int f39998e;

    public C8561c(C c10, int i10, int i11) {
        this.f39996c = c10;
        this.f39997d = i10;
        this.f39994a = false;
        this.f39998e = i11;
    }

    public C8561c(S s10, int i10) {
        this.f39994a = true;
        this.f39995b = s10;
        this.f39997d = i10;
        this.f39998e = -1;
    }

    /* renamed from: a */
    public C m36826a() {
        return this.f39996c;
    }

    /* renamed from: b */
    public int m36827b() {
        int i10 = this.f39998e;
        if (i10 != -1) {
            return i10;
        }
        throw new IllegalAccessError("This is not child");
    }

    /* renamed from: c */
    public S m36828c() {
        return this.f39995b;
    }

    /* renamed from: d */
    public int m36829d() {
        return this.f39997d;
    }

    /* renamed from: e */
    public boolean m36830e() {
        return this.f39994a;
    }
}
