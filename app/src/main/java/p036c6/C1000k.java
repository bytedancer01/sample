package p036c6;

import java.util.concurrent.Executor;
import p093f6.C4772d;
import p093f6.InterfaceC4770b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c6/k.class
 */
/* renamed from: c6.k */
/* loaded from: combined.jar:classes1.jar:c6/k.class */
public final class C1000k implements InterfaceC4770b<Executor> {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c6/k$a.class
     */
    /* renamed from: c6.k$a */
    /* loaded from: combined.jar:classes1.jar:c6/k$a.class */
    public static final class a {

        /* renamed from: a */
        public static final C1000k f6814a = new C1000k();
    }

    /* renamed from: a */
    public static C1000k m5952a() {
        return a.f6814a;
    }

    /* renamed from: b */
    public static Executor m5953b() {
        return (Executor) C4772d.m24165c(AbstractC0999j.m5951a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p153ih.InterfaceC5261a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return m5953b();
    }
}
