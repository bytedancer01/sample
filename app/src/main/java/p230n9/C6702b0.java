package p230n9;

import android.os.IBinder;
import android.os.Parcel;
import ga.InterfaceC4993a;
import ma.C6005a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/b0.class
 */
/* renamed from: n9.b0 */
/* loaded from: combined.jar:classes2.jar:n9/b0.class */
public final class C6702b0 extends C6005a implements InterfaceC6748v0 {
    public C6702b0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker");
    }

    @Override // p230n9.InterfaceC6748v0
    /* renamed from: b */
    public final InterfaceC4993a mo30866b() {
        Parcel m29374y0 = m29374y0(2, m29373Z());
        InterfaceC4993a m25159y0 = InterfaceC4993a.a.m25159y0(m29374y0.readStrongBinder());
        m29374y0.recycle();
        return m25159y0;
    }
}
