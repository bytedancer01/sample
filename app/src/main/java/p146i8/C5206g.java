package p146i8;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p099fc.AbstractC4834t;
import p365v6.C9273n;
import p420y7.C9858i0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:i8/g.class
 */
/* renamed from: i8.g */
/* loaded from: combined.jar:classes2.jar:i8/g.class */
public final class C5206g extends AbstractC5207h {

    /* renamed from: d */
    public final int f29789d;

    /* renamed from: e */
    public final long f29790e;

    /* renamed from: f */
    public final boolean f29791f;

    /* renamed from: g */
    public final boolean f29792g;

    /* renamed from: h */
    public final long f29793h;

    /* renamed from: i */
    public final boolean f29794i;

    /* renamed from: j */
    public final int f29795j;

    /* renamed from: k */
    public final long f29796k;

    /* renamed from: l */
    public final int f29797l;

    /* renamed from: m */
    public final long f29798m;

    /* renamed from: n */
    public final long f29799n;

    /* renamed from: o */
    public final boolean f29800o;

    /* renamed from: p */
    public final boolean f29801p;

    /* renamed from: q */
    public final C9273n f29802q;

    /* renamed from: r */
    public final List<d> f29803r;

    /* renamed from: s */
    public final List<b> f29804s;

    /* renamed from: t */
    public final Map<Uri, c> f29805t;

    /* renamed from: u */
    public final long f29806u;

    /* renamed from: v */
    public final f f29807v;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:i8/g$b.class
     */
    /* renamed from: i8.g$b */
    /* loaded from: combined.jar:classes2.jar:i8/g$b.class */
    public static final class b extends e {

        /* renamed from: m */
        public final boolean f29808m;

        /* renamed from: n */
        public final boolean f29809n;

        public b(String str, d dVar, long j10, int i10, long j11, C9273n c9273n, String str2, String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, dVar, j10, i10, j11, c9273n, str2, str3, j12, j13, z10);
            this.f29808m = z11;
            this.f29809n = z12;
        }

