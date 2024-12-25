package p428yg;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/p.class
 */
/* renamed from: yg.p */
/* loaded from: combined.jar:classes2.jar:yg/p.class */
public enum EnumC10010p {
    NO_CACHE(1),
    NO_STORE(2);

    public final int index;

    EnumC10010p(int i10) {
        this.index = i10;
    }

    public static boolean shouldReadFromMemoryCache(int i10) {
        return (i10 & NO_CACHE.index) == 0;
    }

    public static boolean shouldWriteToMemoryCache(int i10) {
        return (i10 & NO_STORE.index) == 0;
    }
}
