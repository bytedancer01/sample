package p036c6;

import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p036c6.C0991b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c6/i.class
 */
@AutoValue
/* renamed from: c6.i */
/* loaded from: combined.jar:classes1.jar:c6/i.class */
public abstract class AbstractC0998i {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c6/i$a.class
     */
    @AutoValue.Builder
    /* renamed from: c6.i$a */
    /* loaded from: combined.jar:classes1.jar:c6/i$a.class */
    public static abstract class a {
        /* renamed from: a */
        public final a m5948a(String str, int i10) {
            mo5909e().put(str, String.valueOf(i10));
            return this;
        }

        /* renamed from: b */
        public final a m5949b(String str, long j10) {
            mo5909e().put(str, String.valueOf(j10));
            return this;
        }

        /* renamed from: c */
        public final a m5950c(String str, String str2) {
            mo5909e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract AbstractC0998i mo5908d();

        /* renamed from: e */
        public abstract Map<String, String> mo5909e();

        /* renamed from: f */
        public abstract a mo5910f(Map<String, String> map);

        /* renamed from: g */
        public abstract a mo5911g(Integer num);

        /* renamed from: h */
        public abstract a mo5912h(C0997h c0997h);

        /* renamed from: i */
        public abstract a mo5913i(long j10);

        /* renamed from: j */
        public abstract a mo5914j(String str);

        /* renamed from: k */
        public abstract a mo5915k(long j10);
    }

    /* renamed from: a */
    public static a m5942a() {
        return new C0991b.b().mo5910f(new HashMap());
    }

    /* renamed from: b */
    public final String m5943b(String str) {
        String str2 = mo5902c().get(str);
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        return str3;
    }

    /* renamed from: c */
    public abstract Map<String, String> mo5902c();

    /* renamed from: d */
    public abstract Integer mo5903d();

    /* renamed from: e */
    public abstract C0997h mo5904e();

    /* renamed from: f */
    public abstract long mo5905f();

    /* renamed from: g */
    public final int m5944g(String str) {
        String str2 = mo5902c().get(str);
        return str2 == null ? 0 : Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long m5945h(String str) {
        String str2 = mo5902c().get(str);
        return str2 == null ? 0L : Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map<String, String> m5946i() {
        return Collections.unmodifiableMap(mo5902c());
    }

    /* renamed from: j */
    public abstract String mo5906j();

    /* renamed from: k */
    public abstract long mo5907k();

    /* renamed from: l */
    public a m5947l() {
        return new C0991b.b().mo5914j(mo5906j()).mo5911g(mo5903d()).mo5912h(mo5904e()).mo5913i(mo5905f()).mo5915k(mo5907k()).mo5910f(new HashMap(mo5902c()));
    }
}
