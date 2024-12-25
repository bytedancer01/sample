package ua;

import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/p.class
 */
/* renamed from: ua.p */
/* loaded from: combined.jar:classes2.jar:ua/p.class */
public final class C9020p {

    /* renamed from: a */
    public final String f41521a;

    /* renamed from: b */
    public final String f41522b;

    /* renamed from: c */
    public final long f41523c;

    /* renamed from: d */
    public final long f41524d;

    /* renamed from: e */
    public final long f41525e;

    /* renamed from: f */
    public final long f41526f;

    /* renamed from: g */
    public final long f41527g;

    /* renamed from: h */
    public final Long f41528h;

    /* renamed from: i */
    public final Long f41529i;

    /* renamed from: j */
    public final Long f41530j;

    /* renamed from: k */
    public final Boolean f41531k;

    public C9020p(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        C9935o.m41846f(str);
        C9935o.m41846f(str2);
        C9935o.m41841a(j10 >= 0);
        C9935o.m41841a(j11 >= 0);
        C9935o.m41841a(j12 >= 0);
        C9935o.m41841a(j14 >= 0);
        this.f41521a = str;
        this.f41522b = str2;
        this.f41523c = j10;
        this.f41524d = j11;
        this.f41525e = j12;
        this.f41526f = j13;
        this.f41527g = j14;
        this.f41528h = l10;
        this.f41529i = l11;
        this.f41530j = l12;
        this.f41531k = bool;
    }

    /* renamed from: a */
    public final C9020p m38176a(long j10) {
        return new C9020p(this.f41521a, this.f41522b, this.f41523c, this.f41524d, this.f41525e, j10, this.f41527g, this.f41528h, this.f41529i, this.f41530j, this.f41531k);
    }

    /* renamed from: b */
    public final C9020p m38177b(long j10, long j11) {
        return new C9020p(this.f41521a, this.f41522b, this.f41523c, this.f41524d, this.f41525e, this.f41526f, j10, Long.valueOf(j11), this.f41529i, this.f41530j, this.f41531k);
    }

    /* renamed from: c */
    public final C9020p m38178c(Long l10, Long l11, Boolean bool) {
        if (bool != null && !bool.booleanValue()) {
            bool = null;
        }
        return new C9020p(this.f41521a, this.f41522b, this.f41523c, this.f41524d, this.f41525e, this.f41526f, this.f41527g, this.f41528h, l10, l11, bool);
    }
}
