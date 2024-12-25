package me;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:me/d.class
 */
/* renamed from: me.d */
/* loaded from: combined.jar:classes2.jar:me/d.class */
public final class C6576d {

    /* renamed from: a */
    public final int f34415a;

    /* renamed from: b */
    public final int f34416b;

    /* renamed from: c */
    public final int f34417c;

    /* renamed from: d */
    public final int f34418d;

    /* renamed from: e */
    public int f34419e = -1;

    public C6576d(int i10, int i11, int i12, int i13) {
        this.f34415a = i10;
        this.f34416b = i11;
        this.f34417c = i12;
        this.f34418d = i13;
    }

    /* renamed from: a */
    public int m30357a() {
        return this.f34417c;
    }

    /* renamed from: b */
    public int m30358b() {
        return this.f34416b;
    }

    /* renamed from: c */
    public int m30359c() {
        return this.f34419e;
    }

    /* renamed from: d */
    public int m30360d() {
        return this.f34415a;
    }

    /* renamed from: e */
    public int m30361e() {
        return this.f34418d;
    }

    /* renamed from: f */
    public int m30362f() {
        return this.f34416b - this.f34415a;
    }

    /* renamed from: g */
    public boolean m30363g() {
        return m30364h(this.f34419e);
    }

    /* renamed from: h */
    public boolean m30364h(int i10) {
        return i10 != -1 && this.f34417c == (i10 % 3) * 3;
    }

    /* renamed from: i */
    public void m30365i(int i10) {
        this.f34419e = i10;
    }

    /* renamed from: j */
    public void m30366j() {
        this.f34419e = ((this.f34418d / 30) * 3) + (this.f34417c / 3);
    }

    public String toString() {
        return this.f34419e + "|" + this.f34418d;
    }
}
