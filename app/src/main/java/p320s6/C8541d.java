package p320s6;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import org.apache.http.cookie.ClientCookie;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:s6/d.class
 */
/* renamed from: s6.d */
/* loaded from: combined.jar:classes2.jar:s6/d.class */
public final class C8541d {
    /* renamed from: a */
    public static String[] m36765a(int i10, String str) {
        return new String[]{Integer.toString(i10), str};
    }

    /* renamed from: b */
    public static int m36766b(SQLiteDatabase sQLiteDatabase, int i10, String str) {
        try {
            if (!C4401z0.m22367a1(sQLiteDatabase, "ExoPlayerVersions")) {
                return -1;
            }
            Cursor query = sQLiteDatabase.query("ExoPlayerVersions", new String[]{ClientCookie.VERSION_ATTR}, "feature = ? AND instance_uid = ?", m36765a(i10, str), null, null, null);
            try {
                if (query.getCount() == 0) {
                    query.close();
                    return -1;
                }
                query.moveToNext();
                int i11 = query.getInt(0);
                query.close();
                return i11;
            } finally {
            }
        } catch (SQLException e10) {
            throw new C8538a(e10);
        }
    }

    /* renamed from: c */
    public static void m36767c(SQLiteDatabase sQLiteDatabase, int i10, String str) {
        try {
            if (C4401z0.m22367a1(sQLiteDatabase, "ExoPlayerVersions")) {
                sQLiteDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", m36765a(i10, str));
            }
        } catch (SQLException e10) {
            throw new C8538a(e10);
        }
    }

    /* renamed from: d */
    public static void m36768d(SQLiteDatabase sQLiteDatabase, int i10, String str, int i11) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i10));
            contentValues.put("instance_uid", str);
            contentValues.put(ClientCookie.VERSION_ATTR, Integer.valueOf(i11));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e10) {
            throw new C8538a(e10);
        }
    }
}
