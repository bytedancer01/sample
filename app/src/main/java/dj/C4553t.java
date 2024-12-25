package dj;

import com.amazonaws.services.p045s3.Headers;
import com.amplifyframework.core.model.ModelIdentifier;
import dj.AbstractC4549p;
import fj.InterfaceC4888a;
import fj.InterfaceC4889b;
import fj.InterfaceC4890c;
import fj.InterfaceC4891d;
import fj.InterfaceC4892e;
import fj.InterfaceC4893f;
import fj.InterfaceC4894g;
import fj.InterfaceC4895h;
import fj.InterfaceC4896i;
import fj.InterfaceC4897j;
import fj.InterfaceC4898k;
import fj.InterfaceC4899l;
import fj.InterfaceC4900m;
import fj.InterfaceC4901n;
import fj.InterfaceC4902o;
import fj.InterfaceC4903p;
import fj.InterfaceC4904q;
import fj.InterfaceC4905r;
import fj.InterfaceC4906s;
import fj.InterfaceC4907t;
import fj.InterfaceC4908u;
import fj.InterfaceC4909v;
import fj.InterfaceC4911x;
import fj.InterfaceC4912y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPut;
import p173ji.C5400a0;
import p173ji.C5406d0;
import p173ji.C5432w;
import p173ji.C5433x;
import p173ji.C5435z;
import p233nh.InterfaceC6789d;

/* renamed from: dj.t */
/* loaded from: combined.jar:classes3.jar:dj/t.class */
public final class C4553t {

    /* renamed from: a */
    public final Method f27093a;

    /* renamed from: b */
    public final C5433x f27094b;

    /* renamed from: c */
    public final String f27095c;

    /* renamed from: d */
    public final String f27096d;

    /* renamed from: e */
    public final C5432w f27097e;

    /* renamed from: f */
    public final C5435z f27098f;

    /* renamed from: g */
    public final boolean f27099g;

    /* renamed from: h */
    public final boolean f27100h;

    /* renamed from: i */
    public final boolean f27101i;

    /* renamed from: j */
    public final AbstractC4549p<?>[] f27102j;

    /* renamed from: k */
    public final boolean f27103k;

    /* renamed from: dj.t$a */
    /* loaded from: combined.jar:classes3.jar:dj/t$a.class */
    public static final class a {

        /* renamed from: x */
        public static final Pattern f27104x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y */
        public static final Pattern f27105y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        public final C4555v f27106a;

        /* renamed from: b */
        public final Method f27107b;

        /* renamed from: c */
        public final Annotation[] f27108c;

        /* renamed from: d */
        public final Annotation[][] f27109d;

        /* renamed from: e */
        public final Type[] f27110e;

        /* renamed from: f */
        public boolean f27111f;

        /* renamed from: g */
        public boolean f27112g;

        /* renamed from: h */
        public boolean f27113h;

        /* renamed from: i */
        public boolean f27114i;

        /* renamed from: j */
        public boolean f27115j;

        /* renamed from: k */
        public boolean f27116k;

        /* renamed from: l */
        public boolean f27117l;

        /* renamed from: m */
        public boolean f27118m;

        /* renamed from: n */
        public String f27119n;

        /* renamed from: o */
        public boolean f27120o;

        /* renamed from: p */
        public boolean f27121p;

        /* renamed from: q */
        public boolean f27122q;

        /* renamed from: r */
        public String f27123r;

        /* renamed from: s */
        public C5432w f27124s;

        /* renamed from: t */
        public C5435z f27125t;

        /* renamed from: u */
        public Set<String> f27126u;

        /* renamed from: v */
        public AbstractC4549p<?>[] f27127v;

        /* renamed from: w */
        public boolean f27128w;

