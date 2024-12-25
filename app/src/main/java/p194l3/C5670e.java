package p194l3;

import java.util.concurrent.Executor;
import p121h3.InterfaceC5022a;
import p141i3.InterfaceC5168a;
import p141i3.InterfaceC5169b;
import p159j3.C5284b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l3/e.class
 */
/* renamed from: l3.e */
/* loaded from: combined.jar:classes1.jar:l3/e.class */
public final class C5670e implements InterfaceC5022a {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l3/e$b.class
     */
    /* renamed from: l3.e$b */
    /* loaded from: combined.jar:classes1.jar:l3/e$b.class */
    public static final class b implements InterfaceC5168a {
        public b() {
        }

        @Override // p141i3.InterfaceC5168a
        public void dispose() {
        }

        @Override // p141i3.InterfaceC5168a
        public void interceptAsync(InterfaceC5168a.c cVar, InterfaceC5169b interfaceC5169b, Executor executor, InterfaceC5168a.a aVar) {
            interfaceC5169b.mo25821a(cVar.m25815b().m25818c(false).m25816a(), executor, aVar);
        }
    }

    @Override // p121h3.InterfaceC5022a
    /* renamed from: a */
    public InterfaceC5168a mo25228a(C5284b c5284b) {
        return new b();
    }
}
