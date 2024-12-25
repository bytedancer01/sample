package za;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:za/b.class
 */
/* renamed from: za.b */
/* loaded from: combined.jar:classes2.jar:za/b.class */
public final class C10130b extends IllegalStateException {
    public C10130b(String str, Throwable th2) {
        super(str, th2);
    }

    /* renamed from: a */
    public static IllegalStateException m42547a(AbstractC10144i<?> abstractC10144i) {
        if (!abstractC10144i.mo42566o()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception mo42562k = abstractC10144i.mo42562k();
        String concat = mo42562k != null ? "failure" : abstractC10144i.mo42567p() ? "result ".concat(String.valueOf(abstractC10144i.mo42563l())) : abstractC10144i.mo42565n() ? "cancellation" : "unknown issue";
        return new C10130b(concat.length() != 0 ? "Complete with: ".concat(concat) : new String("Complete with: "), mo42562k);
    }
}
