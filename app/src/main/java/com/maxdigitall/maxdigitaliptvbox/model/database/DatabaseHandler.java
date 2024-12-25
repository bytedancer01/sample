package com.maxdigitall.maxdigitaliptvbox.model.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/database/DatabaseHandler.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/database/DatabaseHandler.class */
public class DatabaseHandler extends SQLiteOpenHelper {

    /* renamed from: b */
    public Context f16606b;

    /* renamed from: c */
    public SQLiteDatabase f16607c;

    /* renamed from: d */
    public String f16608d;

    /* renamed from: e */
    public String f16609e;

    /* renamed from: f */
    public String f16610f;

    /* renamed from: g */
    public String f16611g;

    public DatabaseHandler(Context context) {
        super(context, "iptv_smarters_tv.db", (SQLiteDatabase.CursorFactory) null, 3);
        this.f16608d = "CREATE TABLE IF NOT EXISTS iptv_favourites(id INTEGER PRIMARY KEY,type TEXT,streamID TEXT,categoryID TEXT,name TEXT,user_id_referred TEXT,num TEXT)";
        this.f16609e = "ALTER TABLE iptv_favourites ADD COLUMN name TEXT;";
        this.f16610f = "ALTER TABLE iptv_favourites ADD COLUMN user_id_referred TEXT;";
        this.f16611g = "ALTER TABLE iptv_favourites ADD COLUMN num TEXT;";
        this.f16606b = context;
    }

