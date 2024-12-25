package p312ri;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import ki.C5634b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.C5402b0;
import p173ji.C5406d0;
import p173ji.C5410f0;
import p173ji.C5432w;
import p173ji.EnumC5404c0;
import p253oi.C6982f;
import p274pi.C7728e;
import p274pi.C7730g;
import p274pi.C7732i;
import p274pi.C7734k;
import p274pi.InterfaceC7727d;
import p372vh.C9365d;
import p372vh.C9367f;
import p411xi.C9758c0;
import p411xi.InterfaceC9756b0;
import p411xi.InterfaceC9782z;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ri/g.class
 */
/* renamed from: ri.g */
/* loaded from: combined.jar:classes2.jar:ri/g.class */
public final class C8481g implements InterfaceC7727d {

    /* renamed from: a */
    public volatile C8483i f39726a;

    /* renamed from: b */
    public final EnumC5404c0 f39727b;

    /* renamed from: c */
    public volatile boolean f39728c;

    /* renamed from: d */
    @NotNull
    public final C6982f f39729d;

    /* renamed from: e */
    public final C7730g f39730e;

    /* renamed from: f */
    public final C8480f f39731f;

    /* renamed from: i */
    public static final a f39725i = new a(null);

    /* renamed from: g */
    public static final List<String> f39723g = C5634b.m27800t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h */
    public static final List<String> f39724h = C5634b.m27800t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/g$a.class
     */
    /* renamed from: ri.g$a */
    /* loaded from: combined.jar:classes2.jar:ri/g$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final List<C8477c> m36514a(@NotNull C5406d0 c5406d0) {
            C9367f.m39526e(c5406d0, "request");
            C5432w m26875e = c5406d0.m26875e();
            ArrayList arrayList = new ArrayList(m26875e.size() + 4);
            arrayList.add(new C8477c(C8477c.f39581f, c5406d0.m26877g()));
            arrayList.add(new C8477c(C8477c.f39582g, C7732i.f37510a.m33759c(c5406d0.m26880j())));
            String m26874d = c5406d0.m26874d("Host");
            if (m26874d != null) {
                arrayList.add(new C8477c(C8477c.f39584i, m26874d));
            }
            arrayList.add(new C8477c(C8477c.f39583h, c5406d0.m26880j().m27121s()));
            int size = m26875e.size();
            for (int i10 = 0; i10 < size; i10++) {
                String m27082b = m26875e.m27082b(i10);
                Locale locale = Locale.US;
                C9367f.m39525d(locale, "Locale.US");
                if (m27082b == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = m27082b.toLowerCase(locale);
                C9367f.m39525d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!C8481g.f39723g.contains(lowerCase) || (C9367f.m39522a(lowerCase, "te") && C9367f.m39522a(m26875e.m27085h(i10), "trailers"))) {
                    arrayList.add(new C8477c(lowerCase, m26875e.m27085h(i10)));
                }
            }
            return arrayList;
        }

        @NotNull
        /* renamed from: b */
        public final C5410f0.a m36515b(@NotNull C5432w c5432w, @NotNull EnumC5404c0 enumC5404c0) {
            C7734k c7734k;
            C9367f.m39526e(c5432w, "headerBlock");
            C9367f.m39526e(enumC5404c0, "protocol");
            C5432w.a aVar = new C5432w.a();
            int size = c5432w.size();
            C7734k c7734k2 = null;
            int i10 = 0;
            while (i10 < size) {
                String m27082b = c5432w.m27082b(i10);
                String m27085h = c5432w.m27085h(i10);
                if (C9367f.m39522a(m27082b, ":status")) {
                    c7734k = C7734k.f37513d.m33766a("HTTP/1.1 " + m27085h);
                } else {
                    c7734k = c7734k2;
                    if (!C8481g.f39724h.contains(m27082b)) {
                        aVar.m27090d(m27082b, m27085h);
                        c7734k = c7734k2;
                    }
                }
                i10++;
                c7734k2 = c7734k;
            }
            if (c7734k2 != null) {
                return new C5410f0.a().m26947p(enumC5404c0).m26938g(c7734k2.f37515b).m26944m(c7734k2.f37516c).m26942k(aVar.m27092f());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public C8481g(@NotNull C5402b0 c5402b0, @NotNull C6982f c6982f, @NotNull C7730g c7730g, @NotNull C8480f c8480f) {
        C9367f.m39526e(c5402b0, "client");
        C9367f.m39526e(c6982f, "connection");
        C9367f.m39526e(c7730g, "chain");
        C9367f.m39526e(c8480f, "http2Connection");
        this.f39729d = c6982f;
        this.f39730e = c7730g;
        this.f39731f = c8480f;
        List<EnumC5404c0> m26785H = c5402b0.m26785H();
        EnumC5404c0 enumC5404c0 = EnumC5404c0.H2_PRIOR_KNOWLEDGE;
        this.f39727b = m26785H.contains(enumC5404c0) ? enumC5404c0 : EnumC5404c0.HTTP_2;
    }

    @Override // p274pi.InterfaceC7727d
    /* renamed from: a */
    public void mo33728a() {
        this.f39731f.flush();
    }

    @Override // p274pi.InterfaceC7727d
    /* renamed from: b */
    public void mo33729b() {
        C8483i c8483i = this.f39726a;
        C9367f.m39524c(c8483i);
        c8483i.m36557n().close();
    }

    @Override // p274pi.InterfaceC7727d
    @NotNull
    /* renamed from: c */
    public C6982f mo33730c() {
        return this.f39729d;
    }

    @Override // p274pi.InterfaceC7727d
    public void cancel() {
        this.f39728c = true;
        C8483i c8483i = this.f39726a;
        if (c8483i != null) {
            c8483i.m36549f(EnumC8476b.CANCEL);
        }
    }

    @Override // p274pi.InterfaceC7727d
    /* renamed from: d */
    public long mo33731d(@NotNull C5410f0 c5410f0) {
        C9367f.m39526e(c5410f0, "response");
        return !C7728e.m33737b(c5410f0) ? 0L : C5634b.m27799s(c5410f0);
    }

    @Override // p274pi.InterfaceC7727d
    @NotNull
    /* renamed from: e */
    public InterfaceC9782z mo33732e(@NotNull C5406d0 c5406d0, long j10) {
        C9367f.m39526e(c5406d0, "request");
        C8483i c8483i = this.f39726a;
        C9367f.m39524c(c8483i);
        return c8483i.m36557n();
    }

    @Override // p274pi.InterfaceC7727d
    /* renamed from: f */
    public void mo33733f(@NotNull C5406d0 c5406d0) {
        C9367f.m39526e(c5406d0, "request");
        if (this.f39726a != null) {
            return;
        }
        this.f39726a = this.f39731f.m36467U0(f39725i.m36514a(c5406d0), c5406d0.m26871a() != null);
        if (this.f39728c) {
            C8483i c8483i = this.f39726a;
            C9367f.m39524c(c8483i);
            c8483i.m36549f(EnumC8476b.CANCEL);
            throw new IOException("Canceled");
        }
        C8483i c8483i2 = this.f39726a;
        C9367f.m39524c(c8483i2);
        C9758c0 m36565v = c8483i2.m36565v();
        long m33753g = this.f39730e.m33753g();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        m36565v.mo41092g(m33753g, timeUnit);
        C8483i c8483i3 = this.f39726a;
        C9367f.m39524c(c8483i3);
        c8483i3.m36543E().mo41092g(this.f39730e.m33755i(), timeUnit);
    }

    @Override // p274pi.InterfaceC7727d
    @NotNull
    /* renamed from: g */
    public InterfaceC9756b0 mo33734g(@NotNull C5410f0 c5410f0) {
        C9367f.m39526e(c5410f0, "response");
        C8483i c8483i = this.f39726a;
        C9367f.m39524c(c8483i);
        return c8483i.m36559p();
    }

    @Override // p274pi.InterfaceC7727d
    @Nullable
    /* renamed from: h */
    public C5410f0.a mo33735h(boolean z10) {
        C8483i c8483i = this.f39726a;
        C9367f.m39524c(c8483i);
        C5410f0.a m36515b = f39725i.m36515b(c8483i.m36541C(), this.f39727b);
        C5410f0.a aVar = m36515b;
        if (z10) {
            aVar = m36515b;
            if (m36515b.m26939h() == 100) {
                aVar = null;
            }
        }
        return aVar;
    }
}
