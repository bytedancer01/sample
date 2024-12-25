package p223n2;

import android.database.Cursor;
import androidx.work.C0757b;
import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.strategy.Name;
import p071e2.C4573b;
import p071e2.C4591t;
import p223n2.C6636p;
import p327t1.AbstractC8594b;
import p327t1.AbstractC8597e;
import p327t1.AbstractC8603k;
import p327t1.C8600h;
import p360v1.C9224b;
import p360v1.C9225c;
import p360v1.C9227e;
import p375w1.InterfaceC9401f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n2/r.class
 */
/* renamed from: n2.r */
/* loaded from: combined.jar:classes1.jar:n2/r.class */
public final class C6638r implements InterfaceC6637q {

    /* renamed from: a */
    public final AbstractC8597e f34599a;

    /* renamed from: b */
    public final AbstractC8594b<C6636p> f34600b;

    /* renamed from: c */
    public final AbstractC8603k f34601c;

    /* renamed from: d */
    public final AbstractC8603k f34602d;

    /* renamed from: e */
    public final AbstractC8603k f34603e;

    /* renamed from: f */
    public final AbstractC8603k f34604f;

    /* renamed from: g */
    public final AbstractC8603k f34605g;

    /* renamed from: h */
    public final AbstractC8603k f34606h;

    /* renamed from: i */
    public final AbstractC8603k f34607i;

    /* renamed from: j */
    public final AbstractC8603k f34608j;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n2/r$a.class
     */
    /* renamed from: n2.r$a */
    /* loaded from: combined.jar:classes1.jar:n2/r$a.class */
    public class a extends AbstractC8594b<C6636p> {

        /* renamed from: d */
        public final C6638r f34609d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6638r c6638r, AbstractC8597e abstractC8597e) {
            super(abstractC8597e);
            this.f34609d = c6638r;
        }

