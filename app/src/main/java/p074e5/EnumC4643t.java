package p074e5;

import p111g5.InterfaceC4948b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e5/t.class
 */
/* renamed from: e5.t */
/* loaded from: combined.jar:classes1.jar:e5/t.class */
public enum EnumC4643t implements InterfaceC4948b {
    WRAP_ROOT_VALUE(false),
    INDENT_OUTPUT(false),
    FAIL_ON_EMPTY_BEANS(true),
    FAIL_ON_SELF_REFERENCES(true),
    WRAP_EXCEPTIONS(true),
    FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS(true),
    CLOSE_CLOSEABLE(false),
    FLUSH_AFTER_WRITE_VALUE(true),
    WRITE_DATES_AS_TIMESTAMPS(true),
    WRITE_DATE_KEYS_AS_TIMESTAMPS(false),
    WRITE_DATES_WITH_ZONE_ID(false),
    WRITE_DURATIONS_AS_TIMESTAMPS(true),
    WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS(false),
    WRITE_ENUMS_USING_TO_STRING(false),
    WRITE_ENUMS_USING_INDEX(false),
    WRITE_NULL_MAP_VALUES(true),
    WRITE_EMPTY_JSON_ARRAYS(true),
    WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED(false),
    WRITE_BIGDECIMAL_AS_PLAIN(false),
    WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS(true),
    ORDER_MAP_ENTRIES_BY_KEYS(false),
    EAGER_SERIALIZER_FETCH(true),
    USE_EQUALITY_FOR_OBJECT_ID(false);

    private final boolean _defaultState;
    private final int _mask = 1 << ordinal();

    EnumC4643t(boolean z10) {
        this._defaultState = z10;
    }

    @Override // p111g5.InterfaceC4948b
    public boolean enabledByDefault() {
        return this._defaultState;
    }

    public boolean enabledIn(int i10) {
        return (i10 & this._mask) != 0;
    }

    @Override // p111g5.InterfaceC4948b
    public int getMask() {
        return this._mask;
    }
}
