package com.maxdigitall.maxdigitaliptvbox.model.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import android.util.Log;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteM3UModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamCategoryIdDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.M3UCategoriesModel;
import com.maxdigitall.maxdigitaliptvbox.model.callback.GetEpisdoeDetailsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.GetSeriesStreamCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.GetSeriesStreamCategoriesCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.LiveStreamCategoriesCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.LiveStreamsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.SeriesDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.callback.VodCategoriesCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.VodStreamsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.XMLTVProgrammePojo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import nf.C6783a;
import org.achartengine.ChartFactory;
import org.simpleframework.xml.strategy.Name;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/database/LiveStreamDBHandler.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/database/LiveStreamDBHandler.class */
public class LiveStreamDBHandler extends SQLiteOpenHelper {

    /* renamed from: A */
    public String f16627A;

    /* renamed from: B */
    public String f16628B;

    /* renamed from: C */
    public String f16629C;

    /* renamed from: D */
    public String f16630D;

    /* renamed from: E */
    public String f16631E;

    /* renamed from: F */
    public String f16632F;

    /* renamed from: G */
    public String f16633G;

    /* renamed from: H */
    public String f16634H;

    /* renamed from: I */
    public String f16635I;

    /* renamed from: b */
    public Context f16636b;

    /* renamed from: c */
    public SQLiteDatabase f16637c;

    /* renamed from: d */
    public int f16638d;

    /* renamed from: e */
    public String f16639e;

    /* renamed from: f */
    public String f16640f;

    /* renamed from: g */
    public String f16641g;

    /* renamed from: h */
    public String f16642h;

    /* renamed from: i */
    public String f16643i;

    /* renamed from: j */
    public String f16644j;

    /* renamed from: k */
    public String f16645k;

    /* renamed from: l */
    public String f16646l;

    /* renamed from: m */
    public String f16647m;

    /* renamed from: n */
    public String f16648n;

    /* renamed from: o */
    public String f16649o;

    /* renamed from: p */
    public String f16650p;

    /* renamed from: q */
    public String f16651q;

    /* renamed from: r */
    public String f16652r;

    /* renamed from: s */
    public String f16653s;

    /* renamed from: t */
    public String f16654t;

    /* renamed from: u */
    public String f16655u;

    /* renamed from: v */
    public String f16656v;

    /* renamed from: w */
    public String f16657w;

    /* renamed from: x */
    public String f16658x;

    /* renamed from: y */
    public String f16659y;

    /* renamed from: z */
    public String f16660z;

    public LiveStreamDBHandler(Context context) {
        super(context, "iptv_live_streams_tv.db", (SQLiteDatabase.CursorFactory) null, 7);
        this.f16638d = 0;
        this.f16639e = "CREATE TABLE IF NOT EXISTS iptv_live_category(id_live INTEGER PRIMARY KEY,categoryID_live TEXT,categoryname_live TEXT,paent_id TEXT,user_id_referred TEXT)";
        this.f16640f = "CREATE TABLE IF NOT EXISTS iptv_movie_category(id_movie INTEGER PRIMARY KEY,categoryID_movie TEXT,categoryname_movie TEXT,paent_id TEXT,user_id_referred TEXT)";
        this.f16641g = "CREATE TABLE IF NOT EXISTS iptv_live_streams_category(id INTEGER PRIMARY KEY,categoryID TEXT,categoryname TEXT)";
        this.f16642h = "CREATE TABLE IF NOT EXISTS iptv_m3u_all_category(id INTEGER PRIMARY KEY,categoryID TEXT,categoryname TEXT,user_id_referred TEXT)";
        this.f16643i = "CREATE TABLE IF NOT EXISTS iptv_live_category_m3u(id INTEGER PRIMARY KEY,categoryID TEXT,categoryname TEXT,user_id_referred TEXT)";
        this.f16644j = "CREATE TABLE IF NOT EXISTS iptv_movie_category_m3u(id INTEGER PRIMARY KEY,categoryID TEXT,categoryname TEXT,paent_id TEXT,user_id_referred TEXT)";
        this.f16645k = "CREATE TABLE IF NOT EXISTS iptv_series_category_m3u(id INTEGER PRIMARY KEY,categoryID TEXT,categoryname TEXT,user_id_referred TEXT)";
        this.f16646l = "CREATE TABLE IF NOT EXISTS iptv_password_table(id_password INTEGER PRIMARY KEY,user_detail TEXT,password TEXT,user_id_referred TEXT)";
        this.f16647m = "CREATE TABLE IF NOT EXISTS iptv_password_table_m3u(id_password INTEGER PRIMARY KEY,user_detail TEXT,password TEXT,user_id_referred TEXT)";
        this.f16648n = "ALTER TABLE iptv_password_table ADD COLUMN user_id_referred TEXT;";
        this.f16649o = "CREATE TABLE IF NOT EXISTS iptv_password_status_table(id_password_status INTEGER PRIMARY KEY,password_status_cat_id TEXT,password_user_detail TEXT,password_status TEXT,user_id_referred TEXT)";
        this.f16650p = "CREATE TABLE IF NOT EXISTS iptv_password_status_table_m3u(id_password_status INTEGER PRIMARY KEY,password_status_cat_id TEXT,password_user_detail TEXT,password_status TEXT,user_id_referred TEXT)";
        this.f16651q = "ALTER TABLE iptv_password_status_table ADD COLUMN user_id_referred TEXT;";
        this.f16652r = "CREATE TABLE IF NOT EXISTS iptv_live_streams(id INTEGER PRIMARY KEY,num TEXT,name TEXT,stream_type TEXT,stream_id TEXT,stream_icon TEXT,epg_channel_id TEXT,added TEXT,categoryID TEXT,custom_sid TEXT,tv_archive TEXT,direct_source TEXT,tv_archive_duration TEXT,type_name TEXT,category_name TEXT,series_no TEXT,live TEXT,container_extension TEXT,rating_from_ten TEXT,rating_from_five TEXT,user_id_referred TEXT)";
        this.f16653s = "CREATE TABLE IF NOT EXISTS iptv_live_streams_m3u(id INTEGER PRIMARY KEY,num TEXT,name TEXT,stream_type TEXT,stream_id TEXT,stream_icon TEXT,epg_channel_id TEXT,added TEXT,categoryID TEXT,custom_sid TEXT,tv_archive TEXT,direct_source TEXT,tv_archive_duration TEXT,type_name TEXT,category_name TEXT,series_no TEXT,live TEXT,container_extension TEXT,url TEXT,user_id_referred TEXT)";
        this.f16654t = "CREATE TABLE IF NOT EXISTS iptv_recent_watched_m3u(id INTEGER PRIMARY KEY,num TEXT,name TEXT,stream_type TEXT,stream_id TEXT,stream_icon TEXT,epg_channel_id TEXT,added TEXT,categoryID TEXT,custom_sid TEXT,tv_archive TEXT,direct_source TEXT,tv_archive_duration TEXT,type_name TEXT,category_name TEXT,series_no TEXT,live TEXT,container_extension TEXT,url TEXT,user_id_referred TEXT,movie_elapsed_time TEXT,movie_duration TEXT)";
        this.f16655u = "CREATE TABLE IF NOT EXISTS iptv_live_streams_m3u_all(id INTEGER PRIMARY KEY,num TEXT,name TEXT,stream_type TEXT,stream_id TEXT,stream_icon TEXT,epg_channel_id TEXT,added TEXT,categoryID TEXT,custom_sid TEXT,tv_archive TEXT,direct_source TEXT,tv_archive_duration TEXT,type_name TEXT,category_name TEXT,series_no TEXT,live TEXT,url TEXT,container_extension TEXT,user_id_referred TEXT,move_to TEXT)";
        this.f16656v = "CREATE TABLE IF NOT EXISTS epg(id_epg_aut0 INTEGER PRIMARY KEY,title TEXT,start TEXT,stop TEXT,description TEXT,channel_id TEXT,user_id_referred TEXT,source_ref_id TEXT)";
        this.f16657w = "CREATE TABLE IF NOT EXISTS epg_m3u(id_epg_aut0 INTEGER PRIMARY KEY,title TEXT,start TEXT,stop TEXT,description TEXT,channel_id TEXT,user_id_referred TEXT,source_ref_id TEXT)";
        this.f16658x = "CREATE TABLE IF NOT EXISTS iptv_m3u_favourites(id INTEGER PRIMARY KEY,url TEXT,user_id_referred TEXT,name TEXT,categoryID TEXT)";
        this.f16659y = "CREATE TABLE IF NOT EXISTS iptv_vod_streams(id_auto_vod INTEGER PRIMARY KEY,num_ TEXT,name TEXT,streamType TEXT,streamId TEXT,streamIcon TEXT,added TEXT,categoryId TEXT,seriesNo TEXT,containerExtension TEXT,customSid TEXT,directSource TEXT)";
        this.f16660z = "CREATE TABLE IF NOT EXISTS iptv_import_status(id INTEGER PRIMARY KEY,type TEXT,status TEXT,date TEXT,time TEXT,user_id_referred TEXT,app_type TEXT,source_ref_id TEXT)";
        this.f16627A = "CREATE TABLE IF NOT EXISTS iptv_mag_portal_table(id_auto_mag INTEGER PRIMARY KEY,mag_portal TEXT)";
        this.f16628B = "CREATE TABLE IF NOT EXISTS series_m3u_streams(series_m3u_streams_auto_inc INTEGER PRIMARY KEY,series_m3u_stream_id TEXT,series_m3u_stream_title TEXT,series_m3u_stream_container_ext TEXT,series_m3u_stream_container_image TEXT,series_m3u_stream_container_cat_id TEXT)";
        this.f16629C = "ALTER TABLE iptv_live_streams ADD COLUMN rating_from_ten TEXT;";
        this.f16630D = "ALTER TABLE iptv_live_streams ADD COLUMN rating_from_five TEXT;";
        this.f16631E = "CREATE TABLE IF NOT EXISTS iptv_epg_sources(auto_id INTEGER PRIMARY KEY,user_id_referred TEXT,name TEXT,source_type TEXT,epgurl TEXT,default_source TEXT)";
        this.f16632F = "CREATE TABLE IF NOT EXISTS iptv_epg_sources_m3u(auto_id INTEGER PRIMARY KEY,user_id_referred TEXT,name TEXT,source_type TEXT,epgurl TEXT,default_source TEXT)";
        this.f16633G = "CREATE TABLE IF NOT EXISTS iptv_live_watched(id INTEGER PRIMARY KEY,stream_id_url TEXT,user_id_referred TEXT,app_type TEXT)";
        this.f16634H = "CREATE TABLE IF NOT EXISTS series_category_v2(id_series_v2 INTEGER PRIMARY KEY,category_name_series_v2 TEXT,category_id_series_v2 TEXT,user_id_referred TEXT)";
        this.f16635I = "CREATE TABLE IF NOT EXISTS series_streams_v2(id_series_stream_v2 INTEGER PRIMARY KEY,num_series_stream_v2 TEXT,name_series_stream_v2 TEXT,stream_type_series_stream_v2 TEXT,stream_id_series_stream_v2 TEXT,stream_cover_series_stream_v2 TEXT,plot_series_stream_v2 TEXT,cast_series_stream_v2 TEXT,director_series_stream_v2 TEXT,genre_series_stream_v2 TEXT,release_date_series_stream_v2 TEXT,last_modified_series_stream_v2 TEXT,rating_series_stream_v2 TEXT,category_id_series_stream_v2 TEXT,youtube_trailer TEXT,backdrop TEXT,user_id_referred TEXT)";
        this.f16636b = context;
    }

