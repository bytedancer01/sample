package ma;

import java.io.IOException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/yf.class
 */
/* renamed from: ma.yf */
/* loaded from: combined.jar:classes2.jar:ma/yf.class */
public final class C6521yf extends IOException {
    public C6521yf(String str, Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th2);
    }

    public C6521yf(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
