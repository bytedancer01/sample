package p305ra;

import android.util.Log;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/s3.class
 */
/* renamed from: ra.s3 */
/* loaded from: combined.jar:classes2.jar:ra/s3.class */
public final class C8333s3 extends AbstractC8408x3<Boolean> {
    public C8333s3(C8378v3 c8378v3, String str, Boolean bool, boolean z10) {
        super(c8378v3, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p305ra.AbstractC8408x3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Boolean mo35760a(Object obj) {
        Boolean bool;
        if (C8422y2.f39395c.matcher(obj).matches()) {
            bool = Boolean.TRUE;
        } else if (C8422y2.f39396d.matcher(obj).matches()) {
            bool = Boolean.FALSE;
        } else {
            String m36064d = super.m36064d();
            int length = String.valueOf(m36064d).length();
            String str = (String) obj;
            StringBuilder sb2 = new StringBuilder(length + 28 + str.length());
            sb2.append("Invalid boolean value for ");
            sb2.append(m36064d);
            sb2.append(": ");
            sb2.append(str);
            Log.e("PhenotypeFlag", sb2.toString());
            bool = null;
        }
        return bool;
    }
}
