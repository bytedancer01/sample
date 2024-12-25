package p339ti;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ti/e.class
 */
/* renamed from: ti.e */
/* loaded from: combined.jar:classes2.jar:ti/e.class */
public final class C8754e {
    /* renamed from: b */
    public static final int m37556b(LogRecord logRecord) {
        return logRecord.getLevel().intValue() > Level.INFO.intValue() ? 5 : logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
    }
}
