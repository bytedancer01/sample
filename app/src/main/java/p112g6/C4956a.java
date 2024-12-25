package p112g6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p036c6.AbstractC1001l;
import p386wc.InterfaceC9563d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g6/a.class
 */
/* renamed from: g6.a */
/* loaded from: combined.jar:classes1.jar:g6/a.class */
public final class C4956a {

    /* renamed from: e */
    public static final C4956a f28741e = new a().m24952b();

    /* renamed from: a */
    public final C4961f f28742a;

    /* renamed from: b */
    public final List<C4959d> f28743b;

    /* renamed from: c */
    public final C4957b f28744c;

    /* renamed from: d */
    public final String f28745d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g6/a$a.class
     */
    /* renamed from: g6.a$a */
    /* loaded from: combined.jar:classes1.jar:g6/a$a.class */
    public static final class a {

        /* renamed from: a */
        public C4961f f28746a = null;

        /* renamed from: b */
        public List<C4959d> f28747b = new ArrayList();

        /* renamed from: c */
        public C4957b f28748c = null;

        /* renamed from: d */
        public String f28749d = "";

        /* renamed from: a */
        public a m24951a(C4959d c4959d) {
            this.f28747b.add(c4959d);
            return this;
        }

        /* renamed from: b */
        public C4956a m24952b() {
            return new C4956a(this.f28746a, Collections.unmodifiableList(this.f28747b), this.f28748c, this.f28749d);
        }

        /* renamed from: c */
        public a m24953c(String str) {
            this.f28749d = str;
            return this;
        }

        /* renamed from: d */
        public a m24954d(C4957b c4957b) {
            this.f28748c = c4957b;
            return this;
        }

        /* renamed from: e */
        public a m24955e(C4961f c4961f) {
            this.f28746a = c4961f;
            return this;
        }
    }

    public C4956a(C4961f c4961f, List<C4959d> list, C4957b c4957b, String str) {
        this.f28742a = c4961f;
        this.f28743b = list;
        this.f28744c = c4957b;
        this.f28745d = str;
    }

    /* renamed from: e */
    public static a m24945e() {
        return new a();
    }

    @InterfaceC9563d(tag = 4)
    /* renamed from: a */
    public String m24946a() {
        return this.f28745d;
    }

    @InterfaceC9563d(tag = 3)
    /* renamed from: b */
    public C4957b m24947b() {
        return this.f28744c;
    }

    @InterfaceC9563d(tag = 2)
    /* renamed from: c */
    public List<C4959d> m24948c() {
        return this.f28743b;
    }

    @InterfaceC9563d(tag = 1)
    /* renamed from: d */
    public C4961f m24949d() {
        return this.f28742a;
    }

    /* renamed from: f */
    public byte[] m24950f() {
        return AbstractC1001l.m5956a(this);
    }
}