    /* renamed from: A0 */
    public void m15146A0(PasswordDBModel passwordDBModel) {
        String m15373f = SharepreferenceDBHandler.m15373f(this.f16636b);
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("user_detail", passwordDBModel.m15283a());
            contentValues.put(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, passwordDBModel.m15285c());
            contentValues.put("user_id_referred", Integer.valueOf(passwordDBModel.m15284b()));
            writableDatabase.insert(m15373f.equals("m3u") ? "iptv_password_table_m3u" : "iptv_password_table", null, contentValues);
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: A1 */
    public ArrayList<LiveStreamCategoryIdDBModel> m15147A1() {
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = new ArrayList<>();
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        new ArrayList();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM iptv_m3u_all_category WHERE user_id_referred='" + m15337A + "'", null);
            if (rawQuery.moveToFirst()) {
                do {
                    LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                    liveStreamCategoryIdDBModel.m14791f(Integer.parseInt(rawQuery.getString(0)));
                    liveStreamCategoryIdDBModel.m14792g(rawQuery.getString(1));
                    liveStreamCategoryIdDBModel.m14793h(rawQuery.getString(2));
                    liveStreamCategoryIdDBModel.m14795j(Integer.parseInt(rawQuery.getString(3)));
                    arrayList.add(liveStreamCategoryIdDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return null;
        }
    }

    /* renamed from: A2 */
    public void m15148A2(String str) {
        String str2;
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (str.equals("0")) {
                str2 = "DELETE FROM iptv_series_category_m3u WHERE user_id_referred='" + m15337A + "'";
            } else {
                str2 = "DELETE FROM iptv_series_category_m3u WHERE categoryID ='" + str + "' AND user_id_referred='" + m15337A + "'";
            }
            writableDatabase.execSQL(str2);
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: B */
    public boolean m15149B(List<LiveStreamCategoriesCallback> list) {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    int size = list.size();
                    if (size != 0) {
                        for (int i10 = 0; i10 < size; i10++) {
                            C5255e.f30092p = true;
                            contentValues.put("categoryID_live", list.get(i10).m14993a());
                            contentValues.put("categoryname_live", list.get(i10).m14994b());
                            contentValues.put("paent_id", list.get(i10).m14995c());
                            contentValues.put("user_id_referred", Integer.valueOf(m15337A));
                            writableDatabase.insert("iptv_live_category", null, contentValues);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    C5255e.f30092p = false;
                    return true;
                } catch (Exception e10) {
                    writableDatabase.endTransaction();
                    C5255e.f30092p = false;
                    Log.w("msg", "exception");
                    return false;
                }
            } catch (SQLiteDatabaseLockedException e11) {
                writableDatabase.endTransaction();
                C5255e.f30092p = false;
                Log.w("msg", "exception");
                return false;
            }
        } catch (Exception e12) {
            C5255e.f30092p = false;
            return false;
        }
    }

    /* renamed from: B0 */
    public void m15150B0(PasswordStatusDBModel passwordStatusDBModel) {
        String str = SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u") ? "iptv_password_status_table_m3u" : "iptv_password_status_table";
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("password_status_cat_id", passwordStatusDBModel.m15291b());
            contentValues.put("password_user_detail", passwordStatusDBModel.m15292c());
            contentValues.put("password_status", passwordStatusDBModel.m15290a());
            contentValues.put("user_id_referred", Integer.valueOf(passwordStatusDBModel.m15293d()));
            writableDatabase.insert(str, null, contentValues);
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: B1 */
    public ArrayList<M3UCategoriesModel> m15151B1(String str) {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        ArrayList<M3UCategoriesModel> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  iptv_m3u_all_category.* FROM iptv_m3u_all_category,iptv_live_streams_m3u WHERE iptv_live_streams_m3u.user_id_referred = " + m15337A + " AND iptv_live_streams_m3u" + InstructionFileId.DOT + "stream_type = '" + str + "' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "categoryID=iptv_m3u_all_category" + InstructionFileId.DOT + "categoryID GROUP BY iptv_m3u_all_category" + InstructionFileId.DOT + "categoryID", null);
            if (rawQuery.moveToFirst()) {
                do {
                    M3UCategoriesModel m3UCategoriesModel = new M3UCategoriesModel();
                    m3UCategoriesModel.m14850c(rawQuery.getString(1));
                    m3UCategoriesModel.m14851d(rawQuery.getString(2));
                    arrayList.add(m3UCategoriesModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f0 A[Catch: Exception -> 0x0133, SQLiteDatabaseLockedException -> 0x013e, TRY_LEAVE, TryCatch #2 {SQLiteDatabaseLockedException -> 0x013e, Exception -> 0x0133, blocks: (B:5:0x001a, B:7:0x009f, B:10:0x00ab, B:14:0x00e6, B:16:0x00f0, B:18:0x011c, B:24:0x012a, B:30:0x00ce, B:32:0x00d7), top: B:4:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0125  */
    /* renamed from: B2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m15152B2(java.lang.String r10, java.lang.String r11, int r12) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler.m15152B2(java.lang.String, java.lang.String, int):boolean");
    }

    /* renamed from: C0 */
    public boolean m15153C0(ArrayList<GetSeriesStreamCategoriesCallback> arrayList) {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    int size = arrayList.size();
                    if (size != 0) {
                        for (int i10 = 0; i10 < size; i10++) {
                            C5255e.f30092p = true;
                            contentValues.put("category_id_series_v2", arrayList.get(i10).m14991a());
                            contentValues.put("category_name_series_v2", arrayList.get(i10).m14992b());
                            contentValues.put("user_id_referred", Integer.valueOf(m15337A));
                            writableDatabase.insert("series_category_v2", null, contentValues);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    C5255e.f30092p = false;
                    return true;
                } catch (Exception e10) {
                    Log.w("msg", "exception: " + e10.getMessage());
                    writableDatabase.endTransaction();
                    C5255e.f30092p = false;
                    return false;
                }
            } catch (SQLiteDatabaseLockedException e11) {
                Log.w("msg", "exception");
                writableDatabase.endTransaction();
                C5255e.f30092p = false;
                return false;
            }
        } catch (Exception e12) {
            C5255e.f30092p = false;
            return false;
        }
    }

    /* renamed from: C1 */
    public int m15154C1(String str, String str2) {
        String str3;
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        if (str.equals("0")) {
            str3 = "SELECT  COUNT(*) FROM iptv_live_streams_m3u WHERE user_id_referred='" + m15337A + "' AND stream_type='" + str2 + "'";
        } else if (str.equals("-1")) {
            str3 = "";
        } else {
            str3 = "SELECT  COUNT(*) FROM iptv_live_streams_m3u WHERE categoryID='" + str + "' AND user_id_referred='" + m15337A + "' AND stream_type='" + str2 + "'";
        }
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery(str3, null);
            rawQuery.moveToFirst();
            int i10 = rawQuery.getInt(0);
            rawQuery.close();
            return i10;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return 0;
        }
    }

    /* renamed from: C2 */
    public void m15155C2(String str, String str2, String str3, String str4, int i10) {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        String str5 = SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u") ? "iptv_epg_sources_m3u" : "iptv_epg_sources";
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("user_id_referred", Integer.valueOf(m15337A));
            contentValues2.put("name", str);
            contentValues2.put("source_type", str2);
            contentValues2.put("epgurl", str3);
            contentValues2.put("default_source", str4);
            if (str4.equals("1")) {
                contentValues.put("default_source", "0");
                writableDatabase.update(str5, contentValues, "user_id_referred = ?", new String[]{String.valueOf(m15337A)});
            }
            writableDatabase.update(str5, contentValues2, "auto_id = ? AND user_id_referred = ?", new String[]{String.valueOf(i10), String.valueOf(m15337A)});
        } catch (SQLiteDatabaseLockedException | Exception e10) {
        }
    }

    /* renamed from: D0 */
    public void m15156D0(FavouriteM3UModel favouriteM3UModel) {
        try {
            this.f16637c = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("url", favouriteM3UModel.m14777c());
            contentValues.put("user_id_referred", Integer.valueOf(favouriteM3UModel.m14778d()));
            contentValues.put("name", favouriteM3UModel.m14776b());
            contentValues.put("categoryID", favouriteM3UModel.m14775a());
            this.f16637c.insert("iptv_m3u_favourites", null, contentValues);
        } catch (SQLiteDatabaseLockedException | Exception e10) {
        }
    }

    /* renamed from: D1 */
    public ArrayList<LiveStreamsDBModel> m15157D1(String str, String str2) {
        if (str == null) {
            return null;
        }
        ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        if (SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u")) {
            try {
                Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE '%live%' AND num='" + str + "' AND user_id_referred='" + m15337A + "' LIMIT 1", null);
                if (rawQuery.moveToFirst()) {
                    do {
                        LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                        liveStreamsDBModel.m14826f0(Integer.parseInt(rawQuery.getString(0)));
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
                        liveStreamsDBModel.m14845w0(rawQuery.getString(18));
                        arrayList.add(liveStreamsDBModel);
                    } while (rawQuery.moveToNext());
                }
                rawQuery.close();
                return arrayList;
            } catch (SQLiteDatabaseLockedException | Exception e10) {
                return null;
            }
        }
        try {
            Cursor rawQuery2 = getReadableDatabase().rawQuery("SELECT  * FROM iptv_live_streams WHERE stream_type LIKE '%" + str2 + "%' AND num='" + str + "' AND user_id_referred='" + m15337A + "' LIMIT 1", null);
            if (rawQuery2.moveToFirst()) {
                do {
                    LiveStreamsDBModel liveStreamsDBModel2 = new LiveStreamsDBModel();
                    liveStreamsDBModel2.m14826f0(Integer.parseInt(rawQuery2.getString(0)));
                    liveStreamsDBModel2.m14834l0(rawQuery2.getString(1));
                    liveStreamsDBModel2.m14833k0(rawQuery2.getString(2));
                    liveStreamsDBModel2.m14841s0(rawQuery2.getString(3));
                    liveStreamsDBModel2.m14840r0(rawQuery2.getString(4));
                    liveStreamsDBModel2.m14839q0(rawQuery2.getString(5));
                    liveStreamsDBModel2.m14824d0(rawQuery2.getString(6));
                    liveStreamsDBModel2.m14817X(rawQuery2.getString(7));
                    liveStreamsDBModel2.m14818Y(rawQuery2.getString(8));
                    liveStreamsDBModel2.m14821b0(rawQuery2.getString(9));
                    liveStreamsDBModel2.m14842t0(rawQuery2.getString(10));
                    liveStreamsDBModel2.m14822c0(rawQuery2.getString(11));
                    liveStreamsDBModel2.m14843u0(rawQuery2.getString(12));
                    liveStreamsDBModel2.m14844v0(rawQuery2.getString(13));
                    liveStreamsDBModel2.m14819Z(rawQuery2.getString(14));
                    liveStreamsDBModel2.m14838p0(rawQuery2.getString(15));
                    liveStreamsDBModel2.m14829h0(rawQuery2.getString(16));
                    liveStreamsDBModel2.m14820a0(rawQuery2.getString(17));
                    arrayList.add(liveStreamsDBModel2);
                } while (rawQuery2.moveToNext());
            }
            rawQuery2.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e11) {
            return null;
        }
    }

    /* renamed from: D2 */
    public void m15158D2(String str, String str2) {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            String m15373f = SharepreferenceDBHandler.m15373f(this.f16636b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", str2);
            contentValues.put("date", C5255e.m26235h());
            contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
            writableDatabase.update("iptv_import_status", contentValues, "type = ? AND user_id_referred = ? AND app_type = ?", new String[]{String.valueOf(str), String.valueOf(m15337A), String.valueOf(m15373f)});
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: E0 */
    public ArrayList<FavouriteM3UModel> m15159E0(String str, int i10) {
        ArrayList<FavouriteM3UModel> arrayList = new ArrayList<>();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f16637c = readableDatabase;
            Cursor rawQuery = readableDatabase.rawQuery("SELECT  * FROM iptv_m3u_favourites WHERE url='" + str + "' AND user_id_referred=" + i10 + "", null);
            if (rawQuery.moveToFirst()) {
                do {
                    FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
                    favouriteM3UModel.m14780f(Integer.parseInt(rawQuery.getString(0)));
                    favouriteM3UModel.m14782h(str);
                    favouriteM3UModel.m14783i(i10);
                    favouriteM3UModel.m14781g(rawQuery.getString(3));
                    favouriteM3UModel.m14779e(rawQuery.getString(4));
                    arrayList.add(favouriteM3UModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
            return arrayList;
        }
    }

    /* renamed from: E1 */
    public ArrayList<XMLTVProgrammePojo> m15160E1(String str) {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        ArrayList<XMLTVProgrammePojo> arrayList = new ArrayList<>();
        String str2 = SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u") ? "epg_m3u" : "epg";
        ArrayList<EPGSourcesModel> m15208b1 = m15208b1();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  * FROM " + str2 + " WHERE channel_id='" + str + "' AND user_id_referred='" + m15337A + "' AND source_ref_id='" + ((m15208b1 == null || m15208b1.size() <= 0) ? "0" : String.valueOf(m15208b1.get(0).m15121c())) + "'", null);
            if (rawQuery.moveToFirst()) {
                do {
                    XMLTVProgrammePojo xMLTVProgrammePojo = new XMLTVProgrammePojo();
                    xMLTVProgrammePojo.m15501A(rawQuery.getString(1));
                    xMLTVProgrammePojo.m15526x(rawQuery.getString(2));
                    xMLTVProgrammePojo.m15528z(rawQuery.getString(3));
                    xMLTVProgrammePojo.m15518p(rawQuery.getString(4));
                    xMLTVProgrammePojo.m15517o(rawQuery.getString(5));
                    xMLTVProgrammePojo.m15525w(rawQuery.getString(7));
                    arrayList.add(xMLTVProgrammePojo);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return null;
        }
    }

    /* renamed from: E2 */
    public void m15161E2(String str, String str2, String str3) {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            String m15373f = SharepreferenceDBHandler.m15373f(this.f16636b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", str2);
            contentValues.put("date", C5255e.m26235h());
            contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
            writableDatabase.update("iptv_import_status", contentValues, "type = ? AND user_id_referred = ? AND app_type = ? AND source_ref_id = ?", new String[]{String.valueOf(str), String.valueOf(m15337A), String.valueOf(m15373f), String.valueOf(str3)});
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: F0 */
    public int m15162F0(String str) {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM " + (SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u") ? "iptv_epg_sources_m3u" : "iptv_epg_sources") + " WHERE user_id_referred ='" + m15337A + "' AND epgurl = '" + str + "'", null);
            int count = rawQuery.getCount();
            rawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return 0;
        }
    }

    /* renamed from: F1 */
    public int m15163F1(String str) {
        StringBuilder sb2;
        String str2;
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        if (SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u")) {
            sb2 = new StringBuilder();
            str2 = "SELECT  * FROM epg_m3u WHERE user_id_referred='";
        } else {
            sb2 = new StringBuilder();
            str2 = "SELECT  * FROM epg WHERE user_id_referred='";
        }
        sb2.append(str2);
        sb2.append(m15337A);
        sb2.append("' AND ");
        sb2.append("source_ref_id");
        sb2.append("='");
        sb2.append(str);
        sb2.append("'");
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery(sb2.toString(), null);
            int count = rawQuery.getCount();
            rawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return 0;
        }
    }

    /* renamed from: F2 */
    public void m15164F2() {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        String str = SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u") ? "iptv_epg_sources_m3u" : "iptv_epg_sources";
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("default_source", "1");
            writableDatabase.update(str, contentValues, "user_id_referred = ? AND source_type = ?", new String[]{String.valueOf(m15337A), "panel"});
        } catch (SQLiteDatabaseLockedException | Exception e10) {
        }
    }

    /* renamed from: G0 */
    public final int m15165G0(String str) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_live_category WHERE categoryID_live ='" + str + "' AND user_id_referred='" + SharepreferenceDBHandler.m15337A(this.f16636b) + "'", null);
            int count = rawQuery.getCount();
            rawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return 0;
        }
    }

    /* renamed from: G1 */
    public ArrayList<XMLTVProgrammePojo> m15166G1(String str, String str2) {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        ArrayList<XMLTVProgrammePojo> arrayList = new ArrayList<>();
        String m15373f = SharepreferenceDBHandler.m15373f(this.f16636b);
        ArrayList<EPGSourcesModel> m15208b1 = m15208b1();
        String valueOf = (m15208b1 == null || m15208b1.size() <= 0) ? "0" : String.valueOf(m15208b1.get(0).m15121c());
        if (!m15373f.equals("m3u")) {
            try {
                try {
                    Cursor rawQuery = getReadableDatabase().rawQuery("SELECT DISTINCT title,start,stop,description,channel_id,num,name,stream_id,stream_icon,categoryID FROM epg , iptv_live_streams WHERE epg.user_id_referred = '" + m15337A + "' AND iptv_live_streams" + InstructionFileId.DOT + "user_id_referred = '" + m15337A + "' AND epg" + InstructionFileId.DOT + "source_ref_id = '" + valueOf + "' AND epg" + InstructionFileId.DOT + "channel_id = iptv_live_streams" + InstructionFileId.DOT + "epg_channel_id AND epg" + InstructionFileId.DOT + ChartFactory.TITLE + " LIKE '%" + str + "%' AND stop>='" + str2 + "' AND iptv_live_streams" + InstructionFileId.DOT + "categoryID NOT IN (SELECT iptv_password_status_table" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table WHERE iptv_password_status_table" + InstructionFileId.DOT + "user_id_referred ='" + m15337A + "' AND iptv_password_status_table" + InstructionFileId.DOT + "password_status ='1') ORDER BY epg" + InstructionFileId.DOT + "stop ASC", null);
                    ArrayList<XMLTVProgrammePojo> arrayList2 = arrayList;
                    if (rawQuery.moveToFirst()) {
                        do {
                            AsyncTask asyncTask = C5255e.f30091o;
                            if (asyncTask == null || !asyncTask.isCancelled()) {
                                XMLTVProgrammePojo xMLTVProgrammePojo = new XMLTVProgrammePojo();
                                xMLTVProgrammePojo.m15501A(rawQuery.getString(0));
                                xMLTVProgrammePojo.m15526x(rawQuery.getString(1));
                                xMLTVProgrammePojo.m15528z(rawQuery.getString(2));
                                xMLTVProgrammePojo.m15518p(rawQuery.getString(3));
                                xMLTVProgrammePojo.m15517o(rawQuery.getString(4));
                                xMLTVProgrammePojo.m15523u(rawQuery.getString(5));
                                xMLTVProgrammePojo.m15522t(rawQuery.getString(6));
                                xMLTVProgrammePojo.m15524v(rawQuery.getString(7));
                                xMLTVProgrammePojo.m15521s(rawQuery.getString(8));
                                xMLTVProgrammePojo.m15520r(rawQuery.getString(9));
                                arrayList.add(xMLTVProgrammePojo);
                            } else {
                                Log.e("honey", "stopped epg");
                                arrayList2 = arrayList;
                            }
                        } while (rawQuery.moveToNext());
                        rawQuery.close();
                        return arrayList;
                    }
                    arrayList = arrayList2;
                    rawQuery.close();
                    return arrayList;
                } catch (SQLiteDatabaseLockedException e10) {
                    return null;
                } catch (Exception e11) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException e12) {
                return null;
            } catch (Exception e13) {
                return null;
            }
        }
        try {
            try {
                Cursor rawQuery2 = getReadableDatabase().rawQuery("SELECT DISTINCT title,start,stop,description,channel_id,num,name,stream_icon,categoryID,url FROM epg_m3u , iptv_live_streams_m3u WHERE epg_m3u.user_id_referred = '" + m15337A + "' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "user_id_referred = '" + m15337A + "' AND epg_m3u" + InstructionFileId.DOT + "source_ref_id = '" + valueOf + "' AND epg_m3u" + InstructionFileId.DOT + "channel_id = iptv_live_streams_m3u" + InstructionFileId.DOT + "epg_channel_id AND epg_m3u" + InstructionFileId.DOT + ChartFactory.TITLE + " LIKE '%" + str + "%' AND stop>='" + str2 + "' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "categoryID NOT IN (SELECT iptv_password_status_table_m3u" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table_m3u WHERE iptv_password_status_table_m3u" + InstructionFileId.DOT + "user_id_referred ='" + m15337A + "' AND iptv_password_status_table_m3u" + InstructionFileId.DOT + "password_status ='1') ORDER BY epg_m3u" + InstructionFileId.DOT + "stop ASC", null);
                ArrayList<XMLTVProgrammePojo> arrayList3 = arrayList;
                if (rawQuery2.moveToFirst()) {
                    while (true) {
                        AsyncTask asyncTask2 = C5255e.f30091o;
                        if (asyncTask2 != null && asyncTask2.isCancelled()) {
                            Log.e("honey", "stopped epg");
                            arrayList3 = arrayList;
                            break;
                        }
                        XMLTVProgrammePojo xMLTVProgrammePojo2 = new XMLTVProgrammePojo();
                        xMLTVProgrammePojo2.m15501A(rawQuery2.getString(0));
                        xMLTVProgrammePojo2.m15526x(rawQuery2.getString(1));
                        xMLTVProgrammePojo2.m15528z(rawQuery2.getString(2));
                        xMLTVProgrammePojo2.m15518p(rawQuery2.getString(3));
                        xMLTVProgrammePojo2.m15517o(rawQuery2.getString(4));
                        xMLTVProgrammePojo2.m15523u(rawQuery2.getString(5));
                        xMLTVProgrammePojo2.m15522t(rawQuery2.getString(6));
                        xMLTVProgrammePojo2.m15524v("");
                        xMLTVProgrammePojo2.m15521s(rawQuery2.getString(7));
                        xMLTVProgrammePojo2.m15520r(rawQuery2.getString(8));
                        xMLTVProgrammePojo2.m15502B(rawQuery2.getString(9));
                        arrayList.add(xMLTVProgrammePojo2);
                        if (!rawQuery2.moveToNext()) {
                            arrayList3 = arrayList;
                            break;
                        }
                    }
                }
                rawQuery2.close();
                return arrayList3;
            } catch (SQLiteDatabaseLockedException e14) {
                return null;
            } catch (Exception e15) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException e16) {
            return null;
        } catch (Exception e17) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0114 A[Catch: Exception -> 0x0157, SQLiteDatabaseLockedException -> 0x0162, TRY_LEAVE, TryCatch #2 {SQLiteDatabaseLockedException -> 0x0162, Exception -> 0x0157, blocks: (B:5:0x001c, B:7:0x00c3, B:10:0x00cf, B:14:0x010a, B:16:0x0114, B:18:0x0140, B:24:0x014e, B:30:0x00f2, B:32:0x00fb), top: B:4:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0149  */
    /* renamed from: G2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m15167G2(java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler.m15167G2(java.lang.String, java.lang.String, java.lang.String, int):boolean");
    }

    /* renamed from: H0 */
    public final int m15168H0(String str) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_movie_category WHERE categoryID_movie ='" + str + "' AND user_id_referred='" + SharepreferenceDBHandler.m15337A(this.f16636b) + "'", null);
            int count = rawQuery.getCount();
            rawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return 0;
        }
    }

    /* renamed from: H1 */
    public ArrayList<EPGSourcesModel> m15169H1() {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        String str = "SELECT  * FROM " + (SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u") ? "iptv_epg_sources_m3u" : "iptv_epg_sources") + " WHERE user_id_referred ='" + m15337A + "' ORDER BY source_type DESC , auto_id DESC";
        try {
            ArrayList<EPGSourcesModel> arrayList = new ArrayList<>();
            Cursor rawQuery = getReadableDatabase().rawQuery(str, null);
            if (rawQuery.moveToFirst()) {
                do {
                    EPGSourcesModel ePGSourcesModel = new EPGSourcesModel();
                    ePGSourcesModel.m15126h(C5255e.m26215R(rawQuery.getString(0)));
                    ePGSourcesModel.m15129k(rawQuery.getString(1));
                    ePGSourcesModel.m15127i(rawQuery.getString(2));
                    ePGSourcesModel.m15128j(rawQuery.getString(3));
                    ePGSourcesModel.m15125g(rawQuery.getString(4));
                    ePGSourcesModel.m15124f(rawQuery.getString(5));
                    arrayList.add(ePGSourcesModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return null;
        }
    }

    /* renamed from: I0 */
    public final int m15170I0(String str) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  * FROM series_category_v2 WHERE category_id_series_v2 ='" + str + "' AND user_id_referred = '" + SharepreferenceDBHandler.m15337A(this.f16636b) + "'", null);
            int count = rawQuery.getCount();
            rawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return 0;
        }
    }

    /* renamed from: I1 */
    public ArrayList<XMLTVProgrammePojo> m15171I1(String str, String str2) {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        String str3 = SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u") ? "epg_m3u" : "epg";
        ArrayList<EPGSourcesModel> m15208b1 = m15208b1();
        String valueOf = (m15208b1 == null || m15208b1.size() <= 0) ? "0" : String.valueOf(m15208b1.get(0).m15121c());
        ArrayList<XMLTVProgrammePojo> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  * FROM " + str3 + " WHERE user_id_referred='" + m15337A + "' AND source_ref_id='" + valueOf + "' AND '" + str2 + "' BETWEEN start AND stop", null);
            if (rawQuery.moveToFirst()) {
                do {
                    XMLTVProgrammePojo xMLTVProgrammePojo = new XMLTVProgrammePojo();
                    xMLTVProgrammePojo.m15501A(rawQuery.getString(1));
                    xMLTVProgrammePojo.m15526x(rawQuery.getString(2));
                    xMLTVProgrammePojo.m15528z(rawQuery.getString(3));
                    xMLTVProgrammePojo.m15518p(rawQuery.getString(4));
                    xMLTVProgrammePojo.m15517o(rawQuery.getString(5));
                    xMLTVProgrammePojo.m15525w(rawQuery.getString(7));
                    arrayList.add(xMLTVProgrammePojo);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return null;
        }
    }

    /* renamed from: J0 */
    public void m15172J0() {
        try {
            String m15373f = SharepreferenceDBHandler.m15373f(this.f16636b);
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            getWritableDatabase().execSQL("DELETE FROM iptv_live_watched WHERE user_id_referred = '" + m15337A + "' AND app_type = '" + m15373f + "'");
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: J1 */
    public int m15173J1(String str) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT iptv_live_streams_m3u.id FROM iptv_live_streams_m3u , iptv_m3u_favourites WHERE iptv_m3u_favourites.url = iptv_live_streams_m3u.url AND iptv_live_streams_m3u.stream_type='" + str + "' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "user_id_referred=iptv_m3u_favourites" + InstructionFileId.DOT + "user_id_referred AND iptv_m3u_favourites" + InstructionFileId.DOT + "user_id_referred ='" + SharepreferenceDBHandler.m15337A(this.f16636b) + "'", null);
            int count = rawQuery.getCount();
            rawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return 0;
        }
    }

    /* renamed from: K0 */
    public void m15174K0(String str, int i10) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f16637c = writableDatabase;
        writableDatabase.delete("iptv_recent_watched_m3u", "stream_type='" + str + "' AND user_id_referred=" + i10 + "", null);
        this.f16637c.close();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x00dc. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: K1 */
    public ArrayList<FavouriteM3UModel> m15175K1(String str) {
        StringBuilder sb2;
        StringBuilder sb3;
        String str2;
        StringBuilder sb4;
        String str3;
        String sb5;
        ArrayList<FavouriteM3UModel> arrayList;
        ArrayList<FavouriteM3UModel> arrayList2;
        ArrayList<FavouriteM3UModel> arrayList3;
        int i10;
        String m15387m = str.equals("live") ? SharepreferenceDBHandler.m15387m(this.f16636b) : str.equals("series") ? SharepreferenceDBHandler.m15400w(this.f16636b) : SharepreferenceDBHandler.m15342F(this.f16636b);
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        ArrayList<FavouriteM3UModel> arrayList4 = new ArrayList<>();
        m15387m.hashCode();
        boolean z10 = -1;
        switch (m15387m.hashCode()) {
            case 48:
                if (m15387m.equals("0")) {
                    z10 = false;
                    break;
                }
                break;
            case 50:
                if (m15387m.equals("2")) {
                    z10 = true;
                    break;
                }
                break;
            case 51:
                if (m15387m.equals("3")) {
                    z10 = 2;
                    break;
                }
                break;
            case 52:
                if (m15387m.equals("4")) {
                    z10 = 3;
                    break;
                }
                break;
            case 53:
                if (m15387m.equals("5")) {
                    z10 = 4;
                    break;
                }
                break;
        }
        ArrayList<FavouriteM3UModel> arrayList5 = arrayList4;
        switch (z10) {
            case false:
                sb2 = new StringBuilder();
                sb2.append("SELECT  * FROM iptv_m3u_favourites WHERE  (SELECT iptv_live_streams_m3u.id FROM iptv_live_streams_m3u WHERE iptv_m3u_favourites.url = iptv_live_streams_m3u.url AND iptv_live_streams_m3u.stream_type='");
                sb2.append(str);
                sb2.append("' AND ");
                sb2.append("iptv_live_streams_m3u");
                sb2.append(InstructionFileId.DOT);
                sb2.append("user_id_referred");
                sb2.append("=");
                sb2.append("iptv_m3u_favourites");
                sb2.append(InstructionFileId.DOT);
                sb2.append("user_id_referred");
                sb2.append(" AND ");
                sb2.append("iptv_m3u_favourites");
                sb2.append(InstructionFileId.DOT);
                sb2.append("user_id_referred");
                sb2.append(" ='");
                sb2.append(m15337A);
                sb2.append("')");
                sb3 = sb2;
                sb5 = sb3.toString();
                break;
            case true:
                StringBuilder sb6 = new StringBuilder();
                sb6.append("SELECT  * FROM iptv_m3u_favourites WHERE  (SELECT iptv_live_streams_m3u.id FROM iptv_live_streams_m3u WHERE iptv_m3u_favourites.url = iptv_live_streams_m3u.url AND iptv_live_streams_m3u.stream_type='");
                sb6.append(str);
                sb6.append("' AND ");
                sb6.append("iptv_live_streams_m3u");
                sb6.append(InstructionFileId.DOT);
                sb6.append("user_id_referred");
                sb6.append("=");
                sb6.append("iptv_m3u_favourites");
                sb6.append(InstructionFileId.DOT);
                sb6.append("user_id_referred");
                sb6.append(" AND ");
                sb6.append("iptv_m3u_favourites");
                sb6.append(InstructionFileId.DOT);
                sb6.append("user_id_referred");
                sb6.append(" ='");
                sb6.append(m15337A);
                sb6.append("') ORDER BY ");
                sb6.append("iptv_m3u_favourites");
                sb6.append(InstructionFileId.DOT);
                sb6.append("name");
                sb3 = sb6;
                str2 = " ASC ";
                sb3.append(str2);
                sb5 = sb3.toString();
                break;
            case true:
                StringBuilder sb7 = new StringBuilder();
                sb7.append("SELECT  * FROM iptv_m3u_favourites WHERE  (SELECT iptv_live_streams_m3u.id FROM iptv_live_streams_m3u WHERE iptv_m3u_favourites.url = iptv_live_streams_m3u.url AND iptv_live_streams_m3u.stream_type='");
                sb7.append(str);
                sb7.append("' AND ");
                sb7.append("iptv_live_streams_m3u");
                sb7.append(InstructionFileId.DOT);
                sb7.append("user_id_referred");
                sb7.append("=");
                sb7.append("iptv_m3u_favourites");
                sb7.append(InstructionFileId.DOT);
                sb7.append("user_id_referred");
                sb7.append(" AND ");
                sb7.append("iptv_m3u_favourites");
                sb7.append(InstructionFileId.DOT);
                sb7.append("user_id_referred");
                sb7.append(" ='");
                sb7.append(m15337A);
                sb7.append("') ORDER BY ");
                sb7.append("iptv_m3u_favourites");
                sb7.append(InstructionFileId.DOT);
                sb7.append("name");
                str2 = " DESC ";
                sb3 = sb7;
                sb3.append(str2);
                sb5 = sb3.toString();
                break;
            case true:
                sb4 = new StringBuilder();
                sb4.append("SELECT  * FROM iptv_m3u_favourites WHERE  (SELECT iptv_live_streams_m3u.id FROM iptv_live_streams_m3u WHERE iptv_m3u_favourites.url = iptv_live_streams_m3u.url AND iptv_live_streams_m3u.stream_type='");
                sb4.append(str);
                sb4.append("' AND ");
                sb4.append("iptv_live_streams_m3u");
                sb4.append(InstructionFileId.DOT);
                sb4.append("user_id_referred");
                sb4.append("=");
                sb4.append("iptv_m3u_favourites");
                sb4.append(InstructionFileId.DOT);
                sb4.append("user_id_referred");
                sb4.append(" AND ");
                sb4.append("iptv_m3u_favourites");
                sb4.append(InstructionFileId.DOT);
                sb4.append("user_id_referred");
                sb4.append(" ='");
                sb4.append(m15337A);
                sb4.append("' ORDER BY cast(");
                sb4.append("iptv_live_streams_m3u");
                sb4.append(InstructionFileId.DOT);
                sb4.append("num");
                str3 = " as REAL) ASC)";
                sb4.append(str3);
                sb5 = sb4.toString();
                break;
            case true:
                sb4 = new StringBuilder();
                sb4.append("SELECT  * FROM iptv_m3u_favourites WHERE  (SELECT iptv_live_streams_m3u.id FROM iptv_live_streams_m3u WHERE iptv_m3u_favourites.url = iptv_live_streams_m3u.url AND iptv_live_streams_m3u.stream_type='");
                sb4.append(str);
                sb4.append("' AND ");
                sb4.append("iptv_live_streams_m3u");
                sb4.append(InstructionFileId.DOT);
                sb4.append("user_id_referred");
                sb4.append("=");
                sb4.append("iptv_m3u_favourites");
                sb4.append(InstructionFileId.DOT);
                sb4.append("user_id_referred");
                sb4.append(" AND ");
                sb4.append("iptv_m3u_favourites");
                sb4.append(InstructionFileId.DOT);
                sb4.append("user_id_referred");
                sb4.append(" ='");
                sb4.append(m15337A);
                sb4.append("' ORDER BY cast(");
                sb4.append("iptv_live_streams_m3u");
                sb4.append(InstructionFileId.DOT);
                sb4.append("num");
                str3 = " as REAL) DESC)";
                sb4.append(str3);
                sb5 = sb4.toString();
                break;
            default:
                sb2 = new StringBuilder();
                sb2.append("SELECT  * FROM iptv_m3u_favourites WHERE  (SELECT iptv_live_streams_m3u.id FROM iptv_live_streams_m3u WHERE iptv_m3u_favourites.url = iptv_live_streams_m3u.url AND iptv_live_streams_m3u.stream_type='");
                sb2.append(str);
                sb2.append("' AND ");
                sb2.append("iptv_live_streams_m3u");
                sb2.append(InstructionFileId.DOT);
                sb2.append("user_id_referred");
                sb2.append("=");
                sb2.append("iptv_m3u_favourites");
                sb2.append(InstructionFileId.DOT);
                sb2.append("user_id_referred");
                sb2.append(" AND ");
                sb2.append("iptv_m3u_favourites");
                sb2.append(InstructionFileId.DOT);
                sb2.append("user_id_referred");
                sb2.append(" ='");
                sb2.append(m15337A);
                sb2.append("')");
                sb3 = sb2;
                sb5 = sb3.toString();
                break;
        }
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            ArrayList<FavouriteM3UModel> arrayList6 = arrayList5;
            arrayList = arrayList5;
            try {
                this.f16637c = readableDatabase;
                Cursor rawQuery = readableDatabase.rawQuery(sb5, null);
                if (rawQuery.moveToFirst()) {
                    do {
                        arrayList6 = arrayList5;
                        arrayList = arrayList5;
                        FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
                        try {
                            i10 = Integer.parseInt(rawQuery.getString(0));
                        } catch (NumberFormatException e10) {
                            i10 = 0;
                        }
                        favouriteM3UModel.m14780f(i10);
                        favouriteM3UModel.m14782h(rawQuery.getString(1));
                        favouriteM3UModel.m14783i(Integer.parseInt(rawQuery.getString(2)));
                        favouriteM3UModel.m14781g(rawQuery.getString(3));
                        favouriteM3UModel.m14779e(rawQuery.getString(4));
                        arrayList2 = arrayList5;
                        arrayList3 = arrayList5;
                        try {
                            arrayList5.add(favouriteM3UModel);
                        } catch (SQLiteDatabaseLockedException e11) {
                            return arrayList2;
                        } catch (Exception e12) {
                            arrayList = arrayList3;
                            return arrayList;
                        }
                    } while (rawQuery.moveToNext());
                }
                arrayList2 = arrayList5;
                arrayList3 = arrayList5;
                rawQuery.close();
                return arrayList5;
            } catch (SQLiteDatabaseLockedException e13) {
                arrayList5 = arrayList6;
                arrayList2 = arrayList5;
                return arrayList2;
            } catch (Exception e14) {
            }
        } catch (SQLiteDatabaseLockedException e15) {
        } catch (Exception e16) {
            arrayList = arrayList5;
        }
    }

    /* renamed from: L0 */
    public void m15176L0(int i10, String str) {
        try {
            String str2 = str.equals("m3u") ? "iptv_epg_sources_m3u" : "iptv_epg_sources";
            getWritableDatabase().execSQL("DELETE FROM " + str2 + " WHERE user_id_referred = '" + i10 + "'");
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: L1 */
    public int m15177L1(String str) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_import_status WHERE user_id_referred = '" + SharepreferenceDBHandler.m15337A(this.f16636b) + "' AND app_type = '" + str + "'", null);
            int count = rawQuery.getCount();
            rawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return 0;
        }
    }

    /* renamed from: M0 */
    public void m15178M0() {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            String m15373f = SharepreferenceDBHandler.m15373f(this.f16636b);
            getWritableDatabase().execSQL("DELETE FROM iptv_live_watched WHERE stream_id_url NOT IN (SELECT stream_id FROM iptv_live_streams WHERE stream_type LIKE '%live%' AND user_id_referred ='" + m15337A + "' ) AND user_id_referred = '" + m15337A + "' AND app_type = '" + m15373f + "'");
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: M1 */
    public LiveStreamsDBModel m15179M1(String str, String str2) {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        new ArrayList();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_live_streams WHERE categoryID='" + str + "'  AND user_id_referred = '" + m15337A + "' AND stream_id='" + str2 + "' LIMIT 1", null);
            LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
            if (rawQuery.moveToFirst()) {
                do {
                    liveStreamsDBModel.m14826f0(Integer.parseInt(rawQuery.getString(0)));
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
                    liveStreamsDBModel.m14837o0(rawQuery.getString(18));
                    liveStreamsDBModel.m14836n0(rawQuery.getString(19));
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return liveStreamsDBModel;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return null;
        }
    }

    /* renamed from: N0 */
    public void m15180N0() {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            String m15373f = SharepreferenceDBHandler.m15373f(this.f16636b);
            getWritableDatabase().execSQL("DELETE FROM iptv_live_watched WHERE stream_id_url NOT IN (SELECT url FROM iptv_live_streams_m3u WHERE stream_type LIKE '%live%' AND user_id_referred ='" + m15337A + "' ) AND user_id_referred = '" + m15337A + "' AND app_type = '" + m15373f + "'");
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: N1 */
    public int m15181N1(String str) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_live_streams WHERE categoryID='" + str + "' AND user_id_referred='" + SharepreferenceDBHandler.m15337A(this.f16636b) + "'", null);
            rawQuery.moveToFirst();
            int i10 = rawQuery.getInt(0);
            rawQuery.close();
            return i10;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return 0;
        }
    }

    /* renamed from: O0 */
    public void m15182O0(int i10) {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            String str = SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u") ? "iptv_epg_sources_m3u" : "iptv_epg_sources";
            getWritableDatabase().execSQL("DELETE FROM " + str + " WHERE user_id_referred = '" + m15337A + "' AND auto_id = '" + i10 + "'");
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: O1 */
    public ArrayList<LiveStreamsDBModel> m15183O1(String str, String str2) {
        ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_live_streams_m3u WHERE categoryID='" + str + "' AND url='" + str2 + "' AND user_id_referred='" + SharepreferenceDBHandler.m15337A(this.f16636b) + "'", null);
            LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
            if (rawQuery.moveToFirst()) {
                do {
                    liveStreamsDBModel.m14834l0(rawQuery.getString(1));
                    liveStreamsDBModel.m14833k0(rawQuery.getString(2));
                    liveStreamsDBModel.m14841s0(rawQuery.getString(3));
                    liveStreamsDBModel.m14840r0(rawQuery.getString(4));
                    liveStreamsDBModel.m14839q0(rawQuery.getString(5));
                    liveStreamsDBModel.m14824d0(rawQuery.getString(6));
                    liveStreamsDBModel.m14817X(rawQuery.getString(7));
                    liveStreamsDBModel.m14818Y(rawQuery.getString(8));
                    liveStreamsDBModel.m14821b0(rawQuery.getString(9));
                    liveStreamsDBModel.m14822c0(rawQuery.getString(11));
                    liveStreamsDBModel.m14843u0(rawQuery.getString(12));
                    liveStreamsDBModel.m14844v0(rawQuery.getString(13));
                    liveStreamsDBModel.m14819Z(rawQuery.getString(14));
                    liveStreamsDBModel.m14838p0(rawQuery.getString(15));
                    liveStreamsDBModel.m14829h0(rawQuery.getString(16));
                    liveStreamsDBModel.m14820a0(rawQuery.getString(17));
                    liveStreamsDBModel.m14845w0(rawQuery.getString(18));
                    arrayList.add(liveStreamsDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return null;
        }
    }

    /* renamed from: P0 */
    public void m15184P0() {
        try {
            C6783a c6783a = new C6783a(this.f16636b);
            String m15373f = SharepreferenceDBHandler.m15373f(this.f16636b);
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            getWritableDatabase().execSQL("DELETE FROM iptv_live_watched WHERE user_id_referred = '" + m15337A + "' AND app_type = '" + m15373f + "' AND " + Name.MARK + " NOT IN ( SELECT " + Name.MARK + " FROM iptv_live_watched WHERE user_id_referred = '" + m15337A + "' AND app_type = '" + m15373f + "' ORDER BY " + Name.MARK + " DESC LIMIT " + c6783a.m31287y() + ")");
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: P1 */
    public SeriesDBModel m15185P1(String str, String str2) {
        String str3 = "SELECT  * FROM iptv_live_streams_m3u WHERE categoryID='" + str + "' AND url='" + str2 + "' AND user_id_referred='" + SharepreferenceDBHandler.m15337A(this.f16636b) + "'";
        SeriesDBModel seriesDBModel = new SeriesDBModel();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery(str3, null);
            if (rawQuery.moveToFirst()) {
                do {
                    seriesDBModel.m15054u(Integer.parseInt(rawQuery.getString(0)));
                    seriesDBModel.m15056w(rawQuery.getString(1));
                    seriesDBModel.m15055v(rawQuery.getString(2));
                    seriesDBModel.m15057x(rawQuery.getString(3));
                    seriesDBModel.m15033I(C5255e.m26215R(rawQuery.getString(4)));
                    seriesDBModel.m15026B(rawQuery.getString(5));
                    seriesDBModel.m15030F("");
                    seriesDBModel.m15025A("");
                    seriesDBModel.m15027C("");
                    seriesDBModel.m15028D("");
                    seriesDBModel.m15032H("");
                    seriesDBModel.m15029E("");
                    seriesDBModel.m15031G("");
                    seriesDBModel.m15053t(rawQuery.getString(8));
                    seriesDBModel.m15059z("");
                    seriesDBModel.m15052s("");
                    seriesDBModel.m15058y(rawQuery.getString(18));
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return seriesDBModel;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return null;
        }
    }

    /* renamed from: Q0 */
    public void m15186Q0() {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            SharepreferenceDBHandler.m15373f(this.f16636b);
            getWritableDatabase().execSQL("DELETE FROM iptv_m3u_favourites WHERE url NOT IN (SELECT url FROM iptv_live_streams_m3u WHERE user_id_referred ='" + m15337A + "' ) AND user_id_referred = '" + m15337A + "'");
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: Q1 */
    public int m15187Q1() {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  * FROM " + (SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u") ? "iptv_epg_sources_m3u" : "iptv_epg_sources") + " WHERE user_id_referred='" + m15337A + "' AND source_type = 'panel'", null);
            int count = rawQuery.getCount();
            rawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return 0;
        }
    }

    /* renamed from: R0 */
    public void m15188R0(String str, int i10) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f16637c = writableDatabase;
            writableDatabase.delete("iptv_m3u_favourites", "url='" + str + "' AND user_id_referred=" + i10, null);
            this.f16637c.close();
        } catch (SQLiteDatabaseLockedException | Exception e10) {
        }
    }

    /* renamed from: R1 */
    public int m15189R1(int i10) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  * FROM " + (SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u") ? "iptv_password_status_table_m3u" : "iptv_password_status_table") + " WHERE user_id_referred=" + i10 + "", null);
            int count = rawQuery.getCount();
            rawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return 0;
        }
    }

    /* renamed from: S0 */
    public void m15190S0(int i10, String str) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f16637c = writableDatabase;
            writableDatabase.delete("iptv_import_status", "user_id_referred='" + i10 + "' AND app_type='" + str + "'", null);
        } catch (SQLiteDatabaseLockedException | Exception e10) {
        }
    }

