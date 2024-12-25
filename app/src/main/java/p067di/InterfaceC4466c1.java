package p067di;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5398q;
import p233nh.InterfaceC6792g;
import p356uh.InterfaceC9196l;
import p356uh.InterfaceC9200p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/c1.class
 */
/* renamed from: di.c1 */
/* loaded from: combined.jar:classes2.jar:di/c1.class */
public interface InterfaceC4466c1 extends InterfaceC6792g.b {

    /* renamed from: b0 */
    @NotNull
    public static final b f26879b0 = b.f26880b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:di/c1$a.class
     */
    /* renamed from: di.c1$a */
    /* loaded from: combined.jar:classes2.jar:di/c1$a.class */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m22644a(InterfaceC4466c1 interfaceC4466c1, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC4466c1.mo22643w(cancellationException);
        }

        /* renamed from: b */
        public static <R> R m22645b(@NotNull InterfaceC4466c1 interfaceC4466c1, R r10, @NotNull InterfaceC9200p<? super R, ? super InterfaceC6792g.b, ? extends R> interfaceC9200p) {
            return (R) InterfaceC6792g.b.a.m31306a(interfaceC4466c1, r10, interfaceC9200p);
        }

        @Nullable
        /* renamed from: c */
        public static <E extends InterfaceC6792g.b> E m22646c(@NotNull InterfaceC4466c1 interfaceC4466c1, @NotNull InterfaceC6792g.c<E> cVar) {
            return (E) InterfaceC6792g.b.a.m31307b(interfaceC4466c1, cVar);
        }

        /* renamed from: d */
        public static /* synthetic */ InterfaceC4501o0 m22647d(InterfaceC4466c1 interfaceC4466c1, boolean z10, boolean z11, InterfaceC9196l interfaceC9196l, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            }
            return interfaceC4466c1.mo22641o(z10, z11, interfaceC9196l);
        }

        @NotNull
        /* renamed from: e */
        public static InterfaceC6792g m22648e(@NotNull InterfaceC4466c1 interfaceC4466c1, @NotNull InterfaceC6792g.c<?> cVar) {
            return InterfaceC6792g.b.a.m31308c(interfaceC4466c1, cVar);
        }

        @NotNull
        /* renamed from: f */
        public static InterfaceC6792g m22649f(@NotNull InterfaceC4466c1 interfaceC4466c1, @NotNull InterfaceC6792g interfaceC6792g) {
            return InterfaceC6792g.b.a.m31309d(interfaceC4466c1, interfaceC6792g);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:di/c1$b.class
     */
    /* renamed from: di.c1$b */
    /* loaded from: combined.jar:classes2.jar:di/c1$b.class */
    public static final class b implements InterfaceC6792g.c<InterfaceC4466c1> {

        /* renamed from: b */
        public static final b f26880b = new b();
    }

    @NotNull
    /* renamed from: f */
    InterfaceC4501o0 mo22639f(@NotNull InterfaceC9196l<? super Throwable, C5398q> interfaceC9196l);

    boolean isActive();

    @NotNull
    /* renamed from: l */
    CancellationException mo22640l();

    @NotNull
    /* renamed from: o */
    InterfaceC4501o0 mo22641o(boolean z10, boolean z11, @NotNull InterfaceC9196l<? super Throwable, C5398q> interfaceC9196l);

    @NotNull
    /* renamed from: o0 */
    InterfaceC4497n mo22642o0(@NotNull InterfaceC4503p interfaceC4503p);

    boolean start();

    /* renamed from: w */
    void mo22643w(@Nullable CancellationException cancellationException);
}
