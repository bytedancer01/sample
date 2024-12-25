package dj;

import dj.C4540g;
import dj.InterfaceC4536c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import p173ji.C5406d0;

/* renamed from: dj.g */
/* loaded from: combined.jar:classes3.jar:dj/g.class */
public final class C4540g extends InterfaceC4536c.a {

    /* renamed from: a */
    public final Executor f26974a;

    /* renamed from: dj.g$a */
    /* loaded from: combined.jar:classes3.jar:dj/g$a.class */
    public class a implements InterfaceC4536c<Object, InterfaceC4535b<?>> {

        /* renamed from: a */
        public final Type f26975a;

        /* renamed from: b */
        public final Executor f26976b;

        /* renamed from: c */
        public final C4540g f26977c;

        public a(C4540g c4540g, Type type, Executor executor) {
            this.f26977c = c4540g;
            this.f26975a = type;
            this.f26976b = executor;
        }

        @Override // dj.InterfaceC4536c
        /* renamed from: a */
        public Type mo22863a() {
            return this.f26975a;
        }

        @Override // dj.InterfaceC4536c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC4535b<Object> mo22864b(InterfaceC4535b<Object> interfaceC4535b) {
            Executor executor = this.f26976b;
            if (executor != null) {
                interfaceC4535b = new b(executor, interfaceC4535b);
            }
            return interfaceC4535b;
        }
    }

    /* renamed from: dj.g$b */
    /* loaded from: combined.jar:classes3.jar:dj/g$b.class */
    public static final class b<T> implements InterfaceC4535b<T> {

        /* renamed from: b */
        public final Executor f26978b;

        /* renamed from: c */
        public final InterfaceC4535b<T> f26979c;

        /* renamed from: dj.g$b$a */
        /* loaded from: combined.jar:classes3.jar:dj/g$b$a.class */
        public class a implements InterfaceC4537d<T> {

            /* renamed from: a */
            public final InterfaceC4537d f26980a;

            /* renamed from: b */
            public final b f26981b;

            public a(b bVar, InterfaceC4537d interfaceC4537d) {
                this.f26981b = bVar;
                this.f26980a = interfaceC4537d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public /* synthetic */ void m22876e(InterfaceC4537d interfaceC4537d, Throwable th2) {
                interfaceC4537d.mo14533b(this.f26981b, th2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: f */
            public /* synthetic */ void m22877f(InterfaceC4537d interfaceC4537d, C4554u c4554u) {
                if (this.f26981b.f26979c.isCanceled()) {
                    interfaceC4537d.mo14533b(this.f26981b, new IOException("Canceled"));
                } else {
                    interfaceC4537d.mo14532a(this.f26981b, c4554u);
                }
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: a */
            public void mo14532a(InterfaceC4535b<T> interfaceC4535b, final C4554u<T> c4554u) {
                Executor executor = this.f26981b.f26978b;
                final InterfaceC4537d interfaceC4537d = this.f26980a;
                executor.execute(new Runnable(this, interfaceC4537d, c4554u) { // from class: dj.h

                    /* renamed from: b */
                    public final C4540g.b.a f26982b;

                    /* renamed from: c */
                    public final InterfaceC4537d f26983c;

                    /* renamed from: d */
                    public final C4554u f26984d;

                    {
                        this.f26982b = this;
                        this.f26983c = interfaceC4537d;
                        this.f26984d = c4554u;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f26982b.m22877f(this.f26983c, this.f26984d);
                    }
                });
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: b */
            public void mo14533b(InterfaceC4535b<T> interfaceC4535b, final Throwable th2) {
                Executor executor = this.f26981b.f26978b;
                final InterfaceC4537d interfaceC4537d = this.f26980a;
                executor.execute(new Runnable(this, interfaceC4537d, th2) { // from class: dj.i

                    /* renamed from: b */
                    public final C4540g.b.a f26985b;

                    /* renamed from: c */
                    public final InterfaceC4537d f26986c;

                    /* renamed from: d */
                    public final Throwable f26987d;

                    {
                        this.f26985b = this;
                        this.f26986c = interfaceC4537d;
                        this.f26987d = th2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f26985b.m22876e(this.f26986c, this.f26987d);
                    }
                });
            }
        }

        public b(Executor executor, InterfaceC4535b<T> interfaceC4535b) {
            this.f26978b = executor;
            this.f26979c = interfaceC4535b;
        }

        @Override // dj.InterfaceC4535b
        public void cancel() {
            this.f26979c.cancel();
        }

        @Override // dj.InterfaceC4535b
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public InterfaceC4535b<T> m44402clone() {
            return new b(this.f26978b, this.f26979c.m44402clone());
        }

        @Override // dj.InterfaceC4535b
        /* renamed from: f */
        public void mo22862f(InterfaceC4537d<T> interfaceC4537d) {
            Objects.requireNonNull(interfaceC4537d, "callback == null");
            this.f26979c.mo22862f(new a(this, interfaceC4537d));
        }

        @Override // dj.InterfaceC4535b
        public boolean isCanceled() {
            return this.f26979c.isCanceled();
        }

        @Override // dj.InterfaceC4535b
        public C5406d0 request() {
            return this.f26979c.request();
        }
    }

    public C4540g(Executor executor) {
        this.f26974a = executor;
    }

    @Override // dj.InterfaceC4536c.a
    /* renamed from: a */
    public InterfaceC4536c<?, ?> mo22867a(Type type, Annotation[] annotationArr, C4555v c4555v) {
        if (InterfaceC4536c.a.m22866c(type) != InterfaceC4535b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(this, C4559z.m22981g(0, (ParameterizedType) type), C4559z.m22986l(annotationArr, InterfaceC4557x.class) ? null : this.f26974a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
