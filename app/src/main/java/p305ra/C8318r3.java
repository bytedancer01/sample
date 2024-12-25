package p305ra;

import android.util.Log;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/r3.class
 */
/* renamed from: ra.r3 */
/* loaded from: combined.jar:classes2.jar:ra/r3.class */
public final class C8318r3 extends AbstractC8408x3<Long> {
    public C8318r3(C8378v3 c8378v3, String str, Long l10, boolean z10) {
        super(c8378v3, str, l10, true, null);
    }

    @Override // p305ra.AbstractC8408x3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Long mo35760a(Object obj) {
        Long l10;
        try {
            l10 = Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException e10) {
            String m36064d = super.m36064d();
            int length = String.valueOf(m36064d).length();
            String str = (String) obj;
            StringBuilder sb2 = new StringBuilder(length + 25 + str.length());
            sb2.append("Invalid long value for ");
            sb2.append(m36064d);
            sb2.append(": ");
            sb2.append(str);
            Log.e("PhenotypeFlag", sb2.toString());
            l10 = null;
        }
        return l10;
    }
}
