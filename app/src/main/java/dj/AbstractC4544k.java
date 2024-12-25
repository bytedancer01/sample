package dj;

import dj.C4559z;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.apache.http.client.methods.HttpHead;
import p173ji.AbstractC5412g0;
import p173ji.C5410f0;
import p173ji.InterfaceC5407e;
import p233nh.InterfaceC6789d;

/* renamed from: dj.k */
/* loaded from: combined.jar:classes3.jar:dj/k.class */
public abstract class AbstractC4544k<ResponseT, ReturnT> extends AbstractC4556w<ReturnT> {

    /* renamed from: a */
    public final C4553t f26991a;

    /* renamed from: b */
    public final InterfaceC5407e.a f26992b;

    /* renamed from: c */
    public final InterfaceC4539f<AbstractC5412g0, ResponseT> f26993c;

    /* renamed from: dj.k$a */
    /* loaded from: combined.jar:classes3.jar:dj/k$a.class */
    public static final class a<ResponseT, ReturnT> extends AbstractC4544k<ResponseT, ReturnT> {

        /* renamed from: d */
        public final InterfaceC4536c<ResponseT, ReturnT> f26994d;

        public a(C4553t c4553t, InterfaceC5407e.a aVar, InterfaceC4539f<AbstractC5412g0, ResponseT> interfaceC4539f, InterfaceC4536c<ResponseT, ReturnT> interfaceC4536c) {
            super(c4553t, aVar, interfaceC4539f);
            this.f26994d = interfaceC4536c;
        }

        @Override // dj.AbstractC4544k
        /* renamed from: c */
        public ReturnT mo22883c(InterfaceC4535b<ResponseT> interfaceC4535b, Object[] objArr) {
            return this.f26994d.mo22864b(interfaceC4535b);
        }
    }

    /* renamed from: dj.k$b */
    /* loaded from: combined.jar:classes3.jar:dj/k$b.class */
    public static final class b<ResponseT> extends AbstractC4544k<ResponseT, Object> {

        /* renamed from: d */
        public final InterfaceC4536c<ResponseT, InterfaceC4535b<ResponseT>> f26995d;

        /* renamed from: e */
        public final boolean f26996e;

        public b(C4553t c4553t, InterfaceC5407e.a aVar, InterfaceC4539f<AbstractC5412g0, ResponseT> interfaceC4539f, InterfaceC4536c<ResponseT, InterfaceC4535b<ResponseT>> interfaceC4536c, boolean z10) {
            super(c4553t, aVar, interfaceC4539f);
            this.f26995d = interfaceC4536c;
            this.f26996e = z10;
        }

        @Override // dj.AbstractC4544k
        /* renamed from: c */
        public Object mo22883c(InterfaceC4535b<ResponseT> interfaceC4535b, Object[] objArr) {
            InterfaceC4535b<ResponseT> mo22864b = this.f26995d.mo22864b(interfaceC4535b);
            InterfaceC6789d interfaceC6789d = (InterfaceC6789d) objArr[objArr.length - 1];
            try {
                return this.f26996e ? C4546m.m22886b(mo22864b, interfaceC6789d) : C4546m.m22885a(mo22864b, interfaceC6789d);
            } catch (Exception e10) {
                return C4546m.m22888d(e10, interfaceC6789d);
            }
        }
    }

    /* renamed from: dj.k$c */
    /* loaded from: combined.jar:classes3.jar:dj/k$c.class */
    public static final class c<ResponseT> extends AbstractC4544k<ResponseT, Object> {

        /* renamed from: d */
        public final InterfaceC4536c<ResponseT, InterfaceC4535b<ResponseT>> f26997d;

        public c(C4553t c4553t, InterfaceC5407e.a aVar, InterfaceC4539f<AbstractC5412g0, ResponseT> interfaceC4539f, InterfaceC4536c<ResponseT, InterfaceC4535b<ResponseT>> interfaceC4536c) {
            super(c4553t, aVar, interfaceC4539f);
            this.f26997d = interfaceC4536c;
        }

