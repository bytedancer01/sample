package p173ji;

import java.util.List;
import kh.C5616j;
import org.jetbrains.annotations.NotNull;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/p.class
 */
/* renamed from: ji.p */
/* loaded from: combined.jar:classes2.jar:ji/p.class */
public interface InterfaceC5425p {

    /* renamed from: b */
    public static final a f31116b = new a(null);

    /* renamed from: a */
    @NotNull
    public static final InterfaceC5425p f31115a = new a.C10306a();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/p$a.class
     */
    /* renamed from: ji.p$a */
    /* loaded from: combined.jar:classes2.jar:ji/p$a.class */
    public static final class a {

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:ji/p$a$a.class
         */
        /* renamed from: ji.p$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:ji/p$a$a.class */
        public static final class C10306a implements InterfaceC5425p {
            @Override // p173ji.InterfaceC5425p
            @NotNull
            /* renamed from: a */
            public List<C5424o> mo27026a(@NotNull C5433x c5433x) {
                C9367f.m39526e(c5433x, "url");
                return C5616j.m27700f();
            }

            @Override // p173ji.InterfaceC5425p
            /* renamed from: b */
            public void mo27027b(@NotNull C5433x c5433x, @NotNull List<C5424o> list) {
                C9367f.m39526e(c5433x, "url");
                C9367f.m39526e(list, "cookies");
            }
        }

        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }
    }

    @NotNull
    /* renamed from: a */
    List<C5424o> mo27026a(@NotNull C5433x c5433x);

    /* renamed from: b */
    void mo27027b(@NotNull C5433x c5433x, @NotNull List<C5424o> list);
}
