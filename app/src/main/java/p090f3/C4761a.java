package p090f3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import com.amazonaws.mobileconnectors.appsync.cache.normalized.sql.AppSyncSqlHelper;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;
import p033c3.AbstractC0984d;
import p033c3.C0986f;
import p033c3.InterfaceC0982b;
import p033c3.InterfaceC0983c;
import p053d3.C4301a;
import p072e3.AbstractC4600f;
import p072e3.C4596b;
import p072e3.C4603i;
import p072e3.C4604j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f3/a.class
 */
/* renamed from: f3.a */
/* loaded from: combined.jar:classes1.jar:f3/a.class */
public final class C4761a extends AbstractC4600f {

    /* renamed from: j */
    public static final String f28090j = String.format("INSERT INTO %s (%s,%s) VALUES (?,?)", AppSyncSqlHelper.TABLE_RECORDS, "key", "record");

    /* renamed from: k */
    public static final String f28091k = String.format("UPDATE %s SET %s=?, %s=? WHERE %s=?", AppSyncSqlHelper.TABLE_RECORDS, "key", "record", "key");

    /* renamed from: l */
    public static final String f28092l = String.format("DELETE FROM %s WHERE %s=?", AppSyncSqlHelper.TABLE_RECORDS, "key");

    /* renamed from: m */
    public static final String f28093m = String.format("DELETE FROM %s", AppSyncSqlHelper.TABLE_RECORDS);

    /* renamed from: b */
    public SQLiteDatabase f28094b;

    /* renamed from: c */
    public final SQLiteOpenHelper f28095c;

    /* renamed from: d */
    public final String[] f28096d = {"_id", "key", "record"};

    /* renamed from: e */
    public final SQLiteStatement f28097e;

    /* renamed from: f */
    public final SQLiteStatement f28098f;

    /* renamed from: g */
    public final SQLiteStatement f28099g;

    /* renamed from: h */
    public final SQLiteStatement f28100h;

    /* renamed from: i */
    public final C4604j f28101i;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f3/a$a.class
     */
    /* renamed from: f3.a$a */
    /* loaded from: combined.jar:classes1.jar:f3/a$a.class */
    public class a implements InterfaceC0983c<AbstractC4600f, AbstractC0984d<C4603i>> {

        /* renamed from: a */
        public final String f28102a;

        /* renamed from: b */
        public final C4301a f28103b;

        /* renamed from: c */
        public final C4761a f28104c;

        public a(C4761a c4761a, String str, C4301a c4301a) {
            this.f28104c = c4761a;
            this.f28102a = str;
            this.f28103b = c4301a;
        }

        @Override // p033c3.InterfaceC0983c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC0984d<C4603i> apply(AbstractC4600f abstractC4600f) {
            return AbstractC0984d.m5888d(abstractC4600f.mo23192c(this.f28102a, this.f28103b));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f3/a$b.class
     */
    /* renamed from: f3.a$b */
    /* loaded from: combined.jar:classes1.jar:f3/a$b.class */
    public class b implements InterfaceC0982b<C4603i> {

        /* renamed from: a */
        public final C4301a f28105a;

        /* renamed from: b */
        public final String f28106b;

        /* renamed from: c */
        public final C4761a f28107c;

        public b(C4761a c4761a, C4301a c4301a, String str) {
            this.f28107c = c4761a;
            this.f28105a = c4301a;
            this.f28106b = str;
        }