        public a(C4555v c4555v, Method method) {
            this.f27106a = c4555v;
            this.f27107b = method;
            this.f27108c = method.getAnnotations();
            this.f27110e = method.getGenericParameterTypes();
            this.f27109d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        public static Class<?> m22940a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            Class<?> cls2 = cls;
            if (Short.TYPE == cls) {
                cls2 = Short.class;
            }
            return cls2;
        }

        /* renamed from: h */
        public static Set<String> m22941h(String str) {
            Matcher matcher = f27104x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        /* renamed from: b */
        public C4553t m22942b() {
            for (Annotation annotation : this.f27108c) {
                m22945e(annotation);
            }
            if (this.f27119n == null) {
                throw C4559z.m22987m(this.f27107b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f27120o) {
                if (this.f27122q) {
                    throw C4559z.m22987m(this.f27107b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f27121p) {
                    throw C4559z.m22987m(this.f27107b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f27109d.length;
            this.f27127v = new AbstractC4549p[length];
            int i10 = 0;
            while (true) {
                boolean z10 = true;
                if (i10 >= length) {
                    break;
                }
                AbstractC4549p<?>[] abstractC4549pArr = this.f27127v;
                Type type = this.f27110e[i10];
                Annotation[] annotationArr = this.f27109d[i10];
                if (i10 != length - 1) {
                    z10 = false;
                }
                abstractC4549pArr[i10] = m22946f(i10, type, annotationArr, z10);
                i10++;
            }
            if (this.f27123r == null && !this.f27118m) {
                throw C4559z.m22987m(this.f27107b, "Missing either @%s URL or @Url parameter.", this.f27119n);
            }
            boolean z11 = this.f27121p;
            if (!z11 && !this.f27122q && !this.f27120o && this.f27113h) {
                throw C4559z.m22987m(this.f27107b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z11 && !this.f27111f) {
                throw C4559z.m22987m(this.f27107b, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f27122q || this.f27112g) {
                return new C4553t(this);
            }
            throw C4559z.m22987m(this.f27107b, "Multipart method must contain at least one @Part.", new Object[0]);
        }

        /* renamed from: c */
        public final C5432w m22943c(String[] strArr) {
            C5432w.a aVar = new C5432w.a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw C4559z.m22987m(this.f27107b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.f27125t = C5435z.m27173e(trim);
                    } catch (IllegalArgumentException e10) {
                        throw C4559z.m22988n(this.f27107b, e10, "Malformed content type: %s", trim);
                    }
                } else {
                    aVar.m27087a(substring, trim);
                }
            }
            return aVar.m27092f();
        }

        /* renamed from: d */
        public final void m22944d(String str, String str2, boolean z10) {
            String str3 = this.f27119n;
            if (str3 != null) {
                throw C4559z.m22987m(this.f27107b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f27119n = str;
            this.f27120o = z10;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (f27104x.matcher(substring).find()) {
                    throw C4559z.m22987m(this.f27107b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.f27123r = str2;
            this.f27126u = m22941h(str2);
        }

        /* renamed from: e */
        public final void m22945e(Annotation annotation) {
            String value;
            String str;
            String value2;
            String str2;
            if (annotation instanceof InterfaceC4889b) {
                value = ((InterfaceC4889b) annotation).value();
                str = HttpDelete.METHOD_NAME;
            } else if (annotation instanceof InterfaceC4893f) {
                value = ((InterfaceC4893f) annotation).value();
                str = HttpGet.METHOD_NAME;
            } else {
                if (!(annotation instanceof InterfaceC4894g)) {
                    if (annotation instanceof InterfaceC4901n) {
                        value2 = ((InterfaceC4901n) annotation).value();
                        str2 = HttpPatch.METHOD_NAME;
                    } else if (annotation instanceof InterfaceC4902o) {
                        value2 = ((InterfaceC4902o) annotation).value();
                        str2 = "POST";
                    } else if (annotation instanceof InterfaceC4903p) {
                        value2 = ((InterfaceC4903p) annotation).value();
                        str2 = HttpPut.METHOD_NAME;
                    } else {
                        if (!(annotation instanceof InterfaceC4900m)) {
                            if (annotation instanceof InterfaceC4895h) {
                                InterfaceC4895h interfaceC4895h = (InterfaceC4895h) annotation;
                                m22944d(interfaceC4895h.method(), interfaceC4895h.path(), interfaceC4895h.hasBody());
                                return;
                            }
                            if (annotation instanceof InterfaceC4898k) {
                                String[] value3 = ((InterfaceC4898k) annotation).value();
                                if (value3.length == 0) {
                                    throw C4559z.m22987m(this.f27107b, "@Headers annotation is empty.", new Object[0]);
                                }
                                this.f27124s = m22943c(value3);
                                return;
                            }
                            if (annotation instanceof InterfaceC4899l) {
                                if (this.f27121p) {
                                    throw C4559z.m22987m(this.f27107b, "Only one encoding annotation is allowed.", new Object[0]);
                                }
                                this.f27122q = true;
                                return;
                            } else {
                                if (annotation instanceof InterfaceC4892e) {
                                    if (this.f27122q) {
                                        throw C4559z.m22987m(this.f27107b, "Only one encoding annotation is allowed.", new Object[0]);
                                    }
                                    this.f27121p = true;
                                    return;
                                }
                                return;
                            }
                        }
                        value = ((InterfaceC4900m) annotation).value();
                        str = HttpOptions.METHOD_NAME;
                    }
                    m22944d(str2, value2, true);
                    return;
                }
                value = ((InterfaceC4894g) annotation).value();
                str = HttpHead.METHOD_NAME;
            }
            m22944d(str, value, false);
        }

        /* renamed from: f */
        public final AbstractC4549p<?> m22946f(int i10, Type type, Annotation[] annotationArr, boolean z10) {
            AbstractC4549p<?> abstractC4549p;
            if (annotationArr != null) {
                int length = annotationArr.length;
                AbstractC4549p<?> abstractC4549p2 = null;
                int i11 = 0;
                while (true) {
                    abstractC4549p = abstractC4549p2;
                    if (i11 >= length) {
                        break;
                    }
                    AbstractC4549p<?> m22947g = m22947g(i10, type, annotationArr, annotationArr[i11]);
                    if (m22947g != null) {
                        if (abstractC4549p2 != null) {
                            throw C4559z.m22989o(this.f27107b, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        abstractC4549p2 = m22947g;
                    }
                    i11++;
                }
            } else {
                abstractC4549p = null;
            }
            if (abstractC4549p != null) {
                return abstractC4549p;
            }
            if (z10) {
                try {
                    if (C4559z.m22982h(type) == InterfaceC6789d.class) {
                        this.f27128w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError e10) {
                }
            }
            throw C4559z.m22989o(this.f27107b, i10, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: g */
        public final AbstractC4549p<?> m22947g(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof InterfaceC4912y) {
                m22949j(i10, type);
                if (this.f27118m) {
                    throw C4559z.m22989o(this.f27107b, i10, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f27114i) {
                    throw C4559z.m22989o(this.f27107b, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f27115j) {
                    throw C4559z.m22989o(this.f27107b, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f27116k) {
                    throw C4559z.m22989o(this.f27107b, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f27117l) {
                    throw C4559z.m22989o(this.f27107b, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f27123r != null) {
                    throw C4559z.m22989o(this.f27107b, i10, "@Url cannot be used with @%s URL", this.f27119n);
                }
                this.f27118m = true;
                if (type == C5433x.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new AbstractC4549p.p(this.f27107b, i10);
                }
                throw C4559z.m22989o(this.f27107b, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof InterfaceC4906s) {
                m22949j(i10, type);
                if (this.f27115j) {
                    throw C4559z.m22989o(this.f27107b, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f27116k) {
                    throw C4559z.m22989o(this.f27107b, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f27117l) {
                    throw C4559z.m22989o(this.f27107b, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f27118m) {
                    throw C4559z.m22989o(this.f27107b, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f27123r == null) {
                    throw C4559z.m22989o(this.f27107b, i10, "@Path can only be used with relative url on @%s", this.f27119n);
                }
                this.f27114i = true;
                InterfaceC4906s interfaceC4906s = (InterfaceC4906s) annotation;
                String value = interfaceC4906s.value();
                m22948i(i10, value);
                return new AbstractC4549p.k(this.f27107b, i10, value, this.f27106a.m22965i(type, annotationArr), interfaceC4906s.encoded());
            }
            if (annotation instanceof InterfaceC4907t) {
                m22949j(i10, type);
                InterfaceC4907t interfaceC4907t = (InterfaceC4907t) annotation;
                String value2 = interfaceC4907t.value();
                boolean encoded = interfaceC4907t.encoded();
                Class<?> m22982h = C4559z.m22982h(type);
                this.f27115j = true;
                if (!Iterable.class.isAssignableFrom(m22982h)) {
                    return m22982h.isArray() ? new AbstractC4549p.l(value2, this.f27106a.m22965i(m22940a(m22982h.getComponentType()), annotationArr), encoded).m22904b() : new AbstractC4549p.l(value2, this.f27106a.m22965i(type, annotationArr), encoded);
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC4549p.l(value2, this.f27106a.m22965i(C4559z.m22981g(0, (ParameterizedType) type), annotationArr), encoded).m22905c();
                }
                throw C4559z.m22989o(this.f27107b, i10, m22982h.getSimpleName() + " must include generic type (e.g., " + m22982h.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC4909v) {
                m22949j(i10, type);
                boolean encoded2 = ((InterfaceC4909v) annotation).encoded();
                Class<?> m22982h2 = C4559z.m22982h(type);
                this.f27116k = true;
                if (!Iterable.class.isAssignableFrom(m22982h2)) {
                    return m22982h2.isArray() ? new AbstractC4549p.n(this.f27106a.m22965i(m22940a(m22982h2.getComponentType()), annotationArr), encoded2).m22904b() : new AbstractC4549p.n(this.f27106a.m22965i(type, annotationArr), encoded2);
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC4549p.n(this.f27106a.m22965i(C4559z.m22981g(0, (ParameterizedType) type), annotationArr), encoded2).m22905c();
                }
                throw C4559z.m22989o(this.f27107b, i10, m22982h2.getSimpleName() + " must include generic type (e.g., " + m22982h2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC4908u) {
                m22949j(i10, type);
                Class<?> m22982h3 = C4559z.m22982h(type);
                this.f27117l = true;
                if (!Map.class.isAssignableFrom(m22982h3)) {
                    throw C4559z.m22989o(this.f27107b, i10, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type m22983i = C4559z.m22983i(type, m22982h3, Map.class);
                if (!(m22983i instanceof ParameterizedType)) {
                    throw C4559z.m22989o(this.f27107b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) m22983i;
                Type m22981g = C4559z.m22981g(0, parameterizedType);
                if (String.class == m22981g) {
                    return new AbstractC4549p.m(this.f27107b, i10, this.f27106a.m22965i(C4559z.m22981g(1, parameterizedType), annotationArr), ((InterfaceC4908u) annotation).encoded());
                }
                throw C4559z.m22989o(this.f27107b, i10, "@QueryMap keys must be of type String: " + m22981g, new Object[0]);
            }
            if (annotation instanceof InterfaceC4896i) {
                m22949j(i10, type);
                String value3 = ((InterfaceC4896i) annotation).value();
                Class<?> m22982h4 = C4559z.m22982h(type);
                if (!Iterable.class.isAssignableFrom(m22982h4)) {
                    return m22982h4.isArray() ? new AbstractC4549p.f(value3, this.f27106a.m22965i(m22940a(m22982h4.getComponentType()), annotationArr)).m22904b() : new AbstractC4549p.f(value3, this.f27106a.m22965i(type, annotationArr));
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC4549p.f(value3, this.f27106a.m22965i(C4559z.m22981g(0, (ParameterizedType) type), annotationArr)).m22905c();
                }
                throw C4559z.m22989o(this.f27107b, i10, m22982h4.getSimpleName() + " must include generic type (e.g., " + m22982h4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC4897j) {
                if (type == C5432w.class) {
                    return new AbstractC4549p.h(this.f27107b, i10);
                }
                m22949j(i10, type);
                Class<?> m22982h5 = C4559z.m22982h(type);
                if (!Map.class.isAssignableFrom(m22982h5)) {
                    throw C4559z.m22989o(this.f27107b, i10, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type m22983i2 = C4559z.m22983i(type, m22982h5, Map.class);
                if (!(m22983i2 instanceof ParameterizedType)) {
                    throw C4559z.m22989o(this.f27107b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) m22983i2;
                Type m22981g2 = C4559z.m22981g(0, parameterizedType2);
                if (String.class == m22981g2) {
                    return new AbstractC4549p.g(this.f27107b, i10, this.f27106a.m22965i(C4559z.m22981g(1, parameterizedType2), annotationArr));
                }
                throw C4559z.m22989o(this.f27107b, i10, "@HeaderMap keys must be of type String: " + m22981g2, new Object[0]);
            }
            if (annotation instanceof InterfaceC4890c) {
                m22949j(i10, type);
                if (!this.f27121p) {
                    throw C4559z.m22989o(this.f27107b, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                InterfaceC4890c interfaceC4890c = (InterfaceC4890c) annotation;
                String value4 = interfaceC4890c.value();
                boolean encoded3 = interfaceC4890c.encoded();
                this.f27111f = true;
                Class<?> m22982h6 = C4559z.m22982h(type);
                if (!Iterable.class.isAssignableFrom(m22982h6)) {
                    return m22982h6.isArray() ? new AbstractC4549p.d(value4, this.f27106a.m22965i(m22940a(m22982h6.getComponentType()), annotationArr), encoded3).m22904b() : new AbstractC4549p.d(value4, this.f27106a.m22965i(type, annotationArr), encoded3);
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC4549p.d(value4, this.f27106a.m22965i(C4559z.m22981g(0, (ParameterizedType) type), annotationArr), encoded3).m22905c();
                }
                throw C4559z.m22989o(this.f27107b, i10, m22982h6.getSimpleName() + " must include generic type (e.g., " + m22982h6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC4891d) {
                m22949j(i10, type);
                if (!this.f27121p) {
                    throw C4559z.m22989o(this.f27107b, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> m22982h7 = C4559z.m22982h(type);
                if (!Map.class.isAssignableFrom(m22982h7)) {
                    throw C4559z.m22989o(this.f27107b, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type m22983i3 = C4559z.m22983i(type, m22982h7, Map.class);
                if (!(m22983i3 instanceof ParameterizedType)) {
                    throw C4559z.m22989o(this.f27107b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) m22983i3;
                Type m22981g3 = C4559z.m22981g(0, parameterizedType3);
                if (String.class == m22981g3) {
                    InterfaceC4539f m22965i = this.f27106a.m22965i(C4559z.m22981g(1, parameterizedType3), annotationArr);
                    this.f27111f = true;
                    return new AbstractC4549p.e(this.f27107b, i10, m22965i, ((InterfaceC4891d) annotation).encoded());
                }
                throw C4559z.m22989o(this.f27107b, i10, "@FieldMap keys must be of type String: " + m22981g3, new Object[0]);
            }
            if (annotation instanceof InterfaceC4904q) {
                m22949j(i10, type);
                if (!this.f27122q) {
                    throw C4559z.m22989o(this.f27107b, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
                InterfaceC4904q interfaceC4904q = (InterfaceC4904q) annotation;
                this.f27112g = true;
                String value5 = interfaceC4904q.value();
                Class<?> m22982h8 = C4559z.m22982h(type);
                if (value5.isEmpty()) {
                    if (!Iterable.class.isAssignableFrom(m22982h8)) {
                        if (m22982h8.isArray()) {
                            if (C5400a0.c.class.isAssignableFrom(m22982h8.getComponentType())) {
                                return AbstractC4549p.o.f27070a.m22904b();
                            }
                            throw C4559z.m22989o(this.f27107b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        if (C5400a0.c.class.isAssignableFrom(m22982h8)) {
                            return AbstractC4549p.o.f27070a;
                        }
                        throw C4559z.m22989o(this.f27107b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (type instanceof ParameterizedType) {
                        if (C5400a0.c.class.isAssignableFrom(C4559z.m22982h(C4559z.m22981g(0, (ParameterizedType) type)))) {
                            return AbstractC4549p.o.f27070a.m22905c();
                        }
                        throw C4559z.m22989o(this.f27107b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    throw C4559z.m22989o(this.f27107b, i10, m22982h8.getSimpleName() + " must include generic type (e.g., " + m22982h8.getSimpleName() + "<String>)", new Object[0]);
                }
                C5432w m27080g = C5432w.m27080g(Headers.CONTENT_DISPOSITION, "form-data; name=\"" + value5 + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, "Content-Transfer-Encoding", interfaceC4904q.encoding());
                if (!Iterable.class.isAssignableFrom(m22982h8)) {
                    if (!m22982h8.isArray()) {
                        if (C5400a0.c.class.isAssignableFrom(m22982h8)) {
                            throw C4559z.m22989o(this.f27107b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                        return new AbstractC4549p.i(this.f27107b, i10, m27080g, this.f27106a.m22963g(type, annotationArr, this.f27108c));
                    }
                    Class<?> m22940a = m22940a(m22982h8.getComponentType());
                    if (C5400a0.c.class.isAssignableFrom(m22940a)) {
                        throw C4559z.m22989o(this.f27107b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new AbstractC4549p.i(this.f27107b, i10, m27080g, this.f27106a.m22963g(m22940a, annotationArr, this.f27108c)).m22904b();
                }
                if (type instanceof ParameterizedType) {
                    Type m22981g4 = C4559z.m22981g(0, (ParameterizedType) type);
                    if (C5400a0.c.class.isAssignableFrom(C4559z.m22982h(m22981g4))) {
                        throw C4559z.m22989o(this.f27107b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new AbstractC4549p.i(this.f27107b, i10, m27080g, this.f27106a.m22963g(m22981g4, annotationArr, this.f27108c)).m22905c();
                }
                throw C4559z.m22989o(this.f27107b, i10, m22982h8.getSimpleName() + " must include generic type (e.g., " + m22982h8.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC4905r) {
                m22949j(i10, type);
                if (!this.f27122q) {
                    throw C4559z.m22989o(this.f27107b, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                }
                this.f27112g = true;
                Class<?> m22982h9 = C4559z.m22982h(type);
                if (!Map.class.isAssignableFrom(m22982h9)) {
                    throw C4559z.m22989o(this.f27107b, i10, "@PartMap parameter type must be Map.", new Object[0]);
                }
                Type m22983i4 = C4559z.m22983i(type, m22982h9, Map.class);
                if (!(m22983i4 instanceof ParameterizedType)) {
                    throw C4559z.m22989o(this.f27107b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType4 = (ParameterizedType) m22983i4;
                Type m22981g5 = C4559z.m22981g(0, parameterizedType4);
                if (String.class == m22981g5) {
                    Type m22981g6 = C4559z.m22981g(1, parameterizedType4);
                    if (C5400a0.c.class.isAssignableFrom(C4559z.m22982h(m22981g6))) {
                        throw C4559z.m22989o(this.f27107b, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                    }
                    return new AbstractC4549p.j(this.f27107b, i10, this.f27106a.m22963g(m22981g6, annotationArr, this.f27108c), ((InterfaceC4905r) annotation).encoding());
                }
                throw C4559z.m22989o(this.f27107b, i10, "@PartMap keys must be of type String: " + m22981g5, new Object[0]);
            }
            if (annotation instanceof InterfaceC4888a) {
                m22949j(i10, type);
                if (this.f27121p || this.f27122q) {
                    throw C4559z.m22989o(this.f27107b, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                }
                if (this.f27113h) {
                    throw C4559z.m22989o(this.f27107b, i10, "Multiple @Body method annotations found.", new Object[0]);
                }
                try {
                    InterfaceC4539f m22963g = this.f27106a.m22963g(type, annotationArr, this.f27108c);
                    this.f27113h = true;
                    return new AbstractC4549p.c(this.f27107b, i10, m22963g);
                } catch (RuntimeException e10) {
                    throw C4559z.m22990p(this.f27107b, e10, i10, "Unable to create @Body converter for %s", type);
                }
            }
            if (!(annotation instanceof InterfaceC4911x)) {
                return null;
            }
            m22949j(i10, type);
            Class<?> m22982h10 = C4559z.m22982h(type);
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                AbstractC4549p<?> abstractC4549p = this.f27127v[i11];
                if ((abstractC4549p instanceof AbstractC4549p.q) && ((AbstractC4549p.q) abstractC4549p).f27073a.equals(m22982h10)) {
                    throw C4559z.m22989o(this.f27107b, i10, "@Tag type " + m22982h10.getName() + " is duplicate of parameter #" + (i11 + 1) + " and would always overwrite its value.", new Object[0]);
                }
            }
            return new AbstractC4549p.q(m22982h10);
        }

        /* renamed from: i */
        public final void m22948i(int i10, String str) {
            if (!f27105y.matcher(str).matches()) {
                throw C4559z.m22989o(this.f27107b, i10, "@Path parameter name must match %s. Found: %s", f27104x.pattern(), str);
            }
            if (!this.f27126u.contains(str)) {
                throw C4559z.m22989o(this.f27107b, i10, "URL \"%s\" does not contain \"{%s}\".", this.f27123r, str);
            }
        }

        /* renamed from: j */
        public final void m22949j(int i10, Type type) {
            if (C4559z.m22984j(type)) {
                throw C4559z.m22989o(this.f27107b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public C4553t(a aVar) {
        this.f27093a = aVar.f27107b;
        this.f27094b = aVar.f27106a.f27134c;
        this.f27095c = aVar.f27119n;
        this.f27096d = aVar.f27123r;
        this.f27097e = aVar.f27124s;
        this.f27098f = aVar.f27125t;
        this.f27099g = aVar.f27120o;
        this.f27100h = aVar.f27121p;
        this.f27101i = aVar.f27122q;
        this.f27102j = aVar.f27127v;
        this.f27103k = aVar.f27128w;
    }

    /* renamed from: b */
    public static C4553t m22938b(C4555v c4555v, Method method) {
        return new a(c4555v, method).m22942b();
    }

    /* renamed from: a */
    public C5406d0 m22939a(Object[] objArr) {
        AbstractC4549p<?>[] abstractC4549pArr = this.f27102j;
        int length = objArr.length;
        if (length != abstractC4549pArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + abstractC4549pArr.length + ")");
        }
        C4552s c4552s = new C4552s(this.f27095c, this.f27094b, this.f27096d, this.f27097e, this.f27098f, this.f27099g, this.f27100h, this.f27101i);
        int i10 = length;
        if (this.f27103k) {
            i10 = length - 1;
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(objArr[i11]);
            abstractC4549pArr[i11].mo22903a(c4552s, objArr[i11]);
        }
        return c4552s.m22932k().m26891k(C4545l.class, new C4545l(this.f27093a, arrayList)).m26883b();
    }
}
