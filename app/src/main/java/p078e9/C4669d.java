package p078e9;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import p059d9.C4361f0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:e9/d.class
 */
/* renamed from: e9.d */
/* loaded from: combined.jar:classes2.jar:e9/d.class */
public final class C4669d {

    /* renamed from: a */
    public final int f27554a;

    /* renamed from: b */
    public final int f27555b;

    /* renamed from: c */
    public final String f27556c;

    public C4669d(int i10, int i11, String str) {
        this.f27554a = i10;
        this.f27555b = i11;
        this.f27556c = str;
    }

    /* renamed from: a */
    public static C4669d m23488a(C4361f0 c4361f0) {
        String str;
        c4361f0.m21984Q(2);
        int m21971D = c4361f0.m21971D();
        int i10 = m21971D >> 1;
        int m21971D2 = ((c4361f0.m21971D() >> 3) & 31) | ((m21971D & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(m21971D2 >= 10 ? InstructionFileId.DOT : ".0");
        sb2.append(m21971D2);
        return new C4669d(i10, m21971D2, sb2.toString());
    }
}