    /* renamed from: S1 */
    public PasswordStatusDBModel m15191S1(String str, String str2, int i10) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM " + (SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u") ? "iptv_password_status_table_m3u" : "iptv_password_status_table") + " WHERE password_user_detail = '" + str + "' AND password_status_cat_id = '" + str2 + "' AND user_id_referred = " + i10 + "", null);
            PasswordStatusDBModel passwordStatusDBModel = new PasswordStatusDBModel();
            if (rawQuery.moveToFirst()) {
                do {
                    passwordStatusDBModel.m15294e(Integer.parseInt(rawQuery.getString(0)));
                    passwordStatusDBModel.m15296g(rawQuery.getString(1));
                    passwordStatusDBModel.m15297h(rawQuery.getString(2));
                    passwordStatusDBModel.m15295f(rawQuery.getString(3));
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return passwordStatusDBModel;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return null;
        }
    }

    /* renamed from: T0 */
    public void m15192T0(int i10, String str, String str2) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f16637c = writableDatabase;
            writableDatabase.delete("iptv_import_status", "user_id_referred='" + i10 + "' AND app_type='" + str2 + "' AND source_ref_id='" + str + "'", null);
        } catch (SQLiteDatabaseLockedException | Exception e10) {
        }
    }

    /* renamed from: T1 */
    public int m15193T1(int i10, String str) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_recent_watched_m3u WHERE user_id_referred=" + i10 + " AND stream_type='" + str + "'", null);
            rawQuery.moveToFirst();
            int i11 = rawQuery.getInt(0);
            rawQuery.close();
            return i11;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return 0;
        }
    }

    /* renamed from: U0 */
    public void m15194U0(String str) {
        try {
            String m15373f = SharepreferenceDBHandler.m15373f(this.f16636b);
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            getWritableDatabase().execSQL("DELETE FROM iptv_live_watched WHERE stream_id_url = '" + str + "' AND user_id_referred = '" + m15337A + "' AND app_type = '" + m15373f + "'");
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: U1 */
    public ArrayList<LiveStreamsDBModel> m15195U1(String str) {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        String m15373f = SharepreferenceDBHandler.m15373f(this.f16636b);
        ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
        if (!m15373f.equals("m3u")) {
            try {
                try {
                    Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_live_streams WHERE name LIKE '%" + str + "%'  AND iptv_live_streams" + InstructionFileId.DOT + "user_id_referred = '" + m15337A + "' AND iptv_live_streams" + InstructionFileId.DOT + "categoryID NOT IN (SELECT iptv_password_status_table" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table WHERE iptv_password_status_table" + InstructionFileId.DOT + "user_id_referred ='" + m15337A + "' AND iptv_password_status_table" + InstructionFileId.DOT + "password_status ='1')", null);
                    ArrayList<LiveStreamsDBModel> arrayList2 = arrayList;
                    if (rawQuery.moveToFirst()) {
                        arrayList2 = arrayList;
                        while (true) {
                            AsyncTask asyncTask = C5255e.f30091o;
                            if (asyncTask != null && asyncTask.isCancelled()) {
                                Log.e("honey", "stopped live movies");
                                break;
                            }
                            LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                            liveStreamsDBModel.m14826f0(Integer.parseInt(rawQuery.getString(0)));
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
                            liveStreamsDBModel.m14837o0(rawQuery.getString(18));
                            liveStreamsDBModel.m14836n0(rawQuery.getString(19));
                            arrayList2.add(liveStreamsDBModel);
                            if (!rawQuery.moveToNext()) {
                                break;
                            }
                        }
                    }
                    rawQuery.close();
                    return arrayList2;
                } catch (SQLiteDatabaseLockedException e10) {
                    return null;
                } catch (Exception e11) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException e12) {
                return null;
            } catch (Exception e13) {
                return null;
            }
        }
        try {
            try {
                Cursor rawQuery2 = getReadableDatabase().rawQuery("SELECT  * FROM iptv_live_streams_m3u WHERE name LIKE '%" + str + "%'  AND iptv_live_streams_m3u" + InstructionFileId.DOT + "user_id_referred='" + m15337A + "' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "stream_type IN ('movie','live') AND iptv_live_streams_m3u" + InstructionFileId.DOT + "categoryID NOT IN (SELECT iptv_password_status_table_m3u" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table_m3u WHERE iptv_password_status_table_m3u" + InstructionFileId.DOT + "user_id_referred ='" + m15337A + "' AND iptv_password_status_table_m3u" + InstructionFileId.DOT + "password_status ='1')", null);
                ArrayList<LiveStreamsDBModel> arrayList3 = arrayList;
                if (rawQuery2.moveToFirst()) {
                    do {
                        AsyncTask asyncTask2 = C5255e.f30091o;
                        if (asyncTask2 == null || !asyncTask2.isCancelled()) {
                            LiveStreamsDBModel liveStreamsDBModel2 = new LiveStreamsDBModel();
                            liveStreamsDBModel2.m14826f0(Integer.parseInt(rawQuery2.getString(0)));
                            liveStreamsDBModel2.m14834l0(rawQuery2.getString(1));
                            liveStreamsDBModel2.m14833k0(rawQuery2.getString(2));
                            liveStreamsDBModel2.m14841s0(rawQuery2.getString(3));
                            liveStreamsDBModel2.m14840r0(rawQuery2.getString(4));
                            liveStreamsDBModel2.m14839q0(rawQuery2.getString(5));
                            liveStreamsDBModel2.m14824d0(rawQuery2.getString(6));
                            liveStreamsDBModel2.m14817X(rawQuery2.getString(7));
                            liveStreamsDBModel2.m14818Y(rawQuery2.getString(8));
                            liveStreamsDBModel2.m14821b0(rawQuery2.getString(9));
                            liveStreamsDBModel2.m14842t0(rawQuery2.getString(10));
                            liveStreamsDBModel2.m14822c0(rawQuery2.getString(11));
                            liveStreamsDBModel2.m14843u0(rawQuery2.getString(12));
                            liveStreamsDBModel2.m14844v0(rawQuery2.getString(13));
                            liveStreamsDBModel2.m14819Z(rawQuery2.getString(14));
                            liveStreamsDBModel2.m14838p0(rawQuery2.getString(15));
                            liveStreamsDBModel2.m14829h0(rawQuery2.getString(16));
                            liveStreamsDBModel2.m14820a0(rawQuery2.getString(17));
                            liveStreamsDBModel2.m14845w0(rawQuery2.getString(18));
                            arrayList.add(liveStreamsDBModel2);
                        } else {
                            Log.e("honey", "stopped live movies");
                            arrayList3 = arrayList;
                        }
                    } while (rawQuery2.moveToNext());
                    rawQuery2.close();
                    return arrayList;
                }
                arrayList = arrayList3;
                rawQuery2.close();
                return arrayList;
            } catch (SQLiteDatabaseLockedException e14) {
                return null;
            } catch (Exception e15) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException e16) {
            return null;
        } catch (Exception e17) {
            return null;
        }
    }

    /* renamed from: V0 */
    public void m15196V0(int i10, String str) {
        String str2;
        String str3;
        if (str.equals("m3u")) {
            str2 = "iptv_password_table_m3u";
            str3 = "iptv_password_status_table_m3u";
        } else {
            str2 = "iptv_password_table";
            str3 = "iptv_password_status_table";
        }
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f16637c = writableDatabase;
            writableDatabase.delete(str2, "user_id_referred='" + i10 + "'", null);
            this.f16637c.delete(str3, "user_id_referred='" + i10 + "'", null);
            this.f16637c.close();
        } catch (SQLiteDatabaseLockedException | Exception e10) {
        }
    }

    /* renamed from: V1 */
    public ArrayList<SeriesDBModel> m15197V1(String str) {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        if (!SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u")) {
            String str2 = "SELECT  * FROM series_streams_v2 WHERE name_series_stream_v2 LIKE '%" + str + "%'  AND series_streams_v2" + InstructionFileId.DOT + "user_id_referred = '" + m15337A + "' AND series_streams_v2" + InstructionFileId.DOT + "category_id_series_stream_v2 NOT IN (SELECT iptv_password_status_table" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table WHERE iptv_password_status_table" + InstructionFileId.DOT + "user_id_referred ='" + m15337A + "' AND iptv_password_status_table" + InstructionFileId.DOT + "password_status ='1')";
            ArrayList<SeriesDBModel> arrayList = new ArrayList<>();
            try {
                try {
                    Cursor rawQuery = getReadableDatabase().rawQuery(str2, null);
                    if (rawQuery.moveToFirst()) {
                        while (true) {
                            AsyncTask asyncTask = C5255e.f30091o;
                            if (asyncTask != null && asyncTask.isCancelled()) {
                                Log.e("honey", "stopped series");
                                break;
                            }
                            SeriesDBModel seriesDBModel = new SeriesDBModel();
                            seriesDBModel.m15054u(Integer.parseInt(rawQuery.getString(0)));
                            seriesDBModel.m15056w(rawQuery.getString(1));
                            seriesDBModel.m15055v(rawQuery.getString(2));
                            seriesDBModel.m15057x(rawQuery.getString(3));
                            seriesDBModel.m15033I(C5255e.m26215R(rawQuery.getString(4)));
                            seriesDBModel.m15026B(rawQuery.getString(5));
                            seriesDBModel.m15030F(rawQuery.getString(6));
                            seriesDBModel.m15025A(rawQuery.getString(7));
                            seriesDBModel.m15027C(rawQuery.getString(8));
                            seriesDBModel.m15028D(rawQuery.getString(9));
                            seriesDBModel.m15032H(rawQuery.getString(10));
                            seriesDBModel.m15029E(rawQuery.getString(11));
                            seriesDBModel.m15031G(rawQuery.getString(12));
                            seriesDBModel.m15053t(rawQuery.getString(13));
                            seriesDBModel.m15059z(rawQuery.getString(14));
                            seriesDBModel.m15052s(rawQuery.getString(15));
                            arrayList.add(seriesDBModel);
                            if (!rawQuery.moveToNext()) {
                                break;
                            }
                        }
                    }
                    rawQuery.close();
                    return arrayList;
                } catch (SQLiteDatabaseLockedException e10) {
                    return null;
                } catch (Exception e11) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException e12) {
                return null;
            } catch (Exception e13) {
                return null;
            }
        }
        String str3 = "SELECT  * FROM iptv_live_streams_m3u WHERE name LIKE '%" + str + "%'  AND iptv_live_streams_m3u" + InstructionFileId.DOT + "user_id_referred='" + m15337A + "' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "stream_type='series' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "categoryID NOT IN (SELECT iptv_password_status_table_m3u" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table_m3u WHERE iptv_password_status_table_m3u" + InstructionFileId.DOT + "user_id_referred ='" + m15337A + "' AND iptv_password_status_table_m3u" + InstructionFileId.DOT + "password_status ='1')";
        ArrayList<SeriesDBModel> arrayList2 = new ArrayList<>();
        try {
            try {
                Cursor rawQuery2 = getReadableDatabase().rawQuery(str3, null);
                if (rawQuery2.moveToFirst()) {
                    while (true) {
                        AsyncTask asyncTask2 = C5255e.f30091o;
                        if (asyncTask2 != null && asyncTask2.isCancelled()) {
                            Log.e("honey", "stopped series");
                            break;
                        }
                        SeriesDBModel seriesDBModel2 = new SeriesDBModel();
                        seriesDBModel2.m15054u(Integer.parseInt(rawQuery2.getString(0)));
                        seriesDBModel2.m15056w(rawQuery2.getString(1));
                        seriesDBModel2.m15055v(rawQuery2.getString(2));
                        seriesDBModel2.m15057x(rawQuery2.getString(3));
                        seriesDBModel2.m15033I(C5255e.m26215R(rawQuery2.getString(4)));
                        seriesDBModel2.m15026B(rawQuery2.getString(5));
                        seriesDBModel2.m15030F("");
                        seriesDBModel2.m15025A("");
                        seriesDBModel2.m15027C("");
                        seriesDBModel2.m15028D("");
                        seriesDBModel2.m15032H("");
                        seriesDBModel2.m15029E("");
                        seriesDBModel2.m15031G("");
                        seriesDBModel2.m15053t(rawQuery2.getString(8));
                        seriesDBModel2.m15059z("");
                        seriesDBModel2.m15052s("");
                        seriesDBModel2.m15058y(rawQuery2.getString(18));
                        arrayList2.add(seriesDBModel2);
                        if (!rawQuery2.moveToNext()) {
                            break;
                        }
                    }
                }
                rawQuery2.close();
                return arrayList2;
            } catch (SQLiteDatabaseLockedException e14) {
                return null;
            } catch (Exception e15) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException e16) {
            return null;
        } catch (Exception e17) {
            return null;
        }
    }

    /* renamed from: W0 */
    public ArrayList<LiveStreamsDBModel> m15198W0(String str) {
        String str2 = "SELECT stream_id_series_stream_v2,category_id_series_stream_v2,name_series_stream_v2,num_series_stream_v2 FROM series_streams_v2 WHERE stream_id_series_stream_v2 IN(" + str + ") AND user_id_referred = '" + SharepreferenceDBHandler.m15337A(this.f16636b) + "'";
        ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery(str2, null);
            if (rawQuery.moveToFirst()) {
                do {
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    liveStreamsDBModel.m14841s0("series");
                    liveStreamsDBModel.m14840r0(rawQuery.getString(0));
                    liveStreamsDBModel.m14818Y(rawQuery.getString(1));
                    liveStreamsDBModel.m14833k0(rawQuery.getString(2));
                    liveStreamsDBModel.m14834l0(rawQuery.getString(3));
                    arrayList.add(liveStreamsDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return null;
        }
    }

    /* renamed from: W1 */
    public int m15199W1(String str) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM series_streams_v2 WHERE category_id_series_stream_v2='" + str + "'", null);
            rawQuery.moveToFirst();
            int i10 = rawQuery.getInt(0);
            rawQuery.close();
            return i10;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return 0;
        }
    }

    /* renamed from: X0 */
    public ArrayList<LiveStreamsDBModel> m15200X0(String str) {
        String str2 = "SELECT stream_type,stream_id,categoryID,name,num FROM iptv_live_streams WHERE stream_id IN(" + str + ") AND user_id_referred = '" + SharepreferenceDBHandler.m15337A(this.f16636b) + "'";
        ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery(str2, null);
            if (rawQuery.moveToFirst()) {
                do {
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    liveStreamsDBModel.m14841s0(rawQuery.getString(0));
                    liveStreamsDBModel.m14840r0(rawQuery.getString(1));
                    liveStreamsDBModel.m14818Y(rawQuery.getString(2));
                    liveStreamsDBModel.m14833k0(rawQuery.getString(3));
                    liveStreamsDBModel.m14834l0(rawQuery.getString(4));
                    arrayList.add(liveStreamsDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return null;
        }
    }

    /* renamed from: X1 */
    public SeriesDBModel m15201X1(String str) {
        String str2 = "SELECT  * FROM series_streams_v2 WHERE stream_id_series_stream_v2 ='" + str + "' AND user_id_referred = '" + SharepreferenceDBHandler.m15337A(this.f16636b) + "'";
        new ArrayList();
        SeriesDBModel seriesDBModel = new SeriesDBModel();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery(str2, null);
            if (rawQuery.moveToFirst()) {
                do {
                    seriesDBModel.m15054u(Integer.parseInt(rawQuery.getString(0)));
                    seriesDBModel.m15056w(rawQuery.getString(1));
                    seriesDBModel.m15055v(rawQuery.getString(2));
                    seriesDBModel.m15057x(rawQuery.getString(3));
                    seriesDBModel.m15033I(C5255e.m26215R(rawQuery.getString(4)));
                    seriesDBModel.m15026B(rawQuery.getString(5));
                    seriesDBModel.m15030F(rawQuery.getString(6));
                    seriesDBModel.m15025A(rawQuery.getString(7));
                    seriesDBModel.m15027C(rawQuery.getString(8));
                    seriesDBModel.m15028D(rawQuery.getString(9));
                    seriesDBModel.m15032H(rawQuery.getString(10));
                    seriesDBModel.m15029E(rawQuery.getString(11));
                    seriesDBModel.m15031G(rawQuery.getString(12));
                    seriesDBModel.m15053t(rawQuery.getString(13));
                    seriesDBModel.m15059z(rawQuery.getString(14));
                    seriesDBModel.m15052s(rawQuery.getString(15));
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return seriesDBModel;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return null;
        }
    }

    /* renamed from: Y0 */
    public ArrayList<LiveStreamsDBModel> m15202Y0(String str) {
        String str2 = "SELECT stream_id FROM iptv_live_streams WHERE stream_id IN(" + str + ") AND user_id_referred = '" + SharepreferenceDBHandler.m15337A(this.f16636b) + "'";
        ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery(str2, null);
            if (rawQuery.moveToFirst()) {
                do {
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    liveStreamsDBModel.m14840r0(rawQuery.getString(0));
                    arrayList.add(liveStreamsDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return null;
        }
    }

    /* renamed from: Y1 */
    public LiveStreamsDBModel m15203Y1(String str, int i10) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM iptv_recent_watched_m3u WHERE url = '" + str + "' AND user_id_referred = '" + i10 + "'", null);
            LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
            if (rawQuery.moveToFirst()) {
                do {
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
                    liveStreamsDBModel.m14845w0(rawQuery.getString(18));
                    liveStreamsDBModel.m14847x0(rawQuery.getInt(19));
                    liveStreamsDBModel.m14832j0(rawQuery.getLong(20));
                    liveStreamsDBModel.m14831i0(rawQuery.getLong(21));
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return liveStreamsDBModel;
        } catch (SQLiteDatabaseLockedException | Exception e11) {
            return null;
        }
    }

    /* renamed from: Z0 */
    public ArrayList<LiveStreamsDBModel> m15204Z0(String str) {
        String str2 = "SELECT num,name,stream_type,stream_id,stream_icon,added,categoryID,container_extension,rating_from_ten,rating_from_five FROM iptv_live_streams WHERE stream_id IN(" + str + ") AND user_id_referred = '" + SharepreferenceDBHandler.m15337A(this.f16636b) + "' AND stream_type LIKE '%movie%'";
        ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery(str2, null);
            if (rawQuery.moveToFirst()) {
                do {
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    liveStreamsDBModel.m14834l0(rawQuery.getString(0));
                    liveStreamsDBModel.m14833k0(rawQuery.getString(1));
                    liveStreamsDBModel.m14841s0(rawQuery.getString(2));
                    liveStreamsDBModel.m14840r0(rawQuery.getString(3));
                    liveStreamsDBModel.m14839q0(rawQuery.getString(4));
                    liveStreamsDBModel.m14817X(rawQuery.getString(5));
                    liveStreamsDBModel.m14818Y(rawQuery.getString(6));
                    liveStreamsDBModel.m14820a0(rawQuery.getString(7));
                    liveStreamsDBModel.m14837o0(rawQuery.getString(8));
                    liveStreamsDBModel.m14836n0(rawQuery.getString(9));
                    arrayList.add(liveStreamsDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return null;
        }
    }

    /* renamed from: Z1 */
    public int m15205Z1(String str) {
        StringBuilder sb2;
        String str2;
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        if (SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u")) {
            sb2 = new StringBuilder();
            sb2.append("SELECT  COUNT(*) FROM iptv_live_streams_m3u WHERE stream_type='");
            sb2.append(str);
            str2 = "' AND ";
        } else {
            sb2 = new StringBuilder();
            sb2.append("SELECT  COUNT(*) FROM iptv_live_streams WHERE stream_type LIKE '%");
            sb2.append(str);
            str2 = "%' AND ";
        }
        sb2.append(str2);
        sb2.append("user_id_referred");
        sb2.append("='");
        sb2.append(m15337A);
        sb2.append("'");
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery(sb2.toString(), null);
            rawQuery.moveToFirst();
            int i10 = rawQuery.getInt(0);
            rawQuery.close();
            return i10;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return 0;
        }
    }

    /* renamed from: a1 */
    public ArrayList<GetEpisdoeDetailsCallback> m15206a1(String str) {
        String str2 = "SELECT  category_id_series_stream_v2,stream_cover_series_stream_v2,num_series_stream_v2,name_series_stream_v2,stream_id_series_stream_v2 FROM series_streams_v2 WHERE stream_id_series_stream_v2 IN(" + str + ") AND user_id_referred = '" + SharepreferenceDBHandler.m15337A(this.f16636b) + "'";
        ArrayList<GetEpisdoeDetailsCallback> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery(str2, null);
            if (rawQuery.moveToFirst()) {
                do {
                    GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = new GetEpisdoeDetailsCallback();
                    getEpisdoeDetailsCallback.m14971w(rawQuery.getString(0));
                    getEpisdoeDetailsCallback.m14944N(rawQuery.getString(1));
                    getEpisdoeDetailsCallback.m14947Q(rawQuery.getString(2));
                    getEpisdoeDetailsCallback.m14946P(rawQuery.getString(3));
                    getEpisdoeDetailsCallback.m14945O(rawQuery.getString(4));
                    arrayList.add(getEpisdoeDetailsCallback);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return null;
        }
    }

    /* renamed from: a2 */
    public int m15207a2(String str, String str2) {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        if (str2.equals("live")) {
            try {
                Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_live_streams WHERE ( stream_type LIKE '%" + str2 + "%' OR stream_type LIKE '%radio%' )  AND categoryID='" + str + "' AND user_id_referred='" + m15337A + "'", null);
                rawQuery.moveToFirst();
                int i10 = rawQuery.getInt(0);
                rawQuery.close();
                return i10;
            } catch (SQLiteDatabaseLockedException | Exception e10) {
                return 0;
            }
        }
        if (str2.equals("movie")) {
            try {
                Cursor rawQuery2 = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_live_streams WHERE ( stream_type LIKE '%" + str2 + "%' OR stream_type LIKE '%radio%' )  AND categoryID='" + str + "' AND user_id_referred='" + m15337A + "'", null);
                rawQuery2.moveToFirst();
                int i11 = rawQuery2.getInt(0);
                rawQuery2.close();
                return i11;
            } catch (SQLiteDatabaseLockedException | Exception e11) {
                return 0;
            }
        }
        try {
            Cursor rawQuery3 = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_live_streams WHERE ( stream_type LIKE '%" + str2 + "%' OR stream_type LIKE '%radio%' )  AND categoryID='" + str + "' AND user_id_referred='" + m15337A + "'", null);
            rawQuery3.moveToFirst();
            int i12 = rawQuery3.getInt(0);
            rawQuery3.close();
            return i12;
        } catch (SQLiteDatabaseLockedException | Exception e12) {
            return 0;
        }
    }

    /* renamed from: b1 */
    public ArrayList<EPGSourcesModel> m15208b1() {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        String str = "SELECT  * FROM " + (SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u") ? "iptv_epg_sources_m3u" : "iptv_epg_sources") + " WHERE user_id_referred ='" + m15337A + "' AND default_source = '1' LIMIT 1";
        try {
            ArrayList<EPGSourcesModel> arrayList = new ArrayList<>();
            Cursor rawQuery = getReadableDatabase().rawQuery(str, null);
            if (rawQuery.moveToFirst()) {
                do {
                    EPGSourcesModel ePGSourcesModel = new EPGSourcesModel();
                    ePGSourcesModel.m15126h(C5255e.m26215R(rawQuery.getString(0)));
                    ePGSourcesModel.m15129k(rawQuery.getString(1));
                    ePGSourcesModel.m15127i(rawQuery.getString(2));
                    ePGSourcesModel.m15128j(rawQuery.getString(3));
                    ePGSourcesModel.m15125g(rawQuery.getString(4));
                    ePGSourcesModel.m15124f(rawQuery.getString(5));
                    arrayList.add(ePGSourcesModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return null;
        }
    }

    /* renamed from: b2 */
    public int m15209b2(String str) {
        StringBuilder sb2;
        String str2;
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        if (SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u")) {
            sb2 = new StringBuilder();
            sb2.append("SELECT iptv_live_streams_m3u.url  FROM epg_m3u , iptv_live_streams_m3u WHERE iptv_live_streams_m3u.user_id_referred = '");
            sb2.append(m15337A);
            sb2.append("' AND ");
            sb2.append("epg_m3u");
            sb2.append(InstructionFileId.DOT);
            sb2.append("source_ref_id");
            sb2.append(" = '");
            sb2.append(str);
            sb2.append("' AND ");
            sb2.append("epg_m3u");
            sb2.append(InstructionFileId.DOT);
            sb2.append("channel_id");
            sb2.append(" = ");
            sb2.append("iptv_live_streams_m3u");
            sb2.append(InstructionFileId.DOT);
            sb2.append("epg_channel_id");
            sb2.append(" AND ");
            sb2.append("iptv_live_streams_m3u");
            sb2.append(InstructionFileId.DOT);
            sb2.append("categoryID");
            sb2.append(" NOT IN (SELECT ");
            sb2.append("iptv_password_status_table_m3u");
            sb2.append(InstructionFileId.DOT);
            sb2.append("password_status_cat_id");
            sb2.append(" FROM ");
            sb2.append("iptv_password_status_table_m3u");
            sb2.append(" WHERE ");
            sb2.append("iptv_password_status_table_m3u");
            sb2.append(InstructionFileId.DOT);
            sb2.append("user_id_referred");
            sb2.append(" ='");
            sb2.append(m15337A);
            sb2.append("' AND ");
            sb2.append("iptv_password_status_table_m3u");
            sb2.append(InstructionFileId.DOT);
            sb2.append("password_status");
            sb2.append(" ='1') GROUP BY ");
            sb2.append("iptv_live_streams_m3u");
            sb2.append(InstructionFileId.DOT);
            str2 = "url";
        } else {
            sb2 = new StringBuilder();
            sb2.append("SELECT iptv_live_streams.stream_id  FROM epg , iptv_live_streams WHERE iptv_live_streams.user_id_referred = '");
            sb2.append(m15337A);
            sb2.append("' AND ");
            sb2.append("epg");
            sb2.append(InstructionFileId.DOT);
            sb2.append("source_ref_id");
            sb2.append(" = '");
            sb2.append(str);
            sb2.append("' AND ");
            sb2.append("epg");
            sb2.append(InstructionFileId.DOT);
            sb2.append("channel_id");
            sb2.append(" = ");
            sb2.append("iptv_live_streams");
            sb2.append(InstructionFileId.DOT);
            sb2.append("epg_channel_id");
            sb2.append(" AND ");
            sb2.append("iptv_live_streams");
            sb2.append(InstructionFileId.DOT);
            sb2.append("categoryID");
            sb2.append(" NOT IN (SELECT ");
            sb2.append("iptv_password_status_table");
            sb2.append(InstructionFileId.DOT);
            sb2.append("password_status_cat_id");
            sb2.append(" FROM ");
            sb2.append("iptv_password_status_table");
            sb2.append(" WHERE ");
            sb2.append("iptv_password_status_table");
            sb2.append(InstructionFileId.DOT);
            sb2.append("user_id_referred");
            sb2.append(" ='");
            sb2.append(m15337A);
            sb2.append("' AND ");
            sb2.append("iptv_password_status_table");
            sb2.append(InstructionFileId.DOT);
            sb2.append("password_status");
            sb2.append(" ='1') GROUP BY ");
            sb2.append("iptv_live_streams");
            sb2.append(InstructionFileId.DOT);
            str2 = "stream_id";
        }
        sb2.append(str2);
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery(sb2.toString(), null);
            int count = rawQuery.getCount();
            rawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException e10) {
            return 0;
        } catch (Exception e11) {
            return 0;
        }
    }

    /* renamed from: c1 */
    public ArrayList<LiveStreamsDBModel> m15210c1(String str) {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT stream_id FROM iptv_live_streams WHERE stream_type LIKE '%" + str + "%'  AND iptv_live_streams" + InstructionFileId.DOT + "user_id_referred='" + m15337A + "'", null);
            if (rawQuery.moveToFirst()) {
                do {
                    int i10 = 0;
                    try {
                        i10 = Integer.parseInt(rawQuery.getString(0));
                    } catch (NumberFormatException e10) {
                    }
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    liveStreamsDBModel.m14840r0(String.valueOf(i10));
                    arrayList.add(liveStreamsDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e11) {
            return null;
        }
    }

    /* renamed from: c2 */
    public int m15211c2(String str, String str2) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_live_streams WHERE ( stream_type LIKE '%" + str2 + "%' )  AND categoryID='" + str + "' AND user_id_referred = '" + SharepreferenceDBHandler.m15337A(this.f16636b) + "'", null);
            rawQuery.moveToFirst();
            int i10 = rawQuery.getInt(0);
            rawQuery.close();
            return i10;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01c3 A[Catch: SQLiteDatabaseLockedException | Exception -> 0x02b9, SQLiteDatabaseLockedException | Exception -> 0x02b9, SQLiteDatabaseLockedException | Exception -> 0x02b9, LOOP:0: B:11:0x01c3->B:15:?, LOOP_START, TRY_ENTER, TRY_LEAVE, TryCatch #0 {SQLiteDatabaseLockedException | Exception -> 0x02b9, blocks: (B:9:0x01b0, B:9:0x01b0, B:11:0x01c3, B:11:0x01c3, B:11:0x01c3, B:12:0x01c6, B:17:0x02b1, B:17:0x02b1), top: B:8:0x01b0 }] */
    /* renamed from: d1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel> m15212d1(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler.m15212d1(java.lang.String):java.util.ArrayList");
    }

    /* renamed from: d2 */
    public int m15213d2(String str) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM series_m3u_streams WHERE series_m3u_stream_container_cat_id ='" + str + "'", null);
            rawQuery.moveToFirst();
            int i10 = rawQuery.getInt(0);
            rawQuery.close();
            return i10;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x014d A[Catch: SQLiteDatabaseLockedException | Exception -> 0x028c, SQLiteDatabaseLockedException | Exception -> 0x028c, SQLiteDatabaseLockedException | Exception -> 0x028c, SQLiteDatabaseLockedException | Exception -> 0x028c, LOOP:0: B:11:0x014d->B:20:?, LOOP_START, TRY_ENTER, TRY_LEAVE, TryCatch #1 {SQLiteDatabaseLockedException | Exception -> 0x028c, blocks: (B:9:0x013a, B:9:0x013a, B:11:0x014d, B:11:0x014d, B:11:0x014d, B:11:0x014d, B:12:0x0150, B:12:0x0150, B:15:0x0159, B:17:0x0168, B:17:0x0168, B:24:0x0284, B:24:0x0284), top: B:8:0x013a }] */
    /* renamed from: e1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel> m15214e1(java.lang.String r5, int r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler.m15214e1(java.lang.String, int, java.lang.String):java.util.ArrayList");
    }

    /* renamed from: e2 */
    public int m15215e2(Boolean bool) {
        StringBuilder sb2;
        String str;
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        if (bool.booleanValue()) {
            sb2 = new StringBuilder();
            sb2.append("SELECT  COUNT(*) FROM iptv_live_streams_m3u WHERE categoryID='' AND user_id_referred='");
            sb2.append(m15337A);
            sb2.append("' AND ");
            sb2.append("move_to");
            sb2.append(" NOT IN ('live','movie','series') OR ");
            sb2.append("move_to");
            str = " IS NULL";
        } else {
            sb2 = new StringBuilder();
            sb2.append("SELECT  COUNT(*) FROM iptv_live_streams_m3u WHERE categoryID='' AND user_id_referred='");
            sb2.append(m15337A);
            str = "'";
        }
        sb2.append(str);
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery(sb2.toString(), null);
            rawQuery.moveToFirst();
            int i10 = rawQuery.getInt(0);
            rawQuery.close();
            return i10;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return 0;
        }
    }

    /* renamed from: f */
    public void m15216f(Map<String, M3UCategoriesModel> map) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                for (M3UCategoriesModel m3UCategoriesModel : map.values()) {
                    if (m3UCategoriesModel.m14848a() != null) {
                        contentValues.put("categoryID", m3UCategoriesModel.m14848a());
                    } else {
                        contentValues.put("categoryID", "");
                    }
                    if (m3UCategoriesModel.m14849b() != null) {
                        contentValues.put("categoryname", m3UCategoriesModel.m14849b());
                    } else {
                        contentValues.put("categoryname", "");
                    }
                    contentValues.put("user_id_referred", Integer.valueOf(SharepreferenceDBHandler.m15337A(this.f16636b)));
                    writableDatabase.insert("iptv_m3u_all_category", null, contentValues);
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (SQLiteDatabaseLockedException | Exception e10) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
            }
        } catch (Exception e11) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:120:0x1250. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:128:0x3683  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x37bd  */
    /* renamed from: f1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel> m15217f1(java.lang.String r5, java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 14302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler.m15217f1(java.lang.String, java.lang.String):java.util.ArrayList");
    }

    /* renamed from: f2 */
    public int m15218f2(String str) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_live_streams_m3u WHERE categoryID='' AND user_id_referred='" + SharepreferenceDBHandler.m15337A(this.f16636b) + "' AND stream_type='" + str + "'", null);
            rawQuery.moveToFirst();
            int i10 = rawQuery.getInt(0);
            rawQuery.close();
            return i10;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return 0;
        }
    }

    /* renamed from: g1 */
    public ArrayList<LiveStreamsDBModel> m15219g1(String str, String str2) {
        String str3;
        ArrayList<LiveStreamsDBModel> arrayList;
        String str4;
        ArrayList<LiveStreamsDBModel> arrayList2 = new ArrayList<>();
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        if (SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u")) {
            if (str.equals("0")) {
                str4 = "SELECT  * FROM iptv_live_streams_m3u WHERE stream_type ='" + str2 + "' AND user_id_referred='" + m15337A + "'";
            } else if (str.equals("-2") || str.equals("-3") || str.equals("null")) {
                str4 = "";
            } else {
                str4 = "SELECT  * FROM iptv_live_streams_m3u WHERE stream_type ='" + str2 + "' AND categoryID ='" + str + "' AND user_id_referred='" + m15337A + "'";
            }
            try {
                try {
                    Cursor rawQuery = getReadableDatabase().rawQuery(str4, null);
                    if (rawQuery.moveToFirst()) {
                        do {
                            LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                            liveStreamsDBModel.m14826f0(Integer.parseInt(rawQuery.getString(0)));
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
                            liveStreamsDBModel.m14845w0(rawQuery.getString(18));
                            arrayList2.add(liveStreamsDBModel);
                        } while (rawQuery.moveToNext());
                    }
                    rawQuery.close();
                    return arrayList2;
                } catch (SQLiteDatabaseLockedException e10) {
                    return null;
                } catch (Exception e11) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException e12) {
                return null;
            } catch (Exception e13) {
                return null;
            }
        }
        if (str.equals("0") && str2.equals("live")) {
            str3 = "SELECT  * FROM iptv_live_streams WHERE (stream_type LIKE '%" + str2 + "%' OR stream_type LIKE '%radio%' ) AND user_id_referred='" + m15337A + "'";
        } else if (str.equals("-2") || str.equals("-3")) {
            str3 = "SELECT  * FROM iptv_live_streams WHERE (stream_type LIKE '%" + str2 + "%' OR stream_type LIKE '%radio%' ) AND categoryID ='" + str + "' AND user_id_referred='" + m15337A + "'";
        } else {
            StringBuilder sb2 = str.equals("null") ? new StringBuilder() : new StringBuilder();
            sb2.append("SELECT  * FROM iptv_live_streams WHERE categoryID ='");
            sb2.append(str);
            sb2.append("' AND ");
            sb2.append("user_id_referred");
            sb2.append("='");
            sb2.append(m15337A);
            sb2.append("'");
            str3 = sb2.toString();
        }
        try {
            try {
                Cursor rawQuery2 = getReadableDatabase().rawQuery(str3, null);
                if (rawQuery2.moveToFirst()) {
                    arrayList = arrayList2;
                    do {
                        LiveStreamsDBModel liveStreamsDBModel2 = new LiveStreamsDBModel();
                        liveStreamsDBModel2.m14826f0(Integer.parseInt(rawQuery2.getString(0)));
                        liveStreamsDBModel2.m14834l0(rawQuery2.getString(1));
                        liveStreamsDBModel2.m14833k0(rawQuery2.getString(2));
                        liveStreamsDBModel2.m14841s0(rawQuery2.getString(3));
                        liveStreamsDBModel2.m14840r0(rawQuery2.getString(4));
                        liveStreamsDBModel2.m14839q0(rawQuery2.getString(5));
                        liveStreamsDBModel2.m14824d0(rawQuery2.getString(6));
                        liveStreamsDBModel2.m14817X(rawQuery2.getString(7));
                        liveStreamsDBModel2.m14818Y(rawQuery2.getString(8));
                        liveStreamsDBModel2.m14821b0(rawQuery2.getString(9));
                        liveStreamsDBModel2.m14842t0(rawQuery2.getString(10));
                        liveStreamsDBModel2.m14822c0(rawQuery2.getString(11));
                        liveStreamsDBModel2.m14843u0(rawQuery2.getString(12));
                        liveStreamsDBModel2.m14844v0(rawQuery2.getString(13));
                        liveStreamsDBModel2.m14819Z(rawQuery2.getString(14));
                        liveStreamsDBModel2.m14838p0(rawQuery2.getString(15));
                        liveStreamsDBModel2.m14829h0(rawQuery2.getString(16));
                        liveStreamsDBModel2.m14820a0(rawQuery2.getString(17));
                        arrayList.add(liveStreamsDBModel2);
                    } while (rawQuery2.moveToNext());
                } else {
                    arrayList = arrayList2;
                }
                rawQuery2.close();
                return arrayList;
            } catch (SQLiteDatabaseLockedException e14) {
                return null;
            } catch (Exception e15) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException e16) {
            return null;
        } catch (Exception e17) {
            return null;
        }
    }

    /* renamed from: g2 */
    public int m15220g2(String str) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM series_streams_v2 WHERE category_id_series_stream_v2 ='" + str + "' AND user_id_referred = '" + SharepreferenceDBHandler.m15337A(this.f16636b) + "'", null);
            rawQuery.moveToFirst();
            int i10 = rawQuery.getInt(0);
            rawQuery.close();
            return i10;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return 0;
        }
    }

    /* renamed from: h1 */
    public ArrayList<FavouriteDBModel> m15221h1() {
        String str = "SELECT GROUP_CONCAT(stream_id_url) AS stream_id_url , app_type FROM iptv_live_watched WHERE user_id_referred=" + SharepreferenceDBHandler.m15337A(this.f16636b) + " GROUP BY app_type";
        ArrayList<FavouriteDBModel> arrayList = new ArrayList<>();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f16637c = readableDatabase;
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

    /* renamed from: h2 */
    public ImportStatusModel m15222h2(String str) {
        String str2;
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        String m15373f = SharepreferenceDBHandler.m15373f(this.f16636b);
        if (str.equals("epg")) {
            ArrayList<EPGSourcesModel> m15208b1 = m15208b1();
            str2 = "SELECT * FROM iptv_import_status WHERE type = '" + str + "' AND user_id_referred = '" + m15337A + "' AND app_type = '" + m15373f + "' AND source_ref_id = '" + ((m15208b1 == null || m15208b1.size() <= 0) ? "0" : String.valueOf(m15208b1.get(0).m15121c())) + "'";
        } else {
            str2 = "SELECT * FROM iptv_import_status WHERE type = '" + str + "' AND user_id_referred = '" + m15337A + "' AND app_type = '" + m15373f + "'";
        }
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery(str2, null);
            ImportStatusModel importStatusModel = new ImportStatusModel();
            if (rawQuery.moveToFirst()) {
                do {
                    importStatusModel.m15141h(C5255e.m26215R(rawQuery.getString(0)));
                    importStatusModel.m15145l(rawQuery.getString(1));
                    importStatusModel.m15143j(rawQuery.getString(2));
                    importStatusModel.m15140g(rawQuery.getString(3));
                    importStatusModel.m15144k(rawQuery.getString(4));
                    importStatusModel.m15142i(rawQuery.getString(7));
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return importStatusModel;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return null;
        }
    }

    /* renamed from: i1 */
    public ArrayList<LiveStreamCategoryIdDBModel> m15223i1(String str) {
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM iptv_movie_category WHERE paent_id='" + str + "' AND user_id_referred='" + SharepreferenceDBHandler.m15337A(this.f16636b) + "'", null);
            if (rawQuery.moveToFirst()) {
                do {
                    LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                    liveStreamCategoryIdDBModel.m14791f(Integer.parseInt(rawQuery.getString(0)));
                    liveStreamCategoryIdDBModel.m14792g(rawQuery.getString(1));
                    liveStreamCategoryIdDBModel.m14793h(rawQuery.getString(2));
                    liveStreamCategoryIdDBModel.m14795j(Integer.parseInt(rawQuery.getString(3)));
                    arrayList.add(liveStreamCategoryIdDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return null;
        }
    }

    /* renamed from: i2 */
    public ImportStatusModel m15224i2(String str, String str2) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM iptv_import_status WHERE type = '" + str + "' AND user_id_referred = '" + SharepreferenceDBHandler.m15337A(this.f16636b) + "' AND app_type = '" + SharepreferenceDBHandler.m15373f(this.f16636b) + "' AND source_ref_id = '" + str2 + "'", null);
            ImportStatusModel importStatusModel = new ImportStatusModel();
            if (rawQuery.moveToFirst()) {
                do {
                    importStatusModel.m15141h(C5255e.m26215R(rawQuery.getString(0)));
                    importStatusModel.m15145l(rawQuery.getString(1));
                    importStatusModel.m15143j(rawQuery.getString(2));
                    importStatusModel.m15140g(rawQuery.getString(3));
                    importStatusModel.m15144k(rawQuery.getString(4));
                    importStatusModel.m15142i(rawQuery.getString(7));
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return importStatusModel;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return null;
        }
    }

    /* renamed from: j1 */
    public ArrayList<LiveStreamCategoryIdDBModel> m15225j1() {
        int i10;
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = new ArrayList<>();
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        if (SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u")) {
            try {
                try {
                    Cursor rawQuery = getReadableDatabase().rawQuery("SELECT iptv_movie_category_m3u.* , COUNT(iptv_live_streams_m3u.id) AS TOTAL_COUNT FROM iptv_movie_category_m3u,iptv_live_streams_m3u WHERE iptv_movie_category_m3u.categoryID = iptv_live_streams_m3u.categoryID AND iptv_movie_category_m3u.user_id_referred = '" + m15337A + "' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "user_id_referred = '" + m15337A + "' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "stream_type = 'movie' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "categoryID NOT IN (SELECT iptv_password_status_table_m3u" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table_m3u WHERE iptv_password_status_table_m3u" + InstructionFileId.DOT + "user_id_referred ='" + m15337A + "' AND iptv_password_status_table_m3u" + InstructionFileId.DOT + "password_status ='1') GROUP BY iptv_live_streams_m3u" + InstructionFileId.DOT + "categoryID ORDER BY iptv_movie_category_m3u" + InstructionFileId.DOT + Name.MARK, null);
                    if (rawQuery.moveToFirst()) {
                        do {
                            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                            liveStreamCategoryIdDBModel.m14791f(Integer.parseInt(rawQuery.getString(0)));
                            liveStreamCategoryIdDBModel.m14792g(rawQuery.getString(1));
                            liveStreamCategoryIdDBModel.m14793h(rawQuery.getString(2));
                            liveStreamCategoryIdDBModel.m14794i(C5255e.m26215R(rawQuery.getString(5)));
                            arrayList.add(liveStreamCategoryIdDBModel);
                        } while (rawQuery.moveToNext());
                    }
                    rawQuery.close();
                    return arrayList;
                } catch (SQLiteDatabaseLockedException e10) {
                    return null;
                } catch (Exception e11) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException e12) {
                return null;
            } catch (Exception e13) {
                return null;
            }
        }
        try {
            try {
                Cursor rawQuery2 = getReadableDatabase().rawQuery("SELECT iptv_movie_category.* , COUNT(iptv_live_streams.id) AS TOTAL_COUNT FROM iptv_movie_category,iptv_live_streams WHERE iptv_movie_category.categoryID_movie = iptv_live_streams.categoryID AND iptv_movie_category.user_id_referred = '" + m15337A + "' AND iptv_live_streams" + InstructionFileId.DOT + "user_id_referred = '" + m15337A + "' AND iptv_live_streams" + InstructionFileId.DOT + "stream_type = 'movie' AND iptv_live_streams" + InstructionFileId.DOT + "categoryID NOT IN (SELECT iptv_password_status_table" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table WHERE iptv_password_status_table" + InstructionFileId.DOT + "user_id_referred ='" + m15337A + "' AND iptv_password_status_table" + InstructionFileId.DOT + "password_status ='1') GROUP BY iptv_live_streams" + InstructionFileId.DOT + "categoryID ORDER BY iptv_movie_category" + InstructionFileId.DOT + "id_movie", null);
                if (rawQuery2.moveToFirst()) {
                    do {
                        try {
                            i10 = Integer.parseInt(rawQuery2.getString(3));
                        } catch (NumberFormatException e14) {
                            i10 = 0;
                        }
                        LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel2 = new LiveStreamCategoryIdDBModel();
                        liveStreamCategoryIdDBModel2.m14791f(Integer.parseInt(rawQuery2.getString(0)));
                        liveStreamCategoryIdDBModel2.m14792g(rawQuery2.getString(1));
                        liveStreamCategoryIdDBModel2.m14793h(rawQuery2.getString(2));
                        liveStreamCategoryIdDBModel2.m14795j(i10);
                        liveStreamCategoryIdDBModel2.m14794i(C5255e.m26215R(rawQuery2.getString(5)));
                        arrayList.add(liveStreamCategoryIdDBModel2);
                    } while (rawQuery2.moveToNext());
                }
                rawQuery2.close();
                return arrayList;
            } catch (SQLiteDatabaseLockedException e15) {
                return null;
            } catch (Exception e16) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException e17) {
            return null;
        } catch (Exception e18) {
            return null;
        }
    }

    /* renamed from: j2 */
    public ArrayList<ImportStatusModel> m15226j2() {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        String m15373f = SharepreferenceDBHandler.m15373f(this.f16636b);
        ArrayList<ImportStatusModel> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM iptv_import_status WHERE user_id_referred = '" + m15337A + "' AND app_type = '" + m15373f + "'", null);
            if (rawQuery.moveToFirst()) {
                do {
                    ImportStatusModel importStatusModel = new ImportStatusModel();
                    importStatusModel.m15141h(C5255e.m26215R(rawQuery.getString(0)));
                    importStatusModel.m15145l(rawQuery.getString(1));
                    importStatusModel.m15143j(rawQuery.getString(2));
                    importStatusModel.m15140g(rawQuery.getString(3));
                    importStatusModel.m15144k(rawQuery.getString(4));
                    importStatusModel.m15142i(rawQuery.getString(7));
                    arrayList.add(importStatusModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return null;
        }
    }

    /* renamed from: k1 */
    public ArrayList<LiveStreamCategoryIdDBModel> m15227k1() {
        StringBuilder sb2;
        String str;
        int i10;
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = new ArrayList<>();
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        if (SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u")) {
            sb2 = new StringBuilder();
            sb2.append("SELECT * FROM iptv_movie_category_m3u WHERE user_id_referred='");
            sb2.append(m15337A);
            sb2.append("' AND ");
            sb2.append("categoryID");
            str = " IS NOT NULL";
        } else {
            sb2 = new StringBuilder();
            sb2.append("SELECT iptv_movie_category.* , COUNT(iptv_live_streams.id) AS TOTAL_COUNT FROM iptv_movie_category,iptv_live_streams WHERE iptv_movie_category.categoryID_movie = iptv_live_streams.categoryID AND iptv_movie_category.user_id_referred = '");
            sb2.append(m15337A);
            sb2.append("' AND ");
            sb2.append("iptv_live_streams");
            sb2.append(InstructionFileId.DOT);
            sb2.append("stream_type");
            sb2.append(" = 'movie' GROUP BY ");
            sb2.append("iptv_live_streams");
            sb2.append(InstructionFileId.DOT);
            sb2.append("categoryID");
            sb2.append(" ORDER BY ");
            sb2.append("iptv_movie_category");
            sb2.append(InstructionFileId.DOT);
            str = "id_movie";
        }
        sb2.append(str);
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery(sb2.toString(), null);
            if (rawQuery.moveToFirst()) {
                do {
                    try {
                        i10 = Integer.parseInt(rawQuery.getString(3));
                    } catch (NumberFormatException e10) {
                        i10 = 0;
                    }
                    LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                    liveStreamCategoryIdDBModel.m14791f(Integer.parseInt(rawQuery.getString(0)));
                    liveStreamCategoryIdDBModel.m14792g(rawQuery.getString(1));
                    liveStreamCategoryIdDBModel.m14793h(rawQuery.getString(2));
                    liveStreamCategoryIdDBModel.m14795j(i10);
                    liveStreamCategoryIdDBModel.m14794i(C5255e.m26215R(rawQuery.getString(5)));
                    arrayList.add(liveStreamCategoryIdDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e11) {
            return null;
        }
    }

    /* renamed from: k2 */
    public void m15228k2(ArrayList<ImportStatusModel> arrayList, String str) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
                ContentValues contentValues = new ContentValues();
                int size = arrayList.size();
                if (size != 0) {
                    for (int i10 = 0; i10 < size; i10++) {
                        contentValues.put("type", arrayList.get(i10).m15139f());
                        contentValues.put("status", arrayList.get(i10).m15137d());
                        contentValues.put("date", arrayList.get(i10).m15134a());
                        contentValues.put("time", arrayList.get(i10).m15138e());
                        contentValues.put("user_id_referred", Integer.valueOf(m15337A));
                        contentValues.put("app_type", str);
                        contentValues.put("source_ref_id", arrayList.get(i10).m15136c());
                        writableDatabase.insert("iptv_import_status", null, contentValues);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (SQLiteDatabaseLockedException | Exception e10) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
            }
        } catch (Exception e11) {
        }
    }

    /* renamed from: l */
    public boolean m15229l(List<LiveStreamsCallback> list) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
                ContentValues contentValues = new ContentValues();
                for (LiveStreamsCallback liveStreamsCallback : list) {
                    C5255e.f30092p = true;
                    if (liveStreamsCallback.m15001f() != null) {
                        contentValues.put("num", String.valueOf(liveStreamsCallback.m15001f()));
                    } else {
                        contentValues.put("num", "");
                    }
                    if (liveStreamsCallback.getName() != null) {
                        contentValues.put("name", liveStreamsCallback.getName());
                    } else {
                        contentValues.put("name", "");
                    }
                    if (liveStreamsCallback.m15004i() != null) {
                        contentValues.put("stream_type", liveStreamsCallback.m15004i());
                    } else {
                        contentValues.put("stream_type", "");
                    }
                    if (liveStreamsCallback.m15003h() != null) {
                        contentValues.put("stream_id", liveStreamsCallback.m15003h());
                    } else {
                        contentValues.put("stream_id", "");
                    }
                    if (liveStreamsCallback.m15002g() != null) {
                        contentValues.put("stream_icon", liveStreamsCallback.m15002g());
                    } else {
                        contentValues.put("stream_icon", "");
                    }
                    if (liveStreamsCallback.m15000e() != null) {
                        contentValues.put("epg_channel_id", liveStreamsCallback.m15000e());
                    } else {
                        contentValues.put("epg_channel_id", "");
                    }
                    if (liveStreamsCallback.m14996a() != null) {
                        contentValues.put("added", liveStreamsCallback.m14996a());
                    } else {
                        contentValues.put("added", "");
                    }
                    if (liveStreamsCallback.m14997b() == null || m15165G0(liveStreamsCallback.m14997b()) <= 0) {
                        contentValues.put("categoryID", "-2");
                    } else {
                        contentValues.put("categoryID", liveStreamsCallback.m14997b());
                    }
                    if (liveStreamsCallback.m14998c() != null) {
                        contentValues.put("custom_sid", liveStreamsCallback.m14998c());
                    } else {
                        contentValues.put("custom_sid", "");
                    }
                    if (liveStreamsCallback.m15005j() != null) {
                        contentValues.put("tv_archive", liveStreamsCallback.m15005j());
                    } else {
                        contentValues.put("tv_archive", "");
                    }
                    if (liveStreamsCallback.m14999d() != null) {
                        contentValues.put("direct_source", liveStreamsCallback.m14999d());
                    } else {
                        contentValues.put("direct_source", "");
                    }
                    if (liveStreamsCallback.m15006k() != null) {
                        contentValues.put("tv_archive_duration", liveStreamsCallback.m15006k());
                    } else {
                        contentValues.put("tv_archive_duration", "");
                    }
                    contentValues.put("type_name", "");
                    contentValues.put("category_name", "");
                    contentValues.put("series_no", "");
                    contentValues.put("live", "");
                    contentValues.put("container_extension", "");
                    contentValues.put("rating_from_ten", "");
                    contentValues.put("rating_from_five", "");
                    contentValues.put("user_id_referred", Integer.valueOf(m15337A));
                    writableDatabase.insert("iptv_live_streams", null, contentValues);
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                C5255e.f30092p = false;
                return true;
            } catch (SQLiteDatabaseLockedException e10) {
                Log.w("msg", "exception");
                writableDatabase.endTransaction();
                C5255e.f30092p = false;
                return false;
            } catch (Exception e11) {
                writableDatabase.endTransaction();
                C5255e.f30092p = false;
                Log.w("msg", "exception");
                return false;
            }
        } catch (Exception e12) {
            return false;
        }
    }

    /* renamed from: l1 */
    public ArrayList<PasswordDBModel> m15230l1(int i10) {
        StringBuilder sb2;
        String str;
        ArrayList<PasswordDBModel> arrayList = new ArrayList<>();
        if (SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u")) {
            sb2 = new StringBuilder();
            str = "SELECT * FROM iptv_password_table_m3u WHERE user_id_referred=";
        } else {
            sb2 = new StringBuilder();
            str = "SELECT * FROM iptv_password_table WHERE user_id_referred=";
        }
        sb2.append(str);
        sb2.append(i10);
        sb2.append("");
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery(sb2.toString(), null);
            if (rawQuery.moveToFirst()) {
                do {
                    PasswordDBModel passwordDBModel = new PasswordDBModel();
                    passwordDBModel.m15286d(Integer.parseInt(rawQuery.getString(0)));
                    passwordDBModel.m15287e(rawQuery.getString(1));
                    passwordDBModel.m15289g(rawQuery.getString(2));
                    arrayList.add(passwordDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return null;
        }
    }

    /* renamed from: l2 */
    public int m15231l2(String str, int i10) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_recent_watched_m3u WHERE url='" + str + "' AND user_id_referred='" + i10 + "'", null);
            rawQuery.moveToFirst();
            int i11 = rawQuery.getInt(0);
            rawQuery.close();
            return i11;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return 0;
        }
    }

    /* renamed from: m1 */
    public ArrayList<PasswordStatusDBModel> m15232m1(int i10) {
        ArrayList<PasswordStatusDBModel> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM " + (SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u") ? "iptv_password_status_table_m3u" : "iptv_password_status_table") + " WHERE user_id_referred=" + i10 + "", null);
            if (rawQuery.moveToFirst()) {
                do {
                    PasswordStatusDBModel passwordStatusDBModel = new PasswordStatusDBModel();
                    passwordStatusDBModel.m15294e(Integer.parseInt(rawQuery.getString(0)));
                    passwordStatusDBModel.m15296g(rawQuery.getString(1));
                    passwordStatusDBModel.m15297h(rawQuery.getString(2));
                    passwordStatusDBModel.m15295f(rawQuery.getString(3));
                    arrayList.add(passwordStatusDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return null;
        }
    }

    /* renamed from: m2 */
    public int m15233m2() {
        try {
            String m15373f = SharepreferenceDBHandler.m15373f(this.f16636b);
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_live_watched WHERE user_id_referred='" + SharepreferenceDBHandler.m15337A(this.f16636b) + "' AND app_type = '" + m15373f + "'", null);
            rawQuery.moveToFirst();
            int i10 = rawQuery.getInt(0);
            rawQuery.close();
            return i10;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return 0;
        }
    }

    /* renamed from: n1 */
    public int m15234n1(int i10) {
        int i11;
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM iptv_live_streams WHERE stream_type ='movie' AND user_id_referred = '" + SharepreferenceDBHandler.m15337A(this.f16636b) + "'  ORDER BY " + Name.MARK + " DESC LIMIT " + i10, null);
            if (rawQuery.moveToFirst()) {
                i11 = 0;
                while (true) {
                    AsyncTask asyncTask = C5255e.f30088l;
                    if (asyncTask != null && asyncTask.isCancelled()) {
                        Log.e("honey", "stopped");
                        break;
                    }
                    int i12 = i11 + 1;
                    i11 = i12;
                    if (!rawQuery.moveToNext()) {
                        i11 = i12;
                        break;
                    }
                }
            } else {
                i11 = 0;
            }
            rawQuery.close();
            return i11;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return 0;
        }
    }

    /* renamed from: n2 */
    public void m15235n2() {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.execSQL("DELETE FROM iptv_m3u_all_category WHERE user_id_referred='" + m15337A + "'");
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: o */
    public boolean m15236o(ArrayList<LiveStreamsDBModel> arrayList, String str) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                Iterator<LiveStreamsDBModel> it = arrayList.iterator();
                while (it.hasNext()) {
                    LiveStreamsDBModel next = it.next();
                    if (next.getName() == null) {
                        Log.e("sdsadsd", "addAllAvailableChannel:" + next.getName());
                    }
                    if (next.m14805L() != null) {
                        contentValues.put("num", String.valueOf(next.m14805L()));
                    } else {
                        contentValues.put("num", "");
                    }
                    if (next.getName() != null) {
                        contentValues.put("name", next.getName());
                    } else {
                        contentValues.put("name", "");
                    }
                    contentValues.put("stream_type", str);
                    if (next.m14811R() != null) {
                        contentValues.put("stream_id", next.m14811R());
                    } else {
                        contentValues.put("stream_id", "");
                    }
                    if (next.m14810Q() != null) {
                        contentValues.put("stream_icon", next.m14810Q());
                    } else {
                        contentValues.put("stream_icon", "");
                    }
                    if (next.m14798E() != null) {
                        contentValues.put("epg_channel_id", next.m14798E());
                    } else {
                        contentValues.put("epg_channel_id", "");
                    }
                    if (next.m14823d() != null) {
                        contentValues.put("added", next.m14823d());
                    } else {
                        contentValues.put("added", "");
                    }
                    if (next.m14827g() != null) {
                        contentValues.put("categoryID", next.m14827g());
                    } else {
                        contentValues.put("categoryID", "");
                    }
                    if (next.m14796A() != null) {
                        contentValues.put("custom_sid", next.m14796A());
                    } else {
                        contentValues.put("custom_sid", "");
                    }
                    if (next.m14813T() != null) {
                        contentValues.put("tv_archive", next.m14813T());
                    } else {
                        contentValues.put("tv_archive", "");
                    }
                    if (next.m14797D() != null) {
                        contentValues.put("direct_source", next.m14797D());
                    } else {
                        contentValues.put("direct_source", "");
                    }
                    if (next.m14814U() != null) {
                        contentValues.put("tv_archive_duration", next.m14814U());
                    } else {
                        contentValues.put("tv_archive_duration", "");
                    }
                    if (next.m14815V() != null) {
                        contentValues.put("type_name", String.valueOf(next.m14815V()));
                    } else {
                        contentValues.put("type_name", "");
                    }
                    if (next.m14830i() != null) {
                        contentValues.put("category_name", next.m14830i());
                    } else {
                        contentValues.put("category_name", "");
                    }
                    if (next.m14809P() != null) {
                        contentValues.put("series_no", String.valueOf(next.m14809P()));
                    } else {
                        contentValues.put("series_no", "");
                    }
                    if (next.m14802I() != null) {
                        contentValues.put("live", next.m14802I());
                    } else {
                        contentValues.put("live", "");
                    }
                    if (next.m14846x() != null) {
                        contentValues.put("container_extension", String.valueOf(next.m14846x()));
                    } else {
                        contentValues.put("container_extension", "");
                    }
                    if (next.m14816W() != null) {
                        contentValues.put("url", next.m14816W());
                    } else {
                        contentValues.put("url", "");
                    }
                    contentValues.put("user_id_referred", Integer.valueOf(SharepreferenceDBHandler.m15337A(this.f16636b)));
                    writableDatabase.insert("iptv_live_streams_m3u", null, contentValues);
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                writableDatabase.close();
                Log.e("sdsadsd", "addAllAvailableChannel: Transaction end");
                return true;
            } catch (SQLiteDatabaseLockedException e10) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
                return false;
            } catch (Exception e11) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
                return false;
            }
        } catch (Exception e12) {
            return false;
        }
    }

    /* renamed from: o0 */
    public void m15237o0(String str) {
        try {
            String m15373f = SharepreferenceDBHandler.m15373f(this.f16636b);
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("stream_id_url", str);
            contentValues.put("user_id_referred", Integer.valueOf(m15337A));
            contentValues.put("app_type", m15373f);
            writableDatabase.insert("iptv_live_watched", null, contentValues);
        } catch (SQLiteDatabaseLockedException | Exception e10) {
        }
    }

    /* renamed from: o1 */
    public int m15238o1(int i10) {
        int i11;
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM series_streams_v2 WHERE user_id_referred = '" + SharepreferenceDBHandler.m15337A(this.f16636b) + "' ORDER BY id_series_stream_v2 DESC LIMIT " + i10, null);
            if (rawQuery.moveToFirst()) {
                i11 = 0;
                while (true) {
                    AsyncTask asyncTask = C5255e.f30088l;
                    if (asyncTask != null && asyncTask.isCancelled()) {
                        Log.e("honey", "stopped");
                        break;
                    }
                    int i12 = i11 + 1;
                    i11 = i12;
                    if (!rawQuery.moveToNext()) {
                        i11 = i12;
                        break;
                    }
                }
            } else {
                i11 = 0;
            }
            rawQuery.close();
            return i11;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return 0;
        }
    }

    /* renamed from: o2 */
    public void m15239o2(int i10) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.execSQL("DELETE FROM iptv_movie_category_m3u WHERE user_id_referred='" + i10 + "'");
            writableDatabase.execSQL("DELETE FROM iptv_series_category_m3u WHERE user_id_referred='" + i10 + "'");
            writableDatabase.execSQL("DELETE FROM iptv_live_category_m3u WHERE user_id_referred='" + i10 + "'");
            writableDatabase.execSQL("DELETE FROM iptv_live_streams_m3u WHERE user_id_referred='" + i10 + "'");
            writableDatabase.execSQL("DELETE FROM iptv_m3u_all_category WHERE user_id_referred='" + i10 + "'");
            writableDatabase.execSQL("DELETE FROM iptv_m3u_favourites WHERE user_id_referred='" + i10 + "'");
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(this.f16639e);
        sQLiteDatabase.execSQL(this.f16640f);
        sQLiteDatabase.execSQL(this.f16656v);
        sQLiteDatabase.execSQL(this.f16646l);
        sQLiteDatabase.execSQL(this.f16649o);
        sQLiteDatabase.execSQL(this.f16641g);
        sQLiteDatabase.execSQL(this.f16652r);
        sQLiteDatabase.execSQL(this.f16659y);
        sQLiteDatabase.execSQL(this.f16627A);
        sQLiteDatabase.execSQL(this.f16655u);
        sQLiteDatabase.execSQL(this.f16642h);
        sQLiteDatabase.execSQL(this.f16658x);
        sQLiteDatabase.execSQL(this.f16628B);
        sQLiteDatabase.execSQL(this.f16653s);
        sQLiteDatabase.execSQL(this.f16643i);
        sQLiteDatabase.execSQL(this.f16644j);
        sQLiteDatabase.execSQL(this.f16645k);
        sQLiteDatabase.execSQL(this.f16650p);
        sQLiteDatabase.execSQL(this.f16647m);
        sQLiteDatabase.execSQL(this.f16654t);
        sQLiteDatabase.execSQL(this.f16634H);
        sQLiteDatabase.execSQL(this.f16635I);
        sQLiteDatabase.execSQL(this.f16647m);
        sQLiteDatabase.execSQL(this.f16660z);
        sQLiteDatabase.execSQL(this.f16657w);
        sQLiteDatabase.execSQL(this.f16631E);
        sQLiteDatabase.execSQL(this.f16632F);
        sQLiteDatabase.execSQL(this.f16633G);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (i10 < 3) {
            sQLiteDatabase.execSQL(this.f16648n);
            sQLiteDatabase.execSQL(this.f16651q);
        }
        if (i10 < 4) {
            sQLiteDatabase.execSQL(this.f16655u);
            sQLiteDatabase.execSQL(this.f16642h);
            sQLiteDatabase.execSQL(this.f16658x);
            sQLiteDatabase.execSQL(this.f16628B);
            sQLiteDatabase.execSQL(this.f16653s);
            sQLiteDatabase.execSQL(this.f16643i);
            sQLiteDatabase.execSQL(this.f16644j);
            sQLiteDatabase.execSQL(this.f16645k);
            sQLiteDatabase.execSQL(this.f16650p);
            sQLiteDatabase.execSQL(this.f16647m);
            sQLiteDatabase.execSQL(this.f16654t);
        }
        if (i10 < 5) {
            sQLiteDatabase.execSQL(this.f16629C);
            sQLiteDatabase.execSQL(this.f16630D);
        }
        if (i10 < 6) {
            sQLiteDatabase.execSQL(this.f16660z);
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS iptv_live_category");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS iptv_movie_category");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS series_category_v2");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS iptv_live_streams");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS series_streams_v2");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS epg");
            sQLiteDatabase.execSQL(this.f16639e);
            sQLiteDatabase.execSQL(this.f16640f);
            sQLiteDatabase.execSQL(this.f16634H);
            sQLiteDatabase.execSQL(this.f16652r);
            sQLiteDatabase.execSQL(this.f16635I);
            sQLiteDatabase.execSQL(this.f16656v);
            sQLiteDatabase.execSQL(this.f16657w);
            sQLiteDatabase.execSQL(this.f16631E);
            sQLiteDatabase.execSQL(this.f16632F);
        }
        if (i10 < 7) {
            sQLiteDatabase.execSQL(this.f16633G);
        }
    }

    /* renamed from: p */
    public boolean m15240p(List<VodStreamsCallback> list) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
                ContentValues contentValues = new ContentValues();
                for (VodStreamsCallback vodStreamsCallback : list) {
                    C5255e.f30092p = true;
                    if (vodStreamsCallback.m15102g() != null) {
                        contentValues.put("num", String.valueOf(vodStreamsCallback.m15102g()));
                    } else {
                        contentValues.put("num", "");
                    }
                    if (vodStreamsCallback.m15101f() != null) {
                        contentValues.put("name", vodStreamsCallback.m15101f());
                    } else {
                        contentValues.put("name", "");
                    }
                    if (vodStreamsCallback.m15108m() != null) {
                        contentValues.put("stream_type", vodStreamsCallback.m15108m());
                    } else {
                        contentValues.put("stream_type", "");
                    }
                    if (vodStreamsCallback.m15107l() != null) {
                        contentValues.put("stream_id", vodStreamsCallback.m15107l());
                    } else {
                        contentValues.put("stream_id", "");
                    }
                    if (vodStreamsCallback.m15106k() != null) {
                        contentValues.put("stream_icon", vodStreamsCallback.m15106k());
                    } else {
                        contentValues.put("stream_icon", "");
                    }
                    contentValues.put("epg_channel_id", "");
                    if (vodStreamsCallback.m15096a() != null) {
                        contentValues.put("added", vodStreamsCallback.m15096a());
                    } else {
                        contentValues.put("added", "");
                    }
                    if (vodStreamsCallback.m15097b() == null || m15168H0(vodStreamsCallback.m15097b()) <= 0) {
                        contentValues.put("categoryID", "-3");
                    } else {
                        contentValues.put("categoryID", vodStreamsCallback.m15097b());
                    }
                    if (vodStreamsCallback.m15099d() != null) {
                        contentValues.put("custom_sid", vodStreamsCallback.m15099d());
                    } else {
                        contentValues.put("custom_sid", "");
                    }
                    contentValues.put("tv_archive", "");
                    if (vodStreamsCallback.m15100e() != null) {
                        contentValues.put("direct_source", vodStreamsCallback.m15100e());
                    } else {
                        contentValues.put("direct_source", "");
                    }
                    contentValues.put("tv_archive_duration", "");
                    contentValues.put("type_name", "");
                    contentValues.put("category_name", "");
                    if (vodStreamsCallback.m15105j() != null) {
                        contentValues.put("series_no", String.valueOf(vodStreamsCallback.m15105j()));
                    } else {
                        contentValues.put("series_no", "");
                    }
                    contentValues.put("live", "");
                    if (vodStreamsCallback.m15098c() != null) {
                        contentValues.put("container_extension", String.valueOf(vodStreamsCallback.m15098c()));
                    } else {
                        contentValues.put("container_extension", "");
                    }
                    if (vodStreamsCallback.m15103h() != null) {
                        contentValues.put("rating_from_ten", vodStreamsCallback.m15103h());
                    } else {
                        contentValues.put("rating_from_ten", "");
                    }
                    if (vodStreamsCallback.m15104i() != null) {
                        contentValues.put("rating_from_five", String.valueOf(vodStreamsCallback.m15104i()));
                    } else {
                        contentValues.put("rating_from_five", "");
                    }
                    contentValues.put("user_id_referred", Integer.valueOf(m15337A));
                    writableDatabase.insert("iptv_live_streams", null, contentValues);
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                C5255e.f30092p = false;
                return true;
            } catch (SQLiteDatabaseLockedException e10) {
                writableDatabase.endTransaction();
                C5255e.f30092p = false;
                Log.w("msg", "exception");
                return false;
            } catch (Exception e11) {
                writableDatabase.endTransaction();
                C5255e.f30092p = false;
                Log.w("msg", "exception");
                return false;
            }
        } catch (Exception e12) {
            return false;
        }
    }

    /* renamed from: p1 */
    public ArrayList<LiveStreamsDBModel> m15241p1() {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        String m15373f = SharepreferenceDBHandler.m15373f(this.f16636b);
        ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
        if (m15373f.equals("m3u")) {
            try {
                Cursor rawQuery = getReadableDatabase().rawQuery("SELECT iptv_live_streams_m3u.* FROM iptv_live_streams_m3u INNER JOIN iptv_live_watched ON iptv_live_streams_m3u.url = iptv_live_watched.stream_id_url AND iptv_live_streams_m3u.stream_type LIKE '%live%'  AND iptv_live_streams_m3u.user_id_referred ='" + m15337A + "' AND iptv_live_watched" + InstructionFileId.DOT + "user_id_referred ='" + m15337A + "' AND iptv_live_watched" + InstructionFileId.DOT + "app_type ='m3u' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "categoryID NOT IN (SELECT iptv_password_status_table_m3u" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table_m3u WHERE iptv_password_status_table_m3u" + InstructionFileId.DOT + "user_id_referred ='" + m15337A + "' AND iptv_password_status_table_m3u" + InstructionFileId.DOT + "password_status ='1') ORDER BY iptv_live_watched" + InstructionFileId.DOT + Name.MARK + " DESC", null);
                ArrayList<LiveStreamsDBModel> arrayList2 = arrayList;
                if (rawQuery.moveToFirst()) {
                    do {
                        try {
                            if (SharepreferenceDBHandler.m15365b(this.f16636b) == 1) {
                                SharepreferenceDBHandler.m15348L(0, this.f16636b);
                                arrayList2 = arrayList;
                            } else {
                                LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                                liveStreamsDBModel.m14826f0(Integer.parseInt(rawQuery.getString(0)));
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
                                liveStreamsDBModel.m14845w0(rawQuery.getString(18));
                                arrayList.add(liveStreamsDBModel);
                            }
                        } catch (SQLiteDatabaseLockedException e10) {
                            return null;
                        } catch (Exception e11) {
                            return null;
                        }
                    } while (rawQuery.moveToNext());
                    rawQuery.close();
                    return arrayList;
                }
                arrayList = arrayList2;
                rawQuery.close();
                return arrayList;
            } catch (SQLiteDatabaseLockedException e12) {
                return null;
            } catch (Exception e13) {
                return null;
            }
        }
        try {
            try {
                Cursor rawQuery2 = getReadableDatabase().rawQuery("SELECT iptv_live_streams.* FROM iptv_live_streams INNER JOIN iptv_live_watched ON iptv_live_streams.stream_id = iptv_live_watched.stream_id_url AND iptv_live_streams.stream_type LIKE '%live%'  AND iptv_live_streams.user_id_referred ='" + m15337A + "' AND iptv_live_watched" + InstructionFileId.DOT + "user_id_referred ='" + m15337A + "' AND iptv_live_watched" + InstructionFileId.DOT + "app_type ='api' AND iptv_live_streams" + InstructionFileId.DOT + "categoryID NOT IN (SELECT iptv_password_status_table" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table WHERE iptv_password_status_table" + InstructionFileId.DOT + "user_id_referred ='" + m15337A + "' AND iptv_password_status_table" + InstructionFileId.DOT + "password_status ='1') ORDER BY iptv_live_watched" + InstructionFileId.DOT + Name.MARK + " DESC", null);
                if (rawQuery2.moveToFirst()) {
                    while (true) {
                        try {
                            if (SharepreferenceDBHandler.m15365b(this.f16636b) == 1) {
                                SharepreferenceDBHandler.m15348L(0, this.f16636b);
                                break;
                            }
                            LiveStreamsDBModel liveStreamsDBModel2 = new LiveStreamsDBModel();
                            liveStreamsDBModel2.m14826f0(Integer.parseInt(rawQuery2.getString(0)));
                            liveStreamsDBModel2.m14834l0(rawQuery2.getString(1));
                            liveStreamsDBModel2.m14833k0(rawQuery2.getString(2));
                            liveStreamsDBModel2.m14841s0(rawQuery2.getString(3));
                            liveStreamsDBModel2.m14840r0(rawQuery2.getString(4));
                            liveStreamsDBModel2.m14839q0(rawQuery2.getString(5));
                            liveStreamsDBModel2.m14824d0(rawQuery2.getString(6));
                            liveStreamsDBModel2.m14817X(rawQuery2.getString(7));
                            liveStreamsDBModel2.m14818Y(rawQuery2.getString(8));
                            liveStreamsDBModel2.m14821b0(rawQuery2.getString(9));
                            liveStreamsDBModel2.m14842t0(rawQuery2.getString(10));
                            liveStreamsDBModel2.m14822c0(rawQuery2.getString(11));
                            liveStreamsDBModel2.m14843u0(rawQuery2.getString(12));
                            liveStreamsDBModel2.m14844v0(rawQuery2.getString(13));
                            liveStreamsDBModel2.m14819Z(rawQuery2.getString(14));
                            liveStreamsDBModel2.m14838p0(rawQuery2.getString(15));
                            liveStreamsDBModel2.m14829h0(rawQuery2.getString(16));
                            liveStreamsDBModel2.m14820a0(rawQuery2.getString(17));
                            liveStreamsDBModel2.m14837o0(rawQuery2.getString(18));
                            liveStreamsDBModel2.m14836n0(rawQuery2.getString(19));
                            arrayList.add(liveStreamsDBModel2);
                            if (!rawQuery2.moveToNext()) {
                                break;
                            }
                        } catch (SQLiteDatabaseLockedException e14) {
                            return null;
                        } catch (Exception e15) {
                            return null;
                        }
                    }
                }
                rawQuery2.close();
                return arrayList;
            } catch (SQLiteDatabaseLockedException e16) {
                return null;
            } catch (Exception e17) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException e18) {
            return null;
        } catch (Exception e19) {
            return null;
        }
    }

    /* renamed from: p2 */
    public void m15242p2(int i10, String str) {
        try {
            String str2 = str.equals("m3u") ? "epg_m3u" : "epg";
            getWritableDatabase().execSQL("DELETE FROM " + str2 + " WHERE user_id_referred = '" + i10 + "'");
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: q */
    public boolean m15243q(ArrayList<GetSeriesStreamCallback> arrayList) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    int size = arrayList.size();
                    if (size != 0) {
                        for (int i10 = 0; i10 < size; i10++) {
                            C5255e.f30092p = true;
                            if (arrayList.get(i10).m14984i() != null) {
                                contentValues.put("num_series_stream_v2", String.valueOf(arrayList.get(i10).m14984i()));
                            } else {
                                contentValues.put("num_series_stream_v2", "");
                            }
                            if (arrayList.get(i10).m14983h() != null) {
                                contentValues.put("name_series_stream_v2", arrayList.get(i10).m14983h());
                            } else {
                                contentValues.put("name_series_stream_v2", "");
                            }
                            if (arrayList.get(i10).m14989n() != null) {
                                contentValues.put("stream_type_series_stream_v2", String.valueOf(arrayList.get(i10).m14989n()));
                            } else {
                                contentValues.put("stream_type_series_stream_v2", "");
                            }
                            if (arrayList.get(i10).m14988m() != null) {
                                contentValues.put("stream_id_series_stream_v2", arrayList.get(i10).m14988m());
                            } else {
                                contentValues.put("stream_id_series_stream_v2", "");
                            }
                            if (arrayList.get(i10).m14979d() != null) {
                                contentValues.put("stream_cover_series_stream_v2", arrayList.get(i10).m14979d());
                            } else {
                                contentValues.put("stream_cover_series_stream_v2", "");
                            }
                            if (arrayList.get(i10).m14985j() != null) {
                                contentValues.put("plot_series_stream_v2", arrayList.get(i10).m14985j());
                            } else {
                                contentValues.put("plot_series_stream_v2", "");
                            }
                            if (arrayList.get(i10).m14977b() != null) {
                                contentValues.put("cast_series_stream_v2", arrayList.get(i10).m14977b());
                            } else {
                                contentValues.put("cast_series_stream_v2", "");
                            }
                            if (arrayList.get(i10).m14980e() != null) {
                                contentValues.put("director_series_stream_v2", String.valueOf(arrayList.get(i10).m14980e()));
                            } else {
                                contentValues.put("director_series_stream_v2", "");
                            }
                            if (arrayList.get(i10).m14981f() != null) {
                                contentValues.put("genre_series_stream_v2", arrayList.get(i10).m14981f());
                            } else {
                                contentValues.put("genre_series_stream_v2", "");
                            }
                            if (arrayList.get(i10).m14987l() != null) {
                                contentValues.put("release_date_series_stream_v2", String.valueOf(arrayList.get(i10).m14987l()));
                            } else {
                                contentValues.put("release_date_series_stream_v2", "");
                            }
                            if (arrayList.get(i10).m14982g() != null) {
                                contentValues.put("last_modified_series_stream_v2", String.valueOf(arrayList.get(i10).m14982g()));
                            } else {
                                contentValues.put("last_modified_series_stream_v2", "");
                            }
                            if (arrayList.get(i10).m14986k() != null) {
                                contentValues.put("rating_series_stream_v2", String.valueOf(arrayList.get(i10).m14986k()));
                            } else {
                                contentValues.put("rating_series_stream_v2", "");
                            }
                            if (arrayList.get(i10).m14978c() == null || m15170I0(arrayList.get(i10).m14978c()) <= 0) {
                                contentValues.put("category_id_series_stream_v2", "-5");
                            } else {
                                contentValues.put("category_id_series_stream_v2", String.valueOf(arrayList.get(i10).m14978c()));
                            }
                            if (arrayList.get(i10).m14990o() != null) {
                                contentValues.put("youtube_trailer", String.valueOf(arrayList.get(i10).m14990o()));
                            } else {
                                contentValues.put("youtube_trailer", "");
                            }
                            if (arrayList.get(i10).m14976a() != null) {
                                contentValues.put("backdrop", arrayList.get(i10).m14976a().toString());
                            } else {
                                contentValues.put("backdrop", "");
                            }
                            contentValues.put("user_id_referred", Integer.valueOf(SharepreferenceDBHandler.m15337A(this.f16636b)));
                            writableDatabase.insert("series_streams_v2", null, contentValues);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    C5255e.f30092p = false;
                    return true;
                } catch (Exception e10) {
                    writableDatabase.endTransaction();
                    C5255e.f30092p = false;
                    Log.w("msg", "exception:" + e10.getMessage());
                    return false;
                }
            } catch (SQLiteDatabaseLockedException e11) {
                Log.w("msg", "exception");
                writableDatabase.endTransaction();
                C5255e.f30092p = false;
                return false;
            }
        } catch (Exception e12) {
            return false;
        }
    }

    /* renamed from: q0 */
    public void m15244q0(ArrayList<LiveStreamsDBModel> arrayList) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        String m15373f = SharepreferenceDBHandler.m15373f(this.f16636b);
        try {
            ContentValues contentValues = new ContentValues();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                contentValues.put("stream_id_url", arrayList.get(i10).m14811R());
                contentValues.put("user_id_referred", Integer.valueOf(m15337A));
                contentValues.put("app_type", m15373f);
                writableDatabase.insert("iptv_live_watched", null, contentValues);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            writableDatabase.endTransaction();
            Log.w("msg", "exception");
        }
    }

    /* renamed from: q1 */
    public ArrayList<LiveStreamCategoryIdDBModel> m15245q1() {
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM iptv_series_category_m3u WHERE user_id_referred='" + SharepreferenceDBHandler.m15337A(this.f16636b) + "' AND categoryID IS NOT NULL", null);
            if (rawQuery.moveToFirst()) {
                do {
                    LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                    liveStreamCategoryIdDBModel.m14791f(Integer.parseInt(rawQuery.getString(0)));
                    liveStreamCategoryIdDBModel.m14792g(rawQuery.getString(1));
                    liveStreamCategoryIdDBModel.m14793h(rawQuery.getString(2));
                    liveStreamCategoryIdDBModel.m14795j(0);
                    arrayList.add(liveStreamCategoryIdDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return null;
        }
    }

    /* renamed from: q2 */
    public void m15246q2(String str) {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            String str2 = SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u") ? "epg_m3u" : "epg";
            getWritableDatabase().execSQL("DELETE FROM " + str2 + " WHERE user_id_referred = '" + m15337A + "' AND source_ref_id = '" + str + "'");
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: r1 */
    public ArrayList<LiveStreamCategoryIdDBModel> m15247r1() {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT series_category_v2.* FROM series_category_v2,series_streams_v2 WHERE series_category_v2.category_id_series_v2 = series_streams_v2.category_id_series_stream_v2 AND series_category_v2.user_id_referred = '" + m15337A + "' GROUP BY series_streams_v2" + InstructionFileId.DOT + "category_id_series_stream_v2 ORDER BY series_category_v2" + InstructionFileId.DOT + "id_series_v2", null);
            if (rawQuery.moveToFirst()) {
                do {
                    LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                    liveStreamCategoryIdDBModel.m14791f(Integer.parseInt(rawQuery.getString(0)));
                    liveStreamCategoryIdDBModel.m14793h(rawQuery.getString(1));
                    liveStreamCategoryIdDBModel.m14792g(rawQuery.getString(2));
                    arrayList.add(liveStreamCategoryIdDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return null;
        }
    }

    /* renamed from: r2 */
    public void m15248r2() {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            getWritableDatabase().execSQL("DELETE FROM iptv_live_category WHERE user_id_referred = '" + m15337A + "'");
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: s1 */
    public ArrayList<LiveStreamCategoryIdDBModel> m15249s1() {
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = new ArrayList<>();
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        if (!SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u")) {
            try {
                try {
                    Cursor rawQuery = getReadableDatabase().rawQuery("SELECT series_category_v2.* , COUNT(series_streams_v2.id_series_stream_v2) AS TOTAL_COUNT FROM series_category_v2,series_streams_v2 WHERE series_category_v2.category_id_series_v2 = series_streams_v2.category_id_series_stream_v2 AND series_category_v2.user_id_referred = '" + m15337A + "' AND series_streams_v2" + InstructionFileId.DOT + "user_id_referred = '" + m15337A + "' AND series_streams_v2" + InstructionFileId.DOT + "category_id_series_stream_v2 NOT IN (SELECT iptv_password_status_table" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table WHERE iptv_password_status_table" + InstructionFileId.DOT + "user_id_referred ='" + m15337A + "' AND iptv_password_status_table" + InstructionFileId.DOT + "password_status ='1') GROUP BY series_streams_v2" + InstructionFileId.DOT + "category_id_series_stream_v2 ORDER BY series_category_v2" + InstructionFileId.DOT + "id_series_v2", null);
                    if (rawQuery.moveToFirst()) {
                        do {
                            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                            liveStreamCategoryIdDBModel.m14791f(Integer.parseInt(rawQuery.getString(0)));
                            liveStreamCategoryIdDBModel.m14793h(rawQuery.getString(1));
                            liveStreamCategoryIdDBModel.m14792g(rawQuery.getString(2));
                            liveStreamCategoryIdDBModel.m14794i(C5255e.m26215R(rawQuery.getString(4)));
                            arrayList.add(liveStreamCategoryIdDBModel);
                        } while (rawQuery.moveToNext());
                    }
                    rawQuery.close();
                    return arrayList;
                } catch (SQLiteDatabaseLockedException e10) {
                    return null;
                } catch (Exception e11) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException e12) {
                return null;
            } catch (Exception e13) {
                return null;
            }
        }
        try {
            try {
                Cursor rawQuery2 = getReadableDatabase().rawQuery("SELECT iptv_series_category_m3u.* , COUNT(iptv_live_streams_m3u.id) AS TOTAL_COUNT FROM iptv_series_category_m3u,iptv_live_streams_m3u WHERE iptv_series_category_m3u.categoryID = iptv_live_streams_m3u.categoryID AND iptv_series_category_m3u.user_id_referred = '" + m15337A + "' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "user_id_referred = '" + m15337A + "' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "stream_type = 'series' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "categoryID NOT IN (SELECT iptv_password_status_table_m3u" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table_m3u WHERE iptv_password_status_table_m3u" + InstructionFileId.DOT + "user_id_referred ='" + m15337A + "' AND iptv_password_status_table_m3u" + InstructionFileId.DOT + "password_status ='1') GROUP BY iptv_live_streams_m3u" + InstructionFileId.DOT + "categoryID ORDER BY iptv_series_category_m3u" + InstructionFileId.DOT + Name.MARK, null);
                if (rawQuery2.moveToFirst()) {
                    do {
                        LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel2 = new LiveStreamCategoryIdDBModel();
                        liveStreamCategoryIdDBModel2.m14791f(Integer.parseInt(rawQuery2.getString(0)));
                        liveStreamCategoryIdDBModel2.m14792g(rawQuery2.getString(1));
                        liveStreamCategoryIdDBModel2.m14793h(rawQuery2.getString(2));
                        liveStreamCategoryIdDBModel2.m14794i(C5255e.m26215R(rawQuery2.getString(4)));
                        arrayList.add(liveStreamCategoryIdDBModel2);
                    } while (rawQuery2.moveToNext());
                }
                rawQuery2.close();
                return arrayList;
            } catch (SQLiteDatabaseLockedException e14) {
                return null;
            } catch (Exception e15) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException e16) {
            return null;
        } catch (Exception e17) {
            return null;
        }
    }

    /* renamed from: s2 */
    public void m15250s2() {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            getReadableDatabase();
            getWritableDatabase().execSQL("delete from iptv_live_streams WHERE (stream_type LIKE '%live%' OR stream_type LIKE '%radio%' ) AND user_id_referred = '" + m15337A + "'");
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: t */
    public void m15251t(ArrayList<M3UCategoriesModel> arrayList, String str) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        String str2 = str.equals("live") ? "iptv_live_category_m3u" : str.equals("movie") ? "iptv_movie_category_m3u" : str.equals("series") ? "iptv_series_category_m3u" : "";
        try {
            ContentValues contentValues = new ContentValues();
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            Iterator<M3UCategoriesModel> it = arrayList.iterator();
            while (it.hasNext()) {
                M3UCategoriesModel next = it.next();
                contentValues.put("categoryID", next.m14848a());
                contentValues.put("categoryname", next.m14849b());
                contentValues.put("user_id_referred", Integer.valueOf(m15337A));
                writableDatabase.insert(str2, null, contentValues);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            writableDatabase.endTransaction();
            Log.w("msg", "exception");
        }
    }

    /* renamed from: t1 */
    public ArrayList<SeriesDBModel> m15252t1() {
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        ArrayList<SeriesDBModel> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT stream_id_series_stream_v2 FROM series_streams_v2 WHERE series_streams_v2.user_id_referred='" + m15337A + "'", null);
            if (rawQuery.moveToFirst()) {
                do {
                    int i10 = 0;
                    try {
                        i10 = Integer.parseInt(rawQuery.getString(0));
                    } catch (NumberFormatException e10) {
                    }
                    SeriesDBModel seriesDBModel = new SeriesDBModel();
                    seriesDBModel.m15033I(i10);
                    arrayList.add(seriesDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e11) {
            return null;
        }
    }

    /* renamed from: t2 */
    public void m15253t2() {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            getWritableDatabase().execSQL("DELETE FROM iptv_movie_category WHERE user_id_referred = '" + m15337A + "'");
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: u1 */
    public int m15254u1() {
        StringBuilder sb2;
        String str;
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        if (SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u")) {
            sb2 = new StringBuilder();
            str = "SELECT  COUNT(*) FROM iptv_live_streams_m3u WHERE stream_type='series' AND user_id_referred='";
        } else {
            sb2 = new StringBuilder();
            str = "SELECT  COUNT(*) FROM series_streams_v2 WHERE user_id_referred = '";
        }
        sb2.append(str);
        sb2.append(m15337A);
        sb2.append("'");
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery(sb2.toString(), null);
            rawQuery.moveToFirst();
            int i10 = rawQuery.getInt(0);
            rawQuery.close();
            return i10;
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            return 0;
        }
    }

    /* renamed from: u2 */
    public void m15255u2() {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            getWritableDatabase().execSQL("DELETE FROM series_category_v2 WHERE user_id_referred = '" + m15337A + "'");
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: v */
    public void m15256v(List<XMLTVProgrammePojo> list) {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            String str = SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u") ? "epg_m3u" : "epg";
            try {
                ContentValues contentValues = new ContentValues();
                int size = list.size();
                if (size != 0) {
                    for (int i10 = 0; i10 < size; i10++) {
                        contentValues.put(ChartFactory.TITLE, list.get(i10).m15515m());
                        contentValues.put("start", list.get(i10).m15512j());
                        contentValues.put("stop", list.get(i10).m15514l());
                        contentValues.put("description", list.get(i10).m15504b());
                        contentValues.put("channel_id", list.get(i10).m15503a());
                        contentValues.put("user_id_referred", Integer.valueOf(m15337A));
                        contentValues.put("source_ref_id", list.get(i10).m15511i());
                        writableDatabase.insert(str, null, contentValues);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (SQLiteDatabaseLockedException | Exception e10) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
            }
        } catch (Exception e11) {
        }
    }

    /* renamed from: v0 */
    public boolean m15257v0(List<VodCategoriesCallback> list) {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    int size = list.size();
                    if (size != 0) {
                        for (int i10 = 0; i10 < size; i10++) {
                            C5255e.f30092p = true;
                            contentValues.put("categoryID_movie", list.get(i10).m15092a());
                            contentValues.put("categoryname_movie", list.get(i10).m15093b());
                            contentValues.put("paent_id", list.get(i10).m15094c());
                            contentValues.put("user_id_referred", Integer.valueOf(m15337A));
                            writableDatabase.insert("iptv_movie_category", null, contentValues);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    C5255e.f30092p = false;
                    return true;
                } catch (Exception e10) {
                    writableDatabase.endTransaction();
                    Log.w("msg", "exception");
                    C5255e.f30092p = false;
                    return false;
                }
            } catch (SQLiteDatabaseLockedException e11) {
                Log.w("msg", "exception");
                writableDatabase.endTransaction();
                C5255e.f30092p = false;
                return false;
            }
        } catch (Exception e12) {
            C5255e.f30092p = false;
            return false;
        }
    }

    /* renamed from: v1 */
    public ArrayList<SeriesDBModel> m15258v1(String str) {
        StringBuilder sb2;
        String str2;
        String sb3;
        String str3;
        StringBuilder sb4;
        long currentTimeMillis = System.currentTimeMillis();
        String m15400w = SharepreferenceDBHandler.m15400w(this.f16636b);
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        if (str.equals("") || str.equals("0")) {
            if (m15400w.equals("0")) {
                sb3 = "SELECT  * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '" + m15337A + "' AND series_streams_v2" + InstructionFileId.DOT + "category_id_series_stream_v2 NOT IN (SELECT iptv_password_status_table" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table WHERE iptv_password_status_table" + InstructionFileId.DOT + "user_id_referred ='" + m15337A + "' AND iptv_password_status_table" + InstructionFileId.DOT + "password_status ='1')";
            } else {
                if (m15400w.equals("3")) {
                    sb2 = new StringBuilder();
                    sb2.append("SELECT  * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '");
                    sb2.append(m15337A);
                    sb2.append("' AND ");
                    sb2.append("series_streams_v2");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("category_id_series_stream_v2");
                    sb2.append(" NOT IN (SELECT ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status_cat_id");
                    sb2.append(" FROM ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(" WHERE ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("user_id_referred");
                    sb2.append(" ='");
                    sb2.append(m15337A);
                    sb2.append("' AND ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status");
                    sb2.append(" ='1') ORDER BY ");
                    sb2.append("name_series_stream_v2");
                    str2 = " DESC";
                } else if (m15400w.equals("2")) {
                    sb2 = new StringBuilder();
                    sb2.append("SELECT  * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '");
                    sb2.append(m15337A);
                    sb2.append("' AND ");
                    sb2.append("series_streams_v2");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("category_id_series_stream_v2");
                    sb2.append(" NOT IN (SELECT ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status_cat_id");
                    sb2.append(" FROM ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(" WHERE ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("user_id_referred");
                    sb2.append(" ='");
                    sb2.append(m15337A);
                    sb2.append("' AND ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status");
                    sb2.append(" ='1') ORDER BY ");
                    sb2.append("name_series_stream_v2");
                    str2 = " ASC";
                } else if (m15400w.equals("6")) {
                    sb2 = new StringBuilder();
                    sb2.append("SELECT  * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '");
                    sb2.append(m15337A);
                    sb2.append("' AND ");
                    sb2.append("series_streams_v2");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("category_id_series_stream_v2");
                    sb2.append(" NOT IN (SELECT ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status_cat_id");
                    sb2.append(" FROM ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(" WHERE ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("user_id_referred");
                    sb2.append(" ='");
                    sb2.append(m15337A);
                    sb2.append("' AND ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status");
                    sb2.append(" ='1') ORDER BY cast(");
                    sb2.append("rating_series_stream_v2");
                    str2 = " as REAL) DESC ";
                } else if (m15400w.equals("1")) {
                    sb2 = new StringBuilder();
                    sb2.append("SELECT  * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '");
                    sb2.append(m15337A);
                    sb2.append("' AND ");
                    sb2.append("series_streams_v2");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("category_id_series_stream_v2");
                    sb2.append(" NOT IN (SELECT ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status_cat_id");
                    sb2.append(" FROM ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(" WHERE ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("user_id_referred");
                    sb2.append(" ='");
                    sb2.append(m15337A);
                    sb2.append("' AND ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status");
                    sb2.append(" ='1') ORDER BY ");
                    sb2.append("last_modified_series_stream_v2");
                    str2 = " DESC ";
                } else {
                    sb2 = new StringBuilder();
                    sb2.append("SELECT * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '");
                    sb2.append(m15337A);
                    sb2.append("' AND ");
                    sb2.append("series_streams_v2");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("category_id_series_stream_v2");
                    sb2.append(" NOT IN (SELECT ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status_cat_id");
                    sb2.append(" FROM ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(" WHERE ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("user_id_referred");
                    sb2.append(" ='");
                    sb2.append(m15337A);
                    sb2.append("' AND ");
                    sb2.append("iptv_password_status_table");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status");
                    sb2.append(" ='1') ORDER BY ");
                    sb2.append("id_series_stream_v2");
                    str2 = " DESC";
                }
                sb2.append(str2);
                sb3 = sb2.toString();
            }
            ArrayList<SeriesDBModel> arrayList = new ArrayList<>();
            try {
                try {
                    Cursor rawQuery = getReadableDatabase().rawQuery(sb3, null);
                    if (rawQuery.moveToFirst()) {
                        while (true) {
                            AsyncTask asyncTask = C5255e.f30088l;
                            if (asyncTask != null && asyncTask.isCancelled()) {
                                Log.e("honey", "stopped");
                                break;
                            }
                            SeriesDBModel seriesDBModel = new SeriesDBModel();
                            seriesDBModel.m15054u(Integer.parseInt(rawQuery.getString(0)));
                            seriesDBModel.m15056w(rawQuery.getString(1));
                            seriesDBModel.m15055v(rawQuery.getString(2));
                            seriesDBModel.m15057x(rawQuery.getString(3));
                            seriesDBModel.m15033I(C5255e.m26215R(rawQuery.getString(4)));
                            seriesDBModel.m15026B(rawQuery.getString(5));
                            seriesDBModel.m15030F(rawQuery.getString(6));
                            seriesDBModel.m15025A(rawQuery.getString(7));
                            seriesDBModel.m15027C(rawQuery.getString(8));
                            seriesDBModel.m15028D(rawQuery.getString(9));
                            seriesDBModel.m15032H(rawQuery.getString(10));
                            seriesDBModel.m15029E(rawQuery.getString(11));
                            seriesDBModel.m15031G(rawQuery.getString(12));
                            seriesDBModel.m15053t(rawQuery.getString(13));
                            seriesDBModel.m15059z(rawQuery.getString(14));
                            seriesDBModel.m15052s(rawQuery.getString(15));
                            arrayList.add(seriesDBModel);
                            if (!rawQuery.moveToNext()) {
                                break;
                            }
                        }
                    }
                    rawQuery.close();
                    Log.e("honey testing", "milli: " + (System.currentTimeMillis() - currentTimeMillis));
                    return arrayList;
                } catch (SQLiteDatabaseLockedException e10) {
                    return null;
                } catch (Exception e11) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException e12) {
                return null;
            } catch (Exception e13) {
                return null;
            }
        }
        if (str.equals("-5")) {
            C6783a c6783a = new C6783a(this.f16636b);
            sb4 = new StringBuilder();
            sb4.append("SELECT * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '");
            sb4.append(m15337A);
            sb4.append("' AND ");
            sb4.append("series_streams_v2");
            sb4.append(InstructionFileId.DOT);
            sb4.append("category_id_series_stream_v2");
            sb4.append(" NOT IN (SELECT ");
            sb4.append("iptv_password_status_table");
            sb4.append(InstructionFileId.DOT);
            sb4.append("password_status_cat_id");
            sb4.append(" FROM ");
            sb4.append("iptv_password_status_table");
            sb4.append(" WHERE ");
            sb4.append("iptv_password_status_table");
            sb4.append(InstructionFileId.DOT);
            sb4.append("user_id_referred");
            sb4.append(" ='");
            sb4.append(m15337A);
            sb4.append("' AND ");
            sb4.append("iptv_password_status_table");
            sb4.append(InstructionFileId.DOT);
            sb4.append("password_status");
            sb4.append(" ='1') ORDER BY ");
            sb4.append("last_modified_series_stream_v2");
            sb4.append(" DESC LIMIT ");
            sb4.append(c6783a.m31286x());
        } else {
            String str4 = str;
            if (str.equals("-6")) {
                str4 = "-5";
            }
            if (m15400w.equals("0")) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("SELECT * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '");
                sb5.append(m15337A);
                sb5.append("' AND ");
                sb5.append("category_id_series_stream_v2");
                sb5.append(" ='");
                sb5.append(str4);
                sb5.append("' AND ");
                sb5.append("series_streams_v2");
                sb5.append(InstructionFileId.DOT);
                sb5.append("category_id_series_stream_v2");
                sb5.append(" NOT IN (SELECT ");
                sb5.append("iptv_password_status_table");
                sb5.append(InstructionFileId.DOT);
                sb5.append("password_status_cat_id");
                sb5.append(" FROM ");
                sb5.append("iptv_password_status_table");
                sb5.append(" WHERE ");
                sb5.append("iptv_password_status_table");
                sb5.append(InstructionFileId.DOT);
                sb5.append("user_id_referred");
                sb5.append(" ='");
                sb5.append(m15337A);
                sb5.append("' AND ");
                sb5.append("iptv_password_status_table");
                sb5.append(InstructionFileId.DOT);
                sb5.append("password_status");
                sb5.append(" ='1')");
                sb4 = sb5;
            } else {
                if (m15400w.equals("3")) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("SELECT * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '");
                    sb6.append(m15337A);
                    sb6.append("' AND ");
                    sb6.append("category_id_series_stream_v2");
                    sb6.append(" ='");
                    sb6.append(str4);
                    sb6.append("' AND ");
                    sb6.append("series_streams_v2");
                    sb6.append(InstructionFileId.DOT);
                    sb6.append("category_id_series_stream_v2");
                    sb6.append(" NOT IN (SELECT ");
                    sb6.append("iptv_password_status_table");
                    sb6.append(InstructionFileId.DOT);
                    sb6.append("password_status_cat_id");
                    sb6.append(" FROM ");
                    sb6.append("iptv_password_status_table");
                    sb6.append(" WHERE ");
                    sb6.append("iptv_password_status_table");
                    sb6.append(InstructionFileId.DOT);
                    sb6.append("user_id_referred");
                    sb6.append(" ='");
                    sb6.append(m15337A);
                    sb6.append("' AND ");
                    sb6.append("iptv_password_status_table");
                    sb6.append(InstructionFileId.DOT);
                    sb6.append("password_status");
                    sb6.append(" ='1') ORDER BY ");
                    sb6.append("name_series_stream_v2");
                    sb4 = sb6;
                    str3 = " DESC";
                } else if (m15400w.equals("2")) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("SELECT * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '");
                    sb7.append(m15337A);
                    sb7.append("' AND ");
                    sb7.append("category_id_series_stream_v2");
                    sb7.append(" ='");
                    sb7.append(str4);
                    sb7.append("' AND ");
                    sb7.append("series_streams_v2");
                    sb7.append(InstructionFileId.DOT);
                    sb7.append("category_id_series_stream_v2");
                    sb7.append(" NOT IN (SELECT ");
                    sb7.append("iptv_password_status_table");
                    sb7.append(InstructionFileId.DOT);
                    sb7.append("password_status_cat_id");
                    sb7.append(" FROM ");
                    sb7.append("iptv_password_status_table");
                    sb7.append(" WHERE ");
                    sb7.append("iptv_password_status_table");
                    sb7.append(InstructionFileId.DOT);
                    sb7.append("user_id_referred");
                    sb7.append(" ='");
                    sb7.append(m15337A);
                    sb7.append("' AND ");
                    sb7.append("iptv_password_status_table");
                    sb7.append(InstructionFileId.DOT);
                    sb7.append("password_status");
                    sb7.append(" ='1') ORDER BY ");
                    sb7.append("name_series_stream_v2");
                    str3 = " ASC";
                    sb4 = sb7;
                } else if (m15400w.equals("6")) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("SELECT * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '");
                    sb8.append(m15337A);
                    sb8.append("' AND ");
                    sb8.append("category_id_series_stream_v2");
                    sb8.append(" ='");
                    sb8.append(str4);
                    sb8.append("' AND ");
                    sb8.append("series_streams_v2");
                    sb8.append(InstructionFileId.DOT);
                    sb8.append("category_id_series_stream_v2");
                    sb8.append(" NOT IN (SELECT ");
                    sb8.append("iptv_password_status_table");
                    sb8.append(InstructionFileId.DOT);
                    sb8.append("password_status_cat_id");
                    sb8.append(" FROM ");
                    sb8.append("iptv_password_status_table");
                    sb8.append(" WHERE ");
                    sb8.append("iptv_password_status_table");
                    sb8.append(InstructionFileId.DOT);
                    sb8.append("user_id_referred");
                    sb8.append(" ='");
                    sb8.append(m15337A);
                    sb8.append("' AND ");
                    sb8.append("iptv_password_status_table");
                    sb8.append(InstructionFileId.DOT);
                    sb8.append("password_status");
                    sb8.append(" ='1') ORDER BY cast(");
                    sb8.append("rating_series_stream_v2");
                    str3 = " as REAL) DESC ";
                    sb4 = sb8;
                } else if (m15400w.equals("1")) {
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append("SELECT * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '");
                    sb9.append(m15337A);
                    sb9.append("' AND ");
                    sb9.append("category_id_series_stream_v2");
                    sb9.append(" ='");
                    sb9.append(str4);
                    sb9.append("' AND ");
                    sb9.append("series_streams_v2");
                    sb9.append(InstructionFileId.DOT);
                    sb9.append("category_id_series_stream_v2");
                    sb9.append(" NOT IN (SELECT ");
                    sb9.append("iptv_password_status_table");
                    sb9.append(InstructionFileId.DOT);
                    sb9.append("password_status_cat_id");
                    sb9.append(" FROM ");
                    sb9.append("iptv_password_status_table");
                    sb9.append(" WHERE ");
                    sb9.append("iptv_password_status_table");
                    sb9.append(InstructionFileId.DOT);
                    sb9.append("user_id_referred");
                    sb9.append(" ='");
                    sb9.append(m15337A);
                    sb9.append("' AND ");
                    sb9.append("iptv_password_status_table");
                    sb9.append(InstructionFileId.DOT);
                    sb9.append("password_status");
                    sb9.append(" ='1') ORDER BY ");
                    sb9.append("last_modified_series_stream_v2");
                    str3 = " DESC ";
                    sb4 = sb9;
                } else {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append("SELECT * FROM series_streams_v2 WHERE series_streams_v2.user_id_referred = '");
                    sb10.append(m15337A);
                    sb10.append("' AND ");
                    sb10.append("category_id_series_stream_v2");
                    sb10.append(" ='");
                    sb10.append(str4);
                    sb10.append("' AND ");
                    sb10.append("series_streams_v2");
                    sb10.append(InstructionFileId.DOT);
                    sb10.append("category_id_series_stream_v2");
                    sb10.append(" NOT IN (SELECT ");
                    sb10.append("iptv_password_status_table");
                    sb10.append(InstructionFileId.DOT);
                    sb10.append("password_status_cat_id");
                    sb10.append(" FROM ");
                    sb10.append("iptv_password_status_table");
                    sb10.append(" WHERE ");
                    sb10.append("iptv_password_status_table");
                    sb10.append(InstructionFileId.DOT);
                    sb10.append("user_id_referred");
                    sb10.append(" ='");
                    sb10.append(m15337A);
                    sb10.append("' AND ");
                    sb10.append("iptv_password_status_table");
                    sb10.append(InstructionFileId.DOT);
                    sb10.append("password_status");
                    sb10.append(" ='1') ORDER BY ");
                    sb10.append("id_series_stream_v2");
                    str3 = " DESC";
                    sb4 = sb10;
                }
                sb4.append(str3);
            }
        }
        String sb11 = sb4.toString();
        ArrayList<SeriesDBModel> arrayList2 = new ArrayList<>();
        try {
            try {
                Cursor rawQuery2 = getReadableDatabase().rawQuery(sb11, null);
                if (rawQuery2.moveToFirst()) {
                    while (true) {
                        AsyncTask asyncTask2 = C5255e.f30088l;
                        if (asyncTask2 != null && asyncTask2.isCancelled()) {
                            Log.e("honey", "stopped");
                            break;
                        }
                        SeriesDBModel seriesDBModel2 = new SeriesDBModel();
                        seriesDBModel2.m15054u(Integer.parseInt(rawQuery2.getString(0)));
                        seriesDBModel2.m15056w(rawQuery2.getString(1));
                        seriesDBModel2.m15055v(rawQuery2.getString(2));
                        seriesDBModel2.m15057x(rawQuery2.getString(3));
                        seriesDBModel2.m15033I(C5255e.m26215R(rawQuery2.getString(4)));
                        seriesDBModel2.m15026B(rawQuery2.getString(5));
                        seriesDBModel2.m15030F(rawQuery2.getString(6));
                        seriesDBModel2.m15025A(rawQuery2.getString(7));
                        seriesDBModel2.m15027C(rawQuery2.getString(8));
                        seriesDBModel2.m15028D(rawQuery2.getString(9));
                        seriesDBModel2.m15032H(rawQuery2.getString(10));
                        seriesDBModel2.m15029E(rawQuery2.getString(11));
                        seriesDBModel2.m15031G(rawQuery2.getString(12));
                        seriesDBModel2.m15053t(rawQuery2.getString(13));
                        seriesDBModel2.m15059z(rawQuery2.getString(14));
                        seriesDBModel2.m15052s(rawQuery2.getString(15));
                        arrayList2.add(seriesDBModel2);
                        if (!rawQuery2.moveToNext()) {
                            break;
                        }
                    }
                }
                rawQuery2.close();
                return arrayList2;
            } catch (SQLiteDatabaseLockedException e14) {
                return null;
            } catch (Exception e15) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException e16) {
            return null;
        } catch (Exception e17) {
            return null;
        }
    }

    /* renamed from: v2 */
    public void m15259v2() {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            getWritableDatabase().execSQL("DELETE FROM series_streams_v2 WHERE user_id_referred = '" + m15337A + "'");
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: w */
    public void m15260w(String str, String str2, String str3, String str4) {
        try {
            String str5 = SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u") ? "iptv_epg_sources_m3u" : "iptv_epg_sources";
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("user_id_referred", Integer.valueOf(m15337A));
            contentValues.put("name", str);
            contentValues.put("source_type", str2);
            contentValues.put("epgurl", str3);
            contentValues.put("default_source", str4);
            writableDatabase.insert(str5, null, contentValues);
        } catch (SQLiteDatabaseLockedException | Exception e10) {
        }
    }

    /* renamed from: w1 */
    public ArrayList<SeriesDBModel> m15261w1(String str) {
        String str2;
        StringBuilder sb2;
        String str3;
        StringBuilder sb3;
        String str4;
        String str5;
        String m15400w = SharepreferenceDBHandler.m15400w(this.f16636b);
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        if (str.equals("0")) {
            m15400w.hashCode();
            switch (m15400w) {
                case "0":
                    sb3 = new StringBuilder();
                    sb3.append("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE 'series'  AND iptv_live_streams_m3u.user_id_referred='");
                    sb3.append(m15337A);
                    sb3.append("' AND ");
                    sb3.append("iptv_live_streams_m3u");
                    sb3.append(InstructionFileId.DOT);
                    sb3.append("categoryID");
                    sb3.append(" NOT IN (SELECT ");
                    sb3.append("iptv_password_status_table_m3u");
                    sb3.append(InstructionFileId.DOT);
                    sb3.append("password_status_cat_id");
                    sb3.append(" FROM ");
                    sb3.append("iptv_password_status_table_m3u");
                    sb3.append(" WHERE ");
                    sb3.append("iptv_password_status_table_m3u");
                    sb3.append(InstructionFileId.DOT);
                    sb3.append("user_id_referred");
                    sb3.append(" ='");
                    sb3.append(m15337A);
                    sb3.append("' AND ");
                    sb3.append("iptv_password_status_table_m3u");
                    sb3.append(InstructionFileId.DOT);
                    sb3.append("password_status");
                    str4 = " ='1')";
                    break;
                case "1":
                    sb3 = new StringBuilder();
                    sb3.append("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE 'series'  AND iptv_live_streams_m3u.user_id_referred='");
                    sb3.append(m15337A);
                    sb3.append("' AND ");
                    sb3.append("iptv_live_streams_m3u");
                    sb3.append(InstructionFileId.DOT);
                    sb3.append("categoryID");
                    sb3.append(" NOT IN (SELECT ");
                    sb3.append("iptv_password_status_table_m3u");
                    sb3.append(InstructionFileId.DOT);
                    sb3.append("password_status_cat_id");
                    sb3.append(" FROM ");
                    sb3.append("iptv_password_status_table_m3u");
                    sb3.append(" WHERE ");
                    sb3.append("iptv_password_status_table_m3u");
                    sb3.append(InstructionFileId.DOT);
                    sb3.append("user_id_referred");
                    sb3.append(" ='");
                    sb3.append(m15337A);
                    sb3.append("' AND ");
                    sb3.append("iptv_password_status_table_m3u");
                    sb3.append(InstructionFileId.DOT);
                    sb3.append("password_status");
                    sb3.append(" ='1') ORDER BY ");
                    str5 = "added";
                    sb3.append(str5);
                    str4 = " DESC";
                    break;
                case "3":
                    sb3 = new StringBuilder();
                    sb3.append("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE 'series'  AND iptv_live_streams_m3u.user_id_referred='");
                    sb3.append(m15337A);
                    sb3.append("' AND ");
                    sb3.append("iptv_live_streams_m3u");
                    sb3.append(InstructionFileId.DOT);
                    sb3.append("categoryID");
                    sb3.append(" NOT IN (SELECT ");
                    sb3.append("iptv_password_status_table_m3u");
                    sb3.append(InstructionFileId.DOT);
                    sb3.append("password_status_cat_id");
                    sb3.append(" FROM ");
                    sb3.append("iptv_password_status_table_m3u");
                    sb3.append(" WHERE ");
                    sb3.append("iptv_password_status_table_m3u");
                    sb3.append(InstructionFileId.DOT);
                    sb3.append("user_id_referred");
                    sb3.append(" ='");
                    sb3.append(m15337A);
                    sb3.append("' AND ");
                    sb3.append("iptv_password_status_table_m3u");
                    sb3.append(InstructionFileId.DOT);
                    sb3.append("password_status");
                    sb3.append(" ='1') ORDER BY ");
                    str5 = "name";
                    sb3.append(str5);
                    str4 = " DESC";
                    break;
                case "4":
                    sb3 = new StringBuilder();
                    sb3.append("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE 'series'  AND iptv_live_streams_m3u.user_id_referred='");
                    sb3.append(m15337A);
                    sb3.append("' AND ");
                    sb3.append("iptv_live_streams_m3u");
                    sb3.append(InstructionFileId.DOT);
                    sb3.append("categoryID");
                    sb3.append(" NOT IN (SELECT ");
                    sb3.append("iptv_password_status_table_m3u");
                    sb3.append(InstructionFileId.DOT);
                    sb3.append("password_status_cat_id");
                    sb3.append(" FROM ");
                    sb3.append("iptv_password_status_table_m3u");
                    sb3.append(" WHERE ");
                    sb3.append("iptv_password_status_table_m3u");
                    sb3.append(InstructionFileId.DOT);
                    sb3.append("user_id_referred");
                    sb3.append(" ='");
                    sb3.append(m15337A);
                    sb3.append("' AND ");
                    sb3.append("iptv_password_status_table_m3u");
                    sb3.append(InstructionFileId.DOT);
                    sb3.append("password_status");
                    sb3.append(" ='1') ORDER BY cast(");
                    sb3.append("num");
                    str4 = " as REAL) ASC";
                    break;
                case "5":
                    sb3 = new StringBuilder();
                    sb3.append("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE 'series'  AND iptv_live_streams_m3u.user_id_referred='");
                    sb3.append(m15337A);
                    sb3.append("' AND ");
                    sb3.append("iptv_live_streams_m3u");
                    sb3.append(InstructionFileId.DOT);
                    sb3.append("categoryID");
                    sb3.append(" NOT IN (SELECT ");
                    sb3.append("iptv_password_status_table_m3u");
                    sb3.append(InstructionFileId.DOT);
                    sb3.append("password_status_cat_id");
                    sb3.append(" FROM ");
                    sb3.append("iptv_password_status_table_m3u");
                    sb3.append(" WHERE ");
                    sb3.append("iptv_password_status_table_m3u");
                    sb3.append(InstructionFileId.DOT);
                    sb3.append("user_id_referred");
                    sb3.append(" ='");
                    sb3.append(m15337A);
                    sb3.append("' AND ");
                    sb3.append("iptv_password_status_table_m3u");
                    sb3.append(InstructionFileId.DOT);
                    sb3.append("password_status");
                    sb3.append(" ='1') ORDER BY cast(");
                    sb3.append("num");
                    str4 = " as REAL) DESC";
                    break;
                default:
                    sb3 = new StringBuilder();
                    sb3.append("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE 'series'  AND iptv_live_streams_m3u.user_id_referred='");
                    sb3.append(m15337A);
                    sb3.append("' AND ");
                    sb3.append("iptv_live_streams_m3u");
                    sb3.append(InstructionFileId.DOT);
                    sb3.append("categoryID");
                    sb3.append(" NOT IN (SELECT ");
                    sb3.append("iptv_password_status_table_m3u");
                    sb3.append(InstructionFileId.DOT);
                    sb3.append("password_status_cat_id");
                    sb3.append(" FROM ");
                    sb3.append("iptv_password_status_table_m3u");
                    sb3.append(" WHERE ");
                    sb3.append("iptv_password_status_table_m3u");
                    sb3.append(InstructionFileId.DOT);
                    sb3.append("user_id_referred");
                    sb3.append(" ='");
                    sb3.append(m15337A);
                    sb3.append("' AND ");
                    sb3.append("iptv_password_status_table_m3u");
                    sb3.append(InstructionFileId.DOT);
                    sb3.append("password_status");
                    sb3.append(" ='1') ORDER BY ");
                    sb3.append("name");
                    str4 = " ASC";
                    break;
            }
            sb3.append(str4);
            str2 = sb3.toString();
        } else if (str.equals("-2") || str.equals("-3") || str.equals("null")) {
            str2 = "";
        } else {
            m15400w.hashCode();
            switch (m15400w) {
                case "0":
                    sb2 = new StringBuilder();
                    sb2.append("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE 'series'  AND iptv_live_streams_m3u.user_id_referred='");
                    sb2.append(m15337A);
                    sb2.append("' AND ");
                    sb2.append("iptv_live_streams_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("categoryID");
                    sb2.append(" ='");
                    sb2.append(str);
                    sb2.append("' AND ");
                    sb2.append("iptv_live_streams_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("categoryID");
                    sb2.append(" NOT IN (SELECT ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status_cat_id");
                    sb2.append(" FROM ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(" WHERE ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("user_id_referred");
                    sb2.append(" ='");
                    sb2.append(m15337A);
                    sb2.append("' AND ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status");
                    str3 = " ='1')";
                    break;
                case "1":
                    sb2 = new StringBuilder();
                    sb2.append("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE 'series'  AND iptv_live_streams_m3u.user_id_referred='");
                    sb2.append(m15337A);
                    sb2.append("' AND ");
                    sb2.append("iptv_live_streams_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("categoryID");
                    sb2.append(" ='");
                    sb2.append(str);
                    sb2.append("' AND ");
                    sb2.append("iptv_live_streams_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("categoryID");
                    sb2.append(" NOT IN (SELECT ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status_cat_id");
                    sb2.append(" FROM ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(" WHERE ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("user_id_referred");
                    sb2.append(" ='");
                    sb2.append(m15337A);
                    sb2.append("' AND ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status");
                    sb2.append(" ='1') ORDER BY ");
                    sb2.append("added");
                    str3 = " DESC";
                    break;
                case "3":
                    sb2 = new StringBuilder();
                    sb2.append("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE 'series'  AND iptv_live_streams_m3u.user_id_referred='");
                    sb2.append(m15337A);
                    sb2.append("' AND ");
                    sb2.append("iptv_live_streams_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("categoryID");
                    sb2.append(" ='");
                    sb2.append(str);
                    sb2.append("' AND ");
                    sb2.append("iptv_live_streams_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("categoryID");
                    sb2.append(" NOT IN (SELECT ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status_cat_id");
                    sb2.append(" FROM ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(" WHERE ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("user_id_referred");
                    sb2.append(" ='");
                    sb2.append(m15337A);
                    sb2.append("' AND ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status");
                    sb2.append(" ='1') ORDER BY ");
                    sb2.append("name");
                    str3 = " DESC";
                    break;
                case "4":
                    sb2 = new StringBuilder();
                    sb2.append("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE 'series'  AND iptv_live_streams_m3u.user_id_referred='");
                    sb2.append(m15337A);
                    sb2.append("' AND ");
                    sb2.append("iptv_live_streams_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("categoryID");
                    sb2.append(" ='");
                    sb2.append(str);
                    sb2.append("' AND ");
                    sb2.append("iptv_live_streams_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("categoryID");
                    sb2.append(" NOT IN (SELECT ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status_cat_id");
                    sb2.append(" FROM ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(" WHERE ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("user_id_referred");
                    sb2.append(" ='");
                    sb2.append(m15337A);
                    sb2.append("' AND ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status");
                    sb2.append(" ='1') ORDER BY cast(");
                    sb2.append("num");
                    str3 = " as REAL) ASC";
                    break;
                case "5":
                    sb2 = new StringBuilder();
                    sb2.append("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE 'series'  AND iptv_live_streams_m3u.user_id_referred='");
                    sb2.append(m15337A);
                    sb2.append("' AND ");
                    sb2.append("iptv_live_streams_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("categoryID");
                    sb2.append(" ='");
                    sb2.append(str);
                    sb2.append("' AND ");
                    sb2.append("iptv_live_streams_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("categoryID");
                    sb2.append(" NOT IN (SELECT ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status_cat_id");
                    sb2.append(" FROM ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(" WHERE ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("user_id_referred");
                    sb2.append(" ='");
                    sb2.append(m15337A);
                    sb2.append("' AND ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status");
                    sb2.append(" ='1') ORDER BY cast(");
                    sb2.append("num");
                    str3 = " as REAL) DESC";
                    break;
                default:
                    sb2 = new StringBuilder();
                    sb2.append("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE 'series'  AND iptv_live_streams_m3u.user_id_referred='");
                    sb2.append(m15337A);
                    sb2.append("' AND ");
                    sb2.append("iptv_live_streams_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("categoryID");
                    sb2.append(" ='");
                    sb2.append(str);
                    sb2.append("' AND ");
                    sb2.append("iptv_live_streams_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("categoryID");
                    sb2.append(" NOT IN (SELECT ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status_cat_id");
                    sb2.append(" FROM ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(" WHERE ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("user_id_referred");
                    sb2.append(" ='");
                    sb2.append(m15337A);
                    sb2.append("' AND ");
                    sb2.append("iptv_password_status_table_m3u");
                    sb2.append(InstructionFileId.DOT);
                    sb2.append("password_status");
                    sb2.append(" ='1') ORDER BY ");
                    sb2.append("name");
                    str3 = " ASC";
                    break;
            }
            sb2.append(str3);
            str2 = sb2.toString();
        }
        ArrayList<SeriesDBModel> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery(str2, null);
            if (rawQuery.moveToFirst()) {
                while (true) {
                    try {
                        if (SharepreferenceDBHandler.m15365b(this.f16636b) == 1) {
                            SharepreferenceDBHandler.m15348L(0, this.f16636b);
                        } else {
                            SeriesDBModel seriesDBModel = new SeriesDBModel();
                            seriesDBModel.m15054u(Integer.parseInt(rawQuery.getString(0)));
                            seriesDBModel.m15056w(rawQuery.getString(1));
                            seriesDBModel.m15055v(rawQuery.getString(2));
                            seriesDBModel.m15057x(rawQuery.getString(3));
                            seriesDBModel.m15033I(C5255e.m26215R(rawQuery.getString(4)));
                            seriesDBModel.m15026B(rawQuery.getString(5));
                            seriesDBModel.m15030F("");
                            seriesDBModel.m15025A("");
                            seriesDBModel.m15027C("");
                            seriesDBModel.m15028D("");
                            seriesDBModel.m15032H("");
                            seriesDBModel.m15029E("");
                            seriesDBModel.m15031G("");
                            seriesDBModel.m15053t(rawQuery.getString(8));
                            seriesDBModel.m15059z("");
                            seriesDBModel.m15052s("");
                            seriesDBModel.m15058y(rawQuery.getString(18));
                            arrayList.add(seriesDBModel);
                            if (!rawQuery.moveToNext()) {
                            }
                        }
                    } catch (SQLiteDatabaseLockedException e10) {
                        return null;
                    } catch (Exception e11) {
                        return null;
                    }
                }
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException e12) {
            return null;
        } catch (Exception e13) {
            return null;
        }
    }

    /* renamed from: w2 */
    public void m15262w2() {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            getReadableDatabase();
            getWritableDatabase().execSQL("delete from iptv_live_streams WHERE stream_type LIKE '%movie%' AND user_id_referred = '" + m15337A + "'");
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: x1 */
    public ArrayList<LiveStreamCategoryIdDBModel> m15263x1() {
        int i10;
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = new ArrayList<>();
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        if (SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u")) {
            try {
                try {
                    Cursor rawQuery = getReadableDatabase().rawQuery("SELECT iptv_live_category_m3u.* , COUNT(iptv_live_streams_m3u.id) AS TOTAL_COUNT FROM iptv_live_category_m3u,iptv_live_streams_m3u WHERE iptv_live_category_m3u.categoryID = iptv_live_streams_m3u.categoryID AND iptv_live_category_m3u.user_id_referred = '" + m15337A + "' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "user_id_referred = '" + m15337A + "' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "stream_type = 'live' AND iptv_live_streams_m3u" + InstructionFileId.DOT + "categoryID NOT IN (SELECT iptv_password_status_table_m3u" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table_m3u WHERE iptv_password_status_table_m3u" + InstructionFileId.DOT + "user_id_referred ='" + m15337A + "' AND iptv_password_status_table_m3u" + InstructionFileId.DOT + "password_status ='1') GROUP BY iptv_live_streams_m3u" + InstructionFileId.DOT + "categoryID ORDER BY iptv_live_category_m3u" + InstructionFileId.DOT + Name.MARK, null);
                    if (rawQuery.moveToFirst()) {
                        do {
                            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                            liveStreamCategoryIdDBModel.m14791f(Integer.parseInt(rawQuery.getString(0)));
                            liveStreamCategoryIdDBModel.m14792g(rawQuery.getString(1));
                            liveStreamCategoryIdDBModel.m14793h(rawQuery.getString(2));
                            liveStreamCategoryIdDBModel.m14794i(C5255e.m26215R(rawQuery.getString(4)));
                            arrayList.add(liveStreamCategoryIdDBModel);
                        } while (rawQuery.moveToNext());
                    }
                    rawQuery.close();
                    return arrayList;
                } catch (SQLiteDatabaseLockedException e10) {
                    return null;
                } catch (Exception e11) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException e12) {
                return null;
            } catch (Exception e13) {
                return null;
            }
        }
        try {
            try {
                Cursor rawQuery2 = getReadableDatabase().rawQuery("SELECT iptv_live_category.* , COUNT(iptv_live_streams.id) AS TOTAL_COUNT FROM iptv_live_category,iptv_live_streams WHERE iptv_live_category.categoryID_live = iptv_live_streams.categoryID AND iptv_live_category.user_id_referred = '" + m15337A + "' AND iptv_live_streams" + InstructionFileId.DOT + "user_id_referred = '" + m15337A + "' AND ( iptv_live_streams" + InstructionFileId.DOT + "stream_type = 'live' OR iptv_live_streams" + InstructionFileId.DOT + "stream_type = 'created_live' ) AND iptv_live_streams" + InstructionFileId.DOT + "categoryID NOT IN (SELECT iptv_password_status_table" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table WHERE iptv_password_status_table" + InstructionFileId.DOT + "user_id_referred ='" + m15337A + "' AND iptv_password_status_table" + InstructionFileId.DOT + "password_status ='1') GROUP BY iptv_live_streams" + InstructionFileId.DOT + "categoryID ORDER BY iptv_live_category" + InstructionFileId.DOT + "id_live", null);
                if (rawQuery2.moveToFirst()) {
                    do {
                        try {
                            i10 = Integer.parseInt(rawQuery2.getString(3));
                        } catch (NumberFormatException e14) {
                            i10 = 0;
                        }
                        LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel2 = new LiveStreamCategoryIdDBModel();
                        liveStreamCategoryIdDBModel2.m14791f(Integer.parseInt(rawQuery2.getString(0)));
                        liveStreamCategoryIdDBModel2.m14792g(rawQuery2.getString(1));
                        liveStreamCategoryIdDBModel2.m14793h(rawQuery2.getString(2));
                        liveStreamCategoryIdDBModel2.m14795j(i10);
                        liveStreamCategoryIdDBModel2.m14794i(C5255e.m26215R(rawQuery2.getString(5)));
                        arrayList.add(liveStreamCategoryIdDBModel2);
                    } while (rawQuery2.moveToNext());
                }
                rawQuery2.close();
                return arrayList;
            } catch (SQLiteDatabaseLockedException e15) {
                return null;
            } catch (Exception e16) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException e17) {
            return null;
        } catch (Exception e18) {
            return null;
        }
    }

    /* renamed from: x2 */
    public void m15264x2(String str) {
        String str2;
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            getReadableDatabase();
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (str.equals("0")) {
                str2 = "DELETE FROM iptv_live_streams_m3u WHERE user_id_referred='" + m15337A + "'";
            } else {
                str2 = "DELETE FROM iptv_live_streams_m3u WHERE categoryID ='" + str + "' AND user_id_referred='" + m15337A + "'";
            }
            writableDatabase.execSQL(str2);
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: y */
    public boolean m15265y(List<XMLTVProgrammePojo> list) {
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            String str = SharepreferenceDBHandler.m15373f(this.f16636b).equals("m3u") ? "epg_m3u" : "epg";
            try {
                ContentValues contentValues = new ContentValues();
                int size = list.size();
                if (size != 0) {
                    for (int i10 = 0; i10 < size; i10++) {
                        contentValues.put(ChartFactory.TITLE, list.get(i10).m15515m());
                        contentValues.put("start", list.get(i10).m15512j());
                        contentValues.put("stop", list.get(i10).m15514l());
                        contentValues.put("description", list.get(i10).m15504b());
                        contentValues.put("channel_id", list.get(i10).m15503a());
                        contentValues.put("user_id_referred", Integer.valueOf(m15337A));
                        contentValues.put("source_ref_id", list.get(i10).m15511i());
                        writableDatabase.insert(str, null, contentValues);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return true;
            } catch (SQLiteDatabaseLockedException e10) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
                return false;
            } catch (Exception e11) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
                return false;
            }
        } catch (Exception e12) {
            return false;
        }
    }

    /* renamed from: y1 */
    public ArrayList<LiveStreamCategoryIdDBModel> m15266y1(String str) {
        String str2;
        int i10;
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = new ArrayList<>();
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        String m15373f = SharepreferenceDBHandler.m15373f(this.f16636b);
        System.currentTimeMillis();
        if (m15373f.equals("m3u")) {
            str2 = "SELECT * FROM iptv_live_category_m3u WHERE user_id_referred='" + m15337A + "' AND categoryID IS NOT NULL";
        } else {
            str2 = "SELECT iptv_live_category.* , COUNT(iptv_live_streams.id) AS TOTAL_COUNT FROM iptv_live_category,iptv_live_streams WHERE iptv_live_category.categoryID_live = iptv_live_streams.categoryID AND iptv_live_category.user_id_referred = '" + m15337A + "' AND iptv_live_streams" + InstructionFileId.DOT + "stream_type LIKE '%" + str + "%'  GROUP BY iptv_live_streams" + InstructionFileId.DOT + "categoryID ORDER BY iptv_live_category" + InstructionFileId.DOT + "id_live";
        }
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery(str2, null);
            if (rawQuery.moveToFirst()) {
                System.currentTimeMillis();
                do {
                    try {
                        i10 = Integer.parseInt(rawQuery.getString(3));
                    } catch (NumberFormatException e10) {
                        i10 = 0;
                    }
                    LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                    liveStreamCategoryIdDBModel.m14791f(Integer.parseInt(rawQuery.getString(0)));
                    liveStreamCategoryIdDBModel.m14792g(rawQuery.getString(1));
                    liveStreamCategoryIdDBModel.m14793h(rawQuery.getString(2));
                    liveStreamCategoryIdDBModel.m14795j(i10);
                    arrayList.add(liveStreamCategoryIdDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e11) {
            return null;
        }
    }

    /* renamed from: y2 */
    public void m15267y2(String str) {
        String str2;
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (str.equals("0")) {
                str2 = "DELETE FROM iptv_live_category_m3u WHERE user_id_referred='" + m15337A + "'";
            } else {
                str2 = "DELETE FROM iptv_live_category_m3u WHERE categoryID ='" + str + "' AND user_id_referred='" + m15337A + "'";
            }
            writableDatabase.execSQL(str2);
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: z1 */
    public ArrayList<LiveStreamCategoryIdDBModel> m15268z1() {
        int i10;
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = new ArrayList<>();
        int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
        SharepreferenceDBHandler.m15373f(this.f16636b);
        System.currentTimeMillis();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT iptv_live_category.* , COUNT(iptv_live_streams.id) AS TOTAL_COUNT FROM iptv_live_category,iptv_live_streams WHERE iptv_live_category.categoryID_live = iptv_live_streams.categoryID AND iptv_live_category.user_id_referred = '" + m15337A + "' AND iptv_live_streams" + InstructionFileId.DOT + "user_id_referred = '" + m15337A + "' AND iptv_live_streams" + InstructionFileId.DOT + "stream_type = 'radio_streams' AND iptv_live_streams" + InstructionFileId.DOT + "categoryID NOT IN (SELECT iptv_password_status_table" + InstructionFileId.DOT + "password_status_cat_id FROM iptv_password_status_table WHERE iptv_password_status_table" + InstructionFileId.DOT + "user_id_referred ='" + m15337A + "' AND iptv_password_status_table" + InstructionFileId.DOT + "password_status ='1') GROUP BY iptv_live_streams" + InstructionFileId.DOT + "categoryID ORDER BY iptv_live_category" + InstructionFileId.DOT + "id_live", null);
            if (rawQuery.moveToFirst()) {
                System.currentTimeMillis();
                do {
                    try {
                        i10 = Integer.parseInt(rawQuery.getString(3));
                    } catch (NumberFormatException e10) {
                        i10 = 0;
                    }
                    LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                    liveStreamCategoryIdDBModel.m14791f(Integer.parseInt(rawQuery.getString(0)));
                    liveStreamCategoryIdDBModel.m14792g(rawQuery.getString(1));
                    liveStreamCategoryIdDBModel.m14793h(rawQuery.getString(2));
                    liveStreamCategoryIdDBModel.m14795j(i10);
                    liveStreamCategoryIdDBModel.m14794i(C5255e.m26215R(rawQuery.getString(5)));
                    arrayList.add(liveStreamCategoryIdDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception e11) {
            return null;
        }
    }

    /* renamed from: z2 */
    public void m15269z2(String str) {
        String str2;
        try {
            int m15337A = SharepreferenceDBHandler.m15337A(this.f16636b);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (str.equals("0")) {
                str2 = "DELETE FROM iptv_movie_category_m3u WHERE user_id_referred='" + m15337A + "'";
            } else {
                str2 = "DELETE FROM iptv_movie_category_m3u WHERE categoryID ='" + str + "' AND user_id_referred='" + m15337A + "'";
            }
            writableDatabase.execSQL(str2);
        } catch (SQLiteDatabaseLockedException | Exception e10) {
            Log.w("msg", "exception");
        }
    }
}
