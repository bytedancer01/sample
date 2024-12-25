package me;

import p444zd.C10194b;
import td.C8695j;
import td.C8701p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:me/c.class
 */
/* renamed from: me.c */
/* loaded from: combined.jar:classes2.jar:me/c.class */
public final class C6575c {

    /* renamed from: a */
    public final C10194b f34406a;

    /* renamed from: b */
    public final C8701p f34407b;

    /* renamed from: c */
    public final C8701p f34408c;

    /* renamed from: d */
    public final C8701p f34409d;

    /* renamed from: e */
    public final C8701p f34410e;

    /* renamed from: f */
    public final int f34411f;

    /* renamed from: g */
    public final int f34412g;

    /* renamed from: h */
    public final int f34413h;

    /* renamed from: i */
    public final int f34414i;

    public C6575c(C6575c c6575c) {
        this.f34406a = c6575c.f34406a;
        this.f34407b = c6575c.f34407b;
        this.f34408c = c6575c.f34408c;
        this.f34409d = c6575c.f34409d;
        this.f34410e = c6575c.f34410e;
        this.f34411f = c6575c.f34411f;
        this.f34412g = c6575c.f34412g;
        this.f34413h = c6575c.f34413h;
        this.f34414i = c6575c.f34414i;
    }

    public C6575c(C10194b c10194b, C8701p c8701p, C8701p c8701p2, C8701p c8701p3, C8701p c8701p4) {
        C8701p c8701p5;
        C8701p c8701p6;
        boolean z10 = false;
        boolean z11 = c8701p == null || c8701p2 == null;
        z10 = (c8701p3 == null || c8701p4 == null) ? true : z10;
        if (z11 && z10) {
            throw C8695j.m37209a();
        }
        if (z11) {
            c8701p5 = new C8701p(0.0f, c8701p3.m37223d());
            c8701p6 = new C8701p(0.0f, c8701p4.m37223d());
        } else {
            c8701p5 = c8701p;
            c8701p6 = c8701p2;
            if (z10) {
                c8701p3 = new C8701p(c10194b.m42678k() - 1, c8701p.m37223d());
                c8701p4 = new C8701p(c10194b.m42678k() - 1, c8701p2.m37223d());
                c8701p6 = c8701p2;
                c8701p5 = c8701p;
            }
        }
        this.f34406a = c10194b;
        this.f34407b = c8701p5;
        this.f34408c = c8701p6;
        this.f34409d = c8701p3;
        this.f34410e = c8701p4;
        this.f34411f = (int) Math.min(c8701p5.m37222c(), c8701p6.m37222c());
        this.f34412g = (int) Math.max(c8701p3.m37222c(), c8701p4.m37222c());
        this.f34413h = (int) Math.min(c8701p5.m37223d(), c8701p3.m37223d());
        this.f34414i = (int) Math.max(c8701p6.m37223d(), c8701p4.m37223d());
    }

    /* renamed from: j */
    public static C6575c m30347j(C6575c c6575c, C6575c c6575c2) {
        return c6575c == null ? c6575c2 : c6575c2 == null ? c6575c : new C6575c(c6575c.f34406a, c6575c.f34407b, c6575c.f34408c, c6575c2.f34409d, c6575c2.f34410e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public me.C6575c m30348a(int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.C6575c.m30348a(int, int, boolean):me.c");
    }

    /* renamed from: b */
    public C8701p m30349b() {
        return this.f34408c;
    }

    /* renamed from: c */
    public C8701p m30350c() {
        return this.f34410e;
    }

    /* renamed from: d */
    public int m30351d() {
        return this.f34412g;
    }

    /* renamed from: e */
    public int m30352e() {
        return this.f34414i;
    }

    /* renamed from: f */
    public int m30353f() {
        return this.f34411f;
    }

    /* renamed from: g */
    public int m30354g() {
        return this.f34413h;
    }

    /* renamed from: h */
    public C8701p m30355h() {
        return this.f34407b;
    }

    /* renamed from: i */
    public C8701p m30356i() {
        return this.f34409d;
    }
}
