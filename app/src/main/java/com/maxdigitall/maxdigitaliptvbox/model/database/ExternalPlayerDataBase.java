package com.maxdigitall.maxdigitaliptvbox.model.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/database/ExternalPlayerDataBase.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/database/ExternalPlayerDataBase.class */
public class ExternalPlayerDataBase extends SQLiteOpenHelper {

    /* renamed from: b */
    public Context f16618b;

    /* renamed from: c */
    public SQLiteDatabase f16619c;

    /* renamed from: d */
    public String f16620d;

    public ExternalPlayerDataBase(Context context) {
        super(context, "externalplayerdatabase.db", (SQLiteDatabase.CursorFactory) null, 3);
        this.f16620d = "CREATE TABLE IF NOT EXISTS table_external_player(id INTEGER PRIMARY KEY,appname TEXT,packagename TEXT,appicon TEXT,user_id_referred TEXT)";
        this.f16618b = context;
    }

    /* renamed from: f */
    public boolean m15130f(String str) {
        ArrayList arrayList = new ArrayList();
        String str2 = "SELECT  * FROM table_external_player WHERE appname='" + str + "'";
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f16619c = readableDatabase;
            Cursor rawQuery = readableDatabase.rawQuery(str2, null);
            if (rawQuery.moveToFirst()) {
                do {
                    ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
                    externalPlayerModelClass.m15418d(rawQuery.getString(1));
                    arrayList.add(externalPlayerModelClass);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return arrayList.size() > 0;
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
            return false;
        }
    }

    /* renamed from: l */
    public void m15131l(String str, String str2) {
        try {
            this.f16619c = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("appname", str);
            contentValues.put("packagename", str2);
            this.f16619c.insert("table_external_player", null, contentValues);
            this.f16619c.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
        }
    }

    /* renamed from: o */
    public ArrayList<ExternalPlayerModelClass> m15132o() {
        ArrayList<ExternalPlayerModelClass> arrayList = new ArrayList<>();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f16619c = readableDatabase;
            Cursor rawQuery = readableDatabase.rawQuery("SELECT  * FROM table_external_player ", null);
            if (rawQuery.moveToFirst()) {
                do {
                    ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
                    externalPlayerModelClass.m15419e(rawQuery.getInt(0));
                    externalPlayerModelClass.m15418d(rawQuery.getString(1));
                    externalPlayerModelClass.m15420f(rawQuery.getString(2));
                    externalPlayerModelClass.m15417c(rawQuery.getString(3));
                    arrayList.add(externalPlayerModelClass);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
        }
        return arrayList;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(this.f16620d);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    /* renamed from: p */
    public int m15133p(String str) {
        int i10 = 0;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.f16619c = writableDatabase;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("appname='");
            sb2.append(str);
            sb2.append("' ");
            int delete = writableDatabase.delete("table_external_player", sb2.toString(), null);
            i10 = delete;
            this.f16619c.close();
            i10 = delete;
        } catch (SQLiteDatabaseLockedException | SQLiteException e10) {
        }
        return i10;
    }
}
