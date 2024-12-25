package com.maxdigitall.maxdigitaliptvbox.model.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/database/PlayerResumeDBHandler.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/database/PlayerResumeDBHandler.class */
public class PlayerResumeDBHandler extends SQLiteOpenHelper {

    /* renamed from: b */
    public Context f16677b;

    /* renamed from: c */
    public String f16678c;

    public PlayerResumeDBHandler(Context context) {
        super(context, "iptv_smarters_tv_box_resume_player.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f16678c = "CREATE TABLE IF NOT EXISTS iptv_resume_player(id INTEGER PRIMARY KEY,type TEXT,streamID TEXT,stream_finish TEXT,stream_time_elapsed TEXT,stream_duration TEXT)";
        this.f16677b = context;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(this.f16678c);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
