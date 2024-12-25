package p304r9;

import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r9/z.class
 */
/* renamed from: r9.z */
/* loaded from: combined.jar:classes2.jar:r9/z.class */
public class C8058z extends C8032j0 {

    /* renamed from: d */
    public final List f38919d;

    public C8058z(String str, String str2, String str3) {
        super(str, "MediaControlChannel", null);
        this.f38919d = Collections.synchronizedList(new ArrayList());
    }

    /* renamed from: f */
    public final List m34981f() {
        return this.f38919d;
    }

    /* renamed from: g */
    public final void m34982g() {
        synchronized (this.f38919d) {
            Iterator it = this.f38919d.iterator();
            while (it.hasNext()) {
                ((C8056x) it.next()).m34975c(AdError.CACHE_ERROR_CODE);
            }
        }
    }

    /* renamed from: h */
    public final void m34983h(C8056x c8056x) {
        this.f38919d.add(c8056x);
    }
}
