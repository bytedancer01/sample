package p375w1;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:w1/b.class
 */
/* renamed from: w1.b */
/* loaded from: combined.jar:classes1.jar:w1/b.class */
public interface InterfaceC9397b extends Closeable {
    /* renamed from: A */
    void mo39711A();

    /* renamed from: E */
    List<Pair<String, String>> mo39712E();

    /* renamed from: F */
    void mo39713F(String str);

    /* renamed from: O */
    void mo39714O();

    /* renamed from: P */
    void mo39715P(String str, Object[] objArr);

    /* renamed from: R */
    Cursor mo39716R(InterfaceC9400e interfaceC9400e, CancellationSignal cancellationSignal);

    /* renamed from: S */
    void mo39717S();

    String getPath();

    boolean isOpen();

    /* renamed from: j0 */
    InterfaceC9401f mo39718j0(String str);

    /* renamed from: p0 */
    Cursor mo39719p0(String str);

    /* renamed from: u0 */
    boolean mo39720u0();

    /* renamed from: w0 */
    Cursor mo39721w0(InterfaceC9400e interfaceC9400e);
}
