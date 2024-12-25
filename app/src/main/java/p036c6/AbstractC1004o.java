package p036c6;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import p036c6.C0993d;
import p437z5.EnumC10056d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c6/o.class
 */
@AutoValue
/* renamed from: c6.o */
/* loaded from: combined.jar:classes1.jar:c6/o.class */
public abstract class AbstractC1004o {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c6/o$a.class
     */
    @AutoValue.Builder
    /* renamed from: c6.o$a */
    /* loaded from: combined.jar:classes1.jar:c6/o$a.class */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC1004o mo5930a();

        /* renamed from: b */
        public abstract a mo5931b(String str);

        /* renamed from: c */
        public abstract a mo5932c(byte[] bArr);

        /* renamed from: d */
        public abstract a mo5933d(EnumC10056d enumC10056d);
    }

    /* renamed from: a */
    public static a m5960a() {
        return new C0993d.b().mo5933d(EnumC10056d.DEFAULT);
    }

    /* renamed from: b */
    public abstract String mo5927b();

    /* renamed from: c */
    public abstract byte[] mo5928c();

    /* renamed from: d */
    public abstract EnumC10056d mo5929d();

    /* renamed from: e */
    public boolean m5961e() {
        return mo5928c() != null;
    }

    /* renamed from: f */
    public AbstractC1004o m5962f(EnumC10056d enumC10056d) {
        return m5960a().mo5931b(mo5927b()).mo5933d(enumC10056d).mo5932c(mo5928c()).mo5930a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", mo5927b(), mo5929d(), mo5928c() == null ? "" : Base64.encodeToString(mo5928c(), 2));
    }
}
