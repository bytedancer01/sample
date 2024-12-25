package bf;

import android.content.Context;
import android.provider.MediaStore;
import org.achartengine.ChartFactory;
import p107g1.C4930b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:bf/c.class
 */
/* renamed from: bf.c */
/* loaded from: combined.jar:classes2.jar:bf/c.class */
public class C0898c extends C4930b {

    /* renamed from: x */
    public static final String[] f6030x = {"_id", ChartFactory.TITLE, "_data", "_size", "bucket_id", "bucket_display_name", "date_added", "orientation"};

    public C0898c(Context context) {
        super(context);
        m24887L(f6030x);
        m24891P(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        m24890O("date_added DESC");
        m24888M("mime_type=? or mime_type=? or mime_type=? or mime_type=?");
        m24889N(new String[]{"image/jpeg", "image/png", "image/jpg", "image/gif"});
    }
}
