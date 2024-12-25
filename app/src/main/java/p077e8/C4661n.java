package p077e8;

import java.util.Locale;
import org.achartengine.chart.TimeChart;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:e8/n.class
 */
/* renamed from: e8.n */
/* loaded from: combined.jar:classes2.jar:e8/n.class */
public final class C4661n {

    /* renamed from: a */
    public final String[] f27493a;

    /* renamed from: b */
    public final int[] f27494b;

    /* renamed from: c */
    public final String[] f27495c;

    /* renamed from: d */
    public final int f27496d;

    public C4661n(String[] strArr, int[] iArr, String[] strArr2, int i10) {
        this.f27493a = strArr;
        this.f27494b = iArr;
        this.f27495c = strArr2;
        this.f27496d = i10;
    }

    /* renamed from: b */
    public static C4661n m23394b(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new C4661n(strArr, iArr, strArr2, m23395c(str, strArr, iArr, strArr2));
    }

    /* renamed from: c */
    public static int m23395c(String str, String[] strArr, int[] iArr, String[] strArr2) {
        String str2;
        boolean z10;
        strArr[0] = "";
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            int indexOf = str.indexOf("$", i10);
            if (indexOf == -1) {
                strArr[i11] = strArr[i11] + str.substring(i10);
                i10 = str.length();
            } else if (indexOf != i10) {
                strArr[i11] = strArr[i11] + str.substring(i10, indexOf);
                i10 = indexOf;
            } else if (str.startsWith("$$", i10)) {
                strArr[i11] = strArr[i11] + "$";
                i10 += 2;
            } else {
                int i12 = i10 + 1;
                int indexOf2 = str.indexOf("$", i12);
                String substring = str.substring(i12, indexOf2);
                if (substring.equals("RepresentationID")) {
                    iArr[i11] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        String substring2 = substring.substring(indexOf3);
                        str2 = substring2;
                        if (!substring2.endsWith("d")) {
                            str2 = substring2;
                            if (!substring2.endsWith("x")) {
                                str2 = substring2 + "d";
                            }
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    substring.hashCode();
                    switch (substring.hashCode()) {
                        case -1950496919:
                            if (!substring.equals("Number")) {
                                z10 = -1;
                                break;
                            } else {
                                z10 = false;
                                break;
                            }
                        case 2606829:
                            if (!substring.equals(TimeChart.TYPE)) {
                                z10 = -1;
                                break;
                            } else {
                                z10 = true;
                                break;
                            }
                        case 38199441:
                            if (!substring.equals("Bandwidth")) {
                                z10 = -1;
                                break;
                            } else {
                                z10 = 2;
                                break;
                            }
                        default:
                            z10 = -1;
                            break;
                    }
                    switch (z10) {
                        case false:
                            iArr[i11] = 2;
                            break;
                        case true:
                            iArr[i11] = 4;
                            break;
                        case true:
                            iArr[i11] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: " + str);
                    }
                    strArr2[i11] = str2;
                }
                i11++;
                strArr[i11] = "";
                i10 = indexOf2 + 1;
            }
        }
        return i11;
    }

    /* renamed from: a */
    public String m23396a(String str, long j10, int i10, long j11) {
        String format;
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            int i12 = this.f27496d;
            if (i11 >= i12) {
                sb2.append(this.f27493a[i12]);
                return sb2.toString();
            }
            sb2.append(this.f27493a[i11]);
            int i13 = this.f27494b[i11];
            if (i13 == 1) {
                sb2.append(str);
            } else {
                if (i13 == 2) {
                    format = String.format(Locale.US, this.f27495c[i11], Long.valueOf(j10));
                } else if (i13 == 3) {
                    format = String.format(Locale.US, this.f27495c[i11], Integer.valueOf(i10));
                } else if (i13 == 4) {
                    format = String.format(Locale.US, this.f27495c[i11], Long.valueOf(j11));
                }
                sb2.append(format);
            }
            i11++;
        }
    }
}
