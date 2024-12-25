package p112g6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p386wc.InterfaceC9563d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g6/d.class
 */
/* renamed from: g6.d */
/* loaded from: combined.jar:classes1.jar:g6/d.class */
public final class C4959d {

    /* renamed from: c */
    public static final C4959d f28758c = new a().m24969a();

    /* renamed from: a */
    public final String f28759a;

    /* renamed from: b */
    public final List<C4958c> f28760b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g6/d$a.class
     */
    /* renamed from: g6.d$a */
    /* loaded from: combined.jar:classes1.jar:g6/d$a.class */
    public static final class a {

        /* renamed from: a */
        public String f28761a = "";

        /* renamed from: b */
        public List<C4958c> f28762b = new ArrayList();

        /* renamed from: a */
        public C4959d m24969a() {
            return new C4959d(this.f28761a, Collections.unmodifiableList(this.f28762b));
        }

        /* renamed from: b */
        public a m24970b(List<C4958c> list) {
            this.f28762b = list;
            return this;
        }

        /* renamed from: c */
        public a m24971c(String str) {
            this.f28761a = str;
            return this;
        }
    }

    public C4959d(String str, List<C4958c> list) {
        this.f28759a = str;
        this.f28760b = list;
    }

    /* renamed from: c */
    public static a m24966c() {
        return new a();
    }

    @InterfaceC9563d(tag = 2)
    /* renamed from: a */
    public List<C4958c> m24967a() {
        return this.f28760b;
    }

    @InterfaceC9563d(tag = 1)
    /* renamed from: b */
    public String m24968b() {
        return this.f28759a;
    }
}
