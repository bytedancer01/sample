package p036c6;

import android.content.Context;
import java.io.Closeable;
import p197l6.InterfaceC5689d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c6/u.class
 */
/* renamed from: c6.u */
/* loaded from: combined.jar:classes1.jar:c6/u.class */
public abstract class AbstractC1010u implements Closeable {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c6/u$a.class
     */
    /* renamed from: c6.u$a */
    /* loaded from: combined.jar:classes1.jar:c6/u$a.class */
    public interface a {
        /* renamed from: a */
        a mo5938a(Context context);

        AbstractC1010u build();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        mo5935f().close();
    }

    /* renamed from: f */
    public abstract InterfaceC5689d mo5935f();

    /* renamed from: l */
    public abstract C1009t mo5936l();
}
