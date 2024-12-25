package p166ja;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ja/b.class
 */
/* renamed from: ja.b */
/* loaded from: combined.jar:classes2.jar:ja/b.class */
public final class CallableC5343b implements Callable<Integer> {

    /* renamed from: a */
    public final SharedPreferences f30647a;

    /* renamed from: b */
    public final String f30648b;

    /* renamed from: c */
    public final Integer f30649c;

    public CallableC5343b(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f30647a = sharedPreferences;
        this.f30648b = str;
        this.f30649c = num;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Integer call() {
        return Integer.valueOf(this.f30647a.getInt(this.f30648b, this.f30649c.intValue()));
    }
}
