package td;

import p444zd.C10193a;
import p444zd.C10194b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:td/c.class
 */
/* renamed from: td.c */
/* loaded from: combined.jar:classes2.jar:td/c.class */
public final class C8688c {

    /* renamed from: a */
    public final AbstractC8687b f40460a;

    /* renamed from: b */
    public C10194b f40461b;

    public C8688c(AbstractC8687b abstractC8687b) {
        if (abstractC8687b == null) {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        }
        this.f40460a = abstractC8687b;
    }

    /* renamed from: a */
    public C10194b m37190a() {
        if (this.f40461b == null) {
            this.f40461b = this.f40460a.mo37185b();
        }
        return this.f40461b;
    }

    /* renamed from: b */
    public C10193a m37191b(int i10, C10193a c10193a) {
        return this.f40460a.mo37186c(i10, c10193a);
    }

    /* renamed from: c */
    public int m37192c() {
        return this.f40460a.m37187d();
    }

    /* renamed from: d */
    public int m37193d() {
        return this.f40460a.m37189f();
    }

    /* renamed from: e */
    public boolean m37194e() {
        return this.f40460a.m37188e().mo37202f();
    }

    /* renamed from: f */
    public C8688c m37195f() {
        return new C8688c(this.f40460a.mo37184a(this.f40460a.m37188e().mo37203g()));
    }

    public String toString() {
        try {
            return m37190a().toString();
        } catch (C8695j e10) {
            return "";
        }
    }
}
