package p085ej;

import dj.C4555v;
import dj.InterfaceC4539f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p173ji.AbstractC5408e0;
import p173ji.AbstractC5412g0;
import p188kd.C5552e;
import p308rd.C8462a;

/* renamed from: ej.a */
/* loaded from: combined.jar:classes3.jar:ej/a.class */
public final class C4730a extends InterfaceC4539f.a {

    /* renamed from: a */
    public final C5552e f27877a;

    public C4730a(C5552e c5552e) {
        this.f27877a = c5552e;
    }

    /* renamed from: f */
    public static C4730a m23884f() {
        return m23885g(new C5552e());
    }

    /* renamed from: g */
    public static C4730a m23885g(C5552e c5552e) {
        if (c5552e != null) {
            return new C4730a(c5552e);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // dj.InterfaceC4539f.a
    /* renamed from: c */
    public InterfaceC4539f<?, AbstractC5408e0> mo22853c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C4555v c4555v) {
        return new C4731b(this.f27877a, this.f27877a.m27550m(C8462a.m36349b(type)));
    }

    @Override // dj.InterfaceC4539f.a
    /* renamed from: d */
    public InterfaceC4539f<AbstractC5412g0, ?> mo22854d(Type type, Annotation[] annotationArr, C4555v c4555v) {
        return new C4732c(this.f27877a, this.f27877a.m27550m(C8462a.m36349b(type)));
    }
}
