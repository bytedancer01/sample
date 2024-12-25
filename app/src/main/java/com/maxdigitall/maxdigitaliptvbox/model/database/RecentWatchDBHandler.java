package com.maxdigitall.maxdigitaliptvbox.model.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.PanelAvailableChannelsPojo;
import java.util.ArrayList;
import org.simpleframework.xml.strategy.Name;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/database/RecentWatchDBHandler.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/database/RecentWatchDBHandler.class */
public class RecentWatchDBHandler extends SQLiteOpenHelper {

    /* renamed from: b */
    public Context f16679b;

    /* renamed from: c */
    public SQLiteDatabase f16680c;

    /* renamed from: d */
    public String f16681d;

    /* renamed from: e */
    public String f16682e;

    /* renamed from: f */
    public String f16683f;

    /* renamed from: g */
    public String f16684g;

    public RecentWatchDBHandler(Context context) {
        super(context, "iptv_movie_streams_recent_watch.db", (SQLiteDatabase.CursorFactory) null, 3);
        this.f16681d = "CREATE TABLE IF NOT EXISTS iptv_movie_streams_recent_watch(id INTEGER PRIMARY KEY,num TEXT,name TEXT,stream_type TEXT,stream_id TEXT,stream_icon TEXT,epg_channel_id TEXT,added TEXT,categoryID TEXT,custom_sid TEXT,tv_archive TEXT,direct_source TEXT,tv_archive_duration TEXT,type_name TEXT,category_name TEXT,series_no TEXT,live TEXT,container_extension TEXT,user_id_referred TEXT,movie_elapsed_time TEXT,movie_duration TEXT,is_watched TEXT,rating_from_ten TEXT,rating_from_five TEXT)";
        this.f16682e = "ALTER TABLE iptv_movie_streams_recent_watch ADD COLUMN is_watched TEXT;";
        this.f16683f = "ALTER TABLE iptv_movie_streams_recent_watch ADD COLUMN rating_from_ten TEXT;";
        this.f16684g = "ALTER TABLE iptv_movie_streams_recent_watch ADD COLUMN rating_from_five TEXT;";
        this.f16679b = context;
    }

    /* renamed from: A0 */
    public int m15299A0(int i10) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_movie_streams_recent_watch WHERE user_id_referred=" + i10 + "", null);
            rawQuery.moveToFirst();
            int i11 = rawQuery.getInt(0);
            rawQuery.close();
            return i11;
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00dd A[Catch: SQLiteDatabaseLockedException | SQLiteException -> 0x0236, SQLiteDatabaseLockedException | SQLiteException -> 0x0236, SQLiteDatabaseLockedException | SQLiteException -> 0x0236, SQLiteDatabaseLockedException | SQLiteException -> 0x0236, LOOP:0: B:8:0x00dd->B:17:?, LOOP_START, TRY_ENTER, TRY_LEAVE, TryCatch #0 {SQLiteDatabaseLockedException | SQLiteException -> 0x0236, blocks: (B:6:0x00ca, B:6:0x00ca, B:8:0x00dd, B:8:0x00dd, B:8:0x00dd, B:8:0x00dd, B:9:0x00e0, B:9:0x00e0, B:12:0x00e9, B:14:0x00f8, B:14:0x00f8, B:21:0x022e, B:21:0x022e), top: B:5:0x00ca }] */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel> m15300B(java.lang.String r5, java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.model.database.RecentWatchDBHandler.m15300B(java.lang.String, java.lang.String):java.util.ArrayList");
    }

