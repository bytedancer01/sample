package p437z5;

import com.google.auto.value.AutoValue;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:z5/c.class
 */
@AutoValue
/* renamed from: z5.c */
/* loaded from: combined.jar:classes1.jar:z5/c.class */
public abstract class AbstractC10055c<T> {
    /* renamed from: d */
    public static <T> AbstractC10055c<T> m42270d(int i10, T t10) {
        return new C10053a(Integer.valueOf(i10), t10, EnumC10056d.DEFAULT);
    }

    /* renamed from: e */
    public static <T> AbstractC10055c<T> m42271e(int i10, T t10) {
        return new C10053a(Integer.valueOf(i10), t10, EnumC10056d.VERY_LOW);
    }

    /* renamed from: f */
    public static <T> AbstractC10055c<T> m42272f(T t10) {
        return new C10053a(null, t10, EnumC10056d.VERY_LOW);
    }

    /* renamed from: a */
    public abstract Integer mo42265a();

    /* renamed from: b */
    public abstract T mo42266b();

    /* renamed from: c */
    public abstract EnumC10056d mo42267c();
}
