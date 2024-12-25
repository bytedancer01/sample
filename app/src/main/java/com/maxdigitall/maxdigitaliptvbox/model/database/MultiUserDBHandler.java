package com.maxdigitall.maxdigitaliptvbox.model.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.maxdigitall.maxdigitaliptvbox.model.MultiUserDBModel;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/database/MultiUserDBHandler.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/database/MultiUserDBHandler.class */
public class MultiUserDBHandler extends SQLiteOpenHelper {

    /* renamed from: b */
    public Context f16661b;

    /* renamed from: c */
    public SQLiteDatabase f16662c;

    /* renamed from: d */
    public String f16663d;

    /* renamed from: e */
    public String f16664e;

    /* renamed from: f */
    public String f16665f;

    /* renamed from: g */
    public String f16666g;

    /* renamed from: h */
    public String f16667h;

    public MultiUserDBHandler(Context context) {
        super(context, "iptv_smarters_multi_user.db", (SQLiteDatabase.CursorFactory) null, 4);
        this.f16663d = "CREATE TABLE IF NOT EXISTS login_user(server_url TEXT,user_created TEXT)";
        this.f16664e = "CREATE TABLE IF NOT EXISTS multi_user(auto_id INTEGER PRIMARY KEY,name TEXT,username TEXT,password TEXT,magportal TEXT,magportal2 TEXT,logged_in_using TEXT)";
        this.f16665f = "ALTER TABLE multi_user ADD COLUMN magportal2 TEXT;";
        this.f16666g = "CREATE TABLE IF NOT EXISTS multi_user_m3u(auto_id INTEGER PRIMARY KEY,name TEXT,username TEXT,password TEXT,magportal TEXT,type_of_m3u TEXT)";
        this.f16667h = "CREATE TABLE IF NOT EXISTS multi_user_epg_m3u(auto_id INTEGER PRIMARY KEY,user_id TEXT,epgurl TEXT)";
        this.f16661b = context;
    }

    /* renamed from: B */
    public int m15270B(String str, String str2, String str3, String str4, String str5, String str6) {
        int i10;
        String str7;
        try {
            if (str5.equals("m3u")) {
                str7 = "SELECT auto_id FROM multi_user_m3u WHERE name='" + str + "' AND " + CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME + "='" + str2 + "' AND " + CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD + "='" + str3 + "' AND magportal LIKE '%" + str4 + "%'";
            } else {
                str7 = "SELECT auto_id FROM multi_user WHERE username='" + str2 + "' AND " + CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD + "='" + str3 + "' AND (magportal LIKE '%" + str4 + "%' OR magportal2 LIKE '%" + str6 + "%' )";
            }
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f16662c = readableDatabase;
            Cursor rawQuery = readableDatabase.rawQuery(str7, null);
            i10 = -1;
            if (rawQuery != null) {
                i10 = -1;
                if (rawQuery.moveToFirst()) {
                    i10 = rawQuery.getInt(rawQuery.getColumnIndex("auto_id"));
                    rawQuery.close();
                }
            }
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
            i10 = -1;
        }
        return i10;
    }

