package p039c9;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.simpleframework.xml.strategy.Name;
import p059d9.C4349a;
import p320s6.C8538a;
import p320s6.C8541d;
import p320s6.InterfaceC8539b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:c9/f.class
 */
/* renamed from: c9.f */
/* loaded from: combined.jar:classes2.jar:c9/f.class */
public final class C1036f {

    /* renamed from: c */
    public static final String[] f6971c = {"name", Name.LENGTH, "last_touch_timestamp"};

    /* renamed from: a */
    public final InterfaceC8539b f6972a;

    /* renamed from: b */
    public String f6973b;

    public C1036f(InterfaceC8539b interfaceC8539b) {
        this.f6972a = interfaceC8539b;
    }

    /* renamed from: a */
    public static void m6101a(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    /* renamed from: d */
    public static String m6102d(String str) {
        return "ExoPlayerCacheFileMetadata" + str;
    }

    /* renamed from: b */
    public Map<String, C1035e> m6103b() {
        try {
            Cursor m6104c = m6104c();
            try {
                HashMap hashMap = new HashMap(m6104c.getCount());
                while (m6104c.moveToNext()) {
                    hashMap.put((String) C4349a.m21882e(m6104c.getString(0)), new C1035e(m6104c.getLong(1), m6104c.getLong(2)));
                }
                m6104c.close();
                return hashMap;
            } finally {
            }
        } catch (SQLException e10) {
            throw new C8538a(e10);
        }
    }

    /* renamed from: c */
    public final Cursor m6104c() {
        C4349a.m21882e(this.f6973b);
        return this.f6972a.getReadableDatabase().query(this.f6973b, f6971c, null, null, null, null, null);
    }

    /* renamed from: e */
    public void m6105e(long j10) {
        try {
            String hexString = Long.toHexString(j10);
            this.f6973b = m6102d(hexString);
            if (C8541d.m36766b(this.f6972a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f6972a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    C8541d.m36768d(writableDatabase, 2, hexString, 1);
                    m6101a(writableDatabase, this.f6973b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f6973b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
        } catch (SQLException e10) {
            throw new C8538a(e10);
        }
    }

    /* renamed from: f */
    public void m6106f(String str) {
        C4349a.m21882e(this.f6973b);
        try {
            this.f6972a.getWritableDatabase().delete(this.f6973b, "name = ?", new String[]{str});
        } catch (SQLException e10) {
            throw new C8538a(e10);
        }
    }

    /* renamed from: g */
    public void m6107g(Set<String> set) {
        C4349a.m21882e(this.f6973b);
        try {
            SQLiteDatabase writableDatabase = this.f6972a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f6973b, "name = ?", new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new C8538a(e10);
        }
    }

    /* renamed from: h */
    public void m6108h(String str, long j10, long j11) {
        C4349a.m21882e(this.f6973b);
        try {
            SQLiteDatabase writableDatabase = this.f6972a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put(Name.LENGTH, Long.valueOf(j10));
            contentValues.put("last_touch_timestamp", Long.valueOf(j11));
            writableDatabase.replaceOrThrow(this.f6973b, null, contentValues);
        } catch (SQLException e10) {
            throw new C8538a(e10);
        }
    }
}
