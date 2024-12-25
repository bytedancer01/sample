package p195l4;

import p073e4.InterfaceC4617l;
import p329t3.EnumC8619i;
import p362v3.C9231a;
import p416y3.InterfaceC9817c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l4/g.class
 */
/* renamed from: l4.g */
/* loaded from: combined.jar:classes1.jar:l4/g.class */
public class C5677g implements InterfaceC4617l<C9231a, C9231a> {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l4/g$a.class
     */
    /* renamed from: l4.g$a */
    /* loaded from: combined.jar:classes1.jar:l4/g$a.class */
    public static class a implements InterfaceC9817c<C9231a> {

        /* renamed from: a */
        public final C9231a f32003a;

        public a(C9231a c9231a) {
            this.f32003a = c9231a;
        }

        @Override // p416y3.InterfaceC9817c
        /* renamed from: a */
        public void mo23240a() {
        }

        @Override // p416y3.InterfaceC9817c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C9231a mo23241b(EnumC8619i enumC8619i) {
            return this.f32003a;
        }

        @Override // p416y3.InterfaceC9817c
        public void cancel() {
        }

        @Override // p416y3.InterfaceC9817c
        public String getId() {
            return String.valueOf(this.f32003a.m38912d());
        }
    }

    @Override // p073e4.InterfaceC4617l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC9817c<C9231a> mo23227a(C9231a c9231a, int i10, int i11) {
        return new a(c9231a);
    }
}
