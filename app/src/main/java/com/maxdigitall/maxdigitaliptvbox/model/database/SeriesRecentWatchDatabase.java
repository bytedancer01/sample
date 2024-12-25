package com.maxdigitall.maxdigitaliptvbox.model.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.maxdigitall.maxdigitaliptvbox.model.callback.GetEpisdoeDetailsCallback;
import java.util.ArrayList;
import org.simpleframework.xml.strategy.Name;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/database/SeriesRecentWatchDatabase.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/database/SeriesRecentWatchDatabase.class */
public class SeriesRecentWatchDatabase extends SQLiteOpenHelper {

    /* renamed from: b */
    public final String f16685b;

    /* renamed from: c */
    public final String f16686c;

    /* renamed from: d */
    public String f16687d;

    /* renamed from: e */
    public String f16688e;

    /* renamed from: f */
    public final String f16689f;

    /* renamed from: g */
    public final String f16690g;

    /* renamed from: h */
    public final String f16691h;

    /* renamed from: i */
    public String f16692i;

    /* renamed from: j */
    public final String f16693j;

    /* renamed from: k */
    public final String f16694k;

    /* renamed from: l */
    public final String f16695l;

    /* renamed from: m */
    public final String f16696m;

    /* renamed from: n */
    public final String f16697n;

    /* renamed from: o */
    public final String f16698o;

    /* renamed from: p */
    public final String f16699p;

    /* renamed from: q */
    public Context f16700q;

    /* renamed from: r */
    public SQLiteDatabase f16701r;

    /* renamed from: s */
    public String f16702s;

    /* renamed from: t */
    public String f16703t;

    /* renamed from: u */
    public String f16704u;

    /* renamed from: v */
    public String f16705v;

    /* renamed from: w */
    public String f16706w;

    /* renamed from: x */
    public String f16707x;

    /* renamed from: y */
    public String f16708y;

    /* renamed from: z */
    public String f16709z;

    public SeriesRecentWatchDatabase(Context context) {
        super(context, "iptv_series_recent_watch.db", (SQLiteDatabase.CursorFactory) null, 2);
        this.f16685b = Name.MARK;
        this.f16686c = "episode_id";
        this.f16687d = "episode_name";
        this.f16688e = "containerExtension";
        this.f16689f = "added";
        this.f16690g = "cover";
        this.f16691h = "image";
        this.f16692i = "episode_icon";
        this.f16693j = "series_main_image";
        this.f16694k = "is_recent_watched";
        this.f16695l = "series_num";
        this.f16696m = "season_num";
        this.f16697n = "episode_num";
        this.f16698o = "series_name";
        this.f16699p = "episode_duration_sec";
        this.f16702s = "CREATE TABLE IF NOT EXISTS iptv_series_recent_watch(id INTEGER PRIMARY KEY,episode_id TEXT," + this.f16687d + " TEXT," + this.f16688e + " TEXT,added TEXT," + this.f16692i + " TEXT,series_id TEXT,user_id_referred TEXT,elapsed_time TEXT,cat_id TEXT,cover TEXT,image TEXT,series_main_image TEXT,is_recent_watched TEXT,series_num TEXT,season_num TEXT,episode_num TEXT,series_name TEXT,episode_duration_sec TEXT)";
        this.f16703t = "ALTER TABLE iptv_series_recent_watch ADD COLUMN series_main_image TEXT;";
        this.f16704u = "ALTER TABLE iptv_series_recent_watch ADD COLUMN is_recent_watched TEXT;";
        this.f16705v = "ALTER TABLE iptv_series_recent_watch ADD COLUMN series_num TEXT;";
        this.f16706w = "ALTER TABLE iptv_series_recent_watch ADD COLUMN season_num TEXT;";
        this.f16707x = "ALTER TABLE iptv_series_recent_watch ADD COLUMN episode_num TEXT;";
        this.f16708y = "ALTER TABLE iptv_series_recent_watch ADD COLUMN series_name TEXT;";
        this.f16709z = "ALTER TABLE iptv_series_recent_watch ADD COLUMN episode_duration_sec TEXT;";
        this.f16700q = context;
    }

