package p329t3;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import p073e4.C4611f;
import p073e4.C4612g;
import p073e4.InterfaceC4617l;
import p160j4.AbstractC5293b;
import p211m4.C5922a;
import p225n4.InterfaceC6650c;
import p239o4.C6904m;
import p239o4.InterfaceC6898g;
import p280q4.C7756e;
import p329t3.C8620j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t3/d.class
 */
/* renamed from: t3.d */
/* loaded from: combined.jar:classes1.jar:t3/d.class */
public class C8614d<ModelType> extends C8613c<ModelType> {

    /* renamed from: E */
    public final InterfaceC4617l<ModelType, InputStream> f40200E;

    /* renamed from: F */
    public final InterfaceC4617l<ModelType, ParcelFileDescriptor> f40201F;

    /* renamed from: G */
    public final C8620j.d f40202G;

    public C8614d(Class<ModelType> cls, InterfaceC4617l<ModelType, InputStream> interfaceC4617l, InterfaceC4617l<ModelType, ParcelFileDescriptor> interfaceC4617l2, Context context, C8617g c8617g, C6904m c6904m, InterfaceC6898g interfaceC6898g, C8620j.d dVar) {
        super(context, cls, m36987L(c8617g, interfaceC4617l, interfaceC4617l2, C5922a.class, AbstractC5293b.class, null), c8617g, c6904m, interfaceC6898g);
        this.f40200E = interfaceC4617l;
        this.f40201F = interfaceC4617l2;
        this.f40202G = dVar;
    }

    /* renamed from: L */
    public static <A, Z, R> C7756e<A, C4612g, Z, R> m36987L(C8617g c8617g, InterfaceC4617l<A, InputStream> interfaceC4617l, InterfaceC4617l<A, ParcelFileDescriptor> interfaceC4617l2, Class<Z> cls, Class<R> cls2, InterfaceC6650c<Z, R> interfaceC6650c) {
        if (interfaceC4617l == null && interfaceC4617l2 == null) {
            return null;
        }
        InterfaceC6650c<Z, R> interfaceC6650c2 = interfaceC6650c;
        if (interfaceC6650c == null) {
            interfaceC6650c2 = c8617g.m37007f(cls, cls2);
        }
        return new C7756e<>(new C4611f(interfaceC4617l, interfaceC4617l2), interfaceC6650c2, c8617g.m37005a(C4612g.class, cls));
    }

    /* renamed from: K */
    public C8612b<ModelType> m36988K() {
        C8620j.d dVar = this.f40202G;
        return (C8612b) dVar.m37041a(new C8612b(this, this.f40200E, this.f40201F, dVar));
    }
}
