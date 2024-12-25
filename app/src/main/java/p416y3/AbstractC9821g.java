package p416y3;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import p329t3.EnumC8619i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y3/g.class
 */
/* renamed from: y3.g */
/* loaded from: combined.jar:classes1.jar:y3/g.class */
public abstract class AbstractC9821g<T> implements InterfaceC9817c<T> {

    /* renamed from: a */
    public final Uri f45153a;

    /* renamed from: b */
    public final Context f45154b;

    /* renamed from: c */
    public T f45155c;

    public AbstractC9821g(Context context, Uri uri) {
        this.f45154b = context.getApplicationContext();
        this.f45153a = uri;
    }

    @Override // p416y3.InterfaceC9817c
    /* renamed from: a */
    public void mo23240a() {
        T t10 = this.f45155c;
        if (t10 != null) {
            try {
                mo41351c(t10);
            } catch (IOException e10) {
                if (Log.isLoggable("LocalUriFetcher", 2)) {
                    Log.v("LocalUriFetcher", "failed to close data", e10);
                }
            }
        }
    }

    @Override // p416y3.InterfaceC9817c
    /* renamed from: b */
    public final T mo23241b(EnumC8619i enumC8619i) {
        T mo41352d = mo41352d(this.f45153a, this.f45154b.getContentResolver());
        this.f45155c = mo41352d;
        return mo41352d;
    }

    /* renamed from: c */
    public abstract void mo41351c(T t10);

    @Override // p416y3.InterfaceC9817c
    public void cancel() {
    }

    /* renamed from: d */
    public abstract T mo41352d(Uri uri, ContentResolver contentResolver);

    @Override // p416y3.InterfaceC9817c
    public String getId() {
        return this.f45153a.toString();
    }
}
