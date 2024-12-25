package p073e4;

import android.content.Context;
import android.net.Uri;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferTable;
import org.apache.http.HttpHost;
import p416y3.InterfaceC9817c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e4/q.class
 */
/* renamed from: e4.q */
/* loaded from: combined.jar:classes1.jar:e4/q.class */
public abstract class AbstractC4622q<T> implements InterfaceC4617l<Uri, T> {

    /* renamed from: a */
    public final Context f27320a;

    /* renamed from: b */
    public final InterfaceC4617l<C4609d, T> f27321b;

    public AbstractC4622q(Context context, InterfaceC4617l<C4609d, T> interfaceC4617l) {
        this.f27320a = context;
        this.f27321b = interfaceC4617l;
    }

    /* renamed from: e */
    public static boolean m23262e(String str) {
        return TransferTable.COLUMN_FILE.equals(str) || "content".equals(str) || "android.resource".equals(str);
    }

    /* renamed from: b */
    public abstract InterfaceC9817c<T> mo23263b(Context context, String str);

    /* renamed from: c */
    public abstract InterfaceC9817c<T> mo23264c(Context context, Uri uri);

    @Override // p073e4.InterfaceC4617l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final InterfaceC9817c<T> mo23227a(Uri uri, int i10, int i11) {
        String scheme = uri.getScheme();
        return m23262e(scheme) ? C4606a.m23225a(uri) ? mo23263b(this.f27320a, C4606a.m23226b(uri)) : mo23264c(this.f27320a, uri) : (this.f27321b == null || !(HttpHost.DEFAULT_SCHEME_NAME.equals(scheme) || ClientConstants.DOMAIN_SCHEME.equals(scheme))) ? null : this.f27321b.mo23227a(new C4609d(uri.toString()), i10, i11);
    }
}