        @Override // p033c3.InterfaceC0982b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(C4603i c4603i) {
            if (this.f28105a.m21767a("evict-after-read")) {
                this.f28107c.m24150l(this.f28106b);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f3/a$c.class
     */
    /* renamed from: f3.a$c */
    /* loaded from: combined.jar:classes1.jar:f3/a$c.class */
    public class c implements InterfaceC0982b<AbstractC4600f> {

        /* renamed from: a */
        public final C4603i f28108a;

        /* renamed from: b */
        public final C4301a f28109b;

        /* renamed from: c */
        public final C4761a f28110c;

        public c(C4761a c4761a, C4603i c4603i, C4301a c4301a) {
            this.f28110c = c4761a;
            this.f28108a = c4603i;
            this.f28109b = c4301a;
        }

        @Override // p033c3.InterfaceC0982b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(AbstractC4600f abstractC4600f) {
            abstractC4600f.mo23194e(this.f28108a, this.f28109b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f3/a$d.class
     */
    /* renamed from: f3.a$d */
    /* loaded from: combined.jar:classes1.jar:f3/a$d.class */
    public class d implements InterfaceC0982b<AbstractC4600f> {

        /* renamed from: a */
        public final C4761a f28111a;

        public d(C4761a c4761a) {
            this.f28111a = c4761a;
        }

        @Override // p033c3.InterfaceC0982b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(AbstractC4600f abstractC4600f) {
            abstractC4600f.mo23191b();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f3/a$e.class
     */
    /* renamed from: f3.a$e */
    /* loaded from: combined.jar:classes1.jar:f3/a$e.class */
    public class e implements InterfaceC0983c<AbstractC4600f, Boolean> {

        /* renamed from: a */
        public final C4596b f28112a;

        /* renamed from: b */
        public final C4761a f28113b;

        public e(C4761a c4761a, C4596b c4596b) {
            this.f28113b = c4761a;
            this.f28112a = c4596b;
        }

        @Override // p033c3.InterfaceC0983c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean apply(AbstractC4600f abstractC4600f) {
            return Boolean.valueOf(abstractC4600f.mo23197h(this.f28112a));
        }
    }

    public C4761a(C4604j c4604j, SQLiteOpenHelper sQLiteOpenHelper) {
        this.f28101i = c4604j;
        this.f28095c = sQLiteOpenHelper;
        SQLiteDatabase writableDatabase = sQLiteOpenHelper.getWritableDatabase();
        this.f28094b = writableDatabase;
        this.f28097e = writableDatabase.compileStatement(f28090j);
        this.f28098f = this.f28094b.compileStatement(f28091k);
        this.f28099g = this.f28094b.compileStatement(f28092l);
        this.f28100h = this.f28094b.compileStatement(f28093m);
    }

    @Override // p072e3.AbstractC4600f
    /* renamed from: b */
    public void mo23191b() {
        m23196g().mo5879b(new d(this));
        m24147i();
    }

    @Override // p072e3.AbstractC4600f
    /* renamed from: c */
    public C4603i mo23192c(String str, C4301a c4301a) {
        return m24151m(str).mo5879b(new b(this, c4301a, str)).mo5884i(m23196g().mo5880c(new a(this, str, c4301a))).mo5886k();
    }

    @Override // p072e3.AbstractC4600f
    /* renamed from: e */
    public Set<String> mo23194e(C4603i c4603i, C4301a c4301a) {
        Set<String> set;
        if (c4301a.m21767a("do-not-store")) {
            return Collections.emptySet();
        }
        m23196g().mo5879b(new c(this, c4603i, c4301a));
        AbstractC0984d<C4603i> m24151m = m24151m(c4603i.m23213e());
        if (m24151m.mo5882f()) {
            C4603i mo5881e = m24151m.mo5881e();
            Set<String> m23214f = mo5881e.m23214f(c4603i);
            set = m23214f;
            if (!m23214f.isEmpty()) {
                m24152n(mo5881e.m23213e(), this.f28101i.m23223d(mo5881e.m23212d()));
                set = m23214f;
            }
        } else {
            m24148j(c4603i.m23213e(), this.f28101i.m23223d(c4603i.m23212d()));
            set = Collections.emptySet();
        }
        return set;
    }

    @Override // p072e3.AbstractC4600f
    /* renamed from: h */
    public boolean mo23197h(C4596b c4596b) {
        C0986f.m5892c(c4596b, "cacheKey == null");
        return m24150l(c4596b.m23181b()) | ((Boolean) m23196g().mo5883g(new e(this, c4596b)).mo5885j(Boolean.FALSE)).booleanValue();
    }

    /* renamed from: i */
    public void m24147i() {
        this.f28100h.execute();
    }

    /* renamed from: j */
    public long m24148j(String str, String str2) {
        this.f28097e.bindString(1, str);
        this.f28097e.bindString(2, str2);
        return this.f28097e.executeInsert();
    }

    /* renamed from: k */
    public C4603i m24149k(Cursor cursor) {
        return C4603i.m23209b(cursor.getString(1)).m23216a(this.f28101i.m23221b(cursor.getString(2))).m23217b();
    }

    /* renamed from: l */
    public boolean m24150l(String str) {
        boolean z10 = true;
        this.f28099g.bindString(1, str);
        if (this.f28099g.executeUpdateDelete() <= 0) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: m */
    public AbstractC0984d<C4603i> m24151m(String str) {
        Cursor query = this.f28094b.query(AppSyncSqlHelper.TABLE_RECORDS, this.f28096d, "key = ?", new String[]{str}, null, null, null);
        try {
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        AbstractC0984d<C4603i> m5889h = AbstractC0984d.m5889h(m24149k(query));
                        if (!query.isClosed()) {
                            query.close();
                        }
                        return m5889h;
                    }
                } catch (SQLiteException | IOException e10) {
                    AbstractC0984d<C4603i> m5887a = AbstractC0984d.m5887a();
                    if (query != null && !query.isClosed()) {
                        query.close();
                    }
                    return m5887a;
                }
            }
            AbstractC0984d<C4603i> m5887a2 = AbstractC0984d.m5887a();
            if (query != null && !query.isClosed()) {
                query.close();
            }
            return m5887a2;
        } catch (Throwable th2) {
            if (query != null && !query.isClosed()) {
                query.close();
            }
            throw th2;
        }
    }

    /* renamed from: n */
    public void m24152n(String str, String str2) {
        this.f28098f.bindString(1, str);
        this.f28098f.bindString(2, str2);
        this.f28098f.bindString(3, str);
        this.f28098f.executeInsert();
    }
}
