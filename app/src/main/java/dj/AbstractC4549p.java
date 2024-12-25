package dj;

import com.amazonaws.services.p045s3.Headers;
import com.amplifyframework.core.model.ModelIdentifier;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p173ji.AbstractC5408e0;
import p173ji.C5400a0;
import p173ji.C5432w;

/* renamed from: dj.p */
/* loaded from: combined.jar:classes3.jar:dj/p.class */
public abstract class AbstractC4549p<T> {

    /* renamed from: dj.p$a */
    /* loaded from: combined.jar:classes3.jar:dj/p$a.class */
    public class a extends AbstractC4549p<Iterable<T>> {

        /* renamed from: a */
        public final AbstractC4549p f27029a;

        public a(AbstractC4549p abstractC4549p) {
            this.f27029a = abstractC4549p;
        }

        @Override // dj.AbstractC4549p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo22903a(C4552s c4552s, Iterable<T> iterable) {
            if (iterable == null) {
                return;
            }
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                this.f27029a.mo22903a(c4552s, it.next());
            }
        }
    }

    /* renamed from: dj.p$b */
    /* loaded from: combined.jar:classes3.jar:dj/p$b.class */
    public class b extends AbstractC4549p<Object> {

        /* renamed from: a */
        public final AbstractC4549p f27030a;

        public b(AbstractC4549p abstractC4549p) {
            this.f27030a = abstractC4549p;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dj.AbstractC4549p
        /* renamed from: a */
        public void mo22903a(C4552s c4552s, Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                this.f27030a.mo22903a(c4552s, Array.get(obj, i10));
            }
        }
    }

    /* renamed from: dj.p$c */
    /* loaded from: combined.jar:classes3.jar:dj/p$c.class */
    public static final class c<T> extends AbstractC4549p<T> {

        /* renamed from: a */
        public final Method f27031a;

        /* renamed from: b */
        public final int f27032b;

        /* renamed from: c */
        public final InterfaceC4539f<T, AbstractC5408e0> f27033c;

        public c(Method method, int i10, InterfaceC4539f<T, AbstractC5408e0> interfaceC4539f) {
            this.f27031a = method;
            this.f27032b = i10;
            this.f27033c = interfaceC4539f;
        }

        @Override // dj.AbstractC4549p
        /* renamed from: a */
        public void mo22903a(C4552s c4552s, T t10) {
            if (t10 == null) {
                throw C4559z.m22989o(this.f27031a, this.f27032b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                c4552s.m22933l(this.f27033c.mo22855a(t10));
            } catch (IOException e10) {
                throw C4559z.m22990p(this.f27031a, e10, this.f27032b, "Unable to convert " + t10 + " to RequestBody", new Object[0]);
            }
        }
    }

    /* renamed from: dj.p$d */
    /* loaded from: combined.jar:classes3.jar:dj/p$d.class */
    public static final class d<T> extends AbstractC4549p<T> {

        /* renamed from: a */
        public final String f27034a;

        /* renamed from: b */
        public final InterfaceC4539f<T, String> f27035b;

        /* renamed from: c */
        public final boolean f27036c;

        public d(String str, InterfaceC4539f<T, String> interfaceC4539f, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f27034a = str;
            this.f27035b = interfaceC4539f;
            this.f27036c = z10;
        }

        @Override // dj.AbstractC4549p
        /* renamed from: a */
        public void mo22903a(C4552s c4552s, T t10) {
            String mo22855a;
            if (t10 == null || (mo22855a = this.f27035b.mo22855a(t10)) == null) {
                return;
            }
            c4552s.m22924a(this.f27034a, mo22855a, this.f27036c);
        }
    }

    /* renamed from: dj.p$e */
    /* loaded from: combined.jar:classes3.jar:dj/p$e.class */
    public static final class e<T> extends AbstractC4549p<Map<String, T>> {

        /* renamed from: a */
        public final Method f27037a;

        /* renamed from: b */
        public final int f27038b;

        /* renamed from: c */
        public final InterfaceC4539f<T, String> f27039c;

        /* renamed from: d */
        public final boolean f27040d;

        public e(Method method, int i10, InterfaceC4539f<T, String> interfaceC4539f, boolean z10) {
            this.f27037a = method;
            this.f27038b = i10;
            this.f27039c = interfaceC4539f;
            this.f27040d = z10;
        }

        @Override // dj.AbstractC4549p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo22903a(C4552s c4552s, Map<String, T> map) {
            if (map == null) {
                throw C4559z.m22989o(this.f27037a, this.f27038b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw C4559z.m22989o(this.f27037a, this.f27038b, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw C4559z.m22989o(this.f27037a, this.f27038b, "Field map contained null value for key '" + key + "'.", new Object[0]);
                }
                String mo22855a = this.f27039c.mo22855a(value);
                if (mo22855a == null) {
                    throw C4559z.m22989o(this.f27037a, this.f27038b, "Field map value '" + value + "' converted to null by " + this.f27039c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                c4552s.m22924a(key, mo22855a, this.f27040d);
            }
        }
    }

    /* renamed from: dj.p$f */
    /* loaded from: combined.jar:classes3.jar:dj/p$f.class */
    public static final class f<T> extends AbstractC4549p<T> {

        /* renamed from: a */
        public final String f27041a;

        /* renamed from: b */
        public final InterfaceC4539f<T, String> f27042b;

        public f(String str, InterfaceC4539f<T, String> interfaceC4539f) {
            Objects.requireNonNull(str, "name == null");
            this.f27041a = str;
            this.f27042b = interfaceC4539f;
        }

        @Override // dj.AbstractC4549p
        /* renamed from: a */
        public void mo22903a(C4552s c4552s, T t10) {
            String mo22855a;
            if (t10 == null || (mo22855a = this.f27042b.mo22855a(t10)) == null) {
                return;
            }
            c4552s.m22925b(this.f27041a, mo22855a);
        }
    }

    /* renamed from: dj.p$g */
    /* loaded from: combined.jar:classes3.jar:dj/p$g.class */
    public static final class g<T> extends AbstractC4549p<Map<String, T>> {

        /* renamed from: a */
        public final Method f27043a;

        /* renamed from: b */
        public final int f27044b;

        /* renamed from: c */
        public final InterfaceC4539f<T, String> f27045c;

        public g(Method method, int i10, InterfaceC4539f<T, String> interfaceC4539f) {
            this.f27043a = method;
            this.f27044b = i10;
            this.f27045c = interfaceC4539f;
        }

        @Override // dj.AbstractC4549p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo22903a(C4552s c4552s, Map<String, T> map) {
            if (map == null) {
                throw C4559z.m22989o(this.f27043a, this.f27044b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw C4559z.m22989o(this.f27043a, this.f27044b, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw C4559z.m22989o(this.f27043a, this.f27044b, "Header map contained null value for key '" + key + "'.", new Object[0]);
                }
                c4552s.m22925b(key, this.f27045c.mo22855a(value));
            }
        }
    }

    /* renamed from: dj.p$h */
    /* loaded from: combined.jar:classes3.jar:dj/p$h.class */
    public static final class h extends AbstractC4549p<C5432w> {

        /* renamed from: a */
        public final Method f27046a;

        /* renamed from: b */
        public final int f27047b;

        public h(Method method, int i10) {
            this.f27046a = method;
            this.f27047b = i10;
        }

        @Override // dj.AbstractC4549p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo22903a(C4552s c4552s, C5432w c5432w) {
            if (c5432w == null) {
                throw C4559z.m22989o(this.f27046a, this.f27047b, "Headers parameter must not be null.", new Object[0]);
            }
            c4552s.m22926c(c5432w);
        }
    }

    /* renamed from: dj.p$i */
    /* loaded from: combined.jar:classes3.jar:dj/p$i.class */
    public static final class i<T> extends AbstractC4549p<T> {

        /* renamed from: a */
        public final Method f27048a;

        /* renamed from: b */
        public final int f27049b;

        /* renamed from: c */
        public final C5432w f27050c;

        /* renamed from: d */
        public final InterfaceC4539f<T, AbstractC5408e0> f27051d;

        public i(Method method, int i10, C5432w c5432w, InterfaceC4539f<T, AbstractC5408e0> interfaceC4539f) {
            this.f27048a = method;
            this.f27049b = i10;
            this.f27050c = c5432w;
            this.f27051d = interfaceC4539f;
        }

        @Override // dj.AbstractC4549p
        /* renamed from: a */
        public void mo22903a(C4552s c4552s, T t10) {
            if (t10 == null) {
                return;
            }
            try {
                c4552s.m22927d(this.f27050c, this.f27051d.mo22855a(t10));
            } catch (IOException e10) {
                throw C4559z.m22989o(this.f27048a, this.f27049b, "Unable to convert " + t10 + " to RequestBody", e10);
            }
        }
    }

    /* renamed from: dj.p$j */
    /* loaded from: combined.jar:classes3.jar:dj/p$j.class */
    public static final class j<T> extends AbstractC4549p<Map<String, T>> {

        /* renamed from: a */
        public final Method f27052a;

        /* renamed from: b */
        public final int f27053b;

        /* renamed from: c */
        public final InterfaceC4539f<T, AbstractC5408e0> f27054c;

        /* renamed from: d */
        public final String f27055d;

        public j(Method method, int i10, InterfaceC4539f<T, AbstractC5408e0> interfaceC4539f, String str) {
            this.f27052a = method;
            this.f27053b = i10;
            this.f27054c = interfaceC4539f;
            this.f27055d = str;
        }

        @Override // dj.AbstractC4549p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo22903a(C4552s c4552s, Map<String, T> map) {
            if (map == null) {
                throw C4559z.m22989o(this.f27052a, this.f27053b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw C4559z.m22989o(this.f27052a, this.f27053b, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw C4559z.m22989o(this.f27052a, this.f27053b, "Part map contained null value for key '" + key + "'.", new Object[0]);
                }
                c4552s.m22927d(C5432w.m27080g(Headers.CONTENT_DISPOSITION, "form-data; name=\"" + key + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, "Content-Transfer-Encoding", this.f27055d), this.f27054c.mo22855a(value));
            }
        }
    }

    /* renamed from: dj.p$k */
    /* loaded from: combined.jar:classes3.jar:dj/p$k.class */
    public static final class k<T> extends AbstractC4549p<T> {

        /* renamed from: a */
        public final Method f27056a;

        /* renamed from: b */
        public final int f27057b;

        /* renamed from: c */
        public final String f27058c;

        /* renamed from: d */
        public final InterfaceC4539f<T, String> f27059d;

        /* renamed from: e */
        public final boolean f27060e;

        public k(Method method, int i10, String str, InterfaceC4539f<T, String> interfaceC4539f, boolean z10) {
            this.f27056a = method;
            this.f27057b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f27058c = str;
            this.f27059d = interfaceC4539f;
            this.f27060e = z10;
        }

        @Override // dj.AbstractC4549p
        /* renamed from: a */
        public void mo22903a(C4552s c4552s, T t10) {
            if (t10 != null) {
                c4552s.m22929f(this.f27058c, this.f27059d.mo22855a(t10), this.f27060e);
                return;
            }
            throw C4559z.m22989o(this.f27056a, this.f27057b, "Path parameter \"" + this.f27058c + "\" value must not be null.", new Object[0]);
        }
    }

    /* renamed from: dj.p$l */
    /* loaded from: combined.jar:classes3.jar:dj/p$l.class */
    public static final class l<T> extends AbstractC4549p<T> {

        /* renamed from: a */
        public final String f27061a;

        /* renamed from: b */
        public final InterfaceC4539f<T, String> f27062b;

        /* renamed from: c */
        public final boolean f27063c;

        public l(String str, InterfaceC4539f<T, String> interfaceC4539f, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f27061a = str;
            this.f27062b = interfaceC4539f;
            this.f27063c = z10;
        }

        @Override // dj.AbstractC4549p
        /* renamed from: a */
        public void mo22903a(C4552s c4552s, T t10) {
            String mo22855a;
            if (t10 == null || (mo22855a = this.f27062b.mo22855a(t10)) == null) {
                return;
            }
            c4552s.m22930g(this.f27061a, mo22855a, this.f27063c);
        }
    }

    /* renamed from: dj.p$m */
    /* loaded from: combined.jar:classes3.jar:dj/p$m.class */
    public static final class m<T> extends AbstractC4549p<Map<String, T>> {

        /* renamed from: a */
        public final Method f27064a;

        /* renamed from: b */
        public final int f27065b;

        /* renamed from: c */
        public final InterfaceC4539f<T, String> f27066c;

        /* renamed from: d */
        public final boolean f27067d;

        public m(Method method, int i10, InterfaceC4539f<T, String> interfaceC4539f, boolean z10) {
            this.f27064a = method;
            this.f27065b = i10;
            this.f27066c = interfaceC4539f;
            this.f27067d = z10;
        }

        @Override // dj.AbstractC4549p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo22903a(C4552s c4552s, Map<String, T> map) {
            if (map == null) {
                throw C4559z.m22989o(this.f27064a, this.f27065b, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw C4559z.m22989o(this.f27064a, this.f27065b, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw C4559z.m22989o(this.f27064a, this.f27065b, "Query map contained null value for key '" + key + "'.", new Object[0]);
                }
                String mo22855a = this.f27066c.mo22855a(value);
                if (mo22855a == null) {
                    throw C4559z.m22989o(this.f27064a, this.f27065b, "Query map value '" + value + "' converted to null by " + this.f27066c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                c4552s.m22930g(key, mo22855a, this.f27067d);
            }
        }
    }

    /* renamed from: dj.p$n */
    /* loaded from: combined.jar:classes3.jar:dj/p$n.class */
    public static final class n<T> extends AbstractC4549p<T> {

        /* renamed from: a */
        public final InterfaceC4539f<T, String> f27068a;

        /* renamed from: b */
        public final boolean f27069b;

        public n(InterfaceC4539f<T, String> interfaceC4539f, boolean z10) {
            this.f27068a = interfaceC4539f;
            this.f27069b = z10;
        }

        @Override // dj.AbstractC4549p
        /* renamed from: a */
        public void mo22903a(C4552s c4552s, T t10) {
            if (t10 == null) {
                return;
            }
            c4552s.m22930g(this.f27068a.mo22855a(t10), null, this.f27069b);
        }
    }

    /* renamed from: dj.p$o */
    /* loaded from: combined.jar:classes3.jar:dj/p$o.class */
    public static final class o extends AbstractC4549p<C5400a0.c> {

        /* renamed from: a */
        public static final o f27070a = new o();

        @Override // dj.AbstractC4549p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo22903a(C4552s c4552s, C5400a0.c cVar) {
            if (cVar != null) {
                c4552s.m22928e(cVar);
            }
        }
    }

    /* renamed from: dj.p$p */
    /* loaded from: combined.jar:classes3.jar:dj/p$p.class */
    public static final class p extends AbstractC4549p<Object> {

        /* renamed from: a */
        public final Method f27071a;

        /* renamed from: b */
        public final int f27072b;

        public p(Method method, int i10) {
            this.f27071a = method;
            this.f27072b = i10;
        }

        @Override // dj.AbstractC4549p
        /* renamed from: a */
        public void mo22903a(C4552s c4552s, Object obj) {
            if (obj == null) {
                throw C4559z.m22989o(this.f27071a, this.f27072b, "@Url parameter is null.", new Object[0]);
            }
            c4552s.m22934m(obj);
        }
    }

    /* renamed from: dj.p$q */
    /* loaded from: combined.jar:classes3.jar:dj/p$q.class */
    public static final class q<T> extends AbstractC4549p<T> {

        /* renamed from: a */
        public final Class<T> f27073a;

        public q(Class<T> cls) {
            this.f27073a = cls;
        }

        @Override // dj.AbstractC4549p
        /* renamed from: a */
        public void mo22903a(C4552s c4552s, T t10) {
            c4552s.m22931h(this.f27073a, t10);
        }
    }

    /* renamed from: a */
    public abstract void mo22903a(C4552s c4552s, T t10);

    /* renamed from: b */
    public final AbstractC4549p<Object> m22904b() {
        return new b(this);
    }

    /* renamed from: c */
    public final AbstractC4549p<Iterable<T>> m22905c() {
        return new a(this);
    }
}
