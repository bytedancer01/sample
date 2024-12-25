package p244o9;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v4.media.session.PlaybackStateCompat;
import com.amazonaws.services.p045s3.internal.Constants;
import p230n9.C6701b;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:o9/b.class
 */
/* renamed from: o9.b */
/* loaded from: combined.jar:classes2.jar:o9/b.class */
public final class C6932b {

    /* renamed from: a */
    public final Context f35852a;

    /* renamed from: b */
    public final C6701b f35853b;

    /* renamed from: c */
    public Uri f35854c;

    /* renamed from: d */
    public AsyncTaskC6936f f35855d;

    /* renamed from: e */
    public C6933c f35856e;

    /* renamed from: f */
    public Bitmap f35857f;

    /* renamed from: g */
    public boolean f35858g;

    /* renamed from: h */
    public InterfaceC6931a f35859h;

    public C6932b(Context context) {
        this(context, new C6701b(-1, 0, 0));
    }

    public C6932b(Context context, C6701b c6701b) {
        this.f35852a = context;
        this.f35853b = c6701b;
        this.f35856e = new C6933c();
        m31904e();
    }

    /* renamed from: a */
    public final void m31900a() {
        m31904e();
        this.f35859h = null;
    }

    /* renamed from: b */
    public final void m31901b(Bitmap bitmap) {
        this.f35857f = bitmap;
        this.f35858g = true;
        InterfaceC6931a interfaceC6931a = this.f35859h;
        if (interfaceC6931a != null) {
            interfaceC6931a.mo29921a(bitmap);
        }
        this.f35855d = null;
    }

    /* renamed from: c */
    public final void m31902c(InterfaceC6931a interfaceC6931a) {
        this.f35859h = interfaceC6931a;
    }

    /* renamed from: d */
    public final boolean m31903d(Uri uri) {
        if (uri == null) {
            m31904e();
            return true;
        }
        if (uri.equals(this.f35854c)) {
            return this.f35858g;
        }
        m31904e();
        this.f35854c = uri;
        this.f35855d = (this.f35853b.m30870R() == 0 || this.f35853b.m30868P() == 0) ? new AsyncTaskC6936f(this.f35852a, 0, 0, false, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 5, 333, Constants.MAXIMUM_UPLOAD_PARTS, this) : new AsyncTaskC6936f(this.f35852a, this.f35853b.m30870R(), this.f35853b.m30868P(), false, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 5, 333, Constants.MAXIMUM_UPLOAD_PARTS, this);
        ((AsyncTaskC6936f) C9935o.m41850j(this.f35855d)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Uri) C9935o.m41850j(this.f35854c));
        return false;
    }

    /* renamed from: e */
    public final void m31904e() {
        AsyncTaskC6936f asyncTaskC6936f = this.f35855d;
        if (asyncTaskC6936f != null) {
            asyncTaskC6936f.cancel(true);
            this.f35855d = null;
        }
        this.f35854c = null;
        this.f35857f = null;
        this.f35858g = false;
    }
}
