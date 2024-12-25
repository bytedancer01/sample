package p394x1;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import p375w1.InterfaceC9397b;
import p375w1.InterfaceC9398c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x1/b.class
 */
/* renamed from: x1.b */
/* loaded from: combined.jar:classes1.jar:x1/b.class */
public class C9618b implements InterfaceC9398c {

    /* renamed from: b */
    public final Context f43929b;

    /* renamed from: c */
    public final String f43930c;

    /* renamed from: d */
    public final InterfaceC9398c.a f43931d;

    /* renamed from: e */
    public final boolean f43932e;

    /* renamed from: f */
    public final Object f43933f = new Object();

    /* renamed from: g */
    public a f43934g;

    /* renamed from: h */
    public boolean f43935h;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x1/b$a.class
     */
    /* renamed from: x1.b$a */
    /* loaded from: combined.jar:classes1.jar:x1/b$a.class */
    public static class a extends SQLiteOpenHelper {

        /* renamed from: b */
        public final C9617a[] f43936b;

        /* renamed from: c */
        public final InterfaceC9398c.a f43937c;

        /* renamed from: d */
        public boolean f43938d;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:x1/b$a$a.class
         */
        /* renamed from: x1.b$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:x1/b$a$a.class */
        public class C10333a implements DatabaseErrorHandler {

            /* renamed from: a */
            public final InterfaceC9398c.a f43939a;

            /* renamed from: b */
            public final C9617a[] f43940b;

            public C10333a(InterfaceC9398c.a aVar, C9617a[] c9617aArr) {
                this.f43939a = aVar;
                this.f43940b = c9617aArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f43939a.m39723c(a.m40496l(this.f43940b, sQLiteDatabase));
            }
        }

        public a(Context context, String str, C9617a[] c9617aArr, InterfaceC9398c.a aVar) {
            super(context, str, null, aVar.f43092a, new C10333a(aVar, c9617aArr));
            this.f43937c = aVar;
            this.f43936b = c9617aArr;
        }

        /* renamed from: l */
        public static C9617a m40496l(C9617a[] c9617aArr, SQLiteDatabase sQLiteDatabase) {
            C9617a c9617a = c9617aArr[0];
            if (c9617a == null || !c9617a.m40494f(sQLiteDatabase)) {
                c9617aArr[0] = new C9617a(sQLiteDatabase);
            }
            return c9617aArr[0];
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            synchronized (this) {
                super.close();
                this.f43936b[0] = null;
            }
        }

        /* renamed from: f */
        public C9617a m40497f(SQLiteDatabase sQLiteDatabase) {
            return m40496l(this.f43936b, sQLiteDatabase);
        }

        /* renamed from: o */
        public InterfaceC9397b m40498o() {
            synchronized (this) {
                this.f43938d = false;
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                if (!this.f43938d) {
                    return m40497f(writableDatabase);
                }
                close();
                return m40498o();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f43937c.mo36927b(m40497f(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f43937c.mo36928d(m40497f(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f43938d = true;
            this.f43937c.mo36929e(m40497f(sQLiteDatabase), i10, i11);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f43938d) {
                return;
            }
            this.f43937c.mo36930f(m40497f(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f43938d = true;
            this.f43937c.mo36931g(m40497f(sQLiteDatabase), i10, i11);
        }
    }

    public C9618b(Context context, String str, InterfaceC9398c.a aVar, boolean z10) {
        this.f43929b = context;
        this.f43930c = str;
        this.f43931d = aVar;
        this.f43932e = z10;
    }

    @Override // p375w1.InterfaceC9398c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m40495f().close();
    }

    /* renamed from: f */
    public final a m40495f() {
        a aVar;
        synchronized (this.f43933f) {
            if (this.f43934g == null) {
                C9617a[] c9617aArr = new C9617a[1];
                if (Build.VERSION.SDK_INT < 23 || this.f43930c == null || !this.f43932e) {
                    this.f43934g = new a(this.f43929b, this.f43930c, c9617aArr, this.f43931d);
                } else {
                    this.f43934g = new a(this.f43929b, new File(this.f43929b.getNoBackupFilesDir(), this.f43930c).getAbsolutePath(), c9617aArr, this.f43931d);
                }
                this.f43934g.setWriteAheadLoggingEnabled(this.f43935h);
            }
            aVar = this.f43934g;
        }
        return aVar;
    }

    @Override // p375w1.InterfaceC9398c
    public String getDatabaseName() {
        return this.f43930c;
    }

    @Override // p375w1.InterfaceC9398c
    public InterfaceC9397b getWritableDatabase() {
        return m40495f().m40498o();
    }

    @Override // p375w1.InterfaceC9398c
    public void setWriteAheadLoggingEnabled(boolean z10) {
        synchronized (this.f43933f) {
            a aVar = this.f43934g;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z10);
            }
            this.f43935h = z10;
        }
    }
}
