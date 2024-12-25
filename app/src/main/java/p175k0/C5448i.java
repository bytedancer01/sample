package p175k0;

import android.p016os.LocaleList;
import java.util.Locale;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k0/i.class
 */
/* renamed from: k0.i */
/* loaded from: combined.jar:classes1.jar:k0/i.class */
public final class C5448i implements InterfaceC5447h {

    /* renamed from: a */
    public final LocaleList f31197a;

    public C5448i(LocaleList localeList) {
        this.f31197a = localeList;
    }

    @Override // p175k0.InterfaceC5447h
    /* renamed from: a */
    public Object mo27204a() {
        return this.f31197a;
    }

    public boolean equals(Object obj) {
        return this.f31197a.equals(((InterfaceC5447h) obj).mo27204a());
    }

    @Override // p175k0.InterfaceC5447h
    public Locale get(int i10) {
        return this.f31197a.get(i10);
    }

    public int hashCode() {
        return this.f31197a.hashCode();
    }

    public String toString() {
        return this.f31197a.toString();
    }
}
