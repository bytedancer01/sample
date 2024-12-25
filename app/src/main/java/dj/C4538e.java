package dj;

import dj.InterfaceC4536c;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
/* renamed from: dj.e */
/* loaded from: combined.jar:classes3.jar:dj/e.class */
public final class C4538e extends InterfaceC4536c.a {

    /* renamed from: a */
    public static final InterfaceC4536c.a f26966a = new C4538e();

    @IgnoreJRERequirement
    /* renamed from: dj.e$a */
    /* loaded from: combined.jar:classes3.jar:dj/e$a.class */
    public static final class a<R> implements InterfaceC4536c<R, CompletableFuture<R>> {

        /* renamed from: a */
        public final Type f26967a;

        @IgnoreJRERequirement
        /* renamed from: dj.e$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes3.jar:dj/e$a$a.class */
        public class C10285a implements InterfaceC4537d<R> {

            /* renamed from: a */
            public final CompletableFuture<R> f26968a;

            /* renamed from: b */
            public final a f26969b;

            public C10285a(a aVar, CompletableFuture<R> completableFuture) {
                this.f26969b = aVar;
                this.f26968a = completableFuture;
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: a */
            public void mo14532a(InterfaceC4535b<R> interfaceC4535b, C4554u<R> c4554u) {
                if (c4554u.m22954d()) {
                    this.f26968a.complete(c4554u.m22952a());
                } else {
                    this.f26968a.completeExceptionally(new C4543j(c4554u));
                }
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: b */
            public void mo14533b(InterfaceC4535b<R> interfaceC4535b, Throwable th2) {
                this.f26968a.completeExceptionally(th2);
            }
        }

        public a(Type type) {
            this.f26967a = type;
        }

        @Override // dj.InterfaceC4536c
        /* renamed from: a */
        public Type mo22863a() {
            return this.f26967a;
        }

        @Override // dj.InterfaceC4536c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<R> mo22864b(InterfaceC4535b<R> interfaceC4535b) {
            b bVar = new b(interfaceC4535b);
            interfaceC4535b.mo22862f(new C10285a(this, bVar));
            return bVar;
        }
    }

    @IgnoreJRERequirement
    /* renamed from: dj.e$b */
    /* loaded from: combined.jar:classes3.jar:dj/e$b.class */
    public static final class b<T> extends CompletableFuture<T> {

        /* renamed from: b */
        public final InterfaceC4535b<?> f26970b;

        public b(InterfaceC4535b<?> interfaceC4535b) {
            this.f26970b = interfaceC4535b;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            if (z10) {
                this.f26970b.cancel();
            }
            return super.cancel(z10);
        }
    }

    @IgnoreJRERequirement
    /* renamed from: dj.e$c */
    /* loaded from: combined.jar:classes3.jar:dj/e$c.class */
    public static final class c<R> implements InterfaceC4536c<R, CompletableFuture<C4554u<R>>> {

        /* renamed from: a */
        public final Type f26971a;

        @IgnoreJRERequirement
        /* renamed from: dj.e$c$a */
        /* loaded from: combined.jar:classes3.jar:dj/e$c$a.class */
        public class a implements InterfaceC4537d<R> {

            /* renamed from: a */
            public final CompletableFuture<C4554u<R>> f26972a;

            /* renamed from: b */
            public final c f26973b;

            public a(c cVar, CompletableFuture<C4554u<R>> completableFuture) {
                this.f26973b = cVar;
                this.f26972a = completableFuture;
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: a */
            public void mo14532a(InterfaceC4535b<R> interfaceC4535b, C4554u<R> c4554u) {
                this.f26972a.complete(c4554u);
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: b */
            public void mo14533b(InterfaceC4535b<R> interfaceC4535b, Throwable th2) {
                this.f26972a.completeExceptionally(th2);
            }
        }

        public c(Type type) {
            this.f26971a = type;
        }

        @Override // dj.InterfaceC4536c
        /* renamed from: a */
        public Type mo22863a() {
            return this.f26971a;
        }

        @Override // dj.InterfaceC4536c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<C4554u<R>> mo22864b(InterfaceC4535b<R> interfaceC4535b) {
            b bVar = new b(interfaceC4535b);
            interfaceC4535b.mo22862f(new a(this, bVar));
            return bVar;
        }
    }

    @Override // dj.InterfaceC4536c.a
    /* renamed from: a */
    public InterfaceC4536c<?, ?> mo22867a(Type type, Annotation[] annotationArr, C4555v c4555v) {
        if (InterfaceC4536c.a.m22866c(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type m22865b = InterfaceC4536c.a.m22865b(0, (ParameterizedType) type);
        if (InterfaceC4536c.a.m22866c(m22865b) != C4554u.class) {
            return new a(m22865b);
        }
        if (m22865b instanceof ParameterizedType) {
            return new c(InterfaceC4536c.a.m22865b(0, (ParameterizedType) m22865b));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
