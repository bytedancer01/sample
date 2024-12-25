package p223n2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import p327t1.AbstractC8594b;
import p327t1.AbstractC8597e;
import p327t1.C8600h;
import p360v1.C9225c;
import p375w1.InterfaceC9401f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n2/u.class
 */
/* renamed from: n2.u */
/* loaded from: combined.jar:classes1.jar:n2/u.class */
public final class C6641u implements InterfaceC6640t {

    /* renamed from: a */
    public final AbstractC8597e f34620a;

    /* renamed from: b */
    public final AbstractC8594b<C6639s> f34621b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n2/u$a.class
     */
    /* renamed from: n2.u$a */
    /* loaded from: combined.jar:classes1.jar:n2/u$a.class */
    public class a extends AbstractC8594b<C6639s> {

        /* renamed from: d */
        public final C6641u f34622d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6641u c6641u, AbstractC8597e abstractC8597e) {
            super(abstractC8597e);
            this.f34622d = c6641u;
        }

        @Override // p327t1.AbstractC8603k
        /* renamed from: d */
        public String mo30570d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p327t1.AbstractC8594b
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo30571g(InterfaceC9401f interfaceC9401f, C6639s c6639s) {
            String str = c6639s.f34618a;
            if (str == null) {
                interfaceC9401f.mo36945t0(1);
            } else {
                interfaceC9401f.mo36938h0(1, str);
            }
            String str2 = c6639s.f34619b;
            if (str2 == null) {
                interfaceC9401f.mo36945t0(2);
            } else {
                interfaceC9401f.mo36938h0(2, str2);
            }
        }
    }

    public C6641u(AbstractC8597e abstractC8597e) {
        this.f34620a = abstractC8597e;
        this.f34621b = new a(this, abstractC8597e);
    }

    @Override // p223n2.InterfaceC6640t
    /* renamed from: a */
    public void mo30615a(C6639s c6639s) {
        this.f34620a.m36897b();
        this.f34620a.m36898c();
        try {
            this.f34621b.m36891h(c6639s);
            this.f34620a.m36910r();
        } finally {
            this.f34620a.m36900g();
        }
    }

    @Override // p223n2.InterfaceC6640t
    /* renamed from: b */
    public List<String> mo30616b(String str) {
        C8600h m36935o = C8600h.m36935o("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            m36935o.mo36945t0(1);
        } else {
            m36935o.mo36938h0(1, str);
        }
        this.f34620a.m36897b();
        Cursor m38893b = C9225c.m38893b(this.f34620a, m36935o, false, null);
        try {
            ArrayList arrayList = new ArrayList(m38893b.getCount());
            while (m38893b.moveToNext()) {
                arrayList.add(m38893b.getString(0));
            }
            return arrayList;
        } finally {
            m38893b.close();
            m36935o.m36944t();
        }
    }
}
