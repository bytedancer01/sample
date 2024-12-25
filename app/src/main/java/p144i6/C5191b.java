package p144i6;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i6/b.class
 */
/* renamed from: i6.b */
/* loaded from: combined.jar:classes1.jar:i6/b.class */
public final class C5191b {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m25881a(int i10, TInput tinput, InterfaceC5190a<TInput, TResult, TException> interfaceC5190a, InterfaceC5192c<TInput, TResult> interfaceC5192c) {
        TResult apply;
        int i11;
        int i12 = i10;
        TInput tinput2 = tinput;
        if (i10 < 1) {
            return interfaceC5190a.apply(tinput);
        }
        do {
            apply = interfaceC5190a.apply(tinput2);
            tinput2 = interfaceC5192c.mo279a(tinput2, apply);
            if (tinput2 == null) {
                break;
            }
            i11 = i12 - 1;
            i12 = i11;
        } while (i11 >= 1);
        return apply;
    }
}
