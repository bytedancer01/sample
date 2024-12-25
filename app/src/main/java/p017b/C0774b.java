package p017b;

import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p017b.AbstractC0773a;
import p050d0.C4290b;
import p294r.C7928a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b/b.class
 */
/* renamed from: b.b */
/* loaded from: combined.jar:classes1.jar:b/b.class */
public final class C0774b extends AbstractC0773a<String[], Map<String, Boolean>> {
    /* renamed from: e */
    public static Intent m4991e(String[] strArr) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    @Override // p017b.AbstractC0773a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo2261a(Context context, String[] strArr) {
        return m4991e(strArr);
    }

    @Override // p017b.AbstractC0773a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC0773a.a<Map<String, Boolean>> mo4989b(Context context, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new AbstractC0773a.a<>(Collections.emptyMap());
        }
        C7928a c7928a = new C7928a();
        boolean z10 = true;
        for (String str : strArr) {
            boolean z11 = C4290b.m21722a(context, str) == 0;
            c7928a.put(str, Boolean.valueOf(z11));
            if (!z11) {
                z10 = false;
            }
        }
        if (z10) {
            return new AbstractC0773a.a<>(c7928a);
        }
        return null;
    }

    @Override // p017b.AbstractC0773a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Map<String, Boolean> mo2262c(int i10, Intent intent) {
        if (i10 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            int length = stringArrayExtra.length;
            for (int i11 = 0; i11 < length; i11++) {
                hashMap.put(stringArrayExtra[i11], Boolean.valueOf(intArrayExtra[i11] == 0));
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }
}
