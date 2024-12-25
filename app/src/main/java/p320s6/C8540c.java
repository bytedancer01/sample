package p320s6;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import p059d9.C4392v;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:s6/c.class
 */
/* renamed from: s6.c */
/* loaded from: combined.jar:classes2.jar:s6/c.class */
public final class C8540c extends SQLiteOpenHelper implements InterfaceC8539b {
    public C8540c(Context context) {
        super(context.getApplicationContext(), "exoplayer_internal.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: f */
    public static void m36764f(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query("sqlite_master", new String[]{"type", "name"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                String string = query.getString(0);
                String string2 = query.getString(1);
                if (!"sqlite_sequence".equals(string2)) {
                    String str = "DROP " + string + " IF EXISTS " + string2;
                    try {
                        sQLiteDatabase.execSQL(str);
                    } catch (SQLException e10) {
                        C4392v.m22271e("ExoDatabaseProvider", "Error executing " + str, e10);
                    }
                }
            } catch (Throwable th2) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        query.close();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        m36764f(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
