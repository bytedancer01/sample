package dj;

import dj.InterfaceC4539f;
import fj.InterfaceC4910w;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p172jh.C5398q;
import p173ji.AbstractC5408e0;
import p173ji.AbstractC5412g0;

/* renamed from: dj.a */
/* loaded from: combined.jar:classes3.jar:dj/a.class */
public final class C4534a extends InterfaceC4539f.a {

    /* renamed from: a */
    public boolean f26959a = true;

    /* renamed from: dj.a$a */
    /* loaded from: combined.jar:classes3.jar:dj/a$a.class */
    public static final class a implements InterfaceC4539f<AbstractC5412g0, AbstractC5412g0> {

        /* renamed from: a */
        public static final a f26960a = new a();

        @Override // dj.InterfaceC4539f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC5412g0 mo22855a(AbstractC5412g0 abstractC5412g0) {
            try {
                return C4559z.m22975a(abstractC5412g0);
            } finally {
                abstractC5412g0.close();
            }
        }
    }

    /* renamed from: dj.a$b */
    /* loaded from: combined.jar:classes3.jar:dj/a$b.class */
    public static final class b implements InterfaceC4539f<AbstractC5408e0, AbstractC5408e0> {

        /* renamed from: a */
        public static final b f26961a = new b();

        @Override // dj.InterfaceC4539f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC5408e0 mo22855a(AbstractC5408e0 abstractC5408e0) {
            return abstractC5408e0;
        }
    }

    /* renamed from: dj.a$c */
    /* loaded from: combined.jar:classes3.jar:dj/a$c.class */
    public static final class c implements InterfaceC4539f<AbstractC5412g0, AbstractC5412g0> {

        /* renamed from: a */
        public static final c f26962a = new c();

        @Override // dj.InterfaceC4539f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC5412g0 mo22855a(AbstractC5412g0 abstractC5412g0) {
            return abstractC5412g0;
        }
    }

    /* renamed from: dj.a$d */
    /* loaded from: combined.jar:classes3.jar:dj/a$d.class */
    public static final class d implements InterfaceC4539f<Object, String> {

        /* renamed from: a */
        public static final d f26963a = new d();

        @Override // dj.InterfaceC4539f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String mo22855a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: dj.a$e */
    /* loaded from: combined.jar:classes3.jar:dj/a$e.class */
    public static final class e implements InterfaceC4539f<AbstractC5412g0, C5398q> {

        /* renamed from: a */
        public static final e f26964a = new e();

        @Override // dj.InterfaceC4539f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5398q mo22855a(AbstractC5412g0 abstractC5412g0) {
            abstractC5412g0.close();
            return C5398q.f30770a;
        }
    }

    /* renamed from: dj.a$f */
    /* loaded from: combined.jar:classes3.jar:dj/a$f.class */
    public static final class f implements InterfaceC4539f<AbstractC5412g0, Void> {

        /* renamed from: a */
        public static final f f26965a = new f();

        @Override // dj.InterfaceC4539f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void mo22855a(AbstractC5412g0 abstractC5412g0) {
            abstractC5412g0.close();
            return null;
        }
    }

    @Override // dj.InterfaceC4539f.a
    /* renamed from: c */
    public InterfaceC4539f<?, AbstractC5408e0> mo22853c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C4555v c4555v) {
        if (AbstractC5408e0.class.isAssignableFrom(C4559z.m22982h(type))) {
            return b.f26961a;
        }
        return null;
    }

    @Override // dj.InterfaceC4539f.a
    /* renamed from: d */
    public InterfaceC4539f<AbstractC5412g0, ?> mo22854d(Type type, Annotation[] annotationArr, C4555v c4555v) {
        if (type == AbstractC5412g0.class) {
            return C4559z.m22986l(annotationArr, InterfaceC4910w.class) ? c.f26962a : a.f26960a;
        }
        if (type == Void.class) {
            return f.f26965a;
        }
        if (!this.f26959a || type != C5398q.class) {
            return null;
        }
        try {
            return e.f26964a;
        } catch (NoClassDefFoundError e10) {
            this.f26959a = false;
            return null;
        }
    }
}