        @Override // p327t1.AbstractC8603k
        /* renamed from: d */
        public String mo30570d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p327t1.AbstractC8594b
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo30571g(InterfaceC9401f interfaceC9401f, C6636p c6636p) {
            String str = c6636p.f34573a;
            if (str == null) {
                interfaceC9401f.mo36945t0(1);
            } else {
                interfaceC9401f.mo36938h0(1, str);
            }
            interfaceC9401f.mo36941m0(2, C6642v.m30627j(c6636p.f34574b));
            String str2 = c6636p.f34575c;
            if (str2 == null) {
                interfaceC9401f.mo36945t0(3);
            } else {
                interfaceC9401f.mo36938h0(3, str2);
            }
            String str3 = c6636p.f34576d;
            if (str3 == null) {
                interfaceC9401f.mo36945t0(4);
            } else {
                interfaceC9401f.mo36938h0(4, str3);
            }
            byte[] m4871n = C0757b.m4871n(c6636p.f34577e);
            if (m4871n == null) {
                interfaceC9401f.mo36945t0(5);
            } else {
                interfaceC9401f.mo36942n0(5, m4871n);
            }
            byte[] m4871n2 = C0757b.m4871n(c6636p.f34578f);
            if (m4871n2 == null) {
                interfaceC9401f.mo36945t0(6);
            } else {
                interfaceC9401f.mo36942n0(6, m4871n2);
            }
            interfaceC9401f.mo36941m0(7, c6636p.f34579g);
            interfaceC9401f.mo36941m0(8, c6636p.f34580h);
            interfaceC9401f.mo36941m0(9, c6636p.f34581i);
            interfaceC9401f.mo36941m0(10, c6636p.f34583k);
            interfaceC9401f.mo36941m0(11, C6642v.m30618a(c6636p.f34584l));
            interfaceC9401f.mo36941m0(12, c6636p.f34585m);
            interfaceC9401f.mo36941m0(13, c6636p.f34586n);
            interfaceC9401f.mo36941m0(14, c6636p.f34587o);
            interfaceC9401f.mo36941m0(15, c6636p.f34588p);
            interfaceC9401f.mo36941m0(16, c6636p.f34589q ? 1L : 0L);
            interfaceC9401f.mo36941m0(17, C6642v.m30626i(c6636p.f34590r));
            C4573b c4573b = c6636p.f34582j;
            if (c4573b != null) {
                interfaceC9401f.mo36941m0(18, C6642v.m30625h(c4573b.m23090b()));
                interfaceC9401f.mo36941m0(19, c4573b.m23095g() ? 1L : 0L);
                interfaceC9401f.mo36941m0(20, c4573b.m23096h() ? 1L : 0L);
                interfaceC9401f.mo36941m0(21, c4573b.m23094f() ? 1L : 0L);
                interfaceC9401f.mo36941m0(22, c4573b.m23097i() ? 1L : 0L);
                interfaceC9401f.mo36941m0(23, c4573b.m23091c());
                interfaceC9401f.mo36941m0(24, c4573b.m23092d());
                byte[] m30620c = C6642v.m30620c(c4573b.m23089a());
                if (m30620c != null) {
                    interfaceC9401f.mo36942n0(25, m30620c);
                    return;
                }
            } else {
                interfaceC9401f.mo36945t0(18);
                interfaceC9401f.mo36945t0(19);
                interfaceC9401f.mo36945t0(20);
                interfaceC9401f.mo36945t0(21);
                interfaceC9401f.mo36945t0(22);
                interfaceC9401f.mo36945t0(23);
                interfaceC9401f.mo36945t0(24);
            }
            interfaceC9401f.mo36945t0(25);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n2/r$b.class
     */
    /* renamed from: n2.r$b */
    /* loaded from: combined.jar:classes1.jar:n2/r$b.class */
    public class b extends AbstractC8603k {

        /* renamed from: d */
        public final C6638r f34610d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C6638r c6638r, AbstractC8597e abstractC8597e) {
            super(abstractC8597e);
            this.f34610d = c6638r;
        }

        @Override // p327t1.AbstractC8603k
        /* renamed from: d */
        public String mo30570d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n2/r$c.class
     */
    /* renamed from: n2.r$c */
    /* loaded from: combined.jar:classes1.jar:n2/r$c.class */
    public class c extends AbstractC8603k {

        /* renamed from: d */
        public final C6638r f34611d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C6638r c6638r, AbstractC8597e abstractC8597e) {
            super(abstractC8597e);
            this.f34611d = c6638r;
        }

        @Override // p327t1.AbstractC8603k
        /* renamed from: d */
        public String mo30570d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n2/r$d.class
     */
    /* renamed from: n2.r$d */
    /* loaded from: combined.jar:classes1.jar:n2/r$d.class */
    public class d extends AbstractC8603k {

        /* renamed from: d */
        public final C6638r f34612d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C6638r c6638r, AbstractC8597e abstractC8597e) {
            super(abstractC8597e);
            this.f34612d = c6638r;
        }

        @Override // p327t1.AbstractC8603k
        /* renamed from: d */
        public String mo30570d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n2/r$e.class
     */
    /* renamed from: n2.r$e */
    /* loaded from: combined.jar:classes1.jar:n2/r$e.class */
    public class e extends AbstractC8603k {

        /* renamed from: d */
        public final C6638r f34613d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C6638r c6638r, AbstractC8597e abstractC8597e) {
            super(abstractC8597e);
            this.f34613d = c6638r;
        }

        @Override // p327t1.AbstractC8603k
        /* renamed from: d */
        public String mo30570d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n2/r$f.class
     */
    /* renamed from: n2.r$f */
    /* loaded from: combined.jar:classes1.jar:n2/r$f.class */
    public class f extends AbstractC8603k {

        /* renamed from: d */
        public final C6638r f34614d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C6638r c6638r, AbstractC8597e abstractC8597e) {
            super(abstractC8597e);
            this.f34614d = c6638r;
        }

        @Override // p327t1.AbstractC8603k
        /* renamed from: d */
        public String mo30570d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n2/r$g.class
     */
    /* renamed from: n2.r$g */
    /* loaded from: combined.jar:classes1.jar:n2/r$g.class */
    public class g extends AbstractC8603k {

        /* renamed from: d */
        public final C6638r f34615d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C6638r c6638r, AbstractC8597e abstractC8597e) {
            super(abstractC8597e);
            this.f34615d = c6638r;
        }

        @Override // p327t1.AbstractC8603k
        /* renamed from: d */
        public String mo30570d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n2/r$h.class
     */
    /* renamed from: n2.r$h */
    /* loaded from: combined.jar:classes1.jar:n2/r$h.class */
    public class h extends AbstractC8603k {

        /* renamed from: d */
        public final C6638r f34616d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C6638r c6638r, AbstractC8597e abstractC8597e) {
            super(abstractC8597e);
            this.f34616d = c6638r;
        }

        @Override // p327t1.AbstractC8603k
        /* renamed from: d */
        public String mo30570d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n2/r$i.class
     */
    /* renamed from: n2.r$i */
    /* loaded from: combined.jar:classes1.jar:n2/r$i.class */
    public class i extends AbstractC8603k {

        /* renamed from: d */
        public final C6638r f34617d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C6638r c6638r, AbstractC8597e abstractC8597e) {
            super(abstractC8597e);
            this.f34617d = c6638r;
        }

        @Override // p327t1.AbstractC8603k
        /* renamed from: d */
        public String mo30570d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public C6638r(AbstractC8597e abstractC8597e) {
        this.f34599a = abstractC8597e;
        this.f34600b = new a(this, abstractC8597e);
        this.f34601c = new b(this, abstractC8597e);
        this.f34602d = new c(this, abstractC8597e);
        this.f34603e = new d(this, abstractC8597e);
        this.f34604f = new e(this, abstractC8597e);
        this.f34605g = new f(this, abstractC8597e);
        this.f34606h = new g(this, abstractC8597e);
        this.f34607i = new h(this, abstractC8597e);
        this.f34608j = new i(this, abstractC8597e);
    }

    @Override // p223n2.InterfaceC6637q
    /* renamed from: a */
    public void mo30593a(String str) {
        this.f34599a.m36897b();
        InterfaceC9401f m36949a = this.f34601c.m36949a();
        if (str == null) {
            m36949a.mo36945t0(1);
        } else {
            m36949a.mo36938h0(1, str);
        }
        this.f34599a.m36898c();
        try {
            m36949a.mo39729H();
            this.f34599a.m36910r();
        } finally {
            this.f34599a.m36900g();
            this.f34601c.m36953f(m36949a);
        }
    }

    @Override // p223n2.InterfaceC6637q
    /* renamed from: b */
    public List<C6636p> mo30594b(long j10) {
        C8600h m36935o = C8600h.m36935o("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        m36935o.mo36941m0(1, j10);
        this.f34599a.m36897b();
        Cursor m38893b = C9225c.m38893b(this.f34599a, m36935o, false, null);
        try {
            int m38891b = C9224b.m38891b(m38893b, "required_network_type");
            int m38891b2 = C9224b.m38891b(m38893b, "requires_charging");
            int m38891b3 = C9224b.m38891b(m38893b, "requires_device_idle");
            int m38891b4 = C9224b.m38891b(m38893b, "requires_battery_not_low");
            int m38891b5 = C9224b.m38891b(m38893b, "requires_storage_not_low");
            int m38891b6 = C9224b.m38891b(m38893b, "trigger_content_update_delay");
            int m38891b7 = C9224b.m38891b(m38893b, "trigger_max_content_delay");
            int m38891b8 = C9224b.m38891b(m38893b, "content_uri_triggers");
            int m38891b9 = C9224b.m38891b(m38893b, Name.MARK);
            int m38891b10 = C9224b.m38891b(m38893b, "state");
            int m38891b11 = C9224b.m38891b(m38893b, "worker_class_name");
            int m38891b12 = C9224b.m38891b(m38893b, "input_merger_class_name");
            int m38891b13 = C9224b.m38891b(m38893b, "input");
            int m38891b14 = C9224b.m38891b(m38893b, "output");
            try {
                int m38891b15 = C9224b.m38891b(m38893b, "initial_delay");
                int m38891b16 = C9224b.m38891b(m38893b, "interval_duration");
                int m38891b17 = C9224b.m38891b(m38893b, "flex_duration");
                int m38891b18 = C9224b.m38891b(m38893b, "run_attempt_count");
                int m38891b19 = C9224b.m38891b(m38893b, "backoff_policy");
                int m38891b20 = C9224b.m38891b(m38893b, "backoff_delay_duration");
                int m38891b21 = C9224b.m38891b(m38893b, "period_start_time");
                int m38891b22 = C9224b.m38891b(m38893b, "minimum_retention_duration");
                int m38891b23 = C9224b.m38891b(m38893b, "schedule_requested_at");
                int m38891b24 = C9224b.m38891b(m38893b, "run_in_foreground");
                int m38891b25 = C9224b.m38891b(m38893b, "out_of_quota_policy");
                ArrayList arrayList = new ArrayList(m38893b.getCount());
                while (m38893b.moveToNext()) {
                    String string = m38893b.getString(m38891b9);
                    String string2 = m38893b.getString(m38891b11);
                    C4573b c4573b = new C4573b();
                    c4573b.m23099k(C6642v.m30622e(m38893b.getInt(m38891b)));
                    c4573b.m23101m(m38893b.getInt(m38891b2) != 0);
                    c4573b.m23102n(m38893b.getInt(m38891b3) != 0);
                    c4573b.m23100l(m38893b.getInt(m38891b4) != 0);
                    c4573b.m23103o(m38893b.getInt(m38891b5) != 0);
                    c4573b.m23104p(m38893b.getLong(m38891b6));
                    c4573b.m23105q(m38893b.getLong(m38891b7));
                    c4573b.m23098j(C6642v.m30619b(m38893b.getBlob(m38891b8)));
                    C6636p c6636p = new C6636p(string, string2);
                    c6636p.f34574b = C6642v.m30624g(m38893b.getInt(m38891b10));
                    c6636p.f34576d = m38893b.getString(m38891b12);
                    c6636p.f34577e = C0757b.m4870g(m38893b.getBlob(m38891b13));
                    c6636p.f34578f = C0757b.m4870g(m38893b.getBlob(m38891b14));
                    c6636p.f34579g = m38893b.getLong(m38891b15);
                    c6636p.f34580h = m38893b.getLong(m38891b16);
                    c6636p.f34581i = m38893b.getLong(m38891b17);
                    c6636p.f34583k = m38893b.getInt(m38891b18);
                    c6636p.f34584l = C6642v.m30621d(m38893b.getInt(m38891b19));
                    c6636p.f34585m = m38893b.getLong(m38891b20);
                    c6636p.f34586n = m38893b.getLong(m38891b21);
                    c6636p.f34587o = m38893b.getLong(m38891b22);
                    c6636p.f34588p = m38893b.getLong(m38891b23);
                    c6636p.f34589q = m38893b.getInt(m38891b24) != 0;
                    c6636p.f34590r = C6642v.m30623f(m38893b.getInt(m38891b25));
                    c6636p.f34582j = c4573b;
                    arrayList.add(c6636p);
                }
                m38893b.close();
                m36935o.m36944t();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                m38893b.close();
                m36935o.m36944t();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // p223n2.InterfaceC6637q
    /* renamed from: c */
    public List<C6636p> mo30595c() {
        int m38891b;
        int m38891b2;
        int m38891b3;
        int m38891b4;
        int m38891b5;
        int m38891b6;
        int m38891b7;
        int m38891b8;
        int m38891b9;
        int m38891b10;
        int m38891b11;
        int m38891b12;
        int m38891b13;
        int m38891b14;
        C8600h m36935o = C8600h.m36935o("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f34599a.m36897b();
        Cursor m38893b = C9225c.m38893b(this.f34599a, m36935o, false, null);
        try {
            m38891b = C9224b.m38891b(m38893b, "required_network_type");
            m38891b2 = C9224b.m38891b(m38893b, "requires_charging");
            m38891b3 = C9224b.m38891b(m38893b, "requires_device_idle");
            m38891b4 = C9224b.m38891b(m38893b, "requires_battery_not_low");
            m38891b5 = C9224b.m38891b(m38893b, "requires_storage_not_low");
            m38891b6 = C9224b.m38891b(m38893b, "trigger_content_update_delay");
            m38891b7 = C9224b.m38891b(m38893b, "trigger_max_content_delay");
            m38891b8 = C9224b.m38891b(m38893b, "content_uri_triggers");
            m38891b9 = C9224b.m38891b(m38893b, Name.MARK);
            m38891b10 = C9224b.m38891b(m38893b, "state");
            m38891b11 = C9224b.m38891b(m38893b, "worker_class_name");
            m38891b12 = C9224b.m38891b(m38893b, "input_merger_class_name");
            m38891b13 = C9224b.m38891b(m38893b, "input");
            m38891b14 = C9224b.m38891b(m38893b, "output");
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            int m38891b15 = C9224b.m38891b(m38893b, "initial_delay");
            int m38891b16 = C9224b.m38891b(m38893b, "interval_duration");
            int m38891b17 = C9224b.m38891b(m38893b, "flex_duration");
            int m38891b18 = C9224b.m38891b(m38893b, "run_attempt_count");
            int m38891b19 = C9224b.m38891b(m38893b, "backoff_policy");
            int m38891b20 = C9224b.m38891b(m38893b, "backoff_delay_duration");
            int m38891b21 = C9224b.m38891b(m38893b, "period_start_time");
            int m38891b22 = C9224b.m38891b(m38893b, "minimum_retention_duration");
            int m38891b23 = C9224b.m38891b(m38893b, "schedule_requested_at");
            int m38891b24 = C9224b.m38891b(m38893b, "run_in_foreground");
            int m38891b25 = C9224b.m38891b(m38893b, "out_of_quota_policy");
            ArrayList arrayList = new ArrayList(m38893b.getCount());
            while (m38893b.moveToNext()) {
                String string = m38893b.getString(m38891b9);
                String string2 = m38893b.getString(m38891b11);
                C4573b c4573b = new C4573b();
                c4573b.m23099k(C6642v.m30622e(m38893b.getInt(m38891b)));
                c4573b.m23101m(m38893b.getInt(m38891b2) != 0);
                c4573b.m23102n(m38893b.getInt(m38891b3) != 0);
                c4573b.m23100l(m38893b.getInt(m38891b4) != 0);
                c4573b.m23103o(m38893b.getInt(m38891b5) != 0);
                c4573b.m23104p(m38893b.getLong(m38891b6));
                c4573b.m23105q(m38893b.getLong(m38891b7));
                c4573b.m23098j(C6642v.m30619b(m38893b.getBlob(m38891b8)));
                C6636p c6636p = new C6636p(string, string2);
                c6636p.f34574b = C6642v.m30624g(m38893b.getInt(m38891b10));
                c6636p.f34576d = m38893b.getString(m38891b12);
                c6636p.f34577e = C0757b.m4870g(m38893b.getBlob(m38891b13));
                c6636p.f34578f = C0757b.m4870g(m38893b.getBlob(m38891b14));
                c6636p.f34579g = m38893b.getLong(m38891b15);
                c6636p.f34580h = m38893b.getLong(m38891b16);
                c6636p.f34581i = m38893b.getLong(m38891b17);
                c6636p.f34583k = m38893b.getInt(m38891b18);
                c6636p.f34584l = C6642v.m30621d(m38893b.getInt(m38891b19));
                c6636p.f34585m = m38893b.getLong(m38891b20);
                c6636p.f34586n = m38893b.getLong(m38891b21);
                c6636p.f34587o = m38893b.getLong(m38891b22);
                c6636p.f34588p = m38893b.getLong(m38891b23);
                c6636p.f34589q = m38893b.getInt(m38891b24) != 0;
                c6636p.f34590r = C6642v.m30623f(m38893b.getInt(m38891b25));
                c6636p.f34582j = c4573b;
                arrayList.add(c6636p);
            }
            m38893b.close();
            m36935o.m36944t();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            m38893b.close();
            m36935o.m36944t();
            throw th;
        }
    }

    @Override // p223n2.InterfaceC6637q
    /* renamed from: d */
    public void mo30596d(C6636p c6636p) {
        this.f34599a.m36897b();
        this.f34599a.m36898c();
        try {
            this.f34600b.m36891h(c6636p);
            this.f34599a.m36910r();
        } finally {
            this.f34599a.m36900g();
        }
    }

    @Override // p223n2.InterfaceC6637q
    /* renamed from: e */
    public List<String> mo30597e(String str) {
        C8600h m36935o = C8600h.m36935o("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            m36935o.mo36945t0(1);
        } else {
            m36935o.mo36938h0(1, str);
        }
        this.f34599a.m36897b();
        Cursor m38893b = C9225c.m38893b(this.f34599a, m36935o, false, null);
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

    @Override // p223n2.InterfaceC6637q
    /* renamed from: f */
    public C4591t.a mo30598f(String str) {
        C8600h m36935o = C8600h.m36935o("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            m36935o.mo36945t0(1);
        } else {
            m36935o.mo36938h0(1, str);
        }
        this.f34599a.m36897b();
        C4591t.a aVar = null;
        Cursor m38893b = C9225c.m38893b(this.f34599a, m36935o, false, null);
        try {
            if (m38893b.moveToFirst()) {
                aVar = C6642v.m30624g(m38893b.getInt(0));
            }
            m38893b.close();
            m36935o.m36944t();
            return aVar;
        } catch (Throwable th2) {
            m38893b.close();
            m36935o.m36944t();
            throw th2;
        }
    }

    @Override // p223n2.InterfaceC6637q
    /* renamed from: g */
    public C6636p mo30599g(String str) {
        int m38891b;
        int m38891b2;
        int m38891b3;
        int m38891b4;
        int m38891b5;
        int m38891b6;
        int m38891b7;
        int m38891b8;
        int m38891b9;
        int m38891b10;
        int m38891b11;
        int m38891b12;
        int m38891b13;
        int m38891b14;
        C6636p c6636p;
        C8600h m36935o = C8600h.m36935o("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            m36935o.mo36945t0(1);
        } else {
            m36935o.mo36938h0(1, str);
        }
        this.f34599a.m36897b();
        Cursor m38893b = C9225c.m38893b(this.f34599a, m36935o, false, null);
        try {
            m38891b = C9224b.m38891b(m38893b, "required_network_type");
            m38891b2 = C9224b.m38891b(m38893b, "requires_charging");
            m38891b3 = C9224b.m38891b(m38893b, "requires_device_idle");
            m38891b4 = C9224b.m38891b(m38893b, "requires_battery_not_low");
            m38891b5 = C9224b.m38891b(m38893b, "requires_storage_not_low");
            m38891b6 = C9224b.m38891b(m38893b, "trigger_content_update_delay");
            m38891b7 = C9224b.m38891b(m38893b, "trigger_max_content_delay");
            m38891b8 = C9224b.m38891b(m38893b, "content_uri_triggers");
            m38891b9 = C9224b.m38891b(m38893b, Name.MARK);
            m38891b10 = C9224b.m38891b(m38893b, "state");
            m38891b11 = C9224b.m38891b(m38893b, "worker_class_name");
            m38891b12 = C9224b.m38891b(m38893b, "input_merger_class_name");
            m38891b13 = C9224b.m38891b(m38893b, "input");
            m38891b14 = C9224b.m38891b(m38893b, "output");
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            int m38891b15 = C9224b.m38891b(m38893b, "initial_delay");
            int m38891b16 = C9224b.m38891b(m38893b, "interval_duration");
            int m38891b17 = C9224b.m38891b(m38893b, "flex_duration");
            int m38891b18 = C9224b.m38891b(m38893b, "run_attempt_count");
            int m38891b19 = C9224b.m38891b(m38893b, "backoff_policy");
            int m38891b20 = C9224b.m38891b(m38893b, "backoff_delay_duration");
            int m38891b21 = C9224b.m38891b(m38893b, "period_start_time");
            int m38891b22 = C9224b.m38891b(m38893b, "minimum_retention_duration");
            int m38891b23 = C9224b.m38891b(m38893b, "schedule_requested_at");
            int m38891b24 = C9224b.m38891b(m38893b, "run_in_foreground");
            int m38891b25 = C9224b.m38891b(m38893b, "out_of_quota_policy");
            if (m38893b.moveToFirst()) {
                String string = m38893b.getString(m38891b9);
                String string2 = m38893b.getString(m38891b11);
                C4573b c4573b = new C4573b();
                c4573b.m23099k(C6642v.m30622e(m38893b.getInt(m38891b)));
                c4573b.m23101m(m38893b.getInt(m38891b2) != 0);
                c4573b.m23102n(m38893b.getInt(m38891b3) != 0);
                c4573b.m23100l(m38893b.getInt(m38891b4) != 0);
                c4573b.m23103o(m38893b.getInt(m38891b5) != 0);
                c4573b.m23104p(m38893b.getLong(m38891b6));
                c4573b.m23105q(m38893b.getLong(m38891b7));
                c4573b.m23098j(C6642v.m30619b(m38893b.getBlob(m38891b8)));
                c6636p = new C6636p(string, string2);
                c6636p.f34574b = C6642v.m30624g(m38893b.getInt(m38891b10));
                c6636p.f34576d = m38893b.getString(m38891b12);
                c6636p.f34577e = C0757b.m4870g(m38893b.getBlob(m38891b13));
                c6636p.f34578f = C0757b.m4870g(m38893b.getBlob(m38891b14));
                c6636p.f34579g = m38893b.getLong(m38891b15);
                c6636p.f34580h = m38893b.getLong(m38891b16);
                c6636p.f34581i = m38893b.getLong(m38891b17);
                c6636p.f34583k = m38893b.getInt(m38891b18);
                c6636p.f34584l = C6642v.m30621d(m38893b.getInt(m38891b19));
                c6636p.f34585m = m38893b.getLong(m38891b20);
                c6636p.f34586n = m38893b.getLong(m38891b21);
                c6636p.f34587o = m38893b.getLong(m38891b22);
                c6636p.f34588p = m38893b.getLong(m38891b23);
                c6636p.f34589q = m38893b.getInt(m38891b24) != 0;
                c6636p.f34590r = C6642v.m30623f(m38893b.getInt(m38891b25));
                c6636p.f34582j = c4573b;
            } else {
                c6636p = null;
            }
            m38893b.close();
            m36935o.m36944t();
            return c6636p;
        } catch (Throwable th3) {
            th = th3;
            m38893b.close();
            m36935o.m36944t();
            throw th;
        }
    }

    @Override // p223n2.InterfaceC6637q
    /* renamed from: h */
    public List<String> mo30600h(String str) {
        C8600h m36935o = C8600h.m36935o("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            m36935o.mo36945t0(1);
        } else {
            m36935o.mo36938h0(1, str);
        }
        this.f34599a.m36897b();
        Cursor m38893b = C9225c.m38893b(this.f34599a, m36935o, false, null);
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

    @Override // p223n2.InterfaceC6637q
    /* renamed from: i */
    public List<C0757b> mo30601i(String str) {
        C8600h m36935o = C8600h.m36935o("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            m36935o.mo36945t0(1);
        } else {
            m36935o.mo36938h0(1, str);
        }
        this.f34599a.m36897b();
        Cursor m38893b = C9225c.m38893b(this.f34599a, m36935o, false, null);
        try {
            ArrayList arrayList = new ArrayList(m38893b.getCount());
            while (m38893b.moveToNext()) {
                arrayList.add(C0757b.m4870g(m38893b.getBlob(0)));
            }
            return arrayList;
        } finally {
            m38893b.close();
            m36935o.m36944t();
        }
    }

    @Override // p223n2.InterfaceC6637q
    /* renamed from: j */
    public List<C6636p> mo30602j(int i10) {
        int m38891b;
        int m38891b2;
        int m38891b3;
        int m38891b4;
        int m38891b5;
        int m38891b6;
        int m38891b7;
        int m38891b8;
        int m38891b9;
        int m38891b10;
        int m38891b11;
        int m38891b12;
        int m38891b13;
        int m38891b14;
        C8600h m36935o = C8600h.m36935o("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        m36935o.mo36941m0(1, i10);
        this.f34599a.m36897b();
        Cursor m38893b = C9225c.m38893b(this.f34599a, m36935o, false, null);
        try {
            m38891b = C9224b.m38891b(m38893b, "required_network_type");
            m38891b2 = C9224b.m38891b(m38893b, "requires_charging");
            m38891b3 = C9224b.m38891b(m38893b, "requires_device_idle");
            m38891b4 = C9224b.m38891b(m38893b, "requires_battery_not_low");
            m38891b5 = C9224b.m38891b(m38893b, "requires_storage_not_low");
            m38891b6 = C9224b.m38891b(m38893b, "trigger_content_update_delay");
            m38891b7 = C9224b.m38891b(m38893b, "trigger_max_content_delay");
            m38891b8 = C9224b.m38891b(m38893b, "content_uri_triggers");
            m38891b9 = C9224b.m38891b(m38893b, Name.MARK);
            m38891b10 = C9224b.m38891b(m38893b, "state");
            m38891b11 = C9224b.m38891b(m38893b, "worker_class_name");
            m38891b12 = C9224b.m38891b(m38893b, "input_merger_class_name");
            m38891b13 = C9224b.m38891b(m38893b, "input");
            m38891b14 = C9224b.m38891b(m38893b, "output");
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            int m38891b15 = C9224b.m38891b(m38893b, "initial_delay");
            int m38891b16 = C9224b.m38891b(m38893b, "interval_duration");
            int m38891b17 = C9224b.m38891b(m38893b, "flex_duration");
            int m38891b18 = C9224b.m38891b(m38893b, "run_attempt_count");
            int m38891b19 = C9224b.m38891b(m38893b, "backoff_policy");
            int m38891b20 = C9224b.m38891b(m38893b, "backoff_delay_duration");
            int m38891b21 = C9224b.m38891b(m38893b, "period_start_time");
            int m38891b22 = C9224b.m38891b(m38893b, "minimum_retention_duration");
            int m38891b23 = C9224b.m38891b(m38893b, "schedule_requested_at");
            int m38891b24 = C9224b.m38891b(m38893b, "run_in_foreground");
            int m38891b25 = C9224b.m38891b(m38893b, "out_of_quota_policy");
            ArrayList arrayList = new ArrayList(m38893b.getCount());
            while (m38893b.moveToNext()) {
                String string = m38893b.getString(m38891b9);
                String string2 = m38893b.getString(m38891b11);
                C4573b c4573b = new C4573b();
                c4573b.m23099k(C6642v.m30622e(m38893b.getInt(m38891b)));
                c4573b.m23101m(m38893b.getInt(m38891b2) != 0);
                c4573b.m23102n(m38893b.getInt(m38891b3) != 0);
                c4573b.m23100l(m38893b.getInt(m38891b4) != 0);
                c4573b.m23103o(m38893b.getInt(m38891b5) != 0);
                c4573b.m23104p(m38893b.getLong(m38891b6));
                c4573b.m23105q(m38893b.getLong(m38891b7));
                c4573b.m23098j(C6642v.m30619b(m38893b.getBlob(m38891b8)));
                C6636p c6636p = new C6636p(string, string2);
                c6636p.f34574b = C6642v.m30624g(m38893b.getInt(m38891b10));
                c6636p.f34576d = m38893b.getString(m38891b12);
                c6636p.f34577e = C0757b.m4870g(m38893b.getBlob(m38891b13));
                c6636p.f34578f = C0757b.m4870g(m38893b.getBlob(m38891b14));
                c6636p.f34579g = m38893b.getLong(m38891b15);
                c6636p.f34580h = m38893b.getLong(m38891b16);
                c6636p.f34581i = m38893b.getLong(m38891b17);
                c6636p.f34583k = m38893b.getInt(m38891b18);
                c6636p.f34584l = C6642v.m30621d(m38893b.getInt(m38891b19));
                c6636p.f34585m = m38893b.getLong(m38891b20);
                c6636p.f34586n = m38893b.getLong(m38891b21);
                c6636p.f34587o = m38893b.getLong(m38891b22);
                c6636p.f34588p = m38893b.getLong(m38891b23);
                c6636p.f34589q = m38893b.getInt(m38891b24) != 0;
                c6636p.f34590r = C6642v.m30623f(m38893b.getInt(m38891b25));
                c6636p.f34582j = c4573b;
                arrayList.add(c6636p);
            }
            m38893b.close();
            m36935o.m36944t();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            m38893b.close();
            m36935o.m36944t();
            throw th;
        }
    }

    @Override // p223n2.InterfaceC6637q
    /* renamed from: k */
    public int mo30603k() {
        this.f34599a.m36897b();
        InterfaceC9401f m36949a = this.f34607i.m36949a();
        this.f34599a.m36898c();
        try {
            int mo39729H = m36949a.mo39729H();
            this.f34599a.m36910r();
            return mo39729H;
        } finally {
            this.f34599a.m36900g();
            this.f34607i.m36953f(m36949a);
        }
    }

    @Override // p223n2.InterfaceC6637q
    /* renamed from: l */
    public int mo30604l(C4591t.a aVar, String... strArr) {
        this.f34599a.m36897b();
        StringBuilder m38897b = C9227e.m38897b();
        m38897b.append("UPDATE workspec SET state=");
        m38897b.append("?");
        m38897b.append(" WHERE id IN (");
        C9227e.m38896a(m38897b, strArr.length);
        m38897b.append(")");
        InterfaceC9401f m36899d = this.f34599a.m36899d(m38897b.toString());
        m36899d.mo36941m0(1, C6642v.m30627j(aVar));
        int i10 = 2;
        for (String str : strArr) {
            if (str == null) {
                m36899d.mo36945t0(i10);
            } else {
                m36899d.mo36938h0(i10, str);
            }
            i10++;
        }
        this.f34599a.m36898c();
        try {
            int mo39729H = m36899d.mo39729H();
            this.f34599a.m36910r();
            return mo39729H;
        } finally {
            this.f34599a.m36900g();
        }
    }

    @Override // p223n2.InterfaceC6637q
    /* renamed from: m */
    public int mo30605m(String str, long j10) {
        this.f34599a.m36897b();
        InterfaceC9401f m36949a = this.f34606h.m36949a();
        m36949a.mo36941m0(1, j10);
        if (str == null) {
            m36949a.mo36945t0(2);
        } else {
            m36949a.mo36938h0(2, str);
        }
        this.f34599a.m36898c();
        try {
            int mo39729H = m36949a.mo39729H();
            this.f34599a.m36910r();
            return mo39729H;
        } finally {
            this.f34599a.m36900g();
            this.f34606h.m36953f(m36949a);
        }
    }

    @Override // p223n2.InterfaceC6637q
    /* renamed from: n */
    public List<C6636p.b> mo30606n(String str) {
        C8600h m36935o = C8600h.m36935o("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            m36935o.mo36945t0(1);
        } else {
            m36935o.mo36938h0(1, str);
        }
        this.f34599a.m36897b();
        Cursor m38893b = C9225c.m38893b(this.f34599a, m36935o, false, null);
        try {
            int m38891b = C9224b.m38891b(m38893b, Name.MARK);
            int m38891b2 = C9224b.m38891b(m38893b, "state");
            ArrayList arrayList = new ArrayList(m38893b.getCount());
            while (m38893b.moveToNext()) {
                C6636p.b bVar = new C6636p.b();
                bVar.f34591a = m38893b.getString(m38891b);
                bVar.f34592b = C6642v.m30624g(m38893b.getInt(m38891b2));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            m38893b.close();
            m36935o.m36944t();
        }
    }

    @Override // p223n2.InterfaceC6637q
    /* renamed from: o */
    public List<C6636p> mo30607o(int i10) {
        int m38891b;
        int m38891b2;
        int m38891b3;
        int m38891b4;
        int m38891b5;
        int m38891b6;
        int m38891b7;
        int m38891b8;
        int m38891b9;
        int m38891b10;
        int m38891b11;
        int m38891b12;
        int m38891b13;
        int m38891b14;
        C8600h m36935o = C8600h.m36935o("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        m36935o.mo36941m0(1, i10);
        this.f34599a.m36897b();
        Cursor m38893b = C9225c.m38893b(this.f34599a, m36935o, false, null);
        try {
            m38891b = C9224b.m38891b(m38893b, "required_network_type");
            m38891b2 = C9224b.m38891b(m38893b, "requires_charging");
            m38891b3 = C9224b.m38891b(m38893b, "requires_device_idle");
            m38891b4 = C9224b.m38891b(m38893b, "requires_battery_not_low");
            m38891b5 = C9224b.m38891b(m38893b, "requires_storage_not_low");
            m38891b6 = C9224b.m38891b(m38893b, "trigger_content_update_delay");
            m38891b7 = C9224b.m38891b(m38893b, "trigger_max_content_delay");
            m38891b8 = C9224b.m38891b(m38893b, "content_uri_triggers");
            m38891b9 = C9224b.m38891b(m38893b, Name.MARK);
            m38891b10 = C9224b.m38891b(m38893b, "state");
            m38891b11 = C9224b.m38891b(m38893b, "worker_class_name");
            m38891b12 = C9224b.m38891b(m38893b, "input_merger_class_name");
            m38891b13 = C9224b.m38891b(m38893b, "input");
            m38891b14 = C9224b.m38891b(m38893b, "output");
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            int m38891b15 = C9224b.m38891b(m38893b, "initial_delay");
            int m38891b16 = C9224b.m38891b(m38893b, "interval_duration");
            int m38891b17 = C9224b.m38891b(m38893b, "flex_duration");
            int m38891b18 = C9224b.m38891b(m38893b, "run_attempt_count");
            int m38891b19 = C9224b.m38891b(m38893b, "backoff_policy");
            int m38891b20 = C9224b.m38891b(m38893b, "backoff_delay_duration");
            int m38891b21 = C9224b.m38891b(m38893b, "period_start_time");
            int m38891b22 = C9224b.m38891b(m38893b, "minimum_retention_duration");
            int m38891b23 = C9224b.m38891b(m38893b, "schedule_requested_at");
            int m38891b24 = C9224b.m38891b(m38893b, "run_in_foreground");
            int m38891b25 = C9224b.m38891b(m38893b, "out_of_quota_policy");
            ArrayList arrayList = new ArrayList(m38893b.getCount());
            while (m38893b.moveToNext()) {
                String string = m38893b.getString(m38891b9);
                String string2 = m38893b.getString(m38891b11);
                C4573b c4573b = new C4573b();
                c4573b.m23099k(C6642v.m30622e(m38893b.getInt(m38891b)));
                c4573b.m23101m(m38893b.getInt(m38891b2) != 0);
                c4573b.m23102n(m38893b.getInt(m38891b3) != 0);
                c4573b.m23100l(m38893b.getInt(m38891b4) != 0);
                c4573b.m23103o(m38893b.getInt(m38891b5) != 0);
                c4573b.m23104p(m38893b.getLong(m38891b6));
                c4573b.m23105q(m38893b.getLong(m38891b7));
                c4573b.m23098j(C6642v.m30619b(m38893b.getBlob(m38891b8)));
                C6636p c6636p = new C6636p(string, string2);
                c6636p.f34574b = C6642v.m30624g(m38893b.getInt(m38891b10));
                c6636p.f34576d = m38893b.getString(m38891b12);
                c6636p.f34577e = C0757b.m4870g(m38893b.getBlob(m38891b13));
                c6636p.f34578f = C0757b.m4870g(m38893b.getBlob(m38891b14));
                c6636p.f34579g = m38893b.getLong(m38891b15);
                c6636p.f34580h = m38893b.getLong(m38891b16);
                c6636p.f34581i = m38893b.getLong(m38891b17);
                c6636p.f34583k = m38893b.getInt(m38891b18);
                c6636p.f34584l = C6642v.m30621d(m38893b.getInt(m38891b19));
                c6636p.f34585m = m38893b.getLong(m38891b20);
                c6636p.f34586n = m38893b.getLong(m38891b21);
                c6636p.f34587o = m38893b.getLong(m38891b22);
                c6636p.f34588p = m38893b.getLong(m38891b23);
                c6636p.f34589q = m38893b.getInt(m38891b24) != 0;
                c6636p.f34590r = C6642v.m30623f(m38893b.getInt(m38891b25));
                c6636p.f34582j = c4573b;
                arrayList.add(c6636p);
            }
            m38893b.close();
            m36935o.m36944t();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            m38893b.close();
            m36935o.m36944t();
            throw th;
        }
    }

    @Override // p223n2.InterfaceC6637q
    /* renamed from: p */
    public void mo30608p(String str, C0757b c0757b) {
        this.f34599a.m36897b();
        InterfaceC9401f m36949a = this.f34602d.m36949a();
        byte[] m4871n = C0757b.m4871n(c0757b);
        if (m4871n == null) {
            m36949a.mo36945t0(1);
        } else {
            m36949a.mo36942n0(1, m4871n);
        }
        if (str == null) {
            m36949a.mo36945t0(2);
        } else {
            m36949a.mo36938h0(2, str);
        }
        this.f34599a.m36898c();
        try {
            m36949a.mo39729H();
            this.f34599a.m36910r();
        } finally {
            this.f34599a.m36900g();
            this.f34602d.m36953f(m36949a);
        }
    }

    @Override // p223n2.InterfaceC6637q
    /* renamed from: q */
    public List<C6636p> mo30609q() {
        int m38891b;
        int m38891b2;
        int m38891b3;
        int m38891b4;
        int m38891b5;
        int m38891b6;
        int m38891b7;
        int m38891b8;
        int m38891b9;
        int m38891b10;
        int m38891b11;
        int m38891b12;
        int m38891b13;
        int m38891b14;
        C8600h m36935o = C8600h.m36935o("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f34599a.m36897b();
        Cursor m38893b = C9225c.m38893b(this.f34599a, m36935o, false, null);
        try {
            m38891b = C9224b.m38891b(m38893b, "required_network_type");
            m38891b2 = C9224b.m38891b(m38893b, "requires_charging");
            m38891b3 = C9224b.m38891b(m38893b, "requires_device_idle");
            m38891b4 = C9224b.m38891b(m38893b, "requires_battery_not_low");
            m38891b5 = C9224b.m38891b(m38893b, "requires_storage_not_low");
            m38891b6 = C9224b.m38891b(m38893b, "trigger_content_update_delay");
            m38891b7 = C9224b.m38891b(m38893b, "trigger_max_content_delay");
            m38891b8 = C9224b.m38891b(m38893b, "content_uri_triggers");
            m38891b9 = C9224b.m38891b(m38893b, Name.MARK);
            m38891b10 = C9224b.m38891b(m38893b, "state");
            m38891b11 = C9224b.m38891b(m38893b, "worker_class_name");
            m38891b12 = C9224b.m38891b(m38893b, "input_merger_class_name");
            m38891b13 = C9224b.m38891b(m38893b, "input");
            m38891b14 = C9224b.m38891b(m38893b, "output");
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            int m38891b15 = C9224b.m38891b(m38893b, "initial_delay");
            int m38891b16 = C9224b.m38891b(m38893b, "interval_duration");
            int m38891b17 = C9224b.m38891b(m38893b, "flex_duration");
            int m38891b18 = C9224b.m38891b(m38893b, "run_attempt_count");
            int m38891b19 = C9224b.m38891b(m38893b, "backoff_policy");
            int m38891b20 = C9224b.m38891b(m38893b, "backoff_delay_duration");
            int m38891b21 = C9224b.m38891b(m38893b, "period_start_time");
            int m38891b22 = C9224b.m38891b(m38893b, "minimum_retention_duration");
            int m38891b23 = C9224b.m38891b(m38893b, "schedule_requested_at");
            int m38891b24 = C9224b.m38891b(m38893b, "run_in_foreground");
            int m38891b25 = C9224b.m38891b(m38893b, "out_of_quota_policy");
            ArrayList arrayList = new ArrayList(m38893b.getCount());
            while (m38893b.moveToNext()) {
                String string = m38893b.getString(m38891b9);
                String string2 = m38893b.getString(m38891b11);
                C4573b c4573b = new C4573b();
                c4573b.m23099k(C6642v.m30622e(m38893b.getInt(m38891b)));
                c4573b.m23101m(m38893b.getInt(m38891b2) != 0);
                c4573b.m23102n(m38893b.getInt(m38891b3) != 0);
                c4573b.m23100l(m38893b.getInt(m38891b4) != 0);
                c4573b.m23103o(m38893b.getInt(m38891b5) != 0);
                c4573b.m23104p(m38893b.getLong(m38891b6));
                c4573b.m23105q(m38893b.getLong(m38891b7));
                c4573b.m23098j(C6642v.m30619b(m38893b.getBlob(m38891b8)));
                C6636p c6636p = new C6636p(string, string2);
                c6636p.f34574b = C6642v.m30624g(m38893b.getInt(m38891b10));
                c6636p.f34576d = m38893b.getString(m38891b12);
                c6636p.f34577e = C0757b.m4870g(m38893b.getBlob(m38891b13));
                c6636p.f34578f = C0757b.m4870g(m38893b.getBlob(m38891b14));
                c6636p.f34579g = m38893b.getLong(m38891b15);
                c6636p.f34580h = m38893b.getLong(m38891b16);
                c6636p.f34581i = m38893b.getLong(m38891b17);
                c6636p.f34583k = m38893b.getInt(m38891b18);
                c6636p.f34584l = C6642v.m30621d(m38893b.getInt(m38891b19));
                c6636p.f34585m = m38893b.getLong(m38891b20);
                c6636p.f34586n = m38893b.getLong(m38891b21);
                c6636p.f34587o = m38893b.getLong(m38891b22);
                c6636p.f34588p = m38893b.getLong(m38891b23);
                c6636p.f34589q = m38893b.getInt(m38891b24) != 0;
                c6636p.f34590r = C6642v.m30623f(m38893b.getInt(m38891b25));
                c6636p.f34582j = c4573b;
                arrayList.add(c6636p);
            }
            m38893b.close();
            m36935o.m36944t();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            m38893b.close();
            m36935o.m36944t();
            throw th;
        }
    }

    @Override // p223n2.InterfaceC6637q
    /* renamed from: r */
    public boolean mo30610r() {
        C8600h m36935o = C8600h.m36935o("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f34599a.m36897b();
        Cursor m38893b = C9225c.m38893b(this.f34599a, m36935o, false, null);
        boolean z10 = false;
        try {
            if (m38893b.moveToFirst()) {
                z10 = false;
                if (m38893b.getInt(0) != 0) {
                    z10 = true;
                }
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

    @Override // p223n2.InterfaceC6637q
    /* renamed from: s */
    public int mo30611s(String str) {
        this.f34599a.m36897b();
        InterfaceC9401f m36949a = this.f34605g.m36949a();
        if (str == null) {
            m36949a.mo36945t0(1);
        } else {
            m36949a.mo36938h0(1, str);
        }
        this.f34599a.m36898c();
        try {
            int mo39729H = m36949a.mo39729H();
            this.f34599a.m36910r();
            return mo39729H;
        } finally {
            this.f34599a.m36900g();
            this.f34605g.m36953f(m36949a);
        }
    }

    @Override // p223n2.InterfaceC6637q
    /* renamed from: t */
    public int mo30612t(String str) {
        this.f34599a.m36897b();
        InterfaceC9401f m36949a = this.f34604f.m36949a();
        if (str == null) {
            m36949a.mo36945t0(1);
        } else {
            m36949a.mo36938h0(1, str);
        }
        this.f34599a.m36898c();
        try {
            int mo39729H = m36949a.mo39729H();
            this.f34599a.m36910r();
            return mo39729H;
        } finally {
            this.f34599a.m36900g();
            this.f34604f.m36953f(m36949a);
        }
    }

    @Override // p223n2.InterfaceC6637q
    /* renamed from: u */
    public void mo30613u(String str, long j10) {
        this.f34599a.m36897b();
        InterfaceC9401f m36949a = this.f34603e.m36949a();
        m36949a.mo36941m0(1, j10);
        if (str == null) {
            m36949a.mo36945t0(2);
        } else {
            m36949a.mo36938h0(2, str);
        }
        this.f34599a.m36898c();
        try {
            m36949a.mo39729H();
            this.f34599a.m36910r();
        } finally {
            this.f34599a.m36900g();
            this.f34603e.m36953f(m36949a);
        }
    }
}
