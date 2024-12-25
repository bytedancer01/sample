package p305ra;

import android.util.Log;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/t3.class
 */
/* renamed from: ra.t3 */
/* loaded from: combined.jar:classes2.jar:ra/t3.class */
public final class C8348t3 extends AbstractC8408x3<Double> {
    public C8348t3(C8378v3 c8378v3, String str, Double d10, boolean z10) {
        super(c8378v3, "measurement.test.double_flag", d10, true, null);
    }

    @Override // p305ra.AbstractC8408x3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Double mo35760a(Object obj) {
        Double d10;
        try {
            d10 = Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException e10) {
            String m36064d = super.m36064d();
            int length = String.valueOf(m36064d).length();
            String str = (String) obj;
            StringBuilder sb2 = new StringBuilder(length + 27 + str.length());
            sb2.append("Invalid double value for ");
            sb2.append(m36064d);
            sb2.append(": ");
            sb2.append(str);
            Log.e("PhenotypeFlag", sb2.toString());
            d10 = null;
        }
        return d10;
    }
}
