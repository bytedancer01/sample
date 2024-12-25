package p312ri;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9365d;
import p372vh.C9367f;
import p411xi.C9764h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ri/c.class
 */
/* renamed from: ri.c */
/* loaded from: combined.jar:classes2.jar:ri/c.class */
public final class C8477c {

    /* renamed from: d */
    @NotNull
    public static final C9764h f39579d;

    /* renamed from: e */
    @NotNull
    public static final C9764h f39580e;

    /* renamed from: f */
    @NotNull
    public static final C9764h f39581f;

    /* renamed from: g */
    @NotNull
    public static final C9764h f39582g;

    /* renamed from: h */
    @NotNull
    public static final C9764h f39583h;

    /* renamed from: i */
    @NotNull
    public static final C9764h f39584i;

    /* renamed from: j */
    public static final a f39585j = new a(null);

    /* renamed from: a */
    public final int f39586a;

    /* renamed from: b */
    @NotNull
    public final C9764h f39587b;

    /* renamed from: c */
    @NotNull
    public final C9764h f39588c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/c$a.class
     */
    /* renamed from: ri.c$a */
    /* loaded from: combined.jar:classes2.jar:ri/c$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }
    }

    static {
        C9764h.a aVar = C9764h.f44531f;
        f39579d = aVar.m41212d(":");
        f39580e = aVar.m41212d(":status");
        f39581f = aVar.m41212d(":method");
        f39582g = aVar.m41212d(":path");
        f39583h = aVar.m41212d(":scheme");
        f39584i = aVar.m41212d(":authority");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C8477c(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull java.lang.String r7) {
        /*
            r5 = this;
            r0 = r6
            java.lang.String r1 = "name"
            p372vh.C9367f.m39526e(r0, r1)
            r0 = r7
            java.lang.String r1 = "value"
            p372vh.C9367f.m39526e(r0, r1)
            xi.h$a r0 = p411xi.C9764h.f44531f
            r8 = r0
            r0 = r5
            r1 = r8
            r2 = r6
            xi.h r1 = r1.m41212d(r2)
            r2 = r8
            r3 = r7
            xi.h r2 = r2.m41212d(r3)
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p312ri.C8477c.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8477c(@NotNull C9764h c9764h, @NotNull String str) {
        this(c9764h, C9764h.f44531f.m41212d(str));
        C9367f.m39526e(c9764h, "name");
        C9367f.m39526e(str, "value");
    }

    public C8477c(@NotNull C9764h c9764h, @NotNull C9764h c9764h2) {
        C9367f.m39526e(c9764h, "name");
        C9367f.m39526e(c9764h2, "value");
        this.f39587b = c9764h;
        this.f39588c = c9764h2;
        this.f39586a = c9764h.size() + 32 + c9764h2.size();
    }

    @NotNull
    /* renamed from: a */
    public final C9764h m36399a() {
        return this.f39587b;
    }

    @NotNull
    /* renamed from: b */
    public final C9764h m36400b() {
        return this.f39588c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8477c)) {
            return false;
        }
        C8477c c8477c = (C8477c) obj;
        return C9367f.m39522a(this.f39587b, c8477c.f39587b) && C9367f.m39522a(this.f39588c, c8477c.f39588c);
    }

    public int hashCode() {
        C9764h c9764h = this.f39587b;
        int i10 = 0;
        int hashCode = c9764h != null ? c9764h.hashCode() : 0;
        C9764h c9764h2 = this.f39588c;
        if (c9764h2 != null) {
            i10 = c9764h2.hashCode();
        }
        return (hashCode * 31) + i10;
    }

    @NotNull
    public String toString() {
        return this.f39587b.m41188D() + ": " + this.f39588c.m41188D();
    }
}
