package p223n2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import p327t1.AbstractC8594b;
import p327t1.AbstractC8597e;
import p327t1.AbstractC8603k;
import p327t1.C8600h;
import p360v1.C9224b;
import p360v1.C9225c;
import p375w1.InterfaceC9401f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n2/i.class
 */
/* renamed from: n2.i */
/* loaded from: combined.jar:classes1.jar:n2/i.class */
public final class C6629i implements InterfaceC6628h {

    /* renamed from: a */
    public final AbstractC8597e f34552a;

    /* renamed from: b */
    public final AbstractC8594b<C6627g> f34553b;

    /* renamed from: c */
    public final AbstractC8603k f34554c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n2/i$a.class
     */
    /* renamed from: n2.i$a */
    /* loaded from: combined.jar:classes1.jar:n2/i$a.class */
    public class a extends AbstractC8594b<C6627g> {

        /* renamed from: d */
        public final C6629i f34555d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6629i c6629i, AbstractC8597e abstractC8597e) {
            super(abstractC8597e);
            this.f34555d = c6629i;
        }

        @Override // p327t1.AbstractC8603k
        /* renamed from: d */
        public String mo30570d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // p327t1.AbstractC8594b
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo30571g(InterfaceC9401f interfaceC9401f, C6627g c6627g) {
            String str = c6627g.f34550a;
            if (str == null) {
                interfaceC9401f.mo36945t0(1);
            } else {
                interfaceC9401f.mo36938h0(1, str);
            }
            interfaceC9401f.mo36941m0(2, c6627g.f34551b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n2/i$b.class
     */
    /* renamed from: n2.i$b */
    /* loaded from: combined.jar:classes1.jar:n2/i$b.class */
    public class b extends AbstractC8603k {

        /* renamed from: d */
        public final C6629i f34556d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C6629i c6629i, AbstractC8597e abstractC8597e) {
            super(abstractC8597e);
            this.f34556d = c6629i;
        }

        @Override // p327t1.AbstractC8603k
        /* renamed from: d */
        public String mo30570d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C6629i(AbstractC8597e abstractC8597e) {
        this.f34552a = abstractC8597e;
        this.f34553b = new a(this, abstractC8597e);
        this.f34554c = new b(this, abstractC8597e);
    }

    @Override // p223n2.InterfaceC6628h
    /* renamed from: a */
    public void mo30576a(C6627g c6627g) {
        this.f34552a.m36897b();
        this.f34552a.m36898c();
        try {
            this.f34553b.m36891h(c6627g);
            this.f34552a.m36910r();
        } finally {
            this.f34552a.m36900g();
        }
    }

    @Override // p223n2.InterfaceC6628h
    /* renamed from: b */
    public C6627g mo30577b(String str) {
        C8600h m36935o = C8600h.m36935o("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            m36935o.mo36945t0(1);
        } else {
            m36935o.mo36938h0(1, str);
        }
        this.f34552a.m36897b();
        C6627g c6627g = null;
        Cursor m38893b = C9225c.m38893b(this.f34552a, m36935o, false, null);
        try {
            int m38891b = C9224b.m38891b(m38893b, "work_spec_id");
            int m38891b2 = C9224b.m38891b(m38893b, "system_id");
            if (m38893b.moveToFirst()) {
                c6627g = new C6627g(m38893b.getString(m38891b), m38893b.getInt(m38891b2));
            }
            m38893b.close();
            m36935o.m36944t();
            return c6627g;
        } catch (Throwable th2) {
            m38893b.close();
            m36935o.m36944t();
            throw th2;
        }
    }

    @Override // p223n2.InterfaceC6628h
    /* renamed from: c */
    public List<String> mo30578c() {
        C8600h m36935o = C8600h.m36935o("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f34552a.m36897b();
        Cursor m38893b = C9225c.m38893b(this.f34552a, m36935o, false, null);
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

    @Override // p223n2.InterfaceC6628h
    /* renamed from: d */
    public void mo30579d(String str) {
        this.f34552a.m36897b();
        InterfaceC9401f m36949a = this.f34554c.m36949a();
        if (str == null) {
            m36949a.mo36945t0(1);
        } else {
            m36949a.mo36938h0(1, str);
        }
        this.f34552a.m36898c();
        try {
            m36949a.mo39729H();
            this.f34552a.m36910r();
        } finally {
            this.f34552a.m36900g();
            this.f34554c.m36953f(m36949a);
        }
    }
}
