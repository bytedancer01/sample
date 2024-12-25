package p110g4;

import android.content.Context;
import java.io.InputStream;
import p073e4.C4608c;
import p073e4.C4609d;
import p073e4.C4616k;
import p073e4.InterfaceC4617l;
import p073e4.InterfaceC4618m;
import p416y3.C9820f;
import p416y3.InterfaceC9817c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g4/a.class
 */
/* renamed from: g4.a */
/* loaded from: combined.jar:classes1.jar:g4/a.class */
public class C4940a implements InterfaceC4617l {

    /* renamed from: a */
    public final C4616k<C4609d, C4609d> f28696a;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g4/a$a.class
     */
    /* renamed from: g4.a$a */
    /* loaded from: combined.jar:classes1.jar:g4/a$a.class */
    public static class a implements InterfaceC4618m<C4609d, InputStream> {

        /* renamed from: a */
        public final C4616k<C4609d, C4609d> f28697a = new C4616k<>(500);

        @Override // p073e4.InterfaceC4618m
        /* renamed from: a */
        public void mo23256a() {
        }

        @Override // p073e4.InterfaceC4618m
        /* renamed from: b */
        public InterfaceC4617l<C4609d, InputStream> mo23257b(Context context, C4608c c4608c) {
            return new C4940a(this.f28697a);
        }
    }

    public C4940a(C4616k<C4609d, C4609d> c4616k) {
        this.f28696a = c4616k;
    }

    @Override // p073e4.InterfaceC4617l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC9817c<InputStream> mo23227a(C4609d c4609d, int i10, int i11) {
        C4616k<C4609d, C4609d> c4616k = this.f28696a;
        C4609d c4609d2 = c4609d;
        if (c4616k != null) {
            c4609d2 = c4616k.m23250a(c4609d, 0, 0);
            if (c4609d2 == null) {
                this.f28696a.m23251b(c4609d, 0, 0, c4609d);
                c4609d2 = c4609d;
            }
        }
        return new C9820f(c4609d2);
    }
}
