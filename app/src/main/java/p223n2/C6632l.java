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
  classes1.jar:n2/l.class
 */
/* renamed from: n2.l */
/* loaded from: combined.jar:classes1.jar:n2/l.class */
public final class C6632l implements InterfaceC6631k {

    /* renamed from: a */
    public final AbstractC8597e f34559a;

    /* renamed from: b */
    public final AbstractC8594b<C6630j> f34560b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n2/l$a.class
     */
    /* renamed from: n2.l$a */
    /* loaded from: combined.jar:classes1.jar:n2/l$a.class */
    public class a extends AbstractC8594b<C6630j> {

        /* renamed from: d */
        public final C6632l f34561d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6632l c6632l, AbstractC8597e abstractC8597e) {
            super(abstractC8597e);
            this.f34561d = c6632l;
        }

        @Override // p327t1.AbstractC8603k
        /* renamed from: d */
        public String mo30570d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p327t1.AbstractC8594b
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo30571g(InterfaceC9401f interfaceC9401f, C6630j c6630j) {
            String str = c6630j.f34557a;
            if (str == null) {
                interfaceC9401f.mo36945t0(1);
            } else {
                interfaceC9401f.mo36938h0(1, str);
            }
            String str2 = c6630j.f34558b;
            if (str2 == null) {
                interfaceC9401f.mo36945t0(2);
            } else {
                interfaceC9401f.mo36938h0(2, str2);
            }
        }
    }

    public C6632l(AbstractC8597e abstractC8597e) {
        this.f34559a = abstractC8597e;
        this.f34560b = new a(this, abstractC8597e);
    }

    @Override // p223n2.InterfaceC6631k
    /* renamed from: a */
    public void mo30581a(C6630j c6630j) {
        this.f34559a.m36897b();
        this.f34559a.m36898c();
        try {
            this.f34560b.m36891h(c6630j);
            this.f34559a.m36910r();
        } finally {
            this.f34559a.m36900g();
        }
    }

    @Override // p223n2.InterfaceC6631k
    /* renamed from: b */
    public List<String> mo30582b(String str) {
        C8600h m36935o = C8600h.m36935o("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            m36935o.mo36945t0(1);
        } else {
            m36935o.mo36938h0(1, str);
        }
        this.f34559a.m36897b();
        Cursor m38893b = C9225c.m38893b(this.f34559a, m36935o, false, null);
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
