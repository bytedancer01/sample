package p420y7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.amazonaws.mobileconnectors.appsync.AppSyncMutationsSqlHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.achartengine.ChartFactory;
import org.simpleframework.xml.strategy.Name;
import p059d9.C4349a;
import p059d9.C4401z0;
import p320s6.C8538a;
import p320s6.C8541d;
import p320s6.InterfaceC8539b;
import p420y7.C9874x;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y7/c.class
 */
/* renamed from: y7.c */
/* loaded from: combined.jar:classes2.jar:y7/c.class */
public final class C9845c implements InterfaceC9860j0 {

    /* renamed from: f */
    public static final String f45171f = m41382p(3, 4);

    /* renamed from: g */
    public static final String[] f45172g = {Name.MARK, AppSyncMutationsSqlHelper.COLUMN_MIME_TYPE, "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};

    /* renamed from: a */
    public final String f45173a;

    /* renamed from: b */
    public final String f45174b;

    /* renamed from: c */
    public final InterfaceC8539b f45175c;

    /* renamed from: d */
    public final Object f45176d;

    /* renamed from: e */
    public boolean f45177e;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y7/c$b.class
     */
    /* renamed from: y7.c$b */
    /* loaded from: combined.jar:classes2.jar:y7/c$b.class */
    public static final class b implements InterfaceC9853g {

        /* renamed from: b */
        public final Cursor f45178b;

        public b(Cursor cursor) {
            this.f45178b = cursor;
        }

        @Override // p420y7.InterfaceC9853g
        /* renamed from: Y */
        public C9849e mo41396Y() {
            return C9845c.m41380n(this.f45178b);
        }

        @Override // p420y7.InterfaceC9853g, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f45178b.close();
        }

        @Override // p420y7.InterfaceC9853g
        public int getPosition() {
            return this.f45178b.getPosition();
        }

        @Override // p420y7.InterfaceC9853g
        public /* synthetic */ boolean moveToNext() {
            return C9851f.m41405a(this);
        }

        @Override // p420y7.InterfaceC9853g
        public boolean moveToPosition(int i10) {
            return this.f45178b.moveToPosition(i10);
        }
    }

    public C9845c(InterfaceC8539b interfaceC8539b) {
        this(interfaceC8539b, "");
    }

    public C9845c(InterfaceC8539b interfaceC8539b, String str) {
        this.f45173a = str;
        this.f45175c = interfaceC8539b;
        this.f45174b = "ExoPlayerDownloads" + str;
        this.f45176d = new Object();
    }

    /* renamed from: j */
    public static List<C9858i0> m41378j(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        for (String str2 : C4401z0.m22356V0(str, ",")) {
            String[] m22356V0 = C4401z0.m22356V0(str2, "\\.");
            C4349a.m21884g(m22356V0.length == 3);
            arrayList.add(new C9858i0(Integer.parseInt(m22356V0[0]), Integer.parseInt(m22356V0[1]), Integer.parseInt(m22356V0[2])));
        }
        return arrayList;
    }

