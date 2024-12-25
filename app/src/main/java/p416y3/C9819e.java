package p416y3;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y3/e.class
 */
/* renamed from: y3.e */
/* loaded from: combined.jar:classes1.jar:y3/e.class */
public class C9819e extends AbstractC9821g<ParcelFileDescriptor> {
    public C9819e(Context context, Uri uri) {
        super(context, uri);
    }

    @Override // p416y3.AbstractC9821g
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo41351c(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.close();
    }

    @Override // p416y3.AbstractC9821g
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo41352d(Uri uri, ContentResolver contentResolver) {
        return contentResolver.openAssetFileDescriptor(uri, "r").getParcelFileDescriptor();
    }
}
