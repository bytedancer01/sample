package p329t3;

import android.content.Context;
import p073e4.InterfaceC4617l;
import p225n4.C6652e;
import p225n4.InterfaceC6650c;
import p239o4.C6904m;
import p239o4.InterfaceC6898g;
import p280q4.C7756e;
import p280q4.InterfaceC7757f;
import p329t3.C8620j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t3/f.class
 */
/* renamed from: t3.f */
/* loaded from: combined.jar:classes1.jar:t3/f.class */
public class C8616f<ModelType, DataType, ResourceType> extends C8615e<ModelType, DataType, ResourceType, ResourceType> {

    /* renamed from: E */
    public final InterfaceC4617l<ModelType, DataType> f40233E;

    /* renamed from: F */
    public final Class<DataType> f40234F;

    /* renamed from: G */
    public final Class<ResourceType> f40235G;

    /* renamed from: H */
    public final C8620j.d f40236H;

    public C8616f(Context context, C8617g c8617g, Class<ModelType> cls, InterfaceC4617l<ModelType, DataType> interfaceC4617l, Class<DataType> cls2, Class<ResourceType> cls3, C6904m c6904m, InterfaceC6898g interfaceC6898g, C8620j.d dVar) {
        super(context, cls, m36997x(c8617g, interfaceC4617l, cls2, cls3, C6652e.m30654b()), cls3, c8617g, c6904m, interfaceC6898g);
        this.f40233E = interfaceC4617l;
        this.f40234F = cls2;
        this.f40235G = cls3;
        this.f40236H = dVar;
    }

    /* renamed from: x */
    public static <A, T, Z, R> InterfaceC7757f<A, T, Z, R> m36997x(C8617g c8617g, InterfaceC4617l<A, T> interfaceC4617l, Class<T> cls, Class<Z> cls2, InterfaceC6650c<Z, R> interfaceC6650c) {
        return new C7756e(interfaceC4617l, interfaceC6650c, c8617g.m37005a(cls, cls2));
    }
}
