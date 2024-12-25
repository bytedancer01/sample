package p292qh;

import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9367f;
import p410xh.AbstractC9752c;
import p410xh.C9751b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qh/a.class
 */
/* renamed from: qh.a */
/* loaded from: combined.jar:classes2.jar:qh/a.class */
public class C7923a {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qh/a$a.class
     */
    /* renamed from: qh.a$a */
    /* loaded from: combined.jar:classes2.jar:qh/a$a.class */
    public static final class a {

        /* renamed from: a */
        @NotNull
        public static final a f38107a = new a();

        /* renamed from: b */
        @Nullable
        public static final Method f38108b;

        /* renamed from: c */
        @Nullable
        public static final Method f38109c;

        /* JADX WARN: Removed duplicated region for block: B:11:0x0064 A[LOOP:0: B:2:0x0020->B:11:0x0064, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x006d A[EDGE_INSN: B:12:0x006d->B:13:0x006d BREAK  A[LOOP:0: B:2:0x0020->B:11:0x0064], SYNTHETIC] */
        static {
            /*
                qh.a$a r0 = new qh.a$a
                r1 = r0
                r1.<init>()
                p292qh.C7923a.a.f38107a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r0 = r0.getMethods()
                r9 = r0
                r0 = r9
                java.lang.String r1 = "throwableMethods"
                p372vh.C9367f.m39525d(r0, r1)
                r0 = r9
                int r0 = r0.length
                r6 = r0
                r0 = 0
                r5 = r0
                r0 = 0
                r3 = r0
            L20:
                r0 = 0
                r8 = r0
                r0 = r3
                r1 = r6
                if (r0 >= r1) goto L6a
                r0 = r9
                r1 = r3
                r0 = r0[r1]
                r7 = r0
                r0 = r7
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = "addSuppressed"
                boolean r0 = p372vh.C9367f.m39522a(r0, r1)
                if (r0 == 0) goto L5b
                r0 = r7
                java.lang.Class[] r0 = r0.getParameterTypes()
                r10 = r0
                r0 = r10
                java.lang.String r1 = "it.parameterTypes"
                p372vh.C9367f.m39525d(r0, r1)
                r0 = r10
                java.lang.Object r0 = kh.C5613g.m27691q(r0)
                java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
                boolean r0 = p372vh.C9367f.m39522a(r0, r1)
                if (r0 == 0) goto L5b
                r0 = 1
                r4 = r0
                goto L5d
            L5b:
                r0 = 0
                r4 = r0
            L5d:
                r0 = r4
                if (r0 == 0) goto L64
                goto L6d
            L64:
                int r3 = r3 + 1
                goto L20
            L6a:
                r0 = 0
                r7 = r0
            L6d:
                r0 = r7
                p292qh.C7923a.a.f38108b = r0
                r0 = r9
                int r0 = r0.length
                r4 = r0
                r0 = r5
                r3 = r0
            L78:
                r0 = r8
                r7 = r0
                r0 = r3
                r1 = r4
                if (r0 >= r1) goto L9d
                r0 = r9
                r1 = r3
                r0 = r0[r1]
                r7 = r0
                r0 = r7
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = "getSuppressed"
                boolean r0 = p372vh.C9367f.m39522a(r0, r1)
                if (r0 == 0) goto L97
                goto L9d
            L97:
                int r3 = r3 + 1
                goto L78
            L9d:
                r0 = r7
                p292qh.C7923a.a.f38109c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p292qh.C7923a.a.m45811clinit():void");
        }
    }

    /* renamed from: a */
    public void mo34324a(@NotNull Throwable th2, @NotNull Throwable th3) {
        C9367f.m39526e(th2, "cause");
        C9367f.m39526e(th3, "exception");
        Method method = a.f38108b;
        if (method != null) {
            method.invoke(th2, th3);
        }
    }

    @NotNull
    /* renamed from: b */
    public AbstractC9752c mo34325b() {
        return new C9751b();
    }
}
