package p067di;

import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233nh.AbstractC6787b;
import p233nh.InterfaceC6792g;
import p356uh.InterfaceC9196l;
import p372vh.AbstractC9368g;
import p372vh.C9365d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/v0.class
 */
/* renamed from: di.v0 */
/* loaded from: combined.jar:classes2.jar:di/v0.class */
public abstract class AbstractC4522v0 extends AbstractC4462b0 implements Closeable {

    /* renamed from: c */
    @NotNull
    public static final a f26947c = new a(null);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:di/v0$a.class
     */
    /* renamed from: di.v0$a */
    /* loaded from: combined.jar:classes2.jar:di/v0$a.class */
    public static final class a extends AbstractC6787b<AbstractC4462b0, AbstractC4522v0> {

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:di/v0$a$a.class
         */
        /* renamed from: di.v0$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:di/v0$a$a.class */
        public static final class C10284a extends AbstractC9368g implements InterfaceC9196l<InterfaceC6792g.b, AbstractC4522v0> {

            /* renamed from: c */
            public static final C10284a f26948c = new C10284a();

            public C10284a() {
                super(1);
            }

            @Override // p356uh.InterfaceC9196l
            @Nullable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC4522v0 mo6711d(@NotNull InterfaceC6792g.b bVar) {
                return bVar instanceof AbstractC4522v0 ? (AbstractC4522v0) bVar : null;
            }
        }

        public a() {
            super(AbstractC4462b0.f26875b, C10284a.f26948c);
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }
    }
}
