package dj;

import java.lang.annotation.Annotation;

/* renamed from: dj.y */
/* loaded from: combined.jar:classes3.jar:dj/y.class */
public final class C4558y implements InterfaceC4557x {

    /* renamed from: a */
    public static final InterfaceC4557x f27150a = new C4558y();

    /* renamed from: a */
    public static Annotation[] m22974a(Annotation[] annotationArr) {
        if (C4559z.m22986l(annotationArr, InterfaceC4557x.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f27150a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return InterfaceC4557x.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof InterfaceC4557x;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + InterfaceC4557x.class.getName() + "()";
    }
}
