package p312ri;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p372vh.C9365d;
import p372vh.C9367f;
import p411xi.InterfaceC9763g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ri/l.class
 */
/* renamed from: ri.l */
/* loaded from: combined.jar:classes2.jar:ri/l.class */
public interface InterfaceC8486l {

    /* renamed from: b */
    public static final a f39788b = new a(null);

    /* renamed from: a */
    @NotNull
    public static final InterfaceC8486l f39787a = new a.C10329a();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/l$a.class
     */
    /* renamed from: ri.l$a */
    /* loaded from: combined.jar:classes2.jar:ri/l$a.class */
    public static final class a {

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:ri/l$a$a.class
         */
        /* renamed from: ri.l$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:ri/l$a$a.class */
        public static final class C10329a implements InterfaceC8486l {
            @Override // p312ri.InterfaceC8486l
            /* renamed from: a */
            public boolean mo36602a(int i10, @NotNull InterfaceC9763g interfaceC9763g, int i11, boolean z10) {
                C9367f.m39526e(interfaceC9763g, "source");
                interfaceC9763g.skip(i11);
                return true;
            }

            @Override // p312ri.InterfaceC8486l
            /* renamed from: b */
            public boolean mo36603b(int i10, @NotNull List<C8477c> list) {
                C9367f.m39526e(list, "requestHeaders");
                return true;
            }

            @Override // p312ri.InterfaceC8486l
            /* renamed from: c */
            public boolean mo36604c(int i10, @NotNull List<C8477c> list, boolean z10) {
                C9367f.m39526e(list, "responseHeaders");
                return true;
            }

            @Override // p312ri.InterfaceC8486l
            /* renamed from: d */
            public void mo36605d(int i10, @NotNull EnumC8476b enumC8476b) {
                C9367f.m39526e(enumC8476b, "errorCode");
            }
        }

        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }
    }

    /* renamed from: a */
    boolean mo36602a(int i10, @NotNull InterfaceC9763g interfaceC9763g, int i11, boolean z10);

    /* renamed from: b */
    boolean mo36603b(int i10, @NotNull List<C8477c> list);

    /* renamed from: c */
    boolean mo36604c(int i10, @NotNull List<C8477c> list, boolean z10);

    /* renamed from: d */
    void mo36605d(int i10, @NotNull EnumC8476b enumC8476b);
}
