package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/r2.class
 */
/* renamed from: ma.r2 */
/* loaded from: combined.jar:classes2.jar:ma/r2.class */
public final class C6365r2 {

    /* renamed from: a */
    public final Object f33993a;

    /* renamed from: b */
    public final Object f33994b;

    /* renamed from: c */
    public final Object f33995c;

    public C6365r2(Object obj, Object obj2, Object obj3) {
        this.f33993a = obj;
        this.f33994b = obj2;
        this.f33995c = obj3;
    }

    /* renamed from: a */
    public final IllegalArgumentException m29994a() {
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(this.f33993a) + "=" + String.valueOf(this.f33994b) + " and " + String.valueOf(this.f33993a) + "=" + String.valueOf(this.f33995c));
    }
}