    /* renamed from: k */
    public static String m41379k(List<C9858i0> list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C9858i0 c9858i0 = list.get(i10);
            sb2.append(c9858i0.f45227b);
            sb2.append('.');
            sb2.append(c9858i0.f45228c);
            sb2.append('.');
            sb2.append(c9858i0.f45229d);
            sb2.append(',');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    /* renamed from: n */
    public static C9849e m41380n(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        C9874x.b m41544f = new C9874x.b((String) C4349a.m21882e(cursor.getString(0)), Uri.parse((String) C4349a.m21882e(cursor.getString(2)))).m41543e(cursor.getString(1)).m41544f(m41378j(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        C9874x m41539a = m41544f.m41542d(blob).m41540b(cursor.getString(4)).m41541c(cursor.getBlob(5)).m41539a();
        C9873w c9873w = new C9873w();
        c9873w.f45307a = cursor.getLong(13);
        c9873w.f45308b = cursor.getFloat(12);
        int i10 = cursor.getInt(6);
        return new C9849e(m41539a, i10, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i10 == 4 ? cursor.getInt(11) : 0, c9873w);
    }

    /* renamed from: o */
    public static C9849e m41381o(Cursor cursor) {
        C9874x m41539a = new C9874x.b((String) C4349a.m21882e(cursor.getString(0)), Uri.parse((String) C4349a.m21882e(cursor.getString(2)))).m41543e(m41383q(cursor.getString(1))).m41544f(m41378j(cursor.getString(3))).m41540b(cursor.getString(4)).m41541c(cursor.getBlob(5)).m41539a();
        C9873w c9873w = new C9873w();
        c9873w.f45307a = cursor.getLong(13);
        c9873w.f45308b = cursor.getFloat(12);
        int i10 = cursor.getInt(6);
        return new C9849e(m41539a, i10, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i10 == 4 ? cursor.getInt(11) : 0, c9873w);
    }

    /* renamed from: p */
    public static String m41382p(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("state");
        sb2.append(" IN (");
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (i10 > 0) {
                sb2.append(',');
            }
            sb2.append(iArr[i10]);
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* renamed from: q */
    public static String m41383q(String str) {
        return "dash".equals(str) ? "application/dash+xml" : "hls".equals(str) ? "application/x-mpegURL" : "ss".equals(str) ? "application/vnd.ms-sstr+xml" : "video/x-unknown";
    }

    @Override // p420y7.InterfaceC9860j0
    /* renamed from: a */
    public void mo41384a(C9849e c9849e) {
        m41392l();
        try {
            m41395s(c9849e, this.f45175c.getWritableDatabase());
        } catch (SQLiteException e10) {
            throw new C8538a(e10);
        }
    }

    @Override // p420y7.InterfaceC9860j0
    /* renamed from: b */
    public void mo41385b(String str, int i10) {
        m41392l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i10));
            this.f45175c.getWritableDatabase().update(this.f45174b, contentValues, f45171f + " AND id = ?", new String[]{str});
        } catch (SQLException e10) {
            throw new C8538a(e10);
        }
    }

    @Override // p420y7.InterfaceC9860j0
    /* renamed from: c */
    public void mo41386c(String str) {
        m41392l();
        try {
            this.f45175c.getWritableDatabase().delete(this.f45174b, "id = ?", new String[]{str});
        } catch (SQLiteException e10) {
            throw new C8538a(e10);
        }
    }

    @Override // p420y7.InterfaceC9860j0
    /* renamed from: d */
    public void mo41387d(int i10) {
        m41392l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i10));
            this.f45175c.getWritableDatabase().update(this.f45174b, contentValues, f45171f, null);
        } catch (SQLException e10) {
            throw new C8538a(e10);
        }
    }

    @Override // p420y7.InterfaceC9867q
    /* renamed from: e */
    public InterfaceC9853g mo41388e(int... iArr) {
        m41392l();
        return new b(m41393m(m41382p(iArr), null));
    }

    @Override // p420y7.InterfaceC9860j0
    /* renamed from: f */
    public void mo41389f() {
        m41392l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.f45175c.getWritableDatabase().update(this.f45174b, contentValues, null, null);
        } catch (SQLException e10) {
            throw new C8538a(e10);
        }
    }

    @Override // p420y7.InterfaceC9860j0
    /* renamed from: g */
    public void mo41390g() {
        m41392l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.f45175c.getWritableDatabase().update(this.f45174b, contentValues, "state = 2", null);
        } catch (SQLException e10) {
            throw new C8538a(e10);
        }
    }

    @Override // p420y7.InterfaceC9867q
    /* renamed from: h */
    public C9849e mo41391h(String str) {
        m41392l();
        try {
            Cursor m41393m = m41393m("id = ?", new String[]{str});
            try {
                if (m41393m.getCount() == 0) {
                    m41393m.close();
                    return null;
                }
                m41393m.moveToNext();
                C9849e m41380n = m41380n(m41393m);
                m41393m.close();
                return m41380n;
            } finally {
            }
        } catch (SQLiteException e10) {
            throw new C8538a(e10);
        }
    }

    /* renamed from: l */
    public final void m41392l() {
        synchronized (this.f45176d) {
            if (this.f45177e) {
                return;
            }
            try {
                int m36766b = C8541d.m36766b(this.f45175c.getReadableDatabase(), 0, this.f45173a);
                if (m36766b != 3) {
                    SQLiteDatabase writableDatabase = this.f45175c.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        C8541d.m36768d(writableDatabase, 0, this.f45173a, 3);
                        List<C9849e> m41394r = m36766b == 2 ? m41394r(writableDatabase) : new ArrayList();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f45174b);
                        writableDatabase.execSQL("CREATE TABLE " + this.f45174b + " (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator<C9849e> it = m41394r.iterator();
                        while (it.hasNext()) {
                            m41395s(it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                this.f45177e = true;
            } catch (SQLException e10) {
                throw new C8538a(e10);
            }
        }
    }

    /* renamed from: m */
    public final Cursor m41393m(String str, String[] strArr) {
        try {
            return this.f45175c.getReadableDatabase().query(this.f45174b, f45172g, str, strArr, null, null, "start_time_ms ASC");
        } catch (SQLiteException e10) {
            throw new C8538a(e10);
        }
    }

    /* renamed from: r */
    public final List<C9849e> m41394r(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!C4401z0.m22367a1(sQLiteDatabase, this.f45174b)) {
            return arrayList;
        }
        Cursor query = sQLiteDatabase.query(this.f45174b, new String[]{Name.MARK, ChartFactory.TITLE, "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(m41381o(query));
            } catch (Throwable th2) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        query.close();
        return arrayList;
    }

    /* renamed from: s */
    public final void m41395s(C9849e c9849e, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = c9849e.f45182a.f45313f;
        byte[] bArr2 = bArr;
        if (bArr == null) {
            bArr2 = C4401z0.f26684f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(Name.MARK, c9849e.f45182a.f45309b);
        contentValues.put(AppSyncMutationsSqlHelper.COLUMN_MIME_TYPE, c9849e.f45182a.f45311d);
        contentValues.put("uri", c9849e.f45182a.f45310c.toString());
        contentValues.put("stream_keys", m41379k(c9849e.f45182a.f45312e));
        contentValues.put("custom_cache_key", c9849e.f45182a.f45314g);
        contentValues.put("data", c9849e.f45182a.f45315h);
        contentValues.put("state", Integer.valueOf(c9849e.f45183b));
        contentValues.put("start_time_ms", Long.valueOf(c9849e.f45184c));
        contentValues.put("update_time_ms", Long.valueOf(c9849e.f45185d));
        contentValues.put("content_length", Long.valueOf(c9849e.f45186e));
        contentValues.put("stop_reason", Integer.valueOf(c9849e.f45187f));
        contentValues.put("failure_reason", Integer.valueOf(c9849e.f45188g));
        contentValues.put("percent_downloaded", Float.valueOf(c9849e.m41402b()));
        contentValues.put("bytes_downloaded", Long.valueOf(c9849e.m41401a()));
        contentValues.put("key_set_id", bArr2);
        sQLiteDatabase.replaceOrThrow(this.f45174b, null, contentValues);
    }
}
