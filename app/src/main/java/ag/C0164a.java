package ag;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import bg.C0900a;
import bg.C0901b;
import java.io.File;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ag/a.class
 */
/* renamed from: ag.a */
/* loaded from: combined.jar:classes2.jar:ag/a.class */
public class C0164a extends SQLiteOpenHelper {

    /* renamed from: b */
    public Context f1280b;

    /* renamed from: c */
    public SQLiteDatabase f1281c;

    /* renamed from: d */
    public ArrayList<C0900a> f1282d;

    /* renamed from: e */
    public String f1283e;

    /* renamed from: f */
    public String f1284f;

    /* renamed from: g */
    public String f1285g;

    /* renamed from: h */
    public String f1286h;

    /* renamed from: i */
    public String f1287i;

    /* renamed from: j */
    public String f1288j;

    public C0164a(Context context) {
        super(context, "vpndatabase.db", (SQLiteDatabase.CursorFactory) null, 6);
        this.f1282d = null;
        this.f1283e = "CREATE TABLE IF NOT EXISTS vpntable(id INTEGER PRIMARY KEY,filename TEXT,filename1 TEXT,filepath TEXT,username TEXT,name TEXT,user_id TEXT,profilename TEXT,type TEXT)";
        this.f1284f = "CREATE TABLE IF NOT EXISTS vpntablelogin(id TEXT,filename TEXT,filename1 TEXT,filepath TEXT,username TEXT,name TEXT,profilename TEXT,type TEXT)";
        this.f1285g = "ALTER TABLE vpntable ADD COLUMN filename1 TEXT;";
        this.f1286h = "ALTER TABLE vpntablelogin ADD COLUMN filename1 TEXT;";
        this.f1287i = "ALTER TABLE vpnsmarterstable ADD COLUMN flag TEXT;";
        this.f1288j = "CREATE TABLE IF NOT EXISTS vpnsmarterstable(id INTEGER PRIMARY KEY,file_name TEXT,filepath TEXT,vpn_username TEXT,vpn_password TEXT,user_id TEXT,auth_user_pass TEXT,remember TEXT,server_name TEXT,flag TEXT)";
        this.f1280b = context;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:51:0x0353
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* renamed from: B */
    public final void m733B(android.database.sqlite.SQLiteDatabase r8) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.C0164a.m733B(android.database.sqlite.SQLiteDatabase):void");
    }

