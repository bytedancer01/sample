package p422y9;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.C2414a;
import p350u9.C8814g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/i0.class
 */
/* renamed from: y9.i0 */
/* loaded from: combined.jar:classes2.jar:y9/i0.class */
public final class C9918i0 {

    /* renamed from: a */
    public final SparseIntArray f45581a = new SparseIntArray();

    /* renamed from: b */
    public C8814g f45582b;

    public C9918i0(C8814g c8814g) {
        C9935o.m41850j(c8814g);
        this.f45582b = c8814g;
    }

    /* renamed from: a */
    public final int m41805a(Context context, int i10) {
        return this.f45581a.get(i10, -1);
    }

    /* renamed from: b */
    public final int m41806b(Context context, C2414a.f fVar) {
        C9935o.m41850j(context);
        C9935o.m41850j(fVar);
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int m41805a = m41805a(context, minApkVersion);
        if (m41805a == -1) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.f45581a.size()) {
                    m41805a = -1;
                    break;
                }
                int keyAt = this.f45581a.keyAt(i10);
                if (keyAt > minApkVersion && this.f45581a.get(keyAt) == 0) {
                    m41805a = 0;
                    break;
                }
                i10++;
            }
            if (m41805a == -1) {
                m41805a = this.f45582b.mo37681j(context, minApkVersion);
            }
            this.f45581a.put(minApkVersion, m41805a);
        }
        return m41805a;
    }

    /* renamed from: c */
    public final void m41807c() {
        this.f45581a.clear();
    }
}
