package p100fd;

import com.google.auto.value.AutoValue;
import p100fd.C4847b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fd/f.class
 */
@AutoValue
/* renamed from: fd.f */
/* loaded from: combined.jar:classes2.jar:fd/f.class */
public abstract class AbstractC4851f {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fd/f$a.class
     */
    @AutoValue.Builder
    /* renamed from: fd.f$a */
    /* loaded from: combined.jar:classes2.jar:fd/f$a.class */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC4851f mo24635a();

        /* renamed from: b */
        public abstract a mo24636b(b bVar);

        /* renamed from: c */
        public abstract a mo24637c(String str);

        /* renamed from: d */
        public abstract a mo24638d(long j10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fd/f$b.class
     */
    /* renamed from: fd.f$b */
    /* loaded from: combined.jar:classes2.jar:fd/f$b.class */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    /* renamed from: a */
    public static a m24665a() {
        return new C4847b.b().mo24638d(0L);
    }

    /* renamed from: b */
    public abstract b mo24632b();

    /* renamed from: c */
    public abstract String mo24633c();

    /* renamed from: d */
    public abstract long mo24634d();
}
