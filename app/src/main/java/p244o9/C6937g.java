package p244o9;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import ma.C6005a;
import ma.C6363r0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:o9/g.class
 */
/* renamed from: o9.g */
/* loaded from: combined.jar:classes2.jar:o9/g.class */
public final class C6937g extends C6005a implements InterfaceC6939i {
    public C6937g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
    }

    @Override // p244o9.InterfaceC6939i
    /* renamed from: C */
    public final Bitmap mo31907C(Uri uri) {
        Parcel m29373Z = m29373Z();
        C6363r0.m29990c(m29373Z, uri);
        Parcel m29374y0 = m29374y0(1, m29373Z);
        Bitmap bitmap = (Bitmap) C6363r0.m29988a(m29374y0, Bitmap.CREATOR);
        m29374y0.recycle();
        return bitmap;
    }
}