        @Override // dj.AbstractC4544k
        /* renamed from: c */
        public Object mo22883c(InterfaceC4535b<ResponseT> interfaceC4535b, Object[] objArr) {
            InterfaceC4535b<ResponseT> mo22864b = this.f26997d.mo22864b(interfaceC4535b);
            InterfaceC6789d interfaceC6789d = (InterfaceC6789d) objArr[objArr.length - 1];
            try {
                return C4546m.m22887c(mo22864b, interfaceC6789d);
            } catch (Exception e10) {
                return C4546m.m22888d(e10, interfaceC6789d);
            }
        }
    }

    public AbstractC4544k(C4553t c4553t, InterfaceC5407e.a aVar, InterfaceC4539f<AbstractC5412g0, ResponseT> interfaceC4539f) {
        this.f26991a = c4553t;
        this.f26992b = aVar;
        this.f26993c = interfaceC4539f;
    }

    /* renamed from: d */
    public static <ResponseT, ReturnT> InterfaceC4536c<ResponseT, ReturnT> m22879d(C4555v c4555v, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (InterfaceC4536c<ResponseT, ReturnT>) c4555v.m22957a(type, annotationArr);
        } catch (RuntimeException e10) {
            throw C4559z.m22988n(method, e10, "Unable to create call adapter for %s", type);
        }
    }

    /* renamed from: e */
    public static <ResponseT> InterfaceC4539f<AbstractC5412g0, ResponseT> m22880e(C4555v c4555v, Method method, Type type) {
        try {
            return c4555v.m22964h(type, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw C4559z.m22988n(method, e10, "Unable to create converter for %s", type);
        }
    }

    /* renamed from: f */
    public static <ResponseT, ReturnT> AbstractC4544k<ResponseT, ReturnT> m22881f(C4555v c4555v, Method method, C4553t c4553t) {
        Type genericReturnType;
        boolean z10;
        boolean z11 = c4553t.f27103k;
        Annotation[] annotations = method.getAnnotations();
        if (z11) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type m22980f = C4559z.m22980f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (C4559z.m22982h(m22980f) == C4554u.class && (m22980f instanceof ParameterizedType)) {
                m22980f = C4559z.m22981g(0, (ParameterizedType) m22980f);
                z10 = true;
            } else {
                z10 = false;
            }
            genericReturnType = new C4559z.b(null, InterfaceC4535b.class, m22980f);
            annotations = C4558y.m22974a(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z10 = false;
        }
        InterfaceC4536c m22879d = m22879d(c4555v, method, genericReturnType, annotations);
        Type mo22863a = m22879d.mo22863a();
        if (mo22863a == C5410f0.class) {
            throw C4559z.m22987m(method, "'" + C4559z.m22982h(mo22863a).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (mo22863a == C4554u.class) {
            throw C4559z.m22987m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (c4553t.f27095c.equals(HttpHead.METHOD_NAME) && !Void.class.equals(mo22863a)) {
            throw C4559z.m22987m(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        InterfaceC4539f m22880e = m22880e(c4555v, method, mo22863a);
        InterfaceC5407e.a aVar = c4555v.f27133b;
        return !z11 ? new a(c4553t, aVar, m22880e, m22879d) : z10 ? new c(c4553t, aVar, m22880e, m22879d) : new b(c4553t, aVar, m22880e, m22879d, false);
    }

    @Override // dj.AbstractC4556w
    /* renamed from: a */
    public final ReturnT mo22882a(Object[] objArr) {
        return mo22883c(new C4547n(this.f26991a, objArr, this.f26992b, this.f26993c), objArr);
    }

    /* renamed from: c */
    public abstract ReturnT mo22883c(InterfaceC4535b<ResponseT> interfaceC4535b, Object[] objArr);
}
