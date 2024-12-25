package p230n9;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import ma.C6005a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/w0.class
 */
/* renamed from: n9.w0 */
/* loaded from: combined.jar:classes2.jar:n9/w0.class */
public final class C6750w0 extends C6005a implements InterfaceC6752x0 {
    public C6750w0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider");
    }

    @Override // p230n9.InterfaceC6752x0
    /* renamed from: b */
    public final int[] mo31073b() {
        Parcel m29374y0 = m29374y0(4, m29373Z());
        int[] createIntArray = m29374y0.createIntArray();
        m29374y0.recycle();
        return createIntArray;
    }

    @Override // p230n9.InterfaceC6752x0
    /* renamed from: d */
    public final List mo31074d() {
        Parcel m29374y0 = m29374y0(3, m29373Z());
        ArrayList createTypedArrayList = m29374y0.createTypedArrayList(C6713f.CREATOR);
        m29374y0.recycle();
        return createTypedArrayList;
    }
}
