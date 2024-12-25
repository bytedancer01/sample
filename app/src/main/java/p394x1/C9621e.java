package p394x1;

import android.database.sqlite.SQLiteStatement;
import p375w1.InterfaceC9401f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x1/e.class
 */
/* renamed from: x1.e */
/* loaded from: combined.jar:classes1.jar:x1/e.class */
public class C9621e extends C9620d implements InterfaceC9401f {

    /* renamed from: c */
    public final SQLiteStatement f43942c;

    public C9621e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f43942c = sQLiteStatement;
    }

    @Override // p375w1.InterfaceC9401f
    /* renamed from: H */
    public int mo39729H() {
        return this.f43942c.executeUpdateDelete();
    }

    @Override // p375w1.InterfaceC9401f
    /* renamed from: e0 */
    public long mo39730e0() {
        return this.f43942c.executeInsert();
    }
}
