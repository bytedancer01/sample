package p073e4;

import android.net.Uri;
import java.io.File;
import p416y3.InterfaceC9817c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e4/b.class
 */
/* renamed from: e4.b */
/* loaded from: combined.jar:classes1.jar:e4/b.class */
public class C4607b<T> implements InterfaceC4617l<File, T> {

    /* renamed from: a */
    public final InterfaceC4617l<Uri, T> f27281a;

    public C4607b(InterfaceC4617l<Uri, T> interfaceC4617l) {
        this.f27281a = interfaceC4617l;
    }

    @Override // p073e4.InterfaceC4617l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC9817c<T> mo23227a(File file, int i10, int i11) {
        return this.f27281a.mo23227a(Uri.fromFile(file), i10, i11);
    }
}
