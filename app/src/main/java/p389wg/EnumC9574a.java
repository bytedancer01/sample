package p389wg;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wg/a.class
 */
/* renamed from: wg.a */
/* loaded from: combined.jar:classes2.jar:wg/a.class */
public enum EnumC9574a {
    NO_ERROR(0, -1, 0),
    PROTOCOL_ERROR(1, 1, 1),
    INVALID_STREAM(1, 2, -1),
    UNSUPPORTED_VERSION(1, 4, -1),
    STREAM_IN_USE(1, 8, -1),
    STREAM_ALREADY_CLOSED(1, 9, -1),
    INTERNAL_ERROR(2, 6, 2),
    FLOW_CONTROL_ERROR(3, 7, -1),
    STREAM_CLOSED(5, -1, -1),
    FRAME_TOO_LARGE(6, 11, -1),
    REFUSED_STREAM(7, 3, -1),
    CANCEL(8, 5, -1),
    COMPRESSION_ERROR(9, -1, -1),
    CONNECT_ERROR(10, -1, -1),
    ENHANCE_YOUR_CALM(11, -1, -1),
    INADEQUATE_SECURITY(12, -1, -1),
    INVALID_CREDENTIALS(-1, 10, -1);

    public final int httpCode;
    public final int spdyGoAwayCode;
    public final int spdyRstCode;

    EnumC9574a(int i10, int i11, int i12) {
        this.httpCode = i10;
        this.spdyRstCode = i11;
        this.spdyGoAwayCode = i12;
    }

    public static EnumC9574a fromHttp2(int i10) {
        for (EnumC9574a enumC9574a : values()) {
            if (enumC9574a.httpCode == i10) {
                return enumC9574a;
            }
        }
        return null;
    }

    public static EnumC9574a fromSpdy3Rst(int i10) {
        for (EnumC9574a enumC9574a : values()) {
            if (enumC9574a.spdyRstCode == i10) {
                return enumC9574a;
            }
        }
        return null;
    }

    public static EnumC9574a fromSpdyGoAway(int i10) {
        for (EnumC9574a enumC9574a : values()) {
            if (enumC9574a.spdyGoAwayCode == i10) {
                return enumC9574a;
            }
        }
        return null;
    }
}