    /* renamed from: f */
    public void m734f(ArrayList<C0900a> arrayList) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues();
            int size = arrayList.size();
            if (size != 0) {
                for (int i10 = 0; i10 < size; i10++) {
                    contentValues.put("file_name", arrayList.get(i10).m5552a());
                    contentValues.put("server_name", arrayList.get(i10).m5556e());
                    contentValues.put("filepath", arrayList.get(i10).m5555d());
                    contentValues.put("vpn_username", arrayList.get(i10).m5559h());
                    contentValues.put("vpn_password", arrayList.get(i10).m5558g());
                    contentValues.put("auth_user_pass", arrayList.get(i10).m5560i());
                    contentValues.put("remember", arrayList.get(i10).m5561j());
                    contentValues.put("user_id", arrayList.get(i10).m5557f());
                    contentValues.put("flag", arrayList.get(i10).m5553b());
                    writableDatabase.insert("vpnsmarterstable", null, contentValues);
                }
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: l */
    public void m735l(SQLiteDatabase sQLiteDatabase, ArrayList<C0900a> arrayList) {
        try {
            sQLiteDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues();
            int size = arrayList.size();
            if (size != 0) {
                for (int i10 = 0; i10 < size; i10++) {
                    contentValues.put("file_name", arrayList.get(i10).m5552a());
                    contentValues.put("server_name", arrayList.get(i10).m5556e());
                    contentValues.put("filepath", arrayList.get(i10).m5555d());
                    contentValues.put("vpn_username", arrayList.get(i10).m5559h());
                    contentValues.put("vpn_password", arrayList.get(i10).m5558g());
                    contentValues.put("auth_user_pass", arrayList.get(i10).m5560i());
                    contentValues.put("remember", arrayList.get(i10).m5561j());
                    contentValues.put("user_id", arrayList.get(i10).m5557f());
                    sQLiteDatabase.insert("vpnsmarterstable", null, contentValues);
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
            Log.w("msg", "exception");
        }
    }

    /* renamed from: o */
    public boolean m736o(String str, String str2, String str3) {
        String str4 = "SELECT  * FROM vpnsmarterstable WHERE  file_name='" + str + "'  AND server_name='" + str2 + "' AND filepath='" + str3 + "'";
        boolean z10 = false;
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f1281c = readableDatabase;
            Cursor rawQuery = readableDatabase.rawQuery(str4, null);
            int count = rawQuery.getCount();
            rawQuery.close();
            if (count > 0) {
                z10 = true;
            }
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
        }
        return z10;
    }

    /* renamed from: o0 */
    public final void m737o0(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, File file) {
        String str4;
        String str5;
        C0900a c0900a = new C0900a();
        if (str3.contains("auth-user-pass")) {
            c0900a.m5562k("1");
        } else {
            c0900a.m5562k("0");
        }
        c0900a.m5566o("0");
        ArrayList<C0901b> m743w = m743w(sQLiteDatabase);
        ArrayList<C0901b> m744y = m744y(sQLiteDatabase);
        if (m743w != null && m743w.size() > 0) {
            for (int i10 = 0; i10 < m743w.size(); i10++) {
                if (m743w.get(i10).m5572a().equals(str)) {
                    str5 = m743w.get(i10).m5574c();
                    str4 = m743w.get(i10).m5573b();
                    break;
                }
            }
        }
        str4 = "";
        str5 = "";
        String str6 = str5;
        String str7 = str4;
        if (str5.equals("")) {
            str6 = str5;
            str7 = str4;
            if (str4.equals("")) {
                str6 = str5;
                str7 = str4;
                if (m744y != null) {
                    str6 = str5;
                    str7 = str4;
                    if (m744y.size() > 0) {
                        int i11 = 0;
                        while (true) {
                            str6 = str5;
                            str7 = str4;
                            if (i11 >= m744y.size()) {
                                break;
                            }
                            if (m744y.get(i11).m5572a().equals(str)) {
                                str6 = m744y.get(i11).m5574c();
                                str7 = m744y.get(i11).m5573b();
                                break;
                            }
                            i11++;
                        }
                    }
                }
            }
        }
        c0900a.m5571t(str6);
        c0900a.m5570s(str7);
        c0900a.m5568q(str2);
        c0900a.m5563l(str);
        c0900a.m5569r("0");
        c0900a.m5567p(String.valueOf(file));
        this.f1282d.add(c0900a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(this.f1283e);
        sQLiteDatabase.execSQL(this.f1284f);
        sQLiteDatabase.execSQL(this.f1288j);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (i10 < 4) {
            sQLiteDatabase.execSQL(this.f1285g);
            sQLiteDatabase.execSQL(this.f1286h);
        }
        if (i10 < 5) {
            sQLiteDatabase.execSQL(this.f1288j);
            m733B(sQLiteDatabase);
        }
        if (i10 < 6) {
            sQLiteDatabase.execSQL(this.f1287i);
        }
    }

    /* renamed from: p */
    public boolean m738p(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        boolean z10 = false;
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT  * FROM vpnsmarterstable WHERE  file_name='" + str + "'  AND server_name='" + str2 + "' AND filepath='" + str3 + "'", null);
            int count = rawQuery.getCount();
            rawQuery.close();
            if (count > 0) {
                z10 = true;
            }
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
        }
        return z10;
    }

    /* renamed from: q */
    public void m739q(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    m739q(file2);
                }
            }
            file.delete();
        }
    }

    /* renamed from: q0 */
    public int m740q0(C0900a c0900a) {
        int m5554c = c0900a.m5554c();
        int i10 = 0;
        try {
            this.f1281c = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("vpn_username", c0900a.m5559h());
            contentValues.put("vpn_password", c0900a.m5558g());
            SQLiteDatabase sQLiteDatabase = this.f1281c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("id='");
            sb2.append(m5554c);
            sb2.append("'");
            int update = sQLiteDatabase.update("vpnsmarterstable", contentValues, sb2.toString(), null);
            i10 = update;
            this.f1281c.close();
            i10 = update;
        } catch (Exception e10) {
        }
        return i10;
    }

    /* renamed from: t */
    public void m741t(int i10) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f1281c = writableDatabase;
            writableDatabase.delete("vpnsmarterstable", "id='" + i10 + "'", null);
            this.f1281c.close();
        } catch (Exception e10) {
        }
    }

    /* renamed from: v */
    public ArrayList<C0900a> m742v() {
        ArrayList<C0900a> arrayList = new ArrayList<>();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f1281c = readableDatabase;
            Cursor rawQuery = readableDatabase.rawQuery("SELECT  * FROM vpnsmarterstable", null);
            if (rawQuery.moveToFirst()) {
                do {
                    C0900a c0900a = new C0900a();
                    c0900a.m5565n(rawQuery.getInt(0));
                    c0900a.m5563l(rawQuery.getString(1));
                    c0900a.m5567p(rawQuery.getString(2));
                    c0900a.m5571t(rawQuery.getString(3));
                    c0900a.m5570s(rawQuery.getString(4));
                    c0900a.m5569r(rawQuery.getString(5));
                    c0900a.m5562k(rawQuery.getString(6));
                    c0900a.m5566o(rawQuery.getString(7));
                    c0900a.m5568q(rawQuery.getString(8));
                    c0900a.m5564m(rawQuery.getString(9));
                    arrayList.add(c0900a);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
        } catch (Exception e10) {
        }
        return arrayList;
    }

    /* renamed from: w */
    public final ArrayList<C0901b> m743w(SQLiteDatabase sQLiteDatabase) {
        ArrayList<C0901b> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT  * FROM vpntablelogin", null);
            if (rawQuery.moveToFirst()) {
                do {
                    C0901b c0901b = new C0901b();
                    c0901b.m5578g(rawQuery.getInt(0));
                    c0901b.m5575d(rawQuery.getString(1));
                    c0901b.m5576e(rawQuery.getString(2));
                    c0901b.m5577f(rawQuery.getString(3));
                    c0901b.m5583l(rawQuery.getString(4));
                    c0901b.m5579h(rawQuery.getString(5));
                    c0901b.m5580i(rawQuery.getColumnName(6));
                    c0901b.m5581j("login");
                    arrayList.add(c0901b);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
        }
        return arrayList;
    }

    /* renamed from: y */
    public final ArrayList<C0901b> m744y(SQLiteDatabase sQLiteDatabase) {
        ArrayList<C0901b> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT  * FROM vpntable", null);
            if (rawQuery.moveToFirst()) {
                do {
                    C0901b c0901b = new C0901b();
                    c0901b.m5578g(rawQuery.getInt(0));
                    c0901b.m5575d(rawQuery.getString(1));
                    c0901b.m5576e(rawQuery.getString(2));
                    c0901b.m5577f(rawQuery.getString(3));
                    c0901b.m5583l(rawQuery.getString(4));
                    c0901b.m5579h(rawQuery.getString(5));
                    c0901b.m5580i(rawQuery.getColumnName(6));
                    c0901b.m5581j("settings");
                    arrayList.add(c0901b);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
        }
        return arrayList;
    }
}
