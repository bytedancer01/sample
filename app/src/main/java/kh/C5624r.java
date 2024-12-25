package kh;

import bi.InterfaceC0906d;
import ci.C1120f;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p356uh.InterfaceC9196l;
import p372vh.C9367f;
import p448zh.C10240e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kh/r.class
 */
/* renamed from: kh.r */
/* loaded from: combined.jar:classes2.jar:kh/r.class */
public class C5624r extends C5623q {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:kh/r$a.class
     */
    /* renamed from: kh.r$a */
    /* loaded from: combined.jar:classes2.jar:kh/r$a.class */
    public static final class a<T> implements InterfaceC0906d<T> {

        /* renamed from: a */
        public final Iterable f31699a;

        public a(Iterable iterable) {
            this.f31699a = iterable;
        }

        @Override // bi.InterfaceC0906d
        @NotNull
        public Iterator<T> iterator() {
            return this.f31699a.iterator();
        }
    }

    @NotNull
    /* renamed from: A */
    public static final <T> List<T> m27712A(@NotNull Collection<? extends T> collection, @NotNull Iterable<? extends T> iterable) {
        C9367f.m39526e(collection, "<this>");
        C9367f.m39526e(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            C5621o.m27710p(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    @NotNull
    /* renamed from: B */
    public static final <T> List<T> m27713B(@NotNull Collection<? extends T> collection, T t10) {
        C9367f.m39526e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    /* renamed from: C */
    public static final <T> T m27714C(@NotNull Iterable<? extends T> iterable) {
        C9367f.m39526e(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) m27715D((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    /* renamed from: D */
    public static final <T> T m27715D(@NotNull List<? extends T> list) {
        C9367f.m39526e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    @NotNull
    /* renamed from: E */
    public static final <T> List<T> m27716E(@NotNull Iterable<? extends T> iterable, int i10) {
        C9367f.m39526e(iterable, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return C5616j.m27700f();
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return m27718G(iterable);
            }
            if (i10 == 1) {
                return C5615i.m27696b(m27724t(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator<? extends T> it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            int i12 = i11 + 1;
            i11 = i12;
            if (i12 == i10) {
                break;
            }
        }
        return C5616j.m27705k(arrayList);
    }

    @NotNull
    /* renamed from: F */
    public static final <T, C extends Collection<? super T>> C m27717F(@NotNull Iterable<? extends T> iterable, @NotNull C c10) {
        C9367f.m39526e(iterable, "<this>");
        C9367f.m39526e(c10, CognitoUserPoolsSignInProvider.AttributeKeys.CONFIRMATION_DESTINATION);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c10.add(it.next());
        }
        return c10;
    }

    @NotNull
    /* renamed from: G */
    public static final <T> List<T> m27718G(@NotNull Iterable<? extends T> iterable) {
        List<T> m27700f;
        C9367f.m39526e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C5616j.m27705k(m27719H(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            m27700f = C5616j.m27700f();
        } else if (size != 1) {
            m27700f = m27720I(collection);
        } else {
            m27700f = C5615i.m27696b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        return m27700f;
    }

    @NotNull
    /* renamed from: H */
    public static final <T> List<T> m27719H(@NotNull Iterable<? extends T> iterable) {
        C9367f.m39526e(iterable, "<this>");
        return iterable instanceof Collection ? m27720I((Collection) iterable) : (List) m27717F(iterable, new ArrayList());
    }

    @NotNull
    /* renamed from: I */
    public static final <T> List<T> m27720I(@NotNull Collection<? extends T> collection) {
        C9367f.m39526e(collection, "<this>");
        return new ArrayList(collection);
    }

    @NotNull
    /* renamed from: J */
    public static final <T> Set<T> m27721J(@NotNull Iterable<? extends T> iterable) {
        Set<T> m27672b;
        C9367f.m39526e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C5608b0.m27673c((Set) m27717F(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            m27672b = C5608b0.m27672b();
        } else if (size != 1) {
            m27672b = (Set) m27717F(iterable, new LinkedHashSet(C5631y.m27747a(collection.size())));
        } else {
            m27672b = C5606a0.m27664a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        return m27672b;
    }

    @NotNull
    /* renamed from: r */
    public static final <T> InterfaceC0906d<T> m27722r(@NotNull Iterable<? extends T> iterable) {
        C9367f.m39526e(iterable, "<this>");
        return new a(iterable);
    }

    @NotNull
    /* renamed from: s */
    public static final <T> List<T> m27723s(@NotNull List<? extends T> list, int i10) {
        C9367f.m39526e(list, "<this>");
        if (i10 >= 0) {
            return m27716E(list, C10240e.m42834b(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    /* renamed from: t */
    public static final <T> T m27724t(@NotNull Iterable<? extends T> iterable) {
        C9367f.m39526e(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) m27725u((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: u */
    public static final <T> T m27725u(@NotNull List<? extends T> list) {
        C9367f.m39526e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    @NotNull
    /* renamed from: v */
    public static final <T, A extends Appendable> A m27726v(@NotNull Iterable<? extends T> iterable, @NotNull A a10, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i10, @NotNull CharSequence charSequence4, @Nullable InterfaceC9196l<? super T, ? extends CharSequence> interfaceC9196l) {
        int i11;
        C9367f.m39526e(iterable, "<this>");
        C9367f.m39526e(a10, "buffer");
        C9367f.m39526e(charSequence, "separator");
        C9367f.m39526e(charSequence2, "prefix");
        C9367f.m39526e(charSequence3, "postfix");
        C9367f.m39526e(charSequence4, "truncated");
        a10.append(charSequence2);
        Iterator<? extends T> it = iterable.iterator();
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

    /* renamed from: w */
    public static /* synthetic */ Appendable m27727w(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC9196l interfaceC9196l, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 4) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 8) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 16) != 0) {
            i10 = -1;
        }
        if ((i11 & 32) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 64) != 0) {
            interfaceC9196l = null;
        }
        return m27726v(iterable, appendable, charSequence, charSequence2, charSequence3, i10, charSequence4, interfaceC9196l);
    }

    @NotNull
    /* renamed from: x */
    public static final <T> String m27728x(@NotNull Iterable<? extends T> iterable, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i10, @NotNull CharSequence charSequence4, @Nullable InterfaceC9196l<? super T, ? extends CharSequence> interfaceC9196l) {
        C9367f.m39526e(iterable, "<this>");
        C9367f.m39526e(charSequence, "separator");
        C9367f.m39526e(charSequence2, "prefix");
        C9367f.m39526e(charSequence3, "postfix");
        C9367f.m39526e(charSequence4, "truncated");
        String sb2 = ((StringBuilder) m27726v(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, interfaceC9196l)).toString();
        C9367f.m39525d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: y */
    public static /* synthetic */ String m27729y(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC9196l interfaceC9196l, int i11, Object obj) {
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
        return m27728x(iterable, charSequence, charSequence2, charSequence3, i10, charSequence4, interfaceC9196l);
    }

    /* renamed from: z */
    public static final <T> T m27730z(@NotNull List<? extends T> list) {
        C9367f.m39526e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(C5616j.m27701g(list));
    }
}
