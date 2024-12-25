package p197l6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l6/t0.class
 */
/* renamed from: l6.t0 */
/* loaded from: combined.jar:classes1.jar:l6/t0.class */
public final class C5722t0 extends SQLiteOpenHelper {

    /* renamed from: d */
    public static final String f32075d = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: e */
    public static int f32076e = 5;

    /* renamed from: f */
    public static final a f32077f;

    /* renamed from: g */
    public static final a f32078g;

    /* renamed from: h */
    public static final a f32079h;

    /* renamed from: i */
    public static final a f32080i;

    /* renamed from: j */
    public static final a f32081j;

    /* renamed from: k */
    public static final List<a> f32082k;

    /* renamed from: b */
    public final int f32083b;

    /* renamed from: c */
    public boolean f32084c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l6/t0$a.class
     */
    /* renamed from: l6.t0$a */
    /* loaded from: combined.jar:classes1.jar:l6/t0$a.class */
    public interface a {
        /* renamed from: a */
        void mo28066a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: l6.o0
            @Override // p197l6.C5722t0.a
            /* renamed from: a */
            public final void mo28066a(SQLiteDatabase sQLiteDatabase) {
                C5722t0.m28074v(sQLiteDatabase);
            }
        };
        f32077f = aVar;
        a aVar2 = new a() { // from class: l6.p0
            @Override // p197l6.C5722t0.a
            /* renamed from: a */
            public final void mo28066a(SQLiteDatabase sQLiteDatabase) {
                C5722t0.m28075w(sQLiteDatabase);
            }
        };
        f32078g = aVar2;
        a aVar3 = new a() { // from class: l6.q0
            @Override // p197l6.C5722t0.a
            /* renamed from: a */
            public final void mo28066a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f32079h = aVar3;
        a aVar4 = new a() { // from class: l6.r0
            @Override // p197l6.C5722t0.a
            /* renamed from: a */
            public final void mo28066a(SQLiteDatabase sQLiteDatabase) {
                C5722t0.m28067B(sQLiteDatabase);
            }
        };
        f32080i = aVar4;
        a aVar5 = new a() { // from class: l6.s0
            @Override // p197l6.C5722t0.a
            /* renamed from: a */
            public final void mo28066a(SQLiteDatabase sQLiteDatabase) {
                C5722t0.m28071o0(sQLiteDatabase);
            }
        };
        f32081j = aVar5;
        f32082k = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public C5722t0(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f32084c = false;
        this.f32083b = i10;
    }

    /* renamed from: B */
    public static /* synthetic */ void m28067B(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* renamed from: o0 */
    public static /* synthetic */ void m28071o0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f32075d);
    }

    /* renamed from: v */
    public static /* synthetic */ void m28074v(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* renamed from: w */
    public static /* synthetic */ void m28075w(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f32084c = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m28077q0(sQLiteDatabase, this.f32083b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m28077q0(sQLiteDatabase, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m28078t(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        m28078t(sQLiteDatabase);
        m28079v0(sQLiteDatabase, i10, i11);
    }

    /* renamed from: q0 */
    public final void m28077q0(SQLiteDatabase sQLiteDatabase, int i10) {
        m28078t(sQLiteDatabase);
        m28079v0(sQLiteDatabase, 0, i10);
    }

    /* renamed from: t */
    public final void m28078t(SQLiteDatabase sQLiteDatabase) {
        if (this.f32084c) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    /* renamed from: v0 */
    public final void m28079v0(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = f32082k;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                f32082k.get(i10).mo28066a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }
}
