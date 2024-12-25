package p111g5;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;
import p074e5.AbstractC4625b;
import p074e5.C4641r;
import p180k5.AbstractC5481f;
import p180k5.InterfaceC5485j;
import p196l5.InterfaceC5682b;
import p300r5.C7963e;
import p397x4.C9651a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g5/a.class
 */
/* renamed from: g5.a */
/* loaded from: combined.jar:classes1.jar:g5/a.class */
public final class C4947a implements Serializable {

    /* renamed from: k */
    public static final TimeZone f28699k = TimeZone.getTimeZone("UTC");

    /* renamed from: b */
    public final AbstractC5481f f28700b;

    /* renamed from: c */
    public final AbstractC4625b f28701c;

    /* renamed from: d */
    public final InterfaceC5485j<?> f28702d;

    /* renamed from: e */
    public final C7963e f28703e;

    /* renamed from: f */
    public final InterfaceC5682b<?> f28704f;

    /* renamed from: g */
    public final DateFormat f28705g;

    /* renamed from: h */
    public final Locale f28706h;

    /* renamed from: i */
    public final TimeZone f28707i;

    /* renamed from: j */
    public final C9651a f28708j;

    public C4947a(AbstractC5481f abstractC5481f, AbstractC4625b abstractC4625b, InterfaceC5485j<?> interfaceC5485j, C4641r c4641r, C7963e c7963e, InterfaceC5682b<?> interfaceC5682b, DateFormat dateFormat, AbstractC4952f abstractC4952f, Locale locale, TimeZone timeZone, C9651a c9651a) {
        this.f28700b = abstractC5481f;
        this.f28701c = abstractC4625b;
        this.f28702d = interfaceC5485j;
        this.f28703e = c7963e;
        this.f28704f = interfaceC5682b;
        this.f28705g = dateFormat;
        this.f28706h = locale;
        this.f28707i = timeZone;
        this.f28708j = c9651a;
    }

    /* renamed from: a */
    public AbstractC4625b m24935a() {
        return this.f28701c;
    }

    /* renamed from: b */
    public C7963e m24936b() {
        return this.f28703e;
    }

    /* renamed from: c */
    public C4947a m24937c(AbstractC5481f abstractC5481f) {
        return this.f28700b == abstractC5481f ? this : new C4947a(abstractC5481f, this.f28701c, this.f28702d, null, this.f28703e, this.f28704f, this.f28705g, null, this.f28706h, this.f28707i, this.f28708j);
    }
}
