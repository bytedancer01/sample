package p024b6;

import com.google.auto.value.AutoValue;
import java.util.List;
import p024b6.C0809g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b6/m.class
 */
@AutoValue
/* renamed from: b6.m */
/* loaded from: combined.jar:classes1.jar:b6/m.class */
public abstract class AbstractC0815m {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b6/m$a.class
     */
    @AutoValue.Builder
    /* renamed from: b6.m$a */
    /* loaded from: combined.jar:classes1.jar:b6/m$a.class */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC0815m mo5195a();

        /* renamed from: b */
        public abstract a mo5196b(AbstractC0813k abstractC0813k);

        /* renamed from: c */
        public abstract a mo5197c(List<AbstractC0814l> list);

        /* renamed from: d */
        public abstract a mo5198d(Integer num);

        /* renamed from: e */
        public abstract a mo5199e(String str);

        /* renamed from: f */
        public abstract a mo5200f(EnumC0818p enumC0818p);

        /* renamed from: g */
        public abstract a mo5201g(long j10);

        /* renamed from: h */
        public abstract a mo5202h(long j10);

        /* renamed from: i */
        public a m5216i(int i10) {
            return mo5198d(Integer.valueOf(i10));
        }

        /* renamed from: j */
        public a m5217j(String str) {
            return mo5199e(str);
        }
    }

    /* renamed from: a */
    public static a m5215a() {
        return new C0809g.b();
    }

    /* renamed from: b */
    public abstract AbstractC0813k mo5188b();

    /* renamed from: c */
    public abstract List<AbstractC0814l> mo5189c();

    /* renamed from: d */
    public abstract Integer mo5190d();

    /* renamed from: e */
    public abstract String mo5191e();

    /* renamed from: f */
    public abstract EnumC0818p mo5192f();

    /* renamed from: g */
    public abstract long mo5193g();

    /* renamed from: h */
    public abstract long mo5194h();
}