    /* renamed from: f */
    public void m15271f(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            this.f16662c = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str.replaceAll("'", ""));
            contentValues.put(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, str2);
            contentValues.put(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, str3);
            contentValues.put("magportal", str4);
            contentValues.put("magportal2", str5);
            contentValues.put("logged_in_using", str6);
            this.f16662c.insert("multi_user", null, contentValues);
            this.f16662c.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
        }
    }

    /* renamed from: l */
    public void m15272l(String str, String str2, String str3, String str4, String str5) {
        try {
            this.f16662c = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str.replaceAll("'", ""));
            contentValues.put(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, str2);
            contentValues.put(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, str3);
            contentValues.put("magportal", str4);
            contentValues.put("type_of_m3u", str5);
            this.f16662c.insert("multi_user_m3u", null, contentValues);
            this.f16662c.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
        }
    }

    /* renamed from: o */
    public boolean m15273o(String str, String str2, String str3, String str4, String str5, String str6) {
        String str7;
        try {
            String replaceAll = str.replaceAll("'", "");
            if (str5.equals("m3u")) {
                str7 = "SELECT  count(*) FROM multi_user_m3u WHERE name ='" + replaceAll + "' AND " + CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME + " ='" + str2 + "' AND " + CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD + " ='" + str3 + "' AND magportal='" + str4 + "'";
            } else {
                str7 = "SELECT  count(*) FROM multi_user WHERE username ='" + str2 + "' AND " + CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD + " ='" + str3 + "' AND (magportal LIKE '%" + str4 + "%' OR magportal2 LIKE '%" + str6 + "%' )";
            }
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f16662c = readableDatabase;
            Cursor rawQuery = readableDatabase.rawQuery(str7, null);
            rawQuery.moveToFirst();
            int i10 = rawQuery.getInt(0);
            rawQuery.close();
            return i10 > 0;
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
            return false;
        }
    }

    /* renamed from: o0 */
    public ArrayList<MultiUserDBModel> m15274o0(int i10) {
        ArrayList<MultiUserDBModel> arrayList = new ArrayList<>();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f16662c = readableDatabase;
            Cursor rawQuery = readableDatabase.rawQuery("SELECT  * FROM multi_user_m3u WHERE auto_id ='" + i10 + "'", null);
            if (rawQuery.moveToFirst()) {
                do {
                    MultiUserDBModel multiUserDBModel = new MultiUserDBModel();
                    multiUserDBModel.m14882l(rawQuery.getString(1));
                    multiUserDBModel.m14884n(rawQuery.getString(2));
                    multiUserDBModel.m14883m(rawQuery.getString(3));
                    multiUserDBModel.m14880j(rawQuery.getString(4));
                    multiUserDBModel.m14879i(rawQuery.getString(5));
                    arrayList.add(multiUserDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
        }
        return arrayList;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(this.f16664e);
        sQLiteDatabase.execSQL(this.f16667h);
        sQLiteDatabase.execSQL(this.f16666g);
        sQLiteDatabase.execSQL(this.f16663d);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (i10 < 2) {
            sQLiteDatabase.execSQL(this.f16667h);
            sQLiteDatabase.execSQL(this.f16666g);
        }
        if (i10 < 3) {
            sQLiteDatabase.execSQL(this.f16665f);
        }
        if (i10 < 4) {
            sQLiteDatabase.execSQL(this.f16663d);
        }
    }

    /* renamed from: p */
    public boolean m15275p(String str, String str2, String str3, String str4, String str5, String str6) {
        StringBuilder sb2;
        try {
            String replaceAll = str.replaceAll("'", "");
            if (str5.equals("m3u")) {
                sb2 = new StringBuilder();
                sb2.append("SELECT  count(*) FROM multi_user_m3u WHERE name ='");
                sb2.append(replaceAll);
                sb2.append("' AND ");
                sb2.append(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME);
                sb2.append(" ='");
                sb2.append(str2);
                sb2.append("' AND ");
                sb2.append(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD);
                sb2.append(" ='");
                sb2.append(str3);
                sb2.append("' AND ");
                sb2.append("magportal");
                sb2.append("='");
                sb2.append(str4);
                sb2.append("'");
            } else {
                sb2 = new StringBuilder();
                sb2.append("SELECT  count(*) FROM multi_user WHERE name ='");
                sb2.append(replaceAll);
                sb2.append("' AND ");
                sb2.append(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME);
                sb2.append(" ='");
                sb2.append(str2);
                sb2.append("' AND ");
                sb2.append(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD);
                sb2.append(" ='");
                sb2.append(str3);
                sb2.append("' AND (");
                sb2.append("magportal");
                sb2.append(" LIKE '%");
                sb2.append(str4);
                sb2.append("%' OR ");
                sb2.append("magportal2");
                sb2.append(" LIKE '%");
                sb2.append(str6);
                sb2.append("%' )");
            }
            String sb3 = sb2.toString();
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f16662c = readableDatabase;
            Cursor rawQuery = readableDatabase.rawQuery(sb3, null);
            rawQuery.moveToFirst();
            int i10 = rawQuery.getInt(0);
            rawQuery.close();
            return i10 > 0;
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
            return false;
        }
    }

    /* renamed from: q */
    public void m15276q(int i10) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f16662c = writableDatabase;
        writableDatabase.execSQL("DELETE FROM multi_user WHERE auto_id='" + i10 + "'");
        this.f16662c.close();
    }

    /* renamed from: q0 */
    public void m15277q0(int i10, String str) {
        this.f16662c = getWritableDatabase();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("magportal2", str);
            this.f16662c.update("multi_user", contentValues, "auto_id = ?", new String[]{String.valueOf(i10)});
            this.f16662c.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
        }
    }

    /* renamed from: t */
    public void m15278t(int i10) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f16662c = writableDatabase;
        writableDatabase.execSQL("DELETE FROM multi_user_m3u WHERE auto_id='" + i10 + "'");
        this.f16662c.execSQL("DELETE FROM multi_user_epg_m3u WHERE user_id='" + i10 + "'");
        this.f16662c.close();
    }

    /* renamed from: v */
    public ArrayList<MultiUserDBModel> m15279v() {
        ArrayList<MultiUserDBModel> arrayList = new ArrayList<>();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f16662c = readableDatabase;
            Cursor rawQuery = readableDatabase.rawQuery("SELECT  * FROM multi_user ORDER BY auto_id DESC", null);
            if (rawQuery.moveToFirst()) {
                do {
                    MultiUserDBModel multiUserDBModel = new MultiUserDBModel();
                    multiUserDBModel.m14882l(rawQuery.getString(1));
                    multiUserDBModel.m14884n(rawQuery.getString(2));
                    multiUserDBModel.m14883m(rawQuery.getString(3));
                    multiUserDBModel.m14880j(rawQuery.getString(4));
                    multiUserDBModel.m14881k(rawQuery.getString(5));
                    multiUserDBModel.m14878h(rawQuery.getString(6));
                    arrayList.add(multiUserDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
        }
        return arrayList;
    }

    /* renamed from: v0 */
    public void m15280v0(int i10, String str, String str2) {
        this.f16662c = getWritableDatabase();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("magportal", str);
            contentValues.put("magportal2", str2);
            this.f16662c.update("multi_user", contentValues, "auto_id = ?", new String[]{String.valueOf(i10)});
            this.f16662c.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
        }
    }

    /* renamed from: w */
    public ArrayList<MultiUserDBModel> m15281w() {
        ArrayList<MultiUserDBModel> arrayList = new ArrayList<>();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f16662c = readableDatabase;
            Cursor rawQuery = readableDatabase.rawQuery("SELECT  * FROM multi_user_m3u ORDER BY auto_id DESC", null);
            if (rawQuery.moveToFirst()) {
                do {
                    MultiUserDBModel multiUserDBModel = new MultiUserDBModel();
                    multiUserDBModel.m14882l(rawQuery.getString(1));
                    multiUserDBModel.m14884n(rawQuery.getString(2));
                    multiUserDBModel.m14883m(rawQuery.getString(3));
                    multiUserDBModel.m14880j(rawQuery.getString(4));
                    multiUserDBModel.m14879i(rawQuery.getString(5));
                    arrayList.add(multiUserDBModel);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
        }
        return arrayList;
    }

    /* renamed from: y */
    public int m15282y(String str, String str2, String str3, String str4, String str5, String str6) {
        int i10;
        String str7;
        StringBuilder sb2;
        try {
            if (str5.equals("m3u")) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("SELECT auto_id FROM multi_user_m3u WHERE name='");
                sb3.append(str);
                sb3.append("' AND ");
                sb3.append(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME);
                sb3.append("='");
                sb3.append(str2);
                sb3.append("' AND ");
                sb3.append(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD);
                sb3.append("='");
                sb3.append(str3);
                sb3.append("' AND ");
                sb3.append("magportal");
                sb3.append(" LIKE '%");
                sb3.append(str4);
                str7 = "%'";
                sb2 = sb3;
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("SELECT auto_id FROM multi_user WHERE name='");
                sb4.append(str);
                sb4.append("' AND ");
                sb4.append(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME);
                sb4.append("='");
                sb4.append(str2);
                sb4.append("' AND ");
                sb4.append(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD);
                sb4.append("='");
                sb4.append(str3);
                sb4.append("' AND (");
                sb4.append("magportal");
                sb4.append(" LIKE '%");
                sb4.append(str4);
                sb4.append("%' OR ");
                sb4.append("magportal2");
                sb4.append(" LIKE '%");
                sb4.append(str6);
                str7 = "%' )";
                sb2 = sb4;
            }
            sb2.append(str7);
            String sb5 = sb2.toString();
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f16662c = readableDatabase;
            Cursor rawQuery = readableDatabase.rawQuery(sb5, null);
            i10 = -1;
            if (rawQuery != null) {
                i10 = -1;
                if (rawQuery.moveToFirst()) {
                    i10 = rawQuery.getInt(rawQuery.getColumnIndex("auto_id"));
                    rawQuery.close();
                }
            }
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
            i10 = -1;
        }
        return i10;
    }
}
