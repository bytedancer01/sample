package tg;

import java.io.Closeable;
import java.io.InputStream;
import p411xi.InterfaceC9763g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:tg/v.class
 */
/* renamed from: tg.v */
/* loaded from: combined.jar:classes2.jar:tg/v.class */
public abstract class AbstractC8746v implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        mo37311o().close();
    }

    /* renamed from: f */
    public final InputStream m37538f() {
        return mo37311o().inputStream();
    }

    /* renamed from: l */
    public abstract long mo37310l();

    /* renamed from: o */
    public abstract InterfaceC9763g mo37311o();
}
