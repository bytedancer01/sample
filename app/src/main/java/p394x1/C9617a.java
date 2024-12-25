package p394x1;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.util.List;
import p375w1.C9396a;
import p375w1.InterfaceC9397b;
import p375w1.InterfaceC9400e;
import p375w1.InterfaceC9401f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x1/a.class
 */
/* renamed from: x1.a */
/* loaded from: combined.jar:classes1.jar:x1/a.class */
public class C9617a implements InterfaceC9397b {

    /* renamed from: c */
    public static final String[] f43922c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: d */
    public static final String[] f43923d = new String[0];

    /* renamed from: b */
    public final SQLiteDatabase f43924b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x1/a$a.class
     */
    /* renamed from: x1.a$a */
    /* loaded from: combined.jar:classes1.jar:x1/a$a.class */
    public class a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        public final InterfaceC9400e f43925a;

        /* renamed from: b */
        public final C9617a f43926b;

        public a(C9617a c9617a, InterfaceC9400e interfaceC9400e) {
            this.f43926b = c9617a;
            this.f43925a = interfaceC9400e;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f43925a.mo36937f(new C9620d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x1/a$b.class
     */
    /* renamed from: x1.a$b */
    /* loaded from: combined.jar:classes1.jar:x1/a$b.class */
    public class b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        public final InterfaceC9400e f43927a;

        /* renamed from: b */
        public final C9617a f43928b;

        public b(C9617a c9617a, InterfaceC9400e interfaceC9400e) {
            this.f43928b = c9617a;
            this.f43927a = interfaceC9400e;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f43927a.mo36937f(new C9620d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public C9617a(SQLiteDatabase sQLiteDatabase) {
        this.f43924b = sQLiteDatabase;
    }

    @Override // p375w1.InterfaceC9397b
    /* renamed from: A */
    public void mo39711A() {
        this.f43924b.beginTransaction();
    }

    @Override // p375w1.InterfaceC9397b
    /* renamed from: E */
    public List<Pair<String, String>> mo39712E() {
        return this.f43924b.getAttachedDbs();
    }

    @Override // p375w1.InterfaceC9397b
    /* renamed from: F */
    public void mo39713F(String str) {
        this.f43924b.execSQL(str);
    }

    @Override // p375w1.InterfaceC9397b
    /* renamed from: O */
    public void mo39714O() {
        this.f43924b.setTransactionSuccessful();
    }

    @Override // p375w1.InterfaceC9397b
    /* renamed from: P */
    public void mo39715P(String str, Object[] objArr) {
        this.f43924b.execSQL(str, objArr);
    }

    @Override // p375w1.InterfaceC9397b
    /* renamed from: R */
    public Cursor mo39716R(InterfaceC9400e interfaceC9400e, CancellationSignal cancellationSignal) {
        return this.f43924b.rawQueryWithFactory(new b(this, interfaceC9400e), interfaceC9400e.mo36940l(), f43923d, null, cancellationSignal);
    }

    @Override // p375w1.InterfaceC9397b
    /* renamed from: S */
    public void mo39717S() {
        this.f43924b.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f43924b.close();
    }

    /* renamed from: f */
    public boolean m40494f(SQLiteDatabase sQLiteDatabase) {
        return this.f43924b == sQLiteDatabase;
    }

    @Override // p375w1.InterfaceC9397b
    public String getPath() {
        return this.f43924b.getPath();
    }

    @Override // p375w1.InterfaceC9397b
    public boolean isOpen() {
        return this.f43924b.isOpen();
    }

    @Override // p375w1.InterfaceC9397b
    /* renamed from: j0 */
    public InterfaceC9401f mo39718j0(String str) {
        return new C9621e(this.f43924b.compileStatement(str));
    }

    @Override // p375w1.InterfaceC9397b
    /* renamed from: p0 */
    public Cursor mo39719p0(String str) {
        return mo39721w0(new C9396a(str));
    }

    @Override // p375w1.InterfaceC9397b
    /* renamed from: u0 */
    public boolean mo39720u0() {
        return this.f43924b.inTransaction();
    }

    @Override // p375w1.InterfaceC9397b
    /* renamed from: w0 */
    public Cursor mo39721w0(InterfaceC9400e interfaceC9400e) {
        return this.f43924b.rawQueryWithFactory(new a(this, interfaceC9400e), interfaceC9400e.mo36940l(), f43923d, null);
    }
}
