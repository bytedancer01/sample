package p074e5;

import p111g5.InterfaceC4948b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e5/n.class
 */
/* renamed from: e5.n */
/* loaded from: combined.jar:classes1.jar:e5/n.class */
public enum EnumC4637n implements InterfaceC4948b {
    USE_ANNOTATIONS(true),
    AUTO_DETECT_CREATORS(true),
    AUTO_DETECT_FIELDS(true),
    AUTO_DETECT_GETTERS(true),
    AUTO_DETECT_IS_GETTERS(true),
    AUTO_DETECT_SETTERS(true),
    REQUIRE_SETTERS_FOR_GETTERS(false),
    USE_GETTERS_AS_SETTERS(true),
    CAN_OVERRIDE_ACCESS_MODIFIERS(true),
    OVERRIDE_PUBLIC_ACCESS_MODIFIERS(true),
    INFER_PROPERTY_MUTATORS(true),
    ALLOW_FINAL_FIELDS_AS_MUTATORS(true),
    PROPAGATE_TRANSIENT_MARKER(false),
    USE_STATIC_TYPING(false),
    DEFAULT_VIEW_INCLUSION(true),
    SORT_PROPERTIES_ALPHABETICALLY(false),
    ACCEPT_CASE_INSENSITIVE_PROPERTIES(false),
    USE_WRAPPER_NAME_AS_PROPERTY_NAME(false),
    USE_STD_BEAN_NAMING(false),
    ALLOW_EXPLICIT_PROPERTY_RENAMING(false),
    IGNORE_DUPLICATE_MODULE_REGISTRATIONS(true);

    private final boolean _defaultState;
    private final int _mask = 1 << ordinal();

    EnumC4637n(boolean z10) {
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
