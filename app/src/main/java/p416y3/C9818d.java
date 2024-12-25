package p416y3;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y3/d.class
 */
/* renamed from: y3.d */
/* loaded from: combined.jar:classes1.jar:y3/d.class */
public class C9818d extends AbstractC9815a<ParcelFileDescriptor> {
    public C9818d(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // p416y3.AbstractC9815a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo41346c(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.close();
    }

    @Override // p416y3.AbstractC9815a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo41347d(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
