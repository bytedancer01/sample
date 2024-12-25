package p077e8;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import p058d8.InterfaceC4345g;
import p059d9.C4349a;
import p077e8.AbstractC4658k;
import p099fc.AbstractC4834t;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:e8/j.class
 */
/* renamed from: e8.j */
/* loaded from: combined.jar:classes2.jar:e8/j.class */
public abstract class AbstractC4657j {

    /* renamed from: a */
    public final long f27458a;

    /* renamed from: b */
    public final C7629w0 f27459b;

    /* renamed from: c */
    public final AbstractC4834t<C4649b> f27460c;

    /* renamed from: d */
    public final long f27461d;

    /* renamed from: e */
    public final List<C4652e> f27462e;

    /* renamed from: f */
    public final C4656i f27463f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:e8/j$b.class
     */
    /* renamed from: e8.j$b */
    /* loaded from: combined.jar:classes2.jar:e8/j$b.class */
    public static class b extends AbstractC4657j implements InterfaceC4345g {

        /* renamed from: g */
        public final AbstractC4658k.a f27464g;

        public b(long j10, C7629w0 c7629w0, List<C4649b> list, AbstractC4658k.a aVar, List<C4652e> list2) {
            super(j10, c7629w0, list, aVar, list2);
            this.f27464g = aVar;
        }

        @Override // p077e8.AbstractC4657j
        /* renamed from: a */
        public String mo23377a() {
            return null;
        }

        @Override // p058d8.InterfaceC4345g
        /* renamed from: b */
        public long mo21859b(long j10) {
            return this.f27464g.m23390j(j10);
        }

        @Override // p058d8.InterfaceC4345g
        /* renamed from: c */
        public long mo21860c(long j10, long j11) {
            return this.f27464g.m23388h(j10, j11);
        }

        @Override // p058d8.InterfaceC4345g
        /* renamed from: d */
        public long mo21861d(long j10, long j11) {
            return this.f27464g.m23384d(j10, j11);
        }

        @Override // p058d8.InterfaceC4345g
        /* renamed from: e */
        public long mo21862e(long j10, long j11) {
            return this.f27464g.m23386f(j10, j11);
        }

        @Override // p058d8.InterfaceC4345g
        /* renamed from: f */
        public C4656i mo21863f(long j10) {
            return this.f27464g.mo23391k(this, j10);
        }

        @Override // p058d8.InterfaceC4345g
        /* renamed from: g */
        public long mo21864g(long j10, long j11) {
            return this.f27464g.m23389i(j10, j11);
        }

        @Override // p058d8.InterfaceC4345g
        /* renamed from: h */
        public long mo21865h(long j10) {
            return this.f27464g.mo23387g(j10);
        }

        @Override // p058d8.InterfaceC4345g
        /* renamed from: i */
        public boolean mo21866i() {
            return this.f27464g.mo23392l();
        }

        @Override // p058d8.InterfaceC4345g
        /* renamed from: j */
        public long mo21867j() {
            return this.f27464g.m23385e();
        }

        @Override // p058d8.InterfaceC4345g
        /* renamed from: k */
        public long mo21868k(long j10, long j11) {
            return this.f27464g.m23383c(j10, j11);
        }

        @Override // p077e8.AbstractC4657j
        /* renamed from: l */
        public InterfaceC4345g mo23378l() {
            return this;
        }

        @Override // p077e8.AbstractC4657j
        /* renamed from: m */
        public C4656i mo23379m() {
            return null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:e8/j$c.class
     */
    /* renamed from: e8.j$c */
    /* loaded from: combined.jar:classes2.jar:e8/j$c.class */
    public static class c extends AbstractC4657j {

        /* renamed from: g */
        public final Uri f27465g;

        /* renamed from: h */
        public final long f27466h;

        /* renamed from: i */
        public final String f27467i;

        /* renamed from: j */
        public final C4656i f27468j;

        /* renamed from: k */
        public final C4660m f27469k;

        public c(long j10, C7629w0 c7629w0, List<C4649b> list, AbstractC4658k.e eVar, List<C4652e> list2, String str, long j11) {
            super(j10, c7629w0, list, eVar, list2);
            this.f27465g = Uri.parse(list.get(0).f27407a);
            C4656i m23393c = eVar.m23393c();
            this.f27468j = m23393c;
            this.f27467i = str;
            this.f27466h = j11;
            this.f27469k = m23393c != null ? null : new C4660m(new C4656i(null, 0L, j11));
        }

        @Override // p077e8.AbstractC4657j
        /* renamed from: a */
        public String mo23377a() {
            return this.f27467i;
        }

        @Override // p077e8.AbstractC4657j
        /* renamed from: l */
        public InterfaceC4345g mo23378l() {
            return this.f27469k;
        }

        @Override // p077e8.AbstractC4657j
        /* renamed from: m */
        public C4656i mo23379m() {
            return this.f27468j;
        }
    }

    public AbstractC4657j(long j10, C7629w0 c7629w0, List<C4649b> list, AbstractC4658k abstractC4658k, List<C4652e> list2) {
        C4349a.m21878a(!list.isEmpty());
        this.f27458a = j10;
        this.f27459b = c7629w0;
        this.f27460c = AbstractC4834t.m24538A(list);
        this.f27462e = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f27463f = abstractC4658k.mo23381a(this);
        this.f27461d = abstractC4658k.m23382b();
    }

    /* renamed from: o */
    public static AbstractC4657j m23375o(long j10, C7629w0 c7629w0, List<C4649b> list, AbstractC4658k abstractC4658k, List<C4652e> list2) {
        return m23376p(j10, c7629w0, list, abstractC4658k, list2, null);
    }

    /* renamed from: p */
    public static AbstractC4657j m23376p(long j10, C7629w0 c7629w0, List<C4649b> list, AbstractC4658k abstractC4658k, List<C4652e> list2, String str) {
        if (abstractC4658k instanceof AbstractC4658k.e) {
            return new c(j10, c7629w0, list, (AbstractC4658k.e) abstractC4658k, list2, str, -1L);
        }
        if (abstractC4658k instanceof AbstractC4658k.a) {
            return new b(j10, c7629w0, list, (AbstractC4658k.a) abstractC4658k, list2);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    /* renamed from: a */
    public abstract String mo23377a();

    /* renamed from: l */
    public abstract InterfaceC4345g mo23378l();

    /* renamed from: m */
    public abstract C4656i mo23379m();

    /* renamed from: n */
    public C4656i m23380n() {
        return this.f27463f;
    }
}
