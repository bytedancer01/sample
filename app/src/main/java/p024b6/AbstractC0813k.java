package p024b6;

import com.google.auto.value.AutoValue;
import p024b6.C0807e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b6/k.class
 */
@AutoValue
/* renamed from: b6.k */
/* loaded from: combined.jar:classes1.jar:b6/k.class */
public abstract class AbstractC0813k {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b6/k$a.class
     */
    @AutoValue.Builder
    /* renamed from: b6.k$a */
    /* loaded from: combined.jar:classes1.jar:b6/k$a.class */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC0813k mo5170a();

        /* renamed from: b */
        public abstract a mo5171b(AbstractC0803a abstractC0803a);

        /* renamed from: c */
        public abstract a mo5172c(b bVar);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b6/k$b.class
     */
    /* renamed from: b6.k$b */
    /* loaded from: combined.jar:classes1.jar:b6/k$b.class */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int value;

        b(int i10) {
            this.value = i10;
        }
    }

    /* renamed from: a */
    public static a m5211a() {
        return new C0807e.b();
    }

    /* renamed from: b */
    public abstract AbstractC0803a mo5168b();

    /* renamed from: c */
    public abstract b mo5169c();
}
