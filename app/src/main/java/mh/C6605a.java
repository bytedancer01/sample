package mh;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5398q;
import p356uh.InterfaceC9185a;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:mh/a.class
 */
/* renamed from: mh.a */
/* loaded from: combined.jar:classes2.jar:mh/a.class */
public final class C6605a {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mh/a$a.class
     */
    /* renamed from: mh.a$a */
    /* loaded from: combined.jar:classes2.jar:mh/a$a.class */
    public static final class a extends Thread {

        /* renamed from: b */
        public final InterfaceC9185a<C5398q> f34502b;

        public a(InterfaceC9185a<C5398q> interfaceC9185a) {
            this.f34502b = interfaceC9185a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f34502b.mo20777h();
        }
    }

    @NotNull
    /* renamed from: a */
    public static final Thread m30498a(boolean z10, boolean z11, @Nullable ClassLoader classLoader, @Nullable String str, int i10, @NotNull InterfaceC9185a<C5398q> interfaceC9185a) {
        C9367f.m39526e(interfaceC9185a, "block");
        a aVar = new a(interfaceC9185a);
        if (z11) {
            aVar.setDaemon(true);
        }
        if (i10 > 0) {
            aVar.setPriority(i10);
        }
        if (str != null) {
            aVar.setName(str);
        }
        if (classLoader != null) {
            aVar.setContextClassLoader(classLoader);
        }
        if (z10) {
            aVar.start();
        }
        return aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ Thread m30499b(boolean z10, boolean z11, ClassLoader classLoader, String str, int i10, InterfaceC9185a interfaceC9185a, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            classLoader = null;
        }
        if ((i11 & 8) != 0) {
            str = null;
        }
        if ((i11 & 16) != 0) {
            i10 = -1;
        }
        return m30498a(z10, z11, classLoader, str, i10, interfaceC9185a);
    }
}