        /* renamed from: b */
        public b m26033b(long j10, int i10) {
            return new b(this.f29815b, this.f29816c, this.f29817d, i10, j10, this.f29820g, this.f29821h, this.f29822i, this.f29823j, this.f29824k, this.f29825l, this.f29808m, this.f29809n);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:i8/g$c.class
     */
    /* renamed from: i8.g$c */
    /* loaded from: combined.jar:classes2.jar:i8/g$c.class */
    public static final class c {

        /* renamed from: a */
        public final Uri f29810a;

        /* renamed from: b */
        public final long f29811b;

        /* renamed from: c */
        public final int f29812c;

        public c(Uri uri, long j10, int i10) {
            this.f29810a = uri;
            this.f29811b = j10;
            this.f29812c = i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:i8/g$d.class
     */
    /* renamed from: i8.g$d */
    /* loaded from: combined.jar:classes2.jar:i8/g$d.class */
    public static final class d extends e {

        /* renamed from: m */
        public final String f29813m;

        /* renamed from: n */
        public final List<b> f29814n;

        public d(String str, long j10, long j11, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j10, j11, false, AbstractC4834t.m24539E());
        }

        public d(String str, d dVar, String str2, long j10, int i10, long j11, C9273n c9273n, String str3, String str4, long j12, long j13, boolean z10, List<b> list) {
            super(str, dVar, j10, i10, j11, c9273n, str3, str4, j12, j13, z10);
            this.f29813m = str2;
            this.f29814n = AbstractC4834t.m24538A(list);
        }

        /* renamed from: b */
        public d m26034b(long j10, int i10) {
            ArrayList arrayList = new ArrayList();
            long j11 = j10;
            for (int i11 = 0; i11 < this.f29814n.size(); i11++) {
                b bVar = this.f29814n.get(i11);
                arrayList.add(bVar.m26033b(j11, i10));
                j11 += bVar.f29817d;
            }
            return new d(this.f29815b, this.f29816c, this.f29813m, this.f29817d, i10, j10, this.f29820g, this.f29821h, this.f29822i, this.f29823j, this.f29824k, this.f29825l, arrayList);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:i8/g$e.class
     */
    /* renamed from: i8.g$e */
    /* loaded from: combined.jar:classes2.jar:i8/g$e.class */
    public static class e implements Comparable<Long> {

        /* renamed from: b */
        public final String f29815b;

        /* renamed from: c */
        public final d f29816c;

        /* renamed from: d */
        public final long f29817d;

        /* renamed from: e */
        public final int f29818e;

        /* renamed from: f */
        public final long f29819f;

        /* renamed from: g */
        public final C9273n f29820g;

        /* renamed from: h */
        public final String f29821h;

        /* renamed from: i */
        public final String f29822i;

        /* renamed from: j */
        public final long f29823j;

        /* renamed from: k */
        public final long f29824k;

        /* renamed from: l */
        public final boolean f29825l;

        public e(String str, d dVar, long j10, int i10, long j11, C9273n c9273n, String str2, String str3, long j12, long j13, boolean z10) {
            this.f29815b = str;
            this.f29816c = dVar;
            this.f29817d = j10;
            this.f29818e = i10;
            this.f29819f = j11;
            this.f29820g = c9273n;
            this.f29821h = str2;
            this.f29822i = str3;
            this.f29823j = j12;
            this.f29824k = j13;
            this.f29825l = z10;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l10) {
            return this.f29819f > l10.longValue() ? 1 : this.f29819f < l10.longValue() ? -1 : 0;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:i8/g$f.class
     */
    /* renamed from: i8.g$f */
    /* loaded from: combined.jar:classes2.jar:i8/g$f.class */
    public static final class f {

        /* renamed from: a */
        public final long f29826a;

        /* renamed from: b */
        public final boolean f29827b;

        /* renamed from: c */
        public final long f29828c;

        /* renamed from: d */
        public final long f29829d;

        /* renamed from: e */
        public final boolean f29830e;

        public f(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.f29826a = j10;
            this.f29827b = z10;
            this.f29828c = j11;
            this.f29829d = j12;
            this.f29830e = z11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C5206g(int r8, java.lang.String r9, java.util.List<java.lang.String> r10, long r11, boolean r13, long r14, boolean r16, int r17, long r18, int r20, long r21, long r23, boolean r25, boolean r26, boolean r27, p365v6.C9273n r28, java.util.List<p146i8.C5206g.d> r29, java.util.List<p146i8.C5206g.b> r30, p146i8.C5206g.f r31, java.util.Map<android.net.Uri, p146i8.C5206g.c> r32) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p146i8.C5206g.<init>(int, java.lang.String, java.util.List, long, boolean, long, boolean, int, long, int, long, long, boolean, boolean, boolean, v6.n, java.util.List, java.util.List, i8.g$f, java.util.Map):void");
    }

    @Override // p420y7.InterfaceC9848d0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5206g mo23296a(List<C9858i0> list) {
        return this;
    }

    /* renamed from: c */
    public C5206g m26029c(long j10, int i10) {
        return new C5206g(this.f29789d, this.f29831a, this.f29832b, this.f29790e, this.f29792g, j10, true, i10, this.f29796k, this.f29797l, this.f29798m, this.f29799n, this.f29833c, this.f29800o, this.f29801p, this.f29802q, this.f29803r, this.f29804s, this.f29807v, this.f29805t);
    }

    /* renamed from: d */
    public C5206g m26030d() {
        return this.f29800o ? this : new C5206g(this.f29789d, this.f29831a, this.f29832b, this.f29790e, this.f29792g, this.f29793h, this.f29794i, this.f29795j, this.f29796k, this.f29797l, this.f29798m, this.f29799n, this.f29833c, true, this.f29801p, this.f29802q, this.f29803r, this.f29804s, this.f29807v, this.f29805t);
    }

    /* renamed from: e */
    public long m26031e() {
        return this.f29793h + this.f29806u;
    }

    /* renamed from: f */
    public boolean m26032f(C5206g c5206g) {
        boolean z10 = true;
        if (c5206g != null) {
            long j10 = this.f29796k;
            long j11 = c5206g.f29796k;
            if (j10 > j11) {
                z10 = true;
            } else {
                if (j10 < j11) {
                    return false;
                }
                int size = this.f29803r.size() - c5206g.f29803r.size();
                if (size != 0) {
                    return size > 0;
                }
                int size2 = this.f29804s.size();
                int size3 = c5206g.f29804s.size();
                z10 = true;
                if (size2 <= size3) {
                    z10 = size2 == size3 && this.f29800o && !c5206g.f29800o;
                }
            }
        }
        return z10;
    }
}
