package dj;

import dj.InterfaceC4539f;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p173ji.AbstractC5412g0;

@IgnoreJRERequirement
/* renamed from: dj.o */
/* loaded from: combined.jar:classes3.jar:dj/o.class */
public final class C4548o extends InterfaceC4539f.a {

    /* renamed from: a */
    public static final InterfaceC4539f.a f27027a = new C4548o();

    @IgnoreJRERequirement
    /* renamed from: dj.o$a */
    /* loaded from: combined.jar:classes3.jar:dj/o$a.class */
    public static final class a<T> implements InterfaceC4539f<AbstractC5412g0, Optional<T>> {

        /* renamed from: a */
        public final InterfaceC4539f<AbstractC5412g0, T> f27028a;

        public a(InterfaceC4539f<AbstractC5412g0, T> interfaceC4539f) {
            this.f27028a = interfaceC4539f;
        }

        @Override // dj.InterfaceC4539f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Optional<T> mo22855a(AbstractC5412g0 abstractC5412g0) {
            return Optional.ofNullable(this.f27028a.mo22855a(abstractC5412g0));
        }
    }

    @Override // dj.InterfaceC4539f.a
    /* renamed from: d */
    public InterfaceC4539f<AbstractC5412g0, ?> mo22854d(Type type, Annotation[] annotationArr, C4555v c4555v) {
        if (InterfaceC4539f.a.m22871b(type) != Optional.class) {
            return null;
        }
        return new a(c4555v.m22964h(InterfaceC4539f.a.m22870a(0, (ParameterizedType) type), annotationArr));
    }
}
