package p223n2;

import android.database.Cursor;
import p327t1.AbstractC8594b;
import p327t1.AbstractC8597e;
import p327t1.C8600h;
import p360v1.C9225c;
import p375w1.InterfaceC9401f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n2/f.class
 */
/* renamed from: n2.f */
/* loaded from: combined.jar:classes1.jar:n2/f.class */
public final class C6626f implements InterfaceC6625e {

    /* renamed from: a */
    public final AbstractC8597e f34547a;

    /* renamed from: b */
    public final AbstractC8594b<C6624d> f34548b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n2/f$a.class
     */
    /* renamed from: n2.f$a */
    /* loaded from: combined.jar:classes1.jar:n2/f$a.class */
    public class a extends AbstractC8594b<C6624d> {

        /* renamed from: d */
        public final C6626f f34549d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6626f c6626f, AbstractC8597e abstractC8597e) {
            super(abstractC8597e);
            this.f34549d = c6626f;
        }

        @Override // p327t1.AbstractC8603k
        /* renamed from: d */
        public String mo30570d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // p327t1.AbstractC8594b
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo30571g(InterfaceC9401f interfaceC9401f, C6624d c6624d) {
            String str = c6624d.f34545a;
            if (str == null) {
                interfaceC9401f.mo36945t0(1);
            } else {
                interfaceC9401f.mo36938h0(1, str);
            }
            Long l10 = c6624d.f34546b;
            if (l10 == null) {
                interfaceC9401f.mo36945t0(2);
            } else {
                interfaceC9401f.mo36941m0(2, l10.longValue());
            }
        }
    }

    public C6626f(AbstractC8597e abstractC8597e) {
        this.f34547a = abstractC8597e;
        this.f34548b = new a(this, abstractC8597e);
    }

    @Override // p223n2.InterfaceC6625e
    /* renamed from: a */
    public void mo30573a(C6624d c6624d) {
        this.f34547a.m36897b();
        this.f34547a.m36898c();
        try {
            this.f34548b.m36891h(c6624d);
            this.f34547a.m36910r();
        } finally {
            this.f34547a.m36900g();
        }
    }

    @Override // p223n2.InterfaceC6625e
    /* renamed from: b */
    public Long mo30574b(String str) {
        C8600h m36935o = C8600h.m36935o("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            m36935o.mo36945t0(1);
        } else {
            m36935o.mo36938h0(1, str);
        }
        this.f34547a.m36897b();
        Cursor m38893b = C9225c.m38893b(this.f34547a, m36935o, false, null);
        Long l10 = null;
        try {
            if (m38893b.moveToFirst()) {
                l10 = m38893b.isNull(0) ? null : Long.valueOf(m38893b.getLong(0));
            }
            m38893b.close();
            m36935o.m36944t();
            return l10;
        } catch (Throwable th2) {
            m38893b.close();
            m36935o.m36944t();
            throw th2;
        }
    }
}
