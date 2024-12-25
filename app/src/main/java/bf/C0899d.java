package bf;

import android.content.Context;
import android.provider.MediaStore;
import org.achartengine.ChartFactory;
import p107g1.C4930b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:bf/d.class
 */
/* renamed from: bf.d */
/* loaded from: combined.jar:classes2.jar:bf/d.class */
public class C0899d extends C4930b {

    /* renamed from: x */
    public static final String[] f6031x = {"_id", ChartFactory.TITLE, "_data", "_size", "bucket_id", "bucket_display_name", "date_added", "duration"};

    public C0899d(Context context) {
        super(context);
        m24887L(f6031x);
        m24891P(MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        m24890O("date_added DESC");
        m24888M("mime_type=? or mime_type=? or mime_type=? or mime_type=? or mime_type=? or mime_type=? or mime_type=? or mime_type=? or mime_type=?");
        m24889N(new String[]{"video/mpeg", "video/mp4", "video/x-matroska", "video/3gpp", "video/MP2T", "video/x-flv", "video/x-msvideo", "video/x-ms-wmv", "video/quicktime"});
    }
}
