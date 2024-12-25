package p428yg;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferTable;
import p428yg.AbstractC10019y;
import p428yg.C10014t;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/b.class
 */
/* renamed from: yg.b */
/* loaded from: combined.jar:classes2.jar:yg/b.class */
public class C9990b extends AbstractC10019y {

    /* renamed from: b */
    public static final int f45785b = 22;

    /* renamed from: a */
    public final AssetManager f45786a;

    public C9990b(Context context) {
        this.f45786a = context.getAssets();
    }

    /* renamed from: j */
    public static String m41997j(C10017w c10017w) {
        return c10017w.f45928d.toString().substring(f45785b);
    }

    @Override // p428yg.AbstractC10019y
    /* renamed from: c */
    public boolean mo41998c(C10017w c10017w) {
        Uri uri = c10017w.f45928d;
        boolean z10 = false;
        if (TransferTable.COLUMN_FILE.equals(uri.getScheme())) {
            z10 = false;
            if (!uri.getPathSegments().isEmpty()) {
                z10 = false;
                if ("android_asset".equals(uri.getPathSegments().get(0))) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    @Override // p428yg.AbstractC10019y
    /* renamed from: f */
    public AbstractC10019y.a mo41999f(C10017w c10017w, int i10) {
        return new AbstractC10019y.a(this.f45786a.open(m41997j(c10017w)), C10014t.e.DISK);
    }
}