    /* renamed from: B0 */
    public ArrayList<LiveStreamsDBModel> m15301B0(String str, int i10) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM iptv_movie_streams_recent_watch WHERE stream_id = '" + str + "' AND user_id_referred = '" + i10 + "' LIMIT 1", null);
            ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
            if (rawQuery.moveToFirst()) {
                do {
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    try {
                        liveStreamsDBModel.m14826f0(Integer.parseInt(rawQuery.getString(0)));
                    } catch (NumberFormatException e10) {
                    }
                    liveStreamsDBModel.m14834l0(rawQuery.getString(1));
                    liveStreamsDBModel.m14833k0(rawQuery.getString(2));
                    liveStreamsDBModel.m14841s0(rawQuery.getString(3));
                    liveStreamsDBModel.m14840r0(rawQuery.getString(4));
                    liveStreamsDBModel.m14839q0(rawQuery.getString(5));
                    liveStreamsDBModel.m14824d0(rawQuery.getString(6));
                    liveStreamsDBModel.m14817X(rawQuery.getString(7));
                    liveStreamsDBModel.m14818Y(rawQuery.getString(8));
                    liveStreamsDBModel.m14821b0(rawQuery.getString(9));
                    liveStreamsDBModel.m14842t0(rawQuery.getString(10));
                    liveStreamsDBModel.m14822c0(rawQuery.getString(11));
                    liveStreamsDBModel.m14843u0(rawQuery.getString(12));
                    liveStreamsDBModel.m14844v0(rawQuery.getString(13));
                    liveStreamsDBModel.m14819Z(rawQuery.getString(14));
                    liveStreamsDBModel.m14838p0(rawQuery.getString(15));
                    liveStreamsDBModel.m14829h0(rawQuery.getString(16));
                    liveStreamsDBModel.m14820a0(rawQuery.getString(17));
                    liveStreamsDBModel.m14847x0(rawQuery.getInt(18));
                    liveStreamsDBModel.m14832j0(rawQuery.getLong(19));
                    liveStreamsDBModel.m14831i0(rawQuery.getLong(20));
                    liveStreamsDBModel.m14828g0(rawQuery.getString(21));
                    liveStreamsDBModel.m14837o0(rawQuery.getString(22));
                    liveStreamsDBModel.m14836n0(rawQuery.getString(23));
                    arrayList.add(liveStreamsDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | SQLiteException e11) {
            return null;
        }
    }

    /* renamed from: C0 */
    public int m15302C0() {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_movie_streams_recent_watch WHERE user_id_referred=" + SharepreferenceDBHandler.m15337A(this.f16679b) + " AND is_watched=1", null);
            rawQuery.moveToFirst();
            int i10 = rawQuery.getInt(0);
            rawQuery.close();
            return i10;
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
            return 0;
        }
    }

