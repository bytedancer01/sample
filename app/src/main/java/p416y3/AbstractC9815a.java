package p416y3;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import p329t3.EnumC8619i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y3/a.class
 */
/* renamed from: y3.a */
/* loaded from: combined.jar:classes1.jar:y3/a.class */
public abstract class AbstractC9815a<T> implements InterfaceC9817c<T> {

    /* renamed from: a */
    public final String f45142a;

    /* renamed from: b */
    public final AssetManager f45143b;

    /* renamed from: c */
    public T f45144c;

    public AbstractC9815a(AssetManager assetManager, String str) {
        this.f45143b = assetManager;
        this.f45142a = str;
    }

    @Override // p416y3.InterfaceC9817c
    /* renamed from: a */
    public void mo23240a() {
        T t10 = this.f45144c;
        if (t10 == null) {
            return;
        }
        try {
            mo41346c(t10);
        } catch (IOException e10) {
            if (Log.isLoggable("AssetUriFetcher", 2)) {
                Log.v("AssetUriFetcher", "Failed to close data", e10);
            }
        }
    }

    @Override // p416y3.InterfaceC9817c
    /* renamed from: b */
    public T mo23241b(EnumC8619i enumC8619i) {
        T mo41347d = mo41347d(this.f45143b, this.f45142a);
        this.f45144c = mo41347d;
        return mo41347d;
    }

    /* renamed from: c */
    public abstract void mo41346c(T t10);

    @Override // p416y3.InterfaceC9817c
    public void cancel() {
    }

    /* renamed from: d */
    public abstract T mo41347d(AssetManager assetManager, String str);

    @Override // p416y3.InterfaceC9817c
    public String getId() {
        return this.f45142a;
    }
}
