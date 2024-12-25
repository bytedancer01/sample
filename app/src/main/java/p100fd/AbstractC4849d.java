package p100fd;

import com.google.auto.value.AutoValue;
import p100fd.C4846a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fd/d.class
 */
@AutoValue
/* renamed from: fd.d */
/* loaded from: combined.jar:classes2.jar:fd/d.class */
public abstract class AbstractC4849d {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fd/d$a.class
     */
    @AutoValue.Builder
    /* renamed from: fd.d$a */
    /* loaded from: combined.jar:classes2.jar:fd/d$a.class */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC4849d mo24626a();

        /* renamed from: b */
        public abstract a mo24627b(AbstractC4851f abstractC4851f);

        /* renamed from: c */
        public abstract a mo24628c(String str);

        /* renamed from: d */
        public abstract a mo24629d(String str);

        /* renamed from: e */
        public abstract a mo24630e(b bVar);

        /* renamed from: f */
        public abstract a mo24631f(String str);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fd/d$b.class
     */
    /* renamed from: fd.d$b */
    /* loaded from: combined.jar:classes2.jar:fd/d$b.class */
    public enum b {
        OK,
        BAD_CONFIG
    }

    /* renamed from: a */
    public static a m24658a() {
        return new C4846a.b();
    }

    /* renamed from: b */
    public abstract AbstractC4851f mo24621b();

    /* renamed from: c */
    public abstract String mo24622c();

    /* renamed from: d */
    public abstract String mo24623d();

    /* renamed from: e */
    public abstract b mo24624e();

    /* renamed from: f */
    public abstract String mo24625f();
}
