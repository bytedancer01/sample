package p180k5;

import java.io.Serializable;
import p180k5.InterfaceC5485j;
import p378w4.InterfaceC9407a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k5/j.class
 */
/* renamed from: k5.j */
/* loaded from: combined.jar:classes1.jar:k5/j.class */
public interface InterfaceC5485j<T extends InterfaceC5485j<T>> {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k5/j$a.class
     */
    @InterfaceC9407a(creatorVisibility = InterfaceC9407a.b.ANY, fieldVisibility = InterfaceC9407a.b.PUBLIC_ONLY, getterVisibility = InterfaceC9407a.b.PUBLIC_ONLY, isGetterVisibility = InterfaceC9407a.b.PUBLIC_ONLY, setterVisibility = InterfaceC9407a.b.ANY)
    /* renamed from: k5.j$a */
    /* loaded from: combined.jar:classes1.jar:k5/j$a.class */
    public static class a implements InterfaceC5485j<a>, Serializable {

        /* renamed from: g */
        public static final a f31317g = new a((InterfaceC9407a) a.class.getAnnotation(InterfaceC9407a.class));

        /* renamed from: b */
        public final InterfaceC9407a.b f31318b;

        /* renamed from: c */
        public final InterfaceC9407a.b f31319c;

        /* renamed from: d */
        public final InterfaceC9407a.b f31320d;

        /* renamed from: e */
        public final InterfaceC9407a.b f31321e;

        /* renamed from: f */
        public final InterfaceC9407a.b f31322f;

        public a(InterfaceC9407a interfaceC9407a) {
            this.f31318b = interfaceC9407a.getterVisibility();
            this.f31319c = interfaceC9407a.isGetterVisibility();
            this.f31320d = interfaceC9407a.setterVisibility();
            this.f31321e = interfaceC9407a.creatorVisibility();
            this.f31322f = interfaceC9407a.fieldVisibility();
        }

        /* renamed from: a */
        public static a m27281a() {
            return f31317g;
        }

        public String toString() {
            return "[Visibility: getter: " + this.f31318b + ", isGetter: " + this.f31319c + ", setter: " + this.f31320d + ", creator: " + this.f31321e + ", field: " + this.f31322f + "]";
        }
    }
}
