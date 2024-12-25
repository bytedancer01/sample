package p329t3;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import p073e4.C4611f;
import p073e4.C4612g;
import p073e4.InterfaceC4617l;
import p225n4.InterfaceC6650c;
import p280q4.C7756e;
import p329t3.C8620j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t3/b.class
 */
/* renamed from: t3.b */
/* loaded from: combined.jar:classes1.jar:t3/b.class */
public class C8612b<ModelType> extends C8611a<ModelType, Bitmap> {

    /* renamed from: J */
    public final InterfaceC4617l<ModelType, InputStream> f40196J;

    /* renamed from: K */
    public final InterfaceC4617l<ModelType, ParcelFileDescriptor> f40197K;

    /* renamed from: L */
    public final C8617g f40198L;

    /* renamed from: M */
    public final C8620j.d f40199M;

    public C8612b(C8615e<ModelType, ?, ?, ?> c8615e, InterfaceC4617l<ModelType, InputStream> interfaceC4617l, InterfaceC4617l<ModelType, ParcelFileDescriptor> interfaceC4617l2, C8620j.d dVar) {
        super(m36974J(c8615e.f40209d, interfaceC4617l, interfaceC4617l2, Bitmap.class, null), Bitmap.class, c8615e);
        this.f40196J = interfaceC4617l;
        this.f40197K = interfaceC4617l2;
        this.f40198L = c8615e.f40209d;
        this.f40199M = dVar;
    }

    /* renamed from: J */
    public static <A, R> C7756e<A, C4612g, Bitmap, R> m36974J(C8617g c8617g, InterfaceC4617l<A, InputStream> interfaceC4617l, InterfaceC4617l<A, ParcelFileDescriptor> interfaceC4617l2, Class<R> cls, InterfaceC6650c<Bitmap, R> interfaceC6650c) {
        if (interfaceC4617l == null && interfaceC4617l2 == null) {
            return null;
        }
        InterfaceC6650c<Bitmap, R> interfaceC6650c2 = interfaceC6650c;
        if (interfaceC6650c == null) {
            interfaceC6650c2 = c8617g.m37007f(Bitmap.class, cls);
        }
        return new C7756e<>(new C4611f(interfaceC4617l, interfaceC4617l2), interfaceC6650c2, c8617g.m37005a(C4612g.class, Bitmap.class));
    }
}
