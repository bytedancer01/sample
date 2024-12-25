package ua;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/r3.class
 */
/* renamed from: ua.r3 */
/* loaded from: combined.jar:classes2.jar:ua/r3.class */
public final class C9048r3 extends SQLiteOpenHelper {

    /* renamed from: b */
    public final C9060s3 f41592b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9048r3(C9060s3 c9060s3, Context context, String str) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f41592b = c9060s3;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e10) {
            throw e10;
        } catch (SQLiteException e11) {
            this.f41592b.f41723a.mo37780c().m38408o().m38326a("Opening the local database failed, dropping and recreating it");
            this.f41592b.f41723a.m37797z();
            if (!this.f41592b.f41723a.mo37779b().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f41592b.f41723a.mo37780c().m38408o().m38327b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e12) {
                this.f41592b.f41723a.mo37780c().m38408o().m38327b("Failed to open local database. Events will bypass local storage", e12);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C8960k.m38098b(this.f41592b.f41723a.mo37780c(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C8960k.m38097a(this.f41592b.f41723a.mo37780c(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