    /* renamed from: D0 */
    public int m15303D0(String str, int i10) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_movie_streams_recent_watch WHERE stream_id='" + str + "' AND user_id_referred='" + i10 + "'", null);
            rawQuery.moveToFirst();
            int i11 = rawQuery.getInt(0);
            rawQuery.close();
            return i11;
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
            return 0;
        }
    }

    /* renamed from: E0 */
    public int m15304E0() {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16679b);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_watched", "0");
            return writableDatabase.update("iptv_movie_streams_recent_watch", contentValues, "user_id_referred=" + m15337A, null);
        } catch (Exception e10) {
            return 0;
        }
    }

    /* renamed from: F0 */
    public int m15305F0(String str) {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16679b);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_watched", "0");
            return writableDatabase.update("iptv_movie_streams_recent_watch", contentValues, "stream_id=" + str + " AND user_id_referred=" + m15337A, null);
        } catch (Exception e10) {
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b6 A[Catch: SQLiteException -> 0x00fe, SQLiteDatabaseLockedException -> 0x010b, TRY_LEAVE, TryCatch #3 {SQLiteDatabaseLockedException -> 0x010b, SQLiteException -> 0x00fe, blocks: (B:2:0x0000, B:4:0x005f, B:22:0x006b, B:23:0x0089, B:8:0x00ad, B:10:0x00b6, B:12:0x00e7, B:18:0x00f5, B:31:0x0096, B:33:0x009f), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f0  */
    /* renamed from: G0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m15306G0(java.lang.String r10, java.lang.String r11, boolean r12, long r13) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.model.database.RecentWatchDBHandler.m15306G0(java.lang.String, java.lang.String, boolean, long):boolean");
    }

    /* renamed from: f */
    public void m15307f(PanelAvailableChannelsPojo panelAvailableChannelsPojo) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues();
            if (panelAvailableChannelsPojo.m15450l() != null) {
                contentValues.put("num", String.valueOf(panelAvailableChannelsPojo.m15450l()));
            } else {
                contentValues.put("num", "");
            }
            if (panelAvailableChannelsPojo.m15449k() != null) {
                contentValues.put("name", panelAvailableChannelsPojo.m15449k());
            } else {
                contentValues.put("name", "");
            }
            if (panelAvailableChannelsPojo.m15456r() != null) {
                contentValues.put("stream_type", panelAvailableChannelsPojo.m15456r());
            } else {
                contentValues.put("stream_type", "");
            }
            if (panelAvailableChannelsPojo.m15455q() != null) {
                contentValues.put("stream_id", panelAvailableChannelsPojo.m15455q());
            } else {
                contentValues.put("stream_id", "");
            }
            if (panelAvailableChannelsPojo.m15454p() != null) {
                contentValues.put("stream_icon", panelAvailableChannelsPojo.m15454p());
            } else {
                contentValues.put("stream_icon", "");
            }
            if (panelAvailableChannelsPojo.m15445g() != null) {
                contentValues.put("epg_channel_id", panelAvailableChannelsPojo.m15445g());
            } else {
                contentValues.put("epg_channel_id", "");
            }
            if (panelAvailableChannelsPojo.m15439a() != null) {
                contentValues.put("added", panelAvailableChannelsPojo.m15439a());
            } else {
                contentValues.put("added", "");
            }
            if (panelAvailableChannelsPojo.m15440b() != null) {
                contentValues.put("categoryID", panelAvailableChannelsPojo.m15440b());
            } else {
                contentValues.put("categoryID", "");
            }
            if (panelAvailableChannelsPojo.m15443e() != null) {
                contentValues.put("custom_sid", panelAvailableChannelsPojo.m15443e());
            } else {
                contentValues.put("custom_sid", "");
            }
            if (panelAvailableChannelsPojo.m15457s() != null) {
                contentValues.put("tv_archive", panelAvailableChannelsPojo.m15457s());
            } else {
                contentValues.put("tv_archive", "");
            }
            if (panelAvailableChannelsPojo.m15444f() != null) {
                contentValues.put("direct_source", panelAvailableChannelsPojo.m15444f());
            } else {
                contentValues.put("direct_source", "");
            }
            if (panelAvailableChannelsPojo.m15458t() != null) {
                contentValues.put("tv_archive_duration", panelAvailableChannelsPojo.m15458t());
            } else {
                contentValues.put("tv_archive_duration", "");
            }
            if (panelAvailableChannelsPojo.m15459u() != null) {
                contentValues.put("type_name", String.valueOf(panelAvailableChannelsPojo.m15459u()));
            } else {
                contentValues.put("type_name", "");
            }
            if (panelAvailableChannelsPojo.m15441c() != null) {
                contentValues.put("category_name", panelAvailableChannelsPojo.m15441c());
            } else {
                contentValues.put("category_name", "");
            }
            if (panelAvailableChannelsPojo.m15453o() != null) {
                contentValues.put("series_no", String.valueOf(panelAvailableChannelsPojo.m15453o()));
            } else {
                contentValues.put("series_no", "");
            }
            if (panelAvailableChannelsPojo.m15446h() != null) {
                contentValues.put("series_no", String.valueOf(panelAvailableChannelsPojo.m15453o()));
            } else {
                contentValues.put("series_no", "");
            }
            if (panelAvailableChannelsPojo.m15446h() != null) {
                contentValues.put("live", panelAvailableChannelsPojo.m15446h());
            } else {
                contentValues.put("live", "");
            }
            if (panelAvailableChannelsPojo.m15442d() != null) {
                contentValues.put("container_extension", String.valueOf(panelAvailableChannelsPojo.m15442d()));
            } else {
                contentValues.put("container_extension", "");
            }
            contentValues.put("user_id_referred", panelAvailableChannelsPojo.m15460v() != -1 ? Integer.valueOf(panelAvailableChannelsPojo.m15460v()) : -1);
            if (panelAvailableChannelsPojo.m15448j() != -1) {
                contentValues.put("movie_elapsed_time", Long.valueOf(panelAvailableChannelsPojo.m15448j()));
            } else {
                contentValues.put("movie_elapsed_time", (Integer) (-1));
            }
            if (panelAvailableChannelsPojo.m15447i() != -1) {
                contentValues.put("movie_duration", Long.valueOf(panelAvailableChannelsPojo.m15447i()));
            } else {
                contentValues.put("movie_duration", (Integer) (-1));
            }
            contentValues.put("is_watched", "1");
            if (panelAvailableChannelsPojo.m15452n() != null) {
                contentValues.put("rating_from_ten", panelAvailableChannelsPojo.m15452n());
            } else {
                contentValues.put("rating_from_ten", "");
            }
            if (panelAvailableChannelsPojo.m15451m() != null) {
                contentValues.put("rating_from_five", String.valueOf(panelAvailableChannelsPojo.m15451m()));
            } else {
                contentValues.put("rating_from_five", "");
            }
            writableDatabase.insert("iptv_movie_streams_recent_watch", null, contentValues);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: l */
    public void m15308l(ArrayList<LiveStreamsDBModel> arrayList) {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16679b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                contentValues.put("num", arrayList.get(i10).m14805L());
                contentValues.put("name", arrayList.get(i10).getName());
                contentValues.put("stream_type", arrayList.get(i10).m14812S());
                contentValues.put("stream_id", arrayList.get(i10).m14811R());
                contentValues.put("stream_icon", arrayList.get(i10).m14810Q());
                contentValues.put("epg_channel_id", "");
                contentValues.put("added", arrayList.get(i10).m14823d());
                contentValues.put("categoryID", arrayList.get(i10).m14827g());
                contentValues.put("custom_sid", "");
                contentValues.put("tv_archive", "");
                contentValues.put("direct_source", "");
                contentValues.put("tv_archive_duration", "");
                contentValues.put("type_name", "");
                contentValues.put("category_name", "");
                contentValues.put("series_no", "");
                contentValues.put("live", "");
                contentValues.put("container_extension", arrayList.get(i10).m14846x());
                contentValues.put("user_id_referred", Integer.valueOf(m15337A));
                contentValues.put("movie_elapsed_time", Long.valueOf(arrayList.get(i10).m14804K()));
                contentValues.put("movie_duration", Long.valueOf(arrayList.get(i10).m14803J()));
                contentValues.put("is_watched", arrayList.get(i10).m14801H());
                contentValues.put("rating_from_ten", arrayList.get(i10).m14808O());
                contentValues.put("rating_from_five", arrayList.get(i10).m14807N());
                writableDatabase.insert("iptv_movie_streams_recent_watch", null, contentValues);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: o */
    public void m15309o(int i10) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f16680c = writableDatabase;
            writableDatabase.delete("iptv_movie_streams_recent_watch", "user_id_referred='" + i10 + "'", null);
            this.f16680c.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
        }
    }

    /* renamed from: o0 */
    public ArrayList<LiveStreamsDBModel> m15310o0() {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16679b);
        ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  movie_elapsed_time,movie_duration,is_watched,stream_id FROM iptv_movie_streams_recent_watch WHERE user_id_referred=" + m15337A, null);
            if (rawQuery.moveToFirst()) {
                do {
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    liveStreamsDBModel.m14832j0(rawQuery.getLong(0));
                    liveStreamsDBModel.m14831i0(rawQuery.getLong(1));
                    liveStreamsDBModel.m14828g0(rawQuery.getString(2));
                    liveStreamsDBModel.m14840r0(rawQuery.getString(3));
                    arrayList.add(liveStreamsDBModel);
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
        sQLiteDatabase.execSQL(this.f16681d);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (i10 < 2) {
            sQLiteDatabase.execSQL(this.f16682e);
        }
        if (i10 < 3) {
            sQLiteDatabase.execSQL(this.f16683f);
            sQLiteDatabase.execSQL(this.f16684g);
        }
    }

    /* renamed from: p */
    public void m15311p(String str, int i10) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f16680c = writableDatabase;
        writableDatabase.delete("iptv_movie_streams_recent_watch", "stream_type='" + str + "' AND user_id_referred=" + i10 + "", null);
        this.f16680c.close();
    }

    /* renamed from: q */
    public void m15312q(String str) {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16679b);
            getWritableDatabase().execSQL("DELETE FROM iptv_movie_streams_recent_watch WHERE user_id_referred = '" + m15337A + "' AND stream_id IN (" + str + ")");
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
        }
    }

    /* renamed from: q0 */
    public int m15313q0(int i10) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_movie_streams_recent_watch WHERE user_id_referred='" + i10 + "'", null);
            rawQuery.moveToFirst();
            int i11 = rawQuery.getInt(0);
            rawQuery.close();
            return i11;
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
            return 0;
        }
    }

    /* renamed from: t */
    public void m15314t(String str) {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16679b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f16680c = writableDatabase;
            writableDatabase.delete("iptv_movie_streams_recent_watch", "stream_id='" + str + "'  AND  user_id_referred=" + m15337A + "", null);
            this.f16680c.close();
        } catch (Exception e10) {
        }
    }

    /* renamed from: v */
    public void m15315v(int i10, String str) {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16679b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f16680c = writableDatabase;
            writableDatabase.delete("iptv_movie_streams_recent_watch", "stream_id='" + i10 + "'  AND stream_type='" + str + "' AND user_id_referred=" + m15337A + "", null);
            this.f16680c.close();
        } catch (Exception e10) {
        }
    }

    /* renamed from: v0 */
    public ArrayList<LiveStreamsDBModel> m15316v0(int i10) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM iptv_movie_streams_recent_watch WHERE stream_id = '" + i10 + "' AND user_id_referred = '" + SharepreferenceDBHandler.m15337A(this.f16679b) + "' ORDER BY " + Name.MARK + " DESC LIMIT 1", null);
            ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
            if (rawQuery.moveToFirst()) {
                do {
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    try {
                        liveStreamsDBModel.m14826f0(Integer.parseInt(rawQuery.getString(0)));
                    } catch (NumberFormatException e10) {
                    }
                    liveStreamsDBModel.m14834l0(rawQuery.getString(1));
                    liveStreamsDBModel.m14833k0(rawQuery.getString(2));
                    liveStreamsDBModel.m14841s0(rawQuery.getString(3));
                    liveStreamsDBModel.m14840r0(rawQuery.getString(4));
                    liveStreamsDBModel.m14839q0(rawQuery.getString(5));
                    liveStreamsDBModel.m14824d0(rawQuery.getString(6));
                    liveStreamsDBModel.m14817X(rawQuery.getString(7));
                    liveStreamsDBModel.m14818Y(rawQuery.getString(8));
                    liveStreamsDBModel.m14821b0(rawQuery.getString(9));
                    liveStreamsDBModel.m14842t0(rawQuery.getString(10));
                    liveStreamsDBModel.m14822c0(rawQuery.getString(11));
                    liveStreamsDBModel.m14843u0(rawQuery.getString(12));
                    liveStreamsDBModel.m14844v0(rawQuery.getString(13));
                    liveStreamsDBModel.m14819Z(rawQuery.getString(14));
                    liveStreamsDBModel.m14838p0(rawQuery.getString(15));
                    liveStreamsDBModel.m14829h0(rawQuery.getString(16));
                    liveStreamsDBModel.m14820a0(rawQuery.getString(17));
                    liveStreamsDBModel.m14847x0(rawQuery.getInt(18));
                    liveStreamsDBModel.m14832j0(rawQuery.getLong(19));
                    liveStreamsDBModel.m14831i0(rawQuery.getLong(20));
                    liveStreamsDBModel.m14828g0(rawQuery.getString(21));
                    liveStreamsDBModel.m14837o0(rawQuery.getString(22));
                    liveStreamsDBModel.m14836n0(rawQuery.getString(23));
                    arrayList.add(liveStreamsDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | SQLiteException e11) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x013e A[Catch: SQLiteDatabaseLockedException | SQLiteException -> 0x0297, SQLiteDatabaseLockedException | SQLiteException -> 0x0297, SQLiteDatabaseLockedException | SQLiteException -> 0x0297, SQLiteDatabaseLockedException | SQLiteException -> 0x0297, LOOP:0: B:11:0x013e->B:20:?, LOOP_START, TRY_ENTER, TRY_LEAVE, TryCatch #0 {SQLiteDatabaseLockedException | SQLiteException -> 0x0297, blocks: (B:9:0x012b, B:9:0x012b, B:11:0x013e, B:11:0x013e, B:11:0x013e, B:11:0x013e, B:12:0x0141, B:12:0x0141, B:15:0x014a, B:17:0x0159, B:17:0x0159, B:24:0x028f, B:24:0x028f), top: B:8:0x012b }] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel> m15317w(java.lang.String r5, int r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.model.database.RecentWatchDBHandler.m15317w(java.lang.String, int, java.lang.String):java.util.ArrayList");
    }

    /* renamed from: y */
    public ArrayList<LiveStreamsDBModel> m15318y() {
        int i10;
        SharepreferenceDBHandler.m15337A(this.f16679b);
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT stream_id FROM iptv_movie_streams_recent_watch WHERE stream_type LIKE '%movie%' AND user_id_referred=" + SharepreferenceDBHandler.m15337A(this.f16679b) + " ", null);
            ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
            if (rawQuery.moveToFirst()) {
                do {
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    try {
                        i10 = Integer.parseInt(rawQuery.getString(0));
                    } catch (NumberFormatException e10) {
                        i10 = 0;
                    }
                    liveStreamsDBModel.m14840r0(String.valueOf(i10));
                    arrayList.add(liveStreamsDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | SQLiteException e11) {
            return null;
        }
    }
}
