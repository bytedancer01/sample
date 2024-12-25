package p166ja;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ja/c.class
 */
/* renamed from: ja.c */
/* loaded from: combined.jar:classes2.jar:ja/c.class */
public final class CallableC5344c implements Callable<Long> {

    /* renamed from: a */
    public final SharedPreferences f30650a;

    /* renamed from: b */
    public final String f30651b;

    /* renamed from: c */
    public final Long f30652c;

    public CallableC5344c(SharedPreferences sharedPreferences, String str, Long l10) {
        this.f30650a = sharedPreferences;
        this.f30651b = str;
        this.f30652c = l10;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Long call() {
        return Long.valueOf(this.f30650a.getLong(this.f30651b, this.f30652c.longValue()));
    }
}