    /* renamed from: A0 */
    public Long m15319A0(String str) {
        Long l10 = -1L;
        Long l11 = -1;
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_series_recent_watch WHERE user_id_referred=" + SharepreferenceDBHandler.m15337A(this.f16700q) + " AND episode_id=" + str + " LIMIT 1", null);
            Long l12 = -1;
            if (rawQuery.moveToFirst()) {
                do {
                    Long l13 = l10;
                    l12 = Long.valueOf(Long.parseLong(rawQuery.getString(8)));
                    l10 = l12;
                } while (rawQuery.moveToNext());
            }
            l11 = l12;
            rawQuery.close();
            l11 = l12;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
        }
        return l11;
    }

    /* renamed from: B */
    public ArrayList<GetEpisdoeDetailsCallback> m15320B(String str) {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16700q);
        ArrayList<GetEpisdoeDetailsCallback> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_series_recent_watch WHERE episode_id='" + str + "'  AND  user_id_referred=" + m15337A, null);
            if (rawQuery.moveToFirst()) {
                do {
                    GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = new GetEpisdoeDetailsCallback();
                    getEpisdoeDetailsCallback.m14937G(rawQuery.getString(1));
                    getEpisdoeDetailsCallback.m14948R(rawQuery.getString(2));
                    getEpisdoeDetailsCallback.m14972x(rawQuery.getString(3));
                    getEpisdoeDetailsCallback.m14970v(rawQuery.getString(4));
                    getEpisdoeDetailsCallback.m14944N(rawQuery.getString(5));
                    getEpisdoeDetailsCallback.m14945O(rawQuery.getString(6));
                    getEpisdoeDetailsCallback.m14934D(rawQuery.getString(8));
                    getEpisdoeDetailsCallback.m14971w(rawQuery.getString(9));
                    getEpisdoeDetailsCallback.m14938H(rawQuery.getString(10));
                    getEpisdoeDetailsCallback.m14941K(rawQuery.getString(11));
                    getEpisdoeDetailsCallback.m14940J(rawQuery.getString(12));
                    getEpisdoeDetailsCallback.m14939I(rawQuery.getString(13));
                    getEpisdoeDetailsCallback.m14947Q(rawQuery.getString(14));
                    getEpisdoeDetailsCallback.m14943M(Integer.valueOf(rawQuery.getInt(15)));
                    getEpisdoeDetailsCallback.m14935E(Integer.valueOf(rawQuery.getInt(16)));
                    getEpisdoeDetailsCallback.m14946P(rawQuery.getString(17));
                    getEpisdoeDetailsCallback.m14933C(rawQuery.getString(18));
                    arrayList.add(getEpisdoeDetailsCallback);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
            return null;
        }
    }

    /* renamed from: B0 */
    public int m15321B0(String str) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_series_recent_watch WHERE episode_id='" + str + "' AND user_id_referred='" + SharepreferenceDBHandler.m15337A(this.f16700q) + "'", null);
            rawQuery.moveToFirst();
            int i10 = rawQuery.getInt(0);
            rawQuery.close();
            return i10;
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
            return 0;
        }
    }

    /* renamed from: C0 */
    public int m15322C0() {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16700q);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_recent_watched", "0");
            return writableDatabase.update("iptv_series_recent_watch", contentValues, "user_id_referred=" + m15337A, null);
        } catch (Exception e10) {
            return 0;
        }
    }

    /* renamed from: D0 */
    public int m15323D0(String str) {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16700q);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_recent_watched", "0");
            return writableDatabase.update("iptv_series_recent_watch", contentValues, "series_id=" + str + " AND user_id_referred=" + m15337A, null);
        } catch (Exception e10) {
            return 0;
        }
    }

    /* renamed from: E0 */
    public int m15324E0(String str, Long l10) {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16700q);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("elapsed_time", l10);
            return writableDatabase.update("iptv_series_recent_watch", contentValues, "episode_id=" + str + " AND user_id_referred=" + m15337A, null);
        } catch (Exception e10) {
            return 0;
        }
    }

    /* renamed from: f */
    public void m15325f(GetEpisdoeDetailsCallback getEpisdoeDetailsCallback) {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16700q);
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues();
            if (getEpisdoeDetailsCallback.m14958j() != null) {
                contentValues.put("episode_id", getEpisdoeDetailsCallback.m14958j());
            } else {
                contentValues.put("episode_id", "");
            }
            if (getEpisdoeDetailsCallback.m14969u() != null) {
                contentValues.put(this.f16687d, getEpisdoeDetailsCallback.m14969u());
            } else {
                contentValues.put(this.f16687d, "");
            }
            if (getEpisdoeDetailsCallback.m14951c() != null) {
                contentValues.put(this.f16688e, getEpisdoeDetailsCallback.m14951c());
            } else {
                contentValues.put(this.f16688e, "");
            }
            if (getEpisdoeDetailsCallback.m14949a() != null) {
                contentValues.put("added", getEpisdoeDetailsCallback.m14949a());
            } else {
                contentValues.put("added", "");
            }
            if (getEpisdoeDetailsCallback.m14955g() != null) {
                contentValues.put("elapsed_time", getEpisdoeDetailsCallback.m14955g());
            } else {
                contentValues.put("elapsed_time", "");
            }
            if (getEpisdoeDetailsCallback.m14965q() != null) {
                contentValues.put(this.f16692i, getEpisdoeDetailsCallback.m14965q());
            } else {
                contentValues.put(this.f16692i, "");
            }
            contentValues.put("user_id_referred", Integer.valueOf(m15337A));
            contentValues.put("cat_id", getEpisdoeDetailsCallback.m14950b());
            contentValues.put("series_id", getEpisdoeDetailsCallback.m14966r());
            if (getEpisdoeDetailsCallback.m14959k() != null) {
                contentValues.put("cover", getEpisdoeDetailsCallback.m14959k());
            } else {
                contentValues.put("cover", "");
            }
            if (getEpisdoeDetailsCallback.m14962n() != null) {
                contentValues.put("image", getEpisdoeDetailsCallback.m14962n());
            } else {
                contentValues.put("image", "");
            }
            if (getEpisdoeDetailsCallback.m14961m() != null) {
                contentValues.put("series_main_image", getEpisdoeDetailsCallback.m14961m());
            } else {
                contentValues.put("series_main_image", "");
            }
            contentValues.put("is_recent_watched", "1");
            if (getEpisdoeDetailsCallback.m14968t() != null) {
                contentValues.put("series_num", getEpisdoeDetailsCallback.m14968t());
            } else {
                contentValues.put("series_num", "");
            }
            if (getEpisdoeDetailsCallback.m14964p() != null) {
                contentValues.put("season_num", getEpisdoeDetailsCallback.m14964p());
            } else {
                contentValues.put("season_num", "");
            }
            if (getEpisdoeDetailsCallback.m14956h() != null) {
                contentValues.put("episode_num", getEpisdoeDetailsCallback.m14956h());
            } else {
                contentValues.put("episode_num", "");
            }
            if (getEpisdoeDetailsCallback.m14967s() != null) {
                contentValues.put("series_name", getEpisdoeDetailsCallback.m14967s());
            } else {
                contentValues.put("series_name", "");
            }
            if (getEpisdoeDetailsCallback.m14954f() != null) {
                contentValues.put("episode_duration_sec", getEpisdoeDetailsCallback.m14954f());
            } else {
                contentValues.put("episode_duration_sec", "");
            }
            writableDatabase.insert("iptv_series_recent_watch", null, contentValues);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: l */
    public void m15326l(ArrayList<GetEpisdoeDetailsCallback> arrayList) {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16700q);
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                contentValues.put("episode_id", arrayList.get(i10).m14958j());
                contentValues.put(this.f16687d, arrayList.get(i10).m14969u());
                contentValues.put(this.f16688e, arrayList.get(i10).m14951c());
                contentValues.put("added", arrayList.get(i10).m14949a());
                contentValues.put("elapsed_time", arrayList.get(i10).m14955g());
                contentValues.put(this.f16692i, arrayList.get(i10).m14965q());
                contentValues.put("user_id_referred", Integer.valueOf(m15337A));
                contentValues.put("cat_id", arrayList.get(i10).m14950b());
                contentValues.put("series_id", arrayList.get(i10).m14966r());
                contentValues.put("cover", arrayList.get(i10).m14959k());
                contentValues.put("image", arrayList.get(i10).m14962n());
                contentValues.put("series_main_image", arrayList.get(i10).m14961m());
                contentValues.put("is_recent_watched", arrayList.get(i10).m14960l());
                contentValues.put("series_num", arrayList.get(i10).m14968t());
                contentValues.put("season_num", arrayList.get(i10).m14964p());
                contentValues.put("episode_num", arrayList.get(i10).m14956h());
                contentValues.put("series_name", arrayList.get(i10).m14967s());
                contentValues.put("episode_duration_sec", arrayList.get(i10).m14954f());
                writableDatabase.insert("iptv_series_recent_watch", null, contentValues);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: o */
    public void m15327o() {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16700q);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f16701r = writableDatabase;
        writableDatabase.delete("iptv_series_recent_watch", "user_id_referred=" + m15337A + "", null);
        this.f16701r.close();
    }

    /* renamed from: o0 */
    public ArrayList<GetEpisdoeDetailsCallback> m15328o0(String str) {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16700q);
        ArrayList<GetEpisdoeDetailsCallback> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_series_recent_watch WHERE series_id='" + str + "'  AND  user_id_referred=" + m15337A + " ORDER BY " + Name.MARK + " DESC LIMIT 1", null);
            if (rawQuery.moveToFirst()) {
                do {
                    GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = new GetEpisdoeDetailsCallback();
                    getEpisdoeDetailsCallback.m14937G(rawQuery.getString(1));
                    getEpisdoeDetailsCallback.m14948R(rawQuery.getString(2));
                    getEpisdoeDetailsCallback.m14972x(rawQuery.getString(3));
                    getEpisdoeDetailsCallback.m14970v(rawQuery.getString(4));
                    getEpisdoeDetailsCallback.m14944N(rawQuery.getString(5));
                    getEpisdoeDetailsCallback.m14945O(rawQuery.getString(6));
                    getEpisdoeDetailsCallback.m14934D(rawQuery.getString(8));
                    getEpisdoeDetailsCallback.m14971w(rawQuery.getString(9));
                    getEpisdoeDetailsCallback.m14938H(rawQuery.getString(10));
                    getEpisdoeDetailsCallback.m14941K(rawQuery.getString(11));
                    getEpisdoeDetailsCallback.m14940J(rawQuery.getString(12));
                    getEpisdoeDetailsCallback.m14939I(rawQuery.getString(13));
                    getEpisdoeDetailsCallback.m14947Q(rawQuery.getString(14));
                    getEpisdoeDetailsCallback.m14943M(Integer.valueOf(rawQuery.getInt(15)));
                    getEpisdoeDetailsCallback.m14935E(Integer.valueOf(rawQuery.getInt(16)));
                    getEpisdoeDetailsCallback.m14946P(rawQuery.getString(17));
                    getEpisdoeDetailsCallback.m14933C(rawQuery.getString(18));
                    arrayList.add(getEpisdoeDetailsCallback);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(this.f16702s);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (i10 < 2) {
            sQLiteDatabase.execSQL(this.f16703t);
            sQLiteDatabase.execSQL(this.f16704u);
            sQLiteDatabase.execSQL(this.f16705v);
            sQLiteDatabase.execSQL(this.f16706w);
            sQLiteDatabase.execSQL(this.f16707x);
            sQLiteDatabase.execSQL(this.f16708y);
            sQLiteDatabase.execSQL(this.f16709z);
        }
    }

    /* renamed from: p */
    public void m15329p(String str) {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16700q);
            getWritableDatabase().execSQL("DELETE FROM iptv_series_recent_watch WHERE user_id_referred = '" + m15337A + "' AND series_id IN (" + str + ")");
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
        }
    }

    /* renamed from: q */
    public void m15330q(String str) {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16700q);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f16701r = writableDatabase;
            writableDatabase.delete("iptv_series_recent_watch", "episode_id='" + str + "'  AND  user_id_referred=" + m15337A + "", null);
            this.f16701r.close();
        } catch (Exception e10) {
        }
    }

    /* renamed from: q0 */
    public int m15331q0() {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_series_recent_watch WHERE user_id_referred=" + SharepreferenceDBHandler.m15337A(this.f16700q) + " AND is_recent_watched=1", null);
            rawQuery.moveToFirst();
            int i10 = rawQuery.getInt(0);
            rawQuery.close();
            return i10;
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
            return 0;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0094 -> B:8:0x005f). Please report as a decompilation issue!!! */
    /* renamed from: t */
    public ArrayList<GetEpisdoeDetailsCallback> m15332t() {
        int i10;
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT series_id FROM iptv_series_recent_watch WHERE user_id_referred=" + SharepreferenceDBHandler.m15337A(this.f16700q) + " ", null);
            ArrayList<GetEpisdoeDetailsCallback> arrayList = new ArrayList<>();
            if (rawQuery.moveToFirst()) {
                do {
                    try {
                        i10 = Integer.parseInt(rawQuery.getString(0));
                    } catch (NumberFormatException e10) {
                        i10 = 0;
                    }
                    GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = new GetEpisdoeDetailsCallback();
                    getEpisdoeDetailsCallback.m14945O(String.valueOf(i10));
                    arrayList.add(getEpisdoeDetailsCallback);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | SQLiteException e11) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00e9 A[Catch: SQLiteDatabaseLockedException | SQLiteException -> 0x01d7, SQLiteDatabaseLockedException | SQLiteException -> 0x01d7, SQLiteDatabaseLockedException | SQLiteException -> 0x01d7, SQLiteDatabaseLockedException | SQLiteException -> 0x01d7, LOOP:0: B:8:0x00e9->B:12:?, LOOP_START, TRY_ENTER, TRY_LEAVE, TryCatch #0 {SQLiteDatabaseLockedException | SQLiteException -> 0x01d7, blocks: (B:6:0x00d6, B:6:0x00d6, B:8:0x00e9, B:8:0x00e9, B:8:0x00e9, B:8:0x00e9, B:9:0x00ec, B:9:0x00ec, B:14:0x01cf), top: B:5:0x00d6 }] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<com.maxdigitall.maxdigitaliptvbox.model.callback.GetEpisdoeDetailsCallback> m15333v(java.lang.String r5, java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.model.database.SeriesRecentWatchDatabase.m15333v(java.lang.String, java.lang.String):java.util.ArrayList");
    }

    /* renamed from: v0 */
    public Long m15334v0(String str) {
        Long l10 = -1L;
        Long l11 = -1;
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_series_recent_watch WHERE user_id_referred=" + SharepreferenceDBHandler.m15337A(this.f16700q) + " AND episode_id=" + str + " LIMIT 1", null);
            Long l12 = -1;
            if (rawQuery.moveToFirst()) {
                do {
                    Long l13 = l10;
                    l12 = Long.valueOf(Long.parseLong(rawQuery.getString(18)));
                    l10 = l12;
                } while (rawQuery.moveToNext());
            }
            l11 = l12;
            rawQuery.close();
            l11 = l12;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
        }
        return l11;
    }

    /* renamed from: w */
    public ArrayList<GetEpisdoeDetailsCallback> m15335w() {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16700q);
        ArrayList<GetEpisdoeDetailsCallback> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  episode_id," + this.f16687d + "," + this.f16688e + ",added,elapsed_time,image,series_main_image,is_recent_watched,season_num,episode_num,episode_duration_sec,series_id FROM iptv_series_recent_watch WHERE user_id_referred=" + m15337A + "", null);
            if (rawQuery.moveToFirst()) {
                do {
                    GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = new GetEpisdoeDetailsCallback();
                    getEpisdoeDetailsCallback.m14937G(rawQuery.getString(0));
                    getEpisdoeDetailsCallback.m14948R(rawQuery.getString(1));
                    getEpisdoeDetailsCallback.m14972x(rawQuery.getString(2));
                    getEpisdoeDetailsCallback.m14970v(rawQuery.getString(3));
                    getEpisdoeDetailsCallback.m14934D(rawQuery.getString(4));
                    getEpisdoeDetailsCallback.m14941K(rawQuery.getString(5));
                    getEpisdoeDetailsCallback.m14940J(rawQuery.getString(6));
                    getEpisdoeDetailsCallback.m14939I(rawQuery.getString(7));
                    getEpisdoeDetailsCallback.m14943M(Integer.valueOf(rawQuery.getInt(8)));
                    getEpisdoeDetailsCallback.m14935E(Integer.valueOf(rawQuery.getInt(9)));
                    getEpisdoeDetailsCallback.m14933C(rawQuery.getString(10));
                    getEpisdoeDetailsCallback.m14945O(rawQuery.getString(11));
                    arrayList.add(getEpisdoeDetailsCallback);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x014e A[Catch: SQLiteDatabaseLockedException | SQLiteException -> 0x023c, SQLiteDatabaseLockedException | SQLiteException -> 0x023c, SQLiteDatabaseLockedException | SQLiteException -> 0x023c, SQLiteDatabaseLockedException | SQLiteException -> 0x023c, LOOP:0: B:11:0x014e->B:15:?, LOOP_START, TRY_ENTER, TRY_LEAVE, TryCatch #0 {SQLiteDatabaseLockedException | SQLiteException -> 0x023c, blocks: (B:9:0x013b, B:9:0x013b, B:11:0x014e, B:11:0x014e, B:11:0x014e, B:11:0x014e, B:12:0x0151, B:12:0x0151, B:17:0x0234), top: B:8:0x013b }] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<com.maxdigitall.maxdigitaliptvbox.model.callback.GetEpisdoeDetailsCallback> m15336y(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.model.database.SeriesRecentWatchDatabase.m15336y(java.lang.String):java.util.ArrayList");
    }
}