    /* renamed from: B */
    public int m15109B(String str, int i10) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_favourites WHERE type LIKE '%" + str + "%' AND user_id_referred=" + i10 + "  ", null);
            rawQuery.moveToFirst();
            int i11 = rawQuery.getInt(0);
            rawQuery.close();
            return i11;
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
            return 0;
        }
    }

    /* renamed from: f */
    public void m15110f(ArrayList<LiveStreamsDBModel> arrayList) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16606b);
        try {
            ContentValues contentValues = new ContentValues();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                contentValues.put("type", arrayList.get(i10).m14812S().equals("movie") ? "vod" : arrayList.get(i10).m14812S());
                contentValues.put("streamID", arrayList.get(i10).m14811R());
                contentValues.put("categoryID", arrayList.get(i10).m14827g());
                contentValues.put("name", arrayList.get(i10).getName());
                contentValues.put("user_id_referred", Integer.valueOf(m15337A));
                contentValues.put("num", arrayList.get(i10).m14805L());
                writableDatabase.insert("iptv_favourites", null, contentValues);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            writableDatabase.endTransaction();
            Log.w("msg", "exception");
        }
    }

    /* renamed from: l */
    public void m15111l(FavouriteDBModel favouriteDBModel, String str) {
        try {
            this.f16607c = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", str);
            contentValues.put("streamID", Integer.valueOf(favouriteDBModel.m14764e()));
            contentValues.put("categoryID", favouriteDBModel.m14760a());
            contentValues.put("name", favouriteDBModel.m14762c());
            contentValues.put("user_id_referred", Integer.valueOf(favouriteDBModel.m14766g()));
            contentValues.put("num", favouriteDBModel.m14763d());
            this.f16607c.insert("iptv_favourites", null, contentValues);
            this.f16607c.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
        }
    }

    /* renamed from: o */
    public ArrayList<FavouriteDBModel> m15112o(int i10, String str, String str2, int i11) {
        int i12;
        ArrayList<FavouriteDBModel> arrayList = new ArrayList<>();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f16607c = readableDatabase;
            Cursor rawQuery = readableDatabase.rawQuery("SELECT  * FROM iptv_favourites WHERE streamID='" + i10 + "' AND categoryID='" + str + "' AND type LIKE '%" + str2 + "%'  AND user_id_referred=" + i11 + "", null);
            if (rawQuery.moveToFirst()) {
                do {
                    try {
                        i12 = Integer.parseInt(rawQuery.getString(2));
                    } catch (NumberFormatException e10) {
                        i12 = -1;
                    }
                    FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
                    favouriteDBModel.m14769j(Integer.parseInt(rawQuery.getString(0)));
                    favouriteDBModel.m14773n(rawQuery.getString(1));
                    favouriteDBModel.m14772m(i12);
                    favouriteDBModel.m14767h(rawQuery.getString(3));
                    arrayList.add(favouriteDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | SQLiteException e11) {
            Log.w("msg", "exception");
            return arrayList;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.e("fav_oncreate", "asdfasdfsadfa");
        sQLiteDatabase.execSQL(this.f16608d);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        Log.e("fav_upgrade", "oldVersion:" + i10 + "newversion:" + i11);
        if (i11 >= 3) {
            sQLiteDatabase.execSQL(this.f16609e);
            sQLiteDatabase.execSQL(this.f16610f);
            sQLiteDatabase.execSQL(this.f16611g);
        }
    }

    /* renamed from: p */
    public void m15113p(int i10) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f16607c = writableDatabase;
            writableDatabase.delete("iptv_favourites", "user_id_referred='" + i10 + "'", null);
            this.f16607c.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
        }
    }

    /* renamed from: q */
    public void m15114q(String str) {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16606b);
            getWritableDatabase().execSQL("DELETE FROM iptv_favourites WHERE user_id_referred = '" + m15337A + "' AND streamID IN (" + str + ")");
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
        }
    }

    /* renamed from: t */
    public void m15115t(int i10, String str, String str2, String str3, int i11) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f16607c = writableDatabase;
            writableDatabase.delete("iptv_favourites", "streamID='" + i10 + "' AND user_id_referred=" + i11, null);
            this.f16607c.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(1:3)(2:49|(1:60)(2:53|(1:55)(2:56|(1:58)(1:59))))|4|(1:6)(11:32|(1:34)(2:36|(1:38)(2:39|(1:41)(2:42|(1:44)(2:45|(1:47)(1:48)))))|35|8|9|10|(1:(7:12|13|14|15|16|17|18))|25|26|27|28)|7|8|9|10|(0)|25|26|27|28) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x02c9 A[Catch: SQLiteDatabaseLockedException | SQLiteException -> 0x034f, SQLiteDatabaseLockedException | SQLiteException -> 0x034f, SQLiteDatabaseLockedException | SQLiteException -> 0x034f, LOOP:0: B:12:0x02c9->B:21:?, LOOP_START, TRY_ENTER, TRY_LEAVE, TryCatch #1 {SQLiteDatabaseLockedException | SQLiteException -> 0x034f, blocks: (B:10:0x02ac, B:12:0x02c9, B:12:0x02c9, B:12:0x02c9, B:13:0x02cc, B:13:0x02cc, B:16:0x02d6, B:16:0x02d6, B:18:0x02f9, B:18:0x02f9, B:26:0x0347, B:26:0x0347), top: B:9:0x02ac }] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<com.maxdigitall.maxdigitaliptvbox.model.FavouriteDBModel> m15116v(java.lang.String r5, int r6) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler.m15116v(java.lang.String, int):java.util.ArrayList");
    }

    /* renamed from: w */
    public ArrayList<FavouriteDBModel> m15117w() {
        String str = "SELECT GROUP_CONCAT(streamID) AS streamID , type FROM iptv_favourites WHERE user_id_referred=" + SharepreferenceDBHandler.m15337A(this.f16606b) + " GROUP BY type";
        ArrayList<FavouriteDBModel> arrayList = new ArrayList<>();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f16607c = readableDatabase;
            Cursor rawQuery = readableDatabase.rawQuery(str, null);
            if (rawQuery.moveToFirst()) {
                do {
                    FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
                    favouriteDBModel.m14768i(rawQuery.getString(0));
                    favouriteDBModel.m14773n(rawQuery.getString(1));
                    arrayList.add(favouriteDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
        }
        return arrayList;
    }

    /* renamed from: y */
    public ArrayList<FavouriteDBModel> m15118y(String str) {
        int i10;
        ArrayList<FavouriteDBModel> arrayList = new ArrayList<>();
        String str2 = "SELECT  streamID FROM iptv_favourites WHERE type LIKE '%" + str + "%' AND user_id_referred=" + SharepreferenceDBHandler.m15337A(this.f16606b) + " ";
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f16607c = readableDatabase;
            Cursor rawQuery = readableDatabase.rawQuery(str2, null);
            if (rawQuery.moveToFirst()) {
                do {
                    FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
                    try {
                        i10 = Integer.parseInt(rawQuery.getString(0));
                    } catch (NumberFormatException e10) {
                        i10 = 0;
                    }
                    favouriteDBModel.m14772m(i10);
                    arrayList.add(favouriteDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException e11) {
        }
        return arrayList;
    }
}
