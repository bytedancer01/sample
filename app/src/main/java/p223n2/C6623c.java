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
  classes1.jar:n2/c.class
 */
/* renamed from: n2.c */
/* loaded from: combined.jar:classes1.jar:n2/c.class */
public final class C6623c implements InterfaceC6622b {

    /* renamed from: a */
    public final AbstractC8597e f34542a;

    /* renamed from: b */
    public final AbstractC8594b<C6621a> f34543b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n2/c$a.class
     */
    /* renamed from: n2.c$a */
    /* loaded from: combined.jar:classes1.jar:n2/c$a.class */
    public class a extends AbstractC8594b<C6621a> {

        /* renamed from: d */
        public final C6623c f34544d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6623c c6623c, AbstractC8597e abstractC8597e) {
            super(abstractC8597e);
            this.f34544d = c6623c;
        }

        @Override // p327t1.AbstractC8603k
        /* renamed from: d */
        public String mo30570d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // p327t1.AbstractC8594b
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo30571g(InterfaceC9401f interfaceC9401f, C6621a c6621a) {
            String str = c6621a.f34540a;
            if (str == null) {
                interfaceC9401f.mo36945t0(1);
            } else {
                interfaceC9401f.mo36938h0(1, str);
            }
            String str2 = c6621a.f34541b;
            if (str2 == null) {
                interfaceC9401f.mo36945t0(2);
            } else {
                interfaceC9401f.mo36938h0(2, str2);
            }
        }
    }

    public C6623c(AbstractC8597e abstractC8597e) {
        this.f34542a = abstractC8597e;
        this.f34543b = new a(this, abstractC8597e);
    }

    @Override // p223n2.InterfaceC6622b
    /* renamed from: a */
    public void mo30566a(C6621a c6621a) {
        this.f34542a.m36897b();
        this.f34542a.m36898c();
        try {
            this.f34543b.m36891h(c6621a);
            this.f34542a.m36910r();
        } finally {
            this.f34542a.m36900g();
        }
    }

    @Override // p223n2.InterfaceC6622b
    /* renamed from: b */
    public List<String> mo30567b(String str) {
        C8600h m36935o = C8600h.m36935o("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            m36935o.mo36945t0(1);
        } else {
            m36935o.mo36938h0(1, str);
        }
        this.f34542a.m36897b();
        Cursor m38893b = C9225c.m38893b(this.f34542a, m36935o, false, null);
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

    @Override // p223n2.InterfaceC6622b
    /* renamed from: c */
    public boolean mo30568c(String str) {
        C8600h m36935o = C8600h.m36935o("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            m36935o.mo36945t0(1);
        } else {
            m36935o.mo36938h0(1, str);
        }
        this.f34542a.m36897b();
        boolean z10 = false;
        Cursor m38893b = C9225c.m38893b(this.f34542a, m36935o, false, null);
        try {
            if (m38893b.moveToFirst()) {
                z10 = m38893b.getInt(0) != 0;
            }
            m38893b.close();
            m36935o.m36944t();
            return z10;
        } catch (Throwable th2) {
            m38893b.close();
            m36935o.m36944t();
            throw th2;
        }
    }

    @Override // p223n2.InterfaceC6622b
    /* renamed from: d */
    public boolean mo30569d(String str) {
        C8600h m36935o = C8600h.m36935o("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            m36935o.mo36945t0(1);
        } else {
            m36935o.mo36938h0(1, str);
        }
        this.f34542a.m36897b();
        boolean z10 = false;
        Cursor m38893b = C9225c.m38893b(this.f34542a, m36935o, false, null);
        try {
            if (m38893b.moveToFirst()) {
                z10 = m38893b.getInt(0) != 0;
            }
            m38893b.close();
            m36935o.m36944t();
            return z10;
        } catch (Throwable th2) {
            m38893b.close();
            m36935o.m36944t();
            throw th2;
        }
    }
}
