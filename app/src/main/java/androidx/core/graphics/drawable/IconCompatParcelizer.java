package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import p032c2.AbstractC0978b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/core/graphics/drawable/IconCompatParcelizer.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/core/graphics/drawable/IconCompatParcelizer.class */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC0978b abstractC0978b) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2659a = abstractC0978b.m5867p(iconCompat.f2659a, 1);
        iconCompat.f2661c = abstractC0978b.m5861j(iconCompat.f2661c, 2);
        iconCompat.f2662d = abstractC0978b.m5869r(iconCompat.f2662d, 3);
        iconCompat.f2663e = abstractC0978b.m5867p(iconCompat.f2663e, 4);
        iconCompat.f2664f = abstractC0978b.m5867p(iconCompat.f2664f, 5);
        iconCompat.f2665g = (ColorStateList) abstractC0978b.m5869r(iconCompat.f2665g, 6);
        iconCompat.f2667i = abstractC0978b.m5871t(iconCompat.f2667i, 7);
        iconCompat.f2668j = abstractC0978b.m5871t(iconCompat.f2668j, 8);
        iconCompat.m1894o();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC0978b abstractC0978b) {
        abstractC0978b.m5875x(true, true);
        iconCompat.m1895p(abstractC0978b.m5857f());
        int i10 = iconCompat.f2659a;
        if (-1 != i10) {
            abstractC0978b.m5843F(i10, 1);
        }
        byte[] bArr = iconCompat.f2661c;
        if (bArr != null) {
            abstractC0978b.m5839B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2662d;
        if (parcelable != null) {
            abstractC0978b.m5845H(parcelable, 3);
        }
        int i11 = iconCompat.f2663e;
        if (i11 != 0) {
            abstractC0978b.m5843F(i11, 4);
        }
        int i12 = iconCompat.f2664f;
        if (i12 != 0) {
            abstractC0978b.m5843F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f2665g;
        if (colorStateList != null) {
            abstractC0978b.m5845H(colorStateList, 6);
        }
        String str = iconCompat.f2667i;
        if (str != null) {
            abstractC0978b.m5847J(str, 7);
        }
        String str2 = iconCompat.f2668j;
        if (str2 != null) {
            abstractC0978b.m5847J(str2, 8);
        }
    }
}
