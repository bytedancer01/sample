package p420y7;

import android.net.Uri;
import java.io.InputStream;
import java.util.List;
import p027b9.C0843g0;
import p420y7.InterfaceC9848d0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y7/e0.class
 */
/* renamed from: y7.e0 */
/* loaded from: combined.jar:classes2.jar:y7/e0.class */
public final class C9850e0<T extends InterfaceC9848d0<T>> implements C0843g0.a<T> {

    /* renamed from: b */
    public final C0843g0.a<? extends T> f45190b;

    /* renamed from: c */
    public final List<C9858i0> f45191c;

    public C9850e0(C0843g0.a<? extends T> aVar, List<C9858i0> list) {
        this.f45190b = aVar;
        this.f45191c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [y7.d0] */
    @Override // p027b9.C0843g0.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T mo5362a(Uri uri, InputStream inputStream) {
        T mo5362a = this.f45190b.mo5362a(uri, inputStream);
        List<C9858i0> list = this.f45191c;
        T t10 = mo5362a;
        if (list != null) {
            t10 = list.isEmpty() ? mo5362a : (InterfaceC9848d0) mo5362a.mo23296a(this.f45191c);
        }
        return t10;
    }
}
