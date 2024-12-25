package p339ti;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ti/d.class
 */
/* renamed from: ti.d */
/* loaded from: combined.jar:classes2.jar:ti/d.class */
public final class C8753d extends Handler {

    /* renamed from: a */
    public static final C8753d f40719a = new C8753d();

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(@NotNull LogRecord logRecord) {
        int m37556b;
        C9367f.m39526e(logRecord, "record");
        C8752c c8752c = C8752c.f40718c;
        String loggerName = logRecord.getLoggerName();
        C9367f.m39525d(loggerName, "record.loggerName");
        m37556b = C8754e.m37556b(logRecord);
        String message = logRecord.getMessage();
        C9367f.m39525d(message, "record.message");
        c8752c.m37551a(loggerName, m37556b, message, logRecord.getThrown());
    }
}
