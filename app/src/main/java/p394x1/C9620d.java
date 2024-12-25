package p394x1;

import android.database.sqlite.SQLiteProgram;
import p375w1.InterfaceC9399d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x1/d.class
 */
/* renamed from: x1.d */
/* loaded from: combined.jar:classes1.jar:x1/d.class */
public class C9620d implements InterfaceC9399d {

    /* renamed from: b */
    public final SQLiteProgram f43941b;

    public C9620d(SQLiteProgram sQLiteProgram) {
        this.f43941b = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f43941b.close();
    }

    @Override // p375w1.InterfaceC9399d
    /* renamed from: h0 */
    public void mo36938h0(int i10, String str) {
        this.f43941b.bindString(i10, str);
    }

    @Override // p375w1.InterfaceC9399d
    /* renamed from: i */
    public void mo36939i(int i10, double d10) {
        this.f43941b.bindDouble(i10, d10);
    }

    @Override // p375w1.InterfaceC9399d
    /* renamed from: m0 */
    public void mo36941m0(int i10, long j10) {
        this.f43941b.bindLong(i10, j10);
    }

    @Override // p375w1.InterfaceC9399d
    /* renamed from: n0 */
    public void mo36942n0(int i10, byte[] bArr) {
        this.f43941b.bindBlob(i10, bArr);
    }

    @Override // p375w1.InterfaceC9399d
    /* renamed from: t0 */
    public void mo36945t0(int i10) {
        this.f43941b.bindNull(i10);
    }
}
