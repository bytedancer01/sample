package p056d6;

import com.google.auto.value.AutoValue;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:d6/g.class
 */
@AutoValue
/* renamed from: d6.g */
/* loaded from: combined.jar:classes1.jar:d6/g.class */
public abstract class AbstractC4311g {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d6/g$a.class
     */
    /* renamed from: d6.g$a */
    /* loaded from: combined.jar:classes1.jar:d6/g$a.class */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static AbstractC4311g m21780a() {
        return new C4306b(a.FATAL_ERROR, -1L);
    }

    /* renamed from: d */
    public static AbstractC4311g m21781d() {
        return new C4306b(a.INVALID_PAYLOAD, -1L);
    }

    /* renamed from: e */
    public static AbstractC4311g m21782e(long j10) {
        return new C4306b(a.OK, j10);
    }

    /* renamed from: f */
    public static AbstractC4311g m21783f() {
        return new C4306b(a.TRANSIENT_ERROR, -1L);
    }

    /* renamed from: b */
    public abstract long mo21773b();

    /* renamed from: c */
    public abstract a mo21774c();
}
