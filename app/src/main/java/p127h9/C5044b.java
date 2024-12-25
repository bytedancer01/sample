package p127h9;

import android.net.Uri;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:h9/b.class
 */
/* renamed from: h9.b */
/* loaded from: combined.jar:classes2.jar:h9/b.class */
public final class C5044b extends Thread {

    /* renamed from: b */
    public final Map f29118b;

    public C5044b(C5043a c5043a, Map map) {
        this.f29118b = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f29118b;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        C5046d.m25273a(buildUpon.build().toString());
    }
}
