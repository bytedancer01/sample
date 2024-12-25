package p397x4;

import java.io.Closeable;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x4/f.class
 */
/* renamed from: x4.f */
/* loaded from: combined.jar:classes1.jar:x4/f.class */
public abstract class AbstractC9656f implements Closeable {

    /* renamed from: b */
    public int f44054b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x4/f$a.class
     */
    /* renamed from: x4.f$a */
    /* loaded from: combined.jar:classes1.jar:x4/f$a.class */
    public enum a {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        ALLOW_MISSING_VALUES(false);

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

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x4/f$b.class
     */
    /* renamed from: x4.f$b */
    /* loaded from: combined.jar:classes1.jar:x4/f$b.class */
    public enum b {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    public AbstractC9656f(int i10) {
        this.f44054b = i10;
    }

    /* renamed from: f */
    public abstract String mo36762f();

    /* renamed from: l */
    public abstract EnumC9658h mo36763l();
}
