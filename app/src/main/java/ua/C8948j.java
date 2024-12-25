package ua;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Marker;
import p305ra.C8130ea;
import p305ra.C8286p1;
import p305ra.C8301q1;
import p305ra.C8341sb;
import p305ra.C8406x1;
import p305ra.C8421y1;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/j.class
 */
/* renamed from: ua.j */
/* loaded from: combined.jar:classes2.jar:ua/j.class */
public final class C8948j extends AbstractC9030p9 {

    /* renamed from: f */
    public static final String[] f41194f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g */
    public static final String[] f41195g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h */
    public static final String[] f41196h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};

    /* renamed from: i */
    public static final String[] f41197i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j */
    public static final String[] f41198j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k */
    public static final String[] f41199k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l */
    public static final String[] f41200l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m */
    public static final String[] f41201m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d */
    public final C8936i f41202d;

    /* renamed from: e */
    public final C8982l9 f41203e;

    public C8948j(C9123x9 c9123x9) {
        super(c9123x9);
        this.f41203e = new C8982l9(this.f41723a.mo37778a());
        this.f41723a.m37797z();
        this.f41202d = new C8936i(this, this.f41723a.mo37779b(), "google_app_measurement.db");
    }

    /* renamed from: H */
    public static final void m38048H(ContentValues contentValues, String str, Object obj) {
        C9935o.m41846f("value");
        C9935o.m41850j(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: G */
    public final void m38052G(String str, long j10, long j11, C9112w9 c9112w9) {
        Cursor cursor;
        Cursor cursor2;
        String str2;
        String[] strArr;
        String str3;
        String str4;
        Cursor cursor3;
        String str5;
        String[] strArr2;
        C9935o.m41850j(c9112w9);
        mo37811h();
        m38183j();
        try {
            try {
                SQLiteDatabase m38058N = m38058N();
                try {
                    if (TextUtils.isEmpty(null)) {
                        String[] strArr3 = j11 != -1 ? new String[]{String.valueOf(j11), String.valueOf(j10)} : new String[]{String.valueOf(j10)};
                        str3 = j11 != -1 ? "rowid <= ? and " : "";
                        StringBuilder sb2 = new StringBuilder(str3.length() + 148);
                        sb2.append("select app_id, metadata_fingerprint from raw_events where ");
                        sb2.append(str3);
                        sb2.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                        Cursor rawQuery = m38058N.rawQuery(sb2.toString(), strArr3);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        }
                        str2 = rawQuery.getString(0);
                        String string = rawQuery.getString(1);
                        rawQuery.close();
                        cursor3 = rawQuery;
                        str4 = string;
                    } else {
                        if (j11 != -1) {
                            strArr = new String[2];
                            strArr[0] = null;
                            strArr[1] = String.valueOf(j11);
                        } else {
                            strArr = new String[]{null};
                        }
                        str3 = j11 != -1 ? " and rowid <= ?" : "";
                        StringBuilder sb3 = new StringBuilder(str3.length() + 84);
                        sb3.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb3.append(str3);
                        sb3.append(" order by rowid limit 1;");
                        Cursor rawQuery2 = m38058N.rawQuery(sb3.toString(), strArr);
                        if (!rawQuery2.moveToFirst()) {
                            rawQuery2.close();
                            return;
                        }
                        String string2 = rawQuery2.getString(0);
                        rawQuery2.close();
                        str4 = string2;
                        cursor3 = rawQuery2;
                        str2 = null;
                    }
                    try {
                        Cursor query = m38058N.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str2, str4}, null, null, "rowid", "2");
                        try {
                            if (!query.moveToFirst()) {
                                this.f41723a.mo37780c().m38408o().m38327b("Raw event metadata record is missing. appId", C9128y3.m38407x(str2));
                                query.close();
                                return;
                            }
                            try {
                                try {
                                    C8421y1 m35445l = ((C8406x1) C9145z9.m38445I(C8421y1.m36100K0(), query.getBlob(0))).m35445l();
                                    if (query.moveToNext()) {
                                        this.f41723a.mo37780c().m38411r().m38327b("Get multiple raw event metadata records, expected one. appId", C9128y3.m38407x(str2));
                                    }
                                    query.close();
                                    C9935o.m41850j(m35445l);
                                    c9112w9.f41734a = m35445l;
                                    if (j11 != -1) {
                                        str5 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr2 = new String[]{str2, str4, String.valueOf(j11)};
                                    } else {
                                        str5 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr2 = new String[]{str2, str4};
                                    }
                                    Cursor query2 = m38058N.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str5, strArr2, null, null, "rowid", null);
                                    String str6 = str2;
                                    if (!query2.moveToFirst()) {
                                        this.f41723a.mo37780c().m38411r().m38327b("Raw event data disappeared while in transaction. appId", C9128y3.m38407x(str2));
                                        query2.close();
                                        return;
                                    }
                                    do {
                                        String str7 = str2;
                                        long j12 = query2.getLong(0);
                                        String str8 = str2;
                                        byte[] blob = query2.getBlob(3);
                                        String str9 = str2;
                                        try {
                                            C8286p1 c8286p1 = (C8286p1) C9145z9.m38445I(C8301q1.m35691K(), blob);
                                            String str10 = str2;
                                            c8286p1.m35671I(query2.getString(1));
                                            String str11 = str2;
                                            c8286p1.m35674L(query2.getLong(2));
                                            String str12 = str2;
                                            if (!c9112w9.m38332a(j12, c8286p1.m35445l())) {
                                                query2.close();
                                                return;
                                            }
                                        } catch (IOException e10) {
                                            this.f41723a.mo37780c().m38408o().m38328c("Data loss. Failed to merge raw event. appId", C9128y3.m38407x(str2), e10);
                                        }
                                        String str13 = str2;
                                    } while (query2.moveToNext());
                                    query2.close();
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    cursor2 = query;
                                    this.f41723a.mo37780c().m38408o().m38328c("Data loss. Error selecting raw event. appId", C9128y3.m38407x(str2), e);
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor = query;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            } catch (IOException e12) {
                                this.f41723a.mo37780c().m38408o().m38328c("Data loss. Failed to merge raw event metadata. appId", C9128y3.m38407x(str2), e12);
                                query.close();
                            }
                        } catch (SQLiteException e13) {
                            e = e13;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (SQLiteException e14) {
                        e = e14;
                        cursor2 = cursor3;
                    } catch (Throwable th4) {
                        cursor = cursor3;
                        th = th4;
                    }
                } catch (SQLiteException e15) {
                    e = e15;
                    str2 = null;
                    cursor2 = null;
                }
            } catch (SQLiteException e16) {
                e = e16;
                cursor2 = null;
                str2 = null;
            } catch (Throwable th5) {
                th = th5;
                cursor = null;
            }
        } catch (Throwable th6) {
            cursor = str;
            th = th6;
        }
    }

    /* renamed from: I */
    public final long m38053I(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = m38058N().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = rawQuery.getLong(0);
                rawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                this.f41723a.mo37780c().m38408o().m38328c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* renamed from: J */
    public final long m38054J(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        Cursor cursor2 = null;
        try {
            try {
                Cursor rawQuery = m38058N().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    rawQuery.close();
                    return j10;
                }
                cursor2 = rawQuery;
                cursor = rawQuery;
                long j11 = rawQuery.getLong(0);
                rawQuery.close();
                return j11;
            } catch (SQLiteException e10) {
                this.f41723a.mo37780c().m38408o().m38328c("Database error", str, e10);
                Cursor cursor3 = cursor;
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th2;
        }
    }

    /* renamed from: K */
    public final void m38055K() {
        m38183j();
        m38058N().beginTransaction();
    }

    /* renamed from: L */
    public final void m38056L() {
        m38183j();
        m38058N().setTransactionSuccessful();
    }

    /* renamed from: M */
    public final void m38057M() {
        m38183j();
        m38058N().endTransaction();
    }

    /* renamed from: N */
    public final SQLiteDatabase m38058N() {
        mo37811h();
        try {
            return this.f41202d.getWritableDatabase();
        } catch (SQLiteException e10) {
            this.f41723a.mo37780c().m38411r().m38327b("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0224  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ua.C9020p m38059O(java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C8948j.m38059O(java.lang.String, java.lang.String):ua.p");
    }

    /* renamed from: P */
    public final void m38060P(C9020p c9020p) {
        C9935o.m41850j(c9020p);
        mo37811h();
        m38183j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c9020p.f41521a);
        contentValues.put("name", c9020p.f41522b);
        contentValues.put("lifetime_count", Long.valueOf(c9020p.f41523c));
        contentValues.put("current_bundle_count", Long.valueOf(c9020p.f41524d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c9020p.f41526f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c9020p.f41527g));
        contentValues.put("last_bundled_day", c9020p.f41528h);
        contentValues.put("last_sampled_complex_event_id", c9020p.f41529i);
        contentValues.put("last_sampling_rate", c9020p.f41530j);
        contentValues.put("current_session_count", Long.valueOf(c9020p.f41525e));
        Boolean bool = c9020p.f41531k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m38058N().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.f41723a.mo37780c().m38408o().m38327b("Failed to insert/update event aggregates (got -1). appId", C9128y3.m38407x(c9020p.f41521a));
            }
        } catch (SQLiteException e10) {
            this.f41723a.mo37780c().m38408o().m38328c("Error storing event aggregates. appId", C9128y3.m38407x(c9020p.f41521a), e10);
        }
    }

    /* renamed from: Q */
    public final void m38061Q(String str, String str2) {
        C9935o.m41846f(str);
        C9935o.m41846f(str2);
        mo37811h();
        m38183j();
        try {
            m38058N().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.f41723a.mo37780c().m38408o().m38329d("Error deleting user property. appId", C9128y3.m38407x(str), this.f41723a.m37766H().m38233r(str2), e10);
        }
    }

    /* renamed from: R */
    public final boolean m38062R(C8875ca c8875ca) {
        C9935o.m41850j(c8875ca);
        mo37811h();
        m38183j();
        if (m38063S(c8875ca.f41002a, c8875ca.f41004c) == null) {
            if (C8899ea.m37827i0(c8875ca.f41004c)) {
                long m38053I = m38053I("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{c8875ca.f41002a});
                C8900f m37797z = this.f41723a.m37797z();
                String str = c8875ca.f41002a;
                C8130ea.m35325a();
                int i10 = 25;
                if (m37797z.m37900w(null, C8988m3.f41398x0)) {
                    i10 = m37797z.m37898u(str, C8988m3.f41324H, 25, 100);
                }
                if (m38053I >= i10) {
                    return false;
                }
            } else if (!"_npa".equals(c8875ca.f41004c)) {
                long m38053I2 = m38053I("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{c8875ca.f41002a, c8875ca.f41003b});
                this.f41723a.m37797z();
                if (m38053I2 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c8875ca.f41002a);
        contentValues.put("origin", c8875ca.f41003b);
        contentValues.put("name", c8875ca.f41004c);
        contentValues.put("set_timestamp", Long.valueOf(c8875ca.f41005d));
        m38048H(contentValues, "value", c8875ca.f41006e);
        try {
            if (m38058N().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.f41723a.mo37780c().m38408o().m38327b("Failed to insert/update user property (got -1). appId", C9128y3.m38407x(c8875ca.f41002a));
            return true;
        } catch (SQLiteException e10) {
            this.f41723a.mo37780c().m38408o().m38328c("Error storing user property. appId", C9128y3.m38407x(c8875ca.f41002a), e10);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ua.C8875ca m38063S(java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C8948j.m38063S(java.lang.String, java.lang.String):ua.ca");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x018d  */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<ua.C8875ca> m38064T(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C8948j.m38064T(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0127, code lost:
    
        r0 = r10.f41723a.mo37780c().m38408o();
        r0 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0139, code lost:
    
        r10.f41723a.m37797z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0143, code lost:
    
        r18 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0148, code lost:
    
        r0.m38327b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0280  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<ua.C8875ca> m38065U(java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C8948j.m38065U(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: V */
    public final boolean m38066V(C8852b c8852b) {
        C9935o.m41850j(c8852b);
        mo37811h();
        m38183j();
        if (m38063S(c8852b.f40912d, c8852b.f40914f.f40906e) == null) {
            long m38053I = m38053I("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{c8852b.f40912d});
            this.f41723a.m37797z();
            if (m38053I >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c8852b.f40912d);
        contentValues.put("origin", c8852b.f40913e);
        contentValues.put("name", c8852b.f40914f.f40906e);
        m38048H(contentValues, "value", c8852b.f40914f.m37750P());
        contentValues.put("active", Boolean.valueOf(c8852b.f40916h));
        contentValues.put("trigger_event_name", c8852b.f40917i);
        contentValues.put("trigger_timeout", Long.valueOf(c8852b.f40919k));
        contentValues.put("timed_out_event", this.f41723a.m37765G().m37834L(c8852b.f40918j));
        contentValues.put("creation_timestamp", Long.valueOf(c8852b.f40915g));
        contentValues.put("triggered_event", this.f41723a.m37765G().m37834L(c8852b.f40920l));
        contentValues.put("triggered_timestamp", Long.valueOf(c8852b.f40914f.f40907f));
        contentValues.put("time_to_live", Long.valueOf(c8852b.f40921m));
        contentValues.put("expired_event", this.f41723a.m37765G().m37834L(c8852b.f40922n));
        try {
            if (m38058N().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            this.f41723a.mo37780c().m38408o().m38327b("Failed to insert/update conditional user property (got -1)", C9128y3.m38407x(c8852b.f40912d));
            return true;
        } catch (SQLiteException e10) {
            this.f41723a.mo37780c().m38408o().m38328c("Error storing conditional user property", C9128y3.m38407x(c8852b.f40912d), e10);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0248  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ua.C8852b m38067W(java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C8948j.m38067W(java.lang.String, java.lang.String):ua.b");
    }

    /* renamed from: X */
    public final int m38068X(String str, String str2) {
        C9935o.m41846f(str);
        C9935o.m41846f(str2);
        mo37811h();
        m38183j();
        try {
            return m38058N().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.f41723a.mo37780c().m38408o().m38329d("Error deleting conditional property", C9128y3.m38407x(str), this.f41723a.m37766H().m38233r(str2), e10);
            return 0;
        }
    }

    /* renamed from: Y */
    public final List<C8852b> m38069Y(String str, String str2, String str3) {
        C9935o.m41846f(str);
        mo37811h();
        m38183j();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(Marker.ANY_MARKER));
            sb2.append(" and name glob ?");
        }
        return m38070Z(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e0, code lost:
    
        r0 = r16.f41723a.mo37780c().m38408o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f1, code lost:
    
        r16.f41723a.m37797z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00fa, code lost:
    
        r29 = r0;
        r30 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ff, code lost:
    
        r0.m38327b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<ua.C8852b> m38070Z(java.lang.String r17, java.lang.String[] r18) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C8948j.m38070Z(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0338  */
    /* renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ua.C8918g5 m38071a0(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C8948j.m38071a0(java.lang.String):ua.g5");
    }

    /* renamed from: b0 */
    public final void m38072b0(C8918g5 c8918g5) {
        C9935o.m41850j(c8918g5);
        mo37811h();
        m38183j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c8918g5.m37984N());
        contentValues.put("app_instance_id", c8918g5.m37985O());
        contentValues.put("gmp_app_id", c8918g5.m37987Q());
        contentValues.put("resettable_device_id_hash", c8918g5.m37993W());
        contentValues.put("last_bundle_index", Long.valueOf(c8918g5.m38013i()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c8918g5.m37998a0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c8918g5.m38002c0()));
        contentValues.put("app_version", c8918g5.m38006e0());
        contentValues.put("app_store", c8918g5.m38014i0());
        contentValues.put("gmp_version", Long.valueOf(c8918g5.m38018k0()));
        contentValues.put("dev_cert_hash", Long.valueOf(c8918g5.m37999b()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c8918g5.m38007f()));
        contentValues.put("day", Long.valueOf(c8918g5.m38022o()));
        contentValues.put("daily_public_events_count", Long.valueOf(c8918g5.m38024q()));
        contentValues.put("daily_events_count", Long.valueOf(c8918g5.m38026s()));
        contentValues.put("daily_conversions_count", Long.valueOf(c8918g5.m38028u()));
        contentValues.put("config_fetched_time", Long.valueOf(c8918g5.m38015j()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(c8918g5.m38019l()));
        contentValues.put("app_version_int", Long.valueOf(c8918g5.m38010g0()));
        contentValues.put("firebase_instance_id", c8918g5.m37995Y());
        contentValues.put("daily_error_events_count", Long.valueOf(c8918g5.m38032y()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(c8918g5.m38030w()));
        contentValues.put("health_monitor_sample", c8918g5.m37972B());
        contentValues.put("android_id", Long.valueOf(c8918g5.m37975E()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c8918g5.m37977G()));
        contentValues.put("admob_app_id", c8918g5.m37989S());
        contentValues.put("dynamite_version", Long.valueOf(c8918g5.m38003d()));
        if (c8918g5.m37981K() != null) {
            if (c8918g5.m37981K().size() == 0) {
                this.f41723a.mo37780c().m38411r().m38327b("Safelisted events should not be an empty list. appId", c8918g5.m37984N());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", c8918g5.m37981K()));
            }
        }
        C8341sb.m35785a();
        if (this.f41723a.m37797z().m37900w(c8918g5.m37984N(), C8988m3.f41370j0)) {
            contentValues.put("ga_app_id", c8918g5.m37991U());
        }
        try {
            SQLiteDatabase m38058N = m38058N();
            if (m38058N.update("apps", contentValues, "app_id = ?", new String[]{c8918g5.m37984N()}) == 0 && m38058N.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.f41723a.mo37780c().m38408o().m38327b("Failed to insert/update app (got -1). appId", C9128y3.m38407x(c8918g5.m37984N()));
            }
        } catch (SQLiteException e10) {
            this.f41723a.mo37780c().m38408o().m38328c("Error storing app. appId", C9128y3.m38407x(c8918g5.m37984N()), e10);
        }
    }

    /* renamed from: c0 */
    public final C8924h m38073c0(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return m38074d0(j10, str, 1L, false, false, z12, false, z14);
    }

    /* renamed from: d0 */
    public final C8924h m38074d0(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        C9935o.m41846f(str);
        mo37811h();
        m38183j();
        C8924h c8924h = new C8924h();
        Cursor cursor = null;
        Cursor cursor2 = null;
        try {
            try {
                SQLiteDatabase m38058N = m38058N();
                Cursor query = m38058N.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    this.f41723a.mo37780c().m38411r().m38327b("Not updating daily counts, app is not known. appId", C9128y3.m38407x(str));
                    query.close();
                    return c8924h;
                }
                if (query.getLong(0) == j10) {
                    c8924h.f41141b = query.getLong(1);
                    c8924h.f41140a = query.getLong(2);
                    c8924h.f41142c = query.getLong(3);
                    c8924h.f41143d = query.getLong(4);
                    c8924h.f41144e = query.getLong(5);
                }
                if (z10) {
                    c8924h.f41141b += j11;
                }
                if (z11) {
                    c8924h.f41140a += j11;
                }
                if (z12) {
                    c8924h.f41142c += j11;
                }
                if (z13) {
                    c8924h.f41143d += j11;
                }
                if (z14) {
                    c8924h.f41144e += j11;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j10));
                contentValues.put("daily_public_events_count", Long.valueOf(c8924h.f41140a));
                contentValues.put("daily_events_count", Long.valueOf(c8924h.f41141b));
                contentValues.put("daily_conversions_count", Long.valueOf(c8924h.f41142c));
                contentValues.put("daily_error_events_count", Long.valueOf(c8924h.f41143d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c8924h.f41144e));
                m38058N.update("apps", contentValues, "app_id=?", new String[]{str});
                query.close();
                return c8924h;
            } catch (SQLiteException e10) {
                this.f41723a.mo37780c().m38408o().m38328c("Error updating daily counts. appId", C9128y3.m38407x(str), e10);
                if (0 != 0) {
                    cursor.close();
                }
                return c8924h;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor2.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m38075e0() {
        /*
            r4 = this;
            r0 = r4
            android.database.sqlite.SQLiteDatabase r0 = r0.m38058N()
            r5 = r0
            r0 = 0
            r7 = r0
            r0 = r5
            java.lang.String r1 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            r2 = 0
            android.database.Cursor r0 = r0.rawQuery(r1, r2)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3d
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            boolean r0 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L35 java.lang.Throwable -> L5f
            if (r0 == 0) goto L2d
            r0 = r6
            r5 = r0
            r0 = r6
            r1 = 0
            java.lang.String r0 = r0.getString(r1)     // Catch: android.database.sqlite.SQLiteException -> L35 java.lang.Throwable -> L5f
            r7 = r0
            r0 = r6
            r0.close()
            r0 = r7
            return r0
        L2d:
            r0 = r6
            r0.close()
            r0 = 0
            return r0
        L35:
            r7 = move-exception
            goto L40
        L39:
            r5 = move-exception
            goto L64
        L3d:
            r7 = move-exception
            r0 = 0
            r6 = r0
        L40:
            r0 = r6
            r5 = r0
            r0 = r4
            ua.c5 r0 = r0.f41723a     // Catch: java.lang.Throwable -> L5f
            ua.y3 r0 = r0.mo37780c()     // Catch: java.lang.Throwable -> L5f
            ua.w3 r0 = r0.m38408o()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = "Database error getting next bundle app id"
            r2 = r7
            r0.m38327b(r1, r2)     // Catch: java.lang.Throwable -> L5f
            r0 = r6
            if (r0 == 0) goto L5d
            r0 = r6
            r0.close()
        L5d:
            r0 = 0
            return r0
        L5f:
            r6 = move-exception
            r0 = r5
            r7 = r0
            r0 = r6
            r5 = r0
        L64:
            r0 = r7
            if (r0 == 0) goto L6e
            r0 = r7
            r0.close()
        L6e:
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C8948j.m38075e0():java.lang.String");
    }

    /* renamed from: f0 */
    public final boolean m38076f0() {
        return m38053I("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    /* renamed from: g0 */
    public final void m38077g0() {
        mo37811h();
        m38183j();
        if (m38089w()) {
            long m38109a = this.f41723a.m37759A().f41485h.m38109a();
            long mo22433b = this.f41723a.mo37778a().mo22433b();
            long abs = Math.abs(mo22433b - m38109a);
            this.f41723a.m37797z();
            if (abs > C8988m3.f41401z.m38108b(null).longValue()) {
                this.f41723a.m37759A().f41485h.m38110b(mo22433b);
                mo37811h();
                m38183j();
                if (m38089w()) {
                    SQLiteDatabase m38058N = m38058N();
                    long mo22432a = this.f41723a.mo37778a().mo22432a();
                    this.f41723a.m37797z();
                    int delete = m38058N.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(mo22432a), String.valueOf(C8900f.m37878i())});
                    if (delete > 0) {
                        this.f41723a.mo37780c().m38416w().m38327b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    /* renamed from: h0 */
    public final void m38078h0(List<Long> list) {
        mo37811h();
        m38183j();
        C9935o.m41850j(list);
        C9935o.m41852l(list.size());
        if (m38089w()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb2 = new StringBuilder(String.valueOf(join).length() + 2);
            sb2.append("(");
            sb2.append(join);
            sb2.append(")");
            String sb3 = sb2.toString();
            StringBuilder sb4 = new StringBuilder(String.valueOf(sb3).length() + 80);
            sb4.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb4.append(sb3);
            sb4.append(" AND retry_count =  ");
            sb4.append(Integer.MAX_VALUE);
            sb4.append(" LIMIT 1");
            if (m38053I(sb4.toString(), null) > 0) {
                this.f41723a.mo37780c().m38411r().m38326a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase m38058N = m38058N();
                StringBuilder sb5 = new StringBuilder(String.valueOf(sb3).length() + 127);
                sb5.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb5.append(sb3);
                sb5.append(" AND (retry_count IS NULL OR retry_count < ");
                sb5.append(Integer.MAX_VALUE);
                sb5.append(")");
                m38058N.execSQL(sb5.toString());
            } catch (SQLiteException e10) {
                this.f41723a.mo37780c().m38408o().m38327b("Error incrementing retry count. error", e10);
            }
        }
    }

    @Override // ua.AbstractC9030p9
    /* renamed from: l */
    public final boolean mo37812l() {
        return false;
    }

    /* renamed from: m */
    public final Object m38079m(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            this.f41723a.mo37780c().m38408o().m38326a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            this.f41723a.mo37780c().m38408o().m38327b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.f41723a.mo37780c().m38408o().m38326a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* renamed from: n */
    public final long m38080n() {
        return m38054J("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* renamed from: o */
    public final long m38081o(String str, String str2) {
        long j10;
        ContentValues contentValues;
        C9935o.m41846f(str);
        C9935o.m41846f("first_open_count");
        mo37811h();
        m38183j();
        SQLiteDatabase m38058N = m38058N();
        m38058N.beginTransaction();
        try {
            try {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("select ");
                sb2.append("first_open_count");
                sb2.append(" from app2 where app_id=?");
                long m38054J = m38054J(sb2.toString(), new String[]{str}, -1L);
                j10 = m38054J;
                if (m38054J == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (m38058N.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        this.f41723a.mo37780c().m38408o().m38328c("Failed to insert column (got -1). appId", C9128y3.m38407x(str), "first_open_count");
                        m38058N.endTransaction();
                        return -1L;
                    }
                    j10 = 0;
                }
            } finally {
                m38058N.endTransaction();
            }
        } catch (SQLiteException e10) {
            e = e10;
            j10 = 0;
        }
        try {
            contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("first_open_count", Long.valueOf(1 + j10));
        } catch (SQLiteException e11) {
            e = e11;
            this.f41723a.mo37780c().m38408o().m38329d("Error inserting column. appId", C9128y3.m38407x(str), "first_open_count", e);
            return j10;
        }
        if (m38058N.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
            this.f41723a.mo37780c().m38408o().m38328c("Failed to update column (got 0). appId", C9128y3.m38407x(str), "first_open_count");
            m38058N.endTransaction();
            return -1L;
        }
        m38058N.setTransactionSuccessful();
        m38058N.endTransaction();
        return j10;
    }

    /* renamed from: p */
    public final long m38082p() {
        return m38054J("select max(timestamp) from raw_events", null, 0L);
    }

    /* renamed from: q */
    public final boolean m38083q() {
        return m38053I("select count(1) > 0 from raw_events", null) != 0;
    }

    /* renamed from: r */
    public final boolean m38084r() {
        return m38053I("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* renamed from: s */
    public final long m38085s(String str) {
        C9935o.m41846f(str);
        return m38054J("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* renamed from: t */
    public final boolean m38086t(String str, Long l10, long j10, C8301q1 c8301q1) {
        mo37811h();
        m38183j();
        C9935o.m41850j(c8301q1);
        C9935o.m41846f(str);
        C9935o.m41850j(l10);
        byte[] m35811f = c8301q1.m35811f();
        this.f41723a.mo37780c().m38416w().m38328c("Saving complex main event, appId, data size", this.f41723a.m37766H().m38231p(str), Integer.valueOf(m35811f.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", m35811f);
        try {
            if (m38058N().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            this.f41723a.mo37780c().m38408o().m38327b("Failed to insert complex main event (got -1). appId", C9128y3.m38407x(str));
            return false;
        } catch (SQLiteException e10) {
            this.f41723a.mo37780c().m38408o().m38328c("Error storing complex main event. appId", C9128y3.m38407x(str), e10);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0174  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle m38087u(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C8948j.m38087u(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03b0, code lost:
    
        if (r0.m35486K() == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03b3, code lost:
    
        r21 = java.lang.Boolean.valueOf(r0.m35487L());
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03c3, code lost:
    
        r0.put("session_scoped", r21);
        r0.put("data", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03e8, code lost:
    
        if (m38058N().insertWithOnConflict("event_filters", null, r0, 5) != (-1)) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03eb, code lost:
    
        r8.f41723a.mo37780c().m38408o().m38327b("Failed to insert event filter (got -1). appId", ua.C9128y3.m38407x(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0402, code lost:
    
        r22 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0404, code lost:
    
        r23 = r8.f41723a.mo37780c().m38408o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0413, code lost:
    
        r24 = "Error storing event filter. appId";
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0415, code lost:
    
        r21 = ua.C9128y3.m38407x(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x041d, code lost:
    
        r23.m38328c(r24, r21, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0574, code lost:
    
        m38183j();
        mo37811h();
        p422y9.C9935o.m41846f(r9);
        r0 = m38058N();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r9, java.lang.String.valueOf(r0)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r9, java.lang.String.valueOf(r0)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03c0, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0391, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0316, code lost:
    
        r0 = r8.f41723a.mo37780c().m38411r();
        r0 = ua.C9128y3.m38407x(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x032d, code lost:
    
        if (r0.m35488z() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0330, code lost:
    
        r21 = java.lang.Integer.valueOf(r0.m35477A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0340, code lost:
    
        r0.m38329d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r0, java.lang.Integer.valueOf(r0), java.lang.String.valueOf(r21));
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x033d, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0429, code lost:
    
        r0 = r0.m35398C().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x043c, code lost:
    
        if (r0.hasNext() == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x043f, code lost:
    
        r0 = r0.next();
        m38183j();
        mo37811h();
        p422y9.C9935o.m41846f(r9);
        p422y9.C9935o.m41850j(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0466, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.m35792C()) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x04a9, code lost:
    
        r0 = r0.m35811f();
        r0 = new android.content.ContentValues();
        r0.put("app_id", r9);
        r0.put("audience_id", java.lang.Integer.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x04d4, code lost:
    
        if (r0.m35798z() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x04d7, code lost:
    
        r22 = java.lang.Integer.valueOf(r0.m35791A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x04e7, code lost:
    
        r0.put("filter_id", r22);
        r0.put("property_name", r0.m35792C());
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0503, code lost:
    
        if (r0.m35796G() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0506, code lost:
    
        r22 = java.lang.Boolean.valueOf(r0.m35797H());
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0516, code lost:
    
        r0.put("session_scoped", r22);
        r0.put("data", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x053b, code lost:
    
        if (m38058N().insertWithOnConflict("property_filters", null, r0, 5) != (-1)) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x053e, code lost:
    
        r8.f41723a.mo37780c().m38408o().m38327b("Failed to insert property filter (got -1). appId", ua.C9128y3.m38407x(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0558, code lost:
    
        r22 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x055a, code lost:
    
        r23 = r8.f41723a.mo37780c().m38408o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0569, code lost:
    
        r24 = "Error storing property filter. appId";
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x056b, code lost:
    
        r21 = ua.C9128y3.m38407x(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0513, code lost:
    
        r22 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x04e4, code lost:
    
        r22 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0469, code lost:
    
        r0 = r8.f41723a.mo37780c().m38411r();
        r0 = ua.C9128y3.m38407x(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0480, code lost:
    
        if (r0.m35798z() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0483, code lost:
    
        r21 = java.lang.Integer.valueOf(r0.m35791A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0493, code lost:
    
        r0.m38329d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r0, java.lang.Integer.valueOf(r0), java.lang.String.valueOf(r21));
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0490, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x028c, code lost:
    
        r0 = r0.m35398C().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x029f, code lost:
    
        if (r0.hasNext() == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02af, code lost:
    
        if (r0.next().m35798z() != false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02b2, code lost:
    
        r23 = r8.f41723a.mo37780c().m38411r();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02c1, code lost:
    
        r22 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02c3, code lost:
    
        r24 = ua.C9128y3.m38407x(r9);
        r21 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02d2, code lost:
    
        r0 = r0.m35401F().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02e9, code lost:
    
        if (r0.hasNext() == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02ec, code lost:
    
        r0 = r0.next();
        m38183j();
        mo37811h();
        p422y9.C9935o.m41846f(r9);
        p422y9.C9935o.m41850j(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0313, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.m35478C()) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0356, code lost:
    
        r0 = r0.m35811f();
        r0 = new android.content.ContentValues();
        r0.put("app_id", r9);
        r0.put("audience_id", java.lang.Integer.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0381, code lost:
    
        if (r0.m35488z() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0384, code lost:
    
        r21 = java.lang.Integer.valueOf(r0.m35477A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0394, code lost:
    
        r0.put("filter_id", r21);
        r0.put("event_name", r0.m35478C());
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m38088v(java.lang.String r9, java.util.List<p305ra.C8165h0> r10) {
        /*
            Method dump skipped, instructions count: 1872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C8948j.m38088v(java.lang.String, java.util.List):void");
    }

    /* renamed from: w */
    public final boolean m38089w() {
        Context mo37779b = this.f41723a.mo37779b();
        this.f41723a.m37797z();
        return mo37779b.getDatabasePath("google_app_measurement.db").exists();
    }
}
