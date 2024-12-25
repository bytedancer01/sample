package p397x4;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x4/h.class
 */
/* renamed from: x4.h */
/* loaded from: combined.jar:classes1.jar:x4/h.class */
public enum EnumC9658h {
    NOT_AVAILABLE(null, -1),
    START_OBJECT("{", 1),
    END_OBJECT("}", 2),
    START_ARRAY("[", 3),
    END_ARRAY("]", 4),
    FIELD_NAME(null, 5),
    VALUE_EMBEDDED_OBJECT(null, 12),
    VALUE_STRING(null, 6),
    VALUE_NUMBER_INT(null, 7),
    VALUE_NUMBER_FLOAT(null, 8),
    VALUE_TRUE("true", 9),
    VALUE_FALSE("false", 10),
    VALUE_NULL("null", 11);

    public final int _id;
    public final boolean _isBoolean;
    public final boolean _isNumber;
    public final boolean _isScalar;
    public final boolean _isStructEnd;
    public final boolean _isStructStart;
    public final String _serialized;
    public final byte[] _serializedBytes;
    public final char[] _serializedChars;

    EnumC9658h(String str, int i10) {
        if (str == null) {
            this._serialized = null;
            this._serializedChars = null;
            this._serializedBytes = null;
        } else {
            this._serialized = str;
            char[] charArray = str.toCharArray();
            this._serializedChars = charArray;
            int length = charArray.length;
            this._serializedBytes = new byte[length];
            for (int i11 = 0; i11 < length; i11++) {
                this._serializedBytes[i11] = (byte) this._serializedChars[i11];
            }
        }
        this._id = i10;
        this._isBoolean = i10 == 10 || i10 == 9;
        this._isNumber = i10 == 7 || i10 == 8;
        boolean z10 = i10 == 1 || i10 == 3;
        this._isStructStart = z10;
        boolean z11 = i10 == 2 || i10 == 4;
        this._isStructEnd = z11;
        boolean z12 = false;
        if (!z10) {
            z12 = false;
            if (!z11) {
                z12 = false;
                if (i10 != 5) {
                    z12 = false;
                    if (i10 != -1) {
                        z12 = true;
                    }
                }
            }
        }
        this._isScalar = z12;
    }

    public final byte[] asByteArray() {
        return this._serializedBytes;
    }

    public final char[] asCharArray() {
        return this._serializedChars;
    }

    public final String asString() {
        return this._serialized;
    }

    /* renamed from: id */
    public final int m40589id() {
        return this._id;
    }

    public final boolean isBoolean() {
        return this._isBoolean;
    }

    public final boolean isNumeric() {
        return this._isNumber;
    }

    public final boolean isScalarValue() {
        return this._isScalar;
    }

    public final boolean isStructEnd() {
        return this._isStructEnd;
    }

    public final boolean isStructStart() {
        return this._isStructStart;
    }
}
