package p134hg;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import org.jetbrains.annotations.NotNull;
import p103fg.EnumC4858b;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hg/i.class
 */
/* renamed from: hg.i */
/* loaded from: combined.jar:classes2.jar:hg/i.class */
public final class C5086i {
    /* renamed from: a */
    public final void m25391a(@NotNull SQLiteDatabase sQLiteDatabase) {
        C9367f.m39526e(sQLiteDatabase, "db");
        String m39532k = C9367f.m39532k("_id,name", ",notification_id");
        String m39532k2 = C9367f.m39532k("_id,name", ",channel_influence_id");
        try {
            try {
                sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
                sQLiteDatabase.execSQL("INSERT INTO cached_unique_outcome(" + m39532k2 + ") SELECT " + m39532k + " FROM cached_unique_outcome_notification;");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("UPDATE cached_unique_outcome SET channel_type = '");
                sb2.append(EnumC4858b.NOTIFICATION);
                sb2.append("';");
                sQLiteDatabase.execSQL(sb2.toString());
                sQLiteDatabase.execSQL("DROP TABLE cached_unique_outcome_notification;");
            } catch (SQLiteException e10) {
                e10.printStackTrace();
            }
        } finally {
            sQLiteDatabase.execSQL("COMMIT;");
        }
    }

    /* renamed from: b */
    public final void m25392b(@NotNull SQLiteDatabase sQLiteDatabase) {
        C9367f.m39526e(sQLiteDatabase, "db");
        try {
            try {
                sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                sQLiteDatabase.execSQL("CREATE TEMPORARY TABLE outcome_backup(_id,session,notification_ids,name,timestamp);");
                sQLiteDatabase.execSQL("INSERT INTO outcome_backup SELECT _id,session,notification_ids,name,timestamp FROM outcome;");
                sQLiteDatabase.execSQL("DROP TABLE outcome;");
                sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,session TEXT,notification_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
                sQLiteDatabase.execSQL("INSERT INTO outcome (_id,session,notification_ids,name,timestamp, weight) SELECT _id,session,notification_ids,name,timestamp, 0 FROM outcome_backup;");
                sQLiteDatabase.execSQL("DROP TABLE outcome_backup;");
            } catch (SQLiteException e10) {
                e10.printStackTrace();
            }
        } finally {
            sQLiteDatabase.execSQL("COMMIT;");
        }
    }

    /* renamed from: c */
    public final void m25393c(@NotNull SQLiteDatabase sQLiteDatabase) {
        C9367f.m39526e(sQLiteDatabase, "db");
        String m39532k = C9367f.m39532k("_id,name,timestamp,notification_ids,weight", ",session");
        String m39532k2 = C9367f.m39532k("_id,name,timestamp,notification_ids,weight", ",notification_influence_type");
        try {
            try {
                sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                sQLiteDatabase.execSQL("ALTER TABLE outcome RENAME TO outcome_aux;");
                sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
                sQLiteDatabase.execSQL("INSERT INTO outcome(" + m39532k2 + ") SELECT " + m39532k + " FROM outcome_aux;");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("DROP TABLE ");
                sb2.append("outcome_aux");
                sb2.append(';');
                sQLiteDatabase.execSQL(sb2.toString());
            } catch (SQLiteException e10) {
                e10.printStackTrace();
            }
        } finally {
            sQLiteDatabase.execSQL("COMMIT;");
        }
    }
}
