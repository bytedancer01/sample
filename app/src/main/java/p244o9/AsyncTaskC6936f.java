package p244o9;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;
import android.support.v4.media.session.PlaybackStateCompat;
import com.amazonaws.services.p045s3.internal.Constants;
import ma.C6131g;
import p304r9.C8015b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:o9/f.class
 */
/* renamed from: o9.f */
/* loaded from: combined.jar:classes2.jar:o9/f.class */
public final class AsyncTaskC6936f extends AsyncTask {

    /* renamed from: c */
    public static final C8015b f35861c = new C8015b("FetchBitmapTask");

    /* renamed from: a */
    public final InterfaceC6939i f35862a;

    /* renamed from: b */
    public final C6932b f35863b;

    public AsyncTaskC6936f(Context context, int i10, int i11, boolean z10, long j10, int i12, int i13, int i14, C6932b c6932b) {
        this.f35863b = c6932b;
        this.f35862a = C6131g.m29616e(context.getApplicationContext(), this, new BinderC6935e(this, null), i10, i11, false, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 5, 333, Constants.MAXIMUM_UPLOAD_PARTS);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Uri[] uriArr = (Uri[]) objArr;
        Bitmap bitmap = null;
        if (uriArr.length == 1) {
            Uri uri = uriArr[0];
            if (uri == null) {
                bitmap = null;
            } else {
                InterfaceC6939i interfaceC6939i = this.f35862a;
                if (interfaceC6939i == null) {
                    bitmap = null;
                } else {
                    try {
                        bitmap = interfaceC6939i.mo31907C(uri);
                    } catch (RemoteException e10) {
                        f35861c.m34874b(e10, "Unable to call %s on %s.", "doFetch", InterfaceC6939i.class.getSimpleName());
                        bitmap = null;
                    }
                }
            }
        }
        return bitmap;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C6932b c6932b = this.f35863b;
        if (c6932b != null) {
            c6932b.m31901b(bitmap);
        }
    }
}
