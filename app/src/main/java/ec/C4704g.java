package ec;

import java.io.IOException;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ec/g.class
 */
/* renamed from: ec.g */
/* loaded from: combined.jar:classes2.jar:ec/g.class */
public class C4704g {

    /* renamed from: a */
    public final String f27721a;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ec/g$a.class
     */
    /* renamed from: ec.g$a */
    /* loaded from: combined.jar:classes2.jar:ec/g$a.class */
    public class a extends C4704g {

        /* renamed from: b */
        public final String f27722b;

        /* renamed from: c */
        public final C4704g f27723c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4704g c4704g, C4704g c4704g2, String str) {
            super(c4704g2, null);
            this.f27723c = c4704g;
            this.f27722b = str;
        }

        @Override // ec.C4704g
        /* renamed from: g */
        public CharSequence mo23653g(@NullableDecl Object obj) {
            return obj == null ? this.f27722b : this.f27723c.mo23653g(obj);
        }

        @Override // ec.C4704g
        /* renamed from: h */
        public C4704g mo23654h(String str) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    public C4704g(C4704g c4704g) {
        this.f27721a = c4704g.f27721a;
    }

    public /* synthetic */ C4704g(C4704g c4704g, a aVar) {
        this(c4704g);
    }

    public C4704g(String str) {
        this.f27721a = (String) C4708k.m23668j(str);
    }

    /* renamed from: e */
    public static C4704g m23647e(char c10) {
        return new C4704g(String.valueOf(c10));
    }

    /* renamed from: f */
    public static C4704g m23648f(String str) {
        return new C4704g(str);
    }

    /* renamed from: a */
    public <A extends Appendable> A m23649a(A a10, Iterator<?> it) {
        C4708k.m23668j(a10);
        if (it.hasNext()) {
            while (true) {
                a10.append(mo23653g(it.next()));
                if (!it.hasNext()) {
                    break;
                }
                a10.append(this.f27721a);
            }
        }
        return a10;
    }

    /* renamed from: b */
    public final StringBuilder m23650b(StringBuilder sb2, Iterator<?> it) {
        try {
            m23649a(sb2, it);
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: c */
    public final String m23651c(Iterable<?> iterable) {
        return m23652d(iterable.iterator());
    }

    /* renamed from: d */
    public final String m23652d(Iterator<?> it) {
        return m23650b(new StringBuilder(), it).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.CharSequence] */
    /* renamed from: g */
    public CharSequence mo23653g(Object obj) {
        C4708k.m23668j(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    /* renamed from: h */
    public C4704g mo23654h(String str) {
        C4708k.m23668j(str);
        return new a(this, this, str);
    }
}
