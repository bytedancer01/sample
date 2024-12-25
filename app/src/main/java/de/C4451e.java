package de;

import td.C8691f;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:de/e.class
 */
/* renamed from: de.e */
/* loaded from: combined.jar:classes2.jar:de/e.class */
public final class C4451e {

    /* renamed from: h */
    public static final C4451e[] f26828h = m22588a();

    /* renamed from: a */
    public final int f26829a;

    /* renamed from: b */
    public final int f26830b;

    /* renamed from: c */
    public final int f26831c;

    /* renamed from: d */
    public final int f26832d;

    /* renamed from: e */
    public final int f26833e;

    /* renamed from: f */
    public final c f26834f;

    /* renamed from: g */
    public final int f26835g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/e$b.class
     */
    /* renamed from: de.e$b */
    /* loaded from: combined.jar:classes2.jar:de/e$b.class */
    public static final class b {

        /* renamed from: a */
        public final int f26836a;

        /* renamed from: b */
        public final int f26837b;

        public b(int i10, int i11) {
            this.f26836a = i10;
            this.f26837b = i11;
        }

        /* renamed from: a */
        public int m22597a() {
            return this.f26836a;
        }

        /* renamed from: b */
        public int m22598b() {
            return this.f26837b;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/e$c.class
     */
    /* renamed from: de.e$c */
    /* loaded from: combined.jar:classes2.jar:de/e$c.class */
    public static final class c {

        /* renamed from: a */
        public final int f26838a;

        /* renamed from: b */
        public final b[] f26839b;

        public c(int i10, b bVar) {
            this.f26838a = i10;
            this.f26839b = new b[]{bVar};
        }

        public c(int i10, b bVar, b bVar2) {
            this.f26838a = i10;
            this.f26839b = new b[]{bVar, bVar2};
        }

        /* renamed from: a */
        public b[] m22599a() {
            return this.f26839b;
        }

        /* renamed from: b */
        public int m22600b() {
            return this.f26838a;
        }
    }

    public C4451e(int i10, int i11, int i12, int i13, int i14, c cVar) {
        this.f26829a = i10;
        this.f26830b = i11;
        this.f26831c = i12;
        this.f26832d = i13;
        this.f26833e = i14;
        this.f26834f = cVar;
        int m22600b = cVar.m22600b();
        int i15 = 0;
        for (b bVar : cVar.m22599a()) {
            i15 += bVar.m22597a() * (bVar.m22598b() + m22600b);
        }
        this.f26835g = i15;
    }

    /* renamed from: a */
    public static C4451e[] m22588a() {
        return new C4451e[]{new C4451e(1, 10, 10, 8, 8, new c(5, new b(1, 3))), new C4451e(2, 12, 12, 10, 10, new c(7, new b(1, 5))), new C4451e(3, 14, 14, 12, 12, new c(10, new b(1, 8))), new C4451e(4, 16, 16, 14, 14, new c(12, new b(1, 12))), new C4451e(5, 18, 18, 16, 16, new c(14, new b(1, 18))), new C4451e(6, 20, 20, 18, 18, new c(18, new b(1, 22))), new C4451e(7, 22, 22, 20, 20, new c(20, new b(1, 30))), new C4451e(8, 24, 24, 22, 22, new c(24, new b(1, 36))), new C4451e(9, 26, 26, 24, 24, new c(28, new b(1, 44))), new C4451e(10, 32, 32, 14, 14, new c(36, new b(1, 62))), new C4451e(11, 36, 36, 16, 16, new c(42, new b(1, 86))), new C4451e(12, 40, 40, 18, 18, new c(48, new b(1, 114))), new C4451e(13, 44, 44, 20, 20, new c(56, new b(1, IjkMediaMeta.FF_PROFILE_H264_HIGH_444))), new C4451e(14, 48, 48, 22, 22, new c(68, new b(1, 174))), new C4451e(15, 52, 52, 24, 24, new c(42, new b(2, 102))), new C4451e(16, 64, 64, 14, 14, new c(56, new b(2, 140))), new C4451e(17, 72, 72, 16, 16, new c(36, new b(4, 92))), new C4451e(18, 80, 80, 18, 18, new c(48, new b(4, 114))), new C4451e(19, 88, 88, 20, 20, new c(56, new b(4, IjkMediaMeta.FF_PROFILE_H264_HIGH_444))), new C4451e(20, 96, 96, 22, 22, new c(68, new b(4, 174))), new C4451e(21, 104, 104, 24, 24, new c(56, new b(6, 136))), new C4451e(22, 120, 120, 18, 18, new c(68, new b(6, 175))), new C4451e(23, 132, 132, 20, 20, new c(62, new b(8, 163))), new C4451e(24, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, 22, 22, new c(62, new b(8, 156), new b(2, 155))), new C4451e(25, 8, 18, 6, 16, new c(7, new b(1, 5))), new C4451e(26, 8, 32, 6, 14, new c(11, new b(1, 10))), new C4451e(27, 12, 26, 10, 24, new c(14, new b(1, 16))), new C4451e(28, 12, 36, 10, 16, new c(18, new b(1, 22))), new C4451e(29, 16, 36, 14, 16, new c(24, new b(1, 32))), new C4451e(30, 16, 48, 14, 22, new c(28, new b(1, 49)))};
    }

    /* renamed from: h */
    public static C4451e m22589h(int i10, int i11) {
        if ((i10 & 1) != 0 || (i11 & 1) != 0) {
            throw C8691f.m37197a();
        }
        for (C4451e c4451e : f26828h) {
            if (c4451e.f26830b == i10 && c4451e.f26831c == i11) {
                return c4451e;
            }
        }
        throw C8691f.m37197a();
    }

    /* renamed from: b */
    public int m22590b() {
        return this.f26833e;
    }

    /* renamed from: c */
    public int m22591c() {
        return this.f26832d;
    }

    /* renamed from: d */
    public c m22592d() {
        return this.f26834f;
    }

    /* renamed from: e */
    public int m22593e() {
        return this.f26831c;
    }

    /* renamed from: f */
    public int m22594f() {
        return this.f26830b;
    }

    /* renamed from: g */
    public int m22595g() {
        return this.f26835g;
    }

    /* renamed from: i */
    public int m22596i() {
        return this.f26829a;
    }

    public String toString() {
        return String.valueOf(this.f26829a);
    }
}
