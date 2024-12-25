package p166ja;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ja/e.class
 */
/* renamed from: ja.e */
/* loaded from: combined.jar:classes2.jar:ja/e.class */
public final class CallableC5346e implements Callable<SharedPreferences> {

    /* renamed from: a */
    public final Context f30656a;

    public CallableC5346e(Context context) {
        this.f30656a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ SharedPreferences call() {
        return this.f30656a.getSharedPreferences("google_sdk_flags", 0);
    }
}
