package p389wg;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wg/e.class
 */
/* renamed from: wg.e */
/* loaded from: combined.jar:classes2.jar:wg/e.class */
public enum EnumC9578e {
    SPDY_SYN_STREAM,
    SPDY_REPLY,
    SPDY_HEADERS,
    HTTP_20_HEADERS;

    public boolean failIfHeadersAbsent() {
        return this == SPDY_HEADERS;
    }

    public boolean failIfHeadersPresent() {
        return this == SPDY_REPLY;
    }

    public boolean failIfStreamAbsent() {
        return this == SPDY_REPLY || this == SPDY_HEADERS;
    }

    public boolean failIfStreamPresent() {
        return this == SPDY_SYN_STREAM;
    }
}
