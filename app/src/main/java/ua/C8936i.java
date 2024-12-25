package ua;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/i.class
 */
/* renamed from: ua.i */
/* loaded from: combined.jar:classes2.jar:ua/i.class */
public final class C8936i extends SQLiteOpenHelper {

    /* renamed from: b */
    public final C8948j f41174b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8936i(C8948j c8948j, Context context, String str) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f41174b = c8948j;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        C8982l9 c8982l9;
        C8982l9 c8982l92;
        C8982l9 c8982l93;
        c8982l9 = this.f41174b.f41203e;
        this.f41174b.f41723a.m37797z();
        if (!c8982l9.m38114c(3600000L)) {
            throw new SQLiteException("Database open failed");
        }
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e10) {
            c8982l92 = this.f41174b.f41203e;
            c8982l92.m38112a();
            this.f41174b.f41723a.mo37780c().m38408o().m38326a("Opening the database failed, dropping and recreating it");
            this.f41174b.f41723a.m37797z();
            if (!this.f41174b.f41723a.mo37779b().getDatabasePath("google_app_measurement.db").delete()) {
                this.f41174b.f41723a.mo37780c().m38408o().m38327b("Failed to delete corrupted db file", "google_app_measurement.db");
            }
            try {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                c8982l93 = this.f41174b.f41203e;
                c8982l93.m38113b();
                return writableDatabase;
            } catch (SQLiteException e11) {
                this.f41174b.f41723a.mo37780c().m38408o().m38327b("Failed to open freshly created database", e11);
                throw e11;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C8960k.m38098b(this.f41174b.f41723a.mo37780c(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        C9128y3 mo37780c = this.f41174b.f41723a.mo37780c();
        strArr = C8948j.f41194f;
        C8960k.m38097a(mo37780c, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", strArr);
        C8960k.m38097a(this.f41174b.f41723a.mo37780c(), sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        C9128y3 mo37780c2 = this.f41174b.f41723a.mo37780c();
        strArr2 = C8948j.f41195g;
        C8960k.m38097a(mo37780c2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", strArr2);
        C9128y3 mo37780c3 = this.f41174b.f41723a.mo37780c();
        strArr3 = C8948j.f41196h;
        C8960k.m38097a(mo37780c3, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", strArr3);
        C9128y3 mo37780c4 = this.f41174b.f41723a.mo37780c();
        strArr4 = C8948j.f41198j;
        C8960k.m38097a(mo37780c4, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", strArr4);
        C8960k.m38097a(this.f41174b.f41723a.mo37780c(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        C9128y3 mo37780c5 = this.f41174b.f41723a.mo37780c();
        strArr5 = C8948j.f41197i;
        C8960k.m38097a(mo37780c5, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", strArr5);
        C9128y3 mo37780c6 = this.f41174b.f41723a.mo37780c();
        strArr6 = C8948j.f41199k;
        C8960k.m38097a(mo37780c6, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", strArr6);
        C9128y3 mo37780c7 = this.f41174b.f41723a.mo37780c();
        strArr7 = C8948j.f41200l;
        C8960k.m38097a(mo37780c7, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", strArr7);
        C8960k.m38097a(this.f41174b.f41723a.mo37780c(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        C9128y3 mo37780c8 = this.f41174b.f41723a.mo37780c();
        strArr8 = C8948j.f41201m;
        C8960k.m38097a(mo37780c8, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", strArr8);
        C8960k.m38097a(this.f41174b.f41723a.mo37780c(), sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
        C8960k.m38097a(this.f41174b.f41723a.mo37780c(), sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
        C8960k.m38097a(this.f41174b.f41723a.mo37780c(), sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
