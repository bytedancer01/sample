package androidx.work.impl;

import androidx.room.C0725c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.simpleframework.xml.strategy.Name;
import p223n2.C6623c;
import p223n2.C6626f;
import p223n2.C6629i;
import p223n2.C6632l;
import p223n2.C6635o;
import p223n2.C6638r;
import p223n2.C6641u;
import p223n2.InterfaceC6622b;
import p223n2.InterfaceC6625e;
import p223n2.InterfaceC6628h;
import p223n2.InterfaceC6631k;
import p223n2.InterfaceC6634n;
import p223n2.InterfaceC6637q;
import p223n2.InterfaceC6640t;
import p327t1.AbstractC8597e;
import p327t1.C8593a;
import p327t1.C8599g;
import p360v1.C9225c;
import p360v1.C9228f;
import p375w1.InterfaceC9397b;
import p375w1.InterfaceC9398c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/impl/WorkDatabase_Impl.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/work/impl/WorkDatabase_Impl.class */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: m */
    public volatile InterfaceC6637q f5191m;

    /* renamed from: n */
    public volatile InterfaceC6622b f5192n;

    /* renamed from: o */
    public volatile InterfaceC6640t f5193o;

    /* renamed from: p */
    public volatile InterfaceC6628h f5194p;

    /* renamed from: q */
    public volatile InterfaceC6631k f5195q;

    /* renamed from: r */
    public volatile InterfaceC6634n f5196r;

    /* renamed from: s */
    public volatile InterfaceC6625e f5197s;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/WorkDatabase_Impl$a.class
     */
    /* renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/WorkDatabase_Impl$a.class */
    public class C0760a extends C8599g.a {

        /* renamed from: b */
        public final WorkDatabase_Impl f5198b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0760a(WorkDatabase_Impl workDatabase_Impl, int i10) {
            super(i10);
            this.f5198b = workDatabase_Impl;
        }

        @Override // p327t1.C8599g.a
        /* renamed from: a */
        public void mo4912a(InterfaceC9397b interfaceC9397b) {
            interfaceC9397b.mo39713F("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC9397b.mo39713F("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            interfaceC9397b.mo39713F("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            interfaceC9397b.mo39713F("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            interfaceC9397b.mo39713F("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            interfaceC9397b.mo39713F("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            interfaceC9397b.mo39713F("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC9397b.mo39713F("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            interfaceC9397b.mo39713F("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC9397b.mo39713F("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC9397b.mo39713F("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            interfaceC9397b.mo39713F("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC9397b.mo39713F("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            interfaceC9397b.mo39713F("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC9397b.mo39713F("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // p327t1.C8599g.a
        /* renamed from: b */
        public void mo4913b(InterfaceC9397b interfaceC9397b) {
            interfaceC9397b.mo39713F("DROP TABLE IF EXISTS `Dependency`");
            interfaceC9397b.mo39713F("DROP TABLE IF EXISTS `WorkSpec`");
            interfaceC9397b.mo39713F("DROP TABLE IF EXISTS `WorkTag`");
            interfaceC9397b.mo39713F("DROP TABLE IF EXISTS `SystemIdInfo`");
            interfaceC9397b.mo39713F("DROP TABLE IF EXISTS `WorkName`");
            interfaceC9397b.mo39713F("DROP TABLE IF EXISTS `WorkProgress`");
            interfaceC9397b.mo39713F("DROP TABLE IF EXISTS `Preference`");
            if (this.f5198b.f40084h != null) {
                int size = this.f5198b.f40084h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((AbstractC8597e.b) this.f5198b.f40084h.get(i10)).m36919b(interfaceC9397b);
                }
            }
        }

        @Override // p327t1.C8599g.a
        /* renamed from: c */
        public void mo4914c(InterfaceC9397b interfaceC9397b) {
            if (this.f5198b.f40084h != null) {
                int size = this.f5198b.f40084h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((AbstractC8597e.b) this.f5198b.f40084h.get(i10)).m36918a(interfaceC9397b);
                }
            }
        }

        @Override // p327t1.C8599g.a
        /* renamed from: d */
        public void mo4915d(InterfaceC9397b interfaceC9397b) {
            this.f5198b.f40077a = interfaceC9397b;
            interfaceC9397b.mo39713F("PRAGMA foreign_keys = ON");
            this.f5198b.m36906m(interfaceC9397b);
            if (this.f5198b.f40084h != null) {
                int size = this.f5198b.f40084h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((AbstractC8597e.b) this.f5198b.f40084h.get(i10)).mo4898c(interfaceC9397b);
                }
            }
        }

        @Override // p327t1.C8599g.a
        /* renamed from: e */
        public void mo4916e(InterfaceC9397b interfaceC9397b) {
        }

        @Override // p327t1.C8599g.a
        /* renamed from: f */
        public void mo4917f(InterfaceC9397b interfaceC9397b) {
            C9225c.m38892a(interfaceC9397b);
        }

        @Override // p327t1.C8599g.a
        /* renamed from: g */
        public C8599g.b mo4918g(InterfaceC9397b interfaceC9397b) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new C9228f.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new C9228f.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C9228f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Name.MARK)));
            hashSet.add(new C9228f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(Name.MARK)));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C9228f.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new C9228f.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            C9228f c9228f = new C9228f("Dependency", hashMap, hashSet, hashSet2);
            C9228f m38898a = C9228f.m38898a(interfaceC9397b, "Dependency");
            if (!c9228f.equals(m38898a)) {
                return new C8599g.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + c9228f + "\n Found:\n" + m38898a);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put(Name.MARK, new C9228f.a(Name.MARK, "TEXT", true, 1, null, 1));
            hashMap2.put("state", new C9228f.a("state", "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new C9228f.a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new C9228f.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            hashMap2.put("input", new C9228f.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new C9228f.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new C9228f.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new C9228f.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new C9228f.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new C9228f.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new C9228f.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new C9228f.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_start_time", new C9228f.a("period_start_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new C9228f.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new C9228f.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new C9228f.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new C9228f.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("required_network_type", new C9228f.a("required_network_type", "INTEGER", false, 0, null, 1));
            hashMap2.put("requires_charging", new C9228f.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new C9228f.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new C9228f.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new C9228f.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new C9228f.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new C9228f.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new C9228f.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C9228f.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new C9228f.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            C9228f c9228f2 = new C9228f("WorkSpec", hashMap2, hashSet3, hashSet4);
            C9228f m38898a2 = C9228f.m38898a(interfaceC9397b, "WorkSpec");
            if (!c9228f2.equals(m38898a2)) {
                return new C8599g.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + c9228f2 + "\n Found:\n" + m38898a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new C9228f.a("tag", "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new C9228f.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C9228f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Name.MARK)));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C9228f.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            C9228f c9228f3 = new C9228f("WorkTag", hashMap3, hashSet5, hashSet6);
            C9228f m38898a3 = C9228f.m38898a(interfaceC9397b, "WorkTag");
            if (!c9228f3.equals(m38898a3)) {
                return new C8599g.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + c9228f3 + "\n Found:\n" + m38898a3);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new C9228f.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("system_id", new C9228f.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C9228f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Name.MARK)));
            C9228f c9228f4 = new C9228f("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            C9228f m38898a4 = C9228f.m38898a(interfaceC9397b, "SystemIdInfo");
            if (!c9228f4.equals(m38898a4)) {
                return new C8599g.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + c9228f4 + "\n Found:\n" + m38898a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new C9228f.a("name", "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new C9228f.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C9228f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Name.MARK)));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C9228f.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            C9228f c9228f5 = new C9228f("WorkName", hashMap5, hashSet8, hashSet9);
            C9228f m38898a5 = C9228f.m38898a(interfaceC9397b, "WorkName");
            if (!c9228f5.equals(m38898a5)) {
                return new C8599g.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + c9228f5 + "\n Found:\n" + m38898a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new C9228f.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put("progress", new C9228f.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C9228f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Name.MARK)));
            C9228f c9228f6 = new C9228f("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            C9228f m38898a6 = C9228f.m38898a(interfaceC9397b, "WorkProgress");
            if (!c9228f6.equals(m38898a6)) {
                return new C8599g.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + c9228f6 + "\n Found:\n" + m38898a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new C9228f.a("key", "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new C9228f.a("long_value", "INTEGER", false, 0, null, 1));
            C9228f c9228f7 = new C9228f("Preference", hashMap7, new HashSet(0), new HashSet(0));
            C9228f m38898a7 = C9228f.m38898a(interfaceC9397b, "Preference");
            if (c9228f7.equals(m38898a7)) {
                return new C8599g.b(true, null);
            }
            return new C8599g.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + c9228f7 + "\n Found:\n" + m38898a7);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: A */
    public InterfaceC6634n mo4890A() {
        InterfaceC6634n interfaceC6634n;
        if (this.f5196r != null) {
            return this.f5196r;
        }
        synchronized (this) {
            if (this.f5196r == null) {
                this.f5196r = new C6635o(this);
            }
            interfaceC6634n = this.f5196r;
        }
        return interfaceC6634n;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: B */
    public InterfaceC6637q mo4891B() {
        InterfaceC6637q interfaceC6637q;
        if (this.f5191m != null) {
            return this.f5191m;
        }
        synchronized (this) {
            if (this.f5191m == null) {
                this.f5191m = new C6638r(this);
            }
            interfaceC6637q = this.f5191m;
        }
        return interfaceC6637q;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: C */
    public InterfaceC6640t mo4892C() {
        InterfaceC6640t interfaceC6640t;
        if (this.f5193o != null) {
            return this.f5193o;
        }
        synchronized (this) {
            if (this.f5193o == null) {
                this.f5193o = new C6641u(this);
            }
            interfaceC6640t = this.f5193o;
        }
        return interfaceC6640t;
    }

    @Override // p327t1.AbstractC8597e
    /* renamed from: e */
    public C0725c mo4910e() {
        return new C0725c(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // p327t1.AbstractC8597e
    /* renamed from: f */
    public InterfaceC9398c mo4911f(C8593a c8593a) {
        return c8593a.f40060a.mo4897a(InterfaceC9398c.b.m39724a(c8593a.f40061b).m39727c(c8593a.f40062c).m39726b(new C8599g(c8593a, new C0760a(this, 12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).m39725a());
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: t */
    public InterfaceC6622b mo4893t() {
        InterfaceC6622b interfaceC6622b;
        if (this.f5192n != null) {
            return this.f5192n;
        }
        synchronized (this) {
            if (this.f5192n == null) {
                this.f5192n = new C6623c(this);
            }
            interfaceC6622b = this.f5192n;
        }
        return interfaceC6622b;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: x */
    public InterfaceC6625e mo4894x() {
        InterfaceC6625e interfaceC6625e;
        if (this.f5197s != null) {
            return this.f5197s;
        }
        synchronized (this) {
            if (this.f5197s == null) {
                this.f5197s = new C6626f(this);
            }
            interfaceC6625e = this.f5197s;
        }
        return interfaceC6625e;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: y */
    public InterfaceC6628h mo4895y() {
        InterfaceC6628h interfaceC6628h;
        if (this.f5194p != null) {
            return this.f5194p;
        }
        synchronized (this) {
            if (this.f5194p == null) {
                this.f5194p = new C6629i(this);
            }
            interfaceC6628h = this.f5194p;
        }
        return interfaceC6628h;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: z */
    public InterfaceC6631k mo4896z() {
        InterfaceC6631k interfaceC6631k;
        if (this.f5195q != null) {
            return this.f5195q;
        }
        synchronized (this) {
            if (this.f5195q == null) {
                this.f5195q = new C6632l(this);
            }
            interfaceC6631k = this.f5195q;
        }
        return interfaceC6631k;
    }
}
