package ua;

import android.content.Context;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/s3.class
 */
/* renamed from: ua.s3 */
/* loaded from: combined.jar:classes2.jar:ua/s3.class */
public final class C9060s3 extends AbstractC8905f4 {

    /* renamed from: c */
    public final C9048r3 f41609c;

    /* renamed from: d */
    public boolean f41610d;

    public C9060s3(C8870c5 c8870c5) {
        super(c8870c5);
        Context mo37779b = this.f41723a.mo37779b();
        this.f41723a.m37797z();
        this.f41609c = new C9048r3(this, mo37779b, "google_app_measurement_local.db");
    }

    @Override // ua.AbstractC8905f4
    /* renamed from: m */
    public final boolean mo37908m() {
        return false;
    }

    /* renamed from: o */
    public final void m38216o() {
        int delete;
        mo37811h();
        try {
            SQLiteDatabase m38223v = m38223v();
            if (m38223v == null || (delete = m38223v.delete("messages", null, null)) <= 0) {
                return;
            }
            this.f41723a.mo37780c().m38416w().m38327b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e10) {
            this.f41723a.mo37780c().m38408o().m38327b("Error resetting local analytics data. error", e10);
        }
    }

    /* renamed from: p */
    public final boolean m38217p(C9068t c9068t) {
        Parcel obtain = Parcel.obtain();
        C9080u.m38243a(c9068t, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m38225x(0, marshall);
        }
        this.f41723a.mo37780c().m38409p().m38326a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    /* renamed from: q */
    public final boolean m38218q(C8851aa c8851aa) {
        Parcel obtain = Parcel.obtain();
        C8863ba.m37752a(c8851aa, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m38225x(1, marshall);
        }
        this.f41723a.mo37780c().m38409p().m38326a("User property too long for local database. Sending directly to service");
        return false;
    }

    /* renamed from: r */
    public final boolean m38219r(C8852b c8852b) {
        byte[] m37834L = this.f41723a.m37765G().m37834L(c8852b);
        if (m37834L.length <= 131072) {
            return m38225x(2, m37834L);
        }
        this.f41723a.mo37780c().m38409p().m38326a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0480 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0480 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0480 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v182, types: [ua.aa] */
    /* JADX WARN: Type inference failed for: r0v200, types: [ua.b] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<p441z9.AbstractC10125a> m38220s(int r11) {
        /*
            Method dump skipped, instructions count: 1230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C9060s3.m38220s(int):java.util.List");
    }

    /* renamed from: t */
    public final boolean m38221t() {
        return m38225x(3, new byte[0]);
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: u */
    public final boolean m38222u() {
        int i10;
        mo37811h();
        if (this.f41610d || !m38224w()) {
            return false;
        }
        int i11 = 0;
        int i12 = 5;
        while (true) {
            int i13 = i12;
            if (i11 >= 5) {
                this.f41723a.mo37780c().m38411r().m38326a("Error deleting app launch break from local database in reasonable time");
                return false;
            }
            SQLiteDatabase sQLiteDatabase = null;
            SQLiteClosable sQLiteClosable = null;
            try {
                try {
                    SQLiteDatabase m38223v = m38223v();
                    if (m38223v == null) {
                        this.f41610d = true;
                        return false;
                    }
                    m38223v.beginTransaction();
                    m38223v.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    m38223v.setTransactionSuccessful();
                    m38223v.endTransaction();
                    m38223v.close();
                    return true;
                } catch (SQLiteDatabaseLockedException e10) {
                    SystemClock.sleep(i13);
                    int i14 = i13 + 20;
                    i10 = i14;
                    if (0 != 0) {
                        sQLiteDatabase = null;
                        i10 = i14;
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e11) {
                    this.f41723a.mo37780c().m38408o().m38327b("Error deleting app launch break from local database", e11);
                    this.f41610d = true;
                    i10 = i13;
                    if (0 != 0) {
                        i10 = i13;
                        sQLiteDatabase = null;
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteException e12) {
                if (0 != 0) {
                    sQLiteClosable = null;
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Throwable th2) {
                        if (sQLiteClosable != null) {
                            sQLiteClosable.close();
                        }
                        throw th2;
                    }
                }
                this.f41723a.mo37780c().m38408o().m38327b("Error deleting app launch break from local database", e12);
                this.f41610d = true;
                i10 = i13;
                if (0 != 0) {
                    i10 = i13;
                    sQLiteDatabase.close();
                }
            }
            i11++;
            i12 = i10;
        }
    }

    /* renamed from: v */
    public final SQLiteDatabase m38223v() {
        if (this.f41610d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f41609c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f41610d = true;
        return null;
    }

    /* renamed from: w */
    public final boolean m38224w() {
        Context mo37779b = this.f41723a.mo37779b();
        this.f41723a.m37797z();
        return mo37779b.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x027c  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m38225x(int r10, byte[] r11) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C9060s3.m38225x(int, byte[]):boolean");
    }
}
