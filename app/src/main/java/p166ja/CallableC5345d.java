package p166ja;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ja/d.class
 */
/* renamed from: ja.d */
/* loaded from: combined.jar:classes2.jar:ja/d.class */
public final class CallableC5345d implements Callable<String> {

    /* renamed from: a */
    public final SharedPreferences f30653a;

    /* renamed from: b */
    public final String f30654b;

    /* renamed from: c */
    public final String f30655c;

    public CallableC5345d(SharedPreferences sharedPreferences, String str, String str2) {
        this.f30653a = sharedPreferences;
        this.f30654b = str;
        this.f30655c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() {
        return this.f30653a.getString(this.f30654b, this.f30655c);
    }
}
