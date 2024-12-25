package p428yg;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/q.class
 */
/* renamed from: yg.q */
/* loaded from: combined.jar:classes2.jar:yg/q.class */
public enum EnumC10011q {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);

    public final int index;

    EnumC10011q(int i10) {
        this.index = i10;
    }

    public static boolean isOfflineOnly(int i10) {
        return (i10 & OFFLINE.index) != 0;
    }

    public static boolean shouldReadFromDiskCache(int i10) {
        return (i10 & NO_CACHE.index) == 0;
    }

    public static boolean shouldWriteToDiskCache(int i10) {
        return (i10 & NO_STORE.index) == 0;
    }
}
