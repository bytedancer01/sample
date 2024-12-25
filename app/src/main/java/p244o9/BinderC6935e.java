package p244o9;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:o9/e.class
 */
/* renamed from: o9.e */
/* loaded from: combined.jar:classes2.jar:o9/e.class */
public final class BinderC6935e extends AbstractBinderC6940j {

    /* renamed from: b */
    public final AsyncTaskC6936f f35860b;

    public /* synthetic */ BinderC6935e(AsyncTaskC6936f asyncTaskC6936f, C6934d c6934d) {
        this.f35860b = asyncTaskC6936f;
    }

    @Override // p244o9.InterfaceC6941k
    /* renamed from: K */
    public final void mo31905K(long j10, long j11) {
        this.f35860b.publishProgress(Long.valueOf(j10), Long.valueOf(j11));
    }
}
