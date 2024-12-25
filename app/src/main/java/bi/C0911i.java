package bi;

import ci.C1120f;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kh.C5616j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p356uh.InterfaceC9196l;
import p372vh.C9367f;
import p390wh.InterfaceC9591a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:bi/i.class
 */
/* renamed from: bi.i */
/* loaded from: combined.jar:classes2.jar:bi/i.class */
public class C0911i extends C0910h {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:bi/i$a.class
     */
    /* renamed from: bi.i$a */
    /* loaded from: combined.jar:classes2.jar:bi/i$a.class */
    public static final class a<T> implements Iterable<T>, InterfaceC9591a {

        /* renamed from: b */
        public final InterfaceC0906d f6058b;

        public a(InterfaceC0906d interfaceC0906d) {
            this.f6058b = interfaceC0906d;
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return this.f6058b.iterator();
        }
    }

    @NotNull
    /* renamed from: c */
    public static final <T> Iterable<T> m5590c(@NotNull InterfaceC0906d<? extends T> interfaceC0906d) {
        C9367f.m39526e(interfaceC0906d, "<this>");
        return new a(interfaceC0906d);
    }

    @NotNull
    /* renamed from: d */
    public static final <T> InterfaceC0906d<T> m5591d(@NotNull InterfaceC0906d<? extends T> interfaceC0906d, int i10) {
        C9367f.m39526e(interfaceC0906d, "<this>");
        if (i10 >= 0) {
            if (i10 != 0) {
                interfaceC0906d = interfaceC0906d instanceof InterfaceC0905c ? ((InterfaceC0905c) interfaceC0906d).mo5586a(i10) : new C0904b(interfaceC0906d, i10);
            }
            return (InterfaceC0906d<T>) interfaceC0906d;
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    /* renamed from: e */
    public static final <T, A extends Appendable> A m5592e(@NotNull InterfaceC0906d<? extends T> interfaceC0906d, @NotNull A a10, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i10, @NotNull CharSequence charSequence4, @Nullable InterfaceC9196l<? super T, ? extends CharSequence> interfaceC9196l) {
        int i11;
        C9367f.m39526e(interfaceC0906d, "<this>");
        C9367f.m39526e(a10, "buffer");
        C9367f.m39526e(charSequence, "separator");
        C9367f.m39526e(charSequence2, "prefix");
        C9367f.m39526e(charSequence3, "postfix");
        C9367f.m39526e(charSequence4, "truncated");
        a10.append(charSequence2);
        Iterator<? extends T> it = interfaceC0906d.iterator();
        int i12 = 0;
        while (true) {
            i11 = i12;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            i12++;
            if (i12 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0) {
                i11 = i12;
                if (i12 > i10) {
                    break;
                }
            }
            C1120f.m6705a(a10, next, interfaceC9196l);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    @NotNull
    /* renamed from: f */
    public static final <T> String m5593f(@NotNull InterfaceC0906d<? extends T> interfaceC0906d, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i10, @NotNull CharSequence charSequence4, @Nullable InterfaceC9196l<? super T, ? extends CharSequence> interfaceC9196l) {
        C9367f.m39526e(interfaceC0906d, "<this>");
        C9367f.m39526e(charSequence, "separator");
        C9367f.m39526e(charSequence2, "prefix");
        C9367f.m39526e(charSequence3, "postfix");
        C9367f.m39526e(charSequence4, "truncated");
        String sb2 = ((StringBuilder) m5592e(interfaceC0906d, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, interfaceC9196l)).toString();
        C9367f.m39525d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: g */
    public static /* synthetic */ String m5594g(InterfaceC0906d interfaceC0906d, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC9196l interfaceC9196l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            interfaceC9196l = null;
        }
        return m5593f(interfaceC0906d, charSequence, charSequence2, charSequence3, i10, charSequence4, interfaceC9196l);
    }

    @NotNull
    /* renamed from: h */
    public static final <T, R> InterfaceC0906d<R> m5595h(@NotNull InterfaceC0906d<? extends T> interfaceC0906d, @NotNull InterfaceC9196l<? super T, ? extends R> interfaceC9196l) {
        C9367f.m39526e(interfaceC0906d, "<this>");
        C9367f.m39526e(interfaceC9196l, "transform");
        return new C0912j(interfaceC0906d, interfaceC9196l);
    }

    @NotNull
    /* renamed from: i */
    public static final <T, C extends Collection<? super T>> C m5596i(@NotNull InterfaceC0906d<? extends T> interfaceC0906d, @NotNull C c10) {
        C9367f.m39526e(interfaceC0906d, "<this>");
        C9367f.m39526e(c10, CognitoUserPoolsSignInProvider.AttributeKeys.CONFIRMATION_DESTINATION);
        Iterator<? extends T> it = interfaceC0906d.iterator();
        while (it.hasNext()) {
            c10.add(it.next());
        }
        return c10;
    }

    @NotNull
    /* renamed from: j */
    public static final <T> List<T> m5597j(@NotNull InterfaceC0906d<? extends T> interfaceC0906d) {
        C9367f.m39526e(interfaceC0906d, "<this>");
        return C5616j.m27705k(m5598k(interfaceC0906d));
    }

    @NotNull
    /* renamed from: k */
    public static final <T> List<T> m5598k(@NotNull InterfaceC0906d<? extends T> interfaceC0906d) {
        C9367f.m39526e(interfaceC0906d, "<this>");
        return (List) m5596i(interfaceC0906d, new ArrayList());
    }
}
