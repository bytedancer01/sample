package p166ja;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ja/a.class
 */
/* renamed from: ja.a */
/* loaded from: combined.jar:classes2.jar:ja/a.class */
public final class CallableC5342a implements Callable<Boolean> {

    /* renamed from: a */
    public final SharedPreferences f30644a;

    /* renamed from: b */
    public final String f30645b;

    /* renamed from: c */
    public final Boolean f30646c;

    public CallableC5342a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f30644a = sharedPreferences;
        this.f30645b = str;
        this.f30646c = bool;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() {
        return Boolean.valueOf(this.f30644a.getBoolean(this.f30645b, this.f30646c.booleanValue()));
    }
}
