package p397x4;

import java.io.Closeable;
import java.io.Flushable;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x4/d.class
 */
/* renamed from: x4.d */
/* loaded from: combined.jar:classes1.jar:x4/d.class */
public abstract class AbstractC9654d implements Closeable, Flushable {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x4/d$a.class
     */
    /* renamed from: x4.d$a */
    /* loaded from: combined.jar:classes1.jar:x4/d$a.class */
    public enum a {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        ESCAPE_NON_ASCII(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);

        private final boolean _defaultState;
        private final int _mask = 1 << ordinal();

        a(boolean z10) {
            this._defaultState = z10;
        }

        public static int collectDefaults() {
            a[] values = values();
            int length = values.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = i11;
                if (i10 >= length) {
                    return i12;
                }
                a aVar = values[i10];
                int i13 = i12;
                if (aVar.enabledByDefault()) {
                    i13 = i12 | aVar.getMask();
                }
                i10++;
                i11 = i13;
            }
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i10) {
            return (i10 & this._mask) != 0;
        }

        public int getMask() {
            return this._mask;
        }
    }
}
