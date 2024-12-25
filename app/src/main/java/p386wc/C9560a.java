package p386wc;

import java.lang.annotation.Annotation;
import p386wc.InterfaceC9563d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wc/a.class
 */
/* renamed from: wc.a */
/* loaded from: combined.jar:classes2.jar:wc/a.class */
public final class C9560a {

    /* renamed from: a */
    public int f43544a;

    /* renamed from: b */
    public InterfaceC9563d.a f43545b = InterfaceC9563d.a.DEFAULT;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wc/a$a.class
     */
    /* renamed from: wc.a$a */
    /* loaded from: combined.jar:classes2.jar:wc/a$a.class */
    public static final class a implements InterfaceC9563d {

        /* renamed from: a */
        public final int f43546a;

        /* renamed from: b */
        public final InterfaceC9563d.a f43547b;

        public a(int i10, InterfaceC9563d.a aVar) {
            this.f43546a = i10;
            this.f43547b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return InterfaceC9563d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InterfaceC9563d)) {
                return false;
            }
            InterfaceC9563d interfaceC9563d = (InterfaceC9563d) obj;
            if (this.f43546a != interfaceC9563d.tag() || !this.f43547b.equals(interfaceC9563d.intEncoding())) {
                z10 = false;
            }
            return z10;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (this.f43546a ^ 14552422) + (this.f43547b.hashCode() ^ 2041407134);
        }

        @Override // p386wc.InterfaceC9563d
        public InterfaceC9563d.a intEncoding() {
            return this.f43547b;
        }

        @Override // p386wc.InterfaceC9563d
        public int tag() {
            return this.f43546a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f43546a + "intEncoding=" + this.f43547b + ')';
        }
    }

    /* renamed from: b */
    public static C9560a m40097b() {
        return new C9560a();
    }

    /* renamed from: a */
    public InterfaceC9563d m40098a() {
        return new a(this.f43544a, this.f43545b);
    }

    /* renamed from: c */
    public C9560a m40099c(int i10) {
        this.f43544a = i10;
        return this;
    }
}
