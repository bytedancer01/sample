package p073e4;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e4/g.class
 */
/* renamed from: e4.g */
/* loaded from: combined.jar:classes1.jar:e4/g.class */
public class C4612g {

    /* renamed from: a */
    public final InputStream f27297a;

    /* renamed from: b */
    public final ParcelFileDescriptor f27298b;

    public C4612g(InputStream inputStream, ParcelFileDescriptor parcelFileDescriptor) {
        this.f27297a = inputStream;
        this.f27298b = parcelFileDescriptor;
    }

    /* renamed from: a */
    public ParcelFileDescriptor m23243a() {
        return this.f27298b;
    }

    /* renamed from: b */
    public InputStream m23244b() {
        return this.f27297a;
    }
}
