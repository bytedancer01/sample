package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import p237o2.C6871d;
import p237o2.C6873f;
import p342u1.AbstractC8784a;
import p375w1.InterfaceC9397b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/impl/a.class
 */
/* renamed from: androidx.work.impl.a */
/* loaded from: combined.jar:classes1.jar:androidx/work/impl/a.class */
public class C0761a {

    /* renamed from: a */
    public static AbstractC8784a f5199a = new a(1, 2);

    /* renamed from: b */
    public static AbstractC8784a f5200b = new b(3, 4);

    /* renamed from: c */
    public static AbstractC8784a f5201c = new c(4, 5);

    /* renamed from: d */
    public static AbstractC8784a f5202d = new d(6, 7);

    /* renamed from: e */
    public static AbstractC8784a f5203e = new e(7, 8);

    /* renamed from: f */
    public static AbstractC8784a f5204f = new f(8, 9);

    /* renamed from: g */
    public static AbstractC8784a f5205g = new g(11, 12);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/a$a.class
     */
    /* renamed from: androidx.work.impl.a$a */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/a$a.class */
    public class a extends AbstractC8784a {
        public a(int i10, int i11) {
            super(i10, i11);
        }

        @Override // p342u1.AbstractC8784a
        /* renamed from: a */
        public void mo4919a(InterfaceC9397b interfaceC9397b) {
            interfaceC9397b.mo39713F("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC9397b.mo39713F("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            interfaceC9397b.mo39713F("DROP TABLE IF EXISTS alarmInfo");
            interfaceC9397b.mo39713F("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/a$b.class
     */
    /* renamed from: androidx.work.impl.a$b */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/a$b.class */
    public class b extends AbstractC8784a {
        public b(int i10, int i11) {
            super(i10, i11);
        }

        @Override // p342u1.AbstractC8784a
        /* renamed from: a */
        public void mo4919a(InterfaceC9397b interfaceC9397b) {
            if (Build.VERSION.SDK_INT >= 23) {
                interfaceC9397b.mo39713F("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/a$c.class
     */
    /* renamed from: androidx.work.impl.a$c */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/a$c.class */
    public class c extends AbstractC8784a {
        public c(int i10, int i11) {
            super(i10, i11);
        }

        @Override // p342u1.AbstractC8784a
        /* renamed from: a */
        public void mo4919a(InterfaceC9397b interfaceC9397b) {
            interfaceC9397b.mo39713F("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            interfaceC9397b.mo39713F("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/a$d.class
     */
    /* renamed from: androidx.work.impl.a$d */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/a$d.class */
    public class d extends AbstractC8784a {
        public d(int i10, int i11) {
            super(i10, i11);
        }

        @Override // p342u1.AbstractC8784a
        /* renamed from: a */
        public void mo4919a(InterfaceC9397b interfaceC9397b) {
            interfaceC9397b.mo39713F("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/a$e.class
     */
    /* renamed from: androidx.work.impl.a$e */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/a$e.class */
    public class e extends AbstractC8784a {
        public e(int i10, int i11) {
            super(i10, i11);
        }

        @Override // p342u1.AbstractC8784a
        /* renamed from: a */
        public void mo4919a(InterfaceC9397b interfaceC9397b) {
            interfaceC9397b.mo39713F("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/a$f.class
     */
    /* renamed from: androidx.work.impl.a$f */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/a$f.class */
    public class f extends AbstractC8784a {
        public f(int i10, int i11) {
            super(i10, i11);
        }

        @Override // p342u1.AbstractC8784a
        /* renamed from: a */
        public void mo4919a(InterfaceC9397b interfaceC9397b) {
            interfaceC9397b.mo39713F("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/a$g.class
     */
    /* renamed from: androidx.work.impl.a$g */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/a$g.class */
    public class g extends AbstractC8784a {
        public g(int i10, int i11) {
            super(i10, i11);
        }

        @Override // p342u1.AbstractC8784a
        /* renamed from: a */
        public void mo4919a(InterfaceC9397b interfaceC9397b) {
            interfaceC9397b.mo39713F("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/a$h.class
     */
    /* renamed from: androidx.work.impl.a$h */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/a$h.class */
    public static class h extends AbstractC8784a {

        /* renamed from: c */
        public final Context f5206c;

        public h(Context context, int i10, int i11) {
            super(i10, i11);
            this.f5206c = context;
        }

        @Override // p342u1.AbstractC8784a
        /* renamed from: a */
        public void mo4919a(InterfaceC9397b interfaceC9397b) {
            if (this.f40744b >= 10) {
                interfaceC9397b.mo39715P("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f5206c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/a$i.class
     */
    /* renamed from: androidx.work.impl.a$i */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/a$i.class */
    public static class i extends AbstractC8784a {

        /* renamed from: c */
        public final Context f5207c;

        public i(Context context) {
            super(9, 10);
            this.f5207c = context;
        }

        @Override // p342u1.AbstractC8784a
        /* renamed from: a */
        public void mo4919a(InterfaceC9397b interfaceC9397b) {
            interfaceC9397b.mo39713F("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            C6873f.m31710b(this.f5207c, interfaceC9397b);
            C6871d.m31704a(this.f5207c, interfaceC9397b);
        }
    }
}
