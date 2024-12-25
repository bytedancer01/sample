package p435z3;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:z3/b.class
 */
/* renamed from: z3.b */
/* loaded from: combined.jar:classes1.jar:z3/b.class */
public enum EnumC10038b {
    ALL(true, true),
    NONE(false, false),
    SOURCE(true, false),
    RESULT(false, true);

    private final boolean cacheResult;
    private final boolean cacheSource;

    EnumC10038b(boolean z10, boolean z11) {
        this.cacheSource = z10;
        this.cacheResult = z11;
    }

    public boolean cacheResult() {
        return this.cacheResult;
    }

    public boolean cacheSource() {
        return this.cacheSource;
    }
}
