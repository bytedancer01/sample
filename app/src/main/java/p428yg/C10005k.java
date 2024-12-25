package p428yg;

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferTable;
import p428yg.AbstractC10019y;
import p428yg.C10014t;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/k.class
 */
/* renamed from: yg.k */
/* loaded from: combined.jar:classes2.jar:yg/k.class */
public class C10005k extends C10000g {
    public C10005k(Context context) {
        super(context);
    }

    /* renamed from: k */
    public static int m42092k(Uri uri) {
        int attributeInt = new ExifInterface(uri.getPath()).getAttributeInt("Orientation", 1);
        if (attributeInt == 3) {
            return 180;
        }
        if (attributeInt != 6) {
            return attributeInt != 8 ? 0 : 270;
        }
        return 90;
    }

    @Override // p428yg.C10000g, p428yg.AbstractC10019y
    /* renamed from: c */
    public boolean mo41998c(C10017w c10017w) {
        return TransferTable.COLUMN_FILE.equals(c10017w.f45928d.getScheme());
    }

    @Override // p428yg.C10000g, p428yg.AbstractC10019y
    /* renamed from: f */
    public AbstractC10019y.a mo41999f(C10017w c10017w, int i10) {
        return new AbstractC10019y.a(null, m42036j(c10017w), C10014t.e.DISK, m42092k(c10017w.f45928d));
    }
}
